/*
 * XML Type:  RetrieveLicenseInfoResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveLicenseInfoResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveLicenseInfoResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveLicenseInfoResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveLicenseInfoResponse
{
    
    public RetrieveLicenseInfoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AVAILABLECOUNT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AvailableCount");
    private static final javax.xml.namespace.QName GRANTEDLICENSECOUNT$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "GrantedLicenseCount");
    
    
    /**
     * Gets the "AvailableCount" element
     */
    public int getAvailableCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLECOUNT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AvailableCount" element
     */
    public org.apache.xmlbeans.XmlInt xgetAvailableCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AVAILABLECOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AvailableCount" element
     */
    public void setAvailableCount(int availableCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLECOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVAILABLECOUNT$0);
            }
            target.setIntValue(availableCount);
        }
    }
    
    /**
     * Sets (as xml) the "AvailableCount" element
     */
    public void xsetAvailableCount(org.apache.xmlbeans.XmlInt availableCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AVAILABLECOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(AVAILABLECOUNT$0);
            }
            target.set(availableCount);
        }
    }
    
    /**
     * Gets the "GrantedLicenseCount" element
     */
    public int getGrantedLicenseCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRANTEDLICENSECOUNT$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "GrantedLicenseCount" element
     */
    public org.apache.xmlbeans.XmlInt xgetGrantedLicenseCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GRANTEDLICENSECOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GrantedLicenseCount" element
     */
    public void setGrantedLicenseCount(int grantedLicenseCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRANTEDLICENSECOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRANTEDLICENSECOUNT$2);
            }
            target.setIntValue(grantedLicenseCount);
        }
    }
    
    /**
     * Sets (as xml) the "GrantedLicenseCount" element
     */
    public void xsetGrantedLicenseCount(org.apache.xmlbeans.XmlInt grantedLicenseCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(GRANTEDLICENSECOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(GRANTEDLICENSECOUNT$2);
            }
            target.set(grantedLicenseCount);
        }
    }
}
