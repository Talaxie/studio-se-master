/*
 * XML Type:  SendEmailRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SendEmailRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SendEmailRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SendEmailRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SendEmailRequest
{
    
    public SendEmailRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAILID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EmailId");
    private static final javax.xml.namespace.QName ISSUESEND$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IssueSend");
    private static final javax.xml.namespace.QName TRACKINGTOKEN$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TrackingToken");
    
    
    /**
     * Gets the "EmailId" element
     */
    public java.lang.String getEmailId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEmailId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(EMAILID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EmailId" element
     */
    public void setEmailId(java.lang.String emailId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILID$0);
            }
            target.setStringValue(emailId);
        }
    }
    
    /**
     * Sets (as xml) the "EmailId" element
     */
    public void xsetEmailId(com.microsoft.wsdl.types.Guid emailId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(EMAILID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(EMAILID$0);
            }
            target.set(emailId);
        }
    }
    
    /**
     * Gets the "IssueSend" element
     */
    public boolean getIssueSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUESEND$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IssueSend" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIssueSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSUESEND$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IssueSend" element
     */
    public void setIssueSend(boolean issueSend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUESEND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUESEND$2);
            }
            target.setBooleanValue(issueSend);
        }
    }
    
    /**
     * Sets (as xml) the "IssueSend" element
     */
    public void xsetIssueSend(org.apache.xmlbeans.XmlBoolean issueSend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSUESEND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSUESEND$2);
            }
            target.set(issueSend);
        }
    }
    
    /**
     * Gets the "TrackingToken" element
     */
    public java.lang.String getTrackingToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGTOKEN$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGTOKEN$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGTOKEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKINGTOKEN$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGTOKEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKINGTOKEN$4);
            }
            target.set(trackingToken);
        }
    }
}
