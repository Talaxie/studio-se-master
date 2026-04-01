/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.sdk.component.studio.mvn;

import static java.util.stream.Collectors.toSet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.jar.JarFile;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;

import org.talend.core.runtime.maven.MavenConstants;

// todo: move to a service
public final class Mvn {

    private Mvn() {
        throw new AssertionError();
    }

    private static final Set<String> SCOPES =
            new HashSet<>(Arrays.asList("compile", "provided", "runtime", "test", "system"));

    /**
     * Transform a maven GAV coordinate to Studio's maven URI.
     *
     * GAV may have the following forms:
     * - groupId:artifactId:version
     * - groupId:artifactId:type:version
     * - groupId:artifactId:type:version:scope
     * - groupId:artifactId:type:classifier:version
     * - groupId:artifactId:type:classifier:version:scope
     *
     * Maven URI should have one of the following forms:
     * - mvn:groupId/artifactId/version/type
     * - mvn:groupId/artifactId/version/type/classifier
     *
     * @param location GAV coordinate (groupId:artifactId:type[:classifier]:version:scope)
     *
     * @return maven URI (mvn:groupId/artifactId/version/type[/classifier])
     */
    public static String locationToMvn(final String location) {
        if (location.startsWith("mvn:")) {
            return location;
        }
        String[] segments = location.split(":");
        if (segments.length < 3) {
            throw new IllegalArgumentException("Invalid coordinate: " + location);
        }
        switch (segments.length) {
        case 3:
            // g:a:v
            segments = new String[]{ segments[0], segments[1], segments[2], "jar", "" };
            break;
        case 4:
            // g:a:t:v
            segments = new String[]{ segments[0], segments[1], segments[3], segments[2], "" };
            break;
        case 5:
        default:
            if (SCOPES.contains(segments[4])) {
                // g:a:t:v:s
                segments = new String[]{ segments[0], segments[1], segments[3], segments[2], "" };
            } else {
                // g:a:t:c:v(:s)
                segments = new String[]{ segments[0], segments[1], segments[4], segments[2], segments[3] };
            }
        }
        // mvn:group/artifact/version/type[/classifier]
        final String classifier = segments[4].isEmpty() ? "" : "/" + segments[4];
        return "mvn:" + MavenConstants.LOCAL_RESOLUTION_URL + '!' + segments[0] + "/" + segments[1] + "/"
                + segments[2] + "/" + segments[3] + classifier;
    }

    public static <T> T withDependencies(final File module, final String resource, final boolean acceptProvided,
                                         final Function<Stream<String>, T> fn) throws IOException {
        return withResource(module, resource, s -> {
            if (s == null) {
                return fn.apply(Stream.empty());
            }
            try {
                return fn.apply(toDependencies(s, acceptProvided).stream());
            } catch (final IOException e) {
                throw new IllegalStateException(e);
            }
        });
    }

    private static Set<String> toDependencies(final InputStream deps, final boolean acceptProvided) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(deps))) {
            // this logic excludes  (optional)  intentionally
            return reader.lines()
                    .map(s -> s.replaceAll(" -- module.*", "")) // remove java9+ module output
                    .map(String::trim)
                    .filter(s -> !s.isEmpty() || s.split(":").length < 4)
                    .filter(s -> !s.endsWith(":test"))
                    .filter(s -> (acceptProvided && s.endsWith(":provided"))
                            || (!acceptProvided && (s.endsWith("compile") || s.endsWith("runtime"))))
                    .filter(s -> !s.contains("log4j") && !s.contains("reload4j"))
                    .map(Mvn::locationToMvn)
                    .collect(toSet());
        }
    }

    private static <T> T withResource(final File module, final String resource, final Function<InputStream, T> fn)
            throws IOException {
        if (module.isDirectory()) {
            try (InputStream stream = new FileInputStream(new File(module, resource))) {
                return fn.apply(stream);
            }
        } else {
            try (JarFile jar = new JarFile(module)) {
                final ZipEntry entry = jar.getEntry(resource);
                try (InputStream stream = jar.getInputStream(entry)) {
                    return fn.apply(stream);
                }
            }
        }
    }

}
