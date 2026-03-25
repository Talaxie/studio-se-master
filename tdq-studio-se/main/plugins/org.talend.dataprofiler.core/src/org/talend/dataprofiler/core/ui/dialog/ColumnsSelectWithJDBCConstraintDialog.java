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
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.cwm.helper.TaggedValueHelper;
import org.talend.dataprofiler.core.PluginConstant;
import org.talend.dataprofiler.core.i18n.internal.DefaultMessagesImpl;
import org.talend.dataprofiler.core.ui.editor.analysis.AbstractAnalysisMetadataPage;
import org.talend.dataprofiler.core.ui.filters.JDBCActiveElementsFilter;
import org.talend.dq.helper.JDBCSwitchContextUtils;
import org.talend.dq.nodes.DBConnectionRepNode;
import org.talend.dq.nodes.DBTableRepNode;
import org.talend.dq.nodes.DBViewRepNode;
import org.talend.dq.nodes.DFTableRepNode;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.RepositoryNode;

public class ColumnsSelectWithJDBCConstraintDialog extends ColumnsSelectWithConstraintDialog {

    private DatabaseConnection jdbcDBConnection;

    /**
     * @param metadataFormPage
     * @param parent
     * @param title
     * @param checkedRepoNodes
     * @param rootNode
     * @param message
     */
    public ColumnsSelectWithJDBCConstraintDialog(AbstractAnalysisMetadataPage metadataFormPage, Shell parent,
            String title, List<? extends IRepositoryNode> checkedRepoNodes, DBConnectionRepNode connNode,
            String message) {
        super(metadataFormPage, parent, title, checkedRepoNodes, connNode, message);
        if (jdbcDBConnection == null) {
            jdbcDBConnection = connNode.getDatabaseConnection();
        }
    }

    public ColumnsSelectWithJDBCConstraintDialog(AbstractAnalysisMetadataPage metadataFormPage, Shell parent,
            String title,
            List<? extends IRepositoryNode> checkedRepoNodes, String message, boolean addConnFilter) {
        super(metadataFormPage, parent, title, checkedRepoNodes, message, addConnFilter);
    }

    @Override
    protected void initDialog(String title, List<? extends IRepositoryNode> checkedRepoNodes) {
        if (connNode != null) {
            jdbcDBConnection = ((DBConnectionRepNode) connNode).getDatabaseConnection();
        }
        super.initDialog(title, checkedRepoNodes);
        addFilter(new JDBCActiveElementsFilter(jdbcDBConnection));
    }

    @Override
    protected boolean nodeIsValid(IRepositoryNode parentNode) {
        DatabaseConnection currentConnection = jdbcDBConnection;
        if (currentConnection == null) {
            currentConnection = JDBCSwitchContextUtils.findConnection(parentNode);
        }
        String taggedTargetSID = TaggedValueHelper.getValueString(TaggedValueHelper.TARGET_SID, currentConnection);
        IRepositoryNode catalogNode = parentNode;
        if (catalogNode.getObjectType() == ERepositoryObjectType.METADATA_CON_TABLE
                || catalogNode.getObjectType() == ERepositoryObjectType.METADATA_CON_VIEW) {
            catalogNode = catalogNode.getParent().getParent();
        }
        if (catalogNode.getObjectType() == ERepositoryObjectType.METADATA_CON_SCHEMA) {
            catalogNode = catalogNode.getParent();
        }
        if (catalogNode.getObjectType() == ERepositoryObjectType.METADATA_CON_CATALOG) {
            return taggedTargetSID.equals(catalogNode.getLabel());
        }
        return false;
    }

    @Override
    protected void updateStatusBySelection() {
        super.updateStatusBySelection();
        List<RepositoryNode> allcheckedTableNodes = new ArrayList<RepositoryNode>();
        for (Object checkElement : this.getTreeViewer().getCheckedElements()) {
            if ((checkElement instanceof DBTableRepNode || checkElement instanceof DBViewRepNode
                    || checkElement instanceof DFTableRepNode)
                    && ((RepositoryNode) checkElement).getId() != null) {
                allcheckedTableNodes.add((RepositoryNode) checkElement);
            }
        }
        if (allcheckedTableNodes.size() <= 0) {
            fCurrStatus =
                    new Status(IStatus.ERROR, PlatformUI.PLUGIN_ID, IStatus.WARNING,
                            DefaultMessagesImpl.getString(
                                    "ColumnMasterDetailsPage.noColumnFoundError", PluginConstant.SPACE_STRING), //$NON-NLS-1$
                            null);
        }
        updateStatus(fCurrStatus);
    }


}
