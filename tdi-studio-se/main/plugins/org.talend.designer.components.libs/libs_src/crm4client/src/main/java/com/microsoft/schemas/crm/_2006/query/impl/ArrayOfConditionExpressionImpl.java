/*
 * XML Type:  ArrayOfConditionExpression
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML ArrayOfConditionExpression(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class ArrayOfConditionExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression
{
    
    public ArrayOfConditionExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Condition");
    
    
    /**
     * Gets array of all "Condition" elements
     */
    public com.microsoft.schemas.crm._2006.query.ConditionExpression[] getConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDITION$0, targetList);
            com.microsoft.schemas.crm._2006.query.ConditionExpression[] result = new com.microsoft.schemas.crm._2006.query.ConditionExpression[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Condition" element
     */
    public com.microsoft.schemas.crm._2006.query.ConditionExpression getConditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ConditionExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ConditionExpression)get_store().find_element_user(CONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Condition" element
     */
    public int sizeOfConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITION$0);
        }
    }
    
    /**
     * Sets array of all "Condition" element
     */
    public void setConditionArray(com.microsoft.schemas.crm._2006.query.ConditionExpression[] conditionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conditionArray, CONDITION$0);
        }
    }
    
    /**
     * Sets ith "Condition" element
     */
    public void setConditionArray(int i, com.microsoft.schemas.crm._2006.query.ConditionExpression condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ConditionExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ConditionExpression)get_store().find_element_user(CONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(condition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Condition" element
     */
    public com.microsoft.schemas.crm._2006.query.ConditionExpression insertNewCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ConditionExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ConditionExpression)get_store().insert_element_user(CONDITION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Condition" element
     */
    public com.microsoft.schemas.crm._2006.query.ConditionExpression addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ConditionExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ConditionExpression)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Condition" element
     */
    public void removeCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITION$0, i);
        }
    }
}
