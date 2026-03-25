package org.talend.repository.model.migration;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class RedshiftVersion2MigrationTask extends AbstractJobMigrationTask {

    @Override public ExecutionResult execute(final Item item) {
        final ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        String[] compNames = { "tRedshiftBulkExec","tRedshiftConnection","tRedshiftInput","tRedshiftOutput","tRedshiftOutputBulkExec","tRedshiftRow","tRedshiftUnload" }; //$NON-NLS-1$

        IComponentConversion action = node -> {
            if (node == null) {
                return;
            }
            if (ComponentUtilities.getNodeProperty(node, "DRIVER_VERSION") == null ) {
                ComponentUtilities.addNodeProperty(node, "DRIVER_VERSION", "CLOSED_LIST");//$NON-NLS-1$ //$NON-NLS-2$
                ComponentUtilities.getNodeProperty(node, "DRIVER_VERSION")
                        .setValue("DRIVER_V1");//$NON-NLS-1$ //$NON-NLS-2$

            }

        };

        IComponentConversion createTableAction = node -> {
            if (node == null) {
                return;
            }
            if (ComponentUtilities.getNodeProperty(node, "REDSHIFT_DRIVER_VERSION") == null ) {
                ComponentUtilities.addNodeProperty(node, "REDSHIFT_DRIVER_VERSION", "CLOSED_LIST");//$NON-NLS-1$ //$NON-NLS-2$
                ComponentUtilities.getNodeProperty(node, "REDSHIFT_DRIVER_VERSION")
                        .setValue("DRIVER_V1");//$NON-NLS-1$ //$NON-NLS-2$

            }

        };

        boolean modified = false;

        IComponentFilter createTableFilter = new NameComponentFilter("tCreateTable");

        try {
            modified |= ModifyComponentsAction.searchAndModify(item, processType, createTableFilter, Arrays.asList(createTableAction));
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }



        for (String name : compNames) {
            IComponentFilter filter = new NameComponentFilter(name);

            try {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, filter, Arrays.asList(action));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        return modified ? ExecutionResult.SUCCESS_NO_ALERT : ExecutionResult.NOTHING_TO_DO;
    }

    @Override public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2022, Calendar.MARCH, 23, 0, 0, 0);
        return gc.getTime();
    }
}