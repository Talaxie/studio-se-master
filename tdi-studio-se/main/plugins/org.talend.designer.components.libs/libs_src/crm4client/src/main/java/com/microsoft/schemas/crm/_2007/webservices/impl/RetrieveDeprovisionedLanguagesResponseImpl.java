/*
 * XML Type:  RetrieveDeprovisionedLanguagesResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveDeprovisionedLanguagesResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveDeprovisionedLanguagesResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveDeprovisionedLanguagesResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveDeprovisionedLanguagesResponse
{
    
    public RetrieveDeprovisionedLanguagesResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEDEPROVISIONEDLANGUAGES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RetrieveDeprovisionedLanguages");
    
    
    /**
     * Gets the "RetrieveDeprovisionedLanguages" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt getRetrieveDeprovisionedLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(RETRIEVEDEPROVISIONEDLANGUAGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveDeprovisionedLanguages" element
     */
    public void setRetrieveDeprovisionedLanguages(com.microsoft.schemas.crm._2007.webservices.ArrayOfInt retrieveDeprovisionedLanguages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(RETRIEVEDEPROVISIONEDLANGUAGES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(RETRIEVEDEPROVISIONEDLANGUAGES$0);
            }
            target.set(retrieveDeprovisionedLanguages);
        }
    }
    
    /**
     * Appends and returns a new empty "RetrieveDeprovisionedLanguages" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt addNewRetrieveDeprovisionedLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(RETRIEVEDEPROVISIONEDLANGUAGES$0);
            return target;
        }
    }
}
