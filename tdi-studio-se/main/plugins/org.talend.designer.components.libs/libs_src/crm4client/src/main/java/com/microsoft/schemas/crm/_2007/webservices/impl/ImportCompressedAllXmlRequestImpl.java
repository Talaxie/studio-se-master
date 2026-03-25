/*
 * XML Type:  ImportCompressedAllXmlRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ImportCompressedAllXmlRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ImportCompressedAllXmlRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ImportCompressedAllXmlRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ImportCompressedAllXmlRequest
{
    
    public ImportCompressedAllXmlRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPRESSEDCUSTOMIZATIONXML$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CompressedCustomizationXml");
    
    
    /**
     * Gets the "CompressedCustomizationXml" element
     */
    public byte[] getCompressedCustomizationXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSEDCUSTOMIZATIONXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompressedCustomizationXml" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetCompressedCustomizationXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(COMPRESSEDCUSTOMIZATIONXML$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CompressedCustomizationXml" element
     */
    public void setCompressedCustomizationXml(byte[] compressedCustomizationXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSEDCUSTOMIZATIONXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPRESSEDCUSTOMIZATIONXML$0);
            }
            target.setByteArrayValue(compressedCustomizationXml);
        }
    }
    
    /**
     * Sets (as xml) the "CompressedCustomizationXml" element
     */
    public void xsetCompressedCustomizationXml(org.apache.xmlbeans.XmlBase64Binary compressedCustomizationXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(COMPRESSEDCUSTOMIZATIONXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(COMPRESSEDCUSTOMIZATIONXML$0);
            }
            target.set(compressedCustomizationXml);
        }
    }
}
