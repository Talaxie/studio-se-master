/*
 * An XML document type.
 * Localname: ArrayOfOptionalParameter
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameterDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfOptionalParameter(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfOptionalParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameterDocument
{
    
    public ArrayOfOptionalParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFOPTIONALPARAMETER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfOptionalParameter");
    
    
    /**
     * Gets the "ArrayOfOptionalParameter" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter getArrayOfOptionalParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().find_element_user(ARRAYOFOPTIONALPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfOptionalParameter" element
     */
    public boolean isNilArrayOfOptionalParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().find_element_user(ARRAYOFOPTIONALPARAMETER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfOptionalParameter" element
     */
    public void setArrayOfOptionalParameter(com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter arrayOfOptionalParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().find_element_user(ARRAYOFOPTIONALPARAMETER$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().add_element_user(ARRAYOFOPTIONALPARAMETER$0);
            }
            target.set(arrayOfOptionalParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfOptionalParameter" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter addNewArrayOfOptionalParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().add_element_user(ARRAYOFOPTIONALPARAMETER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfOptionalParameter" element
     */
    public void setNilArrayOfOptionalParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().find_element_user(ARRAYOFOPTIONALPARAMETER$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().add_element_user(ARRAYOFOPTIONALPARAMETER$0);
            }
            target.setNil();
        }
    }
}
