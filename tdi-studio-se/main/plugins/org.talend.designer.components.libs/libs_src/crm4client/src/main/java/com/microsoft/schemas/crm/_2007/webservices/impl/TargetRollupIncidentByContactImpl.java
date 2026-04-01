/*
 * XML Type:  TargetRollupIncidentByContact
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetRollupIncidentByContact
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetRollupIncidentByContact(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetRollupIncidentByContactImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetRollupImpl implements com.microsoft.schemas.crm._2007.webservices.TargetRollupIncidentByContact
{
    
    public TargetRollupIncidentByContactImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ContactId");
    private static final javax.xml.namespace.QName QUERY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Query");
    
    
    /**
     * Gets the "ContactId" element
     */
    public java.lang.String getContactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactId" element
     */
    public com.microsoft.wsdl.types.Guid xgetContactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CONTACTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ContactId" element
     */
    public void setContactId(java.lang.String contactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTID$0);
            }
            target.setStringValue(contactId);
        }
    }
    
    /**
     * Sets (as xml) the "ContactId" element
     */
    public void xsetContactId(com.microsoft.wsdl.types.Guid contactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CONTACTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CONTACTID$0);
            }
            target.set(contactId);
        }
    }
    
    /**
     * Gets the "Query" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(com.microsoft.schemas.crm._2006.query.QueryBase query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$2);
            }
            target.set(query);
        }
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$2);
            return target;
        }
    }
}
