// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.bigquery.ui.wizards.widgetsmodel;

import java.util.Map;

import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.runtime.swt.tableviewer.behavior.ColumnCellModifier;
import org.talend.commons.ui.runtime.swt.tableviewer.behavior.IColumnColorProvider;
import org.talend.commons.ui.runtime.swt.tableviewer.behavior.IColumnImageProvider;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator.CELL_EDITOR_STATE;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreatorColumn;
import org.talend.commons.ui.swt.tableviewer.celleditor.DialogErrorForCellEditorListener;
import org.talend.commons.ui.swt.tableviewer.tableeditor.CheckboxTableEditorContent;
import org.talend.commons.utils.data.bean.IBeanPropertyAccessors;
import org.talend.core.model.metadata.builder.connection.MetadataColumn;
import org.talend.core.ui.metadata.editor.MetadataEmfTableEditorView;
import org.talend.repository.bigquery.i18n.Messages;

public class BigQueryTableMetadataTableView extends MetadataEmfTableEditorView {


    public BigQueryTableMetadataTableView(Composite parent, BigQueryTableFieldModel extendedTableModel, int style) {
        super(parent, style, extendedTableModel, false, false, false, false);
    }

    public void setMetadataEditor(BigQueryTableFieldModel metadataTableEditor) {
        setExtendedTableModel(metadataTableEditor);
    }

    @Override
    public TableViewerCreator<MetadataColumn> getTableViewerCreator() {
        return getExtendedTableViewer().getTableViewerCreator();
    }

    @Override
    protected void createColumns(TableViewerCreator<MetadataColumn> tableViewerCreator, Table table) {
        tableViewerCreator.setReadOnly(false);
        TableViewerCreatorColumn column = new TableViewerCreatorColumn(tableViewerCreator);
        column.setTitle("");
        column.setDefaultInternalValue("");
        column.setWidth(15);

        configureNameColumn(tableViewerCreator);
        configureDbColumnName(tableViewerCreator);
        configureKeyColumn(tableViewerCreator);
        configureTypeColumns(tableViewerCreator);
        configurePatternColumn(tableViewerCreator);
        configureLengthColumn(tableViewerCreator);
        configurePrecisionColumn(tableViewerCreator);
        configureCommentColumn(tableViewerCreator);
    }

    @Override
    protected void configureDbColumnName(TableViewerCreator<MetadataColumn> tableViewerCreator) {
        TableViewerCreatorColumn column;
        column = new TableViewerCreatorColumn(tableViewerCreator);
        column.setId(ID_COLUMN_DBCOLUMNNAME);
        column.setTitle(Messages.getString("BigQueryTableMetadataTableView.dbColumnName"));
        column.setToolTipHeader(Messages.getString("BigQueryTableMetadataTableView.dbColumnName"));
        column.setBeanPropertyAccessors(getDbColumnNameAccessor());
        column.setWeight(25);
        column.setModifiable(!isReadOnly());
        column.setMinimumWidth(45);
        final TextCellEditor cellEditor = new TextCellEditor(tableViewerCreator.getTable());
        column.setCellEditor(cellEditor);
        column.setColumnCellModifier(new ColumnCellModifier(column) {

            @Override
            public boolean canModify(Object bean) {
                return super.canModify(bean);
            }

        });
        if (!dbColumnNameWritable) {
            column.setColorProvider(new IColumnColorProvider() {

                @Override
                public Color getBackgroundColor(Object bean) {
                    return READONLY_CELL_BG_COLOR;
                }

                @Override
                public Color getForegroundColor(Object bean) {
                    return null;
                }

            });
        }
    }

    @Override
    protected void configureNameColumn(TableViewerCreator<MetadataColumn> tableViewerCreator) {
        TableViewerCreatorColumn column;
        column = new TableViewerCreatorColumn(tableViewerCreator);
        column.setId(ID_COLUMN_NAME);
        column.setTitle(Messages.getString("BigQueryTableMetadataTableView.columnName"));
        column.setToolTipHeader(Messages.getString("BigQueryTableMetadataTableView.columnName"));

        column.setBeanPropertyAccessors(getLabelAccessor());
        final Image imageKey = ImageProvider.getImage(EImage.KEY_ICON);
        final Image imageEmpty = ImageProvider.getImage(EImage.EMPTY);
        column.setImageProvider(new IColumnImageProvider() {

            @Override
            public Image getImage(Object element) {
                if (getKeyAccesor().get((MetadataColumn) element)) {
                    return imageKey;
                } else {
                    return imageEmpty;
                }
            }

        });
        column.setWeight(25);
        column.setModifiable(!isReadOnly());
        column.setMinimumWidth(45);
        final TextCellEditor cellEditor = new TextCellEditorExtendTab(tableViewerCreator.getTable());
        cellEditor.addListener(new DialogErrorForCellEditorListener(cellEditor, column) {

            @Override
            public void newValidValueTyped(int itemIndex, Object previousValue, Object newValue, CELL_EDITOR_STATE state) {
            }

            @Override
            public String validateValue(String newValue, int beanPosition) {
                return validateColumnName(newValue, beanPosition);
            }

        });
        column.setCellEditor(cellEditor);
    }

