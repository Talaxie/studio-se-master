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
package org.talend.repository.demo.imports;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.talend.core.model.properties.ContextItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.constants.FileConstants;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.repository.items.importexport.handlers.ImportExportHandlersManager;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.talend.repository.items.importexport.manager.ResourcesManager;
import org.talend.repository.items.importexport.ui.managers.FileResourcesUnityManager;

/**
 * created by ldong on 2014-4-29 Detailled comment
 *
 */
public class DiDemoImportTest extends DemosImportTest {

	private static final String DI_DEMO_PLUGIN_ID = "org.talend.resources";

	private ResourcesManager diResManager;

	@Before
	public void importDiDemo() throws Exception {
		initDemo(DI_DEMO_PLUGIN_ID);
		Assert.assertNotNull(currentDemo);
		initTestPaths();
		initTempPro();
		diResManager = DemoImportTestUtil.getResourceManager(currentDemo);
		Assert.assertNotNull(diResManager);
		rootPath = getRootPath(diResManager);
		collectDemoData(rootPath);
		ImportExportHandlersManager importManager = new ImportExportHandlersManager();
		List<ImportItem> projectRecords = importManager.populateImportingItems(diResManager, true,
				new NullProgressMonitor());
		Assert.assertTrue(projectRecords.size() > 0);
		importManager.importItemRecords(new NullProgressMonitor(), diResManager, projectRecords, true,
				projectRecords.toArray(new ImportItem[0]), null);
	}

	@Test
	public void testDiDemoJobItemsComplete() throws Exception {
		// test the job items under DI_Demo.zip
		Assert.assertTrue(diResManager instanceof FileResourcesUnityManager);

		List<File> demoJobItemFiles = getDemoItemFileList(rootPath + File.separator + processItemPath);
		Assert.assertTrue(demoJobItemFiles.size() > 0);
		int currentJobItemsSize = ProxyRepositoryFactory.getInstance().getAll(ERepositoryObjectType.PROCESS).size();
		Assert.assertTrue(currentJobItemsSize > 0);
		// items in the DI_Demo.zip,there only has one item with two versions,the item
		// is tAddCRC,maybe need only
		// keep one version later for this item
		Assert.assertEquals(demoJobItemFiles.size() - 1, currentJobItemsSize);

		// test the context items under DI_Demo.zip
		int currentContextItemsSize = ProxyRepositoryFactory.getInstance().getAll(ERepositoryObjectType.CONTEXT).size();
		List<File> demoContextItemsFiles = getDemoItemFileList(rootPath + File.separator + contextItemPath);
		Assert.assertTrue(demoContextItemsFiles.size() > 0);

        // TUP-35909:test the ContextType content for 'globalContext'
        List<ContextItem> contextItemList = null;
        contextItemList = ProxyRepositoryFactory.getInstance().getContextItem();
        for (ContextItem contextItem : contextItemList) {
            if (contextItem.getProperty().getDisplayName().equals("globalContext")) {
                EList contexts = ((ContextItem) contextItem).getContext();
                for (Object context : contexts) {
                    if (context instanceof ContextType) {
                        List<Object> contextParamList = ((ContextType) context).getContextParameter();
                        // demo
                        Assert.assertNotNull("Name of ContextType should not be null", ((ContextType) context).getName());
                        // root,name,city...
                        Assert.assertTrue("contextParameter items should be more than 0",
                                contextParamList.size() > 0);
                    }
                }
            }
        }

		Assert.assertTrue(currentContextItemsSize > 0);
		Assert.assertEquals(demoContextItemsFiles.size(), currentContextItemsSize);

		// test the metadata items under DI_Demo.zip
		int currentConnectionItemsSize = ProxyRepositoryFactory.getInstance().getAll(ERepositoryObjectType.METADATA)
				.size();
		List<File> demoConItemsFiles = getDemoItemFileList(rootPath + File.separator + connectionItemPath);
		Assert.assertTrue(demoConItemsFiles.size() > 0);

		Assert.assertTrue(currentConnectionItemsSize > 0);
		Assert.assertEquals(demoConItemsFiles.size(), currentConnectionItemsSize);

		// test the routine items under DI_Demo.zip
		doRoutinesItemsTest(rootPath);

		// test the documention items under DI_Demo.zip
		int currentDocItemsSize = ProxyRepositoryFactory.getInstance().getAll(ERepositoryObjectType.DOCUMENTATION)
				.size();
		List<File> demoDocItemsFiles = getDemoItemFileList(rootPath + File.separator + documentionPath);
		Assert.assertTrue(demoDocItemsFiles.size() > 0);
		Assert.assertTrue(currentDocItemsSize > 0);
		Assert.assertEquals(demoDocItemsFiles.size(), currentDocItemsSize);
	}

	protected Map<String, String> getCollectFolderMap(String rootPath) {
		Map<String, String> map = super.getCollectFolderMap(rootPath);
		map.put(rootPath + File.separator + processItemPath, FileConstants.ITEM_EXTENSION);
		map.put(rootPath + File.separator + contextItemPath, FileConstants.ITEM_EXTENSION);
		map.put(rootPath + File.separator + connectionItemPath, FileConstants.ITEM_EXTENSION);
		map.put(rootPath + File.separator + documentionPath, FileConstants.ITEM_EXTENSION);
		return map;
	}

    protected String getRootPath(ResourcesManager resManager) {
        Iterator path = resManager.getPaths().iterator();
        String firstFilePath = ((Path) path.next()).toPortableString();
        String tempFolderPath = firstFilePath.substring(0,
                firstFilePath.indexOf(TEMP_FOLDER_SUFFIEX) + TEMP_FOLDER_SUFFIEX.length());
        Assert.assertTrue(new File(tempFolderPath).exists());
        return tempFolderPath + File.separator + demoName.toUpperCase();
    }
}
