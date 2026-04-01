/*
 * XML Type:  TargetCreatePriceLevel
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreatePriceLevel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreatePriceLevel(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreatePriceLevelImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreatePriceLevel
{
    
    public TargetCreatePriceLevelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRICELEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PriceLevel");
    
    
    /**
     * Gets the "PriceLevel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Pricelevel getPriceLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Pricelevel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Pricelevel)get_store().find_element_user(PRICELEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PriceLevel" element
     */
    public void setPriceLevel(com.microsoft.schemas.crm._2007.webservices.Pricelevel priceLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Pricelevel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Pricelevel)get_store().find_element_user(PRICELEVEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Pricelevel)get_store().add_element_user(PRICELEVEL$0);
            }
            target.set(priceLevel);
        }
    }
    
    /**
     * Appends and returns a new empty "PriceLevel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Pricelevel addNewPriceLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Pricelevel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Pricelevel)get_store().add_element_user(PRICELEVEL$0);
            return target;
        }
    }
}
