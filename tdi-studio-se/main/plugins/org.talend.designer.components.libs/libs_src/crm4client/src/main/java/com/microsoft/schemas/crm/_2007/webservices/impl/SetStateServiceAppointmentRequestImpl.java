/*
 * XML Type:  SetStateServiceAppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateServiceAppointmentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateServiceAppointmentRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateServiceAppointmentRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateServiceAppointmentRequest
{
    
    public SetStateServiceAppointmentRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName SERVICEAPPOINTMENTSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ServiceAppointmentState");
    private static final javax.xml.namespace.QName SERVICEAPPOINTMENTSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ServiceAppointmentStatus");
    
    
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
     * Gets the "ServiceAppointmentState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState.Enum getServiceAppointmentState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEAPPOINTMENTSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ServiceAppointmentState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState xgetServiceAppointmentState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState)get_store().find_element_user(SERVICEAPPOINTMENTSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ServiceAppointmentState" element
     */
    public void setServiceAppointmentState(com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState.Enum serviceAppointmentState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEAPPOINTMENTSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEAPPOINTMENTSTATE$2);
            }
            target.setEnumValue(serviceAppointmentState);
        }
    }
    
    /**
     * Sets (as xml) the "ServiceAppointmentState" element
     */
    public void xsetServiceAppointmentState(com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState serviceAppointmentState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState)get_store().find_element_user(SERVICEAPPOINTMENTSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ServiceAppointmentState)get_store().add_element_user(SERVICEAPPOINTMENTSTATE$2);
            }
            target.set(serviceAppointmentState);
        }
    }
    
    /**
     * Gets the "ServiceAppointmentStatus" element
     */
    public int getServiceAppointmentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEAPPOINTMENTSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ServiceAppointmentStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetServiceAppointmentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SERVICEAPPOINTMENTSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ServiceAppointmentStatus" element
     */
    public void setServiceAppointmentStatus(int serviceAppointmentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEAPPOINTMENTSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEAPPOINTMENTSTATUS$4);
            }
            target.setIntValue(serviceAppointmentStatus);
        }
    }
    
    /**
     * Sets (as xml) the "ServiceAppointmentStatus" element
     */
    public void xsetServiceAppointmentStatus(org.apache.xmlbeans.XmlInt serviceAppointmentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SERVICEAPPOINTMENTSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SERVICEAPPOINTMENTSTATUS$4);
            }
            target.set(serviceAppointmentStatus);
        }
    }
}
