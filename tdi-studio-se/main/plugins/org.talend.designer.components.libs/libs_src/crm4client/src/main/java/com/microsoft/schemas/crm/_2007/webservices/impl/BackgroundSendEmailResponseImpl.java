/*
 * XML Type:  BackgroundSendEmailResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.BackgroundSendEmailResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML BackgroundSendEmailResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class BackgroundSendEmailResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.BackgroundSendEmailResponse
{
    
    public BackgroundSendEmailResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSENTITYCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/WebServices", "BusinessEntityCollection");
    private static final javax.xml.namespace.QName HASATTACHMENTS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "HasAttachments");
    
    
    /**
     * Gets the "BusinessEntityCollection" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection getBusinessEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().find_element_user(BUSINESSENTITYCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BusinessEntityCollection" element
     */
    public void setBusinessEntityCollection(com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection businessEntityCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().find_element_user(BUSINESSENTITYCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().add_element_user(BUSINESSENTITYCOLLECTION$0);
            }
            target.set(businessEntityCollection);
        }
    }
    
    /**
     * Appends and returns a new empty "BusinessEntityCollection" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection addNewBusinessEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().add_element_user(BUSINESSENTITYCOLLECTION$0);
            return target;
        }
    }
    
    /**
     * Gets the "HasAttachments" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean getHasAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().find_element_user(HASATTACHMENTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HasAttachments" element
     */
    public void setHasAttachments(com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean hasAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().find_element_user(HASATTACHMENTS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().add_element_user(HASATTACHMENTS$2);
            }
            target.set(hasAttachments);
        }
    }
    
    /**
     * Appends and returns a new empty "HasAttachments" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean addNewHasAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().add_element_user(HASATTACHMENTS$2);
            return target;
        }
    }
}
