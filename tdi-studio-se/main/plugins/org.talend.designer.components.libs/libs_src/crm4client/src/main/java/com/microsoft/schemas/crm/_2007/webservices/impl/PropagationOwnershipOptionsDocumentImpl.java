/*
 * An XML document type.
 * Localname: PropagationOwnershipOptions
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.PropagationOwnershipOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one PropagationOwnershipOptions(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class PropagationOwnershipOptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.PropagationOwnershipOptionsDocument
{
    
    public PropagationOwnershipOptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPAGATIONOWNERSHIPOPTIONS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PropagationOwnershipOptions");
    
    
    /**
     * Gets the "PropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum getPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PropagationOwnershipOptions" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions xgetPropagationOwnershipOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions)get_store().find_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PropagationOwnershipOptions" element
     */
    public void setPropagationOwnershipOptions(com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum propagationOwnershipOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPAGATIONOWNERSHIPOPTIONS$0);
            }
            target.setEnumValue(propagationOwnershipOptions);
        }
    }
    
    /**
     * Sets (as xml) the "PropagationOwnershipOptions" element
     */
    public void xsetPropagationOwnershipOptions(com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions propagationOwnershipOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions)get_store().find_element_user(PROPAGATIONOWNERSHIPOPTIONS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions)get_store().add_element_user(PROPAGATIONOWNERSHIPOPTIONS$0);
            }
            target.set(propagationOwnershipOptions);
        }
    }
}
