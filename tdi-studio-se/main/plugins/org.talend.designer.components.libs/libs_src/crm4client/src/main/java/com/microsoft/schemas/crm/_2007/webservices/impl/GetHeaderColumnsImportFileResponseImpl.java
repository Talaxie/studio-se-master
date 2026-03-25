/*
 * XML Type:  GetHeaderColumnsImportFileResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.GetHeaderColumnsImportFileResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML GetHeaderColumnsImportFileResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class GetHeaderColumnsImportFileResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.GetHeaderColumnsImportFileResponse
{
    
    public GetHeaderColumnsImportFileResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Columns");
    
    
    /**
     * Gets the "Columns" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString getColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(COLUMNS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Columns" element
     */
    public void setColumns(com.microsoft.schemas.crm._2007.webservices.ArrayOfString columns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(COLUMNS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(COLUMNS$0);
            }
            target.set(columns);
        }
    }
    
    /**
     * Appends and returns a new empty "Columns" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString addNewColumns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(COLUMNS$0);
            return target;
        }
    }
}
