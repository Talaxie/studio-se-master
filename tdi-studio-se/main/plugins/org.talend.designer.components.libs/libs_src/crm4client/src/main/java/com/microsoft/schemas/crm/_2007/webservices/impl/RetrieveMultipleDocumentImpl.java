/*
 * An XML document type.
 * Localname: RetrieveMultiple
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one RetrieveMultiple(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class RetrieveMultipleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument
{
    
    public RetrieveMultipleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEMULTIPLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RetrieveMultiple");
    
    
    /**
     * Gets the "RetrieveMultiple" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple getRetrieveMultiple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple)get_store().find_element_user(RETRIEVEMULTIPLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveMultiple" element
     */
    public void setRetrieveMultiple(com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple retrieveMultiple)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple)get_store().find_element_user(RETRIEVEMULTIPLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple)get_store().add_element_user(RETRIEVEMULTIPLE$0);
            }
            target.set(retrieveMultiple);
        }
    }
    
    /**
     * Appends and returns a new empty "RetrieveMultiple" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple addNewRetrieveMultiple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple)get_store().add_element_user(RETRIEVEMULTIPLE$0);
            return target;
        }
    }
    /**
     * An XML RetrieveMultiple(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class RetrieveMultipleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleDocument.RetrieveMultiple
    {
        
        public RetrieveMultipleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERY$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "query");
        
        
        /**
         * Gets the "query" element
         */
        public com.microsoft.schemas.crm._2006.query.QueryBase getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.query.QueryBase target = null;
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "query" element
         */
        public boolean isSetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERY$0) != 0;
            }
        }
        
        /**
         * Sets the "query" element
         */
        public void setQuery(com.microsoft.schemas.crm._2006.query.QueryBase query)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.query.QueryBase target = null;
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$0);
                }
                target.set(query);
            }
        }
        
        /**
         * Appends and returns a new empty "query" element
         */
        public com.microsoft.schemas.crm._2006.query.QueryBase addNewQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.query.QueryBase target = null;
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$0);
                return target;
            }
        }
        
        /**
         * Unsets the "query" element
         */
        public void unsetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERY$0, 0);
            }
        }
    }
}
