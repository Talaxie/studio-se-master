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
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.log4j.Logger;
import org.eclipse.equinox.app.IApplication;
import org.talend.signon.util.listener.LoginEventListener;

public class SSOClientExec implements Runnable {

    private static Logger LOGGER = Logger.getLogger(SSOClientExec.class);

    public static final String STUDIO_CALL_PREFIX = "studioCall:";

    private static final String STUDIO_SSO_CLIENT_DEBUG_PORT = "talend.studio.sso.client.debug.port";

    private File execFile;

    private String codeChallenge;

    private String clientId;

    private int port;

    private ExecuteWatchdog executeWatchdog;

    private Exception error;

    private LoginEventListener listener;

    private List<String> studioIniContent;

    public SSOClientExec(File execFile, String clientId, String codeChallenge, int port, LoginEventListener listener,
            List<String> studioIniContent) {
        this.execFile = execFile;
        this.clientId = clientId;
        this.codeChallenge = codeChallenge;
        this.port = port;
        this.listener = listener;
        this.studioIniContent = studioIniContent;
    }

    @Override
    public void run() {
        int exitValue = 0;
        try {
            CommandLine cmdLine = new CommandLine(execFile);
            String url = getInvokeParameter(clientId, port);
            cmdLine.addArgument(url);
            if (SSOClientUtil.isDebugMode()) {
                LOGGER.info("Opening:" + url.substring(STUDIO_CALL_PREFIX.length()));
            }
            addCommandLineParameters(cmdLine);
            DefaultExecutor executor = new DefaultExecutor();
            executeWatchdog = new ExecuteWatchdog(900000);
            executor.setWatchdog(executeWatchdog);
            executor.setExitValues(new int[] { 0, 24, 143 }); // normal, restart, process existed
            if (!execFile.canExecute()) {
                execFile.setExecutable(true);
            }
            executor.setWorkingDirectory(execFile.getParentFile());
            exitValue = executor.execute(cmdLine);
            if (IApplication.EXIT_RELAUNCH == exitValue) {
                cmdLine = new CommandLine(execFile);
                addCommandLineParameters(cmdLine);
                exitValue = executor.execute(cmdLine);
            }
        } catch (Exception e) {
            error = e;
            LOGGER.error(e);
            listener.loginFailed(e);
        }
    }

    private void addCommandLineParameters(CommandLine cmdLine) {
        if (EnvironmentUtils.isMacOsSytem()) {
            if (studioIniContent != null) {
                for (String str : studioIniContent) {
                    if (str != null && str.length() > 0) {
                        cmdLine.addArgument(str);
                    }
                }
            }
            if (getClientDebugPort() != null) {
                cmdLine.addArgument("-vmargs");
                cmdLine.addArgument("-Xdebug");
                String cmd = "-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=*:" + getClientDebugPort();
                cmdLine.addArgument(cmd);
            }
        }
    }

    private String getClientDebugPort() {
        return System.getProperty(STUDIO_SSO_CLIENT_DEBUG_PORT);
    }

    private String getInvokeParameter(String clientID, int callbackPort) throws UnsupportedEncodingException {
        return STUDIO_CALL_PREFIX + SSOClientUtil.getInstance().getSignOnURL(clientID, codeChallenge, callbackPort);
    }

    public void stop() {
        if (executeWatchdog != null && !executeWatchdog.killedProcess()) {
            executeWatchdog.destroyProcess();
        }
    }

    public Exception getError() {
        return error;
    }
}
