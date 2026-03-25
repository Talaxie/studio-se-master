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

import java.util.Map;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.custom.AbstractCustomUI;
import org.talend.commons.ui.runtime.custom.DefaultUIData;
import org.talend.commons.ui.runtime.custom.IUIEvent;

public class ConnectionTableAndSchemaNameDialogCustomUI
        extends AbstractCustomUI<ConnectionTableAndSchemaNameDialogBusinessHandler> {

    public ConnectionTableAndSchemaNameDialogCustomUI(ConnectionTableAndSchemaNameDialogBusinessHandler businessHandler) {
        super(businessHandler);
    }

    @Override
    protected IUIEvent createOpenEvent() {
        IUIEvent openEvent = super.createOpenEvent();
        Map<String, Object> params = openEvent.getParams();
        ConnectionTableAndSchemaNameDialogBusinessHandler bh = getBusinessHandler();
        params.put(BuiltinParams.title.name(), bh.getDialogTitle());
        params.put(BuiltinParams.message.name(), bh.getDialogMessage());
        params.put("schemaInitialValue", bh.getSchemaInitialValue());
        return openEvent;
    }

    @Override
    protected ConnectionTableAndSchemaNameDialogBusinessHandler collectDialogData() {
        DefaultUIData tableNameEvent = createUIDataEvent("tableName");
        DefaultUIData schemaNameEvent = createUIDataEvent("schemaName");
        ConnectionTableAndSchemaNameDialogBusinessHandler businessHandler = getBusinessHandler();
        try {
            Object tableName = requestUIData(tableNameEvent).get();
            Object schemaName = requestUIData(schemaNameEvent).get();
            businessHandler.setOpenResult(getOpenResult());
            businessHandler.setTableName((String) tableName);
            businessHandler.setSchemaName((String) schemaName);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        return businessHandler;
    }

}
