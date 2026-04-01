// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.runtime.util;

import static org.junit.Assert.fail;

import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class ModuleAccessHelperTest {

    @Test
    public void testModulePattern() throws Exception {
        Properties prop = ModuleAccessHelper.getProperties();
        prop.entrySet().stream().filter(en -> StringUtils.isNotBlank((String) en.getValue())).forEach(en -> {
            String value = (String) en.getValue();
            for (String module : value.split(",")) {
                if (module.trim().isEmpty() || module.contains(" ")) {
                    fail("module:[" + module + "] in " + value + " is invalid!");
                }
            }
        });
    }

    @Test
    public void testEmptyFirstLine() throws Exception {
        String content = IOUtils.toString(ModuleAccessHelper.getConfigFileURL().toURI(), "UTF-8");
        if (!content.startsWith("\n") && !content.startsWith("\r\n")) {
            fail("module_access.properties: Must keep first line Empty!");
        }
    }

}
