/*
 * XML Type:  ArrayOfOrderExpression
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML ArrayOfOrderExpression(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class ArrayOfOrderExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression
{
    
    public ArrayOfOrderExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Order");
    
    
    /**
     * Gets array of all "Order" elements
     */
    public com.microsoft.schemas.crm._2006.query.OrderExpression[] getOrderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDER$0, targetList);
            com.microsoft.schemas.crm._2006.query.OrderExpression[] result = new com.microsoft.schemas.crm._2006.query.OrderExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Order" element
     */
    public com.microsoft.schemas.crm._2006.query.OrderExpression getOrderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.OrderExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.OrderExpression)get_store().find_element_user(ORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Order" element
     */
    public int sizeOfOrderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDER$0);
        }
    }
    
    /**
     * Sets array of all "Order" element
     */
    public void setOrderArray(com.microsoft.schemas.crm._2006.query.OrderExpression[] orderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(orderArray, ORDER$0);
        }
    }
    
    /**
     * Sets ith "Order" element
     */
    public void setOrderArray(int i, com.microsoft.schemas.crm._2006.query.OrderExpression order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.OrderExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.OrderExpression)get_store().find_element_user(ORDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(order);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Order" element
     */
    public com.microsoft.schemas.crm._2006.query.OrderExpression insertNewOrder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.OrderExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.OrderExpression)get_store().insert_element_user(ORDER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Order" element
     */
    public com.microsoft.schemas.crm._2006.query.OrderExpression addNewOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.OrderExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.OrderExpression)get_store().add_element_user(ORDER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Order" element
     */
    public void removeOrder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDER$0, i);
        }
    }
}
