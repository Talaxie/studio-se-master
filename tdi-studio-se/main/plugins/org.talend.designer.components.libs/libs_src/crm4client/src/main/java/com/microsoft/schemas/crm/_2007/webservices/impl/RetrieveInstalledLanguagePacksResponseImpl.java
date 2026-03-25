/*
 * XML Type:  RetrieveInstalledLanguagePacksResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveInstalledLanguagePacksResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveInstalledLanguagePacksResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveInstalledLanguagePacksResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveInstalledLanguagePacksResponse
{
    
    public RetrieveInstalledLanguagePacksResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEINSTALLEDLANGUAGEPACKS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RetrieveInstalledLanguagePacks");
    
    
    /**
     * Gets the "RetrieveInstalledLanguagePacks" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt getRetrieveInstalledLanguagePacks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(RETRIEVEINSTALLEDLANGUAGEPACKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveInstalledLanguagePacks" element
     */
    public void setRetrieveInstalledLanguagePacks(com.microsoft.schemas.crm._2007.webservices.ArrayOfInt retrieveInstalledLanguagePacks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(RETRIEVEINSTALLEDLANGUAGEPACKS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(RETRIEVEINSTALLEDLANGUAGEPACKS$0);
            }
            target.set(retrieveInstalledLanguagePacks);
        }
    }
    
    /**
     * Appends and returns a new empty "RetrieveInstalledLanguagePacks" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt addNewRetrieveInstalledLanguagePacks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(RETRIEVEINSTALLEDLANGUAGEPACKS$0);
            return target;
        }
    }
}
