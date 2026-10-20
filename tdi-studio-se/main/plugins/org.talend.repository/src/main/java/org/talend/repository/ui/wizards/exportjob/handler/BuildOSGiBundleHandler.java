// ============================================================================
//
// Talaxie Community Edition
//
// Copyright (C) 2006-2021 Talaxie – www.deilink.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.repository.ui.wizards.exportjob.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.generation.JavaUtils;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.core.CorePlugin;
import org.talend.core.model.process.JobInfo;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Project;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.routines.CodesJarInfo;
import org.talend.core.model.routines.RoutinesUtil;
import org.talend.core.runtime.process.ITalendProcessJavaProject;
import org.talend.core.utils.CodesJarResourceCache;
import org.talend.designer.core.model.utils.emf.talendfile.RoutinesParameterType;
import org.talend.designer.maven.launch.MavenPomCommandLauncher;
import org.talend.designer.maven.model.MavenSystemFolders;
import org.talend.designer.maven.model.TalendMavenConstants;
import org.talend.designer.maven.utils.PomIdsHelper;
import org.talend.designer.runprocess.IProcessor;
import org.talend.designer.runprocess.IRunProcessService;
import org.talend.designer.runprocess.ProcessorUtilities;
import org.talend.repository.documentation.ExportFileResource;
import org.talend.repository.local.ExportItemUtil;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.JobScriptsManager;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.JobScriptsManager.ExportChoice;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.esb.OSGIJavaScriptForESBWithMavenManager;

/**
 * DOC yyan class global comment. 2018-1-15
 *
 * For OSGi data service - REST
 */
public class BuildOSGiBundleHandler extends BuildJobHandler {

    /**
     * Folder of the bundle resources receiving the sources of the sources option, added at the root of the bundle (see
     * the OSGi assembly template)
     */
    private static final String SOURCES_FOLDER = "sources"; //$NON-NLS-1$

    private static final String ITEMS_FOLDER = "items"; //$NON-NLS-1$

    private static final String JAVA_SOURCES_FOLDER = "src/main/java"; //$NON-NLS-1$

    private static final String ROUTINES_PACKAGE = "routines"; //$NON-NLS-1$

    private OSGIJavaScriptForESBWithMavenManager osgiMavenManager;

    public BuildOSGiBundleHandler(ProcessItem processItem, String version, String contextName,
            Map<ExportChoice, Object> exportChoiceMap) {
        super(processItem, version, contextName, exportChoiceMap);

        osgiMavenManager = new OSGIJavaScriptForESBWithMavenManager(exportChoiceMap, contextName, JobScriptsManager.LAUNCHER_ALL,
                IProcessor.NO_STATISTICS, IProcessor.NO_TRACES);

        osgiMavenManager.setJobVersion(version);
        osgiMavenManager.setBundleVersion(exportChoiceMap.containsKey(ExportChoice.bundleVersion) ?
        		(String)exportChoiceMap.get(ExportChoice.bundleVersion) : getArtifactVersion(processItem)); 
    }

    protected String getArtifactVersion(ProcessItem processItem) {
        if (processItem != null) {
            String v = PomIdsHelper.getJobVersion(processItem.getProperty());
            if (v != null) {
                return v.replace("-", ".");
            }
        }
        return null;
    }
    

    /*
     * (non-Javadoc)
     *
     * @see
     * org.talend.repository.ui.wizards.exportjob.handler.BuildJobHandler#generateJobFiles(org.eclipse.core.runtime.
     * IProgressMonitor)
     */
    @Override
    public IProcessor generateJobFiles(IProgressMonitor monitor) throws Exception {
        IProcessor processor = super.generateJobFiles(monitor);
        // APPINT-33088 bundle resources are needed for final maven build in CI mode
        // but can be removed in Studio build mode
        if (!ProcessorUtilities.isCIMode()) {
        	cleanBundelResources(monitor);
        }
        // Generate class before the final build goal, JobJavaScriptOSGIForESBManager.createAnalyzer needs the classes
        // to compute import-package for the manifest.mf. TalendJavaProjectManager.getTalendJobJavaProject is always
        // disabled MavenNature when create project(false), it will stop jdt to compile, and imporve this part will help
        // to avoid using maven in this step.
        MavenPomCommandLauncher mavenLauncher = new MavenPomCommandLauncher(talendProcessJavaProject.getProjectPom(),
                TalendMavenConstants.GOAL_COMPILE);
        mavenLauncher.setSkipCIBuilder(true);
        mavenLauncher.setSkipTests(true);
        mavenLauncher.execute(monitor);

        List<ExportFileResource> resources = osgiMavenManager
                .getExportResources(new ExportFileResource[] { new ExportFileResource(processItem, "") });
        for (ExportFileResource resource : resources) {
            for (String relativePath : resource.getRelativePathList()) {
                String path = resource.getDirectoryName().isEmpty() ? relativePath : resource.getDirectoryName();
                for (URL url : resource.getResourcesByRelativePath(relativePath)) {
                    String resourceUrl = url.toString();
                    String fileName = resourceUrl.substring(resourceUrl.lastIndexOf('/') + 1, resourceUrl.length());
                    IFile target = getTargetFile(path, fileName, monitor);
                    if (target != null) {
                        setFileContent(new FileInputStream(url.getFile()), target, monitor);
                    }
                }
            }
        }

        copySourceCodes(processor, monitor);

        return processor;
    }

