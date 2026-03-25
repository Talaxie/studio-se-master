/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.thread;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.internal.actions.ConfigureColumnsAction;
import org.talend.designer.runtime.visualization.internal.actions.CopyAction;
import org.talend.designer.runtime.visualization.internal.ui.IConfigurableColumns;

/**
 * The thread filtered tree.
 */
public class ThreadFilteredTree extends FilteredTree implements IConfigurableColumns, IPropertyChangeListener {

    /** The columns with visibility state. */
    private LinkedHashMap<String, Boolean> columns;

    /** The configure columns action. */
    ConfigureColumnsAction configureColumnsAction;

    /**
     * The constructor.
     * 
     * @param parent The parent composite
     * @param actionBars The action bars
     */
    protected ThreadFilteredTree(Composite parent, IActionBars actionBars) {
        super(parent, SWT.MULTI | SWT.FULL_SELECTION, new PatternFilter(), true);

        loadColumnsPreference();
        configureTree();
        createContextMenu(actionBars);
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
        ThreadColumn[] values = ThreadColumn.values();
        for (ThreadColumn value : values) {
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
        return true;
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
     * @see Widget#dispose()
     */
    @Override
    public void dispose() {
        super.dispose();
        Activator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
    }

    /**
     * Loads the columns preference.
     */
    private void loadColumnsPreference() {
        columns = new LinkedHashMap<String, Boolean>();
        String value = Activator.getDefault().getPreferenceStore().getString(getId());
        if (value.isEmpty()) {
            for (ThreadColumn column : ThreadColumn.values()) {
                columns.put(column.label, true);
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
        for (TreeColumn column : getViewer().getTree().getColumns()) {
            column.dispose();
        }

        getViewer().getTree().setLinesVisible(true);
        getViewer().getTree().setHeaderVisible(true);
        for (Entry<String, Boolean> entry : columns.entrySet()) {
            ThreadColumn column = ThreadColumn.getColumn(entry.getKey());
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
        ThreadComparator sorter = (ThreadComparator) getViewer().getComparator();

        if (sorter != null && columnIndex == sorter.getColumnIndex()) {
            sorter.reverseSortDirection();
        } else {
            sorter = new ThreadComparator(columnIndex);
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
        configureColumnsAction = new ConfigureColumnsAction(this);
        final CopyAction copyAction = CopyAction.createCopyAction(actionBars);
        getViewer().addSelectionChangedListener(copyAction);

        MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {

            @Override
            public void menuAboutToShow(IMenuManager manager) {
                manager.add(copyAction);
                manager.add(new Separator());
                manager.add(configureColumnsAction);
            }
        });

        Menu menu = menuMgr.createContextMenu(getViewer().getControl());
        getViewer().getControl().setMenu(menu);
    }
}
