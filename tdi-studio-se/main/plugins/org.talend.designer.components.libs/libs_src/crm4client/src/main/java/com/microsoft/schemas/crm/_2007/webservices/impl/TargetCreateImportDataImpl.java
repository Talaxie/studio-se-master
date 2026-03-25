/*
 * XML Type:  TargetCreateImportData
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateImportData
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateImportData(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateImportDataImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateImportData
{
    
    public TargetCreateImportDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTDATA$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportData");
    
    
    /**
     * Gets the "ImportData" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Importdata getImportData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importdata target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importdata)get_store().find_element_user(IMPORTDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImportData" element
     */
    public void setImportData(com.microsoft.schemas.crm._2007.webservices.Importdata importData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importdata target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importdata)get_store().find_element_user(IMPORTDATA$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Importdata)get_store().add_element_user(IMPORTDATA$0);
            }
            target.set(importData);
        }
    }
    
    /**
     * Appends and returns a new empty "ImportData" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Importdata addNewImportData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importdata target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importdata)get_store().add_element_user(IMPORTDATA$0);
            return target;
        }
    }
}
