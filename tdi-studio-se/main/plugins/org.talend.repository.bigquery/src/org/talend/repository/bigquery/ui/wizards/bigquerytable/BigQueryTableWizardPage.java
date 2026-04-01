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
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.metadata.managment.ui.wizard.AbstractForm;
import org.talend.repository.bigquery.BigQueryClientManager;

public class BigQueryTableWizardPage extends WizardPage {

    protected MetadataTable repTable;

    protected final boolean isRepositoryObjectEditable;

    protected BigQueryTableForm tableForm;

    protected BigQueryConnection tempConneciton;

    protected BigQueryClientManager clientManger;

    public BigQueryTableWizardPage(BigQueryClientManager clientManger, BigQueryConnection tempConneciton, MetadataTable repTable,
            boolean isRepositoryObjectEditable) {
        super("Retreive BigQuery Tables");
        this.clientManger = clientManger;
        this.tempConneciton = tempConneciton;
        this.isRepositoryObjectEditable = isRepositoryObjectEditable;
        this.repTable = repTable;
    }

    public void createControl(final Composite parent) {
        tableForm = new BigQueryTableForm(parent, this, clientManger, tempConneciton, repTable);
        tableForm.setReadOnly(!isRepositoryObjectEditable);

        AbstractForm.ICheckListener listener = new AbstractForm.ICheckListener() {

            public void checkPerformed(final AbstractForm source) {
                if (source.isStatusOnError()) {
                    BigQueryTableWizardPage.this.setPageComplete(false);
                    setErrorMessage(source.getStatus());
                } else {
                    BigQueryTableWizardPage.this.setPageComplete(isRepositoryObjectEditable);
                    setErrorMessage(null);
                    setMessage(source.getStatus(), source.getStatusLevel());
                }
            }
        };
        tableForm.setListener(listener);
        setControl(tableForm);
    }

}
