/*
 * An XML document type.
 * Localname: ArrayOfLocLabel
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabelDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one ArrayOfLocLabel(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class ArrayOfLocLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabelDocument
{
    
    public ArrayOfLocLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARRAYOFLOCLABEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ArrayOfLocLabel");
    
    
    /**
     * Gets the "ArrayOfLocLabel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel getArrayOfLocLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().find_element_user(ARRAYOFLOCLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ArrayOfLocLabel" element
     */
    public boolean isNilArrayOfLocLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().find_element_user(ARRAYOFLOCLABEL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ArrayOfLocLabel" element
     */
    public void setArrayOfLocLabel(com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel arrayOfLocLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().find_element_user(ARRAYOFLOCLABEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().add_element_user(ARRAYOFLOCLABEL$0);
            }
            target.set(arrayOfLocLabel);
        }
    }
    
    /**
     * Appends and returns a new empty "ArrayOfLocLabel" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel addNewArrayOfLocLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().add_element_user(ARRAYOFLOCLABEL$0);
            return target;
        }
    }
    
    /**
     * Nils the "ArrayOfLocLabel" element
     */
    public void setNilArrayOfLocLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().find_element_user(ARRAYOFLOCLABEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().add_element_user(ARRAYOFLOCLABEL$0);
            }
            target.setNil();
        }
    }
}
