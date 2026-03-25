/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.talend.studio.components.tck.jdbc.action;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.commons.ui.gmf.util.DisplayUtils;
import org.talend.commons.ui.runtime.image.ECoreImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.model.context.ContextUtils;
import org.talend.core.model.metadata.IMetadataConnection;
import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.repository.RepositoryManager;
import org.talend.core.repository.model.ProjectRepositoryNode;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.model.repositoryObject.MetadataTableRepositoryObject;
import org.talend.core.repository.model.repositoryObject.QueryRepositoryObject;
import org.talend.core.sqlbuilder.util.ConnectionParameters;
import org.talend.core.sqlbuilder.util.TextUtil;
import org.talend.cwm.helper.SubItemHelper;
import org.talend.metadata.managment.ui.wizard.metadata.ContextSetsSelectionDialog;
import org.talend.metadata.managment.utils.MetadataConnectionUtils;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.views.IRepositoryView;
import org.talend.sdk.component.studio.metadata.action.TaCoKitMetadataContextualAction;
import org.talend.sdk.component.studio.metadata.node.ITaCoKitRepositoryNode;
import org.talend.sdk.component.studio.ui.wizard.TaCoKitConfigurationRuntimeData;
import org.talend.sqlbuilder.repository.utility.EMFRepositoryNodeManager;
import org.talend.sqlbuilder.ui.SQLBuilderDialog;
import org.talend.sqlbuilder.util.UIUtils;
import org.talend.studio.components.tck.jdbc.Messages;

/**
 * Metadata contextual action which creates WizardDialog used to edit Component configuration.
 * Repository node may have only 1 edit action. This action is registered as extension point.
 * Thus, it supports double click out of the box
 */
public class TaCoKitEidtQueriesAction extends TaCoKitMetadataContextualAction {

    protected static final int WIZARD_WIDTH = 900;

    protected static final int WIZARD_HEIGHT = 495;
    
    public TaCoKitEidtQueriesAction() {
        super();
        setImageDescriptor(ImageProvider.getImageDesc(ECoreImage.METADATA_QUERY_ICON));
    }

    @Override
    protected WizardDialog createWizardDialog() {
        try {
            openQueryDialog(PlatformUI.getWorkbench());
        } catch (Exception e) {
            ExceptionHandler.process(e);
        } 
        return null;
    }
    
