/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.sdk.component.studio.metadata.action;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Image;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.gmf.util.DisplayUtils;
import org.talend.commons.ui.runtime.exception.ExceptionMessageDialog;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.ui.actions.metadata.AbstractCreateAction;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.views.IRepositoryView;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.i18n.Messages;
import org.talend.sdk.component.studio.metadata.migration.TaCoKitMigrationManager;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationItemModel;
import org.talend.sdk.component.studio.metadata.model.TaCoKitConfigurationModel;
import org.talend.sdk.component.studio.metadata.node.ITaCoKitRepositoryNode;
import org.talend.sdk.component.studio.ui.wizard.TaCoKitConfigurationRuntimeData;

/**
 * Base class for TaCoKit Metadata contextual actions.
 * Contextual action is action which may be launched from context menu (it appears, when user clicks right mouse
 * button).
 * Metadata is part of Studio Repository. Metadata stores Component configuration, in particular for Datastores and
 * Datasets.
 * Create Datastore/Dataset and edit Datastore/Dataset actions should be available for Tacokit component families.
 * Component family potentially may have several different types of Datasets. E.g. Azure family has blob, queue and
 * table Datasets.
 */
public abstract class TaCoKitMetadataContextualAction extends AbstractCreateAction {

    private static final int DEFAULT_WIZARD_WIDTH = 700;

    private static final int DEFAULT_WIZARD_HEIGHT = 400;

    protected ITaCoKitRepositoryNode repositoryNode;

    protected ConfigTypeNode configTypeNode;

    private boolean isReadonly;
    
    protected RepositoryNode selectedNode;

    /**
     * Creates {@link WizardDialog}, opens it and refreshes repository node if result is ok
     */
    @Override
    protected void doRun() {
        WizardDialog wizardDialog = createWizardDialog();
        if (wizardDialog  != null) {
            openWizardDialog(wizardDialog);
        }
    }

    protected abstract WizardDialog createWizardDialog();

    private void openWizardDialog(final WizardDialog wizardDialog) {
        if (Platform.getOS().equals(Platform.OS_LINUX)) {
            wizardDialog.setPageSize(getWizardWidth(), getWizardHeight() + 80);
        }
        wizardDialog.create();
        int result = wizardDialog.open();
        if (result == WizardDialog.OK) {
            IRepositoryView viewPart = getViewPart();
            if (viewPart != null) {
                viewPart.setFocus();
                refresh(repositoryNode);
            }
        }
    }

    protected int getWizardWidth() {
        return DEFAULT_WIZARD_WIDTH;
    }

    protected int getWizardHeight() {
        return DEFAULT_WIZARD_HEIGHT;
    }

    protected String getCreateLabel() {
        return Messages.getString("TaCoKitConfiguration.action.create.Label", configTypeNode.getDisplayName(), //$NON-NLS-1$
                configTypeNode.getConfigurationType());
    }

    protected String getEditLabel() {
        return Messages.getString("TaCoKitConfiguration.action.edit.Label", configTypeNode.getDisplayName(), //$NON-NLS-1$
                configTypeNode.getConfigurationType());
    }

    protected String getOpenLabel() {
        return Messages.getString("TaCoKitConfiguration.action.open.Label", configTypeNode.getDisplayName(), //$NON-NLS-1$
                configTypeNode.getConfigurationType());
    }

    protected String getNodeLabel() {
        return repositoryNode.getDisplayText();
    }

    @Override
    public Class getClassForDoubleClick() {
        return ConnectionItem.class;
    }

    /**
     * TODO implement it
     *
     * Returns image shown near contextual menu item name. It should be family icon
     *
     *
     *
     * @return metadata contextual action image
     */
    protected Image getNodeImage() {
        return null;
    }

    /**
     * Checks whether user has only read permission. If it is true, user can't create or edit repository node,
     *
     * so action should be disabled for him
     *
     *
     *
     * @return true, is user has ReadOnly rights
     */
    protected boolean isUserReadOnly() {
        return ProxyRepositoryFactory.getInstance().isUserReadOnlyOnCurrentProject();
    }

    /**
     * Checks whether repository node belongs to current project. If it doesn't, then action should be disabled
     *
     *
     *
     * @param node repository node
     *
     * @return true, it node belongs to current project
     */
    protected boolean belongsToCurrentProject(final RepositoryNode node) {
        return ProjectManager.getInstance().isInCurrentMainProject(node);
    }

    /**
     * Checks whether node is deleted. If node is deleted create action should be disabled
     *
     *
     *
     * @param node repository node
     *
     * @return true, if it is deleted
     */
    protected boolean isDeleted(final RepositoryNode node) {
        return node.getObject() != null && node.getObject().getProperty().getItem().getState().isDeleted();
    }

    public boolean isReadonly() {
        return this.isReadonly;
    }

    public void setRepositoryNode(final ITaCoKitRepositoryNode repositoryNode) {
        this.repositoryNode = repositoryNode;
    }

