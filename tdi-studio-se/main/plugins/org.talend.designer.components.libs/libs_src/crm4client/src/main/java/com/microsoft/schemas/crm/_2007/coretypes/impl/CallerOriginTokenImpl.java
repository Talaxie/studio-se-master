/*
 * XML Type:  CallerOriginToken
 * Namespace: http://schemas.microsoft.com/crm/2007/CoreTypes
 * Java type: com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.coretypes.impl;
/**
 * An XML CallerOriginToken(@http://schemas.microsoft.com/crm/2007/CoreTypes).
 *
 * This is a complex type.
 */
public class CallerOriginTokenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken
{
    
    public CallerOriginTokenImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLERORIGIN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/CoreTypes", "CallerOrigin");
    
    
    /**
     * Gets the "CallerOrigin" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.CallerOrigin getCallerOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CallerOrigin target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CallerOrigin)get_store().find_element_user(CALLERORIGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CallerOrigin" element
     */
    public boolean isSetCallerOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLERORIGIN$0) != 0;
        }
    }
    
    /**
     * Sets the "CallerOrigin" element
     */
    public void setCallerOrigin(com.microsoft.schemas.crm._2007.coretypes.CallerOrigin callerOrigin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CallerOrigin target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CallerOrigin)get_store().find_element_user(CALLERORIGIN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.coretypes.CallerOrigin)get_store().add_element_user(CALLERORIGIN$0);
            }
            target.set(callerOrigin);
        }
    }
    
    /**
     * Appends and returns a new empty "CallerOrigin" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.CallerOrigin addNewCallerOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CallerOrigin target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CallerOrigin)get_store().add_element_user(CALLERORIGIN$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CallerOrigin" element
     */
    public void unsetCallerOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLERORIGIN$0, 0);
        }
    }
}
