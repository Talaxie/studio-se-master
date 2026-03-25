/*
 * XML Type:  BusinessEntityCollection
 * Namespace: http://schemas.microsoft.com/crm/2006/WebServices
 * Java type: com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.webservices.impl;
/**
 * An XML BusinessEntityCollection(@http://schemas.microsoft.com/crm/2006/WebServices).
 *
 * This is a complex type.
 */
public class BusinessEntityCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection
{
    
    public BusinessEntityCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSENTITIES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/WebServices", "BusinessEntities");
    private static final javax.xml.namespace.QName ENTITYNAME$2 = 
        new javax.xml.namespace.QName("", "EntityName");
    private static final javax.xml.namespace.QName MORERECORDS$4 = 
        new javax.xml.namespace.QName("", "MoreRecords");
    private static final javax.xml.namespace.QName PAGINGCOOKIE$6 = 
        new javax.xml.namespace.QName("", "PagingCookie");
    private static final javax.xml.namespace.QName VERSION$8 = 
        new javax.xml.namespace.QName("", "Version");
    
    
    /**
     * Gets the "BusinessEntities" element
     */
    public com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity getBusinessEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity)get_store().find_element_user(BUSINESSENTITIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BusinessEntities" element
     */
    public boolean isSetBusinessEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSENTITIES$0) != 0;
        }
    }
    
    /**
     * Sets the "BusinessEntities" element
     */
    public void setBusinessEntities(com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity businessEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity)get_store().find_element_user(BUSINESSENTITIES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity)get_store().add_element_user(BUSINESSENTITIES$0);
            }
            target.set(businessEntities);
        }
    }
    
    /**
     * Appends and returns a new empty "BusinessEntities" element
     */
    public com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity addNewBusinessEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity)get_store().add_element_user(BUSINESSENTITIES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "BusinessEntities" element
     */
    public void unsetBusinessEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSENTITIES$0, 0);
        }
    }
    
    /**
     * Gets the "EntityName" attribute
     */
    public java.lang.String getEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "EntityName" attribute
     */
    public boolean isSetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENTITYNAME$2) != null;
        }
    }
    
    /**
     * Sets the "EntityName" attribute
     */
    public void setEntityName(java.lang.String entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$2);
            }
            target.setStringValue(entityName);
        }
    }
    
    /**
     * Sets (as xml) the "EntityName" attribute
     */
    public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$2);
            }
            target.set(entityName);
        }
    }
    
    /**
     * Unsets the "EntityName" attribute
     */
    public void unsetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENTITYNAME$2);
        }
    }
    
    /**
     * Gets the "MoreRecords" attribute
     */
    public boolean getMoreRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MORERECORDS$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MoreRecords" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMoreRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MORERECORDS$4);
            return target;
        }
    }
    
    /**
     * Sets the "MoreRecords" attribute
     */
    public void setMoreRecords(boolean moreRecords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MORERECORDS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MORERECORDS$4);
            }
            target.setBooleanValue(moreRecords);
        }
    }
    
    /**
     * Sets (as xml) the "MoreRecords" attribute
     */
    public void xsetMoreRecords(org.apache.xmlbeans.XmlBoolean moreRecords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MORERECORDS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MORERECORDS$4);
            }
            target.set(moreRecords);
        }
    }
    
    /**
     * Gets the "PagingCookie" attribute
     */
    public java.lang.String getPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINGCOOKIE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PagingCookie" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINGCOOKIE$6);
            return target;
        }
    }
    
    /**
     * True if has "PagingCookie" attribute
     */
    public boolean isSetPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PAGINGCOOKIE$6) != null;
        }
    }
    
    /**
     * Sets the "PagingCookie" attribute
     */
    public void setPagingCookie(java.lang.String pagingCookie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINGCOOKIE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINGCOOKIE$6);
            }
            target.setStringValue(pagingCookie);
        }
    }
    
    /**
     * Sets (as xml) the "PagingCookie" attribute
     */
    public void xsetPagingCookie(org.apache.xmlbeans.XmlString pagingCookie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINGCOOKIE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINGCOOKIE$6);
            }
            target.set(pagingCookie);
        }
    }
    
    /**
     * Unsets the "PagingCookie" attribute
     */
    public void unsetPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PAGINGCOOKIE$6);
        }
    }
    
    /**
     * Gets the "Version" attribute
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Version" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$8);
            return target;
        }
    }
    
    /**
     * True if has "Version" attribute
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERSION$8) != null;
        }
    }
    
    /**
     * Sets the "Version" attribute
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$8);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "Version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$8);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "Version" attribute
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERSION$8);
        }
    }
}
