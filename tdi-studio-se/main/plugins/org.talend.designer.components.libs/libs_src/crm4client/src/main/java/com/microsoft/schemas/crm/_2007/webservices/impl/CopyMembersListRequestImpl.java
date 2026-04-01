/*
 * XML Type:  CopyMembersListRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CopyMembersListRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML CopyMembersListRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CopyMembersListRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.CopyMembersListRequest
{
    
    public CopyMembersListRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCELISTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SourceListId");
    private static final javax.xml.namespace.QName TARGETLISTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TargetListId");
    
    
    /**
     * Gets the "SourceListId" element
     */
    public java.lang.String getSourceListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELISTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceListId" element
     */
    public com.microsoft.wsdl.types.Guid xgetSourceListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SOURCELISTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SourceListId" element
     */
    public void setSourceListId(java.lang.String sourceListId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELISTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCELISTID$0);
            }
            target.setStringValue(sourceListId);
        }
    }
    
    /**
     * Sets (as xml) the "SourceListId" element
     */
    public void xsetSourceListId(com.microsoft.wsdl.types.Guid sourceListId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SOURCELISTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SOURCELISTID$0);
            }
            target.set(sourceListId);
        }
    }
    
    /**
     * Gets the "TargetListId" element
     */
    public java.lang.String getTargetListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETLISTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetListId" element
     */
    public com.microsoft.wsdl.types.Guid xgetTargetListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TARGETLISTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TargetListId" element
     */
    public void setTargetListId(java.lang.String targetListId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETLISTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETLISTID$2);
            }
            target.setStringValue(targetListId);
        }
    }
    
    /**
     * Sets (as xml) the "TargetListId" element
     */
    public void xsetTargetListId(com.microsoft.wsdl.types.Guid targetListId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TARGETLISTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(TARGETLISTID$2);
            }
            target.set(targetListId);
        }
    }
}
