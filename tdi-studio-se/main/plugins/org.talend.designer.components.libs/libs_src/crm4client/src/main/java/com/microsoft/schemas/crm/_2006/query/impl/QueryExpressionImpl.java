/*
 * XML Type:  QueryExpression
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.QueryExpression
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML QueryExpression(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class QueryExpressionImpl extends com.microsoft.schemas.crm._2006.query.impl.QueryBaseImpl implements com.microsoft.schemas.crm._2006.query.QueryExpression
{
    
    public QueryExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTINCT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Distinct");
    private static final javax.xml.namespace.QName PAGEINFO$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "PageInfo");
    private static final javax.xml.namespace.QName LINKENTITIES$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "LinkEntities");
    private static final javax.xml.namespace.QName CRITERIA$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Criteria");
    private static final javax.xml.namespace.QName ORDERS$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Orders");
    
    
    /**
     * Gets the "Distinct" element
     */
    public boolean getDistinct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTINCT$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Distinct" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDistinct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISTINCT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Distinct" element
     */
    public void setDistinct(boolean distinct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTINCT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTINCT$0);
            }
            target.setBooleanValue(distinct);
        }
    }
    
    /**
     * Sets (as xml) the "Distinct" element
     */
    public void xsetDistinct(org.apache.xmlbeans.XmlBoolean distinct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISTINCT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DISTINCT$0);
            }
            target.set(distinct);
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
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGEINFO$2, 0);
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
            return get_store().count_elements(PAGEINFO$2) != 0;
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
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGEINFO$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGEINFO$2);
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
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGEINFO$2);
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
            get_store().remove_element(PAGEINFO$2, 0);
        }
    }
    
    /**
     * Gets the "LinkEntities" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity getLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LinkEntities" element
     */
    public boolean isSetLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKENTITIES$4) != 0;
        }
    }
    
    /**
     * Sets the "LinkEntities" element
     */
    public void setLinkEntities(com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity linkEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity)get_store().add_element_user(LINKENTITIES$4);
            }
            target.set(linkEntities);
        }
    }
    
    /**
     * Appends and returns a new empty "LinkEntities" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity addNewLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity)get_store().add_element_user(LINKENTITIES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LinkEntities" element
     */
    public void unsetLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKENTITIES$4, 0);
        }
    }
    
    /**
     * Gets the "Criteria" element
     */
    public com.microsoft.schemas.crm._2006.query.FilterExpression getCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().find_element_user(CRITERIA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Criteria" element
     */
    public boolean isSetCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CRITERIA$6) != 0;
        }
    }
    
    /**
     * Sets the "Criteria" element
     */
    public void setCriteria(com.microsoft.schemas.crm._2006.query.FilterExpression criteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().find_element_user(CRITERIA$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().add_element_user(CRITERIA$6);
            }
            target.set(criteria);
        }
    }
    
    /**
     * Appends and returns a new empty "Criteria" element
     */
    public com.microsoft.schemas.crm._2006.query.FilterExpression addNewCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().add_element_user(CRITERIA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Criteria" element
     */
    public void unsetCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CRITERIA$6, 0);
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
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$8, 0);
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
            return get_store().count_elements(ORDERS$8) != 0;
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
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression)get_store().find_element_user(ORDERS$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression)get_store().add_element_user(ORDERS$8);
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
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfOrderExpression)get_store().add_element_user(ORDERS$8);
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
            get_store().remove_element(ORDERS$8, 0);
        }
    }
}
