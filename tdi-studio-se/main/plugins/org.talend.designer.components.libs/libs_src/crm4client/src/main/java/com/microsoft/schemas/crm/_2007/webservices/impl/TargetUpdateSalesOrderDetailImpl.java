/*
 * XML Type:  TargetUpdateSalesOrderDetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateSalesOrderDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateSalesOrderDetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateSalesOrderDetailImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateSalesOrderDetail
{
    
    public TargetUpdateSalesOrderDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALESORDERDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SalesOrderDetail");
    
    
    /**
     * Gets the "SalesOrderDetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesorderdetail getSalesOrderDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorderdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorderdetail)get_store().find_element_user(SALESORDERDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SalesOrderDetail" element
     */
    public void setSalesOrderDetail(com.microsoft.schemas.crm._2007.webservices.Salesorderdetail salesOrderDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorderdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorderdetail)get_store().find_element_user(SALESORDERDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Salesorderdetail)get_store().add_element_user(SALESORDERDETAIL$0);
            }
            target.set(salesOrderDetail);
        }
    }
    
    /**
     * Appends and returns a new empty "SalesOrderDetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesorderdetail addNewSalesOrderDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorderdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorderdetail)get_store().add_element_user(SALESORDERDETAIL$0);
            return target;
        }
    }
}
