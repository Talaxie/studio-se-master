/*
 * XML Type:  queueitem
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Queueitem
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML queueitem(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class QueueitemImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Queueitem
{
    
    public QueueitemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEDBY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName ENTEREDON$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "enteredon");
    private static final javax.xml.namespace.QName MODIFIEDBY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName OBJECTID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "objectid");
    private static final javax.xml.namespace.QName OBJECTTYPECODE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "objecttypecode");
    private static final javax.xml.namespace.QName ORGANIZATIONID$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName PRIORITY$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "priority");
    private static final javax.xml.namespace.QName QUEUEID$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "queueid");
    private static final javax.xml.namespace.QName QUEUEITEMID$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "queueitemid");
    private static final javax.xml.namespace.QName SENDER$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sender");
    private static final javax.xml.namespace.QName STATE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "state");
    private static final javax.xml.namespace.QName STATUS$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "status");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TITLE$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "title");
    private static final javax.xml.namespace.QName TORECIPIENTS$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "torecipients");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$0, 0);
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
            return get_store().count_elements(CREATEDBY$0) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$0);
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
            get_store().remove_element(CREATEDBY$0, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$2, 0);
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
            return get_store().count_elements(CREATEDON$2) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$2);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$2);
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
            get_store().remove_element(CREATEDON$2, 0);
        }
    }
    
    /**
     * Gets the "enteredon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEnteredon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ENTEREDON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "enteredon" element
     */
    public boolean isSetEnteredon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTEREDON$4) != 0;
        }
    }
    
    /**
     * Sets the "enteredon" element
     */
    public void setEnteredon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime enteredon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ENTEREDON$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ENTEREDON$4);
            }
            target.set(enteredon);
        }
    }
    
    /**
     * Appends and returns a new empty "enteredon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEnteredon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ENTEREDON$4);
            return target;
        }
    }
    
    /**
     * Unsets the "enteredon" element
     */
    public void unsetEnteredon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTEREDON$4, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$6, 0);
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
            return get_store().count_elements(MODIFIEDBY$6) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$6);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$6);
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
            get_store().remove_element(MODIFIEDBY$6, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$8, 0);
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
            return get_store().count_elements(MODIFIEDON$8) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$8);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$8);
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
            get_store().remove_element(MODIFIEDON$8, 0);
        }
    }
    
    /**
     * Gets the "objectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getObjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OBJECTID$10, 0);
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
            return get_store().count_elements(OBJECTID$10) != 0;
        }
    }
    
    /**
     * Sets the "objectid" element
     */
    public void setObjectid(com.microsoft.schemas.crm._2006.webservices.Lookup objectid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OBJECTID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OBJECTID$10);
            }
            target.set(objectid);
        }
    }
    
    /**
     * Appends and returns a new empty "objectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewObjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OBJECTID$10);
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
            get_store().remove_element(OBJECTID$10, 0);
        }
    }
    
    /**
     * Gets the "objecttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.EntityNameReference getObjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(OBJECTTYPECODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "objecttypecode" element
     */
    public boolean isSetObjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTTYPECODE$12) != 0;
        }
    }
    
    /**
     * Sets the "objecttypecode" element
     */
    public void setObjecttypecode(com.microsoft.schemas.crm._2006.webservices.EntityNameReference objecttypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(OBJECTTYPECODE$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(OBJECTTYPECODE$12);
            }
            target.set(objecttypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "objecttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewObjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(OBJECTTYPECODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "objecttypecode" element
     */
    public void unsetObjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTTYPECODE$12, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$14, 0);
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
            return get_store().count_elements(ORGANIZATIONID$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$14);
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
            get_store().remove_element(ORGANIZATIONID$14, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PRIORITY$16, 0);
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
            return get_store().count_elements(PRIORITY$16) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PRIORITY$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PRIORITY$16);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PRIORITY$16);
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
            get_store().remove_element(PRIORITY$16, 0);
        }
    }
    
    /**
     * Gets the "queueid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getQueueid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(QUEUEID$18, 0);
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
            return get_store().count_elements(QUEUEID$18) != 0;
        }
    }
    
    /**
     * Sets the "queueid" element
     */
    public void setQueueid(com.microsoft.schemas.crm._2006.webservices.Lookup queueid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(QUEUEID$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(QUEUEID$18);
            }
            target.set(queueid);
        }
    }
    
    /**
     * Appends and returns a new empty "queueid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewQueueid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(QUEUEID$18);
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
            get_store().remove_element(QUEUEID$18, 0);
        }
    }
    
    /**
     * Gets the "queueitemid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getQueueitemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(QUEUEITEMID$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "queueitemid" element
     */
    public boolean isSetQueueitemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUEUEITEMID$20) != 0;
        }
    }
    
    /**
     * Sets the "queueitemid" element
     */
    public void setQueueitemid(com.microsoft.schemas.crm._2006.webservices.Key queueitemid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(QUEUEITEMID$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(QUEUEITEMID$20);
            }
            target.set(queueitemid);
        }
    }
    
    /**
     * Appends and returns a new empty "queueitemid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewQueueitemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(QUEUEITEMID$20);
            return target;
        }
    }
    
    /**
     * Unsets the "queueitemid" element
     */
    public void unsetQueueitemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUEUEITEMID$20, 0);
        }
    }
    
    /**
     * Gets the "sender" element
     */
    public java.lang.String getSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDER$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sender" element
     */
    public org.apache.xmlbeans.XmlString xgetSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDER$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "sender" element
     */
    public boolean isSetSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDER$22) != 0;
        }
    }
    
    /**
     * Sets the "sender" element
     */
    public void setSender(java.lang.String sender)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDER$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDER$22);
            }
            target.setStringValue(sender);
        }
    }
    
    /**
     * Sets (as xml) the "sender" element
     */
    public void xsetSender(org.apache.xmlbeans.XmlString sender)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDER$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDER$22);
            }
            target.set(sender);
        }
    }
    
    /**
     * Unsets the "sender" element
     */
    public void unsetSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDER$22, 0);
        }
    }
    
    /**
     * Gets the "state" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STATE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "state" element
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$24) != 0;
        }
    }
    
    /**
     * Sets the "state" element
     */
    public void setState(com.microsoft.schemas.crm._2006.webservices.CrmNumber state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STATE$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STATE$24);
            }
            target.set(state);
        }
    }
    
    /**
     * Appends and returns a new empty "state" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STATE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "state" element
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$24, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STATUS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$26) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(com.microsoft.schemas.crm._2006.webservices.CrmNumber status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STATUS$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STATUS$26);
            }
            target.set(status);
        }
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STATUS$26);
            return target;
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$26, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$28, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$28) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$28);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$28);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$28, 0);
        }
    }
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$30) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$30);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$30);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$30, 0);
        }
    }
    
    /**
     * Gets the "torecipients" element
     */
    public java.lang.String getTorecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TORECIPIENTS$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "torecipients" element
     */
    public org.apache.xmlbeans.XmlString xgetTorecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TORECIPIENTS$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "torecipients" element
     */
    public boolean isSetTorecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TORECIPIENTS$32) != 0;
        }
    }
    
    /**
     * Sets the "torecipients" element
     */
    public void setTorecipients(java.lang.String torecipients)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TORECIPIENTS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TORECIPIENTS$32);
            }
            target.setStringValue(torecipients);
        }
    }
    
    /**
     * Sets (as xml) the "torecipients" element
     */
    public void xsetTorecipients(org.apache.xmlbeans.XmlString torecipients)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TORECIPIENTS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TORECIPIENTS$32);
            }
            target.set(torecipients);
        }
    }
    
    /**
     * Unsets the "torecipients" element
     */
    public void unsetTorecipients()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TORECIPIENTS$32, 0);
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
