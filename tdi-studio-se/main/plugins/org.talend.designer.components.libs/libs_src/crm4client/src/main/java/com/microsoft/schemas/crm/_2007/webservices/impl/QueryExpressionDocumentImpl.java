/*
 * An XML document type.
 * Localname: QueryExpression
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.QueryExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one QueryExpression(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class QueryExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.QueryExpressionDocument
{
    
    public QueryExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QueryExpression");
    
    
    /**
     * Gets the "QueryExpression" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryExpression getQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QueryExpression" element
     */
    public boolean isNilQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "QueryExpression" element
     */
    public void setQueryExpression(com.microsoft.schemas.crm._2006.query.QueryExpression queryExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.QueryExpression)get_store().add_element_user(QUERYEXPRESSION$0);
            }
            target.set(queryExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryExpression" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryExpression addNewQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryExpression)get_store().add_element_user(QUERYEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Nils the "QueryExpression" element
     */
    public void setNilQueryExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryExpression)get_store().find_element_user(QUERYEXPRESSION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.QueryExpression)get_store().add_element_user(QUERYEXPRESSION$0);
            }
            target.setNil();
        }
    }
}
