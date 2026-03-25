/*
 * XML Type:  SetStatePhoneCallRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStatePhoneCallRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStatePhoneCallRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStatePhoneCallRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStatePhoneCallRequest
{
    
    public SetStatePhoneCallRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName PHONECALLSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PhoneCallState");
    private static final javax.xml.namespace.QName PHONECALLSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PhoneCallStatus");
    
    
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
     * Gets the "PhoneCallState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.PhoneCallState.Enum getPhoneCallState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECALLSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.PhoneCallState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PhoneCallState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.PhoneCallState xgetPhoneCallState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.PhoneCallState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.PhoneCallState)get_store().find_element_user(PHONECALLSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PhoneCallState" element
     */
    public void setPhoneCallState(com.microsoft.schemas.crm._2007.webservices.PhoneCallState.Enum phoneCallState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECALLSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONECALLSTATE$2);
            }
            target.setEnumValue(phoneCallState);
        }
    }
    
    /**
     * Sets (as xml) the "PhoneCallState" element
     */
    public void xsetPhoneCallState(com.microsoft.schemas.crm._2007.webservices.PhoneCallState phoneCallState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.PhoneCallState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.PhoneCallState)get_store().find_element_user(PHONECALLSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.PhoneCallState)get_store().add_element_user(PHONECALLSTATE$2);
            }
            target.set(phoneCallState);
        }
    }
    
    /**
     * Gets the "PhoneCallStatus" element
     */
    public int getPhoneCallStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECALLSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PhoneCallStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetPhoneCallStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PHONECALLSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PhoneCallStatus" element
     */
    public void setPhoneCallStatus(int phoneCallStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONECALLSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONECALLSTATUS$4);
            }
            target.setIntValue(phoneCallStatus);
        }
    }
    
    /**
     * Sets (as xml) the "PhoneCallStatus" element
     */
    public void xsetPhoneCallStatus(org.apache.xmlbeans.XmlInt phoneCallStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PHONECALLSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PHONECALLSTATUS$4);
            }
            target.set(phoneCallStatus);
        }
    }
}
