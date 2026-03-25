/*
 * XML Type:  TargetCreateSubject
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateSubject
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateSubject(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateSubjectImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateSubject
{
    
    public TargetCreateSubjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Subject");
    
    
    /**
     * Gets the "Subject" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Subject getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Subject target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Subject)get_store().find_element_user(SUBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subject" element
     */
    public void setSubject(com.microsoft.schemas.crm._2007.webservices.Subject subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Subject target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Subject)get_store().find_element_user(SUBJECT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Subject)get_store().add_element_user(SUBJECT$0);
            }
            target.set(subject);
        }
    }
    
    /**
     * Appends and returns a new empty "Subject" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Subject addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Subject target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Subject)get_store().add_element_user(SUBJECT$0);
            return target;
        }
    }
}
