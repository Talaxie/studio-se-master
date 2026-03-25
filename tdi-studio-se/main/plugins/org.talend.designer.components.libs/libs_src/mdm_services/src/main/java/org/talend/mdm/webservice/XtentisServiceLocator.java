/**
 * XtentisServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class XtentisServiceLocator extends org.apache.axis.client.Service implements org.talend.mdm.webservice.XtentisService {

    public XtentisServiceLocator() {
    }


    public XtentisServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public XtentisServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for XtentisPort
    private java.lang.String XtentisPort_address = "http://127.0.0.1:8180/talend/TalendPort";

    public java.lang.String getXtentisPortAddress() {
        return XtentisPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String XtentisPortWSDDServiceName = "XtentisPort";

    public java.lang.String getXtentisPortWSDDServiceName() {
        return XtentisPortWSDDServiceName;
    }

    public void setXtentisPortWSDDServiceName(java.lang.String name) {
        XtentisPortWSDDServiceName = name;
    }

    public org.talend.mdm.webservice.XtentisPort_PortType getXtentisPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(XtentisPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getXtentisPort(endpoint);
    }

    public org.talend.mdm.webservice.XtentisPort_PortType getXtentisPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.talend.mdm.webservice.XtentisBindingStub _stub = new org.talend.mdm.webservice.XtentisBindingStub(portAddress, this);
            _stub.setPortName(getXtentisPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setXtentisPortEndpointAddress(java.lang.String address) {
        XtentisPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.talend.mdm.webservice.XtentisPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.talend.mdm.webservice.XtentisBindingStub _stub = new org.talend.mdm.webservice.XtentisBindingStub(new java.net.URL(XtentisPort_address), this);
                _stub.setPortName(getXtentisPortWSDDServiceName());
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
        if ("XtentisPort".equals(inputPortName)) {
            return getXtentisPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "XtentisService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "XtentisPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("XtentisPort".equals(portName)) {
            setXtentisPortEndpointAddress(address);
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
