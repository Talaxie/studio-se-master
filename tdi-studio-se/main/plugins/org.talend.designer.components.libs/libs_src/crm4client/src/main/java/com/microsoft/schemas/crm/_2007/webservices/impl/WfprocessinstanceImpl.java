/*
 * XML Type:  wfprocessinstance
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML wfprocessinstance(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class WfprocessinstanceImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance
{
    
    public WfprocessinstanceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSUNITID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "businessunitid");
    private static final javax.xml.namespace.QName CREATEDBY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName LASTACTIVITYON$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lastactivityon");
    private static final javax.xml.namespace.QName MODIFIEDBY$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName OBJECTID$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "objectid");
    private static final javax.xml.namespace.QName OBJECTTYPE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "objecttype");
    private static final javax.xml.namespace.QName PARENTID$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parentid");
    private static final javax.xml.namespace.QName PROCESSID$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processid");
    private static final javax.xml.namespace.QName PROCESSINSTANCEID$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processinstanceid");
    private static final javax.xml.namespace.QName STARTEDBY$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "startedby");
    private static final javax.xml.namespace.QName STARTEDON$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "startedon");
    private static final javax.xml.namespace.QName STATECODE$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STEPCOUNTER$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "stepcounter");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName USERCONTEXT$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "usercontext");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "businessunitid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BUSINESSUNITID$0, 0);
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
            return get_store().count_elements(BUSINESSUNITID$0) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BUSINESSUNITID$0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BUSINESSUNITID$0);
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
            get_store().remove_element(BUSINESSUNITID$0, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$2, 0);
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
            return get_store().count_elements(CREATEDBY$2) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$2);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$2);
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
            get_store().remove_element(CREATEDBY$2, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$4, 0);
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
            return get_store().count_elements(CREATEDON$4) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$4);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$4);
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
            get_store().remove_element(CREATEDON$4, 0);
        }
    }
    
    /**
     * Gets the "lastactivityon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getLastactivityon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTACTIVITYON$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lastactivityon" element
     */
    public boolean isSetLastactivityon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTACTIVITYON$6) != 0;
        }
    }
    
    /**
     * Sets the "lastactivityon" element
     */
    public void setLastactivityon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime lastactivityon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTACTIVITYON$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTACTIVITYON$6);
            }
            target.set(lastactivityon);
        }
    }
    
    /**
     * Appends and returns a new empty "lastactivityon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewLastactivityon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTACTIVITYON$6);
            return target;
        }
    }
    
    /**
     * Unsets the "lastactivityon" element
     */
    public void unsetLastactivityon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTACTIVITYON$6, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$8, 0);
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
            return get_store().count_elements(MODIFIEDBY$8) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$8);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$8);
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
            get_store().remove_element(MODIFIEDBY$8, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$10, 0);
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
            return get_store().count_elements(MODIFIEDON$10) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$10);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$10);
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
            get_store().remove_element(MODIFIEDON$10, 0);
        }
    }
    
    /**
     * Gets the "objectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getObjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OBJECTID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "objectid" element
     */
    public boolean isSetObjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTID$12) != 0;
        }
    }
    
    /**
     * Sets the "objectid" element
     */
    public void setObjectid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier objectid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OBJECTID$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OBJECTID$12);
            }
            target.set(objectid);
        }
    }
    
    /**
     * Appends and returns a new empty "objectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewObjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OBJECTID$12);
            return target;
        }
    }
    
    /**
     * Unsets the "objectid" element
     */
    public void unsetObjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTID$12, 0);
        }
    }
    
    /**
     * Gets the "objecttype" element
     */
    public java.lang.String getObjecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "objecttype" element
     */
    public org.apache.xmlbeans.XmlString xgetObjecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "objecttype" element
     */
    public boolean isSetObjecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTTYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "objecttype" element
     */
    public void setObjecttype(java.lang.String objecttype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTTYPE$14);
            }
            target.setStringValue(objecttype);
        }
    }
    
    /**
     * Sets (as xml) the "objecttype" element
     */
    public void xsetObjecttype(org.apache.xmlbeans.XmlString objecttype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTTYPE$14);
            }
            target.set(objecttype);
        }
    }
    
    /**
     * Unsets the "objecttype" element
     */
    public void unsetObjecttype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTTYPE$14, 0);
        }
    }
    
    /**
     * Gets the "parentid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getParentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parentid" element
     */
    public boolean isSetParentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTID$16) != 0;
        }
    }
    
    /**
     * Sets the "parentid" element
     */
    public void setParentid(com.microsoft.schemas.crm._2006.webservices.Lookup parentid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTID$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTID$16);
            }
            target.set(parentid);
        }
    }
    
    /**
     * Appends and returns a new empty "parentid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTID$16);
            return target;
        }
    }
    
    /**
     * Unsets the "parentid" element
     */
    public void unsetParentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTID$16, 0);
        }
    }
    
    /**
     * Gets the "processid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getProcessid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PROCESSID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processid" element
     */
    public boolean isSetProcessid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSID$18) != 0;
        }
    }
    
    /**
     * Sets the "processid" element
     */
    public void setProcessid(com.microsoft.schemas.crm._2006.webservices.Lookup processid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PROCESSID$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PROCESSID$18);
            }
            target.set(processid);
        }
    }
    
    /**
     * Appends and returns a new empty "processid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewProcessid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PROCESSID$18);
            return target;
        }
    }
    
    /**
     * Unsets the "processid" element
     */
    public void unsetProcessid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSID$18, 0);
        }
    }
    
    /**
     * Gets the "processinstanceid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getProcessinstanceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(PROCESSINSTANCEID$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processinstanceid" element
     */
    public boolean isSetProcessinstanceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSINSTANCEID$20) != 0;
        }
    }
    
    /**
     * Sets the "processinstanceid" element
     */
    public void setProcessinstanceid(com.microsoft.schemas.crm._2006.webservices.Key processinstanceid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(PROCESSINSTANCEID$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(PROCESSINSTANCEID$20);
            }
            target.set(processinstanceid);
        }
    }
    
    /**
     * Appends and returns a new empty "processinstanceid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewProcessinstanceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(PROCESSINSTANCEID$20);
            return target;
        }
    }
    
    /**
     * Unsets the "processinstanceid" element
     */
    public void unsetProcessinstanceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSINSTANCEID$20, 0);
        }
    }
    
    /**
     * Gets the "startedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getStartedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(STARTEDBY$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "startedby" element
     */
    public boolean isSetStartedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTEDBY$22) != 0;
        }
    }
    
    /**
     * Sets the "startedby" element
     */
    public void setStartedby(com.microsoft.schemas.crm._2006.webservices.Lookup startedby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(STARTEDBY$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(STARTEDBY$22);
            }
            target.set(startedby);
        }
    }
    
    /**
     * Appends and returns a new empty "startedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewStartedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(STARTEDBY$22);
            return target;
        }
    }
    
    /**
     * Unsets the "startedby" element
     */
    public void unsetStartedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTEDBY$22, 0);
        }
    }
    
    /**
     * Gets the "startedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(STARTEDON$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "startedon" element
     */
    public boolean isSetStartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTEDON$24) != 0;
        }
    }
    
    /**
     * Sets the "startedon" element
     */
    public void setStartedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime startedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(STARTEDON$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(STARTEDON$24);
            }
            target.set(startedon);
        }
    }
    
    /**
     * Appends and returns a new empty "startedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(STARTEDON$24);
            return target;
        }
    }
    
    /**
     * Unsets the "startedon" element
     */
    public void unsetStartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTEDON$24, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo)get_store().find_element_user(STATECODE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statecode" element
     */
    public boolean isSetStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATECODE$26) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo)get_store().find_element_user(STATECODE$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo)get_store().add_element_user(STATECODE$26);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo)get_store().add_element_user(STATECODE$26);
            return target;
        }
    }
    
    /**
     * Unsets the "statecode" element
     */
    public void unsetStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATECODE$26, 0);
        }
    }
    
    /**
     * Gets the "stepcounter" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStepcounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STEPCOUNTER$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stepcounter" element
     */
    public boolean isSetStepcounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STEPCOUNTER$28) != 0;
        }
    }
    
    /**
     * Sets the "stepcounter" element
     */
    public void setStepcounter(com.microsoft.schemas.crm._2006.webservices.CrmNumber stepcounter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STEPCOUNTER$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STEPCOUNTER$28);
            }
            target.set(stepcounter);
        }
    }
    
    /**
     * Appends and returns a new empty "stepcounter" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStepcounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STEPCOUNTER$28);
            return target;
        }
    }
    
    /**
     * Unsets the "stepcounter" element
     */
    public void unsetStepcounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STEPCOUNTER$28, 0);
        }
    }
    
    /**
     * Gets the "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezoneruleversionnumber" element
     */
    public boolean isSetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$30) != 0;
        }
    }
    
    /**
     * Sets the "timezoneruleversionnumber" element
     */
    public void setTimezoneruleversionnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezoneruleversionnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$30);
            }
            target.set(timezoneruleversionnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$30);
            return target;
        }
    }
    
    /**
     * Unsets the "timezoneruleversionnumber" element
     */
    public void unsetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$30, 0);
        }
    }
    
    /**
     * Gets the "usercontext" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getUsercontext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(USERCONTEXT$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usercontext" element
     */
    public boolean isSetUsercontext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERCONTEXT$32) != 0;
        }
    }
    
    /**
     * Sets the "usercontext" element
     */
    public void setUsercontext(com.microsoft.schemas.crm._2006.webservices.Lookup usercontext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(USERCONTEXT$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(USERCONTEXT$32);
            }
            target.set(usercontext);
        }
    }
    
    /**
     * Appends and returns a new empty "usercontext" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewUsercontext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(USERCONTEXT$32);
            return target;
        }
    }
    
    /**
     * Unsets the "usercontext" element
     */
    public void unsetUsercontext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERCONTEXT$32, 0);
        }
    }
    
    /**
     * Gets the "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "utcconversiontimezonecode" element
     */
    public boolean isSetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$34) != 0;
        }
    }
    
    /**
     * Sets the "utcconversiontimezonecode" element
     */
    public void setUtcconversiontimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber utcconversiontimezonecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$34);
            }
            target.set(utcconversiontimezonecode);
        }
    }
    
    /**
     * Appends and returns a new empty "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$34);
            return target;
        }
    }
    
    /**
     * Unsets the "utcconversiontimezonecode" element
     */
    public void unsetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$34, 0);
        }
    }
}
