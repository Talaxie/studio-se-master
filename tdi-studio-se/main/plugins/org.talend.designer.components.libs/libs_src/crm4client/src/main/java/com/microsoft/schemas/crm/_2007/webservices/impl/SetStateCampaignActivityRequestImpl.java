/*
 * XML Type:  SetStateCampaignActivityRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateCampaignActivityRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateCampaignActivityRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateCampaignActivityRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateCampaignActivityRequest
{
    
    public SetStateCampaignActivityRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName CAMPAIGNACTIVITYSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CampaignActivityState");
    private static final javax.xml.namespace.QName CAMPAIGNACTIVITYSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CampaignActivityStatus");
    
    
    /**
     * Gets the "EntityId" element
     */
    public java.lang.String getEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EntityId" element
     */
    public void setEntityId(java.lang.String entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
            }
            target.setStringValue(entityId);
        }
    }
    
    /**
     * Sets (as xml) the "EntityId" element
     */
    public void xsetEntityId(com.microsoft.wsdl.types.Guid entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityId);
        }
    }
    
    /**
     * Gets the "CampaignActivityState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CampaignActivityState.Enum getCampaignActivityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNACTIVITYSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.CampaignActivityState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CampaignActivityState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CampaignActivityState xgetCampaignActivityState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CampaignActivityState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CampaignActivityState)get_store().find_element_user(CAMPAIGNACTIVITYSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CampaignActivityState" element
     */
    public void setCampaignActivityState(com.microsoft.schemas.crm._2007.webservices.CampaignActivityState.Enum campaignActivityState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNACTIVITYSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMPAIGNACTIVITYSTATE$2);
            }
            target.setEnumValue(campaignActivityState);
        }
    }
    
    /**
     * Sets (as xml) the "CampaignActivityState" element
     */
    public void xsetCampaignActivityState(com.microsoft.schemas.crm._2007.webservices.CampaignActivityState campaignActivityState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CampaignActivityState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CampaignActivityState)get_store().find_element_user(CAMPAIGNACTIVITYSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.CampaignActivityState)get_store().add_element_user(CAMPAIGNACTIVITYSTATE$2);
            }
            target.set(campaignActivityState);
        }
    }
    
    /**
     * Gets the "CampaignActivityStatus" element
     */
    public int getCampaignActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNACTIVITYSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CampaignActivityStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetCampaignActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CAMPAIGNACTIVITYSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CampaignActivityStatus" element
     */
    public void setCampaignActivityStatus(int campaignActivityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNACTIVITYSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMPAIGNACTIVITYSTATUS$4);
            }
            target.setIntValue(campaignActivityStatus);
        }
    }
    
    /**
     * Sets (as xml) the "CampaignActivityStatus" element
     */
    public void xsetCampaignActivityStatus(org.apache.xmlbeans.XmlInt campaignActivityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CAMPAIGNACTIVITYSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CAMPAIGNACTIVITYSTATUS$4);
            }
            target.set(campaignActivityStatus);
        }
    }
}
