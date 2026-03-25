/*
 * XML Type:  FetchXmlToQueryExpressionRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.FetchXmlToQueryExpressionRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML FetchXmlToQueryExpressionRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class FetchXmlToQueryExpressionRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.FetchXmlToQueryExpressionRequest
{
    
    public FetchXmlToQueryExpressionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FETCHXML$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FetchXml");
    
    
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
}
