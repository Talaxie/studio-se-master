/*
 * XML Type:  PrincipalAccess
 * Namespace: http://schemas.microsoft.com/crm/2006/CoreTypes
 * Java type: com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.coretypes.impl;
/**
 * An XML PrincipalAccess(@http://schemas.microsoft.com/crm/2006/CoreTypes).
 *
 * This is a complex type.
 */
public class PrincipalAccessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess
{
    
    public PrincipalAccessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRINCIPAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/CoreTypes", "Principal");
    private static final javax.xml.namespace.QName ACCESSMASK$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/CoreTypes", "AccessMask");
    
    
    /**
     * Gets the "Principal" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal getPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(PRINCIPAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Principal" element
     */
    public boolean isSetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRINCIPAL$0) != 0;
        }
    }
    
    /**
     * Sets the "Principal" element
     */
    public void setPrincipal(com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal principal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(PRINCIPAL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(PRINCIPAL$0);
            }
            target.set(principal);
        }
    }
    
    /**
     * Appends and returns a new empty "Principal" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal addNewPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(PRINCIPAL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Principal" element
     */
    public void unsetPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRINCIPAL$0, 0);
        }
    }
    
    /**
     * Gets the "AccessMask" element
     */
    public java.util.List getAccessMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSMASK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccessMask" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.AccessRights xgetAccessMask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.AccessRights)get_store().find_element_user(ACCESSMASK$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AccessMask" element
     */
    public void setAccessMask(java.util.List accessMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSMASK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSMASK$2);
            }
            target.setListValue(accessMask);
        }
    }
    
    /**
     * Sets (as xml) the "AccessMask" element
     */
    public void xsetAccessMask(com.microsoft.schemas.crm._2006.coretypes.AccessRights accessMask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.AccessRights)get_store().find_element_user(ACCESSMASK$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.AccessRights)get_store().add_element_user(ACCESSMASK$2);
            }
            target.set(accessMask);
        }
    }
}
