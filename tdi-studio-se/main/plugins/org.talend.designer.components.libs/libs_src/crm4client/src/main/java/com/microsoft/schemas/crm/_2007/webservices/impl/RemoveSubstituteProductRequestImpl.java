/*
 * XML Type:  RemoveSubstituteProductRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RemoveSubstituteProductRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RemoveSubstituteProductRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RemoveSubstituteProductRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RemoveSubstituteProductRequest
{
    
    public RemoveSubstituteProductRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ProductId");
    private static final javax.xml.namespace.QName SUBSTITUTEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SubstituteId");
    
    
    /**
     * Gets the "ProductId" element
     */
    public java.lang.String getProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductId" element
     */
    public com.microsoft.wsdl.types.Guid xgetProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRODUCTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProductId" element
     */
    public void setProductId(java.lang.String productId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTID$0);
            }
            target.setStringValue(productId);
        }
    }
    
    /**
     * Sets (as xml) the "ProductId" element
     */
    public void xsetProductId(com.microsoft.wsdl.types.Guid productId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRODUCTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(PRODUCTID$0);
            }
            target.set(productId);
        }
    }
    
    /**
     * Gets the "SubstituteId" element
     */
    public java.lang.String getSubstituteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSTITUTEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubstituteId" element
     */
    public com.microsoft.wsdl.types.Guid xgetSubstituteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SUBSTITUTEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SubstituteId" element
     */
    public void setSubstituteId(java.lang.String substituteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSTITUTEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSTITUTEID$2);
            }
            target.setStringValue(substituteId);
        }
    }
    
    /**
     * Sets (as xml) the "SubstituteId" element
     */
    public void xsetSubstituteId(com.microsoft.wsdl.types.Guid substituteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SUBSTITUTEID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SUBSTITUTEID$2);
            }
            target.set(substituteId);
        }
    }
}
