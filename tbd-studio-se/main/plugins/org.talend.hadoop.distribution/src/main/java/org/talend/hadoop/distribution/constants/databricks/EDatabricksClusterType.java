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
package org.talend.hadoop.distribution.constants.databricks;

import org.talend.hadoop.distribution.i18n.Messages;
public enum EDatabricksClusterType  {

    TRANSIENT(Messages.getString("EDatabricksClusterType.TRANSIENT"), "\"TRANSIENT\""),
    INTERACTIVE(Messages.getString("EDatabricksClusterType.INTERACTIVE"), "\"INTERACTIVE\"");

    private String clusterLabelName;

    private String clusterValue;

    EDatabricksClusterType (String clusterLabelName, String clusterValue) {
        this.clusterLabelName = clusterLabelName;
        this.clusterValue = clusterValue;
    }

    public String getLabelName() {
        return clusterLabelName;
    }

    public String getValue() {
        return clusterValue;
    }
}
