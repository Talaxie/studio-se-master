/*
 * An XML document type.
 * Localname: CrmFloat
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CrmFloatDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one CrmFloat(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class CrmFloatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CrmFloatDocument
{
    
    public CrmFloatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRMFLOAT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CrmFloat");
    
    
    /**
     * Gets the "CrmFloat" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat getCrmFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(CRMFLOAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CrmFloat" element
     */
    public boolean isNilCrmFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(CRMFLOAT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CrmFloat" element
     */
    public void setCrmFloat(com.microsoft.schemas.crm._2006.webservices.CrmFloat crmFloat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(CRMFLOAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(CRMFLOAT$0);
            }
            target.set(crmFloat);
        }
    }
    
    /**
     * Appends and returns a new empty "CrmFloat" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewCrmFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(CRMFLOAT$0);
            return target;
        }
    }
    
    /**
     * Nils the "CrmFloat" element
     */
    public void setNilCrmFloat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(CRMFLOAT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(CRMFLOAT$0);
            }
            target.setNil();
        }
    }
}
