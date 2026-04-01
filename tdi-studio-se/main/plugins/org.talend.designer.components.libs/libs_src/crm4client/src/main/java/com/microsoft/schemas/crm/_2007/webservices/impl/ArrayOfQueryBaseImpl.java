/*
 * XML Type:  ArrayOfQueryBase
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfQueryBase(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfQueryBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase
{
    
    public ArrayOfQueryBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYBASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QueryBase");
    
    
    /**
     * Gets array of all "QueryBase" elements
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase[] getQueryBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERYBASE$0, targetList);
            com.microsoft.schemas.crm._2006.query.QueryBase[] result = new com.microsoft.schemas.crm._2006.query.QueryBase[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QueryBase" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase getQueryBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYBASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "QueryBase" element
     */
    public boolean isNilQueryBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYBASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "QueryBase" element
     */
    public int sizeOfQueryBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYBASE$0);
        }
    }
    
    /**
     * Sets array of all "QueryBase" element
     */
    public void setQueryBaseArray(com.microsoft.schemas.crm._2006.query.QueryBase[] queryBaseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(queryBaseArray, QUERYBASE$0);
        }
    }
    
    /**
     * Sets ith "QueryBase" element
     */
    public void setQueryBaseArray(int i, com.microsoft.schemas.crm._2006.query.QueryBase queryBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYBASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(queryBase);
        }
    }
    
    /**
     * Nils the ith "QueryBase" element
     */
    public void setNilQueryBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYBASE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryBase" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase insertNewQueryBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().insert_element_user(QUERYBASE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueryBase" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase addNewQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERYBASE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "QueryBase" element
     */
    public void removeQueryBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYBASE$0, i);
        }
    }
}
