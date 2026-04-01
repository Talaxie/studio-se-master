// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
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

import org.eclipse.core.runtime.Platform;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.utils.system.EclipseCommandLine;
import org.talend.sdk.component.studio.update.TaCoKitCarFeature;
import org.junit.Test;

/**
 * @author bhe created on Apr 8, 2022
 *
 */
public class TaCokitCarFeatureTest {

    @Test
    public void testGetJavaCMD() throws Exception {

        String vm = System.getProperty(EclipseCommandLine.PROP_VM);

        // windows
        if (Platform.getOS().equals(Platform.OS_WIN32)) {

            if (!StringUtils.isEmpty(vm)) {

                String javaCMD = TaCoKitCarFeature.getJavaCMD();
                assertTrue(StringUtils.endsWith(javaCMD, "java.exe"));

                assertTrue(new File(javaCMD).exists());
            }

        }

        // linux
        if (!Platform.getOS().equals(Platform.OS_WIN32)) {

            if (!StringUtils.isEmpty(vm)) {

                String javaCMD = TaCoKitCarFeature.getJavaCMD();
                assertTrue(StringUtils.endsWith(javaCMD, "java"));

                assertTrue(new File(javaCMD).exists());
            }
        }
    }

}
