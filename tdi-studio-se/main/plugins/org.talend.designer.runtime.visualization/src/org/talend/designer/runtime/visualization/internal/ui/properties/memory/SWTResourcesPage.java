/*******************************************************************************
 * Copyright (c) 2011 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.memory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.JvmCoreException;
import org.talend.designer.runtime.visualization.internal.actions.PreferencesAction;
import org.talend.designer.runtime.visualization.internal.actions.RefreshAction;
import org.talend.designer.runtime.visualization.internal.actions.ToggleOrientationAction;
import org.talend.designer.runtime.visualization.internal.ui.RefreshJob;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractSashForm;
import org.talend.designer.runtime.visualization.internal.ui.properties.StackTraceViewer;

/**
 * The SWT resource page.
 */
public class SWTResourcesPage extends AbstractSashForm {

    /** The sash weights. */
    private static final int[] SASH_WEIGHTS = new int[] { 45, 55 };

    /** The layout menu id. */
    private static final String LAYOUT_MENU_ID = "layout"; //$NON-NLS-1$

    /** The resource filtered viewer. */
    SWTResourceFilteredTree resourceFilteredTree;

    /** The stack trace viewer. */
    StackTraceViewer stackTraceViewer;

    /** The memory section. */
    MemorySection section;

    /** The action to refresh section. */
    RefreshAction refreshAction;

    /** The action to clear SWT resource action. */
    ClearSWTResourceAction clearSWTResourceAction;

    /** The layout menu. */
    private MenuManager layoutMenu;

