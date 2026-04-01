/*
 * XML Type:  wfprocess
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Wfprocess
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML wfprocess(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class WfprocessImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Wfprocess
{
    
    public WfprocessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSUNITID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "businessunitid");
    private static final javax.xml.namespace.QName CREATEDBY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName ENTITYTYPE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "entitytype");
    private static final javax.xml.namespace.QName EVENTTYPECODE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "eventtypecode");
    private static final javax.xml.namespace.QName MODIFIEDBY$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName PRIORITY$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "priority");
    private static final javax.xml.namespace.QName PROCESSCODE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processcode");
    private static final javax.xml.namespace.QName PROCESSID$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processid");
    private static final javax.xml.namespace.QName PROCESSTYPECODE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processtypecode");
    private static final javax.xml.namespace.QName PROCESSTYPEVERSION$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processtypeversion");
    private static final javax.xml.namespace.QName STATECODE$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName USERCONTEXT$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "usercontext");
    
    
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
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
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
            return get_store().count_elements(DESCRIPTION$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
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
            get_store().remove_element(DESCRIPTION$6, 0);
        }
    }
    
    /**
     * Gets the "entitytype" element
     */
    public java.lang.String getEntitytype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entitytype" element
     */
    public org.apache.xmlbeans.XmlString xgetEntitytype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYTYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "entitytype" element
     */
    public boolean isSetEntitytype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYTYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "entitytype" element
     */
    public void setEntitytype(java.lang.String entitytype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYTYPE$8);
            }
            target.setStringValue(entitytype);
        }
    }
    
    /**
     * Sets (as xml) the "entitytype" element
     */
    public void xsetEntitytype(org.apache.xmlbeans.XmlString entitytype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYTYPE$8);
            }
            target.set(entitytype);
        }
    }
    
    /**
     * Unsets the "entitytype" element
     */
    public void unsetEntitytype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYTYPE$8, 0);
        }
    }
    
    /**
     * Gets the "eventtypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getEventtypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(EVENTTYPECODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "eventtypecode" element
     */
    public boolean isSetEventtypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTTYPECODE$10) != 0;
        }
    }
    
    /**
     * Sets the "eventtypecode" element
     */
    public void setEventtypecode(com.microsoft.schemas.crm._2006.webservices.Picklist eventtypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(EVENTTYPECODE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(EVENTTYPECODE$10);
            }
            target.set(eventtypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "eventtypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewEventtypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(EVENTTYPECODE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "eventtypecode" element
     */
    public void unsetEventtypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTTYPECODE$10, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$12, 0);
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
            return get_store().count_elements(MODIFIEDBY$12) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$12);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$12);
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
            get_store().remove_element(MODIFIEDBY$12, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$14, 0);
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
            return get_store().count_elements(MODIFIEDON$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$14);
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
            get_store().remove_element(MODIFIEDON$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$16, 0);
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
            return get_store().count_elements(NAME$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$16);
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
            get_store().remove_element(NAME$16, 0);
        }
    }
    
    /**
     * Gets the "priority" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PRIORITY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "priority" element
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$18) != 0;
        }
    }
    
    /**
     * Sets the "priority" element
     */
    public void setPriority(com.microsoft.schemas.crm._2006.webservices.CrmNumber priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PRIORITY$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PRIORITY$18);
            }
            target.set(priority);
        }
    }
    
    /**
     * Appends and returns a new empty "priority" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PRIORITY$18);
            return target;
        }
    }
    
    /**
     * Unsets the "priority" element
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$18, 0);
        }
    }
    
    /**
     * Gets the "processcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getProcesscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processcode" element
     */
    public boolean isSetProcesscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSCODE$20) != 0;
        }
    }
    
    /**
     * Sets the "processcode" element
     */
    public void setProcesscode(com.microsoft.schemas.crm._2006.webservices.Picklist processcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$20);
            }
            target.set(processcode);
        }
    }
    
    /**
     * Appends and returns a new empty "processcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewProcesscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "processcode" element
     */
    public void unsetProcesscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSCODE$20, 0);
        }
    }
    
    /**
     * Gets the "processid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getProcessid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(PROCESSID$22, 0);
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
            return get_store().count_elements(PROCESSID$22) != 0;
        }
    }
    
    /**
     * Sets the "processid" element
     */
    public void setProcessid(com.microsoft.schemas.crm._2006.webservices.Key processid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(PROCESSID$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(PROCESSID$22);
            }
            target.set(processid);
        }
    }
    
    /**
     * Appends and returns a new empty "processid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewProcessid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(PROCESSID$22);
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
            get_store().remove_element(PROCESSID$22, 0);
        }
    }
    
    /**
     * Gets the "processtypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getProcesstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSTYPECODE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processtypecode" element
     */
    public boolean isSetProcesstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSTYPECODE$24) != 0;
        }
    }
    
    /**
     * Sets the "processtypecode" element
     */
    public void setProcesstypecode(com.microsoft.schemas.crm._2006.webservices.Picklist processtypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSTYPECODE$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSTYPECODE$24);
            }
            target.set(processtypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "processtypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewProcesstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSTYPECODE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "processtypecode" element
     */
    public void unsetProcesstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSTYPECODE$24, 0);
        }
    }
    
    /**
     * Gets the "processtypeversion" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getProcesstypeversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PROCESSTYPEVERSION$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processtypeversion" element
     */
    public boolean isSetProcesstypeversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSTYPEVERSION$26) != 0;
        }
    }
    
    /**
     * Sets the "processtypeversion" element
     */
    public void setProcesstypeversion(com.microsoft.schemas.crm._2006.webservices.CrmNumber processtypeversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PROCESSTYPEVERSION$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PROCESSTYPEVERSION$26);
            }
            target.set(processtypeversion);
        }
    }
    
    /**
     * Appends and returns a new empty "processtypeversion" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewProcesstypeversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PROCESSTYPEVERSION$26);
            return target;
        }
    }
    
    /**
     * Unsets the "processtypeversion" element
     */
    public void unsetProcesstypeversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSTYPEVERSION$26, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo)get_store().find_element_user(STATECODE$28, 0);
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
            return get_store().count_elements(STATECODE$28) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo)get_store().find_element_user(STATECODE$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo)get_store().add_element_user(STATECODE$28);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo)get_store().add_element_user(STATECODE$28);
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
            get_store().remove_element(STATECODE$28, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(USERCONTEXT$30, 0);
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
            return get_store().count_elements(USERCONTEXT$30) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(USERCONTEXT$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(USERCONTEXT$30);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(USERCONTEXT$30);
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
            get_store().remove_element(USERCONTEXT$30, 0);
        }
    }
}
