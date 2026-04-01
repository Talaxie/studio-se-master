/*
 * XML Type:  BulkDetectDuplicatesRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.BulkDetectDuplicatesRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML BulkDetectDuplicatesRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class BulkDetectDuplicatesRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.BulkDetectDuplicatesRequest
{
    
    public BulkDetectDuplicatesRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Query");
    private static final javax.xml.namespace.QName JOBNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "JobName");
    private static final javax.xml.namespace.QName SENDEMAILNOTIFICATION$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SendEmailNotification");
    private static final javax.xml.namespace.QName TEMPLATEID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TemplateId");
    private static final javax.xml.namespace.QName TORECIPIENTS$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ToRecipients");
    private static final javax.xml.namespace.QName CCRECIPIENTS$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CCRecipients");
    private static final javax.xml.namespace.QName RECURRENCEPATTERN$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RecurrencePattern");
    private static final javax.xml.namespace.QName RECURRENCESTARTTIME$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RecurrenceStartTime");
    
    
    /**
     * Gets the "Query" element
     */
    public com.microsoft.schemas.crm._2006.query.QueryBase getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.QueryBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$0, 0);
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
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$0);
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
            target = (com.microsoft.schemas.crm._2006.query.QueryBase)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
    
    /**
     * Gets the "JobName" element
     */
    public java.lang.String getJobName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JobName" element
     */
    public org.apache.xmlbeans.XmlString xgetJobName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "JobName" element
     */
    public void setJobName(java.lang.String jobName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBNAME$2);
            }
            target.setStringValue(jobName);
        }
    }
    
    /**
     * Sets (as xml) the "JobName" element
     */
    public void xsetJobName(org.apache.xmlbeans.XmlString jobName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBNAME$2);
            }
            target.set(jobName);
        }
    }
    
    /**
     * Gets the "SendEmailNotification" element
     */
    public boolean getSendEmailNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDEMAILNOTIFICATION$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendEmailNotification" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendEmailNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDEMAILNOTIFICATION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SendEmailNotification" element
     */
    public void setSendEmailNotification(boolean sendEmailNotification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDEMAILNOTIFICATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDEMAILNOTIFICATION$4);
            }
            target.setBooleanValue(sendEmailNotification);
        }
    }
    
    /**
     * Sets (as xml) the "SendEmailNotification" element
     */
    public void xsetSendEmailNotification(org.apache.xmlbeans.XmlBoolean sendEmailNotification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDEMAILNOTIFICATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDEMAILNOTIFICATION$4);
            }
            target.set(sendEmailNotification);
        }
    }
    
    /**
     * Gets the "TemplateId" element
     */
    public java.lang.String getTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TemplateId" element
     */
    public com.microsoft.wsdl.types.Guid xgetTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEMPLATEID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TemplateId" element
     */
    public void setTemplateId(java.lang.String templateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPLATEID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPLATEID$6);
            }
            target.setStringValue(templateId);
        }
    }
    
    /**
     * Sets (as xml) the "TemplateId" element
     */
    public void xsetTemplateId(com.microsoft.wsdl.types.Guid templateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEMPLATEID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(TEMPLATEID$6);
            }
            target.set(templateId);
        }
    }
    
    /**
     * Gets the "ToRecipients" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getToRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(TORECIPIENTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ToRecipients" element
     */
    public void setToRecipients(com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid toRecipients)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(TORECIPIENTS$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(TORECIPIENTS$8);
            }
            target.set(toRecipients);
        }
    }
    
    /**
     * Appends and returns a new empty "ToRecipients" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid addNewToRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(TORECIPIENTS$8);
            return target;
        }
    }
    
    /**
     * Gets the "CCRecipients" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getCCRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(CCRECIPIENTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CCRecipients" element
     */
    public void setCCRecipients(com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid ccRecipients)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(CCRECIPIENTS$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(CCRECIPIENTS$10);
            }
            target.set(ccRecipients);
        }
    }
    
    /**
     * Appends and returns a new empty "CCRecipients" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid addNewCCRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(CCRECIPIENTS$10);
            return target;
        }
    }
    
    /**
     * Gets the "RecurrencePattern" element
     */
    public java.lang.String getRecurrencePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEPATTERN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecurrencePattern" element
     */
    public org.apache.xmlbeans.XmlString xgetRecurrencePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECURRENCEPATTERN$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RecurrencePattern" element
     */
    public void setRecurrencePattern(java.lang.String recurrencePattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEPATTERN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECURRENCEPATTERN$12);
            }
            target.setStringValue(recurrencePattern);
        }
    }
    
    /**
     * Sets (as xml) the "RecurrencePattern" element
     */
    public void xsetRecurrencePattern(org.apache.xmlbeans.XmlString recurrencePattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECURRENCEPATTERN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECURRENCEPATTERN$12);
            }
            target.set(recurrencePattern);
        }
    }
    
    /**
     * Gets the "RecurrenceStartTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getRecurrenceStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(RECURRENCESTARTTIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RecurrenceStartTime" element
     */
    public void setRecurrenceStartTime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime recurrenceStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(RECURRENCESTARTTIME$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(RECURRENCESTARTTIME$14);
            }
            target.set(recurrenceStartTime);
        }
    }
    
    /**
     * Appends and returns a new empty "RecurrenceStartTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewRecurrenceStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(RECURRENCESTARTTIME$14);
            return target;
        }
    }
}
