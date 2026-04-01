/*
 * XML Type:  TargetCreateColumnMapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateColumnMapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateColumnMapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateColumnMappingImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateColumnMapping
{
    
    public TargetCreateColumnMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNMAPPING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ColumnMapping");
    
    
    /**
     * Gets the "ColumnMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Columnmapping getColumnMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Columnmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Columnmapping)get_store().find_element_user(COLUMNMAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ColumnMapping" element
     */
    public void setColumnMapping(com.microsoft.schemas.crm._2007.webservices.Columnmapping columnMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Columnmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Columnmapping)get_store().find_element_user(COLUMNMAPPING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Columnmapping)get_store().add_element_user(COLUMNMAPPING$0);
            }
            target.set(columnMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "ColumnMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Columnmapping addNewColumnMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Columnmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Columnmapping)get_store().add_element_user(COLUMNMAPPING$0);
            return target;
        }
    }
}
