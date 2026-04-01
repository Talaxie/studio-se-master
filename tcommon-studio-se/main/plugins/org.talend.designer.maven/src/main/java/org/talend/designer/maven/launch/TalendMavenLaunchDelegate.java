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
package org.talend.designer.maven.launch;

import static org.eclipse.m2e.internal.launch.MavenLaunchUtils.quote;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.maven.artifact.versioning.DefaultArtifactVersion;
import org.apache.maven.artifact.versioning.InvalidVersionSpecificationException;
import org.apache.maven.artifact.versioning.VersionRange;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.RefreshUtil;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaLaunchDelegate;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.m2e.actions.MavenLaunchConstants;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.IMavenConfiguration;
import org.eclipse.m2e.core.internal.IMavenConstants;
import org.eclipse.m2e.core.internal.launch.AbstractMavenRuntime;
import org.eclipse.m2e.internal.launch.LaunchingUtils;
import org.eclipse.m2e.internal.launch.MavenLaunchExtensionsSupport;
import org.eclipse.m2e.internal.launch.MavenLaunchUtils;
import org.eclipse.m2e.internal.launch.MavenRuntimeLaunchSupport;
import org.eclipse.m2e.internal.launch.MavenRuntimeLaunchSupport.VMArguments;
import org.eclipse.osgi.util.NLS;
import org.talend.commons.CommonsPlugin;
import org.talend.core.prefs.SecurityPreferenceConstants;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.core.service.IRemoteService;
import org.talend.utils.security.StudioEncryption;

/**
 * Copied from MavenLaunchDelegate
 * 
 */
public class TalendMavenLaunchDelegate extends JavaLaunchDelegate implements MavenLaunchConstants {

    static final Logger log = Logger.getLogger(TalendMavenLaunchDelegate.class);

    private static final String LAUNCHER_TYPE = "org.codehaus.classworlds.Launcher"; //$NON-NLS-1$

    // classworlds 2.0
    private static final String LAUNCHER_TYPE3 = "org.codehaus.plexus.classworlds.launcher.Launcher"; //$NON-NLS-1$

    private static final VersionRange MAVEN_33PLUS_RUNTIMES;

    /*
     * FIXME, enable refresh in main thread, so set false for bug TUP-2987.
     */
    public static final boolean FLAG_REFRESH_BACKGROUND = false;

    private final static String[] hidePasswordKeys = { SecurityPreferenceConstants.SIGNER_KEYSTORE_PASSWORD,
            SecurityPreferenceConstants.SIGNER_KEY_PASSWORD };

    static {
        VersionRange mvn33PlusRange;
        try {
            mvn33PlusRange = VersionRange.createFromVersionSpec("[3.3,)");
        } catch (InvalidVersionSpecificationException O_o) {
            mvn33PlusRange = null;
        }
        MAVEN_33PLUS_RUNTIMES = mvn33PlusRange;
    }

    private ILaunch launch;

    private IProgressMonitor monitor;

    private String programArguments;

    private MavenRuntimeLaunchSupport launchSupport;

    private MavenLaunchExtensionsSupport extensionsSupport;

    public TalendMavenLaunchDelegate() {
        allowAdvancedSourcelookup();
    }

    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
            throws CoreException {
        this.launch = launch;
        this.monitor = monitor;
        this.programArguments = null;

        try {
        	
            this.launchSupport = MavenRuntimeLaunchSupport.create(configuration, monitor);
            this.extensionsSupport = MavenLaunchExtensionsSupport.create(configuration, launch);

            log.info("" + getWorkingDirectory(configuration)); //$NON-NLS-1$
            log.info(" mvn" + getProgramArguments(configuration, IRemoteService.get() == null ? false: IRemoteService.get().isCloudConnection())); //$NON-NLS-1$
            this.programArguments = null;

            extensionsSupport.configureSourceLookup(configuration, launch, monitor);

            super.launch(configuration, mode, launch, monitor);
        } finally {
            this.launch = null;
            this.monitor = null;
            this.launchSupport = null;
            this.extensionsSupport = null;
        }
    }

