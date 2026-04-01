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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.LoginException;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.nofitication.ArrangedNotificationPopup;
import org.talend.core.CorePlugin;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.core.runtime.util.ModuleAccessHelper;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.ui.i18n.Messages;
import org.talend.core.utils.TalendQuoteUtils;
import org.talend.repository.RepositoryWorkUnit;
import org.talend.repository.model.IRepositoryService;

public class Java17NotificationPopup extends ArrangedNotificationPopup {

    private static final long DELAY_CLOSE_DURATION = 60 * 60 * 1000;

    private static final String PREF_SHOW_ONCE = "java17.compatibility.check";

    private static ProjectPreferenceManager prefManager = new ProjectPreferenceManager(CoreUIPlugin.PLUGIN_ID, false);

    public Java17NotificationPopup() {
        super(PlatformUI.getWorkbench().getDisplay(), SWT.NO_TRIM | SWT.NO_FOCUS | SWT.TOOL);
        super.setDelayClose(DELAY_CLOSE_DURATION);
    }

    @Override
    protected String getPopupShellTitle() {
        return Messages.getString("Java17NotificationPopup.title");
    }

    @Override
    protected void createControl(Composite parent) {
        Link link = new Link(parent, SWT.WRAP);
        link.setBackground(parent.getBackground());
        link.setText(getNotificationText());
        GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
        gridData.widthHint = 380; // only expand further if anyone else requires it
        link.setLayoutData(gridData);
        link.addSelectionListener(SelectionListener.widgetSelectedAdapter((e) -> {
            close();
            IRepositoryService.get().openProjectSettingsDialog("projectsetting.JavaVersion");
            setShowOnce();
        }));
    }

    private String getNotificationText() {
        return Messages.getString("Java17NotificationPopup.info");
    }

    public static boolean show() {
        return !showOnce() && isJava17() && (!ModuleAccessHelper.allowJavaInternalAcess(null) || !checkInterpreter());
    }

    private static boolean showOnce() {
        return prefManager.getBoolean(PREF_SHOW_ONCE);
    }

    private void setShowOnce() {
        RepositoryWorkUnit<Object> workUnit = new RepositoryWorkUnit<Object>(
                "Store Java 17 compatibility check notification setup") {

            @Override
            protected void run() throws LoginException, PersistenceException {
                prefManager.setValue(PREF_SHOW_ONCE, true);
                prefManager.save();
            }

        };
        workUnit.setAvoidUnloadResources(true);
        ProxyRepositoryFactory.getInstance().executeRepositoryWorkUnit(workUnit);
    }

    private static boolean checkInterpreter() {
        IPreferenceStore prefStore = CorePlugin.getDefault().getPreferenceStore();
        String javaInterpreter = prefStore.getString(ITalendCorePrefConstants.JAVA_INTERPRETER);
        if (javaInterpreter == null || javaInterpreter.length() == 0) {
            return false;
        }
        File releaseFile = new File(new File(javaInterpreter).getParentFile().getParentFile(), "release");
        if (!releaseFile.exists()) {
            return false;
        }
        Properties props = new Properties();
        try (InputStream in = new FileInputStream(releaseFile)) {
            props.load(in);
            String version = props.getProperty("JAVA_VERSION");
            if (StringUtils.isBlank(version)) {
                version = props.getProperty("OPENJDK_VERSION");
            }
            if (StringUtils.isBlank(version)) {
                return false;
            }
            version = TalendQuoteUtils.removeQuotesIfExist(version);
            if (Integer.parseInt(version.split("[^\\d]+")[0]) > 8) {
                // since Java 9
                return true;
            }
        } catch (IOException | NumberFormatException e) {
            ExceptionHandler.process(e);
        }
        return false;
    }

    private static boolean isJava17() {
        boolean isJava17 = false;
        String javaVersion = System.getProperty("java.version");
        String[] arr = javaVersion.split("[^\\d]+");
        try {
            isJava17 = Integer.parseInt(arr[0]) >= 17;
        } catch (NumberFormatException e) {
            ExceptionHandler.process(e);
            isJava17 = false;
        }
        return isJava17;
    }

}
