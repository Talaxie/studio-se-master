import java.nio.file.*;
import java.util.*;
import org.talend.core.model.metadata.*;
import org.talend.core.model.metadata.types.*;
import org.talend.core.model.process.*;
import org.talend.designer.core.model.process.DataNode;

/** Round trips through real pack/extract/buffer templates, with typed child return cells. */
public class GenerateDynamicFieldRows {
    static MetadataTable schema(String... fields) {
        MetadataTable table=new MetadataTable();table.setTableName("row");
        for(int i=0;i<fields.length;i+=2) {
            MetadataColumn column=new MetadataColumn(); column.setLabel(fields[i]);column.setOriginalDbColumnName(fields[i]);
            column.setTalendType(fields[i+1]);column.setNullable(true);column.setLength(38);column.setPrecision(10);
            column.setPattern(fields[i+1].equals("id_Date")?"\"yyyy-MM-dd\"":null);table.getListColumns().add(column);
        }
        return table;
    }
    static DataNode node(String component,String inputName,IMetadataTable input,String outputName,IMetadataTable output) {
        DataNode node=GenerateRows.node(2,component);
        node.setMetadataList(Collections.singletonList(output));
        node.setIncomingConnections(Collections.singletonList(GenerateProcessingRows.connection(inputName,"FLOW",input,node)));
        node.setOutgoingConnections(Collections.singletonList(GenerateProcessingRows.connection(outputName,"FLOW",output,node)));
        return node;
    }
    public static void main(String[] args) throws Exception {
        JavaTypesManager.addJavaType(new JavaType(routines.system.Dynamic.class,false,true));
        Path output=Path.of(args[0]);
        for(String mode:new String[]{"MIXED","DYNAMIC_ONLY","EXISTING","NULL_EXISTING"}) {
            MetadataTable input=schema("AGENCE","id_String","AMOUNT","id_BigDecimal","VIDE","id_Integer","TEXTE","id_String",
                    "DATE","id_Date","LIST","id_List","BYTES","id_byte[]");
            boolean existing=mode.endsWith("EXISTING");
            if(existing) input.getListColumns().add(schema("SQL","id_Dynamic").getListColumns().get(0));
            MetadataTable packed=mode.equals("DYNAMIC_ONLY")?schema("SQL","id_Dynamic"):schema("AGENCE","id_String","SQL","id_Dynamic");
            MetadataTable extracted=schema("AGENCE","id_String","AMOUNT","id_BigDecimal","VIDE","id_Integer","TEXTE","id_String","MISSING","id_Integer","SQL","id_Dynamic");
            DataNode pack=node("tWriteDynamicFields","row",input,"packed",packed);
            DataNode extract=node("tExtractDynamicFields","packed",packed,"extracted",extracted);
            DataNode buffer=node("tBufferOutput","packed",packed,"ignored",packed);
            buffer.setOutgoingConnections(Collections.emptyList());
            String begin=GenerateProcessingRows.emit(pack,26)+GenerateProcessingRows.emit(extract,23);
            String body=GenerateProcessingRows.emit(pack,27)+GenerateProcessingRows.emit(extract,24)+GenerateProcessingRows.emit(buffer,34);
            String end=GenerateProcessingRows.emit(pack,28)+GenerateProcessingRows.emit(extract,25);
            String name="GeneratedDynamicFields"+mode;
            Files.writeString(output.resolve(name+".java"),"""
import java.util.*; import java.math.*; import routines.system.*;
public class CLASS {
 static class Row { String AGENCE,TEXTE; BigDecimal AMOUNT; Integer VIDE,MISSING; Date DATE; List<String> LIST; byte[] BYTES; Dynamic SQL; }
 static class packedStruct extends Row {} static class extractedStruct extends Row {}
 static void check(boolean value){if(!value)throw new AssertionError("CLASS");}
 public static void main(String[] args) throws Exception {
  Map<String,Object> globalMap=new HashMap<>();List<String[]> globalBuffer=new ArrayList<>();
  Row row=new Row();packedStruct packed=new packedStruct();extractedStruct extracted=new extractedStruct();
  BEGIN
  for(int i=0;i<2;i++) {
   row.AGENCE="0007";row.AMOUNT=i==0?new BigDecimal("1234567890123456789012345678.1234567890"):null;
   row.TEXTE=SPECIAL;row.DATE=new Date(123456);row.LIST=new ArrayList<>(Arrays.asList("Été","€"));row.BYTES=new byte[]{65};
   row.SQL=null;
   if(HAS_EXISTING) {row.SQL=new Dynamic();DynamicFields.add(row.SQL,"EXISTING","EXISTING","id_String","VARCHAR",50,0,true,false,null,"unknown");}
   BODY
   check(extracted.AGENCE.equals(row.AGENCE));check(Objects.equals(extracted.AMOUNT,row.AMOUNT));
   check(extracted.TEXTE.equals(row.TEXTE));check(extracted.MISSING==null && extracted.VIDE==null);
   check(extracted.SQL.getColumnCount()==(HAS_EXISTING?4:3));
   check(extracted.SQL.getColumnValue("LIST").equals(row.LIST));
   row.LIST.set(0,"changed");row.DATE.setTime(0);row.BYTES[0]=90;
   check(((List<?>)extracted.SQL.getColumnValue("LIST")).get(0).equals("Été"));
   check(((Date)extracted.SQL.getColumnValue("DATE")).getTime()==123456);
   check(((byte[])extracted.SQL.getColumnValue("BYTES"))[0]==65);
   Dynamic child=DynamicTransfer.decode(globalBuffer.get(i)[DYNAMIC_INDEX]);
   check(Objects.equals(child.getColumnValue("AMOUNT"),row.AMOUNT));check(child.getColumnValue("TEXTE").equals(row.TEXTE));
   check(((byte[])child.getColumnValue("BYTES"))[0]==65);
  }
  END
  check(Integer.valueOf(2).equals(globalMap.get("tWriteDynamicFields_1_NB_LINE")));
  check(Integer.valueOf(2).equals(globalMap.get("tExtractDynamicFields_1_NB_LINE")));
  System.out.println("PASS CLASS");
 }
}
""".replace("CLASS",name).replace("BEGIN",begin).replace("BODY",body).replace("END",end)
                    .replace("HAS_EXISTING",String.valueOf(mode.equals("EXISTING"))).replace("DYNAMIC_INDEX",mode.equals("DYNAMIC_ONLY")?"0":"1").replace("SPECIAL",GenerateFileRows.quote("Été;\"€\"\nObsèques")));
        }
    }
}
