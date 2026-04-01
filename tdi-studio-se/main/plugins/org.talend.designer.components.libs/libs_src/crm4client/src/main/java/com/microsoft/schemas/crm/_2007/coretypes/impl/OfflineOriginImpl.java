/*
 * XML Type:  OfflineOrigin
 * Namespace: http://schemas.microsoft.com/crm/2007/CoreTypes
 * Java type: com.microsoft.schemas.crm._2007.coretypes.OfflineOrigin
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.coretypes.impl;
/**
 * An XML OfflineOrigin(@http://schemas.microsoft.com/crm/2007/CoreTypes).
 *
 * This is a complex type.
 */
public class OfflineOriginImpl extends com.microsoft.schemas.crm._2007.coretypes.impl.CallerOriginImpl implements com.microsoft.schemas.crm._2007.coretypes.OfflineOrigin
{
    
    public OfflineOriginImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFLINETIMESTAMP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/CoreTypes", "OfflineTimestamp");
    
    
    /**
     * Gets the "OfflineTimestamp" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getOfflineTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OFFLINETIMESTAMP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OfflineTimestamp" element
     */
    public boolean isSetOfflineTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFLINETIMESTAMP$0) != 0;
        }
    }
    
    /**
     * Sets the "OfflineTimestamp" element
     */
    public void setOfflineTimestamp(com.microsoft.schemas.crm._2006.webservices.CrmDateTime offlineTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OFFLINETIMESTAMP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OFFLINETIMESTAMP$0);
            }
            target.set(offlineTimestamp);
        }
    }
    
    /**
     * Appends and returns a new empty "OfflineTimestamp" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewOfflineTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OFFLINETIMESTAMP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "OfflineTimestamp" element
     */
    public void unsetOfflineTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFLINETIMESTAMP$0, 0);
        }
    }
}
