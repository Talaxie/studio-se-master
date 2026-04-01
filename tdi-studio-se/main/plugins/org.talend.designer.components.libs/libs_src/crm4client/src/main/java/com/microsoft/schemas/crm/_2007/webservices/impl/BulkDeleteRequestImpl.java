/*
 * XML Type:  BulkDeleteRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML BulkDeleteRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class BulkDeleteRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest
{
    
    public BulkDeleteRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYSET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "QuerySet");
    private static final javax.xml.namespace.QName JOBNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "JobName");
    private static final javax.xml.namespace.QName SENDEMAILNOTIFICATION$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SendEmailNotification");
    private static final javax.xml.namespace.QName TORECIPIENTS$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ToRecipients");
    private static final javax.xml.namespace.QName CCRECIPIENTS$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CCRecipients");
    private static final javax.xml.namespace.QName RECURRENCEPATTERN$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RecurrencePattern");
    private static final javax.xml.namespace.QName STARTDATETIME$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "StartDateTime");
    
    
    /**
     * Gets the "QuerySet" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase getQuerySet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().find_element_user(QUERYSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuerySet" element
     */
    public void setQuerySet(com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase querySet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().find_element_user(QUERYSET$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().add_element_user(QUERYSET$0);
            }
            target.set(querySet);
        }
    }
    
    /**
     * Appends and returns a new empty "QuerySet" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase addNewQuerySet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase)get_store().add_element_user(QUERYSET$0);
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
     * Gets the "ToRecipients" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getToRecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(TORECIPIENTS$6, 0);
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
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(TORECIPIENTS$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(TORECIPIENTS$6);
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
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(TORECIPIENTS$6);
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
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(CCRECIPIENTS$8, 0);
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
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(CCRECIPIENTS$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(CCRECIPIENTS$8);
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
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(CCRECIPIENTS$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEPATTERN$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECURRENCEPATTERN$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEPATTERN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECURRENCEPATTERN$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECURRENCEPATTERN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECURRENCEPATTERN$10);
            }
            target.set(recurrencePattern);
        }
    }
    
    /**
     * Gets the "StartDateTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(STARTDATETIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StartDateTime" element
     */
    public void setStartDateTime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime startDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(STARTDATETIME$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(STARTDATETIME$12);
            }
            target.set(startDateTime);
        }
    }
    
    /**
     * Appends and returns a new empty "StartDateTime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStartDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(STARTDATETIME$12);
            return target;
        }
    }
}
