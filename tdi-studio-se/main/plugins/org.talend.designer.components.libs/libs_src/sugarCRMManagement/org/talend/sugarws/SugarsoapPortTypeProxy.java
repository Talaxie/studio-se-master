package org.talend.sugarws;

public class SugarsoapPortTypeProxy implements org.talend.sugarws.SugarsoapPortType {
  private String _endpoint = null;
  private org.talend.sugarws.SugarsoapPortType sugarsoapPortType = null;
  
  public SugarsoapPortTypeProxy() {
    _initSugarsoapPortTypeProxy();
  }
  
  public SugarsoapPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initSugarsoapPortTypeProxy();
  }
  
  private void _initSugarsoapPortTypeProxy() {
    try {
      sugarsoapPortType = (new org.talend.sugarws.SugarsoapLocator()).getsugarsoapPort();
      if (sugarsoapPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sugarsoapPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sugarsoapPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sugarsoapPortType != null)
      ((javax.xml.rpc.Stub)sugarsoapPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.talend.sugarws.SugarsoapPortType getSugarsoapPortType() {
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType;
  }
  
  public int is_user_admin(java.lang.String session) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.is_user_admin(session);
  }
  
  public org.talend.sugarws.Set_entry_result login(org.talend.sugarws.User_auth user_auth, java.lang.String application_name) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.login(user_auth, application_name);
  }
  
  public int is_loopback() throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.is_loopback();
  }
  
  public int seamless_login(java.lang.String session) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.seamless_login(session);
  }
  
  public org.talend.sugarws.Get_entry_list_result get_entry_list(java.lang.String session, java.lang.String module_name, java.lang.String query, java.lang.String order_by, int offset, java.lang.String[] select_fields, int max_results, int deleted) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_entry_list(session, module_name, query, order_by, offset, select_fields, max_results, deleted);
  }
  
  public org.talend.sugarws.Get_entry_result get_entry(java.lang.String session, java.lang.String module_name, java.lang.String id, java.lang.String[] select_fields) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_entry(session, module_name, id, select_fields);
  }
  
  public org.talend.sugarws.Get_entry_result get_entries(java.lang.String session, java.lang.String module_name, java.lang.String[] ids, java.lang.String[] select_fields) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_entries(session, module_name, ids, select_fields);
  }
  
  public org.talend.sugarws.Set_entry_result set_entry(java.lang.String session, java.lang.String module_name, org.talend.sugarws.Name_value[] name_value_list) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.set_entry(session, module_name, name_value_list);
  }
  
  public org.talend.sugarws.Set_entries_result set_entries(java.lang.String session, java.lang.String module_name, org.talend.sugarws.Name_value[][] name_value_lists) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.set_entries(session, module_name, name_value_lists);
  }
  
  public org.talend.sugarws.Set_entry_result set_note_attachment(java.lang.String session, org.talend.sugarws.Note_attachment note) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.set_note_attachment(session, note);
  }
  
  public org.talend.sugarws.Return_note_attachment get_note_attachment(java.lang.String session, java.lang.String id) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_note_attachment(session, id);
  }
  
  public org.talend.sugarws.Error_value relate_note_to_module(java.lang.String session, java.lang.String note_id, java.lang.String module_name, java.lang.String module_id) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.relate_note_to_module(session, note_id, module_name, module_id);
  }
  
  public org.talend.sugarws.Get_entry_result get_related_notes(java.lang.String session, java.lang.String module_name, java.lang.String module_id, java.lang.String[] select_fields) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_related_notes(session, module_name, module_id, select_fields);
  }
  
  public org.talend.sugarws.Error_value logout(java.lang.String session) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.logout(session);
  }
  
  public org.talend.sugarws.Module_fields get_module_fields(java.lang.String session, java.lang.String module_name) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_module_fields(session, module_name);
  }
  
  public org.talend.sugarws.Module_list get_available_modules(java.lang.String session) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_available_modules(session);
  }
  
  public org.talend.sugarws.Error_value update_portal_user(java.lang.String session, java.lang.String portal_name, org.talend.sugarws.Name_value[] name_value_list) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.update_portal_user(session, portal_name, name_value_list);
  }
  
  public java.lang.String test(java.lang.String string) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.test(string);
  }
  
  public java.lang.String get_user_id(java.lang.String session) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_user_id(session);
  }
  
  public java.lang.String get_user_team_id(java.lang.String session) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_user_team_id(session);
  }
  
  public java.lang.String get_server_time() throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_server_time();
  }
  
  public java.lang.String get_gmt_time() throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_gmt_time();
  }
  
  public java.lang.String get_sugar_flavor() throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_sugar_flavor();
  }
  
  public java.lang.String get_server_version() throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_server_version();
  }
  
  public org.talend.sugarws.Get_relationships_result get_relationships(java.lang.String session, java.lang.String module_name, java.lang.String module_id, java.lang.String related_module, java.lang.String related_module_query, int deleted) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_relationships(session, module_name, module_id, related_module, related_module_query, deleted);
  }
  
  public org.talend.sugarws.Error_value set_relationship(java.lang.String session, org.talend.sugarws.Set_relationship_value set_relationship_value) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.set_relationship(session, set_relationship_value);
  }
  
  public org.talend.sugarws.Set_relationship_list_result set_relationships(java.lang.String session, org.talend.sugarws.Set_relationship_value[] set_relationship_list) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.set_relationships(session, set_relationship_list);
  }
  
  public org.talend.sugarws.Set_entry_result set_document_revision(java.lang.String session, org.talend.sugarws.Document_revision note) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.set_document_revision(session, note);
  }
  
  public org.talend.sugarws.Get_entry_list_result search_by_module(java.lang.String user_name, java.lang.String password, java.lang.String search_string, java.lang.String[] modules, int offset, int max_results) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.search_by_module(user_name, password, search_string, modules, offset, max_results);
  }
  
  public org.talend.sugarws.Get_sync_result_encoded get_mailmerge_document(java.lang.String session, java.lang.String file_name, java.lang.String[] fields) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_mailmerge_document(session, file_name, fields);
  }
  
  public org.talend.sugarws.Get_mailmerge_document_result get_mailmerge_document2(java.lang.String session, java.lang.String file_name, java.lang.String[] fields) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_mailmerge_document2(session, file_name, fields);
  }
  
  public org.talend.sugarws.Return_document_revision get_document_revision(java.lang.String session, java.lang.String i) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_document_revision(session, i);
  }
  
  public org.talend.sugarws.Error_value set_campaign_merge(java.lang.String session, java.lang.String[] targets, java.lang.String campaign_id) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.set_campaign_merge(session, targets, campaign_id);
  }
  
  public org.talend.sugarws.Get_entries_count_result get_entries_count(java.lang.String session, java.lang.String module_name, java.lang.String query, int deleted) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_entries_count(session, module_name, query, deleted);
  }
  
  public org.talend.sugarws.Set_entries_detail_result set_entries_details(java.lang.String session, java.lang.String module_name, org.talend.sugarws.Name_value[][] name_value_lists, java.lang.String[] select_fields) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.set_entries_details(session, module_name, name_value_lists, select_fields);
  }
  
  public org.talend.sugarws.Get_entry_list_result_encoded sync_get_modified_relationships(java.lang.String session, java.lang.String module_name, java.lang.String related_module, java.lang.String from_date, java.lang.String to_date, int offset, int max_results, int deleted, java.lang.String module_id, java.lang.String[] select_fields, java.lang.String[] ids, java.lang.String relationship_name, java.lang.String deletion_date, int php_serialize) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.sync_get_modified_relationships(session, module_name, related_module, from_date, to_date, offset, max_results, deleted, module_id, select_fields, ids, relationship_name, deletion_date, php_serialize);
  }
  
  public org.talend.sugarws.Get_sync_result_encoded get_modified_entries(java.lang.String session, java.lang.String module_name, java.lang.String[] ids, java.lang.String[] select_fields) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_modified_entries(session, module_name, ids, select_fields);
  }
  
  public org.talend.sugarws.Get_sync_result_encoded get_attendee_list(java.lang.String session, java.lang.String module_name, java.lang.String id) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_attendee_list(session, module_name, id);
  }
  
  public java.lang.String create_session(java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.create_session(user_name, password);
  }
  
  public java.lang.String end_session(java.lang.String user_name) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.end_session(user_name);
  }
  
  public org.talend.sugarws.Contact_detail[] contact_by_email(java.lang.String user_name, java.lang.String password, java.lang.String email_address) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.contact_by_email(user_name, password, email_address);
  }
  
  public org.talend.sugarws.Contact_detail[] get_contact_relationships(java.lang.String user_name, java.lang.String password, java.lang.String id) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.get_contact_relationships(user_name, password, id);
  }
  
  public org.talend.sugarws.User_detail[] user_list(java.lang.String user_name, java.lang.String password) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.user_list(user_name, password);
  }
  
  public org.talend.sugarws.Contact_detail[] search(java.lang.String user_name, java.lang.String password, java.lang.String name) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.search(user_name, password, name);
  }
  
  public java.lang.String track_email(java.lang.String user_name, java.lang.String password, java.lang.String parent_id, java.lang.String contact_ids, java.util.Date date_sent, java.lang.String email_subject, java.lang.String email_body) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.track_email(user_name, password, parent_id, contact_ids, date_sent, email_subject, email_body);
  }
  
  public java.lang.String create_contact(java.lang.String user_name, java.lang.String password, java.lang.String first_name, java.lang.String last_name, java.lang.String email_address) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.create_contact(user_name, password, first_name, last_name, email_address);
  }
  
  public java.lang.String create_lead(java.lang.String user_name, java.lang.String password, java.lang.String first_name, java.lang.String last_name, java.lang.String email_address) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.create_lead(user_name, password, first_name, last_name, email_address);
  }
  
  public java.lang.String create_account(java.lang.String user_name, java.lang.String password, java.lang.String name, java.lang.String phone, java.lang.String website) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.create_account(user_name, password, name, phone, website);
  }
  
  public java.lang.String create_opportunity(java.lang.String user_name, java.lang.String password, java.lang.String name, java.lang.String amount) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.create_opportunity(user_name, password, name, amount);
  }
  
  public java.lang.String create_case(java.lang.String user_name, java.lang.String password, java.lang.String name) throws java.rmi.RemoteException{
    if (sugarsoapPortType == null)
      _initSugarsoapPortTypeProxy();
    return sugarsoapPortType.create_case(user_name, password, name);
  }
  
  
}