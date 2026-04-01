/*
 * XML Type:  TargetCreateSalesOrder
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateSalesOrder
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateSalesOrder(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateSalesOrderImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateSalesOrder
{
    
    public TargetCreateSalesOrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALESORDER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SalesOrder");
    
    
    /**
     * Gets the "SalesOrder" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesorder getSalesOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorder target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorder)get_store().find_element_user(SALESORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SalesOrder" element
     */
    public void setSalesOrder(com.microsoft.schemas.crm._2007.webservices.Salesorder salesOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorder target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorder)get_store().find_element_user(SALESORDER$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Salesorder)get_store().add_element_user(SALESORDER$0);
            }
            target.set(salesOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "SalesOrder" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesorder addNewSalesOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorder target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorder)get_store().add_element_user(SALESORDER$0);
            return target;
        }
    }
}
