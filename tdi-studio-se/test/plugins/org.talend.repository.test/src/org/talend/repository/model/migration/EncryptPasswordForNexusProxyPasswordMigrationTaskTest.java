package org.talend.repository.model.migration;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.general.Project;
import org.talend.core.model.general.TalendNature;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.User;
import org.talend.core.nexus.TalendLibsServerManager;
import org.talend.core.repository.recyclebin.RecycleBinManager;
import org.talend.core.repository.utils.XmiResourceManager;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.repository.ProjectManager;
import org.talend.utils.security.StudioEncryption;


public class EncryptPasswordForNexusProxyPasswordMigrationTaskTest {

    private ProjectPreferenceManager prefManager = new ProjectPreferenceManager("org.talend.proxy.nexus",true);
    Project project = ProjectManager.getInstance().getCurrentProject();
    
    @Before
    public void beforeTest() throws PersistenceException, CoreException {
        clearPassword();
    }
    
    @After
    public void afterTest() throws Exception {
        clearPassword();
    }

    //if clear test , then after migration , it will be encrypted
    @Test
    public void testEnCryptPassowrdForNexusProxy() {
        try {
            String passwordNotEncypted = "Talend123";
            prefManager.setValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD, passwordNotEncypted);
            prefManager.save();
            EncryptPasswordForNexusProxyPasswordMigrationTask migrationTask = new EncryptPasswordForNexusProxyPasswordMigrationTask();
            migrationTask.execute(project);
            String encryptedPassword = prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD);
            Assert.assertTrue(StudioEncryption.hasEncryptionSymbol(encryptedPassword));
        }catch(Exception e) {
            ExceptionHandler.process(e);
            Assert.fail(e.getMessage());
        }
    }
    
    //if there's no nexus proxy password , it will not be encrypted
    @Test
    public void testNotEnCryptPassowrdForNexusProxy() {
        try {
            EncryptPasswordForNexusProxyPasswordMigrationTask migrationTask = new EncryptPasswordForNexusProxyPasswordMigrationTask();
            migrationTask.execute(project);
            String encryptedPassword = prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD);
            Assert.assertEquals(encryptedPassword, "");
        }catch(Exception e) {
            ExceptionHandler.process(e);
            Assert.fail(e.getMessage());
        }
    }

    //if there's already encrypted password , it will not be encrypted twice
    @Test
    public void testNotEnCryptPassowrdForNexusProxyTwice() {
        try {
            prefManager.setValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD, StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).encrypt("Talend123"));
            prefManager.save();
            String passwordEncypted = prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD);
            EncryptPasswordForNexusProxyPasswordMigrationTask migrationTask = new EncryptPasswordForNexusProxyPasswordMigrationTask();
            migrationTask.execute(project);
            String passwordFromPrefManager = prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD);
            Assert.assertEquals(passwordEncypted, passwordFromPrefManager);
        }catch(Exception e) {
            ExceptionHandler.process(e);
            Assert.fail(e.getMessage());
        }
    }

    private void clearPassword() {
        prefManager.setValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD, "");
    }

}
