package org.talend.repository.hadoopcluster.ui.viewer;

import org.eclipse.jface.viewers.Viewer;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.properties.FolderItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.repository.hadoopcluster.node.model.HadoopClusterRepositoryNodeType;
import org.talend.repository.hadoopcluster.util.HCRepositoryUtil;
import org.talend.repository.model.IRepositoryNode;
import org.talend.repository.model.IRepositoryNode.ENodeType;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.processor.SingleTypeProcessor;

public class HadoopClusterRepositoryTypeProcessor extends SingleTypeProcessor {

    public HadoopClusterRepositoryTypeProcessor(String repositoryType) {
        super(repositoryType);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.ui.processor.SingleTypeProcessor#getType()
     */
    @Override
    protected ERepositoryObjectType getType() {
        return HadoopClusterRepositoryNodeType.HADOOPCLUSTER;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.talend.repository.ui.processor.SingleTypeProcessor#selectRepositoryNode(org.eclipse.jface.viewers.Viewer,
     * org.talend.repository.model.RepositoryNode, org.talend.repository.model.RepositoryNode)
     */
    @Override
    protected boolean selectRepositoryNode(Viewer viewer, RepositoryNode parentNode, RepositoryNode node) {
        final String repositoryType = getRepositoryType();
        if (node == null || repositoryType == null) {
            return false;
        }

        ERepositoryObjectType repObjType = (ERepositoryObjectType) node.getProperties(EProperties.CONTENT_TYPE);
        if (repObjType == ERepositoryObjectType.REFERENCED_PROJECTS) {
            return true;
        }

        if (node.getType() == ENodeType.SYSTEM_FOLDER) {
            return true;
        }

        if (node.getType() == ENodeType.SIMPLE_FOLDER || HCRepositoryUtil.isHadoopContainerNode(node)) {
            return isValidFolder(node);
        }

        IRepositoryViewObject object = node.getObject();
        if (object == null || object.getProperty().getItem() == null) {
            return false;
        }
        if (object instanceof MetadataTable) {
            return false;
        }
        Item item = object.getProperty().getItem();
        if (item instanceof FolderItem) {
            return true;
        }

        return true;
    }

    private boolean isValidFolder(IRepositoryNode node) {
        ERepositoryObjectType repObjType = (ERepositoryObjectType) node.getProperties(EProperties.CONTENT_TYPE);
        if (repObjType != null && repObjType.equals(HadoopClusterRepositoryNodeType.HADOOPCLUSTER)) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.talend.repository.ui.processor.SingleTypeProcessor#isSelectionValid(org.talend.repository.model.RepositoryNode
     * )
     */
    @Override
    public boolean isSelectionValid(RepositoryNode node) {
        final String repositoryType = getRepositoryType();
        if (node == null || node.getObjectType() == null || repositoryType == null) {
            return false;
        }

        return repositoryType.equals(node.getObjectType().getType());
    }

}
