/*
 * XML Type:  CreateActivitiesListRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML CreateActivitiesListRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CreateActivitiesListRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest
{
    
    public CreateActivitiesListRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ListId");
    private static final javax.xml.namespace.QName FRIENDLYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FriendlyName");
    private static final javax.xml.namespace.QName ACTIVITY$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Activity");
    private static final javax.xml.namespace.QName TEMPLATEID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TemplateId");
    private static final javax.xml.namespace.QName PROPAGATE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Propagate");
    private static final javax.xml.namespace.QName OWNERSHIPOPTIONS$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OwnershipOptions");
    private static final javax.xml.namespace.QName OWNER$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Owner");
    private static final javax.xml.namespace.QName SENDEMAIL$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sendEmail");
    
    
    /**
     * Gets the "ListId" element
     */
    public java.lang.String getListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ListId" element
     */
    public com.microsoft.wsdl.types.Guid xgetListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(LISTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ListId" element
     */
    public void setListId(java.lang.String listId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTID$0);
            }
            target.setStringValue(listId);
        }
    }
    
    /**
     * Sets (as xml) the "ListId" element
     */
    public void xsetListId(com.microsoft.wsdl.types.Guid listId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(LISTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(LISTID$0);
            }
            target.set(listId);
        }
    }
    
    /**
     * Gets the "FriendlyName" element
     */
    public java.lang.String getFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIENDLYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FriendlyName" element
     */
    public org.apache.xmlbeans.XmlString xgetFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIENDLYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FriendlyName" element
     */
    public void setFriendlyName(java.lang.String friendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRIENDLYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRIENDLYNAME$2);
            }
            target.setStringValue(friendlyName);
        }
    }
    
    /**
     * Sets (as xml) the "FriendlyName" element
     */
    public void xsetFriendlyName(org.apache.xmlbeans.XmlString friendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRIENDLYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRIENDLYNAME$2);
            }
            target.set(friendlyName);
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
     * Gets the "Propagate" element
     */
    public boolean getPropagate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPAGATE$8, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPAGATE$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPAGATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPAGATE$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPAGATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPAGATE$8);
            }
            target.set(propagate);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPOPTIONS$10, 0);
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
            target = (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions)get_store().find_element_user(OWNERSHIPOPTIONS$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNERSHIPOPTIONS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNERSHIPOPTIONS$10);
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
            target = (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions)get_store().find_element_user(OWNERSHIPOPTIONS$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions)get_store().add_element_user(OWNERSHIPOPTIONS$10);
            }
            target.set(ownershipOptions);
        }
    }
    
    /**
     * Gets the "Owner" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker getOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Owner" element
     */
    public void setOwner(com.microsoft.schemas.crm._2006.coretypes.Moniker owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(OWNER$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(OWNER$12);
            }
            target.set(owner);
        }
    }
    
    /**
     * Appends and returns a new empty "Owner" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker addNewOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(OWNER$12);
            return target;
        }
    }
    
    /**
     * Gets the "sendEmail" element
     */
    public boolean getSendEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDEMAIL$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sendEmail" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDEMAIL$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sendEmail" element
     */
    public void setSendEmail(boolean sendEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDEMAIL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDEMAIL$14);
            }
            target.setBooleanValue(sendEmail);
        }
    }
    
    /**
     * Sets (as xml) the "sendEmail" element
     */
    public void xsetSendEmail(org.apache.xmlbeans.XmlBoolean sendEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDEMAIL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDEMAIL$14);
            }
            target.set(sendEmail);
        }
    }
}
