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

public class TSendMailOAuthMigrationTask extends AbstractJobMigrationTask {

    @Override public ExecutionResult execute(final Item item) {
        final ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        String[] compNames = { "tSendMail"}; //$NON-NLS-1$

        IComponentConversion action = node -> {
            if (node == null) {
                return;
            }
            if (ComponentUtilities.getNodeProperty(node, "AUTH_MODE") == null ) {
                    ComponentUtilities.addNodeProperty(node, "AUTH_MODE", "CLOSED_LIST");//$NON-NLS-1$ //$NON-NLS-2$
                boolean needAuth = "true".equals(ComponentUtilities.getNodeProperty(node,
                        "NEED_AUTH").getValue());
                    ComponentUtilities.getNodeProperty(node, "AUTH_MODE")
                            .setValue(needAuth?"BASIC":"NO_AUTH");//$NON-NLS-1$ //$NON-NLS-2$

            }

        };


        boolean modified = false;
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
        GregorianCalendar gc = new GregorianCalendar(2022, Calendar.JULY, 12, 0, 0, 0);
        return gc.getTime();
    }
}