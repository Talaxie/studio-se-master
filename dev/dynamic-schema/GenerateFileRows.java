import java.nio.file.*;
import java.util.*;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.talend.core.model.process.*;
import org.talend.core.model.metadata.types.*;
import org.talend.designer.core.model.process.DataNode;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

/** Real delimited/CSV emitters, including headers, quoting and an empty suffix. */
public class GenerateFileRows {
    static void defaults(DataNode node, Path components, String name, Map<String,Object> overrides) throws Exception {
        Map<String,Object> values=new LinkedHashMap<>();
        Document doc=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(components.resolve(name+"/"+name+"_java.xml").toFile());
        NodeList parameters=doc.getElementsByTagName("PARAMETER");
        for(int i=0;i<parameters.getLength();i++) {
            org.w3c.dom.Element p=(org.w3c.dom.Element)parameters.item(i); String field=p.getAttribute("FIELD"), value="";
            NodeList defs=p.getElementsByTagName("DEFAULT");
            if(defs.getLength()>0)value=defs.item(0).getTextContent();
            if(field.equals("CHECK")||field.equals("RADIO"))values.put(p.getAttribute("NAME"),Boolean.valueOf(value));
            else if(field.equals("TABLE"))values.put(p.getAttribute("NAME"),new ArrayList<>());
            else values.put(p.getAttribute("NAME"),value);
        }
        values.putAll(overrides); List<IElementParameter> params=new ArrayList<>();
        for(Map.Entry<String,Object> value:values.entrySet())params.add(GenerateProcessingRows.parameter(value.getKey(),value.getValue()));
        node.setElementParameters(params);
    }
    static String emit(DataNode node,int template) throws Exception {return GenerateProcessingRows.emit(node,template);}
    static String quote(String s){return "\""+s.replace("\\","\\\\").replace("\"","\\\"").replace("\n","\\n").replace("\r","\\r")+"\"";}
    public static void main(String[] args) throws Exception {
        Path output=Path.of(args[0]), components=Path.of(args[1]);
        JavaTypesManager.addJavaType(new JavaType(routines.system.Dynamic.class,false,true));
        for(boolean csv:new boolean[]{false,true})for(int fixed:new int[]{0,2})for(boolean empty:new boolean[]{false,true}) {
            if(empty && fixed==0)continue;
            String name="GeneratedFileInput"+(csv?"CSV":"Delimited")+fixed+(empty?"Empty":"");
            String header="AGENCE;MOIS"+(empty?"":";Montant €;Texte");
            String special=csv?"Été;\"€\"\nObsèques":"Été €";
            String data=header+"\n0007;202601"+(empty?"":";1234567890123456789012345678.1234567890;"+(csv?"\"Été;\"\"€\"\"\nObsèques\"":special))+"\n0008;202601"+(empty?"":";;second")+"\n";
            Path input=output.resolve(name+".csv");Files.writeString(input,data);
            DataNode node=GenerateRows.node(fixed,"tFileInputDelimited");node.setIncomingConnections(Collections.emptyList());
            Map<String,Object> settings=new HashMap<>();
            settings.put("CSV_OPTION",csv);settings.put("HEADER","1");settings.put("LIMIT","");
            settings.put("CSVROWSEPARATOR","\"\\n\"");settings.put("ESCAPE_CHAR","\"\\\"\"");settings.put("TEXT_ENCLOSURE","\"\\\"\"");
            settings.put("FILENAME",quote(input.toString()));settings.put("ENCODING","\"UTF-8\"");
            settings.put("USE_HEADER_AS_IS",true);settings.put("CHECK_FIELDS_NUM",true);settings.put("DIE_ON_ERROR",true);
            defaults(node,components,"tFileInputDelimited",settings);
            String body=emit(node,21)+"snapshots.add(row.SQL.copy());\n"+emit(node,22);
            String checks="check(snapshots.size()==2);check(snapshots.get(0).getColumnCount()=="+(empty?0:4-fixed)+");";
            if(!empty)checks+="check(snapshots.get(0).getColumnMetadata("+(2-fixed)+").getName().equals(\"Montant €\"));check(snapshots.get(0).getColumnValue("+(3-fixed)+").equals("+quote(special)+"));check(snapshots.get(1).getColumnValue("+(2-fixed)+").equals(\"\"));";
            Files.writeString(output.resolve(name+".java"),"""
import java.util.*; import routines.system.*;
public class CLASS {
 static class rowStruct { String AGENCE,MOIS; Dynamic SQL; }
 static void check(boolean value){if(!value)throw new AssertionError("CLASS");}
 public static void main(String[] args) throws Exception {
  Map<String,Object> globalMap=new HashMap<>(),resourceMap=new HashMap<>();
  rowStruct row=new rowStruct(); List<Dynamic> snapshots=new ArrayList<>();
  BODY
  CHECKS
  System.out.println("PASS CLASS");
 }
}
""".replace("CLASS",name).replace("BODY",body).replace("CHECKS",checks));
        }
        for(boolean empty:new boolean[]{false,true}) {
            String name="GeneratedFileOutputCSV"+(empty?"Empty":"");
            DataNode node=GenerateRows.node(2,"tFileOutputDelimited");
            defaults(node,components,"tFileOutputDelimited",Map.of("CSV_OPTION",true,"INCLUDEHEADER",true,"ENCODING","\"UTF-8\""));
            String body=emit(node,3);
            Files.writeString(output.resolve(name+".java"),"""
import java.util.*; import java.io.*; import routines.system.*;
public class CLASS {
 static class rowStruct { String AGENCE="0007",MOIS="202601"; Dynamic SQL; }
 static void check(boolean value){if(!value)throw new AssertionError("CLASS");}
 public static void main(String[] args) throws Exception {
  Map<String,Object> globalMap=new HashMap<>(),resourceMap=new HashMap<>();
  StringWriter output=new StringWriter();
  com.talend.csv.CSVWriter CsvWritertFileOutputDelimited_1=new com.talend.csv.CSVWriter(output).setSeparator(';').setQuoteChar('"').setEscapeChar('"').setLineEnd("\\n");
  java.io.File filetFileOutputDelimited_1=java.io.File.createTempFile("dynamic-csv-", ".tmp");
  boolean isFirstCheckDyn_tFileOutputDelimited_1=true; int dynamic_column_count_tFileOutputDelimited_1=0,nb_line_tFileOutputDelimited_1=0;
  String[] headColutFileOutputDelimited_1=null;
  class Settings { char getEscapeChar(){return '"';} char getTextEnclosure(){return '"';} }
  Settings csvSettings_tFileOutputDelimited_1=new Settings();
  rowStruct row=new rowStruct();row.SQL=new Dynamic();
  if(!EMPTY) {DynamicFields.add(row.SQL,"Texte €","Texte €","id_String","NVARCHAR",100,0,true,false,null,SPECIAL);}
  for(int i=0;i<2;i++) {
   if(EMPTY && i==1)row.SQL=null;
   BODY
  }
  CsvWritertFileOutputDelimited_1.close();filetFileOutputDelimited_1.delete();
  com.talend.csv.CSVReader reader=new com.talend.csv.CSVReader(new StringReader(output.toString()),';');
  check(reader.readNext());check(reader.getValues().length==(EMPTY?2:3));
  check(reader.readNext());check(reader.get(0).equals("0007"));
  if(!EMPTY)check(reader.get(2).equals(SPECIAL));
  check(reader.readNext());check(reader.getValues().length==(EMPTY?2:3));check(!reader.readNext()); reader.close();
  check(nb_line_tFileOutputDelimited_1==2);
  System.out.println("PASS CLASS");
 }
}
""".replace("CLASS",name).replace("BODY",body).replace("EMPTY",String.valueOf(empty)).replace("SPECIAL",quote("Été;\"€\"\nObsèques")));
        }
    }
}
