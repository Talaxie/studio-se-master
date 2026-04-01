/*
 * An XML document type.
 * Localname: CorrelationToken
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one CorrelationToken(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class CorrelationTokenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CorrelationTokenDocument
{
    
    public CorrelationTokenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONTOKEN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CorrelationToken");
    
    
    /**
     * Gets the "CorrelationToken" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.CorrelationToken getCorrelationToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CorrelationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken)get_store().find_element_user(CORRELATIONTOKEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CorrelationToken" element
     */
    public boolean isNilCorrelationToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CorrelationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken)get_store().find_element_user(CORRELATIONTOKEN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CorrelationToken" element
     */
    public void setCorrelationToken(com.microsoft.schemas.crm._2007.coretypes.CorrelationToken correlationToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CorrelationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken)get_store().find_element_user(CORRELATIONTOKEN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken)get_store().add_element_user(CORRELATIONTOKEN$0);
            }
            target.set(correlationToken);
        }
    }
    
    /**
     * Appends and returns a new empty "CorrelationToken" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.CorrelationToken addNewCorrelationToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CorrelationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken)get_store().add_element_user(CORRELATIONTOKEN$0);
            return target;
        }
    }
    
    /**
     * Nils the "CorrelationToken" element
     */
    public void setNilCorrelationToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CorrelationToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken)get_store().find_element_user(CORRELATIONTOKEN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken)get_store().add_element_user(CORRELATIONTOKEN$0);
            }
            target.setNil();
        }
    }
}
