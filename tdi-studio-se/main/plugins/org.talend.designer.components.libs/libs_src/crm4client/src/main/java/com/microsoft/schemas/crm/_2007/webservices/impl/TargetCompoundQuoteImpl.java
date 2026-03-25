/*
 * XML Type:  TargetCompoundQuote
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCompoundQuote
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCompoundQuote(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCompoundQuoteImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCompoundImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCompoundQuote
{
    
    public TargetCompoundQuoteImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUOTE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Quote");
    private static final javax.xml.namespace.QName QUOTEDETAILS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QuoteDetails");
    
    
    /**
     * Gets the "Quote" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quote getQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quote target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quote)get_store().find_element_user(QUOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Quote" element
     */
    public void setQuote(com.microsoft.schemas.crm._2007.webservices.Quote quote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quote target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quote)get_store().find_element_user(QUOTE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Quote)get_store().add_element_user(QUOTE$0);
            }
            target.set(quote);
        }
    }
    
    /**
     * Appends and returns a new empty "Quote" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quote addNewQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quote target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quote)get_store().add_element_user(QUOTE$0);
            return target;
        }
    }
    
    /**
     * Gets the "QuoteDetails" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail getQuoteDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail)get_store().find_element_user(QUOTEDETAILS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuoteDetails" element
     */
    public void setQuoteDetails(com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail quoteDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail)get_store().find_element_user(QUOTEDETAILS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail)get_store().add_element_user(QUOTEDETAILS$2);
            }
            target.set(quoteDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "QuoteDetails" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail addNewQuoteDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail)get_store().add_element_user(QUOTEDETAILS$2);
            return target;
        }
    }
}
