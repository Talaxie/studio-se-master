/*
 * XML Type:  GetTimeZoneCodeByLocalizedNameResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.GetTimeZoneCodeByLocalizedNameResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML GetTimeZoneCodeByLocalizedNameResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class GetTimeZoneCodeByLocalizedNameResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.GetTimeZoneCodeByLocalizedNameResponse
{
    
    public GetTimeZoneCodeByLocalizedNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEZONECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TimeZoneCode");
    
    
    /**
     * Gets the "TimeZoneCode" element
     */
    public int getTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONECODE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TimeZoneCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMEZONECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TimeZoneCode" element
     */
    public void setTimeZoneCode(int timeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEZONECODE$0);
            }
            target.setIntValue(timeZoneCode);
        }
    }
    
    /**
     * Sets (as xml) the "TimeZoneCode" element
     */
    public void xsetTimeZoneCode(org.apache.xmlbeans.XmlInt timeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMEZONECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIMEZONECODE$0);
            }
            target.set(timeZoneCode);
        }
    }
}
