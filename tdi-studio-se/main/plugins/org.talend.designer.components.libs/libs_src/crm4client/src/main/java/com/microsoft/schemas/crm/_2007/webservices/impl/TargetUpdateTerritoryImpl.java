/*
 * XML Type:  TargetUpdateTerritory
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateTerritory
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateTerritory(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateTerritoryImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateTerritory
{
    
    public TargetUpdateTerritoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERRITORY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Territory");
    
    
    /**
     * Gets the "Territory" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Territory getTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Territory target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Territory)get_store().find_element_user(TERRITORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Territory" element
     */
    public void setTerritory(com.microsoft.schemas.crm._2007.webservices.Territory territory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Territory target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Territory)get_store().find_element_user(TERRITORY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Territory)get_store().add_element_user(TERRITORY$0);
            }
            target.set(territory);
        }
    }
    
    /**
     * Appends and returns a new empty "Territory" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Territory addNewTerritory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Territory target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Territory)get_store().add_element_user(TERRITORY$0);
            return target;
        }
    }
}
