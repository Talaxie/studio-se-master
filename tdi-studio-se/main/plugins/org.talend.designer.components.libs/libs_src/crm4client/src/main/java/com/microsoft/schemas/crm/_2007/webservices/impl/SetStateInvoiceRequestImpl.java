/*
 * XML Type:  SetStateInvoiceRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateInvoiceRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateInvoiceRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateInvoiceRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateInvoiceRequest
{
    
    public SetStateInvoiceRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName INVOICESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "InvoiceState");
    private static final javax.xml.namespace.QName INVOICESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "InvoiceStatus");
    
    
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
     * Gets the "InvoiceState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.InvoiceState.Enum getInvoiceState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.InvoiceState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvoiceState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.InvoiceState xgetInvoiceState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.InvoiceState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.InvoiceState)get_store().find_element_user(INVOICESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvoiceState" element
     */
    public void setInvoiceState(com.microsoft.schemas.crm._2007.webservices.InvoiceState.Enum invoiceState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICESTATE$2);
            }
            target.setEnumValue(invoiceState);
        }
    }
    
    /**
     * Sets (as xml) the "InvoiceState" element
     */
    public void xsetInvoiceState(com.microsoft.schemas.crm._2007.webservices.InvoiceState invoiceState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.InvoiceState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.InvoiceState)get_store().find_element_user(INVOICESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.InvoiceState)get_store().add_element_user(INVOICESTATE$2);
            }
            target.set(invoiceState);
        }
    }
    
    /**
     * Gets the "InvoiceStatus" element
     */
    public int getInvoiceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvoiceStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetInvoiceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVOICESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvoiceStatus" element
     */
    public void setInvoiceStatus(int invoiceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICESTATUS$4);
            }
            target.setIntValue(invoiceStatus);
        }
    }
    
    /**
     * Sets (as xml) the "InvoiceStatus" element
     */
    public void xsetInvoiceStatus(org.apache.xmlbeans.XmlInt invoiceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVOICESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INVOICESTATUS$4);
            }
            target.set(invoiceStatus);
        }
    }
}
