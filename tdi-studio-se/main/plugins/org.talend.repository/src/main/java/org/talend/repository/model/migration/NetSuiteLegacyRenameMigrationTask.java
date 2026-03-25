package org.talend.repository.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class NetSuiteLegacyRenameMigrationTask extends AbstractJobMigrationTask {

    final String[] source = { "tNetsuiteConnection", "tNetsuiteInput", "tNetsuiteOutput" };

    final String[] target = { "tNetSuiteLegacyConnection", "tNetSuiteLegacyInput", "tNetSuiteLegacyOutput" };

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        boolean modified = false;
        for (int index = 0; index < source.length; index++) {
            try {
                modified |= ModifyComponentsAction.searchAndRenameComponent(item, processType, source[index],
                        target[index]);
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        return modified ? ExecutionResult.SUCCESS_NO_ALERT : ExecutionResult.NOTHING_TO_DO;
    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2022, GregorianCalendar.DECEMBER, 12, 12, 0, 0);
        return gc.getTime();
    }
}
