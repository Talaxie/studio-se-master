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
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.talend.signon.util.listener.LoginEventListener;
import org.talend.utils.io.FilesUtils;

public class SSOClientUtil {

    private static Logger LOGGER = Logger.getLogger(SSOClientUtil.class);

    private static final String STUDIO_CLIENT_ID = "0c51933d-c542-4918-9baf-86ef709af5d8";

    private static final String CLIENT_FILE_PATH_PROPERTY = "talend.studio.signon.client.path";

    private static final String CLIENT_FILE_NAME_ON_WINDOWS = "Talend_Sign_On_Tool_win-x86_64.exe";

    private static final String CLIENT_FILE_NAME_ON_LINUX_X86 = "Talend_Sign_On_Tool_linux_gtk_x86_64";

    private static final String CLIENT_FILE_NAME_ON_LINUX_AARCH64 = "Talend_Sign_On_Tool_linux_gtk_aarch64";

    private static final String CLIENT_FILE_NAME_ON_MAC_X86 = "Talend_Sign_On_Tool.app";

    private static final String CLIENT_FILE_NAME_ON_MAC_AARCH64 = "Talend_Sign_On_Tool_aarch64.app";

    private static final String STUDIO_INI_FILE_NAME_ON_WINDOWS = "Talend-Studio-win-x86_64.ini";

    private static final String STUDIO_INI_FILE_NAME_ON_LINUX_X86 = "Talend-Studio-linux-gtk-x86_64.ini";

    private static final String STUDIO_INI_FILE_NAME_ON_LINUX_AARCH64 = "Talend-Studio-linux-gtk-aarch64.ini";

    private static final String STUDIO_INI_FILE_NAME_ON_MAC_X86 = "Talend-Studio-macosx-cocoa.ini";

    private static final String STUDIO_INI_FILE_NAME_ON_MAC_AARCH64 = "Talend-Studio-macosx-cocoa.ini";

    private static final String CLIENT_INI_FILE_NAME_ON_WINDOWS = "Talend_Sign_On_Tool_win-x86_64.ini";

    private static final String CLIENT_INI_FILE_NAME_ON_LINUX_X86 = "Talend_Sign_On_Tool_linux_gtk_x86_64.ini";

    private static final String CLIENT_INI_FILE_NAME_ON_LINUX_AARCH64 = "Talend_Sign_On_Tool_linux_gtk_aarch64.ini";

    private static final String CLIENT_INI_FILE_NAME_ON_MAC_X86 = "Talend_Sign_On_Tool.ini";

    private static final String CLIENT_INI_FILE_NAME_ON_MAC_AARCH64 = "Talend_Sign_On_Tool_aarch64.ini";

    private static final String DEBUG_PARAMETER_NAME = "-Xdebug";

    static final String KEEP_STUDIO_DEBUG_PARAM = "talend.keep.debug.parameter";

    private static final String CLIENT_FOLDER_NAME = "studio_sso_client";

    static final String DATA_CENTER_KEY = "talend.tmc.datacenter";

    static final String DATA_CENTER_DISPLAY_KEY = "talend.tmc.datacenter.display";

    public static final String TALEND_DEBUG = "--talendDebug"; //$NON-NLS-1$

    private static List<String> STUDIO_INI_CONTENT = new ArrayList<String>();

    private static final SSOClientUtil instance = new SSOClientUtil();

    private boolean needSetupJVMParam = true;

    private SSOClientExec signOnClientExec;

    private SSOClientUtil() {
        if (SSOClientInstaller.getInstance().isNeedInstall()) {
            try {
                SSOClientInstaller.getInstance().install();
            } catch (Exception e) {
                LOGGER.error(e);
            }
        }
    }

    public String getClientID() throws IOException {
        return STUDIO_CLIENT_ID;
    }

