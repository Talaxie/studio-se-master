/*
 * An XML document type.
 * Localname: ArrayOfPrincipalAccess
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccessDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfPrincipalAccess(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfPrincipalAccessDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccessDocument
{
    
    public ArrayOfPrincipalAccessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFPRINCIPALACCESS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfPrincipalAccess");
    
    
    /**
     * Gets the "ArrayOfPrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess getArrayOfPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFPRINCIPALACCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfPrincipalAccess" element
     */
    public boolean isNilArrayOfPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFPRINCIPALACCESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfPrincipalAccess" element
     */
    public void setArrayOfPrincipalAccess(com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess arrayOfPrincipalAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFPRINCIPALACCESS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().add_element_user(ARRAYOFPRINCIPALACCESS$0);
            }
            target.set(arrayOfPrincipalAccess);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfPrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess addNewArrayOfPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().add_element_user(ARRAYOFPRINCIPALACCESS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfPrincipalAccess" element
     */
    public void setNilArrayOfPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().find_element_user(ARRAYOFPRINCIPALACCESS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfPrincipalAccess)get_store().add_element_user(ARRAYOFPRINCIPALACCESS$0);
            }
            target.setNil();
        }
    }
}
