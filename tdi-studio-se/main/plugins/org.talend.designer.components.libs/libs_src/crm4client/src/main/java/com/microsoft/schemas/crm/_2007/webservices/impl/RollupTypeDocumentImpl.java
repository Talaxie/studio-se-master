/*
 * An XML document type.
 * Localname: RollupType
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RollupTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one RollupType(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class RollupTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RollupTypeDocument
{
    
    public RollupTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLLUPTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RollupType");
    
    
    /**
     * Gets the "RollupType" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.RollupType.Enum getRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLLUPTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.coretypes.RollupType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RollupType" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.RollupType xgetRollupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RollupType target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RollupType)get_store().find_element_user(ROLLUPTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RollupType" element
     */
    public void setRollupType(com.microsoft.schemas.crm._2006.coretypes.RollupType.Enum rollupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLLUPTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLLUPTYPE$0);
            }
            target.setEnumValue(rollupType);
        }
    }
    
    /**
     * Sets (as xml) the "RollupType" element
     */
    public void xsetRollupType(com.microsoft.schemas.crm._2006.coretypes.RollupType rollupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RollupType target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RollupType)get_store().find_element_user(ROLLUPTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.RollupType)get_store().add_element_user(ROLLUPTYPE$0);
            }
            target.set(rollupType);
        }
    }
}
