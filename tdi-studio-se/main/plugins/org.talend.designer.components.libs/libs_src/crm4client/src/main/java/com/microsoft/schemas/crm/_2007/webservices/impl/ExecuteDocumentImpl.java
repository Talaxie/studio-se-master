/*
 * An XML document type.
 * Localname: Execute
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ExecuteDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one Execute(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ExecuteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ExecuteDocument
{
    
    public ExecuteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Execute");
    
    
    /**
     * Gets the "Execute" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute getExecute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute)get_store().find_element_user(EXECUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Execute" element
     */
    public void setExecute(com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute execute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute)get_store().find_element_user(EXECUTE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute)get_store().add_element_user(EXECUTE$0);
            }
            target.set(execute);
        }
    }
    
    /**
     * Appends and returns a new empty "Execute" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute addNewExecute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute)get_store().add_element_user(EXECUTE$0);
            return target;
        }
    }
    /**
     * An XML Execute(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class ExecuteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ExecuteDocument.Execute
    {
        
        public ExecuteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Request");
        
        
        /**
         * Gets the "Request" element
         */
        public com.microsoft.schemas.crm._2007.webservices.Request getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2007.webservices.Request target = null;
                target = (com.microsoft.schemas.crm._2007.webservices.Request)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Request" element
         */
        public void setRequest(com.microsoft.schemas.crm._2007.webservices.Request request)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2007.webservices.Request target = null;
                target = (com.microsoft.schemas.crm._2007.webservices.Request)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.crm._2007.webservices.Request)get_store().add_element_user(REQUEST$0);
                }
                target.set(request);
            }
        }
        
        /**
         * Appends and returns a new empty "Request" element
         */
        public com.microsoft.schemas.crm._2007.webservices.Request addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2007.webservices.Request target = null;
                target = (com.microsoft.schemas.crm._2007.webservices.Request)get_store().add_element_user(REQUEST$0);
                return target;
            }
        }
    }
}
