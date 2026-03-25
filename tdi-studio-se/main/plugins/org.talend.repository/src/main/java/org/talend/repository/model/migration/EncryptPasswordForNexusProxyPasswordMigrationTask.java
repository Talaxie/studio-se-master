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
package org.talend.repository.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.PasswordEncryptUtil;
import org.talend.core.CorePlugin;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.ImplicitContextSettings;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.StatAndLogsSettings;
import org.talend.core.nexus.TalendLibsServerManager;
import org.talend.core.runtime.projectsetting.ProjectPreferenceManager;
import org.talend.cwm.helper.ConnectionHelper;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ParametersType;
import org.talend.designer.core.model.utils.emf.talendfile.impl.ElementParameterTypeImpl;
import org.talend.migration.AbstractMigrationTask;
import org.talend.migration.IProjectMigrationTask;
import org.talend.repository.model.IProxyRepositoryFactory;
import org.talend.utils.security.StudioEncryption;

/**
 * DOC hzhao class global comment. Detailled comment
 */
public class EncryptPasswordForNexusProxyPasswordMigrationTask extends AbstractMigrationTask implements IProjectMigrationTask {

    /*
     * (non-Javadoc)
     *
     * @see org.talend.migration.IMigrationTask#getOrder()
     */
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2014, 5, 27, 12, 0, 0);
        return gc.getTime();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.migration.IProjectMigrationTask#isApplicableOnItems()
     */
    @Override
    public boolean isApplicableOnItems() {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.migration.IProjectMigrationTask#execute(org.talend.core.model.general.Project)
     */
    @Override
    public ExecutionResult execute(Project project) {
        
        ProjectPreferenceManager prefManager = new ProjectPreferenceManager("org.talend.proxy.nexus", true);
        String password = prefManager.getValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD);
        if(StringUtils.isEmpty(password) || StudioEncryption.hasEncryptionSymbol(password)) {
            return ExecutionResult.NOTHING_TO_DO; 
        }
        try {
            String encryptedPassword = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).encrypt(password);
            prefManager.setValue(TalendLibsServerManager.NEXUS_PROXY_PASSWORD, encryptedPassword);
            prefManager.save();
        }catch(Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
        return ExecutionResult.SUCCESS_NO_ALERT;
        
    }


    /*
     * (non-Javadoc)
     *
     * @see org.talend.migration.IProjectMigrationTask#execute(org.talend.core.model.general.Project, boolean)
     */
    @Override
    public ExecutionResult execute(Project project, boolean doSave) {
        return execute(project);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.migration.IProjectMigrationTask#execute(org.talend.core.model.general.Project,
     * org.talend.core.model.properties.Item)
     */
    @Override
    public ExecutionResult execute(Project project, Item item) {
        return ExecutionResult.NOTHING_TO_DO;
    }
}
