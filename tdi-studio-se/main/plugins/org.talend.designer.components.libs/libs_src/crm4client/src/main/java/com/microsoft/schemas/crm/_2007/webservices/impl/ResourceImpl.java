/*
 * XML Type:  resource
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Resource
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML resource(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ResourceImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Resource
{
    
    public ResourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSUNITID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "businessunitid");
    private static final javax.xml.namespace.QName CALENDARID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "calendarid");
    private static final javax.xml.namespace.QName DISPLAYINSERVICEVIEWS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "displayinserviceviews");
    private static final javax.xml.namespace.QName ISDISABLED$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isdisabled");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName OBJECTTYPECODE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "objecttypecode");
    private static final javax.xml.namespace.QName ORGANIZATIONID$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName RESOURCEID$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "resourceid");
    private static final javax.xml.namespace.QName SITEID$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "siteid");
    
    
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
     * Gets the "calendarid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(CALENDARID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "calendarid" element
     */
    public boolean isSetCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALENDARID$2) != 0;
        }
    }
    
    /**
     * Sets the "calendarid" element
     */
    public void setCalendarid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier calendarid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(CALENDARID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(CALENDARID$2);
            }
            target.set(calendarid);
        }
    }
    
    /**
     * Appends and returns a new empty "calendarid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(CALENDARID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "calendarid" element
     */
    public void unsetCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALENDARID$2, 0);
        }
    }
    
    /**
     * Gets the "displayinserviceviews" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDisplayinserviceviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DISPLAYINSERVICEVIEWS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "displayinserviceviews" element
     */
    public boolean isSetDisplayinserviceviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYINSERVICEVIEWS$4) != 0;
        }
    }
    
    /**
     * Sets the "displayinserviceviews" element
     */
    public void setDisplayinserviceviews(com.microsoft.schemas.crm._2006.webservices.CrmBoolean displayinserviceviews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DISPLAYINSERVICEVIEWS$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DISPLAYINSERVICEVIEWS$4);
            }
            target.set(displayinserviceviews);
        }
    }
    
    /**
     * Appends and returns a new empty "displayinserviceviews" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDisplayinserviceviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DISPLAYINSERVICEVIEWS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "displayinserviceviews" element
     */
    public void unsetDisplayinserviceviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYINSERVICEVIEWS$4, 0);
        }
    }
    
    /**
     * Gets the "isdisabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsdisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDISABLED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isdisabled" element
     */
    public boolean isSetIsdisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDISABLED$6) != 0;
        }
    }
    
    /**
     * Sets the "isdisabled" element
     */
    public void setIsdisabled(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isdisabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDISABLED$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDISABLED$6);
            }
            target.set(isdisabled);
        }
    }
    
    /**
     * Appends and returns a new empty "isdisabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsdisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDISABLED$6);
            return target;
        }
    }
    
    /**
     * Unsets the "isdisabled" element
     */
    public void unsetIsdisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDISABLED$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
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
            return get_store().count_elements(NAME$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$8);
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
            get_store().remove_element(NAME$8, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(OBJECTTYPECODE$10, 0);
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
            return get_store().count_elements(OBJECTTYPECODE$10) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(OBJECTTYPECODE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(OBJECTTYPECODE$10);
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
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(OBJECTTYPECODE$10);
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
            get_store().remove_element(OBJECTTYPECODE$10, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$12, 0);
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
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Lookup organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$12);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$12);
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
    
    /**
     * Gets the "resourceid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getResourceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(RESOURCEID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resourceid" element
     */
    public boolean isSetResourceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEID$14) != 0;
        }
    }
    
    /**
     * Sets the "resourceid" element
     */
    public void setResourceid(com.microsoft.schemas.crm._2006.webservices.Key resourceid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(RESOURCEID$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(RESOURCEID$14);
            }
            target.set(resourceid);
        }
    }
    
    /**
     * Appends and returns a new empty "resourceid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewResourceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(RESOURCEID$14);
            return target;
        }
    }
    
    /**
     * Unsets the "resourceid" element
     */
    public void unsetResourceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEID$14, 0);
        }
    }
    
    /**
     * Gets the "siteid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getSiteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SITEID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "siteid" element
     */
    public boolean isSetSiteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITEID$16) != 0;
        }
    }
    
    /**
     * Sets the "siteid" element
     */
    public void setSiteid(com.microsoft.schemas.crm._2006.webservices.Lookup siteid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SITEID$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SITEID$16);
            }
            target.set(siteid);
        }
    }
    
    /**
     * Appends and returns a new empty "siteid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewSiteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SITEID$16);
            return target;
        }
    }
    
    /**
     * Unsets the "siteid" element
     */
    public void unsetSiteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITEID$16, 0);
        }
    }
}
