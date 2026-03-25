/*
 * XML Type:  contract
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Contract
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML contract(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Contract extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Contract.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("contract2fd0type");
    
    /**
     * Gets the "activeon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActiveon();
    
    /**
     * True if has "activeon" element
     */
    boolean isSetActiveon();
    
    /**
     * Sets the "activeon" element
     */
    void setActiveon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime activeon);
    
    /**
     * Appends and returns a new empty "activeon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActiveon();
    
    /**
     * Unsets the "activeon" element
     */
    void unsetActiveon();
    
    /**
     * Gets the "allotmenttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAllotmenttypecode();
    
    /**
     * True if has "allotmenttypecode" element
     */
    boolean isSetAllotmenttypecode();
    
    /**
     * Sets the "allotmenttypecode" element
     */
    void setAllotmenttypecode(com.microsoft.schemas.crm._2006.webservices.Picklist allotmenttypecode);
    
    /**
     * Appends and returns a new empty "allotmenttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAllotmenttypecode();
    
    /**
     * Unsets the "allotmenttypecode" element
     */
    void unsetAllotmenttypecode();
    
    /**
     * Gets the "billingcustomerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Customer getBillingcustomerid();
    
    /**
     * True if has "billingcustomerid" element
     */
    boolean isSetBillingcustomerid();
    
    /**
     * Sets the "billingcustomerid" element
     */
    void setBillingcustomerid(com.microsoft.schemas.crm._2006.webservices.Customer billingcustomerid);
    
    /**
     * Appends and returns a new empty "billingcustomerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Customer addNewBillingcustomerid();
    
    /**
     * Unsets the "billingcustomerid" element
     */
    void unsetBillingcustomerid();
    
    /**
     * Gets the "billingendon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getBillingendon();
    
    /**
     * True if has "billingendon" element
     */
    boolean isSetBillingendon();
    
    /**
     * Sets the "billingendon" element
     */
    void setBillingendon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime billingendon);
    
    /**
     * Appends and returns a new empty "billingendon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewBillingendon();
    
    /**
     * Unsets the "billingendon" element
     */
    void unsetBillingendon();
    
    /**
     * Gets the "billingfrequencycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getBillingfrequencycode();
    
    /**
     * True if has "billingfrequencycode" element
     */
    boolean isSetBillingfrequencycode();
    
    /**
     * Sets the "billingfrequencycode" element
     */
    void setBillingfrequencycode(com.microsoft.schemas.crm._2006.webservices.Picklist billingfrequencycode);
    
    /**
     * Appends and returns a new empty "billingfrequencycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewBillingfrequencycode();
    
    /**
     * Unsets the "billingfrequencycode" element
     */
    void unsetBillingfrequencycode();
    
    /**
     * Gets the "billingstarton" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getBillingstarton();
    
    /**
     * True if has "billingstarton" element
     */
    boolean isSetBillingstarton();
    
    /**
     * Sets the "billingstarton" element
     */
    void setBillingstarton(com.microsoft.schemas.crm._2006.webservices.CrmDateTime billingstarton);
    
    /**
     * Appends and returns a new empty "billingstarton" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewBillingstarton();
    
    /**
     * Unsets the "billingstarton" element
     */
    void unsetBillingstarton();
    
    /**
     * Gets the "billtoaddress" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getBilltoaddress();
    
    /**
     * True if has "billtoaddress" element
     */
    boolean isSetBilltoaddress();
    
    /**
     * Sets the "billtoaddress" element
     */
    void setBilltoaddress(com.microsoft.schemas.crm._2006.webservices.Lookup billtoaddress);
    
    /**
     * Appends and returns a new empty "billtoaddress" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewBilltoaddress();
    
    /**
     * Unsets the "billtoaddress" element
     */
    void unsetBilltoaddress();
    
    /**
     * Gets the "cancelon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCancelon();
    
    /**
     * True if has "cancelon" element
     */
    boolean isSetCancelon();
    
    /**
     * Sets the "cancelon" element
     */
    void setCancelon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime cancelon);
    
    /**
     * Appends and returns a new empty "cancelon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCancelon();
    
    /**
     * Unsets the "cancelon" element
     */
    void unsetCancelon();
    
    /**
     * Gets the "contractid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getContractid();
    
    /**
     * True if has "contractid" element
     */
    boolean isSetContractid();
    
    /**
     * Sets the "contractid" element
     */
    void setContractid(com.microsoft.schemas.crm._2006.webservices.Key contractid);
    
    /**
     * Appends and returns a new empty "contractid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewContractid();
    
    /**
     * Unsets the "contractid" element
     */
    void unsetContractid();
    
    /**
     * Gets the "contractlanguage" element
     */
    java.lang.String getContractlanguage();
    
    /**
     * Gets (as xml) the "contractlanguage" element
     */
    org.apache.xmlbeans.XmlString xgetContractlanguage();
    
    /**
     * True if has "contractlanguage" element
     */
    boolean isSetContractlanguage();
    
    /**
     * Sets the "contractlanguage" element
     */
    void setContractlanguage(java.lang.String contractlanguage);
    
    /**
     * Sets (as xml) the "contractlanguage" element
     */
    void xsetContractlanguage(org.apache.xmlbeans.XmlString contractlanguage);
    
    /**
     * Unsets the "contractlanguage" element
     */
    void unsetContractlanguage();
    
    /**
     * Gets the "contractnumber" element
     */
    java.lang.String getContractnumber();
    
    /**
     * Gets (as xml) the "contractnumber" element
     */
    org.apache.xmlbeans.XmlString xgetContractnumber();
    
    /**
     * True if has "contractnumber" element
     */
    boolean isSetContractnumber();
    
    /**
     * Sets the "contractnumber" element
     */
    void setContractnumber(java.lang.String contractnumber);
    
    /**
     * Sets (as xml) the "contractnumber" element
     */
    void xsetContractnumber(org.apache.xmlbeans.XmlString contractnumber);
    
    /**
     * Unsets the "contractnumber" element
     */
    void unsetContractnumber();
    
    /**
     * Gets the "contractservicelevelcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getContractservicelevelcode();
    
    /**
     * True if has "contractservicelevelcode" element
     */
    boolean isSetContractservicelevelcode();
    
    /**
     * Sets the "contractservicelevelcode" element
     */
    void setContractservicelevelcode(com.microsoft.schemas.crm._2006.webservices.Picklist contractservicelevelcode);
    
    /**
     * Appends and returns a new empty "contractservicelevelcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewContractservicelevelcode();
    
    /**
     * Unsets the "contractservicelevelcode" element
     */
    void unsetContractservicelevelcode();
    
    /**
     * Gets the "contracttemplateabbreviation" element
     */
    java.lang.String getContracttemplateabbreviation();
    
    /**
     * Gets (as xml) the "contracttemplateabbreviation" element
     */
    org.apache.xmlbeans.XmlString xgetContracttemplateabbreviation();
    
    /**
     * True if has "contracttemplateabbreviation" element
     */
    boolean isSetContracttemplateabbreviation();
    
    /**
     * Sets the "contracttemplateabbreviation" element
     */
    void setContracttemplateabbreviation(java.lang.String contracttemplateabbreviation);
    
    /**
     * Sets (as xml) the "contracttemplateabbreviation" element
     */
    void xsetContracttemplateabbreviation(org.apache.xmlbeans.XmlString contracttemplateabbreviation);
    
    /**
     * Unsets the "contracttemplateabbreviation" element
     */
    void unsetContracttemplateabbreviation();
    
    /**
     * Gets the "contracttemplateid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getContracttemplateid();
    
    /**
     * True if has "contracttemplateid" element
     */
    boolean isSetContracttemplateid();
    
    /**
     * Sets the "contracttemplateid" element
     */
    void setContracttemplateid(com.microsoft.schemas.crm._2006.webservices.Lookup contracttemplateid);
    
    /**
     * Appends and returns a new empty "contracttemplateid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewContracttemplateid();
    
    /**
     * Unsets the "contracttemplateid" element
     */
    void unsetContracttemplateid();
    
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
     * Gets the "duration" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDuration();
    
    /**
     * True if has "duration" element
     */
    boolean isSetDuration();
    
    /**
     * Sets the "duration" element
     */
    void setDuration(com.microsoft.schemas.crm._2006.webservices.CrmNumber duration);
    
    /**
     * Appends and returns a new empty "duration" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDuration();
    
    /**
     * Unsets the "duration" element
     */
    void unsetDuration();
    
    /**
     * Gets the "effectivitycalendar" element
     */
    java.lang.String getEffectivitycalendar();
    
    /**
     * Gets (as xml) the "effectivitycalendar" element
     */
    org.apache.xmlbeans.XmlString xgetEffectivitycalendar();
    
    /**
     * True if has "effectivitycalendar" element
     */
    boolean isSetEffectivitycalendar();
    
    /**
     * Sets the "effectivitycalendar" element
     */
    void setEffectivitycalendar(java.lang.String effectivitycalendar);
    
    /**
     * Sets (as xml) the "effectivitycalendar" element
     */
    void xsetEffectivitycalendar(org.apache.xmlbeans.XmlString effectivitycalendar);
    
    /**
     * Unsets the "effectivitycalendar" element
     */
    void unsetEffectivitycalendar();
    
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
     * Gets the "expireson" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getExpireson();
    
    /**
     * True if has "expireson" element
     */
    boolean isSetExpireson();
    
    /**
     * Sets the "expireson" element
     */
    void setExpireson(com.microsoft.schemas.crm._2006.webservices.CrmDateTime expireson);
    
    /**
     * Appends and returns a new empty "expireson" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewExpireson();
    
    /**
     * Unsets the "expireson" element
     */
    void unsetExpireson();
    
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
     * Gets the "netprice" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getNetprice();
    
    /**
     * True if has "netprice" element
     */
    boolean isSetNetprice();
    
    /**
     * Sets the "netprice" element
     */
    void setNetprice(com.microsoft.schemas.crm._2006.webservices.CrmMoney netprice);
    
    /**
     * Appends and returns a new empty "netprice" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewNetprice();
    
    /**
     * Unsets the "netprice" element
     */
    void unsetNetprice();
    
    /**
     * Gets the "netprice_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getNetpriceBase();
    
    /**
     * True if has "netprice_base" element
     */
    boolean isSetNetpriceBase();
    
    /**
     * Sets the "netprice_base" element
     */
    void setNetpriceBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney netpriceBase);
    
    /**
     * Appends and returns a new empty "netprice_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewNetpriceBase();
    
    /**
     * Unsets the "netprice_base" element
     */
    void unsetNetpriceBase();
    
    /**
     * Gets the "originatingcontract" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOriginatingcontract();
    
    /**
     * True if has "originatingcontract" element
     */
    boolean isSetOriginatingcontract();
    
    /**
     * Sets the "originatingcontract" element
     */
    void setOriginatingcontract(com.microsoft.schemas.crm._2006.webservices.Lookup originatingcontract);
    
    /**
     * Appends and returns a new empty "originatingcontract" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOriginatingcontract();
    
    /**
     * Unsets the "originatingcontract" element
     */
    void unsetOriginatingcontract();
    
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
     * Gets the "serviceaddress" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getServiceaddress();
    
    /**
     * True if has "serviceaddress" element
     */
    boolean isSetServiceaddress();
    
    /**
     * Sets the "serviceaddress" element
     */
    void setServiceaddress(com.microsoft.schemas.crm._2006.webservices.Lookup serviceaddress);
    
    /**
     * Appends and returns a new empty "serviceaddress" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewServiceaddress();
    
    /**
     * Unsets the "serviceaddress" element
     */
    void unsetServiceaddress();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ContractStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.ContractStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ContractStateInfo addNewStatecode();
    
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
     * Gets the "title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "totaldiscount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotaldiscount();
    
    /**
     * True if has "totaldiscount" element
     */
    boolean isSetTotaldiscount();
    
    /**
     * Sets the "totaldiscount" element
     */
    void setTotaldiscount(com.microsoft.schemas.crm._2006.webservices.CrmMoney totaldiscount);
    
    /**
     * Appends and returns a new empty "totaldiscount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotaldiscount();
    
    /**
     * Unsets the "totaldiscount" element
     */
    void unsetTotaldiscount();
    
    /**
     * Gets the "totaldiscount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotaldiscountBase();
    
    /**
     * True if has "totaldiscount_base" element
     */
    boolean isSetTotaldiscountBase();
    
    /**
     * Sets the "totaldiscount_base" element
     */
    void setTotaldiscountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totaldiscountBase);
    
    /**
     * Appends and returns a new empty "totaldiscount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotaldiscountBase();
    
    /**
     * Unsets the "totaldiscount_base" element
     */
    void unsetTotaldiscountBase();
    
    /**
     * Gets the "totalprice" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalprice();
    
    /**
     * True if has "totalprice" element
     */
    boolean isSetTotalprice();
    
    /**
     * Sets the "totalprice" element
     */
    void setTotalprice(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalprice);
    
    /**
     * Appends and returns a new empty "totalprice" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalprice();
    
    /**
     * Unsets the "totalprice" element
     */
    void unsetTotalprice();
    
    /**
     * Gets the "totalprice_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalpriceBase();
    
    /**
     * True if has "totalprice_base" element
     */
    boolean isSetTotalpriceBase();
    
    /**
     * Sets the "totalprice_base" element
     */
    void setTotalpriceBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalpriceBase);
    
    /**
     * Appends and returns a new empty "totalprice_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalpriceBase();
    
    /**
     * Unsets the "totalprice_base" element
     */
    void unsetTotalpriceBase();
    
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
     * Gets the "usediscountaspercentage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsediscountaspercentage();
    
    /**
     * True if has "usediscountaspercentage" element
     */
    boolean isSetUsediscountaspercentage();
    
    /**
     * Sets the "usediscountaspercentage" element
     */
    void setUsediscountaspercentage(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usediscountaspercentage);
    
    /**
     * Appends and returns a new empty "usediscountaspercentage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsediscountaspercentage();
    
    /**
     * Unsets the "usediscountaspercentage" element
     */
    void unsetUsediscountaspercentage();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Contract newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Contract parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Contract) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
