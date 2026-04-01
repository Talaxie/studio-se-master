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
package org.talend.designer.maven.tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.Profile;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.m2e.core.MavenPlugin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.talend.commons.utils.MojoType;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.ProjectReference;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.nexus.TalendMavenResolver;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.maven.MavenArtifact;
import org.talend.core.runtime.maven.MavenConstants;
import org.talend.core.runtime.maven.MavenUrlHelper;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.designer.core.model.utils.emf.talendfile.ParametersType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.maven.DesignerMavenPlugin;
import org.talend.designer.maven.model.TalendMavenConstants;
import org.talend.designer.maven.utils.PomIdsHelper;
import org.talend.designer.maven.utils.PomUtil;
import org.talend.designer.runprocess.IRunProcessService;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.IProxyRepositoryFactory;

/**
 * DOC zwxue class global comment. Detailled comment
 */
public class AggregatorPomsHelperTest {

    private AggregatorPomsHelper helper;

    private IRunProcessService runProcessService;

    private List<Property> testJobs;

    private ProjectPreferenceManager projectPreferenceManager;

    private String projectTechName;

    private String defaultProjectGroupId;

    private String defaultProjectVersion;

    private boolean defaultUseSnapshot;

    private boolean needResetPom;

    @Before
    public void setUp() throws Exception {
        helper = new AggregatorPomsHelper();

        if (GlobalServiceRegister.getDefault().isServiceRegistered(IRunProcessService.class)) {
            runProcessService = (IRunProcessService) GlobalServiceRegister.getDefault().getService(IRunProcessService.class);
        }
        assertNotNull(runProcessService);

        projectTechName = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();

        testJobs = new ArrayList<>();

        projectPreferenceManager = DesignerMavenPlugin.getPlugin().getProjectPreferenceManager();
        defaultProjectGroupId = PomIdsHelper.getProjectGroupId();
        defaultProjectVersion = PomIdsHelper.getProjectVersion();
        defaultUseSnapshot = false;
    }

    @Test
    public void testNeedInstallRootPom() throws Exception {
        Model modelBak = null;
        File installedPomFile = null;
        try {
            IFile pomFile = helper.getProjectRootPom();
            assertFalse(helper.needInstallRootPom(pomFile));
            Model model = MavenPlugin.getMavenModelManager().readMavenModel(pomFile);
            String mvnUrl = MavenUrlHelper.generateMvnUrl(model.getGroupId(), model.getArtifactId(), model.getVersion(),
                    MavenConstants.PACKAGING_POM, null);
            MavenArtifact artifact = MavenUrlHelper.parseMvnUrl(mvnUrl);
            String artifactPath = PomUtil.getAbsArtifactPath(artifact);

            installedPomFile = new File(artifactPath);
            try(InputStream is = new FileInputStream(installedPomFile)){
            	modelBak = MavenPlugin.getMavenModelManager().readMavenModel(is);
            }
            Model installedModel = null;
            try(InputStream is2 = new FileInputStream(installedPomFile)) {
            	installedModel = MavenPlugin.getMavenModelManager().readMavenModel(is2);
            }

            // test ci-builder
            Plugin mojo = installedModel.getBuild().getPlugins().stream()
                    .filter(p -> p.getArtifactId().equals(MojoType.CI_BUILDER.getArtifactId())).findFirst().get();
            String versionBak = mojo.getVersion();
            mojo.setVersion("1.1.1");
            PomUtil.savePom(null, installedModel, installedPomFile);
            assertTrue(helper.needInstallRootPom(pomFile));

            // test signer
            mojo.setVersion(versionBak);
            installedModel.getProperties().setProperty(MojoType.SIGNER.getVersionKey(), "1.1.1");
            PomUtil.savePom(null, installedModel, installedPomFile);
            assertTrue(helper.needInstallRootPom(pomFile));
        } finally {
            // restore m2 project pom file
            if (modelBak != null && installedPomFile != null) {
                PomUtil.savePom(null, modelBak, installedPomFile);
            }
        }
    }

