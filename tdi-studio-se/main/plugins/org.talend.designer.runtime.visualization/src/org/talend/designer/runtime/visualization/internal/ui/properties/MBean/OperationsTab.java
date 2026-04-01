/*******************************************************************************
 * Copyright (c) 2010-2011 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import java.util.ArrayList;
import java.util.List;

import javax.management.MBeanInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.ISharedImages;
import org.talend.designer.runtime.visualization.JvmCoreException;
import org.talend.designer.runtime.visualization.internal.ui.RefreshJob;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;

/**
 * The operations tab.
 */
public class OperationsTab extends AbstractMBeanTab {

    /** The table viewer. */
    TableViewer tableViewer;

    /** The action to invoke MBean operation. */
    InvokeAction invokeAction;

    /** The content provider. */
    OperationsContentProvider contentProvider;

    /**
     * The constructor.
     * 
     * @param tabFolder The tab folder
     * @param section The property section
     */
    public OperationsTab(CTabFolder tabFolder, AbstractJvmPropertySection section) {
        super(tabFolder, section);

        tableViewer = new TableViewer(this, SWT.NONE);
        tableViewer.setLabelProvider(new OperationsLabelProvider());
        contentProvider = new OperationsContentProvider();
        tableViewer.setContentProvider(contentProvider);

        createContextMenu();
        configureTable();
    }

    @Override
    public void selectionChanged() {
        showPage(tableViewer.getControl());
        tableViewer.setInput(objectName);
        invokeAction.selectionChanged(objectName);
        contentProvider.refresh(null);
        tableViewer.refresh();

        refresh();
    }

    @Override
    void performRefresh() {
        new RefreshJob(Messages.refreshOperationsTabJobLabel, toString()) {

            /** The MBean operations. */
            private MBeanOperationInfo[] operations;

            @Override
            protected void refreshModel(IProgressMonitor monitor) {
                IActiveJvm jvm = section.getJvm();
                if (jvm == null || !jvm.isConnected()) {
                    return;
                }

                MBeanInfo info = null;
                if (objectName != null) {
                    try {
                        info = jvm.getMBeanServer().getMBeanInfo(objectName);
                    } catch (JvmCoreException e) {
                        indicateNotSupported(e);
                        return;
                    }
                }

                if (info != null) {
                    operations = getValidOperations(info.getOperations());
                    contentProvider.refresh(operations);
                }
            }

            @Override
            protected void refreshUI() {
                if (operations == null || operations.length == 0) {
                    tabItem.dispose();
                    return;
                }

                if (tabItem.isDisposed()) {
                    addTabItem();
                }

                if (!tableViewer.getControl().isDisposed()) {
                    tableViewer.refresh();
                }
            }
        }.schedule();
    }

    @Override
    String getTabText() {
        return Messages.operationsTabLabel;
    }

    @Override
    String getTabImagePath() {
        return ISharedImages.METHOD_IMG_PATH;
    }

    /**
     * Gets the valid MBean operations.
     * 
     * @param operations
     * @return The valid MBean operations
     */
    static MBeanOperationInfo[] getValidOperations(MBeanOperationInfo[] operations) {
        List<MBeanOperationInfo> validOperations = new ArrayList<MBeanOperationInfo>();
        for (MBeanOperationInfo operation : operations) {
            boolean invalid = false;
            MBeanParameterInfo[] signature = operation.getSignature();
            for (int i = 0; i < signature.length; i++) {
                String name = signature[i].getName();
                String type = signature[i].getType();
                String description = signature[i].getDescription();
                if (name == null || type == null || description == null) {
                    invalid = true;
                    signature[i] = new MBeanParameterInfo(getNonNull(name), getNonNull(type), getNonNull(description),
                            signature[i].getDescriptor());
                }
            }

            if (invalid) {
                operation = new MBeanOperationInfo(operation.getName(), operation.getDescription(), signature,
                        operation.getReturnType(), operation.getImpact(), operation.getDescriptor());
            }
            validOperations.add(operation);
        }
        return validOperations.toArray(new MBeanOperationInfo[validOperations.size()]);
    }

    /**
     * Gets the non null string.
     * 
     * @param string The string
     * @return The given string or empty string if null is given
     */
    private static String getNonNull(String string) {
        return string == null ? "" : string; //$NON-NLS-1$
    }

    /**
     * Configure the table adding columns.
     */
    private void configureTable() {
        Table table = tableViewer.getTable();
        if (table.isDisposed()) {
            return;
        }

        table.setLinesVisible(true);
        table.setHeaderVisible(true);

        TableColumn column = new TableColumn(table, SWT.NONE);
        column.setText(Messages.operationColumnLabel);
        column.setWidth(300);
        column.setToolTipText(Messages.operationColumnToolTip);
    }

    /**
     * Creates the context menu.
     */
    private void createContextMenu() {

        // create actions
        invokeAction = new InvokeAction(tableViewer, section);
        tableViewer.addSelectionChangedListener(invokeAction);

        // create menu manager
        MenuManager menuMgr = new MenuManager("#PopupMenu"); //$NON-NLS-1$
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {

            @Override
            public void menuAboutToShow(IMenuManager manager) {
                manager.add(invokeAction);
            }
        });

        // create context menu
        Menu menu = menuMgr.createContextMenu(tableViewer.getControl());
        tableViewer.getControl().setMenu(menu);
    }
}