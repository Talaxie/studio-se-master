/*
 * XML Type:  RemovePrivilegeRoleRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RemovePrivilegeRoleRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RemovePrivilegeRoleRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RemovePrivilegeRoleRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RemovePrivilegeRoleRequest
{
    
    public RemovePrivilegeRoleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RoleId");
    private static final javax.xml.namespace.QName PRIVILEGEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PrivilegeId");
    
    
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
     * Gets the "PrivilegeId" element
     */
    public java.lang.String getPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrivilegeId" element
     */
    public com.microsoft.wsdl.types.Guid xgetPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRIVILEGEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PrivilegeId" element
     */
    public void setPrivilegeId(java.lang.String privilegeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVILEGEID$2);
            }
            target.setStringValue(privilegeId);
        }
    }
    
    /**
     * Sets (as xml) the "PrivilegeId" element
     */
    public void xsetPrivilegeId(com.microsoft.wsdl.types.Guid privilegeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRIVILEGEID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(PRIVILEGEID$2);
            }
            target.set(privilegeId);
        }
    }
}
