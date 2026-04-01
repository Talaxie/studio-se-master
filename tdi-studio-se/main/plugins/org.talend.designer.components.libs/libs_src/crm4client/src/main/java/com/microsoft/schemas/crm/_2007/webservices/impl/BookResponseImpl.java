/*
 * XML Type:  BookResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.BookResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML BookResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class BookResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.BookResponse
{
    
    public BookResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ValidationResult");
    
    
    /**
     * Gets the "ValidationResult" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ValidationResult getValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValidationResult" element
     */
    public void setValidationResult(com.microsoft.schemas.crm._2006.scheduling.ValidationResult validationResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ValidationResult)get_store().find_element_user(VALIDATIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ValidationResult)get_store().add_element_user(VALIDATIONRESULT$0);
            }
            target.set(validationResult);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidationResult" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ValidationResult addNewValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ValidationResult target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ValidationResult)get_store().add_element_user(VALIDATIONRESULT$0);
            return target;
        }
    }
}
