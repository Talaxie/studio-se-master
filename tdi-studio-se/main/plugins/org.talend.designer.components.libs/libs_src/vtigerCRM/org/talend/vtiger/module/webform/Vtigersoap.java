/**
 * Vtigersoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.vtiger.module.webform;

public interface Vtigersoap extends javax.xml.rpc.Service {
    public java.lang.String getvtigersoapPortAddress();

    public org.talend.vtiger.module.webform.VtigersoapPortType getvtigersoapPort() throws javax.xml.rpc.ServiceException;

    public org.talend.vtiger.module.webform.VtigersoapPortType getvtigersoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
