/*
 * An XML document type.
 * Localname: Create
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CreateDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one Create(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class CreateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CreateDocument
{
    
    public CreateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Create");
    
    
    /**
     * Gets the "Create" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create getCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create)get_store().find_element_user(CREATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Create" element
     */
    public void setCreate(com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create create)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create)get_store().find_element_user(CREATE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create)get_store().add_element_user(CREATE$0);
            }
            target.set(create);
        }
    }
    
    /**
     * Appends and returns a new empty "Create" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create addNewCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create)get_store().add_element_user(CREATE$0);
            return target;
        }
    }
    /**
     * An XML Create(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class CreateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CreateDocument.Create
    {
        
        public CreateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITY$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "entity");
        
        
        /**
         * Gets the "entity" element
         */
        public com.microsoft.schemas.crm._2006.webservices.BusinessEntity getEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(ENTITY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "entity" element
         */
        public void setEntity(com.microsoft.schemas.crm._2006.webservices.BusinessEntity entity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(ENTITY$0, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(ENTITY$0);
                }
                target.set(entity);
            }
        }
        
        /**
         * Appends and returns a new empty "entity" element
         */
        public com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(ENTITY$0);
                return target;
            }
        }
    }
}
