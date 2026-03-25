package org.talend.repository.model.migration;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

/**
 * https://jira.talendforge.org/browse/TDI-45946
 */
public class ReplaceMappingForGreenplumDatabaseMigrationTask extends AbstractJobMigrationTask {

    // property names
    public static final String DB_DRIVER = "DB_DRIVER";
    public static final String MAPPING = "MAPPING";

    // values
    public static final String DB_PROPERTY_GREENPLUM = "GREENPLUM";
    public static final String MAPPING_POSTGRES_ID = "postgres_id";
    public static final String MAPPING_GREENPLUM_ID = "greenplum_id";

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        // the list with components that should be migrated
        final List<NameComponentFilter> componentNames = Stream.of(
                        "tGreenplumInput",
                        "tGreenplumOutput",
                        "tGreenplumBulkExec",
                        "tGreenplumGPLoad",
                        "tGreenplumOutputBulkExec"
                ).map(NameComponentFilter::new)
                .collect(Collectors.toList());


        IComponentConversion updateGreenplumMapping = node -> {
            ElementParameterType dbDriverProperty = ComponentUtilities.getNodeProperty(node, DB_DRIVER);
            if (dbDriverProperty != null && DB_PROPERTY_GREENPLUM.equals(dbDriverProperty.getValue())) {
                ElementParameterType mappingProperty = ComponentUtilities.getNodeProperty(node, MAPPING);
                if (mappingProperty != null && MAPPING_POSTGRES_ID.equals(mappingProperty.getValue())) {
                    mappingProperty.setValue(MAPPING_GREENPLUM_ID);
                }
            }
        };

        try {
            boolean modified = false;
            for (NameComponentFilter filter : componentNames) {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, filter, Collections.singletonList(updateGreenplumMapping));
            }

            return modified ? ExecutionResult.SUCCESS_NO_ALERT : ExecutionResult.NOTHING_TO_DO;
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
    }

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2021, Calendar.MAY, 5, 7, 31, 0);
        return gc.getTime();
    }

}
