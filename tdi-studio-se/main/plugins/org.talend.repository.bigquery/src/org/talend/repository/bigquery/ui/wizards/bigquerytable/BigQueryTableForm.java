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
package org.talend.repository.bigquery.ui.wizards.bigquerytable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.talend.commons.ui.runtime.swt.tableviewer.TableViewerCreatorNotModifiable.LAYOUT_MODE;
import org.talend.commons.ui.swt.dialogs.ErrorDialogWidthDetailArea;
import org.talend.commons.ui.swt.formtools.Form;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator;
import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.cwm.helper.TaggedValueHelper;
import org.talend.repository.bigquery.BigQueryClientManager;
import org.talend.repository.bigquery.BigQueryPlugin;
import org.talend.repository.bigquery.TableColumnModel;
import org.talend.repository.bigquery.i18n.Messages;
import org.talend.repository.bigquery.ui.util.MetaTableHelper;
import org.talend.repository.bigquery.ui.wizards.AbstractBigQueryForm;
import org.talend.repository.bigquery.ui.wizards.widgetsmodel.BigQueryTableFieldModel;
import org.talend.repository.bigquery.ui.wizards.widgetsmodel.BigQueryTableMetadataTableView;
import org.talend.repository.model.IRepositoryNode.EProperties;

public class BigQueryTableForm extends AbstractBigQueryForm {

    protected MetadataTable selectedTable;

    protected List<? extends MetadataTable> initTables;

    private BigQueryTableFieldModel tableFieldModel;

    private BigQueryTableMetadataTableView metadataTableView;

    private Button refreshTableBtn;

    private Button removeTableBtn;

    private Label currentTableNameLabel;

    protected Table tableNavigator;

    private IWizardPage wizardPage;

    protected BigQueryClientManager clientManager;

