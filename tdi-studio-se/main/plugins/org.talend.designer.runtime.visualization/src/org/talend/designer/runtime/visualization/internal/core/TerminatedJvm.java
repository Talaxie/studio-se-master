/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.core;

import org.talend.designer.runtime.visualization.IHost;
import org.talend.designer.runtime.visualization.ITerminatedJvm;

/**
 * The terminated JVM.
 */
public class TerminatedJvm extends AbstractJvm implements ITerminatedJvm {

    /**
     * The constructor.
     * 
     * @param pid The process ID
     * @param port The port
     * @param mainClass The main class
     * @param host The host
     */
    public TerminatedJvm(int pid, int port, String mainClass, IHost host) {
        super(pid, host);
        setMainClass(mainClass);
    }

    /*
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return getMainClass();
    }
}
