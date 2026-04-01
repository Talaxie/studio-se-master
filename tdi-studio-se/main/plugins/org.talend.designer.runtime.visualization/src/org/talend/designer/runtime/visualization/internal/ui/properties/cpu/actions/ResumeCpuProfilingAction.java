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
import org.talend.designer.runtime.visualization.internal.core.cpu.ICpuProfiler.ProfilerType;
import org.talend.designer.runtime.visualization.internal.ui.properties.AbstractJvmPropertySection;

/**
 * The action to resume CPU profiling.
 */
public class ResumeCpuProfilingAction extends AbstractCpuProfilingAction {

    /** The suspend action. */
    private SuspendCpuProfilingAction suspendAction;

    /**
     * The constructor.
     * 
     * @param section The property section
     */
    public ResumeCpuProfilingAction(AbstractJvmPropertySection section) {
        super(section);

        setText(Messages.resumeCpuProfilingLabel);
        setImageDescriptor(Activator.getImageDescriptor(ISharedImages.RESUME_IMG_PATH));
        setDisabledImageDescriptor(Activator.getImageDescriptor(ISharedImages.DISABLED_RESUME_IMG_PATH));
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

        if (jvm.getCpuProfiler().getProfilerType() == ProfilerType.BCI) {
            try {
                jvm.getCpuProfiler().transformClasses(monitor);
            } catch (JvmCoreException e) {
                Activator.log(Messages.resumeCpuProfilingFailedMsg, e);
            } catch (InterruptedException e) {
                return Status.CANCEL_STATUS;
            }
        }

        try {
            jvm.getCpuProfiler().resume();
        } catch (JvmCoreException e) {
            Activator.log(Messages.resumeCpuProfilingFailedMsg, e);
        }

        suspendAction.setEnabled(true);

        return Status.OK_STATUS;
    }

    /*
     * @see AbstractJobAction#getJobName()
     */
    @Override
    protected String getJobName() {
        return Messages.resumeCpuProfilingJob;
    }

    /**
     * Sets the suspend action.
     * 
     * @param suspendAction The suspend action
     */
    public void setSuspendCpuProfilingAction(SuspendCpuProfilingAction suspendAction) {
        this.suspendAction = suspendAction;
    }
}
