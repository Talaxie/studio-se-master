/*
 * XML Type:  GetQuantityDecimalRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.GetQuantityDecimalRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML GetQuantityDecimalRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class GetQuantityDecimalRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.GetQuantityDecimalRequest
{
    
    public GetQuantityDecimalRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Target");
    private static final javax.xml.namespace.QName PRODUCTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ProductId");
    private static final javax.xml.namespace.QName UOMID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UoMId");
    
    
    /**
     * Gets the "Target" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TargetQuantify getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetQuantify target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetQuantify)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Target" element
     */
    public void setTarget(com.microsoft.schemas.crm._2007.webservices.TargetQuantify targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetQuantify target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetQuantify)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.TargetQuantify)get_store().add_element_user(TARGET$0);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TargetQuantify addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetQuantify target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetQuantify)get_store().add_element_user(TARGET$0);
            return target;
        }
    }
    
    /**
     * Gets the "ProductId" element
     */
    public java.lang.String getProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$2, 0);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRODUCTID$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTID$2);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PRODUCTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(PRODUCTID$2);
            }
            target.set(productId);
        }
    }
    
    /**
     * Gets the "UoMId" element
     */
    public java.lang.String getUoMId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UOMID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UoMId" element
     */
    public com.microsoft.wsdl.types.Guid xgetUoMId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(UOMID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UoMId" element
     */
    public void setUoMId(java.lang.String uoMId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UOMID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UOMID$4);
            }
            target.setStringValue(uoMId);
        }
    }
    
    /**
     * Sets (as xml) the "UoMId" element
     */
    public void xsetUoMId(com.microsoft.wsdl.types.Guid uoMId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(UOMID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(UOMID$4);
            }
            target.set(uoMId);
        }
    }
}
