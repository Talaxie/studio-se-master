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
package org.talend.repository.bigquery.ui.wizards;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.talend.core.model.metadata.IMetadataContextModeManager;
import org.talend.core.model.properties.BigQueryConnectionItem;
import org.talend.core.runtime.util.SharedStudioUtils;
import org.talend.metadata.managment.ui.wizard.AbstractForm;
import org.talend.repository.bigquery.i18n.Messages;

public class BigQueryConnectionWizardPage extends WizardPage {

    private BigQueryConnectionItem bigqueryConnectionItem;

    private BigQueryConnectionForm bigqueryForm;

    private final String[] existingNames;

    private final boolean isRepositoryObjectEditable;

    private IMetadataContextModeManager contextModeManager;

    public BigQueryConnectionWizardPage(BigQueryConnectionItem connectionItem, boolean isRepositoryObjectEditable, String[] existingNames,
            IMetadataContextModeManager contextModeManager) {
        super("wizardPage"); //$NON-NLS-1$
        this.bigqueryConnectionItem = connectionItem;
        this.existingNames = existingNames;
        this.isRepositoryObjectEditable = isRepositoryObjectEditable;
        this.contextModeManager = contextModeManager;
    }

    @Override
    public void createControl(final Composite parent) {
        bigqueryForm = new BigQueryConnectionForm(parent, bigqueryConnectionItem, existingNames, contextModeManager);
        bigqueryForm.setReadOnly(!isRepositoryObjectEditable);

        AbstractForm.ICheckListener listener = new AbstractForm.ICheckListener() {

            @Override
            public void checkPerformed(final AbstractForm source) {
                if (source.isStatusOnError()) {
                    BigQueryConnectionWizardPage.this.setPageComplete(false);
                    setErrorMessage(source.getStatus());
                } else {
                	BigQueryConnectionWizardPage.this.setPageComplete(isRepositoryObjectEditable);
                    setErrorMessage(null);
                    setMessage(source.getStatus(), source.getStatusLevel());
                }
            }
        };
        bigqueryForm.setListener(listener);
        setControl(bigqueryForm);
        if (bigqueryConnectionItem.getProperty().getLabel() != null && !bigqueryConnectionItem.getProperty().getLabel().equals("")) {
            bigqueryForm.checkFieldsValue();
        }
    }

    @Override
    public void performHelp() {
        if (SharedStudioUtils.isSharedStudioMode()) {
            MessageDialog.openInformation(getShell(), Messages.getString("BigQueryConnectionPropertyPage.Help"),//$NON-NLS-1$
                    Messages.getString("BigQueryConnectionPropertyPage.MsgSharedMode"));//$NON-NLS-1$
        } else {
            MessageDialog.openInformation(getShell(), Messages.getString("BigQueryConnectionPropertyPage.Help"),//$NON-NLS-1$
                    Messages.getString("BigQueryConnectionPropertyPage.Msg"));//$NON-NLS-1$ 
        }
    }

}
