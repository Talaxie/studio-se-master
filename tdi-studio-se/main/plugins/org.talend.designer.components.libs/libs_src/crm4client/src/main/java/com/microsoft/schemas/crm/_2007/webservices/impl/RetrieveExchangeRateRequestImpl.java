/*
 * XML Type:  RetrieveExchangeRateRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveExchangeRateRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveExchangeRateRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveExchangeRateRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveExchangeRateRequest
{
    
    public RetrieveExchangeRateRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TransactionCurrencyId");
    
    
    /**
     * Gets the "TransactionCurrencyId" element
     */
    public java.lang.String getTransactionCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONCURRENCYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransactionCurrencyId" element
     */
    public com.microsoft.wsdl.types.Guid xgetTransactionCurrencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TRANSACTIONCURRENCYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TransactionCurrencyId" element
     */
    public void setTransactionCurrencyId(java.lang.String transactionCurrencyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONCURRENCYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONCURRENCYID$0);
            }
            target.setStringValue(transactionCurrencyId);
        }
    }
    
    /**
     * Sets (as xml) the "TransactionCurrencyId" element
     */
    public void xsetTransactionCurrencyId(com.microsoft.wsdl.types.Guid transactionCurrencyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TRANSACTIONCURRENCYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(TRANSACTIONCURRENCYID$0);
            }
            target.set(transactionCurrencyId);
        }
    }
}
