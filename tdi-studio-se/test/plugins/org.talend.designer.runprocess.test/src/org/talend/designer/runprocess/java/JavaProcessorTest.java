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
package org.talend.designer.runprocess.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.talend.commons.utils.VersionUtils;
import org.talend.commons.utils.generation.JavaUtils;
import org.talend.commons.utils.system.EnvironmentUtils;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.maven.utils.PomUtil;
import org.talend.designer.runprocess.ProcessorException;
import org.talend.designer.runprocess.ProcessorUtilities;
import org.talend.designer.runprocess.spark.SparkJavaProcessor;

/**
 * 
 * created by hcyi on Jul 22, 2019 Detailled comment
 *
 */
public class JavaProcessorTest {

    /**
     * Test method for {@link org.talend.designer.runprocess.Processor#replaceSnippet(java.lang.String)}.
     * 
     * @throws ProcessorException
     */
    @Test
    public void testReplaceSnippet() throws ProcessorException {

    }

    @Test
    public void testGetCommandLine4ExportConfig() throws ProcessorException {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId("_rHnrstwXEeijXfdWFqSaEA"); //$NON-NLS-1$
        property.setLabel("test"); //$NON-NLS-1$
        property.setVersion(VersionUtils.DEFAULT_VERSION);
        Process process = new Process(property);
        ProcessItem item = PropertiesFactory.eINSTANCE.createProcessItem();
        ProcessType processType = TalendFileFactory.eINSTANCE.createProcessType();
        property.setItem(item);
        item.setProperty(property);
        item.setProcess(processType);
        
        JavaProcessor processor = new JavaProcessor(process, property, false);

        // only for export
        ProcessorUtilities.setExportConfig(JavaUtils.JAVA_APP_NAME, null, null);

        String[] cmd = processor.getCommandLine();

        Assert.assertTrue(cmd.length > 2);
        Assert.assertEquals(processor.extractAheadCommandSegments().toString(), Arrays.asList(cmd).subList(0, 2).toString());
    }

    @Test
    public void testGetCommandLine4ExecutionIsStandardJob() throws ProcessorException {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId("_rHnrstwXEeijXfdWFqSaEA"); //$NON-NLS-1$
        property.setLabel("test"); //$NON-NLS-1$
        property.setVersion(VersionUtils.DEFAULT_VERSION);

        ProcessItem processItem = PropertiesFactory.eINSTANCE.createProcessItem();
        processItem.setProperty(property);
        processItem.setProcess(TalendFileFactory.eINSTANCE.createProcessType());
        processItem.setState(PropertiesFactory.eINSTANCE.createItemState());

        Process process = new Process(property);

        JavaProcessor processor = new JavaProcessor(process, property, false);
        //
        ProcessorUtilities.setExportConfig(JavaUtils.JAVA_APP_NAME, null, null, false, new Date());

        String[] cmd = processor.getCommandLine();
        Assert.assertTrue(Arrays.asList(cmd).contains(getLocalM2Path()));

    }

    @Test
    public void testGetCommandLine4ExecutionIsGuessSchemaJob() throws ProcessorException {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId("ID"); //$NON-NLS-1$
        property.setLabel("Mock_job_for_Guess_schema"); //$NON-NLS-1$
        property.setVersion(VersionUtils.DEFAULT_VERSION);

        Process process = new Process(property);

        JavaProcessor processor = new JavaProcessor(process, property, false);
        //
        ProcessorUtilities.setExportConfig(JavaUtils.JAVA_APP_NAME, null, null, false, new Date());

        String[] cmd = processor.getCommandLine();
        Assert.assertTrue(Arrays.asList(cmd).contains(getLocalM2Path()));

    }

    @Test
    public void testRemoveLowerVersionArtifacts() throws Exception{
        List<ModuleNeeded> neededModules = new ArrayList<ModuleNeeded>();
        Set<ModuleNeeded> highPriorityModuleNeeded = new HashSet<ModuleNeeded>();
        neededModules.add(createModule("org.dom4j", "dom4j", "1.2.0"));
        neededModules.add(createModule("org.dom4j", "dom4j", "1.3.0"));
        neededModules.add(createModule("org.dom4j", "dom4j", "1.4.0"));

        // can not remove 1.2.0
        highPriorityModuleNeeded.add(createModule("org.dom4j", "dom4j", "1.2.0"));

        // remove 1.3.0
        JavaProcessor.removeLowerVersionArtifacts(neededModules, highPriorityModuleNeeded);
        assertEquals(2, neededModules.size());
        for (ModuleNeeded mod : neededModules) {
            if (!mod.getModuleName().equals("dom4j-1.2.0.jar") && !mod.getModuleName().equals("dom4j-1.4.0.jar")) {
                fail("shoud found 1.2.0 and 1.4.0 only");
            }
        }

        // can remove 1.2.0
        highPriorityModuleNeeded.clear();
        // remove 1.2.0
        JavaProcessor.removeLowerVersionArtifacts(neededModules, highPriorityModuleNeeded);
        assertEquals(1, neededModules.size());
        assertEquals("dom4j-1.4.0.jar", neededModules.get(0).getModuleName());
    }

