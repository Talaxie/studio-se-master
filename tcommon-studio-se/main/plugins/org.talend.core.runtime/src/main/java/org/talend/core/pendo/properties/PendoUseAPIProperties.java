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
public class PendoUseAPIProperties implements IPendoDataProperties {

    @JsonProperty("component")
    private String component;

    public PendoUseAPIProperties(String component) {
        super();
        this.component = component;
    }

    /**
     * Getter for component.
     * 
     * @return the component
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the component.
     * 
     * @param component the component to set
     */
    public void setComponent(String component) {
        this.component = component;
    }

}
