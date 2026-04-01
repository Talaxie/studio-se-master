/*
 * An XML document type.
 * Localname: ArrayOfTimeCode
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfTimeCode(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfTimeCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCodeDocument
{
    
    public ArrayOfTimeCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFTIMECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfTimeCode");
    
    
    /**
     * Gets the "ArrayOfTimeCode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode getArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfTimeCode" element
     */
    public boolean isNilArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfTimeCode" element
     */
    public void setArrayOfTimeCode(com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode arrayOfTimeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().add_element_user(ARRAYOFTIMECODE$0);
            }
            target.set(arrayOfTimeCode);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfTimeCode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode addNewArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().add_element_user(ARRAYOFTIMECODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfTimeCode" element
     */
    public void setNilArrayOfTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().find_element_user(ARRAYOFTIMECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().add_element_user(ARRAYOFTIMECODE$0);
            }
            target.setNil();
        }
    }
}
