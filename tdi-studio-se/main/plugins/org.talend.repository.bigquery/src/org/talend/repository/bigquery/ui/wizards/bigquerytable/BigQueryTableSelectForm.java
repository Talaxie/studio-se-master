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

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.swt.dialogs.ErrorDialogWidthDetailArea;
import org.talend.commons.ui.swt.formtools.Form;
import org.talend.commons.ui.swt.formtools.LabelledText;
import org.talend.commons.utils.threading.AbsRetrieveColumnRunnable;
import org.talend.commons.utils.threading.CustomMapThreadPoolExecutor;
import org.talend.core.model.metadata.builder.connection.BigQueryConnection;
import org.talend.core.model.metadata.builder.connection.MetadataTable;
import org.talend.repository.bigquery.BigQueryClientManager;
import org.talend.repository.bigquery.BigQueryPlugin;
import org.talend.repository.bigquery.TableColumnModel;
import org.talend.repository.bigquery.TableModel;
import org.talend.repository.bigquery.i18n.Messages;
import org.talend.repository.bigquery.ui.util.MetaTableHelper;
import org.talend.repository.bigquery.ui.wizards.AbstractBigQueryForm;

public class BigQueryTableSelectForm extends AbstractBigQueryForm {

    protected final String SEARCH_GROUP = Messages.getString("BigQueryTableSelectForm.searchGroup");

    protected final String SREARCH_ALL = "*";

    protected final String BUTTON_SELECT_ALL = Messages.getString("BigQueryTableSelectForm.selectAllBtn");

    protected final String BUTTON_SELECT_NONE = Messages.getString("BigQueryTableSelectForm.selectNoneBtn");

    protected final String BUTTON_SEARCH = Messages.getString("BigQueryTableSelectForm.searchBtn");

    protected final String SEARCH_TABLES = Messages.getString("BigQueryTableSelectForm.searchTables");

    protected final String PENDING = Messages.getString("BigQueryTableSelectForm.pending");

    protected final String COLUMN_NAME = Messages.getString("BigQueryTableSelectForm.columnName");

    protected final String COLUMN_DESCRIPTION = Messages.getString("BigQueryTableSelectForm.columnDesc");

    protected final String COLUMN_NUMBER = Messages.getString("BigQueryTableSelectForm.columnNum");

    protected final String COLUMN_STATUS = Messages.getString("BigQueryTableSelectForm.columnStatus");

    protected final String STATUS_CHECK_FAIL = Messages.getString("BigQueryForm.checkFailure");

    protected final String STATUS_UNSUPPORTED_OPERATION = Messages.getString("BigQueryTableSelectForm.unsupportedOperation");

    protected final String STATUS_CONN_FAIL = Messages.getString("BigQueryTableSelectForm.connectionFailure");

    protected final String STATUS_CHECK_SUCCESS = Messages.getString("BigQueryTableSelectForm.success");

    protected final String STATUS_FAIL = Messages.getString("BigQueryTableSelectForm.failure");

    private Table table;

    protected CheckboxTableViewer tableViewer;

    protected Button selectAllBtn;

    protected Button selectNoneBtn;
    
    protected LabelledText datasetFilter;

    protected LabelledText nameFilter;

    protected Button searchButton;

    protected BigQueryClientManager clientManager;

    protected BigQueryTableSelectWizardPage parentWizardPage;

    protected CustomMapThreadPoolExecutor threadExecutor;

    protected String locker = "";

    // store column number for each table name
    protected final Map<String, Integer> tableColumnNums = new HashMap<String, Integer>();

    protected boolean isCancelled = false;

    protected volatile Map<String, Boolean> retrievedSchemas = new HashMap<String, Boolean>();

