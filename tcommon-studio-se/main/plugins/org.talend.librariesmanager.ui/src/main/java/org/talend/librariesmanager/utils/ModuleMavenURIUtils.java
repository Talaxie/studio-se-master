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
package org.talend.librariesmanager.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Parent;
import org.apache.oro.text.regex.MalformedPatternException;
import org.apache.oro.text.regex.Pattern;
import org.apache.oro.text.regex.PatternMatcherInput;
import org.apache.oro.text.regex.Perl5Compiler;
import org.apache.oro.text.regex.Perl5Matcher;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.MavenModelManager;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.gmf.util.DisplayUtils;
import org.talend.commons.ui.runtime.utils.ZipFileUtils;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ILibraryManagerService;
import org.talend.core.model.general.ModuleNeeded.ELibraryInstallStatus;
import org.talend.core.model.general.ModuleStatusProvider;
import org.talend.core.model.general.Project;
import org.talend.core.nexus.ArtifactRepositoryBean;
import org.talend.core.nexus.TalendLibsServerManager;
import org.talend.core.runtime.maven.MavenArtifact;
import org.talend.core.runtime.maven.MavenConstants;
import org.talend.core.runtime.maven.MavenUrlHelper;
import org.talend.core.runtime.process.TalendProcessArgumentConstant;
import org.talend.designer.maven.launch.MavenPomCommandLauncher;
import org.talend.designer.maven.utils.PomUtil;
import org.talend.librariesmanager.ui.LibManagerUiPlugin;
import org.talend.librariesmanager.ui.i18n.Messages;
import org.talend.repository.ProjectManager;

/**
 * created by wchen on Sep 25, 2017 Detailled comment
 *
 */
public class ModuleMavenURIUtils {
    private static Logger log = Logger.getLogger(ModuleMavenURIUtils.class);
    
    private static PatternMatcherInput patternMatcherInput;

    private static Perl5Matcher matcher = new Perl5Matcher();

    private static Perl5Compiler compiler = new Perl5Compiler();

    private static Pattern pattern;

    // match mvn:group-id/artifact-id/version/type/classifier
    public static final String expression1 = "(mvn:(\\w+.*/)(\\w+.*/)(\\d+(\\.)?\\d.*?(/))(\\w+/)(\\w+))";//$NON-NLS-1$

    // match mvn:group-id/artifact-id/version/type
    public static final String expression2 = "(mvn:(\\w+.*/)(\\w+.*/)(\\d+(\\.)?\\d.*?(/))\\w+)";//$NON-NLS-1$

    // match mvn:group-id/artifact-id/version
    public static final String expression3 = "(mvn:(\\w+.*/)(\\w+.*/)(\\d+(\\.)?\\d[^/]*))";//$NON-NLS-1$


    public static final String MVNURI_TEMPLET = "mvn:<groupid>/<artifactId>/<version>/<type>";

    public static String validateCustomMvnURI(String originalText, String customText) {
        if (customText.equals(originalText)) {
            return Messages.getString("InstallModuleDialog.error.sameCustomURI");
        }
        if (!validateMvnURI(customText)) {
            return Messages.getString("InstallModuleDialog.error.customURI");
        }
        return null;
    }

    public static boolean validateMvnURI(String mvnURI) {
        if (pattern == null) {
            try {
                pattern = compiler.compile(expression1 + "|" + expression2 + "|" + expression3);
            } catch (MalformedPatternException e) {
                ExceptionHandler.process(e);
            }
        }
        patternMatcherInput = new PatternMatcherInput(mvnURI);
        matcher.setMultiline(false);
        boolean isMatch = matcher.matches(patternMatcherInput, pattern);
        return isMatch;
    }

