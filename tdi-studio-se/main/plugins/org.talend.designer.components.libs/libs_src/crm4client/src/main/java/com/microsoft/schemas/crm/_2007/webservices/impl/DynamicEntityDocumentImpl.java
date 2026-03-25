/*
 * An XML document type.
 * Localname: DynamicEntity
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.DynamicEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one DynamicEntity(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class DynamicEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.DynamicEntityDocument
{
    
    public DynamicEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DYNAMICENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "DynamicEntity");
    
    
    /**
     * Gets the "DynamicEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity getDynamicEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().find_element_user(DYNAMICENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DynamicEntity" element
     */
    public boolean isNilDynamicEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().find_element_user(DYNAMICENTITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DynamicEntity" element
     */
    public void setDynamicEntity(com.microsoft.schemas.crm._2006.webservices.DynamicEntity dynamicEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().find_element_user(DYNAMICENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().add_element_user(DYNAMICENTITY$0);
            }
            target.set(dynamicEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "DynamicEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity addNewDynamicEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().add_element_user(DYNAMICENTITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "DynamicEntity" element
     */
    public void setNilDynamicEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().find_element_user(DYNAMICENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().add_element_user(DYNAMICENTITY$0);
            }
            target.setNil();
        }
    }
}
