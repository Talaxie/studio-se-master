/*
 * XML Type:  DynamicEntity
 * Namespace: http://schemas.microsoft.com/crm/2006/WebServices
 * Java type: com.microsoft.schemas.crm._2006.webservices.DynamicEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.webservices.impl;
/**
 * An XML DynamicEntity(@http://schemas.microsoft.com/crm/2006/WebServices).
 *
 * This is a complex type.
 */
public class DynamicEntityImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2006.webservices.DynamicEntity
{
    
    public DynamicEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTIES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/WebServices", "Properties");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "Name");
    
    
    /**
     * Gets the "Properties" element
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Properties" element
     */
    public boolean isSetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$0) != 0;
        }
    }
    
    /**
     * Sets the "Properties" element
     */
    public void setProperties(com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties)get_store().add_element_user(PROPERTIES$0);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "Properties" element
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties)get_store().add_element_user(PROPERTIES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Properties" element
     */
    public void unsetProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$0, 0);
        }
    }
    
    /**
     * Gets the "Name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * True if has "Name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$2) != null;
        }
    }
    
    /**
     * Sets the "Name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$2);
        }
    }
    /**
     * An XML Properties(@http://schemas.microsoft.com/crm/2006/WebServices).
     *
     * This is a complex type.
     */
    public static class PropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.webservices.DynamicEntity.Properties
    {
        
        public PropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTY$0 = 
            new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/WebServices", "Property");
        
        
        /**
         * Gets array of all "Property" elements
         */
        public com.microsoft.schemas.crm._2006.webservices.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$0, targetList);
                com.microsoft.schemas.crm._2006.webservices.Property[] result = new com.microsoft.schemas.crm._2006.webservices.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Property" element
         */
        public com.microsoft.schemas.crm._2006.webservices.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.Property target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "Property" element
         */
        public boolean isNilPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.Property target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "Property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "Property" element
         */
        public void setPropertyArray(com.microsoft.schemas.crm._2006.webservices.Property[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
        }
        
        /**
         * Sets ith "Property" element
         */
        public void setPropertyArray(int i, com.microsoft.schemas.crm._2006.webservices.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.Property target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Nils the ith "Property" element
         */
        public void setNilPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.Property target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Property" element
         */
        public com.microsoft.schemas.crm._2006.webservices.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.Property target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.Property)get_store().insert_element_user(PROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Property" element
         */
        public com.microsoft.schemas.crm._2006.webservices.Property addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.microsoft.schemas.crm._2006.webservices.Property target = null;
                target = (com.microsoft.schemas.crm._2006.webservices.Property)get_store().add_element_user(PROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$0, i);
            }
        }
    }
}
