/*
 * XML Type:  TargetCreateIncident
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateIncident
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateIncident(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateIncidentImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateIncident
{
    
    public TargetCreateIncidentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Incident");
    
    
    /**
     * Gets the "Incident" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Incident getIncident()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Incident target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Incident)get_store().find_element_user(INCIDENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Incident" element
     */
    public void setIncident(com.microsoft.schemas.crm._2007.webservices.Incident incident)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Incident target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Incident)get_store().find_element_user(INCIDENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Incident)get_store().add_element_user(INCIDENT$0);
            }
            target.set(incident);
        }
    }
    
    /**
     * Appends and returns a new empty "Incident" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Incident addNewIncident()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Incident target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Incident)get_store().add_element_user(INCIDENT$0);
            return target;
        }
    }
}
