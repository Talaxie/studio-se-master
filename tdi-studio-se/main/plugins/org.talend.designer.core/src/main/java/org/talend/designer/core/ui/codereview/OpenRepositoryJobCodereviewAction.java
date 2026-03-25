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
package org.talend.designer.core.ui.codereview;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.image.ECoreImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.core.CorePlugin;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.IDesignerCoreService;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.RepositoryNode;
import org.talend.repository.ui.actions.AContextualAction;

/**
 * DOC smallet class global comment. Detailled comment <br/>
 *
 * $Id: OpenRepositoryJobCodereviewAction.java 17216 2008-08-22 08:24:11Z yzhang $
 *
 */
public class OpenRepositoryJobCodereviewAction extends AContextualAction {

    private static final String CREATE_LABEL = Messages.getString("OpenRepositoryJobCodereviewAction.createJob"); //$NON-NLS-1$

    public OpenRepositoryJobCodereviewAction() {
        super();
        setText(Messages.getString("OpenRepositoryJobCodereviewAction.textOpen")); //$NON-NLS-1$
        setToolTipText(Messages.getString("OpenRepositoryJobCodereviewAction.tipOpen")); //$NON-NLS-1$
        setDescription(Messages.getString("OpenRepositoryJobCodereviewAction.descriptionOpen")); //$NON-NLS-1$
        this.setImageDescriptor(ImageProvider.getImageDesc(ECoreImage.COMPONMENT_ASSIST));
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.action.Action#run()
     */
    protected void doRun() {
        ISelection selection = getSelection();
        Object obj = ((IStructuredSelection) selection).getFirstElement();

        RepositoryNode node = (RepositoryNode) obj;
        Property property = (Property) node.getObject().getProperty();

        Property updatedProperty = null;
        try {
            updatedProperty = ProxyRepositoryFactory.getInstance()
                    .getLastVersion(new Project(ProjectManager.getInstance().getProject(property.getItem())), property.getId())
                    .getProperty();
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
        }
        // update the property of the node repository object
        if (node.getObject() instanceof IRepositoryObject) {
            IRepositoryObject iobject = (IRepositoryObject) node.getObject();
            iobject.setProperty(updatedProperty);
        }
        Assert.isTrue(property.getItem() instanceof ProcessItem);

        // TODO should use a fake Process here to replace the real Process.
        // Process loadedProcess = new Process(property);
        // loadedProcess.loadXmlFile();
        IDesignerCoreService designerCoreService = CorePlugin.getDefault().getDesignerCoreService();
        Process loadedProcess = (Process) designerCoreService.getProcessFromProcessItem((ProcessItem) updatedProperty.getItem());

        OpenJobCodereviewAction openAction = new OpenJobCodereviewAction(this.getViewPart());
        openAction.run(loadedProcess);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.ui.actions.ITreeContextualAction#init(org.eclipse.jface.viewers.TreeViewer,
     * org.eclipse.jface.viewers.IStructuredSelection)
     */
    public void init(TreeViewer viewer, IStructuredSelection selection) {
        boolean canWork = selection.size() == 1;

        if (canWork) {
            Object o = selection.getFirstElement();
            RepositoryNode node = (RepositoryNode) o;

            switch (node.getType()) {
            case REPOSITORY_ELEMENT:
                if (node.getObjectType() != ERepositoryObjectType.PROCESS) {
                    canWork = false;
                }
                break;
            default:
                canWork = false;
            }
            if (canWork && node.getObject() != null
                    && ProxyRepositoryFactory.getInstance().getStatus(node.getObject()) == ERepositoryStatus.DELETED) {
                canWork = false;
            }
        }
        setEnabled(canWork);
    }

}
