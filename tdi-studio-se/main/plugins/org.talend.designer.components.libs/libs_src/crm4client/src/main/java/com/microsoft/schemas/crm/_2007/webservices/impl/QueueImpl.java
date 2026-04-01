/*
 * XML Type:  queue
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Queue
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML queue(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class QueueImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Queue
{
    
    public QueueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLOWEMAILCREDENTIALS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowemailcredentials");
    private static final javax.xml.namespace.QName BUSINESSUNITID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "businessunitid");
    private static final javax.xml.namespace.QName CREATEDBY$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName EMAILADDRESS$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress");
    private static final javax.xml.namespace.QName EMAILPASSWORD$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailpassword");
    private static final javax.xml.namespace.QName EMAILUSERNAME$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailusername");
    private static final javax.xml.namespace.QName IGNOREUNSOLICITEDEMAIL$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ignoreunsolicitedemail");
    private static final javax.xml.namespace.QName INCOMINGEMAILDELIVERYMETHOD$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "incomingemaildeliverymethod");
    private static final javax.xml.namespace.QName INCOMINGEMAILFILTERINGMETHOD$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "incomingemailfilteringmethod");
    private static final javax.xml.namespace.QName ISFAXQUEUE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isfaxqueue");
    private static final javax.xml.namespace.QName MODIFIEDBY$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName ORGANIZATIONID$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName OUTGOINGEMAILDELIVERYMETHOD$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "outgoingemaildeliverymethod");
    private static final javax.xml.namespace.QName PRIMARYUSERID$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "primaryuserid");
    private static final javax.xml.namespace.QName QUEUEID$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "queueid");
    private static final javax.xml.namespace.QName QUEUESEMANTICS$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "queuesemantics");
    private static final javax.xml.namespace.QName QUEUETYPECODE$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "queuetypecode");
    
    
    /**
     * Gets the "allowemailcredentials" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowemailcredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWEMAILCREDENTIALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowemailcredentials" element
     */
    public boolean isSetAllowemailcredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWEMAILCREDENTIALS$0) != 0;
        }
    }
    
    /**
     * Sets the "allowemailcredentials" element
     */
    public void setAllowemailcredentials(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowemailcredentials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWEMAILCREDENTIALS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWEMAILCREDENTIALS$0);
            }
            target.set(allowemailcredentials);
        }
    }
    
    /**
     * Appends and returns a new empty "allowemailcredentials" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowemailcredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWEMAILCREDENTIALS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "allowemailcredentials" element
     */
    public void unsetAllowemailcredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWEMAILCREDENTIALS$0, 0);
        }
    }
    
    /**
     * Gets the "businessunitid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BUSINESSUNITID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "businessunitid" element
     */
    public boolean isSetBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSUNITID$2) != 0;
        }
    }
    
    /**
     * Sets the "businessunitid" element
     */
    public void setBusinessunitid(com.microsoft.schemas.crm._2006.webservices.Lookup businessunitid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BUSINESSUNITID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BUSINESSUNITID$2);
            }
            target.set(businessunitid);
        }
    }
    
    /**
     * Appends and returns a new empty "businessunitid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BUSINESSUNITID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "businessunitid" element
     */
    public void unsetBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSUNITID$2, 0);
        }
    }
    
    /**
     * Gets the "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdby" element
     */
    public boolean isSetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$4) != 0;
        }
    }
    
    /**
     * Sets the "createdby" element
     */
    public void setCreatedby(com.microsoft.schemas.crm._2006.webservices.Lookup createdby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$4);
            }
            target.set(createdby);
        }
    }
    
    /**
     * Appends and returns a new empty "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "createdby" element
     */
    public void unsetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$4, 0);
        }
    }
    
    /**
     * Gets the "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$6, 0);
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
            return get_store().count_elements(CREATEDON$6) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$6);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$6);
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
            get_store().remove_element(CREATEDON$6, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "emailaddress" element
     */
    public java.lang.String getEmailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailaddress" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "emailaddress" element
     */
    public boolean isSetEmailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "emailaddress" element
     */
    public void setEmailaddress(java.lang.String emailaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$10);
            }
            target.setStringValue(emailaddress);
        }
    }
    
    /**
     * Sets (as xml) the "emailaddress" element
     */
    public void xsetEmailaddress(org.apache.xmlbeans.XmlString emailaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS$10);
            }
            target.set(emailaddress);
        }
    }
    
    /**
     * Unsets the "emailaddress" element
     */
    public void unsetEmailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILADDRESS$10, 0);
        }
    }
    
    /**
     * Gets the "emailpassword" element
     */
    public java.lang.String getEmailpassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILPASSWORD$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailpassword" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailpassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILPASSWORD$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "emailpassword" element
     */
    public boolean isSetEmailpassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILPASSWORD$12) != 0;
        }
    }
    
    /**
     * Sets the "emailpassword" element
     */
    public void setEmailpassword(java.lang.String emailpassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILPASSWORD$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILPASSWORD$12);
            }
            target.setStringValue(emailpassword);
        }
    }
    
    /**
     * Sets (as xml) the "emailpassword" element
     */
    public void xsetEmailpassword(org.apache.xmlbeans.XmlString emailpassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILPASSWORD$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILPASSWORD$12);
            }
            target.set(emailpassword);
        }
    }
    
    /**
     * Unsets the "emailpassword" element
     */
    public void unsetEmailpassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILPASSWORD$12, 0);
        }
    }
    
    /**
     * Gets the "emailusername" element
     */
    public java.lang.String getEmailusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILUSERNAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailusername" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILUSERNAME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "emailusername" element
     */
    public boolean isSetEmailusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILUSERNAME$14) != 0;
        }
    }
    
    /**
     * Sets the "emailusername" element
     */
    public void setEmailusername(java.lang.String emailusername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILUSERNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILUSERNAME$14);
            }
            target.setStringValue(emailusername);
        }
    }
    
    /**
     * Sets (as xml) the "emailusername" element
     */
    public void xsetEmailusername(org.apache.xmlbeans.XmlString emailusername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILUSERNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILUSERNAME$14);
            }
            target.set(emailusername);
        }
    }
    
    /**
     * Unsets the "emailusername" element
     */
    public void unsetEmailusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILUSERNAME$14, 0);
        }
    }
    
    /**
     * Gets the "ignoreunsolicitedemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIgnoreunsolicitedemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(IGNOREUNSOLICITEDEMAIL$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ignoreunsolicitedemail" element
     */
    public boolean isSetIgnoreunsolicitedemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IGNOREUNSOLICITEDEMAIL$16) != 0;
        }
    }
    
    /**
     * Sets the "ignoreunsolicitedemail" element
     */
    public void setIgnoreunsolicitedemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ignoreunsolicitedemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(IGNOREUNSOLICITEDEMAIL$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(IGNOREUNSOLICITEDEMAIL$16);
            }
            target.set(ignoreunsolicitedemail);
        }
    }
    
    /**
     * Appends and returns a new empty "ignoreunsolicitedemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIgnoreunsolicitedemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(IGNOREUNSOLICITEDEMAIL$16);
            return target;
        }
    }
    
    /**
     * Unsets the "ignoreunsolicitedemail" element
     */
    public void unsetIgnoreunsolicitedemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IGNOREUNSOLICITEDEMAIL$16, 0);
        }
    }
    
    /**
     * Gets the "incomingemaildeliverymethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getIncomingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCOMINGEMAILDELIVERYMETHOD$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "incomingemaildeliverymethod" element
     */
    public boolean isSetIncomingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCOMINGEMAILDELIVERYMETHOD$18) != 0;
        }
    }
    
    /**
     * Sets the "incomingemaildeliverymethod" element
     */
    public void setIncomingemaildeliverymethod(com.microsoft.schemas.crm._2006.webservices.Picklist incomingemaildeliverymethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCOMINGEMAILDELIVERYMETHOD$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCOMINGEMAILDELIVERYMETHOD$18);
            }
            target.set(incomingemaildeliverymethod);
        }
    }
    
    /**
     * Appends and returns a new empty "incomingemaildeliverymethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewIncomingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCOMINGEMAILDELIVERYMETHOD$18);
            return target;
        }
    }
    
    /**
     * Unsets the "incomingemaildeliverymethod" element
     */
    public void unsetIncomingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCOMINGEMAILDELIVERYMETHOD$18, 0);
        }
    }
    
    /**
     * Gets the "incomingemailfilteringmethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getIncomingemailfilteringmethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCOMINGEMAILFILTERINGMETHOD$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "incomingemailfilteringmethod" element
     */
    public boolean isSetIncomingemailfilteringmethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCOMINGEMAILFILTERINGMETHOD$20) != 0;
        }
    }
    
    /**
     * Sets the "incomingemailfilteringmethod" element
     */
    public void setIncomingemailfilteringmethod(com.microsoft.schemas.crm._2006.webservices.Picklist incomingemailfilteringmethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCOMINGEMAILFILTERINGMETHOD$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCOMINGEMAILFILTERINGMETHOD$20);
            }
            target.set(incomingemailfilteringmethod);
        }
    }
    
    /**
     * Appends and returns a new empty "incomingemailfilteringmethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewIncomingemailfilteringmethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCOMINGEMAILFILTERINGMETHOD$20);
            return target;
        }
    }
    
    /**
     * Unsets the "incomingemailfilteringmethod" element
     */
    public void unsetIncomingemailfilteringmethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCOMINGEMAILFILTERINGMETHOD$20, 0);
        }
    }
    
    /**
     * Gets the "isfaxqueue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsfaxqueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISFAXQUEUE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isfaxqueue" element
     */
    public boolean isSetIsfaxqueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISFAXQUEUE$22) != 0;
        }
    }
    
    /**
     * Sets the "isfaxqueue" element
     */
    public void setIsfaxqueue(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isfaxqueue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISFAXQUEUE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISFAXQUEUE$22);
            }
            target.set(isfaxqueue);
        }
    }
    
    /**
     * Appends and returns a new empty "isfaxqueue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsfaxqueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISFAXQUEUE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "isfaxqueue" element
     */
    public void unsetIsfaxqueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISFAXQUEUE$22, 0);
        }
    }
    
    /**
     * Gets the "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedby" element
     */
    public boolean isSetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDBY$24) != 0;
        }
    }
    
    /**
     * Sets the "modifiedby" element
     */
    public void setModifiedby(com.microsoft.schemas.crm._2006.webservices.Lookup modifiedby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$24);
            }
            target.set(modifiedby);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$24);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedby" element
     */
    public void unsetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDBY$24, 0);
        }
    }
    
    /**
     * Gets the "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedon" element
     */
    public boolean isSetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDON$26) != 0;
        }
    }
    
    /**
     * Sets the "modifiedon" element
     */
    public void setModifiedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime modifiedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$26);
            }
            target.set(modifiedon);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$26);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedon" element
     */
    public void unsetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDON$26, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$28) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$28);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$28);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$28, 0);
        }
    }
    
    /**
     * Gets the "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$30, 0);
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
            return get_store().count_elements(ORGANIZATIONID$30) != 0;
        }
    }
    
    /**
     * Sets the "organizationid" element
     */
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Lookup organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$30);
            }
            target.set(organizationid);
        }
    }
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$30);
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
            get_store().remove_element(ORGANIZATIONID$30, 0);
        }
    }
    
    /**
     * Gets the "outgoingemaildeliverymethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getOutgoingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OUTGOINGEMAILDELIVERYMETHOD$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outgoingemaildeliverymethod" element
     */
    public boolean isSetOutgoingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTGOINGEMAILDELIVERYMETHOD$32) != 0;
        }
    }
    
    /**
     * Sets the "outgoingemaildeliverymethod" element
     */
    public void setOutgoingemaildeliverymethod(com.microsoft.schemas.crm._2006.webservices.Picklist outgoingemaildeliverymethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OUTGOINGEMAILDELIVERYMETHOD$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OUTGOINGEMAILDELIVERYMETHOD$32);
            }
            target.set(outgoingemaildeliverymethod);
        }
    }
    
    /**
     * Appends and returns a new empty "outgoingemaildeliverymethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewOutgoingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OUTGOINGEMAILDELIVERYMETHOD$32);
            return target;
        }
    }
    
    /**
     * Unsets the "outgoingemaildeliverymethod" element
     */
    public void unsetOutgoingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTGOINGEMAILDELIVERYMETHOD$32, 0);
        }
    }
    
    /**
     * Gets the "primaryuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getPrimaryuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRIMARYUSERID$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "primaryuserid" element
     */
    public boolean isSetPrimaryuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYUSERID$34) != 0;
        }
    }
    
    /**
     * Sets the "primaryuserid" element
     */
    public void setPrimaryuserid(com.microsoft.schemas.crm._2006.webservices.Lookup primaryuserid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRIMARYUSERID$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRIMARYUSERID$34);
            }
            target.set(primaryuserid);
        }
    }
    
    /**
     * Appends and returns a new empty "primaryuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewPrimaryuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRIMARYUSERID$34);
            return target;
        }
    }
    
    /**
     * Unsets the "primaryuserid" element
     */
    public void unsetPrimaryuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYUSERID$34, 0);
        }
    }
    
    /**
     * Gets the "queueid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getQueueid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(QUEUEID$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "queueid" element
     */
    public boolean isSetQueueid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUEUEID$36) != 0;
        }
    }
    
    /**
     * Sets the "queueid" element
     */
    public void setQueueid(com.microsoft.schemas.crm._2006.webservices.Key queueid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(QUEUEID$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(QUEUEID$36);
            }
            target.set(queueid);
        }
    }
    
    /**
     * Appends and returns a new empty "queueid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewQueueid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(QUEUEID$36);
            return target;
        }
    }
    
    /**
     * Unsets the "queueid" element
     */
    public void unsetQueueid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUEUEID$36, 0);
        }
    }
    
    /**
     * Gets the "queuesemantics" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getQueuesemantics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(QUEUESEMANTICS$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "queuesemantics" element
     */
    public boolean isSetQueuesemantics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUEUESEMANTICS$38) != 0;
        }
    }
    
    /**
     * Sets the "queuesemantics" element
     */
    public void setQueuesemantics(com.microsoft.schemas.crm._2006.webservices.CrmNumber queuesemantics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(QUEUESEMANTICS$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(QUEUESEMANTICS$38);
            }
            target.set(queuesemantics);
        }
    }
    
    /**
     * Appends and returns a new empty "queuesemantics" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewQueuesemantics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(QUEUESEMANTICS$38);
            return target;
        }
    }
    
    /**
     * Unsets the "queuesemantics" element
     */
    public void unsetQueuesemantics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUEUESEMANTICS$38, 0);
        }
    }
    
    /**
     * Gets the "queuetypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getQueuetypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(QUEUETYPECODE$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "queuetypecode" element
     */
    public boolean isSetQueuetypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUEUETYPECODE$40) != 0;
        }
    }
    
    /**
     * Sets the "queuetypecode" element
     */
    public void setQueuetypecode(com.microsoft.schemas.crm._2006.webservices.Picklist queuetypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(QUEUETYPECODE$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(QUEUETYPECODE$40);
            }
            target.set(queuetypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "queuetypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewQueuetypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(QUEUETYPECODE$40);
            return target;
        }
    }
    
    /**
     * Unsets the "queuetypecode" element
     */
    public void unsetQueuetypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUEUETYPECODE$40, 0);
        }
    }
}
