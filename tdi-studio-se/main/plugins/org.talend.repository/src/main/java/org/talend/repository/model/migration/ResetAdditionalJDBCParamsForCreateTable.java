package org.talend.repository.model.migration;

import java.util.Collections;
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
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;

public class ResetAdditionalJDBCParamsForCreateTable extends AbstractJobMigrationTask{
	
    @Override
    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2019, 1, 24, 12, 0, 0);
        return gc.getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        String componentName = "tCreateTable";
        IComponentConversion resetAdditionalParameter = new IComponentConversion() {

            @Override
            public void transform(NodeType node) {
            	String dbType = ComponentUtilities.getNodePropertyValue(node, "DBTYPE");
            	if (ComponentUtilities.getNodePropertyValue(node, "PROPERTIES") == null) {
            		ComponentUtilities.addNodeProperty(node, "PROPERTIES", "TEXT");
            		ComponentUtilities.setNodeValue(node, "PROPERTIES", "\"\"");
            	} else if ("AS400".equals(dbType) || "MSSQL".equals(dbType)){
            		return;
            	} else {
            		ComponentUtilities.setNodeValue(node, "PROPERTIES", "\"\"");
            	}
            }
        };

        boolean modified = false;
        IComponentFilter componentFilter = new NameComponentFilter(componentName);
        try {
            modified = ModifyComponentsAction.searchAndModify(item, processType, componentFilter,
                    Collections.singletonList(resetAdditionalParameter));
        } catch (PersistenceException e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
        if (modified) {
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }
}
