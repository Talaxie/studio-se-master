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
package org.talend.rcp.intro;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.ISources;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.ui.CoreUIPlugin;

/**
 * Provides the activation state of the webhooks (Talaxie > Webhook preferences), used to show or hide the related
 * actions (see the "org.talend.rcp.webhook.nexus" activity).
 */
public class WebhookSourceProvider extends AbstractSourceProvider {

    public static final String IS_NEXUS_ENABLED = "WebhookSourceProvider.isNexusEnabled"; //$NON-NLS-1$

    private final IPreferenceStore preferenceStore = CoreUIPlugin.getDefault().getPreferenceStore();

    private final IPropertyChangeListener preferenceListener = event -> {
        if (ITalendCorePrefConstants.WEBHOOK_NEXUS_ENABLED.equals(event.getProperty())) {
            fireSourceChanged(ISources.WORKBENCH, IS_NEXUS_ENABLED, isNexusEnabled());
        }
    };

    public WebhookSourceProvider() {
        preferenceStore.addPropertyChangeListener(preferenceListener);
    }

    @Override
    public Map getCurrentState() {
        Map<String, Boolean> stateMap = new HashMap<String, Boolean>();
        stateMap.put(IS_NEXUS_ENABLED, isNexusEnabled());
        return stateMap;
    }

    private boolean isNexusEnabled() {
        return preferenceStore.getBoolean(ITalendCorePrefConstants.WEBHOOK_NEXUS_ENABLED);
    }

    @Override
    public void dispose() {
        preferenceStore.removePropertyChangeListener(preferenceListener);
    }

    @Override
    public String[] getProvidedSourceNames() {
        return new String[] { IS_NEXUS_ENABLED };
    }
}
