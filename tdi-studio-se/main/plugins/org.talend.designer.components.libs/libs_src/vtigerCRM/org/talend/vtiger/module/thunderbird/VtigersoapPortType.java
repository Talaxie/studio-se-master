/**
 * VtigersoapPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.vtiger.module.thunderbird;

public interface VtigersoapPortType extends java.rmi.Remote {
    public java.lang.String create_session(java.lang.String user_name, java.lang.String password, java.lang.String version) throws java.rmi.RemoteException;
    public java.lang.String end_session(java.lang.String user_name) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.thunderbird.Contactdetail[] searchContactsByEmail(java.lang.String username, java.lang.String emailaddress) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.thunderbird.Contactdetail[] getContacts(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkContactPerm(java.lang.String user_name) throws java.rmi.RemoteException;
    public java.lang.String checkContactViewPerm(java.lang.String user_name) throws java.rmi.RemoteException;
    public java.lang.String checkLeadViewPerm(java.lang.String user_name) throws java.rmi.RemoteException;
    public java.lang.String addContact(java.lang.String user_name, java.lang.String first_name, java.lang.String last_name, java.lang.String email_address, java.lang.String account_name, java.lang.String salutation, java.lang.String title, java.lang.String phone_mobile, java.lang.String reports_to, java.lang.String primary_address_street, java.lang.String primary_address_city, java.lang.String primary_address_state, java.lang.String primary_address_postalcode, java.lang.String primary_address_country, java.lang.String alt_address_city, java.lang.String alt_address_street, java.lang.String alt_address_state, java.lang.String alt_address_postalcode, java.lang.String alt_address_country, java.lang.String office_phone, java.lang.String home_phone, java.lang.String fax, java.lang.String department, java.lang.String description) throws java.rmi.RemoteException;
    public java.lang.String addLead(java.lang.String user_name, java.lang.String first_name, java.lang.String last_name, java.lang.String email_address, java.lang.String account_name, java.lang.String salutation, java.lang.String title, java.lang.String phone_mobile, java.lang.String reports_to, java.lang.String primary_address_street, java.lang.String primary_address_city, java.lang.String primary_address_state, java.lang.String primary_address_postalcode, java.lang.String primary_address_country, java.lang.String alt_address_city, java.lang.String alt_address_street, java.lang.String alt_address_state, java.lang.String alt_address_postalcode, java.lang.String alt_address_country, java.lang.String office_phone, java.lang.String home_phone, java.lang.String fax, java.lang.String department, java.lang.String description) throws java.rmi.RemoteException;
    public java.lang.String track_email(java.lang.String user_name, java.lang.String contact_ids, java.util.Date date_sent, java.lang.String email_subject, java.lang.String email_body) throws java.rmi.RemoteException;
}
