/*
 * XML Type:  TargetUpdateInvoice
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateInvoice
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateInvoice(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateInvoiceImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateInvoice
{
    
    public TargetUpdateInvoiceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOICE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Invoice");
    
    
    /**
     * Gets the "Invoice" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Invoice getInvoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoice target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoice)get_store().find_element_user(INVOICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Invoice" element
     */
    public void setInvoice(com.microsoft.schemas.crm._2007.webservices.Invoice invoice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoice target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoice)get_store().find_element_user(INVOICE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Invoice)get_store().add_element_user(INVOICE$0);
            }
            target.set(invoice);
        }
    }
    
    /**
     * Appends and returns a new empty "Invoice" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Invoice addNewInvoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoice target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoice)get_store().add_element_user(INVOICE$0);
            return target;
        }
    }
}
