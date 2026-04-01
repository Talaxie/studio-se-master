package org.talend.core;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.junit.Before;
import org.junit.Test;
import org.talend.core.runtime.process.ITalendProcessJavaProject;
import org.talend.designer.runprocess.IRunProcessService;

public class CoreServiceTest {
    
    private CoreService service;

    private ITalendProcessJavaProject talendProcessJavaProject;

    @Before
    public void setUp() throws Exception {
        service = new CoreService();
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IRunProcessService.class)) {
            IRunProcessService runProcessService = (IRunProcessService) GlobalServiceRegister.getDefault()
                    .getService(IRunProcessService.class);
            talendProcessJavaProject = runProcessService.getTempJavaProject();
        }
    }

    @Test
    public void testSyncLog4jSettings() throws CoreException, IOException {
        IRunProcessService runProcessService = null;
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IRunProcessService.class)) {
            runProcessService = (IRunProcessService) GlobalServiceRegister.getDefault().getService(IRunProcessService.class);
        }
        String log4jStrFromSettings = runProcessService.getTemplateStrFromPreferenceStore("log4jContent");

        IFile tmpFile = talendProcessJavaProject.getTempFolder().getFile("tempLog4j.xml");
        if (!tmpFile.exists()) {
            ByteArrayInputStream in = new ByteArrayInputStream(log4jStrFromSettings.getBytes());
            tmpFile.create(in, true, null);
            in.close();
        }
        log4jStrFromSettings = getFileContent(tmpFile);
        tmpFile.delete(true, null);

        service.syncLog4jSettings(talendProcessJavaProject);

        IFolder resourceFolder = talendProcessJavaProject.getExternalResourcesFolder();

        IFile log4jFile = null;
        if (runProcessService != null && runProcessService.isSelectLog4j2()) {
            log4jFile = resourceFolder.getFile("log4j2.xml");
        } else {
            log4jFile = resourceFolder.getFile("log4j.xml");
        }
        if (log4jFile != null && log4jFile.exists()) {
            String content = "test modification";
            InputStream in = new ByteArrayInputStream(content.getBytes());
            log4jFile.setContents(in, true, false, null);
        }

        service.syncLog4jSettings(talendProcessJavaProject);

        String log4jStrFromResouce = getFileContent(log4jFile);
        
        assertEquals(log4jStrFromSettings, log4jStrFromResouce);

    }

    private String getFileContent(IFile file) throws CoreException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file.getContents()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        String log4jStrFromResouce = stringBuilder.toString();
        bufferedReader.close();
        return log4jStrFromResouce;
    }

}
