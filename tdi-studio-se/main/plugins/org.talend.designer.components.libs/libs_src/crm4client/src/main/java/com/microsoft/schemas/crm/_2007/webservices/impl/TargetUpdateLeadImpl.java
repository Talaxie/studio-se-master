/*
 * XML Type:  TargetUpdateLead
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateLead
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateLead(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateLeadImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateLead
{
    
    public TargetUpdateLeadImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEAD$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Lead");
    
    
    /**
     * Gets the "Lead" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Lead getLead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Lead target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Lead)get_store().find_element_user(LEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Lead" element
     */
    public void setLead(com.microsoft.schemas.crm._2007.webservices.Lead lead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Lead target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Lead)get_store().find_element_user(LEAD$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Lead)get_store().add_element_user(LEAD$0);
            }
            target.set(lead);
        }
    }
    
    /**
     * Appends and returns a new empty "Lead" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Lead addNewLead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Lead target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Lead)get_store().add_element_user(LEAD$0);
            return target;
        }
    }
}
