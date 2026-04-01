/*
 * XML Type:  GetDistinctValuesImportFileResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.GetDistinctValuesImportFileResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML GetDistinctValuesImportFileResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class GetDistinctValuesImportFileResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.GetDistinctValuesImportFileResponse
{
    
    public GetDistinctValuesImportFileResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Values");
    
    
    /**
     * Gets the "Values" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(VALUES$0, 0);
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
    public void setValues(com.microsoft.schemas.crm._2007.webservices.ArrayOfString values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(VALUES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(VALUES$0);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "Values" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(VALUES$0);
            return target;
        }
    }
}
