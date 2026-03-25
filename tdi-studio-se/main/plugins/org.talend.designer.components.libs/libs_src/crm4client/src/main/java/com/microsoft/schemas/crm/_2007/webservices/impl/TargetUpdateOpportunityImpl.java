/*
 * XML Type:  TargetUpdateOpportunity
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateOpportunity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateOpportunity(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateOpportunityImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateOpportunity
{
    
    public TargetUpdateOpportunityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPPORTUNITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Opportunity");
    
    
    /**
     * Gets the "Opportunity" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Opportunity getOpportunity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Opportunity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Opportunity)get_store().find_element_user(OPPORTUNITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Opportunity" element
     */
    public void setOpportunity(com.microsoft.schemas.crm._2007.webservices.Opportunity opportunity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Opportunity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Opportunity)get_store().find_element_user(OPPORTUNITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Opportunity)get_store().add_element_user(OPPORTUNITY$0);
            }
            target.set(opportunity);
        }
    }
    
    /**
     * Appends and returns a new empty "Opportunity" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Opportunity addNewOpportunity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Opportunity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Opportunity)get_store().add_element_user(OPPORTUNITY$0);
            return target;
        }
    }
}
