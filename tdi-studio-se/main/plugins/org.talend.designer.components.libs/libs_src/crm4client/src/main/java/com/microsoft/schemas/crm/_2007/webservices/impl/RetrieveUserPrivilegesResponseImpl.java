/*
 * XML Type:  RetrieveUserPrivilegesResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveUserPrivilegesResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveUserPrivilegesResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveUserPrivilegesResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveUserPrivilegesResponse
{
    
    public RetrieveUserPrivilegesResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLEPRIVILEGES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RolePrivileges");
    
    
    /**
     * Gets the "RolePrivileges" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege getRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege)get_store().find_element_user(ROLEPRIVILEGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RolePrivileges" element
     */
    public void setRolePrivileges(com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege rolePrivileges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege)get_store().find_element_user(ROLEPRIVILEGES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege)get_store().add_element_user(ROLEPRIVILEGES$0);
            }
            target.set(rolePrivileges);
        }
    }
    
    /**
     * Appends and returns a new empty "RolePrivileges" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege addNewRolePrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege)get_store().add_element_user(ROLEPRIVILEGES$0);
            return target;
        }
    }
}
