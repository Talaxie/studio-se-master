package org.talend.repository.generic.action;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.metadata.managment.ui.wizard.PropertiesWizard;
import org.talend.repository.generic.ui.GenericConnPropertiesWizard;
import org.talend.repository.generic.util.GenericWizardServiceFactory;
import org.talend.repository.model.IRepositoryNode.EProperties;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.actions.EditPropertiesAction;

/**
 * 
 * created by ycbai on 2015年11月3日 Detailled comment
 *
 */
public class EditGenericConnectionPropertiesAction extends EditPropertiesAction {

    public EditGenericConnectionPropertiesAction() {
        super();
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
                    ERepositoryObjectType contentType = (ERepositoryObjectType) node.getProperties(EProperties.CONTENT_TYPE);
                    boolean isGenericType = GenericWizardServiceFactory.getGenericWizardService().isGenericType(contentType);
                    canWork = isGenericType;
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

    @Override
    protected PropertiesWizard getPropertiesWizard(IRepositoryViewObject object, IPath path) {
        return new GenericConnPropertiesWizard(object, path, true);
    }

}
