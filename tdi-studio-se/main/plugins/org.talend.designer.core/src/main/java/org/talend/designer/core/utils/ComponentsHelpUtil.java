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
package org.talend.designer.core.utils;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.swt.program.Program;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.prefs.GeneralParametersProvider;

public class ComponentsHelpUtil {

    private static final String JVM_PARAM_ONLINE_HELP_VERSION = "online.help.version"; //$NON-NLS-1$

    private static String INTERNAL_VERSION = null;

    private static String PRODUCT_BASE_VERSION = null;

    static {
        initVersionData();
    }

    public static void initVersionData() {
        if (INTERNAL_VERSION == null) {
            INTERNAL_VERSION = VersionUtils.getInternalVersion();
        }
        if (PRODUCT_BASE_VERSION == null) {
            PRODUCT_BASE_VERSION = INTERNAL_VERSION.substring(0, 1) + INTERNAL_VERSION.substring(2, 3);
        }
    }

    public static boolean isUseOnLineHelp() {
        return true;
    }

    public static String calOnLineHelpURL(String componentName) {
        StringBuilder sb = new StringBuilder("https://document-link.us.cloud.talend.com/std_");
        sb.append(componentName.toLowerCase());
        sb.append("?version="); //$NON-NLS-1$
        if (!StringUtils.isEmpty(System.getProperty(JVM_PARAM_ONLINE_HELP_VERSION))) {
            sb.append(System.getProperty(JVM_PARAM_ONLINE_HELP_VERSION));
        } else {
            sb.append(PRODUCT_BASE_VERSION);
        }
        sb.append("&lang=").append(GeneralParametersProvider.getOnLineHelpLanguageSetting()); //$NON-NLS-1$
        sb.append("&env=prd");
        return sb.toString();
    }

    public static void openLineHelp(String componentName) {
        String url = calOnLineHelpURL(componentName);
        Program.launch(url);
    }

    public static void resetVersionData(String version) {
        INTERNAL_VERSION = version;
        PRODUCT_BASE_VERSION = null;
        initVersionData();
    }
}
