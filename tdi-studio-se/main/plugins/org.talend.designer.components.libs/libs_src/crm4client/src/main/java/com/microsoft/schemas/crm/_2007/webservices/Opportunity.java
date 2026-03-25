/*
 * XML Type:  opportunity
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Opportunity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML opportunity(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Opportunity extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Opportunity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("opportunityac5ftype");
    
    /**
     * Gets the "actualclosedate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActualclosedate();
    
    /**
     * True if has "actualclosedate" element
     */
    boolean isSetActualclosedate();
    
    /**
     * Sets the "actualclosedate" element
     */
    void setActualclosedate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime actualclosedate);
    
    /**
     * Appends and returns a new empty "actualclosedate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActualclosedate();
    
    /**
     * Unsets the "actualclosedate" element
     */
    void unsetActualclosedate();
    
    /**
     * Gets the "actualvalue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getActualvalue();
    
    /**
     * True if has "actualvalue" element
     */
    boolean isSetActualvalue();
    
    /**
     * Sets the "actualvalue" element
     */
    void setActualvalue(com.microsoft.schemas.crm._2006.webservices.CrmMoney actualvalue);
    
    /**
     * Appends and returns a new empty "actualvalue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewActualvalue();
    
    /**
     * Unsets the "actualvalue" element
     */
    void unsetActualvalue();
    
    /**
     * Gets the "actualvalue_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getActualvalueBase();
    
    /**
     * True if has "actualvalue_base" element
     */
    boolean isSetActualvalueBase();
    
    /**
     * Sets the "actualvalue_base" element
     */
    void setActualvalueBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney actualvalueBase);
    
    /**
     * Appends and returns a new empty "actualvalue_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewActualvalueBase();
    
    /**
     * Unsets the "actualvalue_base" element
     */
    void unsetActualvalueBase();
    
    /**
     * Gets the "campaignid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getCampaignid();
    
    /**
     * True if has "campaignid" element
     */
    boolean isSetCampaignid();
    
    /**
     * Sets the "campaignid" element
     */
    void setCampaignid(com.microsoft.schemas.crm._2006.webservices.Lookup campaignid);
    
    /**
     * Appends and returns a new empty "campaignid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewCampaignid();
    
    /**
     * Unsets the "campaignid" element
     */
    void unsetCampaignid();
    
    /**
     * Gets the "closeprobability" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getCloseprobability();
    
    /**
     * True if has "closeprobability" element
     */
    boolean isSetCloseprobability();
    
    /**
     * Sets the "closeprobability" element
     */
    void setCloseprobability(com.microsoft.schemas.crm._2006.webservices.CrmNumber closeprobability);
    
    /**
     * Appends and returns a new empty "closeprobability" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCloseprobability();
    
    /**
     * Unsets the "closeprobability" element
     */
    void unsetCloseprobability();
    
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
     * Gets the "customerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Customer getCustomerid();
    
    /**
     * True if has "customerid" element
     */
    boolean isSetCustomerid();
    
    /**
     * Sets the "customerid" element
     */
    void setCustomerid(com.microsoft.schemas.crm._2006.webservices.Customer customerid);
    
    /**
     * Appends and returns a new empty "customerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Customer addNewCustomerid();
    
    /**
     * Unsets the "customerid" element
     */
    void unsetCustomerid();
    
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
     * Gets the "estimatedclosedate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEstimatedclosedate();
    
    /**
     * True if has "estimatedclosedate" element
     */
    boolean isSetEstimatedclosedate();
    
    /**
     * Sets the "estimatedclosedate" element
     */
    void setEstimatedclosedate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime estimatedclosedate);
    
    /**
     * Appends and returns a new empty "estimatedclosedate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEstimatedclosedate();
    
    /**
     * Unsets the "estimatedclosedate" element
     */
    void unsetEstimatedclosedate();
    
    /**
     * Gets the "estimatedvalue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getEstimatedvalue();
    
    /**
     * True if has "estimatedvalue" element
     */
    boolean isSetEstimatedvalue();
    
    /**
     * Sets the "estimatedvalue" element
     */
    void setEstimatedvalue(com.microsoft.schemas.crm._2006.webservices.CrmMoney estimatedvalue);
    
    /**
     * Appends and returns a new empty "estimatedvalue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewEstimatedvalue();
    
    /**
     * Unsets the "estimatedvalue" element
     */
    void unsetEstimatedvalue();
    
    /**
     * Gets the "estimatedvalue_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getEstimatedvalueBase();
    
    /**
     * True if has "estimatedvalue_base" element
     */
    boolean isSetEstimatedvalueBase();
    
    /**
     * Sets the "estimatedvalue_base" element
     */
    void setEstimatedvalueBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney estimatedvalueBase);
    
    /**
     * Appends and returns a new empty "estimatedvalue_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewEstimatedvalueBase();
    
    /**
     * Unsets the "estimatedvalue_base" element
     */
    void unsetEstimatedvalueBase();
    
    /**
     * Gets the "exchangerate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getExchangerate();
    
    /**
     * True if has "exchangerate" element
     */
    boolean isSetExchangerate();
    
    /**
     * Sets the "exchangerate" element
     */
    void setExchangerate(com.microsoft.schemas.crm._2006.webservices.CrmDecimal exchangerate);
    
    /**
     * Appends and returns a new empty "exchangerate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewExchangerate();
    
    /**
     * Unsets the "exchangerate" element
     */
    void unsetExchangerate();
    
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
     * Gets the "isrevenuesystemcalculated" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsrevenuesystemcalculated();
    
    /**
     * True if has "isrevenuesystemcalculated" element
     */
    boolean isSetIsrevenuesystemcalculated();
    
    /**
     * Sets the "isrevenuesystemcalculated" element
     */
    void setIsrevenuesystemcalculated(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isrevenuesystemcalculated);
    
    /**
     * Appends and returns a new empty "isrevenuesystemcalculated" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsrevenuesystemcalculated();
    
    /**
     * Unsets the "isrevenuesystemcalculated" element
     */
    void unsetIsrevenuesystemcalculated();
    
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
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "opportunityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getOpportunityid();
    
    /**
     * True if has "opportunityid" element
     */
    boolean isSetOpportunityid();
    
    /**
     * Sets the "opportunityid" element
     */
    void setOpportunityid(com.microsoft.schemas.crm._2006.webservices.Key opportunityid);
    
    /**
     * Appends and returns a new empty "opportunityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewOpportunityid();
    
    /**
     * Unsets the "opportunityid" element
     */
    void unsetOpportunityid();
    
    /**
     * Gets the "opportunityratingcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getOpportunityratingcode();
    
    /**
     * True if has "opportunityratingcode" element
     */
    boolean isSetOpportunityratingcode();
    
    /**
     * Sets the "opportunityratingcode" element
     */
    void setOpportunityratingcode(com.microsoft.schemas.crm._2006.webservices.Picklist opportunityratingcode);
    
    /**
     * Appends and returns a new empty "opportunityratingcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewOpportunityratingcode();
    
    /**
     * Unsets the "opportunityratingcode" element
     */
    void unsetOpportunityratingcode();
    
    /**
     * Gets the "originatingleadid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOriginatingleadid();
    
    /**
     * True if has "originatingleadid" element
     */
    boolean isSetOriginatingleadid();
    
    /**
     * Sets the "originatingleadid" element
     */
    void setOriginatingleadid(com.microsoft.schemas.crm._2006.webservices.Lookup originatingleadid);
    
    /**
     * Appends and returns a new empty "originatingleadid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOriginatingleadid();
    
    /**
     * Unsets the "originatingleadid" element
     */
    void unsetOriginatingleadid();
    
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
     * Gets the "participatesinworkflow" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getParticipatesinworkflow();
    
    /**
     * True if has "participatesinworkflow" element
     */
    boolean isSetParticipatesinworkflow();
    
    /**
     * Sets the "participatesinworkflow" element
     */
    void setParticipatesinworkflow(com.microsoft.schemas.crm._2006.webservices.CrmBoolean participatesinworkflow);
    
    /**
     * Appends and returns a new empty "participatesinworkflow" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewParticipatesinworkflow();
    
    /**
     * Unsets the "participatesinworkflow" element
     */
    void unsetParticipatesinworkflow();
    
    /**
     * Gets the "pricelevelid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPricelevelid();
    
    /**
     * True if has "pricelevelid" element
     */
    boolean isSetPricelevelid();
    
    /**
     * Sets the "pricelevelid" element
     */
    void setPricelevelid(com.microsoft.schemas.crm._2006.webservices.Lookup pricelevelid);
    
    /**
     * Appends and returns a new empty "pricelevelid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPricelevelid();
    
    /**
     * Unsets the "pricelevelid" element
     */
    void unsetPricelevelid();
    
    /**
     * Gets the "pricingerrorcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getPricingerrorcode();
    
    /**
     * True if has "pricingerrorcode" element
     */
    boolean isSetPricingerrorcode();
    
    /**
     * Sets the "pricingerrorcode" element
     */
    void setPricingerrorcode(com.microsoft.schemas.crm._2006.webservices.Picklist pricingerrorcode);
    
    /**
     * Appends and returns a new empty "pricingerrorcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewPricingerrorcode();
    
    /**
     * Unsets the "pricingerrorcode" element
     */
    void unsetPricingerrorcode();
    
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
     * Gets the "salesstagecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getSalesstagecode();
    
    /**
     * True if has "salesstagecode" element
     */
    boolean isSetSalesstagecode();
    
    /**
     * Sets the "salesstagecode" element
     */
    void setSalesstagecode(com.microsoft.schemas.crm._2006.webservices.Picklist salesstagecode);
    
    /**
     * Appends and returns a new empty "salesstagecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewSalesstagecode();
    
    /**
     * Unsets the "salesstagecode" element
     */
    void unsetSalesstagecode();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo addNewStatecode();
    
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
     * Gets the "stepid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getStepid();
    
    /**
     * True if has "stepid" element
     */
    boolean isSetStepid();
    
    /**
     * Sets the "stepid" element
     */
    void setStepid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier stepid);
    
    /**
     * Appends and returns a new empty "stepid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewStepid();
    
    /**
     * Unsets the "stepid" element
     */
    void unsetStepid();
    
    /**
     * Gets the "stepname" element
     */
    java.lang.String getStepname();
    
    /**
     * Gets (as xml) the "stepname" element
     */
    org.apache.xmlbeans.XmlString xgetStepname();
    
    /**
     * True if has "stepname" element
     */
    boolean isSetStepname();
    
    /**
     * Sets the "stepname" element
     */
    void setStepname(java.lang.String stepname);
    
    /**
     * Sets (as xml) the "stepname" element
     */
    void xsetStepname(org.apache.xmlbeans.XmlString stepname);
    
    /**
     * Unsets the "stepname" element
     */
    void unsetStepname();
    
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
     * Gets the "transactioncurrencyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getTransactioncurrencyid();
    
    /**
     * True if has "transactioncurrencyid" element
     */
    boolean isSetTransactioncurrencyid();
    
    /**
     * Sets the "transactioncurrencyid" element
     */
    void setTransactioncurrencyid(com.microsoft.schemas.crm._2006.webservices.Lookup transactioncurrencyid);
    
    /**
     * Appends and returns a new empty "transactioncurrencyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewTransactioncurrencyid();
    
    /**
     * Unsets the "transactioncurrencyid" element
     */
    void unsetTransactioncurrencyid();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Opportunity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
