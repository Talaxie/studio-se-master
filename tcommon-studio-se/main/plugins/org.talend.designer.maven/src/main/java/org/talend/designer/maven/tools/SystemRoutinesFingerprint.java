package org.talend.designer.maven.tools;

import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/** Content identity of the internal routine sources contributed by Studio providers. */
final class SystemRoutinesFingerprint {

    private SystemRoutinesFingerprint() {
    }

    static String compute(List<URL> sources) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256"); //$NON-NLS-1$
        List<URL> sorted = new ArrayList<>(sources);
        sorted.sort(Comparator.comparing(URL::getPath));
        byte[] buffer = new byte[8192];
        for (URL source : sorted) {
            // Include the name and content, but not the installation-specific bundle URL.
            String path = source.getPath();
            int routines = path.indexOf("/routines/system/"); //$NON-NLS-1$
            String name = routines >= 0 ? path.substring(routines) : path.substring(path.lastIndexOf('/') + 1);
            digest.update(name.getBytes(StandardCharsets.UTF_8));
            digest.update((byte) 0);
            try (InputStream in = source.openStream()) {
                int count;
                while ((count = in.read(buffer)) != -1) {
                    digest.update(buffer, 0, count);
                }
            }
            digest.update((byte) 0);
        }
        StringBuilder hex = new StringBuilder();
        for (byte value : digest.digest()) {
            hex.append(Character.forDigit((value >>> 4) & 15, 16));
            hex.append(Character.forDigit(value & 15, 16));
        }
        return hex.toString();
    }
}
