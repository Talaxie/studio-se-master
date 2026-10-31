import java.nio.file.*;
import java.util.*;
import java.lang.reflect.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.w3c.dom.Element;
import org.talend.core.model.process.*;
import org.talend.core.model.metadata.*;

/** Render the production output templates with the saved benchmark schema/settings. */
public class ExportMultiDb {
    static String emit(String component,String phase,INode node) throws Exception {
        var arg=new org.talend.designer.codegen.config.CodeGeneratorArgument();arg.setNode(node);
        Class<?> type=Class.forName(component+"_"+phase);
        return (String)type.getMethod("generate",Object.class).invoke(type.getConstructor().newInstance(),arg);
    }
    public static void main(String[] args) throws Exception {
        var document=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(args[0]);
        Element output=null;
        var nodes=document.getElementsByTagName("node");
        for(int i=0;i<nodes.getLength();i++) {
            Element candidate=(Element)nodes.item(i);
            for(int j=0;j<candidate.getChildNodes().getLength();j++) {
                Node child=candidate.getChildNodes().item(j);
                if(child instanceof Element e && e.getTagName().equals("elementParameter")
                        && e.getAttribute("name").equals("UNIQUE_NAME") && e.getAttribute("value").equals("tDBOutput_1"))output=candidate;
            }
        }
        if(output==null)throw new IllegalArgumentException("Missing benchmark output");
        var loader=new org.talend.core.model.metadata.MappingFileLoader();
        for(String file:List.of("mapping_Mysql.xml","mapping_Oracle.xml","mapping_Postgres.xml"))loader.load(Path.of(args[4]).resolve(file).toFile());
        Map<String,Object> settings=new HashMap<>();
        var parameters=output.getElementsByTagName("elementParameter");
        for(int i=0;i<parameters.getLength();i++) {
            Element e=(Element)parameters.item(i);settings.put(e.getAttribute("name"),e.getAttribute("field").equals("TABLE")?List.of():e.getAttribute("value"));
        }
        // Credentials/connection code are retained verbatim from the existing exported job.
        settings.put("PASS","\"\"");settings.put("NO_OUTPUT",true);
        settings.put("TABLE_ACTION","NONE");
        settings.put("DATA_ACTION",args[3]);
        settings.put("BATCH_SIZE","context.batchSize");
        settings.put("NB_ROWS_PER_INSERT","context.batchSize");
        settings.put("EXTENDINSERT","true");
        settings.put("USE_BATCH_SIZE","true");
        settings.put("USE_BATCH_AND_USE_CONN","true");
        settings.put("USE_FIELD_OPTIONS","false");
        settings.put("COMMIT_EVERY","0");
        List<IMetadataColumn> columns=new ArrayList<>();
        var metadata=output.getElementsByTagName("metadata");
        for(int i=0;i<metadata.getLength();i++) {
            Element m=(Element)metadata.item(i);if(!m.getAttribute("connector").equals("FLOW"))continue;
            var cs=m.getElementsByTagName("column");
            for(int j=0;j<cs.getLength();j++) {
                Element c=(Element)cs.item(j);String name=c.getAttribute("name"),type=c.getAttribute("type");
                if(name.equals("updateStrategy") && !args[3].equals("RELATIONAL_STRATEGY"))continue;
                Map<String,Object> values=new HashMap<>(Map.of("getName",name,"getLabel",name,
                    "getOriginalDbColumnName",name,"getTalendType",type,"getType",c.getAttribute("sourceType"),
                    "isKey",Boolean.parseBoolean(c.getAttribute("key")),"isNullable",Boolean.parseBoolean(c.getAttribute("nullable")),
                    "getPattern",c.getAttribute("pattern"),"getLength",Integer.parseInt(c.getAttribute("length")),
                    "getPrecision",Integer.parseInt(c.getAttribute("precision"))));
                columns.add(StrategyChecks.proxy(IMetadataColumn.class,values));
            }
        }
        INode base=StrategyChecks.node(settings,columns,false);
        INode connection=(INode)Proxy.newProxyInstance(INode.class.getClassLoader(),new Class<?>[]{INode.class},(o,m,a)-> {
            if(m.getName().equals("getUniqueName"))return "tDBConnection_1";
            return m.invoke(base,a);
        });
        IProcess process=StrategyChecks.proxy(IProcess.class,Map.of("getNodesOfType",List.of(connection)));
        IConnection incoming=StrategyChecks.proxy(IConnection.class,Map.of("getName","outMain","getLineStyle",EConnectionType.FLOW_MAIN));
        INode node=(INode)Proxy.newProxyInstance(INode.class.getClassLoader(),new Class<?>[]{INode.class},(o,m,a)-> {
            if(m.getName().equals("getUniqueName"))return "tDBOutput_1";
            if(m.getName().equals("getProcess"))return process;
            if(m.getName().equals("getIncomingConnections"))return List.of(incoming);
            return m.invoke(base,a);
        });
        Path destination=Path.of(args[1]);Files.createDirectories(destination);
        for(String phase:List.of("begin","main","end","finally"))Files.writeString(destination.resolve(phase+".java"),emit(args[2],phase,node));
    }
}
