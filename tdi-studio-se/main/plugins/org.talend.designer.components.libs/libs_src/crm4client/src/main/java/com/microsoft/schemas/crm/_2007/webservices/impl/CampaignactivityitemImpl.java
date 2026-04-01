/*
 * XML Type:  campaignactivityitem
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Campaignactivityitem
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML campaignactivityitem(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CampaignactivityitemImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Campaignactivityitem
{
    
    public CampaignactivityitemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMPAIGNACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "campaignactivityid");
    private static final javax.xml.namespace.QName CAMPAIGNACTIVITYITEMID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "campaignactivityitemid");
    private static final javax.xml.namespace.QName ITEMID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "itemid");
    private static final javax.xml.namespace.QName ITEMOBJECTTYPECODE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "itemobjecttypecode");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName OWNINGUSER$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owninguser");
    
    
    /**
     * Gets the "campaignactivityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCampaignactivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CAMPAIGNACTIVITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "campaignactivityid" element
     */
    public boolean isSetCampaignactivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAMPAIGNACTIVITYID$0) != 0;
        }
    }
    
    /**
     * Sets the "campaignactivityid" element
     */
    public void setCampaignactivityid(com.microsoft.schemas.crm._2006.webservices.Lookup campaignactivityid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CAMPAIGNACTIVITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CAMPAIGNACTIVITYID$0);
            }
            target.set(campaignactivityid);
        }
    }
    
    /**
     * Appends and returns a new empty "campaignactivityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCampaignactivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CAMPAIGNACTIVITYID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "campaignactivityid" element
     */
    public void unsetCampaignactivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAMPAIGNACTIVITYID$0, 0);
        }
    }
    
    /**
     * Gets the "campaignactivityitemid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getCampaignactivityitemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CAMPAIGNACTIVITYITEMID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "campaignactivityitemid" element
     */
    public boolean isSetCampaignactivityitemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAMPAIGNACTIVITYITEMID$2) != 0;
        }
    }
    
    /**
     * Sets the "campaignactivityitemid" element
     */
    public void setCampaignactivityitemid(com.microsoft.schemas.crm._2006.webservices.Key campaignactivityitemid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CAMPAIGNACTIVITYITEMID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CAMPAIGNACTIVITYITEMID$2);
            }
            target.set(campaignactivityitemid);
        }
    }
    
    /**
     * Appends and returns a new empty "campaignactivityitemid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewCampaignactivityitemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CAMPAIGNACTIVITYITEMID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "campaignactivityitemid" element
     */
    public void unsetCampaignactivityitemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAMPAIGNACTIVITYITEMID$2, 0);
        }
    }
    
    /**
     * Gets the "itemid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getItemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(ITEMID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "itemid" element
     */
    public boolean isSetItemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEMID$4) != 0;
        }
    }
    
    /**
     * Sets the "itemid" element
     */
    public void setItemid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier itemid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(ITEMID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(ITEMID$4);
            }
            target.set(itemid);
        }
    }
    
    /**
     * Appends and returns a new empty "itemid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewItemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(ITEMID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "itemid" element
     */
    public void unsetItemid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEMID$4, 0);
        }
    }
    
    /**
     * Gets the "itemobjecttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.EntityNameReference getItemobjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(ITEMOBJECTTYPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "itemobjecttypecode" element
     */
    public boolean isSetItemobjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEMOBJECTTYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "itemobjecttypecode" element
     */
    public void setItemobjecttypecode(com.microsoft.schemas.crm._2006.webservices.EntityNameReference itemobjecttypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(ITEMOBJECTTYPECODE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(ITEMOBJECTTYPECODE$6);
            }
            target.set(itemobjecttypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "itemobjecttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewItemobjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(ITEMOBJECTTYPECODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "itemobjecttypecode" element
     */
    public void unsetItemobjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEMOBJECTTYPECODE$6, 0);
        }
    }
    
    /**
     * Gets the "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owningbusinessunit" element
     */
    public boolean isSetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGBUSINESSUNIT$8) != 0;
        }
    }
    
    /**
     * Sets the "owningbusinessunit" element
     */
    public void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owningbusinessunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$8);
            }
            target.set(owningbusinessunit);
        }
    }
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    public void unsetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGBUSINESSUNIT$8, 0);
        }
    }
    
    /**
     * Gets the "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owninguser" element
     */
    public boolean isSetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGUSER$10) != 0;
        }
    }
    
    /**
     * Sets the "owninguser" element
     */
    public void setOwninguser(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owninguser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$10);
            }
            target.set(owninguser);
        }
    }
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "owninguser" element
     */
    public void unsetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGUSER$10, 0);
        }
    }
}
