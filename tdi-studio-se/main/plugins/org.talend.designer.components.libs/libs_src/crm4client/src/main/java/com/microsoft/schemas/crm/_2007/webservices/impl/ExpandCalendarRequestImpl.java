/*
 * XML Type:  ExpandCalendarRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ExpandCalendarRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ExpandCalendarRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ExpandCalendarRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ExpandCalendarRequest
{
    
    public ExpandCalendarRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALENDARID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CalendarId");
    private static final javax.xml.namespace.QName START$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Start");
    private static final javax.xml.namespace.QName END$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "End");
    
    
    /**
     * Gets the "CalendarId" element
     */
    public java.lang.String getCalendarId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CalendarId" element
     */
    public com.microsoft.wsdl.types.Guid xgetCalendarId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CALENDARID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CalendarId" element
     */
    public void setCalendarId(java.lang.String calendarId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALENDARID$0);
            }
            target.setStringValue(calendarId);
        }
    }
    
    /**
     * Sets (as xml) the "CalendarId" element
     */
    public void xsetCalendarId(com.microsoft.wsdl.types.Guid calendarId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CALENDARID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CALENDARID$0);
            }
            target.set(calendarId);
        }
    }
    
    /**
     * Gets the "Start" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(START$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Start" element
     */
    public void setStart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(START$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(START$2);
            }
            target.set(start);
        }
    }
    
    /**
     * Appends and returns a new empty "Start" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(START$2);
            return target;
        }
    }
    
    /**
     * Gets the "End" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(END$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "End" element
     */
    public void setEnd(com.microsoft.schemas.crm._2006.webservices.CrmDateTime end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(END$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(END$4);
            }
            target.set(end);
        }
    }
    
    /**
     * Appends and returns a new empty "End" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(END$4);
            return target;
        }
    }
}
