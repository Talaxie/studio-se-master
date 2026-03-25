package org.talend.repository.model.migration;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
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

public class UpdateDynamicSettingsForEsbComponents extends AbstractJobMigrationTask {

    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2023, 8, 28, 12, 10, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        final ProcessType processType = getProcessType(item);
        String[] compNames = { "tRESTClient", "tESBConsumer"}; //$NON-NLS-1$

        IComponentConversion action = new IComponentConversion() {

            public void transform(NodeType node) {
                if (node == null) {
                    return;
                }

                ElementParameterType property = ComponentUtilities.getNodeProperty(node, "AUTH_TYPE");//$NON-NLS-1$
                if (property != null) {
                    property.unsetContextMode();
                    String value = ComponentUtilities.getNodePropertyValue(node, "AUTH_TYPE"); //$NON-NLS-1$
                    String newValue = value.replace("\"", "");
                    ComponentUtilities.setNodeValue(node, "AUTH_TYPE", newValue);//$NON-NLS-1$ //$NON-NLS-2$
                }
            }

        };

        boolean modified = false;
        for (String name : compNames) {
            IComponentFilter filter = new NameComponentFilter(name);

            try {
                modified |= ModifyComponentsAction.searchAndModify(item, processType, filter, Arrays.<IComponentConversion> asList(action));
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
        }

        return modified ? ExecutionResult.SUCCESS_NO_ALERT : ExecutionResult.NOTHING_TO_DO;
    }

}
