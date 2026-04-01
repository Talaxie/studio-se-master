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
package org.talend.designer.runprocess.bigdata;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.talend.commons.exception.CommonExceptionHandler;
import org.talend.commons.utils.generation.JavaUtils;
import org.talend.commons.utils.resource.FileExtensions;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.process.JobInfo;
import org.talend.core.model.process.ProcessUtils;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.runtime.maven.MavenArtifact;
import org.talend.core.runtime.maven.MavenConstants;
import org.talend.core.runtime.maven.MavenUrlHelper;
import org.talend.core.runtime.process.ITalendProcessJavaProject;
import org.talend.core.runtime.process.LastGenerationInfo;
import org.talend.core.runtime.process.TalendProcessOptionConstants;
import org.talend.core.runtime.repository.build.IMavenPomCreator;
import org.talend.core.runtime.util.ModuleAccessHelper;
import org.talend.designer.core.utils.BigDataJobUtil;
import org.talend.designer.core.utils.JavaProcessUtil;
import org.talend.designer.maven.model.TalendMavenConstants;
import org.talend.designer.maven.tools.creator.CreateMavenJobPom;
import org.talend.designer.maven.utils.PomIdsHelper;
import org.talend.designer.maven.utils.PomUtil;
import org.talend.designer.runprocess.IBigDataProcessor;
import org.talend.designer.runprocess.ProcessorConstants;
import org.talend.designer.runprocess.ProcessorException;
import org.talend.designer.runprocess.ProcessorUtilities;
import org.talend.designer.runprocess.java.JavaProcessorUtilities;
import org.talend.designer.runprocess.java.TalendJavaProjectManager;
import org.talend.designer.runprocess.maven.MavenJavaProcessor;
import org.talend.repository.ui.utils.UpdateLog4jJarUtils;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.JobScriptsManager;
import org.talend.repository.ui.wizards.exportjob.scriptsmanager.JobScriptsManager.ExportChoice;

public abstract class BigDataJavaProcessor extends MavenJavaProcessor implements IBigDataProcessor {

    private static final String DISABLE_ALIGN_LIBJARS = "disable.align.libjars";

    private static Logger log = Logger.getLogger(BigDataJavaProcessor.class);

    protected String windowsAddition, unixAddition;

    IProcess process;
    
    /**
     * DOC rdubois BigDataJavaProcessor constructor comment.
     *
     * @param process
     * @param property
     * @param filenameFromLabel
     */
    public BigDataJavaProcessor(IProcess process, Property property, boolean filenameFromLabel) {
        super(process, property, filenameFromLabel);
        this.process = process;
    }

    protected abstract JobScriptsManager createJobScriptsManager(ProcessItem processItem,
            Map<ExportChoice, Object> exportChoiceMap);

    /**
     * A Big Data job requires the PACKAGE Maven goal to be executed.
     *
     * @return true
     */
    @Override
    protected boolean requirePackaging() {
        if (this.requirePackaging == null) {
            this.requirePackaging = true;
        }
        return this.requirePackaging;
    }

    @Override
    public boolean shouldRunAsExport() {
        return false;
    }

    @Override
    protected String getLibFolderInWorkingDir() {
        // ../lib/
        String libRelativePath = ProcessorConstants.CMD_KEY_WORD_TWO_DOT + ProcessorConstants.CMD_KEY_WORD_SLASH
                + ProcessorConstants.CMD_KEY_WORD_LIB + ProcessorConstants.CMD_KEY_WORD_SLASH;

        // if linux, "$ROOT_PATH/../lib/";
        libRelativePath = getRootWorkingDir(true) + libRelativePath;
        return libRelativePath;
    }

    /**
     * This method gets the command list by the method {@link #makeUpCommandSegments()}.
     */
    @Override
    public String[] getCommandLine() throws ProcessorException {
        List<String> commandList = makeUpCommandSegments();
        return commandList.toArray(new String[commandList.size()]);
    }
    
    @Override
    public String[] getCommandLine(boolean ignoreCustomJVMSetting) throws ProcessorException {
        List<String> commandList = makeUpCommandSegments(ignoreCustomJVMSetting);
        return commandList.toArray(new String[commandList.size()]);
    }

