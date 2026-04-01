// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.SecurePreferencesFactory;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class SecurityStorageUtil {

    public static void saveToSecurityStorage(String pathName, String key, String value, boolean encrypt) throws Exception {
        saveToSecurityStorage(pathName, key, value, encrypt, true);
    }

    public static void saveToSecurityStorage(String pathName, String key, String value, boolean encrypt, boolean flush)
            throws Exception {
        ISecurePreferences securePreferences = SecurePreferencesFactory.getDefault();
        ISecurePreferences node = securePreferences.node(pathName);
        node.put(key, value, encrypt);
        if (flush) {
            securePreferences.flush();
        }
    }

    public static void flushSecurityStorage() throws Exception {
        ISecurePreferences securePreferences = SecurePreferencesFactory.getDefault();
        securePreferences.flush();
    }

    public static String getValueFromSecurityStorage(String pathName, String key) throws Exception {
        ISecurePreferences securePreferences = SecurePreferencesFactory.getDefault();
        if (!securePreferences.nodeExists(pathName)) {
            return null;
        }
        ISecurePreferences node = securePreferences.node(pathName);
        return node.get(key, null);
    }

    public static Map<String, String> getSecurityStorageNodePairs(String pathName) throws Exception {
        ISecurePreferences securePreferences = SecurePreferencesFactory.getDefault();
        if (!securePreferences.nodeExists(pathName)) {
            return null;
        }
        Map<String, String> keyValuePair = new HashMap<String, String>();
        ISecurePreferences node = securePreferences.node(pathName);
        for (String key : node.keys()) {
            keyValuePair.put(key, node.get(key, null));
        }
        return keyValuePair;
    }

}
