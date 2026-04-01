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
package org.talend.rcp.intro;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.AbstractSourceProvider;
import org.talend.core.PluginChecker;
import org.talend.core.model.utils.TalendPropertiesUtil;
import org.talend.core.ui.branding.IBrandingService;

public class ResourceToolbarProvider extends AbstractSourceProvider {

    private static final String SHOW_RESOURSE = "ResourceToolbarProvider.showToolbar";//$NON-NLS-1$

    private static final String SHOW_EXCHANGE = "ResourceToolbarProvider.menuExchange";//$NON-NLS-1$

    private static final String SHOW_CLOUD = "ResourceToolbarProvider.menuCloud";//$NON-NLS-1$

    @Override
    public Map getCurrentState() {
        Map<String, Boolean> stateMap = new HashMap<String, Boolean>();
        stateMap.put(SHOW_RESOURSE, testIfShouldBeShown());
        stateMap.put(SHOW_CLOUD, testIfShouldShowCloud());
        return stateMap;
    }

    private Boolean testIfShouldShowCloud() {
        return !PluginChecker.isTIS();
    }


    private boolean testIfShouldBeShown() {
        boolean isTis = PluginChecker.isTIS();
        boolean isPoweredbyTalend = IBrandingService.get().isPoweredbyTalend();
        boolean isStudioLite = PluginChecker.isStudioLite();
        return isTis && isStudioLite && isPoweredbyTalend;
    }

    @Override
    public void dispose() {
    }

    @Override
    public String[] getProvidedSourceNames() {
        return new String[] { SHOW_RESOURSE, SHOW_EXCHANGE, SHOW_CLOUD };
    }
}
