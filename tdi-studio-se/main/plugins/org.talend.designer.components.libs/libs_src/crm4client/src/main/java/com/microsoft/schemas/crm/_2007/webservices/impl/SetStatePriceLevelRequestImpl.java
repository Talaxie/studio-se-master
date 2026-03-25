/*
 * XML Type:  SetStatePriceLevelRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStatePriceLevelRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStatePriceLevelRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStatePriceLevelRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStatePriceLevelRequest
{
    
    public SetStatePriceLevelRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName PRICELEVELSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PriceLevelState");
    private static final javax.xml.namespace.QName PRICELEVELSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PriceLevelStatus");
    
    
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
     * Gets the "PriceLevelState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.PriceLevelState.Enum getPriceLevelState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICELEVELSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.PriceLevelState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PriceLevelState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.PriceLevelState xgetPriceLevelState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.PriceLevelState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.PriceLevelState)get_store().find_element_user(PRICELEVELSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PriceLevelState" element
     */
    public void setPriceLevelState(com.microsoft.schemas.crm._2007.webservices.PriceLevelState.Enum priceLevelState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICELEVELSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICELEVELSTATE$2);
            }
            target.setEnumValue(priceLevelState);
        }
    }
    
    /**
     * Sets (as xml) the "PriceLevelState" element
     */
    public void xsetPriceLevelState(com.microsoft.schemas.crm._2007.webservices.PriceLevelState priceLevelState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.PriceLevelState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.PriceLevelState)get_store().find_element_user(PRICELEVELSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.PriceLevelState)get_store().add_element_user(PRICELEVELSTATE$2);
            }
            target.set(priceLevelState);
        }
    }
    
    /**
     * Gets the "PriceLevelStatus" element
     */
    public int getPriceLevelStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICELEVELSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PriceLevelStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetPriceLevelStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRICELEVELSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PriceLevelStatus" element
     */
    public void setPriceLevelStatus(int priceLevelStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICELEVELSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICELEVELSTATUS$4);
            }
            target.setIntValue(priceLevelStatus);
        }
    }
    
    /**
     * Sets (as xml) the "PriceLevelStatus" element
     */
    public void xsetPriceLevelStatus(org.apache.xmlbeans.XmlInt priceLevelStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRICELEVELSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRICELEVELSTATUS$4);
            }
            target.set(priceLevelStatus);
        }
    }
}
