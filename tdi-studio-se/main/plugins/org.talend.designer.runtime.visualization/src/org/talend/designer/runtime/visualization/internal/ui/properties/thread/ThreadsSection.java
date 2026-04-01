/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.thread;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.IThreadElement;
import org.talend.designer.runtime.visualization.JvmCoreException;
import org.talend.designer.runtime.visualization.internal.actions.RefreshAction;
import org.talend.designer.runtime.visualization.internal.actions.ToggleOrientationAction;
import org.talend.designer.runtime.visualization.internal.ui.IHelpContextIds;
import org.talend.designer.runtime.visualization.internal.ui.RefreshJob;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;

/**
 * The thread section.
 */
public class ThreadsSection extends AbstractJvmPropertySection {

    /** The layout menu id. */
    private static final String LAYOUT_MENU_ID = "layout"; //$NON-NLS-1$

    /** The sash form. */
    ThreadSashForm sashForm;

    /** The action to dump threads. */
    DumpThreadsAction dumpThreadsAction;

    /** The action to refresh section. */
    RefreshAction refreshAction;

    /** The layout menu. */
    private MenuManager layoutMenu;

    /**
     * The constructor.
     */
    public ThreadsSection() {
        createActions();
    }

    /*
     * @see AbstractPropertySection#refresh()
     */
    @Override
    public void refresh() {
        if (!isSectionActivated) {
            return;
        }

        new RefreshJob(NLS.bind(Messages.refreshThreadsSectionJobLabel, getJvm().getPid()), toString()) {

            @Override
            protected void refreshModel(IProgressMonitor monitor) {
                IActiveJvm jvm = getJvm();
                if (jvm != null && jvm.isConnected() && !isRefreshSuspended()) {
                    try {
                        jvm.getMBeanServer().refreshThreadCache();
                    } catch (JvmCoreException e) {
                        Activator.log(null, e);
                    }
                }
            }

            @Override
            protected void refreshUI() {
                IActiveJvm jvm = getJvm();
                boolean isConnected = jvm != null && jvm.isConnected();
                dumpThreadsAction.setEnabled(!hasErrorMessage());
                refreshAction.setEnabled(isConnected);

                if (sashForm != null && !sashForm.isDisposed()) {
                    refreshBackground(sashForm.getChildren(), isConnected);
                    sashForm.refresh();
                }
            }
        }.schedule();
    }

    /*
     * @see AbstractJvmPropertySection#createControls(Composite)
     */
    @Override
    protected void createControls(Composite parent) {
        sashForm = new ThreadSashForm(parent, getActionBars());

        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, IHelpContextIds.THREADS_PAGE);
    }

    /*
     * @see AbstractJvmPropertySection#setInput(IWorkbenchPart, ISelection, IActiveJvm, IActiveJvm)
     */
    @Override
    protected void setInput(IWorkbenchPart part, ISelection selection, final IActiveJvm newJvm, IActiveJvm oldJvm) {
        sashForm.setInput(new IThreadInput() {

            @Override
            public IThreadElement[] getThreadListElements() {
                return newJvm.getMBeanServer().getThreadCache();
            }
        });
    }

    /*
     * @see AbstractJvmPropertySection#addToolBarActions(IToolBarManager)
     */
    @Override
    protected void addToolBarActions(IToolBarManager manager) {
        if (manager.find(refreshAction.getId()) == null) {
            manager.insertAfter("defaults", new Separator("separator")); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if (manager.find(refreshAction.getId()) == null) {
            manager.insertAfter("defaults", refreshAction); //$NON-NLS-1$
        }
        if (manager.find(dumpThreadsAction.getId()) == null) {
            manager.insertAfter("defaults", dumpThreadsAction); //$NON-NLS-1$
        }
    }

    /*
     * @see AbstractJvmPropertySection#removeToolBarActions(IToolBarManager)
     */
    @Override
    protected void removeToolBarActions(IToolBarManager manager) {
        manager.remove("separator"); //$NON-NLS-1$
        manager.remove(refreshAction.getId());
        manager.remove(dumpThreadsAction.getId());
    }

    /*
     * @see AbstractJvmPropertySection#addLocalMenus(IMenuManager)
     */
    @Override
    protected void addLocalMenus(IMenuManager manager) {
        if (manager.find(layoutMenu.getId()) == null) {
            manager.add(layoutMenu);
            for (ToggleOrientationAction action : sashForm.getOrientationActions()) {
                if (layoutMenu.find(action.getId()) == null) {
                    layoutMenu.add(action);
                }
            }
        }
    }

    /*
     * @see AbstractJvmPropertySection#removeLocalMenus(IMenuManager)
     */
    @Override
    protected void removeLocalMenus(IMenuManager manager) {
        manager.remove(layoutMenu);
    }

    /*
     * @see AbstractJvmPropertySection#deactivateSection()
     */
    @Override
    protected void deactivateSection() {
        super.deactivateSection();
        Job.getJobManager().cancel(toString());
    }

    /**
     * Creates the actions.
     */
    private void createActions() {
        dumpThreadsAction = new DumpThreadsAction(this);
        refreshAction = new RefreshAction(this);
        layoutMenu = new MenuManager(Messages.layoutLabel, LAYOUT_MENU_ID);
    }
}
