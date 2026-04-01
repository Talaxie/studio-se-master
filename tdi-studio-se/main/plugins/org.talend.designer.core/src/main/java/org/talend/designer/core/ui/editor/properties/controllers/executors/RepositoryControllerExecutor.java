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
package org.talend.designer.core.ui.editor.properties.controllers.executors;

import org.eclipse.gef.commands.Command;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.components.EmfComponent;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IRepositoryControllerUI;
import org.talend.designer.core.ui.editor.properties.controllers.ui.IWidgetContext;
import org.talend.repository.UpdateRepositoryUtils;

/**
 * DOC cmeng class global comment. Detailled comment
 */
public abstract class RepositoryControllerExecutor extends BusinessControllerExecutor {

    public static final String REPOSITORY_CHOICE = IRepositoryControllerUI.REPOSITORY_CHOICE;

    public abstract String getRepositoryTypeParamName();

    public abstract String getRepositoryChoiceParamName();

    public abstract Command createButtonCommand(IWidgetContext button);

    public abstract Command createComboCommand(IWidgetContext combo);

    @Override
    protected IRepositoryControllerUI getUi() {
        return (IRepositoryControllerUI) super.getUi();
    }

    /**
     *
     * DOC wzhang Comment method "getConnection".
     *
     * @return
     */
    public Connection getConnection() {
        if (this.getElem() == null) {
            return null;
        }
        if (getElem() instanceof Node) {
            IElementParameter elementParameter = ((Node) getElem()).getElementParameter(EParameterName.PROPERTY_TYPE.getName());
            if (elementParameter != null && !EmfComponent.BUILTIN.equals(elementParameter.getValue())) {
                String propertyValue = (String) (((Node) getElem())
                        .getPropertyValue(EParameterName.REPOSITORY_PROPERTY_TYPE.getName()));
                IRepositoryViewObject lastVersion = UpdateRepositoryUtils.getRepositoryObjectById(propertyValue);
                if (lastVersion != null) {
                    final Item item = lastVersion.getProperty().getItem();
                    if (item != null && item instanceof ConnectionItem) {
                        Connection repositoryConn = ((ConnectionItem) item).getConnection();
                        return repositoryConn;
                    }
                }
            }
        }
        return null;

    }

}
