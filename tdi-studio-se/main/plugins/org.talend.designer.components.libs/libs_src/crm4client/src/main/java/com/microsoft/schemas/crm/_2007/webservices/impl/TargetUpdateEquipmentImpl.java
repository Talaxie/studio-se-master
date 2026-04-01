/*
 * XML Type:  TargetUpdateEquipment
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateEquipment
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateEquipment(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateEquipmentImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateEquipment
{
    
    public TargetUpdateEquipmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQUIPMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Equipment");
    
    
    /**
     * Gets the "Equipment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Equipment getEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Equipment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Equipment)get_store().find_element_user(EQUIPMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Equipment" element
     */
    public void setEquipment(com.microsoft.schemas.crm._2007.webservices.Equipment equipment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Equipment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Equipment)get_store().find_element_user(EQUIPMENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Equipment)get_store().add_element_user(EQUIPMENT$0);
            }
            target.set(equipment);
        }
    }
    
    /**
     * Appends and returns a new empty "Equipment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Equipment addNewEquipment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Equipment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Equipment)get_store().add_element_user(EQUIPMENT$0);
            return target;
        }
    }
}
