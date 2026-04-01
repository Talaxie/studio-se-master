/*
 * An XML document type.
 * Localname: QueryBase
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.QueryBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one QueryBase(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class QueryBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.QueryBaseDocument
{
    
    public QueryBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYBASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QueryBase");
    
    
    /**
     * Gets the "QueryBase" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase getQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "QueryBase" element
     */
    public boolean isNilQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYBASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "QueryBase" element
     */
    public void setQueryBase(com.microsoft.schemas.crm._2006.query.QueryBase queryBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYBASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERYBASE$0);
            }
            target.set(queryBase);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryBase" element
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
     * Nils the "QueryBase" element
     */
    public void setNilQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERYBASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERYBASE$0);
            }
            target.setNil();
        }
    }
}
