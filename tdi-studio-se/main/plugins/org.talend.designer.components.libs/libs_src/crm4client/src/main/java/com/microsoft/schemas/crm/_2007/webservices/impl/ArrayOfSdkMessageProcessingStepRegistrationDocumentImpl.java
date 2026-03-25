/*
 * An XML document type.
 * Localname: ArrayOfSdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistrationDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfSdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfSdkMessageProcessingStepRegistrationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistrationDocument
{
    
    public ArrayOfSdkMessageProcessingStepRegistrationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfSdkMessageProcessingStepRegistration");
    
    
    /**
     * Gets the "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration getArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public boolean isNilArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public void setArrayOfSdkMessageProcessingStepRegistration(com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration arrayOfSdkMessageProcessingStepRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().add_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            }
            target.set(arrayOfSdkMessageProcessingStepRegistration);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration addNewArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().add_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfSdkMessageProcessingStepRegistration" element
     */
    public void setNilArrayOfSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().add_element_user(ARRAYOFSDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            }
            target.setNil();
        }
    }
}