    /**
     * <pre>
     * Makes all command segments up, like ahead commands, jvm commands, cp commands, main-class command, and others.
     * This method should be invoked by {@link #getCommandLine()}. The following is about some methods invoked by this
     * method.
     * <li>{@link #extractAheadCommandSegments()} to extract ahead command segments like "cd `dirname $0`\n".
     * <li>{@link #extractJavaCommandSegments()} to extract java command segments like "java -Xms256M ".
     * <li>{@link #extractCPCommandSegments()} to extract cp command segments like "cp ../a.jar:../b.jar..".
     * <li>{@link #extractMainClassSegments()} to extract the main-class command segment.
     * <li>{@link #extractArgumentSegments()} to extract other arguments for commands.
     * </pre>
     *
     * Added by Marvin Wang on Mar 22, 2013.
     *
     * @return
     */
    @Override
    protected List<String> makeUpCommandSegments() {
        return super.makeUpCommandSegments();
    }
    
    List<ModuleNeeded> cpNeededModules = null;

    private List<String> makeUpCommandSegments(boolean ignoreCustomJVMSetting) {
    	List<String> commands = new ArrayList<String>();
        commands.addAll(extractAheadCommandSegments());
        commands.addAll(extractJavaCommandSegments(ignoreCustomJVMSetting));
        cpNeededModules = getCPNeededModules();
        commands.addAll(extractCPCommandSegments());
        commands.add(extractMainClassSegments() == null ? "" : extractMainClassSegments()); //$NON-NLS-1$
        commands.addAll(extractArgumentSegments());
        return commands;
    }

    @Override
    public List<String> extractAheadCommandSegments() {
        if (!ProcessorUtilities.isExportConfig() && isExternalUse()) {
            return new ArrayList<>();
        }
        return super.extractAheadCommandSegments();
    }

    @Override
    public List<String> extractJavaCommandSegments() {
        return extractJavaCommandSegments(false);
    }
    
    private List<String> extractJavaCommandSegments(boolean ignoreCustomJVMSetting) {
        List<String> commandSegments = new ArrayList<>();
        String command = ProcessorConstants.CMD_KEY_WORD_JAVA;
        try {
            command = getInterpreter();
        } catch (ProcessorException e1) {
            CommonExceptionHandler.process(e1);
        }

        commandSegments.add(command);
        
        if (!ignoreCustomJVMSetting) {
            commandSegments.addAll(extractJavaVMArguments());
        }

        commandSegments.addAll(ModuleAccessHelper.getModuleAccessVMArgsForProcessor(this));

        return commandSegments;
    }

    /**
     * Extracts all JVM arguments from job or preference store. It invokes by {@link #extractJavaCommandSegments()}.
     * Added by Marvin Wang on Mar 20, 2013.
     *
     * @return
     */
    protected List<String> extractJavaVMArguments() {
        List<String> vmArgsSegments = new ArrayList<>();
        String[] vmArgs = getSettingsJVMArguments();
        vmArgsSegments.addAll(Arrays.asList(vmArgs));
        return vmArgsSegments;
    }

    @Override
    public List<String> extractCPCommandSegments() {
        List<String> cpCommandSegments = new ArrayList<>();
        cpCommandSegments.add(ProcessorConstants.CMD_KEY_WORD_CP);
        cpCommandSegments.add(makeUpClassPathString());
        return cpCommandSegments;
    }

    @Override
    public String extractMainClassSegments() {
        return super.extractMainClassSegments();
    }

