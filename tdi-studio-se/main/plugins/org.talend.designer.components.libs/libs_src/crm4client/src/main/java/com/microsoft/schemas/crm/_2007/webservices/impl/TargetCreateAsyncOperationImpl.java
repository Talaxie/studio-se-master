/*
 * XML Type:  TargetCreateAsyncOperation
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateAsyncOperation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateAsyncOperation(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateAsyncOperationImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateAsyncOperation
{
    
    public TargetCreateAsyncOperationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASYNCOPERATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AsyncOperation");
    
    
    /**
     * Gets the "AsyncOperation" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Asyncoperation getAsyncOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Asyncoperation target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Asyncoperation)get_store().find_element_user(ASYNCOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AsyncOperation" element
     */
    public void setAsyncOperation(com.microsoft.schemas.crm._2007.webservices.Asyncoperation asyncOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Asyncoperation target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Asyncoperation)get_store().find_element_user(ASYNCOPERATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Asyncoperation)get_store().add_element_user(ASYNCOPERATION$0);
            }
            target.set(asyncOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "AsyncOperation" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Asyncoperation addNewAsyncOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Asyncoperation target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Asyncoperation)get_store().add_element_user(ASYNCOPERATION$0);
            return target;
        }
    }
}
