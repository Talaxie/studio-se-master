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
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class RemoveDestinationPropertyExtractJSONFieldsMigrationTask extends AbstractJobMigrationTask {

    @Override
    public ExecutionResult execute(final Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        final String componentNameToAffect = "tExtractJSONFields";

        IComponentConversion removeDestinationProp = new IComponentConversion() {
            @Override
            public void transform(final NodeType nodeType) {
                ElementParameterType destination = ComponentUtilities.getNodeProperty(nodeType, "DESTINATION");

                if (destination != null) {
                    nodeType.getElementParameter().remove(destination);
                }
            }
        };

        IComponentFilter componentFilter = new NameComponentFilter(componentNameToAffect);

        try {
            boolean modified = ModifyComponentsAction.searchAndModify(item, processType,
                    componentFilter, Arrays.asList(removeDestinationProp));

            return modified ? ExecutionResult.SUCCESS_NO_ALERT : ExecutionResult.NOTHING_TO_DO;
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
    }

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2022, Calendar.APRIL, 29).getTime();
    }
}
