/*
 * XML Type:  TargetCreateFixedMonthlyFiscalCalendar
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateFixedMonthlyFiscalCalendar
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateFixedMonthlyFiscalCalendar(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateFixedMonthlyFiscalCalendarImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateFixedMonthlyFiscalCalendar
{
    
    public TargetCreateFixedMonthlyFiscalCalendarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIXEDMONTHLYFISCALCALENDAR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FixedMonthlyFiscalCalendar");
    
    
    /**
     * Gets the "FixedMonthlyFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar getFixedMonthlyFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar)get_store().find_element_user(FIXEDMONTHLYFISCALCALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FixedMonthlyFiscalCalendar" element
     */
    public void setFixedMonthlyFiscalCalendar(com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar fixedMonthlyFiscalCalendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar)get_store().find_element_user(FIXEDMONTHLYFISCALCALENDAR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar)get_store().add_element_user(FIXEDMONTHLYFISCALCALENDAR$0);
            }
            target.set(fixedMonthlyFiscalCalendar);
        }
    }
    
    /**
     * Appends and returns a new empty "FixedMonthlyFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar addNewFixedMonthlyFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Fixedmonthlyfiscalcalendar)get_store().add_element_user(FIXEDMONTHLYFISCALCALENDAR$0);
            return target;
        }
    }
}
