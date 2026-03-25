package org.talend.designer.esb.webservice.ws.wsdlinfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

/**
 * 
 * @author gcui
 */
public class ServiceInfo {

    /** server name */
    private QName serviceName;

    /** The list of operations that this service defines. */
    private final List<OperationInfo> operations = new ArrayList<OperationInfo>();

	public QName getServerName() {
        return serviceName;
    }

    public void setServiceName(QName name) {
        this.serviceName = name;
    }

    public Collection<OperationInfo> getOperations() {
        return operations;
    }

    public void addOperation(OperationInfo operation) {
        operations.add(operation);
    }

}
