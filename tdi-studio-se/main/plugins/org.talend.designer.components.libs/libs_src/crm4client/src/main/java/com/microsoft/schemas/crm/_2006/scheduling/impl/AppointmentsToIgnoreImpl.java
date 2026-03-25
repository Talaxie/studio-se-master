/*
 * XML Type:  AppointmentsToIgnore
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML AppointmentsToIgnore(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class AppointmentsToIgnoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore
{
    
    public AppointmentsToIgnoreImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Appointments");
    private static final javax.xml.namespace.QName RESOURCEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ResourceId");
    
    
    /**
     * Gets the "Appointments" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid getAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid)get_store().find_element_user(APPOINTMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Appointments" element
     */
    public boolean isSetAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPOINTMENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "Appointments" element
     */
    public void setAppointments(com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid appointments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid)get_store().find_element_user(APPOINTMENTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid)get_store().add_element_user(APPOINTMENTS$0);
            }
            target.set(appointments);
        }
    }
    
    /**
     * Appends and returns a new empty "Appointments" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid addNewAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid)get_store().add_element_user(APPOINTMENTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Appointments" element
     */
    public void unsetAppointments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPOINTMENTS$0, 0);
        }
    }
    
    /**
     * Gets the "ResourceId" element
     */
    public java.lang.String getResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourceId" element
     */
    public com.microsoft.wsdl.types.Guid xgetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(RESOURCEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResourceId" element
     */
    public void setResourceId(java.lang.String resourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEID$2);
            }
            target.setStringValue(resourceId);
        }
    }
    
    /**
     * Sets (as xml) the "ResourceId" element
     */
    public void xsetResourceId(com.microsoft.wsdl.types.Guid resourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(RESOURCEID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(RESOURCEID$2);
            }
            target.set(resourceId);
        }
    }
}