    protected BigQueryTableForm(Composite parent, IWizardPage page, BigQueryClientManager clientManager, BigQueryConnection tempConnection,
            MetadataTable repTable) {
        super(parent, tempConnection, SWT.NONE);
        this.wizardPage = page;
        this.clientManager = clientManager;
        this.selectedTable = repTable;
        setupForm();
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void addFields() {
        int leftCompositeWidth = 125;
        int rightCompositeWidth = WIDTH_GRIDDATA_PIXEL - leftCompositeWidth;
        int headerHight = 30;
        int currentTableHeight = 210;
        int height = headerHight + currentTableHeight + 30;

        // Main Composite : 2 columns
        Composite mainComposite = Form.startNewDimensionnedGridLayout(this, 2, WIDTH_GRIDDATA_PIXEL, height);
        mainComposite.setLayout(new GridLayout(2, false));
        GridData gridData = new GridData(GridData.FILL_BOTH);
        mainComposite.setLayoutData(gridData);

        SashForm sash = new SashForm(mainComposite, SWT.NONE);
        GridData sashData = new GridData(GridData.FILL_BOTH);
        sash.setLayoutData(sashData);

        Composite leftComposite = Form.startNewDimensionnedGridLayout(sash, 1, leftCompositeWidth, height);
        Composite rightComposite = Form.startNewDimensionnedGridLayout(sash, 1, rightCompositeWidth, height);
        sash.setWeights(new int[] { 1, 4 });

        addTreeNavigator(leftComposite, leftCompositeWidth, height);

        SashForm rightSash = new SashForm(rightComposite, SWT.VERTICAL);
        sashData = new GridData(GridData.FILL_BOTH);
        rightSash.setLayoutData(sashData);

        Group currentTableGroup = Form.createGroup(rightSash, 1, Messages.getString("BigQueryTableForm.groupCurrentTable"), //$NON-NLS-1$
                currentTableHeight);

        Composite headerComposite = new Composite(currentTableGroup, SWT.NONE);
        // headerComposite.setBackground(getShell().getDisplay().getSystemColor(SWT.COLOR_GREEN));
        headerComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        headerComposite.setLayout(new GridLayout(3, false));
        Label name = new Label(headerComposite, SWT.NONE);
        name.setText(Messages.getString("BigQueryTableForm.currentTableName")); //$NON-NLS-1$

        currentTableNameLabel = new Label(headerComposite, SWT.NONE);
        GridData tableNameData = new GridData(SWT.BEGINNING, SWT.CENTER, true, false);

        tableNameData.minimumWidth = 250;
        currentTableNameLabel.setLayoutData(tableNameData);

        refreshTableBtn = new Button(headerComposite, SWT.NONE);
        refreshTableBtn.setText(Messages.getString("BigQueryTableForm.refreshTable")); //$NON-NLS-1$

        Composite compositeTable = Form.startNewDimensionnedGridLayout(currentTableGroup, 1, rightCompositeWidth, 20);
        // compositeTable.setBackground(getShell().getDisplay().getSystemColor(SWT.COLOR_YELLOW));
        compositeTable.setLayout(new FillLayout());
        tableFieldModel = new BigQueryTableFieldModel();
        metadataTableView = new BigQueryTableMetadataTableView(compositeTable, tableFieldModel,
                SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
        metadataTableView.setCurrentDbms("bigquery_id");
        metadataTableView.setShowDbTypeColumn(true, true, true);
        metadataTableView.setShowDbColumnName(true, false);
        metadataTableView.initGraphicComponents();

        rightSash.setBackground(getShell().getDisplay().getSystemColor(SWT.COLOR_WHITE));
        rightSash.setWeights(new int[] { 4 });

    }

    private void addTreeNavigator(Composite parent, int width, int height) {
        // Group
        Group group = Form.createGroup(parent, 1, Messages.getString("BigQueryTableForm.navigatorTree"), height); //$NON-NLS-1$

        // ScrolledComposite
        ScrolledComposite scrolledCompositeFileViewer = new ScrolledComposite(group, SWT.H_SCROLL | SWT.V_SCROLL | SWT.NONE);
        scrolledCompositeFileViewer.setExpandHorizontal(true);
        scrolledCompositeFileViewer.setExpandVertical(true);
        GridData gridData1 = new GridData(GridData.FILL_BOTH);
        gridData1.widthHint = width + 12;
        gridData1.heightHint = height;
        gridData1.horizontalSpan = 2;
        scrolledCompositeFileViewer.setLayoutData(gridData1);

        TableViewerCreator tableViewerCreator = new TableViewerCreator(scrolledCompositeFileViewer);
        tableViewerCreator.setHeaderVisible(false);
        tableViewerCreator.setColumnsResizableByDefault(false);
        tableViewerCreator.setBorderVisible(false);
        tableViewerCreator.setLinesVisible(false);
        tableViewerCreator.setLayoutMode(LAYOUT_MODE.NONE);
        tableViewerCreator.setCheckboxInFirstColumn(false);
        tableViewerCreator.setFirstColumnMasked(false);
        tableViewerCreator.setTriggerEditorActivate(false);

        tableNavigator = tableViewerCreator.createTable();
        tableNavigator.setLayoutData(new GridData(GridData.FILL_BOTH));

        TableColumn tableColumn = new TableColumn(tableNavigator, SWT.NONE);
        tableColumn.setWidth(width + 120);

        scrolledCompositeFileViewer.setContent(tableNavigator);
        scrolledCompositeFileViewer.setSize(width + 12, height);
        removeTableBtn = new Button(group, SWT.NONE);
        removeTableBtn.setText(Messages.getString("BigQueryTableForm.removeTableBtn"));//$NON-NLS-1$

    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.swt.widgets.Control#setVisible(boolean)
     */
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            initTreeNavigatorNodes();
            initMetadataForm();
            adaptFormToReadOnly();
        }
    }

    private void initMetadataForm() {
        MetadataTable tableDetailToShow = null;
        if (selectedTable != null) {
            tableDetailToShow = selectedTable;
        } else {
        	MetadataTable emptyTable = ConnectionFactory.eINSTANCE.createMetadataTable();
            tableDetailToShow = emptyTable;
            emptyTable.setLabel("");
            emptyTable.setName("");
        }
        String labelName = tableDetailToShow.getName();
        currentTableNameLabel.setText(labelName);
        tableFieldModel.setMetadataTable(tableDetailToShow);
        metadataTableView.setMetadataEditor(tableFieldModel);
        metadataTableView.getTableViewerCreator().layout();

    }

    protected void initTreeNavigatorNodes() {
        initTables = MetaTableHelper.getTables(tempConnection, true);
        if (!initTables.isEmpty()) {
            if (selectedTable == null) {
                selectedTable = initTables.get(initTables.size() - 1);
            }
        }
        tableNavigator.removeAll();
        for (MetadataTable element : initTables) {
            EMap<String, String> properties = element.getAdditionalProperties();
            String partitionKey = properties.get(EProperties.CONTENT_TYPE.name());
            String cdsType = TaggedValueHelper.getValueString(EProperties.CONTENT_TYPE.name(), element);
            TableItem subItem = new TableItem(tableNavigator, SWT.NONE);
            subItem.setText(element.getLabel());
            subItem.setData(element);
            if (element.getLabel().equals(selectedTable.getLabel())) {
                tableNavigator.setSelection(subItem);
            }
        }
    }

    @Override
    protected void addUtilsButtonListeners() {
        refreshTableBtn.addSelectionListener(new SelectionAdapter() {

            @SuppressWarnings("unchecked")
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (selectedTable == null) {
                    return;
                }
                try {
                    BigQueryConnection originalValueConnection = tempConnection;
                    clientManager.init(originalValueConnection);
                    boolean doit = MessageDialog.openConfirm(getShell(), Messages.getString("BigQueryTableForm.refreshTable.confirm"),
                            Messages.getString("BigQueryTableForm.refreshTable.message"));
                    if (doit) {
                    	final String dataSet = TaggedValueHelper.getTaggedValue("dataSet", selectedTable.getTaggedValue()).getValue();
                    	final String tableName = selectedTable.getName();
                        List<TableColumnModel> fields = clientManager.getTableMetadata(TaggedValueHelper.getTaggedValue("dataSet", selectedTable.getTaggedValue()).getValue(), tableName);
                        if (!fields.isEmpty()) {
                            MetaTableHelper.setEMFTableFields(dataSet, tableName, selectedTable, null, fields);
                            initMetadataForm();
                        }
                    }
                } catch (Exception e1) {
                    new ErrorDialogWidthDetailArea(getShell(), BigQueryPlugin.PLUGIN_ID, Messages.getString("BigQueryForm.checkFailure"),
                            ExceptionUtils.getFullStackTrace(e1));
                }
            }
        });

        removeTableBtn.addSelectionListener(new SelectionAdapter() {

            /*
             * (non-Javadoc)
             *
             * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
             */
            @Override
            public void widgetSelected(SelectionEvent e) {
                TableItem[] selection = tableNavigator.getSelection();
                if (selection.length != 0) {
                    boolean openConfirm = MessageDialog.openConfirm(getShell(), Messages.getString("BigQueryTableForm.confirm"), //$NON-NLS-1$
                            Messages.getString("BigQueryTableForm.detete_table")); //$NON-NLS-1$
                    if (openConfirm) {
                        List modelToRemove = new ArrayList();
                        int[] indices = new int[selection.length];
                        int lastIndex = 0;
                        for (int i = 0; i < selection.length; i++) {
                            indices[i] = tableNavigator.indexOf(selection[i]);
                            lastIndex = Math.max(lastIndex, indices[i]);
                            modelToRemove.add(selection[i].getData());
                        }
                        lastIndex++;
                        int itemCount = tableNavigator.getItemCount();
                        if (itemCount <= lastIndex) {
                            lastIndex = itemCount - 1;
                            Set<String> indexes = new HashSet<String>();
                            for (int index : indices) {
                                indexes.add(String.valueOf(index));
                            }
                            while (indexes.contains(String.valueOf(lastIndex))) {
                                lastIndex--;
                            }
                        }
                        if (0 <= lastIndex) {
                            tableNavigator.select(lastIndex);
                            selectedTable = (MetadataTable) tableNavigator.getItem(lastIndex).getData();
                        } else {
                            selectedTable = null;
                            setReadOnly(true);
                        }
                        tableNavigator.remove(indices);
                        initTables.removeAll(modelToRemove);
                        MetaTableHelper.removeMetadataTables(tempConnection, modelToRemove);
                        initMetadataForm();
                        if (tableNavigator.getSelection().length == 0) {
                            removeTableBtn.setSelection(false);
                        }
                    }
                }

            }
        });
    }

    @Override
    protected boolean checkFieldsValue() {
        updateStatus(IStatus.OK, null);
        return false;
    }

    @Override
    protected void addFieldsListeners() {
        tableNavigator.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                selectedTable = (MetadataTable) tableNavigator.getSelection()[0].getData();
                initMetadataForm();
                if (!isReadOnly()) {
                    removeTableBtn.setEnabled(true);
                }
            }

        });
        currentTableNameLabel.addControlListener(new ControlListener() {

            @Override
            public void controlMoved(ControlEvent e) {

            }

            @Override
            public void controlResized(ControlEvent e) {
                checkFieldsValue();
            }

        });
    }

    @Override
    protected void adaptFormToReadOnly() {
        refreshTableBtn.setEnabled(!isReadOnly());
        removeTableBtn.setEnabled(!isReadOnly());
        metadataTableView.setReadOnly(isReadOnly());
    }

}
