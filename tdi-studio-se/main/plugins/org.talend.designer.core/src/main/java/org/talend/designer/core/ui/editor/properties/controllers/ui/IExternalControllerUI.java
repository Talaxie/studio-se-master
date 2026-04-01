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
package org.talend.designer.core.ui.editor.properties.controllers.ui;

import org.talend.designer.core.ui.editor.properties.ExternalTypeDialogBusinessHandler;

public interface IExternalControllerUI extends IBusinessControllerUI {

    public static final String EXTERNAL = "EXTERNAL"; //$NON-NLS-1$

    @Override
    default String getControllerName() {
        return EXTERNAL;
    }

    ExternalTypeDialogBusinessHandler openExternalNodeDialog(ExternalTypeDialogBusinessHandler handler);

    IWidgetContext getButtonContext();

}
