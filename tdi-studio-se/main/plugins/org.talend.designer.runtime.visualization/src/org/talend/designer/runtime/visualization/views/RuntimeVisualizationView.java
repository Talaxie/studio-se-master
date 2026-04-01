package org.talend.designer.runtime.visualization.views;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.talend.designer.runtime.visualization.internal.actions.PreferencesAction;
import org.talend.designer.runtime.visualization.internal.ui.IHelpContextIds;

public class RuntimeVisualizationView extends ViewPart implements ITabbedPropertySheetPageContributor {

    /** The tree viewer. */
    private JvmTreeViewer treeViewer;

    /*
     * @see WorkbenchPart#createPartControl(Composite)
     */
    @Override
    public void createPartControl(Composite parent) {
        treeViewer = new JvmTreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, getViewSite().getActionBars());

        getSite().setSelectionProvider(treeViewer);
        createLocalToolBar();
        createLocalMenus();

        PlatformUI.getWorkbench().getHelpSystem().setHelp(treeViewer.getControl(), IHelpContextIds.JVM_EXPLORER_VIEW);
    }

    /*
     * @see WorkbenchPart#setFocus()
     */
    @Override
    public void setFocus() {
        treeViewer.getControl().setFocus();
    }

    /*
     * @see WorkbenchPart#dispose()
     */
    @Override
    public void dispose() {
        super.dispose();
        if (treeViewer != null) {
            treeViewer.dispose();
        }
    }

    /*
     * @see WorkbenchPart#getAdapter(Class)
     */
    @Override
    public Object getAdapter(@SuppressWarnings("rawtypes")
    Class adapter) {
        if (adapter == IPropertySheetPage.class) {
            return new TabbedPropertySheetPage(this) {

                @Override
                public void resizeScrolledComposite() {
                    // no scroll bar except for section itself
                }
            };
        }
        return super.getAdapter(adapter);
    }

    /*
     * @see ITabbedPropertySheetPageContributor#getContributorId()
     */
    @Override
    public String getContributorId() {
        return getSite().getId();
    }

    /**
     * Gets the selection.
     * 
     * @return The selection
     */
    protected ISelection getSelection() {
        return treeViewer.getSelection();
    }

    /**
     * Creates the local tool bar.
     */
    private void createLocalToolBar() {
        IToolBarManager manager = getViewSite().getActionBars().getToolBarManager();
        manager.add(new NewJvmConnectionAction(treeViewer));
        manager.update(false);
    }

    /**
     * Creates the local menus.
     */
    private void createLocalMenus() {
        IMenuManager manager = getViewSite().getActionBars().getMenuManager();
        manager.add(new PreferencesAction());
        manager.update(false);
    }
}