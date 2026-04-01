/*
 * XML Type:  QualifyMemberListRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.QualifyMemberListRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML QualifyMemberListRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class QualifyMemberListRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.QualifyMemberListRequest
{
    
    public QualifyMemberListRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ListId");
    private static final javax.xml.namespace.QName MEMBERSID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "MembersId");
    private static final javax.xml.namespace.QName OVERRIDEORREMOVE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OverrideorRemove");
    
    
    /**
     * Gets the "ListId" element
     */
    public java.lang.String getListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ListId" element
     */
    public com.microsoft.wsdl.types.Guid xgetListId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(LISTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ListId" element
     */
    public void setListId(java.lang.String listId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTID$0);
            }
            target.setStringValue(listId);
        }
    }
    
    /**
     * Sets (as xml) the "ListId" element
     */
    public void xsetListId(com.microsoft.wsdl.types.Guid listId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(LISTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(LISTID$0);
            }
            target.set(listId);
        }
    }
    
    /**
     * Gets the "MembersId" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getMembersId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(MEMBERSID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MembersId" element
     */
    public void setMembersId(com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid membersId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(MEMBERSID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(MEMBERSID$2);
            }
            target.set(membersId);
        }
    }
    
    /**
     * Appends and returns a new empty "MembersId" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid addNewMembersId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(MEMBERSID$2);
            return target;
        }
    }
    
    /**
     * Gets the "OverrideorRemove" element
     */
    public boolean getOverrideorRemove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDEORREMOVE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OverrideorRemove" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOverrideorRemove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OVERRIDEORREMOVE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OverrideorRemove" element
     */
    public void setOverrideorRemove(boolean overrideorRemove)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDEORREMOVE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERRIDEORREMOVE$4);
            }
            target.setBooleanValue(overrideorRemove);
        }
    }
    
    /**
     * Sets (as xml) the "OverrideorRemove" element
     */
    public void xsetOverrideorRemove(org.apache.xmlbeans.XmlBoolean overrideorRemove)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OVERRIDEORREMOVE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OVERRIDEORREMOVE$4);
            }
            target.set(overrideorRemove);
        }
    }
}
