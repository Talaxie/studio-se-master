/*
 * XML Type:  RetrieveFormXmlResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveFormXmlResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveFormXmlResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveFormXmlResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveFormXmlResponse
{
    
    public RetrieveFormXmlResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMXML$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FormXml");
    private static final javax.xml.namespace.QName CUSTOMIZATIONLEVEL$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CustomizationLevel");
    
    
    /**
     * Gets the "FormXml" element
     */
    public java.lang.String getFormXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FormXml" element
     */
    public org.apache.xmlbeans.XmlString xgetFormXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMXML$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FormXml" element
     */
    public void setFormXml(java.lang.String formXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMXML$0);
            }
            target.setStringValue(formXml);
        }
    }
    
    /**
     * Sets (as xml) the "FormXml" element
     */
    public void xsetFormXml(org.apache.xmlbeans.XmlString formXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMXML$0);
            }
            target.set(formXml);
        }
    }
    
    /**
     * Gets the "CustomizationLevel" element
     */
    public int getCustomizationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMIZATIONLEVEL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomizationLevel" element
     */
    public org.apache.xmlbeans.XmlInt xgetCustomizationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMIZATIONLEVEL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CustomizationLevel" element
     */
    public void setCustomizationLevel(int customizationLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMIZATIONLEVEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMIZATIONLEVEL$2);
            }
            target.setIntValue(customizationLevel);
        }
    }
    
    /**
     * Sets (as xml) the "CustomizationLevel" element
     */
    public void xsetCustomizationLevel(org.apache.xmlbeans.XmlInt customizationLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CUSTOMIZATIONLEVEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CUSTOMIZATIONLEVEL$2);
            }
            target.set(customizationLevel);
        }
    }
}
