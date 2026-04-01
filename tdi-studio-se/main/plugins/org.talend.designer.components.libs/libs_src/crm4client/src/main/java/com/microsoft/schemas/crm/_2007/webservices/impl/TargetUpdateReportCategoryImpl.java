/*
 * XML Type:  TargetUpdateReportCategory
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateReportCategory
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateReportCategory(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateReportCategoryImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateReportCategory
{
    
    public TargetUpdateReportCategoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTCATEGORY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ReportCategory");
    
    
    /**
     * Gets the "ReportCategory" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Reportcategory getReportCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Reportcategory target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Reportcategory)get_store().find_element_user(REPORTCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportCategory" element
     */
    public void setReportCategory(com.microsoft.schemas.crm._2007.webservices.Reportcategory reportCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Reportcategory target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Reportcategory)get_store().find_element_user(REPORTCATEGORY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Reportcategory)get_store().add_element_user(REPORTCATEGORY$0);
            }
            target.set(reportCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportCategory" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Reportcategory addNewReportCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Reportcategory target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Reportcategory)get_store().add_element_user(REPORTCATEGORY$0);
            return target;
        }
    }
}
