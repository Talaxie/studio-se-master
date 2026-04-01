/*
 * XML Type:  TargetCreateIncidentResolution
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateIncidentResolution
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateIncidentResolution(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateIncidentResolutionImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateIncidentResolution
{
    
    public TargetCreateIncidentResolutionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTRESOLUTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IncidentResolution");
    
    
    /**
     * Gets the "IncidentResolution" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Incidentresolution getIncidentResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Incidentresolution target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Incidentresolution)get_store().find_element_user(INCIDENTRESOLUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IncidentResolution" element
     */
    public void setIncidentResolution(com.microsoft.schemas.crm._2007.webservices.Incidentresolution incidentResolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Incidentresolution target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Incidentresolution)get_store().find_element_user(INCIDENTRESOLUTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Incidentresolution)get_store().add_element_user(INCIDENTRESOLUTION$0);
            }
            target.set(incidentResolution);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentResolution" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Incidentresolution addNewIncidentResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Incidentresolution target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Incidentresolution)get_store().add_element_user(INCIDENTRESOLUTION$0);
            return target;
        }
    }
}
