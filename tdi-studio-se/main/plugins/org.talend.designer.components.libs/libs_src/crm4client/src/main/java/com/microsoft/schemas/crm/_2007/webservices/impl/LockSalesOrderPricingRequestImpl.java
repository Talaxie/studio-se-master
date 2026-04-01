/*
 * XML Type:  LockSalesOrderPricingRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.LockSalesOrderPricingRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML LockSalesOrderPricingRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class LockSalesOrderPricingRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.LockSalesOrderPricingRequest
{
    
    public LockSalesOrderPricingRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALESORDERID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SalesOrderId");
    
    
    /**
     * Gets the "SalesOrderId" element
     */
    public java.lang.String getSalesOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESORDERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SalesOrderId" element
     */
    public com.microsoft.wsdl.types.Guid xgetSalesOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SALESORDERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SalesOrderId" element
     */
    public void setSalesOrderId(java.lang.String salesOrderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESORDERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALESORDERID$0);
            }
            target.setStringValue(salesOrderId);
        }
    }
    
    /**
     * Sets (as xml) the "SalesOrderId" element
     */
    public void xsetSalesOrderId(com.microsoft.wsdl.types.Guid salesOrderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SALESORDERID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SALESORDERID$0);
            }
            target.set(salesOrderId);
        }
    }
}
