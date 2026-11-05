// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.metadata.dialog;

import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.RGB;
import org.talend.commons.ui.runtime.swt.tableviewer.TableViewerCreatorColumnNotModifiable;
import org.talend.commons.ui.runtime.swt.tableviewer.behavior.DefaultTableLabelProvider;
import org.talend.commons.ui.swt.advanced.dataeditor.button.CasePushButton;
import org.talend.commons.ui.swt.advanced.dataeditor.button.QuotePushButton;
import org.talend.commons.ui.swt.advanced.dataeditor.button.ResetDBTypesPushButton;
import org.talend.commons.ui.swt.advanced.dataeditor.control.ExtendedPushButton;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator;
import org.talend.commons.ui.swt.tableviewer.behavior.DefaultCellModifier;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataToolHelper;
import org.talend.core.model.metadata.types.TypesManager;
import org.talend.core.ui.i18n.Messages;
import org.talend.core.ui.metadata.editor.AbstractMetadataTableEditorView;
import org.talend.core.ui.metadata.editor.MetadataTableEditorView;

/**
 * DOC nrousseau class global comment. Detailed comment <br/>
 *
 * $Id: talend-code-templates.xml 1 2006-09-29 17:06:40 +0000 (ven., 29 sept. 2006) nrousseau $
 *
 */
public class CustomTableManager {

    public static final Color CUSTOM_CELL_BG_COLOR = new Color(null, new RGB(0, 0xF0, 0));

    public static final Color CELL_READ_ONLY_COLOR = new Color(null, new RGB(0, 0xB0, 0));

    public static final Color TABLE_READ_ONLY_COLOR = new Color(null, new RGB(185, 185, 185));

    public static final Color CELL_WRONG_DB_TYPE_COLOR = new Color(null, new RGB(0xFF, 0x80, 0));

    public static void addCustomManagementToTable(final MetadataTableEditorView tableEditorView, final boolean readOnly) {
        CustomTableLabelProvider tableProvider = new CustomTableLabelProvider(tableEditorView, readOnly);
        tableEditorView.getTableViewerCreator().setLabelProvider(tableProvider);
        sizeDynamicDbTypeColumn(tableEditorView);
        tableEditorView.getTableViewerCreator().setCellModifier(
                new CustomTableCellModifier(tableEditorView.getTableViewerCreator()));
    }

