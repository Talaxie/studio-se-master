/*
 * XML Type:  CheckPromoteEmailResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CheckPromoteEmailResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML CheckPromoteEmailResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CheckPromoteEmailResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.CheckPromoteEmailResponse
{
    
    public CheckPromoteEmailResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHOULDPROMOTE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ShouldPromote");
    private static final javax.xml.namespace.QName REASONCODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ReasonCode");
    
    
    /**
     * Gets the "ShouldPromote" element
     */
    public boolean getShouldPromote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOULDPROMOTE$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ShouldPromote" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetShouldPromote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHOULDPROMOTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ShouldPromote" element
     */
    public void setShouldPromote(boolean shouldPromote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOULDPROMOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHOULDPROMOTE$0);
            }
            target.setBooleanValue(shouldPromote);
        }
    }
    
    /**
     * Sets (as xml) the "ShouldPromote" element
     */
    public void xsetShouldPromote(org.apache.xmlbeans.XmlBoolean shouldPromote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHOULDPROMOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SHOULDPROMOTE$0);
            }
            target.set(shouldPromote);
        }
    }
    
    /**
     * Gets the "ReasonCode" element
     */
    public int getReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReasonCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REASONCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReasonCode" element
     */
    public void setReasonCode(int reasonCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASONCODE$2);
            }
            target.setIntValue(reasonCode);
        }
    }
    
    /**
     * Sets (as xml) the "ReasonCode" element
     */
    public void xsetReasonCode(org.apache.xmlbeans.XmlInt reasonCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REASONCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(REASONCODE$2);
            }
            target.set(reasonCode);
        }
    }
}
