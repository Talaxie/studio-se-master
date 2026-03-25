package com.talend.addressdoctor;

import java.util.HashMap;
import java.util.Map;

/**
 * @see the: WebService_SOAP_EN_0208.pdf, section: 8.1
 */
public class Parser4ValidationStatus {

    private static String V = "V:  Data correct on input (validated)";

    private static String C = "C:  Data corrected by AddressDoctor";

    private static String P3 = "P3:  Data cannot be corrected, but is very likely to be deliverable";

    private static String P2 = "P2:  Data cannot be corrected, but fair chance that the address is deliverable";

    private static String P1 = "P1:  Data cannot be corrected and unlikely to be deliverable";

    private static String N6 = "N6:  No validation performed because the transactions for this country are exhausted";

    private static String N4 = "N4:  Only parsing was requested and performed for this address";

    private static String N3 = "N3:  No validation performed because country is not available for this user account";

    private static String N2 = "N2:  No validation performed because reference data for this country is not available";

    private static String N1 = "N1:  No validation performed because country not recognized";

    // buffer the status info
    private static Map<String, String> mapping = new HashMap<String, String>();

    static {
        mapping.put("V", V);
        mapping.put("C", C);
        mapping.put("P3", P3);
        mapping.put("P2", P2);
        mapping.put("P1", P1);
        mapping.put("N6", N6);
        mapping.put("N4", N4);
        mapping.put("N3", N3);
        mapping.put("N2", N2);
        mapping.put("N1", N1);
    }

    /**
     * DOC wyang Comment method "parse".
     * 
     * @param validationStatus
     */
    public static String parse(String validationStatus) {
        String description = mapping.get(validationStatus);
        return description;
    }

    /**
     * DOC wyang Comment method "main".
     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String validationStatus = "V";
        String description = mapping.get(validationStatus);
        System.out.println(description);

    }
}
