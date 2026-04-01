// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.model.components;

/**
 * DOC hzhao  class global comment. Detailled comment
 */
public class MultipleGenricComponentManager extends MultipleComponentManager {

    public MultipleGenricComponentManager(boolean lookupMode) {
        super(lookupMode);
    }

    public MultipleGenricComponentManager(String inputName, String outputName, String connector) {
        super(inputName, outputName, connector);
    }

    public MultipleGenricComponentManager(String inputName, String outputName) {
        super(inputName, outputName);
    }

    @Override
    public String getParamSeperator() {
        return "#";
    }

}
