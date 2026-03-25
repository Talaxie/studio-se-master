/*
 * XML Type:  TargetScheduleServiceAppointment
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetScheduleServiceAppointment
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetScheduleServiceAppointment(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetScheduleServiceAppointmentImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetScheduleImpl implements com.microsoft.schemas.crm._2007.webservices.TargetScheduleServiceAppointment
{
    
    public TargetScheduleServiceAppointmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEAPPOINTMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ServiceAppointment");
    
    
    /**
     * Gets the "ServiceAppointment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Serviceappointment getServiceAppointment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Serviceappointment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Serviceappointment)get_store().find_element_user(SERVICEAPPOINTMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ServiceAppointment" element
     */
    public void setServiceAppointment(com.microsoft.schemas.crm._2007.webservices.Serviceappointment serviceAppointment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Serviceappointment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Serviceappointment)get_store().find_element_user(SERVICEAPPOINTMENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Serviceappointment)get_store().add_element_user(SERVICEAPPOINTMENT$0);
            }
            target.set(serviceAppointment);
        }
    }
    
    /**
     * Appends and returns a new empty "ServiceAppointment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Serviceappointment addNewServiceAppointment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Serviceappointment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Serviceappointment)get_store().add_element_user(SERVICEAPPOINTMENT$0);
            return target;
        }
    }
}
