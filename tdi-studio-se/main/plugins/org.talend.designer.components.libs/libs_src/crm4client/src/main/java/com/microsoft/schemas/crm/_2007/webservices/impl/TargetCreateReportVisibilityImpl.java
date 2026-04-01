/*
 * XML Type:  TargetCreateReportVisibility
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateReportVisibility
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateReportVisibility(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateReportVisibilityImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateReportVisibility
{
    
    public TargetCreateReportVisibilityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTVISIBILITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ReportVisibility");
    
    
    /**
     * Gets the "ReportVisibility" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Reportvisibility getReportVisibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Reportvisibility target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Reportvisibility)get_store().find_element_user(REPORTVISIBILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportVisibility" element
     */
    public void setReportVisibility(com.microsoft.schemas.crm._2007.webservices.Reportvisibility reportVisibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Reportvisibility target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Reportvisibility)get_store().find_element_user(REPORTVISIBILITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Reportvisibility)get_store().add_element_user(REPORTVISIBILITY$0);
            }
            target.set(reportVisibility);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportVisibility" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Reportvisibility addNewReportVisibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Reportvisibility target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Reportvisibility)get_store().add_element_user(REPORTVISIBILITY$0);
            return target;
        }
    }
}
