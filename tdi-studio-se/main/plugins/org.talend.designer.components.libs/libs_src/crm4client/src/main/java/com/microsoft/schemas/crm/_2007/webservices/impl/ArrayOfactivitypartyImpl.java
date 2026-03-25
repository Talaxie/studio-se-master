/*
 * XML Type:  ArrayOfactivityparty
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfactivityparty(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfactivitypartyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty
{
    
    public ArrayOfactivitypartyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYPARTY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "activityparty");
    
    
    /**
     * Gets array of all "activityparty" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.Activityparty[] getActivitypartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYPARTY$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.Activityparty[] result = new com.microsoft.schemas.crm._2007.webservices.Activityparty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "activityparty" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Activityparty getActivitypartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Activityparty target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Activityparty)get_store().find_element_user(ACTIVITYPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activityparty" element
     */
    public int sizeOfActivitypartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYPARTY$0);
        }
    }
    
    /**
     * Sets array of all "activityparty" element
     */
    public void setActivitypartyArray(com.microsoft.schemas.crm._2007.webservices.Activityparty[] activitypartyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activitypartyArray, ACTIVITYPARTY$0);
        }
    }
    
    /**
     * Sets ith "activityparty" element
     */
    public void setActivitypartyArray(int i, com.microsoft.schemas.crm._2007.webservices.Activityparty activityparty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Activityparty target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Activityparty)get_store().find_element_user(ACTIVITYPARTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityparty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activityparty" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Activityparty insertNewActivityparty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Activityparty target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Activityparty)get_store().insert_element_user(ACTIVITYPARTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activityparty" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Activityparty addNewActivityparty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Activityparty target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Activityparty)get_store().add_element_user(ACTIVITYPARTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "activityparty" element
     */
    public void removeActivityparty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYPARTY$0, i);
        }
    }
}
