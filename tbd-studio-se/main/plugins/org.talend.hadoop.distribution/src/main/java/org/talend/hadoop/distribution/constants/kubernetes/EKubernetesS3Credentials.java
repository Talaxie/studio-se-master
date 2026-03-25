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
public enum EKubernetesS3Credentials {

	ACCESSANDSECRET(Messages.getString("EKubernetesS3Credentials.ACCESSANDSECRET"), "ACCESSANDSECRET");

    private String label;

    private String value;

    EKubernetesS3Credentials(String label, String value) {
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
