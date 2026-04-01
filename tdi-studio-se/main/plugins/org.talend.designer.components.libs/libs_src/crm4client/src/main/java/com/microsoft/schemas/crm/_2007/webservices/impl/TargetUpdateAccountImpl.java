/*
 * XML Type:  TargetUpdateAccount
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateAccount
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateAccount(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateAccountImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateAccount
{
    
    public TargetUpdateAccountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Account");
    
    
    /**
     * Gets the "Account" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Account getAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Account target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Account)get_store().find_element_user(ACCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Account" element
     */
    public void setAccount(com.microsoft.schemas.crm._2007.webservices.Account account)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Account target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Account)get_store().find_element_user(ACCOUNT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Account)get_store().add_element_user(ACCOUNT$0);
            }
            target.set(account);
        }
    }
    
    /**
     * Appends and returns a new empty "Account" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Account addNewAccount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Account target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Account)get_store().add_element_user(ACCOUNT$0);
            return target;
        }
    }
}
