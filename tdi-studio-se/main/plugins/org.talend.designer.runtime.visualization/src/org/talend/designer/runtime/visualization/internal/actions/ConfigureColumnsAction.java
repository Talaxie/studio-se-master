/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.actions;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.action.Action;
import org.talend.designer.runtime.visualization.internal.ui.IConfigurableColumns;

/**
 * The action to configure columns.
 */
public class ConfigureColumnsAction extends Action {

    /** The configurable columns. */
    private IConfigurableColumns columns;

    /** The configure columns dialog. */
    private ConfigureColumnsDialog dialog;

    /**
     * The constructor.
     * 
     * @param columns The configurable columns
     */
    public ConfigureColumnsAction(IConfigurableColumns columns) {
        Assert.isNotNull(columns);

        setText(Messages.configureColumnsLabel);
        this.columns = columns;
    }

    /*
     * @see Action#run()
     */
    @Override
    public void run() {
        getDialog().open();
    }

    /**
     * Gets the configure columns dialog.
     * 
     * @return The configure columns dialog
     */
    private ConfigureColumnsDialog getDialog() {
        if (dialog == null) {
            dialog = new ConfigureColumnsDialog(columns);
        }
        return dialog;
    }
}
