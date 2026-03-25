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

import org.talend.commons.ui.utils.TypedTextCommandExecutor;
import org.talend.core.model.process.IElement;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.sqlbuilder.util.ConnectionParameters;
import org.talend.designer.core.i18n.Messages;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public interface IBusinessControllerUI extends IControllerUI {

    public static final String SQLEDITOR = "SQLEDITOR"; //$NON-NLS-1$

    public static final String VARIABLE_TOOLTIP = Messages.getString("AbstractElementPropertySectionController.variableTooltip"); //$NON-NLS-1$

    public static final String NAME = "NAME"; //$NON-NLS-1$

    public static final String COLUMN = "COLUMN"; //$NON-NLS-1$

    // PTODO qzhang use PARAMETER_NAME it for bug 853.
    public static final String PARAMETER_NAME = TypedTextCommandExecutor.PARAMETER_NAME;

    IWidgetContext getDefaultControlContext();

    String getControllerName();

    void openSqlBuilder(ConnectionParameters connParameters);

    void openSqlBuilderBuildIn(final ConnectionParameters connParameters, final String propertyName);

    String openSqlBuilder(IElement elem, ConnectionParameters connParameters, String key, String repoName, String repositoryId,
            String processName, String query);

    ConnectionItem getConnectionItem();

}
