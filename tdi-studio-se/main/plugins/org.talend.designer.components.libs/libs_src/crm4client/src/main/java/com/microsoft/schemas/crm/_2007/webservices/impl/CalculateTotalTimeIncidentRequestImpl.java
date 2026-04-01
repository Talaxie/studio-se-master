/*
 * XML Type:  CalculateTotalTimeIncidentRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CalculateTotalTimeIncidentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML CalculateTotalTimeIncidentRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CalculateTotalTimeIncidentRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.CalculateTotalTimeIncidentRequest
{
    
    public CalculateTotalTimeIncidentRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IncidentId");
    
    
    /**
     * Gets the "IncidentId" element
     */
    public java.lang.String getIncidentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentId" element
     */
    public com.microsoft.wsdl.types.Guid xgetIncidentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(INCIDENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentId" element
     */
    public void setIncidentId(java.lang.String incidentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$0);
            }
            target.setStringValue(incidentId);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentId" element
     */
    public void xsetIncidentId(com.microsoft.wsdl.types.Guid incidentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(INCIDENTID$0);
            }
            target.set(incidentId);
        }
    }
}
