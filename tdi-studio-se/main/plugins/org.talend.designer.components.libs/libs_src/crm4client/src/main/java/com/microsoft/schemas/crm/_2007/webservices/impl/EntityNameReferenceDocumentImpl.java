/*
 * An XML document type.
 * Localname: EntityNameReference
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.EntityNameReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one EntityNameReference(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class EntityNameReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.EntityNameReferenceDocument
{
    
    public EntityNameReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYNAMEREFERENCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityNameReference");
    
    
    /**
     * Gets the "EntityNameReference" element
     */
    public com.microsoft.schemas.crm._2006.webservices.EntityNameReference getEntityNameReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(ENTITYNAMEREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "EntityNameReference" element
     */
    public boolean isNilEntityNameReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(ENTITYNAMEREFERENCE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "EntityNameReference" element
     */
    public void setEntityNameReference(com.microsoft.schemas.crm._2006.webservices.EntityNameReference entityNameReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(ENTITYNAMEREFERENCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(ENTITYNAMEREFERENCE$0);
            }
            target.set(entityNameReference);
        }
    }
    
    /**
     * Appends and returns a new empty "EntityNameReference" element
     */
    public com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewEntityNameReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(ENTITYNAMEREFERENCE$0);
            return target;
        }
    }
    
    /**
     * Nils the "EntityNameReference" element
     */
    public void setNilEntityNameReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(ENTITYNAMEREFERENCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(ENTITYNAMEREFERENCE$0);
            }
            target.setNil();
        }
    }
}
