package org.talend.presentation.onboarding.resource.utils;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.repository.items.importexport.handlers.ImportExportHandlersManager;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.talend.repository.items.importexport.manager.ResourcesManager;
import org.talend.repository.items.importexport.ui.managers.FileResourcesUnityManager;
import org.talend.repository.items.importexport.ui.managers.ResourcesManagerFactory;

public class TalendImportUtilTest {

    @Test(timeout = 120000)
    public void testimportItemsOfLargXmlFile() throws Exception {
        //TUP-36820:Metadata -File Xml -Import is not responding in the Studio
        ProxyRepositoryFactory repFactory = ProxyRepositoryFactory.getInstance();
        List<IRepositoryViewObject> all = repFactory.getAll(ERepositoryObjectType.METADATA_FILE_XML);
        int num = (all == null) ? 0 : all.size();
        
        ResourcesManager diResManager;
        URL testJobURL = FileLocator.find(Platform.getBundle("org.talend.presentation.onboarding.resource.test"),
                new Path("/resources/largeXmlFile.zip"), null);
        if (testJobURL != null) {
            testJobURL = FileLocator.toFileURL(testJobURL);
        }
        File srcFile = new File(testJobURL.getFile());
        FileResourcesUnityManager fileUnityManager = ResourcesManagerFactory.getInstance().createFileUnityManager(srcFile);
        diResManager = fileUnityManager.doUnify();
        ImportExportHandlersManager importManager = new ImportExportHandlersManager();
        List<ImportItem> projectRecords = importManager.populateImportingItems(diResManager, true, new NullProgressMonitor());
        importManager.importItemRecords(new NullProgressMonitor(), diResManager, projectRecords, true,
                projectRecords.toArray(new ImportItem[0]), null);
        Assert.assertEquals(num + 1, repFactory.getAll(ERepositoryObjectType.METADATA_FILE_XML).size());
    }

    @After
    public void tearDown() throws Exception {
        try {
            ProxyRepositoryFactory repFactory = ProxyRepositoryFactory.getInstance();
            List<IRepositoryViewObject> all = repFactory.getAll(ERepositoryObjectType.METADATA_FILE_XML);
            System.out.println("[testimportItemsOfLargXmlFile]:xmlfiles:" + (all == null ? "0" : all.size()));
            for (IRepositoryViewObject obj : all) {
                System.out.println("[testimportItemsOfLargXmlFile]:The imported xml file:" + obj.getId() + "/" + obj.getLabel());
                if ("enm_enodeb_asset".equals(obj.getLabel())) {
                    System.out.println("[testimportItemsOfLargXmlFile]:Delete " + obj.getId() + "/" + obj.getLabel() + "...");
                    repFactory.deleteObjectLogical(obj);
                    repFactory.deleteObjectPhysical(obj);
                }
            }
        } finally {
            // To kill the blocked import thread in case of TestTimedOutException
            Set<Thread> threads = Thread.getAllStackTraces().keySet();
            for (Thread t : threads) {
                Thread.State state = t.getState();
                if (state.toString().equals("RUNNABLE")) {
                    for (StackTraceElement e : t.getStackTrace()) {
                        if (e.getClassName()
                                .contains(this.getClass().getName())) {
                            System.out.println("[testimportItemsOfLargXmlFile]:Stop hanging import thread...");
                            try {
                                t.stop();
                            } catch (java.lang.Throwable th) {
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
