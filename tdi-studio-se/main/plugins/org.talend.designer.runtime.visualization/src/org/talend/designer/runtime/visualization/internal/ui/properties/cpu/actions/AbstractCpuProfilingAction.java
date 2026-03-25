/*******************************************************************************
 * Copyright (c) 2013 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.cpu.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;

/**
 * The action to run job.
 */
public abstract class AbstractCpuProfilingAction extends Action {

    /** The property section. */
    AbstractJvmPropertySection section;

    /** The state indicating if forcing disabling action. */
    private boolean forceDisable;

    /**
     * The constructor.
     * 
     * @param section The property section
     */
    public AbstractCpuProfilingAction(AbstractJvmPropertySection section) {
        this.section = section;
    }

    /*
     * @see Action#run()
     */
    @Override
    final public void run() {
        forceDisalbe(true);

        new Job(getJobName()) {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                IStatus status = performRun(monitor);
                forceDisalbe(false);
                return status;
            }
        }.schedule();
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled && !forceDisable);
    }

    /**
     * Performs action running within job.
     * 
     * @param monitor The progress monitor
     * @return The status
     */
    abstract protected IStatus performRun(IProgressMonitor monitor);

    /**
     * Gets the job name.
     * 
     * @return The job name
     */
    abstract protected String getJobName();

    /**
     * Forces disabling action.
     * 
     * @param disable <tt>true</tt> to force disabling action
     */
    private void forceDisalbe(boolean disable) {
        setEnabled(!disable);
        forceDisable = disable;
    }
}
