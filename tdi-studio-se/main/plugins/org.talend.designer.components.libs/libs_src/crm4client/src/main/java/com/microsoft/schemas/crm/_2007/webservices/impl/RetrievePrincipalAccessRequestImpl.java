/*
 * XML Type:  RetrievePrincipalAccessRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrievePrincipalAccessRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrievePrincipalAccessRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrievePrincipalAccessRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RetrievePrincipalAccessRequest
{
    
    public RetrievePrincipalAccessRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Target");
    private static final javax.xml.namespace.QName PRINCIPAL$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Principal");
    
    
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
     * Gets the "Principal" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal getPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(PRINCIPAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Principal" element
     */
    public void setPrincipal(com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal principal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(PRINCIPAL$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(PRINCIPAL$2);
            }
            target.set(principal);
        }
    }
    
    /**
     * Appends and returns a new empty "Principal" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal addNewPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(PRINCIPAL$2);
            return target;
        }
    }
}
