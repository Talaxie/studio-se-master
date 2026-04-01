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
package org.talend.core.ui.notification;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IStartup;
import org.talend.commons.CommonsPlugin;
import org.talend.commons.ui.runtime.CommonUIPlugin;

public class Java17NotificationStartupTask implements IStartup {

    @Override
    public void earlyStartup() {
        if (CommonUIPlugin.isFullyHeadless() || CommonsPlugin.isTUJTest() || CommonsPlugin.isJUnitTest()
                || CommonsPlugin.isJunitWorking()) {
            return;
        }
        new Job("Java 17 compatibility Notification") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                if (Java17NotificationPopup.show()) {
                    Display.getDefault().asyncExec(() -> new Java17NotificationPopup().open());
                }
                return Status.OK_STATUS;
            }

        }.schedule(8000);
    }

}
