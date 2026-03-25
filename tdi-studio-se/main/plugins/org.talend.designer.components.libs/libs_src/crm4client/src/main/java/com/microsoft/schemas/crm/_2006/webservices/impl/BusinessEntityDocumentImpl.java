/*
 * An XML document type.
 * Localname: BusinessEntity
 * Namespace: http://schemas.microsoft.com/crm/2006/WebServices
 * Java type: com.microsoft.schemas.crm._2006.webservices.BusinessEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.webservices.impl;
/**
 * A document containing one BusinessEntity(@http://schemas.microsoft.com/crm/2006/WebServices) element.
 *
 * This is a complex type.
 */
public class BusinessEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.webservices.BusinessEntityDocument
{
    
    public BusinessEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/WebServices", "BusinessEntity");
    
    
    /**
     * Gets the "BusinessEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity getBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(BUSINESSENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BusinessEntity" element
     */
    public void setBusinessEntity(com.microsoft.schemas.crm._2006.webservices.BusinessEntity businessEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(BUSINESSENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(BUSINESSENTITY$0);
            }
            target.set(businessEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "BusinessEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(BUSINESSENTITY$0);
            return target;
        }
    }
}
