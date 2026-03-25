/*
 * XML Type:  TargetRelatedSalesLiteratureToCompetitor
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetRelatedSalesLiteratureToCompetitor
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetRelatedSalesLiteratureToCompetitor(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetRelatedSalesLiteratureToCompetitorImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetRelatedImpl implements com.microsoft.schemas.crm._2007.webservices.TargetRelatedSalesLiteratureToCompetitor
{
    
    public TargetRelatedSalesLiteratureToCompetitorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALESLITERATUREID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SalesLiteratureId");
    private static final javax.xml.namespace.QName COMPETITORID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CompetitorId");
    
    
    /**
     * Gets the "SalesLiteratureId" element
     */
    public java.lang.String getSalesLiteratureId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESLITERATUREID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SalesLiteratureId" element
     */
    public com.microsoft.wsdl.types.Guid xgetSalesLiteratureId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SALESLITERATUREID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SalesLiteratureId" element
     */
    public void setSalesLiteratureId(java.lang.String salesLiteratureId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESLITERATUREID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALESLITERATUREID$0);
            }
            target.setStringValue(salesLiteratureId);
        }
    }
    
    /**
     * Sets (as xml) the "SalesLiteratureId" element
     */
    public void xsetSalesLiteratureId(com.microsoft.wsdl.types.Guid salesLiteratureId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SALESLITERATUREID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SALESLITERATUREID$0);
            }
            target.set(salesLiteratureId);
        }
    }
    
    /**
     * Gets the "CompetitorId" element
     */
    public java.lang.String getCompetitorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPETITORID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompetitorId" element
     */
    public com.microsoft.wsdl.types.Guid xgetCompetitorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(COMPETITORID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CompetitorId" element
     */
    public void setCompetitorId(java.lang.String competitorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPETITORID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPETITORID$2);
            }
            target.setStringValue(competitorId);
        }
    }
    
    /**
     * Sets (as xml) the "CompetitorId" element
     */
    public void xsetCompetitorId(com.microsoft.wsdl.types.Guid competitorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(COMPETITORID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(COMPETITORID$2);
            }
            target.set(competitorId);
        }
    }
}
