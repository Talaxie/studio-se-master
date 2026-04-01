package org.talend.updates.runtime;

import org.eclipse.ui.IStartup;
import org.talend.core.PluginChecker;
import org.talend.core.pendo.PendoDataTrackFactory;
import org.talend.migration.MigrationReportHelper;
import org.talend.updates.runtime.ui.CheckExtraFeaturesToInstallJob;

public class WorkbenchStartup implements IStartup {

    @Override
    public void earlyStartup() {
        MigrationReportHelper.getInstance().checkMigrationReport(true);
        PendoDataTrackFactory.getInstance().sendProjectLoginTrack();
        if (!PluginChecker.isTIS() && !PluginChecker.isStudioLite()) {
            CheckExtraFeaturesToInstallJob checkExtraFeaturesToInstallJob = new CheckExtraFeaturesToInstallJob();
            checkExtraFeaturesToInstallJob.schedule();
        }
    }

}
