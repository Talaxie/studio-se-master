/*
 * XML Type:  RetrieveProvisionedLanguagesResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveProvisionedLanguagesResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveProvisionedLanguagesResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveProvisionedLanguagesResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveProvisionedLanguagesResponse
{
    
    public RetrieveProvisionedLanguagesResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEPROVISIONEDLANGUAGES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RetrieveProvisionedLanguages");
    
    
    /**
     * Gets the "RetrieveProvisionedLanguages" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt getRetrieveProvisionedLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(RETRIEVEPROVISIONEDLANGUAGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveProvisionedLanguages" element
     */
    public void setRetrieveProvisionedLanguages(com.microsoft.schemas.crm._2007.webservices.ArrayOfInt retrieveProvisionedLanguages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(RETRIEVEPROVISIONEDLANGUAGES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(RETRIEVEPROVISIONEDLANGUAGES$0);
            }
            target.set(retrieveProvisionedLanguages);
        }
    }
    
    /**
     * Appends and returns a new empty "RetrieveProvisionedLanguages" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt addNewRetrieveProvisionedLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(RETRIEVEPROVISIONEDLANGUAGES$0);
            return target;
        }
    }
}