    protected void configurIsMandatoryForSelectionColumn(TableViewerCreator<MetadataColumn> tableViewerCreator) {
        TableViewerCreatorColumn column;
        column = new TableViewerCreatorColumn(tableViewerCreator);
        column.setTitle(Messages.getString("BigQueryTableMetadataTableView.IsMandatoryForSelectionTitle"));
        column.setToolTipHeader(Messages.getString("BigQueryTableMetadataTableView.IsMandatoryForSelectionTitle"));
        //column.setId(BigQueryConstants.ID_COLUMN_IS_MANDATORY_FOR_SELECTION);
        column.setModifiable(false);
        column.setBeanPropertyAccessors(getIsMandatoryForSelectionAccesor());
        column.setWidth(80);
        column.setDisplayedValue("");
        CheckboxTableEditorContent checkbox = new CheckboxTableEditorContent();
        column.setTableEditorContent(checkbox);
        checkbox.setToolTipText(Messages.getString("BigQueryTableMetadataTableView.IsMandatoryForSelectionTitle"));
    }

    protected void configurCanBeUsedForIntervalSelectionColumn(TableViewerCreator<MetadataColumn> tableViewerCreator) {
        TableViewerCreatorColumn column;
        column = new TableViewerCreatorColumn(tableViewerCreator);
        column.setTitle(Messages.getString("BigQueryTableMetadataTableView.canBeUsedForIntervalSelectionTitle"));
        column.setToolTipHeader(Messages.getString("BigQueryTableMetadataTableView.canBeUsedForIntervalSelectionTitle"));
        //column.setId(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_INTERVAL_SELECTION);
        column.setModifiable(false);
        column.setBeanPropertyAccessors(getCanBeUsedForIntervalSelectionAccesor());
        column.setWidth(80);
        column.setDisplayedValue("");
        CheckboxTableEditorContent checkbox = new CheckboxTableEditorContent();
        column.setTableEditorContent(checkbox);
        checkbox.setToolTipText(Messages.getString("BigQueryTableMetadataTableView.canBeUsedForIntervalSelectionTitle"));
    }

    protected void configurCanBeUsedForPatternSelectionColumn(TableViewerCreator<MetadataColumn> tableViewerCreator) {
        TableViewerCreatorColumn column;
        column = new TableViewerCreatorColumn(tableViewerCreator);
        column.setTitle(Messages.getString("BigQueryTableMetadataTableView.canBeUsedForPatternSelectionTitle"));
        column.setToolTipHeader(Messages.getString("BigQueryTableMetadataTableView.canBeUsedForPatternSelectionTitle"));
        //column.setId(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_PATTERN_SELECTION);
        column.setModifiable(false);
        column.setBeanPropertyAccessors(getCanBeUsedForPatternSelectionAccesor());
        column.setWidth(80);
        column.setDisplayedValue("");
        CheckboxTableEditorContent checkbox = new CheckboxTableEditorContent();
        column.setTableEditorContent(checkbox);
        checkbox.setToolTipText(Messages.getString("BigQueryTableMetadataTableView.canBeUsedForPatternSelectionTitle"));
    }

    protected void configurCanBeUsedForSingleSelectionColumn(TableViewerCreator<MetadataColumn> tableViewerCreator) {
        TableViewerCreatorColumn column;
        column = new TableViewerCreatorColumn(tableViewerCreator);
        column.setTitle(Messages.getString("BigQueryTableMetadataTableView.canBeUsedForSingleSelectionTitle"));
        column.setToolTipHeader(Messages.getString("BigQueryTableMetadataTableView.canBeUsedForSingleSelectionTitle"));
        //column.setId(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_SINGLE_SELECTION);
        column.setModifiable(false);
        column.setBeanPropertyAccessors(getCanBeUsedForSingleSelectionAccesor());
        column.setWidth(80);
        column.setDisplayedValue("");
        CheckboxTableEditorContent checkbox = new CheckboxTableEditorContent();
        column.setTableEditorContent(checkbox);
        checkbox.setToolTipText(Messages.getString("BigQueryTableMetadataTableView.canBeUsedForSingleSelectionTitle"));
    }

