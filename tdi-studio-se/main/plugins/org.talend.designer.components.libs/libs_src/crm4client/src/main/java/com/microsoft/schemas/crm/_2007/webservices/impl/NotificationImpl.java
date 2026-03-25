/*
 * XML Type:  notification
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Notification
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML notification(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class NotificationImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Notification
{
    
    public NotificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEDON$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CREATEDONSTRING$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdonstring");
    private static final javax.xml.namespace.QName EVENTDATA$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "eventdata");
    private static final javax.xml.namespace.QName EVENTID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "eventid");
    private static final javax.xml.namespace.QName NOTIFICATIONID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "notificationid");
    private static final javax.xml.namespace.QName NOTIFICATIONNUMBER$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "notificationnumber");
    private static final javax.xml.namespace.QName ORGANIZATIONID$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    
    
    /**
     * Gets the "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdon" element
     */
    public boolean isSetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDON$0) != 0;
        }
    }
    
    /**
     * Sets the "createdon" element
     */
    public void setCreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime createdon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$0);
            }
            target.set(createdon);
        }
    }
    
    /**
     * Appends and returns a new empty "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$0);
            return target;
        }
    }
    
    /**
     * Unsets the "createdon" element
     */
    public void unsetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDON$0, 0);
        }
    }
    
    /**
     * Gets the "createdonstring" element
     */
    public java.lang.String getCreatedonstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDONSTRING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "createdonstring" element
     */
    public org.apache.xmlbeans.XmlString xgetCreatedonstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDONSTRING$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "createdonstring" element
     */
    public boolean isSetCreatedonstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDONSTRING$2) != 0;
        }
    }
    
    /**
     * Sets the "createdonstring" element
     */
    public void setCreatedonstring(java.lang.String createdonstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDONSTRING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDONSTRING$2);
            }
            target.setStringValue(createdonstring);
        }
    }
    
    /**
     * Sets (as xml) the "createdonstring" element
     */
    public void xsetCreatedonstring(org.apache.xmlbeans.XmlString createdonstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATEDONSTRING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATEDONSTRING$2);
            }
            target.set(createdonstring);
        }
    }
    
    /**
     * Unsets the "createdonstring" element
     */
    public void unsetCreatedonstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDONSTRING$2, 0);
        }
    }
    
    /**
     * Gets the "eventdata" element
     */
    public java.lang.String getEventdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eventdata" element
     */
    public org.apache.xmlbeans.XmlString xgetEventdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTDATA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "eventdata" element
     */
    public boolean isSetEventdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDATA$4) != 0;
        }
    }
    
    /**
     * Sets the "eventdata" element
     */
    public void setEventdata(java.lang.String eventdata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTDATA$4);
            }
            target.setStringValue(eventdata);
        }
    }
    
    /**
     * Sets (as xml) the "eventdata" element
     */
    public void xsetEventdata(org.apache.xmlbeans.XmlString eventdata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTDATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTDATA$4);
            }
            target.set(eventdata);
        }
    }
    
    /**
     * Unsets the "eventdata" element
     */
    public void unsetEventdata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDATA$4, 0);
        }
    }
    
    /**
     * Gets the "eventid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getEventid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(EVENTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "eventid" element
     */
    public boolean isSetEventid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTID$6) != 0;
        }
    }
    
    /**
     * Sets the "eventid" element
     */
    public void setEventid(com.microsoft.schemas.crm._2006.webservices.CrmNumber eventid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(EVENTID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(EVENTID$6);
            }
            target.set(eventid);
        }
    }
    
    /**
     * Appends and returns a new empty "eventid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewEventid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(EVENTID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "eventid" element
     */
    public void unsetEventid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTID$6, 0);
        }
    }
    
    /**
     * Gets the "notificationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getNotificationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(NOTIFICATIONID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notificationid" element
     */
    public boolean isSetNotificationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONID$8) != 0;
        }
    }
    
    /**
     * Sets the "notificationid" element
     */
    public void setNotificationid(com.microsoft.schemas.crm._2006.webservices.Key notificationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(NOTIFICATIONID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(NOTIFICATIONID$8);
            }
            target.set(notificationid);
        }
    }
    
    /**
     * Appends and returns a new empty "notificationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewNotificationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(NOTIFICATIONID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "notificationid" element
     */
    public void unsetNotificationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONID$8, 0);
        }
    }
    
    /**
     * Gets the "notificationnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getNotificationnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NOTIFICATIONNUMBER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notificationnumber" element
     */
    public boolean isSetNotificationnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONNUMBER$10) != 0;
        }
    }
    
    /**
     * Sets the "notificationnumber" element
     */
    public void setNotificationnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber notificationnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NOTIFICATIONNUMBER$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NOTIFICATIONNUMBER$10);
            }
            target.set(notificationnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "notificationnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNotificationnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NOTIFICATIONNUMBER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "notificationnumber" element
     */
    public void unsetNotificationnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONNUMBER$10, 0);
        }
    }
    
    /**
     * Gets the "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ORGANIZATIONID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organizationid" element
     */
    public boolean isSetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONID$12) != 0;
        }
    }
    
    /**
     * Sets the "organizationid" element
     */
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Key organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ORGANIZATIONID$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ORGANIZATIONID$12);
            }
            target.set(organizationid);
        }
    }
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ORGANIZATIONID$12);
            return target;
        }
    }
    
    /**
     * Unsets the "organizationid" element
     */
    public void unsetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONID$12, 0);
        }
    }
}
