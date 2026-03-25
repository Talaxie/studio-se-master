/*
 * XML Type:  RetrieveSharedPrincipalsAndAccessResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveSharedPrincipalsAndAccessResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveSharedPrincipalsAndAccessResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveSharedPrincipalsAndAccessResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveSharedPrincipalsAndAccessResponse
{
    
    public RetrieveSharedPrincipalsAndAccessResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRINCIPALACCESSES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PrincipalAccesses");
    
    
    /**
     * Gets the "PrincipalAccesses" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess getPrincipalAccesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().find_element_user(PRINCIPALACCESSES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrincipalAccesses" element
     */
    public void setPrincipalAccesses(com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess principalAccesses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().find_element_user(PRINCIPALACCESSES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().add_element_user(PRINCIPALACCESSES$0);
            }
            target.set(principalAccesses);
        }
    }
    
    /**
     * Appends and returns a new empty "PrincipalAccesses" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess addNewPrincipalAccesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().add_element_user(PRINCIPALACCESSES$0);
            return target;
        }
    }
}
