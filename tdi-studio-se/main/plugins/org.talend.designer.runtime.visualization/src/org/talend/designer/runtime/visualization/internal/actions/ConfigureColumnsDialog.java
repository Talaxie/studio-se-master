/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.preferences.ViewSettingsDialog;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.internal.ui.IConfigurableColumns;

/**
 * The dialog to configure columns.
 */
public class ConfigureColumnsDialog extends ViewSettingsDialog {

    /** The columns viewer. */
    CheckboxTableViewer columnsViewer;

    /** The up button. */
    private Button upButton;

    /** The down button. */
    private Button downButton;

    /** The select-all button. */
    private Button selectAllButton;

    /** The deselect-all button. */
    private Button deselectAllButton;

    /** The configurable columns. */
    private IConfigurableColumns columns;

    /**
     * The constructor.
     * 
     * @param columns The configurable columns
     */
    protected ConfigureColumnsDialog(IConfigurableColumns columns) {
        super(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
        this.columns = columns;
    }

    /*
     * @see Window#configureShell(Shell)
     */
    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText(Messages.configureColumnsTitle);
    }

    /*
     * @see Dialog#createDialogArea(Composite)
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        Composite inner = new Composite(composite, SWT.NONE);
        inner.setLayoutData(new GridData(GridData.FILL_BOTH));
        GridLayout layout = new GridLayout();
        layout.numColumns = 2;
        layout.marginHeight = 0;
        layout.marginWidth = 0;
        inner.setLayout(layout);

        createColumnsViewer(inner);
        createButtons(inner);

        loadPreference();
        applyDialogFont(composite);

        return composite;
    }

    /*
     * @see Dialog#okPressed()
     */
    @Override
    protected void okPressed() {
        storePreference();
        super.okPressed();
    }

    /*
     * @see ViewSettingsDialog#performDefaults()
     */
    @Override
    protected void performDefaults() {
        List<String> columnNames = columns.getColumns();
        columnsViewer.setInput(columnNames);
        for (String columnName : columnNames) {
            columnsViewer.setChecked(columnName, columns.getDefaultVisibility(columnName));
        }
    }

