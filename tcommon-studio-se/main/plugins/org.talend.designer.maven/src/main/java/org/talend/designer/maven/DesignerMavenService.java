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
package org.talend.designer.maven;

import java.util.List;

import org.apache.maven.settings.Settings;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.embedder.IMaven;
import org.talend.core.model.properties.RoutineItem;
import org.talend.core.model.routines.CodesJarInfo;
import org.talend.core.runtime.services.IDesignerMavenService;
import org.talend.designer.maven.tools.CodesJarM2CacheManager;
import org.talend.designer.maven.utils.CodesJarMavenUtil;
import org.talend.designer.maven.utils.MavenProjectUtils;

public class DesignerMavenService implements IDesignerMavenService {

    @Override
    public String getCodesJarPackageByInnerCode(RoutineItem innerCodeItem) {
        return CodesJarMavenUtil.getCodesJarPackageByInnerCode(innerCodeItem);
    }

    @Override
    public String getImportGAVPackageForCodesJar(CodesJarInfo info) {
        return CodesJarMavenUtil.getImportGAVPackageForCodesJar(info);
    }

    @Override
    public void updateCodeJarMavenProject(CodesJarInfo info, boolean needReSync) throws Exception {
        CodesJarM2CacheManager.updateCodesJarProject(info, needReSync);
    }
    
    @Override
    public void enableMavenNature(IProgressMonitor monitor, IProject project) {
        MavenProjectUtils.enableMavenNature(monitor, project);
    }

    @Override
    public void addProjectClasspathEntry(IProgressMonitor monitor, IProject project, List<IClasspathEntry> entries) {
        MavenProjectUtils.addProjectClasspathEntry(monitor, project, entries);
    }

    @Override
    public String getLocalRepositoryPath() throws Exception {
        final IMaven maven = MavenPlugin.getMaven();
        maven.reloadSettings();
        final Settings settings = maven.getSettings();
        return settings.getLocalRepository();
    }

}
