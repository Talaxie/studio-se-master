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
package org.talend.repository.bigquery.ui.actions;

import org.apache.log4j.Logger;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.ui.runtime.image.ECoreImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.runtime.image.OverlayImageProvider;
import org.talend.core.model.properties.BigQueryConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.ui.actions.metadata.AbstractCreateAction;
import org.talend.repository.ProjectManager;
import org.talend.repository.RepositoryPlugin;
import org.talend.repository.bigquery.i18n.Messages;
import org.talend.repository.bigquery.ui.wizards.BigQueryConnectionWizard;
import org.talend.repository.metadata.ui.actions.metadata.CreateConnectionAction;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.views.IRepositoryView;

public class CreateBigQueryConnectionAction extends AbstractCreateAction {

    protected static Logger log = Logger.getLogger(CreateConnectionAction.class);

    protected static final String PID = RepositoryPlugin.PLUGIN_ID;

    private static final String EDIT_LABEL = Messages.getString("CreateBigQueryConnectionAction.action.editTitle"); //$NON-NLS-1$

    private static final String OPEN_LABEL = Messages.getString("CreateBigQueryConnectionAction.action.openTitle"); //$NON-NLS-1$

    private static final String CREATE_LABEL = Messages.getString("CreateBigQueryConnectionAction.action.createTitle"); //$NON-NLS-1$

    ImageDescriptor defaultImage = ImageProvider.getImageDesc(ECoreImage.METADATA_BIGQUERYCONNECTION_ICON);

    ImageDescriptor createImage = OverlayImageProvider.getImageWithNew(ImageProvider
            .getImage(ECoreImage.METADATA_BIGQUERYCONNECTION_ICON));

    public CreateBigQueryConnectionAction() {
        super();
        this.setText(CREATE_LABEL);
        this.setToolTipText(CREATE_LABEL);
        this.setImageDescriptor(defaultImage);
    }

    public CreateBigQueryConnectionAction(boolean isToolbar) {
        super();
        setToolbar(isToolbar);
        this.setText(CREATE_LABEL);
        this.setToolTipText(CREATE_LABEL);
        this.setImageDescriptor(defaultImage);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.action.Action#run()
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
            // Force focus to the repositoryView and open Metadata and
            // DbConnection nodes
            IRepositoryView viewPart = getViewPart();
            if (viewPart != null) {
                viewPart.setFocus();
                viewPart.expand(metadataNode, true);
                viewPart.expand(repositoryNode, true);
            }
        }

        boolean creation = false;
        // Define the repositoryObject DatabaseConnection and his pathToSave
        switch (repositoryNode.getType()) {
        case REPOSITORY_ELEMENT:
            creation = false;
            break;
        case SIMPLE_FOLDER:
        case SYSTEM_FOLDER:
            creation = true;
            break;
        }

        // Init the content of the Wizard
        // init(repositoryNode);
        BigQueryConnectionWizard bigqueryWizard;
        if (isToolbar()) {
            bigqueryWizard = new BigQueryConnectionWizard(PlatformUI.getWorkbench(), creation, repositoryNode, getExistingNames());
            bigqueryWizard.setToolBar(true);
        } else {
        	bigqueryWizard = new BigQueryConnectionWizard(PlatformUI.getWorkbench(), creation, repositoryNode, getExistingNames());
        }

        // Open the Wizard
        WizardDialog wizardDialog = new WizardDialog(Display.getCurrent().getActiveShell(), bigqueryWizard);
        wizardDialog.setPageSize(600, 480);
        wizardDialog.create();
        wizardDialog.open();
        refresh(repositoryNode);
        // if (isToolbar()) {
        // refresh(repositoryNode);
        // } else {
        // refresh(repositoryNode);
        // }

    }

    @Override
    protected void init(RepositoryNode node) {
        ERepositoryObjectType repType = (ERepositoryObjectType) node.getProperties(EProperties.CONTENT_TYPE);
        ENodeType nodeType = node.getType();
        if (ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS != null
                && !ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS.equals(repType) || nodeType == null) {
            setEnabled(false);
            return;
        }
        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        switch (nodeType) {
        case SIMPLE_FOLDER:
            if (node.getObject() != null && node.getObject().getProperty().getItem().getState().isDeleted()) {
                setEnabled(false);
                return;
            }
        case SYSTEM_FOLDER:
            if (factory.isUserReadOnlyOnCurrentProject() || !ProjectManager.getInstance().isInCurrentMainProject(node)) {
                setEnabled(false);
                return;
            }
            this.setText(CREATE_LABEL);
            this.setImageDescriptor(createImage);
            collectChildNames(node);
            break;
        case REPOSITORY_ELEMENT:
            if (factory.isPotentiallyEditable(node.getObject())) {
                this.setText(EDIT_LABEL);
                this.setImageDescriptor(defaultImage);
                collectSiblingNames(node);
            } else {
                this.setText(OPEN_LABEL);
                this.setImageDescriptor(defaultImage);
            }
            break;
        }
        setEnabled(true);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.ui.actions.AContextualView#getClassForDoubleClick()
     */
    @Override
    public Class<?> getClassForDoubleClick() {
        return BigQueryConnectionItem.class;
    }

}
