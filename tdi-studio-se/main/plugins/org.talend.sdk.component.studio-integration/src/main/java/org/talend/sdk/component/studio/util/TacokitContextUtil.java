// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.sdk.component.studio.util;

import java.util.regex.Pattern;

import org.talend.core.model.process.EParameterFieldType;

public class TacokitContextUtil {

    private final static Pattern CONTEXT_PATTERN = Pattern.compile("^(context\\.).*");

    public static boolean isSupportContextFieldType(EParameterFieldType fieldType) {
        if (fieldType == null || fieldType == EParameterFieldType.TACOKIT_BUTTON || fieldType == EParameterFieldType.MAPPING_TYPE
                || fieldType == EParameterFieldType.CLOSED_LIST
                || fieldType == EParameterFieldType.CHECK | fieldType == EParameterFieldType.TABLE) {
            return false;
        }

        return true;
    }

    /**
     * Checks whether {@code value} is raw data or contains {@code context} variable. It is assumed that any not String
     * value is raw data. The {@code value} contains {@code context} if some of words in it starts with "context."
     *
     * @param value value to check
     * @return true, if value contains {@code context} variables
     */
    public static boolean isContextualValue(final Object value) {
        if (!String.class.isInstance(value)) {
            return false;
        }
        String strValue = (String) value;
        String[] tokens = strValue.split(" ");
        for (String token : tokens) {
            if (CONTEXT_PATTERN.matcher(token).matches()) {
                return true;
            }
        }
        return false;
    }

}
