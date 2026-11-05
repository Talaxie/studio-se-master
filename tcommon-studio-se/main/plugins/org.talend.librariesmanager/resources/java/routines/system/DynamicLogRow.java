package routines.system;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Runtime expansion and presentation of dynamic tLogRow columns. */
public final class DynamicLogRow {
    private final String component;
    private final String title;
    private final String mode;
    private final String separator;
    private final boolean header;
    private final boolean columnNames;
    private final boolean uniqueName;
    private final int[] lengths;
    private String[] names;
    private final List<String[]> rows = new ArrayList<String[]>();
    private long count;

    public DynamicLogRow(String component, String title, String mode, String separator,
            boolean header, boolean columnNames, boolean uniqueName, int[] lengths) {
        this.component = component;
        this.title = title;
        this.mode = mode;
        this.separator = separator;
        this.header = header;
        this.columnNames = columnNames;
        this.uniqueName = uniqueName;
        this.lengths = lengths.clone();
    }

    /** Formats values without losing decimal precision or using byte-array identity strings. */
    public static String value(Object value) {
        if (value == null) return null;
        if (value instanceof BigDecimal) return ((BigDecimal) value).toPlainString();
        if (value instanceof byte[]) return new String((byte[]) value, Charset.defaultCharset());
        return String.valueOf(value);
    }

    public String accept(String[] staticNames, String[] staticValues, Dynamic dynamic, PrintStream out) {
        return accept(staticNames, staticValues, dynamic, new String[0], new String[0], out);
    }

    /** Technical reject diagnostics follow the expanded dynamic columns. */
    public String accept(String[] staticNames, String[] staticValues, Dynamic dynamic,
            String[] diagnosticNames, String[] diagnosticValues, PrintStream out) {
        int dynamicCount = dynamic == null ? 0 : dynamic.getColumnCount();
        String[] currentNames = Arrays.copyOf(staticNames, staticNames.length + dynamicCount + diagnosticNames.length);
        String[] values = Arrays.copyOf(staticValues, currentNames.length);
        for (int i = 0; i < dynamicCount; i++) {
            currentNames[staticNames.length + i] = dynamic.getColumnMetadata(i).getName();
            values[staticNames.length + i] = value(dynamic.getColumnValue(i));
        }
        System.arraycopy(diagnosticNames, 0, currentNames, staticNames.length + dynamicCount, diagnosticNames.length);
        System.arraycopy(diagnosticValues, 0, values, staticNames.length + dynamicCount, diagnosticValues.length);
        if (!Arrays.equals(names, currentNames)) {
            finish(out);
            names = currentNames;
            if (header && "BASIC".equals(mode)) out.println(String.join("\t", names));
        }
        count++;
        String text;
        if ("TABLE".equals(mode)) {
            rows.add(values);
            text = String.join(separator, Arrays.stream(values).map(v -> v == null ? "" : v).toArray(String[]::new));
        } else if ("VERTICAL".equals(mode)) {
            text = vertical(values);
            out.print(text);
        } else {
            StringBuilder buffer = new StringBuilder(uniqueName ? "[" + component + "] " : "");
            for (int i = 0; i < values.length; i++) {
                if (i > 0) buffer.append(separator);
                if (columnNames) buffer.append(names[i]).append(": ");
                if (values[i] != null) {
                    int width = lengths.length == 0 ? 0 : lengths[Math.min(i, lengths.length - 1)];
                    for (int j = values[i].length(); j < width; j++) buffer.append(' ');
                    buffer.append(values[i]);
                }
            }
            text = buffer.toString();
            out.println(text);
        }
        out.flush();
        return text;
    }

    private String vertical(String[] values) {
        int keyWidth = 3, valueWidth = 5;
        for (int i = 0; i < names.length; i++) {
            keyWidth = Math.max(keyWidth, names[i].length());
            valueWidth = Math.max(valueWidth, String.valueOf(values[i]).length());
        }
        String border = "+" + repeat('-', keyWidth + 2) + "+" + repeat('-', valueWidth + 2) + "+\n";
        StringBuilder text = new StringBuilder("#" + count + ". " + title + "\n" + border);
        text.append("| ").append(pad("key", keyWidth)).append(" | ").append(pad("value", valueWidth)).append(" |\n").append(border);
        for (int i = 0; i < names.length; i++) {
            text.append("| ").append(pad(names[i], keyWidth)).append(" | ").append(pad(String.valueOf(values[i]), valueWidth)).append(" |\n");
        }
        return text.append(border).toString();
    }

    private static String repeat(char character, int count) {
        char[] characters = new char[Math.max(0, count)];
        Arrays.fill(characters, character);
        return new String(characters);
    }

    private static String pad(String value, int width) {
        return value + repeat(' ', Math.max(0, width - value.length()));
    }

    /** Table mode buffers rows just like the static component. */
    public void finish(PrintStream out) {
        if (!"TABLE".equals(mode) || names == null || rows.isEmpty()) return;
        int[] widths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            widths[i] = names[i].length();
            for (String[] row : rows) widths[i] = Math.max(widths[i], String.valueOf(row[i]).length());
        }
        StringBuilder border = new StringBuilder("+");
        for (int width : widths) border.append(repeat('-', width + 2)).append('+');
        out.println(title);
        out.println(border);
        printRow(out, names, widths);
        out.println(border);
        for (String[] row : rows) printRow(out, row, widths);
        out.println(border);
        out.flush();
        rows.clear();
    }

    private static void printRow(PrintStream out, String[] values, int[] widths) {
        StringBuilder line = new StringBuilder("|");
        for (int i = 0; i < values.length; i++) line.append(' ').append(pad(String.valueOf(values[i]), widths[i])).append(" |");
        out.println(line);
    }
}
