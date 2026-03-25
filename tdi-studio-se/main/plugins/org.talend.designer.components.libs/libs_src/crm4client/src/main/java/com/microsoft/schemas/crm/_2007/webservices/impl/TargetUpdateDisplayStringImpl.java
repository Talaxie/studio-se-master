/*
 * XML Type:  TargetUpdateDisplayString
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateDisplayString
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateDisplayString(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateDisplayStringImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateDisplayString
{
    
    public TargetUpdateDisplayStringImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYSTRING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "DisplayString");
    
    
    /**
     * Gets the "DisplayString" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Displaystring getDisplayString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Displaystring target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Displaystring)get_store().find_element_user(DISPLAYSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DisplayString" element
     */
    public void setDisplayString(com.microsoft.schemas.crm._2007.webservices.Displaystring displayString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Displaystring target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Displaystring)get_store().find_element_user(DISPLAYSTRING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Displaystring)get_store().add_element_user(DISPLAYSTRING$0);
            }
            target.set(displayString);
        }
    }
    
    /**
     * Appends and returns a new empty "DisplayString" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Displaystring addNewDisplayString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Displaystring target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Displaystring)get_store().add_element_user(DISPLAYSTRING$0);
            return target;
        }
    }
}
