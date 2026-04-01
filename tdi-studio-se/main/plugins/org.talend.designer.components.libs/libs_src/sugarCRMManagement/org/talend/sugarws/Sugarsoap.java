/**
 * Sugarsoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.sugarws;

public interface Sugarsoap extends javax.xml.rpc.Service {
    public java.lang.String getsugarsoapPortAddress();

    public org.talend.sugarws.SugarsoapPortType getsugarsoapPort() throws javax.xml.rpc.ServiceException;

    public org.talend.sugarws.SugarsoapPortType getsugarsoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
