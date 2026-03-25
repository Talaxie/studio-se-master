/*
 * XML Type:  TargetUpdateReport
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateReport
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateReport(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateReportImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateReport
{
    
    public TargetUpdateReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Report");
    
    
    /**
     * Gets the "Report" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Report getReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Report target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Report)get_store().find_element_user(REPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Report" element
     */
    public void setReport(com.microsoft.schemas.crm._2007.webservices.Report report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Report target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Report)get_store().find_element_user(REPORT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Report)get_store().add_element_user(REPORT$0);
            }
            target.set(report);
        }
    }
    
    /**
     * Appends and returns a new empty "Report" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Report addNewReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Report target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Report)get_store().add_element_user(REPORT$0);
            return target;
        }
    }
}
