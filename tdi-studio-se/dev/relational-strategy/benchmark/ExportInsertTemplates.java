import java.nio.file.*;
import java.util.*;
import java.lang.reflect.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.w3c.dom.Element;
import org.talend.core.model.process.*;
import org.talend.core.model.metadata.*;

/** Render the production output templates with the saved benchmark schema/settings. */
public class ExportInsertTemplates {
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
        Map<String,Object> settings=new HashMap<>();
        var parameters=output.getElementsByTagName("elementParameter");
        for(int i=0;i<parameters.getLength();i++) {
            Element e=(Element)parameters.item(i);settings.put(e.getAttribute("name"),e.getAttribute("field").equals("TABLE")?List.of():e.getAttribute("value"));
        }
        // Credentials/connection code are retained verbatim from the existing exported job.
        settings.put("PASS","\"\"");settings.put("NO_OUTPUT",true);
        List<IMetadataColumn> columns=new ArrayList<>();
        var metadata=output.getElementsByTagName("metadata");
        for(int i=0;i<metadata.getLength();i++) {
            Element m=(Element)metadata.item(i);if(!m.getAttribute("connector").equals("FLOW"))continue;
            var cs=m.getElementsByTagName("column");
            for(int j=0;j<cs.getLength();j++) {
                Element c=(Element)cs.item(j);String name=c.getAttribute("name"),type=c.getAttribute("type");
                Map<String,Object> values=new HashMap<>(Map.of("getName",name,"getLabel",name,
                    "getOriginalDbColumnName",name,"getTalendType",type,"getType",c.getAttribute("sourceType"),
                    "isKey",Boolean.parseBoolean(c.getAttribute("key")),"isNullable",Boolean.parseBoolean(c.getAttribute("nullable")),
                    "getPattern",c.getAttribute("pattern"),"getLength",Integer.parseInt(c.getAttribute("length")),
                    "getPrecision",Integer.parseInt(c.getAttribute("precision"))));
                columns.add(StrategyChecks.proxy(IMetadataColumn.class,values));
            }
        }
        INode base=StrategyChecks.node(settings,columns,false);
        IConnection incoming=StrategyChecks.proxy(IConnection.class,Map.of("getName","outMain","getLineStyle",EConnectionType.FLOW_MAIN));
        INode node=(INode)Proxy.newProxyInstance(INode.class.getClassLoader(),new Class<?>[]{INode.class},(o,m,a)-> {
            if(m.getName().equals("getUniqueName"))return "tDBOutput_1";
            if(m.getName().equals("getIncomingConnections"))return List.of(incoming);
            return m.invoke(base,a);
        });
        Path destination=Path.of(args[1]);Files.createDirectories(destination);
        for(String phase:List.of("begin","main","end","finally"))Files.writeString(destination.resolve(phase+".java"),StrategyChecks.emit(phase,node));
    }
}
