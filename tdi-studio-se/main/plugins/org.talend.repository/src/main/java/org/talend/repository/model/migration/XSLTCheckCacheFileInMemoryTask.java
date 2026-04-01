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

public class XSLTCheckCacheFileInMemoryTask extends AbstractJobMigrationTask {

    @Override public ExecutionResult execute(final Item item) {
        final ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        String[] compNames = { "tXSLT" }; //$NON-NLS-1$

        IComponentConversion action = node -> {
            if (node == null) {
                return;
            }
            if (ComponentUtilities.getNodeProperty(node, "XML_FILE") != null && ComponentUtilities.getNodeProperty(node,
                    "XML_FILE").getValue().equals(ComponentUtilities.getNodeProperty(node, "OUTPUT_FILE").getValue())) {

                if (ComponentUtilities.getNodeProperty(node, "CACHE_SOURCE") == null) {//$NON-NLS-1$
                    ComponentUtilities.addNodeProperty(node, "CACHE_SOURCE", "CHECK");//$NON-NLS-1$ //$NON-NLS-2$
                    ComponentUtilities.getNodeProperty(node, "CACHE_SOURCE")
                            .setValue("true");//$NON-NLS-1$ //$NON-NLS-2$
                }
            }

        };

        boolean modified = false;

        for (String name : compNames) {
            IComponentFilter filter = new NameComponentFilter(name);

            try {
                modified = ModifyComponentsAction.searchAndModify(item, processType, filter, Arrays.asList(action));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        return modified ? ExecutionResult.SUCCESS_NO_ALERT : ExecutionResult.NOTHING_TO_DO;
    }

    @Override public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, Calendar.DECEMBER, 14, 0, 0, 0);
        return gc.getTime();
    }
}