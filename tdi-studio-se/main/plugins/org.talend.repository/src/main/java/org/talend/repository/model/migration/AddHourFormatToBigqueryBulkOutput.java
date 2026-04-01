package org.talend.repository.model.migration;

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
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

public class AddHourFormatToBigqueryBulkOutput extends AbstractJobMigrationTask {

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, 8, 28, 14, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        String [] componentsNameToAffect = new String [] {
                "tBigQueryOutput"
        };

        IComponentConversion use12HourFormatConversion = new IComponentConversion() {

            @Override
            public void transform(NodeType node) {
                String use12HourFormat = ComponentUtilities.getNodePropertyValue(node, "USE_12_HOUR_FORMAT");
                if (use12HourFormat == null) {
                    ComponentUtilities.addNodeProperty(node, "USE_12_HOUR_FORMAT", "CHECK");
                    ComponentUtilities.getNodeProperty(node, "USE_12_HOUR_FORMAT").setValue("true");
                }

            }
        };

        boolean modified = false;

        for (String componentName : componentsNameToAffect) {
            IComponentFilter componentFilter = new NameComponentFilter(componentName);
            try {
                modified = modified | ModifyComponentsAction.searchAndModify(item, processType, componentFilter,
                        Collections.singletonList(use12HourFormatConversion));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        return modified ? ExecutionResult.SUCCESS_NO_ALERT : ExecutionResult.NOTHING_TO_DO;
    }

}
