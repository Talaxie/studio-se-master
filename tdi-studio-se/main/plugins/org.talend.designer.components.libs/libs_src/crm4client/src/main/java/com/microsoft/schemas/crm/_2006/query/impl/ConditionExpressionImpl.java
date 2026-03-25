/*
 * XML Type:  ConditionExpression
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.ConditionExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML ConditionExpression(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class ConditionExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.query.ConditionExpression
{
    
    public ConditionExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTENAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "AttributeName");
    private static final javax.xml.namespace.QName OPERATOR$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Operator");
    private static final javax.xml.namespace.QName VALUES$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Values");
    
    
    /**
     * Gets the "AttributeName" element
     */
    public java.lang.String getAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AttributeName" element
     */
    public boolean isSetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTENAME$0) != 0;
        }
    }
    
    /**
     * Sets the "AttributeName" element
     */
    public void setAttributeName(java.lang.String attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTENAME$0);
            }
            target.setStringValue(attributeName);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeName" element
     */
    public void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTENAME$0);
            }
            target.set(attributeName);
        }
    }
    
    /**
     * Unsets the "AttributeName" element
     */
    public void unsetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTENAME$0, 0);
        }
    }
    
    /**
     * Gets the "Operator" element
     */
    public com.microsoft.schemas.crm._2006.query.ConditionOperator.Enum getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.query.ConditionOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Operator" element
     */
    public com.microsoft.schemas.crm._2006.query.ConditionOperator xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ConditionOperator target = null;
            target = (com.microsoft.schemas.crm._2006.query.ConditionOperator)get_store().find_element_user(OPERATOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Operator" element
     */
    public void setOperator(com.microsoft.schemas.crm._2006.query.ConditionOperator.Enum operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATOR$2);
            }
            target.setEnumValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "Operator" element
     */
    public void xsetOperator(com.microsoft.schemas.crm._2006.query.ConditionOperator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ConditionOperator target = null;
            target = (com.microsoft.schemas.crm._2006.query.ConditionOperator)get_store().find_element_user(OPERATOR$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ConditionOperator)get_store().add_element_user(OPERATOR$2);
            }
            target.set(operator);
        }
    }
    
    /**
     * Gets the "Values" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfAnyType getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfAnyType target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfAnyType)get_store().find_element_user(VALUES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Values" element
     */
    public boolean isSetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUES$4) != 0;
        }
    }
    
    /**
     * Sets the "Values" element
     */
    public void setValues(com.microsoft.schemas.crm._2006.query.ArrayOfAnyType values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfAnyType target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfAnyType)get_store().find_element_user(VALUES$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfAnyType)get_store().add_element_user(VALUES$4);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "Values" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfAnyType addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfAnyType target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfAnyType)get_store().add_element_user(VALUES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Values" element
     */
    public void unsetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUES$4, 0);
        }
    }
}
