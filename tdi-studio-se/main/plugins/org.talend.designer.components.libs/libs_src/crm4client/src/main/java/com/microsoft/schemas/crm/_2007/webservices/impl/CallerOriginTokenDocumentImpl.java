/*
 * An XML document type.
 * Localname: CallerOriginToken
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one CallerOriginToken(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class CallerOriginTokenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.CallerOriginTokenDocument
{
    
    public CallerOriginTokenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLERORIGINTOKEN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CallerOriginToken");
    
    
    /**
     * Gets the "CallerOriginToken" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken getCallerOriginToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken)get_store().find_element_user(CALLERORIGINTOKEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CallerOriginToken" element
     */
    public boolean isNilCallerOriginToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken)get_store().find_element_user(CALLERORIGINTOKEN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CallerOriginToken" element
     */
    public void setCallerOriginToken(com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken callerOriginToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken)get_store().find_element_user(CALLERORIGINTOKEN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken)get_store().add_element_user(CALLERORIGINTOKEN$0);
            }
            target.set(callerOriginToken);
        }
    }
    
    /**
     * Appends and returns a new empty "CallerOriginToken" element
     */
    public com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken addNewCallerOriginToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken)get_store().add_element_user(CALLERORIGINTOKEN$0);
            return target;
        }
    }
    
    /**
     * Nils the "CallerOriginToken" element
     */
    public void setNilCallerOriginToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken target = null;
            target = (com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken)get_store().find_element_user(CALLERORIGINTOKEN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.coretypes.CallerOriginToken)get_store().add_element_user(CALLERORIGINTOKEN$0);
            }
            target.setNil();
        }
    }
}
