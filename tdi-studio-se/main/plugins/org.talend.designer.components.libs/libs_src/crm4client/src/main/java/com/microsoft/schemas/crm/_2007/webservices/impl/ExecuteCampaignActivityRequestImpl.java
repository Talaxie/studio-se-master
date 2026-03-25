/*
 * XML Type:  ExecuteCampaignActivityRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ExecuteCampaignActivityRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ExecuteCampaignActivityRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ExecuteCampaignActivityRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ExecuteCampaignActivityRequest
{
    
    public ExecuteCampaignActivityRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMPAIGNACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CampaignActivityId");
    private static final javax.xml.namespace.QName PROPAGATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Propagate");
    private static final javax.xml.namespace.QName ACTIVITY$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Activity");
    private static final javax.xml.namespace.QName TEMPLATEID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TemplateId");
    private static final javax.xml.namespace.QName OWNERSHIPOPTIONS$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OwnershipOptions");
    
    
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
     * Gets the "Propagate" element
     */
    public boolean getPropagate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPAGATE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Propagate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPropagate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPAGATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Propagate" element
     */
    public void setPropagate(boolean propagate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPAGATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPAGATE$2);
            }
            target.setBooleanValue(propagate);
        }
    }
    
    /**
     * Sets (as xml) the "Propagate" element
     */
    public void xsetPropagate(org.apache.xmlbeans.XmlBoolean propagate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPAGATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPAGATE$2);
            }
            target.set(propagate);
        }
    }
    
    /**
     * Gets the "Activity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity getActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(ACTIVITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Activity" element
     */
    public void setActivity(com.microsoft.schemas.crm._2006.webservices.BusinessEntity activity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(ACTIVITY$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(ACTIVITY$4);
            }
            target.set(activity);
        }
    }
    
    /**
     * Appends and returns a new empty "Activity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(ACTIVITY$4);
            return target;
        }
    }
    
    /**
     * Gets the "TemplateId" element
     */
    public java.lang.String getTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TemplateId" element
     */
    public com.microsoft.wsdl.types.Guid xgetTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEMPLATEID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TemplateId" element
     */
    public void setTemplateId(java.lang.String templateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATEID$6);
            }
            target.setStringValue(templateId);
        }
    }
    
    /**
     * Sets (as xml) the "TemplateId" element
     */
    public void xsetTemplateId(com.microsoft.wsdl.types.Guid templateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEMPLATEID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(TEMPLATEID$6);
            }
            target.set(templateId);
        }
    }
    
    /**
     * Gets the "OwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum getOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPOPTIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions xgetOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions)get_store().find_element_user(OWNERSHIPOPTIONS$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OwnershipOptions" element
     */
    public void setOwnershipOptions(com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum ownershipOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPOPTIONS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERSHIPOPTIONS$8);
            }
            target.setEnumValue(ownershipOptions);
        }
    }
    
    /**
     * Sets (as xml) the "OwnershipOptions" element
     */
    public void xsetOwnershipOptions(com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions ownershipOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions)get_store().find_element_user(OWNERSHIPOPTIONS$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions)get_store().add_element_user(OWNERSHIPOPTIONS$8);
            }
            target.set(ownershipOptions);
        }
    }
}
