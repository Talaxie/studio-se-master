/*
 * XML Type:  TargetCreateDiscount
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateDiscount
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateDiscount(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateDiscountImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateDiscount
{
    
    public TargetCreateDiscountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Discount");
    
    
    /**
     * Gets the "Discount" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Discount getDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Discount target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Discount)get_store().find_element_user(DISCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Discount" element
     */
    public void setDiscount(com.microsoft.schemas.crm._2007.webservices.Discount discount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Discount target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Discount)get_store().find_element_user(DISCOUNT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Discount)get_store().add_element_user(DISCOUNT$0);
            }
            target.set(discount);
        }
    }
    
    /**
     * Appends and returns a new empty "Discount" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Discount addNewDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Discount target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Discount)get_store().add_element_user(DISCOUNT$0);
            return target;
        }
    }
}
