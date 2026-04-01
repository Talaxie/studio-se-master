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

import static org.talend.designer.maven.model.TalendJavaProjectConstants.*;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.maven.model.Activation;
import org.apache.maven.model.Model;
import org.apache.maven.model.Profile;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.internal.MavenPluginActivator;
import org.eclipse.m2e.core.internal.markers.IEditorMarkerService;
import org.eclipse.osgi.internal.serviceregistry.ServiceReferenceImpl;
import org.eclipse.osgi.internal.serviceregistry.ServiceRegistrationImpl;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.MojoType;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IESBService;
import org.talend.core.ILibraryManagerService;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.general.ILibrariesService;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.general.ModuleNeeded.ELibraryInstallStatus;
import org.talend.core.model.general.Project;
import org.talend.core.model.process.JobInfo;
import org.talend.core.model.process.ProcessUtils;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.ProjectReference;
import org.talend.core.model.properties.Property;
import org.talend.core.model.relationship.Relation;
import org.talend.core.model.relationship.RelationshipItemBuilder;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.model.routines.CodesJarInfo;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.repository.utils.ItemResourceUtil;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.runtime.maven.MavenArtifact;
import org.talend.core.runtime.maven.MavenConstants;
import org.talend.core.runtime.maven.MavenUrlHelper;
import org.talend.core.runtime.process.ITalendProcessJavaProject;
import org.talend.core.runtime.process.TalendProcessArgumentConstant;
import org.talend.core.runtime.process.TalendProcessOptionConstants;
import org.talend.core.runtime.services.IFilterService;
import org.talend.core.ui.ITestContainerProviderService;
import org.talend.core.utils.CodesJarResourceCache;
import org.talend.core.utils.WorkspaceUtils;
import org.talend.designer.maven.launch.MavenPomCommandLauncher;
import org.talend.designer.maven.model.MavenSystemFolders;
import org.talend.designer.maven.model.TalendJavaProjectConstants;
import org.talend.designer.maven.model.TalendMavenConstants;
import org.talend.designer.maven.template.MavenTemplateManager;
import org.talend.designer.maven.tools.creator.CreateMavenBeanPom;
import org.talend.designer.maven.tools.creator.CreateMavenRoutinePom;
import org.talend.designer.maven.utils.MavenProjectUtils;
import org.talend.designer.maven.utils.PomIdsHelper;
import org.talend.designer.maven.utils.PomUtil;
import org.talend.designer.runprocess.IRunProcessService;
import org.talend.designer.runprocess.ProcessorUtilities;
import org.talend.repository.ProjectManager;

/**
 * DOC zwxue class global comment. Detailled comment
 */
