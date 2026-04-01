/*
 * XML Type:  TargetUpdateResourceSpec
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateResourceSpec
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateResourceSpec(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateResourceSpecImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateResourceSpec
{
    
    public TargetUpdateResourceSpecImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCESPEC$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ResourceSpec");
    
    
    /**
     * Gets the "ResourceSpec" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Resourcespec getResourceSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Resourcespec target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Resourcespec)get_store().find_element_user(RESOURCESPEC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResourceSpec" element
     */
    public void setResourceSpec(com.microsoft.schemas.crm._2007.webservices.Resourcespec resourceSpec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Resourcespec target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Resourcespec)get_store().find_element_user(RESOURCESPEC$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Resourcespec)get_store().add_element_user(RESOURCESPEC$0);
            }
            target.set(resourceSpec);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceSpec" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Resourcespec addNewResourceSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Resourcespec target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Resourcespec)get_store().add_element_user(RESOURCESPEC$0);
            return target;
        }
    }
}
