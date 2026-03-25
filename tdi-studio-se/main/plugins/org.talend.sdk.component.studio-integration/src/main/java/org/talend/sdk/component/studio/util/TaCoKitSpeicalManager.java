// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.sdk.component.studio.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.talend.utils.security.StudioEncryption;

/**
 * created by hcyi on Jun 15, 2023
 * Detailled comment
 *
 */
public class TaCoKitSpeicalManager {

    public final static String[] NO_GUESS_SCHEMA_COMPONENTS = { "JDBCRow", "SingleStoreRow", "DeltaLakeRow", "JDBCOutputBulk", "SingleStoreOutputBulk", "JDBCOutputBulkExec", "SingleStoreOutputBulkExec", "JDBCCommit", //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$
            "JDBCRollback", "JDBCSP" }; //$NON-NLS-1$ //$NON-NLS-2$

    public final static String[] NO_EXISTING_CONNECTION_NAMES = { "Commit", "Rollback" }; //$NON-NLS-1$ //$NON-NLS-2$

    public final static String[] CAN_PARALLELIZE_COMPONENTS = { "JDBCOutput", "DeltaLakeOutput", "SingleStoreOutput" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    
    public final static String[] SUPPORT_ITERATE_PROCESSOR_COMPONENTS = { "JDBCSP", "JDBCRow" }; //$NON-NLS-1$ //$NON-NLS-2$
    
    public final static String JDBC = "JDBC"; //$NON-NLS-1$

    public final static String PROXY_D = "-D";//$NON-NLS-1$

    public final static String HTTPS_PROXYSET = "https.proxySet";//$NON-NLS-1$

    public final static String HTTPS_PROXYHOST = "https.proxyHost";//$NON-NLS-1$

    public final static String HTTPS_PROXYPORT = "https.proxyPort";//$NON-NLS-1$

    public final static String HTTPS_PROXYUSER = "https.proxyUser";//$NON-NLS-1$

    public final static String HTTPS_PROXYPASSWORD = "https.proxyPassword";//$NON-NLS-1$

    public final static String HTTP_PROXYSET = "http.proxySet";//$NON-NLS-1$

    public final static String HTTP_PROXYHOST = "http.proxyHost";//$NON-NLS-1$

    public final static String HTTP_PROXYPORT = "http.proxyPort";//$NON-NLS-1$

    public final static String HTTP_PROXYUSER = "http.proxyUser";//$NON-NLS-1$

    public final static String HTTP_PROXYPASSWORD = "http.proxyPassword";//$NON-NLS-1$

    public final static String SOCKS_PROXYSET = "socksProxySet";//$NON-NLS-1$

    public final static String SOCKS_PROXYHOST = "socksProxyHost";//$NON-NLS-1$

    public final static String SOCKS_PROXYPORT = "socksProxyPort";//$NON-NLS-1$

    public final static String SOCKS_PROXYUSER = "socksProxyUser";//$NON-NLS-1$

    public final static String SOCKS_PROXYPASSWORD = "socksProxyPassword";//$NON-NLS-1$

    public static boolean supportGuessSchema(String componentName) {
        if (StringUtils.isNotBlank(componentName)) {
            if (ArrayUtils.contains(NO_GUESS_SCHEMA_COMPONENTS, componentName)
                    || ArrayUtils.contains(NO_GUESS_SCHEMA_COMPONENTS, componentName)) {
                return false;
            }
        }
        return true;
    }

    public static boolean supportUseExistingConnection(String name) {
        if (StringUtils.isNotBlank(name)) {
            if (ArrayUtils.contains(NO_EXISTING_CONNECTION_NAMES, name)) {
                return false;
            }
        }
        return true;
    }

    public static boolean canParallelize(String name) {
        if (StringUtils.isNotBlank(name)) {
            if (ArrayUtils.contains(CAN_PARALLELIZE_COMPONENTS, name)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean supportIterateProcessor(String name) {
        if (StringUtils.isNotBlank(name)) {
            if (ArrayUtils.contains(SUPPORT_ITERATE_PROCESSOR_COMPONENTS, name)) {
                return true;
            }
        }
        return false;
    }

    public static String[] getProxyForGuessSchema() {
        List<String> proxys = new ArrayList<String>();
        String proxyHost, proxyPort, proxyUsername, proxyPassword;
        boolean enableHttp = Boolean.getBoolean(HTTP_PROXYSET);
        boolean enableHttps = Boolean.getBoolean(HTTPS_PROXYSET);
        if (enableHttp || enableHttps) {
            proxys.add(PROXY_D + HTTP_PROXYSET + "=" + enableHttp); //$NON-NLS-1$
            proxys.add(PROXY_D + HTTPS_PROXYSET + "=" + enableHttps); //$NON-NLS-1$
            proxyHost = System.getProperty(HTTPS_PROXYHOST);
            if (proxyHost != null) {
                proxys.add(PROXY_D + HTTPS_PROXYHOST + "=" + proxyHost); //$NON-NLS-1$
            }
            proxyPort = System.getProperty(HTTPS_PROXYPORT);
            if (proxyPort != null) {
                proxys.add(PROXY_D + HTTPS_PROXYPORT + "=" + proxyPort); //$NON-NLS-1$
            }
            proxyUsername = System.getProperty(HTTPS_PROXYUSER);
            if (proxyUsername != null) {
                proxys.add(PROXY_D + HTTPS_PROXYUSER + "=" + proxyUsername); //$NON-NLS-1$
            }
            proxyPassword = System.getProperty(HTTPS_PROXYPASSWORD);
            if (proxyPassword != null) {
                String encryptedPassword = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM)
                        .encrypt(proxyPassword);
                proxys.add(PROXY_D + HTTPS_PROXYPASSWORD + "=" + encryptedPassword); //$NON-NLS-1$
            }
            proxyHost = System.getProperty(HTTP_PROXYHOST);
            if (proxyHost != null) {
                proxys.add(PROXY_D + HTTP_PROXYHOST + "=" + proxyHost); //$NON-NLS-1$
            }
            proxyPort = System.getProperty(HTTP_PROXYPORT);
            if (proxyPort != null) {
                proxys.add(PROXY_D + HTTP_PROXYPORT + "=" + proxyPort); //$NON-NLS-1$
            }
            proxyUsername = System.getProperty(HTTP_PROXYUSER);
            if (proxyUsername != null) {
                proxys.add(PROXY_D + HTTP_PROXYUSER + "=" + proxyUsername); //$NON-NLS-1$
            }
            proxyPassword = System.getProperty(HTTP_PROXYPASSWORD);
            if (proxyPassword != null) {
                String encryptedPassword = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM)
                        .encrypt(proxyPassword);
                proxys.add(PROXY_D + HTTP_PROXYPASSWORD + "=" + encryptedPassword); //$NON-NLS-1$
            }
            proxys.add(PROXY_D + SOCKS_PROXYSET + "=true"); //$NON-NLS-1$
            proxyHost = System.getProperty(SOCKS_PROXYHOST);
            if (proxyHost != null) {
                proxys.add(PROXY_D + SOCKS_PROXYHOST + "=" + proxyHost); //$NON-NLS-1$
            }
            proxyPort = System.getProperty(SOCKS_PROXYPORT);
            if (proxyPort != null) {
                proxys.add(PROXY_D + SOCKS_PROXYPORT + "=" + proxyPort); //$NON-NLS-1$
            }
            proxyUsername = System.getProperty("java.net.socks.username");//$NON-NLS-1$
            if (proxyUsername != null) {
                proxys.add(PROXY_D + SOCKS_PROXYUSER + "=" + proxyUsername); //$NON-NLS-1$
            }
            proxyPassword = System.getProperty("java.net.socks.password");//$NON-NLS-1$
            if (proxyPassword != null) {
                String encryptedPassword = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM)
                        .encrypt(proxyPassword);
                proxys.add(PROXY_D + SOCKS_PROXYPASSWORD + "=" + encryptedPassword); //$NON-NLS-1$
            }
        }
        return proxys.toArray(new String[proxys.size()]);
    }
}
