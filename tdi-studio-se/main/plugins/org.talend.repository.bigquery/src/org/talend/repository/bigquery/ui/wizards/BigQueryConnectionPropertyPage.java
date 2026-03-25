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

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.runtime.util.SharedStudioUtils;
import org.talend.metadata.managment.ui.wizard.metadata.connection.Step0WizardPage;
import org.talend.repository.bigquery.i18n.Messages;

public class BigQueryConnectionPropertyPage extends Step0WizardPage {

    public BigQueryConnectionPropertyPage(Property property, IPath destinationPath, ERepositoryObjectType type, boolean readOnly,
            boolean editPath) {
        super(property, destinationPath, type, readOnly, editPath);
    }
    
    @Override
    public void performHelp() {
        if (SharedStudioUtils.isSharedStudioMode()) {
            MessageDialog.openInformation(getShell(), Messages.getString("BigQueryConnectionPropertyPage.Help"),
                    Messages.getString("BigQueryConnectionPropertyPage.MsgSharedMode"));
        } else {
            MessageDialog.openInformation(getShell(), Messages.getString("BigQueryConnectionPropertyPage.Help"),
                    Messages.getString("BigQueryConnectionPropertyPage.Msg"));//$NON-NLS-1$ 
        }
    }

}
