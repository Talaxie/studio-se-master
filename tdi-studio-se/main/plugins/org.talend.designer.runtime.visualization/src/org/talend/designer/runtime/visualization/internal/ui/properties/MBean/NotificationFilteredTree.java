/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.management.Notification;
import javax.management.ObjectName;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.internal.actions.ConfigureColumnsAction;
import org.talend.designer.runtime.visualization.internal.actions.CopyAction;
import org.talend.designer.runtime.visualization.internal.ui.IConfigurableColumns;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;

/**
 * The notification filtered tree.
 */
public class NotificationFilteredTree extends FilteredTree implements IConfigurableColumns, IPropertyChangeListener,
        IDoubleClickListener {

    /** The columns with visibility state. */
    private LinkedHashMap<String, Boolean> columns;

    /** The configure columns action. */
    ConfigureColumnsAction configureColumnsAction;

    /** The action to clear. */
    Action clearAction;

    /** The action to open details dialog. */
    NotificationDetailsDialogAction detailsAction;

    /** The notifications tab. */
    NotificationsTab notificationsTab;

    /** The property section. */
    private AbstractJvmPropertySection section;

    /**
     * The constructor.
     * 
     * @param notificationsTab The notifications tab
     * @param section The property section
     */
    protected NotificationFilteredTree(NotificationsTab notificationsTab, AbstractJvmPropertySection section) {
        super(notificationsTab, SWT.MULTI | SWT.FULL_SELECTION, new PatternFilter(), true);

        this.notificationsTab = notificationsTab;
        this.section = section;
        treeViewer.setLabelProvider(new NotificationsLabelProvider(treeViewer));
        treeViewer.setContentProvider(new NotificationsContentProvider());
        treeViewer.addDoubleClickListener(this);

        GridData gridData = new GridData(GridData.FILL_BOTH);
        gridData.horizontalIndent = 0;
        setLayoutData(gridData);

        loadColumnsPreference();
        configureTree();
        createContextMenu(section.getActionBars());
        setBackground(Display.getDefault().getSystemColor(SWT.COLOR_LIST_BACKGROUND));

        Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
    }

    /*
     * @see FilteredTree#createControl(Composite, int)
     */
    @Override
    protected void createControl(Composite composite, int treeStyle) {
        super.createControl(composite, treeStyle);

        // adjust the indentation of filter composite
        GridData data = (GridData) filterComposite.getLayoutData();
        data.horizontalIndent = 2;
        data.verticalIndent = 2;
        filterComposite.setLayoutData(data);
    }

    /*
     * @see IConfigurableColumn#getColumns()
     */
    @Override
    public List<String> getColumns() {
        ArrayList<String> columnLabels = new ArrayList<String>();
        NotificationColumn[] values = NotificationColumn.values();
        for (NotificationColumn value : values) {
            columnLabels.add(value.label);
        }
        return columnLabels;
    }

    /*
     * @see IConfigurableColumn#getId()
     */
    @Override
    public String getId() {
        return getClass().getName();
    }

    /*
     * @see IConfigurableColumn#getDefaultVisibility(String)
     */
    @Override
    public boolean getDefaultVisibility(String column) {
        return NotificationColumn.getColumn(column).initialVisibility;
    }

    /*
     * @see IPropertyChangeListener#propertyChange(PropertyChangeEvent)
     */
    @Override
    public void propertyChange(PropertyChangeEvent event) {
        if (!event.getProperty().equals(getId()) || getViewer().getTree().isDisposed()) {
            return;
        }

        String columnsString = (String) event.getNewValue();
        if (columnsString == null || columnsString.isEmpty()) {
            return;
        }

        setColumns(columnsString);
        configureTree();
        getViewer().refresh();
    }

    /*
     * @see IDoubleClickListener#doubleClick(Double@Override ClickEvent)
     */
    @Override
    public void doubleClick(DoubleClickEvent event) {
        detailsAction.run();
    }

    /*
     * @see Widget#dispose()
     */
    @Override
    public void dispose() {
        super.dispose();
        Activator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
    }

    /**
     * Sets the input.
     * 
     * @param objectName The object name
     */
    public void setInput(ObjectName objectName) {
        IActiveJvm jvm = section.getJvm();
        if (objectName == null || jvm == null) {
            treeViewer.setInput(null);
            return;
        }

        Notification[] notifications = jvm.getMBeanServer().getMBeanNotification().getNotifications(objectName);

        if (!isSameInput(notifications)) {
            treeViewer.setInput(notifications);
        }
    }

    /**
     * Checks if the given notifications are the same as current input.
     * 
     * @param notifications The notifications
     * @return <tt>true</tt> if the given notifications are the same as current input
     */
    private boolean isSameInput(Notification[] notifications) {
        Object input = treeViewer.getInput();
        if (!(input instanceof Notification[])) {
            return false;
        }

        Notification[] currentNotifications = (Notification[]) input;
        if (currentNotifications.length != notifications.length) {
            return false;
        }

        for (int i = 0; i < notifications.length; i++) {
            if (!notifications[i].toString().equals(currentNotifications[i].toString())) {
                return false;
            }
        }

        return true;
    }

    /**
     * Gets the previous item.
     * 
     * @return The previous item
     */
    protected Notification getPrevItem() {
        Object selectedItem = ((StructuredSelection) getViewer().getSelection()).getFirstElement();
        TreeItem[] items = getViewer().getTree().getItems();
        for (int i = 0; i < items.length; i++) {
            if (items[i].getData().equals(selectedItem) && i > 0) {
                return (Notification) items[i - 1].getData();
            }
        }
        return null;
    }

    /**
     * Gets the next item.
     * 
     * @return The next item
     */
    protected Notification getNextItem() {
        Object selectedItem = ((StructuredSelection) getViewer().getSelection()).getFirstElement();
        TreeItem[] items = getViewer().getTree().getItems();
        for (int i = 0; i < items.length; i++) {
            if (items[i].getData().equals(selectedItem) && i < items.length - 1) {
                return (Notification) items[i + 1].getData();
            }
        }
        return null;
    }

    /**
     * Selects the previous item.
     */
    protected void selectPrevItem() {
        Notification prevItem = getPrevItem();
        if (prevItem != null) {
            getViewer().setSelection(new StructuredSelection(prevItem), true);
        }
    }

    /**
     * Selects the next item.
     */
    protected void selectNextItem() {
        Notification nextItem = getNextItem();
        if (nextItem != null) {
            getViewer().setSelection(new StructuredSelection(nextItem), true);
        }
    }

    /**
     * Loads the columns preference.
     */
    private void loadColumnsPreference() {
        columns = new LinkedHashMap<String, Boolean>();
        String value = Activator.getDefault().getPreferenceStore().getString(getId());
        if (value.isEmpty()) {
            for (NotificationColumn column : NotificationColumn.values()) {
                columns.put(column.label, column.initialVisibility);
            }
        } else {
            setColumns(value);
        }
    }

    /**
     * Sets the columns with given column order and visibility.
     * 
     * @param columnData The column order and visibility
     */
    private void setColumns(String columnData) {
        columns.clear();
        for (String column : columnData.split(",")) { //$NON-NLS-1$
            String[] elemnets = column.split("="); //$NON-NLS-1$
            String columnName = elemnets[0];
            boolean columnVisibility = Boolean.valueOf(elemnets[1]);
            columns.put(columnName, columnVisibility);
        }
    }

    /**
     * Configure the tree adding columns.
     */
    private void configureTree() {
        Tree tree = getViewer().getTree();
        for (TreeColumn column : tree.getColumns()) {
            column.dispose();
        }

        tree.setLinesVisible(true);
        tree.setHeaderVisible(true);
        for (Entry<String, Boolean> entry : columns.entrySet()) {
            NotificationColumn column = NotificationColumn.getColumn(entry.getKey());
            if (!columns.get(column.label)) {
                continue;
            }

            TreeColumn treeColumn = new TreeColumn(getViewer().getTree(), SWT.NONE);
            treeColumn.setText(column.label);
            treeColumn.setWidth(column.defalutWidth);
            treeColumn.setAlignment(column.initialAlignment);
            treeColumn.setToolTipText(column.toolTip);
            treeColumn.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (e.widget instanceof TreeColumn) {
                        sortColumn((TreeColumn) e.widget);
                    }
                }
            });
        }
    }

    /**
     * Sorts the tree with given column.
     * 
     * @param treeColumn the tree column
     */
    void sortColumn(TreeColumn treeColumn) {
        int columnIndex = getViewer().getTree().indexOf(treeColumn);
        NotificationComparator sorter = (NotificationComparator) getViewer().getComparator();

        if (sorter != null && columnIndex == sorter.getColumnIndex()) {
            sorter.reverseSortDirection();
        } else {
            sorter = new NotificationComparator(columnIndex);
            getViewer().setComparator(sorter);
        }
        getViewer().getTree().setSortColumn(treeColumn);
        getViewer().getTree().setSortDirection(sorter.getSortDirection());
        getViewer().refresh();
    }

    /**
     * Creates the context menu.
     * 
     * @param actionBars The action bars
     */
    private void createContextMenu(IActionBars actionBars) {
        final CopyAction copyAction = CopyAction.createCopyAction(actionBars);
        clearAction = new Action(Messages.clearLabel) {

            @Override
            public void run() {
                notificationsTab.clear();
            }
        };
        detailsAction = new NotificationDetailsDialogAction(this);
        configureColumnsAction = new ConfigureColumnsAction(this);
        getViewer().addSelectionChangedListener(copyAction);
        getViewer().addSelectionChangedListener(detailsAction);

        MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {

            @Override
            public void menuAboutToShow(IMenuManager manager) {
                manager.add(copyAction);
                manager.add(new Separator());
                manager.add(clearAction);
                manager.add(new Separator());
                manager.add(configureColumnsAction);
                manager.add(new Separator());
                manager.add(detailsAction);
            }
        });

        Menu menu = menuMgr.createContextMenu(getViewer().getControl());
        getViewer().getControl().setMenu(menu);
    }
}
