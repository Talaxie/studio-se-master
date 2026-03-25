/*
 * XML Type:  ArrayOfLocLabel
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfLocLabel(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfLocLabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel
{
    
    public ArrayOfLocLabelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCLABEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "LocLabel");
    
    
    /**
     * Gets array of all "LocLabel" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.LocLabel[] getLocLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCLABEL$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.LocLabel[] result = new com.microsoft.schemas.crm._2007.webservices.LocLabel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocLabel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LocLabel getLocLabelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().find_element_user(LOCLABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocLabel" element
     */
    public boolean isNilLocLabelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().find_element_user(LOCLABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocLabel" element
     */
    public int sizeOfLocLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCLABEL$0);
        }
    }
    
    /**
     * Sets array of all "LocLabel" element
     */
    public void setLocLabelArray(com.microsoft.schemas.crm._2007.webservices.LocLabel[] locLabelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locLabelArray, LOCLABEL$0);
        }
    }
    
    /**
     * Sets ith "LocLabel" element
     */
    public void setLocLabelArray(int i, com.microsoft.schemas.crm._2007.webservices.LocLabel locLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().find_element_user(LOCLABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locLabel);
        }
    }
    
    /**
     * Nils the ith "LocLabel" element
     */
    public void setNilLocLabelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().find_element_user(LOCLABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocLabel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LocLabel insertNewLocLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().insert_element_user(LOCLABEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocLabel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LocLabel addNewLocLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().add_element_user(LOCLABEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocLabel" element
     */
    public void removeLocLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCLABEL$0, i);
        }
    }
}
