/*
 * XML Type:  TargetUpdateProductPriceLevel
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateProductPriceLevel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateProductPriceLevel(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateProductPriceLevelImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateProductPriceLevel
{
    
    public TargetUpdateProductPriceLevelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTPRICELEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ProductPriceLevel");
    
    
    /**
     * Gets the "ProductPriceLevel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Productpricelevel getProductPriceLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Productpricelevel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Productpricelevel)get_store().find_element_user(PRODUCTPRICELEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProductPriceLevel" element
     */
    public void setProductPriceLevel(com.microsoft.schemas.crm._2007.webservices.Productpricelevel productPriceLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Productpricelevel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Productpricelevel)get_store().find_element_user(PRODUCTPRICELEVEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Productpricelevel)get_store().add_element_user(PRODUCTPRICELEVEL$0);
            }
            target.set(productPriceLevel);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductPriceLevel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Productpricelevel addNewProductPriceLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Productpricelevel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Productpricelevel)get_store().add_element_user(PRODUCTPRICELEVEL$0);
            return target;
        }
    }
}
