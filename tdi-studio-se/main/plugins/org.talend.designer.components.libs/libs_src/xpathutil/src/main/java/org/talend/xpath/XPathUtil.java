package org.talend.xpath;

import java.util.List;
import java.util.ArrayList;

public class XPathUtil {
	
	private List<String> defualtNSPath = new ArrayList<String>();
	
	public void setDefaultNSPath(List<String> defualtNSPath) {
		this.defualtNSPath = defualtNSPath;
	}
	
	private final String LITERAL = "TALEND_LITERAL";
	private java.util.regex.Pattern literalPattern = null; 
	private java.util.Map<String,String> resultCache;
	
	private String removeLiterals(String path, List<String> literals) {
		if(path == null || "".equals(path)) {
			return path;
		}
		
		if(literalPattern == null) {
			literalPattern = java.util.regex.Pattern.compile("'([^']*)'|\"([^\"]*)\"");
    	}
		
		java.util.regex.Matcher matcher = literalPattern.matcher(path);
		StringBuffer sb = new StringBuffer();
		
		while(matcher.find()) {
			literals.add(path.substring(matcher.start()+1,matcher.end()-1));
			if(matcher.group(1)!=null) {
				matcher.appendReplacement(sb, "'" + LITERAL + "'");
			} else {
				matcher.appendReplacement(sb, "\"" + LITERAL + "\"");
			}
		}
		
		return matcher.appendTail(sb).toString();
	}
	
	private String resetLiterals(String xpathExpression,List<String> literals) {
		if(literals.isEmpty()) {
			return xpathExpression;
		}
		
		int start = 0;
        int end = xpathExpression.indexOf(LITERAL, start);
        if (end == -1) {
            return xpathExpression;
        }
		
        StringBuilder sb = new StringBuilder();
        java.util.Iterator<String> iterator = literals.iterator();
        
        while (end != -1 && iterator.hasNext()) {
        	sb.append(xpathExpression.substring(start, end)).append(iterator.next());
            start = end + LITERAL.length();
            end = xpathExpression.indexOf(LITERAL, start);
        }
        sb.append(xpathExpression.substring(start));
		return sb.toString();
	}
	
	public String addDefaultNSPrefix(String basePath) {
		return addDefaultNSPrefix(basePath,"/");
	}
	
	public String addDefaultNSPrefix(String xpathExpression, String basePath) {
		if(".".equals(basePath.trim())) {//addDefaultNSPrefix(path,".")==>process the special loop path
			basePath = "/";
		}
		
	    if (defualtNSPath.size() < 1) {
        	return xpathExpression;
    	}
	    
    	if(resultCache == null) {
    		resultCache = new java.util.HashMap<String,String>();
    	}
    	
    	String resultXpathExpression = resultCache.get(xpathExpression);
		if(resultXpathExpression!=null) {
    		return resultXpathExpression;
    	}
		
		List<String> literals = new java.util.ArrayList<String>();
		resultXpathExpression = removeLiterals(xpathExpression,literals);
		
		resultXpathExpression = addDefaultNSPrefixForLocationXPathExpression(resultXpathExpression,basePath);
		
		resultXpathExpression = resetLiterals(resultXpathExpression, literals);
		
    	resultCache.put(xpathExpression,resultXpathExpression);
    	return resultXpathExpression;
	}

	private String addDefaultNSPrefixForLocationXPathExpression(String path, String absolutePath) {		
        StringBuilder newPath = new StringBuilder();
        String[] pathStrs = path.split("/");
        String currentAbsolutePath = absolutePath;
        for (int i = 0; i < pathStrs.length; i++) {
            String step = pathStrs[i];
            
            currentAbsolutePath = getCurrentAbsolutePath(step, currentAbsolutePath);
            
            if (newPath.length() > 0) {
                newPath.append("/");
            }
            
            if (step.length() > 0 && step.indexOf(":") == -1 && step.indexOf(".") == -1 /*&& tmp.indexOf("@") == -1*/) {
                int index = getDefaultNamespaceIndex(currentAbsolutePath);
                if (index >= 0) {
                	//==== add by wliu to support both filter and functions==
					if(step.indexOf("[")>0 && step.indexOf("]")>step.indexOf("[")){//include filter
						String tmpStr=replaceElementWithNS(step,"pre"+index+":");
						newPath.append(tmpStr);
					}else{
						if(step.indexOf("@") != -1 || step.indexOf("(")<step.indexOf(")")){  // include attribute
							newPath.append(step);
						}else{
					//==add end=======	
                    		newPath.append("pre").append(index).append(":").append(step);
                    	}
                    }                    
                } else {
                    newPath.append(step);
                }
            } else {
                newPath.append(step);
            }
        }
        
        if(newPath.length() == 0) {
        	return "/";
        }
        
         return newPath.toString();
    }
	
	private String getCurrentAbsolutePath(String step, String absolutePath) {
		String currentAbsolutePath = absolutePath;
		if ("..".equals(step)) {
			currentAbsolutePath = currentAbsolutePath.substring(0, currentAbsolutePath.lastIndexOf("/"));
		} else if(".".equals(step)) {
			//do nothing
		} else if("/".equals(currentAbsolutePath)) {
			currentAbsolutePath += step;
        } else {
        	currentAbsolutePath += "/" + step;
        }
		return currentAbsolutePath;
	}

	private int getDefaultNamespaceIndex(String currentAbsolutePath) {
		int result = -1;
        for (int i = 0,length = 0; i < defualtNSPath.size(); i++) {
            if (defualtNSPath.get(i).length() > length && currentAbsolutePath.startsWith(defualtNSPath.get(i))) {
            	result = i;
                length = defualtNSPath.get(i).length();
            }
        }
        return result;
	}

	private String matches = "@*\\b[a-z|A-Z|_]+[[-]*\\w]*\\b[^'\"|^\\(]";
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