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

import java.util.List;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.talend.commons.ui.swt.dialogs.ErrorDialogWidthDetailArea;
import org.talend.core.model.metadata.IMetadataContextModeManager;
import org.talend.core.model.metadata.builder.connection.AdditionalConnectionProperty;
import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.metadata.managment.ui.wizard.AbstractForm;
import org.talend.metadata.managment.ui.wizard.metadata.MetadataContextModeManager;
import org.talend.repository.bigquery.BigQueryPlugin;
import org.talend.repository.bigquery.i18n.Messages;

public abstract class AbstractBigQueryForm extends AbstractForm {

    protected static final int WIDTH_GRIDDATA_PIXEL = 750;

    protected BigQueryConnection tempConnection;

    protected List<AdditionalConnectionProperty> copyOfProperties;

    protected AbstractBigQueryForm(Composite parent, BigQueryConnection tempConnection, int style) {
        super(parent, style);
        this.tempConnection = tempConnection;
    }

    protected AbstractBigQueryForm(Composite parent, int style, String[] existingNames) {
        super(parent, style, existingNames);
    }

    protected AbstractBigQueryForm(Composite parent, int style) {
        super(parent, style);
    }

    protected BigQueryConnection getConnection() {
        if (tempConnection != null) {
            return tempConnection;
        }
        return (BigQueryConnection) connectionItem.getConnection();
    }

    public IMetadataContextModeManager getContextModeManager(BigQueryConnection bigqueryConnection) {
        if (bigqueryConnection != null && bigqueryConnection.isContextMode()) {
            MetadataContextModeManager contextModeManager = new MetadataContextModeManager();
            ContextType contextTypeForContextMode = ConnectionContextHelper.getContextTypeForContextMode(bigqueryConnection);
            contextModeManager.setSelectedContextType(contextTypeForContextMode);
            return contextModeManager;
        }
        return null;
    }

    protected void openErrorDialogWithDetail(final Throwable e) {

        Display.getDefault().asyncExec(new Runnable() {

            @Override
            public void run() {
                String mainMsg = Messages.getString("BigQueryForm.checkFailure") + " " // $NON-NLS-1$ //$NON-NLS-1$//$NON-NLS-2$
                        + Messages.getString("BigQueryForm.checkFailureTip"); //$NON-NLS-1$

                new ErrorDialogWidthDetailArea(getShell(), BigQueryPlugin.PLUGIN_ID, mainMsg, ExceptionUtils.getFullStackTrace(e));
            }
        });
    }
}