    public IVMRunner getVMRunner(final ILaunchConfiguration configuration, String mode) throws CoreException {
        if (FLAG_REFRESH_BACKGROUND) {
            return super.getVMRunner(configuration, mode);
        } else {
            /*
             * copied from AbstractJavaLaunchConfigurationDelegate.getVMRunner
             */
            IVMInstall vm = verifyVMInstall(configuration);
            final IVMRunner runner = vm.getVMRunner(mode);
            if (runner == null) {
                abort(NLS.bind(
                        org.eclipse.jdt.internal.launching.LaunchingMessages.JavaLocalApplicationLaunchConfigurationDelegate_0,
                        new String[] { vm.getName(), mode }), null,
                        IJavaLaunchConfigurationConstants.ERR_VM_RUNNER_DOES_NOT_EXIST);
            }
            /*
             * copied from MavenRuntimeLaunchSupport.decorateVMRunner
             */
            return new IVMRunner() {

                public void run(VMRunnerConfiguration runnerConfiguration, ILaunch launch, IProgressMonitor monitor)
                        throws CoreException {
                    runner.run(runnerConfiguration, launch, monitor);

                    IProcess[] processes = launch.getProcesses();
                    if (processes != null && processes.length > 0) {
                        ILaunchConfiguration configuration = launch.getLaunchConfiguration();
                        /*
                         * FIXME, 1, do refresh in main thread(Foreground). 2, refresh without GUI(Debug UI, Workbench
                         * or such.)
                         */

                        // BackgroundResourceRefresher refresher = new BackgroundResourceRefresher(configuration,
                        // launch);
                        // refresher.init();

                        ForegroundResourceRefresher refresher = new ForegroundResourceRefresher(configuration, launch);
                        refresher.init();
                    } else {
                        // MavenRuntimeLaunchSupport.removeTempFiles(launch);
                    }
                }
            };
        }
    }

    public String getMainTypeName(ILaunchConfiguration configuration) {
        return launchSupport.getVersion().startsWith("3.") ? LAUNCHER_TYPE3 : LAUNCHER_TYPE; //$NON-NLS-1$
    }

    public String[] getClasspath(ILaunchConfiguration configuration) {
        List<String> cp = launchSupport.getBootClasspath();
        return cp.toArray(new String[cp.size()]);
    }

    public String[][] getClasspathAndModulepath(ILaunchConfiguration configuration) {
        String[][] paths = new String[2][];
        paths[0] = getClasspath(configuration);
        return paths;
    }

    @SuppressWarnings("restriction")
    public String getVMArguments(ILaunchConfiguration configuration) throws CoreException {
        VMArguments arguments = launchSupport.getVMArguments();

        AbstractMavenRuntime runtime = MavenLaunchUtils.getMavenRuntime(configuration);
        appendRuntimeSpecificArguments(runtime.getVersion(), arguments, configuration);

        extensionsSupport.appendVMArguments(arguments, configuration, launch, monitor);

        // user configured entries
        arguments.append(super.getVMArguments(configuration));

        return arguments.toString();
    }

    protected String getGoals(ILaunchConfiguration configuration) throws CoreException {
        return configuration.getAttribute(MavenLaunchConstants.ATTR_GOALS, ""); //$NON-NLS-1$
    }

    public boolean buildForLaunch(ILaunchConfiguration configuration, String mode, IProgressMonitor monitor) {
        return false;
    }

