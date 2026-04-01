/*
 * XML Type:  campaignresponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Campaignresponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML campaignresponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Campaignresponse extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Campaignresponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("campaignresponse3d4ftype");
    
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
     * Gets the "channeltypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getChanneltypecode();
    
    /**
     * True if has "channeltypecode" element
     */
    boolean isSetChanneltypecode();
    
    /**
     * Sets the "channeltypecode" element
     */
    void setChanneltypecode(com.microsoft.schemas.crm._2006.webservices.Picklist channeltypecode);
    
    /**
     * Appends and returns a new empty "channeltypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewChanneltypecode();
    
    /**
     * Unsets the "channeltypecode" element
     */
    void unsetChanneltypecode();
    
    /**
     * Gets the "companyname" element
     */
    java.lang.String getCompanyname();
    
    /**
     * Gets (as xml) the "companyname" element
     */
    org.apache.xmlbeans.XmlString xgetCompanyname();
    
    /**
     * True if has "companyname" element
     */
    boolean isSetCompanyname();
    
    /**
     * Sets the "companyname" element
     */
    void setCompanyname(java.lang.String companyname);
    
    /**
     * Sets (as xml) the "companyname" element
     */
    void xsetCompanyname(org.apache.xmlbeans.XmlString companyname);
    
    /**
     * Unsets the "companyname" element
     */
    void unsetCompanyname();
    
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
     * Gets the "customer" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty getCustomer();
    
    /**
     * True if has "customer" element
     */
    boolean isSetCustomer();
    
    /**
     * Sets the "customer" element
     */
    void setCustomer(com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty customer);
    
    /**
     * Appends and returns a new empty "customer" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty addNewCustomer();
    
    /**
     * Unsets the "customer" element
     */
    void unsetCustomer();
    
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
     * Gets the "emailaddress" element
     */
    java.lang.String getEmailaddress();
    
    /**
     * Gets (as xml) the "emailaddress" element
     */
    org.apache.xmlbeans.XmlString xgetEmailaddress();
    
    /**
     * True if has "emailaddress" element
     */
    boolean isSetEmailaddress();
    
    /**
     * Sets the "emailaddress" element
     */
    void setEmailaddress(java.lang.String emailaddress);
    
    /**
     * Sets (as xml) the "emailaddress" element
     */
    void xsetEmailaddress(org.apache.xmlbeans.XmlString emailaddress);
    
    /**
     * Unsets the "emailaddress" element
     */
    void unsetEmailaddress();
    
    /**
     * Gets the "fax" element
     */
    java.lang.String getFax();
    
    /**
     * Gets (as xml) the "fax" element
     */
    org.apache.xmlbeans.XmlString xgetFax();
    
    /**
     * True if has "fax" element
     */
    boolean isSetFax();
    
    /**
     * Sets the "fax" element
     */
    void setFax(java.lang.String fax);
    
    /**
     * Sets (as xml) the "fax" element
     */
    void xsetFax(org.apache.xmlbeans.XmlString fax);
    
    /**
     * Unsets the "fax" element
     */
    void unsetFax();
    
    /**
     * Gets the "firstname" element
     */
    java.lang.String getFirstname();
    
    /**
     * Gets (as xml) the "firstname" element
     */
    org.apache.xmlbeans.XmlString xgetFirstname();
    
    /**
     * True if has "firstname" element
     */
    boolean isSetFirstname();
    
    /**
     * Sets the "firstname" element
     */
    void setFirstname(java.lang.String firstname);
    
    /**
     * Sets (as xml) the "firstname" element
     */
    void xsetFirstname(org.apache.xmlbeans.XmlString firstname);
    
    /**
     * Unsets the "firstname" element
     */
    void unsetFirstname();
    
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
     * Gets the "lastname" element
     */
    java.lang.String getLastname();
    
    /**
     * Gets (as xml) the "lastname" element
     */
    org.apache.xmlbeans.XmlString xgetLastname();
    
    /**
     * True if has "lastname" element
     */
    boolean isSetLastname();
    
    /**
     * Sets the "lastname" element
     */
    void setLastname(java.lang.String lastname);
    
    /**
     * Sets (as xml) the "lastname" element
     */
    void xsetLastname(org.apache.xmlbeans.XmlString lastname);
    
    /**
     * Unsets the "lastname" element
     */
    void unsetLastname();
    
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
     * Gets the "originatingactivityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOriginatingactivityid();
    
    /**
     * True if has "originatingactivityid" element
     */
    boolean isSetOriginatingactivityid();
    
    /**
     * Sets the "originatingactivityid" element
     */
    void setOriginatingactivityid(com.microsoft.schemas.crm._2006.webservices.Lookup originatingactivityid);
    
    /**
     * Appends and returns a new empty "originatingactivityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOriginatingactivityid();
    
    /**
     * Unsets the "originatingactivityid" element
     */
    void unsetOriginatingactivityid();
    
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
     * Gets the "partner" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty getPartner();
    
    /**
     * True if has "partner" element
     */
    boolean isSetPartner();
    
    /**
     * Sets the "partner" element
     */
    void setPartner(com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty partner);
    
    /**
     * Appends and returns a new empty "partner" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfactivityparty addNewPartner();
    
    /**
     * Unsets the "partner" element
     */
    void unsetPartner();
    
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
     * Gets the "promotioncodename" element
     */
    java.lang.String getPromotioncodename();
    
    /**
     * Gets (as xml) the "promotioncodename" element
     */
    org.apache.xmlbeans.XmlString xgetPromotioncodename();
    
    /**
     * True if has "promotioncodename" element
     */
    boolean isSetPromotioncodename();
    
    /**
     * Sets the "promotioncodename" element
     */
    void setPromotioncodename(java.lang.String promotioncodename);
    
    /**
     * Sets (as xml) the "promotioncodename" element
     */
    void xsetPromotioncodename(org.apache.xmlbeans.XmlString promotioncodename);
    
    /**
     * Unsets the "promotioncodename" element
     */
    void unsetPromotioncodename();
    
    /**
     * Gets the "receivedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getReceivedon();
    
    /**
     * True if has "receivedon" element
     */
    boolean isSetReceivedon();
    
    /**
     * Sets the "receivedon" element
     */
    void setReceivedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime receivedon);
    
    /**
     * Appends and returns a new empty "receivedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewReceivedon();
    
    /**
     * Unsets the "receivedon" element
     */
    void unsetReceivedon();
    
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
     * Gets the "responsecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getResponsecode();
    
    /**
     * True if has "responsecode" element
     */
    boolean isSetResponsecode();
    
    /**
     * Sets the "responsecode" element
     */
    void setResponsecode(com.microsoft.schemas.crm._2006.webservices.Picklist responsecode);
    
    /**
     * Appends and returns a new empty "responsecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewResponsecode();
    
    /**
     * Unsets the "responsecode" element
     */
    void unsetResponsecode();
    
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
    com.microsoft.schemas.crm._2007.webservices.CampaignResponseStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.CampaignResponseStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.CampaignResponseStateInfo addNewStatecode();
    
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
     * Gets the "telephone" element
     */
    java.lang.String getTelephone();
    
    /**
     * Gets (as xml) the "telephone" element
     */
    org.apache.xmlbeans.XmlString xgetTelephone();
    
    /**
     * True if has "telephone" element
     */
    boolean isSetTelephone();
    
    /**
     * Sets the "telephone" element
     */
    void setTelephone(java.lang.String telephone);
    
    /**
     * Sets (as xml) the "telephone" element
     */
    void xsetTelephone(org.apache.xmlbeans.XmlString telephone);
    
    /**
     * Unsets the "telephone" element
     */
    void unsetTelephone();
    
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
     * Gets the "yomicompanyname" element
     */
    java.lang.String getYomicompanyname();
    
    /**
     * Gets (as xml) the "yomicompanyname" element
     */
    org.apache.xmlbeans.XmlString xgetYomicompanyname();
    
    /**
     * True if has "yomicompanyname" element
     */
    boolean isSetYomicompanyname();
    
    /**
     * Sets the "yomicompanyname" element
     */
    void setYomicompanyname(java.lang.String yomicompanyname);
    
    /**
     * Sets (as xml) the "yomicompanyname" element
     */
    void xsetYomicompanyname(org.apache.xmlbeans.XmlString yomicompanyname);
    
    /**
     * Unsets the "yomicompanyname" element
     */
    void unsetYomicompanyname();
    
    /**
     * Gets the "yomifirstname" element
     */
    java.lang.String getYomifirstname();
    
    /**
     * Gets (as xml) the "yomifirstname" element
     */
    org.apache.xmlbeans.XmlString xgetYomifirstname();
    
    /**
     * True if has "yomifirstname" element
     */
    boolean isSetYomifirstname();
    
    /**
     * Sets the "yomifirstname" element
     */
    void setYomifirstname(java.lang.String yomifirstname);
    
    /**
     * Sets (as xml) the "yomifirstname" element
     */
    void xsetYomifirstname(org.apache.xmlbeans.XmlString yomifirstname);
    
    /**
     * Unsets the "yomifirstname" element
     */
    void unsetYomifirstname();
    
    /**
     * Gets the "yomilastname" element
     */
    java.lang.String getYomilastname();
    
    /**
     * Gets (as xml) the "yomilastname" element
     */
    org.apache.xmlbeans.XmlString xgetYomilastname();
    
    /**
     * True if has "yomilastname" element
     */
    boolean isSetYomilastname();
    
    /**
     * Sets the "yomilastname" element
     */
    void setYomilastname(java.lang.String yomilastname);
    
    /**
     * Sets (as xml) the "yomilastname" element
     */
    void xsetYomilastname(org.apache.xmlbeans.XmlString yomilastname);
    
    /**
     * Unsets the "yomilastname" element
     */
    void unsetYomilastname();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Campaignresponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaignresponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
