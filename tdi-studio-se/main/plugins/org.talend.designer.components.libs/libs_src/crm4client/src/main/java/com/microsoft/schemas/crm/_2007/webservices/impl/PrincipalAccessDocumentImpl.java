/*
 * An XML document type.
 * Localname: PrincipalAccess
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.PrincipalAccessDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one PrincipalAccess(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class PrincipalAccessDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.PrincipalAccessDocument
{
    
    public PrincipalAccessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRINCIPALACCESS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PrincipalAccess");
    
    
    /**
     * Gets the "PrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess getPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PrincipalAccess" element
     */
    public boolean isNilPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PrincipalAccess" element
     */
    public void setPrincipalAccess(com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess principalAccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().add_element_user(PRINCIPALACCESS$0);
            }
            target.set(principalAccess);
        }
    }
    
    /**
     * Appends and returns a new empty "PrincipalAccess" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess addNewPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().add_element_user(PRINCIPALACCESS$0);
            return target;
        }
    }
    
    /**
     * Nils the "PrincipalAccess" element
     */
    public void setNilPrincipalAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().find_element_user(PRINCIPALACCESS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.PrincipalAccess)get_store().add_element_user(PRINCIPALACCESS$0);
            }
            target.setNil();
        }
    }
}
