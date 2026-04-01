package org.talend.repository.hadoopcluster.action;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.ui.IWorkbench;
import org.talend.commons.ui.runtime.image.IImage;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.repository.ProjectManager;
import org.talend.repository.hadoopcluster.action.common.CreateHadoopNodeAction;
import org.talend.repository.hadoopcluster.node.model.HadoopClusterRepositoryNodeType;
import org.talend.repository.hadoopcluster.ui.HadoopClusterWizard;
import org.talend.repository.hadoopcluster.util.EHadoopClusterImage;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnectionItem;

/**
 * 
 * created by ycbai on 2013-1-21 Detailled comment
 * 
 */
public class CreateHadoopClusterAction extends CreateHadoopNodeAction {

    @Override
    protected ERepositoryObjectType getNodeType() {
        return HadoopClusterRepositoryNodeType.HADOOPCLUSTER;
    }

    @Override
    protected IImage getNodeImage() {
        return EHadoopClusterImage.HADOOPCLUSTER_RESOURCE_ICON;
    }

    @Override
    protected IWizard getWizard(IWorkbench workbench, boolean isCreate, RepositoryNode node, String[] existingNames) {
        return new HadoopClusterWizard(workbench, isCreate, node, existingNames);
    }

    @Override
    protected void init(RepositoryNode node) {
        ERepositoryObjectType nodeType = (ERepositoryObjectType) node.getProperties(EProperties.CONTENT_TYPE);
        if (!HadoopClusterRepositoryNodeType.HADOOPCLUSTER.equals(nodeType)) {
            return;
        }
        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        switch (node.getType()) {
        case SIMPLE_FOLDER:
            if (node.getObject() != null && node.getObject().getProperty().getItem().getState().isDeleted()) {
                setEnabled(false);
                return;
            }
        case SYSTEM_FOLDER:
            if (factory.isUserReadOnlyOnCurrentProject() || !ProjectManager.getInstance().isInCurrentMainProject(node)) {
                setEnabled(false);
                return;
            }
            this.setText(getCreateLabel());
            collectChildNames(node);
            creation = true;
            break;
        case REPOSITORY_ELEMENT:
            if (factory.isPotentiallyEditable(node.getObject())) {
                this.setText(getEditLabel());
                collectSiblingNames(node);
            } else {
                this.setText(getOpenLabel());
            }
            collectSiblingNames(node);
            creation = false;
            break;
        default:
            return;
        }
        setEnabled(true);
    }

    @Override
    public Class getClassForDoubleClick() {
        return HadoopClusterConnectionItem.class;
    }

}
