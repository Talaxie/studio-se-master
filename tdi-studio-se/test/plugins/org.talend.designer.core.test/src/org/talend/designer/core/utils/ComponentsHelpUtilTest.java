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

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;
import org.talend.core.CorePlugin;
import org.talend.core.prefs.ITalendCorePrefConstants;

public class ComponentsHelpUtilTest {

    @Test
    public void testCalOnLineHelpURL() {
        String urlFr = "https://document-link.us.cloud.talend.com/std_treplicate?version=80&lang=fr&env=prd";
        String urlEn = "https://document-link.us.cloud.talend.com/std_treplicate?version=80&lang=en&env=prd";
        String urlJa = "https://document-link.us.cloud.talend.com/std_treplicate?version=80&lang=ja&env=prd";
        String originLanguage = CorePlugin.getDefault().getPluginPreferences()
                .getString(ITalendCorePrefConstants.LANGUAGE_SELECTOR);

        ComponentsHelpUtil.resetVersionData("8.0.1-SNAPSHOT");
        String componentName = "tReplicate";
        setLanguage(Locale.FRANCE.getLanguage());
        assertEquals(urlFr, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.US.getLanguage());
        assertEquals(urlEn, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.CHINA.getLanguage());
        assertEquals(urlEn, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.JAPAN.getLanguage());
        assertEquals(urlJa, ComponentsHelpUtil.calOnLineHelpURL(componentName));

        ComponentsHelpUtil.resetVersionData("8.0.1-M6");
        setLanguage(Locale.FRANCE.getLanguage());
        assertEquals(urlFr, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.US.getLanguage());
        assertEquals(urlEn, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.CHINA.getLanguage());
        assertEquals(urlEn, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.JAPAN.getLanguage());
        assertEquals(urlJa, ComponentsHelpUtil.calOnLineHelpURL(componentName));

        ComponentsHelpUtil.resetVersionData("8.0.1.20190620_1446");
        setLanguage(Locale.FRANCE.getLanguage());
        assertEquals(urlFr, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.US.getLanguage());
        assertEquals(urlEn, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.CHINA.getLanguage());
        assertEquals(urlEn, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.JAPAN.getLanguage());
        assertEquals(urlJa, ComponentsHelpUtil.calOnLineHelpURL(componentName));

        ComponentsHelpUtil.resetVersionData("8.0.1.20210723_0711-patch");
        setLanguage(Locale.FRANCE.getLanguage());
        assertEquals(urlFr, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.US.getLanguage());
        assertEquals(urlEn, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.CHINA.getLanguage());
        assertEquals(urlEn, ComponentsHelpUtil.calOnLineHelpURL(componentName));
        setLanguage(Locale.JAPAN.getLanguage());
        assertEquals(urlJa, ComponentsHelpUtil.calOnLineHelpURL(componentName));

        setLanguage(originLanguage);
        ComponentsHelpUtil.resetVersionData(null);
    }

    private void setLanguage(String language) {
        CorePlugin.getDefault().getPluginPreferences().setValue(ITalendCorePrefConstants.LANGUAGE_SELECTOR, language);
    }

}
