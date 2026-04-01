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
package org.talend.hadoop.distribution.constants.dataproc;

import org.talend.hadoop.distribution.i18n.Messages;

public enum EDataprocAuthMode {

	SERVICE_ACCOUNT(Messages.getString("EDataproc.SERVICE_ACCOUNT"), "SERVICE_ACCOUNT"),
	AUTH_TOKEN(Messages.getString("EDataproc.AUTH_TOKEN"), "AUTH_TOKEN");

    private String authModeLabel;

    private String authModeValue;

    EDataprocAuthMode(String authModeLabel, String authModeValue) {
        this.authModeLabel = authModeLabel;
        this.authModeValue = authModeValue;
    }

    public String getAuthModeLabel() {
        return authModeLabel;
    }

    public String getAuthModeValue() {
        return authModeValue;
    }
}
