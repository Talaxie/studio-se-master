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
package org.talend.hadoop.distribution.constants.databricks;

import org.talend.hadoop.distribution.i18n.Messages;
public enum EDatabricksSubmitMode {

	CREATE_RUN_JOB(Messages.getString("EDatabricksSubmitMode.CREATE_RUN_JOB"), "\"CREATE_RUN_JOB\""),
    RUN_SUBMIT(Messages.getString("EDatabricksSubmitMode.RUN_SUBMIT"), "\"RUN_SUBMIT\"");

    private String runModeLabel;

    private String runModeValue;

    EDatabricksSubmitMode(String runModeLabel, String runModeValue) {
        this.runModeLabel = runModeLabel;
        this.runModeValue = runModeValue;
    }

    public String getRunModeLabel() {
        return runModeLabel;
    }

    public String getRunModeValue() {
        return runModeValue;
    }
}
