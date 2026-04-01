/*
 * XML Type:  TargetRelatedOpportunityToContact
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetRelatedOpportunityToContact
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetRelatedOpportunityToContact(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetRelatedOpportunityToContactImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetRelatedImpl implements com.microsoft.schemas.crm._2007.webservices.TargetRelatedOpportunityToContact
{
    
    public TargetRelatedOpportunityToContactImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPPORTUNITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OpportunityId");
    private static final javax.xml.namespace.QName CONTACTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ContactId");
    
    
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
