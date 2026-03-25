/*
 * XML Type:  TargetUpdateContact
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateContact
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateContact(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateContactImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateContact
{
    
    public TargetUpdateContactImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Contact");
    
    
    /**
     * Gets the "Contact" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Contact getContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contact target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contact)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Contact" element
     */
    public void setContact(com.microsoft.schemas.crm._2007.webservices.Contact contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contact target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contact)get_store().find_element_user(CONTACT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Contact)get_store().add_element_user(CONTACT$0);
            }
            target.set(contact);
        }
    }
    
    /**
     * Appends and returns a new empty "Contact" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Contact addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contact target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contact)get_store().add_element_user(CONTACT$0);
            return target;
        }
    }
}
