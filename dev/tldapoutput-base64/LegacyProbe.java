import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/** Optional historical oracle; run with Java 8, without module exports. */
public class LegacyProbe {
    public static void main(String[] args) throws Exception {
        Class<?> decoder = Class.forName("com.sun.org.apache.xml.internal.security.utils.Base64");
        String[] cases = {null, "", " \t\r\n", "TQ==", "TWE=", "TWFu", " T\tQ=\r=\n", "TQ", "TWE", "T", "TQ=", "TQ===", "=TQ=", "TQ==AAAA", "TR==", "TWF=", "TQ$=", "TQ\f==", "TQ\u000b==", "TQ\u00a0==", "\u0141AAA"};
        for (String value : cases) {
            for (Class<?> type : new Class<?>[]{String.class, byte[].class}) {
                Object input = type == String.class || value == null ? value : value.getBytes(StandardCharsets.UTF_8);
                String result;
                try {
                    result = Arrays.toString((byte[]) decoder.getMethod("decode", type).invoke(null, input));
                } catch (InvocationTargetException e) {
                    result = e.getCause().getClass().getSimpleName();
                }
                System.out.println(type.getSimpleName() + " " + String.valueOf(value).replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") + " -> " + result);
            }
        }
    }
}