public class AggregatorPomsHelper {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AggregatorPomsHelper.class);

    private String projectTechName;
    
    static {
    	//try to unregister service to avoid m2e.core.ui start before workbench created
    	try {
    		BundleContext context = MavenPluginActivator.getDefault().getBundleContext();
    		ServiceReference<IEditorMarkerService> ref = context.getServiceReference(IEditorMarkerService.class);
    		if(ref instanceof ServiceReferenceImpl<?>) {
    			ServiceReferenceImpl<?> s = (ServiceReferenceImpl<?>) ref;
    			ServiceRegistrationImpl<?> registration = s.getRegistration();
    			registration.unregister();
    		}
    	}catch(Exception e) {
    		LOGGER.error("Unable to unregister service of " + IEditorMarkerService.class, e);
    	}
    }

    public AggregatorPomsHelper() {
        projectTechName = ProjectManager.getInstance().getCurrentProject().getTechnicalLabel();
    }

    public AggregatorPomsHelper(String projectTechName) {
        Assert.isNotNull(projectTechName);
        this.projectTechName = projectTechName;
    }

    public String getProjectTechName() {
        return projectTechName;
    }

    public void createRootPom(Model model, boolean force, IProgressMonitor monitor)
            throws Exception {
        IFile pomFile = getProjectRootPom();
        if (force || !pomFile.exists()) {
            PomUtil.savePom(monitor, model, pomFile);
        }
    }

    public void createRootPom(IProgressMonitor monitor) throws Exception {
        Model newModel = getCodeProjectTemplateModel();
        IFile pomFile = getProjectRootPom();
        if (pomFile != null && pomFile.exists() && ProcessorUtilities.isCIMode()) {
            Model oldModel = MavenPlugin.getMavenModelManager().readMavenModel(pomFile);
            List<Profile> profiles = oldModel.getProfiles().stream()
                    .filter(profile -> matchModuleProfile(profile.getId(), projectTechName)).collect(Collectors.toList());
            newModel.setModules(oldModel.getModules());
            newModel.getProfiles().addAll(profiles);
        }
        createRootPom(newModel, true, monitor);
    }

    public void installRootPom(boolean force) throws Exception {
        IFile pomFile = getProjectRootPom();
        if (pomFile.exists()) {
            if (force || needInstallRootPom(pomFile)) {
                MavenPomCommandLauncher launcher =
                        new MavenPomCommandLauncher(pomFile, TalendMavenConstants.GOAL_INSTALL);
                Map<String, Object> argumentsMap = new HashMap<>();
                // -N: install current pom without modules.
                argumentsMap.put(TalendProcessArgumentConstant.ARG_PROGRAM_ARGUMENTS, "-N"); // $NON-NLS-N$
                launcher.setArgumentsMap(argumentsMap);
                launcher.execute(new NullProgressMonitor());
            }
        }
    }

    public boolean needInstallRootPom(IFile pomFile) {
        try {
            Model model = MavenPlugin.getMavenModelManager().readMavenModel(pomFile);

            String mvnUrl = MavenUrlHelper.generateMvnUrl(model.getGroupId(), model.getArtifactId(), model.getVersion(),
                    MavenConstants.PACKAGING_POM, null);
            MavenArtifact artifact = MavenUrlHelper.parseMvnUrl(mvnUrl);
            if (artifact != null) {
                String artifactPath = PomUtil.getAbsArtifactPath(artifact);
                if (artifactPath == null) {
                    return true;
                }
                Model installedModel = null;
                try(InputStream is = new FileInputStream(new File(artifactPath))){
                	installedModel = MavenPlugin.getMavenModelManager().readMavenModel(is);
                }
                // check ci-builder
                String currentCIBuilderVersion = model.getBuild().getPlugins().stream()
                        .filter(p -> p.getArtifactId().equals(MojoType.CI_BUILDER.getArtifactId())).findFirst().get()
                        .getVersion();
                String installedCIBuilderVersion = installedModel.getBuild().getPlugins().stream()
                        .filter(p -> p.getArtifactId().equals(MojoType.CI_BUILDER.getArtifactId())).findFirst().get()
                        .getVersion();
                if (!currentCIBuilderVersion.equals(installedCIBuilderVersion)) {
                    return true;
                }
                // check signer
                String currentSignerVersion = model.getProperties().getProperty(MojoType.SIGNER.getVersionKey());
                String installedSignerVersion = installedModel.getProperties().getProperty(MojoType.SIGNER.getVersionKey());
                if (!currentSignerVersion.equals(installedSignerVersion)) {
                    return true;
                }
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return true;
        }
        return false;
    }

    public IFolder getProjectPomsFolder() {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IFolder pomsFolder = workspace.getRoot().getFolder(new Path(projectTechName + "/" + DIR_POMS)); //$NON-NLS-1$
        if (!pomsFolder.exists()) {
            try {
                ResourceUtils.createFolder(pomsFolder);
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
            }
        }
        return pomsFolder;
    }

    public void updateCodeProjects(IProgressMonitor monitor, boolean forceBuild) {
        updateCodeProjects(monitor, forceBuild, false);
    }

    public void updateCodeProjects(IProgressMonitor monitor, boolean forceBuild, boolean buildIfNoUpdate) {
        try {
            for (ERepositoryObjectType codeType : ERepositoryObjectType.getAllTypesOfCodes()) {
                updateCodeProject(monitor, codeType, forceBuild, buildIfNoUpdate);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
    }

    public void updateCodeProject(IProgressMonitor monitor, ERepositoryObjectType codeType, boolean forceBuild,
            boolean buildIfNoUpdate) throws Exception {
        Project currentProject = ProjectManager.getInstance().getCurrentProject();
        ITalendProcessJavaProject codeProject = getCodesProject(codeType);
        if (ERepositoryObjectType.ROUTINES == codeType) {
            PomUtil.checkExistingLog4j2Dependencies4RoutinePom(projectTechName, codeProject.getProjectPom());
        }
        if (forceBuild || CodeM2CacheManager.needUpdateCodeProject(currentProject, codeType)) {
            updateCodeProjectPom(monitor, codeType, codeProject.getProjectPom());
            MavenProjectUtils.updateMavenProject(monitor, codeProject.getProject());
            build(codeType, true, monitor);
            CodeM2CacheManager.updateCacheStatus(currentProject.getTechnicalLabel(), codeType, true);
        } else if (buildIfNoUpdate) {
            build(codeType, false, monitor);
        }
    }

    public void updateCodeProjectPom(IProgressMonitor monitor, ERepositoryObjectType type, IFile pomFile)
            throws Exception {
        if (type != null) {
            if (ERepositoryObjectType.ROUTINES == type) {
                createRoutinesPom(pomFile, monitor);
            } else if (ERepositoryObjectType.BEANS != null && ERepositoryObjectType.BEANS == type) {
                createBeansPom(pomFile, monitor);
            }
        }
    }

    public static void updateAllCodesProjectNeededModules(IProgressMonitor monitor) {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(ILibrariesService.class)
                && GlobalServiceRegister.getDefault().isServiceRegistered(ILibraryManagerService.class)) {
            Set<ModuleNeeded> neededModules = new HashSet<>();
            ILibrariesService librariesService = GlobalServiceRegister.getDefault().getService(ILibrariesService.class);
            ERepositoryObjectType.getAllTypesOfCodes()
                    .forEach(c -> neededModules.addAll(librariesService.getCodesModuleNeededs(c)));
            neededModules.addAll(librariesService.getAllCodesJarModuleNeededs());

            ILibraryManagerService repositoryBundleService = GlobalServiceRegister.getDefault()
                    .getService(ILibraryManagerService.class);
            repositoryBundleService.retrieve(neededModules, null, false);
            Set<ModuleNeeded> toInstall = neededModules.stream()
                    .filter(module -> module.getDeployStatus() != ELibraryInstallStatus.DEPLOYED).collect(Collectors.toSet());
            if (!toInstall.isEmpty()) {
                repositoryBundleService.installModules(neededModules, monitor);
            }
        }
    }

    public void createRoutinesPom(IFile pomFile, IProgressMonitor monitor) throws Exception {
        CreateMavenRoutinePom createTemplatePom = new CreateMavenRoutinePom(pomFile);
        createTemplatePom.setProjectName(projectTechName);
        createTemplatePom.create(monitor);
    }

    public void createBeansPom(IFile pomFile, IProgressMonitor monitor) throws Exception {
        CreateMavenBeanPom createTemplatePom = new CreateMavenBeanPom(pomFile);
        createTemplatePom.setProjectName(projectTechName);
        createTemplatePom.create(monitor);
    }

    private static void build(ERepositoryObjectType codeType, boolean install, IProgressMonitor monitor)
            throws Exception {
        synchronized (codeType) {
            ITalendProcessJavaProject codeProject = getCodesProject(codeType);
            codeProject.buildWholeCodeProject();
            if (install) {
                Map<String, Object> argumentsMap = new HashMap<>();
                argumentsMap.put(TalendProcessArgumentConstant.ARG_GOAL, TalendMavenConstants.GOAL_INSTALL);
                argumentsMap.put(TalendProcessArgumentConstant.ARG_PROGRAM_ARGUMENTS, TalendMavenConstants.ARG_MAIN_SKIP);
                codeProject.buildModules(monitor, null, argumentsMap);
            }
        }
    }

    public static void buildCodesProject() {
        IProgressMonitor monitor = new NullProgressMonitor();
        new AggregatorPomsHelper().updateCodeProjects(monitor, false);
        CodesJarM2CacheManager.updateCodesJarProject(monitor);
    }

    public static void buildCodesProject(IProgressMonitor monitor, Set<CodesJarInfo> toUpdate) {
        new AggregatorPomsHelper().updateCodeProjects(monitor, false);
        CodesJarM2CacheManager.updateCodesJarProject(monitor, toUpdate.stream()
                .filter(info -> CodesJarM2CacheManager.needUpdateCodesJarProject(info)).collect(Collectors.toSet()), false,
                false);
    }

    public static void updateGroupIdAndRelativePath(IFile pomFile) throws Exception {
        Property property = null;
        Model model = MavenPlugin.getMavenModelManager().readMavenModel(pomFile);
        String id = model.getProperties().getProperty("talend.job.id"); //$NON-NLS-1$
        String version = model.getProperties().getProperty("talend.job.version"); //$NON-NLS-1$
        if (id == null && version == null) {
            id = model.getProperties().getProperty("talend.joblet.id"); //$NON-NLS-1$
            version = model.getProperties().getProperty("talend.joblet.version"); //$NON-NLS-1$
        }
        if (id != null && version != null) {
            IRepositoryViewObject object = ProxyRepositoryFactory.getInstance().getSpecificVersion(id, version, false);
            property = object.getProperty();
        }
        updateGroupIdAndRelativePath(pomFile, property);
    }

    public static void updateGroupIdAndRelativePath(IFile pomFile, Property property) throws Exception {
        Model model = MavenPlugin.getMavenModelManager().readMavenModel(pomFile);
        boolean needUpdate = false;
        if (model.getParent() != null) {
            String relativePath = PomUtil.getPomRelativePath(pomFile.getLocation().toFile());
            if (!relativePath.equals(model.getParent().getRelativePath())) {
                model.getParent().setRelativePath(relativePath);
                needUpdate = true;
            }
        }
        if (property != null) {
            String groupId = null;
            if (ERepositoryObjectType.getAllTypesOfJoblet().contains(ERepositoryObjectType.getType(property))) {
                groupId = PomIdsHelper.getJobletGroupId(property);
            } else {
                groupId = PomIdsHelper.getJobGroupId(property);
            }
            if (groupId != null && !groupId.equals(model.getGroupId())) {
                model.setGroupId(groupId);
                needUpdate = true;
            }
        }
        if (needUpdate) {
            PomUtil.savePom(null, model, pomFile);
        }
    }

    public IFile getProjectRootPom() {
        return getProjectPomsFolder().getFile(TalendMavenConstants.POM_FILE_NAME);
    }

    public IFolder getCodeFolder(ERepositoryObjectType codeType) {
        IFolder codesFolder = getProjectPomsFolder().getFolder(DIR_CODES);
        if (codeType == ERepositoryObjectType.ROUTINES) {
            return codesFolder.getFolder(DIR_ROUTINES);
        }
        if (codeType == ERepositoryObjectType.BEANS) {
            return codesFolder.getFolder(DIR_BEANS);
        }
        if (codeType == ERepositoryObjectType.ROUTINESJAR) {
            return codesFolder.getFolder(DIR_ROUTINESJAR);
        }
        if (codeType == ERepositoryObjectType.BEANSJAR) {
            return codesFolder.getFolder(DIR_BEANSJAR);
        }
        return null;
    }

    public IFolder getCodeSrcFolder(ERepositoryObjectType codeType) {
        return getCodeFolder(codeType).getFolder(MavenSystemFolders.JAVA.getPath());
    }

    public IFolder getCodesJarFolder(CodesJarInfo info) {
        return getCodeFolder(info.getType()).getFolder(info.getLabel());
    }

    public IFolder getProcessFolder(ERepositoryObjectType type) {
        return getProjectPomsFolder().getFolder(DIR_JOBS).getFolder(type.getFolder());
    }

    public String getJobProjectName(Property property) {
        return projectTechName + "_" + getJobProjectFolderName(property).toUpperCase(); //$NON-NLS-1$
    }

    public static String getJobProjectFolderName(Property property) {
        return getJobProjectFolderName(property.getLabel(), property.getVersion());
    }

    public static String getJobProjectFolderName(String label, String version) {
        return label.toLowerCase() + "_" + version; //$NON-NLS-1$
    }

    public static String getJobProjectId(Property property) {
        String _projectTechName = ProjectManager.getInstance().getProject(property).getTechnicalLabel();
        return getJobProjectId(_projectTechName, property.getId(), property.getVersion());
    }

    public static String getJobProjectId(String projectTechName, String id, String version) {
        return projectTechName + "|" + id + "|" + version; //$NON-NLS-1$ //$NON-NLS-2$
    }

    public static IFolder getItemPomFolder(Property property) {
        return getItemPomFolder(property, null);
    }

    /**
     * without create/open project<br/>
     * Use Function to get the relativePath from property at realtime, since the property may be changed
     */
    public static IFolder getItemPomFolder(Property property, String realVersion, Function<Property, IPath> getItemRelativePath) {
        return getItemPomFolder(property, ProjectManager.getInstance().getProject(property).getTechnicalLabel(), realVersion,
                getItemRelativePath);
    }

    public static IFolder getItemPomFolder(Property property, String projectTechName, String realVersion,
            Function<Property, IPath> getItemRelativePath) {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(ITestContainerProviderService.class)) {
            ITestContainerProviderService testContainerService =
                    (ITestContainerProviderService) GlobalServiceRegister.getDefault().getService(
                            ITestContainerProviderService.class);
            if (testContainerService.isTestContainerItem(property.getItem())) {
                try {
                    Item jobItem = testContainerService.getParentJobItem(property.getItem());
                    if (jobItem != null) {
                        property = jobItem.getProperty();
                    }
                } catch (PersistenceException e) {
                    ExceptionHandler.process(e);
                }
            }
        }

        AggregatorPomsHelper helper = new AggregatorPomsHelper(projectTechName);
        IPath itemRelativePath = getItemRelativePath.apply(property);
        String version = realVersion == null ? property.getVersion() : realVersion;
        String jobFolderName = getJobProjectFolderName(property.getLabel(), version);
        ERepositoryObjectType type = ERepositoryObjectType.getItemType(property.getItem());
        IFolder jobFolder = null;
        if (PomIdsHelper.skipFolders()) {
            jobFolder = helper.getProcessFolder(type).getFolder(jobFolderName);
        } else {
            jobFolder = helper.getProcessFolder(type).getFolder(itemRelativePath).getFolder(jobFolderName);
        }
        List<ERepositoryObjectType> allTypesOfProcess2 = ERepositoryObjectType.getAllTypesOfProcess2();
        if (allTypesOfProcess2.contains(type)) {
            createFoldersIfNeeded(jobFolder);
        }
        return jobFolder;
    }
    
    public static void updateProjectPomFile(Set<String> visistedProjects, Project prj, Set<String> removedTechLabels) {
        if (visistedProjects.contains(prj.getTechnicalLabel())) {
            return;
        }
        
        visistedProjects.add(prj.getTechnicalLabel());

        IFile pomFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(prj.getTechnicalLabel() + "/" + DIR_POMS + "/" + TalendMavenConstants.POM_FILE_NAME));
        // read project pom
        try (InputStream is = new BufferedInputStream(new FileInputStream(pomFile.getLocation().toFile()))) {
            Model projectModel = MavenPlugin.getMavenModelManager().readMavenModel(is);

            Set<String> newMods = projectModel.getModules().stream().filter(mod -> {
                String techLabel = getTechnicalLabelFromRefModule(mod);
                return !removedTechLabels.contains(techLabel);
            }).collect(Collectors.toSet());

            // remove the ref mods
            if (newMods.size() != projectModel.getModules().size()) {
                LOGGER.info("project: " + prj.getTechnicalLabel() + " removed number of ref mods: " + (projectModel.getModules().size() - newMods.size()));
                projectModel.getModules().clear();
                projectModel.getModules().addAll(newMods);

                // update the pom file.
                PomUtil.savePom(null, projectModel, pomFile);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }

        List<ProjectReference> prjRefs = prj.getProjectReferenceList();
        if (!prjRefs.isEmpty()) {
            for (ProjectReference pr : prjRefs) {
                updateProjectPomFile(visistedProjects, new Project(pr.getReferencedProject()), removedTechLabels);
            }
        }
    }

    public static IFolder getItemPomFolder(Property property, String realVersion) {
        return getItemPomFolder(property, realVersion, p -> ItemResourceUtil.getItemRelativePath(p));
    }

    private static void createFoldersIfNeeded(IFolder folder) {
        if (!folder.exists()) {
            if (folder.getParent() instanceof IFolder) {
                createFoldersIfNeeded((IFolder) folder.getParent());
            }
            try {
                folder.create(true, true, null);
            } catch (CoreException e) {
                ExceptionHandler.process(e);
            }
        }
    }

    public static void checkJobPomCreation(ITalendProcessJavaProject jobProject) throws CoreException {
        Model model = MavenPlugin.getMavenModelManager().readMavenModel(jobProject.getProjectPom());
        boolean useTempPom = TalendJavaProjectConstants.TEMP_POM_ARTIFACT_ID.equals(model.getArtifactId());
        jobProject.setUseTempPom(useTempPom);
    }

    public void syncAllPoms() throws Exception {

        IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

            @Override
            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                final IWorkspaceRunnable op = new IWorkspaceRunnable() {

                    @Override
                    public void run(final IProgressMonitor monitor) throws CoreException {
                        try {
                            syncAllPomsWithoutProgress(monitor, PomIdsHelper.getPomFilter(), false);
                        } catch (Exception e) {
                            ExceptionHandler.process(e);
                        }
                    }

                };
                IWorkspace workspace = ResourcesPlugin.getWorkspace();
                try {
                    ISchedulingRule schedulingRule = workspace.getRoot();
                    // the update the project files need to be done in the workspace runnable to avoid
                    // all
                    // notification
                    // of changes before the end of the modifications.
                    workspace.run(op, schedulingRule, IWorkspace.AVOID_UPDATE, monitor);
                } catch (CoreException e) {
                    ExceptionHandler.process(e);
                }

            }
        };
        new ProgressMonitorDialog(Display.getDefault().getActiveShell()).run(true, true, runnableWithProgress);
    }

    private String getModulePath(IFile pomFile) {
        IFile parentPom = getProjectRootPom();
        if (parentPom != null) {
            IPath relativePath = pomFile.getParent().getLocation().makeRelativeTo(parentPom.getParent().getLocation());
            return relativePath.toPortableString();
        }
        return null;
    }

    private List<Profile> collectRefProjectProfiles(List<ProjectReference> references) throws CoreException {
        // if (!needUpdateRefProjectModules()) {
        // Model model = MavenPlugin.getMavenModelManager().readMavenModel(getProjectRootPom());
        // List<Profile> profiles = model.getProfiles();
        // return profiles.stream().filter(profile -> matchModuleProfile(profile.getId(), projectTechName))
        // .collect(Collectors.toList());
        // }
        if (references == null) {
            references = ProjectManager.getInstance().getCurrentProject().getProjectReferenceList(true);
        }
        List<Profile> profiles = new ArrayList<>();
        references.forEach(reference -> {
            String refProjectTechName = reference.getReferencedProject().getTechnicalLabel();
            String modulePath = "../../" + refProjectTechName + "/" + TalendJavaProjectConstants.DIR_POMS; //$NON-NLS-1$ //$NON-NLS-2$
            Profile profile = new Profile();
            profile.setId((projectTechName + "_" + refProjectTechName).toLowerCase()); //$NON-NLS-1$
            Activation activation = new Activation();
            activation.setActiveByDefault(true);
            profile.setActivation(activation);
            profile.getModules().add(modulePath);
            profiles.add(profile);
        });
        return profiles;
    }

    private List<String> collectRefProjectModules(List<ProjectReference> references) throws CoreException {
        // if (!needUpdateRefProjectModules()) {
        // Model model = MavenPlugin.getMavenModelManager().readMavenModel(getProjectRootPom());
        // return model.getModules().stream().filter(modulePath -> modulePath.startsWith("../../")) //$NON-NLS-1$
        // .collect(Collectors.toList());
        // }
        if (references == null) {
            references = ProjectManager.getInstance().getCurrentProject().getProjectReferenceList(true);
        }
        List<String> modules = new ArrayList<>();
        references.forEach(reference -> {
            String refProjectTechName = reference.getReferencedProject().getTechnicalLabel();
            String modulePath = "../../" + refProjectTechName + "/" + TalendJavaProjectConstants.DIR_POMS; //$NON-NLS-1$ //$NON-NLS-2$
            modules.add(modulePath);
        });
        return modules;

    }

    public boolean needUpdateRefProjectModules() {
        try {
            boolean isLocalProject = ProxyRepositoryFactory.getInstance().isLocalConnectionProvider();
            boolean isOffline = false;
            if (!isLocalProject) {
                RepositoryContext repositoryContext =
                        (RepositoryContext) CoreRuntimePlugin.getInstance().getContext().getProperty(
                                Context.REPOSITORY_CONTEXT_KEY);
                isOffline = repositoryContext.isOffline();
            }
            return !isLocalProject && !isOffline;
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
        }
        return false;
    }

    public void syncAllPomsWithoutProgress(IProgressMonitor monitor) throws Exception {
        syncAllPomsWithoutProgress(monitor, PomIdsHelper.getPomFilter(), false);
    }

    public void syncAllPomsWithoutProgress(IProgressMonitor monitor, String pomFilter, boolean withDependencies)
            throws Exception {
        LOGGER.info("syncAllPomsWithoutProgress, pomFilter: " + pomFilter);
        IRunProcessService runProcessService = IRunProcessService.get();
        if (runProcessService == null) {
            return;
        }
        BuildCacheManager.getInstance().clearAllCaches();

        Boolean isCIMode = IRunProcessService.get().isCIMode();

        List<IRepositoryViewObject> objects = new ArrayList<>();
        List<ERepositoryObjectType> allJobletTypes = ERepositoryObjectType.getAllTypesOfJoblet();
        for (ERepositoryObjectType type : ERepositoryObjectType.getAllTypesOfProcess2()) {
            if (isCIMode && withDependencies && allJobletTypes.contains(type)) {
                continue;
            }
            objects.addAll(ProxyRepositoryFactory.getInstance().getAll(type, true, true));
        }
        Iterator<IRepositoryViewObject> iterator = objects.iterator();
        while (iterator.hasNext()) {
            IRepositoryViewObject object = iterator.next();
            if (object.getProperty() == null || object.getProperty().getItem() == null) {
                iterator.remove();
                continue;
            }
            if (isCIMode && !allJobletTypes.contains(object.getRepositoryObjectType()) && IFilterService.get() != null
                    && !IFilterService.get().isFilterAccepted(object.getProperty().getItem(), pomFilter)) {
                iterator.remove();
                continue;
            }
            if (isCIMode && object.isDeleted() && PomIdsHelper.getIfExcludeDeletedItems()) {
                iterator.remove();
            }
        }
        Set<Item> allItems;
        if (withDependencies) {
            allItems = objects.stream().flatMap(object -> {
                ProcessItem item = (ProcessItem) object.getProperty().getItem();
                Set<JobInfo> allJobInfos = ProcessorUtilities.getChildrenJobInfo(item, false, true);
                allJobInfos.add(new JobInfo(item, item.getProcess().getDefaultContext()));
                return allJobInfos.stream();
            }).filter(info -> !info.isTestContainer() && ProjectManager.getInstance()
                    .isInCurrentMainProject(info.getJobletProperty() != null ? info.getJobletProperty() : info.getProcessItem()))
                    .distinct()
                    .map(info -> info.getJobletProperty() != null ? info.getJobletProperty().getItem() : info.getProcessItem())
                    .collect(Collectors.toSet());
        } else {
            allItems = objects.stream().map(object -> object.getProperty().getItem()).collect(Collectors.toSet());
        }

        int size = 3 + allItems.size();
        monitor.setTaskName("Synchronize all poms"); //$NON-NLS-1$
        monitor.beginTask("", size); //$NON-NLS-1$
        // project pom
        monitor.subTask("Synchronize project pom"); //$NON-NLS-1$
        Model model = getCodeProjectTemplateModel();
        LOGGER.info("syncAllPomsWithoutProgress, isCIMode: " + isCIMode + ", useProfileMode: " + PomIdsHelper.useProfileModule());
        if (isCIMode) {
            if (PomIdsHelper.useProfileModule()) {
                model.getProfiles().addAll(collectRefProjectProfiles(null));
            } else {
                model.getModules().addAll(collectRefProjectModules(null));
            }
        }

        createRootPom(model, true, monitor);
        installRootPom(true);
        monitor.worked(1);
        if (monitor.isCanceled()) {
            return;
        }

        // codes pom
        monitor.subTask("Synchronize code poms"); //$NON-NLS-1$

        System.setProperty("ignore.ci.mode", isCIMode.toString());
        updateCodeProjects(monitor, true);
        CodesJarM2CacheManager.updateCodesJarProject(monitor, true, true, true);
        System.setProperty("ignore.ci.mode", Boolean.FALSE.toString());

        monitor.worked(1);
        if (monitor.isCanceled()) {
            return;
        }
        // all jobs pom
        List<String> modules = new ArrayList<>();
        List<Property> serviceRefJobs = getAllServiceReferencedJobs();
        for (Item item : allItems) {
            if (ProjectManager.getInstance().isInCurrentMainProject(item)) {
                monitor.subTask("Synchronize job pom: " + item.getProperty().getLabel() //$NON-NLS-1$
                        + "_" + item.getProperty().getVersion()); //$NON-NLS-1$
                runProcessService.generatePom(item, TalendProcessOptionConstants.GENERATE_POM_NO_FILTER);
                IFile pomFile = getItemPomFolder(item.getProperty()).getFile(TalendMavenConstants.POM_FILE_NAME);
                // filter esb data service node
                // FIXME use serviceRefJobs.contains(item.getProperty()) if isSOAPServiceProvider() doesn't work.
                if (isCIMode && !isSOAPServiceProvider(item.getProperty()) && pomFile.exists()) {
                    modules.add(getModulePath(pomFile));
                }
            }
            monitor.worked(1);
            if (monitor.isCanceled()) {
                return;
            }
        }
        // sync project pom again with all modules.
        monitor.subTask("Synchronize project pom with modules"); //$NON-NLS-1$
        if (isCIMode) {
            collectCodeModules(modules);
            model.getModules().addAll(modules);
            createRootPom(model, true, monitor);
            installRootPom(true);
        }
        monitor.worked(1);
        if (monitor.isCanceled()) {
            return;
        }
        if (isCIMode) {
            for (ERepositoryObjectType codeType : ERepositoryObjectType.getAllTypesOfCodes()) {
                ITalendProcessJavaProject codeProject = getCodesProject(codeType);
                if (codeProject != null) {
                    updateCodeProjectPom(monitor, codeType, codeProject.getProjectPom());
                }
            }
            CodesJarResourceCache.getAllCodesJars().stream().filter(CodesJarInfo::isInCurrentMainProject)
                    .forEach(info -> CodesJarM2CacheManager.updateCodesJarProjectPom(monitor, info));
            
            if (!PomIdsHelper.useProfileModule()) {
                // remove ref mods
                Set<String> visitedProjectLabels = new HashSet<String>();
                Map<String, ReferenceCount> rcs = new HashMap<String, ReferenceCount>();
                findReferenceCount(visitedProjectLabels, ProjectManager.getInstance().getCurrentProject(), rcs);
                
                visitedProjectLabels = new HashSet<String>();
                Set<String> removedTechLabels = rcs.values().stream().filter(rc -> rc.referenceCount > 1).map(rc -> rc.getTalendProject().getTechnicalLabel()).collect(Collectors.toSet());
                if (!removedTechLabels.isEmpty()) {
                    LOGGER.info("Need to remove duplicated mods: " + removedTechLabels);
                    updateProjectPomFile(visitedProjectLabels, ProjectManager.getInstance().getCurrentProject(), removedTechLabels);
                }
            }
        }
        LOGGER.info("syncAllPomsWithoutProgress, done");
        monitor.done();
    }

    // TODO move this method to esb repository and call by IService.
    private List<Property> getAllServiceReferencedJobs() {
        List<Property> refJobs = new ArrayList<>();
        // List<IRepositoryViewObject> all =
        // ProxyRepositoryFactory.getInstance().getAll(ERepositoryObjectType.SERVICES);
        // for (IRepositoryViewObject obj : all) {
        // ServiceConnection connection = (ServiceConnection) serviceItem.getConnection();
        // EList<ServicePort> listPort = connection.getServicePort();
        // ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        // for (ServicePort port : listPort) {
        // List<ServiceOperation> listOperation = port.getServiceOperation();
        // for (ServiceOperation operation : listOperation) {
        // if (StringUtils.isNotEmpty(operation.getReferenceJobId())) {
        // IRepositoryViewObject node;
        // node = factory.getLastVersion(operation.getReferenceJobId());
        // if (node != null && node.getProperty() != null) {
        // refJobs.add(node.getProperty());
        // }
        // }
        // }
        // }
        // }
        return refJobs;
    }

    private void collectCodeModules(List<String> modules) {
        // collect codes modules
        IRunProcessService service = IRunProcessService.get();
        if (service != null) {
            modules.add(getModulePath(service.getTalendCodeJavaProject(ERepositoryObjectType.ROUTINES).getProjectPom()));
            if (ProcessUtils.isRequiredBeans(null)) {
                modules.add(getModulePath(service.getTalendCodeJavaProject(ERepositoryObjectType.BEANS).getProjectPom()));
            }
            CodesJarResourceCache.getAllCodesJars().stream().filter(info -> info.isInCurrentMainProject()).forEach(
                    info -> modules.add(getModulePath(getCodesJarFolder(info).getFile(TalendMavenConstants.POM_FILE_NAME))));
        }
    }

    /**
     * Check if is a esb data service job TODO to remove
     * 
     * @param property
     * @return
     */
    private static boolean isSOAPServiceProvider(Property property) {
        if (property != null) {
            List<Relation> relations = RelationshipItemBuilder.getInstance().getItemsRelatedTo(property.getId(),
                    property.getVersion(), RelationshipItemBuilder.JOB_RELATION);
            for (Relation relation : relations) {
                if (RelationshipItemBuilder.SERVICES_RELATION.equals(relation.getType())) {
                    return true;
                }
            }
            if (GlobalServiceRegister.getDefault().isServiceRegistered(IESBService.class)) {
                IESBService service = GlobalServiceRegister.getDefault().getService(IESBService.class);
                if (service != null) {
                    if (service.isSOAPServiceProvider(property.getItem())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static ITalendProcessJavaProject getCodesProject(ERepositoryObjectType codeType) {
        if (IRunProcessService.get() != null) {
            return IRunProcessService.get().getTalendCodeJavaProject(codeType);
        }
        return null;
    }

    private Model getCodeProjectTemplateModel() {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put(MavenTemplateManager.KEY_PROJECT_NAME, projectTechName);
        return MavenTemplateManager.getCodeProjectTemplateModel(parameters);
    }

    public static boolean matchModuleProfile(String profileId, String projectTechName) {
        // FIXME get profile id from extension point.
        List<String> otherProfiles = Arrays.asList("docker", "cloud-publisher", "nexus"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return !otherProfiles.contains(profileId) && StringUtils.startsWithIgnoreCase(profileId, projectTechName + "_");
    }
    
    public static String getTechnicalLabelFromRefModule(String refMod) {
        String[] modPaths= refMod.split("/");
        return modPaths[modPaths.length-2];
    }
    
    protected void findReferenceCount(Set<String> visitedProjects, Project projectTree, Map<String, ReferenceCount> rcs) {
        if (visitedProjects.contains(projectTree.getTechnicalLabel()) || projectTree == null || projectTree.getProjectReferenceList().isEmpty()) {
            return;
        }

        visitedProjects.add(projectTree.getTechnicalLabel());

        for (ProjectReference refPrj : projectTree.getProjectReferenceList()) {
            ReferenceCount rc = rcs.get(refPrj.getReferencedProject().getTechnicalLabel());
            if (rc == null) {
                rc = new ReferenceCount(new Project(refPrj.getReferencedProject()));
                rcs.put(refPrj.getReferencedProject().getTechnicalLabel(), rc);
            }
            if (StringUtils.equals(refPrj.getReferencedProject().getTechnicalLabel(), rc.getTalendProject().getTechnicalLabel())) {
                rc.increaseReferenceCount();
            }
            rc.increaseReferenceLevel();
            findReferenceCount(visitedProjects, new Project(refPrj.getReferencedProject()), rcs);
        }
    }

    static class ReferenceCount {

        private Project talendProject;

        private int referenceCount;
        
        private int referenceLevel;

        
        /**
         * @return the referenceLevel
         */
        public int getReferenceLevel() {
            return referenceLevel;
        }

        public void increaseReferenceLevel() {
            referenceLevel++;
        }
        
        /**
         * @return the talendProject
         */
        public Project getTalendProject() {
            return talendProject;
        }

        /**
         * @return the referenceCount
         */
        public int getReferenceCount() {
            return referenceCount;
        }

        public void increaseReferenceCount() {
            referenceCount++;
        }

        public ReferenceCount(Project project) {
            talendProject = project;
        }
    }

}
