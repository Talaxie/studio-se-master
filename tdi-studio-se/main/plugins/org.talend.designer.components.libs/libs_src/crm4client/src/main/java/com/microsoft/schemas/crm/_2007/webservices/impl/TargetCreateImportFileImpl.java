/*
 * XML Type:  TargetCreateImportFile
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateImportFile
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateImportFile(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateImportFileImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateImportFile
{
    
    public TargetCreateImportFileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTFILE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportFile");
    
    
    /**
     * Gets the "ImportFile" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Importfile getImportFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importfile target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importfile)get_store().find_element_user(IMPORTFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImportFile" element
     */
    public void setImportFile(com.microsoft.schemas.crm._2007.webservices.Importfile importFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importfile target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importfile)get_store().find_element_user(IMPORTFILE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Importfile)get_store().add_element_user(IMPORTFILE$0);
            }
            target.set(importFile);
        }
    }
    
    /**
     * Appends and returns a new empty "ImportFile" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Importfile addNewImportFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importfile target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importfile)get_store().add_element_user(IMPORTFILE$0);
            return target;
        }
    }
}