    @Test
    public void testGetJobProjectName() {
        String projectTechName = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setLabel("Job1");
        property.setVersion("1.0");
        String jobProjectName = new AggregatorPomsHelper(projectTechName).getJobProjectName(property);
        assertEquals(projectTechName + "_JOB1_1.0", jobProjectName);
    }

    @Test
    public void getJobProjectFolderName() {
        String label = "Job1";
        String version = "1.0";
        String jobFolderName = AggregatorPomsHelper.getJobProjectFolderName(label, version);
        assertEquals("job1_1.0", jobFolderName);
    }

    @Test
    public void testgetJobProjectId() {
        String projectTechName = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
        String id = "abcde-_e";
        String version = "1.0";
        String jobProjectId = AggregatorPomsHelper.getJobProjectId(projectTechName, id, version);
        assertEquals(projectTechName + "|abcde-_e|1.0", jobProjectId);
    }

    @Test
    public void testGetCodeFolder() {
        IFolder routinesFolder = helper.getCodeFolder(ERepositoryObjectType.ROUTINES);
        assertEquals("/" + projectTechName + "/poms/code/routines", routinesFolder.getFullPath().toPortableString());
    }

    @Test
    public void testGetProcessFolder() {
        IFolder processFolder = helper.getProcessFolder(ERepositoryObjectType.PROCESS);
        assertEquals("/" + projectTechName + "/poms/jobs/process", processFolder.getFullPath().toPortableString());

        IFolder processMRFolder = helper.getProcessFolder(ERepositoryObjectType.PROCESS_MR);
        assertEquals("/" + projectTechName + "/poms/jobs/process_mr", processMRFolder.getFullPath().toPortableString());

        IFolder processStormFolder = helper.getProcessFolder(ERepositoryObjectType.PROCESS_STORM);
        assertEquals("/" + projectTechName + "/poms/jobs/process_storm", processStormFolder.getFullPath().toPortableString());

        IFolder jobletFolder = helper.getProcessFolder(ERepositoryObjectType.JOBLET);
        assertEquals("/" + projectTechName + "/poms/jobs/joblets", jobletFolder.getFullPath().toPortableString());

        IFolder sparkJobletFolder = helper.getProcessFolder(ERepositoryObjectType.SPARK_JOBLET);
        assertEquals("/" + projectTechName + "/poms/jobs/joblets_spark", sparkJobletFolder.getFullPath().toPortableString());

        IFolder sparkStrJobletFolder = helper.getProcessFolder(ERepositoryObjectType.SPARK_STREAMING_JOBLET);
        assertEquals("/" + projectTechName + "/poms/jobs/joblets_spark_streaming",
                sparkStrJobletFolder.getFullPath().toPortableString());

        IFolder routeFolder = helper.getProcessFolder(ERepositoryObjectType.PROCESS_ROUTE);
        assertEquals("/" + projectTechName + "/poms/jobs/routes", routeFolder.getFullPath().toPortableString());

        IFolder routeletFolder = helper.getProcessFolder(ERepositoryObjectType.PROCESS_ROUTELET);
        assertEquals("/" + projectTechName + "/poms/jobs/routelets", routeletFolder.getFullPath().toPortableString());

        IFolder serviceFolder = helper.getProcessFolder(ERepositoryObjectType.valueOf("SERVICES"));
        assertEquals("/" + projectTechName + "/poms/jobs/services", serviceFolder.getFullPath().toPortableString());

    }

    @Test
    public void testGetItemPomFolder() throws Exception {
        Property property = createJobProperty("testItemFolderJob", "0.1", false);
        IFolder folder = AggregatorPomsHelper.getItemPomFolder(property);
        assertEquals("/" + projectTechName + "/poms/jobs/process/testitemfolderjob_0.1", folder.getFullPath().toPortableString());
        folder = AggregatorPomsHelper.getItemPomFolder(property, "0.2");
        assertEquals("/" + projectTechName + "/poms/jobs/process/testitemfolderjob_0.2", folder.getFullPath().toPortableString());
    }

