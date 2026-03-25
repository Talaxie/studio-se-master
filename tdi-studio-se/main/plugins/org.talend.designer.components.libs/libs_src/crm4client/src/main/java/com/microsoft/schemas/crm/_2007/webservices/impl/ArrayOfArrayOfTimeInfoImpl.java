/*
 * XML Type:  ArrayOfArrayOfTimeInfo
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfArrayOfTimeInfo(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfTimeInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo
{
    
    public ArrayOfArrayOfTimeInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFTIMEINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfTimeInfo");
    
    
    /**
     * Gets array of all "ArrayOfTimeInfo" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo[] getArrayOfTimeInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFTIMEINFO$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo[] result = new com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfTimeInfo" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo getArrayOfTimeInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo)get_store().find_element_user(ARRAYOFTIMEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfTimeInfo" element
     */
    public boolean isNilArrayOfTimeInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo)get_store().find_element_user(ARRAYOFTIMEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfTimeInfo" element
     */
    public int sizeOfArrayOfTimeInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFTIMEINFO$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfTimeInfo" element
     */
    public void setArrayOfTimeInfoArray(com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo[] arrayOfTimeInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arrayOfTimeInfoArray, ARRAYOFTIMEINFO$0);
        }
    }
    
    /**
     * Sets ith "ArrayOfTimeInfo" element
     */
    public void setArrayOfTimeInfoArray(int i, com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo arrayOfTimeInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo)get_store().find_element_user(ARRAYOFTIMEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfTimeInfo);
        }
    }
    
    /**
     * Nils the ith "ArrayOfTimeInfo" element
     */
    public void setNilArrayOfTimeInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo)get_store().find_element_user(ARRAYOFTIMEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfTimeInfo" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo insertNewArrayOfTimeInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo)get_store().insert_element_user(ARRAYOFTIMEINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfTimeInfo" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo addNewArrayOfTimeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeInfo)get_store().add_element_user(ARRAYOFTIMEINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfTimeInfo" element
     */
    public void removeArrayOfTimeInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFTIMEINFO$0, i);
        }
    }
}
