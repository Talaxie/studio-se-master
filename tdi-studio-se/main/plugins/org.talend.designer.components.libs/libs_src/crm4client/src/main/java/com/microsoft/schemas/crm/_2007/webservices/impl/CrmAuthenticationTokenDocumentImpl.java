/*
 * An XML document type.
 * Localname: CrmAuthenticationToken
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one CrmAuthenticationToken(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class CrmAuthenticationTokenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CrmAuthenticationTokenDocument
{
    
    public CrmAuthenticationTokenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRMAUTHENTICATIONTOKEN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CrmAuthenticationToken");
    
    
    /**
     * Gets the "CrmAuthenticationToken" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken getCrmAuthenticationToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken)get_store().find_element_user(CRMAUTHENTICATIONTOKEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CrmAuthenticationToken" element
     */
    public boolean isNilCrmAuthenticationToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken)get_store().find_element_user(CRMAUTHENTICATIONTOKEN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CrmAuthenticationToken" element
     */
    public void setCrmAuthenticationToken(com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken crmAuthenticationToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken)get_store().find_element_user(CRMAUTHENTICATIONTOKEN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken)get_store().add_element_user(CRMAUTHENTICATIONTOKEN$0);
            }
            target.set(crmAuthenticationToken);
        }
    }
    
    /**
     * Appends and returns a new empty "CrmAuthenticationToken" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken addNewCrmAuthenticationToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken)get_store().add_element_user(CRMAUTHENTICATIONTOKEN$0);
            return target;
        }
    }
    
    /**
     * Nils the "CrmAuthenticationToken" element
     */
    public void setNilCrmAuthenticationToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken)get_store().find_element_user(CRMAUTHENTICATIONTOKEN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken)get_store().add_element_user(CRMAUTHENTICATIONTOKEN$0);
            }
            target.setNil();
        }
    }
}
