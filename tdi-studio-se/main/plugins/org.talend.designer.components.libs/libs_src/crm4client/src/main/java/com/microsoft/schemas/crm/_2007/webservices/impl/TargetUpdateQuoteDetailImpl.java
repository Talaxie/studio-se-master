/*
 * XML Type:  TargetUpdateQuoteDetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateQuoteDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateQuoteDetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateQuoteDetailImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateQuoteDetail
{
    
    public TargetUpdateQuoteDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUOTEDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QuoteDetail");
    
    
    /**
     * Gets the "QuoteDetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quotedetail getQuoteDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quotedetail)get_store().find_element_user(QUOTEDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuoteDetail" element
     */
    public void setQuoteDetail(com.microsoft.schemas.crm._2007.webservices.Quotedetail quoteDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quotedetail)get_store().find_element_user(QUOTEDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Quotedetail)get_store().add_element_user(QUOTEDETAIL$0);
            }
            target.set(quoteDetail);
        }
    }
    
    /**
     * Appends and returns a new empty "QuoteDetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quotedetail addNewQuoteDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quotedetail)get_store().add_element_user(QUOTEDETAIL$0);
            return target;
        }
    }
}
