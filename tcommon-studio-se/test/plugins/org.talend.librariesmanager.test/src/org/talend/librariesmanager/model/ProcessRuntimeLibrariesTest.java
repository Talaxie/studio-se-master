package org.talend.librariesmanager.model;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Set;

import org.junit.Test;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;

/** Internal generated routines must not depend on repository routine declarations. */
public class ProcessRuntimeLibrariesTest {

    @Test
    public void emptyRoutineDependenciesKeepRuntimeLibraries() throws Exception {
        assertRuntimeLibraries(true);
    }

    @Test
    public void absentParametersKeepRuntimeLibraries() throws Exception {
        assertRuntimeLibraries(false);
    }

    private void assertRuntimeLibraries(boolean withParameters) throws Exception {
        Field systemModules = ModulesNeededProvider.class.getDeclaredField("systemModules");
        Field repositoryService = ModulesNeededProvider.class.getDeclaredField("repositoryService");
        systemModules.setAccessible(true);
        repositoryService.setAccessible(true);
        Object savedModules = systemModules.get(null);
        Object savedRepository = repositoryService.get(null);
        // Isolate the collector from the active project and extension registry.
        ModuleNeeded runtime = new ModuleNeeded("Routine PasswordEncryptUtil", "crypto-utils-7.1.16.jar", "", true,
                null, null, "mvn:org.talend.daikon/crypto-utils/7.1.16") {
            @Override
            public String getDefaultMavenURI() {
                // The collector test does not need the workspace's custom Maven URI map.
                return "mvn:org.talend.daikon/crypto-utils/7.1.16";
            }

            @Override
            public String getMavenUri() {
                return getDefaultMavenURI();
            }
        };
        try {
            systemModules.set(null, Arrays.asList(runtime));
            repositoryService.set(null, null);
            ProcessItem item = PropertiesFactory.eINSTANCE.createProcessItem();
            item.setProcess(TalendFileFactory.eINSTANCE.createProcessType());
            if (withParameters) {
                item.getProcess().setParameters(TalendFileFactory.eINSTANCE.createParametersType());
            }
            IProcess process = (IProcess) Proxy.newProxyInstance(IProcess.class.getClassLoader(),
                    new Class<?>[] { IProcess.class }, (proxy, method, args) -> null);
            Set<ModuleNeeded> modules = ModulesNeededProvider.getCodesModulesNeededForProcess(item, process, false);
            assertTrue("Generated internal routines still need their runtime libraries", modules.contains(runtime));
        } finally {
            systemModules.set(null, savedModules);
            repositoryService.set(null, savedRepository);
        }
    }
}
