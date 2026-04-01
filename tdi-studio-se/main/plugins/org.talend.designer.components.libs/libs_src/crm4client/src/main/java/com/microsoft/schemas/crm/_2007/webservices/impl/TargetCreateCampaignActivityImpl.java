/*
 * XML Type:  TargetCreateCampaignActivity
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateCampaignActivity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateCampaignActivity(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateCampaignActivityImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateCampaignActivity
{
    
    public TargetCreateCampaignActivityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMPAIGNACTIVITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CampaignActivity");
    
    
    /**
     * Gets the "CampaignActivity" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Campaignactivity getCampaignActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Campaignactivity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Campaignactivity)get_store().find_element_user(CAMPAIGNACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CampaignActivity" element
     */
    public void setCampaignActivity(com.microsoft.schemas.crm._2007.webservices.Campaignactivity campaignActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Campaignactivity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Campaignactivity)get_store().find_element_user(CAMPAIGNACTIVITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Campaignactivity)get_store().add_element_user(CAMPAIGNACTIVITY$0);
            }
            target.set(campaignActivity);
        }
    }
    
    /**
     * Appends and returns a new empty "CampaignActivity" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Campaignactivity addNewCampaignActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Campaignactivity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Campaignactivity)get_store().add_element_user(CAMPAIGNACTIVITY$0);
            return target;
        }
    }
}
