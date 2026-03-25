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


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface IRepositoryControllerUI extends IBusinessControllerUI {

    public static final String REPOSITORY_CHOICE = "REPOSITORY_CHOICE"; //$NON-NLS-1$

    @Override
    default IWidgetContext getDefaultControlContext() {
        return getButtonContext();
    }

    IWidgetContext getButtonContext();

    IWidgetContext getComboContext();

}
