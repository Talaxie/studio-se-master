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
package org.talend.core.ui.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ParserUtils {

    public static List<String> parseTo_List(String s) {
        return parseTo_List(s, null);
    }

    /**
     * the source should be a string wrapped in chars[ ] which stands for it is a collection
     *
     * @param stSrc
     * @param fieldSep
     * @return
     */
    public static List<String> parseTo_List(final String strSrc, String fieldSep) {
        if (strSrc == null) {
            return null;
        }
        List<String> list = new ArrayList<String>();

        // the source string is wrap in [] which means it is a collection
        if ((fieldSep == null || "".equals(fieldSep)) || !(strSrc.startsWith("[") && strSrc.endsWith("]"))) {
            list.add(strSrc);
            return list;
        }
        String strTemp = strSrc.substring(1, strSrc.length() - 1); // remove the [ ]
        for (String str : strTemp.split(fieldSep, -1)) {
            list.add(str);
        }
        return list;
    }

    public static Character parseTo_Character(String s) {
        if (s == null) {
            return null;
        }
        return s.charAt(0);
    }

    public static char parseTo_char(String s) {
        return parseTo_Character(s);
    }

    public static Byte parseTo_Byte(String s) {
        if (s == null) {
            return null;
        }
        return Byte.decode(s).byteValue();
    }

    public static Byte parseTo_Byte(String s, boolean isDecode) {
        if (s == null) {
            return null;
        }
        if (isDecode) {
            return Byte.decode(s).byteValue();
        } else {
            return Byte.parseByte(s);
        }
    }

    public static byte parseTo_byte(String s) {
        return parseTo_Byte(s);
    }

    public static byte parseTo_byte(String s, boolean isDecode) {
        return parseTo_Byte(s, isDecode);
    }

    public static Double parseTo_Double(String s) {
        if (s == null) {
            return null;
        }
        return Double.parseDouble(s);
    }

    public static double parseTo_double(String s) {
        return parseTo_Double(s);
    }

    public static float parseTo_float(String s) {
        return Float.parseFloat(s);
    }

    public static Float parseTo_Float(String s) {
        if (s == null) {
            return null;
        }
        return parseTo_float(s);
    }

    public static int parseTo_int(String s) {
        return Integer.parseInt(s);
    }

    public static int parseTo_int(String s, boolean isDecode) {
        if (isDecode) {
            return Integer.decode(s).intValue();
        } else {
            return Integer.parseInt(s);
        }
    }

    public static Integer parseTo_Integer(String s) {
        if (s == null) {
            return null;
        }
        return parseTo_int(s);
    }

    public static Integer parseTo_Integer(String s, boolean isDecode) {
        if (s == null) {
            return null;
        }
        return parseTo_int(s, isDecode);
    }

    public static short parseTo_short(String s) {
        return Short.parseShort(s);
    }

    public static short parseTo_short(String s, boolean isDecode) {
        if (isDecode) {
            return Short.decode(s).shortValue();
        } else {
            return Short.parseShort(s);
        }
    }

    public static Short parseTo_Short(String s) {
        if (s == null) {
            return null;
        }
        return parseTo_short(s);
    }

    public static Short parseTo_Short(String s, boolean isDecode) {
        if (s == null) {
            return null;
        }
        return parseTo_short(s, isDecode);
    }

    public static long parseTo_long(String s) {
        return Long.parseLong(s);
    }

    public static long parseTo_long(String s, boolean isDecode) {
        if (isDecode) {
            return Long.decode(s).longValue();
        } else {
            return Long.parseLong(s);
        }
    }

    public static Long parseTo_Long(String s) {
        if (s == null) {
            return null;
        }
        return parseTo_long(s);
    }

    public static Long parseTo_Long(String s, boolean isDecode) {
        if (s == null) {
            return null;
        }
        return parseTo_long(s, isDecode);
    }

    public static Boolean parseTo_Boolean(String s) {
        if (s == null) {
            return null;
        }
        if (s.equals("1")) { //$NON-NLS-1$
            return Boolean.parseBoolean("true"); //$NON-NLS-1$
        }
        return Boolean.parseBoolean(s);
    }

    public static boolean parseTo_boolean(String s) {
        return parseTo_Boolean(s);
    }

    public static String parseTo_String(String s) {
        return s;
    }

    public static String parseTo_String(final List<String> s, String fieldSep) {
        if (s == null) {
            return null;
        }
        StringBuffer result = new StringBuffer();
        result.append("[");
        for (int i = 0; i < s.size(); i++) {
            if (i != 0) {
                result.append(fieldSep);
            }
            result.append(s.get(i));
        }
        result.append("]");

        return result.toString();
    }

    public static BigDecimal parseTo_BigDecimal(String s) {
        if (s == null) {
            return null;
        }
        try {
            return new BigDecimal(s);

        } catch (NumberFormatException nfe) {

            if (nfe.getMessage() == null) {

                throw new NumberFormatException("Incorrect input \"" + s + "\" for BigDecimal.");

            } else {

                throw nfe;
            }
        }
    }

  

}
