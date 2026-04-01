/*
 * XML Type:  IsValidStateTransitionResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.IsValidStateTransitionResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML IsValidStateTransitionResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class IsValidStateTransitionResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.IsValidStateTransitionResponse
{
    
    public IsValidStateTransitionResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISVALID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IsValid");
    
    
    /**
     * Gets the "IsValid" element
     */
    public boolean getIsValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALID$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsValid" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsValid" element
     */
    public void setIsValid(boolean isValid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVALID$0);
            }
            target.setBooleanValue(isValid);
        }
    }
    
    /**
     * Sets (as xml) the "IsValid" element
     */
    public void xsetIsValid(org.apache.xmlbeans.XmlBoolean isValid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISVALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISVALID$0);
            }
            target.set(isValid);
        }
    }
}
