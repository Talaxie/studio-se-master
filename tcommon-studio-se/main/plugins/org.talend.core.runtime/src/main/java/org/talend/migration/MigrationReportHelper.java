// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.migration;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.osgi.service.prefs.BackingStoreException;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.report.ItemsReportUtil;
import org.talend.core.PluginChecker;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.Property;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class MigrationReportHelper {

    private static final String COMMA = ",";

    private static final String PLUGIN_ID = "org.talend.core.runtime";

    private static final String DO_NOT_SHOW_PREF_KEY = "talend.migrationReportDialog.doNotShowAgain";

    private static final String MIGRATION_REPORT_HEAD = "Task name,Task description,Item type,Path to migrated item,Migration details";

    private static final MigrationReportHelper instance = new MigrationReportHelper();

    public static MigrationReportHelper getInstance() {
        return instance;
    }

    private String reportGeneratedPath = "";

    private Set<String> taskItemRecords = new HashSet<String>();

    private List<MigrationReportRecorder> migrationReportRecorders = new ArrayList<MigrationReportRecorder>();

    public void generateMigrationReport(String projectTecName) {
        if (migrationReportRecorders == null || migrationReportRecorders.isEmpty()) {
            return;
        }

        if (!PluginChecker.isTIS()) {
            clearRecorders();
            return;
        }

        File exportFolder = null;
        File reportFile = null;
        try {
            String currentTime = getCurrentTime();
            String filePath = getReportExportFolder(currentTime) + "/" + getReportFileName(currentTime, projectTecName);
            reportGeneratedPath = filePath;
            reportFile = new File(filePath);
            List<String> recordLines = new ArrayList<String>();
            for (MigrationReportRecorder record : migrationReportRecorders) {
                StringBuffer buffer = new StringBuffer();
                buffer.append(ItemsReportUtil.handleColumnQuotes(record.getTaskClassName())).append(COMMA);
                buffer.append(ItemsReportUtil.handleColumnQuotes(record.getTaskDescription())).append(COMMA);
                buffer.append(ItemsReportUtil.handleColumnQuotes(record.getItemType())).append(COMMA);
                buffer.append(ItemsReportUtil.handleColumnQuotes(record.getItemPath())).append(COMMA);
                buffer.append(ItemsReportUtil.handleColumnQuotes(record.getDetailMessage()));
                recordLines.add(buffer.toString());
            }
            ItemsReportUtil.generateReportFile(reportFile, MIGRATION_REPORT_HEAD, recordLines);
        } catch (Exception e) {
            ExceptionHandler.process(e);
            if (reportFile != null && reportFile.exists()) {
                reportFile.delete();
            }
            if (exportFolder != null && exportFolder.exists()) {
                exportFolder.delete();
            }
        } finally {
            migrationReportRecorders.clear();
            taskItemRecords.clear();
        }

    }

    public boolean isRequireDefaultRecord(IProjectMigrationTask task, Item item) {
        boolean require = true;
        if (task.getOrder() != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(task.getOrder());
            int year = calendar.get(Calendar.YEAR);
            if (year <= 2016) {
                return false;
            }
        }
        if (item.getProperty() != null) {
            Property property = item.getProperty();
            String key = task.getId() + "_" + property.getId() + "_" + property.getVersion();
            if (taskItemRecords.contains(key)) {
                return false;
            }
        }
        return require;
    }

    private String getCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = dateFormat.format(new Date());
        return time;
    }

    private String getReportExportFolder(String time) {
        String folderName = "migrationReport" + "_" + time;
        String path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/report/" + folderName;
        return path;
    }

    private String getReportFileName(String time, String projectTecName) {
        String fileName = time + "_" + projectTecName + "_" + "Migration" + "_" + "Report.csv";
        return fileName;
    }

    public synchronized void checkMigrationReport(boolean onStartUp) {
        if (StringUtils.isBlank(reportGeneratedPath) || !PluginChecker.isTIS() || !onStartUp && isReportDialogDisable()) {
            return;
        }
        File reportFile = new File(reportGeneratedPath);
        if (reportFile == null || !reportFile.exists()) {
            return;
        }
        Job job = new Job("Check migration report") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                Display.getDefault().syncExec(() -> {
                    try {
                        MigrationReportAccessDialog dialog = new MigrationReportAccessDialog(
                                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), reportGeneratedPath, onStartUp);
                        dialog.open();
                    } catch (Exception e) {
                        ExceptionHandler.process(e);
                    } finally {
                        // after popup clean up record
                        clearRecorders();
                    }
                });
                return Status.OK_STATUS;
            }
        };
        job.setUser(false);
        job.setPriority(Job.INTERACTIVE);
        job.schedule();
    }

    public static void storeDoNotShowAgainPref(boolean selected) {
        IScopeContext scopeContext = ConfigurationScope.INSTANCE;
        IEclipsePreferences pref = scopeContext.getNode(PLUGIN_ID);
        pref.putBoolean(DO_NOT_SHOW_PREF_KEY, selected);
        try {
            pref.flush();
        } catch (BackingStoreException e) {
            ExceptionHandler.process(e);
        }
    }

    public static boolean isReportDialogDisable() {
        IScopeContext scopeContext = ConfigurationScope.INSTANCE;
        IEclipsePreferences pref = scopeContext.getNode(PLUGIN_ID);
        return pref.getBoolean(DO_NOT_SHOW_PREF_KEY, false);
    }

    public void addRecorder(MigrationReportRecorder recorder) {
        if (recorder != null) {
            migrationReportRecorders.add(recorder);
            if (recorder.getItem() != null && recorder.getItem().getProperty() != null) {
                Property property = recorder.getItem().getProperty();
                taskItemRecords.add(recorder.getTask().getId() + "_" + property.getId() + "_" + property.getVersion());
            }
        }
    }

    public void clearRecorders() {
        reportGeneratedPath = "";
        migrationReportRecorders.clear();
        taskItemRecords.clear();
    }

    public String getReportGeneratedPath() {
        return reportGeneratedPath;
    }

}
