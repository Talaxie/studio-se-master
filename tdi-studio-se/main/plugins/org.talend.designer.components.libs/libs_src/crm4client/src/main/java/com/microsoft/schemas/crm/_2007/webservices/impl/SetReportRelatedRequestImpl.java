/*
 * XML Type:  SetReportRelatedRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetReportRelatedRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetReportRelatedRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetReportRelatedRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetReportRelatedRequest
{
    
    public SetReportRelatedRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ReportId");
    private static final javax.xml.namespace.QName ENTITIES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Entities");
    private static final javax.xml.namespace.QName CATEGORIES$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Categories");
    private static final javax.xml.namespace.QName VISIBILITY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Visibility");
    
    
    /**
     * Gets the "ReportId" element
     */
    public java.lang.String getReportId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportId" element
     */
    public com.microsoft.wsdl.types.Guid xgetReportId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(REPORTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReportId" element
     */
    public void setReportId(java.lang.String reportId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTID$0);
            }
            target.setStringValue(reportId);
        }
    }
    
    /**
     * Sets (as xml) the "ReportId" element
     */
    public void xsetReportId(com.microsoft.wsdl.types.Guid reportId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(REPORTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(REPORTID$0);
            }
            target.set(reportId);
        }
    }
    
    /**
     * Gets the "Entities" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt getEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(ENTITIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Entities" element
     */
    public void setEntities(com.microsoft.schemas.crm._2007.webservices.ArrayOfInt entities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(ENTITIES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(ENTITIES$2);
            }
            target.set(entities);
        }
    }
    
    /**
     * Appends and returns a new empty "Entities" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt addNewEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(ENTITIES$2);
            return target;
        }
    }
    
    /**
     * Gets the "Categories" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt getCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(CATEGORIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Categories" element
     */
    public void setCategories(com.microsoft.schemas.crm._2007.webservices.ArrayOfInt categories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(CATEGORIES$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(CATEGORIES$4);
            }
            target.set(categories);
        }
    }
    
    /**
     * Appends and returns a new empty "Categories" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt addNewCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(CATEGORIES$4);
            return target;
        }
    }
    
    /**
     * Gets the "Visibility" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt getVisibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(VISIBILITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Visibility" element
     */
    public void setVisibility(com.microsoft.schemas.crm._2007.webservices.ArrayOfInt visibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().find_element_user(VISIBILITY$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(VISIBILITY$6);
            }
            target.set(visibility);
        }
    }
    
    /**
     * Appends and returns a new empty "Visibility" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfInt addNewVisibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfInt target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfInt)get_store().add_element_user(VISIBILITY$6);
            return target;
        }
    }
}
