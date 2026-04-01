package routines.system;

public class NameSpaceTool {

    public java.util.HashMap<String, String> xmlNameSpaceMap = new java.util.HashMap<String, String>();
    
	private java.util.List<String> defualtNSPath = new java.util.ArrayList<String>();

    public void countNSMap(org.dom4j.Element el) {
        for (org.dom4j.Namespace ns : (java.util.List<org.dom4j.Namespace>) el.declaredNamespaces()) {
            if (ns.getPrefix().trim().length() == 0) {
                xmlNameSpaceMap.put("pre"+defualtNSPath.size(), ns.getURI());
                String path = "";
                org.dom4j.Element elTmp = el;
                while (elTmp != null) {
                	if (elTmp.getNamespacePrefix() != null && elTmp.getNamespacePrefix().length() > 0) {
                        path = "/" + elTmp.getNamespacePrefix() + ":" + elTmp.getName() + path;
                    } else {
                        path = "/" + elTmp.getName() + path;
                    }
                    elTmp = elTmp.getParent();
                }
                defualtNSPath.add(path);
            } else {
                xmlNameSpaceMap.put(ns.getPrefix(), ns.getURI());
            }

        }
        for (org.dom4j.Element e : (java.util.List<org.dom4j.Element>) el.elements()) {
            countNSMap(e);
        }
    }
    
    public String addDefaultNSPrefix(String path, String loopPath) {
        if (defualtNSPath.size() > 0) {
        	String fullPath = loopPath;
        	if(!path.equals(fullPath)){
            	for (String tmp : path.split("/")) {
            		if (("..").equals(tmp)) {
                        fullPath = fullPath.substring(0, fullPath.lastIndexOf("/"));
                    } else {
                        fullPath += "/" + tmp;
                    }
            	}
            }
        	int[] indexs = new int[fullPath.split("/").length - 1];
            java.util.Arrays.fill(indexs, -1);
            int length = 0;
            for (int i = 0; i < defualtNSPath.size(); i++) {
                if (defualtNSPath.get(i).length() > length && fullPath.startsWith(defualtNSPath.get(i))) {
                    java.util.Arrays.fill(indexs, defualtNSPath.get(i).split("/").length - 2, indexs.length, i);
                    length = defualtNSPath.get(i).length();
                }
            }

            StringBuilder newPath = new StringBuilder();
            String[] pathStrs = path.split("/");
            for (int i = 0; i < pathStrs.length; i++) {
                String tmp = pathStrs[i];
                if (newPath.length() > 0) {
                    newPath.append("/");
                }
                if (tmp.length() > 0 && tmp.indexOf(":") == -1 && tmp.indexOf(".") == -1 /*&& tmp.indexOf("@") == -1*/) {
                    int index = indexs[i + indexs.length - pathStrs.length];
                    if (index >= 0) {
                    	//==== add by wliu to support both filter and functions==
						if(tmp.indexOf("[")>0 && tmp.indexOf("]")>tmp.indexOf("[")){//include filter
							String tmpStr=replaceElementWithNS(tmp,"pre"+index+":");
							newPath.append(tmpStr);
						}else{
							if(tmp.indexOf("@") != -1 || tmp.indexOf("(")<tmp.indexOf(")")){  // include attribute
								newPath.append(tmp);
							}else{
						//==add end=======	
                        		newPath.append("pre").append(index).append(":").append(tmp);
                        	}
                        }                    
                    } else {
                        newPath.append(tmp);
                    }
                } else {
                    newPath.append(tmp);
                }
            }
            return newPath.toString();
        }
        return path;
    }

	private String matches = "@*\\b[a-z|A-Z|_]+[[-]*\\w]*\\b[^'|^\\(]";
    private java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(matches);
    
	private String replaceElementWithNS(String global, String pre){

        java.util.regex.Matcher match = pattern.matcher(global);
        StringBuffer sb = new StringBuffer();
        match.reset();
        while (match.find()) {
            String group = match.group();
            String tmp = "";
            if (group.toLowerCase().matches("\\b(div|mod|and|or)\\b.*") || group.matches("@.*")) {
                tmp = group;
            } else {
                tmp = tmp + pre + group;
            }
            match.appendReplacement(sb, tmp);
        }
        match.appendTail(sb);
        
        return sb.toString();
	}    

}