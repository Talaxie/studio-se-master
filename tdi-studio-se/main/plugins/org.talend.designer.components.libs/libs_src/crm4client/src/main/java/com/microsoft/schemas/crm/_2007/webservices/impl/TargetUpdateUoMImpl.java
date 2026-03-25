/*
 * XML Type:  TargetUpdateUoM
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateUoM
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateUoM(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateUoMImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateUoM
{
    
    public TargetUpdateUoMImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UOM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UoM");
    
    
    /**
     * Gets the "UoM" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Uom getUoM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Uom target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Uom)get_store().find_element_user(UOM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UoM" element
     */
    public void setUoM(com.microsoft.schemas.crm._2007.webservices.Uom uoM)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Uom target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Uom)get_store().find_element_user(UOM$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Uom)get_store().add_element_user(UOM$0);
            }
            target.set(uoM);
        }
    }
    
    /**
     * Appends and returns a new empty "UoM" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Uom addNewUoM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Uom target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Uom)get_store().add_element_user(UOM$0);
            return target;
        }
    }
}
