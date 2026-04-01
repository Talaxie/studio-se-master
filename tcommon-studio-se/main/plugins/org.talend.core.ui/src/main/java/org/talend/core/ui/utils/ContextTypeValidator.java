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

import org.apache.commons.lang3.StringUtils;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;

public class ContextTypeValidator {

    public static boolean isMatchType(ContextParameterType contextParam) {
        return isMatchType(contextParam.getType(), contextParam.getValue());
    }

    public static boolean isMatchType(String type, Object objValue) {
        String strValue = null;
        if (objValue == null) {
            return true;
        }
        if (objValue instanceof String) {
            strValue = (String) objValue;
        }
        if (StringUtils.isEmpty(strValue)) {
            return true;
        }
        boolean isValid = true;
        switch (type) {
        case "id_Integer": {
            try {
                ParserUtils.parseTo_int(strValue);
            } catch (NumberFormatException ex) {
                isValid = false;
            }
            break;
        }
        case "id_Double": {
            try {
                ParserUtils.parseTo_double(strValue);
            } catch (NumberFormatException ex) {
                isValid = false;
            }
            break;
        }
        case "id_Float": {
            try {
                ParserUtils.parseTo_float(strValue);
            } catch (NumberFormatException ex) {
                isValid = false;
            }
            break;
        }
        case "id_BigDecimal": {
            try {
                ParserUtils.parseTo_BigDecimal(strValue);
            } catch (NumberFormatException ex) {
                isValid = false;
            }
            break;
        }
        case "id_Long": {
            try {
                ParserUtils.parseTo_long(strValue);
            } catch (NumberFormatException ex) {
                isValid = false;
            }
            break;
        }

        case "id_Short": {
            try {
                ParserUtils.parseTo_short(strValue);
            } catch (NumberFormatException ex) {
                isValid = false;
            }
            break;
        }
        }
        return isValid;
    }
}
