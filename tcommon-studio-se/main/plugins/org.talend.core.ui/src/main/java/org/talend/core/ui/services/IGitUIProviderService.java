package org.talend.core.ui.services;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.codec.binary.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.ui.properties.tab.IDynamicProperty;

public interface IGitUIProviderService extends IService {

    boolean isGitHistoryComposite(IDynamicProperty dp);

    ISelection getGitHistorySelection(IDynamicProperty dp);

    IDynamicProperty createProcessGitHistoryComposite(Composite parent, Object view, TabbedPropertySheetWidgetFactory factory,
            IRepositoryViewObject obj);

    public String[] changeCredentials(Shell parent, Serializable uriIsh, String initUser, boolean canStoreCredentials);

    boolean checkPendingChanges();

    public void openPushFailedDialog(Object pushResult);

    boolean migrateOption(IProgressMonitor monitor, String newVersion, boolean hasUpdate) throws Exception;
    
    boolean openSwitchGitModeDialog();
    
    boolean canSwitchGitMode();
    
    boolean canShowSwitchGitModePopup();
    
    void showSwithGitModePopup();
    
    List<ProjectBranchNode> getInvalidProjectBranchNodes();

    public static IGitUIProviderService get() {
        GlobalServiceRegister register = GlobalServiceRegister.getDefault();
        if (!register.isServiceRegistered(IGitUIProviderService.class)) {
            return null;
        }
        return register.getService(IGitUIProviderService.class);
    }

    public static class ProjectBranchNode {

        private String branch;

        private String techLabel;

        private ProjectBranchNode parent;

        private Set<ProjectBranchNode> children = new HashSet<ProjectBranchNode>();

        public ProjectBranchNode(String techLabel, String branch) {
            this.branch = branch;
            this.techLabel = techLabel;
        }

        /**
         * @return the branch
         */
        public String getBranch() {
            return branch;
        }

        /**
         * @return the techLabel
         */
        public String getTechLabel() {
            return techLabel;
        }

        /**
         * @return the parent
         */
        public ProjectBranchNode getParent() {
            return parent;
        }

        /**
         * @return the children
         */
        public Collection<ProjectBranchNode> getChildren() {
            return Collections.unmodifiableCollection(children);
        }
        
        public void addChild(ProjectBranchNode c) {
            c.parent = this;
            this.children.add(c);
        }
        
        public boolean hasChildren() {
            return !this.children.isEmpty();
        }
        
        public int hashCode() {
            int hash = 7;
            hash = hash * 31 + this.techLabel.hashCode();
            hash = hash * 31 + this.branch.hashCode();
            return hash;
        }
        
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (!(o instanceof ProjectBranchNode)) {
                return false;
            }

            ProjectBranchNode thatObj = (ProjectBranchNode) o;
            if (!StringUtils.equals(techLabel, thatObj.getTechLabel())) {
                return false;
            }

            return StringUtils.equals(this.branch, thatObj.getBranch());
        }
    }
}
