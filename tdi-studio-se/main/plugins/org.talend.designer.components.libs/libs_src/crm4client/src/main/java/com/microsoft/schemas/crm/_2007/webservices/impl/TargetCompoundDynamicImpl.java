/*
 * XML Type:  TargetCompoundDynamic
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCompoundDynamic
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCompoundDynamic(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCompoundDynamicImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCompoundImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCompoundDynamic
{
    
    public TargetCompoundDynamicImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Entity");
    private static final javax.xml.namespace.QName CHILDENTITIES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ChildEntities");
    
    
    /**
     * Gets the "Entity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().find_element_user(ENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Entity" element
     */
    public void setEntity(com.microsoft.schemas.crm._2006.webservices.DynamicEntity entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().find_element_user(ENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().add_element_user(ENTITY$0);
            }
            target.set(entity);
        }
    }
    
    /**
     * Appends and returns a new empty "Entity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().add_element_user(ENTITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "ChildEntities" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity getChildEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity)get_store().find_element_user(CHILDENTITIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ChildEntities" element
     */
    public void setChildEntities(com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity childEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity)get_store().find_element_user(CHILDENTITIES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity)get_store().add_element_user(CHILDENTITIES$2);
            }
            target.set(childEntities);
        }
    }
    
    /**
     * Appends and returns a new empty "ChildEntities" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity addNewChildEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity)get_store().add_element_user(CHILDENTITIES$2);
            return target;
        }
    }
}
