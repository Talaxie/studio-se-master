/*
 * XML Type:  ArrayOfcalendarrule
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfcalendarrule
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfcalendarrule(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfcalendarruleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfcalendarrule
{
    
    public ArrayOfcalendarruleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALENDARRULE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "calendarrule");
    
    
    /**
     * Gets array of all "calendarrule" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.Calendarrule[] getCalendarruleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CALENDARRULE$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.Calendarrule[] result = new com.microsoft.schemas.crm._2007.webservices.Calendarrule[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "calendarrule" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Calendarrule getCalendarruleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Calendarrule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Calendarrule)get_store().find_element_user(CALENDARRULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "calendarrule" element
     */
    public int sizeOfCalendarruleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALENDARRULE$0);
        }
    }
    
    /**
     * Sets array of all "calendarrule" element
     */
    public void setCalendarruleArray(com.microsoft.schemas.crm._2007.webservices.Calendarrule[] calendarruleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(calendarruleArray, CALENDARRULE$0);
        }
    }
    
    /**
     * Sets ith "calendarrule" element
     */
    public void setCalendarruleArray(int i, com.microsoft.schemas.crm._2007.webservices.Calendarrule calendarrule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Calendarrule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Calendarrule)get_store().find_element_user(CALENDARRULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(calendarrule);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "calendarrule" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Calendarrule insertNewCalendarrule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Calendarrule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Calendarrule)get_store().insert_element_user(CALENDARRULE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "calendarrule" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Calendarrule addNewCalendarrule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Calendarrule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Calendarrule)get_store().add_element_user(CALENDARRULE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "calendarrule" element
     */
    public void removeCalendarrule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALENDARRULE$0, i);
        }
    }
}