    @Override
    protected IBeanPropertyAccessors<MetadataColumn, String> getLabelAccessor() {
        return new IBeanPropertyAccessors<MetadataColumn, String>() {

            @Override
            public String get(MetadataColumn bean) {
                return bean.getLabel();
            }

            @Override
            public void set(MetadataColumn bean, String value) {
                if (bean.getLabel().equals(bean.getName())) {
                    String oldValue = bean.getName();
                    bean.setOriginalField(value);
                }
                bean.setLabel(value);
            }

        };

    }

    @Override
    protected IBeanPropertyAccessors<MetadataColumn, String> getDbColumnNameAccessor() {

        return new IBeanPropertyAccessors<MetadataColumn, String>() {

            @Override
            public String get(MetadataColumn bean) {
                return bean.getOriginalField();
            }

            @Override
            public void set(MetadataColumn bean, String value) {
                String name = bean.getName();
                bean.setOriginalField(value);
                /*
                if (bean instanceof BigQueryTableField && name != null && !name.equals(value)) {
                    ((BigQueryTableField) bean).getRefTable().clear();

                }
                */
            }

        };

    }

    protected IBeanPropertyAccessors<MetadataColumn, Boolean> getIsMandatoryForSelectionAccesor() {
        return new IBeanPropertyAccessors<MetadataColumn, Boolean>() {

            @Override
            public Boolean get(MetadataColumn bean) {
                Map<String, String> properties = bean.getProperties();
                /* TODO
                if (properties.containsKey(BigQueryConstants.ID_COLUMN_IS_MANDATORY_FOR_SELECTION)) {
                    return Boolean.parseBoolean(properties.get(BigQueryConstants.ID_COLUMN_IS_MANDATORY_FOR_SELECTION));
                }
                */
                return new Boolean(false);
            }

            @Override
            public void set(MetadataColumn bean, Boolean value) {
                Map<String, String> properties = bean.getProperties();
                /* TODO
                properties.put(BigQueryConstants.ID_COLUMN_IS_MANDATORY_FOR_SELECTION, String.valueOf(value));
                */
            }

        };
    }

    protected IBeanPropertyAccessors<MetadataColumn, Boolean> getCanBeUsedForIntervalSelectionAccesor() {
        return new IBeanPropertyAccessors<MetadataColumn, Boolean>() {

            @Override
            public Boolean get(MetadataColumn bean) {
                Map<String, String> properties = bean.getProperties();
                /* TODO
                if (properties.containsKey(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_INTERVAL_SELECTION)) {
                    return Boolean.parseBoolean(properties.get(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_INTERVAL_SELECTION));
                }
                */
                return new Boolean(false);
            }

            @Override
            public void set(MetadataColumn bean, Boolean value) {
                Map<String, String> properties = bean.getProperties();
                /*
                properties.put(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_INTERVAL_SELECTION, String.valueOf(value));
                */
            }

        };
    }

    protected IBeanPropertyAccessors<MetadataColumn, Boolean> getCanBeUsedForPatternSelectionAccesor() {
        return new IBeanPropertyAccessors<MetadataColumn, Boolean>() {

            @Override
            public Boolean get(MetadataColumn bean) {
                Map<String, String> properties = bean.getProperties();
                /* TODO
                if (properties.containsKey(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_PATTERN_SELECTION)) {
                    return Boolean.parseBoolean(properties.get(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_PATTERN_SELECTION));
                }
                */
                return new Boolean(false);
            }

            @Override
            public void set(MetadataColumn bean, Boolean value) {
                Map<String, String> properties = bean.getProperties();
                /*
                properties.put(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_PATTERN_SELECTION, String.valueOf(value));
                */
            }

        };
    }

    protected IBeanPropertyAccessors<MetadataColumn, Boolean> getCanBeUsedForSingleSelectionAccesor() {
        return new IBeanPropertyAccessors<MetadataColumn, Boolean>() {

            @Override
            public Boolean get(MetadataColumn bean) {
                Map<String, String> properties = bean.getProperties();
                /*
                if (properties.containsKey(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_SINGLE_SELECTION)) {
                    return Boolean.parseBoolean(properties.get(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_SINGLE_SELECTION));
                }
                */
                return new Boolean(false);
            }

            @Override
            public void set(MetadataColumn bean, Boolean value) {
                Map<String, String> properties = bean.getProperties();
                /*
                properties.put(BigQueryConstants.ID_COLUMN_CAN_BE_USED_FOR_SINGLE_SELECTION, String.valueOf(value));
                */
            }

        };
    }

}
