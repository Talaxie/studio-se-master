/*
 * XML Type:  TargetCreateMonthlyFiscalCalendar
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateMonthlyFiscalCalendar
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateMonthlyFiscalCalendar(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateMonthlyFiscalCalendarImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateMonthlyFiscalCalendar
{
    
    public TargetCreateMonthlyFiscalCalendarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONTHLYFISCALCALENDAR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "MonthlyFiscalCalendar");
    
    
    /**
     * Gets the "MonthlyFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar getMonthlyFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar)get_store().find_element_user(MONTHLYFISCALCALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MonthlyFiscalCalendar" element
     */
    public void setMonthlyFiscalCalendar(com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar monthlyFiscalCalendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar)get_store().find_element_user(MONTHLYFISCALCALENDAR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar)get_store().add_element_user(MONTHLYFISCALCALENDAR$0);
            }
            target.set(monthlyFiscalCalendar);
        }
    }
    
    /**
     * Appends and returns a new empty "MonthlyFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar addNewMonthlyFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Monthlyfiscalcalendar)get_store().add_element_user(MONTHLYFISCALCALENDAR$0);
            return target;
        }
    }
}
