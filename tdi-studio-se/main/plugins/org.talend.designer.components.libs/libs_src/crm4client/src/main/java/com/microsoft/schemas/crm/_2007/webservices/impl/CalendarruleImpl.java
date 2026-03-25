/*
 * XML Type:  calendarrule
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Calendarrule
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML calendarrule(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CalendarruleImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Calendarrule
{
    
    public CalendarruleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSUNITID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "businessunitid");
    private static final javax.xml.namespace.QName CALENDARID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "calendarid");
    private static final javax.xml.namespace.QName CALENDARRULEID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "calendarruleid");
    private static final javax.xml.namespace.QName CREATEDBY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName DURATION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "duration");
    private static final javax.xml.namespace.QName EFFECTIVEINTERVALEND$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "effectiveintervalend");
    private static final javax.xml.namespace.QName EFFECTIVEINTERVALSTART$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "effectiveintervalstart");
    private static final javax.xml.namespace.QName EFFORT$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "effort");
    private static final javax.xml.namespace.QName ENDTIME$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "endtime");
    private static final javax.xml.namespace.QName EXTENTCODE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "extentcode");
    private static final javax.xml.namespace.QName GROUPDESIGNATOR$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "groupdesignator");
    private static final javax.xml.namespace.QName INNERCALENDARID$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "innercalendarid");
    private static final javax.xml.namespace.QName ISMODIFIED$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ismodified");
    private static final javax.xml.namespace.QName ISSELECTED$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isselected");
    private static final javax.xml.namespace.QName ISSIMPLE$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "issimple");
    private static final javax.xml.namespace.QName ISVARIED$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isvaried");
    private static final javax.xml.namespace.QName MODIFIEDBY$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName OFFSET$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "offset");
    private static final javax.xml.namespace.QName ORGANIZATIONID$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName PATTERN$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pattern");
    private static final javax.xml.namespace.QName RANK$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "rank");
    private static final javax.xml.namespace.QName SERVICEID$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "serviceid");
    private static final javax.xml.namespace.QName STARTTIME$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "starttime");
    private static final javax.xml.namespace.QName SUBCODE$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subcode");
    private static final javax.xml.namespace.QName TIMECODE$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timecode");
    private static final javax.xml.namespace.QName TIMEZONECODE$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonecode");
    
    
    /**
     * Gets the "businessunitid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(BUSINESSUNITID$0, 0);
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
    public void setBusinessunitid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier businessunitid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(BUSINESSUNITID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(BUSINESSUNITID$0);
            }
            target.set(businessunitid);
        }
    }
    
    /**
     * Appends and returns a new empty "businessunitid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(BUSINESSUNITID$0);
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
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CALENDARID$2, 0);
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
    public void setCalendarid(com.microsoft.schemas.crm._2006.webservices.Lookup calendarid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CALENDARID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CALENDARID$2);
            }
            target.set(calendarid);
        }
    }
    
    /**
     * Appends and returns a new empty "calendarid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CALENDARID$2);
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
     * Gets the "calendarruleid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getCalendarruleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CALENDARRULEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "calendarruleid" element
     */
    public boolean isSetCalendarruleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALENDARRULEID$4) != 0;
        }
    }
    
    /**
     * Sets the "calendarruleid" element
     */
    public void setCalendarruleid(com.microsoft.schemas.crm._2006.webservices.Key calendarruleid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CALENDARRULEID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CALENDARRULEID$4);
            }
            target.set(calendarruleid);
        }
    }
    
    /**
     * Appends and returns a new empty "calendarruleid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewCalendarruleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CALENDARRULEID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "calendarruleid" element
     */
    public void unsetCalendarruleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALENDARRULEID$4, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$6, 0);
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
            return get_store().count_elements(CREATEDBY$6) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$6);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$6);
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
            get_store().remove_element(CREATEDBY$6, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$8, 0);
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
            return get_store().count_elements(CREATEDON$8) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$8);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$8);
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
            get_store().remove_element(CREATEDON$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$10, 0);
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
            return get_store().count_elements(DESCRIPTION$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$10);
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
            get_store().remove_element(DESCRIPTION$10, 0);
        }
    }
    
    /**
     * Gets the "duration" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DURATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "duration" element
     */
    public boolean isSetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DURATION$12) != 0;
        }
    }
    
    /**
     * Sets the "duration" element
     */
    public void setDuration(com.microsoft.schemas.crm._2006.webservices.CrmNumber duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DURATION$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DURATION$12);
            }
            target.set(duration);
        }
    }
    
    /**
     * Appends and returns a new empty "duration" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DURATION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "duration" element
     */
    public void unsetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DURATION$12, 0);
        }
    }
    
    /**
     * Gets the "effectiveintervalend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEffectiveintervalend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(EFFECTIVEINTERVALEND$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectiveintervalend" element
     */
    public boolean isSetEffectiveintervalend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVEINTERVALEND$14) != 0;
        }
    }
    
    /**
     * Sets the "effectiveintervalend" element
     */
    public void setEffectiveintervalend(com.microsoft.schemas.crm._2006.webservices.CrmDateTime effectiveintervalend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(EFFECTIVEINTERVALEND$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(EFFECTIVEINTERVALEND$14);
            }
            target.set(effectiveintervalend);
        }
    }
    
    /**
     * Appends and returns a new empty "effectiveintervalend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEffectiveintervalend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(EFFECTIVEINTERVALEND$14);
            return target;
        }
    }
    
    /**
     * Unsets the "effectiveintervalend" element
     */
    public void unsetEffectiveintervalend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVEINTERVALEND$14, 0);
        }
    }
    
    /**
     * Gets the "effectiveintervalstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEffectiveintervalstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(EFFECTIVEINTERVALSTART$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectiveintervalstart" element
     */
    public boolean isSetEffectiveintervalstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVEINTERVALSTART$16) != 0;
        }
    }
    
    /**
     * Sets the "effectiveintervalstart" element
     */
    public void setEffectiveintervalstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime effectiveintervalstart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(EFFECTIVEINTERVALSTART$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(EFFECTIVEINTERVALSTART$16);
            }
            target.set(effectiveintervalstart);
        }
    }
    
    /**
     * Appends and returns a new empty "effectiveintervalstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEffectiveintervalstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(EFFECTIVEINTERVALSTART$16);
            return target;
        }
    }
    
    /**
     * Unsets the "effectiveintervalstart" element
     */
    public void unsetEffectiveintervalstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVEINTERVALSTART$16, 0);
        }
    }
    
    /**
     * Gets the "effort" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat getEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(EFFORT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effort" element
     */
    public boolean isSetEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFORT$18) != 0;
        }
    }
    
    /**
     * Sets the "effort" element
     */
    public void setEffort(com.microsoft.schemas.crm._2006.webservices.CrmFloat effort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(EFFORT$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(EFFORT$18);
            }
            target.set(effort);
        }
    }
    
    /**
     * Appends and returns a new empty "effort" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(EFFORT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "effort" element
     */
    public void unsetEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFORT$18, 0);
        }
    }
    
    /**
     * Gets the "endtime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEndtime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ENDTIME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endtime" element
     */
    public boolean isSetEndtime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDTIME$20) != 0;
        }
    }
    
    /**
     * Sets the "endtime" element
     */
    public void setEndtime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime endtime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ENDTIME$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ENDTIME$20);
            }
            target.set(endtime);
        }
    }
    
    /**
     * Appends and returns a new empty "endtime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEndtime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ENDTIME$20);
            return target;
        }
    }
    
    /**
     * Unsets the "endtime" element
     */
    public void unsetEndtime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDTIME$20, 0);
        }
    }
    
    /**
     * Gets the "extentcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getExtentcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(EXTENTCODE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extentcode" element
     */
    public boolean isSetExtentcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENTCODE$22) != 0;
        }
    }
    
    /**
     * Sets the "extentcode" element
     */
    public void setExtentcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber extentcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(EXTENTCODE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(EXTENTCODE$22);
            }
            target.set(extentcode);
        }
    }
    
    /**
     * Appends and returns a new empty "extentcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewExtentcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(EXTENTCODE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "extentcode" element
     */
    public void unsetExtentcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENTCODE$22, 0);
        }
    }
    
    /**
     * Gets the "groupdesignator" element
     */
    public java.lang.String getGroupdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPDESIGNATOR$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupdesignator" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPDESIGNATOR$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "groupdesignator" element
     */
    public boolean isSetGroupdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPDESIGNATOR$24) != 0;
        }
    }
    
    /**
     * Sets the "groupdesignator" element
     */
    public void setGroupdesignator(java.lang.String groupdesignator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPDESIGNATOR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPDESIGNATOR$24);
            }
            target.setStringValue(groupdesignator);
        }
    }
    
    /**
     * Sets (as xml) the "groupdesignator" element
     */
    public void xsetGroupdesignator(org.apache.xmlbeans.XmlString groupdesignator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPDESIGNATOR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPDESIGNATOR$24);
            }
            target.set(groupdesignator);
        }
    }
    
    /**
     * Unsets the "groupdesignator" element
     */
    public void unsetGroupdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPDESIGNATOR$24, 0);
        }
    }
    
    /**
     * Gets the "innercalendarid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getInnercalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(INNERCALENDARID$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "innercalendarid" element
     */
    public boolean isSetInnercalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INNERCALENDARID$26) != 0;
        }
    }
    
    /**
     * Sets the "innercalendarid" element
     */
    public void setInnercalendarid(com.microsoft.schemas.crm._2006.webservices.Lookup innercalendarid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(INNERCALENDARID$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(INNERCALENDARID$26);
            }
            target.set(innercalendarid);
        }
    }
    
    /**
     * Appends and returns a new empty "innercalendarid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewInnercalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(INNERCALENDARID$26);
            return target;
        }
    }
    
    /**
     * Unsets the "innercalendarid" element
     */
    public void unsetInnercalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INNERCALENDARID$26, 0);
        }
    }
    
    /**
     * Gets the "ismodified" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsmodified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISMODIFIED$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ismodified" element
     */
    public boolean isSetIsmodified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMODIFIED$28) != 0;
        }
    }
    
    /**
     * Sets the "ismodified" element
     */
    public void setIsmodified(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ismodified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISMODIFIED$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISMODIFIED$28);
            }
            target.set(ismodified);
        }
    }
    
    /**
     * Appends and returns a new empty "ismodified" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsmodified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISMODIFIED$28);
            return target;
        }
    }
    
    /**
     * Unsets the "ismodified" element
     */
    public void unsetIsmodified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMODIFIED$28, 0);
        }
    }
    
    /**
     * Gets the "isselected" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsselected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSELECTED$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isselected" element
     */
    public boolean isSetIsselected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSELECTED$30) != 0;
        }
    }
    
    /**
     * Sets the "isselected" element
     */
    public void setIsselected(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isselected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSELECTED$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSELECTED$30);
            }
            target.set(isselected);
        }
    }
    
    /**
     * Appends and returns a new empty "isselected" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsselected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSELECTED$30);
            return target;
        }
    }
    
    /**
     * Unsets the "isselected" element
     */
    public void unsetIsselected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSELECTED$30, 0);
        }
    }
    
    /**
     * Gets the "issimple" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIssimple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSIMPLE$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "issimple" element
     */
    public boolean isSetIssimple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSIMPLE$32) != 0;
        }
    }
    
    /**
     * Sets the "issimple" element
     */
    public void setIssimple(com.microsoft.schemas.crm._2006.webservices.CrmBoolean issimple)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSIMPLE$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSIMPLE$32);
            }
            target.set(issimple);
        }
    }
    
    /**
     * Appends and returns a new empty "issimple" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIssimple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSIMPLE$32);
            return target;
        }
    }
    
    /**
     * Unsets the "issimple" element
     */
    public void unsetIssimple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSIMPLE$32, 0);
        }
    }
    
    /**
     * Gets the "isvaried" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsvaried()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISVARIED$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isvaried" element
     */
    public boolean isSetIsvaried()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVARIED$34) != 0;
        }
    }
    
    /**
     * Sets the "isvaried" element
     */
    public void setIsvaried(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isvaried)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISVARIED$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISVARIED$34);
            }
            target.set(isvaried);
        }
    }
    
    /**
     * Appends and returns a new empty "isvaried" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsvaried()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISVARIED$34);
            return target;
        }
    }
    
    /**
     * Unsets the "isvaried" element
     */
    public void unsetIsvaried()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVARIED$34, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$36, 0);
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
            return get_store().count_elements(MODIFIEDBY$36) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$36);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$36);
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
            get_store().remove_element(MODIFIEDBY$36, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$38, 0);
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
            return get_store().count_elements(MODIFIEDON$38) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$38);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$38);
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
            get_store().remove_element(MODIFIEDON$38, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$40, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$40, 0);
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
            return get_store().count_elements(NAME$40) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$40);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$40);
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
            get_store().remove_element(NAME$40, 0);
        }
    }
    
    /**
     * Gets the "offset" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(OFFSET$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "offset" element
     */
    public boolean isSetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFSET$42) != 0;
        }
    }
    
    /**
     * Sets the "offset" element
     */
    public void setOffset(com.microsoft.schemas.crm._2006.webservices.CrmNumber offset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(OFFSET$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(OFFSET$42);
            }
            target.set(offset);
        }
    }
    
    /**
     * Appends and returns a new empty "offset" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(OFFSET$42);
            return target;
        }
    }
    
    /**
     * Unsets the "offset" element
     */
    public void unsetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFSET$42, 0);
        }
    }
    
    /**
     * Gets the "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(ORGANIZATIONID$44, 0);
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
            return get_store().count_elements(ORGANIZATIONID$44) != 0;
        }
    }
    
    /**
     * Sets the "organizationid" element
     */
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(ORGANIZATIONID$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(ORGANIZATIONID$44);
            }
            target.set(organizationid);
        }
    }
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(ORGANIZATIONID$44);
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
            get_store().remove_element(ORGANIZATIONID$44, 0);
        }
    }
    
    /**
     * Gets the "pattern" element
     */
    public java.lang.String getPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATTERN$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pattern" element
     */
    public org.apache.xmlbeans.XmlString xgetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATTERN$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "pattern" element
     */
    public boolean isSetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATTERN$46) != 0;
        }
    }
    
    /**
     * Sets the "pattern" element
     */
    public void setPattern(java.lang.String pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATTERN$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATTERN$46);
            }
            target.setStringValue(pattern);
        }
    }
    
    /**
     * Sets (as xml) the "pattern" element
     */
    public void xsetPattern(org.apache.xmlbeans.XmlString pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATTERN$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATTERN$46);
            }
            target.set(pattern);
        }
    }
    
    /**
     * Unsets the "pattern" element
     */
    public void unsetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATTERN$46, 0);
        }
    }
    
    /**
     * Gets the "rank" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(RANK$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rank" element
     */
    public boolean isSetRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RANK$48) != 0;
        }
    }
    
    /**
     * Sets the "rank" element
     */
    public void setRank(com.microsoft.schemas.crm._2006.webservices.CrmNumber rank)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(RANK$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(RANK$48);
            }
            target.set(rank);
        }
    }
    
    /**
     * Appends and returns a new empty "rank" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(RANK$48);
            return target;
        }
    }
    
    /**
     * Unsets the "rank" element
     */
    public void unsetRank()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RANK$48, 0);
        }
    }
    
    /**
     * Gets the "serviceid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getServiceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SERVICEID$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serviceid" element
     */
    public boolean isSetServiceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEID$50) != 0;
        }
    }
    
    /**
     * Sets the "serviceid" element
     */
    public void setServiceid(com.microsoft.schemas.crm._2006.webservices.Lookup serviceid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SERVICEID$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SERVICEID$50);
            }
            target.set(serviceid);
        }
    }
    
    /**
     * Appends and returns a new empty "serviceid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewServiceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SERVICEID$50);
            return target;
        }
    }
    
    /**
     * Unsets the "serviceid" element
     */
    public void unsetServiceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEID$50, 0);
        }
    }
    
    /**
     * Gets the "starttime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(STARTTIME$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "starttime" element
     */
    public boolean isSetStarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTTIME$52) != 0;
        }
    }
    
    /**
     * Sets the "starttime" element
     */
    public void setStarttime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime starttime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(STARTTIME$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(STARTTIME$52);
            }
            target.set(starttime);
        }
    }
    
    /**
     * Appends and returns a new empty "starttime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(STARTTIME$52);
            return target;
        }
    }
    
    /**
     * Unsets the "starttime" element
     */
    public void unsetStarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTTIME$52, 0);
        }
    }
    
    /**
     * Gets the "subcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSubcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUBCODE$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subcode" element
     */
    public boolean isSetSubcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBCODE$54) != 0;
        }
    }
    
    /**
     * Sets the "subcode" element
     */
    public void setSubcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber subcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUBCODE$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUBCODE$54);
            }
            target.set(subcode);
        }
    }
    
    /**
     * Appends and returns a new empty "subcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSubcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUBCODE$54);
            return target;
        }
    }
    
    /**
     * Unsets the "subcode" element
     */
    public void unsetSubcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBCODE$54, 0);
        }
    }
    
    /**
     * Gets the "timecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMECODE$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timecode" element
     */
    public boolean isSetTimecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMECODE$56) != 0;
        }
    }
    
    /**
     * Sets the "timecode" element
     */
    public void setTimecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber timecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMECODE$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMECODE$56);
            }
            target.set(timecode);
        }
    }
    
    /**
     * Appends and returns a new empty "timecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMECODE$56);
            return target;
        }
    }
    
    /**
     * Unsets the "timecode" element
     */
    public void unsetTimecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMECODE$56, 0);
        }
    }
    
    /**
     * Gets the "timezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONECODE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonecode" element
     */
    public boolean isSetTimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONECODE$58) != 0;
        }
    }
    
    /**
     * Sets the "timezonecode" element
     */
    public void setTimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONECODE$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONECODE$58);
            }
            target.set(timezonecode);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONECODE$58);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonecode" element
     */
    public void unsetTimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONECODE$58, 0);
        }
    }
}
