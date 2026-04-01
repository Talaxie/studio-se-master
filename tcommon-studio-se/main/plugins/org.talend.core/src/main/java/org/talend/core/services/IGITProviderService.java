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
package org.talend.core.services;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.IService;
import org.talend.core.model.general.Project;

/**
 * nma class global comment. Detailled comment
 */
public interface IGITProviderService extends IService {

    public boolean isProjectInGitMode();

    public String getLastGITRevision(Object process);

    public String getCurrentGITRevision(Object process);

    /**
     * get project branches
     * 
     * @param project
     * @param onlyLocalIfPossible try to only get branches from local repository to improve performance
     * @return
     */
    public String[] getBranchList(Project project, boolean onlyLocalIfPossible) throws Exception;

    public boolean isGITProject(Project p) throws PersistenceException;

    public void gitEclipseHandlerDelete(IProject eclipseProject, Project currentProject, String filePath);

    public void refreshResources(IProgressMonitor monitor, Collection<IResource> resources) throws Exception;

    public void reloadDynamicDistributions(IProgressMonitor monitor) throws Exception;

    public void clean();

    void createOrUpdateGitIgnoreFile(IProject eclipseProject) throws CoreException;

    String getDefaultBranch(Project project);
    
    /**
     * Whether git mode is standard mode
     * @return
     */
    boolean isStandardMode();
    
    /**
     * Whether git storage mode is set in preference or not
     * @return
     */
    boolean isGitModeInPreference();
    
    /**
     * Set git mode
     * @param standardMode
     */
    void setStandardMode(boolean standardMode);
    
    String getProjectLocationKey(Project project) throws PersistenceException;
    
    /**
     * Get clean git repository url
     * @param project project
     * @return
     */
    String getCleanGitRepositoryUrl(org.talend.core.model.properties.Project project);
    
    boolean canShowSwitchGitModePopup();
    
    void showSwithGitModePopup();

    public static IGITProviderService get() {
        GlobalServiceRegister register = GlobalServiceRegister.getDefault();
        if (!register.isServiceRegistered(IGITProviderService.class)) {
            return null;
        }
        return register.getService(IGITProviderService.class);
    }

    public void clearOldStorage(IProgressMonitor monitor, Project project) throws PersistenceException;
}
