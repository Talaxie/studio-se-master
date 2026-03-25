/*
 * XML Type:  IsBackOfficeInstalledResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.IsBackOfficeInstalledResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML IsBackOfficeInstalledResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class IsBackOfficeInstalledResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.IsBackOfficeInstalledResponse
{
    
    public IsBackOfficeInstalledResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISINSTALLED$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IsInstalled");
    
    
    /**
     * Gets the "IsInstalled" element
     */
    public boolean getIsInstalled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISINSTALLED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsInstalled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsInstalled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINSTALLED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsInstalled" element
     */
    public void setIsInstalled(boolean isInstalled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISINSTALLED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISINSTALLED$0);
            }
            target.setBooleanValue(isInstalled);
        }
    }
    
    /**
     * Sets (as xml) the "IsInstalled" element
     */
    public void xsetIsInstalled(org.apache.xmlbeans.XmlBoolean isInstalled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISINSTALLED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISINSTALLED$0);
            }
            target.set(isInstalled);
        }
    }
}
