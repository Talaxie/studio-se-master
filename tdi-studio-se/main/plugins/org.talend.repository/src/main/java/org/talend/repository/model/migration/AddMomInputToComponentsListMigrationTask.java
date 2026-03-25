package org.talend.repository.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import java.util.Iterator;


public class AddMomInputToComponentsListMigrationTask extends AbstractJobMigrationTask{
	

	private static final ProxyRepositoryFactory FACTORY = ProxyRepositoryFactory
	.getInstance();
	
    public ExecutionResult execute(Item item) {
		try {
			setComponenrListValue(item);
		} catch (Exception e) {
			ExceptionHandler.process(e);
			return ExecutionResult.FAILURE;
		}
		return ExecutionResult.SUCCESS_NO_ALERT;    	
    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2009, 9, 30, 15, 41, 10);
        return gc.getTime();
    }

	private void setComponenrListValue(Item item) throws PersistenceException  {
		if (item instanceof ProcessItem) {
			ProcessType processType = ((ProcessItem) item).getProcess();
			for (Object o : processType.getNode()) {
				if (o instanceof NodeType) {
					NodeType currentNode = (NodeType) o;
					if ("tMomCommit".equals(currentNode.getComponentName()) ||
						"tMomRollback".equals(currentNode.getComponentName())) {
						EList elements = currentNode.getElementParameter();
						Iterator iterator = elements.iterator();
						while (iterator.hasNext()) {
							ElementParameterType elementParameter = (ElementParameterType) iterator
									.next();
							if ("CONNECTION".equals(elementParameter.getName())) {
								if (elementParameter.getValue().isEmpty()){
									elementParameter.setValue(getFirstMomInput(item));
								}
							}
						}
					}
				}
			}
			FACTORY.save(item, true);
		}
	}

	private String getFirstMomInput(Item item) {
		// TODO Auto-generated method stub
		if (item instanceof ProcessItem) {
			ProcessType processType = ((ProcessItem) item).getProcess();
			for (Object o : processType.getNode()) {
				if (o instanceof NodeType) {
					NodeType currentNode = (NodeType) o;
					if ("tMomInput".equals(currentNode.getComponentName()) ) {
						EList elements = currentNode.getElementParameter();
						Iterator iterator = elements.iterator();
						while (iterator.hasNext()) {
							ElementParameterType elementParameter = (ElementParameterType) iterator
									.next();
							if ("UNIQUE_NAME".equals(elementParameter.getName())) {
								return elementParameter.getValue();
								}
							}
						}
					}
				}
			}
		return "";
	}
    
}