    public static void addCustomManagementToToolBar(final MetadataTableEditorView tableEditorView, final IMetadataTable table,
            final boolean readOnly, final MetadataTableEditorView linkedTableEditorView, final IMetadataTable linkedTable,
            final boolean toPropagate) {
        tableEditorView.getTableViewerCreator().getTableViewer().addPostSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                updateToolBarButtonsOnSelection(event.getSelection(), tableEditorView, table, linkedTableEditorView, linkedTable,
                        readOnly);
            }

        });
        boolean isThereCustom = false;
        for (IMetadataColumn column : table.getListColumns()) {
            if (column.isCustom()) {
                isThereCustom = true;
            }
        }
        if (isThereCustom) {
            tableEditorView.getToolBar().getImportButton().getButton().setEnabled(false);
        }
        if (table.isReadOnly()) {
            tableEditorView.getToolBar().getAddButton().getButton().setEnabled(false);
            tableEditorView.getToolBar().getMoveDownButton().getButton().setEnabled(false);
            tableEditorView.getToolBar().getMoveUpButton().getButton().setEnabled(false);
            tableEditorView.getToolBar().getRemoveButton().getButton().setEnabled(false);
            tableEditorView.getToolBar().getPasteButton().getButton().setEnabled(false);
            ResetDBTypesPushButton resetDBTypesButton = tableEditorView.getToolBar().getResetDBTypesButton();
            if (resetDBTypesButton != null) {
                resetDBTypesButton.getButton().setEnabled(false);
            }
            CasePushButton caseButton = tableEditorView.getExtendedToolbar().getCaseButton();
            if (caseButton != null) {
                caseButton.getButton().setEnabled(false);
            }
            QuotePushButton quoteButton = tableEditorView.getExtendedToolbar().getQuoteButton();
            if (quoteButton != null) {
                quoteButton.getButton().setEnabled(false);
            }
        } else {
            tableEditorView.getToolBar().getAddButton().getButton().addSelectionListener(new SelectionListener() {

                public void widgetDefaultSelected(SelectionEvent e) {
                }

                public void widgetSelected(SelectionEvent e) {
                    table.sortCustomColumns();
                    tableEditorView.getTableViewerCreator().getTableViewer().refresh();
                }

            });
        }
        SelectionListener customListener = new SelectionListener() {

            public void widgetDefaultSelected(SelectionEvent e) {
            }

            public void widgetSelected(SelectionEvent e) {
                updateToolBarButtonsOnSelection(tableEditorView.getTableViewerCreator().getTableViewer().getSelection(),
                        tableEditorView, table, linkedTableEditorView, linkedTable, readOnly);
            }

        };
        tableEditorView.getToolBar().getRemoveButton().getButton().addSelectionListener(customListener);
        tableEditorView.getToolBar().getCopyButton().getButton().addSelectionListener(customListener);

        if (toPropagate) {
            if (linkedTable.isReadOnly()) {
                SelectionListener updateLinkedTableListener = new SelectionListener() {

                    public void widgetDefaultSelected(SelectionEvent e) {
                    }

                    public void widgetSelected(SelectionEvent e) {
                        MetadataToolHelper.copyTable(table, linkedTable);
                        linkedTableEditorView.getTableViewerCreator().refresh();
                        if (linkedTableEditorView != null) {
                            linkedTableEditorView.getTableViewerCreator().getTableViewer().refresh();
                        }
                    }

                };
                tableEditorView.getToolBar().getButtons();
                for (Object element2 : tableEditorView.getToolBar().getButtons()) {
                    ExtendedPushButton element = (ExtendedPushButton) element2;
                    element.getButton().addSelectionListener(updateLinkedTableListener);
                }
            }
        }
    }

    private static void updateToolBarButtonsOnSelection(ISelection currentSelection, MetadataTableEditorView tableEditorView,
            IMetadataTable table, final MetadataTableEditorView linkedTableEditorView, final IMetadataTable linkedTable,
            boolean readOnly) {
        IStructuredSelection selection = (IStructuredSelection) currentSelection;

        boolean isThereCustom = false;
        boolean isThereReadOnly = false;
        for (Iterator iter = selection.iterator(); iter.hasNext();) {
            IMetadataColumn column = (IMetadataColumn) iter.next();
            if (column.isCustom()) {
                isThereCustom = true;
            }
            if (column.isReadOnly()) {
                isThereReadOnly = true;
            }
        }

        if (isThereReadOnly) {
            tableEditorView.getToolBar().getRemoveButton().getButton().setEnabled(false);
        }

        if (isThereCustom || table.isReadOnly()) {
            tableEditorView.getToolBar().getMoveDownButton().getButton().setEnabled(false);
            tableEditorView.getToolBar().getMoveUpButton().getButton().setEnabled(false);
            tableEditorView.getToolBar().getRemoveButton().getButton().setEnabled(false);
            tableEditorView.getToolBar().getPasteButton().getButton().setEnabled(false);
            ResetDBTypesPushButton resetDBTypesButton = tableEditorView.getToolBar().getResetDBTypesButton();
            if (resetDBTypesButton != null) {
                resetDBTypesButton.getButton().setEnabled(false);
            }
            CasePushButton caseButton = tableEditorView.getExtendedToolbar().getCaseButton();
            if (caseButton != null) {
                caseButton.getButton().setEnabled(false);
            }
            QuotePushButton quoteButton = tableEditorView.getExtendedToolbar().getQuoteButton();
            if (quoteButton != null) {
                quoteButton.getButton().setEnabled(false);
            }
        }
        if (linkedTable != null) {
            if (linkedTable.isReadOnly() && linkedTableEditorView != null) {
                linkedTableEditorView.getToolBar().getPasteButton().getButton().setEnabled(false);
            }
        }

    }

    /**
     * DOC nrousseau CustomTableManager class global comment. Detailled comment <br/>
     *
     * $Id: talend-code-templates.xml 1 2006-09-29 17:06:40 +0000 (ven., 29 sept. 2006) nrousseau $
     *
     */
    private static class CustomTableLabelProvider extends DefaultTableLabelProvider {

        private boolean readOnly = false;

        MetadataTableEditorView tableEditorView;

        public CustomTableLabelProvider(final MetadataTableEditorView tableEditorView, final boolean readOnly) {
            super(tableEditorView.getTableViewerCreator());
            this.readOnly = readOnly;
            this.tableEditorView = tableEditorView;
        }

        @Override
        public String getColumnText(Object element, int columnIndex) {
            TableViewerCreatorColumnNotModifiable tableColumn = (TableViewerCreatorColumnNotModifiable) tableViewerCreator
                    .getColumns().get(columnIndex);
            if (isDynamicDbTypeCell(element, tableColumn.getId())) {
                return Messages.getString("CustomTableManager.DynamicDbType"); //$NON-NLS-1$
            }
            return super.getColumnText(element, columnIndex);
        }

        /*
         * (non-Javadoc)
         *
         * @see org.talend.commons.ui.swt.tableviewer.behavior.DefaultTableLabelProvider#getBackground(java.lang.Object,
         * int)
         */
        @Override
        public Color getBackground(Object element, int columnIndex) {
            if (!(element instanceof IMetadataColumn)) {
                return null;
            }
            IMetadataColumn column = (IMetadataColumn) element;
            TableViewerCreatorColumnNotModifiable tableColumn = (TableViewerCreatorColumnNotModifiable) tableViewerCreator
                    .getColumns().get(columnIndex);
            if (isDynamicDbTypeCell(column, tableColumn.getId())) {
                return AbstractMetadataTableEditorView.READONLY_CELL_BG_COLOR;
            }
            if (column.isCustom()) {
                if (column.isReadOnly() || readOnly || tableColumn.getId().equals(AbstractMetadataTableEditorView.ID_COLUMN_NAME)) {
                    return CELL_READ_ONLY_COLOR;
                } else {
                    return CUSTOM_CELL_BG_COLOR;
                }
            }
            if (column.isReadOnly()) {
                return TABLE_READ_ONLY_COLOR;
            }
            // qli modified to fix the bug 6654.
            if (tableEditorView.isShowTalendTypeColumn() && tableEditorView.getCurrentDbms() != null) {
                if (tableColumn.getId().equals(AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE) && !"".equals(column.getType()) //$NON-NLS-1$
                        && !TypesManager.checkDBType(tableEditorView.getCurrentDbms(), column.getTalendType(), column.getType())) {
                    return CELL_WRONG_DB_TYPE_COLOR;
                }
            }
            return super.getBackground(element, columnIndex);
        }
    }

    /** Keep the runtime type column compact without changing static-only schemas. */
    private static void sizeDynamicDbTypeColumn(MetadataTableEditorView view) {
        TableViewerCreator creator = view.getTableViewerCreator();
        if (creator.getTable() == null || creator.getInputList() == null) return;
        boolean dynamic = false;
        for (Object bean : creator.getInputList()) {
            if (isDynamicDbTypeCell(bean, AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE)) dynamic = true;
        }
        if (!dynamic) return;
        GC graphics = new GC(creator.getTable());
        try {
            graphics.setFont(creator.getTable().getFont());
            int width = (graphics.textExtent(Messages.getString("CustomTableManager.DynamicDbType")).x + 16) / 3; //$NON-NLS-1$
            for (Object entry : creator.getColumns()) {
                TableViewerCreatorColumnNotModifiable column = (TableViewerCreatorColumnNotModifiable) entry;
                if (AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE.equals(column.getId())) {
                    column.setMinimumWidth(width);
                    column.setWeight(3);
                    if (column.getTableColumn() != null) {
                        creator.getTable().getDisplay().asyncExec(() -> {
                            if (!creator.getTable().isDisposed() && !column.getTableColumn().isDisposed()) {
                                column.getTableColumn().setWidth(width);
                            }
                        });
                    }
                }
            }
        } finally {
            graphics.dispose();
        }
    }

    /** Dynamic represents runtime columns, never a single editable SQL column type. */
    private static boolean isDynamicDbTypeCell(Object element, String property) {
        return element instanceof IMetadataColumn
                && AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE.equals(property)
                && "id_Dynamic".equals(((IMetadataColumn) element).getTalendType()); //$NON-NLS-1$
    }

    /**
     * DOC nrousseau class global comment. Detailled comment <br/>
     *
     * $Id: talend-code-templates.xml 1 2006-09-29 17:06:40 +0000 (ven., 29 sept. 2006) nrousseau $
     *
     */
    private static class CustomTableCellModifier extends DefaultCellModifier {

        public CustomTableCellModifier(TableViewerCreator tableViewerCreator) {
            super(tableViewerCreator);
        }

        /*
         * (non-Javadoc)
         *
         * @see org.talend.commons.ui.swt.tableviewer.behavior.DefaultCellModifier#canModify(java.lang.Object,
         * java.lang.String)
         */
        @Override
        public boolean canModify(Object element, String property) {
            if (isDynamicDbTypeCell(element, property)) {
                return false;
            }
            if (element instanceof IMetadataColumn) {
                IMetadataColumn column = (IMetadataColumn) element;
                if (column.isReadOnly() || (column.isCustom() && property.equals(AbstractMetadataTableEditorView.ID_COLUMN_NAME))) {
                    return false;
                }
            }
            return super.canModify(element, property);
        }
    }
}
