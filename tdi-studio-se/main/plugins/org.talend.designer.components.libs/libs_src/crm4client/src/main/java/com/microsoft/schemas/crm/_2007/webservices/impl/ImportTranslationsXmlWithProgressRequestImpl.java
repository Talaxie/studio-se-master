/*
 * XML Type:  ImportTranslationsXmlWithProgressRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ImportTranslationsXmlWithProgressRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ImportTranslationsXmlWithProgressRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ImportTranslationsXmlWithProgressRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ImportTranslationsXmlWithProgressRequest
{
    
    public ImportTranslationsXmlWithProgressRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTXML$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportXml");
    private static final javax.xml.namespace.QName IMPORTJOBID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportJobId");
    
    
    /**
     * Gets the "ImportXml" element
     */
    public java.lang.String getImportXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportXml" element
     */
    public org.apache.xmlbeans.XmlString xgetImportXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTXML$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImportXml" element
     */
    public void setImportXml(java.lang.String importXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTXML$0);
            }
            target.setStringValue(importXml);
        }
    }
    
    /**
     * Sets (as xml) the "ImportXml" element
     */
    public void xsetImportXml(org.apache.xmlbeans.XmlString importXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMPORTXML$0);
            }
            target.set(importXml);
        }
    }
    
    /**
     * Gets the "ImportJobId" element
     */
    public java.lang.String getImportJobId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTJOBID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportJobId" element
     */
    public com.microsoft.wsdl.types.Guid xgetImportJobId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(IMPORTJOBID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImportJobId" element
     */
    public void setImportJobId(java.lang.String importJobId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTJOBID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTJOBID$2);
            }
            target.setStringValue(importJobId);
        }
    }
    
    /**
     * Sets (as xml) the "ImportJobId" element
     */
    public void xsetImportJobId(com.microsoft.wsdl.types.Guid importJobId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(IMPORTJOBID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(IMPORTJOBID$2);
            }
            target.set(importJobId);
        }
    }
}
