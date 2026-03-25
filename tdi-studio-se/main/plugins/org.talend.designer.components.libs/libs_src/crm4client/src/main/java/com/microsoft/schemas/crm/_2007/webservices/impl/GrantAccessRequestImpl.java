/*
 * XML Type:  GrantAccessRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.GrantAccessRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML GrantAccessRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class GrantAccessRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.GrantAccessRequest
{
    
    public GrantAccessRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Target");
    private static final javax.xml.namespace.QName PRINCIPALACCESS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PrincipalAccess");
    
    
    /**
     * Gets the "Target" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TargetOwned getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetOwned target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetOwned)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Target" element
     */
    public void setTarget(com.microsoft.schemas.crm._2007.webservices.TargetOwned targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetOwned target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetOwned)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.TargetOwned)get_store().add_element_user(TARGET$0);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TargetOwned addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetOwned target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetOwned)get_store().add_element_user(TARGET$0);
            return target;
        }
    }
    
    /**
     * Gets the "PrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess getPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrincipalAccess" element
     */
    public void setPrincipalAccess(com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess principalAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().add_element_user(PRINCIPALACCESS$2);
            }
            target.set(principalAccess);
        }
    }
    
    /**
     * Appends and returns a new empty "PrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess addNewPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().add_element_user(PRINCIPALACCESS$2);
            return target;
        }
    }
}
