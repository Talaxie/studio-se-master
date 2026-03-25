/*
 * XML Type:  SetBusinessSystemUserRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetBusinessSystemUserRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetBusinessSystemUserRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetBusinessSystemUserRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetBusinessSystemUserRequest
{
    
    public SetBusinessSystemUserRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UserId");
    private static final javax.xml.namespace.QName BUSINESSID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BusinessId");
    private static final javax.xml.namespace.QName REASSIGNPRINCIPAL$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ReassignPrincipal");
    
    
    /**
     * Gets the "UserId" element
     */
    public java.lang.String getUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserId" element
     */
    public com.microsoft.wsdl.types.Guid xgetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(USERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserId" element
     */
    public void setUserId(java.lang.String userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
            }
            target.setStringValue(userId);
        }
    }
    
    /**
     * Sets (as xml) the "UserId" element
     */
    public void xsetUserId(com.microsoft.wsdl.types.Guid userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(USERID$0);
            }
            target.set(userId);
        }
    }
    
    /**
     * Gets the "BusinessId" element
     */
    public java.lang.String getBusinessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BusinessId" element
     */
    public com.microsoft.wsdl.types.Guid xgetBusinessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BUSINESSID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BusinessId" element
     */
    public void setBusinessId(java.lang.String businessId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUSINESSID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUSINESSID$2);
            }
            target.setStringValue(businessId);
        }
    }
    
    /**
     * Sets (as xml) the "BusinessId" element
     */
    public void xsetBusinessId(com.microsoft.wsdl.types.Guid businessId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BUSINESSID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(BUSINESSID$2);
            }
            target.set(businessId);
        }
    }
    
    /**
     * Gets the "ReassignPrincipal" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal getReassignPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(REASSIGNPRINCIPAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReassignPrincipal" element
     */
    public void setReassignPrincipal(com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal reassignPrincipal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().find_element_user(REASSIGNPRINCIPAL$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(REASSIGNPRINCIPAL$4);
            }
            target.set(reassignPrincipal);
        }
    }
    
    /**
     * Appends and returns a new empty "ReassignPrincipal" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal addNewReassignPrincipal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.SecurityPrincipal)get_store().add_element_user(REASSIGNPRINCIPAL$4);
            return target;
        }
    }
}
