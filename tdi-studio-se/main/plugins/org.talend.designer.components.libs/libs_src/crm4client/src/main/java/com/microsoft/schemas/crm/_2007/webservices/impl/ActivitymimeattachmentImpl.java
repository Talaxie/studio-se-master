/*
 * XML Type:  activitymimeattachment
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML activitymimeattachment(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ActivitymimeattachmentImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment
{
    
    public ActivitymimeattachmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "activityid");
    private static final javax.xml.namespace.QName ACTIVITYMIMEATTACHMENTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "activitymimeattachmentid");
    private static final javax.xml.namespace.QName ATTACHMENTNUMBER$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "attachmentnumber");
    private static final javax.xml.namespace.QName BODY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "body");
    private static final javax.xml.namespace.QName FILENAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "filename");
    private static final javax.xml.namespace.QName FILESIZE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "filesize");
    private static final javax.xml.namespace.QName MIMETYPE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "mimetype");
    private static final javax.xml.namespace.QName SUBJECT$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subject");
    
    
    /**
     * Gets the "activityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getActivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activityid" element
     */
    public boolean isSetActivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYID$0) != 0;
        }
    }
    
    /**
     * Sets the "activityid" element
     */
    public void setActivityid(com.microsoft.schemas.crm._2006.webservices.Lookup activityid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ACTIVITYID$0);
            }
            target.set(activityid);
        }
    }
    
    /**
     * Appends and returns a new empty "activityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewActivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ACTIVITYID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "activityid" element
     */
    public void unsetActivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYID$0, 0);
        }
    }
    
    /**
     * Gets the "activitymimeattachmentid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getActivitymimeattachmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ACTIVITYMIMEATTACHMENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activitymimeattachmentid" element
     */
    public boolean isSetActivitymimeattachmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYMIMEATTACHMENTID$2) != 0;
        }
    }
    
    /**
     * Sets the "activitymimeattachmentid" element
     */
    public void setActivitymimeattachmentid(com.microsoft.schemas.crm._2006.webservices.Key activitymimeattachmentid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ACTIVITYMIMEATTACHMENTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ACTIVITYMIMEATTACHMENTID$2);
            }
            target.set(activitymimeattachmentid);
        }
    }
    
    /**
     * Appends and returns a new empty "activitymimeattachmentid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewActivitymimeattachmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ACTIVITYMIMEATTACHMENTID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "activitymimeattachmentid" element
     */
    public void unsetActivitymimeattachmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYMIMEATTACHMENTID$2, 0);
        }
    }
    
    /**
     * Gets the "attachmentnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getAttachmentnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ATTACHMENTNUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attachmentnumber" element
     */
    public boolean isSetAttachmentnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTNUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "attachmentnumber" element
     */
    public void setAttachmentnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber attachmentnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ATTACHMENTNUMBER$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ATTACHMENTNUMBER$4);
            }
            target.set(attachmentnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "attachmentnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAttachmentnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ATTACHMENTNUMBER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "attachmentnumber" element
     */
    public void unsetAttachmentnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTNUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "body" element
     */
    public java.lang.String getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "body" element
     */
    public org.apache.xmlbeans.XmlString xgetBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "body" element
     */
    public boolean isSetBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODY$6) != 0;
        }
    }
    
    /**
     * Sets the "body" element
     */
    public void setBody(java.lang.String body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BODY$6);
            }
            target.setStringValue(body);
        }
    }
    
    /**
     * Sets (as xml) the "body" element
     */
    public void xsetBody(org.apache.xmlbeans.XmlString body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BODY$6);
            }
            target.set(body);
        }
    }
    
    /**
     * Unsets the "body" element
     */
    public void unsetBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODY$6, 0);
        }
    }
    
    /**
     * Gets the "filename" element
     */
    public java.lang.String getFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "filename" element
     */
    public org.apache.xmlbeans.XmlString xgetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "filename" element
     */
    public boolean isSetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILENAME$8) != 0;
        }
    }
    
    /**
     * Sets the "filename" element
     */
    public void setFilename(java.lang.String filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$8);
            }
            target.setStringValue(filename);
        }
    }
    
    /**
     * Sets (as xml) the "filename" element
     */
    public void xsetFilename(org.apache.xmlbeans.XmlString filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$8);
            }
            target.set(filename);
        }
    }
    
    /**
     * Unsets the "filename" element
     */
    public void unsetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILENAME$8, 0);
        }
    }
    
    /**
     * Gets the "filesize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getFilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FILESIZE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filesize" element
     */
    public boolean isSetFilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILESIZE$10) != 0;
        }
    }
    
    /**
     * Sets the "filesize" element
     */
    public void setFilesize(com.microsoft.schemas.crm._2006.webservices.CrmNumber filesize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FILESIZE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FILESIZE$10);
            }
            target.set(filesize);
        }
    }
    
    /**
     * Appends and returns a new empty "filesize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FILESIZE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "filesize" element
     */
    public void unsetFilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILESIZE$10, 0);
        }
    }
    
    /**
     * Gets the "mimetype" element
     */
    public java.lang.String getMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mimetype" element
     */
    public org.apache.xmlbeans.XmlString xgetMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMETYPE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "mimetype" element
     */
    public boolean isSetMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMETYPE$12) != 0;
        }
    }
    
    /**
     * Sets the "mimetype" element
     */
    public void setMimetype(java.lang.String mimetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMETYPE$12);
            }
            target.setStringValue(mimetype);
        }
    }
    
    /**
     * Sets (as xml) the "mimetype" element
     */
    public void xsetMimetype(org.apache.xmlbeans.XmlString mimetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMETYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIMETYPE$12);
            }
            target.set(mimetype);
        }
    }
    
    /**
     * Unsets the "mimetype" element
     */
    public void unsetMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMETYPE$12, 0);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public java.lang.String getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subject" element
     */
    public org.apache.xmlbeans.XmlString xgetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$14) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(java.lang.String subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECT$14);
            }
            target.setStringValue(subject);
        }
    }
    
    /**
     * Sets (as xml) the "subject" element
     */
    public void xsetSubject(org.apache.xmlbeans.XmlString subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECT$14);
            }
            target.set(subject);
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$14, 0);
        }
    }
}
