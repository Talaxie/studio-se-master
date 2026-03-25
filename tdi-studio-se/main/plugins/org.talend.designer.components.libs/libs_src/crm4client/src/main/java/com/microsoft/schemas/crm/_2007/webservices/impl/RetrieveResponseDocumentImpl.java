/*
 * An XML document type.
 * Localname: RetrieveResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one RetrieveResponse(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class RetrieveResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument
{
    
    public RetrieveResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RetrieveResponse");
    
    
    /**
     * Gets the "RetrieveResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse getRetrieveResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse)get_store().find_element_user(RETRIEVERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveResponse" element
     */
    public void setRetrieveResponse(com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse retrieveResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse)get_store().find_element_user(RETRIEVERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse)get_store().add_element_user(RETRIEVERESPONSE$0);
            }
            target.set(retrieveResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RetrieveResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse addNewRetrieveResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse)get_store().add_element_user(RETRIEVERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RetrieveResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class RetrieveResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveResponseDocument.RetrieveResponse
    {
        
        public RetrieveResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETRIEVERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RetrieveResult");
        
        
        /**
         * Gets the "RetrieveResult" element
         */
        public com.microsoft.schemas.crm._2006.webservices.BusinessEntity getRetrieveResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(RETRIEVERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RetrieveResult" element
         */
        public void setRetrieveResult(com.microsoft.schemas.crm._2006.webservices.BusinessEntity retrieveResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(RETRIEVERESULT$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(RETRIEVERESULT$0);
                }
                target.set(retrieveResult);
            }
        }
        
        /**
         * Appends and returns a new empty "RetrieveResult" element
         */
        public com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewRetrieveResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(RETRIEVERESULT$0);
                return target;
            }
        }
    }
}
