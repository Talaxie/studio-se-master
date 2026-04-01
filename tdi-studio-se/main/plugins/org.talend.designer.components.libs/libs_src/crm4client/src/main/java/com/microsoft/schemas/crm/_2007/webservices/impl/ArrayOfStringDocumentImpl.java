/*
 * An XML document type.
 * Localname: ArrayOfString
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfStringDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfString(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfStringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfStringDocument
{
    
    public ArrayOfStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfString");
    
    
    /**
     * Gets the "ArrayOfString" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString getArrayOfString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ARRAYOFSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfString" element
     */
    public boolean isNilArrayOfString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ARRAYOFSTRING$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfString" element
     */
    public void setArrayOfString(com.microsoft.schemas.crm._2007.webservices.ArrayOfString arrayOfString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ARRAYOFSTRING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(ARRAYOFSTRING$0);
            }
            target.set(arrayOfString);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfString" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString addNewArrayOfString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(ARRAYOFSTRING$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfString" element
     */
    public void setNilArrayOfString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ARRAYOFSTRING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(ARRAYOFSTRING$0);
            }
            target.setNil();
        }
    }
}
