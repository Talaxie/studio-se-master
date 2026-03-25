/*
 * XML Type:  ValidateResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ValidateResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ValidateResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ValidateResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.ValidateResponse
{
    
    public ValidateResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Result");
    
    
    /**
     * Gets the "Result" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().find_element_user(RESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Result" element
     */
    public void setResult(com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().find_element_user(RESULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().add_element_user(RESULT$0);
            }
            target.set(result);
        }
    }
    
    /**
     * Appends and returns a new empty "Result" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().add_element_user(RESULT$0);
            return target;
        }
    }
}
