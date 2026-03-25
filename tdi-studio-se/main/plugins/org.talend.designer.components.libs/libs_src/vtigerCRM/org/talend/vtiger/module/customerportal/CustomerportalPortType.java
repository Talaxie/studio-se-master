/**
 * CustomerportalPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.vtiger.module.customerportal;

public interface CustomerportalPortType extends java.rmi.Remote {
    public org.talend.vtiger.module.customerportal.User_array authenticate_user(java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.User_array change_password(java.lang.String id, java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Tickets_list_array create_ticket(java.lang.String title, java.lang.String description, java.lang.String priority, java.lang.String severity, java.lang.String category, java.lang.String user_name, java.lang.String parent_id, java.lang.String product_id, java.lang.String module) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Tickets_list_array get_tickets_list(java.lang.String user_name, java.lang.String id, java.lang.String where, java.lang.String match) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Ticket_comments_array get_ticket_comments(java.lang.String id) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Combo_values_array get_combo_values(java.lang.String id) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Kbase_detail[] get_KBase_details(java.lang.String id) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Kbase_detail[] save_faq_comment(java.lang.String faqid, java.lang.String comments) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Ticket_update_comment_array update_ticket_comment(java.lang.String ticketid, java.lang.String ownerid, java.lang.String comments) throws java.rmi.RemoteException;
    public java.lang.String close_current_ticket(java.lang.String ticketid) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.User_array update_login_details(java.lang.String id, java.lang.String flag) throws java.rmi.RemoteException;
    public java.lang.String send_mail_for_password(java.lang.String email) throws java.rmi.RemoteException;
    public java.lang.String get_ticket_creator(java.lang.String id) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Get_picklists_array get_picklists(java.lang.String id) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Get_ticket_attachments_array get_ticket_attachments(java.lang.String id, java.lang.String ticketid) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Get_filecontent_array get_filecontent(java.lang.String id, java.lang.String fileid, java.lang.String filename) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.customerportal.Add_ticket_attachment_array add_ticket_attachment(java.lang.String ticketid, java.lang.String filename, java.lang.String filetype, java.lang.String filesize, java.lang.String filecontents) throws java.rmi.RemoteException;
}
