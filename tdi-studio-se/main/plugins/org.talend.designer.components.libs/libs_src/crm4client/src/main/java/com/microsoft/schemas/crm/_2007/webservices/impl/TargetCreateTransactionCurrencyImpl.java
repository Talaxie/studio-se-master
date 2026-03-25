/*
 * XML Type:  TargetCreateTransactionCurrency
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateTransactionCurrency
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateTransactionCurrency(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateTransactionCurrencyImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateTransactionCurrency
{
    
    public TargetCreateTransactionCurrencyImpl(org.apache.xmlbeans.SchemaType sType)
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
