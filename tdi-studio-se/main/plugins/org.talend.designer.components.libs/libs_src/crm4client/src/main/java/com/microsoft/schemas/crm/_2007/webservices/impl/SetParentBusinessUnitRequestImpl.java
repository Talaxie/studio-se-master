/*
 * XML Type:  SetParentBusinessUnitRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetParentBusinessUnitRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetParentBusinessUnitRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetParentBusinessUnitRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetParentBusinessUnitRequest
{
    
    public SetParentBusinessUnitRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSUNITID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BusinessUnitId");
    private static final javax.xml.namespace.QName PARENTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ParentId");
    
    
    /**
     * Gets the "BusinessUnitId" element
     */
    public java.lang.String getBusinessUnitId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITID$0, 0);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BUSINESSUNITID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSUNITID$0);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(BUSINESSUNITID$0);
            }
            target.set(businessUnitId);
        }
    }
    
    /**
     * Gets the "ParentId" element
     */
    public java.lang.String getParentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentId" element
     */
    public com.microsoft.wsdl.types.Guid xgetParentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PARENTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ParentId" element
     */
    public void setParentId(java.lang.String parentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTID$2);
            }
            target.setStringValue(parentId);
        }
    }
    
    /**
     * Sets (as xml) the "ParentId" element
     */
    public void xsetParentId(com.microsoft.wsdl.types.Guid parentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PARENTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(PARENTID$2);
            }
            target.set(parentId);
        }
    }
}