    /**
     * Sources option of the build: copies in bundle-resources/sources, as in a standalone build:
     * <ul>
     * <li>items: the items of the job and of its dependencies (sub-jobs, contexts, metadata, routines...)</li>
     * <li>src/main/java: the java sources of the job, of its sub-jobs and of the routines they use (routines of the
     * repository and custom routine jars)</li>
     * </ul>
     * The assembly adds them at the root of the bundle. Without the option, removes the sources copied by a previous
     * build.
     */
    private void copySourceCodes(IProcessor processor, IProgressMonitor monitor) throws Exception {
        IFolder bundleResourcesFolder = talendProcessJavaProject.getBundleResourcesFolder();
        File sourcesFolder = new File(bundleResourcesFolder.getLocation().toFile(), SOURCES_FOLDER);
        FilesUtils.deleteFile(sourcesFolder, true);
        if (isOptionChoosed(ExportChoice.needSourceCode)) {
            ExportItemUtil exportItemUtil = new ExportItemUtil();
            exportItemUtil.setProjectNameAsLowerCase(isProjectNameLowerCase());
            exportItemUtil.exportItems(new File(sourcesFolder, ITEMS_FOLDER), getItemsToExport(true), false,
                    new NullProgressMonitor());

            File javaFolder = new File(sourcesFolder, JAVA_SOURCES_FOLDER);
            IRunProcessService runProcessService = CorePlugin.getDefault().getRunProcessService();
            Set<String> projectTechNames = new HashSet<>();
            Set<String> codesJarIds = new HashSet<>();

            // the job and its sub-jobs: each job has its own java project, except the sub-jobs of a loop dependency
            copyFolder(talendProcessJavaProject.getSrcFolder(), javaFolder, true);
            addRoutinesUsed(processItem, projectTechNames, codesJarIds);
            if (processor != null) {
                for (JobInfo jobInfo : processor.getBuildChildrenJobs()) {
                    ProcessItem childItem = jobInfo.getProcessItem();
                    ITalendProcessJavaProject childProject = childItem == null ? null
                            : runProcessService.getTalendJobJavaProject(childItem.getProperty());
                    if (childProject != null && !childProject.getProject().equals(talendProcessJavaProject.getProject())) {
                        copyFolder(childProject.getSrcFolder(), javaFolder, true);
                    }
                }
                // the joblets are generated in the code of the jobs, but they can use other routines
                for (JobInfo jobInfo : processor.getBuildChildrenJobsAndJoblets()) {
                    Item item = jobInfo.getJobletProperty() != null ? jobInfo.getJobletProperty().getItem()
                            : jobInfo.getProcessItem();
                    addRoutinesUsed(item, projectTechNames, codesJarIds);
                }
            }

            // routines of the repository (package routines), without the framework classes of the package routines.system
            for (String projectTechName : projectTechNames) {
                ITalendProcessJavaProject routinesProject = runProcessService
                        .getTalendCodeJavaProject(ERepositoryObjectType.ROUTINES, projectTechName);
                if (routinesProject != null) {
                    copyFolder(routinesProject.getSrcFolder().getFolder(ROUTINES_PACKAGE), new File(javaFolder,
                            ROUTINES_PACKAGE), false);
                }
            }

            // custom routine jars used by the jobs
            for (String codesJarId : codesJarIds) {
                CodesJarInfo info = CodesJarResourceCache.getCodesJarById(codesJarId);
                ITalendProcessJavaProject codesJarProject = info == null ? null
                        : runProcessService.getTalendCodesJarJavaProject(info);
                if (codesJarProject != null) {
                    copyFolder(codesJarProject.getSrcFolder(), javaFolder, true);
                }
            }
        }
        bundleResourcesFolder.refreshLocal(IResource.DEPTH_INFINITE, monitor);
    }

