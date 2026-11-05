package org.talend.sdk.component.studio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.StringWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.tools.ToolProvider;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.designer.core.model.components.ElementParameter;

/** Evaluates the real schema scriptlets, then compiles and executes the generated Java.
 * Full JET integration is additionally exercised by the reference-job export.
 */
class SchemaConfigurationTemplateTest {

    private static final String[] METAS = {"comment", "defaultValue", "key", "label", "length", "nullable",
            "originalDbColumnName", "pattern", "precision", "talendType", "type"};

    @TempDir
    static Path work;

    private static Object renderer;
    private static final List<URLClassLoader> loaders = new ArrayList<>();

    @AfterAll
    static void closeLoaders() throws Exception {
        for (URLClassLoader loader : loaders) {
            loader.close();
        }
    }

    @BeforeAll
    static void compileTemplate() throws Exception {
        String template = Files.readString(Path.of("jet_stub/generic/configuration.javajet"));
        int start = template.indexOf("                if(metaTable != null) {");
        int end = template.indexOf("\n            } else {", start);
        assertTrue(start >= 0 && end > start);
        String constants = template.substring(template.indexOf("    final int schemaColumnsPerMethod"),
                template.indexOf("    if (params != null"));
        String wrapper = "<%@ jet package=\"schema.test\" class=\"SchemaRenderer\" imports=\"java.util.List "
                + "org.talend.core.model.metadata.IMetadataColumn org.talend.core.model.metadata.IMetadataTable "
                + "org.talend.designer.core.model.components.ElementParameter\" %>\n<%\n"
                + "Object[] inputs = (Object[]) argument; String cid = (String) inputs[0];\n"
                + constants
                + "for (int schema = 1; schema < inputs.length; schema += 2) {\n"
                + "IMetadataTable metaTable = (IMetadataTable) inputs[schema];\n"
                + "ElementParameter p = (ElementParameter) inputs[schema + 1];\n"
                + "String parameterName = p.getName();\n"
                + template.substring(start, end) + "\n}\n%>";
        // The schema fragment contains only literal text, scriptlets and expressions.
        // Evaluate those directly so these unit tests do not need an Eclipse workspace.
        wrapper = wrapper.substring(wrapper.indexOf("%>") + 2);
        StringBuilder java = new StringBuilder("package schema.test; import java.util.List; "
                + "import org.talend.core.model.metadata.*; "
                + "import org.talend.designer.core.model.components.ElementParameter; "
                + "public class SchemaRenderer { public String generate(Object argument) { "
                + "StringBuilder result = new StringBuilder();\n");
        Matcher parts = Pattern.compile("<%(.*?)%>", Pattern.DOTALL).matcher(wrapper);
        int position = 0;
        while (parts.find()) {
            appendLiteral(java, wrapper.substring(position, parts.start()));
            String scriptlet = parts.group(1);
            if (scriptlet.startsWith("=")) {
                java.append("result.append(").append(scriptlet.substring(1)).append(");\n");
            } else {
                java.append(scriptlet).append('\n');
            }
            position = parts.end();
        }
        appendLiteral(java, wrapper.substring(position));
        java.append("return result.toString(); }}");
        Class<?> type = compile("schema.test.SchemaRenderer", java.toString());
        renderer = type.getConstructor().newInstance();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 49, 50, 51, 99, 100, 101, 404, 1000})
    void splitsAtFiftyColumnsAndPreservesValues(int count) throws Exception {
        String generated = render("tDBOutput_2", metadata(count, false), parameter("schema", METAS));
        int blocks = (count + 49) / 50;
        assertEquals(blocks, generated.split("public void set_", -1).length - 1);
        assertEquals(count > 0, generated.contains("SchemaSettingHelper_tDBOutput_2_1"));
        for (int start = 0; start < count; start += 50) {
            assertTrue(generated.contains("set_" + start + "(configuration);"));
        }
        Map<String, Map<String, String>> result = execute(generated);
        Map<String, String> config = result.get("configuration");
        assertEquals(count * METAS.length, config.size());
        for (int i = 0; i < count; i++) {
            String key = "schema[" + i + "].";
            assertEquals("col_" + i, config.get(key + "label"));
            assertEquals("source_" + i, config.get(key + "originalDbColumnName"));
            assertEquals("id_String", config.get(key + "talendType"));
            assertEquals("VARCHAR", config.get(key + "type"));
            assertEquals("255", config.get(key + "length"));
            assertEquals("0", config.get(key + "precision"));
            assertEquals("true", config.get(key + "nullable"));
            assertEquals("false", config.get(key + "key"));
            assertEquals("", config.get(key + "pattern"));
            assertEquals("", config.get(key + "comment"));
            assertEquals("null", config.get(key + "defaultValue"));
        }
    }

    @Test
    void distinctHelpersForMultipleSchemasAndComponents() throws Exception {
        String first = render("tDBOutput_2", metadata(51, false), parameter("schema", METAS),
                metadata(2, false), parameter("otherSchema", METAS));
        String second = render("tDBOutput_3", metadata(1, false), parameter("thirdSchema", METAS));
        assertTrue(first.contains("SchemaSettingHelper_tDBOutput_2_2"));
        Map<String, Map<String, String>> maps = execute(first + second);
        assertEquals(53 * METAS.length, maps.get("configuration").size());
        assertEquals("col_0", maps.get("otherConfiguration").get("thirdSchema[0].label"));
    }

    @Test
    void dynamicSchemaKeepsRegistryAndConditionalEmission() throws Exception {
        IMetadataTable table = metadata(1, true);
        String labelsOnly = render("tDBOutput_2", table, parameter("schema", "label"));
        assertFalse(labelsOnly.contains("SchemaSettingHelper"));
        Map<String, Map<String, String>> maps = execute(labelsOnly);
        assertTrue(maps.get("configuration").isEmpty());
        assertEquals("255", maps.get("registry").get("length"));
        String fullSchema = render("tDBOutput_2", table, parameter("schema", METAS));
        assertEquals("id_Dynamic", execute(fullSchema).get("configuration").get("schema[0].talendType"));
    }

    @Test
    void emptyMetadataListRetainsPrimitiveSchemaAndEscapedValues() throws Exception {
        IMetadataTable table = metadata(1, false);
        IMetadataColumn column = table.getListColumns().get(0);
        column.setOriginalDbColumnName("nom\"é\\source");
        column.setPattern("\"dd-MM-yyyy\"");
        column.setComment("\"Été\"");
        column.setDefault("\"défaut\"");
        column.setLength(null);
        column.setPrecision(null);
        Map<String, String> config = execute(render("tDBOutput_2", table, parameter("schema", METAS))).get("configuration");
        assertEquals("nom\"é\\source", config.get("schema[0].originalDbColumnName"));
        assertEquals("dd-MM-yyyy", config.get("schema[0].pattern"));
        assertEquals("Été", config.get("schema[0].comment"));
        assertEquals("défaut", config.get("schema[0].defaultValue"));
        assertEquals("-1", config.get("schema[0].length"));
        assertEquals("-1", config.get("schema[0].precision"));
        assertEquals(Map.of("schema[0]", "col_0"),
                execute(render("tDBOutput_2", table, parameter("schema"))).get("configuration"));
    }

    private static void appendLiteral(StringBuilder java, String value) {
        java.append("result.append(\"").append(value.replace("\\", "\\\\").replace("\"", "\\\"")
                .replace("\r", "\\r").replace("\n", "\\n").replace("\t", "\\t")).append("\");\n");
    }

    private static ElementParameter parameter(String name, String... metas) {
        ElementParameter parameter = new ElementParameter(null);
        parameter.setName(name);
        parameter.setListItemsDisplayCodeName(metas);
        return parameter;
    }

    private static IMetadataTable metadata(int count, boolean dynamic) {
        MetadataTable table = new MetadataTable();
        List<IMetadataColumn> columns = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            MetadataColumn column = new MetadataColumn();
            column.setLabel("col_" + i);
            column.setOriginalDbColumnName("source_" + i);
            column.setTalendType(dynamic ? "id_Dynamic" : "id_String");
            column.setType("VARCHAR");
            column.setLength(255);
            column.setPrecision(0);
            column.setNullable(true);
            column.setKey(false);
            column.setComment("");
            column.setDefault(null);
            columns.add(column);
        }
        table.setListColumns(columns);
        return table;
    }

    private static String render(Object... inputs) throws Exception {
        return (String) renderer.getClass().getMethod("generate", Object.class).invoke(renderer, (Object) inputs);
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Map<String, String>> execute(String generated) throws Exception {
        String source = "package schema.test; public class Configuration { public static java.util.Map run() throws Exception {"
                + "java.util.Map<String,Object> globalMap = new java.util.HashMap<>();"
                + "java.util.Map<String,String> configuration_tDBOutput_2 = new java.util.HashMap<>();"
                + "java.util.Map<String,String> registry_metadata_tDBOutput_2 = new java.util.HashMap<>();"
                + "java.util.Map<String,String> configuration_tDBOutput_3 = new java.util.HashMap<>();"
                + "java.util.Map<String,String> registry_metadata_tDBOutput_3 = new java.util.HashMap<>();"
                + generated + "return java.util.Map.of(\"configuration\",configuration_tDBOutput_2,"
                + "\"registry\",registry_metadata_tDBOutput_2,\"otherConfiguration\",configuration_tDBOutput_3); }}";
        return (Map<String, Map<String, String>>) compile("schema.test.Configuration", source).getMethod("run").invoke(null);
    }

    private static Class<?> compile(String name, String source) throws Exception {
        Path directory = Files.createTempDirectory(work, "compile-");
        Path file = directory.resolve(name.substring(name.lastIndexOf('.') + 1) + ".java");
        Files.writeString(file, source);
        StringWriter diagnostics = new StringWriter();
        var compiler = ToolProvider.getSystemJavaCompiler();
        try (var manager = compiler.getStandardFileManager(null, null, StandardCharsets.UTF_8)) {
            boolean success = compiler.getTask(diagnostics, manager, null,
                    Arrays.asList("--release", "17", "-classpath", System.getProperty("java.class.path"), "-d", directory.toString()),
                    null, manager.getJavaFileObjects(file.toFile())).call();
            assertTrue(success, diagnostics.toString());
        }
        // A fresh loader prevents reuse of a previously compiled Configuration class.
        URLClassLoader loader = new URLClassLoader(new URL[] {directory.toUri().toURL()}, SchemaConfigurationTemplateTest.class.getClassLoader());
        loaders.add(loader);
        return loader.loadClass(name);
    }
}