    private File getSSOClientAppFile() throws Exception {
        if (System.getProperty(CLIENT_FILE_PATH_PROPERTY) != null) {
            return new File(System.getProperty(CLIENT_FILE_PATH_PROPERTY));
        }
        File folder = getSSOClientFolder();
        if (EnvironmentUtils.isWindowsSystem()) {
            return new File(folder, CLIENT_FILE_NAME_ON_WINDOWS);
        } else if (EnvironmentUtils.isLinuxUnixSystem()) {
            if (EnvironmentUtils.isX86_64()) {
                return new File(folder, CLIENT_FILE_NAME_ON_LINUX_X86);
            } else if (EnvironmentUtils.isAarch64()) {
                return new File(folder, CLIENT_FILE_NAME_ON_LINUX_AARCH64);
            }
        } else if (EnvironmentUtils.isMacOsSytem()) {
            File appFolder = null;
            if (EnvironmentUtils.isX86_64()) {
                appFolder = new File(folder, CLIENT_FILE_NAME_ON_MAC_X86);
            } else if (EnvironmentUtils.isAarch64()) {
                appFolder = new File(folder, CLIENT_FILE_NAME_ON_MAC_AARCH64);
            }
            if (appFolder != null) {
                return new File(appFolder, "Contents/MacOS/Talend_Sign_On_Tool");
            }
        }
        throw new Exception("Unsupported OS");
    }

    public static File getSSOClientFolder() {
        File configFolder = EquinoxUtils.getConfigurationFolder();
        File signClientFolder = new File(configFolder, CLIENT_FOLDER_NAME);
        return signClientFolder;
    }

    private synchronized void startSignOnClient(LoginEventListener listener) throws Exception {
        if (needSetupJVMParam) {
            setupJVMParams();
            needSetupJVMParam = false;
        }
        if (signOnClientExec != null) {
            signOnClientExec.stop();
        }
        String clientId = getClientID();
        File execFile = getSSOClientAppFile();
        String codeChallenge = listener.getCodeChallenge();
        if (isDebugMode()) {
            LOGGER.info("Prepare to start log in cloud client monitor");
        }
        SSOClientMonitor signOnClientListener = SSOClientMonitor.getInscance();
        signOnClientListener.addLoginEventListener(listener);
        new Thread(signOnClientListener).start();
        if (isDebugMode()) {
            LOGGER.info("Log in cloud client monitor started.");
        }
        while (!SSOClientMonitor.isRunning()) {
            TimeUnit.MILLISECONDS.sleep(100);
        }
        if (signOnClientListener.getListenPort() < 0) {
            throw new Exception("Log in cloud client monitor start failed.");
        }
        if (isDebugMode()) {
            LOGGER.info("Prepare to start cloud client on " + signOnClientListener.getListenPort());
        }
        signOnClientExec = new SSOClientExec(execFile, clientId, codeChallenge, signOnClientListener.getListenPort(), listener,
                STUDIO_INI_CONTENT);
        new Thread(signOnClientExec).start();
        if (isDebugMode()) {
            LOGGER.info("Login cloud client started.");
        }
    }

    private void setupJVMParams() throws Exception {
        File studioIniFile = getStudioIniFile();
        if (studioIniFile != null && studioIniFile.exists()) {
            List<String> fileContentList = FilesUtils.getContentLines(studioIniFile.getPath());
            int debugIndex = -1;
            for (int i = 0; i < fileContentList.size(); i++) {
                String str = fileContentList.get(i);
                if (DEBUG_PARAMETER_NAME.equals(str.trim())) {
                    debugIndex = i;
                }
            }
            if (!keepDebugParam() && debugIndex >= 0 && fileContentList.size() > debugIndex + 1) {
                fileContentList.remove(debugIndex + 1);
                fileContentList.remove(debugIndex);
            }
            STUDIO_INI_CONTENT = fileContentList;
            saveIniFile(fileContentList);
        } else {
            LOGGER.error("Can't find Studio's ini file.");
        }
    }

    private boolean keepDebugParam() {
        return Boolean.valueOf(System.getProperty(KEEP_STUDIO_DEBUG_PARAM));
    }

    private void saveIniFile(List<String> list) throws Exception {
        File clientIniFile = getClientIniFile();
        if (!clientIniFile.exists()) {
            clientIniFile.createNewFile();
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter(clientIniFile);
            for (String str : list) {
                writer.write(str + System.lineSeparator());
            }
        } catch (Exception ex) {
            LOGGER.error(ex);
        } finally {
            writer.close();
        }
    }

