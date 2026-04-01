/*
 * XML Type:  SearchRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SearchRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SearchRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SearchRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SearchRequest
{
    
    public SearchRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AppointmentRequest");
    
    
    /**
     * Gets the "AppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest getAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest)get_store().find_element_user(APPOINTMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AppointmentRequest" element
     */
    public void setAppointmentRequest(com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest appointmentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest)get_store().find_element_user(APPOINTMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest)get_store().add_element_user(APPOINTMENTREQUEST$0);
            }
            target.set(appointmentRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "AppointmentRequest" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest addNewAppointmentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest)get_store().add_element_user(APPOINTMENTREQUEST$0);
            return target;
        }
    }
}
