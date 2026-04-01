/*
 * XML Type:  TargetUpdateCustomerAddress
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateCustomerAddress
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateCustomerAddress(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateCustomerAddressImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateCustomerAddress
{
    
    public TargetUpdateCustomerAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERADDRESS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CustomerAddress");
    
    
    /**
     * Gets the "CustomerAddress" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Customeraddress getCustomerAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Customeraddress target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Customeraddress)get_store().find_element_user(CUSTOMERADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CustomerAddress" element
     */
    public void setCustomerAddress(com.microsoft.schemas.crm._2007.webservices.Customeraddress customerAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Customeraddress target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Customeraddress)get_store().find_element_user(CUSTOMERADDRESS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Customeraddress)get_store().add_element_user(CUSTOMERADDRESS$0);
            }
            target.set(customerAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerAddress" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Customeraddress addNewCustomerAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Customeraddress target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Customeraddress)get_store().add_element_user(CUSTOMERADDRESS$0);
            return target;
        }
    }
}
