/*
 * XML Type:  SetStateWFProcessInstanceRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateWFProcessInstanceRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateWFProcessInstanceRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateWFProcessInstanceRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateWFProcessInstanceRequest
{
    
    public SetStateWFProcessInstanceRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName WFPROCESSINSTANCESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WFProcessInstanceState");
    private static final javax.xml.namespace.QName WFPROCESSINSTANCESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WFProcessInstanceStatus");
    
    
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
     * Gets the "WFProcessInstanceState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState.Enum getWFProcessInstanceState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WFPROCESSINSTANCESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "WFProcessInstanceState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState xgetWFProcessInstanceState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState)get_store().find_element_user(WFPROCESSINSTANCESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WFProcessInstanceState" element
     */
    public void setWFProcessInstanceState(com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState.Enum wfProcessInstanceState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WFPROCESSINSTANCESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WFPROCESSINSTANCESTATE$2);
            }
            target.setEnumValue(wfProcessInstanceState);
        }
    }
    
    /**
     * Sets (as xml) the "WFProcessInstanceState" element
     */
    public void xsetWFProcessInstanceState(com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState wfProcessInstanceState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState)get_store().find_element_user(WFPROCESSINSTANCESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceState)get_store().add_element_user(WFPROCESSINSTANCESTATE$2);
            }
            target.set(wfProcessInstanceState);
        }
    }
    
    /**
     * Gets the "WFProcessInstanceStatus" element
     */
    public int getWFProcessInstanceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WFPROCESSINSTANCESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "WFProcessInstanceStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetWFProcessInstanceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WFPROCESSINSTANCESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WFProcessInstanceStatus" element
     */
    public void setWFProcessInstanceStatus(int wfProcessInstanceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WFPROCESSINSTANCESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WFPROCESSINSTANCESTATUS$4);
            }
            target.setIntValue(wfProcessInstanceStatus);
        }
    }
    
    /**
     * Sets (as xml) the "WFProcessInstanceStatus" element
     */
    public void xsetWFProcessInstanceStatus(org.apache.xmlbeans.XmlInt wfProcessInstanceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WFPROCESSINSTANCESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WFPROCESSINSTANCESTATUS$4);
            }
            target.set(wfProcessInstanceStatus);
        }
    }
}
