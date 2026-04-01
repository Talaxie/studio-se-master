/*
 * XML Type:  TargetCreateInvoiceDetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateInvoiceDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateInvoiceDetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateInvoiceDetailImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateInvoiceDetail
{
    
    public TargetCreateInvoiceDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOICEDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "InvoiceDetail");
    
    
    /**
     * Gets the "InvoiceDetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Invoicedetail getInvoiceDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoicedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoicedetail)get_store().find_element_user(INVOICEDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InvoiceDetail" element
     */
    public void setInvoiceDetail(com.microsoft.schemas.crm._2007.webservices.Invoicedetail invoiceDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoicedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoicedetail)get_store().find_element_user(INVOICEDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Invoicedetail)get_store().add_element_user(INVOICEDETAIL$0);
            }
            target.set(invoiceDetail);
        }
    }
    
    /**
     * Appends and returns a new empty "InvoiceDetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Invoicedetail addNewInvoiceDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoicedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoicedetail)get_store().add_element_user(INVOICEDETAIL$0);
            return target;
        }
    }
}
