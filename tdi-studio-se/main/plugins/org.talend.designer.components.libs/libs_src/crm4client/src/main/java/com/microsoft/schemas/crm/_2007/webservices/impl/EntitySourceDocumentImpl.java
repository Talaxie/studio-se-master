/*
 * An XML document type.
 * Localname: EntitySource
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.EntitySourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one EntitySource(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class EntitySourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.EntitySourceDocument
{
    
    public EntitySourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYSOURCE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntitySource");
    
    
    /**
     * Gets the "EntitySource" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.EntitySource.Enum getEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.coretypes.EntitySource.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntitySource" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.EntitySource xgetEntitySource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.EntitySource)get_store().find_element_user(ENTITYSOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EntitySource" element
     */
    public void setEntitySource(com.microsoft.schemas.crm._2007.coretypes.EntitySource.Enum entitySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYSOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYSOURCE$0);
            }
            target.setEnumValue(entitySource);
        }
    }
    
    /**
     * Sets (as xml) the "EntitySource" element
     */
    public void xsetEntitySource(com.microsoft.schemas.crm._2007.coretypes.EntitySource entitySource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.EntitySource target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.EntitySource)get_store().find_element_user(ENTITYSOURCE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.coretypes.EntitySource)get_store().add_element_user(ENTITYSOURCE$0);
            }
            target.set(entitySource);
        }
    }
}
