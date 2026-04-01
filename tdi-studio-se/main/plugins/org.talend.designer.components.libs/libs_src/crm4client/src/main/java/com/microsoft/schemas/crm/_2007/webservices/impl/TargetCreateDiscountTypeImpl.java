/*
 * XML Type:  TargetCreateDiscountType
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateDiscountType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateDiscountType(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateDiscountTypeImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateDiscountType
{
    
    public TargetCreateDiscountTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNTTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "DiscountType");
    
    
    /**
     * Gets the "DiscountType" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Discounttype getDiscountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Discounttype target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Discounttype)get_store().find_element_user(DISCOUNTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DiscountType" element
     */
    public void setDiscountType(com.microsoft.schemas.crm._2007.webservices.Discounttype discountType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Discounttype target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Discounttype)get_store().find_element_user(DISCOUNTTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Discounttype)get_store().add_element_user(DISCOUNTTYPE$0);
            }
            target.set(discountType);
        }
    }
    
    /**
     * Appends and returns a new empty "DiscountType" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Discounttype addNewDiscountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Discounttype target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Discounttype)get_store().add_element_user(DISCOUNTTYPE$0);
            return target;
        }
    }
}