    /**
     * Creates the columns viewer.
     * 
     * @param parent The parent composite
     */
    private void createColumnsViewer(Composite parent) {
        Label label = new Label(parent, SWT.NONE);
        label.setText(Messages.configureColumnsMessage);
        GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        gridData.horizontalSpan = 2;
        label.setLayoutData(gridData);

        columnsViewer = CheckboxTableViewer.newCheckList(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
        columnsViewer.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
        columnsViewer.setLabelProvider(new LabelProvider());
        columnsViewer.setContentProvider(new ArrayContentProvider());
    }

    /**
     * Creates the buttons.
     * 
     * @param parent The parent composite
     */
    private void createButtons(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setLayoutData(new GridData(GridData.FILL_VERTICAL));
        GridLayout layout = new GridLayout();
        layout.marginHeight = 0;
        layout.marginWidth = 0;
        composite.setLayout(layout);

        upButton = new Button(composite, SWT.PUSH);
        upButton.setText(Messages.upLabel);
        setButtonLayoutData(upButton);
        upButton.addSelectionListener(new SelectionAdapter() {

            @SuppressWarnings("unchecked")
            @Override
            public void widgetSelected(SelectionEvent e) {
                moveUp(((IStructuredSelection) columnsViewer.getSelection()).toList());
            }
        });

        downButton = new Button(composite, SWT.PUSH);
        downButton.setText(Messages.downLabel);
        setButtonLayoutData(downButton);
        downButton.addSelectionListener(new SelectionAdapter() {

            @SuppressWarnings("unchecked")
            @Override
            public void widgetSelected(SelectionEvent e) {
                moveDown(((IStructuredSelection) columnsViewer.getSelection()).toList());
            }
        });

        selectAllButton = new Button(composite, SWT.PUSH);
        selectAllButton.setText(Messages.selectAllLabel);
        setButtonLayoutData(selectAllButton);
        selectAllButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                columnsViewer.setAllChecked(true);
            }
        });

        deselectAllButton = new Button(composite, SWT.PUSH);
        deselectAllButton.setText(Messages.deselectAllLabel);
        setButtonLayoutData(deselectAllButton);
        deselectAllButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                columnsViewer.setAllChecked(false);
            }
        });
    }

    /**
     * Stores the current preference.
     */
    private void storePreference() {
        List<Object> checkedColumns = Arrays.asList(columnsViewer.getCheckedElements());

        StringBuffer columnsString = new StringBuffer();

        for (String column : getColumns()) {
            if (columnsString.length() != 0) {
                columnsString.append(',');
            }
            boolean checked = checkedColumns.contains(column);
            columnsString.append(column).append('=').append(checked);
        }

        Activator.getDefault().getPreferenceStore().setValue(columns.getId(), columnsString.toString());
    }

    /**
     * Loads the preference.
     */
    private void loadPreference() {
        String columnsString = Activator.getDefault().getPreferenceStore().getString(columns.getId());
        if (columnsString.isEmpty()) {
            performDefaults();
        } else {
            setColumns(columnsString);
        }
    }

    /**
     * Sets the columns with the given string that contains pairs of column name and visibility.
     * 
     * @param columnsString The columns string
     */
    private void setColumns(String columnsString) {
        ArrayList<String> columnNames = new ArrayList<String>();
        ArrayList<String> visibleColumns = new ArrayList<String>();
        for (String column : columnsString.split(",")) { //$NON-NLS-1$
            String[] elemnets = column.split("="); //$NON-NLS-1$
            String columnName = elemnets[0];
            boolean columnVisibility = Boolean.valueOf(elemnets[1]);

            columnNames.add(columnName);
            if (columnVisibility) {
                visibleColumns.add(columnName);
            }
        }

        columnsViewer.setInput(columnNames);
        columnsViewer.setCheckedElements(visibleColumns.toArray(new String[0]));
    }

    /**
     * Gets the columns.
     * 
     * @return The columns
     */
    @SuppressWarnings("unchecked")
    private List<String> getColumns() {
        return (List<String>) columnsViewer.getInput();
    }

    /**
     * Moves the items up.
     * 
     * @param items The items to move up
     */
    void moveUp(List<String> items) {
        if (items.size() > 0 && !items.get(0).equals(getColumns().get(0))) {
            for (String item : items) {
                moveUp(item);
            }
        }
    }

    /**
     * Moves the items down.
     * 
     * @param items The items to move down
     */
    void moveDown(List<String> items) {
        if (items.size() > 0 && !items.get(items.size() - 1).equals(getColumns().get(getColumns().size() - 1))) {
            for (int i = items.size() - 1; i >= 0; i--) {
                moveDown(items.get(i));
            }
        }
    }

    /**
     * Moves the item up.
     * 
     * @param item The item to move up
     */
    private void moveUp(String item) {
        String movedColumn = null;
        List<String> newColumns = new ArrayList<String>();
        for (String column : getColumns()) {

            if (!column.equals(item) || movedColumn == null) {
                newColumns.add(column);
                movedColumn = column;
                continue;
            }

            newColumns.remove(movedColumn);
            newColumns.add(column);
            newColumns.add(movedColumn);
        }
        columnsViewer.setInput(newColumns);
    }

    /**
     * Moves the item down.
     * 
     * @param item The item to move down
     */
    private void moveDown(String item) {
        String movedColumn = null;
        List<String> newColumns = new ArrayList<String>();
        for (String column : getColumns()) {

            if (column.equals(item)) {
                movedColumn = item;
                continue;
            }

            newColumns.add(column);

            if (movedColumn != null) {
                newColumns.add(movedColumn);
                movedColumn = null;
            }
        }
        columnsViewer.setInput(newColumns);
    }
}