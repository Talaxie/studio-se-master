/*
 * XML Type:  AddItemCampaignActivityRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.AddItemCampaignActivityRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML AddItemCampaignActivityRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class AddItemCampaignActivityRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.AddItemCampaignActivityRequest
{
    
    public AddItemCampaignActivityRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMPAIGNACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CampaignActivityId");
    private static final javax.xml.namespace.QName ITEMID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ItemId");
    private static final javax.xml.namespace.QName ENTITYNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityName");
    
    
    /**
     * Gets the "CampaignActivityId" element
     */
    public java.lang.String getCampaignActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNACTIVITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CampaignActivityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetCampaignActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CAMPAIGNACTIVITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CampaignActivityId" element
     */
    public void setCampaignActivityId(java.lang.String campaignActivityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNACTIVITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMPAIGNACTIVITYID$0);
            }
            target.setStringValue(campaignActivityId);
        }
    }
    
    /**
     * Sets (as xml) the "CampaignActivityId" element
     */
    public void xsetCampaignActivityId(com.microsoft.wsdl.types.Guid campaignActivityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CAMPAIGNACTIVITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CAMPAIGNACTIVITYID$0);
            }
            target.set(campaignActivityId);
        }
    }
    
    /**
     * Gets the "ItemId" element
     */
    public java.lang.String getItemId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ItemId" element
     */
    public com.microsoft.wsdl.types.Guid xgetItemId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ITEMID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ItemId" element
     */
    public void setItemId(java.lang.String itemId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ITEMID$2);
            }
            target.setStringValue(itemId);
        }
    }
    
    /**
     * Sets (as xml) the "ItemId" element
     */
    public void xsetItemId(com.microsoft.wsdl.types.Guid itemId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ITEMID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ITEMID$2);
            }
            target.set(itemId);
        }
    }
    
    /**
     * Gets the "EntityName" element
     */
    public com.microsoft.schemas.crm._2007.webservices.EntityName.Enum getEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.EntityName.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityName" element
     */
    public com.microsoft.schemas.crm._2007.webservices.EntityName xgetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.EntityName target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.EntityName)get_store().find_element_user(ENTITYNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EntityName" element
     */
    public void setEntityName(com.microsoft.schemas.crm._2007.webservices.EntityName.Enum entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$4);
            }
            target.setEnumValue(entityName);
        }
    }
    
    /**
     * Sets (as xml) the "EntityName" element
     */
    public void xsetEntityName(com.microsoft.schemas.crm._2007.webservices.EntityName entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.EntityName target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.EntityName)get_store().find_element_user(ENTITYNAME$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.EntityName)get_store().add_element_user(ENTITYNAME$4);
            }
            target.set(entityName);
        }
    }
}
