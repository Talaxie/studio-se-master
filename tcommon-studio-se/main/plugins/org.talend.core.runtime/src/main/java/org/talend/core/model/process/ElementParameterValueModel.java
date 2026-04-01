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
package org.talend.core.model.process;

import java.util.Objects;

import org.apache.commons.lang.StringUtils;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class ElementParameterValueModel {

    private String label;

    private String value;

    /**
     * Getter for lebel.
     * 
     * @return the lebel
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the lebel.
     * 
     * @param lebel the lebel to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter for value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return StringUtils.isNotBlank(this.label) ? this.label : this.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ElementParameterValueModel other = (ElementParameterValueModel) obj;
        return Objects.equals(label, other.label) && Objects.equals(value, other.value);
    }

}
