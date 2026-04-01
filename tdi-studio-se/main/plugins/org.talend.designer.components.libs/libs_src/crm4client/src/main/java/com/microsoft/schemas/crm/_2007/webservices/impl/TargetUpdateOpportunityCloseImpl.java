/*
 * XML Type:  TargetUpdateOpportunityClose
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateOpportunityClose
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateOpportunityClose(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateOpportunityCloseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateOpportunityClose
{
    
    public TargetUpdateOpportunityCloseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPPORTUNITYCLOSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OpportunityClose");
    
    
    /**
     * Gets the "OpportunityClose" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Opportunityclose getOpportunityClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Opportunityclose target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Opportunityclose)get_store().find_element_user(OPPORTUNITYCLOSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OpportunityClose" element
     */
    public void setOpportunityClose(com.microsoft.schemas.crm._2007.webservices.Opportunityclose opportunityClose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Opportunityclose target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Opportunityclose)get_store().find_element_user(OPPORTUNITYCLOSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Opportunityclose)get_store().add_element_user(OPPORTUNITYCLOSE$0);
            }
            target.set(opportunityClose);
        }
    }
    
    /**
     * Appends and returns a new empty "OpportunityClose" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Opportunityclose addNewOpportunityClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Opportunityclose target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Opportunityclose)get_store().add_element_user(OPPORTUNITYCLOSE$0);
            return target;
        }
    }
}
