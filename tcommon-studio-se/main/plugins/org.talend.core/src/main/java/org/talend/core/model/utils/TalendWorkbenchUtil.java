// ============================================================================
//
// Copyright (C) 2006-2023 Talend Inc. - www.talend.com
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

import org.eclipse.core.runtime.NullProgressMonitor;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.VersionUtils;
import org.talend.core.CorePlugin;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.context.Context;
import org.talend.core.context.RepositoryContext;
import org.talend.core.i18n.Messages;
import org.talend.core.model.general.Project;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.service.IRemoteService;
import org.talend.core.service.IStudioLiteP2Service;
import org.talend.core.ui.IInstalledPatchService;
import org.talend.core.ui.branding.IBrandingService;
import org.talend.repository.ui.login.connections.ConnectionUserPerReader;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class TalendWorkbenchUtil {

    public static final String MANAGED_BY_ADMIN = " Managed by administrator"; //$NON-NLS-1$

    public static String getWorkbenchWindowTitle() {
        String title = "";
        RepositoryContext repositoryContext = (RepositoryContext) CorePlugin.getContext()
                .getProperty(Context.REPOSITORY_CONTEXT_KEY);
        Project project = repositoryContext.getProject();
        String appName = IBrandingService.get().getFullProductName();
        // TDI-18644
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        boolean localProvider = false;
        try {
            localProvider = factory.isLocalConnectionProvider();
        } catch (PersistenceException e) {
            localProvider = true;
        }

        String buildIdField = " (" + VersionUtils.getVersion() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
        if (GlobalServiceRegister.getDefault().isServiceRegistered(IInstalledPatchService.class)) {
            IInstalledPatchService pachService = (IInstalledPatchService) GlobalServiceRegister.getDefault()
                    .getService(IInstalledPatchService.class);
            if (pachService != null) {
                String patchVersion = pachService.getLatestInstalledVersion(true);
                if (patchVersion != null) {
                    buildIdField = " (" + patchVersion + ")"; //$NON-NLS-1$ //$NON-NLS-2$ ;
                    if (IRemoteService.get() != null && IRemoteService.get().isCloudConnection()) {
                        IStudioLiteP2Service liteP2Service = IStudioLiteP2Service.get();
                        if (liteP2Service != null && liteP2Service.isUpdateManagedByTmc(new NullProgressMonitor())) {
                            buildIdField += MANAGED_BY_ADMIN;
                        }
                    }
                }
            }
        }

        if (TalendPropertiesUtil.isHideBuildNumber()) {
            buildIdField = ""; //$NON-NLS-1$
        }
        if (localProvider) {
            title = appName + buildIdField + " | " + project.getLabel() + " (" //$NON-NLS-1$ //$NON-NLS-2$
                    + Messages.getString("ApplicationWorkbenchWindowAdvisor.repositoryConnection") + ": " //$NON-NLS-1$ //$NON-NLS-2$
                    + ConnectionUserPerReader.getInstance().readLastConncetion() + ")"; //$NON-NLS-1$
        } else {
            title = appName + buildIdField + " | " + repositoryContext.getUser() + " | " + project.getLabel() + " (" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + Messages.getString("ApplicationWorkbenchWindowAdvisor.repositoryConnection") + ": " //$NON-NLS-1$ //$NON-NLS-2$
                    + ConnectionUserPerReader.getInstance().readLastConncetion() + ")"; //$NON-NLS-1$
        }
        return title;
    }

}
