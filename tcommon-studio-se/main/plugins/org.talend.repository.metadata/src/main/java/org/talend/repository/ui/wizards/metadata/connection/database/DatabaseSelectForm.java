// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.wizards.metadata.connection.database;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class DatabaseSelectForm extends Composite {

    private DatabaseSearchControl searchControl;

    private DatabaseListViewer databaseListViewer;

    private DatabaseSelectWizardPage wizardPage;

    public DatabaseSelectForm(Composite parent, DatabaseSelectWizardPage wizardPage, int style) {
        super(parent, style);
        this.wizardPage = wizardPage;
        GridLayoutFactory.fillDefaults().margins(0, 0).applyTo(this);
        initControl();
    }

    protected void initControl() {
        searchControl = new DatabaseSearchControl(this);
        searchControl.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        databaseListViewer = new DatabaseListViewer(this, wizardPage, SWT.BORDER);
        databaseListViewer.setContentProvider(ArrayContentProvider.getInstance());
        setViewInputByFilter(null);

        Text findText = searchControl.getTextControl();
        findText.addModifyListener((e) -> setViewInputByFilter(findText.getText()));

        // if in future the performance is not good, use these listeners instead of modify listener
        // addListeners(findText);
    }

    @SuppressWarnings("unused")
    private void addListeners(Text findText) {
        // click Find/Clear icons
        findText.addSelectionListener(SelectionListener.widgetDefaultSelectedAdapter(e -> {
            if (e.detail == SWT.ICON_SEARCH) {
                setViewInputByFilter(findText.getText());
            } else if (e.detail == SWT.ICON_CANCEL) {
                setViewInputByFilter(null);
            }
            e.doit = false;
        }));
        // press Enter
        findText.addTraverseListener((e) -> {
            if (e.detail == SWT.TRAVERSE_RETURN) {
                setViewInputByFilter(findText.getText());
                e.doit = false;
            }
        });
    }

    public String getSelectedDB() {
        return databaseListViewer.getSelectedDB();
    }

    private void setViewInputByFilter(String keyword) {
        List<String> displayDBTypeList = DBDisplayHelper.getDisplayDBTypes();
        String[] input;
        if (StringUtils.isBlank(keyword)) {
            input = displayDBTypeList.toArray(new String[0]);
        } else {
            input = displayDBTypeList.stream().filter(dbType -> StringUtils.containsIgnoreCase(dbType, keyword))
                    .toArray(size -> new String[size]);
        }
        databaseListViewer.clearRadios();
        databaseListViewer.setInput(input);
        if (input.length == 0) {
            databaseListViewer.getControl().getContent()
                    .setBackground(getDisplay().getSystemColor(SWT.COLOR_WHITE));
        }
        wizardPage.setPageComplete(false);
    }

}
