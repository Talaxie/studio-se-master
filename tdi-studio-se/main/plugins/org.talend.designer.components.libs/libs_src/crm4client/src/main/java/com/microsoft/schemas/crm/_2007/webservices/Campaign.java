/*
 * XML Type:  campaign
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Campaign
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML campaign(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Campaign extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Campaign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("campaigne44etype");
    
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
     * Gets the "budgetedcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getBudgetedcost();
    
    /**
     * True if has "budgetedcost" element
     */
    boolean isSetBudgetedcost();
    
    /**
     * Sets the "budgetedcost" element
     */
    void setBudgetedcost(com.microsoft.schemas.crm._2006.webservices.CrmMoney budgetedcost);
    
    /**
     * Appends and returns a new empty "budgetedcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewBudgetedcost();
    
    /**
     * Unsets the "budgetedcost" element
     */
    void unsetBudgetedcost();
    
    /**
     * Gets the "budgetedcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getBudgetedcostBase();
    
    /**
     * True if has "budgetedcost_base" element
     */
    boolean isSetBudgetedcostBase();
    
    /**
     * Sets the "budgetedcost_base" element
     */
    void setBudgetedcostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney budgetedcostBase);
    
    /**
     * Appends and returns a new empty "budgetedcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewBudgetedcostBase();
    
    /**
     * Unsets the "budgetedcost_base" element
     */
    void unsetBudgetedcostBase();
    
    /**
     * Gets the "campaignid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getCampaignid();
    
    /**
     * True if has "campaignid" element
     */
    boolean isSetCampaignid();
    
    /**
     * Sets the "campaignid" element
     */
    void setCampaignid(com.microsoft.schemas.crm._2006.webservices.Key campaignid);
    
    /**
     * Appends and returns a new empty "campaignid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewCampaignid();
    
    /**
     * Unsets the "campaignid" element
     */
    void unsetCampaignid();
    
    /**
     * Gets the "codename" element
     */
    java.lang.String getCodename();
    
    /**
     * Gets (as xml) the "codename" element
     */
    org.apache.xmlbeans.XmlString xgetCodename();
    
    /**
     * True if has "codename" element
     */
    boolean isSetCodename();
    
    /**
     * Sets the "codename" element
     */
    void setCodename(java.lang.String codename);
    
    /**
     * Sets (as xml) the "codename" element
     */
    void xsetCodename(org.apache.xmlbeans.XmlString codename);
    
    /**
     * Unsets the "codename" element
     */
    void unsetCodename();
    
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
     * Gets the "expectedresponse" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getExpectedresponse();
    
    /**
     * True if has "expectedresponse" element
     */
    boolean isSetExpectedresponse();
    
    /**
     * Sets the "expectedresponse" element
     */
    void setExpectedresponse(com.microsoft.schemas.crm._2006.webservices.CrmNumber expectedresponse);
    
    /**
     * Appends and returns a new empty "expectedresponse" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewExpectedresponse();
    
    /**
     * Unsets the "expectedresponse" element
     */
    void unsetExpectedresponse();
    
    /**
     * Gets the "expectedrevenue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getExpectedrevenue();
    
    /**
     * True if has "expectedrevenue" element
     */
    boolean isSetExpectedrevenue();
    
    /**
     * Sets the "expectedrevenue" element
     */
    void setExpectedrevenue(com.microsoft.schemas.crm._2006.webservices.CrmMoney expectedrevenue);
    
    /**
     * Appends and returns a new empty "expectedrevenue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewExpectedrevenue();
    
    /**
     * Unsets the "expectedrevenue" element
     */
    void unsetExpectedrevenue();
    
    /**
     * Gets the "expectedrevenue_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getExpectedrevenueBase();
    
    /**
     * True if has "expectedrevenue_base" element
     */
    boolean isSetExpectedrevenueBase();
    
    /**
     * Sets the "expectedrevenue_base" element
     */
    void setExpectedrevenueBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney expectedrevenueBase);
    
    /**
     * Appends and returns a new empty "expectedrevenue_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewExpectedrevenueBase();
    
    /**
     * Unsets the "expectedrevenue_base" element
     */
    void unsetExpectedrevenueBase();
    
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
     * Gets the "istemplate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIstemplate();
    
    /**
     * True if has "istemplate" element
     */
    boolean isSetIstemplate();
    
    /**
     * Sets the "istemplate" element
     */
    void setIstemplate(com.microsoft.schemas.crm._2006.webservices.CrmBoolean istemplate);
    
    /**
     * Appends and returns a new empty "istemplate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIstemplate();
    
    /**
     * Unsets the "istemplate" element
     */
    void unsetIstemplate();
    
    /**
     * Gets the "message" element
     */
    java.lang.String getMessage();
    
    /**
     * Gets (as xml) the "message" element
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * True if has "message" element
     */
    boolean isSetMessage();
    
    /**
     * Sets the "message" element
     */
    void setMessage(java.lang.String message);
    
    /**
     * Sets (as xml) the "message" element
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * Unsets the "message" element
     */
    void unsetMessage();
    
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
     * Gets the "objective" element
     */
    java.lang.String getObjective();
    
    /**
     * Gets (as xml) the "objective" element
     */
    org.apache.xmlbeans.XmlString xgetObjective();
    
    /**
     * True if has "objective" element
     */
    boolean isSetObjective();
    
    /**
     * Sets the "objective" element
     */
    void setObjective(java.lang.String objective);
    
    /**
     * Sets (as xml) the "objective" element
     */
    void xsetObjective(org.apache.xmlbeans.XmlString objective);
    
    /**
     * Unsets the "objective" element
     */
    void unsetObjective();
    
    /**
     * Gets the "othercost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getOthercost();
    
    /**
     * True if has "othercost" element
     */
    boolean isSetOthercost();
    
    /**
     * Sets the "othercost" element
     */
    void setOthercost(com.microsoft.schemas.crm._2006.webservices.CrmMoney othercost);
    
    /**
     * Appends and returns a new empty "othercost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewOthercost();
    
    /**
     * Unsets the "othercost" element
     */
    void unsetOthercost();
    
    /**
     * Gets the "othercost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getOthercostBase();
    
    /**
     * True if has "othercost_base" element
     */
    boolean isSetOthercostBase();
    
    /**
     * Sets the "othercost_base" element
     */
    void setOthercostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney othercostBase);
    
    /**
     * Appends and returns a new empty "othercost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewOthercostBase();
    
    /**
     * Unsets the "othercost_base" element
     */
    void unsetOthercostBase();
    
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
     * Gets the "pricelistid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPricelistid();
    
    /**
     * True if has "pricelistid" element
     */
    boolean isSetPricelistid();
    
    /**
     * Sets the "pricelistid" element
     */
    void setPricelistid(com.microsoft.schemas.crm._2006.webservices.Lookup pricelistid);
    
    /**
     * Appends and returns a new empty "pricelistid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPricelistid();
    
    /**
     * Unsets the "pricelistid" element
     */
    void unsetPricelistid();
    
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
     * Gets the "proposedend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getProposedend();
    
    /**
     * True if has "proposedend" element
     */
    boolean isSetProposedend();
    
    /**
     * Sets the "proposedend" element
     */
    void setProposedend(com.microsoft.schemas.crm._2006.webservices.CrmDateTime proposedend);
    
    /**
     * Appends and returns a new empty "proposedend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewProposedend();
    
    /**
     * Unsets the "proposedend" element
     */
    void unsetProposedend();
    
    /**
     * Gets the "proposedstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getProposedstart();
    
    /**
     * True if has "proposedstart" element
     */
    boolean isSetProposedstart();
    
    /**
     * Sets the "proposedstart" element
     */
    void setProposedstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime proposedstart);
    
    /**
     * Appends and returns a new empty "proposedstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewProposedstart();
    
    /**
     * Unsets the "proposedstart" element
     */
    void unsetProposedstart();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo addNewStatecode();
    
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
     * Gets the "totalactualcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalactualcost();
    
    /**
     * True if has "totalactualcost" element
     */
    boolean isSetTotalactualcost();
    
    /**
     * Sets the "totalactualcost" element
     */
    void setTotalactualcost(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalactualcost);
    
    /**
     * Appends and returns a new empty "totalactualcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalactualcost();
    
    /**
     * Unsets the "totalactualcost" element
     */
    void unsetTotalactualcost();
    
    /**
     * Gets the "totalactualcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalactualcostBase();
    
    /**
     * True if has "totalactualcost_base" element
     */
    boolean isSetTotalactualcostBase();
    
    /**
     * Sets the "totalactualcost_base" element
     */
    void setTotalactualcostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalactualcostBase);
    
    /**
     * Appends and returns a new empty "totalactualcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalactualcostBase();
    
    /**
     * Unsets the "totalactualcost_base" element
     */
    void unsetTotalactualcostBase();
    
    /**
     * Gets the "totalcampaignactivityactualcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalcampaignactivityactualcost();
    
    /**
     * True if has "totalcampaignactivityactualcost" element
     */
    boolean isSetTotalcampaignactivityactualcost();
    
    /**
     * Sets the "totalcampaignactivityactualcost" element
     */
    void setTotalcampaignactivityactualcost(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalcampaignactivityactualcost);
    
    /**
     * Appends and returns a new empty "totalcampaignactivityactualcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalcampaignactivityactualcost();
    
    /**
     * Unsets the "totalcampaignactivityactualcost" element
     */
    void unsetTotalcampaignactivityactualcost();
    
    /**
     * Gets the "totalcampaignactivityactualcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalcampaignactivityactualcostBase();
    
    /**
     * True if has "totalcampaignactivityactualcost_base" element
     */
    boolean isSetTotalcampaignactivityactualcostBase();
    
    /**
     * Sets the "totalcampaignactivityactualcost_base" element
     */
    void setTotalcampaignactivityactualcostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalcampaignactivityactualcostBase);
    
    /**
     * Appends and returns a new empty "totalcampaignactivityactualcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalcampaignactivityactualcostBase();
    
    /**
     * Unsets the "totalcampaignactivityactualcost_base" element
     */
    void unsetTotalcampaignactivityactualcostBase();
    
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
     * Gets the "typecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getTypecode();
    
    /**
     * True if has "typecode" element
     */
    boolean isSetTypecode();
    
    /**
     * Sets the "typecode" element
     */
    void setTypecode(com.microsoft.schemas.crm._2006.webservices.Picklist typecode);
    
    /**
     * Appends and returns a new empty "typecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewTypecode();
    
    /**
     * Unsets the "typecode" element
     */
    void unsetTypecode();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Campaign newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Campaign parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Campaign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
