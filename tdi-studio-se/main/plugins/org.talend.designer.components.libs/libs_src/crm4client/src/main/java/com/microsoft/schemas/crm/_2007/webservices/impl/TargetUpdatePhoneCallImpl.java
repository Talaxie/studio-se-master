/*
 * XML Type:  TargetUpdatePhoneCall
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdatePhoneCall
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdatePhoneCall(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdatePhoneCallImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdatePhoneCall
{
    
    public TargetUpdatePhoneCallImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHONECALL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PhoneCall");
    
    
    /**
     * Gets the "PhoneCall" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Phonecall getPhoneCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Phonecall target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Phonecall)get_store().find_element_user(PHONECALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PhoneCall" element
     */
    public void setPhoneCall(com.microsoft.schemas.crm._2007.webservices.Phonecall phoneCall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Phonecall target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Phonecall)get_store().find_element_user(PHONECALL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Phonecall)get_store().add_element_user(PHONECALL$0);
            }
            target.set(phoneCall);
        }
    }
    
    /**
     * Appends and returns a new empty "PhoneCall" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Phonecall addNewPhoneCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Phonecall target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Phonecall)get_store().add_element_user(PHONECALL$0);
            return target;
        }
    }
}
