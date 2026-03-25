/**
 * SugarsoapLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public class SugarsoapLocator extends org.apache.axis.client.Service implements org.talend.sugarws.Sugarsoap {

    public SugarsoapLocator() {
    }


    public SugarsoapLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SugarsoapLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for sugarsoapPort
    private java.lang.String sugarsoapPort_address = "http://127.0.0.1:80/sugarcrm/soap.php";

    public java.lang.String getsugarsoapPortAddress() {
        return sugarsoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String sugarsoapPortWSDDServiceName = "sugarsoapPort";

    public java.lang.String getsugarsoapPortWSDDServiceName() {
        return sugarsoapPortWSDDServiceName;
    }

    public void setsugarsoapPortWSDDServiceName(java.lang.String name) {
        sugarsoapPortWSDDServiceName = name;
    }

    public org.talend.sugarws.SugarsoapPortType getsugarsoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(sugarsoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsugarsoapPort(endpoint);
    }

    public org.talend.sugarws.SugarsoapPortType getsugarsoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.talend.sugarws.SugarsoapBindingStub _stub = new org.talend.sugarws.SugarsoapBindingStub(portAddress, this);
            _stub.setPortName(getsugarsoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsugarsoapPortEndpointAddress(java.lang.String address) {
        sugarsoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.talend.sugarws.SugarsoapPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.talend.sugarws.SugarsoapBindingStub _stub = new org.talend.sugarws.SugarsoapBindingStub(new java.net.URL(sugarsoapPort_address), this);
                _stub.setPortName(getsugarsoapPortWSDDServiceName());
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
        if ("sugarsoapPort".equals(inputPortName)) {
            return getsugarsoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "sugarsoap");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.sugarcrm.com/sugarcrm", "sugarsoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("sugarsoapPort".equals(portName)) {
            setsugarsoapPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