    public static boolean checkInstalledStatus(String uri) {
        final String mvnURI = uri;
        ILibraryManagerService libManagerService = (ILibraryManagerService) GlobalServiceRegister.getDefault().getService(
                ILibraryManagerService.class);
        String jarPathFromMaven = libManagerService.getJarPathFromMaven(mvnURI);
        final boolean[] deployStatus = new boolean[] { false };
        if (jarPathFromMaven != null) {
            deployStatus[0] = true;
        } else {
            final IRunnableWithProgress acceptOursProgress = new IRunnableWithProgress() {

                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    ArtifactRepositoryBean customNexusServer = TalendLibsServerManager.getInstance().getCustomNexusServer();
                    if (customNexusServer != null) {
                        File resolveJar = null;
                        try {
                            resolveJar = libManagerService.resolveJar(customNexusServer, mvnURI);
                        } catch (Exception e) {
                            deployStatus[0] = false;
                        }
                        if (resolveJar != null) {
                            deployStatus[0] = true;
                            DisplayUtils.getDisplay().syncExec(new Runnable() {

                                @Override
                                public void run() {
                                    LibManagerUiPlugin.getDefault().getLibrariesService().checkLibraries();
                                }
                            });
                        }
                    }
                }
            };

            ProgressMonitorDialog dialog = new ProgressMonitorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getShell());
            try {
                dialog.run(true, true, acceptOursProgress);
            } catch (Throwable e) {
                if (!(e instanceof TimeoutException)) {
                    ExceptionHandler.process(e);
                }
            }

        }

        if (!deployStatus[0]) {
            ModuleStatusProvider.putDeployStatus(mvnURI, ELibraryInstallStatus.NOT_DEPLOYED);
            // ModuleStatusProvider.putStatus(mvnURI, ELibraryInstallStatus.NOT_INSTALLED);
        }

        return deployStatus[0];
    }

    public static void copyDefaultMavenURI(String text) {
        if (!StringUtils.isEmpty(text)) {
            Clipboard clipBoard = new Clipboard(Display.getCurrent());
            TextTransfer textTransfer = TextTransfer.getInstance();
            clipBoard.setContents(new Object[] { text }, new Transfer[] { textTransfer });
        }
    }
    
    public static Map<String, File> getDependencyModules(String jarpomFilePath, String mvnURL) {
        Map<String, File> mvnurl2Files = new HashMap<String, File>();

        String pomfile = jarpomFilePath;
        boolean validJarFile = org.talend.commons.ui.runtime.utils.ZipFileUtils.isValidJarFile(jarpomFilePath);

        Set<String> tempFiles = new HashSet<>();
        try {
            if (validJarFile) {
                pomfile = extractPomFile(jarpomFilePath, mvnURL, tempFiles);
            }
            if (PomUtil.isValidPomFile(pomfile)) {
                List<String> dependenciesMVNURL = callMavenCmd(pomfile, tempFiles);
                if (dependenciesMVNURL.isEmpty()) {
                    dependenciesMVNURL = addDependencies(pomfile);
                }
                for (String _mvnurl : dependenciesMVNURL) {
                    File resolvedLocalFile = ConfigModuleHelper.resolveLocal(_mvnurl);
                    mvnurl2Files.put(_mvnurl, resolvedLocalFile);
//                        String moduleName = MavenUrlHelper.generateModuleNameByMavenURI(_mvnurl);
                }
            }
        } finally {
            if(tempFiles != null) {
                for(String file:tempFiles) {
                    if(!StringUtils.isBlank(file)) {
                        File tempFile = new File(file); 
                        try {
                            tempFile.delete();
                        } catch (Exception e) {
                            ExceptionHandler.process(e);
                        }
                    }
                }
            }
        }

        return mvnurl2Files;
    }

    private static List<String> callMavenCmd(String pomfile, Set<String> tempFiles) {
        List<String> results = new LinkedList<String>();
        
        String outputDependenciesFile = outputDependencyList(pomfile, tempFiles);
        if (outputDependenciesFile != null && new File(outputDependenciesFile).exists()) {
            results = translatetoMVNURL(outputDependenciesFile);
        }

        return results;
    }

    private static String extractPomFile(String moduleFilePath, String mvnURL, Set<String> tempFiles) {
        final IContainer projTempFolder = getProjectTempFolder();
        IFile file = projTempFolder.getFile(new Path("extractedPom.xml"));
        deleteFile(file);
        String destPomFile = file.getLocation().toOSString();
        tempFiles.add(destPomFile);

        try (JarFile zip = new JarFile(moduleFilePath)) {
            List<? extends JarEntry> pomEntries = zip.stream().filter(entry -> entry.getName().endsWith("pom.xml"))
                    .collect(Collectors.toList());
            if (!pomEntries.isEmpty()) {
                MavenArtifact artifact = MavenUrlHelper.parseMvnUrl(mvnURL);
                MavenModelManager modelManager = MavenPlugin.getMavenModelManager();
                for (JarEntry entry : pomEntries) {
                    try (InputStream inputStream = zip.getInputStream(entry)) {
                        Model model = parseMavenModel(inputStream, modelManager);
                        if (sameGAV(artifact, model)) {
                            ZipFileUtils.unZipFileEntry(new File(destPomFile), zip, entry);
                            break;
                        }
                    } catch (CoreException e) {
                        ExceptionHandler.process(e);
                    }
                }
            }
        } catch (IOException e) {
            ExceptionHandler.process(e);
        }
        return destPomFile;
    }

    private static String outputDependencyList(String pomfile, Set<String> tempFiles) {
        final IContainer projTempFolder = getProjectTempFolder();
        final IFile newFile = projTempFolder.getFile(new Path("pom.xml"));
        deleteFile(newFile);
        tempFiles.add(newFile.getLocation().toOSString());

        File file = newFile.getLocation().toFile();
        try {
            FileUtils.copyFile(new File(pomfile), file);
            newFile.refreshLocal(0, new NullProgressMonitor());
        } catch (IOException | CoreException e) {
            ExceptionHandler.process(e);
        }

        // output to
        IFile ioutputFile = projTempFolder.getFile(new Path("dependencies.txt"));
        deleteFile(ioutputFile);
        String outputFile = ioutputFile.getLocation().toOSString();
        tempFiles.add(outputFile);

        final IRunnableWithProgress runnable = new IRunnableWithProgress() {

            @SuppressWarnings("unchecked")
            @Override
            public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                MavenPomCommandLauncher launcher = new MavenPomCommandLauncher(newFile, "dependency:list");
                Map<String, Object> argumentsMap = new HashMap<>();
                argumentsMap.put(TalendProcessArgumentConstant.ARG_PROGRAM_ARGUMENTS, "-f " + file.getAbsolutePath()
                        + " -DoutputFile=" + outputFile + " -DexcludeTransitive=true -DincludeScope=runtime");
                launcher.setArgumentsMap(argumentsMap);
                try {
                    launcher.execute(new NullProgressMonitor());
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
            }
        };
        try {
            final ProgressMonitorDialog dialog = new ProgressMonitorDialog(null);
            dialog.run(true, false, runnable);
        } catch (InvocationTargetException|InterruptedException e) {
            ExceptionHandler.process(e);
        }

        return outputFile;
    }
    
    private static IContainer getProjectTempFolder() {
        Project project = ProjectManager.getInstance().getCurrentProject();
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        final IContainer projTempFolder = workspace.getRoot().getFolder(new Path(project.getTechnicalLabel() + "/temp"));
        return projTempFolder;
    }
    
    private static void deleteFile(IFile file) {
        if(file != null && file.exists()) {
            try {
                file.delete(true, new NullProgressMonitor());
            } catch (CoreException e) {
                ExceptionHandler.process(e);
            }
        }
    }

    private static List<String> translatetoMVNURL(String file) {
        List<String> translatedLines = new LinkedList<>();
        final String mvnUrlSep = "/";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            List<String> readLines = IOUtils.readLines(bufferedReader);
            for (String line : readLines) {
                if (StringUtils.isBlank(line) || line.trim().startsWith("The following files")) {
                    continue;
                }

                line = line.trim().replaceAll(":", mvnUrlSep);
                String[] arr = line.split(mvnUrlSep);
                if(arr.length == 5 && "jar".equals(arr[2])) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(arr[0] + mvnUrlSep);
                    stringBuffer.append(arr[1] + mvnUrlSep);
                    stringBuffer.append(arr[3] + mvnUrlSep);
                    stringBuffer.append(arr[2]);
                    translatedLines.add("mvn:" + stringBuffer.toString());
                }
            }
        } catch (IOException e) {
            ExceptionHandler.process(e);
        }
        return translatedLines;
    }

    private static List<String> addDependencies(String jarpomfile) {
        List<String> dependencies = new LinkedList<String>();
        
        if (jarpomfile == null) {
            return dependencies;
        }

        jarpomfile = jarpomfile.replaceAll("\\\\", "/");

        File file = new File(jarpomfile);
        if (!(file.exists() && file.isFile() && file.canRead())) {
            return dependencies;
        }

        try (InputStream inputStream = new FileInputStream(new File(jarpomfile))) {
            addDependencies(inputStream, dependencies);
        } catch (IOException | CoreException e) {
            ExceptionHandler.process(e);
        }
        
        return dependencies;
    }

    private static void addDependencies(InputStream inputStream, List<String> artifacts)
            throws IOException, CoreException {
        MavenModelManager modelManager = MavenPlugin.getMavenModelManager();
        Model mavenModel = parseMavenModel(inputStream, modelManager);

        List<File> filesInLocalM2 = readFromLocalM2("pom");
        List<String> ignoreScopeList = Arrays.asList("provided", "test", "system");
        boolean ingnoreOptional = false;
        List<Dependency> dependencies = filterDependenciesWithParent(modelManager, mavenModel, filesInLocalM2, ignoreScopeList,
                ingnoreOptional);

        if (dependencies.size() > 0) {
            // read properties from mavenModel & mavenModel's ancestor
            Properties properties = new Properties();
            readProperties(modelManager, mavenModel, properties, filesInLocalM2);

            for (Dependency dep : dependencies) {
                String groupId = dep.getGroupId();
                String artifactId = dep.getArtifactId();
                String version = dep.getVersion();
                if ("${project.groupId}".equals(groupId)) {
                    dep.setGroupId(mavenModel.getGroupId());
                    if (mavenModel.getGroupId() == null) {
                        dep.setGroupId(mavenModel.getParent().getGroupId());
                    }
                    groupId = dep.getGroupId();
                } else if (isVariable(groupId)) {
                    groupId = properties.getProperty(groupId.substring(2, groupId.length() - 1));
                    dep.setGroupId(groupId);
                }
                // version
                if (version == null) {// if use value from dependencyManagement
                    version = (String) properties.get(groupId + ":" + artifactId);
                    dep.setVersion(version);
                } else if (isVariable(version)) {// read variable
                    if ("${project.version}".equals(version)) {
                        version = mavenModel.getVersion();
                        dep.setVersion(version);
                    } else {
                        version = version.substring(2, version.length() - 1);
                        version = properties.getProperty(version);
                        dep.setVersion(version);
                    }
                } else if(rangePattern(version)) {
                    String trim = version.trim();
                    String[] split = trim.split(",");
                    if(split.length == 1) {
                        version = trim.substring(1, trim.length()-1).trim();
                        dep.setVersion(version);
                    } else if(split.length == 2) {
                        if(trim.endsWith("]") && !split[1].trim().equals("]")) {
                            version = split[1].substring(0, split[1].length() - 1).trim();
                            dep.setVersion(version);
                        } else if(trim.startsWith("[") && !split[0].trim().equals("[")) {
                            version = split[0].substring(1).trim();
                            dep.setVersion(version);
                        } else {
                            version = null;
                        }
                    }
                }

                if (groupId == null || version == null) {
                    log.info("cannot parse dependency: groupID=" + dep.getGroupId() + ", artifactId=" + dep.getArtifactId()
                            + ", version=" + dep.getVersion() + ", classfier=" + dep.getClassifier());
                    continue;
                }
                
                String mvnurl = MavenUrlHelper.generateMvnUrl(groupId, artifactId, version, dep.getType(),
                        dep.getClassifier());
                artifacts.add(mvnurl);
            }
        }
    }
    
    private static boolean rangePattern(String version) {
        //dependency version is range pattern: like [v1,v2], [v1,v2), [v1,)
        String trim = version.trim();
        if((trim.startsWith("[") || trim.startsWith("(")) 
                && (version.endsWith("]") || version.endsWith(")"))) {
            return true;
        }
        return false;
    }

    private static List<File> readFromLocalM2(String... fileExtensions) {
        List<File> pomFiles = new ArrayList<File>();
        String LOCAL_M2 = MavenPlugin.getMaven().getLocalRepositoryPath();
        File m2Dir = new File(LOCAL_M2);
        if (m2Dir.exists()) {
            try {
                search(m2Dir, pomFiles, Arrays.asList(fileExtensions));
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }
        return pomFiles;
    }

    private static Model parseMavenModel(InputStream inputStream, MavenModelManager modelManager) throws IOException, CoreException {
        Model mavenModel = modelManager.readMavenModel(inputStream);
        if (mavenModel.getVersion() == null) {
            mavenModel.setVersion(mavenModel.getParent().getVersion());
        }
        if (mavenModel.getGroupId() == null) {
            mavenModel.setGroupId(mavenModel.getParent().getGroupId());
        }
        return mavenModel;
    }

    private static List<Dependency> filterDependenciesWithParent(MavenModelManager modelManager, Model mavenModel,
            List<File> pomsInLocalM2, List<String> ignoreScopeList, boolean ignoreOptional) {
        List<Dependency> result = new LinkedList<Dependency>();
        Parent parent = mavenModel.getParent();
        if (parent != null && pomsInLocalM2.size() > 0) {
            Optional<File> findFirst = pomsInLocalM2.stream()
                    .filter(pomFile -> pomFile.getName().equals(parent.getArtifactId() + "-" + parent.getVersion() + ".pom"))
                    .findFirst();
            if (findFirst.isPresent()) {
                File parentPomFile = findFirst.get();
                try (FileInputStream inputStream = new FileInputStream(parentPomFile)) {
                    Model model = parseMavenModel(inputStream, modelManager);

                    result.addAll(filterDependenciesWithParent(modelManager, model, pomsInLocalM2, ignoreScopeList,
                            ignoreOptional));
                } catch (CoreException | IOException e) {
                    ExceptionHandler.process(e);
                }
            }
        }

        // filter scope
        List<Dependency> dependencies = mavenModel.getDependencies().stream()
                .filter(d -> !ignoreScopeList.contains(d.getScope())).collect(Collectors.toList());

        // filter optional = true
        if (ignoreOptional) {
            dependencies = dependencies.stream().filter(d -> !d.isOptional()).collect(Collectors.toList());
        }
        
        //filter pom type
        dependencies = dependencies.stream().filter(d->!"pom".equals(d.getType())).collect(Collectors.toList());
                
        result.addAll(dependencies);

        return result;
    }

    private static void readProperties(MavenModelManager modelManager, Model mavenModel, Properties properties,
            List<File> pomsInLocalM2) {
        // read properties from parent, local m2
        Parent parent = mavenModel.getParent();
        if (parent != null && pomsInLocalM2.size() > 0) {
            Optional<File> findFirst = pomsInLocalM2.stream()
                    .filter(pomFile -> pomFile.getName().equals(parent.getArtifactId() + "-" + parent.getVersion() + ".pom"))
                    .findFirst();
            if (findFirst.isPresent()) {
                File parentPomFile = findFirst.get();
                try (FileInputStream inputStream = new FileInputStream(parentPomFile)) {
                    Model model = parseMavenModel(inputStream, modelManager);

                    readProperties(modelManager, model, properties, pomsInLocalM2);// read parent properties firstly
                } catch (CoreException | IOException e) {
                    ExceptionHandler.process(e);
                }
            }
        }

        Properties props = mavenModel.getProperties();
        for (Entry entry : props.entrySet()) {
            String entryVal = entry.getValue().toString();
            if (isVariable(entryVal)) {
                if (entryVal.equals("${project.version}")) {
                    entryVal = mavenModel.getVersion();
                } else {
                    Object object = props.get(entryVal.substring(2, entryVal.length() - 1));
                    if (object != null) {
                        entryVal = object.toString();
                    } else {// not found in self properties, to search in properties
                        entryVal = properties.getProperty(entryVal.substring(2, entryVal.length() - 1));
                        while (entryVal != null && isVariable(entryVal)
                                && properties.containsKey(entryVal.substring(2, entryVal.length() - 1))) {
                            entryVal = properties.getProperty(entryVal.substring(2, entryVal.length() - 1));
                        }
                    }
                }
            }

            if (entryVal == null) {
                log.info("cannot parse property value for " + entry.getValue());
            } else if (!isVariable(entryVal)) {
                properties.put(entry.getKey(), entry.getValue());
            }
        }
        // read self dependencies properties from DependencyManagement thirdly
        if (mavenModel.getDependencyManagement() != null) {
            List<Dependency> dependencies = mavenModel.getDependencyManagement().getDependencies();
            if (dependencies != null) {
                for (Dependency dep : dependencies) {
                    String version = dep.getVersion();
                    if (version != null) {
                        if (version.equals("${project.version}")) {
                            version = mavenModel.getVersion();
                        } else if (isVariable(version)) {
                            version = properties.getProperty(version.substring(2, version.length() - 1));
                            while (isVariable(version)
                                    && properties.containsKey(version.substring(2, version.length() - 1))) {
                                version = properties.getProperty(version.substring(2, version.length() - 1));
                            }
                        }
                    }

                    if (version != null && !isVariable(version)) {
                        properties.put(dep.getGroupId() + ":" + dep.getArtifactId(), version);
                    } else {
                        log.info("cannot parse version for dependency " + dep.getGroupId() + ":" + dep.getArtifactId());
                    }
                }
            }
        }
    }

    private static boolean isVariable(String value) {
        return value.startsWith("${") && value.endsWith("}");
    }

    private static boolean sameGAV(MavenArtifact artifact, Model mavenModel) {
        if (MavenConstants.DEFAULT_LIB_GROUP_ID.equals(artifact.getGroupId())) {
            return true;
        }

        boolean sameGAV = false;
        sameGAV = mavenModel.getGroupId().equals(artifact.getGroupId())
                && mavenModel.getArtifactId().equals(artifact.getArtifactId())
                && mavenModel.getVersion().equals(artifact.getVersion());

        return sameGAV;
    }

    private static void search(File dir, List<File> ret, List<String> types) throws Exception {
        File[] fs = dir.listFiles();
        for (File f : fs) {
            if (f.isDirectory()) {
                search(f, ret, types);
            } else {
                if (f.isFile()) {
                    String ext = FilenameUtils.getExtension(f.getName());
                    if (types.contains(ext)) {
                        ret.add(f);
                    }
                }
            }
        }
    }
}
