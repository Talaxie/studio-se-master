package org.talend.repository.model.migration;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.map.MultiKeyMap;
import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.JobletProcessItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;

public class RemoveDuplicateContextReferencesMigrationTask extends AbstractItemMigrationTask {

    private boolean modified = false;
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 3, 20, 12, 0, 0);
        return gc.getTime();
    }

    @SuppressWarnings("unchecked")
    @Override
    public ExecutionResult execute(Item item) {
        modified = false;
        EList<ContextType> contexts = null;
        if (item instanceof ProcessItem) {
            ProcessItem processItem = (ProcessItem) item;
            contexts = processItem.getProcess().getContext();
        } else if (item instanceof JobletProcessItem) {
            JobletProcessItem jobletItem = (JobletProcessItem) item;
            contexts = jobletItem.getJobletProcess().getContext();
        }
        try {
            if (!contexts.isEmpty()) {
                distinct(contexts);
                if(modified) {
                    ProxyRepositoryFactory.getInstance().save(item, true);
                    return ExecutionResult.SUCCESS_NO_ALERT;
                }
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
        return ExecutionResult.NOTHING_TO_DO;
    }

    @SuppressWarnings("unchecked")
    private void distinct(EList<ContextType> contexts) {
        contexts.forEach(context -> {
            EList<ContextParameterType> params = context.getContextParameter();
            List<ContextParameterType> toRemove = new ArrayList<>();
            MultiKeyMap map = new MultiKeyMap();
            params.forEach(param -> {
                if (!map.containsKey(param.getName(), param.getRepositoryContextId())) {
                    map.put(param.getName(), param.getRepositoryContextId(), null);
                } else {
                    toRemove.add(param);
                }
            });
            params.removeAll(toRemove);
            if(!toRemove.isEmpty()) {
                modified = true;
            }
        });
    }

    @Override
    public List<ERepositoryObjectType> getTypes() {
        return Stream.concat(ERepositoryObjectType.getAllTypesOfProcess().stream(),
                ERepositoryObjectType.getAllTypesOfJoblet().stream()).collect(Collectors.toList());
    }

}