    protected BigQueryTableSelectForm(Composite parent, BigQueryTableSelectWizardPage wizardPage, BigQueryClientManager clientManager,
    		BigQueryConnection tempConneciton) {
        super(parent, tempConneciton, SWT.BORDER);
        this.parentWizardPage = wizardPage;
        threadExecutor = new CustomMapThreadPoolExecutor(5, 10, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        this.clientManager = clientManager;
        init();
        setupForm();
    }

    protected void init() {
        try {
            BigQueryConnection originalValueConnection = tempConnection;
            if (!originalValueConnection.isContextMode()) {
                clientManager.init(originalValueConnection);
            } else {
                clientManager.init(originalValueConnection, getContextModeManager(originalValueConnection));
            }
        } catch (Exception ex) {
            new ErrorDialogWidthDetailArea(getShell(), BigQueryPlugin.PLUGIN_ID, STATUS_CHECK_FAIL,
                    ExceptionUtils.getFullStackTrace(ex));
        }
    }

    @Override
    protected boolean checkFieldsValue() {
        return false;
    }

    @Override
    protected void initialize() {

    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }

    protected synchronized void initExistingNames() {
        existingNames = new ArrayList<String>();
        List<MetadataTable> bigqueryTables = MetaTableHelper.getTables(tempConnection);
        for (MetadataTable bigqueryTable : bigqueryTables) {
            if (!existingNames.contains(bigqueryTable.getLabel())) {
                existingNames.add(bigqueryTable.getLabel());
            }
        }
    }

    @Override
    protected void addUtilsButtonListeners() {
        searchButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {

                IRunnableWithProgress searchJob = new IRunnableWithProgress() {

                    @Override
                    public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

                        Display.getDefault().syncExec(new Runnable() {

                            @Override
                            public void run() {
                                searchTables(monitor);
                            }
                        });
                    }

                };
                try {
                    parentWizardPage.getWizard().getContainer().run(false, true, searchJob);
                } catch (InvocationTargetException e1) {
                    Throwable targetException = e1.getTargetException();
                    if (targetException != null && targetException instanceof NoSuchMethodError) {
                        new ErrorDialogWidthDetailArea(getShell(), BigQueryPlugin.PLUGIN_ID, STATUS_UNSUPPORTED_OPERATION,
                                ExceptionUtils.getFullStackTrace(targetException));
                    } else {
                        ExceptionHandler.process(e1);
                    }
                } catch (InterruptedException e1) {
                    ExceptionHandler.process(e1);
                }

            }
        });

        selectAllBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(final SelectionEvent e) {
                try {
                    parentWizardPage.getWizard().getContainer().run(true, true, new IRunnableWithProgress() {

                        @Override
                        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

                                @Override
                                public void run() {
                                    monitor.beginTask("extract Columns", table.getItems().length);
                                    int length = table.getItems().length;
                                    for (int i = 0; i < length; i++) {
                                        monitor.worked(1);
                                        TableItem item = table.getItems()[i];
                                        if (!item.getChecked()) {
                                            setItemTextForStatusColumn(item);
                                            retrievedSchemas.put(((TableModel)item.getData()).getName(), false);
                                            if (parentWizardPage.isPageComplete()) {
                                                parentWizardPage.setPageComplete(false);
                                            }
                                            updateTableItem(item);
                                        }
                                        if (monitor.isCanceled()) {
                                            isCancelled = true;
                                        }
                                    }
                                    monitor.done();
                                }
                            });
                        }

                    });
                } catch (InvocationTargetException e1) {
                    ExceptionHandler.process(e1);
                } catch (InterruptedException e1) {
                    ExceptionHandler.process(e1);
                }
            }
        });

        selectNoneBtn.addSelectionListener(new SelectionAdapter() {

            /*
             * (non-Javadoc)
             *
             * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
             */
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (!threadExecutor.getQueue().isEmpty() || threadExecutor.getActiveCount() > 0) {
                    return;
                }
                retrievedSchemas.clear();
                for (TableItem item : table.getItems()) {
                    clearTableItem(item);
                }
                parentWizardPage.setPageComplete(false);
            }
        });

    }

    protected void setItemTextForStatusColumn(TableItem item) {
        item.setText(3, PENDING);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.ui.swt.utils.AbstractForm#addFields()
     */
    @Override
    protected void addFields() {
        Group group = Form.createGroup(this, 5, SEARCH_GROUP, 120);
        GridData gridDataFileLocation = new GridData(GridData.FILL_HORIZONTAL);
        group.setLayoutData(gridDataFileLocation);
        
        datasetFilter = new LabelledText(group, "Dataset");
        datasetFilter.setText("");
        datasetFilter.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        nameFilter = new LabelledText(group, "Name");
        nameFilter.setText(SREARCH_ALL);
        nameFilter.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        searchButton = new Button(group, SWT.NONE);
        searchButton.setText(BUTTON_SEARCH);
        createTable();

        Composite footComposite = new Composite(this, SWT.NONE);
        footComposite.setLayout(new GridLayout(2, true));
        footComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        selectAllBtn = new Button(footComposite, SWT.NONE);
        selectAllBtn.setText(BUTTON_SELECT_ALL);
        selectAllBtn.setLayoutData(new GridData(SWT.END, SWT.CENTER, true, false));

        selectNoneBtn = new Button(footComposite, SWT.NONE);
        selectNoneBtn.setText(BUTTON_SELECT_NONE);
        selectNoneBtn.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));

    }

    protected void createTable() {
        Composite tableComposite = new Composite(this, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.marginTop = 15;
        tableComposite.setLayout(layout);
        GridData gDatat = new GridData(GridData.FILL_BOTH);
        tableComposite.setLayoutData(gDatat);
        table = new Table(tableComposite, SWT.CHECK | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        tableViewer = new CheckboxTableViewer(table);

        TableColumn nameCol = new TableColumn(table, SWT.NONE);
        nameCol.setText(COLUMN_NAME);
        nameCol.setWidth(150);
        TableColumn descCol = new TableColumn(table, SWT.NONE);
        descCol.setText(COLUMN_DESCRIPTION);
        descCol.setWidth(150);
        TableColumn columnsCol = new TableColumn(table, SWT.NONE);
        columnsCol.setText(COLUMN_NUMBER);
        columnsCol.setWidth(125);
        TableColumn statusCol = new TableColumn(table, SWT.NONE);
        statusCol.setText(COLUMN_STATUS);
        statusCol.setWidth(150);
        GridData layoutData = new GridData(GridData.FILL_BOTH);
        table.setLayoutData(layoutData);

        tableViewer.setContentProvider(new IStructuredContentProvider() {

            @Override
            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

            }

            @Override
            public void dispose() {

            }

            @Override
            public Object[] getElements(Object inputElement) {
                if (inputElement instanceof List) {
                    return ((List) inputElement).toArray();
                }
                return null;

            }
        });
        tableViewer.setLabelProvider(new ITableLabelProvider() {

            @Override
            public Image getColumnImage(Object element, int columnIndex) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public String getColumnText(Object element, int columnIndex) {
                return getColumnTextWithType(element, columnIndex);
            }

            @Override
            public void addListener(ILabelProviderListener listener) {
            }

            @Override
            public void dispose() {
            }

            @Override
            public boolean isLabelProperty(Object element, String property) {
                return false;
            }

            @Override
            public void removeListener(ILabelProviderListener listener) {
            }

        });

        addTableSelectionListener();
    }

    protected void addTableSelectionListener() {
        table.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                if (e.detail == SWT.CHECK) {
                    TableItem tableItem = (TableItem) e.item;
                    
                    TableModel data = (TableModel) tableItem.getData();
                    if (tableItem.getChecked()) {
                        List<MetadataTable> existedTables = MetaTableHelper.getTables(getConnection());
                        MetadataTable existedTable = null;
                        for (MetadataTable table : existedTables) {
                            if (table.getName().equals(data.getName())) {
                            	existedTable = table;
                            }
                        }
                        if (existedTable != null) {
                            // if exist , remove from connection and retrieve again.
                            MetaTableHelper.removeMetadataTable(getConnection(), existedTable);
                        }
                        tableItem.setText(3, PENDING);
                        retrievedSchemas.put(data.getName(), false);
                        parentWizardPage.setPageComplete(false);
                        updateTableItem(tableItem);
                    } else {
                        clearTableItem(tableItem);
                        if (retrievedSchemas.containsKey(data.getName())) {
                            retrievedSchemas.remove(data.getName());
                        }
                        parentWizardPage.setPageComplete(threadExecutor.getQueue().isEmpty()
                                && threadExecutor.getActiveCount() <= 1 && getCheckedSchemaStatus());
                    }
                }
            }
        });
    }

    protected String getColumnTextWithType(Object element, int columnIndex) {
        if (element instanceof TableModel) {
        	TableModel table = (TableModel) element;
            switch (columnIndex) {
            case 0:
                return table.getName();
            case 1:
                return table.getDescription();
            default:
                break;
            }
        }
        return "";
    }

    protected void clearTableItem(TableItem item) {
        item.setChecked(false);
        item.setText(2, "");
        item.setText(3, "");
        TableModel tableDesc = (TableModel) item.getData();
        List<MetadataTable> existedTables = MetaTableHelper.getTables(getConnection());
        Iterator<MetadataTable> iterator = existedTables.iterator();
        while (iterator.hasNext()) {
            MetadataTable next = iterator.next();
            if (next.getName() != null && next.getName().equals(tableDesc.getName())) {
                MetaTableHelper.removeMetadataTable(getConnection(), next);
            }
        }
        AbsRetrieveColumnRunnable runnable = threadExecutor.getRunnable(item);
        if (runnable != null) {
            runnable.setCanceled(true);
        }
    }

    protected void updateTableItem(TableItem treeItem) {
        treeItem.setChecked(true);
        if (!threadExecutor.isThreadRunning(treeItem)) {
            RetrieveColumnRunnable runnable = new RetrieveColumnRunnable(treeItem);
            threadExecutor.execute(runnable);
        } else {
            AbsRetrieveColumnRunnable runnable = threadExecutor.getRunnable(treeItem);
            runnable.setCanceled(false);
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.ui.swt.utils.AbstractForm#addFieldsListeners()
     */
    @Override
    protected void addFieldsListeners() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.ui.swt.utils.AbstractForm#adaptFormToReadOnly()
     */
    @Override
    protected void adaptFormToReadOnly() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void processWhenDispose() {
        if (threadExecutor != null) {
            threadExecutor.clearThreads();
        }
    }

    protected void searchTables(final IProgressMonitor monitor) {
        try {
            searchButton.setEnabled(false);
            monitor.beginTask(SEARCH_TABLES, 100);
            BigQueryConnection originalValueConnection = tempConnection;
            clientManager.init(originalValueConnection);
            monitor.worked(20);
            
            List<TableModel> listTables = clientManager.searchTables(datasetFilter.getText(), nameFilter.getText());
            if(listTables.isEmpty()) {
               new ErrorDialogWidthDetailArea(getShell(), BigQueryPlugin.PLUGIN_ID, Messages.getString("BigQueryTableSelectForm.nothingToFind"), "");
            }
            
            monitor.worked(20);
            tableViewer.setInput(listTables);
            monitor.worked(20);
            // init checked status
            List<TableModel> selectedTables = new ArrayList<>();
            List<MetadataTable> existedTables = MetaTableHelper.getTables(tempConnection);
            if (existedTables != null && !existedTables.isEmpty()) {
                retrievedSchemas.clear();
            }
            for (MetadataTable existedTable : existedTables) {
                for (TableModel tableDesc : listTables) {
                    if (existedTable.getName() != null && existedTable.getName().equals(tableDesc.name)) {
                        selectedTables.add(tableDesc);
                        retrievedSchemas.put(tableDesc.name, true);
                    }
                }
            }
            tableViewer.setCheckedElements(selectedTables.toArray());
            searchButton.setEnabled(true);
            
            monitor.done();
        } catch (Exception ex) {
            new ErrorDialogWidthDetailArea(getShell(), BigQueryPlugin.PLUGIN_ID, STATUS_CHECK_FAIL,
                    ExceptionUtils.getFullStackTrace(ex));
        }
    }

    protected boolean getCheckedSchemaStatus() {
        if (retrievedSchemas.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, Boolean> entry : retrievedSchemas.entrySet()) {
            if (!entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public class RetrieveColumnRunnable extends AbsRetrieveColumnRunnable {

        protected TableItem tableItem;

        protected Object tableDesc;

        protected Exception exception;

        protected List<TableColumnModel> tableFields = null;

        protected RetrieveColumnRunnable(TableItem treeItem) {
            this.tableItem = treeItem;
            this.tableDesc = treeItem.getData();
        }

        @Override
        public void run() {
            try {
                if (isCanceled() || isCancelled) {
                    return;
                }
                
                final String dataSet = ((TableModel) tableDesc).getDataSet();
                final String tableName = ((TableModel) tableDesc).getName();
                try {
                	tableFields = clientManager.getTableMetadata(dataSet, tableName);
                } catch (Exception e) {
                    exception = e;
                    ExceptionHandler.process(e);
                }

                if (isCanceled() || isCancelled) {
                    return;
                }

                synchronized (locker) {
                    if (tableFields != null && !tableFields.isEmpty()) {
                        initExistingNames();
                        MetadataTable createBigQueryTable = MetaTableHelper.setEMFTableFields(dataSet, tableName, null, existingNames,
                        		tableFields);
                        MetaTableHelper.addMetadataTable(getConnection(), createBigQueryTable);
                    }
                }
            } catch (Exception e) {
                exception = e;
                ExceptionHandler.process(e);
            } finally {
                Display.getDefault().syncExec(new Runnable() {

                    @Override
                    public void run() {
                        if (isCanceled()) {
                            return;
                        }
                        updateUIInThreadIfThread();
                    }
                });
            }
        }

        public void updateUIInThreadIfThread() {
            if (tableItem.isDisposed()) {
                return;
            }

            if (exception == null) {
                tableItem.setText(2, "" + tableFields.size());
                tableItem.setText(3, STATUS_CHECK_SUCCESS);
                Color blackColor = getDisplay().getSystemColor(SWT.COLOR_BLACK);
                tableItem.setForeground(blackColor);
                retrievedSchemas.put(((TableModel) tableDesc).getName(), true);
                tableColumnNums.put(tableItem.getText(0), tableFields.size());
            } else {
                tableItem.setText(3, STATUS_FAIL);
                Color redColor = getDisplay().getSystemColor(SWT.COLOR_RED);
                tableItem.setForeground(redColor);
                updateStatus(IStatus.WARNING, STATUS_CONN_FAIL);

            }

            updateStatus(IStatus.OK, null);

            parentWizardPage.setPageComplete(
                    threadExecutor.getQueue().isEmpty() && threadExecutor.getActiveCount() <= 1 && getCheckedSchemaStatus());
        }
    }

}
