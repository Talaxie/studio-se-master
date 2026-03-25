/*
 * An XML document type.
 * Localname: BulkOperationSource
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.BulkOperationSourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one BulkOperationSource(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class BulkOperationSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.BulkOperationSourceDocument
{
    
    public BulkOperationSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BULKOPERATIONSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BulkOperationSource");
    
    
    /**
     * Gets the "BulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource.Enum getBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "BulkOperationSource" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource xgetBulkOperationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BulkOperationSource" element
     */
    public void setBulkOperationSource(com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource.Enum bulkOperationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BULKOPERATIONSOURCE$0);
            }
            target.setEnumValue(bulkOperationSource);
        }
    }
    
    /**
     * Sets (as xml) the "BulkOperationSource" element
     */
    public void xsetBulkOperationSource(com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource bulkOperationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource)get_store().find_element_user(BULKOPERATIONSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.coretypes.BulkOperationSource)get_store().add_element_user(BULKOPERATIONSOURCE$0);
            }
            target.set(bulkOperationSource);
        }
    }
}