    @Override
    public List<String> extractArgumentSegments() {
        // add a system property to disable align libjars . align libjars by default
        boolean disableAlignLibjars =
                Boolean.valueOf(System.getProperty(DISABLE_ALIGN_LIBJARS, Boolean.FALSE.toString()));
        List<String> list = new ArrayList<>();
        list.add(ProcessorConstants.CMD_KEY_WORD_LIBJAR);
        StringBuffer libJars = new StringBuffer();
        Set<String> libNamesUnsorted = new HashSet<>();
        Set<ModuleNeeded> moduleNeededUnsorted = new HashSet<>();
        boolean isExport = isExportConfig() || isRunAsExport();
        if (process instanceof IProcess2) {
            if (isExport) {
                // In an export mode, all the dependencies and the routines/beans/udfs are packaged in the lib folder.
                libNamesUnsorted = JavaProcessorUtilities.extractLibNamesOnlyForMapperAndReducer(this);
            } else {
                // In the local mode, all the dependencies are packaged in the lib folder. The routines/beans/udfs are
                // not.
                // We will
                // handle them separetely.
                libNamesUnsorted = JavaProcessorUtilities
                        .extractLibNamesOnlyForMapperAndReducerWithoutRoutines((IProcess2) process);
            }
            // prepare a -libjars moduleNeeded list to check
            if (!disableAlignLibjars) {
                moduleNeededUnsorted =
                        JavaProcessorUtilities.extractNeededModulesOnlyForMapperAndReducerWithoutRoutines(this);
            }
        }
        Set<ModuleNeeded> modulesNeeded = LastGenerationInfo.getInstance().getModulesNeededWithSubjobPerJob(process.getId(),
                process.getVersion());
        modulesNeeded.addAll(
                LastGenerationInfo.getInstance().getCodesJarModulesNeededWithSubjobPerJob(process.getId(), process.getVersion()));
        Set<ModuleNeeded> highPriorityModuleNeeded = LastGenerationInfo.getInstance().getHighPriorityModuleNeeded(process.getId(),
                process.getVersion());
        Set<String> allNeededLibsAfterAdjuster = new HashSet<String>();
        for (ModuleNeeded module : modulesNeeded) {
            allNeededLibsAfterAdjuster.add(MavenUrlHelper.generateModuleNameByMavenURI(module.getMavenUri()));
        }

        List<String> libNames = new ArrayList<>();
        libNames.addAll(libNamesUnsorted);
        Iterator<String> it = libNames.iterator();
        while (it.hasNext()) {
            String jarName = it.next();
            if (!allNeededLibsAfterAdjuster.contains(jarName) && !JavaUtils.ROUTINES_JAR.equals(jarName)
                    && !JavaUtils.BEANS_JAR.equals(jarName) && !JavaUtils.PIGUDFS_JAR.equals(jarName)) {
                it.remove();
            }
        }
        if (!disableAlignLibjars) {
            Iterator<ModuleNeeded> iterator = moduleNeededUnsorted.iterator();
            while (iterator.hasNext()) {
                ModuleNeeded mn = iterator.next();
                String jarName = MavenUrlHelper.generateModuleNameByMavenURI(mn.getMavenUri());
                if (!allNeededLibsAfterAdjuster.contains(jarName) && !JavaUtils.ROUTINES_JAR.equals(jarName)
                        && !JavaUtils.BEANS_JAR.equals(jarName) && !JavaUtils.PIGUDFS_JAR.equals(jarName)) {
                    iterator.remove();
                }
            }
            alignLibJarWithClasspath(cpNeededModules, moduleNeededUnsorted, libNames, highPriorityModuleNeeded);
        }
        UpdateLog4jJarUtils.sortClassPath4log4j(highPriorityModuleNeeded, libNames);

        File libDir = JavaProcessorUtilities.getJavaProjectLibFolder();

        String libFolder = ""; //$NON-NLS-1$
        if (libDir != null) {
            libFolder = new Path(libDir.getAbsolutePath()).toPortableString();
        }
        // We iterate over the depencendies, and for each of them, we get its path and append it to the libjars
        // StringBuffer.
        boolean needAllLibJars = true;
        if (needsShade()) {
            BigDataJobUtil bdUtil = new BigDataJobUtil(process);
            if (bdUtil.isMRWithHDInsight()) {
                needAllLibJars = false;
            }
        }
        if (libNames != null && libNames.size() > 0 && needAllLibJars) {
            Iterator<String> itLibNames = libNames.iterator();
            while (itLibNames.hasNext()) {
                if (isExport) {
                    // In an export mode, the path is relative to the working directory.
                    libJars.append(getLibFolderInWorkingDir() + itLibNames.next()).append(',');
                } else {
                    // In a local mode, the path is absolute.
                    libJars.append(libFolder + "/" + itLibNames.next()).append(','); //$NON-NLS-1$
                }
            }
        }
        if (isExport) {
            // In an export mode, we add the job jar which is located in the current working directory
            libJars.append("./" + makeupJobJarName()); //$NON-NLS-1$
            // to fix TBD-13419, need to add the subjob jar name to the -libjars parameter
            libJars.append(makeupSubjobJarNameStr4Export()); //$NON-NLS-1$
            if (!needAllLibJars) {
                // to avoid issue TPSVC-4826
                libJars.append(","); //$NON-NLS-1$
            }
        } else {
            if (needAllLibJars) {
                libJars.append(getCodesClassPath(ERepositoryObjectType.ROUTINES));
                if (ProcessUtils.isRequiredBeans(process)) {
                    libJars.append(getCodesClassPath(ERepositoryObjectType.BEANS));
                }
                getCodesJarClassPaths(getProperty().getItem()).forEach(s -> libJars.append(s).append(",")); //$NON-NLS-1$
            }

            // ... and add the jar of the job itself also located in the target directory/
            libJars.append(getTalendJavaProject().getTargetFolder().getLocation().toPortableString() + "/" + makeupJobJarName()); //$NON-NLS-1$
            // to fix TBD-13419, need to add the subjob jar name to the -libjars parameter
            libJars.append(makeupSubjobJarNameStr4Local());
        }
        list.add(libJars.toString());
        return list;
    }

