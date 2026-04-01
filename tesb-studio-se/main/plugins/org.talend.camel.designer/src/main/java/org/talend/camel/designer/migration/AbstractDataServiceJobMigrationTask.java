package org.talend.camel.designer.migration;

import java.util.ArrayList;
import java.util.List;

import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.repository.ERepositoryObjectType;

/**
 * DOC rdubois class global comment. Detailled comment This job migration extension allows to migrate any type of
 * process.
 */
public abstract class AbstractDataServiceJobMigrationTask extends AbstractJobMigrationTask {

    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        toReturn.add(ERepositoryObjectType.PROCESS);
        return toReturn;
    }
}
