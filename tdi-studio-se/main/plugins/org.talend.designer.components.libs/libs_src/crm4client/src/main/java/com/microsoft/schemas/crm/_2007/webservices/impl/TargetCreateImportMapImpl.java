/*
 * XML Type:  TargetCreateImportMap
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateImportMap
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateImportMap(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateImportMapImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateImportMap
{
    
    public TargetCreateImportMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTMAP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportMap");
    
    
    /**
     * Gets the "ImportMap" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Importmap getImportMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importmap target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importmap)get_store().find_element_user(IMPORTMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImportMap" element
     */
    public void setImportMap(com.microsoft.schemas.crm._2007.webservices.Importmap importMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importmap target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importmap)get_store().find_element_user(IMPORTMAP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Importmap)get_store().add_element_user(IMPORTMAP$0);
            }
            target.set(importMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ImportMap" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Importmap addNewImportMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Importmap target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Importmap)get_store().add_element_user(IMPORTMAP$0);
            return target;
        }
    }
}
