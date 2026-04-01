/*
 * An XML document type.
 * Localname: SecurityPrincipal
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SecurityPrincipalDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one SecurityPrincipal(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class SecurityPrincipalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.SecurityPrincipalDocument
{
    
    public SecurityPrincipalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYPRINCIPAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SecurityPrincipal");
    
    
    /**
     * Gets the "SecurityPrincipal" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal getSecurityPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(SECURITYPRINCIPAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "SecurityPrincipal" element
     */
    public boolean isNilSecurityPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(SECURITYPRINCIPAL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "SecurityPrincipal" element
     */
    public void setSecurityPrincipal(com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal securityPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(SECURITYPRINCIPAL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(SECURITYPRINCIPAL$0);
            }
            target.set(securityPrincipal);
        }
    }
    
    /**
     * Appends and returns a new empty "SecurityPrincipal" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal addNewSecurityPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(SECURITYPRINCIPAL$0);
            return target;
        }
    }
    
    /**
     * Nils the "SecurityPrincipal" element
     */
    public void setNilSecurityPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(SECURITYPRINCIPAL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(SECURITYPRINCIPAL$0);
            }
            target.setNil();
        }
    }
}
