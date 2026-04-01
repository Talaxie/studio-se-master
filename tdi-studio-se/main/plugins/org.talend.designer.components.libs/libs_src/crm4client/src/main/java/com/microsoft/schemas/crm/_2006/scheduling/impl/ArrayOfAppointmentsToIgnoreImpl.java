/*
 * XML Type:  ArrayOfAppointmentsToIgnore
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML ArrayOfAppointmentsToIgnore(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class ArrayOfAppointmentsToIgnoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore
{
    
    public ArrayOfAppointmentsToIgnoreImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPOINTMENTSTOIGNORE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "AppointmentsToIgnore");
    
    
    /**
     * Gets array of all "AppointmentsToIgnore" elements
     */
    public com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore[] getAppointmentsToIgnoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(APPOINTMENTSTOIGNORE$0, targetList);
            com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore[] result = new com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore getAppointmentsToIgnoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AppointmentsToIgnore" element
     */
    public boolean isNilAppointmentsToIgnoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AppointmentsToIgnore" element
     */
    public int sizeOfAppointmentsToIgnoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPOINTMENTSTOIGNORE$0);
        }
    }
    
    /**
     * Sets array of all "AppointmentsToIgnore" element
     */
    public void setAppointmentsToIgnoreArray(com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore[] appointmentsToIgnoreArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(appointmentsToIgnoreArray, APPOINTMENTSTOIGNORE$0);
        }
    }
    
    /**
     * Sets ith "AppointmentsToIgnore" element
     */
    public void setAppointmentsToIgnoreArray(int i, com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore appointmentsToIgnore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(appointmentsToIgnore);
        }
    }
    
    /**
     * Nils the ith "AppointmentsToIgnore" element
     */
    public void setNilAppointmentsToIgnoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore insertNewAppointmentsToIgnore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore)get_store().insert_element_user(APPOINTMENTSTOIGNORE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore addNewAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.AppointmentsToIgnore)get_store().add_element_user(APPOINTMENTSTOIGNORE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AppointmentsToIgnore" element
     */
    public void removeAppointmentsToIgnore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPOINTMENTSTOIGNORE$0, i);
        }
    }
}
