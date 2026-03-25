/*******************************************************************************
 * Copyright (c) 2010-2011 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.MBean;

import java.util.ArrayList;
import java.util.List;

import javax.management.Attribute;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.views.properties.PropertySheet;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.ISharedImages;
import org.talend.designer.runtime.visualization.JvmCoreException;
import org.talend.designer.runtime.visualization.internal.actions.CopyAction;
import org.talend.designer.runtime.visualization.internal.actions.ShowInTimelineAction;
import org.talend.designer.runtime.visualization.internal.ui.RefreshJob;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;
import org.talend.designer.runtime.visualization.internal.ui.properties.PropertiesFilteredTree;
import org.talend.designer.runtime.visualization.internal.ui.properties.timeline.MBeanAttribute;

/**
 * The attributes tab.
 */
public class AttributesTab extends AbstractMBeanTab {

    /** The boolean items for combo box. */
    static final String[] BOOLEAN_ITEMS = new String[] { Boolean.TRUE.toString(), Boolean.FALSE.toString() };

    /** The attribute viewer. */
    TreeViewer viewer;

    /** The state indicating if tab is selected. */
    boolean selected;

    /** The state indicating if editor is activated. */
    boolean editorActivated;

    /** The attribute content provider. */
    AttributeContentProvider contentProvider;

    /** The filtered tree. */
    private PropertiesFilteredTree filteredTree;

