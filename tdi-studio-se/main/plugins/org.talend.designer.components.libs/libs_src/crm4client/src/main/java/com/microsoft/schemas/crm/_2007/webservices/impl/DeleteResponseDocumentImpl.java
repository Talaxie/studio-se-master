/*
 * An XML document type.
 * Localname: DeleteResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one DeleteResponse(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class DeleteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument
{
    
    public DeleteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "DeleteResponse");
    
    
    /**
     * Gets the "DeleteResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse getDeleteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse)get_store().find_element_user(DELETERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteResponse" element
     */
    public void setDeleteResponse(com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse deleteResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse)get_store().find_element_user(DELETERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse)get_store().add_element_user(DELETERESPONSE$0);
            }
            target.set(deleteResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteResponse" element
     */
    public com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse addNewDeleteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse)get_store().add_element_user(DELETERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class DeleteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.DeleteResponseDocument.DeleteResponse
    {
        
        public DeleteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
