package org.talend.repository.model.migration;

import java.util.Date;
import java.util.GregorianCalendar;

import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ConnectionType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.migration.IMigrationTask.ExecutionResult;

public class MoveStartsLinkFromPartitionerToDepartitioner extends AbstractJobMigrationTask {
	
    private static final String STARTS_CONNECTOR_NAME = "STARTS"; //$NON-NLS-1$

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.migration.IProjectMigrationTask#execute(org.talend.core.model.general.Project)
     */
    @Override
	public ExecutionResult execute(Item item) {
        try {
            boolean modified = replaceConnections(item);
            if (modified) {
                return ExecutionResult.SUCCESS_WITH_ALERT;
            } else {
                return ExecutionResult.SUCCESS_NO_ALERT;
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
    }

    public boolean replaceConnections(Item item) throws PersistenceException {
		ProcessType processType = getProcessType(item);
		if (processType == null) {
			return false;
		}
        ProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();

        boolean replaceDone = false;
        boolean modified = false;

        for (Object o : processType.getConnection()) {

            ConnectionType currentConnection = (ConnectionType) o;
            
            if (currentConnection.getConnectorName() != null && STARTS_CONNECTOR_NAME.equals(currentConnection.getConnectorName())) {
            	String source = currentConnection.getSource();
                String target = currentConnection.getTarget();
                NodeType recollectorNode = null;
                NodeType departitionerNode = null;
                NodeType partitionerNode = null;
                for (Object obj : processType.getNode()) {
                	NodeType currentNode = (NodeType)obj;
                	if (currentNode.getComponentName().equals("tPartitioner") && source.equals(ComponentUtilities.getNodeUniqueName(currentNode))) {
                		partitionerNode = currentNode;
                	} else if (currentNode.getComponentName().equals("tRecollector") && target.equals(ComponentUtilities.getNodeUniqueName(currentNode))) {
                		recollectorNode = currentNode;
                	}
                }
                if (recollectorNode != null && partitionerNode != null) {
                	//know we need to migrate this one.
                	ElementParameterType linkedDepartitioner = ComponentUtilities.getNodeProperty(recollectorNode, "DEPART_COMPONENT");
                	currentConnection.setSource(linkedDepartitioner.getValue());
                	modified = true;
                }
            }
        }
        if (modified) {
            factory.save(item,true);
            replaceDone = true;
        }
        return replaceDone;
    }

    public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2013, 1, 21, 12, 0, 0);
        return gc.getTime();
    }
}
