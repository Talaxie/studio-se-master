package com.talend.addressdoctor;

import java.util.ArrayList;
import java.util.List;

/**
 * @see the: WebService_SOAP_EN_0208.pdf, section: 8.3
 */
public class ElementResultStatus {

    private static String POSITION1 = "1 = Postal code";

    private static String POSITION2 = "2 = Locality";

    private static String POSITION3 = "3 = Province";

    private static String POSITION4 = "4 = Street";

    private static String POSITION5 = "5 = Building number";

    private static String POSITION6 = "6 = PO Box";

    private static String POSITION7 = "7 = Building";

    private static String POSITION8 = "8 = Organization";

    // buffer the status info
    private static List<String> BUFFER4POSTION = new ArrayList<String>();
    static {
        BUFFER4POSTION.add(POSITION1);
        BUFFER4POSTION.add(POSITION2);
        BUFFER4POSTION.add(POSITION3);
        BUFFER4POSTION.add(POSITION4);
        BUFFER4POSTION.add(POSITION5);
        BUFFER4POSTION.add(POSITION6);
        BUFFER4POSTION.add(POSITION7);
        BUFFER4POSTION.add(POSITION8);
    }

    private static String VALUE0 = "0: empty";

    private static String VALUE1 = "1: not checked";

    private static String VALUE2 = "2: not checked but standardized";

    private static String VALUE3 = "3: checked and corrected (changed or inserted)";

    private static String VALUE4 = "4: validated, but changed (synonyms, old names)";

    private static String VALUE5 = "5: validated, but standardized";

    private static String VALUE6 = "6: validated and unchanged";

    private static String VALUE7 = "7: no value given because of multiple matches";

    // buffer the status info
    private static List<String> BUFFER4VALUE = new ArrayList<String>();
    static {
        BUFFER4VALUE.add(VALUE0);
        BUFFER4VALUE.add(VALUE1);
        BUFFER4VALUE.add(VALUE2);
        BUFFER4VALUE.add(VALUE3);
        BUFFER4VALUE.add(VALUE4);
        BUFFER4VALUE.add(VALUE5);
        BUFFER4VALUE.add(VALUE6);
        BUFFER4VALUE.add(VALUE7);
    }

    /**
     * DOC wyang Comment method "parse".
     * 
     * @param elementResultStatus
     */
    public static String parse(String elementResultStatus) {
        // TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer();

        char[] charArray = elementResultStatus.toCharArray();
        int len = charArray.length;
        for (int i = 0; i < len; i++) {
            String postionInfo = BUFFER4POSTION.get(i);

            String s = charArray[i] + "";
            String valueInfo = BUFFER4VALUE.get(Integer.parseInt(s));

            sb.append(postionInfo + " --- " + valueInfo + "\n");
        }

        return sb.toString();

    }

    /**
     * DOC wyang Comment method "main".
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String elementResultStatus = "53066000";

        char[] charArray = elementResultStatus.toCharArray();
        int len = charArray.length;
        for (int i = 0; i < len; i++) {
            String postionInfo = BUFFER4POSTION.get(i);

            String s = charArray[i] + "";

            String valueInfo = BUFFER4VALUE.get(Integer.parseInt(s));

            System.out.println(postionInfo + " --- " + valueInfo);

        }

    }
}
