/*
 * XML Type:  appointment
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Appointment
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML appointment(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Appointment extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Appointment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("appointmentd62btype");
    
    /**
     * Gets the "activityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getActivityid();
    
    /**
     * True if has "activityid" element
     */
    boolean isSetActivityid();
    
    /**
     * Sets the "activityid" element
     */
    void setActivityid(com.microsoft.schemas.crm._2006.webservices.Key activityid);
    
    /**
     * Appends and returns a new empty "activityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewActivityid();
    
    /**
     * Unsets the "activityid" element
     */
    void unsetActivityid();
    
    /**
     * Gets the "actualdurationminutes" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getActualdurationminutes();
    
    /**
     * True if has "actualdurationminutes" element
     */
    boolean isSetActualdurationminutes();
    
    /**
     * Sets the "actualdurationminutes" element
     */
    void setActualdurationminutes(com.microsoft.schemas.crm._2006.webservices.CrmNumber actualdurationminutes);
    
    /**
     * Appends and returns a new empty "actualdurationminutes" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewActualdurationminutes();
    
    /**
     * Unsets the "actualdurationminutes" element
     */
    void unsetActualdurationminutes();
    
    /**
     * Gets the "actualend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActualend();
    
    /**
     * True if has "actualend" element
     */
    boolean isSetActualend();
    
    /**
     * Sets the "actualend" element
     */
    void setActualend(com.microsoft.schemas.crm._2006.webservices.CrmDateTime actualend);
    
    /**
     * Appends and returns a new empty "actualend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActualend();
    
    /**
     * Unsets the "actualend" element
     */
    void unsetActualend();
    
    /**
     * Gets the "actualstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActualstart();
    
    /**
     * True if has "actualstart" element
     */
    boolean isSetActualstart();
    
    /**
     * Sets the "actualstart" element
     */
    void setActualstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime actualstart);
    
    /**
     * Appends and returns a new empty "actualstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActualstart();
    
    /**
     * Unsets the "actualstart" element
     */
    void unsetActualstart();
    
    /**
     * Gets the "category" element
     */
    java.lang.String getCategory();
    
    /**
     * Gets (as xml) the "category" element
     */
    org.apache.xmlbeans.XmlString xgetCategory();
    
    /**
     * True if has "category" element
     */
    boolean isSetCategory();
    
    /**
     * Sets the "category" element
     */
    void setCategory(java.lang.String category);
    
    /**
     * Sets (as xml) the "category" element
     */
    void xsetCategory(org.apache.xmlbeans.XmlString category);
    
    /**
     * Unsets the "category" element
     */
    void unsetCategory();
    
    /**
     * Gets the "createdby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby();
    
    /**
     * True if has "createdby" element
     */
    boolean isSetCreatedby();
    
    /**
     * Sets the "createdby" element
     */
    void setCreatedby(com.microsoft.schemas.crm._2006.webservices.Lookup createdby);
    
    /**
     * Appends and returns a new empty "createdby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedby();
    
    /**
     * Unsets the "createdby" element
     */
    void unsetCreatedby();
    
    /**
     * Gets the "createdon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon();
    
    /**
     * True if has "createdon" element
     */
    boolean isSetCreatedon();
    
    /**
     * Sets the "createdon" element
     */
    void setCreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime createdon);
    
    /**
     * Appends and returns a new empty "createdon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCreatedon();
    
    /**
     * Unsets the "createdon" element
     */
    void unsetCreatedon();
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "globalobjectid" element
     */
    java.lang.String getGlobalobjectid();
    
    /**
     * Gets (as xml) the "globalobjectid" element
     */
    org.apache.xmlbeans.XmlString xgetGlobalobjectid();
    
    /**
     * True if has "globalobjectid" element
     */
    boolean isSetGlobalobjectid();
    
    /**
     * Sets the "globalobjectid" element
     */
    void setGlobalobjectid(java.lang.String globalobjectid);
    
    /**
     * Sets (as xml) the "globalobjectid" element
     */
    void xsetGlobalobjectid(org.apache.xmlbeans.XmlString globalobjectid);
    
    /**
     * Unsets the "globalobjectid" element
     */
    void unsetGlobalobjectid();
    
    /**
     * Gets the "importsequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getImportsequencenumber();
    
    /**
     * True if has "importsequencenumber" element
     */
    boolean isSetImportsequencenumber();
    
    /**
     * Sets the "importsequencenumber" element
     */
    void setImportsequencenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber importsequencenumber);
    
    /**
     * Appends and returns a new empty "importsequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewImportsequencenumber();
    
    /**
     * Unsets the "importsequencenumber" element
     */
    void unsetImportsequencenumber();
    
    /**
     * Gets the "isalldayevent" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsalldayevent();
    
    /**
     * True if has "isalldayevent" element
     */
    boolean isSetIsalldayevent();
    
    /**
     * Sets the "isalldayevent" element
     */
    void setIsalldayevent(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isalldayevent);
    
    /**
     * Appends and returns a new empty "isalldayevent" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsalldayevent();
    
    /**
     * Unsets the "isalldayevent" element
     */
    void unsetIsalldayevent();
    
    /**
     * Gets the "isbilled" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsbilled();
    
    /**
     * True if has "isbilled" element
     */
    boolean isSetIsbilled();
    
    /**
     * Sets the "isbilled" element
     */
    void setIsbilled(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isbilled);
    
    /**
     * Appends and returns a new empty "isbilled" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsbilled();
    
    /**
     * Unsets the "isbilled" element
     */
    void unsetIsbilled();
    
    /**
     * Gets the "isworkflowcreated" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsworkflowcreated();
    
    /**
     * True if has "isworkflowcreated" element
     */
    boolean isSetIsworkflowcreated();
    
    /**
     * Sets the "isworkflowcreated" element
     */
    void setIsworkflowcreated(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isworkflowcreated);
    
    /**
     * Appends and returns a new empty "isworkflowcreated" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsworkflowcreated();
    
    /**
     * Unsets the "isworkflowcreated" element
     */
    void unsetIsworkflowcreated();
    
    /**
     * Gets the "location" element
     */
    java.lang.String getLocation();
    
    /**
     * Gets (as xml) the "location" element
     */
    org.apache.xmlbeans.XmlString xgetLocation();
    
    /**
     * True if has "location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(java.lang.String location);
    
    /**
     * Sets (as xml) the "location" element
     */
    void xsetLocation(org.apache.xmlbeans.XmlString location);
    
    /**
     * Unsets the "location" element
     */
    void unsetLocation();
    
    /**
     * Gets the "modifiedby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getModifiedby();
    
    /**
     * True if has "modifiedby" element
     */
    boolean isSetModifiedby();
    
    /**
     * Sets the "modifiedby" element
     */
    void setModifiedby(com.microsoft.schemas.crm._2006.webservices.Lookup modifiedby);
    
    /**
     * Appends and returns a new empty "modifiedby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewModifiedby();
    
    /**
     * Unsets the "modifiedby" element
     */
    void unsetModifiedby();
    
    /**
     * Gets the "modifiedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getModifiedon();
    
    /**
     * True if has "modifiedon" element
     */
    boolean isSetModifiedon();
    
    /**
     * Sets the "modifiedon" element
     */
    void setModifiedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime modifiedon);
    
    /**
     * Appends and returns a new empty "modifiedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewModifiedon();
    
    /**
     * Unsets the "modifiedon" element
     */
    void unsetModifiedon();
    
    /**
     * Gets the "optionalattendees" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty getOptionalattendees();
    
    /**
     * True if has "optionalattendees" element
     */
    boolean isSetOptionalattendees();
    
    /**
     * Sets the "optionalattendees" element
     */
    void setOptionalattendees(com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty optionalattendees);
    
    /**
     * Appends and returns a new empty "optionalattendees" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty addNewOptionalattendees();
    
    /**
     * Unsets the "optionalattendees" element
     */
    void unsetOptionalattendees();
    
    /**
     * Gets the "organizer" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty getOrganizer();
    
    /**
     * True if has "organizer" element
     */
    boolean isSetOrganizer();
    
    /**
     * Sets the "organizer" element
     */
    void setOrganizer(com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty organizer);
    
    /**
     * Appends and returns a new empty "organizer" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty addNewOrganizer();
    
    /**
     * Unsets the "organizer" element
     */
    void unsetOrganizer();
    
    /**
     * Gets the "outlookownerapptid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getOutlookownerapptid();
    
    /**
     * True if has "outlookownerapptid" element
     */
    boolean isSetOutlookownerapptid();
    
    /**
     * Sets the "outlookownerapptid" element
     */
    void setOutlookownerapptid(com.microsoft.schemas.crm._2006.webservices.CrmNumber outlookownerapptid);
    
    /**
     * Appends and returns a new empty "outlookownerapptid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewOutlookownerapptid();
    
    /**
     * Unsets the "outlookownerapptid" element
     */
    void unsetOutlookownerapptid();
    
    /**
     * Gets the "overriddencreatedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getOverriddencreatedon();
    
    /**
     * True if has "overriddencreatedon" element
     */
    boolean isSetOverriddencreatedon();
    
    /**
     * Sets the "overriddencreatedon" element
     */
    void setOverriddencreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime overriddencreatedon);
    
    /**
     * Appends and returns a new empty "overriddencreatedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewOverriddencreatedon();
    
    /**
     * Unsets the "overriddencreatedon" element
     */
    void unsetOverriddencreatedon();
    
    /**
     * Gets the "ownerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Owner getOwnerid();
    
    /**
     * True if has "ownerid" element
     */
    boolean isSetOwnerid();
    
    /**
     * Sets the "ownerid" element
     */
    void setOwnerid(com.microsoft.schemas.crm._2006.webservices.Owner ownerid);
    
    /**
     * Appends and returns a new empty "ownerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Owner addNewOwnerid();
    
    /**
     * Unsets the "ownerid" element
     */
    void unsetOwnerid();
    
    /**
     * Gets the "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOwningbusinessunit();
    
    /**
     * True if has "owningbusinessunit" element
     */
    boolean isSetOwningbusinessunit();
    
    /**
     * Sets the "owningbusinessunit" element
     */
    void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.Lookup owningbusinessunit);
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOwningbusinessunit();
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    void unsetOwningbusinessunit();
    
    /**
     * Gets the "prioritycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getPrioritycode();
    
    /**
     * True if has "prioritycode" element
     */
    boolean isSetPrioritycode();
    
    /**
     * Sets the "prioritycode" element
     */
    void setPrioritycode(com.microsoft.schemas.crm._2006.webservices.Picklist prioritycode);
    
    /**
     * Appends and returns a new empty "prioritycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewPrioritycode();
    
    /**
     * Unsets the "prioritycode" element
     */
    void unsetPrioritycode();
    
    /**
     * Gets the "regardingobjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getRegardingobjectid();
    
    /**
     * True if has "regardingobjectid" element
     */
    boolean isSetRegardingobjectid();
    
    /**
     * Sets the "regardingobjectid" element
     */
    void setRegardingobjectid(com.microsoft.schemas.crm._2006.webservices.Lookup regardingobjectid);
    
    /**
     * Appends and returns a new empty "regardingobjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewRegardingobjectid();
    
    /**
     * Unsets the "regardingobjectid" element
     */
    void unsetRegardingobjectid();
    
    /**
     * Gets the "requiredattendees" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty getRequiredattendees();
    
    /**
     * True if has "requiredattendees" element
     */
    boolean isSetRequiredattendees();
    
    /**
     * Sets the "requiredattendees" element
     */
    void setRequiredattendees(com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty requiredattendees);
    
    /**
     * Appends and returns a new empty "requiredattendees" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty addNewRequiredattendees();
    
    /**
     * Unsets the "requiredattendees" element
     */
    void unsetRequiredattendees();
    
    /**
     * Gets the "scheduleddurationminutes" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getScheduleddurationminutes();
    
    /**
     * True if has "scheduleddurationminutes" element
     */
    boolean isSetScheduleddurationminutes();
    
    /**
     * Sets the "scheduleddurationminutes" element
     */
    void setScheduleddurationminutes(com.microsoft.schemas.crm._2006.webservices.CrmNumber scheduleddurationminutes);
    
    /**
     * Appends and returns a new empty "scheduleddurationminutes" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewScheduleddurationminutes();
    
    /**
     * Unsets the "scheduleddurationminutes" element
     */
    void unsetScheduleddurationminutes();
    
    /**
     * Gets the "scheduledend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getScheduledend();
    
    /**
     * True if has "scheduledend" element
     */
    boolean isSetScheduledend();
    
    /**
     * Sets the "scheduledend" element
     */
    void setScheduledend(com.microsoft.schemas.crm._2006.webservices.CrmDateTime scheduledend);
    
    /**
     * Appends and returns a new empty "scheduledend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewScheduledend();
    
    /**
     * Unsets the "scheduledend" element
     */
    void unsetScheduledend();
    
    /**
     * Gets the "scheduledstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getScheduledstart();
    
    /**
     * True if has "scheduledstart" element
     */
    boolean isSetScheduledstart();
    
    /**
     * Sets the "scheduledstart" element
     */
    void setScheduledstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime scheduledstart);
    
    /**
     * Appends and returns a new empty "scheduledstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewScheduledstart();
    
    /**
     * Unsets the "scheduledstart" element
     */
    void unsetScheduledstart();
    
    /**
     * Gets the "serviceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getServiceid();
    
    /**
     * True if has "serviceid" element
     */
    boolean isSetServiceid();
    
    /**
     * Sets the "serviceid" element
     */
    void setServiceid(com.microsoft.schemas.crm._2006.webservices.Lookup serviceid);
    
    /**
     * Appends and returns a new empty "serviceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewServiceid();
    
    /**
     * Unsets the "serviceid" element
     */
    void unsetServiceid();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.AppointmentStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.AppointmentStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.AppointmentStateInfo addNewStatecode();
    
    /**
     * Unsets the "statecode" element
     */
    void unsetStatecode();
    
    /**
     * Gets the "statuscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Status getStatuscode();
    
    /**
     * True if has "statuscode" element
     */
    boolean isSetStatuscode();
    
    /**
     * Sets the "statuscode" element
     */
    void setStatuscode(com.microsoft.schemas.crm._2006.webservices.Status statuscode);
    
    /**
     * Appends and returns a new empty "statuscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Status addNewStatuscode();
    
    /**
     * Unsets the "statuscode" element
     */
    void unsetStatuscode();
    
    /**
     * Gets the "subcategory" element
     */
    java.lang.String getSubcategory();
    
    /**
     * Gets (as xml) the "subcategory" element
     */
    org.apache.xmlbeans.XmlString xgetSubcategory();
    
    /**
     * True if has "subcategory" element
     */
    boolean isSetSubcategory();
    
    /**
     * Sets the "subcategory" element
     */
    void setSubcategory(java.lang.String subcategory);
    
    /**
     * Sets (as xml) the "subcategory" element
     */
    void xsetSubcategory(org.apache.xmlbeans.XmlString subcategory);
    
    /**
     * Unsets the "subcategory" element
     */
    void unsetSubcategory();
    
    /**
     * Gets the "subject" element
     */
    java.lang.String getSubject();
    
    /**
     * Gets (as xml) the "subject" element
     */
    org.apache.xmlbeans.XmlString xgetSubject();
    
    /**
     * True if has "subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(java.lang.String subject);
    
    /**
     * Sets (as xml) the "subject" element
     */
    void xsetSubject(org.apache.xmlbeans.XmlString subject);
    
    /**
     * Unsets the "subject" element
     */
    void unsetSubject();
    
    /**
     * Gets the "subscriptionid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSubscriptionid();
    
    /**
     * True if has "subscriptionid" element
     */
    boolean isSetSubscriptionid();
    
    /**
     * Sets the "subscriptionid" element
     */
    void setSubscriptionid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier subscriptionid);
    
    /**
     * Appends and returns a new empty "subscriptionid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSubscriptionid();
    
    /**
     * Unsets the "subscriptionid" element
     */
    void unsetSubscriptionid();
    
    /**
     * Gets the "timezoneruleversionnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezoneruleversionnumber();
    
    /**
     * True if has "timezoneruleversionnumber" element
     */
    boolean isSetTimezoneruleversionnumber();
    
    /**
     * Sets the "timezoneruleversionnumber" element
     */
    void setTimezoneruleversionnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezoneruleversionnumber);
    
    /**
     * Appends and returns a new empty "timezoneruleversionnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezoneruleversionnumber();
    
    /**
     * Unsets the "timezoneruleversionnumber" element
     */
    void unsetTimezoneruleversionnumber();
    
    /**
     * Gets the "utcconversiontimezonecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getUtcconversiontimezonecode();
    
    /**
     * True if has "utcconversiontimezonecode" element
     */
    boolean isSetUtcconversiontimezonecode();
    
    /**
     * Sets the "utcconversiontimezonecode" element
     */
    void setUtcconversiontimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber utcconversiontimezonecode);
    
    /**
     * Appends and returns a new empty "utcconversiontimezonecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUtcconversiontimezonecode();
    
    /**
     * Unsets the "utcconversiontimezonecode" element
     */
    void unsetUtcconversiontimezonecode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Appointment newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Appointment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
