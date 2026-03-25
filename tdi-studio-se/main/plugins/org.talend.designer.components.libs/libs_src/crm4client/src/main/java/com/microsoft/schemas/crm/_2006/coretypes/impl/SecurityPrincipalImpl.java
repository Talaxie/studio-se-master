/*
 * XML Type:  SecurityPrincipal
 * Namespace: http://schemas.microsoft.com/crm/2006/CoreTypes
 * Java type: com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.coretypes.impl;
/**
 * An XML SecurityPrincipal(@http://schemas.microsoft.com/crm/2006/CoreTypes).
 *
 * This is a complex type.
 */
public class SecurityPrincipalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal
{
    
    public SecurityPrincipalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRINCIPALID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/CoreTypes", "PrincipalId");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/CoreTypes", "Type");
    
    
    /**
     * Gets the "PrincipalId" element
     */
    public java.lang.String getPrincipalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrincipalId" element
     */
    public com.microsoft.wsdl.types.Guid xgetPrincipalId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRINCIPALID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PrincipalId" element
     */
    public void setPrincipalId(java.lang.String principalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRINCIPALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRINCIPALID$0);
            }
            target.setStringValue(principalId);
        }
    }
    
    /**
     * Sets (as xml) the "PrincipalId" element
     */
    public void xsetPrincipalId(com.microsoft.wsdl.types.Guid principalId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRINCIPALID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(PRINCIPALID$0);
            }
            target.set(principalId);
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType)get_store().find_element_user(TYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipalType)get_store().add_element_user(TYPE$2);
            }
            target.set(type);
        }
    }
}
