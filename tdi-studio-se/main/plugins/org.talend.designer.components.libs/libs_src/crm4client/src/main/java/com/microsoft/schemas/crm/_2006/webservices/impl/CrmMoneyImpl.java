/*
 * XML Type:  CrmMoney
 * Namespace: http://schemas.microsoft.com/crm/2006/WebServices
 * Java type: com.microsoft.schemas.crm._2006.webservices.CrmMoney
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.webservices.impl;
/**
 * An XML CrmMoney(@http://schemas.microsoft.com/crm/2006/WebServices).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.crm._2006.webservices.CrmMoney.
 */
public class CrmMoneyImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements com.microsoft.schemas.crm._2006.webservices.CrmMoney
{
    
    public CrmMoneyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CrmMoneyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ISNULL$0 = 
        new javax.xml.namespace.QName("", "IsNull");
    private static final javax.xml.namespace.QName FORMATTEDVALUE$2 = 
        new javax.xml.namespace.QName("", "formattedvalue");
    
    
    /**
     * Gets the "IsNull" attribute
     */
    public boolean getIsNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNULL$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsNull" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISNULL$0);
            return target;
        }
    }
    
    /**
     * True if has "IsNull" attribute
     */
    public boolean isSetIsNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISNULL$0) != null;
        }
    }
    
    /**
     * Sets the "IsNull" attribute
     */
    public void setIsNull(boolean isNull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNULL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISNULL$0);
            }
            target.setBooleanValue(isNull);
        }
    }
    
    /**
     * Sets (as xml) the "IsNull" attribute
     */
    public void xsetIsNull(org.apache.xmlbeans.XmlBoolean isNull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISNULL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISNULL$0);
            }
            target.set(isNull);
        }
    }
    
    /**
     * Unsets the "IsNull" attribute
     */
    public void unsetIsNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISNULL$0);
        }
    }
    
    /**
     * Gets the "formattedvalue" attribute
     */
    public java.lang.String getFormattedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATTEDVALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formattedvalue" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFormattedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMATTEDVALUE$2);
            return target;
        }
    }
    
    /**
     * True if has "formattedvalue" attribute
     */
    public boolean isSetFormattedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMATTEDVALUE$2) != null;
        }
    }
    
    /**
     * Sets the "formattedvalue" attribute
     */
    public void setFormattedvalue(java.lang.String formattedvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATTEDVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATTEDVALUE$2);
            }
            target.setStringValue(formattedvalue);
        }
    }
    
    /**
     * Sets (as xml) the "formattedvalue" attribute
     */
    public void xsetFormattedvalue(org.apache.xmlbeans.XmlString formattedvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMATTEDVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMATTEDVALUE$2);
            }
            target.set(formattedvalue);
        }
    }
    
    /**
     * Unsets the "formattedvalue" attribute
     */
    public void unsetFormattedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMATTEDVALUE$2);
        }
    }
}
