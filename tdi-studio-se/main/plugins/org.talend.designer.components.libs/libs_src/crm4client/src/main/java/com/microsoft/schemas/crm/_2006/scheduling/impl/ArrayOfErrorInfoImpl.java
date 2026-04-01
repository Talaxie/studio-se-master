/*
 * XML Type:  ArrayOfErrorInfo
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML ArrayOfErrorInfo(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class ArrayOfErrorInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo
{
    
    public ArrayOfErrorInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ErrorInfo");
    
    
    /**
     * Gets array of all "ErrorInfo" elements
     */
    public com.microsoft.schemas.crm._2006.scheduling.ErrorInfo[] getErrorInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERRORINFO$0, targetList);
            com.microsoft.schemas.crm._2006.scheduling.ErrorInfo[] result = new com.microsoft.schemas.crm._2006.scheduling.ErrorInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ErrorInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ErrorInfo getErrorInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ErrorInfo)get_store().find_element_user(ERRORINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ErrorInfo" element
     */
    public boolean isNilErrorInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ErrorInfo)get_store().find_element_user(ERRORINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ErrorInfo" element
     */
    public int sizeOfErrorInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORINFO$0);
        }
    }
    
    /**
     * Sets array of all "ErrorInfo" element
     */
    public void setErrorInfoArray(com.microsoft.schemas.crm._2006.scheduling.ErrorInfo[] errorInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorInfoArray, ERRORINFO$0);
        }
    }
    
    /**
     * Sets ith "ErrorInfo" element
     */
    public void setErrorInfoArray(int i, com.microsoft.schemas.crm._2006.scheduling.ErrorInfo errorInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ErrorInfo)get_store().find_element_user(ERRORINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(errorInfo);
        }
    }
    
    /**
     * Nils the ith "ErrorInfo" element
     */
    public void setNilErrorInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ErrorInfo)get_store().find_element_user(ERRORINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ErrorInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ErrorInfo insertNewErrorInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ErrorInfo)get_store().insert_element_user(ERRORINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ErrorInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ErrorInfo addNewErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ErrorInfo)get_store().add_element_user(ERRORINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ErrorInfo" element
     */
    public void removeErrorInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORINFO$0, i);
        }
    }
}