    public void alignLibJarWithClasspath(List<ModuleNeeded> classPathNeededModules,
            Set<ModuleNeeded> libJarModuleNeeded, List<String> libNames, Set<ModuleNeeded> highPriorityModuleNeeded) {
        // align classpath version to libjar for same artifact
        Set<String> toBeRemoveSet = new HashSet<String>();
        Set<String> toBeAddSet = new HashSet<String>();
        Iterator<ModuleNeeded> libJarIter = libJarModuleNeeded.iterator();
        while (libJarIter.hasNext()) {
            ModuleNeeded module = libJarIter.next();
            if (highPriorityModuleNeeded.contains(module)) {
                continue;
            }
            MavenArtifact artifact = MavenUrlHelper.parseMvnUrl(module.getMavenUri(), true);
            String key = getModuleKey(artifact);
            if (key != null) {
                Iterator<ModuleNeeded> cpIter = classPathNeededModules.iterator();
                while (cpIter.hasNext()) {
                    ModuleNeeded cp = cpIter.next();
                    if (highPriorityModuleNeeded.contains(cp)) {
                        continue;
                    }
                    MavenArtifact cpArtifact = MavenUrlHelper.parseMvnUrl(cp.getMavenUri(), true);
                    String cpKey = getModuleKey(cpArtifact);
                    if (key.equals(cpKey)) {
                        // same group/artifact id but different version
                        if (MavenArtifact.compareVersion(artifact.getVersion(), cpArtifact.getVersion()) != 0) {
                            String removeName = MavenUrlHelper.generateModuleNameByMavenURI(module.getMavenUri());
                            String addName = MavenUrlHelper.generateModuleNameByMavenURI(cp.getMavenUri());
                            toBeRemoveSet.add(removeName);
                            toBeAddSet.add(addName);
                            log.info("replace -jarlibs [ " + removeName + " ] with [ " + addName + " ]");
                            break;
                        }
                    }
                }
            }
        }
        libNames.removeAll(toBeRemoveSet);
        libNames.addAll(toBeAddSet);
    }

    private String getModuleKey(MavenArtifact artifact) {
        if (artifact == null) {
            return null;
        }
        String key = artifact.getGroupId() + ":" + artifact.getArtifactId();
        if (artifact.getType() != null) {
            key = key + ":" + artifact.getType();
        }
        if (artifact.getClassifier() != null) {
            key = key + ":" + artifact.getClassifier();
        }
        return key;
    }

    private String getCodesClassPath(ERepositoryObjectType type) {
        String jarName;
        String baseName;
        String artifactId;
        if (ERepositoryObjectType.ROUTINES == type) {
            jarName = JavaUtils.ROUTINE_JAR_NAME;
            baseName = TalendMavenConstants.DEFAULT_CODE;
            artifactId = TalendMavenConstants.DEFAULT_ROUTINES_ARTIFACT_ID;
        } else {
            jarName = JavaUtils.BEANS_JAR_NAME;
            baseName = TalendMavenConstants.DEFAULT_BEAN;
            artifactId = TalendMavenConstants.DEFAULT_BEANS_ARTIFACT_ID;
        }
        // In a local mode, get routines/beans jars in the target directory.
        ITalendProcessJavaProject routineProject = TalendJavaProjectManager.getTalendCodeJavaProject(type);
        IFile routinesJar = routineProject.getTargetFolder()
                .getFile(jarName + "-" + PomUtil.getDefaultMavenVersion() + FileExtensions.JAR_FILE_SUFFIX); //$NON-NLS-1$
        if (routinesJar.exists()) {
            return routinesJar.getLocation().toPortableString() + ","; //$NON-NLS-1$
        }
        // get jar from m2
        MavenArtifact artifact = new MavenArtifact();
        artifact.setGroupId(PomIdsHelper.getCodesGroupId(baseName));
        artifact.setArtifactId(artifactId);
        artifact.setVersion(PomIdsHelper.getCodesVersion());
        artifact.setType(MavenConstants.TYPE_JAR);
        return PomUtil.getArtifactFullPath(artifact) + ","; //$NON-NLS-1$
    }

