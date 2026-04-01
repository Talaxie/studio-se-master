/*
 * XML Type:  ValidateSavedQueryRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ValidateSavedQueryRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ValidateSavedQueryRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ValidateSavedQueryRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ValidateSavedQueryRequest
{
    
    public ValidateSavedQueryRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FETCHXML$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FetchXml");
    private static final javax.xml.namespace.QName QUERYTYPE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QueryType");
    
    
    /**
     * Gets the "FetchXml" element
     */
    public java.lang.String getFetchXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FetchXml" element
     */
    public org.apache.xmlbeans.XmlString xgetFetchXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHXML$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FetchXml" element
     */
    public void setFetchXml(java.lang.String fetchXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FETCHXML$0);
            }
            target.setStringValue(fetchXml);
        }
    }
    
    /**
     * Sets (as xml) the "FetchXml" element
     */
    public void xsetFetchXml(org.apache.xmlbeans.XmlString fetchXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FETCHXML$0);
            }
            target.set(fetchXml);
        }
    }
    
    /**
     * Gets the "QueryType" element
     */
    public int getQueryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTYPE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueryType" element
     */
    public org.apache.xmlbeans.XmlInt xgetQueryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUERYTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QueryType" element
     */
    public void setQueryType(int queryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYTYPE$2);
            }
            target.setIntValue(queryType);
        }
    }
    
    /**
     * Sets (as xml) the "QueryType" element
     */
    public void xsetQueryType(org.apache.xmlbeans.XmlInt queryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUERYTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUERYTYPE$2);
            }
            target.set(queryType);
        }
    }
}
