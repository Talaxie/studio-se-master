/*
 * An XML document type.
 * Localname: CreateResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one CreateResponse(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class CreateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument
{
    
    public CreateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CreateResponse");
    
    
    /**
     * Gets the "CreateResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse getCreateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse)get_store().find_element_user(CREATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateResponse" element
     */
    public void setCreateResponse(com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse createResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse)get_store().find_element_user(CREATERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse)get_store().add_element_user(CREATERESPONSE$0);
            }
            target.set(createResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse addNewCreateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse)get_store().add_element_user(CREATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class CreateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CreateResponseDocument.CreateResponse
    {
        
        public CreateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CreateResult");
        
        
        /**
         * Gets the "CreateResult" element
         */
        public java.lang.String getCreateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CreateResult" element
         */
        public com.microsoft.wsdl.types.Guid xgetCreateResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.wsdl.types.Guid target = null;
                target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CREATERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CreateResult" element
         */
        public void setCreateResult(java.lang.String createResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATERESULT$0);
                }
                target.setStringValue(createResult);
            }
        }
        
        /**
         * Sets (as xml) the "CreateResult" element
         */
        public void xsetCreateResult(com.microsoft.wsdl.types.Guid createResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.wsdl.types.Guid target = null;
                target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CREATERESULT$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CREATERESULT$0);
                }
                target.set(createResult);
            }
        }
    }
}
