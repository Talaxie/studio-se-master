/*
 * XML Type:  TargetCreateSalesLiteratureItem
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateSalesLiteratureItem
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateSalesLiteratureItem(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateSalesLiteratureItemImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateSalesLiteratureItem
{
    
    public TargetCreateSalesLiteratureItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALESLITERATUREITEM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SalesLiteratureItem");
    
    
    /**
     * Gets the "SalesLiteratureItem" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem getSalesLiteratureItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem)get_store().find_element_user(SALESLITERATUREITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SalesLiteratureItem" element
     */
    public void setSalesLiteratureItem(com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem salesLiteratureItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem)get_store().find_element_user(SALESLITERATUREITEM$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem)get_store().add_element_user(SALESLITERATUREITEM$0);
            }
            target.set(salesLiteratureItem);
        }
    }
    
    /**
     * Appends and returns a new empty "SalesLiteratureItem" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem addNewSalesLiteratureItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem)get_store().add_element_user(SALESLITERATUREITEM$0);
            return target;
        }
    }
}
