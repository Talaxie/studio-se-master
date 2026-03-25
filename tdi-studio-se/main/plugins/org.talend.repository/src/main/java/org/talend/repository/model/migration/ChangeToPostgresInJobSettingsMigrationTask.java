package org.talend.repository.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.database.EDatabaseTypeName;
import org.talend.core.database.conn.version.EDatabaseVersion4Drivers;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.impl.ElementParameterTypeImpl;

public class ChangeToPostgresInJobSettingsMigrationTask extends AbstractJobMigrationTask {

    public ChangeToPostgresInJobSettingsMigrationTask() {
    }

    private static final ProxyRepositoryFactory FACTORY = ProxyRepositoryFactory.getInstance();

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.migration.IMigrationTask#getOrder()
     */
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 10, 24, 12, 0, 0);
        return gc.getTime();
    }

    private boolean updateDBVersionValue(EList elementParameter) {
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

    private boolean updateDBTypeWhenUseImplicit(EList elementParameter) {
        for (int i = 0; i < elementParameter.size(); i++) {
            final Object object = elementParameter.get(i);
            if (object instanceof ElementParameterTypeImpl) {
                ElementParameterTypeImpl parameterType = (ElementParameterTypeImpl) object;
                String name = parameterType.getName();
                if ("DB_TYPE_IMPLICIT_CONTEXT".equals(name) && parameterType.getValue().startsWith("tPostgresPlus")) {
                    parameterType.setValue(EDatabaseTypeName.PSQL.getDbType());
                    for (int j = 0; j < elementParameter.size(); j++) {
                        final Object innerObject = elementParameter.get(j);
                        if (innerObject instanceof ElementParameterTypeImpl) {
                            ElementParameterTypeImpl innerParameterType = (ElementParameterTypeImpl) innerObject;
                            String innerName = innerParameterType.getName();
                            if ("DB_VERSION_IMPLICIT_CONTEXT".equals(innerName)) {
                                String value = innerParameterType.getValue();
                                if (value.equals(EDatabaseVersion4Drivers.PSQL_PRIOR_TO_V9.getVersionValue())
                                        || value.equals(EDatabaseVersion4Drivers.PSQL_V9_X.getVersionValue())) {
                                    // do nothing
                                } else {
                                    innerParameterType.setValue(EDatabaseVersion4Drivers.PSQL_PRIOR_TO_V9.getVersionValue());
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.migration.AbstractItemMigrationTask#execute(org.talend.core.model.properties.Item)
     */
    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (processType.getParameters() != null) {
            @SuppressWarnings("rawtypes")
            EList elementParameter = processType.getParameters().getElementParameter();
            boolean modified = false;
            for (int i = 0; i < elementParameter.size(); i++) {

                final Object object = elementParameter.get(i);
                if (object instanceof ElementParameterTypeImpl) {
                    ElementParameterTypeImpl parameterType = (ElementParameterTypeImpl) object;
                    String name = parameterType.getName();
                    if ("FROM_DATABASE_FLAG_IMPLICIT_CONTEXT".equals(name) && parameterType.getValue().equalsIgnoreCase("true")) {
                        modified = updateDBTypeWhenUseImplicit(elementParameter) || modified;
                    }
                    if ("DB_TYPE".equals(name) && parameterType.getValue().startsWith("tPostgresPlus")) { //$NON-NLS-1$
                        modified = true;
                        parameterType.setValue(EDatabaseTypeName.PSQL.getDbType());
                        modified = updateDBVersionValue(elementParameter) || modified;
                    }
                }
            }
            if (modified) {
                try {
                    FACTORY.save(item, true);
                    return ExecutionResult.SUCCESS_NO_ALERT;
                } catch (PersistenceException e) {
                    ExceptionHandler.process(e);
                    return ExecutionResult.FAILURE;
                }
            }
        }
        return ExecutionResult.NOTHING_TO_DO;
    }
}
