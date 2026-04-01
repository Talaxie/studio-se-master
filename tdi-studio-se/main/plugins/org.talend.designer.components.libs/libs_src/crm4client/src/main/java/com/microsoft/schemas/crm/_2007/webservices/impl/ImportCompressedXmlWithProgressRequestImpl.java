/*
 * XML Type:  ImportCompressedXmlWithProgressRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ImportCompressedXmlWithProgressRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ImportCompressedXmlWithProgressRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ImportCompressedXmlWithProgressRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ImportCompressedXmlWithProgressRequest
{
    
    public ImportCompressedXmlWithProgressRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERXML$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ParameterXml");
    private static final javax.xml.namespace.QName COMPRESSEDCUSTOMIZATIONXML$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CompressedCustomizationXml");
    private static final javax.xml.namespace.QName IMPORTJOBID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportJobId");
    
    
    /**
     * Gets the "ParameterXml" element
     */
    public java.lang.String getParameterXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParameterXml" element
     */
    public org.apache.xmlbeans.XmlString xgetParameterXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERXML$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ParameterXml" element
     */
    public void setParameterXml(java.lang.String parameterXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERXML$0);
            }
            target.setStringValue(parameterXml);
        }
    }
    
    /**
     * Sets (as xml) the "ParameterXml" element
     */
    public void xsetParameterXml(org.apache.xmlbeans.XmlString parameterXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERXML$0);
            }
            target.set(parameterXml);
        }
    }
    
    /**
     * Gets the "CompressedCustomizationXml" element
     */
    public byte[] getCompressedCustomizationXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSEDCUSTOMIZATIONXML$2, 0);
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
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(COMPRESSEDCUSTOMIZATIONXML$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSEDCUSTOMIZATIONXML$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPRESSEDCUSTOMIZATIONXML$2);
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
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(COMPRESSEDCUSTOMIZATIONXML$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(COMPRESSEDCUSTOMIZATIONXML$2);
            }
            target.set(compressedCustomizationXml);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTJOBID$4, 0);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(IMPORTJOBID$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTJOBID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTJOBID$4);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(IMPORTJOBID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(IMPORTJOBID$4);
            }
            target.set(importJobId);
        }
    }
}
