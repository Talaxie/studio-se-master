/*
 * XML Type:  TargetCreatePickListMapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreatePickListMapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreatePickListMapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreatePickListMappingImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreatePickListMapping
{
    
    public TargetCreatePickListMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PICKLISTMAPPING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PickListMapping");
    
    
    /**
     * Gets the "PickListMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Picklistmapping getPickListMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Picklistmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Picklistmapping)get_store().find_element_user(PICKLISTMAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PickListMapping" element
     */
    public void setPickListMapping(com.microsoft.schemas.crm._2007.webservices.Picklistmapping pickListMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Picklistmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Picklistmapping)get_store().find_element_user(PICKLISTMAPPING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Picklistmapping)get_store().add_element_user(PICKLISTMAPPING$0);
            }
            target.set(pickListMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "PickListMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Picklistmapping addNewPickListMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Picklistmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Picklistmapping)get_store().add_element_user(PICKLISTMAPPING$0);
            return target;
        }
    }
}
