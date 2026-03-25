/*
 * XML Type:  TargetUpdateCustomerOpportunityRole
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateCustomerOpportunityRole
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateCustomerOpportunityRole(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateCustomerOpportunityRoleImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateCustomerOpportunityRole
{
    
    public TargetUpdateCustomerOpportunityRoleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMEROPPORTUNITYROLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CustomerOpportunityRole");
    
    
    /**
     * Gets the "CustomerOpportunityRole" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole getCustomerOpportunityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole)get_store().find_element_user(CUSTOMEROPPORTUNITYROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CustomerOpportunityRole" element
     */
    public void setCustomerOpportunityRole(com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole customerOpportunityRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole)get_store().find_element_user(CUSTOMEROPPORTUNITYROLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole)get_store().add_element_user(CUSTOMEROPPORTUNITYROLE$0);
            }
            target.set(customerOpportunityRole);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerOpportunityRole" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole addNewCustomerOpportunityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Customeropportunityrole)get_store().add_element_user(CUSTOMEROPPORTUNITYROLE$0);
            return target;
        }
    }
}
