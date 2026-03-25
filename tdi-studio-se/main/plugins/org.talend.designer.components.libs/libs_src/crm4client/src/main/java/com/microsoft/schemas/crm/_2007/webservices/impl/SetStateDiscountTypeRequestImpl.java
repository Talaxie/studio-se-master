/*
 * XML Type:  SetStateDiscountTypeRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateDiscountTypeRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateDiscountTypeRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateDiscountTypeRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateDiscountTypeRequest
{
    
    public SetStateDiscountTypeRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName DISCOUNTTYPESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "DiscountTypeState");
    private static final javax.xml.namespace.QName DISCOUNTTYPESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "DiscountTypeStatus");
    
    
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
     * Gets the "DiscountTypeState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.DiscountTypeState.Enum getDiscountTypeState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTTYPESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.DiscountTypeState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DiscountTypeState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.DiscountTypeState xgetDiscountTypeState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.DiscountTypeState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.DiscountTypeState)get_store().find_element_user(DISCOUNTTYPESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DiscountTypeState" element
     */
    public void setDiscountTypeState(com.microsoft.schemas.crm._2007.webservices.DiscountTypeState.Enum discountTypeState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTTYPESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCOUNTTYPESTATE$2);
            }
            target.setEnumValue(discountTypeState);
        }
    }
    
    /**
     * Sets (as xml) the "DiscountTypeState" element
     */
    public void xsetDiscountTypeState(com.microsoft.schemas.crm._2007.webservices.DiscountTypeState discountTypeState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.DiscountTypeState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.DiscountTypeState)get_store().find_element_user(DISCOUNTTYPESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.DiscountTypeState)get_store().add_element_user(DISCOUNTTYPESTATE$2);
            }
            target.set(discountTypeState);
        }
    }
    
    /**
     * Gets the "DiscountTypeStatus" element
     */
    public int getDiscountTypeStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTTYPESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "DiscountTypeStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetDiscountTypeStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DISCOUNTTYPESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DiscountTypeStatus" element
     */
    public void setDiscountTypeStatus(int discountTypeStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTTYPESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCOUNTTYPESTATUS$4);
            }
            target.setIntValue(discountTypeStatus);
        }
    }
    
    /**
     * Sets (as xml) the "DiscountTypeStatus" element
     */
    public void xsetDiscountTypeStatus(org.apache.xmlbeans.XmlInt discountTypeStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DISCOUNTTYPESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DISCOUNTTYPESTATUS$4);
            }
            target.set(discountTypeStatus);
        }
    }
}
