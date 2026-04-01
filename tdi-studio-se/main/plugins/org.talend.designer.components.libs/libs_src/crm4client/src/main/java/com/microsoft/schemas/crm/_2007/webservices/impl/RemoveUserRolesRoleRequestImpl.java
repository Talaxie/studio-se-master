/*
 * XML Type:  RemoveUserRolesRoleRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RemoveUserRolesRoleRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RemoveUserRolesRoleRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RemoveUserRolesRoleRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RemoveUserRolesRoleRequest
{
    
    public RemoveUserRolesRoleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UserId");
    private static final javax.xml.namespace.QName ROLEIDS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RoleIds");
    
    
    /**
     * Gets the "UserId" element
     */
    public java.lang.String getUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserId" element
     */
    public com.microsoft.wsdl.types.Guid xgetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(USERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserId" element
     */
    public void setUserId(java.lang.String userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
            }
            target.setStringValue(userId);
        }
    }
    
    /**
     * Sets (as xml) the "UserId" element
     */
    public void xsetUserId(com.microsoft.wsdl.types.Guid userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(USERID$0);
            }
            target.set(userId);
        }
    }
    
    /**
     * Gets the "RoleIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getRoleIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(ROLEIDS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RoleIds" element
     */
    public void setRoleIds(com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid roleIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(ROLEIDS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(ROLEIDS$2);
            }
            target.set(roleIds);
        }
    }
    
    /**
     * Appends and returns a new empty "RoleIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid addNewRoleIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(ROLEIDS$2);
            return target;
        }
    }
}
