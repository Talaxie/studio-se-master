/*
 * An XML document type.
 * Localname: FetchResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one FetchResponse(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class FetchResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument
{
    
    public FetchResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FETCHRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FetchResponse");
    
    
    /**
     * Gets the "FetchResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse getFetchResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse)get_store().find_element_user(FETCHRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FetchResponse" element
     */
    public void setFetchResponse(com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse fetchResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse)get_store().find_element_user(FETCHRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse)get_store().add_element_user(FETCHRESPONSE$0);
            }
            target.set(fetchResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "FetchResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse addNewFetchResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse)get_store().add_element_user(FETCHRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML FetchResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class FetchResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.FetchResponseDocument.FetchResponse
    {
        
        public FetchResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FETCHRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FetchResult");
        
        
        /**
         * Gets the "FetchResult" element
         */
        public java.lang.String getFetchResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FetchResult" element
         */
        public org.apache.xmlbeans.XmlString xgetFetchResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "FetchResult" element
         */
        public boolean isSetFetchResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FETCHRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "FetchResult" element
         */
        public void setFetchResult(java.lang.String fetchResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FETCHRESULT$0);
                }
                target.setStringValue(fetchResult);
            }
        }
        
        /**
         * Sets (as xml) the "FetchResult" element
         */
        public void xsetFetchResult(org.apache.xmlbeans.XmlString fetchResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FETCHRESULT$0);
                }
                target.set(fetchResult);
            }
        }
        
        /**
         * Unsets the "FetchResult" element
         */
        public void unsetFetchResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FETCHRESULT$0, 0);
            }
        }
    }
}
