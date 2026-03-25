/*
 * XML Type:  ArrayOfSdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfSdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfSdkMessageProcessingStepRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration
{
    
    public ArrayOfSdkMessageProcessingStepRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SdkMessageProcessingStepRegistration");
    
    
    /**
     * Gets array of all "SdkMessageProcessingStepRegistration" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration[] getSdkMessageProcessingStepRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration[] result = new com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration getSdkMessageProcessingStepRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SdkMessageProcessingStepRegistration" element
     */
    public boolean isNilSdkMessageProcessingStepRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SdkMessageProcessingStepRegistration" element
     */
    public int sizeOfSdkMessageProcessingStepRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
        }
    }
    
    /**
     * Sets array of all "SdkMessageProcessingStepRegistration" element
     */
    public void setSdkMessageProcessingStepRegistrationArray(com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration[] sdkMessageProcessingStepRegistrationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sdkMessageProcessingStepRegistrationArray, SDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
        }
    }
    
    /**
     * Sets ith "SdkMessageProcessingStepRegistration" element
     */
    public void setSdkMessageProcessingStepRegistrationArray(int i, com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration sdkMessageProcessingStepRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sdkMessageProcessingStepRegistration);
        }
    }
    
    /**
     * Nils the ith "SdkMessageProcessingStepRegistration" element
     */
    public void setNilSdkMessageProcessingStepRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration insertNewSdkMessageProcessingStepRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration)get_store().insert_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SdkMessageProcessingStepRegistration" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration addNewSdkMessageProcessingStepRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SdkMessageProcessingStepRegistration" element
     */
    public void removeSdkMessageProcessingStepRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDKMESSAGEPROCESSINGSTEPREGISTRATION$0, i);
        }
    }
}
