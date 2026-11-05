package org.talend.designer.maven.tools;

import static org.junit.Assert.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class SystemRoutinesFingerprintTest {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    private URL source(String name, String content) throws Exception {
        Path file = folder.getRoot().toPath().resolve(name);
        Files.createDirectories(file.getParent());
        Files.write(file, content.getBytes(StandardCharsets.UTF_8));
        return file.toUri().toURL();
    }

    @Test
    public void changesWithoutVersionOrTimestampChangeInvalidateCache() throws Exception {
        URL file = source("routines/system/Dynamic.java", "old source");
        Path path = java.nio.file.Paths.get(file.toURI());
        java.nio.file.attribute.FileTime time = Files.getLastModifiedTime(path);
        String before = SystemRoutinesFingerprint.compute(Collections.singletonList(file));
        Files.write(path, "new source".getBytes(StandardCharsets.UTF_8));
        Files.setLastModifiedTime(path, time);
        assertNotEquals(before, SystemRoutinesFingerprint.compute(Collections.singletonList(file)));
    }

    @Test
    public void addedAndRemovedRoutineInvalidateCache() throws Exception {
        URL a = source("routines/system/Dynamic.java", "dynamic");
        URL b = source("routines/system/DynamicTransfer.java", "transport");
        assertNotEquals(SystemRoutinesFingerprint.compute(Collections.singletonList(a)),
                SystemRoutinesFingerprint.compute(Arrays.asList(a, b)));
    }

    @Test
    public void providerOrderDoesNotInvalidateCache() throws Exception {
        URL a = source("routines/system/Dynamic.java", "dynamic");
        URL b = source("routines/system/DynamicTransfer.java", "transport");
        assertEquals(SystemRoutinesFingerprint.compute(Arrays.asList(a, b)),
                SystemRoutinesFingerprint.compute(Arrays.asList(b, a)));
    }

    @Test
    public void relocatedInstallationKeepsContentIdentity() throws Exception {
        URL a = source("old/routines/system/Dynamic.java", "dynamic");
        URL b = source("new/routines/system/Dynamic.java", "dynamic");
        assertEquals(SystemRoutinesFingerprint.compute(Collections.singletonList(a)),
                SystemRoutinesFingerprint.compute(Collections.singletonList(b)));
    }

    @Test(expected = java.io.IOException.class)
    public void unreadableSourceMustNotMarkCacheCurrent() throws Exception {
        SystemRoutinesFingerprint.compute(Collections.singletonList(
                folder.getRoot().toPath().resolve("missing.java").toUri().toURL()));
    }
}
