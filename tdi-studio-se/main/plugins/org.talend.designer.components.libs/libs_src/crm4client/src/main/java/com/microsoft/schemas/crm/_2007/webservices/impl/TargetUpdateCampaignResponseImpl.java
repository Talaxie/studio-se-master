/*
 * XML Type:  TargetUpdateCampaignResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateCampaignResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateCampaignResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateCampaignResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateCampaignResponse
{
    
    public TargetUpdateCampaignResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMPAIGNRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CampaignResponse");
    
    
    /**
     * Gets the "CampaignResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Campaignresponse getCampaignResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Campaignresponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Campaignresponse)get_store().find_element_user(CAMPAIGNRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CampaignResponse" element
     */
    public void setCampaignResponse(com.microsoft.schemas.crm._2007.webservices.Campaignresponse campaignResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Campaignresponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Campaignresponse)get_store().find_element_user(CAMPAIGNRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Campaignresponse)get_store().add_element_user(CAMPAIGNRESPONSE$0);
            }
            target.set(campaignResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CampaignResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Campaignresponse addNewCampaignResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Campaignresponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Campaignresponse)get_store().add_element_user(CAMPAIGNRESPONSE$0);
            return target;
        }
    }
}
