package org.talend.repository.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;

public class UpdateJobletContextInJobMigrationTask extends AbstractItemMigrationTask {

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2016, 5, 17, 16, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        if (item instanceof ProcessItem) {
            ProcessItem processItem = (ProcessItem) item;
            List<ContextType> contexts = processItem.getProcess().getContext();
            if (contexts.size() > 1) {
                boolean isModified = false;
                for (ContextType context1 : contexts) {
                    List<ContextParameterType> params1 = context1.getContextParameter();
                    for (ContextParameterType param1 : params1) {
                        String id = param1.getRepositoryContextId();
                        if (id != null) {
                            for (ContextType context2 : contexts) {
                                if (context2 != context1) {
                                    List<ContextParameterType> params2 = context2.getContextParameter();
                                    for (ContextParameterType param2 : params2) {
                                        if (param2.getName().equals(param1.getName())
                                                && param2.getRepositoryContextId() == null) {
                                            param2.setRepositoryContextId(id);
                                            isModified = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (isModified) {
                    try {
                        ProxyRepositoryFactory.getInstance().save(item, true);
                    } catch (PersistenceException e) {
                        ExceptionHandler.process(e);
                        return ExecutionResult.FAILURE;
                    }
                    return ExecutionResult.SUCCESS_NO_ALERT;
                }
            }
        }
        return ExecutionResult.NOTHING_TO_DO;
    }

    @Override
    public List<ERepositoryObjectType> getTypes() {
        return ERepositoryObjectType.getAllTypesOfProcess();
    }
}
