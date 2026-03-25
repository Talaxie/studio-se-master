/*
 * XML Type:  TargetCreateRole
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateRole
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateRole(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateRoleImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateRole
{
    
    public TargetCreateRoleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Role");
    
    
    /**
     * Gets the "Role" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Role getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Role target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Role)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Role" element
     */
    public void setRole(com.microsoft.schemas.crm._2007.webservices.Role role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Role target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Role)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Role)get_store().add_element_user(ROLE$0);
            }
            target.set(role);
        }
    }
    
    /**
     * Appends and returns a new empty "Role" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Role addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Role target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Role)get_store().add_element_user(ROLE$0);
            return target;
        }
    }
}
