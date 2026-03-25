/*
 * XML Type:  FilterExpression
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.FilterExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML FilterExpression(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class FilterExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.query.FilterExpression
{
    
    public FilterExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTEROPERATOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "FilterOperator");
    private static final javax.xml.namespace.QName CONDITIONS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Conditions");
    private static final javax.xml.namespace.QName FILTERS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Filters");
    
    
    /**
     * Gets the "FilterOperator" element
     */
    public com.microsoft.schemas.crm._2006.query.LogicalOperator.Enum getFilterOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTEROPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.query.LogicalOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FilterOperator" element
     */
    public com.microsoft.schemas.crm._2006.query.LogicalOperator xgetFilterOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.LogicalOperator target = null;
            target = (com.microsoft.schemas.crm._2006.query.LogicalOperator)get_store().find_element_user(FILTEROPERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FilterOperator" element
     */
    public void setFilterOperator(com.microsoft.schemas.crm._2006.query.LogicalOperator.Enum filterOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTEROPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILTEROPERATOR$0);
            }
            target.setEnumValue(filterOperator);
        }
    }
    
    /**
     * Sets (as xml) the "FilterOperator" element
     */
    public void xsetFilterOperator(com.microsoft.schemas.crm._2006.query.LogicalOperator filterOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.LogicalOperator target = null;
            target = (com.microsoft.schemas.crm._2006.query.LogicalOperator)get_store().find_element_user(FILTEROPERATOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.LogicalOperator)get_store().add_element_user(FILTEROPERATOR$0);
            }
            target.set(filterOperator);
        }
    }
    
    /**
     * Gets the "Conditions" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression getConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression)get_store().find_element_user(CONDITIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Conditions" element
     */
    public boolean isSetConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "Conditions" element
     */
    public void setConditions(com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression conditions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression)get_store().find_element_user(CONDITIONS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression)get_store().add_element_user(CONDITIONS$2);
            }
            target.set(conditions);
        }
    }
    
    /**
     * Appends and returns a new empty "Conditions" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression addNewConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfConditionExpression)get_store().add_element_user(CONDITIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Conditions" element
     */
    public void unsetConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONS$2, 0);
        }
    }
    
    /**
     * Gets the "Filters" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression getFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression)get_store().find_element_user(FILTERS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Filters" element
     */
    public boolean isSetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERS$4) != 0;
        }
    }
    
    /**
     * Sets the "Filters" element
     */
    public void setFilters(com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression filters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression)get_store().find_element_user(FILTERS$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression)get_store().add_element_user(FILTERS$4);
            }
            target.set(filters);
        }
    }
    
    /**
     * Appends and returns a new empty "Filters" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression addNewFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfFilterExpression)get_store().add_element_user(FILTERS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Filters" element
     */
    public void unsetFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERS$4, 0);
        }
    }
}
