/*
 * XML Type:  TargetUpdateOpportunityProduct
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateOpportunityProduct
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateOpportunityProduct(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateOpportunityProductImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateOpportunityProduct
{
    
    public TargetUpdateOpportunityProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPPORTUNITYPRODUCT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OpportunityProduct");
    
    
    /**
     * Gets the "OpportunityProduct" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Opportunityproduct getOpportunityProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Opportunityproduct target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct)get_store().find_element_user(OPPORTUNITYPRODUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OpportunityProduct" element
     */
    public void setOpportunityProduct(com.microsoft.schemas.crm._2007.webservices.Opportunityproduct opportunityProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Opportunityproduct target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct)get_store().find_element_user(OPPORTUNITYPRODUCT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct)get_store().add_element_user(OPPORTUNITYPRODUCT$0);
            }
            target.set(opportunityProduct);
        }
    }
    
    /**
     * Appends and returns a new empty "OpportunityProduct" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Opportunityproduct addNewOpportunityProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Opportunityproduct target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct)get_store().add_element_user(OPPORTUNITYPRODUCT$0);
            return target;
        }
    }
}
