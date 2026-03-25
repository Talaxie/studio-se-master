/*
 * XML Type:  TargetCreateAttributeMap
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateAttributeMap
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateAttributeMap(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateAttributeMapImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateAttributeMap
{
    
    public TargetCreateAttributeMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEMAP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AttributeMap");
    
    
    /**
     * Gets the "AttributeMap" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Attributemap getAttributeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Attributemap target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Attributemap)get_store().find_element_user(ATTRIBUTEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttributeMap" element
     */
    public void setAttributeMap(com.microsoft.schemas.crm._2007.webservices.Attributemap attributeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Attributemap target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Attributemap)get_store().find_element_user(ATTRIBUTEMAP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Attributemap)get_store().add_element_user(ATTRIBUTEMAP$0);
            }
            target.set(attributeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeMap" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Attributemap addNewAttributeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Attributemap target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Attributemap)get_store().add_element_user(ATTRIBUTEMAP$0);
            return target;
        }
    }
}
