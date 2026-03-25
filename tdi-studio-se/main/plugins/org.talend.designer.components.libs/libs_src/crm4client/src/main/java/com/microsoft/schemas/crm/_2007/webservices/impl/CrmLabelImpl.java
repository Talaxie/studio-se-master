/*
 * XML Type:  CrmLabel
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CrmLabel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML CrmLabel(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CrmLabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CrmLabel
{
    
    public CrmLabelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCLABELS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "LocLabels");
    private static final javax.xml.namespace.QName USERLOCLABEL$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UserLocLabel");
    
    
    /**
     * Gets the "LocLabels" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel getLocLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().find_element_user(LOCLABELS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocLabels" element
     */
    public boolean isSetLocLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCLABELS$0) != 0;
        }
    }
    
    /**
     * Sets the "LocLabels" element
     */
    public void setLocLabels(com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel locLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().find_element_user(LOCLABELS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().add_element_user(LOCLABELS$0);
            }
            target.set(locLabels);
        }
    }
    
    /**
     * Appends and returns a new empty "LocLabels" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel addNewLocLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().add_element_user(LOCLABELS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "LocLabels" element
     */
    public void unsetLocLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCLABELS$0, 0);
        }
    }
    
    /**
     * Gets the "UserLocLabel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LocLabel getUserLocLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().find_element_user(USERLOCLABEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UserLocLabel" element
     */
    public boolean isSetUserLocLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERLOCLABEL$2) != 0;
        }
    }
    
    /**
     * Sets the "UserLocLabel" element
     */
    public void setUserLocLabel(com.microsoft.schemas.crm._2007.webservices.LocLabel userLocLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().find_element_user(USERLOCLABEL$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().add_element_user(USERLOCLABEL$2);
            }
            target.set(userLocLabel);
        }
    }
    
    /**
     * Appends and returns a new empty "UserLocLabel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LocLabel addNewUserLocLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LocLabel)get_store().add_element_user(USERLOCLABEL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "UserLocLabel" element
     */
    public void unsetUserLocLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERLOCLABEL$2, 0);
        }
    }
}
