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

import org.talend.commons.ui.runtime.custom.ICommonUIHandler;
import org.talend.commons.ui.runtime.custom.InputDialogBusinessHandler;
import org.talend.commons.utils.OsgiServices;
import org.talend.designer.core.ui.dialog.mergeorder.ConnectionTableAndSchemaNameDialogBusinessHandler;


public interface IDesignerCoreUIHandler extends ICommonUIHandler {

    ConnectionTableAndSchemaNameDialogBusinessHandler openConnectionTableAndSchemaNameDialog(
            ConnectionTableAndSchemaNameDialogBusinessHandler handler);

    InputDialogBusinessHandler askForConnectionNameUI(InputDialogBusinessHandler handler);

    static IDesignerCoreUIHandler get() {
        return OsgiServices.get(IDesignerCoreUIHandler.class);
    }

}
