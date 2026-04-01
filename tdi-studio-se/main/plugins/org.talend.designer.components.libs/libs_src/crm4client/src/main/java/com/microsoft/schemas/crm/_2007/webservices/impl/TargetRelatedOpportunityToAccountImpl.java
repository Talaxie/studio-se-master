/*
 * XML Type:  TargetRelatedOpportunityToAccount
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetRelatedOpportunityToAccount
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetRelatedOpportunityToAccount(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetRelatedOpportunityToAccountImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetRelatedImpl implements com.microsoft.schemas.crm._2007.webservices.TargetRelatedOpportunityToAccount
{
    
    public TargetRelatedOpportunityToAccountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPPORTUNITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OpportunityId");
    private static final javax.xml.namespace.QName ACCOUNTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AccountId");
    
    
    /**
     * Gets the "OpportunityId" element
     */
    public java.lang.String getOpportunityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPORTUNITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OpportunityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetOpportunityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(OPPORTUNITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OpportunityId" element
     */
    public void setOpportunityId(java.lang.String opportunityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPORTUNITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPPORTUNITYID$0);
            }
            target.setStringValue(opportunityId);
        }
    }
    
    /**
     * Sets (as xml) the "OpportunityId" element
     */
    public void xsetOpportunityId(com.microsoft.wsdl.types.Guid opportunityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(OPPORTUNITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(OPPORTUNITYID$0);
            }
            target.set(opportunityId);
        }
    }
    
    /**
     * Gets the "AccountId" element
     */
    public java.lang.String getAccountId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$2, 0);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ACCOUNTID$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTID$2);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ACCOUNTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ACCOUNTID$2);
            }
            target.set(accountId);
        }
    }
}
