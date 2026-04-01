/*
 * XML Type:  TargetCreateSite
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateSite
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateSite(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateSiteImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateSite
{
    
    public TargetCreateSiteImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Site");
    
    
    /**
     * Gets the "Site" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Site getSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Site target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Site)get_store().find_element_user(SITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Site" element
     */
    public void setSite(com.microsoft.schemas.crm._2007.webservices.Site site)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Site target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Site)get_store().find_element_user(SITE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Site)get_store().add_element_user(SITE$0);
            }
            target.set(site);
        }
    }
    
    /**
     * Appends and returns a new empty "Site" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Site addNewSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Site target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Site)get_store().add_element_user(SITE$0);
            return target;
        }
    }
}
