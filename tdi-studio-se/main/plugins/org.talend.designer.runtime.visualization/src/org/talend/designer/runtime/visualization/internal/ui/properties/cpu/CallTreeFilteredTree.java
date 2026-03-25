/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved. 
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.cpu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IActionBars;

/**
 * The call tree filtered tree.
 */
public class CallTreeFilteredTree extends AbstractFilteredTree {

    /**
     * The constructor.
     * 
     * @param parent
     *            The parent composite
     * @param actionBars
     *            The action bars
     */
    public CallTreeFilteredTree(Composite parent, IActionBars actionBars) {
        super(parent, actionBars);
    }

    /*
     * @see IConfigurableColumn#getColumns()
     */
    @Override
    public List<String> getColumns() {
        ArrayList<String> columnLabels = new ArrayList<String>();
        for (CallTreeColumn column : CallTreeColumn.values()) {
            columnLabels.add(column.label);
        }
        return columnLabels;
    }

    /*
     * @see IConfigurableColumn#getDefaultVisibility(String)
     */
    @Override
    public boolean getDefaultVisibility(String column) {
        return true;
    }

    /*
     * @see AbstractFilteredTree#getViewerType()
     */
    @Override
    public ViewerType getViewerType() {
        return ViewerType.CallTree;
    }

    /*
     * @see AbstractFilteredTree#configureTree()
     */
    @Override
    protected void configureTree() {
        for (TreeColumn column : getViewer().getTree().getColumns()) {
            column.dispose();
        }

        getViewer().getTree().setLinesVisible(true);
        getViewer().getTree().setHeaderVisible(true);

        for (Entry<String, Boolean> entry : columns.entrySet()) {
            CallTreeColumn column = CallTreeColumn.getColumn(entry.getKey());
            if (!columns.get(column.label)) {
                continue;
            }

            TreeColumn treeColumn = new TreeColumn(getViewer().getTree(),
                    SWT.NONE);
            treeColumn.setText(column.label);
            treeColumn.setWidth(column.defalutWidth);
            treeColumn.setAlignment(column.alignment);
            treeColumn.setToolTipText(column.toolTip);
        }
    }
}
