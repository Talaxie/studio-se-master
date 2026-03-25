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
package org.talend.repository.services.maven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.maven.model.Activation;
import org.apache.maven.model.ActivationProperty;
import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Exclusion;
import org.apache.maven.model.Model;
import org.apache.maven.model.Parent;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.PluginExecution;
import org.apache.maven.model.Profile;
import org.apache.maven.model.Resource;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.MojoType;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.model.process.JobInfo;
import org.talend.core.model.properties.Project;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.GITConstant;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.services.IGitInfoService;
import org.talend.core.repository.utils.ItemResourceUtil;
import org.talend.core.runtime.maven.MavenConstants;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.core.services.IGITProviderService;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.maven.model.TalendJavaProjectConstants;
import org.talend.designer.maven.model.TalendMavenConstants;
import org.talend.designer.maven.template.ETalendMavenVariables;
import org.talend.designer.maven.tools.AggregatorPomsHelper;
import org.talend.designer.maven.tools.creator.CreateMavenJobPom;
import org.talend.designer.maven.utils.PomIdsHelper;
import org.talend.designer.maven.utils.PomUtil;
import org.talend.designer.runprocess.IProcessor;
import org.talend.designer.runprocess.ProcessorUtilities;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.RepositoryConstants;
import org.talend.repository.services.model.services.ServiceConnection;
import org.talend.repository.services.model.services.ServiceItem;
import org.talend.repository.services.model.services.ServiceOperation;
import org.talend.repository.services.model.services.ServicePort;

/**
 * DOC yyan for Service pom generation
 */
public class CreateMavenDataServicePom extends CreateMavenJobPom {

    /**
     *
     */
    private static final String MAVEN_VERSION = "4.0.0";

    private static final String POM_FEATURE_XML = "pom-feature.xml";

    private static final String POM_CONTROL_BUNDLE_XML = "pom-control-bundle.xml";
    
    private static final String MAVEN_CORE_VERSION = "3.8.8";

    private Model model;

    private ServiceItem serviceItem;

    public CreateMavenDataServicePom(IProcessor jobProcessor, IFile pomFile) {
        super(jobProcessor, pomFile);
        this.serviceItem = (ServiceItem) getJobProcessor().getProperty().getItem();
    }

