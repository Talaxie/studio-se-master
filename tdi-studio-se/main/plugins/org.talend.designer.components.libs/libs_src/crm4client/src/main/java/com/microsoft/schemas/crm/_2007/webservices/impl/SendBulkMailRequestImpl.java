/*
 * XML Type:  SendBulkMailRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SendBulkMailRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SendBulkMailRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SendBulkMailRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SendBulkMailRequest
{
    
    public SendBulkMailRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Sender");
    private static final javax.xml.namespace.QName TEMPLATEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TemplateId");
    private static final javax.xml.namespace.QName REGARDINGTYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RegardingType");
    private static final javax.xml.namespace.QName REGARDINGID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RegardingId");
    private static final javax.xml.namespace.QName QUERY$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Query");
    
    
    /**
     * Gets the "Sender" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker getSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(SENDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sender" element
     */
    public void setSender(com.microsoft.schemas.crm._2006.coretypes.Moniker sender)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(SENDER$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(SENDER$0);
            }
            target.set(sender);
        }
    }
    
    /**
     * Appends and returns a new empty "Sender" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker addNewSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(SENDER$0);
            return target;
        }
    }
    
    /**
     * Gets the "TemplateId" element
     */
    public java.lang.String getTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TemplateId" element
     */
    public com.microsoft.wsdl.types.Guid xgetTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEMPLATEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TemplateId" element
     */
    public void setTemplateId(java.lang.String templateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATEID$2);
            }
            target.setStringValue(templateId);
        }
    }
    
    /**
     * Sets (as xml) the "TemplateId" element
     */
    public void xsetTemplateId(com.microsoft.wsdl.types.Guid templateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEMPLATEID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(TEMPLATEID$2);
            }
            target.set(templateId);
        }
    }
    
    /**
     * Gets the "RegardingType" element
     */
    public java.lang.String getRegardingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGARDINGTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RegardingType" element
     */
    public org.apache.xmlbeans.XmlString xgetRegardingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGARDINGTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RegardingType" element
     */
    public void setRegardingType(java.lang.String regardingType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGARDINGTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGARDINGTYPE$4);
            }
            target.setStringValue(regardingType);
        }
    }
    
    /**
     * Sets (as xml) the "RegardingType" element
     */
    public void xsetRegardingType(org.apache.xmlbeans.XmlString regardingType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGARDINGTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGARDINGTYPE$4);
            }
            target.set(regardingType);
        }
    }
    
    /**
     * Gets the "RegardingId" element
     */
    public java.lang.String getRegardingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGARDINGID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RegardingId" element
     */
    public com.microsoft.wsdl.types.Guid xgetRegardingId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(REGARDINGID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RegardingId" element
     */
    public void setRegardingId(java.lang.String regardingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGARDINGID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGARDINGID$6);
            }
            target.setStringValue(regardingId);
        }
    }
    
    /**
     * Sets (as xml) the "RegardingId" element
     */
    public void xsetRegardingId(com.microsoft.wsdl.types.Guid regardingId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(REGARDINGID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(REGARDINGID$6);
            }
            target.set(regardingId);
        }
    }
    
    /**
     * Gets the "Query" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(com.microsoft.schemas.crm._2006.query.QueryBase query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$8);
            }
            target.set(query);
        }
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$8);
            return target;
        }
    }
}
