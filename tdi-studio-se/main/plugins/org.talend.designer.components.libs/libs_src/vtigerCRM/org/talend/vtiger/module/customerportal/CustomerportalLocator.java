/**
 * CustomerportalLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.vtiger.module.customerportal;

public class CustomerportalLocator extends org.apache.axis.client.Service implements org.talend.vtiger.module.customerportal.Customerportal {
	
	private String serverAddr;
	
	private String port;

    public CustomerportalLocator(String serverAddr,String port) {
    	this.serverAddr = serverAddr;
    	this.port = port;
    	customerportalPort_address = "http://" + serverAddr + ":" + port + "/vtigerservice.php";
    }


    public CustomerportalLocator(org.apache.axis.EngineConfiguration config, String serverAddr, String port) {
    	super(config);
        this.serverAddr = serverAddr;
        this.port = port;
        customerportalPort_address = "http://" + serverAddr + ":" + port + "/vtigerservice.php";
    }

    public CustomerportalLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName, String serverAddr, String port) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
        this.serverAddr = serverAddr;
        this.port = port;
        customerportalPort_address = "http://" + serverAddr + ":" + port + "/vtigerservice.php";
    }
    
    private String customerportalPort_address;

    public java.lang.String getcustomerportalPortAddress() {
        return customerportalPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String customerportalPortWSDDServiceName = "customerportalPort";

    public java.lang.String getcustomerportalPortWSDDServiceName() {
        return customerportalPortWSDDServiceName;
    }

    public void setcustomerportalPortWSDDServiceName(java.lang.String name) {
        customerportalPortWSDDServiceName = name;
    }

    public org.talend.vtiger.module.customerportal.CustomerportalPortType getcustomerportalPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(customerportalPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcustomerportalPort(endpoint);
    }

    public org.talend.vtiger.module.customerportal.CustomerportalPortType getcustomerportalPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.talend.vtiger.module.customerportal.CustomerportalBindingStub _stub = new org.talend.vtiger.module.customerportal.CustomerportalBindingStub(portAddress, this, serverAddr);
            _stub.setPortName(getcustomerportalPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcustomerportalPortEndpointAddress(String serverAddr, String port) {
        customerportalPort_address = "http://" + serverAddr + ":" + port + "/vtigerservice.php";
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.talend.vtiger.module.customerportal.CustomerportalPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.talend.vtiger.module.customerportal.CustomerportalBindingStub _stub = new org.talend.vtiger.module.customerportal.CustomerportalBindingStub(new java.net.URL(customerportalPort_address), this, serverAddr);
                _stub.setPortName(getcustomerportalPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("customerportalPort".equals(inputPortName)) {
            return getcustomerportalPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://" + serverAddr + "/soap/customerportal", "customerportal");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://" + serverAddr + "/soap/customerportal", "customerportalPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String serverAddr, String port) throws javax.xml.rpc.ServiceException {
        
    	if ("customerportalPort".equals(portName)) {
            setcustomerportalPortEndpointAddress(serverAddr,port);
        }
        else 
        { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String serverAddr, String port) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), serverAddr, port);
    }

}
