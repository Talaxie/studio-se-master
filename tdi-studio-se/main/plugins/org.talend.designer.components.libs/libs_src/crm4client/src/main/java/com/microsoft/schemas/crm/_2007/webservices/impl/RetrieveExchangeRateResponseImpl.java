/*
 * XML Type:  RetrieveExchangeRateResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveExchangeRateResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveExchangeRateResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveExchangeRateResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveExchangeRateResponse
{
    
    public RetrieveExchangeRateResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCHANGERATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ExchangeRate");
    
    
    /**
     * Gets the "ExchangeRate" element
     */
    public java.math.BigDecimal getExchangeRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGERATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExchangeRate" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetExchangeRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(EXCHANGERATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExchangeRate" element
     */
    public void setExchangeRate(java.math.BigDecimal exchangeRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGERATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCHANGERATE$0);
            }
            target.setBigDecimalValue(exchangeRate);
        }
    }
    
    /**
     * Sets (as xml) the "ExchangeRate" element
     */
    public void xsetExchangeRate(org.apache.xmlbeans.XmlDecimal exchangeRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(EXCHANGERATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(EXCHANGERATE$0);
            }
            target.set(exchangeRate);
        }
    }
}
