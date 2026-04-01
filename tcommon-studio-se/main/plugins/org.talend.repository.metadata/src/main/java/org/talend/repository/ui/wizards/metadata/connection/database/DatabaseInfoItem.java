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

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.talend.commons.ui.swt.listviewer.ControlListItem;

public class DatabaseInfoItem<T> extends ControlListItem<T> {

    private T element;

    private Button button;

    public DatabaseInfoItem(Composite parent, int style, T element) {
        super(parent, style, element);
        this.element = element;
        init(parent);
    }

    protected void init(Composite parent) {
        GridLayoutFactory.swtDefaults().applyTo(this);
        Composite panel = new Composite(this, SWT.NONE);
        panel.setLayout(new GridLayout(3, false));
        panel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        button = new Button(panel, SWT.RADIO);
        button.setData(element);
        Label iconLabel = new Label(panel, SWT.NONE);
        iconLabel.setImage(JFaceResources.getImageRegistry().get(DBDisplayHelper.getDBImageName((String) element)));
        GridData iconData = new GridData();
        iconData.horizontalIndent = 10;
        iconLabel.setLayoutData(iconData);
        Label textLabel = new Label(panel, SWT.NONE);
        textLabel.setText((String) element);
        GridData textData = new GridData();
        textData.horizontalIndent = 10;
        textLabel.setLayoutData(textData);
        Label horizonLine = new Label(panel, SWT.SEPARATOR | SWT.HORIZONTAL);
        GridData lineData = new GridData(SWT.FILL, SWT.BOTTOM, true, false);
        lineData.horizontalSpan = 3;
        horizonLine.setLayoutData(lineData);
    }

    @Override
    public void updateColors(int index) {
        //
    }

    @Override
    protected void refresh() {
        //
    }

    public Button getRadio() {
        return button;
    }

    public T getElement() {
        return element;
    }

}
