/*
 * An XML document type.
 * Localname: ArrayOfQueryBase
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfQueryBase(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfQueryBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBaseDocument
{
    
    public ArrayOfQueryBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFQUERYBASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfQueryBase");
    
    
    /**
     * Gets the "ArrayOfQueryBase" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase getArrayOfQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().find_element_user(ARRAYOFQUERYBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfQueryBase" element
     */
    public boolean isNilArrayOfQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().find_element_user(ARRAYOFQUERYBASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfQueryBase" element
     */
    public void setArrayOfQueryBase(com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase arrayOfQueryBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().find_element_user(ARRAYOFQUERYBASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().add_element_user(ARRAYOFQUERYBASE$0);
            }
            target.set(arrayOfQueryBase);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfQueryBase" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase addNewArrayOfQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().add_element_user(ARRAYOFQUERYBASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfQueryBase" element
     */
    public void setNilArrayOfQueryBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().find_element_user(ARRAYOFQUERYBASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().add_element_user(ARRAYOFQUERYBASE$0);
            }
            target.setNil();
        }
    }
}
