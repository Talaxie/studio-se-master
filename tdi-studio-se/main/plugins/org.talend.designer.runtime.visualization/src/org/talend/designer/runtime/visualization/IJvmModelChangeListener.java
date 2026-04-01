/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved. 
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization;

/**
 * The JVM model change listener.
 */
public interface IJvmModelChangeListener {

    /**
     * Notifies that JVM model is changed.
     * 
     * @param e
     *            The JVM model change event
     */
    void jvmModelChanged(JvmModelEvent e);
}
