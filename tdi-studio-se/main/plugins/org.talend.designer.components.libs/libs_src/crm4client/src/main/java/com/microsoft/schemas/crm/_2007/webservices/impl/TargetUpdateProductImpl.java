/*
 * XML Type:  TargetUpdateProduct
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateProduct
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateProduct(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateProductImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateProduct
{
    
    public TargetUpdateProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Product");
    
    
    /**
     * Gets the "Product" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Product getProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Product target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Product)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Product" element
     */
    public void setProduct(com.microsoft.schemas.crm._2007.webservices.Product product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Product target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Product)get_store().find_element_user(PRODUCT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Product)get_store().add_element_user(PRODUCT$0);
            }
            target.set(product);
        }
    }
    
    /**
     * Appends and returns a new empty "Product" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Product addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Product target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Product)get_store().add_element_user(PRODUCT$0);
            return target;
        }
    }
}
