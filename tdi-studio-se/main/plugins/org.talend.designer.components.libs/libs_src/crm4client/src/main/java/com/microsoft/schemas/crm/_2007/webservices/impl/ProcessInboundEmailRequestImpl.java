/*
 * XML Type:  ProcessInboundEmailRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ProcessInboundEmailRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ProcessInboundEmailRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ProcessInboundEmailRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ProcessInboundEmailRequest
{
    
    public ProcessInboundEmailRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INBOUNDEMAILACTIVITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "InboundEmailActivity");
    
    
    /**
     * Gets the "InboundEmailActivity" element
     */
    public java.lang.String getInboundEmailActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUNDEMAILACTIVITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InboundEmailActivity" element
     */
    public com.microsoft.wsdl.types.Guid xgetInboundEmailActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(INBOUNDEMAILACTIVITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InboundEmailActivity" element
     */
    public void setInboundEmailActivity(java.lang.String inboundEmailActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INBOUNDEMAILACTIVITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INBOUNDEMAILACTIVITY$0);
            }
            target.setStringValue(inboundEmailActivity);
        }
    }
    
    /**
     * Sets (as xml) the "InboundEmailActivity" element
     */
    public void xsetInboundEmailActivity(com.microsoft.wsdl.types.Guid inboundEmailActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(INBOUNDEMAILACTIVITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(INBOUNDEMAILACTIVITY$0);
            }
            target.set(inboundEmailActivity);
        }
    }
}
