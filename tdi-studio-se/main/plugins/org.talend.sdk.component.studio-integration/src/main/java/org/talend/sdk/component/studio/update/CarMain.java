// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.sdk.component.studio.update;

import static java.util.stream.Collectors.joining;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarMain {

    public static void deployInStudio(final File carFile, final String studioLocation, final boolean forceOverwrite,
            final File m2Root) {
        final File root = new File(studioLocation);
        if (!root.isDirectory()) {
            throw new IllegalArgumentException(studioLocation + " is not a valid directory");
        }

        final File config = new File(studioLocation, "configuration/config.ini");
        if (!config.exists()) {
            throw new IllegalArgumentException("No " + config + " found, is your studio location right?");
        }

        final Properties configuration = readProperties(config);
        if (!m2Root.isDirectory()) {
            throw new IllegalArgumentException(m2Root + " does not exist, did you specify a valid studio home?");
        }

        // install jars
        final String mainGav = installJars(carFile, m2Root, forceOverwrite);

        // register the component
        final String components = configuration.getProperty("component.java.coordinates");
        try {
            final List<String> configLines = Files.readAllLines(config.toPath());
            if (components == null) {
                final String original = configLines.stream().collect(joining("\n"));
                try (final Writer writer = new FileWriter(config)) {
                    writer.write(original + "\ncomponent.java.coordinates = " + mainGav);
                }
            } else {
                // backup
                final File backup = new File(config.getParentFile(), "backup/" + config.getName() + "_"
                        + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd_HH-mm-ss")));
                backup.getParentFile().mkdirs();
                try (final OutputStream to = new BufferedOutputStream(new FileOutputStream(backup))) {
                    Files.copy(config.toPath(), to);
                }

                boolean skip = false;
                try (final Writer writer = new FileWriter(config)) {
                    for (final String line : configLines) {
                        if (line.trim().startsWith("component.java.coordinates")) {
                            skip = true;
                            continue;
                        } else if (skip && line.trim().contains("=")) {
                            skip = false;
                        } else if (skip) {
                            continue;
                        }
                        writer.write(line + "\n");
                    }
                    final String toFilter = Stream.of(mainGav.contains(":") ? mainGav.split(":") : mainGav.split("/")).limit(2)
                            .collect(Collectors.joining(":", "", ":"));
                    writer.write("component.java.coordinates = " + Stream
                            .concat(Stream.of(mainGav),
                                    Stream.of(components.trim().split(",")).map(String::trim).filter(it -> !it.isEmpty())
                                            .filter(it -> !it.startsWith(toFilter)))
                                    .collect(joining(",")));
                }
            }
        } catch (final IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private static String installJars(final File carFile, final File m2Root, final boolean forceOverwrite) {
        String mainGav = null;
        try (final JarInputStream jar = new JarInputStream(new BufferedInputStream(new FileInputStream(carFile)))) {
            JarEntry entry;
            while ((entry = jar.getNextJarEntry()) != null) {
                if (entry.isDirectory()) {
                    continue;
                }
                if (entry.getName().startsWith("MAVEN-INF/repository/")) {
                    final String path = entry.getName().substring("MAVEN-INF/repository/".length());
                    final File output = new File(m2Root, path);
                    if (!output.getCanonicalPath().startsWith(m2Root.getCanonicalPath())) {
                        throw new IOException("The output file is not contained in the destination directory");
                    }
                    if (!output.exists() || forceOverwrite) {
                        output.getParentFile().mkdirs();
                        Files.copy(jar, output.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    }
                } else if ("TALEND-INF/metadata.properties".equals(entry.getName())) {
                    // mainGav
                    final Properties properties = new Properties();
                    properties.load(jar);
                    mainGav = properties.getProperty("component_coordinates");
                }
            }
        } catch (final IOException e) {
            throw new IllegalArgumentException(e);
        }
        if (mainGav == null || mainGav.trim().isEmpty()) {
            throw new IllegalArgumentException("Didn't find the component coordinates");
        }
        return mainGav;
    }

    private static Properties readProperties(final File config) {
        final Properties configuration = new Properties();
        try (final InputStream stream = new FileInputStream(config)) {
            configuration.load(stream);
        } catch (final IOException e) {
            throw new IllegalArgumentException(e);
        }
        return configuration;
    }

}
