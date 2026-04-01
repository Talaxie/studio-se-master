/*
 * An XML document type.
 * Localname: ArrayOfBoolean
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfBooleanDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfBoolean(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfBooleanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfBooleanDocument
{
    
    public ArrayOfBooleanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFBOOLEAN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfBoolean");
    
    
    /**
     * Gets the "ArrayOfBoolean" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean getArrayOfBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().find_element_user(ARRAYOFBOOLEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfBoolean" element
     */
    public boolean isNilArrayOfBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().find_element_user(ARRAYOFBOOLEAN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfBoolean" element
     */
    public void setArrayOfBoolean(com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean arrayOfBoolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().find_element_user(ARRAYOFBOOLEAN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().add_element_user(ARRAYOFBOOLEAN$0);
            }
            target.set(arrayOfBoolean);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfBoolean" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean addNewArrayOfBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().add_element_user(ARRAYOFBOOLEAN$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfBoolean" element
     */
    public void setNilArrayOfBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().find_element_user(ARRAYOFBOOLEAN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfBoolean)get_store().add_element_user(ARRAYOFBOOLEAN$0);
            }
            target.setNil();
        }
    }
}
