/*
 * XML Type:  TargetUpdateQuoteClose
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateQuoteClose
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateQuoteClose(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateQuoteCloseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateQuoteClose
{
    
    public TargetUpdateQuoteCloseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUOTECLOSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QuoteClose");
    
    
    /**
     * Gets the "QuoteClose" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quoteclose getQuoteClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quoteclose target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quoteclose)get_store().find_element_user(QUOTECLOSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuoteClose" element
     */
    public void setQuoteClose(com.microsoft.schemas.crm._2007.webservices.Quoteclose quoteClose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quoteclose target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quoteclose)get_store().find_element_user(QUOTECLOSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Quoteclose)get_store().add_element_user(QUOTECLOSE$0);
            }
            target.set(quoteClose);
        }
    }
    
    /**
     * Appends and returns a new empty "QuoteClose" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quoteclose addNewQuoteClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quoteclose target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quoteclose)get_store().add_element_user(QUOTECLOSE$0);
            return target;
        }
    }
}
