/*
 * XML Type:  TargetRelatedQuoteToContact
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetRelatedQuoteToContact
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetRelatedQuoteToContact(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetRelatedQuoteToContactImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetRelatedImpl implements com.microsoft.schemas.crm._2007.webservices.TargetRelatedQuoteToContact
{
    
    public TargetRelatedQuoteToContactImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUOTEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QuoteId");
    private static final javax.xml.namespace.QName CONTACTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ContactId");
    
    
    /**
     * Gets the "QuoteId" element
     */
    public java.lang.String getQuoteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "QuoteId" element
     */
    public com.microsoft.wsdl.types.Guid xgetQuoteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(QUOTEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QuoteId" element
     */
    public void setQuoteId(java.lang.String quoteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUOTEID$0);
            }
            target.setStringValue(quoteId);
        }
    }
    
    /**
     * Sets (as xml) the "QuoteId" element
     */
    public void xsetQuoteId(com.microsoft.wsdl.types.Guid quoteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(QUOTEID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(QUOTEID$0);
            }
            target.set(quoteId);
        }
    }
    
    /**
     * Gets the "ContactId" element
     */
    public java.lang.String getContactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactId" element
     */
    public com.microsoft.wsdl.types.Guid xgetContactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CONTACTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ContactId" element
     */
    public void setContactId(java.lang.String contactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTID$2);
            }
            target.setStringValue(contactId);
        }
    }
    
    /**
     * Sets (as xml) the "ContactId" element
     */
    public void xsetContactId(com.microsoft.wsdl.types.Guid contactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CONTACTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CONTACTID$2);
            }
            target.set(contactId);
        }
    }
}
