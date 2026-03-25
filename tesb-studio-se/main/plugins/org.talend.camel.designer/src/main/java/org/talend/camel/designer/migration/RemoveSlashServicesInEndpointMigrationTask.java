// ============================================================================
package org.talend.camel.designer.migration;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.migration.AbstractItemMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.migration.MigrationReportRecorder;

public class RemoveSlashServicesInEndpointMigrationTask extends AbstractItemMigrationTask {

    final private String prefix = "\"/services";
    final private Map<String, String> nodeNameEndpointNameMap = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;
        {
            put("cSOAP", "ADDRESS");
            put("cREST", "URL");
            put("tRESTRequest", "REST_ENDPOINT");
        }
    };

    @Override
    public List<ERepositoryObjectType> getTypes() {
        List<ERepositoryObjectType> toReturn = new ArrayList<ERepositoryObjectType>();
        toReturn.add(ERepositoryObjectType.PROCESS);
        toReturn.add(ERepositoryObjectType.JOBLET);
        toReturn.add(ERepositoryObjectType.TEST_CONTAINER);
        toReturn.add(ERepositoryObjectType.PROCESS_ROUTE);
        toReturn.add(ERepositoryObjectType.PROCESS_ROUTE_DESIGN);
        toReturn.add(ERepositoryObjectType.PROCESS_ROUTE_MICROSERVICE);
        toReturn.add(ERepositoryObjectType.PROCESS_ROUTELET);
        return toReturn;
    }

    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = null;
        if (item instanceof ProcessItem) {
            processType = ((ProcessItem) item).getProcess();
        }

        if (null == processType || processType.getNode().isEmpty()) {
            return ExecutionResult.NOTHING_TO_DO;
        }

        boolean modified = false;
        for (Object o : processType.getNode()) {
            if (o instanceof NodeType) {
                NodeType currentNode = (NodeType) o;
                String componentName = currentNode.getComponentName();
                if (nodeNameEndpointNameMap.keySet().contains(componentName)) {
                    modified |= removeSlashServicesInEndpoint(currentNode, item);
                }
            }
        }

        if (modified) {
            try {
                ProxyRepositoryFactory.getInstance().save(item);
            } catch (PersistenceException e) {
                ExceptionHandler.process(e);
                return ExecutionResult.FAILURE;
            }
            return ExecutionResult.SUCCESS_NO_ALERT;
        } else {
            return ExecutionResult.NOTHING_TO_DO;
        }
    }

    @Override
    public Date getOrder() {
        return new GregorianCalendar(2022, 03, 03, 00, 00, 00).getTime();
    }

    private boolean needKeepEndpoint(String endpoint) {
        return endpoint.startsWith("\"http://") || endpoint.startsWith("\"https://") || endpoint.startsWith("context.");
    }

    private boolean removeSlashServicesInEndpoint(NodeType currentNode, Item item) {
        boolean modified = false;
        String nodeName = currentNode.getComponentName();
        String endpointEleName = nodeNameEndpointNameMap.get(nodeName);

        for (Object e : currentNode.getElementParameter()) {
            ElementParameterType p = (ElementParameterType) e;
            if (p.getName().equals(endpointEleName)) {
                String endpoint = p.getValue().replace(" ", "");
                // will keep absolute URL as it is. Only remove relative URL's first
                // "/services".
                if (!needKeepEndpoint(endpoint) && endpoint.startsWith(prefix)) {
                    String newEndpoint = "\"" + endpoint.substring(prefix.length());
                    p.setValue(newEndpoint);
                    modified = true;
                    generateReportRecord(
                            new MigrationReportRecorder(this, MigrationReportRecorder.MigrationOperationType.MODIFY,
                                    item, currentNode, "Endpoint", endpoint, newEndpoint));
                }
            }
        }
        return modified;
    }
}