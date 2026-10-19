// ============================================================================
//
// Copyright (C) 2006-2026 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.preference.ai;

import org.apache.log4j.Logger;
import org.eclipse.jface.preference.IPreferenceStore;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.utils.SecurityStorageUtil;

/**
 * Settings of the connection to the LLM used by the Talaxie assistant (Talaxie > AI preferences).
 * <p>
 * The API key is stored encrypted in the Eclipse secure storage, never in the preference files.
 */
public final class AiSettings {

    private static final Logger LOGGER = Logger.getLogger(AiSettings.class);

    public static final String ENABLED = "AI_ENABLED"; //$NON-NLS-1$

    public static final String PROVIDER = "AI_PROVIDER"; //$NON-NLS-1$

    public static final String URL = "AI_URL"; //$NON-NLS-1$

    public static final String MODEL = "AI_MODEL"; //$NON-NLS-1$

    public static final String MAX_TOKENS = "AI_MAX_TOKENS"; //$NON-NLS-1$

    public static final String TIMEOUT = "AI_TIMEOUT"; //$NON-NLS-1$

    public static final int DEFAULT_MAX_TOKENS = 16000;

    /** Timeout of a request, in seconds */
    public static final int DEFAULT_TIMEOUT = 120;

    private static final String SECURE_STORAGE_NODE = "org.talend.core.ui/ai"; //$NON-NLS-1$

    private static final String SECURE_STORAGE_KEY_PREFIX = "apiKey."; //$NON-NLS-1$

    private AiSettings() {
    }

    public static IPreferenceStore getPreferenceStore() {
        IPreferenceStore store = CoreUIPlugin.getDefault().getPreferenceStore();
        initializeDefaults(store);
        return store;
    }

    public static void initializeDefaults(IPreferenceStore store) {
        store.setDefault(ENABLED, false);
        store.setDefault(PROVIDER, AiProvider.ANTHROPIC.name());
        store.setDefault(URL, ""); //$NON-NLS-1$
        store.setDefault(MODEL, ""); //$NON-NLS-1$
        store.setDefault(MAX_TOKENS, DEFAULT_MAX_TOKENS);
        store.setDefault(TIMEOUT, DEFAULT_TIMEOUT);
    }

    public static boolean isEnabled() {
        return getPreferenceStore().getBoolean(ENABLED);
    }

    public static AiProvider getProvider() {
        return AiProvider.fromName(getPreferenceStore().getString(PROVIDER));
    }

    /** The URL of the provider API, the default one of the provider if none is defined */
    public static String getUrl() {
        String url = getPreferenceStore().getString(URL);
        return url == null || url.isBlank() ? getProvider().getDefaultUrl() : url.trim();
    }

    public static String getModel() {
        String model = getPreferenceStore().getString(MODEL);
        return model == null || model.isBlank() ? getProvider().getDefaultModel() : model.trim();
    }

    public static int getMaxTokens() {
        return getPreferenceStore().getInt(MAX_TOKENS);
    }

    public static int getTimeout() {
        return getPreferenceStore().getInt(TIMEOUT);
    }

    /** The API key of the selected provider */
    public static String getApiKey() {
        return getApiKey(getProvider());
    }

    /** The API key is kept per provider, so switching between providers does not lose the keys */
    public static String getApiKey(AiProvider provider) {
        try {
            String key = SecurityStorageUtil.getValueFromSecurityStorage(SECURE_STORAGE_NODE,
                    SECURE_STORAGE_KEY_PREFIX + provider.name());
            return key == null ? "" : key; //$NON-NLS-1$
        } catch (Exception e) {
            LOGGER.error("Unable to read the AI API key from the secure storage", e); //$NON-NLS-1$
            return ""; //$NON-NLS-1$
        }
    }

    public static void setApiKey(AiProvider provider, String apiKey) throws Exception {
        SecurityStorageUtil.saveToSecurityStorage(SECURE_STORAGE_NODE, SECURE_STORAGE_KEY_PREFIX + provider.name(),
                apiKey == null ? "" : apiKey.trim(), true); //$NON-NLS-1$
    }
}
