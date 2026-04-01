/*
 * XML Type:  ConvertQuoteToSalesOrderRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ConvertQuoteToSalesOrderRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ConvertQuoteToSalesOrderRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ConvertQuoteToSalesOrderRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.ConvertQuoteToSalesOrderRequest
{
    
    public ConvertQuoteToSalesOrderRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUOTEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QuoteId");
    private static final javax.xml.namespace.QName COLUMNSET$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ColumnSet");
    private static final javax.xml.namespace.QName RETURNDYNAMICENTITIES$4 = 
        new javax.xml.namespace.QName("", "ReturnDynamicEntities");
    
    
    /**
     * Gets the "QuoteId" element
     */
    public java.lang.String getQuoteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "QuoteId" element
     */
    public com.microsoft.wsdl.types.Guid xgetQuoteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(QUOTEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QuoteId" element
     */
    public void setQuoteId(java.lang.String quoteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUOTEID$0);
            }
            target.setStringValue(quoteId);
        }
    }
    
    /**
     * Sets (as xml) the "QuoteId" element
     */
    public void xsetQuoteId(com.microsoft.wsdl.types.Guid quoteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(QUOTEID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(QUOTEID$0);
            }
            target.set(quoteId);
        }
    }
    
    /**
     * Gets the "ColumnSet" element
     */
    public com.microsoft.schemas.crm._2006.query.ColumnSetBase getColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ColumnSet" element
     */
    public void setColumnSet(com.microsoft.schemas.crm._2006.query.ColumnSetBase columnSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSET$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().add_element_user(COLUMNSET$2);
            }
            target.set(columnSet);
        }
    }
    
    /**
     * Appends and returns a new empty "ColumnSet" element
     */
    public com.microsoft.schemas.crm._2006.query.ColumnSetBase addNewColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().add_element_user(COLUMNSET$2);
            return target;
        }
    }
    
    /**
     * Gets the "ReturnDynamicEntities" attribute
     */
    public boolean getReturnDynamicEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNDYNAMICENTITIES$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReturnDynamicEntities" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReturnDynamicEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNDYNAMICENTITIES$4);
            return target;
        }
    }
    
    /**
     * Sets the "ReturnDynamicEntities" attribute
     */
    public void setReturnDynamicEntities(boolean returnDynamicEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNDYNAMICENTITIES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURNDYNAMICENTITIES$4);
            }
            target.setBooleanValue(returnDynamicEntities);
        }
    }
    
    /**
     * Sets (as xml) the "ReturnDynamicEntities" attribute
     */
    public void xsetReturnDynamicEntities(org.apache.xmlbeans.XmlBoolean returnDynamicEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNDYNAMICENTITIES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RETURNDYNAMICENTITIES$4);
            }
            target.set(returnDynamicEntities);
        }
    }
}
