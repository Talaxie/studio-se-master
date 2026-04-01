/*
 * XML Type:  AppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML AppointmentRequest(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class AppointmentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest
{
    
    public AppointmentRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ServiceId");
    private static final javax.xml.namespace.QName ANCHOROFFSET$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "AnchorOffset");
    private static final javax.xml.namespace.QName USERTIMEZONECODE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "UserTimeZoneCode");
    private static final javax.xml.namespace.QName RECURRENCEDURATION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "RecurrenceDuration");
    private static final javax.xml.namespace.QName RECURRENCETIMEZONECODE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "RecurrenceTimeZoneCode");
    private static final javax.xml.namespace.QName APPOINTMENTSTOIGNORE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "AppointmentsToIgnore");
    private static final javax.xml.namespace.QName REQUIREDRESOURCES$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "RequiredResources");
    private static final javax.xml.namespace.QName SEARCHWINDOWSTART$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "SearchWindowStart");
    private static final javax.xml.namespace.QName SEARCHWINDOWEND$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "SearchWindowEnd");
    private static final javax.xml.namespace.QName SEARCHRECURRENCESTART$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "SearchRecurrenceStart");
    private static final javax.xml.namespace.QName SEARCHRECURRENCERULE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "SearchRecurrenceRule");
    private static final javax.xml.namespace.QName DURATION$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Duration");
    private static final javax.xml.namespace.QName CONSTRAINTS$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Constraints");
    private static final javax.xml.namespace.QName OBJECTIVES$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Objectives");
    private static final javax.xml.namespace.QName DIRECTION$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Direction");
    private static final javax.xml.namespace.QName NUMBEROFRESULTS$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "NumberOfResults");
    private static final javax.xml.namespace.QName SITES$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Sites");
    
    
    /**
     * Gets the "ServiceId" element
     */
    public java.lang.String getServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ServiceId" element
     */
    public com.microsoft.wsdl.types.Guid xgetServiceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SERVICEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ServiceId" element
     */
    public void setServiceId(java.lang.String serviceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEID$0);
            }
            target.setStringValue(serviceId);
        }
    }
    
    /**
     * Sets (as xml) the "ServiceId" element
     */
    public void xsetServiceId(com.microsoft.wsdl.types.Guid serviceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SERVICEID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SERVICEID$0);
            }
            target.set(serviceId);
        }
    }
    
    /**
     * Gets the "AnchorOffset" element
     */
    public int getAnchorOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANCHOROFFSET$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AnchorOffset" element
     */
    public org.apache.xmlbeans.XmlInt xgetAnchorOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANCHOROFFSET$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AnchorOffset" element
     */
    public void setAnchorOffset(int anchorOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANCHOROFFSET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANCHOROFFSET$2);
            }
            target.setIntValue(anchorOffset);
        }
    }
    
    /**
     * Sets (as xml) the "AnchorOffset" element
     */
    public void xsetAnchorOffset(org.apache.xmlbeans.XmlInt anchorOffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ANCHOROFFSET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ANCHOROFFSET$2);
            }
            target.set(anchorOffset);
        }
    }
    
    /**
     * Gets the "UserTimeZoneCode" element
     */
    public int getUserTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERTIMEZONECODE$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserTimeZoneCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetUserTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(USERTIMEZONECODE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserTimeZoneCode" element
     */
    public void setUserTimeZoneCode(int userTimeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERTIMEZONECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERTIMEZONECODE$4);
            }
            target.setIntValue(userTimeZoneCode);
        }
    }
    
    /**
     * Sets (as xml) the "UserTimeZoneCode" element
     */
    public void xsetUserTimeZoneCode(org.apache.xmlbeans.XmlInt userTimeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(USERTIMEZONECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(USERTIMEZONECODE$4);
            }
            target.set(userTimeZoneCode);
        }
    }
    
    /**
     * Gets the "RecurrenceDuration" element
     */
    public int getRecurrenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEDURATION$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecurrenceDuration" element
     */
    public org.apache.xmlbeans.XmlInt xgetRecurrenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECURRENCEDURATION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RecurrenceDuration" element
     */
    public void setRecurrenceDuration(int recurrenceDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCEDURATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECURRENCEDURATION$6);
            }
            target.setIntValue(recurrenceDuration);
        }
    }
    
    /**
     * Sets (as xml) the "RecurrenceDuration" element
     */
    public void xsetRecurrenceDuration(org.apache.xmlbeans.XmlInt recurrenceDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECURRENCEDURATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECURRENCEDURATION$6);
            }
            target.set(recurrenceDuration);
        }
    }
    
    /**
     * Gets the "RecurrenceTimeZoneCode" element
     */
    public int getRecurrenceTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCETIMEZONECODE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecurrenceTimeZoneCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetRecurrenceTimeZoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECURRENCETIMEZONECODE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RecurrenceTimeZoneCode" element
     */
    public void setRecurrenceTimeZoneCode(int recurrenceTimeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECURRENCETIMEZONECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECURRENCETIMEZONECODE$8);
            }
            target.setIntValue(recurrenceTimeZoneCode);
        }
    }
    
    /**
     * Sets (as xml) the "RecurrenceTimeZoneCode" element
     */
    public void xsetRecurrenceTimeZoneCode(org.apache.xmlbeans.XmlInt recurrenceTimeZoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECURRENCETIMEZONECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECURRENCETIMEZONECODE$8);
            }
            target.set(recurrenceTimeZoneCode);
        }
    }
    
    /**
     * Gets the "AppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore getAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AppointmentsToIgnore" element
     */
    public boolean isSetAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPOINTMENTSTOIGNORE$10) != 0;
        }
    }
    
    /**
     * Sets the "AppointmentsToIgnore" element
     */
    public void setAppointmentsToIgnore(com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore appointmentsToIgnore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore)get_store().find_element_user(APPOINTMENTSTOIGNORE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore)get_store().add_element_user(APPOINTMENTSTOIGNORE$10);
            }
            target.set(appointmentsToIgnore);
        }
    }
    
    /**
     * Appends and returns a new empty "AppointmentsToIgnore" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore addNewAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore)get_store().add_element_user(APPOINTMENTSTOIGNORE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "AppointmentsToIgnore" element
     */
    public void unsetAppointmentsToIgnore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPOINTMENTSTOIGNORE$10, 0);
        }
    }
    
    /**
     * Gets the "RequiredResources" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource getRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource)get_store().find_element_user(REQUIREDRESOURCES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RequiredResources" element
     */
    public boolean isSetRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREDRESOURCES$12) != 0;
        }
    }
    
    /**
     * Sets the "RequiredResources" element
     */
    public void setRequiredResources(com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource requiredResources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource)get_store().find_element_user(REQUIREDRESOURCES$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource)get_store().add_element_user(REQUIREDRESOURCES$12);
            }
            target.set(requiredResources);
        }
    }
    
    /**
     * Appends and returns a new empty "RequiredResources" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource addNewRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource)get_store().add_element_user(REQUIREDRESOURCES$12);
            return target;
        }
    }
    
    /**
     * Unsets the "RequiredResources" element
     */
    public void unsetRequiredResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREDRESOURCES$12, 0);
        }
    }
    
    /**
     * Gets the "SearchWindowStart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SEARCHWINDOWSTART$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SearchWindowStart" element
     */
    public boolean isSetSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHWINDOWSTART$14) != 0;
        }
    }
    
    /**
     * Sets the "SearchWindowStart" element
     */
    public void setSearchWindowStart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime searchWindowStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SEARCHWINDOWSTART$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SEARCHWINDOWSTART$14);
            }
            target.set(searchWindowStart);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchWindowStart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SEARCHWINDOWSTART$14);
            return target;
        }
    }
    
    /**
     * Unsets the "SearchWindowStart" element
     */
    public void unsetSearchWindowStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHWINDOWSTART$14, 0);
        }
    }
    
    /**
     * Gets the "SearchWindowEnd" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SEARCHWINDOWEND$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SearchWindowEnd" element
     */
    public boolean isSetSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHWINDOWEND$16) != 0;
        }
    }
    
    /**
     * Sets the "SearchWindowEnd" element
     */
    public void setSearchWindowEnd(com.microsoft.schemas.crm._2006.webservices.CrmDateTime searchWindowEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SEARCHWINDOWEND$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SEARCHWINDOWEND$16);
            }
            target.set(searchWindowEnd);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchWindowEnd" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SEARCHWINDOWEND$16);
            return target;
        }
    }
    
    /**
     * Unsets the "SearchWindowEnd" element
     */
    public void unsetSearchWindowEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHWINDOWEND$16, 0);
        }
    }
    
    /**
     * Gets the "SearchRecurrenceStart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SEARCHRECURRENCESTART$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SearchRecurrenceStart" element
     */
    public boolean isSetSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHRECURRENCESTART$18) != 0;
        }
    }
    
    /**
     * Sets the "SearchRecurrenceStart" element
     */
    public void setSearchRecurrenceStart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime searchRecurrenceStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SEARCHRECURRENCESTART$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SEARCHRECURRENCESTART$18);
            }
            target.set(searchRecurrenceStart);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchRecurrenceStart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SEARCHRECURRENCESTART$18);
            return target;
        }
    }
    
    /**
     * Unsets the "SearchRecurrenceStart" element
     */
    public void unsetSearchRecurrenceStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHRECURRENCESTART$18, 0);
        }
    }
    
    /**
     * Gets the "SearchRecurrenceRule" element
     */
    public java.lang.String getSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SearchRecurrenceRule" element
     */
    public org.apache.xmlbeans.XmlString xgetSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "SearchRecurrenceRule" element
     */
    public boolean isSetSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHRECURRENCERULE$20) != 0;
        }
    }
    
    /**
     * Sets the "SearchRecurrenceRule" element
     */
    public void setSearchRecurrenceRule(java.lang.String searchRecurrenceRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHRECURRENCERULE$20);
            }
            target.setStringValue(searchRecurrenceRule);
        }
    }
    
    /**
     * Sets (as xml) the "SearchRecurrenceRule" element
     */
    public void xsetSearchRecurrenceRule(org.apache.xmlbeans.XmlString searchRecurrenceRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHRECURRENCERULE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHRECURRENCERULE$20);
            }
            target.set(searchRecurrenceRule);
        }
    }
    
    /**
     * Unsets the "SearchRecurrenceRule" element
     */
    public void unsetSearchRecurrenceRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHRECURRENCERULE$20, 0);
        }
    }
    
    /**
     * Gets the "Duration" element
     */
    public int getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Duration" element
     */
    public org.apache.xmlbeans.XmlInt xgetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DURATION$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Duration" element
     */
    public void setDuration(int duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$22);
            }
            target.setIntValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "Duration" element
     */
    public void xsetDuration(org.apache.xmlbeans.XmlInt duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DURATION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DURATION$22);
            }
            target.set(duration);
        }
    }
    
    /**
     * Gets the "Constraints" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation getConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation)get_store().find_element_user(CONSTRAINTS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Constraints" element
     */
    public boolean isSetConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTS$24) != 0;
        }
    }
    
    /**
     * Sets the "Constraints" element
     */
    public void setConstraints(com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation constraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation)get_store().find_element_user(CONSTRAINTS$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation)get_store().add_element_user(CONSTRAINTS$24);
            }
            target.set(constraints);
        }
    }
    
    /**
     * Appends and returns a new empty "Constraints" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation addNewConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation)get_store().add_element_user(CONSTRAINTS$24);
            return target;
        }
    }
    
    /**
     * Unsets the "Constraints" element
     */
    public void unsetConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTS$24, 0);
        }
    }
    
    /**
     * Gets the "Objectives" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation getObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation)get_store().find_element_user(OBJECTIVES$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Objectives" element
     */
    public boolean isSetObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTIVES$26) != 0;
        }
    }
    
    /**
     * Sets the "Objectives" element
     */
    public void setObjectives(com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation objectives)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation)get_store().find_element_user(OBJECTIVES$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation)get_store().add_element_user(OBJECTIVES$26);
            }
            target.set(objectives);
        }
    }
    
    /**
     * Appends and returns a new empty "Objectives" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation addNewObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation)get_store().add_element_user(OBJECTIVES$26);
            return target;
        }
    }
    
    /**
     * Unsets the "Objectives" element
     */
    public void unsetObjectives()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTIVES$26, 0);
        }
    }
    
    /**
     * Gets the "Direction" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.SearchDirection.Enum getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTION$28, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.scheduling.SearchDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Direction" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.SearchDirection xgetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchDirection)get_store().find_element_user(DIRECTION$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Direction" element
     */
    public void setDirection(com.microsoft.schemas.crm._2006.scheduling.SearchDirection.Enum direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTION$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTION$28);
            }
            target.setEnumValue(direction);
        }
    }
    
    /**
     * Sets (as xml) the "Direction" element
     */
    public void xsetDirection(com.microsoft.schemas.crm._2006.scheduling.SearchDirection direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchDirection target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchDirection)get_store().find_element_user(DIRECTION$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.SearchDirection)get_store().add_element_user(DIRECTION$28);
            }
            target.set(direction);
        }
    }
    
    /**
     * Gets the "NumberOfResults" element
     */
    public int getNumberOfResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRESULTS$30, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfResults" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRESULTS$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberOfResults" element
     */
    public void setNumberOfResults(int numberOfResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRESULTS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFRESULTS$30);
            }
            target.setIntValue(numberOfResults);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfResults" element
     */
    public void xsetNumberOfResults(org.apache.xmlbeans.XmlInt numberOfResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRESULTS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFRESULTS$30);
            }
            target.set(numberOfResults);
        }
    }
    
    /**
     * Gets the "Sites" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid getSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid)get_store().find_element_user(SITES$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Sites" element
     */
    public boolean isSetSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITES$32) != 0;
        }
    }
    
    /**
     * Sets the "Sites" element
     */
    public void setSites(com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid sites)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid)get_store().find_element_user(SITES$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid)get_store().add_element_user(SITES$32);
            }
            target.set(sites);
        }
    }
    
    /**
     * Appends and returns a new empty "Sites" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid addNewSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid)get_store().add_element_user(SITES$32);
            return target;
        }
    }
    
    /**
     * Unsets the "Sites" element
     */
    public void unsetSites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITES$32, 0);
        }
    }
}