    /** Adds the project of the item (for its routines) and the custom routine jars used by the item */
    private void addRoutinesUsed(Item item, Set<String> projectTechNames, Set<String> codesJarIds) {
        if (item == null) {
            return;
        }
        Project project = getProject(item);
        if (project != null) {
            projectTechNames.add(project.getTechnicalLabel());
        }
        List<RoutinesParameterType> routines = RoutinesUtil.getRoutinesParametersFromItem(item);
        if (routines != null) {
            for (RoutinesParameterType routine : routines) {
                // the type is only set for the routines of a custom routine jar
                if (routine.getType() != null) {
                    codesJarIds.add(routine.getId());
                }
            }
        }
    }

    /**
     * Copies the files of a source folder, except the folder "internal" (temporary files of the code viewers).
     *
     * @param recursive false to copy only the files of the folder, not its sub-folders
     */
    private static void copyFolder(IFolder folder, File target, boolean recursive) throws IOException {
        if (folder == null || folder.getLocation() == null || !folder.getLocation().toFile().isDirectory()) {
            return;
        }
        Path source = folder.getLocation().toFile().toPath();
        try (Stream<Path> files = recursive ? Files.walk(source) : Files.list(source)) {
            for (Path file : (Iterable<Path>) files::iterator) {
                Path relativePath = source.relativize(file);
                if (Files.isRegularFile(file) && !relativePath.startsWith(JavaUtils.JAVA_INTERNAL_DIRECTORY)) {
                    Path copy = target.toPath().resolve(relativePath);
                    Files.createDirectories(copy.getParent());
                    Files.copy(file, copy, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }

    private void cleanBundelResources(IProgressMonitor monitor) throws CoreException {
        // clean up bundel resources folder if needed
        for (IResource resource : talendProcessJavaProject.getBundleResourcesFolder().members()) {
            if (resource.exists()) {
                resource.delete(true, monitor);
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.repository.ui.wizards.exportjob.handler.BuildJobHandler#build(org.eclipse.core.runtime.
     * IProgressMonitor)
     */
    @Override
    public void build(IProgressMonitor monitor) throws Exception {
        super.build(monitor);
    }

    private IFile getTargetFile(String path, String fileName, IProgressMonitor monitor) {
        IFolder folder = null;
        if (path.startsWith(MavenSystemFolders.RESOURCES.getPath())) {
            String sub = path.replaceAll(MavenSystemFolders.RESOURCES.getPath(), "");
            folder = talendProcessJavaProject.createSubFolder(monitor, talendProcessJavaProject.getBundleResourcesFolder(), sub);
        } else if (path.startsWith(MavenSystemFolders.JAVA.getPath())) {
            String sub = path.replaceAll(MavenSystemFolders.JAVA.getPath(), "");
            folder = talendProcessJavaProject.getSrcSubFolder(monitor, sub);
        } else if (path.startsWith("META-INF")) {
            folder = talendProcessJavaProject.createSubFolder(monitor, talendProcessJavaProject.getBundleResourcesFolder(), path);
        } else if (path.startsWith("xmlMappings")) {
            folder = talendProcessJavaProject.createSubFolder(monitor, talendProcessJavaProject.getBundleResourcesFolder(), path);
        }
        return folder == null ? null : folder.getFile(fileName);
    }

    /*
     * Bundle extention is jar
     *
     * @see org.talend.repository.ui.wizards.exportjob.handler.AbstractBuildJobHandler#getJobTargetFile()
     */
    @Override
    public IFile getJobTargetFile() {
        if (talendProcessJavaProject == null) {
            return null;
        }
        IFolder targetFolder = talendProcessJavaProject.getTargetFolder();
        IFile bundleFile = null;
        try {
            targetFolder.refreshLocal(IResource.DEPTH_ONE, null);

            String esbExportType = exportChoice.get(ExportChoice.esbExportType) == null ? ""
                    : exportChoice.get(ExportChoice.esbExportType).toString();

            String fileExtension = "jar";

            // we only build one zip at a time, so just get the zip file to be able to manage some pom customizations.
            for (IResource resource : targetFolder.members()) {
                if (resource instanceof IFile) {
                    IFile file = (IFile) resource;
                    if (StringUtils.isNotBlank(esbExportType)) {
                        fileExtension = esbExportType;
                    }

                    if (fileExtension.equals(file.getFileExtension())) {
                        bundleFile = file;
                        break;
                    }
                }
            }
        } catch (CoreException e) {
            ExceptionHandler.process(e);
        }
        return bundleFile;
    }

    private void setFileContent(InputStream inputStream, IFile file, IProgressMonitor monitor) throws CoreException {
        file.refreshLocal(IResource.DEPTH_ZERO, monitor);
        if (file.exists()) {
            file.setContents(inputStream, 0, monitor);
        } else {
            file.create(inputStream, 0, monitor);
        }
    }
}
