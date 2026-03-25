/**
 * VtigerolservicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.vtiger.module.outlook;

public interface VtigerolservicePortType extends java.rmi.Remote {
    public java.lang.String loginToVtiger(java.lang.String userid, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String checkEmailPermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkContactPermission(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String checkActivityPermission(java.lang.String username) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.outlook.Contactdetail[] searchContactsByEmail(java.lang.String username, java.lang.String emailaddress) throws java.rmi.RemoteException;
    public java.lang.String addMessageToContact(java.lang.String username, java.lang.String contactid, org.talend.vtiger.module.outlook.Emailmsgdetail msgdtls) throws java.rmi.RemoteException;
    public java.lang.String addEmailAttachment(java.lang.String emailid, java.lang.String filedata, java.lang.String filename, java.lang.String filesize, java.lang.String filetype, java.lang.String username) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.outlook.Contactdetail[] getContacts(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String addContacts(java.lang.String username, org.talend.vtiger.module.outlook.Contactdetail[] cntdtls) throws java.rmi.RemoteException;
    public java.lang.String updateContacts(java.lang.String username, org.talend.vtiger.module.outlook.Contactdetail[] cntdtls) throws java.rmi.RemoteException;
    public java.lang.String deleteContacts(java.lang.String username, java.lang.String crmid) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.outlook.Taskdetail[] getTasks(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String addTasks(java.lang.String username, org.talend.vtiger.module.outlook.Taskdetail[] taskdtls) throws java.rmi.RemoteException;
    public java.lang.String updateTasks(java.lang.String username, org.talend.vtiger.module.outlook.Taskdetail[] taskdtls) throws java.rmi.RemoteException;
    public java.lang.String deleteTasks(java.lang.String username, java.lang.String crmid) throws java.rmi.RemoteException;
    public org.talend.vtiger.module.outlook.Clndrdetail[] getClndr(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.String addClndr(java.lang.String username, org.talend.vtiger.module.outlook.Clndrdetail[] clndrdtls) throws java.rmi.RemoteException;
    public java.lang.String updateClndr(java.lang.String username, org.talend.vtiger.module.outlook.Clndrdetail[] clndrdtls) throws java.rmi.RemoteException;
    public java.lang.String deleteClndr(java.lang.String username, java.lang.String crmid) throws java.rmi.RemoteException;
}
