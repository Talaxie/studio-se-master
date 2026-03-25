/*
 * XML Type:  TargetCreateOrderClose
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateOrderClose
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateOrderClose(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateOrderCloseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateOrderClose
{
    
    public TargetCreateOrderCloseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERCLOSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OrderClose");
    
    
    /**
     * Gets the "OrderClose" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Orderclose getOrderClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Orderclose target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Orderclose)get_store().find_element_user(ORDERCLOSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrderClose" element
     */
    public void setOrderClose(com.microsoft.schemas.crm._2007.webservices.Orderclose orderClose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Orderclose target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Orderclose)get_store().find_element_user(ORDERCLOSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Orderclose)get_store().add_element_user(ORDERCLOSE$0);
            }
            target.set(orderClose);
        }
    }
    
    /**
     * Appends and returns a new empty "OrderClose" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Orderclose addNewOrderClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Orderclose target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Orderclose)get_store().add_element_user(ORDERCLOSE$0);
            return target;
        }
    }
}
