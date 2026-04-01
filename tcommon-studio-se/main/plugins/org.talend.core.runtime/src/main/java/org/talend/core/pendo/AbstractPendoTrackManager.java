// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.pendo;

import org.apache.log4j.Level;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.pendo.properties.IPendoDataProperties;

/**
 * DOC jding  class global comment. Detailled comment
 */
public abstract class AbstractPendoTrackManager {

    public abstract TrackEvent getTrackEvent();

    public abstract IPendoDataProperties collectProperties();

    public boolean isTrackSendAvailable() throws Exception {
        return PendoDataTrackFactory.getInstance().isTrackSendAvailable();
    }

    public void sendTrackData(TrackEvent event, IPendoDataProperties properties) throws Exception {
        PendoDataTrackFactory.getInstance().sendTrackData(event, properties);
    }

    public void sendTrackToPendo() {
        Job job = new Job("send pendo track") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    if (isTrackSendAvailable()) {
                        IPendoDataProperties properties = collectProperties();
                        sendTrackData(getTrackEvent(), properties);
                    }
                } catch (Exception e) {
                    // warning only
                    ExceptionHandler.process(e, Level.WARN);
                }
                return Status.OK_STATUS;
            }
        };
        job.setUser(false);
        job.setPriority(Job.INTERACTIVE);
        job.schedule();
    }

}
