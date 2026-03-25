/*
 * An XML document type.
 * Localname: ExecuteResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ExecuteResponse(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ExecuteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument
{
    
    public ExecuteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ExecuteResponse");
    
    
    /**
     * Gets the "ExecuteResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse getExecuteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse)get_store().find_element_user(EXECUTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExecuteResponse" element
     */
    public void setExecuteResponse(com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse executeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse)get_store().find_element_user(EXECUTERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse)get_store().add_element_user(EXECUTERESPONSE$0);
            }
            target.set(executeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ExecuteResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse addNewExecuteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse)get_store().add_element_user(EXECUTERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ExecuteResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class ExecuteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ExecuteResponseDocument.ExecuteResponse
    {
        
        public ExecuteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESPONSE$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Response");
        
        
        /**
         * Gets the "Response" element
         */
        public com.microsoft.schemas.crm._2007.webservices.Response getResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2007.webservices.Response target = null;
                target = (com.microsoft.schemas.crm._2007.webservices.Response)get_store().find_element_user(RESPONSE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Response" element
         */
        public void setResponse(com.microsoft.schemas.crm._2007.webservices.Response response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2007.webservices.Response target = null;
                target = (com.microsoft.schemas.crm._2007.webservices.Response)get_store().find_element_user(RESPONSE$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.crm._2007.webservices.Response)get_store().add_element_user(RESPONSE$0);
                }
                target.set(response);
            }
        }
        
        /**
         * Appends and returns a new empty "Response" element
         */
        public com.microsoft.schemas.crm._2007.webservices.Response addNewResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2007.webservices.Response target = null;
                target = (com.microsoft.schemas.crm._2007.webservices.Response)get_store().add_element_user(RESPONSE$0);
                return target;
            }
        }
    }
}
