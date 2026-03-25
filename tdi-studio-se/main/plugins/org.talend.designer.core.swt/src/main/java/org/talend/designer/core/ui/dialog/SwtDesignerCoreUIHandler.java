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
package org.talend.designer.core.ui.dialog;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.talend.commons.ui.gmf.util.DisplayUtils;
import org.talend.commons.ui.runtime.custom.InputDialogBusinessHandler;
import org.talend.designer.core.ui.dialog.mergeorder.ConnectionTableAndSchemaNameDialog;
import org.talend.designer.core.ui.dialog.mergeorder.ConnectionTableAndSchemaNameDialogBusinessHandler;
import org.talend.designer.core.ui.editor.cmd.AbsCmdSwtUIHandler;

public class SwtDesignerCoreUIHandler extends AbsCmdSwtUIHandler implements IDesignerCoreUIHandler {

    public SwtDesignerCoreUIHandler() {
    }

    @Override
    public ConnectionTableAndSchemaNameDialogBusinessHandler openConnectionTableAndSchemaNameDialog(
            ConnectionTableAndSchemaNameDialogBusinessHandler handler) {
        ConnectionTableAndSchemaNameDialog id = new ConnectionTableAndSchemaNameDialog(DisplayUtils.getDefaultShell(),
                handler.getDialogTitle(), handler.getDialogMessage(), handler.getSchemaInitialValue());
        int open = id.open();
        handler.setOpenResult(open);
        return handler;
    }

    @Override
    public InputDialogBusinessHandler askForConnectionNameUI(InputDialogBusinessHandler handler) {
        InputDialog id = new InputDialog(DisplayUtils.getDefaultShell(), handler.getTitle(), handler.getMessage(),
                handler.getDefaultValue(), new IInputValidator() {

                    @Override
                    public String isValid(String newText) {
                        return handler.getValidator().isValid(newText);
                    }
                });
        id.open();
        int returnCode = id.getReturnCode();
        handler.setOpenResult(returnCode);
        if (returnCode == InputDialog.CANCEL) {
            handler.setOpenResult(null);
        } else {
            handler.setResult(id.getValue());
        }
        return handler;
    }

}
