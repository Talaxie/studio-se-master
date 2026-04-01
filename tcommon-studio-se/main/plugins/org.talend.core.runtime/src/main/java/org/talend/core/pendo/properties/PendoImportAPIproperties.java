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
public class PendoImportAPIproperties implements IPendoDataProperties {

    @JsonProperty("source")
    private String source;

    public PendoImportAPIproperties(String source) {
        super();
        this.source = SourceType.getSourceLabelByType(source);
    }

    /**
     * Getter for source.
     * 
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the source.
     * 
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    enum SourceType {

        LOCAL_FILE("file"),
        API_DESIGNER("API Designer"),
        REMOTE_URL("Remote URL");

        private String sourceLabel;

        SourceType(String sourceLabel) {
            this.sourceLabel = sourceLabel;
        }

        public String getSourceLabel() {
            return sourceLabel;
        }

        public static String getSourceLabelByType(String type) {
            String label = type;
            SourceType sourceType = SourceType.valueOf(type);
            if (sourceType != null) {
                label = sourceType.getSourceLabel();
            }
            return label;
        }

    }

}
