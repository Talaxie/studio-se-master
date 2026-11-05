import java.lang.reflect.Proxy;
import java.nio.file.*;
import java.util.*;
import org.talend.core.model.process.*;
import org.talend.core.model.metadata.*;
import org.talend.core.model.metadata.types.*;
import org.talend.designer.core.model.process.DataNode;

/** Exercises native cache writers/readers, duplicates, nulls and independent rereads. */
public class GenerateHashRows {
    static void parameters(DataNode node,Object... values) {
        List<IElementParameter> parameters=new ArrayList<>(node.getElementParameters());
        for(int i=0;i<values.length;i+=2)parameters.add(GenerateProcessingRows.parameter((String)values[i],values[i+1]));
        node.setElementParameters(parameters);
    }
    public static void main(String[] args) throws Exception {
        JavaTypesManager.addJavaType(new JavaType(routines.system.Dynamic.class,false,true));
        for(String mode:new String[]{"KEEP_ALL","KEEP_FIRST","KEEP_LAST","LINKED"}) {
            DataNode writer=GenerateRows.node(2,"tHashOutput");
            IMetadataTable schema=writer.getMetadataList().get(0);
            writer.setOutgoingConnections(Collections.emptyList());
            parameters(writer,"LINK_WITH",false,"APPEND",false,"KEYS_MANAGEMENT",mode.equals("LINKED")?"KEEP_ALL":mode);
            List<INode> nodes=new ArrayList<>();nodes.add(writer);
            IProcess original=writer.getProcess();
            IProcess process=(IProcess)Proxy.newProxyInstance(GenerateHashRows.class.getClassLoader(),new Class<?>[]{IProcess.class},
                    (p,m,a)->m.getName().equals("getGeneratingNodes")?nodes:m.invoke(original,a));
            writer.setProcess(process);
            DataNode linked=GenerateRows.node(2,"tHashOutput"); linked.setUniqueName("tHashOutput_2");linked.setProcess(process);
            linked.setMetadataList(Collections.singletonList(schema));linked.setOutgoingConnections(Collections.emptyList());
            linked.setIncomingConnections(Collections.singletonList(GenerateProcessingRows.connection("row","FLOW",schema,linked)));
            parameters(linked,"LINK_WITH",true,"LIST","tHashOutput_1");nodes.add(linked);
            String body="{\n"+GenerateProcessingRows.emit(writer,29)+"for(int i=0;i<"+(mode.equals("LINKED")?2:4)+";i++){fill(row,i);\n"+GenerateProcessingRows.emit(writer,30)
                    +"mutate(row.SQL);}\n"+GenerateProcessingRows.emit(writer,31)+"}\n";
            if(mode.equals("LINKED"))body+="{\n"+GenerateProcessingRows.emit(linked,29)+"for(int i=2;i<4;i++){fill(row,i);\n"+GenerateProcessingRows.emit(linked,30)+"mutate(row.SQL);}\n"+GenerateProcessingRows.emit(linked,31)+"}\n";
            for(int read=1;read<=2;read++) {
                DataNode reader=GenerateRows.node(2,"tHashInput");reader.setUniqueName("tHashInput_"+read);
                reader.setProcess(process);reader.setMetadataList(Collections.singletonList(schema));reader.setIncomingConnections(Collections.emptyList());
                reader.setOutgoingConnections(Collections.singletonList(GenerateProcessingRows.connection("cached","FLOW",schema,reader)));
                parameters(reader,"LINK_WITH",true,"LIST","tHashOutput_1","RELEASE_CACHE",read==2);nodes.add(reader);
                body+="{int seen=0;\n"+GenerateProcessingRows.emit(reader,32)
                        +"seen++;if(cached.AGENCE.equals(\"A\")){check(cached.SQL.getColumnMetadata(0).getName().equals(\"amount\"));check(((java.math.BigDecimal)cached.SQL.getColumnValue(0)).signum()>0); amounts.add(cached.SQL.getColumnValue(0).toString());}else if(cached.AGENCE.equals(\"B\"))check(cached.SQL==null);else check(cached.SQL.getColumnCount()==0);mutate(cached.SQL);\n"
                        +GenerateProcessingRows.emit(reader,33)+"check(seen=="+(mode.startsWith("KEEP_")&&!mode.equals("KEEP_ALL")?3:4)+");}\n";
            }
            String name="GeneratedHash"+mode;
            Files.writeString(Path.of(args[0],name+".java"),"""
import java.util.*;import routines.system.*;import java.math.*;
public class CLASS {
 static class rowStruct { String AGENCE,MOIS;Dynamic SQL;
  public boolean equals(Object o){return o instanceof rowStruct && Objects.equals(AGENCE,((rowStruct)o).AGENCE);}
  public int hashCode(){return Objects.hashCode(AGENCE);}
 }
 static class cachedStruct extends rowStruct {}
 static void check(boolean value){if(!value)throw new AssertionError("CLASS");}
 static void fill(rowStruct row,int i){row.AGENCE=i<2?"A":i==2?"B":"C";row.MOIS="202601";row.SQL=i<2?new Dynamic():i==2?null:new Dynamic();if(i<2)DynamicFields.add(row.SQL,"amount","amount","id_BigDecimal","DECIMAL",38,10,true,false,null,new BigDecimal(i==0?"10.1234567890":"20.1234567890"));}
 static void mutate(Dynamic d){if(d!=null && d.getColumnCount()>0){d.getColumnMetadata(0).setName("changed");d.setColumnValue(0,BigDecimal.ZERO);}}
 public static void main(String[] args) throws Exception {
  String pid="isolated";Map<String,Object> globalMap=new HashMap<>();rowStruct row=new rowStruct();cachedStruct cached=new cachedStruct();List<String> amounts=new ArrayList<>();
  BODY
  check(org.talend.designer.components.hashfile.common.MapHashFile.getMapHashFile().getResourceMap().isEmpty());
  if("MODE_VALUE".equals("KEEP_FIRST"))check(amounts.equals(Arrays.asList("10.1234567890","10.1234567890")));
  if("MODE_VALUE".equals("KEEP_LAST"))check(amounts.equals(Arrays.asList("20.1234567890","20.1234567890")));
  System.out.println("PASS CLASS");
 }
}
""".replace("CLASS",name).replace("BODY",body).replace("MODE_VALUE",mode));
        }
    }
}