    /**
     * Construct string with properties to pass to JVM as system properties
     */
    private void getProperties(StringBuilder sb, ILaunchConfiguration configuration) throws CoreException {

        try {
            List<String> properties = configuration.getAttribute(ATTR_PROPERTIES, Collections.emptyList());
            for (String property : properties) {
                int n = property.indexOf('=');
                String name = property;
                String value = null;

                if (n > -1) {
                    name = property.substring(0, n);
                    if (n > 1) {
                        value = LaunchingUtils.substituteVar(property.substring(n + 1));
                    }
                }

                sb.append(" -D").append(name); //$NON-NLS-1$
                if (value != null) {
                    sb.append('=').append(quote(value));
                }
            }
        } catch (CoreException e) {
            String msg = "Exception while getting configuration attribute " + ATTR_PROPERTIES;
            log.error(msg, e);
            throw e;
        }

        try {
            String profiles = configuration.getAttribute(ATTR_PROFILES, (String) null);
            if (profiles != null && profiles.trim().length() > 0) {
                sb.append(" -P").append(profiles.replaceAll("\\s+", ",")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            }
        } catch (CoreException ex) {
            String msg = "Exception while getting configuration attribute " + ATTR_PROFILES;
            log.error(msg, ex);
            throw ex;
        }
    }

    /**
     * Construct string with preferences to pass to JVM as system properties
     */
    private void getPreferences(StringBuilder sb, ILaunchConfiguration configuration, String goals) throws CoreException {
        IMavenConfiguration mavenConfiguration = MavenPlugin.getMavenConfiguration();

        sb.append(" -B"); //$NON-NLS-1$

        if (configuration.getAttribute(MavenLaunchConstants.ATTR_DEBUG_OUTPUT, mavenConfiguration.isDebugOutput())) {
            sb.append(" -X").append(" -e"); //$NON-NLS-1$ //$NON-NLS-2$
        }
        // sb.append(" -D").append(MavenPreferenceConstants.P_DEBUG_OUTPUT).append("=").append(debugOutput);

        if (configuration.getAttribute(MavenLaunchConstants.ATTR_OFFLINE, mavenConfiguration.isOffline())) {
            sb.append(" -o"); //$NON-NLS-1$
        }
        // sb.append(" -D").append(MavenPreferenceConstants.P_OFFLINE).append("=").append(offline);

        if (configuration.getAttribute(MavenLaunchConstants.ATTR_UPDATE_SNAPSHOTS, false)) {
            sb.append(" -U"); //$NON-NLS-1$
        }

        if (configuration.getAttribute(MavenLaunchConstants.ATTR_NON_RECURSIVE, false)) {
            sb.append(" -N"); //$NON-NLS-1$
        }

        if (configuration.getAttribute(MavenLaunchConstants.ATTR_SKIP_TESTS, false)) {
            sb.append(" -Dmaven.test.skip=true -DskipTests"); //$NON-NLS-1$
        }

        int threads = configuration.getAttribute(MavenLaunchConstants.ATTR_THREADS, 1);
        if (threads > 1) {
            sb.append(" --threads ").append(threads);
        }

        if (!goals.contains("-gs ")) { //$NON-NLS-1$
            String globalSettings = launchSupport.getSettings();
            if (globalSettings != null && !globalSettings.trim().isEmpty() && !new File(globalSettings.trim()).exists()) {
                globalSettings = null;
            }
            if (globalSettings != null && !globalSettings.trim().isEmpty()) {
                sb.append(" -gs ").append(quote(globalSettings)); //$NON-NLS-1$
            }
        }

        String settings = configuration.getAttribute(MavenLaunchConstants.ATTR_USER_SETTINGS, (String) null);
        settings = LaunchingUtils.substituteVar(settings);
        if (settings == null || settings.trim().isEmpty()) {
            settings = mavenConfiguration.getUserSettingsFile();
            if (settings != null && !settings.trim().isEmpty() && !new File(settings.trim()).exists()) {
                settings = null;
            }
        }
        if (settings != null && !settings.trim().isEmpty()) {
            sb.append(" -s ").append(quote(settings)); //$NON-NLS-1$
        }

        // boolean b = preferenceStore.getBoolean(MavenPreferenceConstants.P_CHECK_LATEST_PLUGIN_VERSION);
        // sb.append(" -D").append(MavenPreferenceConstants.P_CHECK_LATEST_PLUGIN_VERSION).append("=").append(b);

        // b = preferenceStore.getBoolean(MavenPreferenceConstants.P_UPDATE_SNAPSHOTS);
        // sb.append(" -D").append(MavenPreferenceConstants.P_UPDATE_SNAPSHOTS).append("=").append(b);

        // String s = preferenceStore.getString(MavenPreferenceConstants.P_GLOBAL_CHECKSUM_POLICY);
        // if(s != null && s.trim().length() > 0) {
        // sb.append(" -D").append(MavenPreferenceConstants.P_GLOBAL_CHECKSUM_POLICY).append("=").append(s);
        // }
    }

    /**
     * Not API. Made public for testing purposes.
     */
    public void appendRuntimeSpecificArguments(String runtimeVersion, VMArguments arguments, ILaunchConfiguration configuration)
            throws CoreException {
        if (applies(runtimeVersion)) {
            getArgsFromMvnDir(arguments, configuration);
        }
    }

    @SuppressWarnings("restriction")
    private void getArgsFromMvnDir(VMArguments arguments, ILaunchConfiguration configuration) throws CoreException {
        String pomDir = LaunchingUtils.substituteVar(configuration.getAttribute(MavenLaunchConstants.ATTR_POM_DIR, ""));
        if (pomDir.isEmpty()) {
            return;
        }
        File baseDir = findMavenProjectBasedir(new File(pomDir));
        File mvnDir = new File(baseDir, ".mvn");
        File jvmConfig = new File(mvnDir, "jvm.config");
        if (jvmConfig.isFile()) {
            try {
                for (String line : Files.readAllLines(jvmConfig.toPath(), StandardCharsets.UTF_8)) {
                    arguments.append(line);
                }
            } catch (IOException ex) {
                IStatus error = new Status(IStatus.ERROR, IMavenConstants.PLUGIN_ID,
                        NLS.bind(org.eclipse.m2e.internal.launch.Messages.MavenLaunchDelegate_error_cannot_read_jvmConfig,
                                jvmConfig.getAbsolutePath()),
                        ex);
                throw new CoreException(error);
            }
        }
        arguments.appendProperty("maven.multiModuleProjectDirectory", MavenLaunchUtils.quote(baseDir.getAbsolutePath()));
    }

    // This will likely move to core when we need it
    private File findMavenProjectBasedir(File dir) {
        File folder = dir;
        // loop upwards but stop if root
        while (folder != null && folder.getParentFile() != null) {
            // see if /.mvn exists
            if (new File(folder, ".mvn").isDirectory()) {
                return folder;
            }
            folder = folder.getParentFile();
        }
        return dir;
    }

    private boolean applies(String runtimeVersion) {
        return MAVEN_33PLUS_RUNTIMES.containsVersion(new DefaultArtifactVersion(runtimeVersion));
    }

    @Override
    public String getProgramArguments(ILaunchConfiguration configuration) throws CoreException {
        return getProgramArguments(configuration, false);
    }

    public String getProgramArguments(ILaunchConfiguration configuration, boolean isHidePassword) throws CoreException {
        if (programArguments == null) {
            String goals = getGoals(configuration);

            StringBuilder sb = new StringBuilder();
            getProperties(sb, configuration);
            getPreferences(sb, configuration, goals);
            sb.append(" ").append(goals);

            extensionsSupport.appendProgramArguments(sb, configuration, launch, monitor);

            programArguments = sb.toString();
            String arguments = getAttrProgramArguments(configuration, isHidePassword);
            if (StringUtils.isNotEmpty(arguments)) {
                programArguments += " " + arguments; //$NON-NLS-1$
            }
        }
        return programArguments;
    }

    public String getAttrProgramArguments(ILaunchConfiguration configuration, boolean isHidePassword) throws CoreException {
        String arguments = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, ""); //$NON-NLS-1$
        if (isHidePassword && StringUtils.isNotBlank(arguments)) {
            IPreferenceStore preStore = CoreRuntimePlugin.getInstance().getCoreService().getPreferenceStore();
            for (String key : hidePasswordKeys) {
                if (arguments.contains(key)) {
                    String value = preStore.getString(key);
                    if (StringUtils.isNotBlank(value)) {
                        value = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).decrypt(value);
                        String oldArgument = "-D" + key + "=" + value;//$NON-NLS-1$//$NON-NLS-2$
                        String newArgument = "-D" + key + "=******";//$NON-NLS-1$//$NON-NLS-2$
                        if (arguments.contains(oldArgument)) {
                            arguments = arguments.replace(oldArgument, newArgument);
                        }
                    }
                }
            }
        }
        return arguments;
    }

}

