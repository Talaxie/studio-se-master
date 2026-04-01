/*
 * XML Type:  LocalTimeFromUtcTimeResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.LocalTimeFromUtcTimeResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML LocalTimeFromUtcTimeResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class LocalTimeFromUtcTimeResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.LocalTimeFromUtcTimeResponse
{
    
    public LocalTimeFromUtcTimeResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALTIME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "LocalTime");
    
    
    /**
     * Gets the "LocalTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getLocalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LOCALTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocalTime" element
     */
    public void setLocalTime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime localTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LOCALTIME$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LOCALTIME$0);
            }
            target.set(localTime);
        }
    }
    
    /**
     * Appends and returns a new empty "LocalTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewLocalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LOCALTIME$0);
            return target;
        }
    }
}
