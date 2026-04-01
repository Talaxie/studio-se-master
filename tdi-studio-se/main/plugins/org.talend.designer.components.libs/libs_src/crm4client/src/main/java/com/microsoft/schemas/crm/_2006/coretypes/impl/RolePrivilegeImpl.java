/*
 * XML Type:  RolePrivilege
 * Namespace: http://schemas.microsoft.com/crm/2006/CoreTypes
 * Java type: com.microsoft.schemas.crm._2006.coretypes.RolePrivilege
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.coretypes.impl;
/**
 * An XML RolePrivilege(@http://schemas.microsoft.com/crm/2006/CoreTypes).
 *
 * This is a complex type.
 */
public class RolePrivilegeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.coretypes.RolePrivilege
{
    
    public RolePrivilegeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPTH$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/CoreTypes", "Depth");
    private static final javax.xml.namespace.QName PRIVILEGEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/CoreTypes", "PrivilegeId");
    
    
    /**
     * Gets the "Depth" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth.Enum getDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Depth" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth xgetDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth)get_store().find_element_user(DEPTH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Depth" element
     */
    public void setDepth(com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth.Enum depth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPTH$0);
            }
            target.setEnumValue(depth);
        }
    }
    
    /**
     * Sets (as xml) the "Depth" element
     */
    public void xsetDepth(com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth depth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth)get_store().find_element_user(DEPTH$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.PrivilegeDepth)get_store().add_element_user(DEPTH$0);
            }
            target.set(depth);
        }
    }
    
    /**
     * Gets the "PrivilegeId" element
     */
    public java.lang.String getPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrivilegeId" element
     */
    public com.microsoft.wsdl.types.Guid xgetPrivilegeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRIVILEGEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PrivilegeId" element
     */
    public void setPrivilegeId(java.lang.String privilegeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVILEGEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVILEGEID$2);
            }
            target.setStringValue(privilegeId);
        }
    }
    
    /**
     * Sets (as xml) the "PrivilegeId" element
     */
    public void xsetPrivilegeId(com.microsoft.wsdl.types.Guid privilegeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRIVILEGEID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(PRIVILEGEID$2);
            }
            target.set(privilegeId);
        }
    }
}
