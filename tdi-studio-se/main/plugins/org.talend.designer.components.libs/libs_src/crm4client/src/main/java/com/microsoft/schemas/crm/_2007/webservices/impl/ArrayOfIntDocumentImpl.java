/*
 * An XML document type.
 * Localname: ArrayOfInt
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfIntDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfInt(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfIntDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfIntDocument
{
    
    public ArrayOfIntDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFINT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfInt");
    
    
    /**
     * Gets the "ArrayOfInt" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt getArrayOfInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(ARRAYOFINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfInt" element
     */
    public boolean isNilArrayOfInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(ARRAYOFINT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfInt" element
     */
    public void setArrayOfInt(com.microsoft.schemas.crm._2007.webservices.ArrayOfInt arrayOfInt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(ARRAYOFINT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(ARRAYOFINT$0);
            }
            target.set(arrayOfInt);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfInt" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt addNewArrayOfInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(ARRAYOFINT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfInt" element
     */
    public void setNilArrayOfInt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(ARRAYOFINT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(ARRAYOFINT$0);
            }
            target.setNil();
        }
    }
}
