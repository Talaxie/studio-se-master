/*
 * XML Type:  TargetUpdateReportEntity
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateReportEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateReportEntity(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateReportEntityImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateReportEntity
{
    
    public TargetUpdateReportEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ReportEntity");
    
    
    /**
     * Gets the "ReportEntity" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Reportentity getReportEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Reportentity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Reportentity)get_store().find_element_user(REPORTENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportEntity" element
     */
    public void setReportEntity(com.microsoft.schemas.crm._2007.webservices.Reportentity reportEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Reportentity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Reportentity)get_store().find_element_user(REPORTENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Reportentity)get_store().add_element_user(REPORTENTITY$0);
            }
            target.set(reportEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportEntity" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Reportentity addNewReportEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Reportentity target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Reportentity)get_store().add_element_user(REPORTENTITY$0);
            return target;
        }
    }
}
