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
import org.talend.core.model.general.Project;
import org.talend.core.model.properties.ImplicitContextSettings;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.StatAndLogsSettings;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ParametersType;
import org.talend.designer.core.model.utils.emf.talendfile.impl.ElementParameterTypeImpl;
import org.talend.migration.AbstractMigrationTask;
import org.talend.migration.IProjectMigrationTask;
import org.talend.repository.model.IProxyRepositoryFactory;

/**
 * created by hcyi on Sep 12, 2023
 * Detailled comment
 *
 */
public class RenameDBTypeInProjectSettingsMigrationTask extends AbstractMigrationTask implements IProjectMigrationTask {

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
                if (object instanceof ElementParameterType) {
                    ElementParameterType parameterType = (ElementParameterType) object;
                    String name = parameterType.getName();
                    // variable name used for Stat&Logs
                    if ("DB_TYPE".equals(name)) { //$NON-NLS-1$
                        try {
                            if (renameValueIfNeeded(parameterType)) {
                                modified = true;
                            }
                        } catch (Exception e) {
                            ExceptionHandler.process(e);
                            return ExecutionResult.FAILURE;
                        }
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
                    ElementParameterType parameterType = (ElementParameterType) object;
                    String name = parameterType.getName();
                    // variable name used for implicit context
                    if ("DB_TYPE_IMPLICIT_CONTEXT".equals(name)) { //$NON-NLS-1$
                        try {
                            if (renameValueIfNeeded(parameterType)) {
                                modified = true;
                            }
                        } catch (Exception e) {
                            ExceptionHandler.process(e);
                            return ExecutionResult.FAILURE;
                        }
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

    private boolean renameValueIfNeeded(ElementParameterType param) throws Exception {
        try {
            String paramValue = param.getValue();
            if (paramValue != null && paramValue.startsWith("tJDBC")) { //$NON-NLS-1$
                param.setValue(paramValue.substring(1));
                return true;
            }
        } catch (Exception e) {
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

    /*
     * (non-Javadoc)
     *
     * @see org.talend.migration.IMigrationTask#getOrder()
     */
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 9, 12, 12, 0, 0);
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
}

