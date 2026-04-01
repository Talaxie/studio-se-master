package org.talend.vtiger;

import org.talend.vtiger.module.customerportal.Add_ticket_attachment_array;
import org.talend.vtiger.module.customerportal.Combo_values_array;
import org.talend.vtiger.module.customerportal.Get_filecontent_array;
import org.talend.vtiger.module.customerportal.Get_picklists_array;
import org.talend.vtiger.module.customerportal.Get_ticket_attachments_array;
import org.talend.vtiger.module.customerportal.Kbase_detail;
import org.talend.vtiger.module.customerportal.Ticket_comments_array;
import org.talend.vtiger.module.customerportal.Ticket_update_comment_array;
import org.talend.vtiger.module.customerportal.Tickets_list_array;
import org.talend.vtiger.module.customerportal.User_array;
import org.talend.vtiger.module.outlook.Clndrdetail;
import org.talend.vtiger.module.outlook.Contactdetail;
import org.talend.vtiger.module.outlook.Emailmsgdetail;
import org.talend.vtiger.module.outlook.Taskdetail;
import org.talend.vtiger.module.wordplugin.Account_column_detail;
import org.talend.vtiger.module.wordplugin.Contact_column_detail;
import org.talend.vtiger.module.wordplugin.Lead_column_detail;
import org.talend.vtiger.module.wordplugin.User_column_detail;

public interface IVtigerManager {
	
	public String addClndr(Clndrdetail[] clndrdtls) throws Exception;
	
	public String addContacts(Contactdetail[] cntdtls) throws Exception;
	
	public String addTasks(Taskdetail[] taskdtls) throws Exception;
	
	public String updateClndr(Clndrdetail[] clndrdtls) throws Exception;
	
	public String updateContacts(Contactdetail[] cntdtls) throws Exception;
	
	public String updateTasks(Taskdetail[] taskdtls) throws Exception;
	
	public String deleteClndr(String crmid) throws Exception;
	
	public String deleteContacts(String crmid) throws Exception;
	
	public String deleteTasks(String crmid) throws Exception;
	
	public Clndrdetail[] getClndr() throws Exception;
	
	public Contactdetail[] getContacts() throws Exception;
	
	public Taskdetail[] getTasks() throws Exception;
	
	public String addMessageToContact(String contactid, Emailmsgdetail msgdtls) throws Exception;
	
	public String addEmailAttachment(String emailid, String filedata, String filename, String filesize, String filetype) throws Exception;
	
	public Contactdetail[] searchContactsByEmail(String emailaddress) throws Exception;
	
	public String checkEmailPermission() throws Exception;
	
	public String checkContactPermission() throws Exception;
	
	public String checkActivityPermission() throws Exception;
	
	public Contact_column_detail get_contacts_columns() throws Exception;
	
	public Account_column_detail get_accounts_columns() throws Exception;
	
	public Lead_column_detail get_leads_columns() throws Exception;
	
	public User_column_detail get_user_columns() throws Exception;
	
	public Tickets_list_array get_tickets_columns() throws Exception;
	
	public String create_session() throws Exception;
	
	public String end_session() throws Exception;
	
	public String checkContactPerm() throws Exception;
	
	public String checkContactViewPerm() throws Exception;
	
	public String checkLeadViewPerm() throws Exception;
	
	public String addContact(String first_name, String last_name, String email_address, String account_name, String salutation, String title, String phone_mobile, String reports_to, String primary_address_street, String primary_address_city, String primary_address_state, String primary_address_postalcode, String primary_address_country, String alt_address_city, String alt_address_street, String alt_address_state, String alt_address_postalcode, String alt_address_country, String office_phone, String home_phone, String fax, String department, String description) throws Exception;
	
	public String addLead(String first_name, String last_name, String email_address, String account_name, String salutation, String title, String phone_mobile, String reports_to, String primary_address_street, String primary_address_city, String primary_address_state, String primary_address_postalcode, String primary_address_country, String alt_address_city, String alt_address_street, String alt_address_state, String alt_address_postalcode, String alt_address_country, String office_phone, String home_phone, String fax, String department, String description) throws Exception;
	
	public String track_email(String contact_ids, java.util.Date date_sent, String email_subject, String email_body) throws Exception;
	
	public User_array authenticate_user() throws Exception;
	
	public User_array change_password(String id,String password) throws Exception;
	
	public Tickets_list_array create_ticket(String title, String description, String priority, String severity, String category, String parent_id, String product_id, String module) throws Exception;
	
	public Tickets_list_array get_tickets_list(String id, String where, String match) throws Exception;
	
	public Ticket_comments_array get_ticket_comments(String id) throws Exception;
	
	public Combo_values_array get_combo_values(String id) throws Exception;
	
	public Kbase_detail[] get_KBase_details(String id) throws Exception;
	
	public Kbase_detail[] save_faq_comment(String faqid, String comments) throws Exception;
	
	public Ticket_update_comment_array update_ticket_comment(String ticketid, String ownerid, String comments) throws Exception;
	
	public String close_current_ticket(String ticketid) throws Exception;
	
	public User_array update_login_details(String id, String flag) throws Exception;
	
	public String send_mail_for_password(String email) throws Exception;
	
	public String get_ticket_creator(String id) throws Exception;
	
	public Get_picklists_array get_picklists(String id) throws Exception;
	
	public Get_ticket_attachments_array get_ticket_attachments(String id, String ticketid) throws Exception;
	
	public Get_filecontent_array get_filecontent(String id, String fileid, String filename) throws Exception;
	
	public Add_ticket_attachment_array add_ticket_attachment(String ticketid, String filename, String filetype, String filesize, String filecontents) throws Exception;
	
	public String create_lead_from_webform(String lastname, String email, String phone, String company, String country, String description, String assigned_user_id) throws Exception;
	
	public String create_contact_from_webform(String first_name, String last_name, String email_address, String home_phone, String department, String description, String assigned_user_id) throws Exception;
	
	public String unsubscribe_email(String email_address) throws Exception;
	
	public String get_version() throws Exception;
	
	public String create_site_from_webform(String portalname, String portalurl) throws Exception;
	
	public String create_rss_from_webform(String rssurl) throws Exception;
	
	public String create_contacts(String firstname, String lastname, String phone, String mobile, String email, String street, String city, String state, String country, String zipcode) throws Exception;
	
	public String create_account(String accountname, String email, String phone, String $Primary_address_street, String $Primary_address_city, String $Primary_address_state, String $Primary_address_postalcode, String $Primary_address_country) throws Exception;
	
	public String create_ticket_from_toolbar(String title, String description, String priority, String severity, String category, String user_name, String parent_id, String product_id) throws Exception;
	
	public String create_vendor_from_webform(String vendorname, String email, String phone, String website) throws Exception;
	
	public String create_product_from_webform(String productname, String productcode, String website) throws Exception;
	
	public String create_note_from_webform(String title, String notecontent) throws Exception;
	
	public String checkLeadPermission() throws Exception;
	
	public String checkAccountPermission() throws Exception;
	
	public String checkTicketPermission() throws Exception;
	
	public String checkVendorPermission() throws Exception;
	
	public String checkProductPermission() throws Exception;
	
	public String checkNotePermission() throws Exception;
	
	public String checkSitePermission() throws Exception;
	
	public String checkRssPermission() throws Exception;
		
	public String loginToVtiger() throws Exception;
	
	public String logintoVtigerCRM() throws Exception;
	
	public String getUserName();
	
	public String getVersion();
	
	public String getPassword();
}
