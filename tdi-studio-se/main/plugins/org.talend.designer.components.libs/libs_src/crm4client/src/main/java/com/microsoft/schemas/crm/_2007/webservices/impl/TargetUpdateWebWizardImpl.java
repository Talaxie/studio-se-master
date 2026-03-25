/*
 * XML Type:  TargetUpdateWebWizard
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateWebWizard
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateWebWizard(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateWebWizardImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateWebWizard
{
    
    public TargetUpdateWebWizardImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBWIZARD$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WebWizard");
    
    
    /**
     * Gets the "WebWizard" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Webwizard getWebWizard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Webwizard target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Webwizard)get_store().find_element_user(WEBWIZARD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WebWizard" element
     */
    public void setWebWizard(com.microsoft.schemas.crm._2007.webservices.Webwizard webWizard)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Webwizard target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Webwizard)get_store().find_element_user(WEBWIZARD$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Webwizard)get_store().add_element_user(WEBWIZARD$0);
            }
            target.set(webWizard);
        }
    }
    
    /**
     * Appends and returns a new empty "WebWizard" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Webwizard addNewWebWizard()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Webwizard target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Webwizard)get_store().add_element_user(WEBWIZARD$0);
            return target;
        }
    }
}
