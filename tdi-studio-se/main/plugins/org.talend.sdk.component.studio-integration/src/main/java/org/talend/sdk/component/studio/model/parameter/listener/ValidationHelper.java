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
package org.talend.sdk.component.studio.model.parameter.listener;

import java.util.Collections;

import org.talend.sdk.component.studio.model.parameter.TaCoKitElementParameter;

class ValidationHelper {

    /**
     * Check if the source parameter is hidden. If it is hidden we need to disable validation for it.
     * 
     * @param source element parameter to check
     * @return
     */
    static boolean hideValidation(Object source) {
        if (source instanceof TaCoKitElementParameter) {
            TaCoKitElementParameter parameter = (TaCoKitElementParameter) source;
            return !parameter.isShow(Collections.emptyList());
        }
        return false;
    }

}
