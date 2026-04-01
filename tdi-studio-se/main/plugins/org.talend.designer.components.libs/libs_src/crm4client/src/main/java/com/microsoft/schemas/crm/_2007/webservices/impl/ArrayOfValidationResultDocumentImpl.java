/*
 * An XML document type.
 * Localname: ArrayOfValidationResult
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfValidationResult(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfValidationResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResultDocument
{
    
    public ArrayOfValidationResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFVALIDATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfValidationResult");
    
    
    /**
     * Gets the "ArrayOfValidationResult" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult getArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfValidationResult" element
     */
    public boolean isNilArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfValidationResult" element
     */
    public void setArrayOfValidationResult(com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult arrayOfValidationResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().add_element_user(ARRAYOFVALIDATIONRESULT$0);
            }
            target.set(arrayOfValidationResult);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfValidationResult" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult addNewArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().add_element_user(ARRAYOFVALIDATIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfValidationResult" element
     */
    public void setNilArrayOfValidationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().find_element_user(ARRAYOFVALIDATIONRESULT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfValidationResult)get_store().add_element_user(ARRAYOFVALIDATIONRESULT$0);
            }
            target.setNil();
        }
    }
}
