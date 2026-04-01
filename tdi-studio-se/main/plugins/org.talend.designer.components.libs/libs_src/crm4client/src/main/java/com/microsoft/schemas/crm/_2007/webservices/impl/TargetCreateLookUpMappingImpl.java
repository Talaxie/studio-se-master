/*
 * XML Type:  TargetCreateLookUpMapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateLookUpMapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateLookUpMapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateLookUpMappingImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateLookUpMapping
{
    
    public TargetCreateLookUpMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOOKUPMAPPING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "LookUpMapping");
    
    
    /**
     * Gets the "LookUpMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Lookupmapping getLookUpMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Lookupmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Lookupmapping)get_store().find_element_user(LOOKUPMAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LookUpMapping" element
     */
    public void setLookUpMapping(com.microsoft.schemas.crm._2007.webservices.Lookupmapping lookUpMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Lookupmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Lookupmapping)get_store().find_element_user(LOOKUPMAPPING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Lookupmapping)get_store().add_element_user(LOOKUPMAPPING$0);
            }
            target.set(lookUpMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "LookUpMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Lookupmapping addNewLookUpMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Lookupmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Lookupmapping)get_store().add_element_user(LOOKUPMAPPING$0);
            return target;
        }
    }
}
