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
package org.talend.repository.items.importexport.ui.managers;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.migration.MigrationReportHelper;
import org.talend.repository.items.importexport.handlers.ImportExportHandlersManager;
import org.talend.repository.items.importexport.handlers.model.EmptyFolderImportItem;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.talend.repository.items.importexport.manager.ResourcesManager;

/**
 * created by wchen on Aug 4, 2016 Detailled comment
 *
 */
public class FileResourcesUnityManagerTest {

    /**
     * DOC wchen Comment method "setUp".
     *
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * DOC wchen Comment method "tearDown".
     *
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDoUnify() throws Exception {
        Bundle bundle = Platform.getBundle("org.talend.repository.items.importexport.ui.test");
        URL itemsUrl = bundle.getEntry("resources/empty_folder.zip");
        ImportExportHandlersManager manager = new ImportExportHandlersManager();
        File file = new File(FileLocator.toFileURL(itemsUrl).toURI());
        if (!file.exists()) {
            throw new FileNotFoundException("empty_folder.zip not found");
        }
        FileResourcesUnityManager resManager = new FileResourcesUnityManager(file);
        resManager.doUnify();

        Assert.assertTrue(!resManager.getEmptyFolders().isEmpty());

        List<ImportItem> importItems = manager.populateImportingItems(resManager, true, new NullProgressMonitor());

        Assert.assertEquals(importItems.size(), 5);
        for (int i = 0; i < 5; i++) {
            ImportItem item = importItems.get(i);
            Assert.assertEquals(item.getRepositoryType(), ERepositoryObjectType.PROCESS);
            switch (i) {
            case 0:
                Assert.assertEquals(item.getClass().getSimpleName(), ImportItem.class.getSimpleName());
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                Assert.assertEquals(item.getClass().getSimpleName(), EmptyFolderImportItem.class.getSimpleName());
                break;

            default:
                break;
            }
        }
    }

    @Test
    public void testGenerateCorrectMigrationReport() throws Exception, IOException {
        Bundle bundle = Platform.getBundle("org.talend.repository.items.importexport.ui.test");
        URL itemsUrl = bundle.getEntry("resources/checkInvalidReportItems.zip");
        ImportExportHandlersManager manager = new ImportExportHandlersManager();
        File file = new File(FileLocator.toFileURL(itemsUrl).toURI());
        if (!file.exists()) {
            throw new FileNotFoundException("checkInvalidReportItems.zip not found");
        }
        FileResourcesUnityManager fileUnityManager = ResourcesManagerFactory.getInstance().createFileUnityManager(file);
        ResourcesManager resManager = fileUnityManager.doUnify();
        if(resManager != null) {
            ImportExportHandlersManager importManager = new ImportExportHandlersManager();
            List<ImportItem> importItems = importManager.populateImportingItems(resManager, true, new NullProgressMonitor());
            
            importManager.importItemRecords(new NullProgressMonitor(), resManager, importItems, true, importItems.toArray(new ImportItem[0]), new Path(""), false);
        }
        
        String reportPath = MigrationReportHelper.getInstance().getReportGeneratedPath();
        if(!StringUtils.isEmpty(reportPath)) {
            List<String> readAllLines = Files.readAllLines(Paths.get(reportPath), StandardCharsets.UTF_8);
            StringBuilder builder = new StringBuilder();
            if(readAllLines.size() >1) {
                String commaSep = ",";
                String[] titleLine = readAllLines.get(0).split(commaSep);
                builder.append(titleLine[0] + commaSep + titleLine[2] + commaSep + titleLine[3] + commaSep + titleLine[4] + "\n");
                for(int i=1; i<readAllLines.size(); i++) {
                    String[] reportLine = readAllLines.get(i).split(commaSep);
                    builder.append(reportLine[0] + commaSep + reportLine[2] + commaSep + reportLine[3] + commaSep + reportLine[4] + "\n");
                }
                
                fail(builder.toString());
            }
        }
        
        if (resManager != null) {
            resManager.closeResource();
        }
        
        assertTrue(true);
    }
}
