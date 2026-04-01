/*
 * XML Type:  TimeInfo
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.TimeInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML TimeInfo(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class TimeInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.TimeInfo
{
    
    public TimeInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Start");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "End");
    private static final javax.xml.namespace.QName TIMECODE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "TimeCode");
    private static final javax.xml.namespace.QName SUBCODE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "SubCode");
    private static final javax.xml.namespace.QName SOURCEID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "SourceId");
    private static final javax.xml.namespace.QName CALENDARID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "CalendarId");
    private static final javax.xml.namespace.QName SOURCETYPECODE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "SourceTypeCode");
    private static final javax.xml.namespace.QName ISACTIVITY$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "IsActivity");
    private static final javax.xml.namespace.QName ACTIVITYSTATUSCODE$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ActivityStatusCode");
    private static final javax.xml.namespace.QName EFFORT$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Effort");
    private static final javax.xml.namespace.QName DISPLAYTEXT$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "DisplayText");
    
    
    /**
     * Gets the "Start" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Start" element
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(START$0) != 0;
        }
    }
    
    /**
     * Sets the "Start" element
     */
    public void setStart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Appends and returns a new empty "Start" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(START$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Start" element
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(START$0, 0);
        }
    }
    
    /**
     * Gets the "End" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "End" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$2) != 0;
        }
    }
    
    /**
     * Sets the "End" element
     */
    public void setEnd(com.microsoft.schemas.crm._2006.webservices.CrmDateTime end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(END$2);
            }
            target.set(end);
        }
    }
    
    /**
     * Appends and returns a new empty "End" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(END$2);
            return target;
        }
    }
    
    /**
     * Unsets the "End" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$2, 0);
        }
    }
    
    /**
     * Gets the "TimeCode" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum getTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TimeCode" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TimeCode xgetTimeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeCode)get_store().find_element_user(TIMECODE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TimeCode" element
     */
    public void setTimeCode(com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum timeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMECODE$4);
            }
            target.setEnumValue(timeCode);
        }
    }
    
    /**
     * Sets (as xml) the "TimeCode" element
     */
    public void xsetTimeCode(com.microsoft.schemas.crm._2006.scheduling.TimeCode timeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TimeCode target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TimeCode)get_store().find_element_user(TIMECODE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.TimeCode)get_store().add_element_user(TIMECODE$4);
            }
            target.set(timeCode);
        }
    }
    
    /**
     * Gets the "SubCode" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.SubCode.Enum getSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.scheduling.SubCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubCode" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.SubCode xgetSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SubCode target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SubCode)get_store().find_element_user(SUBCODE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SubCode" element
     */
    public void setSubCode(com.microsoft.schemas.crm._2006.scheduling.SubCode.Enum subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBCODE$6);
            }
            target.setEnumValue(subCode);
        }
    }
    
    /**
     * Sets (as xml) the "SubCode" element
     */
    public void xsetSubCode(com.microsoft.schemas.crm._2006.scheduling.SubCode subCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SubCode target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SubCode)get_store().find_element_user(SUBCODE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.SubCode)get_store().add_element_user(SUBCODE$6);
            }
            target.set(subCode);
        }
    }
    
    /**
     * Gets the "SourceId" element
     */
    public java.lang.String getSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceId" element
     */
    public com.microsoft.wsdl.types.Guid xgetSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SOURCEID$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SourceId" element
     */
    public void setSourceId(java.lang.String sourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$8);
            }
            target.setStringValue(sourceId);
        }
    }
    
    /**
     * Sets (as xml) the "SourceId" element
     */
    public void xsetSourceId(com.microsoft.wsdl.types.Guid sourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SOURCEID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SOURCEID$8);
            }
            target.set(sourceId);
        }
    }
    
    /**
     * Gets the "CalendarId" element
     */
    public java.lang.String getCalendarId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CalendarId" element
     */
    public com.microsoft.wsdl.types.Guid xgetCalendarId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CALENDARID$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CalendarId" element
     */
    public void setCalendarId(java.lang.String calendarId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALENDARID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALENDARID$10);
            }
            target.setStringValue(calendarId);
        }
    }
    
    /**
     * Sets (as xml) the "CalendarId" element
     */
    public void xsetCalendarId(com.microsoft.wsdl.types.Guid calendarId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CALENDARID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CALENDARID$10);
            }
            target.set(calendarId);
        }
    }
    
    /**
     * Gets the "SourceTypeCode" element
     */
    public int getSourceTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPECODE$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceTypeCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetSourceTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPECODE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SourceTypeCode" element
     */
    public void setSourceTypeCode(int sourceTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPECODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETYPECODE$12);
            }
            target.setIntValue(sourceTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "SourceTypeCode" element
     */
    public void xsetSourceTypeCode(org.apache.xmlbeans.XmlInt sourceTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCETYPECODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCETYPECODE$12);
            }
            target.set(sourceTypeCode);
        }
    }
    
    /**
     * Gets the "IsActivity" element
     */
    public boolean getIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVITY$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActivity" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITY$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IsActivity" element
     */
    public void setIsActivity(boolean isActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVITY$14);
            }
            target.setBooleanValue(isActivity);
        }
    }
    
    /**
     * Sets (as xml) the "IsActivity" element
     */
    public void xsetIsActivity(org.apache.xmlbeans.XmlBoolean isActivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVITY$14);
            }
            target.set(isActivity);
        }
    }
    
    /**
     * Gets the "ActivityStatusCode" element
     */
    public int getActivityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSCODE$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityStatusCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetActivityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYSTATUSCODE$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ActivityStatusCode" element
     */
    public void setActivityStatusCode(int activityStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYSTATUSCODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYSTATUSCODE$16);
            }
            target.setIntValue(activityStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityStatusCode" element
     */
    public void xsetActivityStatusCode(org.apache.xmlbeans.XmlInt activityStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYSTATUSCODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACTIVITYSTATUSCODE$16);
            }
            target.set(activityStatusCode);
        }
    }
    
    /**
     * Gets the "Effort" element
     */
    public double getEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFORT$18, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "Effort" element
     */
    public org.apache.xmlbeans.XmlDouble xgetEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EFFORT$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Effort" element
     */
    public void setEffort(double effort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFORT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFORT$18);
            }
            target.setDoubleValue(effort);
        }
    }
    
    /**
     * Sets (as xml) the "Effort" element
     */
    public void xsetEffort(org.apache.xmlbeans.XmlDouble effort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EFFORT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EFFORT$18);
            }
            target.set(effort);
        }
    }
    
    /**
     * Gets the "DisplayText" element
     */
    public java.lang.String getDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYTEXT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisplayText" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYTEXT$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "DisplayText" element
     */
    public boolean isSetDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYTEXT$20) != 0;
        }
    }
    
    /**
     * Sets the "DisplayText" element
     */
    public void setDisplayText(java.lang.String displayText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYTEXT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYTEXT$20);
            }
            target.setStringValue(displayText);
        }
    }
    
    /**
     * Sets (as xml) the "DisplayText" element
     */
    public void xsetDisplayText(org.apache.xmlbeans.XmlString displayText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYTEXT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYTEXT$20);
            }
            target.set(displayText);
        }
    }
    
    /**
     * Unsets the "DisplayText" element
     */
    public void unsetDisplayText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYTEXT$20, 0);
        }
    }
}
