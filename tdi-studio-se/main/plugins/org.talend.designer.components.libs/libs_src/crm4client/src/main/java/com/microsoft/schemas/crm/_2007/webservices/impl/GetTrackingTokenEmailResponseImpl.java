/*
 * XML Type:  GetTrackingTokenEmailResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.GetTrackingTokenEmailResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML GetTrackingTokenEmailResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class GetTrackingTokenEmailResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.GetTrackingTokenEmailResponse
{
    
    public GetTrackingTokenEmailResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRACKINGTOKEN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TrackingToken");
    
    
    /**
     * Gets the "TrackingToken" element
     */
    public java.lang.String getTrackingToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGTOKEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrackingToken" element
     */
    public org.apache.xmlbeans.XmlString xgetTrackingToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGTOKEN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TrackingToken" element
     */
    public void setTrackingToken(java.lang.String trackingToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGTOKEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKINGTOKEN$0);
            }
            target.setStringValue(trackingToken);
        }
    }
    
    /**
     * Sets (as xml) the "TrackingToken" element
     */
    public void xsetTrackingToken(org.apache.xmlbeans.XmlString trackingToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGTOKEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKINGTOKEN$0);
            }
            target.set(trackingToken);
        }
    }
}
