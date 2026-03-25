/*
 * XML Type:  TargetCreateOwnerMapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateOwnerMapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateOwnerMapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateOwnerMappingImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateOwnerMapping
{
    
    public TargetCreateOwnerMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNERMAPPING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OwnerMapping");
    
    
    /**
     * Gets the "OwnerMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Ownermapping getOwnerMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Ownermapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Ownermapping)get_store().find_element_user(OWNERMAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OwnerMapping" element
     */
    public void setOwnerMapping(com.microsoft.schemas.crm._2007.webservices.Ownermapping ownerMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Ownermapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Ownermapping)get_store().find_element_user(OWNERMAPPING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Ownermapping)get_store().add_element_user(OWNERMAPPING$0);
            }
            target.set(ownerMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "OwnerMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Ownermapping addNewOwnerMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Ownermapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Ownermapping)get_store().add_element_user(OWNERMAPPING$0);
            return target;
        }
    }
}
