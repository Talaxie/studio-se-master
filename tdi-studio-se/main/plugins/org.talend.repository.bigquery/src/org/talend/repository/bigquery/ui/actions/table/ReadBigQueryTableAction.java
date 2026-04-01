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

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.ui.runtime.image.ECoreImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.repositoryObject.MetadataTableRepositoryObject;
import org.talend.core.repository.ui.actions.metadata.AbstractCreateAction;
import org.talend.repository.bigquery.i18n.Messages;
import org.talend.repository.bigquery.ui.wizards.bigquerytable.BigQueryTableWizard;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.views.IRepositoryView;

public class ReadBigQueryTableAction extends AbstractCreateAction {

    public ReadBigQueryTableAction() {
        setText(Messages.getString("ReadBigQueryTableAction.action.readTable"));//$NON-NLS-1$
        this.setImageDescriptor(ImageProvider.getImageDesc(ECoreImage.METADATA_TABLE_ICON));
    }

    @Override
    protected void init(RepositoryNode repNode) {
        if (ENodeType.REPOSITORY_ELEMENT.equals(repNode.getType())) {
            IRepositoryViewObject repositoryObject = repNode.getObject();
            ERepositoryObjectType nodeType = (ERepositoryObjectType) repNode.getProperties(EProperties.CONTENT_TYPE);
            if (repNode.getParent() == null) {
                return;
            }
            ERepositoryObjectType parentNodeType = (ERepositoryObjectType) repNode.getParent().getProperties(
                    EProperties.CONTENT_TYPE);
            if ((ERepositoryObjectType.METADATA_CON_TABLE.equals(nodeType) || ERepositoryObjectType.METADATA_CON_COLUMN
                    .equals(nodeType)) && ERepositoryObjectType.METADATA_BIGQUERYCONNECTIONS.equals(parentNodeType)) {

                if (repositoryObject instanceof MetadataTableRepositoryObject) {
                    MetadataTableRepositoryObject tableObject = (MetadataTableRepositoryObject) repositoryObject;
                    if (tableObject.getAbstractMetadataObject() instanceof MetadataTable) {//BigQueryTable
                        setEnabled(true);
                        this.repositoryNode = repNode;
                        return;

                    }
                }

            }

        }

    }

    @Override
    protected void doRun() {
        IRepositoryView viewPart = getViewPart();
        if (viewPart != null) {
            viewPart.setFocus();
            viewPart.expand(repositoryNode, true);
        }

        MetadataTableRepositoryObject repositoryObject = (MetadataTableRepositoryObject) repositoryNode.getObject();
        MetadataTable bigqueryTable = (MetadataTable) repositoryObject.getAbstractMetadataObject();
        if (bigqueryTable == null) {
            return;
        }

        BigQueryTableWizard bigqueryWizard = new BigQueryTableWizard(PlatformUI.getWorkbench(), repositoryNode.getObject(), bigqueryTable,
                getExistingNames(), true);

        // Open the Wizard
        WizardDialog wizardDialog = new WizardDialog(Display.getCurrent().getActiveShell(), bigqueryWizard);
        // wizardDialog.setPageSize(800, 400);
        wizardDialog.create();
        wizardDialog.open();

    }

}
