/*
 * XML Type:  TargetCreateMailMergeTemplate
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateMailMergeTemplate
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateMailMergeTemplate(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateMailMergeTemplateImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateMailMergeTemplate
{
    
    public TargetCreateMailMergeTemplateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAILMERGETEMPLATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "MailMergeTemplate");
    
    
    /**
     * Gets the "MailMergeTemplate" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate getMailMergeTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate)get_store().find_element_user(MAILMERGETEMPLATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MailMergeTemplate" element
     */
    public void setMailMergeTemplate(com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate mailMergeTemplate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate)get_store().find_element_user(MAILMERGETEMPLATE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate)get_store().add_element_user(MAILMERGETEMPLATE$0);
            }
            target.set(mailMergeTemplate);
        }
    }
    
    /**
     * Appends and returns a new empty "MailMergeTemplate" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate addNewMailMergeTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate)get_store().add_element_user(MAILMERGETEMPLATE$0);
            return target;
        }
    }
}
