/*
 * XML Type:  TargetCreateCalendar
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateCalendar
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateCalendar(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateCalendarImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateCalendar
{
    
    public TargetCreateCalendarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALENDAR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Calendar");
    
    
    /**
     * Gets the "Calendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Calendar getCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Calendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Calendar)get_store().find_element_user(CALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Calendar" element
     */
    public void setCalendar(com.microsoft.schemas.crm._2007.webservices.Calendar calendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Calendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Calendar)get_store().find_element_user(CALENDAR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Calendar)get_store().add_element_user(CALENDAR$0);
            }
            target.set(calendar);
        }
    }
    
    /**
     * Appends and returns a new empty "Calendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Calendar addNewCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Calendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Calendar)get_store().add_element_user(CALENDAR$0);
            return target;
        }
    }
}
