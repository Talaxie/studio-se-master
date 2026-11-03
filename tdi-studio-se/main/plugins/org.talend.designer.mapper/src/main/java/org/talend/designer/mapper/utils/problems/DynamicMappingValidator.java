package org.talend.designer.mapper.utils.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.talend.designer.mapper.external.data.ExternalMapperData;
import org.talend.designer.mapper.external.data.ExternalMapperTable;
import org.talend.designer.mapper.external.data.ExternalMapperTableEntry;

/** Checks dynamic containers independently of the Java expression syntax checker. */
public final class DynamicMappingValidator {

    private DynamicMappingValidator() {
    }

    public static List<String> validate(ExternalMapperData data) {
        List<String> problems = new ArrayList<String>();
        Map<String, String> inputs = new LinkedHashMap<String, String>();
        for (ExternalMapperTable table : data.getInputTables()) {
            for (ExternalMapperTableEntry entry : entries(table)) {
                if (isDynamic(entry)) {
                    inputs.put(table.getName() + "." + entry.getName(), entry.getName());
                    if (entry.getExpression() != null && !entry.getExpression().trim().isEmpty()) {
                        problems.add("Dynamic column cannot be a lookup key: " + table.getName() + "." + entry.getName());
                    }
                }
            }
        }
        List<ExternalMapperTable> tables = new ArrayList<ExternalMapperTable>();
        tables.addAll(data.getInputTables());
        tables.addAll(data.getVarsTables());
        tables.addAll(data.getOutputTables());
        for (ExternalMapperTable table : tables) {
            checkPosition(table, problems, data.getInputTables().contains(table));
            if (referencesDynamic(table.getExpressionFilter(), inputs)) {
                problems.add("A filter cannot reference a Dynamic column: " + table.getName());
            }
            if (table.getConstraintTableEntries() != null) {
                for (ExternalMapperTableEntry entry : table.getConstraintTableEntries()) {
                    if (referencesDynamic(entry.getExpression(), inputs)) {
                        problems.add("A constraint cannot reference a Dynamic column: " + table.getName());
                    }
                }
            }
            if (table.getGlobalMapKeysValues() != null) {
                for (ExternalMapperTableEntry entry : table.getGlobalMapKeysValues()) {
                    if (referencesDynamic(entry.getExpression(), inputs)) {
                        problems.add("A lookup reload parameter cannot reference a Dynamic column: " + table.getName());
                    }
                }
            }
            for (ExternalMapperTableEntry entry : entries(table)) {
                String expression = entry.getExpression() == null ? "" : entry.getExpression().trim();
                if (data.getVarsTables().contains(table) && isDynamic(entry)) {
                    problems.add("A variable cannot have type Dynamic: " + table.getName() + "." + entry.getName());
                }
                if (data.getOutputTables().contains(table) && isDynamic(entry)) {
                    if (!entry.getName().equals(inputs.get(expression.replaceAll("\\s+", "")))) {
                        problems.add("Dynamic output must directly map the input container without renaming: "
                                + table.getName() + "." + entry.getName());
                    }
                } else if (referencesDynamic(expression, inputs)) {
                    problems.add("A Dynamic column cannot be transformed or used in an expression: "
                            + table.getName() + "." + entry.getName());
                }
            }
        }
        return problems;
    }

    private static List<ExternalMapperTableEntry> entries(ExternalMapperTable table) {
        return table.getMetadataTableEntries() == null ? Collections.<ExternalMapperTableEntry>emptyList()
                : table.getMetadataTableEntries();
    }

    private static boolean isDynamic(ExternalMapperTableEntry entry) {
        return "id_Dynamic".equals(entry.getType());
    }

    private static void checkPosition(ExternalMapperTable table, List<String> problems, boolean input) {
        List<ExternalMapperTableEntry> entries = entries(table);
        int last = entries.size() - 1;
        // A SQL output reject row carries two trailing diagnostic fields. The mapper
        // may move those static fields before the unchanged dynamic container.
        if (input && entries.size() >= 3 && isDiagnostic(entries.get(last - 1), "errorCode")
                && isDiagnostic(entries.get(last), "errorMessage")) {
            last -= 2;
        } else if (input && entries.size() >= 2 && isDiagnostic(entries.get(last), "errorMessage")) {
            // tFilterRow appends a single diagnostic field to the rejected row.
            last--;
        }
        for (int i = 0; i < last; i++) {
            if (isDynamic(entries.get(i))) {
                problems.add("The Dynamic column must be the last column: " + table.getName());
                break;
            }
        }
    }

    private static boolean isDiagnostic(ExternalMapperTableEntry entry, String name) {
        return name.equals(entry.getName()) && "id_String".equals(entry.getType());
    }

    private static boolean referencesDynamic(String expression, Map<String, String> inputs) {
        if (expression == null) {
            return false;
        }
        // Literal text and comments do not reference fields in the input row.
        String code = expression.replaceAll("\"(?:\\\\.|[^\"\\\\])*\"|'(?:\\\\.|[^'\\\\])*'|/\\*[^*]*(?:\\*(?!/)[^*]*)*\\*/|//[^\\r\\n]*", " ");
        for (String reference : inputs.keySet()) {
            String[] parts = reference.split("\\.", 2);
            if (Pattern.compile("(?<![\\w$])" + Pattern.quote(parts[0]) + "\\s*\\.\\s*"
                    + Pattern.quote(parts[1]) + "(?![\\w$])").matcher(code).find()) {
                return true;
            }
        }
        return false;
    }
}
