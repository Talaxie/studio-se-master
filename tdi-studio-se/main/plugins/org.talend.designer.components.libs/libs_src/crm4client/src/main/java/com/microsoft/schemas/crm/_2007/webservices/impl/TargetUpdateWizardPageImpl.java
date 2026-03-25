/*
 * XML Type:  TargetUpdateWizardPage
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateWizardPage
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateWizardPage(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateWizardPageImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateWizardPage
{
    
    public TargetUpdateWizardPageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WIZARDPAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WizardPage");
    
    
    /**
     * Gets the "WizardPage" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Wizardpage getWizardPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Wizardpage target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Wizardpage)get_store().find_element_user(WIZARDPAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WizardPage" element
     */
    public void setWizardPage(com.microsoft.schemas.crm._2007.webservices.Wizardpage wizardPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Wizardpage target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Wizardpage)get_store().find_element_user(WIZARDPAGE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Wizardpage)get_store().add_element_user(WIZARDPAGE$0);
            }
            target.set(wizardPage);
        }
    }
    
    /**
     * Appends and returns a new empty "WizardPage" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Wizardpage addNewWizardPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Wizardpage target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Wizardpage)get_store().add_element_user(WIZARDPAGE$0);
            return target;
        }
    }
}
