package org.talend.repository.hadoopcluster.action.common;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.repository.hadoopcluster.i18n.Messages;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.actions.EditPropertiesAction;

/**
 * created by ycbai on 2013-1-21 Detailled comment
 * 
 */
public abstract class EditHadoopNodePropertiesAction extends EditPropertiesAction {

    public EditHadoopNodePropertiesAction() {
        super();
        this.setText(Messages.getString("EditHadoopClusterPropertiesAction.editLabel")); //$NON-NLS-1$
        this.setToolTipText(Messages.getString("EditHadoopClusterPropertiesAction.tooltip")); //$NON-NLS-1$
        this.setImageDescriptor(ImageProvider.getImageDesc(EImage.EDIT_ICON));
    }

    @Override
    public void init(TreeViewer viewer, IStructuredSelection selection) {
        boolean canWork = selection.size() == 1;
        if (canWork) {
            Object o = selection.getFirstElement();
            if (o instanceof RepositoryNode) {
                RepositoryNode node = (RepositoryNode) o;
                switch (node.getType()) {
                case REPOSITORY_ELEMENT:
                    if (node.getObjectType() == getNodeType()) {
                        canWork = true;
                    } else {
                        canWork = false;
                    }
                    break;
                default:
                    canWork = false;
                    break;
                }
                if (canWork) {
                    canWork = (node.getObject().getRepositoryStatus() != ERepositoryStatus.DELETED);
                }
                if (canWork) {
                    canWork = isLastVersion(node);
                }
            }
        }
        setEnabled(canWork);
    }

    protected abstract ERepositoryObjectType getNodeType();

}
