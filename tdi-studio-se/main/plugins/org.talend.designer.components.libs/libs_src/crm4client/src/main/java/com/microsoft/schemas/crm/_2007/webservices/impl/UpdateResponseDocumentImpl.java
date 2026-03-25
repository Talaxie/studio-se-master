/*
 * An XML document type.
 * Localname: UpdateResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one UpdateResponse(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class UpdateResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument
{
    
    public UpdateResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UpdateResponse");
    
    
    /**
     * Gets the "UpdateResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse getUpdateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse)get_store().find_element_user(UPDATERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateResponse" element
     */
    public void setUpdateResponse(com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse updateResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse)get_store().find_element_user(UPDATERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse)get_store().add_element_user(UPDATERESPONSE$0);
            }
            target.set(updateResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse addNewUpdateResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse)get_store().add_element_user(UPDATERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class UpdateResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.UpdateResponseDocument.UpdateResponse
    {
        
        public UpdateResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
