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

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.runtime.model.emf.EmfHelper;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * created by hcyi on Sep 12, 2023
 * Detailled comment
 *
 */
public class RenameDBTypeInJobSettingsMigrationTask extends AbstractItemMigrationTask {

    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        toReturn.add(ERepositoryObjectType.PROCESS);
        return toReturn;
    }

    public ProcessType getProcessType(Item item) {
        ProcessType processType = null;
        if (item instanceof ProcessItem) {
            processType = ((ProcessItem) item).getProcess();
        }
        if (processType != null) {
            EmfHelper.visitChilds(processType);
        }
        return processType;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.core.model.migration.AbstractItemMigrationTask#execute(org.talend.core.model.properties.Item)
     */
    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        try {
            boolean modified = false;
            if (processType.getParameters() != null) {
                for (Object oElemParam : processType.getParameters().getElementParameter()) {
                    ElementParameterType param = (ElementParameterType) oElemParam;

                    // variable name used for Stat&Logs
                    if ("DB_TYPE".equals(param.getName())) { //$NON-NLS-1$
                        modified = renameValueIfNeeded(param);
                    }

                    // variable name used for implicit context
                    if ("DB_TYPE_IMPLICIT_CONTEXT".equals(param.getName())) { //$NON-NLS-1$
                        modified = renameValueIfNeeded(param);
                    }
                }
            }
            if (modified) {
                ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
                factory.save(item, true);
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }

        return ExecutionResult.SUCCESS_NO_ALERT;
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
     * @see org.talend.migration.IMigrationTask#getOrder()
     */
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 9, 12, 12, 0, 0);
        return gc.getTime();
    }
}