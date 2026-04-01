/*
 * An XML document type.
 * Localname: Update
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.UpdateDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one Update(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class UpdateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.UpdateDocument
{
    
    public UpdateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Update");
    
    
    /**
     * Gets the "Update" element
     */
    public com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update getUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update)get_store().find_element_user(UPDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Update" element
     */
    public void setUpdate(com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update update)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update)get_store().find_element_user(UPDATE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update)get_store().add_element_user(UPDATE$0);
            }
            target.set(update);
        }
    }
    
    /**
     * Appends and returns a new empty "Update" element
     */
    public com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update addNewUpdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update)get_store().add_element_user(UPDATE$0);
            return target;
        }
    }
    /**
     * An XML Update(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class UpdateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.UpdateDocument.Update
    {
        
        public UpdateImpl(org.apache.xmlbeans.SchemaType sType)
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
