/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.internal.ui.properties.timeline;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.talend.designer.runtime.visualization.internal.actions.AbstractClearAction;

/**
 * The action to clear timeline data.
 */
public class ClearTimelineDataAction extends AbstractClearAction {

    /** The timeline section. */
    private TimelineSection timelineSection;

    /**
     * The constructor.
     * 
     * @param timelineSection The timeline section
     */
    public ClearTimelineDataAction(TimelineSection timelineSection) {
        setText(Messages.clearTimelineDataLabel);
        this.timelineSection = timelineSection;
    }

    /*
     * @see AbstractClearAction#doRun(IProgressMonitor)
     */
    @Override
    protected IStatus doRun(IProgressMonitor monitor) {
        timelineSection.clear();
        return Status.OK_STATUS;
    }

    /*
     * @see AbstractClearAction#getJobName()
     */
    @Override
    protected String getJobName() {
        return Messages.clearTimelineDataLabel;
    }
}