    /**
     * test change of project groupId, project version, with-snapshot.
     */
    @Test
    public void testSyncAllPomsByProjectLevelChange() throws Exception {
        String projectGroupId = "org.example.test";
        String projectVersion = "8.7.0-SNAPSHOT";

        projectPreferenceManager.setValue(MavenConstants.PROJECT_GROUPID, "org.example.test");
        projectPreferenceManager.setValue(MavenConstants.PROJECT_VERSION, "8.7.0");
        projectPreferenceManager.setValue(MavenConstants.NAME_PUBLISH_AS_SNAPSHOT, true);
        needResetPom = true;

        List<String> modules = new ArrayList<>();
        modules.add("code/routines");
        modules.add("jobs/process/testsyncalljob1_0.1");

        Property jobProperty = createJobProperty("testSyncAllJob1", "0.1", true);
        String jobGroupId = PomIdsHelper.getJobGroupId(jobProperty);
        String jobVersion = PomIdsHelper.getJobVersion(jobProperty);

        System.setProperty("ci.mode", "true");
        try {
            helper.syncAllPomsWithoutProgress(new NullProgressMonitor());
        } finally {
            System.setProperty("ci.mode", "false");
        }

        // check project pom.
        IFile projectPomFile = new AggregatorPomsHelper().getProjectRootPom();
        validatePomContent(projectPomFile.getLocation().toFile(), projectGroupId, null, projectVersion, null, modules, null);
        // check project pom install result.
        File installedProjectPom = getInstalledFileFromLocalRepo(projectGroupId,
                TalendMavenConstants.DEFAULT_CODE_PROJECT_ARTIFACT_ID, projectVersion, MavenConstants.PACKAGING_POM);
        validatePomContent(installedProjectPom, projectGroupId, null, projectVersion, null, modules, null);

        // check routine pom.
        IFile routinePomFile = runProcessService.getTalendCodeJavaProject(ERepositoryObjectType.ROUTINES).getProjectPom();
        String routineGroupId = PomIdsHelper.getCodesGroupId("code");
        String routineVersion = PomIdsHelper.getCodesVersion();
        validatePomContent(routinePomFile.getLocation().toFile(), routineGroupId, null, routineVersion, null, null, null);

        // check routine install result.
        File installedRoutinePom = getInstalledFileFromLocalRepo(routineGroupId,
                TalendMavenConstants.DEFAULT_ROUTINES_ARTIFACT_ID, routineVersion, MavenConstants.PACKAGING_POM);
        assertNotNull(installedRoutinePom);

        // check job pom.
        IFile jobPomFile = runProcessService.getTalendJobJavaProject(jobProperty).getProjectPom();
        validatePomContent(jobPomFile.getLocation().toFile(), jobGroupId, projectGroupId, jobVersion, projectVersion, null, null);
    }

    @Test
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testSyncAllPomsByJobLevelChange() throws Exception {
        Property jobProperty = createJobProperty("testSyncAllJob2", "0.1", false);
        EMap additionalProperties = jobProperty.getAdditionalProperties();
        String customJobGroupId = "org.example.testJob";
        String customJobVersion = "8.8.0";
        additionalProperties.put(MavenConstants.NAME_GROUP_ID, customJobGroupId);
        additionalProperties.put(MavenConstants.NAME_USER_VERSION, customJobVersion);
        ProxyRepositoryFactory.getInstance().create(jobProperty.getItem(), new Path(""));

        helper.syncAllPomsWithoutProgress(new NullProgressMonitor());

        IFile jobPomFile = runProcessService.getTalendJobJavaProject(jobProperty).getProjectPom();
        validatePomContent(jobPomFile.getLocation().toFile(), customJobGroupId, defaultProjectGroupId, customJobVersion,
                defaultProjectVersion, null, null);
    }

