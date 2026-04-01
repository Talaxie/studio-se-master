/**
 * VtigersoapPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.vtiger.module.webform;

public interface VtigersoapPortType extends java.rmi.Remote {
    public java.lang.String create_lead_from_webform(java.lang.String lastname, java.lang.String email, java.lang.String phone, java.lang.String company, java.lang.String country, java.lang.String description, java.lang.String assigned_user_id) throws java.rmi.RemoteException;
    public java.lang.String create_contact_from_webform(java.lang.String first_name, java.lang.String last_name, java.lang.String email_address, java.lang.String home_phone, java.lang.String department, java.lang.String description, java.lang.String assigned_user_id) throws java.rmi.RemoteException;
    public java.lang.String unsubscribe_email(java.lang.String email_address) throws java.rmi.RemoteException;
}
