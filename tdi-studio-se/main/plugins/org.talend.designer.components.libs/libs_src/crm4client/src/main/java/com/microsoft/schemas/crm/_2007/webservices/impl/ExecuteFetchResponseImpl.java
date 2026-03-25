/*
 * XML Type:  ExecuteFetchResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ExecuteFetchResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ExecuteFetchResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ExecuteFetchResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.ExecuteFetchResponse
{
    
    public ExecuteFetchResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FETCHXMLRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FetchXmlResult");
    
    
    /**
     * Gets the "FetchXmlResult" element
     */
    public java.lang.String getFetchXmlResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHXMLRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FetchXmlResult" element
     */
    public org.apache.xmlbeans.XmlString xgetFetchXmlResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHXMLRESULT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FetchXmlResult" element
     */
    public void setFetchXmlResult(java.lang.String fetchXmlResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHXMLRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FETCHXMLRESULT$0);
            }
            target.setStringValue(fetchXmlResult);
        }
    }
    
    /**
     * Sets (as xml) the "FetchXmlResult" element
     */
    public void xsetFetchXmlResult(org.apache.xmlbeans.XmlString fetchXmlResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHXMLRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FETCHXMLRESULT$0);
            }
            target.set(fetchXmlResult);
        }
    }
}
