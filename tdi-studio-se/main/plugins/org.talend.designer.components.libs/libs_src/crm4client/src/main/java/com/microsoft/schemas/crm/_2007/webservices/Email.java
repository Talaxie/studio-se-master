/*
 * XML Type:  email
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Email
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML email(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Email extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Email.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("email2228type");
    
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
     * Gets the "bcc" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty getBcc();
    
    /**
     * True if has "bcc" element
     */
    boolean isSetBcc();
    
    /**
     * Sets the "bcc" element
     */
    void setBcc(com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty bcc);
    
    /**
     * Appends and returns a new empty "bcc" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty addNewBcc();
    
    /**
     * Unsets the "bcc" element
     */
    void unsetBcc();
    
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
     * Gets the "cc" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty getCc();
    
    /**
     * True if has "cc" element
     */
    boolean isSetCc();
    
    /**
     * Sets the "cc" element
     */
    void setCc(com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty cc);
    
    /**
     * Appends and returns a new empty "cc" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty addNewCc();
    
    /**
     * Unsets the "cc" element
     */
    void unsetCc();
    
    /**
     * Gets the "compressed" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCompressed();
    
    /**
     * True if has "compressed" element
     */
    boolean isSetCompressed();
    
    /**
     * Sets the "compressed" element
     */
    void setCompressed(com.microsoft.schemas.crm._2006.webservices.CrmBoolean compressed);
    
    /**
     * Appends and returns a new empty "compressed" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCompressed();
    
    /**
     * Unsets the "compressed" element
     */
    void unsetCompressed();
    
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
     * Gets the "deliveryattempts" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDeliveryattempts();
    
    /**
     * True if has "deliveryattempts" element
     */
    boolean isSetDeliveryattempts();
    
    /**
     * Sets the "deliveryattempts" element
     */
    void setDeliveryattempts(com.microsoft.schemas.crm._2006.webservices.CrmNumber deliveryattempts);
    
    /**
     * Appends and returns a new empty "deliveryattempts" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDeliveryattempts();
    
    /**
     * Unsets the "deliveryattempts" element
     */
    void unsetDeliveryattempts();
    
    /**
     * Gets the "deliveryreceiptrequested" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDeliveryreceiptrequested();
    
    /**
     * True if has "deliveryreceiptrequested" element
     */
    boolean isSetDeliveryreceiptrequested();
    
    /**
     * Sets the "deliveryreceiptrequested" element
     */
    void setDeliveryreceiptrequested(com.microsoft.schemas.crm._2006.webservices.CrmBoolean deliveryreceiptrequested);
    
    /**
     * Appends and returns a new empty "deliveryreceiptrequested" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDeliveryreceiptrequested();
    
    /**
     * Unsets the "deliveryreceiptrequested" element
     */
    void unsetDeliveryreceiptrequested();
    
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
     * Gets the "directioncode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDirectioncode();
    
    /**
     * True if has "directioncode" element
     */
    boolean isSetDirectioncode();
    
    /**
     * Sets the "directioncode" element
     */
    void setDirectioncode(com.microsoft.schemas.crm._2006.webservices.CrmBoolean directioncode);
    
    /**
     * Appends and returns a new empty "directioncode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDirectioncode();
    
    /**
     * Unsets the "directioncode" element
     */
    void unsetDirectioncode();
    
    /**
     * Gets the "from" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty getFrom();
    
    /**
     * True if has "from" element
     */
    boolean isSetFrom();
    
    /**
     * Sets the "from" element
     */
    void setFrom(com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty from);
    
    /**
     * Appends and returns a new empty "from" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty addNewFrom();
    
    /**
     * Unsets the "from" element
     */
    void unsetFrom();
    
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
     * Gets the "messageid" element
     */
    java.lang.String getMessageid();
    
    /**
     * Gets (as xml) the "messageid" element
     */
    org.apache.xmlbeans.XmlString xgetMessageid();
    
    /**
     * True if has "messageid" element
     */
    boolean isSetMessageid();
    
    /**
     * Sets the "messageid" element
     */
    void setMessageid(java.lang.String messageid);
    
    /**
     * Sets (as xml) the "messageid" element
     */
    void xsetMessageid(org.apache.xmlbeans.XmlString messageid);
    
    /**
     * Unsets the "messageid" element
     */
    void unsetMessageid();
    
    /**
     * Gets the "messageiddupcheck" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getMessageiddupcheck();
    
    /**
     * True if has "messageiddupcheck" element
     */
    boolean isSetMessageiddupcheck();
    
    /**
     * Sets the "messageiddupcheck" element
     */
    void setMessageiddupcheck(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier messageiddupcheck);
    
    /**
     * Appends and returns a new empty "messageiddupcheck" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewMessageiddupcheck();
    
    /**
     * Unsets the "messageiddupcheck" element
     */
    void unsetMessageiddupcheck();
    
    /**
     * Gets the "mimetype" element
     */
    java.lang.String getMimetype();
    
    /**
     * Gets (as xml) the "mimetype" element
     */
    org.apache.xmlbeans.XmlString xgetMimetype();
    
    /**
     * True if has "mimetype" element
     */
    boolean isSetMimetype();
    
    /**
     * Sets the "mimetype" element
     */
    void setMimetype(java.lang.String mimetype);
    
    /**
     * Sets (as xml) the "mimetype" element
     */
    void xsetMimetype(org.apache.xmlbeans.XmlString mimetype);
    
    /**
     * Unsets the "mimetype" element
     */
    void unsetMimetype();
    
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
     * Gets the "notifications" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getNotifications();
    
    /**
     * True if has "notifications" element
     */
    boolean isSetNotifications();
    
    /**
     * Sets the "notifications" element
     */
    void setNotifications(com.microsoft.schemas.crm._2006.webservices.Picklist notifications);
    
    /**
     * Appends and returns a new empty "notifications" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewNotifications();
    
    /**
     * Unsets the "notifications" element
     */
    void unsetNotifications();
    
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
     * Gets the "readreceiptrequested" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getReadreceiptrequested();
    
    /**
     * True if has "readreceiptrequested" element
     */
    boolean isSetReadreceiptrequested();
    
    /**
     * Sets the "readreceiptrequested" element
     */
    void setReadreceiptrequested(com.microsoft.schemas.crm._2006.webservices.CrmBoolean readreceiptrequested);
    
    /**
     * Appends and returns a new empty "readreceiptrequested" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewReadreceiptrequested();
    
    /**
     * Unsets the "readreceiptrequested" element
     */
    void unsetReadreceiptrequested();
    
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
     * Gets the "sender" element
     */
    java.lang.String getSender();
    
    /**
     * Gets (as xml) the "sender" element
     */
    org.apache.xmlbeans.XmlString xgetSender();
    
    /**
     * True if has "sender" element
     */
    boolean isSetSender();
    
    /**
     * Sets the "sender" element
     */
    void setSender(java.lang.String sender);
    
    /**
     * Sets (as xml) the "sender" element
     */
    void xsetSender(org.apache.xmlbeans.XmlString sender);
    
    /**
     * Unsets the "sender" element
     */
    void unsetSender();
    
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
    com.microsoft.schemas.crm._2007.webservices.EmailStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.EmailStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.EmailStateInfo addNewStatecode();
    
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
     * Gets the "submittedby" element
     */
    java.lang.String getSubmittedby();
    
    /**
     * Gets (as xml) the "submittedby" element
     */
    org.apache.xmlbeans.XmlString xgetSubmittedby();
    
    /**
     * True if has "submittedby" element
     */
    boolean isSetSubmittedby();
    
    /**
     * Sets the "submittedby" element
     */
    void setSubmittedby(java.lang.String submittedby);
    
    /**
     * Sets (as xml) the "submittedby" element
     */
    void xsetSubmittedby(org.apache.xmlbeans.XmlString submittedby);
    
    /**
     * Unsets the "submittedby" element
     */
    void unsetSubmittedby();
    
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
     * Gets the "to" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty getTo();
    
    /**
     * True if has "to" element
     */
    boolean isSetTo();
    
    /**
     * Sets the "to" element
     */
    void setTo(com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty to);
    
    /**
     * Appends and returns a new empty "to" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty addNewTo();
    
    /**
     * Unsets the "to" element
     */
    void unsetTo();
    
    /**
     * Gets the "torecipients" element
     */
    java.lang.String getTorecipients();
    
    /**
     * Gets (as xml) the "torecipients" element
     */
    org.apache.xmlbeans.XmlString xgetTorecipients();
    
    /**
     * True if has "torecipients" element
     */
    boolean isSetTorecipients();
    
    /**
     * Sets the "torecipients" element
     */
    void setTorecipients(java.lang.String torecipients);
    
    /**
     * Sets (as xml) the "torecipients" element
     */
    void xsetTorecipients(org.apache.xmlbeans.XmlString torecipients);
    
    /**
     * Unsets the "torecipients" element
     */
    void unsetTorecipients();
    
    /**
     * Gets the "trackingtoken" element
     */
    java.lang.String getTrackingtoken();
    
    /**
     * Gets (as xml) the "trackingtoken" element
     */
    org.apache.xmlbeans.XmlString xgetTrackingtoken();
    
    /**
     * True if has "trackingtoken" element
     */
    boolean isSetTrackingtoken();
    
    /**
     * Sets the "trackingtoken" element
     */
    void setTrackingtoken(java.lang.String trackingtoken);
    
    /**
     * Sets (as xml) the "trackingtoken" element
     */
    void xsetTrackingtoken(org.apache.xmlbeans.XmlString trackingtoken);
    
    /**
     * Unsets the "trackingtoken" element
     */
    void unsetTrackingtoken();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Email newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Email parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Email) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
