/**
 * InteractiveLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AddressDoctor.validator2.addInteractive.Interactive;

public class InteractiveLocator extends org.apache.axis.client.Service implements com.AddressDoctor.validator2.addInteractive.Interactive.Interactive {

    public InteractiveLocator() {
    }


    public InteractiveLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InteractiveLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InteractiveSoap
    private java.lang.String InteractiveSoap_address = "http://validator2.addressdoctor.com/addInteractive/Interactive.asmx";

    public java.lang.String getInteractiveSoapAddress() {
        return InteractiveSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InteractiveSoapWSDDServiceName = "InteractiveSoap";

    public java.lang.String getInteractiveSoapWSDDServiceName() {
        return InteractiveSoapWSDDServiceName;
    }

    public void setInteractiveSoapWSDDServiceName(java.lang.String name) {
        InteractiveSoapWSDDServiceName = name;
    }

    public com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoap getInteractiveSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InteractiveSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInteractiveSoap(endpoint);
    }

    public com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoap getInteractiveSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoapStub _stub = new com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoapStub(portAddress, this);
            _stub.setPortName(getInteractiveSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInteractiveSoapEndpointAddress(java.lang.String address) {
        InteractiveSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoapStub _stub = new com.AddressDoctor.validator2.addInteractive.Interactive.InteractiveSoapStub(new java.net.URL(InteractiveSoap_address), this);
                _stub.setPortName(getInteractiveSoapWSDDServiceName());
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
        if ("InteractiveSoap".equals(inputPortName)) {
            return getInteractiveSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "Interactive");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://validator2.AddressDoctor.com/addInteractive/Interactive", "InteractiveSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InteractiveSoap".equals(portName)) {
            setInteractiveSoapEndpointAddress(address);
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
