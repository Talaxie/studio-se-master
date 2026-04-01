/*
 * An XML document type.
 * Localname: TargetFieldType
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetFieldTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one TargetFieldType(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class TargetFieldTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.TargetFieldTypeDocument
{
    
    public TargetFieldTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETFIELDTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TargetFieldType");
    
    
    /**
     * Gets the "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2006.webservices.TargetFieldType.Enum getTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.webservices.TargetFieldType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2006.webservices.TargetFieldType xgetTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TargetFieldType" element
     */
    public void setTargetFieldType(com.microsoft.schemas.crm._2006.webservices.TargetFieldType.Enum targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETFIELDTYPE$0);
            }
            target.setEnumValue(targetFieldType);
        }
    }
    
    /**
     * Sets (as xml) the "TargetFieldType" element
     */
    public void xsetTargetFieldType(com.microsoft.schemas.crm._2006.webservices.TargetFieldType targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.TargetFieldType)get_store().add_element_user(TARGETFIELDTYPE$0);
            }
            target.set(targetFieldType);
        }
    }
}
