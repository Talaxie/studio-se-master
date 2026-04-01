/*******************************************************************************
 * Copyright (c) 2010, 2018 Tasktop Technologies and others.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Tasktop Technologies - initial API and implementation
 *******************************************************************************/

package org.talend.repository.ui.wizards.metadata.connection.database;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.talend.repository.metadata.i18n.Messages;

public class DatabaseSearchControl extends Composite {

    private final Text textControl;

    public DatabaseSearchControl(Composite parent) {
        super(parent, SWT.NONE);
        setLayout(new GridLayout(2, false));

        Label findLabel = new Label(this, SWT.NONE);
        findLabel.setText(Messages.getString("DatabaseSearchControl.findText")); //$NON-NLS-1$

        textControl = new Text(this, SWT.SEARCH | SWT.ICON_SEARCH | SWT.ICON_CANCEL);
        GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        textControl.setLayoutData(gridData);
    }

    public Text getTextControl() {
        return textControl;
    }

}