    /**
     * The constructor.
     * 
     * @param tabFolder The tab folder
     * @param section The property section
     */
    public AttributesTab(CTabFolder tabFolder, AbstractJvmPropertySection section) {
        super(tabFolder, section);

        tabFolder.setSelection(tabItem);
        selected = true;
        editorActivated = false;

        tabFolder.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                if (e.item instanceof CTabItem) {
                    CTabItem item = (CTabItem) e.item;
                    if (item.equals(tabItem)) {
                        selected = true;
                    } else {
                        selected = false;
                    }
                }
            }
        });

        createViewer(section.getPropertySheet());
    }

    @Override
    protected void selectionChanged() {
        showPage(filteredTree);
        refresh(true);
    }

    @Override
    void performRefresh() {
        refresh(false);
    }

    @Override
    String getTabText() {
        return Messages.attributesTabLabel;
    }

    @Override
    String getTabImagePath() {
        return ISharedImages.ATTRIBUTE_IMG_PATH;
    }

    /**
     * Creates the viewer.
     * 
     * @param propertySheet The property sheet
     */
    private void createViewer(PropertySheet propertySheet) {
        filteredTree = new PropertiesFilteredTree(this, propertySheet.getViewSite().getActionBars()) {

            private ShowInTimelineAction showInTimelineAction;

            @Override
            protected List<Action> createActions(IActionBars actionBars) {
                List<Action> actions = new ArrayList<Action>();
                CopyAction copyAction = CopyAction.createCopyAction(actionBars);
                actions.add(copyAction);
                showInTimelineAction = new MyShowInTimelineAction(section);
                actions.add(showInTimelineAction);
                return actions;
            }

            @Override
            public void menuAboutToshow() {
                // do nothing
            }
        };
        viewer = filteredTree.getViewer();
        filteredTree.setEditingSupport(new MyEditingSupport(viewer));
        contentProvider = new AttributeContentProvider();
        viewer.setContentProvider(contentProvider);
        viewer.setLabelProvider(new AttributeLabelProvider(viewer));
        viewer.setInput(new Object());
    }

    /**
     * Refreshes.
     * 
     * @param force True to force refresh
     */
    private void refresh(final boolean force) {
        if (!force && (!selected || editorActivated)) {
            return;
        }

        new RefreshJob(Messages.refreshAttributeTabJobLabel, toString()) {

            @Override
            protected void refreshModel(IProgressMonitor monitor) {
                IActiveJvm jvm = section.getJvm();
                if (jvm != null && objectName != null && jvm.isConnected() && !section.isRefreshSuspended() || force) {
                    try {
                        contentProvider.refresh(jvm, objectName);
                    } catch (JvmCoreException e) {
                        indicateNotSupported(e);
                        return;
                    }
                }
            }

            @Override
            protected void refreshUI() {
                if (!viewer.getControl().isDisposed()) {
                    viewer.refresh();
                }
            }
        }.schedule();
    }

    /**
     * The editing support.
     */
    private class MyEditingSupport extends EditingSupport {

        /**
         * The constructor.
         * 
         * @param viewer The viewer
         */
        public MyEditingSupport(ColumnViewer viewer) {
            super(viewer);
        }

        /*
         * @see EditingSupport#getCellEditor(Object)
         */
        @Override
        protected CellEditor getCellEditor(Object element) {
            editorActivated = true;
            if (element instanceof AttributeNode) {
                AttributeNode node = (AttributeNode) element;
                CellEditor editor;
                if (node.getValue() instanceof Boolean) {
                    editor = new ComboBoxCellEditor(viewer.getTree(), BOOLEAN_ITEMS);
                } else {
                    editor = new TextCellEditor(viewer.getTree());
                }
                editor.addListener(new ICellEditorListener() {

                    @Override
                    public void editorValueChanged(boolean oldValidState, boolean newValidState) {
                        // do nothing
                    }

                    @Override
                    public void cancelEditor() {
                        editorActivated = false;
                    }

                    @Override
                    public void applyEditorValue() {
                        editorActivated = false;
                    }
                });
                return editor;
            }
            return null;
        }

        /*
         * @see EditingSupport#canEdit(Object)
         */
        @Override
        protected boolean canEdit(Object element) {
            if (element instanceof AttributeNode) {
                AttributeNode node = (AttributeNode) element;
                return node.isWritable();
            }
            return false;
        }

        /*
         * @see EditingSupport#getValue(Object)
         */
        @Override
        protected Object getValue(Object element) {
            if (element instanceof AttributeNode) {
                AttributeNode node = (AttributeNode) element;
                Object value = node.getValue();
                if (value instanceof Boolean) {
                    return Boolean.TRUE.equals(value) ? 0 : 1;
                }
                return String.valueOf(value);
            }
            return element;
        }

        /*
         * @see EditingSupport#setValue(Object, Object)
         */
        @Override
        protected void setValue(Object element, final Object value) {
            if (!(element instanceof AttributeNode)) {
                return;
            }

            final AttributeNode node = (AttributeNode) element;

            new RefreshJob(Messages.setPropertyValueJobLabel, String.valueOf(value.hashCode())) {

                @Override
                protected void refreshModel(IProgressMonitor monitor) {
                    Object adjustedValue = value;
                    try {
                        if (node.getValue() instanceof Boolean) {
                            adjustedValue = ((Integer) value) == 0 ? Boolean.TRUE : Boolean.FALSE;
                        } else if (node.getValue() instanceof Number) {
                            try {
                                adjustedValue = getNumber(node.getValue().getClass(), (String) value);
                            } catch (NumberFormatException e) {
                                return;
                            }
                        }
                        IActiveJvm jvm = section.getJvm();
                        if (jvm == null) {
                            return;
                        }
                        jvm.getMBeanServer().setAttribute(objectName, new Attribute(node.getName(), adjustedValue));
                    } catch (JvmCoreException e) {
                        // not supported
                        if (Activator.getDefault().isDebugging()) {
                            Activator.log(Messages.setMBeanAttributeFailedMsg, e);
                        }
                    }
                }

                @Override
                protected void refreshUI() {
                    refresh();
                }
            }.schedule();
        }

        /**
         * Gets the number corresponding to the given class and value.
         * 
         * @param clazz The class extending <tt>Number</tt>
         * @param value The value
         * @return The number
         */
        protected Number getNumber(Class<?> clazz, String value) {
            if (clazz == Byte.class) {
                return Byte.valueOf(value);
            } else if (clazz == Short.class) {
                return Short.valueOf(value);
            } else if (clazz == Integer.class) {
                return Integer.valueOf(value);
            } else if (clazz == Long.class) {
                return Long.valueOf(value);
            } else if (clazz == Float.class) {
                return Float.valueOf(value);
            } else if (clazz == Double.class) {
                return Double.valueOf(value);
            }
            return null;
        }
    }

    /**
     * The action to show the attribute in timeline.
     */
    private class MyShowInTimelineAction extends ShowInTimelineAction {

        /**
         * The constructor.
         * 
         * @param section The property section
         */
        public MyShowInTimelineAction(AbstractJvmPropertySection section) {
            super(section);
        }

        /*
         * @see ShowInTimelineAction#getMBeanAttribute(Object)
         */
        @Override
        public MBeanAttribute getMBeanAttribute(Object element) {
            if (!(element instanceof AttributeNode)) {
                return null;
            }

            // get qualified attribute name
            AttributeNode node = (AttributeNode) element;
            String qualifiedName = node.getName();
            while (node.getParent() != null) {
                node = node.getParent();
                qualifiedName = node.getName() + '.' + qualifiedName;
            }

            return new MBeanAttribute(objectName, qualifiedName, getRGB(qualifiedName));
        }

        /*
         * @see ShowInTimelineAction#getEnabled(Object)
         */
        @Override
        protected boolean getEnabled(Object element) {
            if (!(element instanceof AttributeNode)) {
                return false;
            }

            AttributeNode attribute = (AttributeNode) element;
            return (attribute.getValue() instanceof Number);
        }

        /**
         * Gets the arbitrary RGB with given string.
         * 
         * @param string The string to determine RGB
         * @return The RGB
         */
        private RGB getRGB(String string) {
            int hashCode = string.hashCode();
            int r = (hashCode >> 3) % 256;
            int g = (hashCode >> 1) % 256;
            int b = hashCode % 256;
            return new RGB(Math.abs(r), Math.abs(g), Math.abs(b));
        }
    }
}
