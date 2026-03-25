/*
 * An XML document type.
 * Localname: CrmLabel
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CrmLabelDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one CrmLabel(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class CrmLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CrmLabelDocument
{
    
    public CrmLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRMLABEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CrmLabel");
    
    
    /**
     * Gets the "CrmLabel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CrmLabel getCrmLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CrmLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().find_element_user(CRMLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CrmLabel" element
     */
    public boolean isNilCrmLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CrmLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().find_element_user(CRMLABEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CrmLabel" element
     */
    public void setCrmLabel(com.microsoft.schemas.crm._2007.webservices.CrmLabel crmLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CrmLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().find_element_user(CRMLABEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().add_element_user(CRMLABEL$0);
            }
            target.set(crmLabel);
        }
    }
    
    /**
     * Appends and returns a new empty "CrmLabel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CrmLabel addNewCrmLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CrmLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().add_element_user(CRMLABEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "CrmLabel" element
     */
    public void setNilCrmLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CrmLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().find_element_user(CRMLABEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().add_element_user(CRMLABEL$0);
            }
            target.setNil();
        }
    }
}
