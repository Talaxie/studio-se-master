/*
 * XML Type:  CopyCampaignResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CopyCampaignResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML CopyCampaignResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CopyCampaignResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.CopyCampaignResponse
{
    
    public CopyCampaignResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMPAIGNCOPYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CampaignCopyId");
    
    
    /**
     * Gets the "CampaignCopyId" element
     */
    public java.lang.String getCampaignCopyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNCOPYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CampaignCopyId" element
     */
    public com.microsoft.wsdl.types.Guid xgetCampaignCopyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CAMPAIGNCOPYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CampaignCopyId" element
     */
    public void setCampaignCopyId(java.lang.String campaignCopyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNCOPYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMPAIGNCOPYID$0);
            }
            target.setStringValue(campaignCopyId);
        }
    }
    
    /**
     * Sets (as xml) the "CampaignCopyId" element
     */
    public void xsetCampaignCopyId(com.microsoft.wsdl.types.Guid campaignCopyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CAMPAIGNCOPYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CAMPAIGNCOPYID$0);
            }
            target.set(campaignCopyId);
        }
    }
}
