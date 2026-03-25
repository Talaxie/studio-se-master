package org.talend.sdk.component.studio.metadata.migration.tcompv0;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class SplunkTcompv0ToTCKMigrationTask extends SimpleTcompv0ToTCKMigrationTask {

    @Override
    protected String getMigrationFile() {
        return "SplunkTcompv0ToTCKMigrationTask.properties";
    }

    @Override
    public ExecutionResult execute(Item item) {
        ExecutionResult basicMigrationResult = super.execute(item);

        boolean modified = false;
        if (basicMigrationResult != ExecutionResult.FAILURE) {
            org.talend.designer.core.model.utils.emf.talendfile.ProcessType processType = getProcessType(item);

            if (item == null || processType == null) {
                return ExecutionResult.NOTHING_TO_DO;
            }


            try {
                //need a migration to set $maxBatchSize to 1 if no extended output was used
                IComponentFilter filter = new NameComponentFilter("SplunkEventCollector");
                modified |= migrateEventBatchSize(item, processType, filter);
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        if (modified) {
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return basicMigrationResult;
        }
    }

    private boolean migrateEventBatchSize(Item item, ProcessType processType, IComponentFilter filter)
            throws PersistenceException {
        return ModifyComponentsAction.searchAndModify(item, processType, filter,
                Arrays.asList(node -> {
                    String hiddenCheckboxValue =
                            ComponentUtilities.getNodePropertyValue(node, "configuration.extendedOutput");
                    if (!"TRUE".equalsIgnoreCase(hiddenCheckboxValue)) {
                        ComponentUtilities.setNodeValue(node, "configuration.$maxBatchSize", "1");
                    }
                }));
    }

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2023, Calendar.JULY, 20, 16, 0, 0).getTime();
    }
}
