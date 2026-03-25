/*
 * XML Type:  TargetUpdateOrganization
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateOrganization
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateOrganization(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateOrganizationImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateOrganization
{
    
    public TargetUpdateOrganizationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Organization");
    
    
    /**
     * Gets the "Organization" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Organization getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Organization target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Organization)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Organization" element
     */
    public void setOrganization(com.microsoft.schemas.crm._2007.webservices.Organization organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Organization target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Organization)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Organization)get_store().add_element_user(ORGANIZATION$0);
            }
            target.set(organization);
        }
    }
    
    /**
     * Appends and returns a new empty "Organization" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Organization addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Organization target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Organization)get_store().add_element_user(ORGANIZATION$0);
            return target;
        }
    }
}