    /**
     * Makes up the subjob(s) jar name string for local, that should be like: 
     * 1) "" (no subjobs) 
     * 2) ",<project_folder>/poms/jobs/process/<subjob_name_versiono>/target/<subjob_name_versiono>.jar" (standard subjob) 
     * 3) ",<project_folder>/poms/jobs/process_mr/<subjob_name_version>/target/<subjob_name_versiono>.jar" (spark subjob)
     *
     * @return
     */
    protected String makeupSubjobJarNameStr4Local() {
        String subjobJarNameStr = ""; //$NON-NLS-1$
        Set<JobInfo> jobInfos = getBuildChildrenJobs();
        if (!jobInfos.isEmpty()) {
            Iterator<JobInfo> it = jobInfos.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = it.next();
                subjobJarNameStr += "," //$NON-NLS-1$
                        + TalendJavaProjectManager.getTalendJobJavaProject(jobInfo.getProcessItem().getProperty())
                                .getTargetFolder()
                                .getLocation()
                                .toPortableString()
                        + "/" + jobInfo.getJobName().toLowerCase() + "_" + jobInfo.getJobVersion().replace(".", "_") //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                        + ".jar"; //$NON-NLS-1$
            }
        }
        return subjobJarNameStr;
    }

	/**
	 * Makes up the subjob(s) jar name string for export, that should be like: 
	 * 1) "" (no subjobs) 
	 * 2) ",./subjob1_0_1.jar" (with subjobs) 
	 *
	 * @return
	 */
    protected String makeupSubjobJarNameStr4Export() {
        String subjobJarNameStr = ""; //$NON-NLS-1$
        Set<JobInfo> jobInfos = getBuildChildrenJobs();
        if (!jobInfos.isEmpty()) {
            Iterator<JobInfo> it = jobInfos.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = it.next();
                subjobJarNameStr += ",./" + jobInfo.getJobName().toLowerCase() + "_" + jobInfo.getJobVersion().replace(".", "_") + ".jar"; //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
            }
        }
        return subjobJarNameStr;
    }

	protected String makeUpClassPathString() {
        StringBuffer sb = new StringBuffer();
        try {
            sb.append(getLibsClasspath(cpNeededModules));
        } catch (ProcessorException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * Returns all libs required by classpath, refer to this method {@link #extractCPCommandSegments()}. Added by Marvin
     * Wang on Mar 20, 2013.
     *
     * @return
     */
    protected Set<String> extractAllLibs() {
        Set<String> libsRequiredByJob = new HashSet<>();
        Set<ModuleNeeded> neededModules = JavaProcessorUtilities.getNeededModulesForProcess(process);
        neededModules.addAll(getCodesJarModulesNeededOfJoblets());
        if (!ProcessorUtilities.isExportConfig()) {
//            JavaProcessorUtilities.addLog4jToModuleList(neededModules, process);
        }
        JavaProcessorUtilities.checkJavaProjectLib(neededModules);

        for (ModuleNeeded neededModule : neededModules) {
            libsRequiredByJob.add(neededModule.getModuleName());
        }
        libsRequiredByJob.addAll(JavaProcessUtil.getCodesExportJars(this));
        return libsRequiredByJob;
    }

    /**
     * Makes up a job jar name that should be like "Test-0.1.jar" or "Test.jar". Added by Marvin Wang on Mar 21, 2013.
     *
     * @return
     */
    protected String makeupJobJarName() {
        String version = process.getVersion();
        String jobJarName = process.getName().toLowerCase() + "_" + version.replace(".", "_") + ".jar"; //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$ //$NON-NLS-4$
        return jobJarName;
    }

    @Override
    protected void setValuesFromCommandline(String tp, String[] cmds) {
        super.setValuesFromCommandline(tp, cmds);

        String libJarStr = null;
        int libJarIndex = ArrayUtils.indexOf(cmds, ProcessorConstants.CMD_KEY_WORD_LIBJAR);
        if (libJarIndex > -1) { // found
            // return the cp values in the next index.
            libJarStr = cmds[libJarIndex + 1];
        }
        if (Platform.OS_WIN32.equals(tp)) {
            this.windowsAddition = libJarStr;
        } else {
            String oldTargetPlatform = this.getTargetPlatform();
            try {
                // because the cmds are from another processor, so must set the target platform same.
                setTargetPlatform(tp);
                // reuse the same api
                String unixRootPath = getRootWorkingDir(true);
                if (libJarStr != null) {
                    this.unixAddition = libJarStr.replace(unixRootPath, ""); // remove the Path root //$NON-NLS-1$
                                                                             // string
                }
            } finally {
                setTargetPlatform(oldTargetPlatform);
            }
        }
    }

    @Override
    protected IMavenPomCreator createMavenPomCreator() {
        IMavenPomCreator createMavenTemplatePom = super.createMavenPomCreator();
        if (createMavenTemplatePom instanceof CreateMavenJobPom) {
            CreateMavenJobPom createMavenJobPom = (CreateMavenJobPom) createMavenTemplatePom;

            if (!StringUtils.isBlank(this.windowsAddition)) {
                String windowsScriptAddition = createMavenJobPom.getWindowsScriptAddition();
                if (windowsScriptAddition != null && windowsScriptAddition.length() > 0) {
                    windowsScriptAddition += ' '; // add one space to separate existed additions.
                } else {
                    windowsScriptAddition = ""; //$NON-NLS-1$
                }
                windowsScriptAddition += ProcessorConstants.CMD_KEY_WORD_LIBJAR + ' ' + this.windowsAddition;
                createMavenJobPom.setWindowsScriptAddition(windowsScriptAddition);
            }
            if (!StringUtils.isBlank(this.unixAddition)) {
                String unixScriptAddition = createMavenJobPom.getUnixScriptAddition();
                if (unixScriptAddition != null && unixScriptAddition.length() > 0) {
                    unixScriptAddition += ' '; // add one space to separate existed additions.
                } else {
                    unixScriptAddition = ""; //$NON-NLS-1$
                }
                unixScriptAddition += ProcessorConstants.CMD_KEY_WORD_LIBJAR + ' ' + this.unixAddition;
                createMavenJobPom.setUnixCcriptAddition(unixScriptAddition);
            }
        }
        return createMavenTemplatePom;
    }

    @Override
    public void cleanBeforeGenerate(int options) throws ProcessorException {
        super.cleanBeforeGenerate(options);
        if (needDoClean() && this.getProcess() instanceof IProcess2) {
            // need re-generate the "getGeneratingNodes" to make sure generate the record struct
            // (IRecordStructGenerator) again.
            ((IProcess2) this.getProcess()).setProcessModified(true);
        }
    }

    @Override
    protected String[] checkExecutingCommands(String path, String[] cmds) {
        String[] checkedcmds = super.checkExecutingCommands(path, cmds);
        // also, need check the "-libjars" for BD jobs.
        return checkExecutingCommandsForRootPath(path, checkedcmds, ProcessorConstants.CMD_KEY_WORD_LIBJAR);
    }

    private Boolean needsShade;

    /*
     * (non-Javadoc)
     *
     * @see org.talend.designer.runprocess.IBigDataProcessor#needsShade()
     */
    @Override
    public boolean needsShade() {
        if (needsShade == null && property != null) {
            needsShade = new BigDataJobUtil(process).needsShade();
        }
        return needsShade;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.designer.runprocess.IBigDataProcessor#getShadedModules()
     */
    @Override
    public Set<ModuleNeeded> getShadedModulesExclude() {
        Set<ModuleNeeded> modulesNeeded = LastGenerationInfo.getInstance().getModulesNeededPerJob(getProcess().getId(),
                getProcess().getVersion());
        modulesNeeded.addAll(
                LastGenerationInfo.getInstance().getCodesJarModulesNeededPerJob(getProcess().getId(), getProcess().getVersion()));
        if (modulesNeeded.isEmpty()) {
            modulesNeeded = getNeededModules(TalendProcessOptionConstants.MODULES_DEFAULT);
            LastGenerationInfo.getInstance().setModulesNeededPerJob(getProcess().getId(), getProcess().getVersion(),
                    modulesNeeded);
            modulesNeeded.addAll(getCodesJarModulesNeededOfJoblets());
        }

        return new BigDataJobUtil(getProcess()).getShadedModulesExclude(modulesNeeded);
    }

}
