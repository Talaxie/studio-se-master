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

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.image.ECoreImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.model.metadata.IMetadataConnection;
import org.talend.core.model.metadata.builder.ConvertionHelper;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProjectRepositoryNode;
import org.talend.metadata.managment.repository.ManagerConnection;
import org.talend.metadata.managment.utils.MetadataConnectionUtils;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.views.IRepositoryView;
import org.talend.repository.ui.wizards.metadata.table.database.DatabaseTableWizard;
import org.talend.sdk.component.studio.metadata.action.TaCoKitMetadataContextualAction;
import org.talend.sdk.component.studio.metadata.node.ITaCoKitRepositoryNode;
import org.talend.sdk.component.studio.ui.wizard.TaCoKitConfigurationRuntimeData;
import org.talend.studio.components.tck.jdbc.Messages;

/**
 * Metadata contextual action which creates WizardDialog used to edit Component configuration.
 * Repository node may have only 1 edit action. This action is registered as extension point.
 * Thus, it supports double click out of the box
 */
public class TaCoKitRetriveSchemaAction extends TaCoKitMetadataContextualAction {

    protected static final int WIZARD_WIDTH = 900;

    protected static final int WIZARD_HEIGHT = 495;
    
    public TaCoKitRetriveSchemaAction() {
        super();
        this.setImageDescriptor(ImageProvider.getImageDesc(ECoreImage.METADATA_TABLE_ICON));
    }
    
    @Override
    protected boolean isSupportNodeType (final IRepositoryNode node) {
        if (node.getObjectType().equals(ERepositoryObjectType.METADATA_TACOKIT_JDBC)) {
            return true;
        }
        return false;
    }

    @Override
    protected WizardDialog createWizardDialog() {
        IWizard wizard = null;
        try {
            wizard = createWizard(PlatformUI.getWorkbench());
        } catch (Exception e) {
            ExceptionHandler.process(e);
        } 
        if (wizard != null ) {
            return new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
        }
       return null;
    }

    public DatabaseTableWizard createWizard(final IWorkbench wb) throws Exception {
        TaCoKitConfigurationRuntimeData runtimeData = createEditRuntimeData();
        checkMigration(runtimeData);

        final ManagerConnection managerConnection = new ManagerConnection();
        DatabaseConnection connection = ConvertionHelper
                .fillJDBCParams4TacokitDatabaseConnection(runtimeData.getConnectionItem().getConnection());
        Connection copyConnection = MetadataConnectionUtils.prepareConection(connection);
        if (copyConnection == null) {
            return null;
        }
        IMetadataConnection metadataConnection = ConvertionHelper.convert(copyConnection, false, copyConnection.getContextName());

        DatabaseTableWizard databaseTableWizard = new DatabaseTableWizard(PlatformUI.getWorkbench(), runtimeData.isCreation(),
                repositoryNode.getObject(), null, getExistingNames(), false, managerConnection, metadataConnection);
        return databaseTableWizard;
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
        return Messages.getString("TaCoKitRetriveSchemaAction.label");
    }
}
