/*
 * XML Type:  SetStateTransactionCurrencyRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateTransactionCurrencyRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateTransactionCurrencyRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateTransactionCurrencyRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateTransactionCurrencyRequest
{
    
    public SetStateTransactionCurrencyRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TransactionCurrencyState");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TransactionCurrencyStatus");
    
    
    /**
     * Gets the "EntityId" element
     */
    public java.lang.String getEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EntityId" element
     */
    public void setEntityId(java.lang.String entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
            }
            target.setStringValue(entityId);
        }
    }
    
    /**
     * Sets (as xml) the "EntityId" element
     */
    public void xsetEntityId(com.microsoft.wsdl.types.Guid entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityId);
        }
    }
    
    /**
     * Gets the "TransactionCurrencyState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState.Enum getTransactionCurrencyState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONCURRENCYSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransactionCurrencyState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState xgetTransactionCurrencyState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState)get_store().find_element_user(TRANSACTIONCURRENCYSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TransactionCurrencyState" element
     */
    public void setTransactionCurrencyState(com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState.Enum transactionCurrencyState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONCURRENCYSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONCURRENCYSTATE$2);
            }
            target.setEnumValue(transactionCurrencyState);
        }
    }
    
    /**
     * Sets (as xml) the "TransactionCurrencyState" element
     */
    public void xsetTransactionCurrencyState(com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState transactionCurrencyState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState)get_store().find_element_user(TRANSACTIONCURRENCYSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.TransactionCurrencyState)get_store().add_element_user(TRANSACTIONCURRENCYSTATE$2);
            }
            target.set(transactionCurrencyState);
        }
    }
    
    /**
     * Gets the "TransactionCurrencyStatus" element
     */
    public int getTransactionCurrencyStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONCURRENCYSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransactionCurrencyStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetTransactionCurrencyStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONCURRENCYSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TransactionCurrencyStatus" element
     */
    public void setTransactionCurrencyStatus(int transactionCurrencyStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONCURRENCYSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONCURRENCYSTATUS$4);
            }
            target.setIntValue(transactionCurrencyStatus);
        }
    }
    
    /**
     * Sets (as xml) the "TransactionCurrencyStatus" element
     */
    public void xsetTransactionCurrencyStatus(org.apache.xmlbeans.XmlInt transactionCurrencyStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONCURRENCYSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TRANSACTIONCURRENCYSTATUS$4);
            }
            target.set(transactionCurrencyStatus);
        }
    }
}
