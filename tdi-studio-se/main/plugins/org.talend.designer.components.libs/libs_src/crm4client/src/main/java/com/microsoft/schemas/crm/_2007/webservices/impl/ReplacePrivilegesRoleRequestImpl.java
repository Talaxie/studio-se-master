/*
 * XML Type:  ReplacePrivilegesRoleRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ReplacePrivilegesRoleRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ReplacePrivilegesRoleRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ReplacePrivilegesRoleRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ReplacePrivilegesRoleRequest
{
    
    public ReplacePrivilegesRoleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RoleId");
    private static final javax.xml.namespace.QName PRIVILEGES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Privileges");
    
    
    /**
     * Gets the "RoleId" element
     */
    public java.lang.String getRoleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RoleId" element
     */
    public com.microsoft.wsdl.types.Guid xgetRoleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ROLEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RoleId" element
     */
    public void setRoleId(java.lang.String roleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLEID$0);
            }
            target.setStringValue(roleId);
        }
    }
    
    /**
     * Sets (as xml) the "RoleId" element
     */
    public void xsetRoleId(com.microsoft.wsdl.types.Guid roleId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ROLEID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ROLEID$0);
            }
            target.set(roleId);
        }
    }
    
    /**
     * Gets the "Privileges" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege getPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege)get_store().find_element_user(PRIVILEGES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Privileges" element
     */
    public void setPrivileges(com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege privileges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege)get_store().find_element_user(PRIVILEGES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege)get_store().add_element_user(PRIVILEGES$2);
            }
            target.set(privileges);
        }
    }
    
    /**
     * Appends and returns a new empty "Privileges" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege addNewPrivileges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege)get_store().add_element_user(PRIVILEGES$2);
            return target;
        }
    }
}
