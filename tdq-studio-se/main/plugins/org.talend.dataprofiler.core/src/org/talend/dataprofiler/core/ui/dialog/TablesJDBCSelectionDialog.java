// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.dataprofiler.core.ui.dialog;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.dataprofiler.core.PluginConstant;
import org.talend.dataprofiler.core.i18n.internal.DefaultMessagesImpl;
import org.talend.dataprofiler.core.ui.editor.analysis.AbstractAnalysisMetadataPage;
import org.talend.dataprofiler.core.ui.editor.analysis.TablesSelectionDialog;
import org.talend.dataprofiler.core.ui.filters.JDBCActiveElementsFilter;
import org.talend.dq.nodes.DBConnectionRepNode;
import org.talend.dq.nodes.DBTableFolderRepNode;
import org.talend.dq.nodes.DBViewFolderRepNode;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.RepositoryNode;


public class TablesJDBCSelectionDialog extends TablesSelectionDialog {

    /**
     * @param metadataFormPage
     * @param parent
     * @param title
     * @param columnSetList
     * @param message
     * @param connComboSelectNode
     */
    public TablesJDBCSelectionDialog(AbstractAnalysisMetadataPage metadataFormPage, Shell parent, String title,
            List<IRepositoryNode> columnSetList, String message, RepositoryNode connComboSelectNode) {
        super(metadataFormPage, parent, title, columnSetList, message, connComboSelectNode);
        DatabaseConnection jdbcDBConnection = null;
        if (connComboSelectNode != null) {
            jdbcDBConnection = ((DBConnectionRepNode) connComboSelectNode).getDatabaseConnection();
        }
        addFilter(new JDBCActiveElementsFilter(jdbcDBConnection));
    }

    @Override
    protected void updateOKStatus() {
        super.updateOKStatus();
        List<RepositoryNode> allcheckedTableNodes = new ArrayList<>();
        for (Object checkElement : this.getTreeViewer().getCheckedElements()) {
            if ((checkElement instanceof DBTableFolderRepNode || checkElement instanceof DBViewFolderRepNode)
                    && ((RepositoryNode) checkElement).getId() != null) {
                allcheckedTableNodes.add((RepositoryNode) checkElement);
            }
        }
        if (allcheckedTableNodes.size() <= 0) {
            fCurrStatus =
                    new Status(IStatus.ERROR, PlatformUI.PLUGIN_ID, IStatus.WARNING,
                            DefaultMessagesImpl.getString(
                                    "TablesSelectionDialog.noTableFoundError", PluginConstant.SPACE_STRING), //$NON-NLS-1$
                            null);
        }
        updateStatus(fCurrStatus);
    }

}
