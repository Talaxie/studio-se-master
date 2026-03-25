/*
 * XML Type:  SetStateMailMergeTemplateRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateMailMergeTemplateRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateMailMergeTemplateRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateMailMergeTemplateRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateMailMergeTemplateRequest
{
    
    public SetStateMailMergeTemplateRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName MAILMERGETEMPLATESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "MailMergeTemplateState");
    private static final javax.xml.namespace.QName MAILMERGETEMPLATESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "MailMergeTemplateStatus");
    
    
    /**
     * Gets the "EntityId" element
     */
    public java.lang.String getEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EntityId" element
     */
    public void setEntityId(java.lang.String entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
            }
            target.setStringValue(entityId);
        }
    }
    
    /**
     * Sets (as xml) the "EntityId" element
     */
    public void xsetEntityId(com.microsoft.wsdl.types.Guid entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityId);
        }
    }
    
    /**
     * Gets the "MailMergeTemplateState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState.Enum getMailMergeTemplateState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILMERGETEMPLATESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MailMergeTemplateState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState xgetMailMergeTemplateState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState)get_store().find_element_user(MAILMERGETEMPLATESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MailMergeTemplateState" element
     */
    public void setMailMergeTemplateState(com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState.Enum mailMergeTemplateState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILMERGETEMPLATESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAILMERGETEMPLATESTATE$2);
            }
            target.setEnumValue(mailMergeTemplateState);
        }
    }
    
    /**
     * Sets (as xml) the "MailMergeTemplateState" element
     */
    public void xsetMailMergeTemplateState(com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState mailMergeTemplateState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState)get_store().find_element_user(MAILMERGETEMPLATESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateState)get_store().add_element_user(MAILMERGETEMPLATESTATE$2);
            }
            target.set(mailMergeTemplateState);
        }
    }
    
    /**
     * Gets the "MailMergeTemplateStatus" element
     */
    public int getMailMergeTemplateStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILMERGETEMPLATESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MailMergeTemplateStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetMailMergeTemplateStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAILMERGETEMPLATESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MailMergeTemplateStatus" element
     */
    public void setMailMergeTemplateStatus(int mailMergeTemplateStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILMERGETEMPLATESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAILMERGETEMPLATESTATUS$4);
            }
            target.setIntValue(mailMergeTemplateStatus);
        }
    }
    
    /**
     * Sets (as xml) the "MailMergeTemplateStatus" element
     */
    public void xsetMailMergeTemplateStatus(org.apache.xmlbeans.XmlInt mailMergeTemplateStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAILMERGETEMPLATESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAILMERGETEMPLATESTATUS$4);
            }
            target.set(mailMergeTemplateStatus);
        }
    }
}
