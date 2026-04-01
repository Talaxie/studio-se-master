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
package org.talend.rcp.intro;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.AbstractSourceProvider;
import org.talend.core.PluginChecker;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.ui.CoreUIPlugin;
import org.talend.core.ui.branding.IBrandingService;

public class HelpMenuProvider extends AbstractSourceProvider {

    private static final String IS_TIS = "HelpMenuProvider.isTis";//$NON-NLS-1$
    private static final String IS_ETLTOOL = "HelpMenuProvider.isEtlTool";//$NON-NLS-1$

    @Override
    public Map getCurrentState() {
        Map<String, Boolean> stateMap = new HashMap<String, Boolean>();
        stateMap.put(IS_TIS, testIfShouldBeShown());
        stateMap.put(IS_ETLTOOL, testIfEtlToolShouldBeShown());
        return stateMap;
    }

    private boolean testIfShouldBeShown() {
        boolean isTis = PluginChecker.isTIS();
        boolean isPoweredbyTalend = IBrandingService.get().isPoweredbyTalend();
        return isTis && isPoweredbyTalend;
    }

    private boolean testIfEtlToolShouldBeShown() {
        return CoreUIPlugin.getDefault().getPreferenceStore().getBoolean(ITalendCorePrefConstants.WEBHOOK_ETLTOOL_ENABLED);
    }

    @Override
    public void dispose() {
    }

    @Override
    public String[] getProvidedSourceNames() {
        return new String[] { IS_TIS };
    }
}
