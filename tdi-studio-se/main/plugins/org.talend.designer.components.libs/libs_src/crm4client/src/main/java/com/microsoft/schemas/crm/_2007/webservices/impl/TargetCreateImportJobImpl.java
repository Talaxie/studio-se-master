/*
 * XML Type:  TargetCreateImportJob
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateImportJob
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateImportJob(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateImportJobImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateImportJob
{
    
    public TargetCreateImportJobImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTJOB$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportJob");
    
    
    /**
     * Gets the "ImportJob" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Importjob getImportJob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importjob target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importjob)get_store().find_element_user(IMPORTJOB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImportJob" element
     */
    public void setImportJob(com.microsoft.schemas.crm._2007.webservices.Importjob importJob)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importjob target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importjob)get_store().find_element_user(IMPORTJOB$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Importjob)get_store().add_element_user(IMPORTJOB$0);
            }
            target.set(importJob);
        }
    }
    
    /**
     * Appends and returns a new empty "ImportJob" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Importjob addNewImportJob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importjob target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importjob)get_store().add_element_user(IMPORTJOB$0);
            return target;
        }
    }
}
