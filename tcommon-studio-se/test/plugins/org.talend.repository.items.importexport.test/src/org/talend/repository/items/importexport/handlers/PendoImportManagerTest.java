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
package org.talend.repository.items.importexport.handlers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.talend.core.pendo.PendoItemSignatureUtil;
import org.talend.core.pendo.PendoItemSignatureUtil.ValueEnum;
import org.talend.core.pendo.properties.PendoSignImportProperties;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoImportManagerTest {

    private String originalProdDate;

    @Before
    public void setUp() {
        originalProdDate = System.getProperty(PendoItemSignatureUtil.PROD_DATE_ID);
        System.setProperty(PendoItemSignatureUtil.PROD_DATE_ID, String.valueOf(System.currentTimeMillis()));
    }

    @After
    public void clean() {
        if (StringUtils.isBlank(originalProdDate)) {
            originalProdDate = "";
        }
        System.setProperty(PendoItemSignatureUtil.PROD_DATE_ID, originalProdDate);
    }

    @Test
    public void testCollectProperties() throws Exception {
        PendoImportManager pendoImportManager = new PendoImportManager();
        pendoImportManager.setStudioImport(true);
        Field field = pendoImportManager.getClass().getDeclaredField("isTrackAvailable");
        field.setAccessible(true);
        field.setBoolean(pendoImportManager, true);
        Map<String, Integer> tosUnsignMap = pendoImportManager.getTosUnsignItemMap();
        Set<String> projectVersionSet = pendoImportManager.getProjectVersionSet();
        tosUnsignMap.put("TOS_TOP", 0);
        tosUnsignMap.put("TOS_ESB", 2);
        tosUnsignMap.put("TOS_DI", 1);
        tosUnsignMap.put("TOS_BD", 3);
        projectVersionSet.add("7.3.1");
        projectVersionSet.add("8.0.1");
        projectVersionSet.add("7.2.1");

        pendoImportManager.collectProperties();
        PendoSignImportProperties properties = pendoImportManager.getImportProperties();
        String projectCreateDate = PendoItemSignatureUtil.formatDate(PendoItemSignatureUtil.getCurrentProjectCreateDate(),
                "yyyy-MM-dd");
        String prodDate = PendoItemSignatureUtil.formatDate(System.getProperty(PendoItemSignatureUtil.PROD_DATE_ID),
                "yyyy-MM-dd");
        assertTrue(pendoImportManager.isTrackRequired());
        assertEquals("[7.2.1, 7.3.1, 8.0.1]", properties.getSourceVersion().toString());
        assertEquals("{\"TOS_DI\":1,\"TOS_BD\":3,\"TOS_ESB\":2,\"TOS_TOP\":0}", properties.getUnsignSEItems());
        assertEquals(ValueEnum.YES.getDisplayValue(), properties.getGracePeriod());
        assertEquals(ValueEnum.NOT_APPLICATE.getDisplayValue(), properties.getValidMigrationToken());
        assertEquals(projectCreateDate, properties.getProjectCreateDate());
        assertEquals(prodDate, properties.getInstallDate());
    }

}
