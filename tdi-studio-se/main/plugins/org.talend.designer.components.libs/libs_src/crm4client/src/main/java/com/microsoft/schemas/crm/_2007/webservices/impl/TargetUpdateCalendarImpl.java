/*
 * XML Type:  TargetUpdateCalendar
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateCalendar
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateCalendar(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateCalendarImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateCalendar
{
    
    public TargetUpdateCalendarImpl(org.apache.xmlbeans.SchemaType sType)
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
