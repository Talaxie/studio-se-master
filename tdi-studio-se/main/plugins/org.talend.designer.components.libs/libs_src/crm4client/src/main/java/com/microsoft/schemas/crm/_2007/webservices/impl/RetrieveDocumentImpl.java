/*
 * An XML document type.
 * Localname: Retrieve
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one Retrieve(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class RetrieveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveDocument
{
    
    public RetrieveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETRIEVE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Retrieve");
    
    
    /**
     * Gets the "Retrieve" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve getRetrieve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve)get_store().find_element_user(RETRIEVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Retrieve" element
     */
    public void setRetrieve(com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve retrieve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve)get_store().find_element_user(RETRIEVE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve)get_store().add_element_user(RETRIEVE$0);
            }
            target.set(retrieve);
        }
    }
    
    /**
     * Appends and returns a new empty "Retrieve" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve addNewRetrieve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve)get_store().add_element_user(RETRIEVE$0);
            return target;
        }
    }
    /**
     * An XML Retrieve(@http://schemas.microsoft.com/crm/2007/WebServices).
     *
     * This is a complex type.
     */
    public static class RetrieveImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveDocument.Retrieve
    {
        
        public RetrieveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "entityName");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "id");
        private static final javax.xml.namespace.QName COLUMNSET$4 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "columnSet");
        
        
        /**
         * Gets the "entityName" element
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entityName" element
         */
        public org.apache.xmlbeans.XmlString xgetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "entityName" element
         */
        public boolean isSetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "entityName" element
         */
        public void setEntityName(java.lang.String entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYNAME$0);
                }
                target.setStringValue(entityName);
            }
        }
        
        /**
         * Sets (as xml) the "entityName" element
         */
        public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYNAME$0);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Unsets the "entityName" element
         */
        public void unsetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYNAME$0, 0);
            }
        }
        
        /**
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public com.microsoft.wsdl.types.Guid xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.wsdl.types.Guid target = null;
                target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(com.microsoft.wsdl.types.Guid id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.wsdl.types.Guid target = null;
                target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ID$2, 0);
                if (target == null)
                {
                    target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ID$2);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "columnSet" element
         */
        public com.microsoft.schemas.crm._2006.query.ColumnSetBase getColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
                target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSET$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "columnSet" element
         */
        public boolean isSetColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLUMNSET$4) != 0;
            }
        }
        
        /**
         * Sets the "columnSet" element
         */
        public void setColumnSet(com.microsoft.schemas.crm._2006.query.ColumnSetBase columnSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
                target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSET$4, 0);
                if (target == null)
                {
                    target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().add_element_user(COLUMNSET$4);
                }
                target.set(columnSet);
            }
        }
        
        /**
         * Appends and returns a new empty "columnSet" element
         */
        public com.microsoft.schemas.crm._2006.query.ColumnSetBase addNewColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
                target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().add_element_user(COLUMNSET$4);
                return target;
            }
        }
        
        /**
         * Unsets the "columnSet" element
         */
        public void unsetColumnSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLUMNSET$4, 0);
            }
        }
    }
}
