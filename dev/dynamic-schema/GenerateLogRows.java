import java.lang.reflect.Proxy;
import java.nio.file.*;
import java.util.*;
import org.talend.core.model.process.*;
import org.talend.core.model.metadata.types.*;
import org.talend.designer.core.model.process.DataNode;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

/** Compile and run all three tLogRow modes using actual emitted Java. */
public class GenerateLogRows {
    public static void main(String[] args) throws Exception {
        JavaTypesManager.addJavaType(new JavaType(routines.system.Dynamic.class, false, true));
        Path output = Path.of(args[0]);
        for (String mode : new String[]{"BASIC", "TABLE", "VERTICAL", "REJECT"}) {
            DataNode node = GenerateRows.node(2, "tLogRow");
            List<IElementParameter> parameters = new ArrayList<>(node.getElementParameters());
            parameters.add(parameter("TABLE_PRINT", "TABLE".equals(mode) || "REJECT".equals(mode)));
            if ("REJECT".equals(mode)) {
                org.talend.core.model.metadata.MetadataColumn error = new org.talend.core.model.metadata.MetadataColumn();
                error.setLabel("errorMessage"); error.setTalendType("id_String"); error.setNullable(true);
                node.getMetadataList().get(0).getListColumns().add(error);
            }
            parameters.add(parameter("VERTICAL", "VERTICAL".equals(mode)));
            parameters.add(parameter("PRINT_HEADER", true));
            parameters.add(parameter("PRINT_COLNAMES", true));
            node.setElementParameters(parameters);
            CodeGeneratorArgument argument = new CodeGeneratorArgument(); argument.setNode(node);
            StringBuilder body = new StringBuilder();
            for (int part=0;part<3;part++) {
                Class<?> emitter=Class.forName("DynamicTemplate"+(8+part));
                body.append(emitter.getMethod("generate",Object.class).invoke(emitter.getConstructor().newInstance(),argument));
                if(part==0) body.append("for(int i=0;i<2;i++) { row.SQL.setColumnValue(0, i==0 ? new java.math.BigDecimal(\"1234567890123456789012345678.1234567890\") : null);\n");
                if(part==1) body.append("}\n");
            }
            String name="GeneratedLog"+mode;
            Files.writeString(output.resolve(name+".java"), """
import java.util.*;
import java.io.*;
import routines.system.*;
public class CLASS {
 static class Row { String AGENCE="0007", MOIS="202601", errorMessage="condition failed"; Dynamic SQL=new Dynamic(); }
 public static void main(String[] args) throws Exception {
  Map<String,Object> globalMap=new HashMap<>();
  ByteArrayOutputStream bytes=new ByteArrayOutputStream();
  globalMap.put("tLogRow_CONSOLE",new PrintStream(bytes));
  Row row=new Row(); DynamicMetadata m=new DynamicMetadata(); m.setName("Montant €"); row.SQL.metadatas.add(m); row.SQL.addColumnValue(null);
  BODY
  String text=bytes.toString();
  if(!text.contains("Montant €") || !text.contains("1234567890123456789012345678.1234567890") || !Integer.valueOf(2).equals(globalMap.get("tLogRow_1_NB_LINE"))) throw new AssertionError(text);
  if("CLASS".endsWith("REJECT") && (!text.contains("errorMessage") || !text.contains("condition failed"))) throw new AssertionError(text);
  System.out.println("PASS CLASS: expanded names, exact decimals, null, 2 rows");
 }
}
""".replace("CLASS", name).replace("BODY",body.toString()));
        }
    }
    private static IElementParameter parameter(String name, boolean value) {
        return (IElementParameter) Proxy.newProxyInstance(GenerateLogRows.class.getClassLoader(),new Class<?>[]{IElementParameter.class},(p,m,a)->{
            switch(m.getName()) {
            case "getName":return name;
            case "getVariableName":return "__"+name+"__";
            case "getValue":return value;
            case "getFieldType":return EParameterFieldType.CHECK;
            default:return m.getReturnType()==boolean.class?false:null;
            }
        });
    }
}
