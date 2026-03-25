/*
 * XML Type:  ExportCompressedAllXmlResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ExportCompressedAllXmlResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ExportCompressedAllXmlResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ExportCompressedAllXmlResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.ExportCompressedAllXmlResponse
{
    
    public ExportCompressedAllXmlResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPORTCOMPRESSEDXML$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ExportCompressedXml");
    
    
    /**
     * Gets the "ExportCompressedXml" element
     */
    public byte[] getExportCompressedXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPORTCOMPRESSEDXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExportCompressedXml" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetExportCompressedXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(EXPORTCOMPRESSEDXML$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExportCompressedXml" element
     */
    public void setExportCompressedXml(byte[] exportCompressedXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPORTCOMPRESSEDXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPORTCOMPRESSEDXML$0);
            }
            target.setByteArrayValue(exportCompressedXml);
        }
    }
    
    /**
     * Sets (as xml) the "ExportCompressedXml" element
     */
    public void xsetExportCompressedXml(org.apache.xmlbeans.XmlBase64Binary exportCompressedXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(EXPORTCOMPRESSEDXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(EXPORTCOMPRESSEDXML$0);
            }
            target.set(exportCompressedXml);
        }
    }
}
