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
package org.talend.core.repository.services;

import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.Property;

public interface IGitInfoService extends IService {

    public static final String GIT_AUTHOR = "gitAuthor";

    public static final String GIT_COMMIT_DATE = "gitCommitDate";

    public static final String GIT_COMMIT_ID = "gitCommitId";

    /**
     * 
     * DOC hzhao Comment method "getGitInfo".
     * 
     * @param path : the path of job/route/service
     * @param project : the project of the job property path
     * @return : the Map<String,String> of gitAuthor/gitCommitDate/gitCommitId , can use constants
     * GIT_AUTHOR/GIT_COMMIT_DATE/GIT_COMMIT_ID as key . NOTE : GIT_COMMIT_DATE is a String type of a millisecond
     * @throws Exception
     */
    public Map<String, String> getGitInfo(IPath path, Project project) throws Exception;

    /**
     * 
     * DOC hzhao Comment method "getGitInfo".
     * 
     * @param property : the talend model propertry of job/route/service
     * @return : the Map<String,String> of gitAuthor/gitCommitDate/gitCommitId , can use constants
     * GIT_AUTHOR/GIT_COMMIT_DATE/GIT_COMMIT_ID as key . NOTE : GIT_COMMIT_DATE is a String type of a millisecond
     * @throws Exception
     */
    public Map<String, String> getGitInfo(Property property) throws Exception;

    public boolean isPushedToRemote(Property property) throws Exception;
    
    public String getProjectBranch(Project project)throws Exception;

    public static IGitInfoService get() {
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IGitInfoService.class)) {
            return GlobalServiceRegister.getDefault().getService(IGitInfoService.class);
        }
        return null;
    }

}
