/*
 * XML Type:  TargetUpdateAppointment
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateAppointment
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateAppointment(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateAppointmentImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateAppointment
{
    
    public TargetUpdateAppointmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Appointment");
    
    
    /**
     * Gets the "Appointment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Appointment getAppointment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Appointment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Appointment)get_store().find_element_user(APPOINTMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Appointment" element
     */
    public void setAppointment(com.microsoft.schemas.crm._2007.webservices.Appointment appointment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Appointment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Appointment)get_store().find_element_user(APPOINTMENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Appointment)get_store().add_element_user(APPOINTMENT$0);
            }
            target.set(appointment);
        }
    }
    
    /**
     * Appends and returns a new empty "Appointment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Appointment addNewAppointment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Appointment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Appointment)get_store().add_element_user(APPOINTMENT$0);
            return target;
        }
    }
}
