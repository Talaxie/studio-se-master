/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.cpu.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.talend.designer.runtime.visualization.Activator;
import org.talend.designer.runtime.visualization.IActiveJvm;
import org.talend.designer.runtime.visualization.ISharedImages;
import org.talend.designer.runtime.visualization.JvmCoreException;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;

/**
 * The action to suspend CPU profiling.
 */
public class SuspendCpuProfilingAction extends AbstractCpuProfilingAction {

    /** The resume action. */
    private ResumeCpuProfilingAction resumeAction;

    /**
     * The constructor.
     * 
     * @param section The property section
     */
    public SuspendCpuProfilingAction(AbstractJvmPropertySection section) {
        super(section);

        setText(Messages.suspendCpuProfilingLabel);
        setImageDescriptor(Activator.getImageDescriptor(ISharedImages.SUSPEND_IMG_PATH));
        setDisabledImageDescriptor(Activator.getImageDescriptor(ISharedImages.DISABLED_SUSPEND_IMG_PATH));
        setId(getClass().getName());
    }

    /*
     * @see AbstractJobAction#performRun(IProgressMonitor)
     */
    @Override
    protected IStatus performRun(IProgressMonitor monitor) {
        IActiveJvm jvm = section.getJvm();
        if (jvm == null) {
            return Status.CANCEL_STATUS;
        }

        try {
            jvm.getCpuProfiler().suspend();
        } catch (JvmCoreException e) {
            Activator.log(Messages.suspendingCpuProfilingFailedMsg, e);
        }

        resumeAction.setEnabled(true);

        return Status.OK_STATUS;
    }

    /*
     * @see AbstractJobAction#getJobName()
     */
    @Override
    protected String getJobName() {
        return Messages.suspendCpuProfilingJobLabel;
    }

    /**
     * Sets the resume action.
     * 
     * @param resumeAction The resume action
     */
    public void setResumeCpuProfilingAction(ResumeCpuProfilingAction resumeAction) {
        this.resumeAction = resumeAction;
    }
}
