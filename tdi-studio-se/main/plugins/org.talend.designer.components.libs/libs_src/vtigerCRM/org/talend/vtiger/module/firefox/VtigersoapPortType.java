/**
 * VtigersoapPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.vtiger.module.firefox;

public interface VtigersoapPortType extends java.rmi.Remote {
    public java.lang.String get_version(java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String create_lead_from_webform(java.lang.String username, java.lang.String lastname, java.lang.String firstname, java.lang.String email, java.lang.String phone, java.lang.String company, java.lang.String country, java.lang.String description) throws java.rmi.RemoteException;
    public java.lang.String create_site_from_webform(java.lang.String username, java.lang.String portalname, java.lang.String portalurl) throws java.rmi.RemoteException;
    public java.lang.String create_rss_from_webform(java.lang.String username, java.lang.String rssurl) throws java.rmi.RemoteException;
    public java.lang.String create_contacts(java.lang.String user_name, java.lang.String firstname, java.lang.String lastname, java.lang.String phone, java.lang.String mobile, java.lang.String email, java.lang.String street, java.lang.String city, java.lang.String state, java.lang.String country, java.lang.String zipcode) throws java.rmi.RemoteException;
    public java.lang.String create_account(java.lang.String username, java.lang.String accountname, java.lang.String email, java.lang.String phone, java.lang.String $Primary_address_street, java.lang.String $Primary_address_city, java.lang.String $Primary_address_state, java.lang.String $Primary_address_postalcode, java.lang.String $Primary_address_country) throws java.rmi.RemoteException;
    public java.lang.String create_ticket_from_toolbar(java.lang.String username, java.lang.String title, java.lang.String description, java.lang.String priority, java.lang.String severity, java.lang.String category, java.lang.String user_name, java.lang.String parent_id, java.lang.String product_id) throws java.rmi.RemoteException;
    public java.lang.String create_vendor_from_webform(java.lang.String username, java.lang.String vendorname, java.lang.String email, java.lang.String phone, java.lang.String website) throws java.rmi.RemoteException;
    public java.lang.String create_product_from_webform(java.lang.String username, java.lang.String productname, java.lang.String productcode, java.lang.String website) throws java.rmi.RemoteException;
    public java.lang.String create_note_from_webform(java.lang.String username, java.lang.String title, java.lang.String notecontent) throws java.rmi.RemoteException;
    public java.lang.String logintoVtigerCRM(java.lang.String user_name, java.lang.String password, java.lang.String version) throws java.rmi.RemoteException;
    public java.lang.String checkLeadPermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkContactPermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkAccountPermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkTicketPermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkVendorPermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkProductPermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkNotePermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkSitePermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkRssPermission(java.lang.String username) throws java.rmi.RemoteException;
}
