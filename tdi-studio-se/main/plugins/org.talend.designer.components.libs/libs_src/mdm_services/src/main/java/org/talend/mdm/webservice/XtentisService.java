/**
 * XtentisService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public interface XtentisService extends javax.xml.rpc.Service {
    public java.lang.String getXtentisPortAddress();

    public org.talend.mdm.webservice.XtentisPort_PortType getXtentisPort() throws javax.xml.rpc.ServiceException;

    public org.talend.mdm.webservice.XtentisPort_PortType getXtentisPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
