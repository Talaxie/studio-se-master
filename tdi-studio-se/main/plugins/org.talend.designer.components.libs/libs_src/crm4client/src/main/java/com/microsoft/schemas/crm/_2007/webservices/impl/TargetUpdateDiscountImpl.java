/*
 * XML Type:  TargetUpdateDiscount
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateDiscount
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateDiscount(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateDiscountImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateDiscount
{
    
    public TargetUpdateDiscountImpl(org.apache.xmlbeans.SchemaType sType)
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
