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
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class SetDieOnErrorFalse4tSCPDelete extends AbstractJobMigrationTask {

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2014, 9, 01, 14, 0, 0).getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        IComponentFilter filter = new NameComponentFilter("tSCPDelete");
        try {
            ModifyComponentsAction.searchAndModify(item, processType, filter,
                    Arrays.<IComponentConversion> asList(new IComponentConversion() {
                        @Override
                        public void transform(NodeType node) {
                            if (ComponentUtilities.getNodeProperty(node, "DIE_ON_ERROR") == null) {
                                ComponentUtilities.addNodeProperty(node, "DIE_ON_ERROR", "CHECK");                               
                           }
                               ComponentUtilities.getNodeProperty(node, "DIE_ON_ERROR").setValue("false");
                        }
                    }));           
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }

        return ExecutionResult.SUCCESS_NO_ALERT;

    }
}