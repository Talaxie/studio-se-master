/*
 * XML Type:  TargetCreateCampaign
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateCampaign
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateCampaign(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateCampaignImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateCampaign
{
    
    public TargetCreateCampaignImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMPAIGN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Campaign");
    
    
    /**
     * Gets the "Campaign" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Campaign getCampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Campaign target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Campaign)get_store().find_element_user(CAMPAIGN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Campaign" element
     */
    public void setCampaign(com.microsoft.schemas.crm._2007.webservices.Campaign campaign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Campaign target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Campaign)get_store().find_element_user(CAMPAIGN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Campaign)get_store().add_element_user(CAMPAIGN$0);
            }
            target.set(campaign);
        }
    }
    
    /**
     * Appends and returns a new empty "Campaign" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Campaign addNewCampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Campaign target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Campaign)get_store().add_element_user(CAMPAIGN$0);
            return target;
        }
    }
}
