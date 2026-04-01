// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.wizards.metadata.connection.database;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class DatabaseSelectWizardPage extends WizardPage {

    DatabaseSelectForm dbSelectform;

    protected DatabaseSelectWizardPage() {
        super("databaseSelectPage");
    }

    @Override
    public void createControl(Composite parent) {
        dbSelectform = new DatabaseSelectForm(parent, this, SWT.NONE);
        setControl(dbSelectform);
    }

    public String getDBType() {
        return dbSelectform.getSelectedDB();
    }

}
