/*
 * XML Type:  UtcTimeFromLocalTimeResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.UtcTimeFromLocalTimeResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML UtcTimeFromLocalTimeResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class UtcTimeFromLocalTimeResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.UtcTimeFromLocalTimeResponse
{
    
    public UtcTimeFromLocalTimeResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UTCTIME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UtcTime");
    
    
    /**
     * Gets the "UtcTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getUtcTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(UTCTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UtcTime" element
     */
    public void setUtcTime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime utcTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(UTCTIME$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(UTCTIME$0);
            }
            target.set(utcTime);
        }
    }
    
    /**
     * Appends and returns a new empty "UtcTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewUtcTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(UTCTIME$0);
            return target;
        }
    }
}