    /*
     * @see org.talend.designer.maven.tools.creator.CreateMavenJobPom#addProperties(org.apache.maven.model.Model)
     */
    @Override
    protected void addProperties(Model model) {
        Properties properties = model.getProperties();
        if (properties == null) {
            properties = new Properties();
            model.setProperties(properties);
        }
        Property property = getJobProcessor().getProperty();
        Project project = ProjectManager.getInstance().getProject(property);
        if (project == null) { // current project
            project = ProjectManager.getInstance().getCurrentProject().getEmfProject();
        }
        String mainProjectBranch = ProjectManager.getInstance().getMainProjectBranch(project);
        if (mainProjectBranch == null) {
            mainProjectBranch = GITConstant.NAME_TRUNK;
        }

        // required by ci-builder
        checkPomProperty(properties, "talend.project.name", ETalendMavenVariables.ProjectName, project.getTechnicalLabel());
        checkPomProperty(properties, "talend.job.version", ETalendMavenVariables.TalendJobVersion, property.getVersion());
        checkPomProperty(properties, "talend.job.id", ETalendMavenVariables.JobId, property.getId());

        // add branch/git info
        org.talend.core.model.general.Project currentProject = ProjectManager.getInstance()
                .getProjectFromProjectTechLabel(project.getTechnicalLabel());
        String branchName = ProjectManager.getInstance().getMainProjectBranch(project);
        try {
            if (branchName == null) {
                ProjectPreferenceManager preferenceManager =
                        new ProjectPreferenceManager(currentProject, "org.talend.repository", false);
                branchName = preferenceManager.getValue(RepositoryConstants.PROJECT_BRANCH_ID);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        if (null != branchName) {
            properties.setProperty("talend.project.branch.name", branchName);
        }

        try {
            if ((ProcessorUtilities.isCIMode() || !currentProject.isLocal()) && IGITProviderService.get() != null
                    && IGITProviderService.get().isGITProject(currentProject) && IGitInfoService.get() != null) {
                additionalProperties.clear();
                additionalProperties.putAll(IGitInfoService.get().getGitInfo(property));
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        properties.setProperty("talend.job.git.author", additionalProperties.getOrDefault(IGitInfoService.GIT_AUTHOR, ""));
        properties.setProperty("talend.job.git.commit.id", additionalProperties.getOrDefault(IGitInfoService.GIT_COMMIT_ID, ""));
        properties.setProperty("talend.job.git.commit.date",
                additionalProperties.getOrDefault(IGitInfoService.GIT_COMMIT_DATE, ""));
    }

    @Override
    public void create(IProgressMonitor monitor) throws Exception {

        IFile pom = getPomFile();

        if (pom == null) {
            return;
        }

        Model tmpModel = createModel();
        this.model = new Model(); // createModel();
        configModel(model); // config model
        Model pomModel = model; // new Model();
        pomModel.setModelVersion(MAVEN_VERSION);
        // pom.setParent(model.getParent());
        // @ProjectName@ @JobName@-@JobVersion@ (@TalendJobVersion@,@JobType@)
        String groupId = PomIdsHelper.getJobGroupId(getJobProcessor().getProperty());
        String projectName = ProjectManager.getInstance().getProject(getJobProcessor().getProperty()).getTechnicalLabel();
        String artifactId = PomIdsHelper.getJobArtifactId(getJobProcessor().getProperty());
        String jobVersion = PomIdsHelper.getJobVersion(getJobProcessor().getProperty());
        String talendJobVersion = getJobProcessor().getProperty().getVersion();
        String JobType = "Services";
        String displayName = projectName + " " + artifactId + "-" + "${project.version}" + " (" + talendJobVersion + "," + JobType
                + ")";
        pomModel.setGroupId(groupId);
        pomModel.setArtifactId(artifactId);
        pomModel.setVersion(jobVersion);
        pomModel.setPackaging("pom");
        pomModel.setParent(tmpModel.getParent());
        pomModel.setName(displayName + " Kar");

        // add dynamic ds job modules
        String tmpJobId = "";
        String upperPath = "../";
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        ServiceConnection connection = (ServiceConnection) serviceItem.getConnection();
        EList<ServicePort> listPort = connection.getServicePort();
        // In case the service in under sub folder
        int depth = ItemResourceUtil.getItemRelativePath(serviceItem.getProperty()).segmentCount();
        String relativePath = upperPath.concat(upperPath);
        for (int level = 0; level < depth; level++) {
            relativePath += upperPath;
        }
        for (ServicePort port : listPort) {
            List<ServiceOperation> listOperation = port.getServiceOperation();
            for (ServiceOperation operation : listOperation) {
                if (StringUtils.isNotEmpty(operation.getReferenceJobId())) {
                    IRepositoryViewObject node = factory.getLastVersion(operation.getReferenceJobId());
                    if (node != null) {
                        String jobName = node.getLabel();
                        if (jobName != null && !pomModel.getModules().contains(jobName)) {
                            String module = relativePath + TalendJavaProjectConstants.DIR_PROCESS + "/" + node.getPath() + "/"
                                    + AggregatorPomsHelper.getJobProjectFolderName(node.getProperty());
                            pomModel.addModule(module);
                        }
                    }
                    tmpJobId = operation.getReferenceJobId();
                }
            }
        }
        pomModel.addProperty("cloud.publisher.skip", "true");
        // add control bundle module
        pomModel.addModule(POM_CONTROL_BUNDLE_XML);
        // add feature module
        pomModel.addModule(POM_FEATURE_XML);

        pomModel.addProfile(addProfileForCloud());

        pomModel.setBuild(new Build());

        pomModel.getBuild().addPlugin(addSkipDockerMavenPlugin());

        PomUtil.savePom(monitor, pomModel, pom);

        Parent parentPom = new Parent();
        parentPom.setGroupId(pomModel.getGroupId());
        parentPom.setArtifactId(pomModel.getArtifactId());
        parentPom.setVersion(pomModel.getVersion());
        parentPom.setRelativePath("/");

        org.talend.designer.core.ui.editor.process.Process process = (org.talend.designer.core.ui.editor.process.Process) getJobProcessor()
                .getProcess();

        boolean publishAsSnapshot = BooleanUtils
                .toBoolean((String) process.getAdditionalProperties().get(MavenConstants.NAME_PUBLISH_AS_SNAPSHOT));

        IFile feature = pom.getParent().getFile(new Path(POM_FEATURE_XML));
        Model featureModel = new Model();
        featureModel.setModelVersion(MAVEN_VERSION);
        featureModel.setGroupId(PomIdsHelper.getJobGroupId(getJobProcessor().getProperty()));
        featureModel.setArtifactId(PomIdsHelper.getJobArtifactId(getJobProcessor().getProperty()) + "-feature");
        featureModel.setVersion(PomIdsHelper.getJobVersion(getJobProcessor().getProperty()));
        featureModel.setPackaging("pom");
        Build featureModelBuild = new Build();
        featureModelBuild.addPlugin(addFeaturesMavenPlugin());
        featureModelBuild.addPlugin(addSkipDockerMavenPlugin());
        // featureModelBuild.addPlugin(
        // addDeployFeatureMavenPlugin(featureModel.getArtifactId(), featureModel.getVersion(), publishAsSnapshot));
//        featureModelBuild.addPlugin(addSkipDeployFeatureMavenPlugin());
        featureModelBuild.addPlugin(addSkipMavenCleanPlugin());
        // maven versioning
        featureModelBuild.addPlugin(addOsgiHelperMavenPlugin());
        featureModel.setBuild(featureModelBuild);
        featureModel.setParent(parentPom);
        featureModel.setName(displayName + " Feature");

        featureModel.addProperty("cloud.publisher.skip", "false");
        featureModel.addProperty("talend.job.id", model.getProperties().getProperty("talend.job.id"));
        featureModel.addProperty("talend.job.name", artifactId);
        featureModel.addProperty("talend.job.version", model.getProperties().getProperty("talend.job.version"));
        featureModel.addProperty("talend.product.version", VersionUtils.getVersion());
        featureModel.addProperty("talend.job.finalName", featureModel.getArtifactId() + "-" + featureModel.getVersion()); // DemoService-feature-0.1.0

        PomUtil.savePom(monitor, featureModel, feature);

        IFile controlBundle = pom.getParent().getFile(new Path(POM_CONTROL_BUNDLE_XML));
        Model controlBundleModel = new Model();
        controlBundleModel.setParent(model.getParent());
        controlBundleModel.setModelVersion(MAVEN_VERSION);
        controlBundleModel.setGroupId(PomIdsHelper.getJobGroupId(getJobProcessor().getProperty()));
        controlBundleModel.setArtifactId(PomIdsHelper.getJobArtifactId(getJobProcessor().getProperty()) + "-control-bundle");
        controlBundleModel.setVersion(PomIdsHelper.getJobVersion(getJobProcessor().getProperty()));
        controlBundleModel.setPackaging("jar");
        controlBundleModel.setName(displayName + " Control Bundle");
        Build controlBundleModelBuild = new Build();
        controlBundleModelBuild.addPlugin(addControlBundleMavenPlugin());
        controlBundleModelBuild.addPlugin(addSkipDockerMavenPlugin());
        controlBundleModelBuild.addResource(addControlBundleMavenResource());
        controlBundleModel.setBuild(controlBundleModelBuild);
        controlBundleModel.setParent(parentPom);
        controlBundleModel.addProperty("cloud.publisher.skip", "true");
        PomUtil.savePom(monitor, controlBundleModel, controlBundle);

        afterCreate(monitor);
    }

    /**
     * DOC skip depoly phase in publich to cloud in parent pom, enable in nexus.
     */
    private Profile addProfileForCloud() {
        Profile deployCloudProfile = new Profile();
        deployCloudProfile.setId("deploy-cloud");
        Activation deployCloudActivation = new Activation();
        ActivationProperty activationProperty = new ActivationProperty();
        activationProperty.setName("!altDeploymentRepository");
        deployCloudActivation.setProperty(activationProperty);
        deployCloudProfile.setActivation(deployCloudActivation);
        deployCloudProfile.setBuild(new Build());
        deployCloudProfile.getBuild().addPlugin(addSkipDeployFeatureMavenPlugin());
        return deployCloudProfile;
    }

    private Resource addControlBundleMavenResource() {
        Resource resource = new Resource();
        resource.addExclude("**/feature.xml");
        resource.setDirectory("${basedir}/src/main/resources");
        return resource;
    }

    protected void generateAssemblyFile(IProgressMonitor monitor, final Set<JobInfo> clonedChildrenJobInfors) throws Exception {

    }

    /*
     * feature.xml and copy wsdl, mainfest
     *
     * @see org.talend.designer.maven.tools.creator.CreateMavenJobPom#generateTemplates(boolean)
     */
    @Override
    public void generateTemplates(boolean overwrite) throws Exception {

    }

    private Plugin addControlBundleMavenPlugin() {

        Plugin plugin = new Plugin();

        plugin.setGroupId("org.apache.maven.plugins");
        plugin.setArtifactId("maven-jar-plugin");
        plugin.setVersion("3.0.2");

        plugin.setExtensions(true);

        Xpp3Dom configuration = new Xpp3Dom("configuration");
        Xpp3Dom archive = new Xpp3Dom("archive");
        Xpp3Dom manifest = new Xpp3Dom("manifestFile");
        manifest.setValue("${project.build.outputDirectory}/META-INF/MANIFEST.MF");
        archive.addChild(manifest);
        configuration.addChild(archive);
        plugin.setConfiguration(configuration);

        return plugin;
    }

    private Plugin addFeaturesMavenPlugin() {
        Plugin plugin = new Plugin();

        plugin.setGroupId("org.apache.karaf.tooling");
        plugin.setArtifactId("karaf-maven-plugin");
        plugin.setVersion("4.2.10");

        Xpp3Dom configuration = new Xpp3Dom("configuration");

        Xpp3Dom resourcesDir = new Xpp3Dom("resourcesDir");
        resourcesDir.setValue("${project.build.directory}/bin");

        Xpp3Dom featuresFile = new Xpp3Dom("featuresFile");
        featuresFile.setValue("${basedir}/src/main/resources/feature/feature.xml");

        configuration.addChild(resourcesDir);
        configuration.addChild(featuresFile);

        List<PluginExecution> pluginExecutions = new ArrayList<PluginExecution>();
        PluginExecution pluginExecution = new PluginExecution();
        pluginExecution.setId("create-kar");
        pluginExecution.addGoal("kar");
        pluginExecution.setConfiguration(configuration);
        
        pluginExecutions.add(pluginExecution);
        plugin.setExecutions(pluginExecutions);

        List<Dependency> dependencies = new ArrayList<Dependency>();
        Dependency mavensharedDep = new Dependency();
        mavensharedDep.setGroupId("org.apache.maven.shared");
        mavensharedDep.setArtifactId("maven-shared-utils");
        mavensharedDep.setVersion("3.3.3");

        Dependency commonsioDep = new Dependency();
        commonsioDep.setGroupId("commons-io");
        commonsioDep.setArtifactId("commons-io");
        commonsioDep.setVersion("2.8.0");

        Dependency httpclientDep = new Dependency();
        httpclientDep.setGroupId("org.apache.httpcomponents");
        httpclientDep.setArtifactId("httpclient");
        httpclientDep.setVersion("4.5.13");

        Dependency httpcoreDep = new Dependency();
        httpcoreDep.setGroupId("org.apache.httpcomponents");
        httpcoreDep.setArtifactId("httpcore");
        httpcoreDep.setVersion("4.4.13");

        Dependency istackDep = new Dependency();
        istackDep.setGroupId("com.sun.istack");
        istackDep.setArtifactId("istack-commons-runtime");
        istackDep.setVersion("3.0.10");

        Dependency xzDep = new Dependency();
        xzDep.setGroupId("org.tukaani");
        xzDep.setArtifactId("xz");
        xzDep.setVersion("1.8");

        Dependency junitDep = new Dependency();
        junitDep.setGroupId("junit");
        junitDep.setArtifactId("junit");
        junitDep.setVersion("4.13.2");
        
        Dependency mavenCoreDep = new Dependency();
        mavenCoreDep.setGroupId("org.apache.maven");
        mavenCoreDep.setArtifactId("maven-core");
        mavenCoreDep.setVersion(MAVEN_CORE_VERSION);

        Dependency mavenCompatDep = new Dependency();
        mavenCompatDep.setGroupId("org.apache.maven");
        mavenCompatDep.setArtifactId("maven-compat");
        mavenCompatDep.setVersion(MAVEN_CORE_VERSION);

        Dependency mavenSettingsDep = new Dependency();
        mavenSettingsDep.setGroupId("org.apache.maven");
        mavenSettingsDep.setArtifactId("maven-settings");
        mavenSettingsDep.setVersion(MAVEN_CORE_VERSION);

        Dependency mavenSettingsBdDep = new Dependency();
        mavenSettingsBdDep.setGroupId("org.apache.maven");
        mavenSettingsBdDep.setArtifactId("maven-settings-builder");
        mavenSettingsBdDep.setVersion(MAVEN_CORE_VERSION);

        Dependency plexusArchiverDep = new Dependency();
        plexusArchiverDep.setGroupId("org.codehaus.plexus");
        plexusArchiverDep.setArtifactId("plexus-archiver");
        plexusArchiverDep.setVersion("4.8.0");
        
        Dependency plexusIoDep = new Dependency();
        plexusIoDep.setGroupId("org.codehaus.plexus");
        plexusIoDep.setArtifactId("plexus-io");
        plexusIoDep.setVersion("3.2.0");

        Dependency commonsCompressDep = new Dependency();
        commonsCompressDep.setGroupId("org.apache.commons");
        commonsCompressDep.setArtifactId("commons-compress");
        commonsCompressDep.setVersion("1.21");

        Dependency jsoupDep = new Dependency();
        jsoupDep.setGroupId("org.jsoup");
        jsoupDep.setArtifactId("jsoup");
        jsoupDep.setVersion("1.15.3");

        Dependency mavenModelDep = new Dependency();
        mavenModelDep.setGroupId("org.apache.maven");
        mavenModelDep.setArtifactId("maven-model");
        mavenModelDep.setVersion(MAVEN_CORE_VERSION);

        Dependency commonsCodecDep = new Dependency();
        commonsCodecDep.setGroupId("commons-codec");
        commonsCodecDep.setArtifactId("commons-codec");
        commonsCodecDep.setVersion("1.15");
        
        Dependency guavaDep = new Dependency();
        guavaDep.setGroupId("com.google.guava");
        guavaDep.setArtifactId("guava");
        guavaDep.setVersion("32.0.1-jre");

        Dependency slf4jDep = new Dependency();
        slf4jDep.setGroupId("org.slf4j");
        slf4jDep.setArtifactId("slf4j-jdk14");
        slf4jDep.setVersion("1.7.34");

        Dependency slf4jJclDep = new Dependency();
        slf4jJclDep.setGroupId("org.slf4j");
        slf4jJclDep.setArtifactId("jcl-over-slf4j");
        slf4jJclDep.setVersion("1.7.34");

        Dependency slf4jApiDep = new Dependency();
        slf4jApiDep.setGroupId("org.slf4j");
        slf4jApiDep.setArtifactId("slf4j-api");
        slf4jApiDep.setVersion("1.7.34");

        Dependency doxiaDep = new Dependency();
        doxiaDep.setGroupId("org.apache.maven.doxia");
        doxiaDep.setArtifactId("doxia-site-renderer");
        doxiaDep.setVersion("1.0");
        List<Exclusion> exclusionList = new ArrayList<Exclusion>();
        Exclusion exclusion = new Exclusion();
        exclusion.setGroupId("org.apache.velocity");
        exclusion.setArtifactId("velocity");
        exclusionList.add(exclusion);
        doxiaDep.setExclusions(exclusionList);

        Dependency velocityDep = new Dependency();
        velocityDep.setGroupId("org.apache.velocity");
        velocityDep.setArtifactId("velocity-engine-core");
        velocityDep.setVersion("2.3");
        
        //org.apache.karaf.shell.console---to remove dependency to sshd-osgi, then spring-framwork-bom
        Dependency karafShellConsoleDep = new Dependency();
        karafShellConsoleDep.setGroupId("org.apache.karaf.shell");
        karafShellConsoleDep.setArtifactId("org.apache.karaf.shell.console");
        karafShellConsoleDep.setVersion("4.2.10");
        List<Exclusion> karafShellConsoleExclusionList = new ArrayList<Exclusion>();
        Exclusion sshdExclusion1 = new Exclusion();
        sshdExclusion1.setGroupId("org.apache.sshd");
        sshdExclusion1.setArtifactId("sshd-osgi");
        karafShellConsoleExclusionList.add(sshdExclusion1);
        karafShellConsoleDep.setExclusions(karafShellConsoleExclusionList);
        dependencies.add(karafShellConsoleDep);
        
        //org.apache.karaf.shell.core---to remove dependency to sshd-osgi, then spring-framwork-bom
        Dependency karafShellCoreDep = new Dependency();
        karafShellCoreDep.setGroupId("org.apache.karaf.shell");
        karafShellCoreDep.setArtifactId("org.apache.karaf.shell.core");
        karafShellCoreDep.setVersion("4.2.10");
        List<Exclusion> karafShellCoreExclusionList = new ArrayList<Exclusion>();
        Exclusion sshdExclusion = new Exclusion();
        sshdExclusion.setGroupId("org.apache.sshd");
        sshdExclusion.setArtifactId("sshd-osgi");
        karafShellCoreExclusionList.add(sshdExclusion);
        karafShellCoreDep.setExclusions(karafShellCoreExclusionList);
        dependencies.add(karafShellCoreDep);
        
        dependencies.add(mavensharedDep);
        dependencies.add(commonsioDep);
        dependencies.add(httpclientDep);
        dependencies.add(httpcoreDep);
        dependencies.add(istackDep);
        dependencies.add(xzDep);
        dependencies.add(junitDep);
        dependencies.add(mavenCoreDep);
        dependencies.add(mavenCompatDep);
        dependencies.add(mavenSettingsDep);
        dependencies.add(mavenSettingsBdDep);
        dependencies.add(plexusArchiverDep);
        dependencies.add(plexusIoDep);
        dependencies.add(commonsCompressDep);
        dependencies.add(jsoupDep);
        dependencies.add(mavenModelDep);
        dependencies.add(commonsCodecDep);
        dependencies.add(guavaDep);
        dependencies.add(slf4jDep);
        dependencies.add(slf4jJclDep);
        dependencies.add(slf4jApiDep);
        dependencies.add(doxiaDep);
        dependencies.add(velocityDep);
        plugin.setDependencies(dependencies);

        return plugin;
    }

    private Plugin addOsgiHelperMavenPlugin() {
        Plugin plugin = new Plugin();

        plugin.setGroupId(TalendMavenConstants.DEFAULT_CI_GROUP_ID);
        plugin.setArtifactId(MojoType.OSGI_HELPER.getArtifactId());
        plugin.setVersion(VersionUtils.getMojoVersion(MojoType.OSGI_HELPER));

        Xpp3Dom configuration = new Xpp3Dom("configuration");
        Xpp3Dom featuresFile = new Xpp3Dom("featuresFile");
        featuresFile.setValue("${basedir}/src/main/resources/feature/feature.xml");
        configuration.addChild(featuresFile);

        List<PluginExecution> pluginExecutions = new ArrayList<PluginExecution>();
        PluginExecution pluginExecution = new PluginExecution();
        pluginExecution.setId("feature-helper");
        pluginExecution.setPhase("generate-sources");
        pluginExecution.addGoal("generate");
        pluginExecution.setConfiguration(configuration);
        pluginExecutions.add(pluginExecution);
        plugin.setExecutions(pluginExecutions);

        return plugin;
    }

    /**
     * Avoid clean control-bundle file in target folde, in case of using mvn clean package, TESB-22296
     *
     * @return plugin
     */
    private Plugin addSkipMavenCleanPlugin() {
        Plugin plugin = new Plugin();

        plugin.setGroupId("org.apache.maven.plugins");
        plugin.setArtifactId("maven-clean-plugin");
        plugin.setVersion("3.0.0");

        Xpp3Dom configuration = new Xpp3Dom("configuration");
        Xpp3Dom skipClean = new Xpp3Dom("skip");
        skipClean.setValue("true");
        configuration.addChild(skipClean);
        plugin.setConfiguration(configuration);

        return plugin;
    }

    private Plugin addSkipDeployFeatureMavenPlugin() {

        Plugin plugin = new Plugin();

        plugin.setGroupId("org.apache.maven.plugins");
        plugin.setArtifactId("maven-deploy-plugin");
        plugin.setVersion("2.7");

        Xpp3Dom configuration = new Xpp3Dom("configuration");

        Xpp3Dom skip = new Xpp3Dom("skip");
        skip.setValue("true");
        configuration.addChild(skip);
        plugin.setConfiguration(configuration);

        return plugin;

    }

    @Override
    protected ProcessType getProcessType() {
        return null;
    }

    @Override
    protected List<Dependency> getCodesJarDependencies() {
        return Collections.emptyList();
    }

}
