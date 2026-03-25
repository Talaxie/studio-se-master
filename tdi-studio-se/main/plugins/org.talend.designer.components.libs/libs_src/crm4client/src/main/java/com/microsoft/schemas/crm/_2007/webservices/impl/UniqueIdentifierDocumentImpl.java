/*
 * An XML document type.
 * Localname: UniqueIdentifier
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.UniqueIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one UniqueIdentifier(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class UniqueIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.UniqueIdentifierDocument
{
    
    public UniqueIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNIQUEIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UniqueIdentifier");
    
    
    /**
     * Gets the "UniqueIdentifier" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getUniqueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(UNIQUEIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "UniqueIdentifier" element
     */
    public boolean isNilUniqueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(UNIQUEIDENTIFIER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "UniqueIdentifier" element
     */
    public void setUniqueIdentifier(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier uniqueIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(UNIQUEIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(UNIQUEIDENTIFIER$0);
            }
            target.set(uniqueIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "UniqueIdentifier" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewUniqueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(UNIQUEIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Nils the "UniqueIdentifier" element
     */
    public void setNilUniqueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(UNIQUEIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(UNIQUEIDENTIFIER$0);
            }
            target.setNil();
        }
    }
}
