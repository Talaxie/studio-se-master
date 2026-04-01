/*
 * An XML document type.
 * Localname: DuplicateCollection
 * Namespace: http://schemas.microsoft.com/crm/2006/WebServices
 * Java type: com.microsoft.schemas.crm._2006.webservices.DuplicateCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.webservices.impl;
/**
 * A document containing one DuplicateCollection(@http://schemas.microsoft.com/crm/2006/WebServices) element.
 *
 * This is a complex type.
 */
public class DuplicateCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.webservices.DuplicateCollectionDocument
{
    
    public DuplicateCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DUPLICATECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/WebServices", "DuplicateCollection");
    
    
    /**
     * Gets the "DuplicateCollection" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection getDuplicateCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().find_element_user(DUPLICATECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DuplicateCollection" element
     */
    public void setDuplicateCollection(com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection duplicateCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().find_element_user(DUPLICATECOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().add_element_user(DUPLICATECOLLECTION$0);
            }
            target.set(duplicateCollection);
        }
    }
    
    /**
     * Appends and returns a new empty "DuplicateCollection" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection addNewDuplicateCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().add_element_user(DUPLICATECOLLECTION$0);
            return target;
        }
    }
}
