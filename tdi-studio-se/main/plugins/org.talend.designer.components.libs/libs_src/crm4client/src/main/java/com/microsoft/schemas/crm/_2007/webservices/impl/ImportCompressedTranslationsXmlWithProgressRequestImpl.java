/*
 * XML Type:  ImportCompressedTranslationsXmlWithProgressRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ImportCompressedTranslationsXmlWithProgressRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ImportCompressedTranslationsXmlWithProgressRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ImportCompressedTranslationsXmlWithProgressRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ImportCompressedTranslationsXmlWithProgressRequest
{
    
    public ImportCompressedTranslationsXmlWithProgressRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPRESSEDTRANSLATIONSXML$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CompressedTranslationsXml");
    private static final javax.xml.namespace.QName IMPORTJOBID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportJobId");
    
    
    /**
     * Gets the "CompressedTranslationsXml" element
     */
    public byte[] getCompressedTranslationsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSEDTRANSLATIONSXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompressedTranslationsXml" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetCompressedTranslationsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(COMPRESSEDTRANSLATIONSXML$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CompressedTranslationsXml" element
     */
    public void setCompressedTranslationsXml(byte[] compressedTranslationsXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSEDTRANSLATIONSXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPRESSEDTRANSLATIONSXML$0);
            }
            target.setByteArrayValue(compressedTranslationsXml);
        }
    }
    
    /**
     * Sets (as xml) the "CompressedTranslationsXml" element
     */
    public void xsetCompressedTranslationsXml(org.apache.xmlbeans.XmlBase64Binary compressedTranslationsXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(COMPRESSEDTRANSLATIONSXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(COMPRESSEDTRANSLATIONSXML$0);
            }
            target.set(compressedTranslationsXml);
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
