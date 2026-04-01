/*
 * XML Type:  CorrelationToken
 * Namespace: http://schemas.microsoft.com/crm/2007/CoreTypes
 * Java type: com.microsoft.schemas.crm._2007.coretypes.CorrelationToken
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.coretypes.impl;
/**
 * An XML CorrelationToken(@http://schemas.microsoft.com/crm/2007/CoreTypes).
 *
 * This is a complex type.
 */
public class CorrelationTokenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.coretypes.CorrelationToken
{
    
    public CorrelationTokenImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/CoreTypes", "CorrelationId");
    private static final javax.xml.namespace.QName CORRELATIONUPDATEDTIME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/CoreTypes", "CorrelationUpdatedTime");
    private static final javax.xml.namespace.QName DEPTH$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/CoreTypes", "Depth");
    
    
    /**
     * Gets the "CorrelationId" element
     */
    public java.lang.String getCorrelationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorrelationId" element
     */
    public com.microsoft.wsdl.types.Guid xgetCorrelationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CORRELATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CorrelationId" element
     */
    public void setCorrelationId(java.lang.String correlationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRELATIONID$0);
            }
            target.setStringValue(correlationId);
        }
    }
    
    /**
     * Sets (as xml) the "CorrelationId" element
     */
    public void xsetCorrelationId(com.microsoft.wsdl.types.Guid correlationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CORRELATIONID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CORRELATIONID$0);
            }
            target.set(correlationId);
        }
    }
    
    /**
     * Gets the "CorrelationUpdatedTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCorrelationUpdatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CORRELATIONUPDATEDTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CorrelationUpdatedTime" element
     */
    public boolean isSetCorrelationUpdatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONUPDATEDTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "CorrelationUpdatedTime" element
     */
    public void setCorrelationUpdatedTime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime correlationUpdatedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CORRELATIONUPDATEDTIME$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CORRELATIONUPDATEDTIME$2);
            }
            target.set(correlationUpdatedTime);
        }
    }
    
    /**
     * Appends and returns a new empty "CorrelationUpdatedTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCorrelationUpdatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CORRELATIONUPDATEDTIME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CorrelationUpdatedTime" element
     */
    public void unsetCorrelationUpdatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONUPDATEDTIME$2, 0);
        }
    }
    
    /**
     * Gets the "Depth" element
     */
    public int getDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPTH$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Depth" element
     */
    public org.apache.xmlbeans.XmlInt xgetDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPTH$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Depth" element
     */
    public void setDepth(int depth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPTH$4);
            }
            target.setIntValue(depth);
        }
    }
    
    /**
     * Sets (as xml) the "Depth" element
     */
    public void xsetDepth(org.apache.xmlbeans.XmlInt depth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DEPTH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DEPTH$4);
            }
            target.set(depth);
        }
    }
}
