/* Copyright (c) 2026 Talaxie. Licensed under the Apache License, Version 2.0. */
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;

/** Standalone regression test, without a Studio launch or external repository. */
public final class ConsumerRuntimeTest {
    private static final String PREFIX = "META-INF/maven/org.talend.sdk.component/component-runtime-di/";

    public static void main(String[] args) throws Exception {
        Path temp = args.length == 0 ? Files.createTempDirectory("consumer-runtime-test-")
                : Files.createTempDirectory(Path.of(args[0]), "consumer-runtime-test-");
        Path repo = temp.resolve("repository");
        Path parent = repo.resolve("org/talend/sdk/component/component-studio/1.62.1/component-studio-1.62.1.pom");
        Files.createDirectories(parent.getParent());
        Files.writeString(parent, "<project><modelVersion>4.0.0</modelVersion><groupId>org.talend.sdk.component</groupId>"
                + "<artifactId>component-studio</artifactId><version>1.62.1</version><packaging>pom</packaging>"
                + "<properties><sibling.version>${project.version}</sibling.version></properties>"
                + "<dependencyManagement><dependencies><dependency><groupId>org.talend.sdk.component</groupId>"
                + "<artifactId>component-runtime-manager</artifactId><version>${sibling.version}</version>"
                + "</dependency></dependencies></dependencyManagement></project>");
        Path systemJar = temp.resolve("other-system.jar");
        Files.write(systemJar, new byte[0]);
        String pom = "<project><modelVersion>4.0.0</modelVersion><parent><groupId>org.talend.sdk.component</groupId>"
                + "<artifactId>component-studio</artifactId><version>1.62.1</version></parent>"
                + "<artifactId>component-runtime-di</artifactId><dependencies>"
                + "<dependency><groupId>org.talend.studio</groupId><artifactId>routines-stubs</artifactId>"
                + "<version>741</version><scope>system</scope><systemPath>${basedir}/lib/routines.jar</systemPath></dependency>"
                + "<dependency><groupId>org.talend.sdk.component</groupId><artifactId>component-runtime-manager</artifactId></dependency>"
                + "<dependency><groupId>other</groupId><artifactId>routines-stubs</artifactId><version>1</version>"
                + "<scope>system</scope><systemPath>" + systemJar + "</systemPath></dependency>"
                + "</dependencies></project>";
        Path input = temp.resolve("upstream.jar");
        byte[] bytecode = { 1, 7, 3, 9 };
        writeJar(input, pom, bytecode, null);
        String[] command = {input.toString(), temp.resolve("output").toString(), repo.toString(), "1.62.1", "1.62.1-talaxie-1"};
        ConsumerRuntime.main(command);
        Path output = temp.resolve("output/org/talend/sdk/component/component-runtime-di/1.62.1-talaxie-1");
        byte[] consumer = Files.readAllBytes(output.resolve("component-runtime-di-1.62.1-talaxie-1.pom"));
        Model model;
        try (var reader = Files.newBufferedReader(output.resolve("component-runtime-di-1.62.1-talaxie-1.pom"))) {
            model = new MavenXpp3Reader().read(reader);
        }
        check(model.getParent() == null, "Consumer must not require a source parent");
        check(model.getDependencies().size() == 2, "Only the precise internal dependency must be removed");
        check("1.62.1".equals(model.getDependencies().get(0).getVersion()), "Sibling version changed");
        check("system".equals(model.getDependencies().get(1).getScope()), "Unrelated system dependency removed");
        check(systemJar.toString().equals(model.getDependencies().get(1).getSystemPath()), "Unrelated system path changed");
        try (ZipFile jar = new ZipFile(output.resolve("component-runtime-di-1.62.1-talaxie-1.jar").toFile())) {
            check(Arrays.equals(bytecode, jar.getInputStream(jar.getEntry("engine/Original.class")).readAllBytes()), "Bytecode changed");
            check(Arrays.equals(consumer, jar.getInputStream(jar.getEntry(PREFIX + "pom.xml")).readAllBytes()), "Embedded POM differs");
            Properties props = new Properties();
            props.load(jar.getInputStream(jar.getEntry(PREFIX + "pom.properties")));
            check("1.62.1-talaxie-1".equals(props.getProperty("version")), "Embedded coordinates differ");
        }
        try (ZipFile jar = new ZipFile(input.toFile())) {
            check(new String(jar.getInputStream(jar.getEntry(PREFIX + "pom.xml")).readAllBytes(), StandardCharsets.UTF_8)
                    .contains("${basedir}/lib/routines.jar"), "Upstream source metadata modified");
        }
        for (String forbidden : new String[] { "META-INF/UPSTREAM.SF", "routines/system/Dynamic.class" }) {
            writeJar(input, pom, bytecode, forbidden);
            try {
                ConsumerRuntime.main(command);
                throw new AssertionError("Expected rejection: " + forbidden);
            } catch (IllegalArgumentException expected) {
                // Fail closed rather than redistribute signatures or substitution classes.
            }
        }
        System.out.println("PASS: precise filtering, sibling versions, bytecode, both metadata files, upstream preservation, signed/stub rejection");
    }

    private static void writeJar(Path path, String pom, byte[] bytecode, String extra) throws Exception {
        try (ZipOutputStream jar = new ZipOutputStream(Files.newOutputStream(path))) {
            put(jar, PREFIX + "pom.xml", pom.getBytes(StandardCharsets.UTF_8));
            put(jar, PREFIX + "pom.properties", "version=1.62.1\n".getBytes(StandardCharsets.UTF_8));
            put(jar, "engine/Original.class", bytecode);
            if (extra != null) { put(jar, extra, bytecode); }
        }
    }

    private static void put(ZipOutputStream jar, String name, byte[] bytes) throws Exception {
        jar.putNextEntry(new ZipEntry(name));
        jar.write(bytes);
        jar.closeEntry();
    }

    private static void check(boolean condition, String message) {
        if (!condition) { throw new AssertionError(message); }
    }
}
