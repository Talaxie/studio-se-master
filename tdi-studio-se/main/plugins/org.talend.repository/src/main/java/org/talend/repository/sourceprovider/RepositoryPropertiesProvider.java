// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.sourceprovider;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.AbstractSourceProvider;
import org.talend.core.PluginChecker;
import org.talend.core.ui.branding.IBrandingService;

/**
 * created by hcyi on Sep 14, 2021
 * Detailled comment
 *
 */
public class RepositoryPropertiesProvider extends AbstractSourceProvider {

    private static final String SHOW_LITE_UPDATESITE_PREF = "RepositoryPropertiesProvider.showLiteUpdatesitePref";//$NON-NLS-1$

    private static final String SHOW_ETLTOOL_ACTION = "RepositoryPropertiesProvider.showEtlToolAction";//$NON-NLS-1$

    @Override
    public Map getCurrentState() {
        Map<String, Boolean> stateMap = new HashMap<String, Boolean>();
        stateMap.put(SHOW_LITE_UPDATESITE_PREF, showLiteUpdatesitePref());
        stateMap.put(SHOW_ETLTOOL_ACTION, showEtlToolAction());
        return stateMap;
    }

    private boolean showLiteUpdatesitePref() {
        boolean isTis = PluginChecker.isTIS();
        boolean isPoweredbyTalend = IBrandingService.get().isPoweredbyTalend();
        boolean isStudioLite = PluginChecker.isStudioLite();
        return isTis && isStudioLite && isPoweredbyTalend;
    }

    private boolean showEtlToolAction() {
        return false;
    }

    @Override
    public void dispose() {
    }

    @Override
    public String[] getProvidedSourceNames() {
        return new String[] { SHOW_LITE_UPDATESITE_PREF };
    }
}
