/*
 * XML Type:  ArrayOfArrayOfString
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfArrayOfString(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfStringImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString
{
    
    public ArrayOfArrayOfStringImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfString");
    
    
    /**
     * Gets array of all "ArrayOfString" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString[] getArrayOfStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARRAYOFSTRING$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString[] result = new com.microsoft.schemas.crm._2007.webservices.ArrayOfString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ArrayOfString" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString getArrayOfStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ARRAYOFSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ArrayOfString" element
     */
    public boolean isNilArrayOfStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ARRAYOFSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ArrayOfString" element
     */
    public int sizeOfArrayOfStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARRAYOFSTRING$0);
        }
    }
    
    /**
     * Sets array of all "ArrayOfString" element
     */
    public void setArrayOfStringArray(com.microsoft.schemas.crm._2007.webservices.ArrayOfString[] arrayOfStringArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arrayOfStringArray, ARRAYOFSTRING$0);
        }
    }
    
    /**
     * Sets ith "ArrayOfString" element
     */
    public void setArrayOfStringArray(int i, com.microsoft.schemas.crm._2007.webservices.ArrayOfString arrayOfString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ARRAYOFSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arrayOfString);
        }
    }
    
    /**
     * Nils the ith "ArrayOfString" element
     */
    public void setNilArrayOfStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ARRAYOFSTRING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ArrayOfString" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString insertNewArrayOfString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().insert_element_user(ARRAYOFSTRING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ArrayOfString" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString addNewArrayOfString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(ARRAYOFSTRING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ArrayOfString" element
     */
    public void removeArrayOfString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARRAYOFSTRING$0, i);
        }
    }
}
