package org.talend.designer.bigdata.di.components.thbase;

public class THbaseUtils {

    public static String trimDuplicateQuotes(String inputString) {
        if (inputString.length() < 2) return "";

        if (inputString.charAt(0) == '\"' && inputString.charAt(1) == '\"') {
            if (inputString.charAt(inputString.length() - 1) == '\"' && inputString.charAt(inputString.length() - 2) == '\"') {
                return inputString.substring(1, inputString.length() - 1);
            }
        }
        return inputString;
    }

    public static String trimQuotes(String string) {
        if (string.length() < 2) return string;
        if ((string.charAt(0) == '\"') && (string.charAt(string.length() - 1) == '\"')) {
            return string.substring(1, string.length() - 1);
        }
        return string;
    }
    public static String addQuotesIfNotContainContext(String string){
        if(string.isEmpty()) return "\"\"";
        if(string.contains("context")) return string;
        if ((string.charAt(0) == '\"') && (string.charAt(string.length() - 1) == '\"')) {
            return string;
        }
        return "\""+string+"\"";
    }
}
