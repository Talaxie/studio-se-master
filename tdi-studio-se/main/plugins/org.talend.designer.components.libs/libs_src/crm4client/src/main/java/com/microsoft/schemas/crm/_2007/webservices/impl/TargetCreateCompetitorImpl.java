/*
 * XML Type:  TargetCreateCompetitor
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateCompetitor
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateCompetitor(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateCompetitorImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateCompetitor
{
    
    public TargetCreateCompetitorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPETITOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Competitor");
    
    
    /**
     * Gets the "Competitor" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Competitor getCompetitor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Competitor target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Competitor)get_store().find_element_user(COMPETITOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Competitor" element
     */
    public void setCompetitor(com.microsoft.schemas.crm._2007.webservices.Competitor competitor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Competitor target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Competitor)get_store().find_element_user(COMPETITOR$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Competitor)get_store().add_element_user(COMPETITOR$0);
            }
            target.set(competitor);
        }
    }
    
    /**
     * Appends and returns a new empty "Competitor" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Competitor addNewCompetitor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Competitor target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Competitor)get_store().add_element_user(COMPETITOR$0);
            return target;
        }
    }
}
