/*
 * XML Type:  ArrayOfFilterExpression
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML ArrayOfFilterExpression(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class ArrayOfFilterExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression
{
    
    public ArrayOfFilterExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Filter");
    
    
    /**
     * Gets array of all "Filter" elements
     */
    public com.microsoft.schemas.crm._2006.query.FilterExpression[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTER$0, targetList);
            com.microsoft.schemas.crm._2006.query.FilterExpression[] result = new com.microsoft.schemas.crm._2006.query.FilterExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Filter" element
     */
    public com.microsoft.schemas.crm._2006.query.FilterExpression getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Filter" element
     */
    public int sizeOfFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$0);
        }
    }
    
    /**
     * Sets array of all "Filter" element
     */
    public void setFilterArray(com.microsoft.schemas.crm._2006.query.FilterExpression[] filterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterArray, FILTER$0);
        }
    }
    
    /**
     * Sets ith "Filter" element
     */
    public void setFilterArray(int i, com.microsoft.schemas.crm._2006.query.FilterExpression filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Filter" element
     */
    public com.microsoft.schemas.crm._2006.query.FilterExpression insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().insert_element_user(FILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Filter" element
     */
    public com.microsoft.schemas.crm._2006.query.FilterExpression addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().add_element_user(FILTER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Filter" element
     */
    public void removeFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$0, i);
        }
    }
}
