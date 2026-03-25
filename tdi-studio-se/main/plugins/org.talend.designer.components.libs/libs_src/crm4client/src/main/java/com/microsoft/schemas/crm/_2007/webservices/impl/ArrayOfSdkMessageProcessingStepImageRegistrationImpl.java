/*
 * XML Type:  ArrayOfSdkMessageProcessingStepImageRegistration
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfSdkMessageProcessingStepImageRegistration(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfSdkMessageProcessingStepImageRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration
{
    
    public ArrayOfSdkMessageProcessingStepImageRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SdkMessageProcessingStepImageRegistration");
    
    
    /**
     * Gets array of all "SdkMessageProcessingStepImageRegistration" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration[] getSdkMessageProcessingStepImageRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration[] result = new com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration getSdkMessageProcessingStepImageRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "SdkMessageProcessingStepImageRegistration" element
     */
    public boolean isNilSdkMessageProcessingStepImageRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "SdkMessageProcessingStepImageRegistration" element
     */
    public int sizeOfSdkMessageProcessingStepImageRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
        }
    }
    
    /**
     * Sets array of all "SdkMessageProcessingStepImageRegistration" element
     */
    public void setSdkMessageProcessingStepImageRegistrationArray(com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration[] sdkMessageProcessingStepImageRegistrationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sdkMessageProcessingStepImageRegistrationArray, SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
        }
    }
    
    /**
     * Sets ith "SdkMessageProcessingStepImageRegistration" element
     */
    public void setSdkMessageProcessingStepImageRegistrationArray(int i, com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration sdkMessageProcessingStepImageRegistration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sdkMessageProcessingStepImageRegistration);
        }
    }
    
    /**
     * Nils the ith "SdkMessageProcessingStepImageRegistration" element
     */
    public void setNilSdkMessageProcessingStepImageRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration insertNewSdkMessageProcessingStepImageRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration)get_store().insert_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SdkMessageProcessingStepImageRegistration" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration addNewSdkMessageProcessingStepImageRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SdkMessageProcessingStepImageRegistration" element
     */
    public void removeSdkMessageProcessingStepImageRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDKMESSAGEPROCESSINGSTEPIMAGEREGISTRATION$0, i);
        }
    }
}
