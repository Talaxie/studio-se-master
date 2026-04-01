/*
 * XML Type:  TargetUpdateTransactionCurrency
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateTransactionCurrency
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateTransactionCurrency(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateTransactionCurrencyImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateTransactionCurrency
{
    
    public TargetUpdateTransactionCurrencyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TransactionCurrency");
    
    
    /**
     * Gets the "TransactionCurrency" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Transactioncurrency getTransactionCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Transactioncurrency target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Transactioncurrency)get_store().find_element_user(TRANSACTIONCURRENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TransactionCurrency" element
     */
    public void setTransactionCurrency(com.microsoft.schemas.crm._2007.webservices.Transactioncurrency transactionCurrency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Transactioncurrency target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Transactioncurrency)get_store().find_element_user(TRANSACTIONCURRENCY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Transactioncurrency)get_store().add_element_user(TRANSACTIONCURRENCY$0);
            }
            target.set(transactionCurrency);
        }
    }
    
    /**
     * Appends and returns a new empty "TransactionCurrency" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Transactioncurrency addNewTransactionCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Transactioncurrency target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Transactioncurrency)get_store().add_element_user(TRANSACTIONCURRENCY$0);
            return target;
        }
    }
}
