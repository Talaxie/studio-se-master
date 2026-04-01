/*
 * XML Type:  TargetUpdateBusinessUnit
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateBusinessUnit
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateBusinessUnit(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateBusinessUnitImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateBusinessUnit
{
    
    public TargetUpdateBusinessUnitImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSUNIT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BusinessUnit");
    
    
    /**
     * Gets the "BusinessUnit" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Businessunit getBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Businessunit target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Businessunit)get_store().find_element_user(BUSINESSUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BusinessUnit" element
     */
    public void setBusinessUnit(com.microsoft.schemas.crm._2007.webservices.Businessunit businessUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Businessunit target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Businessunit)get_store().find_element_user(BUSINESSUNIT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Businessunit)get_store().add_element_user(BUSINESSUNIT$0);
            }
            target.set(businessUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "BusinessUnit" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Businessunit addNewBusinessUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Businessunit target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Businessunit)get_store().add_element_user(BUSINESSUNIT$0);
            return target;
        }
    }
}