    @Override
    protected boolean isSupportNodeType (final IRepositoryNode node) {
        if (node.getObjectType().equals(ERepositoryObjectType.METADATA_TACOKIT_JDBC)) {
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean isValidChildNode () {
        RepositoryNode parentNode = selectedNode.getParent();
        while (parentNode != null) {
            if(parentNode instanceof ITaCoKitRepositoryNode  && parentNode.getObjectType().equals(ERepositoryObjectType.METADATA_TACOKIT_JDBC)) {
                return true;
            }
            parentNode = parentNode.getParent();
        }
        return false;
    }

    public void openQueryDialog(final IWorkbench wb) throws Exception {
        TaCoKitConfigurationRuntimeData runtimeData = createEditRuntimeData();
        checkMigration(runtimeData);
        
        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        IRepositoryViewObject nodeObject = repositoryNode.getObject();
        boolean locked = false;
        if (!factory.getRepositoryContext().isEditableAsReadOnly()) {
            if (nodeObject.getRepositoryStatus() == ERepositoryStatus.LOCK_BY_OTHER) {
                locked = true;
            }
        }
        // Avoid to delete node which is locked.
        if (locked || RepositoryManager.isOpenedItemInEditor(nodeObject)) {

            final String title = "Impossible to edit queries";
            String nodeName = nodeObject.getRepositoryObjectType().getLabel();
            final String message = "item is already locked by another user.";
            Display.getDefault().syncExec(new Runnable() {

                @Override
                public void run() {
                    MessageDialog dialog = new MessageDialog(DisplayUtils.getDefaultShell(false), title, null, message,
                            MessageDialog.ERROR,
                            new String[] { IDialogConstants.OK_LABEL }, 0);
                    dialog.open();
                }
            });
            return;
        }
        
        ConnectionItem dbConnectionItem = null;
        boolean readOnly = false;
        
        ConnectionParameters connParameters = new ConnectionParameters();
        if (selectedNode.getObjectType() == ERepositoryObjectType.METADATA_CON_QUERY) {
            QueryRepositoryObject queryRepositoryObject = (QueryRepositoryObject) selectedNode.getObject();
            readOnly = SubItemHelper.isDeleted(queryRepositoryObject.getAbstractMetadataObject());
            dbConnectionItem = (DatabaseConnectionItem) queryRepositoryObject.getProperty().getItem();
            connParameters.setRepositoryName(dbConnectionItem.getProperty().getLabel());
            connParameters.setRepositoryId(dbConnectionItem.getProperty().getId());
            connParameters.setQueryObject(queryRepositoryObject.getQuery());
            connParameters.setQuery(queryRepositoryObject.getQuery().getValue());
            connParameters.setFirstOpenSqlBuilder(true); // first open Sql Builder,set true
            connParameters.setTacokitJDBC(true);
        } else if (selectedNode.getObjectType() == ERepositoryObjectType.METADATA_CON_TABLE) {
            dbConnectionItem = (DatabaseConnectionItem) selectedNode.getObject().getProperty().getItem();
            connParameters.setRepositoryName(dbConnectionItem.getProperty().getLabel());
            connParameters.setRepositoryId(dbConnectionItem.getProperty().getId());
            connParameters.setMetadataTable((MetadataTableRepositoryObject) selectedNode.getObject());
            connParameters.setQuery(""); //$NON-NLS-1$
            connParameters.setTacokitJDBC(true);
        } else {
            dbConnectionItem = (ConnectionItem) repositoryNode.getObject().getProperty().getItem();
            connParameters.setRepositoryName(repositoryNode.getObject().getLabel());
            connParameters.setRepositoryId(repositoryNode.getObject().getId());
            connParameters.setQuery(""); //$NON-NLS-1$
            connParameters.setTacokitJDBC(true);
        }   

        IRepositoryView viewPart = getViewPart();
        Display display = null;
        if (viewPart != null) {
            display = viewPart.getViewer().getControl().getDisplay();
        } else {
            display = Display.getCurrent();
            if (display == null) {
                display = Display.getDefault();
            }
        }
        Shell parentShell = DisplayUtils.getDefaultShell(false);
        TextUtil.setDialogTitle(TextUtil.SQL_BUILDER_TITLE_REP);

        String selectedContext = null;
        DatabaseConnection connection = ConvertionHelper.fillJDBCParams4TacokitDatabaseConnection(runtimeData.getConnectionItem().getConnection());
        Connection copyConnection = MetadataConnectionUtils.prepareConection(connection);
        if (copyConnection == null) {
            return;
        } else {
            selectedContext = copyConnection.getContextName();
        }
        if (connection.isContextMode()) {
            if (StringUtils.isBlank(selectedContext)) {
                ContextItem contextItem = ContextUtils.getContextItemById2(connection.getContextId());
                if (contextItem != null && connection.isContextMode()) {

                    ContextSetsSelectionDialog setsDialog = new ContextSetsSelectionDialog(null, contextItem, false);
                    setsDialog.open();
                    selectedContext = setsDialog.getSelectedContext();
                }
            }
        }
        SQLBuilderDialog dial = new SQLBuilderDialog(parentShell, repositoryNode, selectedContext);
        EMFRepositoryNodeManager.getInstance().setCopyConnection((DatabaseConnection) copyConnection);
        dial.setReadOnly(readOnly);

        if (copyConnection instanceof DatabaseConnection) {
            IMetadataConnection imetadataConnection = ConvertionHelper.convert(copyConnection);
            connParameters.setSchema(imetadataConnection.getSchema() == null ? "" : imetadataConnection.getSchema());
            UIUtils.checkConnection(parentShell, imetadataConnection);
        }

        connParameters.setNodeReadOnly(readOnly);
        connParameters.setFromRepository(true);
        dial.setConnParameters(connParameters);
        dial.open();
        IRepositoryView view = getViewPart();
        if (view != null) {
            view.refreshView();
        }
        
        refresh(repositoryNode);
    } 
    
    protected void handleWizard(ITaCoKitRepositoryNode node, WizardDialog wizardDialog) {
        wizardDialog.setPageSize(WIZARD_WIDTH, WIZARD_HEIGHT);
        wizardDialog.create();
        int result = wizardDialog.open();
        IRepositoryView viewPart = getViewPart();
        if (viewPart != null) {
            if (WizardDialog.CANCEL == result) {
                RepositoryNode rootNode = ProjectRepositoryNode.getInstance().getRootRepositoryNode(node, false);
                if (rootNode != null) {
                    rootNode.getChildren().clear();
                    rootNode.setInitialized(false);
                    viewPart.refresh(rootNode);
                }
            }
            viewPart.expand(node, true);
        }
        ERepositoryObjectType nodeType = (ERepositoryObjectType) node.getProperties(EProperties.CONTENT_TYPE);
        if (nodeType.isSubItem()) { // edit table
            RepositoryNode parent = node.getParent();
            if (parent.getObject() == null) { // db
                parent = parent.getParent();
            }
        }
    }

    protected String getEditLabel() {
        return Messages.getString("TaCoKitEidtQueriesAction.label");
    }
}
