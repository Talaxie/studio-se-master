/*
 * XML Type:  TargetUpdateOrganizationUI
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateOrganizationUI
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateOrganizationUI(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateOrganizationUIImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateOrganizationUI
{
    
    public TargetUpdateOrganizationUIImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONUI$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OrganizationUI");
    
    
    /**
     * Gets the "OrganizationUI" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Organizationui getOrganizationUI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Organizationui target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Organizationui)get_store().find_element_user(ORGANIZATIONUI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganizationUI" element
     */
    public void setOrganizationUI(com.microsoft.schemas.crm._2007.webservices.Organizationui organizationUI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Organizationui target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Organizationui)get_store().find_element_user(ORGANIZATIONUI$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Organizationui)get_store().add_element_user(ORGANIZATIONUI$0);
            }
            target.set(organizationUI);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationUI" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Organizationui addNewOrganizationUI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Organizationui target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Organizationui)get_store().add_element_user(ORGANIZATIONUI$0);
            return target;
        }
    }
}