/**
 *
 * DOC ggu class global comment. Detailled comment
 */
class ForegroundResourceRefresher implements IDebugEventSetListener {

    final ILaunchConfiguration configuration;

    final IProcess process;

    final ILaunch launch;

    public ForegroundResourceRefresher(ILaunchConfiguration configuration, ILaunch launch) {
        this.configuration = configuration;
        this.process = launch.getProcesses()[0];
        this.launch = launch;
    }

    /**
     * If the process has already terminated, resource refreshing is done immediately in the current thread. Otherwise,
     * refreshing is done when the process terminates.
     */
    public void init() {
        synchronized (process) {
            if (process.isTerminated()) {
                processResources();
            } else {
                DebugPlugin.getDefault().addDebugEventListener(this);
            }
        }
    }

    public void handleDebugEvents(DebugEvent[] events) {
        for (DebugEvent event : events) {
            if (event.getSource() == process && event.getKind() == DebugEvent.TERMINATE) {
                DebugPlugin.getDefault().removeDebugEventListener(this);
                processResources();
                break;
            }
        }
    }

    @SuppressWarnings("restriction")
    protected void processResources() {
        IProgressMonitor monitor = new NullProgressMonitor();

        // MavenRuntimeLaunchSupport.removeTempFiles(launch);

        if (CommonsPlugin.isHeadless() || !CommonsPlugin.isWorkbenchCreated()) { // no used for commandline to refresh.
            return;
        }
        try {

            /*
             * FIXME, replace to use non-UI API, and refresh the project directly.
             */

            // RefreshTab.refreshResources(configuration, monitor);

            boolean refreshed = false;
            String projectName = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, (String) null);
            String refreshScope = configuration.getAttribute(RefreshUtil.ATTR_REFRESH_SCOPE, (String) null);
            // refresh project
            if (projectName != null && refreshScope != null && RefreshUtil.MEMENTO_SELECTED_PROJECT.equals(refreshScope)) {
                IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
                if (project.exists()) {
                    int depth = RefreshUtil.isRefreshRecursive(configuration) ? IResource.DEPTH_INFINITE : IResource.DEPTH_ONE;
                    RefreshUtil.refreshResources(new IResource[] { project }, depth, monitor);
                    refreshed = true;
                }
            }
            if (!refreshed) {
                // will call the "${selected_resource_path}" with SelectedResourceResolver(SelectedResourceManager) for
                // DebugUIPlugin still.
                RefreshUtil.refreshResources(configuration, monitor);
            }
        } catch (CoreException e) {
            TalendMavenLaunchDelegate.log.error(e.getMessage(), e);
        }

    }
}
