/*
 * XML Type:  GetTimeZoneCodeByLocalizedNameRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.GetTimeZoneCodeByLocalizedNameRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML GetTimeZoneCodeByLocalizedNameRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class GetTimeZoneCodeByLocalizedNameRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.GetTimeZoneCodeByLocalizedNameRequest
{
    
    public GetTimeZoneCodeByLocalizedNameRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALIZEDSTANDARDNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "LocalizedStandardName");
    private static final javax.xml.namespace.QName LOCALEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "LocaleId");
    
    
    /**
     * Gets the "LocalizedStandardName" element
     */
    public java.lang.String getLocalizedStandardName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALIZEDSTANDARDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocalizedStandardName" element
     */
    public org.apache.xmlbeans.XmlString xgetLocalizedStandardName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALIZEDSTANDARDNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LocalizedStandardName" element
     */
    public void setLocalizedStandardName(java.lang.String localizedStandardName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALIZEDSTANDARDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALIZEDSTANDARDNAME$0);
            }
            target.setStringValue(localizedStandardName);
        }
    }
    
    /**
     * Sets (as xml) the "LocalizedStandardName" element
     */
    public void xsetLocalizedStandardName(org.apache.xmlbeans.XmlString localizedStandardName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALIZEDSTANDARDNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALIZEDSTANDARDNAME$0);
            }
            target.set(localizedStandardName);
        }
    }
    
    /**
     * Gets the "LocaleId" element
     */
    public int getLocaleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALEID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocaleId" element
     */
    public org.apache.xmlbeans.XmlInt xgetLocaleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LOCALEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LocaleId" element
     */
    public void setLocaleId(int localeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALEID$2);
            }
            target.setIntValue(localeId);
        }
    }
    
    /**
     * Sets (as xml) the "LocaleId" element
     */
    public void xsetLocaleId(org.apache.xmlbeans.XmlInt localeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LOCALEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LOCALEID$2);
            }
            target.set(localeId);
        }
    }
}
