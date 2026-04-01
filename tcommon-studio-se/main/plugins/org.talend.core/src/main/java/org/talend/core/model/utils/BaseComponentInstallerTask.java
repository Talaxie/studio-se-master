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
package org.talend.core.model.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.IMaven;
import org.osgi.framework.FrameworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ILibraryManagerService;
import org.talend.core.i18n.Messages;
import org.talend.utils.io.FilesUtils;

/**
 * @author bhe created on Jul 1, 2021
 *
 */
abstract public class BaseComponentInstallerTask implements IComponentInstallerTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseComponentInstallerTask.class);
    private static final String SYS_PROP_TCOMPV0 = "tcompv0.update";
    private static final String SYS_PROP_OVERWRITE = "m2.overwrite";
    private static final String SYS_PROP_OVERWRITE_DEFAULT = Boolean.FALSE.toString();

    private static final String SYS_CUSTOM_MAVEN_REPO = "maven.local.repository";
    
    private int order;
    
    private int componentType = -1;
    
    private Set<ComponentGAV> gavs = new HashSet<ComponentGAV>();
    
    protected boolean overWriteM2() {
        /**
         * force to overwrite, since need to sync maven-metadata-local.xml
         */
        String prop = System.getProperty(SYS_PROP_OVERWRITE, Boolean.TRUE.toString());
        return Boolean.valueOf(prop);
    }
    
    protected boolean updateTcompv0() {
        String prop = System.getProperty(SYS_PROP_TCOMPV0, SYS_PROP_OVERWRITE_DEFAULT);
        return Boolean.valueOf(prop);
    }

    @Override
    public int getComponentType() {
        return componentType;
    }

    @Override
    public void setComponentType(int componentType) {
        this.componentType = componentType;
    }
    
    @Override
    public int getOrder() {
        return this.order;
    }

    @Override
    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public Set<ComponentGAV> getComponentGAV() {
        return gavs;
    }

    @Override
    public void addComponentGAV(ComponentGAV gav) {
        gavs.add(gav);
    }

    @Override
    public Set<ComponentGAV> getComponentGAV(int componentType) {
        return this.gavs.stream().filter(gav -> (gav.getComponentType() & componentType) > 0).collect(Collectors.toSet());
    }

    /**
     * Get implementation class of installer
     * 
     * @return implementation class of installer
     */
    abstract protected Class<? extends BaseComponentInstallerTask> getInstallerClass();

    /**
     * Get jar file directory
     * 
     * @return jar file directory
     */
    protected File getJarFileDir() {
        URL jarFolder = FileLocator.find(FrameworkUtil.getBundle(getInstallerClass()), new Path("repository"), null);
        File jarFileDir = null;
        if (jarFolder != null) {
            try {
                jarFileDir = new File(FileLocator.toFileURL(jarFolder).getPath());

                if (jarFileDir.isDirectory()) {
                    return jarFileDir;
                }

            } catch (IOException e) {
                LOGGER.error("Can't find jar file", e);
            }
        }
        LOGGER.info("Can't find jar file from folder {}", jarFolder);
        return null;
    }

    /**
     * <pre>
     *Implementation of unzipping files into studio local m2 directory
     *
     * </pre>
     */
    @Override
    public boolean needInstall() {
        
        if (this.updateTcompv0()) {
            LOGGER.info("System property: {} is true", SYS_PROP_TCOMPV0);
            return true;
        }
        
        boolean toInstall = false;
        Set<ComponentGAV> tcompv0Gavs = this.getComponentGAV(COMPONENT_TYPE_TCOMPV0);

        ILibraryManagerService librairesManagerService = (ILibraryManagerService) GlobalServiceRegister.getDefault().getService(ILibraryManagerService.class);
        if (librairesManagerService != null) {
            for (ComponentGAV gav : tcompv0Gavs) {
                File jarFile = librairesManagerService.resolveStatusLocally(gav.toMavenUri());
                if (jarFile == null) {
                    LOGGER.info("Component: {} was not installed", gav.toString());
                    toInstall = true;
                    break;
                }
            }
        }

        if (toInstall) {
            LOGGER.info("Component: {} is going to be installed", Arrays.toString(tcompv0Gavs.toArray()));
        }
        return toInstall;
    }

    @Override
    public boolean install(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

        if (monitor == null) {
            monitor = new NullProgressMonitor();
        }

        if (!this.needInstall()) {
            return false;
        }

        File jarDir = getJarFileDir();

        if (jarDir == null) {
            LOGGER.info("Jar file directory can't be found");
            return false;
        }

        File m2Dir = getM2RepositoryPath();
        if (m2Dir == null) {
            LOGGER.warn("Can't get local m2 path");
            return false;
        }

        File[] files = jarDir.listFiles();
        Set<File> zipFiles = Stream.of(files).filter(f -> f.getName().endsWith(".zip")).collect(Collectors.toSet());
        boolean installed = true;

        monitor.beginTask(Messages.getString("BaseComponentInstallerTask.installComponent", getMonitorText()), zipFiles.size());
        
        for (File zf : zipFiles) {
            try {
                FilesUtils.unzip(zf.getAbsolutePath(), m2Dir.getAbsolutePath(), this.overWriteM2());
                LOGGER.info("Jar zip: {} were unzipped to {}", zf, m2Dir);
            } catch (Exception e) {
                LOGGER.error("unzipp error", e);
                installed = false;
            }
            monitor.worked(1);
        }

        return installed;
    }

    /**
     * Get studio local maven repository path
     * 
     * @return local maven repository path
     */
    protected File getM2RepositoryPath() {
        
        String mavenRepo = System.getProperty(SYS_CUSTOM_MAVEN_REPO);

        File m2Repo = null;

        if (StringUtils.isEmpty(mavenRepo)) {
            final IMaven maven = MavenPlugin.getMaven();
            try {
                maven.reloadSettings();
            } catch (CoreException e) {
                LOGGER.error("getM2RepositoryPath error", e);
            }
            String localRepository = maven.getLocalRepositoryPath();

            if (!StringUtils.isEmpty(localRepository)) {
                m2Repo = new File(localRepository);
            }
        } else {
            m2Repo = new File(mavenRepo);
        }
        
        if (m2Repo != null && !m2Repo.exists()) {
            m2Repo.mkdirs();
        }
        return m2Repo;
    }

    protected String getMonitorText() {
        Set<ComponentGAV> tcompv0Gavs = this.getComponentGAV(COMPONENT_TYPE_TCOMPV0);
        final StringBuilder sb = new StringBuilder();
        tcompv0Gavs.forEach(gav -> {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(gav.getArtifactId());
        });
        return sb.toString();
    }

}
