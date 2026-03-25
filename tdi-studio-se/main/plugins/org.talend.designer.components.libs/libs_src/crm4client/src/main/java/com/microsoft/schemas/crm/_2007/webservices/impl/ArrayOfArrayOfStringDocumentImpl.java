/*
 * An XML document type.
 * Localname: ArrayOfArrayOfString
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfStringDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfArrayOfString(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfArrayOfStringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfStringDocument
{
    
    public ArrayOfArrayOfStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFARRAYOFSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfArrayOfString");
    
    
    /**
     * Gets the "ArrayOfArrayOfString" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString getArrayOfArrayOfString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().find_element_user(ARRAYOFARRAYOFSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfArrayOfString" element
     */
    public boolean isNilArrayOfArrayOfString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().find_element_user(ARRAYOFARRAYOFSTRING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfArrayOfString" element
     */
    public void setArrayOfArrayOfString(com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString arrayOfArrayOfString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().find_element_user(ARRAYOFARRAYOFSTRING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().add_element_user(ARRAYOFARRAYOFSTRING$0);
            }
            target.set(arrayOfArrayOfString);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfArrayOfString" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString addNewArrayOfArrayOfString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().add_element_user(ARRAYOFARRAYOFSTRING$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfArrayOfString" element
     */
    public void setNilArrayOfArrayOfString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().find_element_user(ARRAYOFARRAYOFSTRING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfString)get_store().add_element_user(ARRAYOFARRAYOFSTRING$0);
            }
            target.setNil();
        }
    }
}
