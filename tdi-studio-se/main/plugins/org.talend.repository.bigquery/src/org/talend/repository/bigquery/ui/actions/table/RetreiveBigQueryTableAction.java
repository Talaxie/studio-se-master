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
package org.talend.repository.bigquery.ui.actions.table;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.commons.ui.runtime.image.ECoreImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.model.metadata.builder.connection.AbstractMetadataObject;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.metadata.builder.connection.impl.MetadataTableImpl;
import org.talend.core.model.properties.BigQueryConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.model.repositoryObject.MetadataTableRepositoryObject;
import org.talend.core.repository.ui.actions.metadata.AbstractCreateAction;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.repository.ProjectManager;
import org.talend.repository.bigquery.i18n.Messages;
import org.talend.repository.bigquery.ui.wizards.bigquerytable.BigQueryTableWizard;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.views.IRepositoryView;

public class RetreiveBigQueryTableAction extends AbstractCreateAction {

    private static final String CREATE_LABEL = Messages.getString("RetreiveBigQueryTableAction.action.createTitle"); //$NON-NLS-1$

    private static final String EDIT_TABLE = Messages.getString("RetreiveBigQueryTableAction.action.editTitle"); //$NON-NLS-1$

    public RetreiveBigQueryTableAction() {
        this.setImageDescriptor(ImageProvider.getImageDesc(ECoreImage.METADATA_TABLE_ICON));
    }

    @Override
    protected void init(RepositoryNode repNode) {
        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        if (factory.isUserReadOnlyOnCurrentProject() || !ProjectManager.getInstance().isInCurrentMainProject(repNode)) {
            setEnabled(false);
        } else {
            if (ENodeType.REPOSITORY_ELEMENT.equals(repNode.getType())) {
                IRepositoryViewObject object = repNode.getObject();
                if (object.getRepositoryStatus() == ERepositoryStatus.DELETED) {
                    setEnabled(false);
                    return;
                }

                if ((factory.getStatus(repNode.getObject()) == ERepositoryStatus.DELETED)
                        || (factory.getStatus(repNode.getObject()) == ERepositoryStatus.LOCK_BY_OTHER)) {
                    setEnabled(false);
                    return;
                }

                ERepositoryObjectType nodeType = (ERepositoryObjectType) repNode.getProperties(EProperties.CONTENT_TYPE);
                ERepositoryObjectType parentNodeType = (ERepositoryObjectType) repNode.getParent().getProperties(
                        EProperties.CONTENT_TYPE);
                if ((ERepositoryObjectType.METADATA_CON_TABLE.equals(nodeType) || ERepositoryObjectType.METADATA_CON_COLUMN
                        .equals(nodeType)) && ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS.equals(parentNodeType)) {
                    if (object instanceof MetadataTableRepositoryObject) {
                        MetadataTableRepositoryObject tableObject = (MetadataTableRepositoryObject) object;
                        if (tableObject.getAbstractMetadataObject() instanceof MetadataTable) {//BigQueryTable
                            setText(EDIT_TABLE);
                            collectSiblingNames(repNode);
                            setEnabled(true);
                        }
                    }

                } else if (ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS.equals(nodeType)) {
                    setText(CREATE_LABEL);
                    collectChildNames(repNode);
                    setEnabled(true);
                    this.repositoryNode = repNode;
                    return;
                }

            }
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.ui.actions.AContextualAction#doRun()
     */
    @Override
    protected void doRun() {
        if (repositoryNode == null) {
            repositoryNode = getCurrentRepositoryNode();
        }

        if (isToolbar()) {
            if (repositoryNode != null && repositoryNode.getContentType() != ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS) {
                repositoryNode = null;
            }
            if (repositoryNode == null) {
                repositoryNode = getRepositoryNodeForDefault(ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS);
            }
        }

        RepositoryNode metadataNode = repositoryNode.getParent();
        if (metadataNode != null) {
            IRepositoryView viewPart = getViewPart();
            if (viewPart != null) {
                viewPart.setFocus();
                viewPart.expand(metadataNode, true);
                viewPart.expand(repositoryNode, true);
            }
        }

        BigQueryConnectionItem item = null;
        MetadataTable bigqueryTable = null;
        if (repositoryNode.getType() == ENodeType.REPOSITORY_ELEMENT) {
            ERepositoryObjectType nodeType = (ERepositoryObjectType) repositoryNode.getProperties(EProperties.CONTENT_TYPE);
            if (nodeType == ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS) {
                item = (BigQueryConnectionItem) repositoryNode.getObject().getProperty().getItem();
                ConnectionContextHelper.checkContextMode(item);
            } else {
                RepositoryNode tableNode = repositoryNode;
                if (nodeType == ERepositoryObjectType.METADATA_CON_COLUMN) {
                    tableNode = repositoryNode.getParent().getParent();
                }

                if (tableNode.getObject() instanceof MetadataTableRepositoryObject) {
                    MetadataTableRepositoryObject tableObject = (MetadataTableRepositoryObject) tableNode.getObject();
                    AbstractMetadataObject viewObject = tableObject.getAbstractMetadataObject();
                    if (viewObject instanceof MetadataTable) {
                        bigqueryTable = (MetadataTable) viewObject;
                    }
                }
            }
        }
        boolean isWizardReadonly = false;
        boolean repositoryObjectEditable = ProxyRepositoryFactory.getInstance().isEditableAndLockIfPossible(repositoryNode.getObject());
        if (!repositoryObjectEditable) {
            boolean flag = MessageDialog.openConfirm(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getShell(), Messages.getString("RetreiveBigQueryTableAction.action.Warning"),
                    Messages.getString("RetreiveBigQueryTableAction.action.NotLockMessage"));
            if (flag) {
                isWizardReadonly = true;
            } else {
                return;
            }
        }

        BigQueryTableWizard bigqueryWizard = new BigQueryTableWizard(PlatformUI.getWorkbench(), repositoryNode.getObject(), bigqueryTable,
                getExistingNames(), isWizardReadonly);

        // Open the Wizard
        WizardDialog wizardDialog = new WizardDialog(Display.getCurrent().getActiveShell(), bigqueryWizard);
        // wizardDialog.setPageSize(800, 400);
        wizardDialog.create();
        wizardDialog.open();
        refresh(repositoryNode);

    }

    @Override
    public Class<?> getClassForDoubleClick() {
        return MetadataTableImpl.class;//BigQueryTableImpl
    }
}
