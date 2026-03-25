/*
 * XML Type:  ArrayOfTimeCode
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfTimeCode(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfTimeCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode
{
    
    public ArrayOfTimeCodeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TimeCode");
    
    
    /**
     * Gets array of all "TimeCode" elements
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum[] getTimeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMECODE$0, targetList);
            com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum[] result = new com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "TimeCode" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum getTimeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "TimeCode" elements
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeCode[] xgetTimeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMECODE$0, targetList);
            com.microsoft.schemas.crm._2006.scheduling.TimeCode[] result = new com.microsoft.schemas.crm._2006.scheduling.TimeCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "TimeCode" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeCode xgetTimeCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeCode)get_store().find_element_user(TIMECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.schemas.crm._2006.scheduling.TimeCode)target;
        }
    }
    
    /**
     * Returns number of "TimeCode" element
     */
    public int sizeOfTimeCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMECODE$0);
        }
    }
    
    /**
     * Sets array of all "TimeCode" element
     */
    public void setTimeCodeArray(com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum[] timeCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeCodeArray, TIMECODE$0);
        }
    }
    
    /**
     * Sets ith "TimeCode" element
     */
    public void setTimeCodeArray(int i, com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum timeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(timeCode);
        }
    }
    
    /**
     * Sets (as xml) array of all "TimeCode" element
     */
    public void xsetTimeCodeArray(com.microsoft.schemas.crm._2006.scheduling.TimeCode[]timeCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeCodeArray, TIMECODE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "TimeCode" element
     */
    public void xsetTimeCodeArray(int i, com.microsoft.schemas.crm._2006.scheduling.TimeCode timeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeCode)get_store().find_element_user(TIMECODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timeCode);
        }
    }
    
    /**
     * Inserts the value as the ith "TimeCode" element
     */
    public void insertTimeCode(int i, com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum timeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TIMECODE$0, i);
            target.setEnumValue(timeCode);
        }
    }
    
    /**
     * Appends the value as the last "TimeCode" element
     */
    public void addTimeCode(com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum timeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMECODE$0);
            target.setEnumValue(timeCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeCode" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeCode insertNewTimeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeCode)get_store().insert_element_user(TIMECODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeCode" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeCode addNewTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeCode)get_store().add_element_user(TIMECODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TimeCode" element
     */
    public void removeTimeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMECODE$0, i);
        }
    }
}
