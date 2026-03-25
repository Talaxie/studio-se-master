/*
 * XML Type:  PropagateByExpressionRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.PropagateByExpressionRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML PropagateByExpressionRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class PropagateByExpressionRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.PropagateByExpressionRequest
{
    
    public PropagateByExpressionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QueryExpression");
    private static final javax.xml.namespace.QName FRIENDLYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FriendlyName");
    private static final javax.xml.namespace.QName EXECUTEIMMEDIATELY$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ExecuteImmediately");
    private static final javax.xml.namespace.QName ACTIVITY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Activity");
    private static final javax.xml.namespace.QName TEMPLATEID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TemplateId");
    private static final javax.xml.namespace.QName OWNERSHIPOPTIONS$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OwnershipOptions");
    private static final javax.xml.namespace.QName POSTWORKFLOWEVENT$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PostWorkflowEvent");
    private static final javax.xml.namespace.QName OWNER$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Owner");
    private static final javax.xml.namespace.QName SENDEMAIL$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SendEmail");
    
    
    /**
     * Gets the "QueryExpression" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase getQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryExpression" element
     */
    public void setQueryExpression(com.microsoft.schemas.crm._2006.query.QueryBase queryExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERYEXPRESSION$0);
            }
            target.set(queryExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryExpression" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase addNewQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERYEXPRESSION$0);
            return target;
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
     * Gets the "ExecuteImmediately" element
     */
    public boolean getExecuteImmediately()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTEIMMEDIATELY$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExecuteImmediately" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetExecuteImmediately()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXECUTEIMMEDIATELY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExecuteImmediately" element
     */
    public void setExecuteImmediately(boolean executeImmediately)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTEIMMEDIATELY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXECUTEIMMEDIATELY$4);
            }
            target.setBooleanValue(executeImmediately);
        }
    }
    
    /**
     * Sets (as xml) the "ExecuteImmediately" element
     */
    public void xsetExecuteImmediately(org.apache.xmlbeans.XmlBoolean executeImmediately)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXECUTEIMMEDIATELY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXECUTEIMMEDIATELY$4);
            }
            target.set(executeImmediately);
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
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(ACTIVITY$6, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(ACTIVITY$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(ACTIVITY$6);
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
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(ACTIVITY$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$8, 0);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEMPLATEID$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATEID$8);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEMPLATEID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(TEMPLATEID$8);
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
     * Gets the "PostWorkflowEvent" element
     */
    public boolean getPostWorkflowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTWORKFLOWEVENT$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostWorkflowEvent" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPostWorkflowEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POSTWORKFLOWEVENT$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PostWorkflowEvent" element
     */
    public void setPostWorkflowEvent(boolean postWorkflowEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTWORKFLOWEVENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTWORKFLOWEVENT$12);
            }
            target.setBooleanValue(postWorkflowEvent);
        }
    }
    
    /**
     * Sets (as xml) the "PostWorkflowEvent" element
     */
    public void xsetPostWorkflowEvent(org.apache.xmlbeans.XmlBoolean postWorkflowEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POSTWORKFLOWEVENT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(POSTWORKFLOWEVENT$12);
            }
            target.set(postWorkflowEvent);
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
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(OWNER$14, 0);
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
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(OWNER$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(OWNER$14);
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
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(OWNER$14);
            return target;
        }
    }
    
    /**
     * Gets the "SendEmail" element
     */
    public boolean getSendEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDEMAIL$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendEmail" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDEMAIL$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SendEmail" element
     */
    public void setSendEmail(boolean sendEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDEMAIL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDEMAIL$16);
            }
            target.setBooleanValue(sendEmail);
        }
    }
    
    /**
     * Sets (as xml) the "SendEmail" element
     */
    public void xsetSendEmail(org.apache.xmlbeans.XmlBoolean sendEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDEMAIL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDEMAIL$16);
            }
            target.set(sendEmail);
        }
    }
}
