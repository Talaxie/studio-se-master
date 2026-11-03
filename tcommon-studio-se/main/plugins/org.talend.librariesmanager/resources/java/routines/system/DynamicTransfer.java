package routines.system;

import java.io.*;
import java.util.*;

/** Lossless Dynamic cells in the existing String[][] child-job return contract. */
public final class DynamicTransfer {
    private static final String PREFIX = "TalaxieDynamic:1:";
    private static final Set<String> CLASSES = new HashSet<String>(Arrays.asList(
            "routines.system.Dynamic", "routines.system.DynamicMetadata", "routines.system.DynamicMetadata$sourceTypes",
            "java.lang.Enum", "java.lang.Number", "java.lang.String", "java.lang.Boolean", "java.lang.Character",
            "java.lang.Byte", "java.lang.Short", "java.lang.Integer", "java.lang.Long", "java.lang.Float", "java.lang.Double",
            "java.math.BigDecimal", "java.math.BigInteger", "java.util.Date", "java.sql.Date", "java.sql.Time", "java.sql.Timestamp",
            "java.time.LocalTime", "java.time.OffsetDateTime", "java.time.OffsetTime", "java.time.Ser",
            "java.util.ArrayList", "java.util.HashMap", "java.util.LinkedHashMap", "[B"));

    private DynamicTransfer() { }

    public static String encode(Dynamic dynamic) {
        if (dynamic == null) return null;
        Dynamic snapshot = dynamic.copy();
        for (int i = 0; i < snapshot.getColumnCount(); i++) checkValue(snapshot.getColumnValue(i));
        try {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            try (ObjectOutputStream output = new ObjectOutputStream(bytes)) { output.writeObject(snapshot); }
            return PREFIX + Base64.getEncoder().encodeToString(bytes.toByteArray());
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot encode dynamic child-job result", e);
        }
    }

    public static Dynamic decode(String cell) {
        if (cell == null) return null;
        if (!cell.startsWith(PREFIX)) throw new IllegalArgumentException("Expected a typed dynamic child-job result");
        try {
            byte[] bytes = Base64.getDecoder().decode(cell.substring(PREFIX.length()));
            try (ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(bytes)) {
                @Override protected Class<?> resolveClass(ObjectStreamClass descriptor) throws IOException, ClassNotFoundException {
                    if (!CLASSES.contains(descriptor.getName())) throw new InvalidClassException("Unsupported dynamic value", descriptor.getName());
                    return Class.forName(descriptor.getName(), false, DynamicTransfer.class.getClassLoader());
                }
                @Override protected Class<?> resolveProxyClass(String[] interfaces) throws IOException {
                    throw new InvalidClassException("Proxies are not dynamic field values");
                }
            }) {
                Object result = input.readObject();
                if (!(result instanceof Dynamic)) throw new IOException("Expected Dynamic");
                return (Dynamic) result;
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException("Invalid dynamic child-job result", e);
        }
    }

    private static void checkValue(Object value) {
        if (value == null) return;
        if (value instanceof List) {
            for (Object entry : (List<?>) value) checkValue(entry);
        } else if (value instanceof Map) {
            for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
                checkValue(entry.getKey()); checkValue(entry.getValue());
            }
        } else if (!CLASSES.contains(value.getClass().getName())) {
            throw new IllegalArgumentException("Unsupported dynamic child-job field type: " + value.getClass().getName());
        }
    }
}
