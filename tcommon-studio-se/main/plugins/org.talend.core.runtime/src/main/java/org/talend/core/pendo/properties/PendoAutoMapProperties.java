// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.pendo.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoAutoMapProperties implements IPendoDataProperties {

    @JsonProperty("auto_mapping")
    private int autoMappings;

    /**
     * Getter for autoMappings.
     * 
     * @return the autoMappings
     */
    public int getAutoMappings() {
        return autoMappings;
    }


    /**
     * Sets the autoMappings.
     * 
     * @param autoMappings the autoMappings to set
     */
    public void setAutoMappings(int autoMappings) {
        this.autoMappings = autoMappings;
    }


}
