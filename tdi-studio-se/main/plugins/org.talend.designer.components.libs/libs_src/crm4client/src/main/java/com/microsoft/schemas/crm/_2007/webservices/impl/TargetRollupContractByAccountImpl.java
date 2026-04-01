/*
 * XML Type:  TargetRollupContractByAccount
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetRollupContractByAccount
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetRollupContractByAccount(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetRollupContractByAccountImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetRollupImpl implements com.microsoft.schemas.crm._2007.webservices.TargetRollupContractByAccount
{
    
    public TargetRollupContractByAccountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AccountId");
    private static final javax.xml.namespace.QName QUERY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Query");
    
    
    /**
     * Gets the "AccountId" element
     */
    public java.lang.String getAccountId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountId" element
     */
    public com.microsoft.wsdl.types.Guid xgetAccountId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ACCOUNTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AccountId" element
     */
    public void setAccountId(java.lang.String accountId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTID$0);
            }
            target.setStringValue(accountId);
        }
    }
    
    /**
     * Sets (as xml) the "AccountId" element
     */
    public void xsetAccountId(com.microsoft.wsdl.types.Guid accountId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ACCOUNTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ACCOUNTID$0);
            }
            target.set(accountId);
        }
    }
    
    /**
     * Gets the "Query" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(com.microsoft.schemas.crm._2006.query.QueryBase query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$2);
            }
            target.set(query);
        }
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$2);
            return target;
        }
    }
}
