/*
 * XML Type:  TargetCreateQuarterlyFiscalCalendar
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateQuarterlyFiscalCalendar
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateQuarterlyFiscalCalendar(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateQuarterlyFiscalCalendarImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateQuarterlyFiscalCalendar
{
    
    public TargetCreateQuarterlyFiscalCalendarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUARTERLYFISCALCALENDAR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QuarterlyFiscalCalendar");
    
    
    /**
     * Gets the "QuarterlyFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar getQuarterlyFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar)get_store().find_element_user(QUARTERLYFISCALCALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuarterlyFiscalCalendar" element
     */
    public void setQuarterlyFiscalCalendar(com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar quarterlyFiscalCalendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar)get_store().find_element_user(QUARTERLYFISCALCALENDAR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar)get_store().add_element_user(QUARTERLYFISCALCALENDAR$0);
            }
            target.set(quarterlyFiscalCalendar);
        }
    }
    
    /**
     * Appends and returns a new empty "QuarterlyFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar addNewQuarterlyFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quarterlyfiscalcalendar)get_store().add_element_user(QUARTERLYFISCALCALENDAR$0);
            return target;
        }
    }
}