    public void setConfigTypeNode(final ConfigTypeNode configTypeNode) {
        this.configTypeNode = configTypeNode;
    }

    public void setReadonly(final boolean isReadonly) {
        this.isReadonly = isReadonly;
    }
    
    @Override
    public void init(final RepositoryNode node) {
        this.selectedNode = node;
        boolean isLeafNode = false;
        if (node instanceof ITaCoKitRepositoryNode) {
            isLeafNode = ((ITaCoKitRepositoryNode) node).isLeafNode();
        }     
        if (!isLeafNode && !isValidChildNode()) {
            setEnabled(false);
            return;
        }
        setRepositoryNode(getTacokitRepositoryNode(selectedNode));
        setConfigTypeNode(repositoryNode.getConfigTypeNode());
        setToolTipText(getEditLabel());
        Image nodeImage = getNodeImage();
        if (nodeImage != null) {
            this.setImageDescriptor(ImageDescriptor.createFromImage(nodeImage));
        }
        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        switch (node.getType()) {
        case SIMPLE_FOLDER:
        case SYSTEM_FOLDER:
            if (isUserReadOnly() || belongsToCurrentProject(node) || isDeleted(node)) {
                setEnabled(false);
                return;
            } else {
                this.setText(getCreateLabel());
                collectChildNames(node);
                setEnabled(true);
            }
            break;
        case REPOSITORY_ELEMENT:
            if (factory.isPotentiallyEditable(repositoryNode.getObject()) && isLastVersion(repositoryNode)) {
                this.setText(getEditLabel());
                collectSiblingNames(node);
                setReadonly(false);
            } else {
                this.setText(getOpenLabel());
                setReadonly(true);
            }
            if (isSupportNodeType(repositoryNode)) {
                setEnabled(true);
            }     
            break;
        default:
            return;
        }
    }
    
    protected boolean isSupportNodeType (final IRepositoryNode node) {
        return true;
    }
    
    protected ITaCoKitRepositoryNode getTacokitRepositoryNode(final RepositoryNode node) {
        if (node instanceof ITaCoKitRepositoryNode) {
            return (ITaCoKitRepositoryNode) node;
        }
        RepositoryNode parentNode = node.getParent();
        while (parentNode != null) {
            if (parentNode instanceof ITaCoKitRepositoryNode) {
                return (ITaCoKitRepositoryNode) parentNode;
            }
            parentNode = parentNode.getParent();
        }
        return null;
    }
    
    protected boolean isValidChildNode() {
        return false;
    }
    
    protected void checkMigration(TaCoKitConfigurationRuntimeData runtimeData) {
        if (!runtimeData.isReadonly()) {
            try {
                TaCoKitConfigurationItemModel itemModel = new TaCoKitConfigurationItemModel(runtimeData.getConnectionItem());
                TaCoKitConfigurationModel configurationModel = new TaCoKitConfigurationModel(
                        runtimeData.getConnectionItem().getConnection());
                TaCoKitMigrationManager migrationManager = Lookups.taCoKitCache().getMigrationManager();
                if (configurationModel.needsMigration()) {
                    String label = ""; //$NON-NLS-1$
                    try {
                        label = itemModel.getDisplayLabel();
                    } catch (Exception e) {
                        // ignore
                    }
                    MessageDialog dialog = new MessageDialog(DisplayUtils.getDefaultShell(),
                            Messages.getString("migration.check.dialog.title"), null, //$NON-NLS-1$
                            Messages.getString("migration.check.dialog.ask", label), MessageDialog.WARNING, //$NON-NLS-1$
                            new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL }, 0);
                    int result = dialog.open();
                    if (result == 0) {
                        final Exception[] ex = new Exception[1];
                        ProgressMonitorDialog monitorDialog = new ProgressMonitorDialog(DisplayUtils.getDefaultShell());
                        monitorDialog.run(true, true, new IRunnableWithProgress() {

                            @Override
                            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                                try {
                                    migrationManager.migrate(configurationModel, monitor);
                                } catch (Exception e) {
                                    ex[0] = e;
                                }
                            }
                        });
                        if (ex[0] != null) {
                            ExceptionMessageDialog.openWarning(DisplayUtils.getDefaultShell(),
                                    Messages.getString("migration.check.dialog.title"), //$NON-NLS-1$
                                    Messages.getString("migration.check.dialog.failed"), ex[0]); //$NON-NLS-1$
                            throw ex[0];
                        }
                    }
                }
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }
    }
    
    protected TaCoKitConfigurationRuntimeData createEditRuntimeData() {
        TaCoKitConfigurationRuntimeData runtimeData = new TaCoKitConfigurationRuntimeData();
        runtimeData.setTaCoKitRepositoryNode(repositoryNode);
        runtimeData.setConfigTypeNode(repositoryNode.getConfigTypeNode());
        runtimeData.setConnectionItem((ConnectionItem) repositoryNode.getObject().getProperty().getItem());
        runtimeData.setCreation(true);
        runtimeData.setReadonly(isReadonly());
        return runtimeData;
    }
}
