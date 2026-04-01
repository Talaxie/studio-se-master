/*
 * XML Type:  TargetCreateSemiAnnualFiscalCalendar
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateSemiAnnualFiscalCalendar
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateSemiAnnualFiscalCalendar(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateSemiAnnualFiscalCalendarImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateSemiAnnualFiscalCalendar
{
    
    public TargetCreateSemiAnnualFiscalCalendarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEMIANNUALFISCALCALENDAR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SemiAnnualFiscalCalendar");
    
    
    /**
     * Gets the "SemiAnnualFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar getSemiAnnualFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar)get_store().find_element_user(SEMIANNUALFISCALCALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SemiAnnualFiscalCalendar" element
     */
    public void setSemiAnnualFiscalCalendar(com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar semiAnnualFiscalCalendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar)get_store().find_element_user(SEMIANNUALFISCALCALENDAR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar)get_store().add_element_user(SEMIANNUALFISCALCALENDAR$0);
            }
            target.set(semiAnnualFiscalCalendar);
        }
    }
    
    /**
     * Appends and returns a new empty "SemiAnnualFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar addNewSemiAnnualFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Semiannualfiscalcalendar)get_store().add_element_user(SEMIANNUALFISCALCALENDAR$0);
            return target;
        }
    }
}
