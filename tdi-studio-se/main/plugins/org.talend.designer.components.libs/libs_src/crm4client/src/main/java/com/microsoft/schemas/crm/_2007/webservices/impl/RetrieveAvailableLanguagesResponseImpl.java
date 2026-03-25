/*
 * XML Type:  RetrieveAvailableLanguagesResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveAvailableLanguagesResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveAvailableLanguagesResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveAvailableLanguagesResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveAvailableLanguagesResponse
{
    
    public RetrieveAvailableLanguagesResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALEIDS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "LocaleIds");
    
    
    /**
     * Gets the "LocaleIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt getLocaleIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(LOCALEIDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocaleIds" element
     */
    public void setLocaleIds(com.microsoft.schemas.crm._2007.webservices.ArrayOfInt localeIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(LOCALEIDS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(LOCALEIDS$0);
            }
            target.set(localeIds);
        }
    }
    
    /**
     * Appends and returns a new empty "LocaleIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt addNewLocaleIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(LOCALEIDS$0);
            return target;
        }
    }
}
