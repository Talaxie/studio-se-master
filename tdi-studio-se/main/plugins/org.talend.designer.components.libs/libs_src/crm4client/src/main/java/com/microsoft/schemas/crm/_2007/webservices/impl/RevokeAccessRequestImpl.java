/*
 * XML Type:  RevokeAccessRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RevokeAccessRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RevokeAccessRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RevokeAccessRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RevokeAccessRequest
{
    
    public RevokeAccessRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Target");
    private static final javax.xml.namespace.QName REVOKEE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Revokee");
    
    
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
     * Gets the "Revokee" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal getRevokee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(REVOKEE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Revokee" element
     */
    public void setRevokee(com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal revokee)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(REVOKEE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(REVOKEE$2);
            }
            target.set(revokee);
        }
    }
    
    /**
     * Appends and returns a new empty "Revokee" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal addNewRevokee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(REVOKEE$2);
            return target;
        }
    }
}