    private void validatePomContent(File pomFile, String groupId, String parentGroupId, String version, String parentVersion,
            List<String> modules, List<ProjectReference> references)
            throws Exception {
    	Model model = null;
    	try(InputStream is = new FileInputStream(pomFile)){
    		model = MavenPlugin.getMavenModelManager().readMavenModel(is);
    	}
        assertEquals(groupId, model.getGroupId());
        assertEquals(version, model.getVersion());
        if (parentGroupId != null) {
            assertEquals(parentGroupId, model.getParent().getGroupId());
        }
        if (parentVersion != null) {
            assertEquals(parentVersion, model.getParent().getVersion());
        }
        if (modules != null) {
            List<String> currentModules = model.getModules();
            assertNotNull(currentModules);
            for (String module : modules) {
                assertTrue(currentModules.contains(module));
            }
        } else {
            assertEquals(0, model.getModules().stream().filter(module -> module.startsWith("../../")).count());
        }

        if (references != null) {
            if (PomIdsHelper.useProfileModule()) {
                List<Profile> refProjectProfiles = model.getProfiles().stream()
                        .filter(profile -> AggregatorPomsHelper.matchModuleProfile(profile.getId(), projectTechName))
                        .collect(Collectors.toList());
                assertEquals(references.size(), refProjectProfiles.size());
                references.forEach(reference -> {
                    String profileId = (projectTechName + "_" + reference.getReferencedProject().getTechnicalLabel())
                            .toLowerCase();
                    assertTrue(refProjectProfiles.stream().anyMatch(profile -> profile.getId().equals(profileId)));
                });
            }
        } else {
            assertEquals(0, model.getProfiles().stream()
                    .filter(profile -> AggregatorPomsHelper.matchModuleProfile(profile.getId(), projectTechName)).count());
        }
    }

    private Property createJobProperty(String label, String version, boolean create) throws Exception {
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        String id = ProxyRepositoryFactory.getInstance().getNextId();
        property.setId(id);
        property.setLabel(label);
        property.setVersion(version);

        ProcessItem item = PropertiesFactory.eINSTANCE.createProcessItem();
        item.setProperty(property);

        ProcessType process = TalendFileFactory.eINSTANCE.createProcessType();
        ParametersType parameterType = TalendFileFactory.eINSTANCE.createParametersType();
        process.setParameters(parameterType);
        item.setProcess(process);

        if (create) {
            ProxyRepositoryFactory.getInstance().create(item, new Path(""));
            testJobs.add(property);
        }

        return property;
    }

    private File getInstalledFileFromLocalRepo(String groupId, String artifactId, String version, String packaging)
            throws IOException {
        String projectMvnUrl = MavenUrlHelper.generateMvnUrl(groupId, artifactId, version, packaging, null);
        String projectLocalMavenUri = projectMvnUrl.replace("mvn:", "mvn:" + MavenConstants.LOCAL_RESOLUTION_URL + "!");
        File installedFile = TalendMavenResolver.resolve(projectLocalMavenUri);
        return installedFile;
    }

    @After
    public void tearDown() throws Exception {
        // clear all test jobs.
        if (!testJobs.isEmpty()) {
            for (Property property : testJobs) {
                IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                IRepositoryViewObject repObj = factory.getLastVersion(property.getId());
                if (repObj != null) {
                    factory.deleteObjectPhysical(repObj);
                }
            }
            testJobs.clear();
        }
        // reset to default preferences.
        projectPreferenceManager.setValue(MavenConstants.PROJECT_GROUPID, defaultProjectGroupId);
        projectPreferenceManager.setValue(MavenConstants.PROJECT_VERSION, defaultProjectVersion);
        projectPreferenceManager.setValue(MavenConstants.NAME_PUBLISH_AS_SNAPSHOT, defaultUseSnapshot);
        projectPreferenceManager.setValue(MavenConstants.POM_FILTER, "");
        projectPreferenceManager.setValue(MavenConstants.USE_PROFILE_MODULE, false);
        // reset all poms.
        if (needResetPom) {
            helper.syncAllPomsWithoutProgress(new NullProgressMonitor());
            needResetPom = false;
        }
    }

}
