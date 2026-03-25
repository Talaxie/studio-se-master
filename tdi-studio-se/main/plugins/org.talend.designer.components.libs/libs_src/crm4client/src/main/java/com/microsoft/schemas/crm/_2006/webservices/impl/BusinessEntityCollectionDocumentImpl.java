/*
 * An XML document type.
 * Localname: BusinessEntityCollection
 * Namespace: http://schemas.microsoft.com/crm/2006/WebServices
 * Java type: com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.webservices.impl;
/**
 * A document containing one BusinessEntityCollection(@http://schemas.microsoft.com/crm/2006/WebServices) element.
 *
 * This is a complex type.
 */
public class BusinessEntityCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollectionDocument
{
    
    public BusinessEntityCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSENTITYCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/WebServices", "BusinessEntityCollection");
    
    
    /**
     * Gets the "BusinessEntityCollection" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection getBusinessEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().find_element_user(BUSINESSENTITYCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BusinessEntityCollection" element
     */
    public void setBusinessEntityCollection(com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection businessEntityCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().find_element_user(BUSINESSENTITYCOLLECTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().add_element_user(BUSINESSENTITYCOLLECTION$0);
            }
            target.set(businessEntityCollection);
        }
    }
    
    /**
     * Appends and returns a new empty "BusinessEntityCollection" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection addNewBusinessEntityCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection)get_store().add_element_user(BUSINESSENTITYCOLLECTION$0);
            return target;
        }
    }
}
