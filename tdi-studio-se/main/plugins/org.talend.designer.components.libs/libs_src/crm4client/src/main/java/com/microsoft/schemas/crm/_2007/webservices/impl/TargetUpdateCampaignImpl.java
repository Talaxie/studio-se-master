/*
 * XML Type:  TargetUpdateCampaign
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateCampaign
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateCampaign(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateCampaignImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateCampaign
{
    
    public TargetUpdateCampaignImpl(org.apache.xmlbeans.SchemaType sType)
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
