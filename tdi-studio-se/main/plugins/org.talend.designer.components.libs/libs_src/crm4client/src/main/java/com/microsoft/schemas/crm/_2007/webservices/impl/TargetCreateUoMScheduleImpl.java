/*
 * XML Type:  TargetCreateUoMSchedule
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateUoMSchedule
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateUoMSchedule(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateUoMScheduleImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateUoMSchedule
{
    
    public TargetCreateUoMScheduleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UOMSCHEDULE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UoMSchedule");
    
    
    /**
     * Gets the "UoMSchedule" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Uomschedule getUoMSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Uomschedule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Uomschedule)get_store().find_element_user(UOMSCHEDULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UoMSchedule" element
     */
    public void setUoMSchedule(com.microsoft.schemas.crm._2007.webservices.Uomschedule uoMSchedule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Uomschedule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Uomschedule)get_store().find_element_user(UOMSCHEDULE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Uomschedule)get_store().add_element_user(UOMSCHEDULE$0);
            }
            target.set(uoMSchedule);
        }
    }
    
    /**
     * Appends and returns a new empty "UoMSchedule" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Uomschedule addNewUoMSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Uomschedule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Uomschedule)get_store().add_element_user(UOMSCHEDULE$0);
            return target;
        }
    }
}