    /**
     * The constructor.
     * 
     * @param section The memory section
     * @param tabFolder The tab folder
     * @param actionBars The action bars
     */
    public SWTResourcesPage(MemorySection section, final CTabFolder tabFolder, IActionBars actionBars) {
        super(tabFolder, actionBars, SASH_WEIGHTS);
        this.section = section;

        createSashFormControls(this, actionBars);
        setWeights(initialSashWeights);

        createActions();

        final CTabItem tabItem = section.getWidgetFactory().createTabItem(tabFolder, SWT.NONE);
        tabItem.setText(Messages.swtResourcesLabel);
        tabItem.setControl(this);

        tabFolder.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                boolean tabSelected = tabFolder.getSelection().equals(tabItem);
                refreshBackground();
                updateLocalToolBar(tabSelected);
                updateLocalMenus(tabSelected);
                if (!tabSelected) {
                    resourceFilteredTree.updateStatusLine(null);
                }
            }
        });
    }

    /*
     * @see AbstractSashForm#createSashFormControls(SashForm, IActionBars)
     */
    @Override
    protected void createSashFormControls(SashForm sashForm, IActionBars actionBars) {
        resourceFilteredTree = new SWTResourceFilteredTree(sashForm, actionBars);
        TreeViewer resourceViewer = resourceFilteredTree.getViewer();
        resourceViewer.setContentProvider(new SWTResourceContentProvider(resourceViewer));
        resourceViewer.setLabelProvider(new SWTResourceLabelProvider());
        resourceViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = event.getSelection();
                if (selection.isEmpty()) {
                    selection = null;
                }
                stackTraceViewer.setInput(selection);
            }
        });

        stackTraceViewer = new StackTraceViewer(sashForm, actionBars);
    }

    /**
     * Refreshes the appearance.
     * 
     * @param force <tt>true</tt> to force refresh
     */
    protected void refresh(final boolean force) {
        final boolean isVisible = isVisible();

        new RefreshJob(NLS.bind(Messages.refreshMemorySectionJobLabel, section.getJvm().getPid()), toString()) {

            @Override
            protected void refreshModel(IProgressMonitor monitor) {
                try {
                    IActiveJvm jvm = section.getJvm();
                    if (isVisible && jvm != null && jvm.isConnected() && (!section.isRefreshSuspended() || force)
                            && jvm.getSWTResourceMonitor().isSupported()) {
                        jvm.getSWTResourceMonitor().refreshResourcesCache();
                    }
                } catch (JvmCoreException e) {
                    Activator.log(Messages.refreshHeapDataFailedMsg, e);
                }
            }

            @Override
            protected void refreshUI() {
                IActiveJvm jvm = section.getJvm();
                boolean isConnected = jvm != null && jvm.isConnected();

                if (!isDisposed()) {
                    refreshBackground();
                }
                refreshAction.setEnabled(isConnected);
                clearSWTResourceAction.setEnabled(isConnected);
                if (!force && section.isRefreshSuspended() || !isVisible) {
                    return;
                }

                TreeViewer resourceViewer = resourceFilteredTree.getViewer();
                if (!resourceViewer.getControl().isDisposed()) {
                    resourceViewer.refresh();
                    if (jvm != null) {
                        resourceFilteredTree.updateStatusLine(jvm.getSWTResourceMonitor().getResources());
                    }

                    // select the first item if no item is selected
                    if (resourceViewer.getSelection().isEmpty()) {
                        TreeItem[] items = resourceViewer.getTree().getItems();
                        if (items != null && items.length > 0) {
                            resourceViewer.getTree().select(items[0]);
                            stackTraceViewer.setInput(resourceViewer.getSelection());
                        } else {
                            stackTraceViewer.setInput(null);
                        }
                    }
                }
                if (!stackTraceViewer.getControl().isDisposed()) {
                    stackTraceViewer.refresh();
                }
            }
        }.schedule();
    }

    /**
     * Sets the SWT resource input.
     * 
     * @param input The SWT resource input
     */
    protected void setInput(ISWTResorceInput input) {
        if (!section.isRefreshSuspended()) {
            resourceFilteredTree.getViewer().setInput(input);
        }
    }

    /**
     * Invoked when section is deactivated.
     */
    protected void deactivated() {
        Job.getJobManager().cancel(toString());
    }

    /**
     * Refreshes the background.
     */
    void refreshBackground() {
        IActiveJvm jvm = section.getJvm();
        boolean isConnected = jvm != null && jvm.isConnected();
        section.refreshBackground(getChildren(), isConnected);
    }

    /**
     * Updates the local tool bar.
     * 
     * @param activated <tt>true</tt> if this tab item is activated
     */
    void updateLocalToolBar(boolean activated) {
        IToolBarManager manager = section.getActionBars().getToolBarManager();
        if (activated) {
            addToolBarActions(manager);
        } else {
            removeToolBarActions(manager);
        }

        manager.update(false);
        section.getActionBars().updateActionBars();
    }

    /**
     * Updates the local menus.
     * 
     * @param activated <tt>true</tt> if this tab item is activated
     */
    void updateLocalMenus(boolean activated) {
        IMenuManager manager = section.getActionBars().getMenuManager();
        if (activated) {
            addLocalMenus(manager);
        } else {
            removeLocalMenus(manager);
        }
    }

    /**
     * Adds the tool bar actions.
     * 
     * @param manager The tool bar manager
     */
    void addToolBarActions(IToolBarManager manager) {
        if (manager.find("separator2") == null) { //$NON-NLS-1$
            manager.insertAfter("defaults", new Separator("separator2")); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if (manager.find(refreshAction.getId()) == null) {
            manager.insertAfter("defaults", refreshAction); //$NON-NLS-1$
        }
        if (manager.find(clearSWTResourceAction.getId()) == null) {
            manager.insertAfter("defaults", clearSWTResourceAction); //$NON-NLS-1$
        }
    }

    /**
     * Removes the tool bar actions.
     * 
     * @param manager The tool bar manager
     */
    void removeToolBarActions(IToolBarManager manager) {
        manager.remove("separator2"); //$NON-NLS-1$
        manager.remove(refreshAction.getId());
        manager.remove(clearSWTResourceAction.getId());
    }

    /**
     * Adds the local menus.
     * 
     * @param manager The menu manager
     */
    void addLocalMenus(IMenuManager manager) {
        if (manager.find(layoutMenu.getId()) == null) {
            if (manager.find(PreferencesAction.class.getName()) != null) {
                manager.insertBefore(PreferencesAction.class.getName(), layoutMenu);
            } else {
                manager.add(layoutMenu);
            }

            for (ToggleOrientationAction action : getOrientationActions()) {
                if (layoutMenu.find(action.getId()) == null) {
                    layoutMenu.add(action);
                }
            }
        }
    }

    /**
     * Removes the local menus.
     * 
     * @param manager The menu manager
     */
    void removeLocalMenus(IMenuManager manager) {
        manager.remove(layoutMenu);
    }

    /**
     * Creates the actions.
     */
    private void createActions() {
        refreshAction = new RefreshAction(section) {
            // to have different action id from one in heap histogram
        };
        clearSWTResourceAction = new ClearSWTResourceAction(this, section);
        layoutMenu = new MenuManager(Messages.layoutLabel, LAYOUT_MENU_ID);
    }
}
