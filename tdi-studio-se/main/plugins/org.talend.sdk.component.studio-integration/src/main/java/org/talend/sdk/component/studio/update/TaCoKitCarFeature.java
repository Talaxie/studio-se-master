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
package org.talend.sdk.component.studio.update;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.m2e.core.MavenPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.runtime.service.ITaCoKitService;
import org.talend.commons.utils.resource.FileExtensions;
import org.talend.commons.utils.system.EclipseCommandLine;
import org.talend.core.runtime.maven.MavenUrlHelper;
import org.talend.core.runtime.projectsetting.IProjectSettingTemplateConstants;
import org.talend.sdk.component.studio.i18n.Messages;
import org.talend.sdk.component.studio.util.TaCoKitConst;
import org.talend.sdk.component.studio.util.TaCoKitUtil;
import org.talend.sdk.component.studio.util.TaCoKitUtil.GAV;
import org.talend.updates.runtime.feature.model.Category;
import org.talend.updates.runtime.feature.model.Type;
import org.talend.updates.runtime.model.AbstractExtraFeature;
import org.talend.updates.runtime.model.ExtraFeatureException;
import org.talend.updates.runtime.model.InstallationStatus;
import org.talend.updates.runtime.model.UpdateSiteLocationType;
import org.talend.updates.runtime.model.interfaces.ITaCoKitCarFeature;
import org.talend.updates.runtime.nexus.component.ComponentIndexBean;
import org.talend.updates.runtime.storage.AbstractFeatureStorage;
import org.talend.updates.runtime.storage.IFeatureStorage;
import org.talend.updates.runtime.utils.PathUtils;
import org.talend.utils.io.FilesUtils;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class TaCoKitCarFeature extends AbstractExtraFeature implements ITaCoKitCarFeature {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TaCoKitCarFeature.class);
    
    private static final String JAVAW_CMD_EXE = "javaw.exe";

    private static final String JAVA_CMD_EXE = "java.exe";

    private static final String JAVA_CMD = "java";

    private boolean autoReloadAfterInstalled = true;

    private TaCoKitCar car;

    private Object carLock = new Object();
    
    private boolean isDeployCommand = false;
    
    private boolean deleteCar = true;

    public TaCoKitCarFeature(ComponentIndexBean indexBean) {
        super(indexBean.getBundleId(), indexBean.getName(), indexBean.getVersion(), indexBean.getDescription(),
                indexBean.getMvnURI(), indexBean.getImageMvnURI(), indexBean.getProduct(), indexBean.getCompatibleStudioVersion(),
                null, PathUtils.convert2Types(indexBean.getTypes()), PathUtils.convert2Categories(indexBean.getCategories()),
                Boolean.valueOf(indexBean.getDegradable()), false, false);
    }

    public TaCoKitCarFeature(TaCoKitCar car) throws Exception {
        super(car.getId(), car.getName(), car.getCarVersion(), car.getDescription(), null, null, null, null, null,
                new LinkedList<>(Arrays.asList(Type.TCOMP_V1)),
                new LinkedList<>(Arrays.asList(Category.ALL)), false, false, false);
        this.car = car;
    }

    @Override
    public boolean isInstalled(IProgressMonitor progress) throws Exception {
        InstallationStatus installationStatus = getInstallationStatus(progress);
        return installationStatus.getStatus().isInstalled();
    }

    /**
     * @return Map<GAV, GAV> newComponent to installedComponent
     */
    private Map<GAV, GAV> filterAlreadyInstalledComponent(List<GAV> installedComponents, List<GAV> newComponents,
            IProgressMonitor progress) throws Exception {
        Map<GAV, GAV> alreadyInstalledComponentMap = new HashMap<>();
        for (GAV newComponent : newComponents) {
            TaCoKitUtil.checkMonitor(progress);
            boolean alreadyInstalled = false;
            GAV curInstalledComponent = null;
            for (GAV installedComponent : installedComponents) {
                TaCoKitUtil.checkMonitor(progress);
                if (alreadyInstalled) {
                    break;
                }
                try {
                    if (StringUtils.equals(
                            installedComponent.getGroupId() + ":" + installedComponent.getArtifactId() + ":" //$NON-NLS-1$ //$NON-NLS-2$
                                    + installedComponent.getClassifier() + ":" + installedComponent.getType(), //$NON-NLS-1$
                            newComponent.getGroupId() + ":" + newComponent.getArtifactId() + ":" //$NON-NLS-1$ //$NON-NLS-2$
                                    + newComponent.getClassifier() + ":" + newComponent.getType())) { //$NON-NLS-1$
                        alreadyInstalled = true;
                    }
                } catch (Exception e) {
                    alreadyInstalled = true;
                    ExceptionHandler.process(e);
                } finally {
                    if (alreadyInstalled) {
                        curInstalledComponent = installedComponent;
                    }
                }
            }
            if (alreadyInstalled) {
                alreadyInstalledComponentMap.put(newComponent, curInstalledComponent);
            }
        }
        return alreadyInstalledComponentMap;
    }

    @Override
    public IStatus install(IProgressMonitor progress, List<URI> allRepoUris) throws Exception {
        IStatus status = null;
        try {
            TaCoKitUtil.checkMonitor(progress);
            boolean succeed = install(progress);
            if (succeed) {
                status = new Status(IStatus.OK, TaCoKitConst.BUNDLE_ID,
                        Messages.getString("TaCoKitCarFeature.status.succeed", getName())); //$NON-NLS-1$
                if (!needRestart() && isAutoReloadAfterInstalled()) {
                    // if studio need to restart, then no need to reload here
                    String log = ITaCoKitService.getInstance().reload(progress);
                    ExceptionHandler.logDebug(log);
                }
            } else {
                status = new Status(IStatus.ERROR, TaCoKitConst.BUNDLE_ID,
                        Messages.getString("TaCoKitCarFeature.status.failed", getName())); //$NON-NLS-1$
            }
        } catch (InterruptedException e) {
            status = new Status(IStatus.CANCEL, TaCoKitConst.BUNDLE_ID, Messages.getString("progress.cancel"), e); //$NON-NLS-1$
        } catch (Exception e) {
            status = new Status(IStatus.ERROR, TaCoKitConst.BUNDLE_ID,
                    Messages.getString("TaCoKitCarFeature.status.failed", getName()), e); //$NON-NLS-1$
        }
        return status;
    }
    
    public static String getJavaCMD() {
        String vm = System.getProperty(EclipseCommandLine.PROP_VM);
        if (!StringUtils.isBlank(vm)) {
            if (!vm.endsWith(JAVA_CMD) || !vm.endsWith(JAVA_CMD_EXE)) {
                LOGGER.info("vm: " + vm);
                String javaCMD = Platform.getOS().equals(Platform.OS_WIN32) ? JAVA_CMD_EXE : JAVA_CMD;
                Finder f = new Finder(javaCMD);
                Path p = Paths.get(vm);
                if (Files.isSymbolicLink(p)) {
                    try {
                        p = p.toRealPath();
                    } catch (IOException e) {
                        LOGGER.error("toRealPath error", e);
                    }
                }
                findJava(Paths.get(vm), f);
                if (f.getJavaFile() != null) {
                    return f.getJavaFile().getAbsolutePath();
                }
            }
        }
        return JAVA_CMD;
    }
    
    public static File findJava(Path p, Finder f) {

        if (p == null) {
            return null;
        }

        try {
            Files.walkFileTree(p, f);
        } catch (IOException e) {
            LOGGER.error("findJava error", e);
        }
        if (f.getJavaFile() == null && f.getLevel() < 4) {
            f.setLevel(f.getLevel() + 1);
            findJava(p.getParent(), f);
        }

        return f.getJavaFile();
    }

    public static class Finder extends SimpleFileVisitor<Path> {

        private final String javaCMD;

        private File javaFile;

        private int level = 0;

        Finder(String javaCMD) {
            this.javaCMD = javaCMD;
        }

        /**
         * @return the level
         */
        public int getLevel() {
            return level;
        }

        /**
         * @param level the level to set
         */
        public void setLevel(int level) {
            this.level = level;
        }

        public File getJavaFile() {
            return javaFile;
        }

        // Invoke the pattern matching
        // method on each file.
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            if (StringUtils.equals(javaCMD, FilenameUtils.getName(file.toFile().getName()))) {
                javaFile = file.toFile();
                return FileVisitResult.TERMINATE;
            }
            return FileVisitResult.CONTINUE;
        }

        // Invoke the pattern matching
        // method on each directory.
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) {
            LOGGER.error("vist " + file, exc);
            return FileVisitResult.CONTINUE;
        }
    }

    @SuppressWarnings("nls")
    public boolean install(IProgressMonitor progress) throws Exception {
        TaCoKitCar tckCar = getCar(progress);
        String carBundlerVersion = tckCar.getCarBundlerVersion();
        boolean useBuiltinInstaller = false;
        if (!isDeployCommand) {
            try {
                useBuiltinInstaller = Boolean.getBoolean(TaCoKitConst.PARAM_CAR_INSTALLER_USE_BUILTIN) || (StringUtils
                        .isBlank(carBundlerVersion)
                        // we fixed the issue in tck 1.45.1, so newer version can continue to use CarMain
                        || PathUtils.convert2Version(carBundlerVersion).compareTo(PathUtils.convert2Version("1.45.1")) < 0);
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
        }
        String installationPath = URIUtil.toFile(URIUtil.toURI(Platform.getInstallLocation().getURL())).getAbsolutePath();
        File m2RepoFolder = this.getM2RepositoryPath();
        if (useBuiltinInstaller) {
            CarMain.deployInStudio(tckCar.getCarFile(), installationPath, false, m2RepoFolder);
            return true;
        } else {
            String m2RepoPath = URIUtil.toFile(m2RepoFolder.toURI()).getAbsolutePath();
            String tckCarPath = URIUtil.toFile(tckCar.getCarFile().toURI()).getAbsolutePath();
            String commandType = "studio-deploy";
            List<String> cmds = new ArrayList<String>();
            String javaCMD = getJavaCMD();
            cmds.add(javaCMD);
            cmds.add("-D" + TaCoKitConst.PARAM_CAR_INSTALLER_M2_REPO_PATH + "=" + m2RepoPath);
            cmds.add("-jar");
            cmds.add(tckCarPath);

            if (isDeployCommand) {
                installationPath = m2RepoPath;
                commandType = "maven-deploy";
            }
            cmds.add(commandType);
            cmds.add(installationPath);

            ExceptionHandler.logDebug("tck install command line: " + cmds);

            Process exec = null;
            try {
                exec = Runtime.getRuntime().exec(cmds.toArray(new String[0]));
            } catch (Exception e) {
                ExceptionHandler.process(e);
                throw e;
            }
            while (exec.isAlive()) {
                try {
                    TaCoKitUtil.checkMonitor(progress);
                } catch (InterruptedException e) {
                    exec.destroy();
                    boolean alreadyInstalled = false;
                    try {
                        InstallationStatus installationStatus = getInstallationStatus(new NullProgressMonitor());
                        if (installationStatus != null) {
                            org.talend.updates.runtime.model.InstallationStatus.Status status = installationStatus.getStatus();
                            if (status != null) {
                                if (status.isInstalled()) {
                                    String installedVersion = installationStatus.getInstalledVersion();
                                    alreadyInstalled = StringUtils.equals(getVersion(), installedVersion);
                                }
                            }
                        }
                    } catch (Exception e1) {
                        ExceptionHandler.process(e1);
                    }
                    if (alreadyInstalled) {
                        return true;
                    } else {
                        throw e;
                    }
                }
                Thread.sleep(100);
            }
            int exitValue = exec.exitValue();
            if (exitValue != 0) {
                Exception e = new Exception(getErrorMessage(exec));
                ExceptionHandler.process(e);
                throw e;
            }
            return true;
        }
    }
    
    private File getM2RepositoryPath() {
        String configFolder = Platform.getConfigurationLocation().getURL().getPath();
        File mavenUserSettingFile = new File(configFolder,
                IProjectSettingTemplateConstants.MAVEN_USER_SETTING_TEMPLATE_FILE_NAME);
        File m2Repo= null;
        if (mavenUserSettingFile.exists()) {
            m2Repo = new File(MavenPlugin.getMaven().getLocalRepositoryPath());
        }
        if (m2Repo == null) {
            File m2Folder = new File(configFolder, ".m2");
            m2Repo = new File (m2Folder, "repository");
        }
        if (!m2Repo.exists()) {
            m2Repo.mkdirs();
        }
        return m2Repo;
    }

    private String getErrorMessage(Process exec) {
        StringBuffer strBuffer = new StringBuffer();
        InputStreamReader inReader = null;
        BufferedReader bufReader = null;
        try {
            inReader = new InputStreamReader(exec.getErrorStream());
            bufReader = new BufferedReader(inReader);
            do {
                String line = bufReader.readLine();
                if (line == null || line.isEmpty()) {
                    break;
                }
                strBuffer.append(line).append("\n"); //$NON-NLS-1$
            } while (true);
        } catch (Exception e) {
            ExceptionHandler.process(e);
        } finally {
            if (inReader != null) {
                try {
                    inReader.close();
                } catch (Exception e) {
                    // nothing to do
                }
            }
            if (bufReader != null) {
                try {
                    bufReader.close();
                } catch (Exception e) {
                    // nothing to do
                }
            }
        }
        return strBuffer.toString();
    }

    @SuppressWarnings("nls")
    @Override
    public String toString() {
        return "TaCoKitCarFeature [car=" + this.car.toString() + "]";
    }

    @Override
    public EnumSet<UpdateSiteLocationType> getUpdateSiteCompatibleTypes() {
        return EnumSet.allOf(UpdateSiteLocationType.class);
    }

    @Override
    public boolean mustBeInstalled() {
        return false;
    }

    @Override
    public boolean needRestart() {
        // seems ReloadAction#reload can't reload config.ini?
        return true;
    }

    @Override
    public String getName() {
        String name = super.getName();
        if (StringUtils.isBlank(name)) {
            try {
                return getCar(new NullProgressMonitor()).getName();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            return null;
        } else {
            return name;
        }
    }

    @Override
    public String getDescription() {
        String description = super.getDescription();
        if (StringUtils.isBlank(description)) {
            try {
                return getCar(new NullProgressMonitor()).getDescription();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            return null;
        } else {
            return description;
        }
    }

    @Override
    public String getVersion() {
        String version = super.getVersion();
        if (StringUtils.isBlank(version)) {
            try {
                return getCar(new NullProgressMonitor()).getCarVersion();
            } catch (Exception e) {
                ExceptionHandler.process(e);
            }
            return null;
        } else {
            return version;
        }
    }

    @Override
    public String getMvnUri() {
        String mvnUri = super.getMvnUri();
        if (mvnUri == null) {
            GAV gav = car.getComponents().get(0);
            mvnUri = MavenUrlHelper.generateMvnUrl(gav.getGroupId(), gav.getArtifactId(), gav.getVersion(),
                    FileExtensions.ZIP_EXTENSION, null);
        }
        return mvnUri;
    }

    @Override
    public boolean isAutoReloadAfterInstalled() {
        return this.autoReloadAfterInstalled;
    }

    @Override
    public void setAutoReloadAfterInstalled(boolean autoReload) {
        this.autoReloadAfterInstalled = autoReload;
    }

    @Override
    public boolean isShareEnable() {
        return share;
    }

    @Override
    public void setShareEnable(boolean share) {
        this.share = share;
    }

    @Override
    public File getCarFile(IProgressMonitor progress) throws Exception {
        return getCar(new NullProgressMonitor()).getCarFile();
    }

    private TaCoKitCar getCar(IProgressMonitor progress) throws Exception {
        if (this.car != null) {
            return this.car;
        }
        synchronized (carLock) {
            this.car = new TaCoKitCar(getStorage().getFeatureFile(progress));
        }
        return this.car;
    }

    @Override
    public boolean canBeInstalled(IProgressMonitor progress) throws ExtraFeatureException {
        try {
            InstallationStatus installationStatus = getInstallationStatus(progress);
            return installationStatus.canBeInstalled();
        } catch (Exception e) {
            throw new ExtraFeatureException(e);
        }
    }

    @Override
    public InstallationStatus getInstallationStatus(IProgressMonitor monitor) throws Exception {
        List<GAV> installedComponents = TaCoKitUtil.getInstalledComponents(monitor);
        if (installedComponents != null && !installedComponents.isEmpty()) {
            TaCoKitUtil.checkMonitor(monitor);
            List<GAV> newComponents = null;
            if (this.car == null) {
                // means the car is still on network
                newComponents = new ArrayList<>();
                GAV featGAV = new GAV();
                String id = getP2IuId();
                String groupId = id.substring(0, id.lastIndexOf(".")); //$NON-NLS-1$
                String artifactId = id.substring(id.lastIndexOf(".") + 1); //$NON-NLS-1$
                featGAV.setGroupId(groupId);
                featGAV.setArtifactId(artifactId);
                featGAV.setVersion(getVersion());
                newComponents.add(featGAV);
            } else {
                // means it's a local patch, or car is downloaded
                newComponents = getCar(monitor).getComponents();
            }
            if (newComponents != null) {
                Map<GAV, GAV> alreadyInstalledComponentMap = filterAlreadyInstalledComponent(installedComponents, newComponents,
                        monitor);
                if (alreadyInstalledComponentMap != null && !alreadyInstalledComponentMap.isEmpty()) {
                    Version latestInstalledVersion = null;
                    for (Map.Entry<GAV, GAV> entry : alreadyInstalledComponentMap.entrySet()) {
                        GAV newGAV = entry.getKey();
                        GAV installedGAV = entry.getValue();
                        String newVersion = newGAV.getVersion();
                        if (!TaCoKitUtil.isBlank(newGAV.getClassifier())) {
                            newVersion = newVersion + "-" + newGAV.getClassifier();
                        }
                        String installedVersion = installedGAV.getVersion();
                        if (!TaCoKitUtil.isBlank(installedGAV.getClassifier())) {
                            installedVersion = installedVersion + "-" + installedGAV.getClassifier();
                        }
                        Version nVer = PathUtils.convert2Version(newVersion);
                        Version iVer = PathUtils.convert2Version(installedVersion);
                        if (latestInstalledVersion == null) {
                            latestInstalledVersion = iVer;
                        } else {
                            if (latestInstalledVersion.compareTo(iVer) < 0) {
                                latestInstalledVersion = iVer;
                            }
                        }
                        if (0 < nVer.compareTo(iVer)) {
                            InstallationStatus status = new InstallationStatus(InstallationStatus.Status.UPDATABLE);
                            status.setRequiredStudioVersion(getCompatibleStudioVersion());
                            status.setInstalledVersion(installedVersion.toString());
                            return status;
                        }
                    }
                    InstallationStatus status = new InstallationStatus(InstallationStatus.Status.INSTALLED);
                    status.setInstalledVersion(latestInstalledVersion.toString());
                    status.setRequiredStudioVersion(getCompatibleStudioVersion());
                    return status;
                } else {
                    InstallationStatus status = new InstallationStatus(InstallationStatus.Status.INSTALLABLE);
                    status.setRequiredStudioVersion(getCompatibleStudioVersion());
                    return status;
                }
            } else {
                // maybe new case? just install
            }
        }
        InstallationStatus status = new InstallationStatus(InstallationStatus.Status.INSTALLABLE);
        status.setRequiredStudioVersion(getCompatibleStudioVersion());
        return status;
    }

    @Override
    public void setStorage(IFeatureStorage storage) {
        super.setStorage(storage);
        final File workFolder = PathUtils.getComponentsDownloadedFolder();
        FilesUtils.deleteFolder(workFolder, false); // empty the folder
        if (!workFolder.exists()) {
            workFolder.mkdirs();
        }
        ((AbstractFeatureStorage) getStorage()).setFeatDownloadFolder(workFolder);
    }

    @Override
    public void setDeployCommand(boolean isDeployCommand){
        this.isDeployCommand = isDeployCommand;     
    }

    @Override
    public void setDeleteCar(boolean deleteCar) {
        this.deleteCar = deleteCar;
    }

    @Override
    public boolean isDeleteCar() {
        return deleteCar;
    }
}
