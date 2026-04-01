package org.talend.vtiger;

import java.net.URL;
import java.util.HashMap;

import org.apache.axis.client.Service;
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

public class VtigerManager implements IVtigerManager {

    private String userName;

    private String password;

    private String version;

    private String serverAddr;

    private String soapActionServerAddr;

    private static final String OUTLOOK = "outlook";

    private static final String FIREFOX = "firefox";

    private static final String WORDPLUGIN = "wordplugin";

    private static final String THUNDERBIRD = "thunderbird";

    private static final String CUSTOMERPORTAL = "customerportal";

    private static final String WEBFORM = "webforms";

    private static HashMap<String, Object> moduleMap = new HashMap<String, Object>();

    public VtigerManager(String userName, String password, String version, String hostPath, String port, String vtigerPath)
            throws Exception {

        this.userName = userName;

        this.password = password;

        this.version = version;

        if (!hostPath.equals("")) {
            this.serverAddr = hostPath;
            this.soapActionServerAddr = hostPath;
        }
        if (!port.equals("")) {
            this.serverAddr += ":";
            this.serverAddr += port;
        }
        if (!vtigerPath.equals("")) {
            this.serverAddr += "/";
            this.serverAddr += vtigerPath;
            this.soapActionServerAddr += "/";
            this.soapActionServerAddr += vtigerPath;
        }

        initModule();
    }

    private void initModule() throws Exception {

        moduleMap.put(OUTLOOK, new org.talend.vtiger.module.outlook.VtigerolserviceBindingStub(
                new URL(constructEndPoint(OUTLOOK)), new Service(), soapActionServerAddr));

        moduleMap.put(WORDPLUGIN, new org.talend.vtiger.module.wordplugin.VtigersoapBindingStub(new URL(
                constructEndPoint(WORDPLUGIN)), new Service(), soapActionServerAddr));

        moduleMap.put(THUNDERBIRD, new org.talend.vtiger.module.thunderbird.VtigersoapBindingStub(new URL(
                constructEndPoint(THUNDERBIRD)), new Service(), soapActionServerAddr));

        moduleMap.put(CUSTOMERPORTAL, new org.talend.vtiger.module.customerportal.CustomerportalBindingStub(new URL(
                constructEndPoint(CUSTOMERPORTAL)), new Service(), soapActionServerAddr));

        moduleMap.put(WEBFORM, new org.talend.vtiger.module.webform.VtigersoapBindingStub(new URL(constructEndPoint(WEBFORM)),
                new Service(), soapActionServerAddr));

        moduleMap.put(FIREFOX, new org.talend.vtiger.module.firefox.VtigersoapBindingStub(new URL(constructEndPoint(FIREFOX)),
                new Service(), soapActionServerAddr));

    }

    private String constructEndPoint(String module) {
        return "http://" + serverAddr + "/vtigerservice.php?service=" + module;
    }

