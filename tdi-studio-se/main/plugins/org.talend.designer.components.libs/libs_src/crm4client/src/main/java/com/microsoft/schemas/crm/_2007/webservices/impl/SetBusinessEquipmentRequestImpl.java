/*
 * XML Type:  SetBusinessEquipmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetBusinessEquipmentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetBusinessEquipmentRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetBusinessEquipmentRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetBusinessEquipmentRequest
{
    
    public SetBusinessEquipmentRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQUIPMENTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EquipmentId");
    private static final javax.xml.namespace.QName BUSINESSUNITID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BusinessUnitId");
    
    
    /**
     * Gets the "EquipmentId" element
     */
    public java.lang.String getEquipmentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIPMENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EquipmentId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEquipmentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(EQUIPMENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EquipmentId" element
     */
    public void setEquipmentId(java.lang.String equipmentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIPMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EQUIPMENTID$0);
            }
            target.setStringValue(equipmentId);
        }
    }
    
    /**
     * Sets (as xml) the "EquipmentId" element
     */
    public void xsetEquipmentId(com.microsoft.wsdl.types.Guid equipmentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(EQUIPMENTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(EQUIPMENTID$0);
            }
            target.set(equipmentId);
        }
    }
    
    /**
     * Gets the "BusinessUnitId" element
     */
    public java.lang.String getBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessUnitId" element
     */
    public com.microsoft.wsdl.types.Guid xgetBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BUSINESSUNITID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BusinessUnitId" element
     */
    public void setBusinessUnitId(java.lang.String businessUnitId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSUNITID$2);
            }
            target.setStringValue(businessUnitId);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessUnitId" element
     */
    public void xsetBusinessUnitId(com.microsoft.wsdl.types.Guid businessUnitId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BUSINESSUNITID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(BUSINESSUNITID$2);
            }
            target.set(businessUnitId);
        }
    }
}
