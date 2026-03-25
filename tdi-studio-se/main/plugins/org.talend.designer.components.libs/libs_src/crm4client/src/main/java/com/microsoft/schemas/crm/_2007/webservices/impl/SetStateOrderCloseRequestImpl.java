/*
 * XML Type:  SetStateOrderCloseRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateOrderCloseRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateOrderCloseRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateOrderCloseRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateOrderCloseRequest
{
    
    public SetStateOrderCloseRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName ORDERCLOSESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OrderCloseState");
    private static final javax.xml.namespace.QName ORDERCLOSESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OrderCloseStatus");
    
    
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
     * Gets the "OrderCloseState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OrderCloseState.Enum getOrderCloseState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERCLOSESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.OrderCloseState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderCloseState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OrderCloseState xgetOrderCloseState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OrderCloseState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OrderCloseState)get_store().find_element_user(ORDERCLOSESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderCloseState" element
     */
    public void setOrderCloseState(com.microsoft.schemas.crm._2007.webservices.OrderCloseState.Enum orderCloseState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERCLOSESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERCLOSESTATE$2);
            }
            target.setEnumValue(orderCloseState);
        }
    }
    
    /**
     * Sets (as xml) the "OrderCloseState" element
     */
    public void xsetOrderCloseState(com.microsoft.schemas.crm._2007.webservices.OrderCloseState orderCloseState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OrderCloseState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OrderCloseState)get_store().find_element_user(ORDERCLOSESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.OrderCloseState)get_store().add_element_user(ORDERCLOSESTATE$2);
            }
            target.set(orderCloseState);
        }
    }
    
    /**
     * Gets the "OrderCloseStatus" element
     */
    public int getOrderCloseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERCLOSESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderCloseStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetOrderCloseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDERCLOSESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderCloseStatus" element
     */
    public void setOrderCloseStatus(int orderCloseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERCLOSESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERCLOSESTATUS$4);
            }
            target.setIntValue(orderCloseStatus);
        }
    }
    
    /**
     * Sets (as xml) the "OrderCloseStatus" element
     */
    public void xsetOrderCloseStatus(org.apache.xmlbeans.XmlInt orderCloseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ORDERCLOSESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ORDERCLOSESTATUS$4);
            }
            target.set(orderCloseStatus);
        }
    }
}
