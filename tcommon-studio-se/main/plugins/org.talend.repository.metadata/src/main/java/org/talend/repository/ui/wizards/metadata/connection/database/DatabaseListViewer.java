// ============================================================================
//
// Copyright (C) 2006-2019 Talend Inc. - www.talend.com
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.talend.commons.ui.swt.listviewer.ControlListItem;
import org.talend.commons.ui.swt.listviewer.ControlListViewer;

public class DatabaseListViewer extends ControlListViewer {

    private List<Button> radios = new ArrayList<>();

    private DatabaseSelectWizardPage wizardPage;

    public DatabaseListViewer(Composite parent, DatabaseSelectWizardPage wizardPage, int style) {
        super(parent, style);
        this.wizardPage = wizardPage;
        GridDataFactory.fillDefaults().grab(true, true).hint(SWT.DEFAULT, 480).applyTo(getControl());
    }

    @Override
    protected ControlListItem<?> doCreateItem(Composite parent, Object element) {
        DatabaseInfoItem<String> item = new DatabaseInfoItem<>(parent, SWT.NONE, (String) element);
        Button radio = item.getRadio();
        radios.add(item.getRadio());
        radio.addSelectionListener(SelectionListener.widgetSelectedAdapter((e) -> {
            if (radio.getSelection()) {
                radios.stream().filter(Button::getSelection).filter(b -> b != radio).forEach(b -> b.setSelection(false));
                wizardPage.setPageComplete(true);
            }
        }));
        return item;
    }

    public void clearRadios() {
        radios.clear();
    }

    public String getSelectedDB() {
        Button button = radios.stream().filter(b -> b.getSelection()).findFirst().orElse(null);
        return button != null ? button.getData().toString() : null;
    }

}
