import java.lang.reflect.Proxy;
import java.nio.file.*;
import java.util.*;
import org.talend.core.model.process.*;
import org.talend.core.model.metadata.*;
import org.talend.core.model.metadata.types.*;
import org.talend.designer.core.model.process.DataNode;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

/** Executes emitted transform code, including mutation isolation and reject counters. */
public class GenerateProcessingRows {
    static IElementParameter parameter(String name, Object value) {
        return (IElementParameter) Proxy.newProxyInstance(GenerateProcessingRows.class.getClassLoader(),
                new Class<?>[]{IElementParameter.class}, (p,m,a)-> {
            switch(m.getName()) {
            case "getName": return name;
            case "getVariableName": return "__"+name+"__";
            case "getValue": return value;
            case "getFieldType": return value instanceof Boolean ? EParameterFieldType.CHECK : EParameterFieldType.TEXT;
            default: return m.getReturnType()==boolean.class ? false : null;
            }
        });
    }
    static IConnection connection(String name, String connector, IMetadataTable schema, DataNode node) {
        return (IConnection) Proxy.newProxyInstance(GenerateProcessingRows.class.getClassLoader(),
                new Class<?>[]{IConnection.class}, (p,m,a)-> {
            switch(m.getName()) {
            case "getName": return name;
            case "getConnectorName": return connector;
            case "getLineStyle": return EConnectionType.FLOW_MAIN;
            case "getMetadataTable": return schema;
            case "getSource": case "getTarget": return node;
            case "getActivate": return true;
            default: return m.getReturnType()==boolean.class ? false : m.getReturnType()==int.class ? 0 : null;
            }
        });
    }
    static String emit(DataNode node, int template) throws Exception {
        CodeGeneratorArgument argument=new CodeGeneratorArgument(); argument.setNode(node);
        Class<?> emitter=Class.forName("DynamicTemplate"+template);
        return (String)emitter.getMethod("generate",Object.class).invoke(emitter.getConstructor().newInstance(),argument);
    }
    static void write(Path output, String name, String body) throws Exception {
        Files.writeString(output.resolve(name+".java"), """
import java.util.*;
import routines.system.*;
public class CLASS {
 static class Row { String AGENCE, MOIS, EXTRA, errorMessage; Dynamic SQL; }
 static class aStruct extends Row {} static class bStruct extends Row {} static class cStruct extends Row {}
 static class acceptedStruct extends Row {} static class rejectedStruct extends Row {}
 static Dynamic payload() {
  Dynamic d=new Dynamic(); d.setDbmsId("id_MSSQL");
  DynamicMetadata m=new DynamicMetadata(); m.setName("Montant €"); d.metadatas.add(m);
  m=new DynamicMetadata(); m.setName("bytes"); d.metadatas.add(m);
  d.addColumnValue(new java.math.BigDecimal("1234567890123456789012345678.1234567890"));
  d.addColumnValue(new byte[]{65,66}); return d;
 }
 static void check(boolean condition) { if(!condition) throw new AssertionError("CLASS"); }
 static void checkCopy(Dynamic copy, Dynamic original) {
  if(original==null) { check(copy==null); return; }
  check(copy!=original && copy.getColumnCount()==original.getColumnCount());
  check(Objects.equals(copy.getDbmsId(),original.getDbmsId()));
  if(original.getColumnCount()>0) {
   check(copy.getColumnMetadata(0)!=original.getColumnMetadata(0));
   check(copy.getColumnValue(0).equals(original.getColumnValue(0)));
   copy.getColumnMetadata(0).setName("changed"); copy.setColumnValue(0,java.math.BigDecimal.ZERO);
   ((byte[])copy.getColumnValue(1))[0]=90;
   check(original.getColumnMetadata(0).getName().equals("Montant €"));
   check(original.getColumnValue(0).toString().equals("1234567890123456789012345678.1234567890"));
   check(((byte[])original.getColumnValue(1))[0]==65);
  }
 }
 public static void main(String[] args) throws Exception {
  Map<String,Object> globalMap=new HashMap<>();
  Row row=new Row(); row.AGENCE="0007"; row.MOIS="202601";
  aStruct a=new aStruct(); bStruct b=null; cStruct c=null;
  acceptedStruct accepted=null; rejectedStruct rejected=null;
  BODY
  System.out.println("PASS CLASS");
 }
}
""".replace("CLASS",name).replace("BODY",body));
    }
    public static void main(String[] args) throws Exception {
        Path output=Path.of(args[0]);
        JavaTypesManager.addJavaType(new JavaType(routines.system.Dynamic.class,false,true));
        DataNode replicate=GenerateRows.node(2,"tReplicate");
        IMetadataTable input=replicate.getMetadataList().get(0);
        replicate.setOutgoingConnections(Arrays.asList(connection("a","FLOW",input,replicate),
                connection("b","FLOW",input,replicate),connection("c","FLOW",input,replicate)));
        write(output,"GeneratedReplicate", "for(int i=0;i<3;i++){ row.SQL=i==0?payload():i==1?null:new Dynamic();\n"
                +emit(replicate,14)+"check((Object)a!=b && (Object)b!=c); checkCopy(a.SQL,row.SQL); checkCopy(b.SQL,row.SQL); checkCopy(c.SQL,row.SQL); }\n");
        DataNode dynamicOnly=GenerateRows.node(0,"tReplicate");
        IMetadataTable only=dynamicOnly.getMetadataList().get(0);
        dynamicOnly.setOutgoingConnections(Arrays.asList(connection("a","FLOW",only,dynamicOnly),connection("b","FLOW",only,dynamicOnly)));
        write(output,"GeneratedReplicateOnlyDynamic","row.SQL=payload();"+emit(dynamicOnly,14)+"checkCopy(a.SQL,row.SQL);checkCopy(b.SQL,row.SQL);");
        for(String component: new String[]{"tReplicate","tFilterRow","tFilterColumns"}) {
            DataNode stat=GenerateRows.node(2,component);
            IMetadataTable table=stat.getMetadataList().get(0); table.getColumn("SQL").setTalendType("id_String");
            stat.setOutgoingConnections(Collections.singletonList(connection(component.equals("tFilterRow")?"accepted":"a",component.equals("tFilterRow")?"FILTER":"FLOW",table,stat)));
            List<IElementParameter> params=new ArrayList<>(stat.getElementParameters());
            params.add(parameter("CONDITIONS",Collections.emptyList()));params.add(parameter("LOGICAL_OP","&&"));stat.setElementParameters(params);
            String body="row.SQL=\"static value\";";
            if(component.equals("tReplicate")) body+=emit(stat,14);
            else for(int part=0;part<3;part++) body+=emit(stat,(component.equals("tFilterRow")?15:18)+part);
            body+="check(\"static value\".equals("+(component.equals("tFilterRow")?"accepted":"a")+".SQL));";
            String name="GeneratedStatic"+component;
            write(output,name,body);
            Path path=output.resolve(name+".java");
            Files.writeString(path,Files.readString(path).replace("Dynamic SQL;","String SQL;"));
        }
        for(String mode: new String[]{"MIXED","ONLY_DYNAMIC","STATIC_ONLY","ADDED_COLUMN"}) {
            DataNode project=GenerateRows.node(2,"tFilterColumns");
            IMetadataTable source=project.getMetadataList().get(0), target=new MetadataTable();
            if(mode.equals("MIXED")) {
                target.getListColumns().add(source.getColumn("MOIS"));
                target.getListColumns().add(source.getColumn("AGENCE"));
            }
            if(!mode.equals("STATIC_ONLY")) target.getListColumns().add(source.getColumn("SQL"));
            if(mode.equals("STATIC_ONLY")) target.getListColumns().add(source.getColumn("AGENCE"));
            if(mode.equals("ADDED_COLUMN")) {
                MetadataColumn column=new MetadataColumn();column.setLabel("EXTRA");column.setTalendType("id_String");
                target.getListColumns().add(0,column);
            }
            project.setMetadataList(Collections.singletonList(target));
            project.setOutgoingConnections(Collections.singletonList(connection("a","FLOW",target,project)));
            String body=emit(project,18)+"for(int i=0;i<3;i++){ row.SQL=i==0?payload():i==1?null:new Dynamic();\n"
                    +emit(project,19)+(mode.equals("STATIC_ONLY")?"check(a.SQL==null && a.AGENCE.equals(row.AGENCE));":"checkCopy(a.SQL,row.SQL);")
                    +(mode.equals("MIXED")?"check(a.AGENCE.equals(row.AGENCE) && a.MOIS.equals(row.MOIS));":"")
                    +(mode.equals("ADDED_COLUMN")?"check(a.EXTRA==null);":"")+"}\n"+emit(project,20)
                    +"check(Integer.valueOf(3).equals(globalMap.get(\"tFilterColumns_1_NB_LINE\")));";
            write(output,"GeneratedProjection"+mode,body);
        }
        for(String mode: new String[]{"BASIC","ADVANCED","OR","ALL","FILTER_ONLY","REJECT_ONLY"}) {
            DataNode filter=GenerateRows.node(2,"tFilterRow");
            IMetadataTable source=filter.getMetadataList().get(0), reject=new MetadataTable();
            reject.getListColumns().addAll(source.getListColumns());
            MetadataColumn error=new MetadataColumn();error.setLabel("errorMessage");error.setTalendType("id_String");
            reject.getListColumns().add(error);
            List<IConnection> conns=new ArrayList<>();
            if(!mode.equals("REJECT_ONLY")) conns.add(connection("accepted","FILTER",source,filter));
            if(!mode.equals("FILTER_ONLY")) conns.add(connection("rejected","REJECT",reject,filter));
            filter.setOutgoingConnections(conns);
            List<IElementParameter> params=new ArrayList<>(filter.getElementParameters());
            List<Map<String,String>> conditions=new ArrayList<>();
            if(!mode.equals("ALL")) conditions.add(new HashMap<>(Map.of("INPUT_COLUMN","AGENCE","FUNCTION","","OPERATOR","==","RVALUE","\"0007\"")));
            if(mode.equals("OR")) conditions.add(new HashMap<>(Map.of("INPUT_COLUMN","MOIS","FUNCTION","","OPERATOR","==","RVALUE","\"202601\"")));
            params.add(parameter("CONDITIONS",conditions));params.add(parameter("LOGICAL_OP",mode.equals("OR")?"||":"&&"));
            params.add(parameter("USE_ADVANCED",mode.equals("ADVANCED")));
            params.add(parameter("ADVANCED_COND","input_row.MOIS != null"));filter.setElementParameters(params);
            String expect=mode.equals("ALL")?"true":mode.equals("OR")?"i<3":mode.equals("ADVANCED")?"i==0":"i%2==0";
            String body=emit(filter,15)+"for(int i=0;i<4;i++){ row.AGENCE=i%2==0?\"0007\":\"0008\"; row.MOIS=i<2?\"202601\":null; row.SQL=i<2?payload():i==2?null:new Dynamic();\n"
                    +emit(filter,16)+"boolean ok="+expect+";\n"
                    +(!mode.equals("REJECT_ONLY")?"check((accepted!=null)==ok); if(accepted!=null)checkCopy(accepted.SQL,row.SQL);":"")
                    +(!mode.equals("FILTER_ONLY")?"check((rejected!=null)==!ok); if(rejected!=null){ check(rejected.errorMessage!=null);checkCopy(rejected.SQL,row.SQL); }":"")
                    +"}\n"+emit(filter,17);
            int ok=mode.equals("ALL")?4:mode.equals("OR")?3:mode.equals("ADVANCED")?1:2;
            body+="check(Integer.valueOf(4).equals(globalMap.get(\"tFilterRow_1_NB_LINE\")));check(Integer.valueOf("+ok+").equals(globalMap.get(\"tFilterRow_1_NB_LINE_OK\")));check(Integer.valueOf("+(4-ok)+").equals(globalMap.get(\"tFilterRow_1_NB_LINE_REJECT\")));";
            write(output,"GeneratedFilter"+mode,body);
        }
    }
}
