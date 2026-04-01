// ============================================================================
//
// Copyright (C) 2006-2020 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.constants.kubernetes;

import org.talend.hadoop.distribution.i18n.Messages;
public enum EKubernetesSubmitMode {

	LIVY(Messages.getString("EKubernetesSubmitMode.LIVY"), "LIVY"),
    SPARK_SUBMIT(Messages.getString("EKubernetesSubmitMode.SPARK_SUBMIT"), "SPARK_SUBMIT");

    private String label;

    private String value;

    EKubernetesSubmitMode(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
