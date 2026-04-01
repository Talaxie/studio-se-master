/*
 * XML Type:  TargetUpdateAnnualFiscalCalendar
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateAnnualFiscalCalendar
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateAnnualFiscalCalendar(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateAnnualFiscalCalendarImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateAnnualFiscalCalendar
{
    
    public TargetUpdateAnnualFiscalCalendarImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNUALFISCALCALENDAR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AnnualFiscalCalendar");
    
    
    /**
     * Gets the "AnnualFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar getAnnualFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar)get_store().find_element_user(ANNUALFISCALCALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AnnualFiscalCalendar" element
     */
    public void setAnnualFiscalCalendar(com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar annualFiscalCalendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar)get_store().find_element_user(ANNUALFISCALCALENDAR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar)get_store().add_element_user(ANNUALFISCALCALENDAR$0);
            }
            target.set(annualFiscalCalendar);
        }
    }
    
    /**
     * Appends and returns a new empty "AnnualFiscalCalendar" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar addNewAnnualFiscalCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Annualfiscalcalendar)get_store().add_element_user(ANNUALFISCALCALENDAR$0);
            return target;
        }
    }
}
