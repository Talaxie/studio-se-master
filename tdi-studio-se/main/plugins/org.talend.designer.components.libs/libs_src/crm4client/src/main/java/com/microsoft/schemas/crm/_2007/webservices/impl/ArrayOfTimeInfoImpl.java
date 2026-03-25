/*
 * XML Type:  ArrayOfTimeInfo
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfTimeInfo(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfTimeInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo
{
    
    public ArrayOfTimeInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TimeInfo");
    
    
    /**
     * Gets array of all "TimeInfo" elements
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeInfo[] getTimeInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMEINFO$0, targetList);
            com.microsoft.schemas.crm._2006.scheduling.TimeInfo[] result = new com.microsoft.schemas.crm._2006.scheduling.TimeInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TimeInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeInfo getTimeInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeInfo)get_store().find_element_user(TIMEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "TimeInfo" element
     */
    public boolean isNilTimeInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeInfo)get_store().find_element_user(TIMEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "TimeInfo" element
     */
    public int sizeOfTimeInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEINFO$0);
        }
    }
    
    /**
     * Sets array of all "TimeInfo" element
     */
    public void setTimeInfoArray(com.microsoft.schemas.crm._2006.scheduling.TimeInfo[] timeInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeInfoArray, TIMEINFO$0);
        }
    }
    
    /**
     * Sets ith "TimeInfo" element
     */
    public void setTimeInfoArray(int i, com.microsoft.schemas.crm._2006.scheduling.TimeInfo timeInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeInfo)get_store().find_element_user(TIMEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timeInfo);
        }
    }
    
    /**
     * Nils the ith "TimeInfo" element
     */
    public void setNilTimeInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeInfo)get_store().find_element_user(TIMEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeInfo insertNewTimeInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeInfo)get_store().insert_element_user(TIMEINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeInfo addNewTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeInfo)get_store().add_element_user(TIMEINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TimeInfo" element
     */
    public void removeTimeInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEINFO$0, i);
        }
    }
}
