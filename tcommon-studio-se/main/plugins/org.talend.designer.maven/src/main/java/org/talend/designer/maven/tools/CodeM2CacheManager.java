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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.m2e.core.MavenPlugin;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.model.general.Project;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.maven.utils.PomIdsHelper;
import org.talend.repository.ProjectManager;
import org.talend.utils.io.FilesUtils;

public class CodeM2CacheManager {

    private static final String KEY = "updated"; //$NON-NLS-1$

    private static File cacheFolder;

    static {
        cacheFolder = new File(MavenPlugin.getMaven().getLocalRepositoryPath()).toPath().resolve(".codecache").resolve("codes")
                .toFile();
        if (!cacheFolder.exists()) {
            cacheFolder.mkdirs();
        }
    }

    public static boolean needUpdateCodeProject(Project project, ERepositoryObjectType codeType) {
        String projectTechName = project.getTechnicalLabel();
        File cacheFile = getCacheFile(projectTechName, codeType);
        if (!cacheFile.exists()) {
            return true;
        }
        try (InputStream in = new FileInputStream(cacheFile)) {
            Properties cache = new Properties();
            cache.load(in);
            boolean isUpdated = Boolean.valueOf(cache.getProperty(KEY, Boolean.FALSE.toString()));
            return !isUpdated;
        } catch (Throwable t) {
            ExceptionHandler.process(t);
            // if any exception, still update in case breaking build job
            return true;
        }
    }

    public static void updateAllCacheStatus(boolean isUpdated) {
        ERepositoryObjectType.getAllTypesOfCodes().forEach(type -> updateCacheStatus(null, type, isUpdated));
    }

    public static void updateCacheStatus(String projectTechName, ERepositoryObjectType codeType, boolean isUpdated) {
        if (projectTechName == null) {
            Project currentProject = ProjectManager.getInstance().getCurrentProject();
            if (currentProject == null) {
                if (cacheFolder.exists()) {
                    FilesUtils.deleteFolder(cacheFolder, true);
                }
                cacheFolder.mkdirs();
                return;
            }
            projectTechName = currentProject.getTechnicalLabel();
        }
        File cacheFile = getCacheFile(projectTechName, codeType);
        try (OutputStream out = new FileOutputStream(cacheFile)) {
            Properties cache = new Properties();
            cache.setProperty(KEY, Boolean.valueOf(isUpdated).toString());
            cache.store(out, StringUtils.EMPTY);
        } catch (Throwable t) {
            ExceptionHandler.process(t);
        }
    }

    public static File getCacheFile(String projectTechName, ERepositoryObjectType codeType) {
        String cacheFileName = PomIdsHelper.getProjectGroupId(projectTechName) + "." + codeType.name().toLowerCase() + "-" //$NON-NLS-1$ //$NON-NLS-2$
                + PomIdsHelper.getCodesVersion(projectTechName) + "-" + VersionUtils.getInternalVersion() + ".cache"; // $NON-NLS-1$
        return new File(cacheFolder, cacheFileName);
    }

}
