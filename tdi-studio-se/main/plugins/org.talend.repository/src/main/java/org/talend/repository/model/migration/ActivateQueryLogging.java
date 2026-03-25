package org.talend.repository.model.migration;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

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

public class ActivateQueryLogging extends AbstractJobMigrationTask {

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2015, 06, 05, 16, 0, 0).getTime();
    }

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        
        List<String> filterList = Arrays.asList(
        		"tELTTeradataMap","tTeradataConnection","tTeradataInput","tTeradataOutput","tTeradataRow"
        		);
        
        IComponentConversion correctBatchModeForDBComponents = new IComponentConversion() {
			public void transform(NodeType node) {
				ElementParameterType queryBand = ComponentUtilities.getNodeProperty(node, "QUERY_BAND");
				ElementParameterType activateQueryLogging = ComponentUtilities.getNodeProperty(node, "ACTIVATE_QUERY_LOGGING");
				
				if(activateQueryLogging == null){
                    ComponentUtilities.addNodeProperty(node, "ACTIVATE_QUERY_LOGGING", "CHECK");
                    if(queryBand != null){
    	                boolean queryBandActived = "true".equalsIgnoreCase(queryBand.getValue());
    	                if(queryBandActived){
    	                	ComponentUtilities.getNodeProperty(node, "ACTIVATE_QUERY_LOGGING").setValue("true");
    	                }
    				}
				}
				
			}
		};
		
		for(String componentName: filterList){
			IComponentFilter filter = new NameComponentFilter(componentName);
			try {
				ModifyComponentsAction
						.searchAndModify(
								item,
								processType,
								filter,
								Arrays.<IComponentConversion> asList(correctBatchModeForDBComponents));
			} catch (PersistenceException e) {
				ExceptionHandler.process(e);
				return ExecutionResult.FAILURE;
			}
		}
		
        return ExecutionResult.SUCCESS_NO_ALERT;
    }

}
