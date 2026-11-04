import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import javax.naming.directory.*;

/** Exercises all six public methods of the actual emitted helper. */
public class Base64Cases {
    private static int checks;
    public static void run(Object helper) throws Exception {
        String[] methods = {"checkByteArray", "checkString", "addToAttribute", "checkByteArrayUpdate", "checkStringUpdate", "checkStringUpdateAttr"};
        byte[] binary = new byte[256];
        for (int i = 0; i < binary.length; i++) binary[i] = (byte)i;
        for (String method : methods) {
            boolean bytes = method.startsWith("checkByteArray");
            for (String value : new String[]{null, "", " \t\r\n", "TQ==", "TWE=", "TWFu", " T\tQ=\r=\n", "AAH+/4A="}) {
                Object input = bytes && value != null ? value.getBytes(StandardCharsets.US_ASCII) : value;
                Object expected = value == null ? (bytes ? new byte[0] : null)
                    : java.util.Base64.getDecoder().decode(value.replace(" ", "").replace("\t", "").replace("\r", "").replace("\n", ""));
                equal(expected, invoke(helper, method, true, input));
                if (invoke(helper, method, false, input) != input) throw new AssertionError(method + ": identity lost");
                checks++;
            }
            for (String value : new String[]{"TQ", "TWE", "T", "TQ=", "TQ===", "=TQ=", "TQ==AAAA", "TR==", "TWF=", "TQ$=", "TQ\f==", "TQ\u000b==", "TQ\u00a0==", "\u0141AAA", "____"}) {
                Object input = bytes ? value.getBytes(StandardCharsets.UTF_8) : value;
                try {
                    invoke(helper, method, true, input);
                    throw new AssertionError(method + ": accepted invalid data " + value);
                } catch (IllegalArgumentException expected) {
                    if (expected.getMessage() == null || expected.getMessage().isEmpty()) throw new AssertionError("Missing error message");
                }
                if (invoke(helper, method, false, input) != input) throw new AssertionError("Disabled decoding altered value");
                checks++;
            }
            String allBytes = Base64.getEncoder().encodeToString(binary);
            equal(binary, invoke(helper, method, true, bytes ? allBytes.getBytes(StandardCharsets.US_ASCII) : allBytes));
            if (bytes) {
                byte[] raw = {0, 1, -128, -1};
                if (invoke(helper, method, false, raw) != raw) throw new AssertionError("Binary identity lost");
                byte[] encoded = " T\tQ=\r=\n".getBytes(StandardCharsets.US_ASCII);
                byte[] copy = encoded.clone();
                invoke(helper, method, true, encoded);
                equal(copy, encoded);
            }
        }
        System.out.println("PASS six helper methods: " + checks + " counted assertions, plus identity/error checks (enabled and disabled)");
    }
    private static Object invoke(Object helper, String name, boolean decode, Object input) throws Exception {
        Attributes entry = new BasicAttributes(true);
        Attribute attr = new BasicAttribute("manager");
        List<Attribute> updates = new ArrayList<>();
        Method method = Arrays.stream(helper.getClass().getDeclaredMethods()).filter(m -> m.getName().equals(name)).findFirst().get();
        method.setAccessible(true);
        Object[] args;
        if (name.equals("addToAttribute")) args = new Object[]{decode, attr, input};
        else args = new Object[]{decode, "manager", name.endsWith("UpdateAttr") ? attr : name.endsWith("Update") ? updates : entry, input};
        try {
            method.invoke(helper, args);
        } catch (InvocationTargetException e) {
            if (entry.size() != 0 || attr.size() != 0 || !updates.isEmpty()) throw new AssertionError("Invalid value changed attributes");
            throw (Exception)e.getCause();
        }
        if (name.equals("addToAttribute") || name.endsWith("UpdateAttr")) return attr.get();
        if (name.endsWith("Update")) return updates.get(0).get();
        return entry.get("manager").get();
    }
    static void equal(Object expected, Object actual) {
        if (expected instanceof byte[]) {
            if (!(actual instanceof byte[]) || !Arrays.equals((byte[])expected, (byte[])actual)) throw new AssertionError("Byte mismatch");
        } else if (!Objects.equals(expected, actual)) throw new AssertionError("Value mismatch");
        checks++;
    }
}