    private File getClientIniFile() throws Exception {
        String fileName = null;
        if (EnvironmentUtils.isWindowsSystem()) {
            fileName = CLIENT_INI_FILE_NAME_ON_WINDOWS;
        } else if (EnvironmentUtils.isLinuxUnixSystem()) {
            if (EnvironmentUtils.isX86_64()) {
                fileName = CLIENT_INI_FILE_NAME_ON_LINUX_X86;
            } else if (EnvironmentUtils.isAarch64()) {
                fileName = CLIENT_INI_FILE_NAME_ON_LINUX_AARCH64;
            }
        } else if (EnvironmentUtils.isMacOsSytem()) {
            if (EnvironmentUtils.isX86_64()) {
                fileName = CLIENT_INI_FILE_NAME_ON_MAC_X86;
            } else if (EnvironmentUtils.isAarch64()) {
                fileName = CLIENT_INI_FILE_NAME_ON_MAC_AARCH64;
            }
        } else {
            throw new Exception("Unsupported OS");
        }
        return new File(getSSOClientFolder(), fileName);
    }

    private File getStudioIniFile() throws Exception {
        String fileName = null;
        if (EnvironmentUtils.isWindowsSystem()) {
            fileName = STUDIO_INI_FILE_NAME_ON_WINDOWS;
        } else if (EnvironmentUtils.isLinuxUnixSystem()) {
            if (EnvironmentUtils.isX86_64()) {
                fileName = STUDIO_INI_FILE_NAME_ON_LINUX_X86;
            } else if (EnvironmentUtils.isAarch64()) {
                fileName = STUDIO_INI_FILE_NAME_ON_LINUX_AARCH64;
            }
        } else if (EnvironmentUtils.isMacOsSytem()) {
            if (EnvironmentUtils.isX86_64()) {
                fileName = STUDIO_INI_FILE_NAME_ON_MAC_X86;
            } else if (EnvironmentUtils.isAarch64()) {
                fileName = STUDIO_INI_FILE_NAME_ON_MAC_AARCH64;
            }
        } else {
            throw new Exception("Unsupported OS");
        }
        return new File(Platform.getInstallLocation().getDataArea(fileName).getPath());
    }

    public static SSOClientUtil getInstance() {
        return instance;
    }

    public void signOnCloud(LoginEventListener listener) throws Exception {
        SSOClientUtil.getInstance().startSignOnClient(listener);
    }

    public String getSignOnURL(String clientID, String codeChallenge, int callbackPort) throws UnsupportedEncodingException {
        String dataCenter = TMCRepositoryUtil.getDefaultDataCenter();
        StringBuffer urlSB = new StringBuffer();
        urlSB.append(TMCRepositoryUtil.getBaseLoginURL(dataCenter)).append("?");
        urlSB.append("client_id=").append(URLEncoder.encode(clientID, StandardCharsets.UTF_8.name())).append("&");
        urlSB.append("redirect_uri=")
                .append(URLEncoder.encode(TMCRepositoryUtil.getRedirectURL(dataCenter), StandardCharsets.UTF_8.name()))
                .append("&");
        urlSB.append("scope=").append(URLEncoder.encode("openid refreshToken", StandardCharsets.UTF_8.name())).append("&");
        urlSB.append("response_type=").append(URLEncoder.encode("code", StandardCharsets.UTF_8.name())).append("&");
        urlSB.append("code_challenge_method=").append(URLEncoder.encode("S256", StandardCharsets.UTF_8.name())).append("&");
        urlSB.append("code_challenge=").append(URLEncoder.encode(codeChallenge, StandardCharsets.UTF_8.name())).append("&");
        String state = String.valueOf(callbackPort) + SSOUtil.STATE_PARAM_SEPARATOR + TMCRepositoryUtil.getDefaultDataCenter();
        urlSB.append("state=").append(URLEncoder.encode(state, StandardCharsets.UTF_8.name()));
        return urlSB.toString();
    }

    public static boolean isDebugMode() {
        return Boolean.getBoolean("talendDebug") //$NON-NLS-1$
                || ArrayUtils.contains(Platform.getApplicationArgs(), SSOClientUtil.TALEND_DEBUG);
    }
}
