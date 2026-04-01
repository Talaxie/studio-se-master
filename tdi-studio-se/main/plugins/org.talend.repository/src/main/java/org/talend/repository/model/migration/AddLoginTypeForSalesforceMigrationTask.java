package org.talend.repository.model.migration;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.model.metadata.builder.connection.SalesforceSchemaConnection;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.SalesforceSchemaConnectionItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.migration.IMigrationTask.ExecutionResult;

public class AddLoginTypeForSalesforceMigrationTask extends AbstractJobMigrationTask {

    private static final String BASIC = "basic";

    ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();

    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        toReturn.add(ERepositoryObjectType.METADATA_SALESFORCE_SCHEMA);

        return toReturn;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.migration.IMigrationTask#getOrder()
     */
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2013, 11, 25, 11, 0, 0);
        return gc.getTime();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.migration.AbstractItemMigrationTask#execute(org.talend.core.model.properties.Item)
     */
    @Override
    public ExecutionResult execute(Item item) {
        if (item instanceof SalesforceSchemaConnectionItem) {
            SalesforceSchemaConnectionItem connectionItem = (SalesforceSchemaConnectionItem) item;
            SalesforceSchemaConnection connection = (SalesforceSchemaConnection) connectionItem.getConnection();
            if (connection instanceof SalesforceSchemaConnection) {
                boolean modified = false;
                if (connection.getLoginType() == null) {
                    connection.setLoginType(BASIC);
                    modified = true;
                }
                if (modified) {
                    try {
                        factory.save(item, true);
                        return ExecutionResult.SUCCESS_WITH_ALERT;
                    } catch (Exception e) {
                        ExceptionHandler.process(e);
                        return ExecutionResult.FAILURE;
                    }
                }
            }
        }
        return ExecutionResult.NOTHING_TO_DO;
    }

}
