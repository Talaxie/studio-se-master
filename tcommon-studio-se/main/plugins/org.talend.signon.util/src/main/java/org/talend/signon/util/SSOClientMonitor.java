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

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.talend.signon.util.listener.LoginEventListener;

public class SSOClientMonitor implements Runnable {

    private static Logger LOGGER = Logger.getLogger(SSOClientMonitor.class);

    private static final String STUDIO_AUTH_CODE_KEY = "code";

    private static final String STUDIO_AUTH_STATE_KEY = "state";

    private static final String STUDIO_CALLBACK_PREFIX = "studioCallback:";
    
    private static final String STUDIO_CALLBACK_ERROR_PREFIX = "studioCallbackError:";

    private static final SSOClientMonitor instance = new SSOClientMonitor();

    private static int listenPort = -1;

    private static volatile boolean isRunning = false;

    private Set<LoginEventListener> listenerSet = new HashSet<LoginEventListener>();

    public static SSOClientMonitor getInscance() {
        return instance;
    }

    private SSOClientMonitor() {

    }

    private void processData(String msg) {
        if (msg.startsWith(STUDIO_CALLBACK_PREFIX)) {
            msg = msg.substring(STUDIO_CALLBACK_PREFIX.length());
            Map<String, String> data = decodeMsg(msg);
            String code = data.get(STUDIO_AUTH_CODE_KEY);
            String state = data.get(STUDIO_AUTH_STATE_KEY);

            String[] splits = state.split(",");
            String dateCenter = TMCRepositoryUtil.getDefaultDataCenter();
            if (splits.length == 2) {
                dateCenter = splits[1];
            }
            fireLoginStop(code, dateCenter);
        }
        
        if (msg.startsWith(STUDIO_CALLBACK_ERROR_PREFIX)) {
            msg = msg.substring(STUDIO_CALLBACK_ERROR_PREFIX.length());
            fireLoginFailed(new Exception (msg));
        }
    }

    private Map<String, String> decodeMsg(String data) {
        Map<String, String> map = new HashMap<String, String>();
        if (data.startsWith(STUDIO_CALLBACK_PREFIX)) {
            data = data.substring(STUDIO_CALLBACK_PREFIX.length());
        }
        if (data.startsWith(SSOUtil.STUDIO_REDIRECT_URL)) {
            data = data.substring(SSOUtil.STUDIO_REDIRECT_URL.length());
        }
        if (data.startsWith("?")) {
            data = data.substring("?".length());
        }

        String[] splits = data.split("&");
        for (int i = 0; i < splits.length; i++) {
            String str = splits[i];
            String[] spls = str.split("=");
            if (spls.length == 2) {
                map.put(spls[0], spls[1]);
            } else {
                LOGGER.error("Parse msg error is should be contains =:" + str);
            }
        }
        return map;
    }

    public void stop() {
        isRunning = false;
        listenPort = -1;
    }

    private Integer newPort() {
        final Integer port = Integer.getInteger("stduio.login.client.monitor.port", -1);
        if (port <= 0) {
            try (ServerSocket socket = new ServerSocket(0)) {
                socket.setReuseAddress(true);
                return socket.getLocalPort();
            } catch (final IOException e) {
                throw new IllegalStateException(e);
            }
        }
        return port;
    }

    private void fireLoginStop(String code, String dataCenter) {
        for (LoginEventListener l : listenerSet) {
            try {
                l.loginStop(code, dataCenter);
            } catch (Exception ex) {
                LOGGER.error(ex);
            }
        }
    }

    private void fireLoginStart() {
        for (LoginEventListener l : listenerSet) {
            try {
                l.loginStart();
            } catch (Exception ex) {
                LOGGER.error(ex);
            }
        }
    }

    private void fireLoginFailed(Exception ex) {
        for (LoginEventListener l : listenerSet) {
            try {
                l.loginFailed(ex);
            } catch (Exception e) {
                LOGGER.error(e);
            }
        }
    }

    public void addLoginEventListener(LoginEventListener listener) {
        listenerSet.add(listener);
    }

    public void removeLoginEventListener(LoginEventListener listener) {
        if (listenerSet.contains(listener)) {
            listenerSet.remove(listener);
        }
    }

    public int getListenPort() {
        return listenPort;
    }

    @Override
    public void run() {
        if (isRunning) {
            LOGGER.info("Login client monitor started.");
            return;
        }
        listenPort = newPort();
        ServerSocket server;
        try {
            server = new ServerSocket(listenPort);
            if (SSOClientUtil.isDebugMode()) {
                LOGGER.info("Start sso client monitor on " + listenPort);
            }
            isRunning = true;
            fireLoginStart();
            while (isRunning) {
                Socket socket = server.accept();
                try {
                    InputStream inputStream = socket.getInputStream();
                    byte[] bytes = new byte[1024];
                    int len;
                    StringBuilder sb = new StringBuilder();
                    while ((len = inputStream.read(bytes)) != -1) {
                        sb.append(new String(bytes, 0, len, StandardCharsets.UTF_8));
                    }
                    inputStream.close();
                    processData(sb.toString());
                    stop();
                    if (SSOClientUtil.isDebugMode()) {
                        LOGGER.info("Stop sso client monitor");
                    }
                    break;
                } catch (Exception e) {
                    LOGGER.error(e);
                    fireLoginFailed(e);
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        LOGGER.error(e);
                        fireLoginFailed(e);
                    }
                }
            }
        } catch (Exception ex) {
            LOGGER.error(ex);
            fireLoginFailed(ex);
        }
    }

    public static boolean isRunning() {
        return isRunning;
    }
}