    private ModuleNeeded createModule(String groupName, String jarName, String version) {
        String mvnURI = "mvn:" + groupName + "/" + jarName + "/" + version;
        ModuleNeeded module = new ModuleNeeded("test", jarName + "-" + version + ".jar", "test", true, null, null, mvnURI);
        return module;
    }

    private String getLocalM2Path() {
        String localM2Path = "-Dtalend.component.manager.m2.repository="; //$NON-NLS-1$
        if (EnvironmentUtils.isWindowsSystem()) {
            localM2Path = localM2Path + "\"" + PomUtil.getLocalRepositoryPath() + "\""; //$NON-NLS-1$ //$NON-NLS-2$
        } else {
            localM2Path = localM2Path + PomUtil.getLocalRepositoryPath();
        }
        return localM2Path;
    }

    @Test
    public void alignLibJarWithClasspath() throws ProcessorException {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId("_rHnrstwXEeijXfdWFqSaEA"); //$NON-NLS-1$
        property.setLabel("test"); //$NON-NLS-1$
        property.setVersion(VersionUtils.DEFAULT_VERSION);
        Process process = new Process(property);
        ProcessItem item = PropertiesFactory.eINSTANCE.createProcessItem();
        ProcessType processType = TalendFileFactory.eINSTANCE.createProcessType();
        property.setItem(item);
        item.setProperty(property);
        item.setProcess(processType);

        // jars in classpath
        List<ModuleNeeded> classPathNeededModules = new ArrayList<ModuleNeeded>();
        classPathNeededModules.add(createModule("org.datanucleus", "datanucleus-rdbms", "4.0.4"));
        classPathNeededModules.add(createModule("org.datanucleus", "datanucleus-rdbms", "4.1.19"));
        classPathNeededModules.add(createModule("org.datanucleus", "datanucleus-core", "4.1.17"));

        // datanucleus-rdbms-4.0.4.jar was set in tLibaryLoad
        Set<ModuleNeeded> highPriorityModuleNeeded = new HashSet<ModuleNeeded>();
        highPriorityModuleNeeded.add(createModule("org.datanucleus", "datanucleus-rdbms", "4.0.4"));

        // -libsjar with datanucleus-rdbms-4.0.4.jar from tLibaryLoad and a lower version 3.2.9
        Set<ModuleNeeded> libJarModuleNeeded = new HashSet<ModuleNeeded>();
        libJarModuleNeeded.add(createModule("org.datanucleus", "datanucleus-rdbms", "4.0.4"));
        libJarModuleNeeded.add(createModule("org.apache.logging.log4j", "log4j-api", "2.17.1"));
        libJarModuleNeeded.add(createModule("org.datanucleus", "datanucleus-rdbms", "3.2.9"));

        SparkJavaProcessor processor = new SparkJavaProcessor(process, property, false);

        ProcessorUtilities.setExportConfig(JavaUtils.JAVA_APP_NAME, null, null);

        // final String list that to add into -libsjar
        List<String> libNames = new ArrayList<>();
        libNames.add("datanucleus-rdbms-4.0.4.jar");
        libNames.add("log4j-api-2.17.1.jar");
        libNames.add("datanucleus-rdbms-3.2.9.jar");

        processor
                .alignLibJarWithClasspath(classPathNeededModules, libJarModuleNeeded, libNames,
                        highPriorityModuleNeeded);

        // 4.0.4 jar is in the tLibaryLoad so should remain the same
        Assert.assertEquals("datanucleus-rdbms-4.0.4.jar", libNames.get(0));
        // log4j-api-2.17.1.jar was not in the classpath so should not be deleted
        Assert.assertEquals("log4j-api-2.17.1.jar", libNames.get(1));
        // datanucleus-rdbms-3.2.9.jar should be aligned with 4.1.19 same as classpath
        Assert.assertEquals("datanucleus-rdbms-4.1.19.jar", libNames.get(2));

    }
}
