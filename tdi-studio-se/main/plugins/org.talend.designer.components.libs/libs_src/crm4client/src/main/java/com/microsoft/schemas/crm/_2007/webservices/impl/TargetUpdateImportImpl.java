/*
 * XML Type:  TargetUpdateImport
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateImport
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateImport(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateImportImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateImport
{
    
    public TargetUpdateImportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Import");
    
    
    /**
     * Gets the "Import" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Import getImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Import target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Import)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Import" element
     */
    public void setImport(com.microsoft.schemas.crm._2007.webservices.Import ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Import target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Import)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Import)get_store().add_element_user(IMPORT$0);
            }
            target.set(ximport);
        }
    }
    
    /**
     * Appends and returns a new empty "Import" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Import addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Import target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Import)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
}
