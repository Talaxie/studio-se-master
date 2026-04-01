/*
 * XML Type:  ArrayOfInt
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfInt
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfInt(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfIntImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfInt
{
    
    public ArrayOfIntImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "int");
    
    
    /**
     * Gets array of all "int" elements
     */
    public int[] getIntArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INT$0, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "int" element
     */
    public int getIntArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "int" elements
     */
    public org.apache.xmlbeans.XmlInt[] xgetIntArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INT$0, targetList);
            org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "int" element
     */
    public org.apache.xmlbeans.XmlInt xgetIntArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInt)target;
        }
    }
    
    /**
     * Returns number of "int" element
     */
    public int sizeOfIntArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INT$0);
        }
    }
    
    /**
     * Sets array of all "int" element
     */
    public void setIntArray(int[] xintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xintArray, INT$0);
        }
    }
    
    /**
     * Sets ith "int" element
     */
    public void setIntArray(int i, int xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(xint);
        }
    }
    
    /**
     * Sets (as xml) array of all "int" element
     */
    public void xsetIntArray(org.apache.xmlbeans.XmlInt[]xintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xintArray, INT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "int" element
     */
    public void xsetIntArray(int i, org.apache.xmlbeans.XmlInt xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xint);
        }
    }
    
    /**
     * Inserts the value as the ith "int" element
     */
    public void insertInt(int i, int xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INT$0, i);
            target.setIntValue(xint);
        }
    }
    
    /**
     * Appends the value as the last "int" element
     */
    public void addInt(int xint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INT$0);
            target.setIntValue(xint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "int" element
     */
    public org.apache.xmlbeans.XmlInt insertNewInt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(INT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "int" element
     */
    public org.apache.xmlbeans.XmlInt addNewInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "int" element
     */
    public void removeInt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INT$0, i);
        }
    }
}
