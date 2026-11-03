import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.talend.core.model.process.IElementParameter;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.designer.core.model.process.DataNode;

/** Execute actual input and tJavaRow emitters with the same iteration code as Studio recipes. */
public class GenerateJavaRows {
    public static void main(String[] args) throws Exception {
        Path output = Path.of(args[0]);
        for (String variant : new String[] { "ALL", "MIXED", "EMPTY", "ZERO_ROWS" }) {
            int fixed = variant.equals("ALL") ? 0 : 2;
            DataNode node = GenerateRows.node(fixed, "tJavaRow");
            node.setOutgoingConnections(Collections.singletonList(GenerateProcessingRows.connection("forwarded", "FLOW", node.getMetadataList().get(0), node)));
            List<IElementParameter> parameters = new ArrayList<>(node.getElementParameters());
            parameters.add(GenerateProcessingRows.parameter("CODE", Files.readString(output.resolve("java-row-" + variant + ".fragment"))));
            node.setElementParameters(parameters);
            CodeGeneratorArgument argument = new CodeGeneratorArgument();
            argument.setNode(node);
            Class<?> emitter = Class.forName("DynamicTemplate53");
            String main = (String) emitter.getMethod("generate", Object.class).invoke(emitter.getConstructor().newInstance(), argument);
            if (main.contains("input_row")) throw new AssertionError("Input flow name was not substituted");
            String begin = Files.readString(output.resolve("input-0-" + fixed + ".java.fragment"))
                    .replace("com.microsoft.sqlserver.jdbc.SQLServerDriver", "GeneratedPipelineSupport")
                    .replaceAll("final String decryptedPassword_[^=]+=[^;]+;", "final String decryptedPassword_tMSSqlInput_1 = \"\";");
            String end = Files.readString(output.resolve("input-1-" + fixed + ".java.fragment"));
            int rows = variant.equals("ZERO_ROWS") ? 0 : 1;
            int fields = variant.equals("ALL") ? 5 : variant.equals("MIXED") ? 3 : 0;
            String name = "GeneratedJavaIteration" + variant;
            String code = "import java.util.*; import routines.system.*; public class " + name + " {\n"
                    + "static class Row { String AGENCE, MOIS; Dynamic SQL; }\n"
                    + "public static void main(String[] args) throws Exception {\n"
                    + "Map<String,Object> globalMap=new HashMap<>(), resourceMap=new HashMap<>(); String projectName=\"synthetic\"; Row row=new Row(), forwarded=new Row(); int nb_line_tJavaRow_1=0;\n"
                    + "GeneratedPipelineSupport.reset(" + (variant.equals("EMPTY") || variant.equals("ZERO_ROWS")) + ");\n"
                    + (variant.equals("ZERO_ROWS") ? "GeneratedPipelineSupport.result.next(); GeneratedPipelineSupport.result.deleteRow(); GeneratedPipelineSupport.result.beforeFirst();\n" : "")
                    + begin + main + end
                    + "if (!Integer.valueOf(" + rows + ").equals(globalMap.getOrDefault(\"JAVA_DYNAMIC_ROWS\",0))"
                    + " || !Integer.valueOf(" + fields + ").equals(globalMap.getOrDefault(\"JAVA_DYNAMIC_FIELDS\",0))"
                    + " || nb_line_tJavaRow_1 != " + rows + " || !GeneratedPipelineSupport.closed) throw new AssertionError(\"Iteration count or input cleanup mismatch\");\n"
                    + "if (" + rows + " > 0 && (forwarded.SQL == null || forwarded.SQL == row.SQL || forwarded.SQL.getColumnCount() != " + fields + ")) throw new AssertionError(\"Output must receive a Dynamic snapshot\");\n"
                    + "System.out.println(\"PASS " + name + " rows=" + rows + " fields=" + fields + "\");\n}}\n";
            Files.writeString(output.resolve(name + ".java"), code);
        }
    }
}
