/*
 * XML Type:  RetrievePrincipalAccessResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrievePrincipalAccessResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrievePrincipalAccessResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrievePrincipalAccessResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrievePrincipalAccessResponse
{
    
    public RetrievePrincipalAccessResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSRIGHTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AccessRights");
    
    
    /**
     * Gets the "AccessRights" element
     */
    public java.util.List getAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccessRights" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.AccessRights xgetAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.AccessRights)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AccessRights" element
     */
    public void setAccessRights(java.util.List accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSRIGHTS$0);
            }
            target.setListValue(accessRights);
        }
    }
    
    /**
     * Sets (as xml) the "AccessRights" element
     */
    public void xsetAccessRights(com.microsoft.schemas.crm._2006.coretypes.AccessRights accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.AccessRights target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.AccessRights)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.AccessRights)get_store().add_element_user(ACCESSRIGHTS$0);
            }
            target.set(accessRights);
        }
    }
}
