/*
 * XML Type:  SetStateIncidentResolutionRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateIncidentResolutionRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateIncidentResolutionRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateIncidentResolutionRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateIncidentResolutionRequest
{
    
    public SetStateIncidentResolutionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName INCIDENTRESOLUTIONSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IncidentResolutionState");
    private static final javax.xml.namespace.QName INCIDENTRESOLUTIONSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IncidentResolutionStatus");
    
    
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
     * Gets the "IncidentResolutionState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState.Enum getIncidentResolutionState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTRESOLUTIONSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentResolutionState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState xgetIncidentResolutionState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState)get_store().find_element_user(INCIDENTRESOLUTIONSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentResolutionState" element
     */
    public void setIncidentResolutionState(com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState.Enum incidentResolutionState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTRESOLUTIONSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTRESOLUTIONSTATE$2);
            }
            target.setEnumValue(incidentResolutionState);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentResolutionState" element
     */
    public void xsetIncidentResolutionState(com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState incidentResolutionState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState)get_store().find_element_user(INCIDENTRESOLUTIONSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.IncidentResolutionState)get_store().add_element_user(INCIDENTRESOLUTIONSTATE$2);
            }
            target.set(incidentResolutionState);
        }
    }
    
    /**
     * Gets the "IncidentResolutionStatus" element
     */
    public int getIncidentResolutionStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTRESOLUTIONSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentResolutionStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetIncidentResolutionStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INCIDENTRESOLUTIONSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentResolutionStatus" element
     */
    public void setIncidentResolutionStatus(int incidentResolutionStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTRESOLUTIONSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTRESOLUTIONSTATUS$4);
            }
            target.setIntValue(incidentResolutionStatus);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentResolutionStatus" element
     */
    public void xsetIncidentResolutionStatus(org.apache.xmlbeans.XmlInt incidentResolutionStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INCIDENTRESOLUTIONSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INCIDENTRESOLUTIONSTATUS$4);
            }
            target.set(incidentResolutionStatus);
        }
    }
}
