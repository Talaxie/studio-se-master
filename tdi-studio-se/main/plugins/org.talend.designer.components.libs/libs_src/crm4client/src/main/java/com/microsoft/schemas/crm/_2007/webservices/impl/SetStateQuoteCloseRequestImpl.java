/*
 * XML Type:  SetStateQuoteCloseRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateQuoteCloseRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateQuoteCloseRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateQuoteCloseRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateQuoteCloseRequest
{
    
    public SetStateQuoteCloseRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName QUOTECLOSESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QuoteCloseState");
    private static final javax.xml.namespace.QName QUOTECLOSESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QuoteCloseStatus");
    
    
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
     * Gets the "QuoteCloseState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.QuoteCloseState.Enum getQuoteCloseState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTECLOSESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.QuoteCloseState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "QuoteCloseState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.QuoteCloseState xgetQuoteCloseState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.QuoteCloseState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.QuoteCloseState)get_store().find_element_user(QUOTECLOSESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QuoteCloseState" element
     */
    public void setQuoteCloseState(com.microsoft.schemas.crm._2007.webservices.QuoteCloseState.Enum quoteCloseState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTECLOSESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUOTECLOSESTATE$2);
            }
            target.setEnumValue(quoteCloseState);
        }
    }
    
    /**
     * Sets (as xml) the "QuoteCloseState" element
     */
    public void xsetQuoteCloseState(com.microsoft.schemas.crm._2007.webservices.QuoteCloseState quoteCloseState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.QuoteCloseState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.QuoteCloseState)get_store().find_element_user(QUOTECLOSESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.QuoteCloseState)get_store().add_element_user(QUOTECLOSESTATE$2);
            }
            target.set(quoteCloseState);
        }
    }
    
    /**
     * Gets the "QuoteCloseStatus" element
     */
    public int getQuoteCloseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTECLOSESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "QuoteCloseStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetQuoteCloseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUOTECLOSESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QuoteCloseStatus" element
     */
    public void setQuoteCloseStatus(int quoteCloseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTECLOSESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUOTECLOSESTATUS$4);
            }
            target.setIntValue(quoteCloseStatus);
        }
    }
    
    /**
     * Sets (as xml) the "QuoteCloseStatus" element
     */
    public void xsetQuoteCloseStatus(org.apache.xmlbeans.XmlInt quoteCloseStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUOTECLOSESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUOTECLOSESTATUS$4);
            }
            target.set(quoteCloseStatus);
        }
    }
}
