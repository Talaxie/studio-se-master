// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package routines.system;

import java.text.ParseException;
import java.util.Date;

import routines.TalendDate;

public class RuntimeUtils {

    public static boolean isDateType(Object o) {
        return getRuntimeType(o).equals("java.util.Date"); //$NON-NLS-1$
    }

    /**
     * This function is in order to check the i type for "int i = 10".
     *
     * @param o
     * @return
     */
    public static String getRuntimeType(Object o) {
        return o.getClass().getName();
    }
    
    private static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * This function is in order to check the Date type in tRunJob when transmit the context to child job.
     *
     * @param o
     * @return
     */
    public static Object tRunJobConvertContext(Object o) {
        if (o == null) {
            return null;
        }

        // when tRunJob transmit the date to child job, it should format with "yyyy-MM-dd HH:mm:ss"
        if (isDateType(o)) {
            return TalendDate.formatDate(DEFAULT_DATE_PATTERN, (Date) o); //$NON-NLS-1$
        }

        return o;
    }
    
    public static Date getDate(String pattern, String dateString) {
        if (dateString == null || dateString.isEmpty()) {
            return null;
        }

        // when tRunJob transmit the date to child job:
        //case 1: pass date string with pattern : yyyy-MM-dd HH:mm:ss
        //case 2: pass date long value
        //so here process two cases both and avoid exception
        try {
            return new java.text.SimpleDateFormat(pattern).parse(dateString);
        } catch(ParseException e) {
            //ignore exception
        }
        
        try {
            return new Date(Long.valueOf(dateString));
        } catch(NumberFormatException e) {
            //ignore exception
            //System.err.println(String.format("Null value will be used for context parameter as can't parse this to date: %s", dateString));
        }
        
        return null;
    }
    
    public static Date getDate(String dateString) {
        return getDate(DEFAULT_DATE_PATTERN, dateString);
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.println(tRunJobConvertContext(i));

        Date date = new Date();
        System.out.println(tRunJobConvertContext(date));

    }
}
