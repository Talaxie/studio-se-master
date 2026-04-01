/*
 * An XML document type.
 * Localname: ColumnSetBase
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ColumnSetBaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ColumnSetBase(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ColumnSetBaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ColumnSetBaseDocument
{
    
    public ColumnSetBaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNSETBASE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ColumnSetBase");
    
    
    /**
     * Gets the "ColumnSetBase" element
     */
    public com.microsoft.schemas.crm._2006.query.ColumnSetBase getColumnSetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSETBASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ColumnSetBase" element
     */
    public boolean isNilColumnSetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSETBASE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ColumnSetBase" element
     */
    public void setColumnSetBase(com.microsoft.schemas.crm._2006.query.ColumnSetBase columnSetBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSETBASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().add_element_user(COLUMNSETBASE$0);
            }
            target.set(columnSetBase);
        }
    }
    
    /**
     * Appends and returns a new empty "ColumnSetBase" element
     */
    public com.microsoft.schemas.crm._2006.query.ColumnSetBase addNewColumnSetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().add_element_user(COLUMNSETBASE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ColumnSetBase" element
     */
    public void setNilColumnSetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSETBASE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().add_element_user(COLUMNSETBASE$0);
            }
            target.setNil();
        }
    }
}
