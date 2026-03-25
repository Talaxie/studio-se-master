package org.talend.mscrm.login.passport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtil {

    public static String readStringFromClasspath(String path, Class c) throws IOException {
        final InputStream is = c.getResourceAsStream(path);
        return readStringFromBufferedReader(createBufferedUtf8Reader(is));
    }

    public static BufferedReader createBufferedUtf8Reader(InputStream is) throws IOException {
        return new BufferedReader(new InputStreamReader(is, "utf8"));
    }

    private static String readStringFromBufferedReader(BufferedReader br) throws IOException {
        StringBuffer sbr = new StringBuffer();
        for (String ln = br.readLine(); ln != null; ln = br.readLine())
            sbr.append(ln + "\n");
        br.close();
        return sbr.toString();
    }
}
