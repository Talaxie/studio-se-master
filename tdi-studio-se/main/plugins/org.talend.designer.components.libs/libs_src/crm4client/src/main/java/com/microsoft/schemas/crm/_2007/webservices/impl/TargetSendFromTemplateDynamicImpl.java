/*
 * XML Type:  TargetSendFromTemplateDynamic
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetSendFromTemplateDynamic
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetSendFromTemplateDynamic(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetSendFromTemplateDynamicImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetSendFromTemplateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetSendFromTemplateDynamic
{
    
    public TargetSendFromTemplateDynamicImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Entity");
    
    
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
}
