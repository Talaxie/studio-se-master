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
package org.talend.repository.bigquery.ui.wizards.bigquerytable;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.metadata.managment.ui.wizard.AbstractForm;
import org.talend.repository.bigquery.BigQueryClientManager;

public class BigQueryTableSelectWizardPage extends WizardPage {

    protected final boolean isRepositoryObjectEditable;

    protected BigQueryTableSelectForm tableSelectForm;

    protected BigQueryConnection tempConneciton;

    protected BigQueryClientManager clientManager;

    public BigQueryTableSelectWizardPage(BigQueryConnection tempConneciton, BigQueryClientManager clientManager,
            boolean isRepositoryObjectEditable) {
        super("Retreive BigQuery Tables");
        this.clientManager = clientManager;
        this.tempConneciton = tempConneciton;
        this.isRepositoryObjectEditable = isRepositoryObjectEditable;
    }

    @Override
    public void createControl(final Composite parent) {
        tableSelectForm = new BigQueryTableSelectForm(parent, this, clientManager, tempConneciton);
        tableSelectForm.setReadOnly(!isRepositoryObjectEditable);

        AbstractForm.ICheckListener listener = new AbstractForm.ICheckListener() {

            @Override
            public void checkPerformed(final AbstractForm source) {
                if (source.isStatusOnError()) {
                    BigQueryTableSelectWizardPage.this.setPageComplete(false);
                    setErrorMessage(source.getStatus());
                } else {
                	BigQueryTableSelectWizardPage.this.setPageComplete(isRepositoryObjectEditable);
                    setErrorMessage(null);
                    setMessage(source.getStatus(), source.getStatusLevel());
                }
            }
        };
        tableSelectForm.setListener(listener);
        tableSelectForm.setReadOnly(!isRepositoryObjectEditable);
        setControl(tableSelectForm);
    }

    public void performCancel() {
        tableSelectForm.processWhenDispose();
    }

}
