/*
 * XML Type:  SetStateCampaignResponseRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateCampaignResponseRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateCampaignResponseRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateCampaignResponseRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateCampaignResponseRequest
{
    
    public SetStateCampaignResponseRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName CAMPAIGNRESPONSESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CampaignResponseState");
    private static final javax.xml.namespace.QName CAMPAIGNRESPONSESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CampaignResponseStatus");
    
    
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
     * Gets the "CampaignResponseState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CampaignResponseState.Enum getCampaignResponseState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNRESPONSESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.CampaignResponseState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CampaignResponseState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CampaignResponseState xgetCampaignResponseState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CampaignResponseState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CampaignResponseState)get_store().find_element_user(CAMPAIGNRESPONSESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CampaignResponseState" element
     */
    public void setCampaignResponseState(com.microsoft.schemas.crm._2007.webservices.CampaignResponseState.Enum campaignResponseState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNRESPONSESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMPAIGNRESPONSESTATE$2);
            }
            target.setEnumValue(campaignResponseState);
        }
    }
    
    /**
     * Sets (as xml) the "CampaignResponseState" element
     */
    public void xsetCampaignResponseState(com.microsoft.schemas.crm._2007.webservices.CampaignResponseState campaignResponseState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CampaignResponseState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CampaignResponseState)get_store().find_element_user(CAMPAIGNRESPONSESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.CampaignResponseState)get_store().add_element_user(CAMPAIGNRESPONSESTATE$2);
            }
            target.set(campaignResponseState);
        }
    }
    
    /**
     * Gets the "CampaignResponseStatus" element
     */
    public int getCampaignResponseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNRESPONSESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CampaignResponseStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetCampaignResponseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CAMPAIGNRESPONSESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CampaignResponseStatus" element
     */
    public void setCampaignResponseStatus(int campaignResponseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNRESPONSESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMPAIGNRESPONSESTATUS$4);
            }
            target.setIntValue(campaignResponseStatus);
        }
    }
    
    /**
     * Sets (as xml) the "CampaignResponseStatus" element
     */
    public void xsetCampaignResponseStatus(org.apache.xmlbeans.XmlInt campaignResponseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CAMPAIGNRESPONSESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CAMPAIGNRESPONSESTATUS$4);
            }
            target.set(campaignResponseStatus);
        }
    }
}
