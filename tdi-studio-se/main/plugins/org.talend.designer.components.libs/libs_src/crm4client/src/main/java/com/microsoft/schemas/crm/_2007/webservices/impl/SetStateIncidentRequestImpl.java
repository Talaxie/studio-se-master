/*
 * XML Type:  SetStateIncidentRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateIncidentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateIncidentRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateIncidentRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateIncidentRequest
{
    
    public SetStateIncidentRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName INCIDENTSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IncidentState");
    private static final javax.xml.namespace.QName INCIDENTSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IncidentStatus");
    
    
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
     * Gets the "IncidentState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.IncidentState.Enum getIncidentState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.IncidentState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.IncidentState xgetIncidentState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.IncidentState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.IncidentState)get_store().find_element_user(INCIDENTSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentState" element
     */
    public void setIncidentState(com.microsoft.schemas.crm._2007.webservices.IncidentState.Enum incidentState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTSTATE$2);
            }
            target.setEnumValue(incidentState);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentState" element
     */
    public void xsetIncidentState(com.microsoft.schemas.crm._2007.webservices.IncidentState incidentState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.IncidentState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.IncidentState)get_store().find_element_user(INCIDENTSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.IncidentState)get_store().add_element_user(INCIDENTSTATE$2);
            }
            target.set(incidentState);
        }
    }
    
    /**
     * Gets the "IncidentStatus" element
     */
    public int getIncidentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetIncidentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INCIDENTSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentStatus" element
     */
    public void setIncidentStatus(int incidentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTSTATUS$4);
            }
            target.setIntValue(incidentStatus);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentStatus" element
     */
    public void xsetIncidentStatus(org.apache.xmlbeans.XmlInt incidentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INCIDENTSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INCIDENTSTATUS$4);
            }
            target.set(incidentStatus);
        }
    }
}
