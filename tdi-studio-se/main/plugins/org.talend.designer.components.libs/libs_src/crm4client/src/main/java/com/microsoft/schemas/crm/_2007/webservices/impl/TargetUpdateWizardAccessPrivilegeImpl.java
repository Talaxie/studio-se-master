/*
 * XML Type:  TargetUpdateWizardAccessPrivilege
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateWizardAccessPrivilege
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateWizardAccessPrivilege(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateWizardAccessPrivilegeImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateWizardAccessPrivilege
{
    
    public TargetUpdateWizardAccessPrivilegeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WIZARDACCESSPRIVILEGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WizardAccessPrivilege");
    
    
    /**
     * Gets the "WizardAccessPrivilege" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege getWizardAccessPrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege)get_store().find_element_user(WIZARDACCESSPRIVILEGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WizardAccessPrivilege" element
     */
    public void setWizardAccessPrivilege(com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege wizardAccessPrivilege)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege)get_store().find_element_user(WIZARDACCESSPRIVILEGE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege)get_store().add_element_user(WIZARDACCESSPRIVILEGE$0);
            }
            target.set(wizardAccessPrivilege);
        }
    }
    
    /**
     * Appends and returns a new empty "WizardAccessPrivilege" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege addNewWizardAccessPrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Wizardaccessprivilege)get_store().add_element_user(WIZARDACCESSPRIVILEGE$0);
            return target;
        }
    }
}
