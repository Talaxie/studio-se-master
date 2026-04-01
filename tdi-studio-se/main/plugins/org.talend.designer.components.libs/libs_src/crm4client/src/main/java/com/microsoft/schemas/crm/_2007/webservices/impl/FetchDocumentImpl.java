/*
 * An XML document type.
 * Localname: Fetch
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.FetchDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one Fetch(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class FetchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.FetchDocument
{
    
    public FetchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FETCH$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Fetch");
    
    
    /**
     * Gets the "Fetch" element
     */
    public com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch getFetch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch)get_store().find_element_user(FETCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Fetch" element
     */
    public void setFetch(com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch fetch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch)get_store().find_element_user(FETCH$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch)get_store().add_element_user(FETCH$0);
            }
            target.set(fetch);
        }
    }
    
    /**
     * Appends and returns a new empty "Fetch" element
     */
    public com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch addNewFetch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch)get_store().add_element_user(FETCH$0);
            return target;
        }
    }
    /**
     * An XML Fetch(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class FetchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.FetchDocument.Fetch
    {
        
        public FetchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FETCHXML$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fetchXml");
        
        
        /**
         * Gets the "fetchXml" element
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
         * Gets (as xml) the "fetchXml" element
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
         * True if has "fetchXml" element
         */
        public boolean isSetFetchXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FETCHXML$0) != 0;
            }
        }
        
        /**
         * Sets the "fetchXml" element
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
         * Sets (as xml) the "fetchXml" element
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
         * Unsets the "fetchXml" element
         */
        public void unsetFetchXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FETCHXML$0, 0);
            }
        }
    }
}
