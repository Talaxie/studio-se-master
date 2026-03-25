/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved. 
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui;

import java.util.List;

/**
 * The columns that are configurable to change the column order and visibility.
 * The configured settings remain even after restarting eclipse.
 * 
 * @see org.jvmmonitor.internal.ui.actions.ConfigureColumnsAction
 */
public interface IConfigurableColumns {

    /**
     * Gets the ID used to store the column state.
     * 
     * @return The ID
     */
    String getId();

    /**
     * Gets the columns with default order.
     * 
     * @return The columns
     */
    List<String> getColumns();

    /**
     * Gets the default visibility.
     * 
     * @param column
     *            The column name
     * @return <tt>true</tt> if the given column is visible by default
     */
    boolean getDefaultVisibility(String column);
}