    public String addClndr(Clndrdetail[] clndrdtls) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.addClndr(userName, clndrdtls);
        }
        return null;
    }

    public String addContacts(Contactdetail[] cntdtls) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.addContacts(userName, cntdtls);
        }
        return null;
    }

    public String addTasks(Taskdetail[] taskdtls) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.addTasks(userName, taskdtls);
        }
        return null;
    }

    public String updateClndr(Clndrdetail[] clndrdtls) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.updateClndr(userName, clndrdtls);
        }
        return null;
    }

    public String updateContacts(Contactdetail[] cntdtls) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.updateContacts(userName, cntdtls);
        }
        return null;
    }

    public String updateTasks(Taskdetail[] taskdtls) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.updateTasks(userName, taskdtls);
        }
        return null;
    }

    public String deleteClndr(String crmid) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.deleteClndr(userName, crmid);
        }
        return null;
    }

    public String deleteContacts(String crmid) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.deleteContacts(userName, crmid);
        }
        return null;
    }

    public String deleteTasks(String crmid) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.deleteTasks(userName, crmid);
        }
        return null;
    }

    public Clndrdetail[] getClndr() throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.getClndr(userName);
        }
        return null;
    }

    public Contactdetail[] getContacts() throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.getContacts(userName);
        }
        return null;
    }

    public Taskdetail[] getTasks() throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.getTasks(userName);
        }
        return null;
    }

    public String addMessageToContact(String contactid, Emailmsgdetail msgdtls) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.addMessageToContact(userName, contactid, msgdtls);
        }
        return null;
    }

    public String addEmailAttachment(String emailid, String filedata, String filename, String filesize, String filetype)
            throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.addEmailAttachment(emailid, filedata, filename, filesize, filetype, userName);
        }
        return null;
    }

    public Contactdetail[] searchContactsByEmail(String emailaddress) throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.searchContactsByEmail(userName, emailaddress);
        }
        return null;
    }

    public Contactdetail[] searchContactsByEmail() throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.searchContactsByEmail(userName, null);
        }
        return null;
    }

    public String checkEmailPermission() throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.checkEmailPermission(userName);
        }
        return null;
    }

    public String checkContactPermission() throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.checkContactPermission(userName);
        }
        return null;
    }

    public String checkActivityPermission() throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.checkActivityPermission(userName);
        }
        return null;
    }

    public Contact_column_detail get_contacts_columns() throws Exception {
        org.talend.vtiger.module.wordplugin.VtigersoapPortType wordplugin = (org.talend.vtiger.module.wordplugin.VtigersoapPortType) moduleMap
                .get(WORDPLUGIN);
        if (wordplugin != null) {
            return wordplugin.get_contacts_columns(userName, password);
        }
        return null;
    }

    public Account_column_detail get_accounts_columns() throws Exception {
        org.talend.vtiger.module.wordplugin.VtigersoapPortType wordplugin = (org.talend.vtiger.module.wordplugin.VtigersoapPortType) moduleMap
                .get(WORDPLUGIN);
        if (wordplugin != null) {
            return wordplugin.get_accounts_columns(userName, password);
        }
        return null;
    }

    public Lead_column_detail get_leads_columns() throws Exception {
        org.talend.vtiger.module.wordplugin.VtigersoapPortType wordplugin = (org.talend.vtiger.module.wordplugin.VtigersoapPortType) moduleMap
                .get(WORDPLUGIN);
        if (wordplugin != null) {
            return wordplugin.get_leads_columns(userName, password);
        }
        return null;
    }

    public User_column_detail get_user_columns() throws Exception {
        org.talend.vtiger.module.wordplugin.VtigersoapPortType wordplugin = (org.talend.vtiger.module.wordplugin.VtigersoapPortType) moduleMap
                .get(WORDPLUGIN);
        if (wordplugin != null) {
            return wordplugin.get_user_columns(userName, password);
        }
        return null;
    }

    public Tickets_list_array get_tickets_columns() throws Exception {
        org.talend.vtiger.module.wordplugin.VtigersoapPortType wordplugin = (org.talend.vtiger.module.wordplugin.VtigersoapPortType) moduleMap
                .get(WORDPLUGIN);
        if (wordplugin != null) {
            return wordplugin.get_tickets_columns(userName, password);
        }
        return null;
    }

    public String create_session() throws Exception {
        org.talend.vtiger.module.wordplugin.VtigersoapPortType wordplugin = (org.talend.vtiger.module.wordplugin.VtigersoapPortType) moduleMap
                .get(WORDPLUGIN);
        if (wordplugin != null) {
            return wordplugin.create_session(userName, password, version);
        }
        return null;
    }

    public String end_session() throws Exception {
        org.talend.vtiger.module.wordplugin.VtigersoapPortType wordplugin = (org.talend.vtiger.module.wordplugin.VtigersoapPortType) moduleMap
                .get(WORDPLUGIN);
        if (wordplugin != null) {
            return wordplugin.end_session(userName);
        }
        return null;
    }

    public String checkContactPerm() throws Exception {
        org.talend.vtiger.module.thunderbird.VtigersoapPortType thunderbird = (org.talend.vtiger.module.thunderbird.VtigersoapPortType) moduleMap
                .get(THUNDERBIRD);
        if (thunderbird != null) {
            return thunderbird.checkContactPerm(userName);
        }
        return null;
    }

    public String checkContactViewPerm() throws Exception {
        org.talend.vtiger.module.thunderbird.VtigersoapPortType thunderbird = (org.talend.vtiger.module.thunderbird.VtigersoapPortType) moduleMap
                .get(THUNDERBIRD);
        if (thunderbird != null) {
            return thunderbird.checkContactViewPerm(userName);
        }
        return null;
    }

    public String checkLeadViewPerm() throws Exception {
        org.talend.vtiger.module.thunderbird.VtigersoapPortType thunderbird = (org.talend.vtiger.module.thunderbird.VtigersoapPortType) moduleMap
                .get(THUNDERBIRD);
        if (thunderbird != null) {
            return thunderbird.checkLeadViewPerm(userName);
        }
        return null;
    }

    public String addContact(String first_name, String last_name, String email_address, String account_name, String salutation,
            String title, String phone_mobile, String reports_to, String primary_address_street, String primary_address_city,
            String primary_address_state, String primary_address_postalcode, String primary_address_country,
            String alt_address_city, String alt_address_street, String alt_address_state, String alt_address_postalcode,
            String alt_address_country, String office_phone, String home_phone, String fax, String department, String description)
            throws Exception {
        org.talend.vtiger.module.thunderbird.VtigersoapPortType thunderbird = (org.talend.vtiger.module.thunderbird.VtigersoapPortType) moduleMap
                .get(THUNDERBIRD);
        if (thunderbird != null) {
            return thunderbird.addContact(userName, first_name, last_name, email_address, account_name, salutation, title,
                    phone_mobile, reports_to, primary_address_street, primary_address_city, primary_address_state,
                    primary_address_postalcode, primary_address_country, alt_address_city, alt_address_street, alt_address_state,
                    alt_address_postalcode, alt_address_country, office_phone, home_phone, fax, department, description);
        }
        return null;
    }

    public String addLead(String first_name, String last_name, String email_address, String account_name, String salutation,
            String title, String phone_mobile, String reports_to, String primary_address_street, String primary_address_city,
            String primary_address_state, String primary_address_postalcode, String primary_address_country,
            String alt_address_city, String alt_address_street, String alt_address_state, String alt_address_postalcode,
            String alt_address_country, String office_phone, String home_phone, String fax, String department, String description)
            throws Exception {
        org.talend.vtiger.module.thunderbird.VtigersoapPortType thunderbird = (org.talend.vtiger.module.thunderbird.VtigersoapPortType) moduleMap
                .get(THUNDERBIRD);
        if (thunderbird != null) {
            return thunderbird.addLead(userName, first_name, last_name, email_address, account_name, salutation, title,
                    phone_mobile, reports_to, primary_address_street, primary_address_city, primary_address_state,
                    primary_address_postalcode, primary_address_country, alt_address_city, alt_address_street, alt_address_state,
                    alt_address_postalcode, alt_address_country, office_phone, home_phone, fax, department, description);
        }
        return null;
    }

    public String track_email(String contact_ids, java.util.Date date_sent, String email_subject, String email_body)
            throws Exception {
        org.talend.vtiger.module.thunderbird.VtigersoapPortType thunderbird = (org.talend.vtiger.module.thunderbird.VtigersoapPortType) moduleMap
                .get(THUNDERBIRD);
        if (thunderbird != null) {
            return thunderbird.track_email(userName, contact_ids, date_sent, email_subject, email_body);
        }
        return null;
    }

    public String track_email() throws Exception {
        org.talend.vtiger.module.thunderbird.VtigersoapPortType thunderbird = (org.talend.vtiger.module.thunderbird.VtigersoapPortType) moduleMap
                .get(THUNDERBIRD);
        if (thunderbird != null) {
            return thunderbird.track_email(userName, null, null, null, null);
        }
        return null;
    }

    public User_array authenticate_user() throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.authenticate_user(userName, password);
        }
        return null;
    }

    public User_array change_password(String id, String password) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.change_password(id, userName, password);
        }
        return null;
    }

    public Tickets_list_array create_ticket(String title, String description, String priority, String severity, String category,
            String parent_id, String product_id, String module) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.create_ticket(title, description, priority, severity, category, userName, parent_id,
                    product_id, module);
        }
        return null;
    }

    public Tickets_list_array get_tickets_list(String id, String where, String match) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_tickets_list(userName, id, where, match);
        }
        return null;
    }

    public Tickets_list_array get_tickets_list() throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_tickets_list(userName, null, null, null);
        }
        return null;
    }

    public Ticket_comments_array get_ticket_comments(String id) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_ticket_comments(id);
        }
        return null;
    }

    public Ticket_comments_array get_ticket_comments() throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_ticket_comments(null);
        }
        return null;
    }

    public Combo_values_array get_combo_values(String id) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_combo_values(id);
        }
        return null;
    }

    public Combo_values_array get_combo_values() throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_combo_values(null);
        }
        return null;
    }

    public Kbase_detail[] get_KBase_details(String id) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_KBase_details(id);
        }
        return null;
    }

    public Kbase_detail[] get_KBase_details() throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_KBase_details(null);
        }
        return null;
    }

    public Kbase_detail[] save_faq_comment(String faqid, String comments) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.save_faq_comment(faqid, comments);
        }
        return null;
    }

    public Ticket_update_comment_array update_ticket_comment(String ticketid, String ownerid, String comments) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.update_ticket_comment(ticketid, ownerid, comments);
        }
        return null;
    }

    public String close_current_ticket(String ticketid) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.close_current_ticket(ticketid);
        }
        return null;
    }

    public User_array update_login_details(String id, String flag) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.update_login_details(id, flag);
        }
        return null;
    }

    public String send_mail_for_password(String email) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.send_mail_for_password(email);
        }
        return null;
    }

    public String get_ticket_creator(String id) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_ticket_creator(id);
        }
        return null;
    }

    public String get_ticket_creator() throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_ticket_creator(null);
        }
        return null;
    }

    public Get_picklists_array get_picklists(String id) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_picklists(id);
        }
        return null;
    }

    public Get_picklists_array get_picklists() throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_picklists(null);
        }
        return null;
    }

    public Get_ticket_attachments_array get_ticket_attachments(String id, String ticketid) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_ticket_attachments(id, ticketid);
        }
        return null;
    }

    public Get_ticket_attachments_array get_ticket_attachments() throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_ticket_attachments(null, null);
        }
        return null;
    }

    public Get_filecontent_array get_filecontent(String id, String fileid, String filename) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_filecontent(id, fileid, filename);
        }
        return null;
    }

    public Get_filecontent_array get_filecontent() throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.get_filecontent(null, null, null);
        }
        return null;
    }

    public Add_ticket_attachment_array add_ticket_attachment(String ticketid, String filename, String filetype, String filesize,
            String filecontents) throws Exception {
        org.talend.vtiger.module.customerportal.CustomerportalPortType customerportal = (org.talend.vtiger.module.customerportal.CustomerportalPortType) moduleMap
                .get(CUSTOMERPORTAL);
        if (customerportal != null) {
            return customerportal.add_ticket_attachment(ticketid, filename, filetype, filesize, filecontents);
        }
        return null;
    }

    public String create_lead_from_webform(String lastname, String email, String phone, String company, String country,
            String description, String assigned_user_id) throws Exception {
        org.talend.vtiger.module.webform.VtigersoapPortType webform = (org.talend.vtiger.module.webform.VtigersoapPortType) moduleMap
                .get(WEBFORM);
        if (webform != null) {
            return webform.create_lead_from_webform(lastname, email, phone, company, country, description, assigned_user_id);
        }
        return null;
    }

    public String create_contact_from_webform(String first_name, String last_name, String email_address, String home_phone,
            String department, String description, String assigned_user_id) throws Exception {
        org.talend.vtiger.module.webform.VtigersoapPortType webform = (org.talend.vtiger.module.webform.VtigersoapPortType) moduleMap
                .get(WEBFORM);
        if (webform != null) {
            return webform.create_contact_from_webform(first_name, last_name, email_address, home_phone, department, description,
                    assigned_user_id);
        }
        return null;
    }

    public String unsubscribe_email(String email_address) throws Exception {
        org.talend.vtiger.module.webform.VtigersoapPortType webform = (org.talend.vtiger.module.webform.VtigersoapPortType) moduleMap
                .get(WEBFORM);
        if (webform != null) {
            return webform.unsubscribe_email(email_address);
        }
        return null;
    }

    public String loginToVtiger() throws Exception {
        org.talend.vtiger.module.outlook.VtigerolservicePortType outlook = (org.talend.vtiger.module.outlook.VtigerolservicePortType) moduleMap
                .get(OUTLOOK);
        if (outlook != null) {
            return outlook.loginToVtiger(userName, password);
        }
        return null;
    }

    public String get_version() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.get_version(userName, password);
        }
        return null;
    }

    public String create_site_from_webform(String portalname, String portalurl) throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.create_site_from_webform(userName, portalname, portalurl);
        }
        return null;
    }

    public String create_rss_from_webform(String rssurl) throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.create_rss_from_webform(userName, rssurl);
        }
        return null;
    }

    public String create_contacts(String firstname, String lastname, String phone, String mobile, String email, String street,
            String city, String state, String country, String zipcode) throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.create_contacts(userName, firstname, lastname, phone, mobile, email, street, city, state, country,
                    zipcode);
        }
        return null;
    }

    public String create_account(String accountname, String email, String phone, String $Primary_address_street,
            String $Primary_address_city, String $Primary_address_state, String $Primary_address_postalcode,
            String $Primary_address_country) throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.create_account(userName, accountname, email, phone, $Primary_address_street, $Primary_address_city,
                    $Primary_address_state, $Primary_address_postalcode, $Primary_address_country);
        }
        return null;
    }

    public String create_ticket_from_toolbar(String title, String description, String priority, String severity, String category,
            String user_name, String parent_id, String product_id) throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.create_ticket_from_toolbar(userName, title, description, priority, severity, category, user_name,
                    parent_id, product_id);
        }
        return null;
    }

    public String create_vendor_from_webform(String vendorname, String email, String phone, String website) throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.create_vendor_from_webform(userName, vendorname, email, phone, website);
        }
        return null;
    }

    public String create_product_from_webform(String productname, String productcode, String website) throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.create_product_from_webform(userName, productname, productcode, website);
        }
        return null;
    }

    public String create_note_from_webform(String title, String notecontent) throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.create_note_from_webform(userName, title, notecontent);
        }
        return null;
    }

    public String checkLeadPermission() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.checkLeadPermission(userName);
        }
        return null;
    }

    public String checkAccountPermission() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.checkAccountPermission(userName);
        }
        return null;
    }

    public String checkTicketPermission() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.checkTicketPermission(userName);
        }
        return null;
    }

    public String checkVendorPermission() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.checkVendorPermission(userName);
        }
        return null;
    }

    public String checkProductPermission() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.checkProductPermission(userName);
        }
        return null;
    }

    public String checkNotePermission() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.checkNotePermission(userName);
        }
        return null;
    }

    public String checkSitePermission() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.checkSitePermission(userName);
        }
        return null;
    }

    public String checkRssPermission() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.checkRssPermission(userName);
        }
        return null;
    }

    public String logintoVtigerCRM() throws Exception {
        org.talend.vtiger.module.firefox.VtigersoapPortType firefox = (org.talend.vtiger.module.firefox.VtigersoapPortType) moduleMap
                .get(FIREFOX);
        if (firefox != null) {
            return firefox.logintoVtigerCRM(userName, password, version);
        }

        return null;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getVersion() {
        return this.version;
    }

    public String getPassword() {
        return this.password;
    }

}
