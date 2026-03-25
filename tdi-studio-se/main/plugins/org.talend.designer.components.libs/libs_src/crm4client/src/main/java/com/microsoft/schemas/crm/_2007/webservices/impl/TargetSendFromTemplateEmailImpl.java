/*
 * XML Type:  TargetSendFromTemplateEmail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetSendFromTemplateEmail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetSendFromTemplateEmail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetSendFromTemplateEmailImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetSendFromTemplateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetSendFromTemplateEmail
{
    
    public TargetSendFromTemplateEmailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Email");
    
    
    /**
     * Gets the "Email" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Email getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Email target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Email)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(com.microsoft.schemas.crm._2007.webservices.Email email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Email target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Email)get_store().find_element_user(EMAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Email)get_store().add_element_user(EMAIL$0);
            }
            target.set(email);
        }
    }
    
    /**
     * Appends and returns a new empty "Email" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Email addNewEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Email target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Email)get_store().add_element_user(EMAIL$0);
            return target;
        }
    }
}
