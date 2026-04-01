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
package org.talend.signon.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.talend.utils.io.FilesUtils;

public class SSOClientInstaller {

    private static Logger LOGGER = Logger.getLogger(SSOClientInstaller.class);

    private final String SIGN_CLIENT_BUNDLE_NAME = "org.talend.singlesignon.client";

    private final String INSTALL_FOLDER_NAME = "repository";

    private final String INSTALL_FILE_NAME = "TalendSignTool.zip";

    private final String version = "8.0.1.202211131253";

    private static final SSOClientInstaller instance = new SSOClientInstaller();

    public static SSOClientInstaller getInstance() {
        return instance;
    }

    private SSOClientInstaller() {
    }

    public boolean isNeedInstall() {
        String installedVersion = getInstalledVersion();
        if (SSOClientUtil.isDebugMode()) {
            LOGGER.info(String.format("Installed client version is %s and latest version is %s .", installedVersion, version));
        }
        if (installedVersion != null && installedVersion.compareTo(version) >= 0) {
            return false;
        }
        return true;
    }

    public void install() throws Exception {
        File sourceFile = getInstallationFile();
        if (!sourceFile.exists()) {
            LOGGER.error("Can't find installation file:" + sourceFile.getAbsolutePath());
        }
        File targetFolder = getInstallationDir();
        if (targetFolder.exists()) {
            FilesUtils.deleteFolder(targetFolder, true);
            LOGGER.info("Deleted target folder:" + targetFolder.getAbsolutePath());
        }
        targetFolder.mkdirs();
        if (SSOClientUtil.isDebugMode()) {
            LOGGER.info("Created target folder:" + targetFolder.getAbsolutePath());
        }
        FilesUtils.unzip(sourceFile.getAbsolutePath(), targetFolder.getAbsolutePath(), true);
        if (SSOClientUtil.isDebugMode()) {
            LOGGER.info("Installed client:" + targetFolder.getAbsolutePath());
        }
    }

    private String getInstalledVersion() {
        FileInputStream in = null;
        try {
            File eclipseProductFile = getEclipseProductFile();
            if (eclipseProductFile != null && eclipseProductFile.exists()) {
                Properties p = new Properties();
                in = new FileInputStream(eclipseProductFile);
                p.load(in);
                String productFileVersion = p.getProperty("version"); //$NON-NLS-1$
                return productFileVersion;
            }
        } catch (Exception e) {
            LOGGER.error(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    LOGGER.error(e);
                }
            }
        }
        return null;
    }

    private File getEclipseProductFile() throws URISyntaxException {
        File eclipseproductFile = new File(getInstallationDir(), ".eclipseproduct");//$NON-NLS-1$
        return eclipseproductFile;
    }

    protected File getInstallationDir() {
        return SSOClientUtil.getSSOClientFolder();
    }

    protected File getInstallationFile() throws IOException {
        BundleContext context = EquinoxUtils.getCurrentBundleContext();
        Bundle[] bundles = context.getBundles();
        Bundle bundle = null;
        for (Bundle b : bundles) {
            if (SIGN_CLIENT_BUNDLE_NAME.equals(b.getSymbolicName())) {
                bundle = b;
                break;
            }
        }
        if (bundle != null) {
            File bundleFile = FileLocator.getBundleFile(bundle).getAbsoluteFile();
            File folder = new File(bundleFile, INSTALL_FOLDER_NAME);
            File installFile = new File(folder, INSTALL_FILE_NAME);
            return installFile;
        }
        return null;
    }
}
