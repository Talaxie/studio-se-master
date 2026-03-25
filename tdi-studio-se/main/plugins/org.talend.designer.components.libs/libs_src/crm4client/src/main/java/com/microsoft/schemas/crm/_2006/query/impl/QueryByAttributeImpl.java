/*
 * XML Type:  QueryByAttribute
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.QueryByAttribute
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML QueryByAttribute(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class QueryByAttributeImpl extends com.microsoft.schemas.crm._2006.query.impl.QueryBaseImpl implements com.microsoft.schemas.crm._2006.query.QueryByAttribute
{
    
    public QueryByAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Attributes");
    private static final javax.xml.namespace.QName VALUES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Values");
    private static final javax.xml.namespace.QName PAGEINFO$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "PageInfo");
    private static final javax.xml.namespace.QName ORDERS$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Orders");
    
    
    /**
     * Gets the "Attributes" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfString getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfString)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$0) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(com.microsoft.schemas.crm._2006.query.ArrayOfString attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfString)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfString)get_store().add_element_user(ATTRIBUTES$0);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfString addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfString)get_store().add_element_user(ATTRIBUTES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$0, 0);
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
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfAnyType)get_store().find_element_user(VALUES$2, 0);
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
            return get_store().count_elements(VALUES$2) != 0;
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
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfAnyType)get_store().find_element_user(VALUES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfAnyType)get_store().add_element_user(VALUES$2);
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
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfAnyType)get_store().add_element_user(VALUES$2);
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
            get_store().remove_element(VALUES$2, 0);
        }
    }
    
    /**
     * Gets the "PageInfo" element
     */
    public com.microsoft.schemas.crm._2006.query.PagingInfo getPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.PagingInfo target = null;
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGEINFO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PageInfo" element
     */
    public boolean isSetPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGEINFO$4) != 0;
        }
    }
    
    /**
     * Sets the "PageInfo" element
     */
    public void setPageInfo(com.microsoft.schemas.crm._2006.query.PagingInfo pageInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.PagingInfo target = null;
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGEINFO$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGEINFO$4);
            }
            target.set(pageInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "PageInfo" element
     */
    public com.microsoft.schemas.crm._2006.query.PagingInfo addNewPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.PagingInfo target = null;
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGEINFO$4);
            return target;
        }
    }
    
    /**
     * Unsets the "PageInfo" element
     */
    public void unsetPageInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGEINFO$4, 0);
        }
    }
    
    /**
     * Gets the "Orders" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression getOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Orders" element
     */
    public boolean isSetOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERS$6) != 0;
        }
    }
    
    /**
     * Sets the "Orders" element
     */
    public void setOrders(com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression orders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression)get_store().add_element_user(ORDERS$6);
            }
            target.set(orders);
        }
    }
    
    /**
     * Appends and returns a new empty "Orders" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression addNewOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression)get_store().add_element_user(ORDERS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Orders" element
     */
    public void unsetOrders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERS$6, 0);
        }
    }
}
