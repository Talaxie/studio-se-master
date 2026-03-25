/*
 * XML Type:  SetStateBusinessUnitRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateBusinessUnitRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateBusinessUnitRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateBusinessUnitRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateBusinessUnitRequest
{
    
    public SetStateBusinessUnitRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName BUSINESSUNITSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BusinessUnitState");
    private static final javax.xml.namespace.QName BUSINESSUNITSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BusinessUnitStatus");
    
    
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
     * Gets the "BusinessUnitState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.BusinessUnitState.Enum getBusinessUnitState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.BusinessUnitState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessUnitState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.BusinessUnitState xgetBusinessUnitState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.BusinessUnitState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.BusinessUnitState)get_store().find_element_user(BUSINESSUNITSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BusinessUnitState" element
     */
    public void setBusinessUnitState(com.microsoft.schemas.crm._2007.webservices.BusinessUnitState.Enum businessUnitState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSUNITSTATE$2);
            }
            target.setEnumValue(businessUnitState);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessUnitState" element
     */
    public void xsetBusinessUnitState(com.microsoft.schemas.crm._2007.webservices.BusinessUnitState businessUnitState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.BusinessUnitState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.BusinessUnitState)get_store().find_element_user(BUSINESSUNITSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.BusinessUnitState)get_store().add_element_user(BUSINESSUNITSTATE$2);
            }
            target.set(businessUnitState);
        }
    }
    
    /**
     * Gets the "BusinessUnitStatus" element
     */
    public int getBusinessUnitStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessUnitStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetBusinessUnitStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BUSINESSUNITSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BusinessUnitStatus" element
     */
    public void setBusinessUnitStatus(int businessUnitStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSUNITSTATUS$4);
            }
            target.setIntValue(businessUnitStatus);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessUnitStatus" element
     */
    public void xsetBusinessUnitStatus(org.apache.xmlbeans.XmlInt businessUnitStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BUSINESSUNITSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BUSINESSUNITSTATUS$4);
            }
            target.set(businessUnitStatus);
        }
    }
}
