/*
 * XML Type:  ColumnSet
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.ColumnSet
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML ColumnSet(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class ColumnSetImpl extends com.microsoft.schemas.crm._2006.query.impl.ColumnSetBaseImpl implements com.microsoft.schemas.crm._2006.query.ColumnSet
{
    
    public ColumnSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Attributes");
    
    
    /**
     * Gets the "Attributes" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfString getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfString)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$0) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(com.microsoft.schemas.crm._2006.query.ArrayOfString attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfString)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfString)get_store().add_element_user(ATTRIBUTES$0);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfString addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfString)get_store().add_element_user(ATTRIBUTES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$0, 0);
        }
    }
}
