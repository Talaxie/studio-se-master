/*
 * XML Type:  TargetUpdateSalesLiterature
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateSalesLiterature
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateSalesLiterature(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateSalesLiteratureImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateSalesLiterature
{
    
    public TargetUpdateSalesLiteratureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALESLITERATURE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SalesLiterature");
    
    
    /**
     * Gets the "SalesLiterature" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesliterature getSalesLiterature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesliterature target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesliterature)get_store().find_element_user(SALESLITERATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SalesLiterature" element
     */
    public void setSalesLiterature(com.microsoft.schemas.crm._2007.webservices.Salesliterature salesLiterature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesliterature target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesliterature)get_store().find_element_user(SALESLITERATURE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Salesliterature)get_store().add_element_user(SALESLITERATURE$0);
            }
            target.set(salesLiterature);
        }
    }
    
    /**
     * Appends and returns a new empty "SalesLiterature" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesliterature addNewSalesLiterature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesliterature target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesliterature)get_store().add_element_user(SALESLITERATURE$0);
            return target;
        }
    }
}
