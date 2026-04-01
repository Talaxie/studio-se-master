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
import java.util.List;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.CorePlugin;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.database.conn.version.EDatabaseVersion4Drivers;
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.ImplicitContextSettings;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.StatAndLogsSettings;
import org.talend.designer.core.model.utils.emf.talendfile.ParametersType;
import org.talend.designer.core.model.utils.emf.talendfile.impl.ElementParameterTypeImpl;
import org.talend.migration.AbstractMigrationTask;
import org.talend.migration.IProjectMigrationTask;
import org.talend.repository.model.IProxyRepositoryFactory;

public class ChangePostgresPlusDBType4ProjectSettingsMigrationTask extends AbstractMigrationTask
        implements IProjectMigrationTask {

    /*
     * (non-Javadoc)
     *
     * @see org.talend.core.model.migration.IProjectMigrationTask#getOrder()
     */
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 10, 27, 01, 0, 0);
        return gc.getTime();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.migration.IProjectMigrationTask#isApplicableOnItems()
     */
    @Override
    public boolean isApplicableOnItems() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.migration.IProjectMigrationTask#execute(org.talend.core.model.general.Project)
     */
    @Override
    public ExecutionResult execute(Project project) {
        org.talend.core.model.properties.Project emfProject = project.getEmfProject();
        StatAndLogsSettings statAndLogs = emfProject.getStatAndLogsSettings();
        boolean modified = false;
        if (statAndLogs != null && statAndLogs.getParameters() != null) {
            ParametersType parameters = statAndLogs.getParameters();
            List elementParameter = parameters.getElementParameter();
            for (int i = 0; i < elementParameter.size(); i++) {
                final Object object = elementParameter.get(i);
                if (object instanceof ElementParameterTypeImpl) {
                    ElementParameterTypeImpl parameterType = (ElementParameterTypeImpl) object;
                    String name = parameterType.getName();
                    if ("ON_DATABASE_FLAG".equals(name) && !Boolean.valueOf(parameterType.getValue())) {//$NON-NLS-1$
                        break;
                    }
                    if ("DB_TYPE".equals(name) && parameterType.getValue().startsWith("tPostgresPlus")) { //$NON-NLS-1$
                        modified = true;
                        parameterType.setValue(EDatabaseTypeName.PSQL.getDbType());
                        modified = updateDBVersionJarValue(elementParameter) || modified;
                    }
                }
            }

        }
        ImplicitContextSettings implicitContext = emfProject.getImplicitContextSettings();
        if (implicitContext != null && implicitContext.getParameters() != null) {
            ParametersType parameters = implicitContext.getParameters();
            List elementParameter = parameters.getElementParameter();
            for (int i = 0; i < elementParameter.size(); i++) {
                final Object object = elementParameter.get(i);
                if (object instanceof ElementParameterTypeImpl) {
                    ElementParameterTypeImpl parameterType = (ElementParameterTypeImpl) object;
                    String name = parameterType.getName();
                    if ("FROM_DATABASE_FLAG_IMPLICIT_CONTEXT".equals(name) && !Boolean.valueOf(parameterType.getValue())) {//$NON-NLS-1$
                        break;
                    }
                    if ("DB_TYPE_IMPLICIT_CONTEXT".equals(name) && parameterType.getValue().startsWith("tPostgresPlus")) { //$NON-NLS-1$
                        modified = true;
                        parameterType.setValue(EDatabaseTypeName.PSQL.getDbType());
                        modified = updateDBVersionValueForImplici(elementParameter) || modified;
                    }
                }
            }

        }
        if (modified) {
            try {
                IProxyRepositoryFactory prf = CorePlugin.getDefault().getProxyRepositoryFactory();
                prf.saveProject(project);
                return ExecutionResult.SUCCESS_NO_ALERT;
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }
        return ExecutionResult.NOTHING_TO_DO;
    }

    private boolean updateDBVersionJarValue(List elementParameter) {
        for (int i = 0; i < elementParameter.size(); i++) {
            final Object object = elementParameter.get(i);
            if (object instanceof ElementParameterTypeImpl) {
                ElementParameterTypeImpl parameterType = (ElementParameterTypeImpl) object;
                String name = parameterType.getName();
                if ("DB_VERSION".equals(name)) {
                    String value = parameterType.getValue();
                    if (value.equals(EDatabaseVersion4Drivers.PSQL_PRIOR_TO_V9.getVersionValue())
                            || value.equals(EDatabaseVersion4Drivers.PSQL_V9_X.getVersionValue())) {
                        // do nothing
                    } else {
                        parameterType.setValue(EDatabaseVersion4Drivers.PSQL_PRIOR_TO_V9.getVersionValue());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean updateDBVersionValueForImplici(List elementParameter) {
        for (int i = 0; i < elementParameter.size(); i++) {
            final Object object = elementParameter.get(i);
            if (object instanceof ElementParameterTypeImpl) {
                ElementParameterTypeImpl parameterType = (ElementParameterTypeImpl) object;
                String name = parameterType.getName();
                if ("DB_VERSION_IMPLICIT_CONTEXT".equals(name)) {
                    String value = parameterType.getValue();
                    if (value.equals(EDatabaseVersion4Drivers.PSQL_PRIOR_TO_V9.getVersionValue())
                            || value.equals(EDatabaseVersion4Drivers.PSQL_V9_X.getVersionValue())) {
                        // do nothing
                    } else {
                        parameterType.setValue(EDatabaseVersion4Drivers.PSQL_PRIOR_TO_V9.getVersionValue());
                        return true;
                    }
                }
            }
        }
        return false;
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
