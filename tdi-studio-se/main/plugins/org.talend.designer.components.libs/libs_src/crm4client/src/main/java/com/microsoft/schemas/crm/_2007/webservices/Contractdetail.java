/*
 * XML Type:  contractdetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Contractdetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML contractdetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Contractdetail extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Contractdetail.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("contractdetail39a1type");
    
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
     * Gets the "allotmentsremaining" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAllotmentsremaining();
    
    /**
     * True if has "allotmentsremaining" element
     */
    boolean isSetAllotmentsremaining();
    
    /**
     * Sets the "allotmentsremaining" element
     */
    void setAllotmentsremaining(com.microsoft.schemas.crm._2006.webservices.CrmNumber allotmentsremaining);
    
    /**
     * Appends and returns a new empty "allotmentsremaining" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAllotmentsremaining();
    
    /**
     * Unsets the "allotmentsremaining" element
     */
    void unsetAllotmentsremaining();
    
    /**
     * Gets the "allotmentsused" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAllotmentsused();
    
    /**
     * True if has "allotmentsused" element
     */
    boolean isSetAllotmentsused();
    
    /**
     * Sets the "allotmentsused" element
     */
    void setAllotmentsused(com.microsoft.schemas.crm._2006.webservices.CrmNumber allotmentsused);
    
    /**
     * Appends and returns a new empty "allotmentsused" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAllotmentsused();
    
    /**
     * Unsets the "allotmentsused" element
     */
    void unsetAllotmentsused();
    
    /**
     * Gets the "contractdetailid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getContractdetailid();
    
    /**
     * True if has "contractdetailid" element
     */
    boolean isSetContractdetailid();
    
    /**
     * Sets the "contractdetailid" element
     */
    void setContractdetailid(com.microsoft.schemas.crm._2006.webservices.Key contractdetailid);
    
    /**
     * Appends and returns a new empty "contractdetailid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewContractdetailid();
    
    /**
     * Unsets the "contractdetailid" element
     */
    void unsetContractdetailid();
    
    /**
     * Gets the "contractid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getContractid();
    
    /**
     * True if has "contractid" element
     */
    boolean isSetContractid();
    
    /**
     * Sets the "contractid" element
     */
    void setContractid(com.microsoft.schemas.crm._2006.webservices.Lookup contractid);
    
    /**
     * Appends and returns a new empty "contractid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewContractid();
    
    /**
     * Unsets the "contractid" element
     */
    void unsetContractid();
    
    /**
     * Gets the "contractstatecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getContractstatecode();
    
    /**
     * True if has "contractstatecode" element
     */
    boolean isSetContractstatecode();
    
    /**
     * Sets the "contractstatecode" element
     */
    void setContractstatecode(com.microsoft.schemas.crm._2006.webservices.Picklist contractstatecode);
    
    /**
     * Appends and returns a new empty "contractstatecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewContractstatecode();
    
    /**
     * Unsets the "contractstatecode" element
     */
    void unsetContractstatecode();
    
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
     * Gets the "discount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getDiscount();
    
    /**
     * True if has "discount" element
     */
    boolean isSetDiscount();
    
    /**
     * Sets the "discount" element
     */
    void setDiscount(com.microsoft.schemas.crm._2006.webservices.CrmMoney discount);
    
    /**
     * Appends and returns a new empty "discount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewDiscount();
    
    /**
     * Unsets the "discount" element
     */
    void unsetDiscount();
    
    /**
     * Gets the "discount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getDiscountBase();
    
    /**
     * True if has "discount_base" element
     */
    boolean isSetDiscountBase();
    
    /**
     * Sets the "discount_base" element
     */
    void setDiscountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney discountBase);
    
    /**
     * Appends and returns a new empty "discount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewDiscountBase();
    
    /**
     * Unsets the "discount_base" element
     */
    void unsetDiscountBase();
    
    /**
     * Gets the "discountpercentage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getDiscountpercentage();
    
    /**
     * True if has "discountpercentage" element
     */
    boolean isSetDiscountpercentage();
    
    /**
     * Sets the "discountpercentage" element
     */
    void setDiscountpercentage(com.microsoft.schemas.crm._2006.webservices.CrmDecimal discountpercentage);
    
    /**
     * Appends and returns a new empty "discountpercentage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewDiscountpercentage();
    
    /**
     * Unsets the "discountpercentage" element
     */
    void unsetDiscountpercentage();
    
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
     * Gets the "initialquantity" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getInitialquantity();
    
    /**
     * True if has "initialquantity" element
     */
    boolean isSetInitialquantity();
    
    /**
     * Sets the "initialquantity" element
     */
    void setInitialquantity(com.microsoft.schemas.crm._2006.webservices.CrmNumber initialquantity);
    
    /**
     * Appends and returns a new empty "initialquantity" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewInitialquantity();
    
    /**
     * Unsets the "initialquantity" element
     */
    void unsetInitialquantity();
    
    /**
     * Gets the "lineitemorder" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getLineitemorder();
    
    /**
     * True if has "lineitemorder" element
     */
    boolean isSetLineitemorder();
    
    /**
     * Sets the "lineitemorder" element
     */
    void setLineitemorder(com.microsoft.schemas.crm._2006.webservices.CrmNumber lineitemorder);
    
    /**
     * Appends and returns a new empty "lineitemorder" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLineitemorder();
    
    /**
     * Unsets the "lineitemorder" element
     */
    void unsetLineitemorder();
    
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
     * Gets the "net" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getNet();
    
    /**
     * True if has "net" element
     */
    boolean isSetNet();
    
    /**
     * Sets the "net" element
     */
    void setNet(com.microsoft.schemas.crm._2006.webservices.CrmMoney net);
    
    /**
     * Appends and returns a new empty "net" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewNet();
    
    /**
     * Unsets the "net" element
     */
    void unsetNet();
    
    /**
     * Gets the "net_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getNetBase();
    
    /**
     * True if has "net_base" element
     */
    boolean isSetNetBase();
    
    /**
     * Sets the "net_base" element
     */
    void setNetBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney netBase);
    
    /**
     * Appends and returns a new empty "net_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewNetBase();
    
    /**
     * Unsets the "net_base" element
     */
    void unsetNetBase();
    
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
     * Gets the "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwningbusinessunit();
    
    /**
     * True if has "owningbusinessunit" element
     */
    boolean isSetOwningbusinessunit();
    
    /**
     * Sets the "owningbusinessunit" element
     */
    void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owningbusinessunit);
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwningbusinessunit();
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    void unsetOwningbusinessunit();
    
    /**
     * Gets the "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwninguser();
    
    /**
     * True if has "owninguser" element
     */
    boolean isSetOwninguser();
    
    /**
     * Sets the "owninguser" element
     */
    void setOwninguser(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owninguser);
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwninguser();
    
    /**
     * Unsets the "owninguser" element
     */
    void unsetOwninguser();
    
    /**
     * Gets the "price" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getPrice();
    
    /**
     * True if has "price" element
     */
    boolean isSetPrice();
    
    /**
     * Sets the "price" element
     */
    void setPrice(com.microsoft.schemas.crm._2006.webservices.CrmMoney price);
    
    /**
     * Appends and returns a new empty "price" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewPrice();
    
    /**
     * Unsets the "price" element
     */
    void unsetPrice();
    
    /**
     * Gets the "price_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getPriceBase();
    
    /**
     * True if has "price_base" element
     */
    boolean isSetPriceBase();
    
    /**
     * Sets the "price_base" element
     */
    void setPriceBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney priceBase);
    
    /**
     * Appends and returns a new empty "price_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewPriceBase();
    
    /**
     * Unsets the "price_base" element
     */
    void unsetPriceBase();
    
    /**
     * Gets the "productid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getProductid();
    
    /**
     * True if has "productid" element
     */
    boolean isSetProductid();
    
    /**
     * Sets the "productid" element
     */
    void setProductid(com.microsoft.schemas.crm._2006.webservices.Lookup productid);
    
    /**
     * Appends and returns a new empty "productid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewProductid();
    
    /**
     * Unsets the "productid" element
     */
    void unsetProductid();
    
    /**
     * Gets the "productserialnumber" element
     */
    java.lang.String getProductserialnumber();
    
    /**
     * Gets (as xml) the "productserialnumber" element
     */
    org.apache.xmlbeans.XmlString xgetProductserialnumber();
    
    /**
     * True if has "productserialnumber" element
     */
    boolean isSetProductserialnumber();
    
    /**
     * Sets the "productserialnumber" element
     */
    void setProductserialnumber(java.lang.String productserialnumber);
    
    /**
     * Sets (as xml) the "productserialnumber" element
     */
    void xsetProductserialnumber(org.apache.xmlbeans.XmlString productserialnumber);
    
    /**
     * Unsets the "productserialnumber" element
     */
    void unsetProductserialnumber();
    
    /**
     * Gets the "rate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getRate();
    
    /**
     * True if has "rate" element
     */
    boolean isSetRate();
    
    /**
     * Sets the "rate" element
     */
    void setRate(com.microsoft.schemas.crm._2006.webservices.CrmMoney rate);
    
    /**
     * Appends and returns a new empty "rate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRate();
    
    /**
     * Unsets the "rate" element
     */
    void unsetRate();
    
    /**
     * Gets the "rate_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getRateBase();
    
    /**
     * True if has "rate_base" element
     */
    boolean isSetRateBase();
    
    /**
     * Sets the "rate_base" element
     */
    void setRateBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney rateBase);
    
    /**
     * Appends and returns a new empty "rate_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRateBase();
    
    /**
     * Unsets the "rate_base" element
     */
    void unsetRateBase();
    
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
     * Gets the "servicecontractunitscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getServicecontractunitscode();
    
    /**
     * True if has "servicecontractunitscode" element
     */
    boolean isSetServicecontractunitscode();
    
    /**
     * Sets the "servicecontractunitscode" element
     */
    void setServicecontractunitscode(com.microsoft.schemas.crm._2006.webservices.Picklist servicecontractunitscode);
    
    /**
     * Appends and returns a new empty "servicecontractunitscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewServicecontractunitscode();
    
    /**
     * Unsets the "servicecontractunitscode" element
     */
    void unsetServicecontractunitscode();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo addNewStatecode();
    
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
     * Gets the "totalallotments" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTotalallotments();
    
    /**
     * True if has "totalallotments" element
     */
    boolean isSetTotalallotments();
    
    /**
     * Sets the "totalallotments" element
     */
    void setTotalallotments(com.microsoft.schemas.crm._2006.webservices.CrmNumber totalallotments);
    
    /**
     * Appends and returns a new empty "totalallotments" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTotalallotments();
    
    /**
     * Unsets the "totalallotments" element
     */
    void unsetTotalallotments();
    
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
     * Gets the "uomid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getUomid();
    
    /**
     * True if has "uomid" element
     */
    boolean isSetUomid();
    
    /**
     * Sets the "uomid" element
     */
    void setUomid(com.microsoft.schemas.crm._2006.webservices.Lookup uomid);
    
    /**
     * Appends and returns a new empty "uomid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewUomid();
    
    /**
     * Unsets the "uomid" element
     */
    void unsetUomid();
    
    /**
     * Gets the "uomscheduleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getUomscheduleid();
    
    /**
     * True if has "uomscheduleid" element
     */
    boolean isSetUomscheduleid();
    
    /**
     * Sets the "uomscheduleid" element
     */
    void setUomscheduleid(com.microsoft.schemas.crm._2006.webservices.Lookup uomscheduleid);
    
    /**
     * Appends and returns a new empty "uomscheduleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewUomscheduleid();
    
    /**
     * Unsets the "uomscheduleid" element
     */
    void unsetUomscheduleid();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Contractdetail parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Contractdetail) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
