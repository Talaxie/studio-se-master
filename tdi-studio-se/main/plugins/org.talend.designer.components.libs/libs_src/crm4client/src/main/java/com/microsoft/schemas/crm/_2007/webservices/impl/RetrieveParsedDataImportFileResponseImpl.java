/*
 * XML Type:  RetrieveParsedDataImportFileResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveParsedDataImportFileResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveParsedDataImportFileResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveParsedDataImportFileResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveParsedDataImportFileResponse
{
    
    public RetrieveParsedDataImportFileResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Values");
    
    
    /**
     * Gets the "Values" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Values" element
     */
    public void setValues(com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().add_element_user(VALUES$0);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "Values" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().add_element_user(VALUES$0);
            return target;
        }
    }
}
