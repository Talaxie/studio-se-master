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
package org.talend.updates.runtime.maven;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.ILibraryManagerService;
import org.talend.core.model.utils.BaseComponentInstallerTask;
import org.talend.core.model.utils.ComponentGAV;
import org.talend.core.nexus.TalendMavenResolver;
import org.talend.core.runtime.maven.MavenArtifact;
import org.talend.designer.maven.model.TalendMavenConstants;
import org.talend.designer.maven.utils.PomUtil;
import org.talend.utils.files.FileUtils;

/**
 * @author bhe created on Jul 29, 2021
 *
 */
abstract public class M2repoBaseInstaller extends BaseComponentInstallerTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(M2repoBaseInstaller.class);

    private static final String PLUGIN_GROUP = "org.talend.studio";
    
    private static final String SYS_PROP_M2 = "m2.update";

    protected boolean updateM2() {
        String prop = System.getProperty(SYS_PROP_M2, "false");
        return Boolean.valueOf(prop);
    }

    
    @Override
    public boolean needInstall() {
        
        if (this.updateM2()) {
            LOGGER.info("System property: {} is true", SYS_PROP_M2);
            return true;
        }
        
        ComponentGAV gav = this.getPluginGAV();

        ILibraryManagerService librairesManagerService = (ILibraryManagerService) GlobalServiceRegister.getDefault().getService(ILibraryManagerService.class);
        if (librairesManagerService != null) {
            File f = librairesManagerService.resolveStatusLocally(gav.toMavenUri());
            if (f == null) {
                LOGGER.info("{} was not installed", gav.toString());
                return true;
            }
        }
        LOGGER.info("{} was already installed", gav.toString());
        return false;
    }

    @Override
    public boolean install(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        boolean ret = super.install(monitor);

        if (ret) {
            // install pom
            File tempFolder = FileUtils.createTmpFolder("generate", "pom");

            ComponentGAV gav = this.getPluginGAV();

            MavenArtifact art = new MavenArtifact();
            art.setGroupId(gav.getGroupId());
            art.setArtifactId(gav.getArtifactId());
            art.setVersion(gav.getVersion());
            art.setType(gav.getType());

            try {
                String pomPath = PomUtil.generatePomInFolder(tempFolder, art);

                TalendMavenResolver.upload(art.getGroupId(), art.getArtifactId(), art.getClassifier(), TalendMavenConstants.PACKAGING_POM, art.getVersion(), new File(pomPath));

            } catch (Exception e) {
                LOGGER.error(e.getMessage(), e);
                ExceptionHandler.process(e);
            }

            LOGGER.info("{} was installed", gav.toString());
        }

        return ret;

    }
    
    @Override
    protected String getMonitorText() {
        ComponentGAV gav = this.getPluginGAV();
        return gav.getArtifactId();
    }

    protected ComponentGAV getPluginGAV() {
        Bundle bundle = FrameworkUtil.getBundle(getInstallerClass());
        String[] bundleName = bundle.getSymbolicName().split("\\.");
        String artifactId = bundleName[bundleName.length - 1];
        if (bundleName.length > 1) {
            artifactId = bundleName[bundleName.length - 2] + "-" + bundleName[bundleName.length - 1];
        }

        ComponentGAV gav = new ComponentGAV();
        gav.setGroupId(PLUGIN_GROUP);
        gav.setArtifactId(artifactId);
        gav.setVersion(bundle.getVersion().toString());
        gav.setType(TalendMavenConstants.PACKAGING_POM);
        return gav;
    }

}
