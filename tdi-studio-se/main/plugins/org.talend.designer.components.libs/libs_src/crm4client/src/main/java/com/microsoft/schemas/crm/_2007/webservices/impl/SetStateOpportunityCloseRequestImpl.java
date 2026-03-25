/*
 * XML Type:  SetStateOpportunityCloseRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateOpportunityCloseRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateOpportunityCloseRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateOpportunityCloseRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateOpportunityCloseRequest
{
    
    public SetStateOpportunityCloseRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName OPPORTUNITYCLOSESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OpportunityCloseState");
    private static final javax.xml.namespace.QName OPPORTUNITYCLOSESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OpportunityCloseStatus");
    
    
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
     * Gets the "OpportunityCloseState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState.Enum getOpportunityCloseState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPORTUNITYCLOSESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OpportunityCloseState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState xgetOpportunityCloseState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState)get_store().find_element_user(OPPORTUNITYCLOSESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OpportunityCloseState" element
     */
    public void setOpportunityCloseState(com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState.Enum opportunityCloseState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPORTUNITYCLOSESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPPORTUNITYCLOSESTATE$2);
            }
            target.setEnumValue(opportunityCloseState);
        }
    }
    
    /**
     * Sets (as xml) the "OpportunityCloseState" element
     */
    public void xsetOpportunityCloseState(com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState opportunityCloseState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState)get_store().find_element_user(OPPORTUNITYCLOSESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.OpportunityCloseState)get_store().add_element_user(OPPORTUNITYCLOSESTATE$2);
            }
            target.set(opportunityCloseState);
        }
    }
    
    /**
     * Gets the "OpportunityCloseStatus" element
     */
    public int getOpportunityCloseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPORTUNITYCLOSESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OpportunityCloseStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetOpportunityCloseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OPPORTUNITYCLOSESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OpportunityCloseStatus" element
     */
    public void setOpportunityCloseStatus(int opportunityCloseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPPORTUNITYCLOSESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPPORTUNITYCLOSESTATUS$4);
            }
            target.setIntValue(opportunityCloseStatus);
        }
    }
    
    /**
     * Sets (as xml) the "OpportunityCloseStatus" element
     */
    public void xsetOpportunityCloseStatus(org.apache.xmlbeans.XmlInt opportunityCloseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OPPORTUNITYCLOSESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OPPORTUNITYCLOSESTATUS$4);
            }
            target.set(opportunityCloseStatus);
        }
    }
}
