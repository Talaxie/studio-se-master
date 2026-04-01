/*
 * XML Type:  ArrayOfBoolean
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfBoolean(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfBooleanImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean
{
    
    public ArrayOfBooleanImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEAN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "boolean");
    
    
    /**
     * Gets array of all "boolean" elements
     */
    public boolean[] getBooleanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOLEAN$0, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "boolean" element
     */
    public boolean getBooleanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEAN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "boolean" elements
     */
    public org.apache.xmlbeans.XmlBoolean[] xgetBooleanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOLEAN$0, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "boolean" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBooleanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEAN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlBoolean)target;
        }
    }
    
    /**
     * Returns number of "boolean" element
     */
    public int sizeOfBooleanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEAN$0);
        }
    }
    
    /**
     * Sets array of all "boolean" element
     */
    public void setBooleanArray(boolean[] xbooleanArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xbooleanArray, BOOLEAN$0);
        }
    }
    
    /**
     * Sets ith "boolean" element
     */
    public void setBooleanArray(int i, boolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEAN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(xboolean);
        }
    }
    
    /**
     * Sets (as xml) array of all "boolean" element
     */
    public void xsetBooleanArray(org.apache.xmlbeans.XmlBoolean[]xbooleanArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xbooleanArray, BOOLEAN$0);
        }
    }
    
    /**
     * Sets (as xml) ith "boolean" element
     */
    public void xsetBooleanArray(int i, org.apache.xmlbeans.XmlBoolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEAN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xboolean);
        }
    }
    
    /**
     * Inserts the value as the ith "boolean" element
     */
    public void insertBoolean(int i, boolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOOLEAN$0, i);
            target.setBooleanValue(xboolean);
        }
    }
    
    /**
     * Appends the value as the last "boolean" element
     */
    public void addBoolean(boolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEAN$0);
            target.setBooleanValue(xboolean);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "boolean" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewBoolean(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(BOOLEAN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "boolean" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEAN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "boolean" element
     */
    public void removeBoolean(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEAN$0, i);
        }
    }
}
