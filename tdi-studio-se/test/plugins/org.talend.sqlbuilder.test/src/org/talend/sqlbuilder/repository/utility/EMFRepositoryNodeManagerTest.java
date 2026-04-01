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
package org.talend.sqlbuilder.repository.utility;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;


/**
 * DOC sbliu  class global comment. Detailled comment
 */
public class EMFRepositoryNodeManagerTest {

    @Test
    public void testCollectTableNames() {
        String leftDbQuote= "\"", rightDbQuote = "\"";
        
        String sqlFromStr = "dbo.\"a2\"";
        List<String> tableNames = EMFRepositoryNodeManager.getInstance().collectTableNames(sqlFromStr, leftDbQuote, rightDbQuote);
        assertTrue(tableNames.size() == 1);
        assertTrue(tableNames.stream().anyMatch(name->name.trim().equals("a2")));
        
        sqlFromStr = "dbo.AUTOTEST21";
        tableNames = EMFRepositoryNodeManager.getInstance().collectTableNames(sqlFromStr, leftDbQuote, rightDbQuote);
        assertTrue(tableNames.size() == 1);
        assertTrue(tableNames.stream().anyMatch(name->name.trim().equals("AUTOTEST21")));
        
        sqlFromStr = "master.dbo.MigrationTEST";
        tableNames = EMFRepositoryNodeManager.getInstance().collectTableNames(sqlFromStr, leftDbQuote, rightDbQuote);
        assertTrue(tableNames.size() == 1);
        assertTrue(tableNames.stream().anyMatch(name->name.trim().equals("MigrationTEST")));
        
        sqlFromStr = "master.dbo.MigrationTEST,dbo.\"a2\"";
        tableNames = EMFRepositoryNodeManager.getInstance().collectTableNames(sqlFromStr, leftDbQuote, rightDbQuote);
        assertTrue(tableNames.size() == 2);
        assertTrue(tableNames.stream().anyMatch(name->name.trim().equals("MigrationTEST")));
        assertTrue(tableNames.stream().anyMatch(name->name.trim().equals("a2")));
        
        sqlFromStr = "master.dbo.MigrationTEST,dbo.a2";
        tableNames = EMFRepositoryNodeManager.getInstance().collectTableNames(sqlFromStr, leftDbQuote, rightDbQuote);
        assertTrue(tableNames.size() == 2);
        assertTrue(tableNames.stream().anyMatch(name->name.trim().equals("MigrationTEST")));
        assertTrue(tableNames.stream().anyMatch(name->name.trim().equals("a2")));
    }
}
