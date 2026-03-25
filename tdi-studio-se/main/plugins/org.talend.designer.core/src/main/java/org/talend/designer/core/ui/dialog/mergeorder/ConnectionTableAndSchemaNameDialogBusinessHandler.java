// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.dialog.mergeorder;

import org.talend.commons.ui.runtime.custom.AbsBusinessHandler;


public class ConnectionTableAndSchemaNameDialogBusinessHandler extends AbsBusinessHandler {

    private static final String UI_KEY = "ConnectionTableAndSchemaNameDialog";

    public static final String DEFAULT_TABLE_NAME = "\"\""; //$NON-NLS-1$

    public static final String DEFAULT_SCHEMA_NAME = "\"\""; //$NON-NLS-1$

    private String dialogTitle;

    private String dialogMessage;

    private String schemaInitialValue;

    private String tableName;

    private String schemaName;

    public ConnectionTableAndSchemaNameDialogBusinessHandler(String dialogTitle, String dialogMessage,
            String schemaInitialValue) {
        super();
        this.dialogTitle = dialogTitle;
        this.dialogMessage = dialogMessage;
        this.schemaInitialValue = schemaInitialValue;
    }

    public String getDialogTitle() {
        return dialogTitle;
    }

    public void setDialogTitle(String dialogTitle) {
        this.dialogTitle = dialogTitle;
    }

    public String getDialogMessage() {
        return dialogMessage;
    }

    public void setDialogMessage(String dialogMessage) {
        this.dialogMessage = dialogMessage;
    }

    public String getSchemaInitialValue() {
        return schemaInitialValue;
    }

    public void setSchemaInitialValue(String schemaInitialValue) {
        this.schemaInitialValue = schemaInitialValue;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getTableName() {
        return tableName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    @Override
    public String getUiKey() {
        return UI_KEY;
    }

}
