/*
 * An XML document type.
 * Localname: RetrieveMultipleResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one RetrieveMultipleResponse(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class RetrieveMultipleResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument
{
    
    public RetrieveMultipleResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVEMULTIPLERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RetrieveMultipleResponse");
    
    
    /**
     * Gets the "RetrieveMultipleResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse getRetrieveMultipleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse)get_store().find_element_user(RETRIEVEMULTIPLERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RetrieveMultipleResponse" element
     */
    public void setRetrieveMultipleResponse(com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse retrieveMultipleResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse)get_store().find_element_user(RETRIEVEMULTIPLERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse)get_store().add_element_user(RETRIEVEMULTIPLERESPONSE$0);
            }
            target.set(retrieveMultipleResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RetrieveMultipleResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse addNewRetrieveMultipleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse)get_store().add_element_user(RETRIEVEMULTIPLERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RetrieveMultipleResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class RetrieveMultipleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveMultipleResponseDocument.RetrieveMultipleResponse
    {
        
        public RetrieveMultipleResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETRIEVEMULTIPLERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RetrieveMultipleResult");
        
        
        /**
         * Gets the "RetrieveMultipleResult" element
         */
        public com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection getRetrieveMultipleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().find_element_user(RETRIEVEMULTIPLERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RetrieveMultipleResult" element
         */
        public void setRetrieveMultipleResult(com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection retrieveMultipleResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().find_element_user(RETRIEVEMULTIPLERESULT$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().add_element_user(RETRIEVEMULTIPLERESULT$0);
                }
                target.set(retrieveMultipleResult);
            }
        }
        
        /**
         * Appends and returns a new empty "RetrieveMultipleResult" element
         */
        public com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection addNewRetrieveMultipleResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().add_element_user(RETRIEVEMULTIPLERESULT$0);
                return target;
            }
        }
    }
}
