/**
 * VtigersoapPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.vtiger.module.wordplugin;

public interface VtigersoapPortType extends java.rmi.Remote {
    public org.talend.vtiger.module.wordplugin.Contact_column_detail get_contacts_columns(java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.wordplugin.Account_column_detail get_accounts_columns(java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.wordplugin.Lead_column_detail get_leads_columns(java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.wordplugin.User_column_detail get_user_columns(java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Tickets_list_array get_tickets_columns(java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String create_session(java.lang.String user_name, java.lang.String password, java.lang.String version) throws java.rmi.RemoteException;
    public java.lang.String end_session(java.lang.String user_name) throws java.rmi.RemoteException;
}
