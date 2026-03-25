// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.view.di.metadata.content;

import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProjectRepositoryNode;
import org.talend.core.runtime.services.IGenericService;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.RepositoryNode;

public class MetadataDbConnectionsContentProvider extends AbstractMetadataContentProvider {

    /*
     * (non-Javadoc)
     *
     * @see
     * org.talend.repository.viewer.content.ProjectRepoAbstractContentProvider#getTopLevelNodeFromProjectRepositoryNode
     * (org.talend.repository.model.ProjectRepositoryNode)
     */
    @Override
    protected RepositoryNode getTopLevelNodeFromProjectRepositoryNode(ProjectRepositoryNode projectNode) {
        return projectNode.getRootRepositoryNode(ERepositoryObjectType.METADATA_CONNECTIONS);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.talend.repository.viewer.content.FolderListenerSingleTopContentProvider#refreshTopLevelNode(org.talend.repository
     * .model.RepositoryNode)
     */
    @Override
    protected void refreshTopLevelNode(RepositoryNode repoNode) {
        super.refreshTopLevelNode(repoNode);

        // Make sure the linked Hadoop Cluster to do refresh synchronously
        ERepositoryObjectType hcType = ERepositoryObjectType.valueOf("HADOOPCLUSTER"); //$NON-NLS-1$
        if (hcType != null) {
            IRepositoryNode hcRootNode = repoNode.getRoot().getRootRepositoryNode(hcType);
            if (hcRootNode != null && hcRootNode instanceof RepositoryNode) {
                super.refreshTopLevelNode((RepositoryNode) hcRootNode);
            }
        }
    }

    @Override
    public Object[] getChildren(Object element) {
        if (!RepositoryNode.class.isInstance(element)) {
            return super.getChildren(element);
        }
        RepositoryNode node = RepositoryNode.class.cast(element);
        if (ProjectRepositoryNode.class.isInstance(node.getParent())) {
            boolean isInitialized = node.isInitialized();
            super.getChildren(element);
            if (IGenericService.getService() != null && !isInitialized && node.isInitialized()) {
                if (ERepositoryObjectType.METADATA_CONNECTIONS == node.getContentType()
                        && ERepositoryObjectType.SNOWFLAKE != null) {
                    IGenericService.getService().mergeGenericNodes(node, ERepositoryObjectType.SNOWFLAKE.getLabel());
                    return node.getChildren().toArray();
                }
            }
        }
        return super.getChildren(element);
    }

}
