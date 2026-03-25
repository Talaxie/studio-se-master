/*
 * XML Type:  GetReportHistoryLimitResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.GetReportHistoryLimitResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML GetReportHistoryLimitResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class GetReportHistoryLimitResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.GetReportHistoryLimitResponse
{
    
    public GetReportHistoryLimitResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HISTORYLIMIT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "HistoryLimit");
    
    
    /**
     * Gets the "HistoryLimit" element
     */
    public int getHistoryLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORYLIMIT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HistoryLimit" element
     */
    public org.apache.xmlbeans.XmlInt xgetHistoryLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HISTORYLIMIT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HistoryLimit" element
     */
    public void setHistoryLimit(int historyLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORYLIMIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HISTORYLIMIT$0);
            }
            target.setIntValue(historyLimit);
        }
    }
    
    /**
     * Sets (as xml) the "HistoryLimit" element
     */
    public void xsetHistoryLimit(org.apache.xmlbeans.XmlInt historyLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HISTORYLIMIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HISTORYLIMIT$0);
            }
            target.set(historyLimit);
        }
    }
}
