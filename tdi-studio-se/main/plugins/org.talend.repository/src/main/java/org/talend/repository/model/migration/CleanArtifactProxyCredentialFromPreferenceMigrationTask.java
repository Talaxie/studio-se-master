// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.general.Project;
import org.talend.core.model.migration.AbstractProjectMigrationTask;
import org.talend.core.nexus.TalendLibsServerManager;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.utils.security.StudioEncryption;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class CleanArtifactProxyCredentialFromPreferenceMigrationTask extends AbstractProjectMigrationTask {

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 7, 24, 12, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Project project) {
        try {
            ProjectPreferenceManager prefManager = new ProjectPreferenceManager("org.talend.proxy.nexus", true);
            String username = prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_USERNAME);
            String password = prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD);
            if (StringUtils.isBlank(username) && StringUtils.isBlank(password)) {
                return ExecutionResult.NOTHING_TO_DO;
            }
            String url = prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_URL);
            String repositoryId = prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_REPOSITORY_ID);
            TalendLibsServerManager libsServerManager = TalendLibsServerManager.getInstance();
            String[] credentials = libsServerManager.getProxyArtifactCredentials(url, repositoryId,
                    TalendLibsServerManager.NEXUS_PROXY_USERNAME, TalendLibsServerManager.NEXUS_PROXY_PASSWORD);
            if (credentials == null) {
                password = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).decrypt(password);
                libsServerManager.saveProxyArtifactCredentials(url, repositoryId, TalendLibsServerManager.NEXUS_PROXY_USERNAME,
                        username, TalendLibsServerManager.NEXUS_PROXY_PASSWORD, password);
            }
            prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD);
            prefManager.setValue(TalendLibsServerManager.NEXUS_PROXY_USERNAME, "");
            prefManager.setValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD, "");
            prefManager.save();
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
        return ExecutionResult.SUCCESS_NO_ALERT;
    }

}
