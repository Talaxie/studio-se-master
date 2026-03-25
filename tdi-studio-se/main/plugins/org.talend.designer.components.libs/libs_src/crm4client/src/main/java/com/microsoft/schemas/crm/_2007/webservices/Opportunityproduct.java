/*
 * XML Type:  opportunityproduct
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Opportunityproduct
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML opportunityproduct(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Opportunityproduct extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Opportunityproduct.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("opportunityproduct23batype");
    
    /**
     * Gets the "baseamount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getBaseamount();
    
    /**
     * True if has "baseamount" element
     */
    boolean isSetBaseamount();
    
    /**
     * Sets the "baseamount" element
     */
    void setBaseamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney baseamount);
    
    /**
     * Appends and returns a new empty "baseamount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewBaseamount();
    
    /**
     * Unsets the "baseamount" element
     */
    void unsetBaseamount();
    
    /**
     * Gets the "baseamount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getBaseamountBase();
    
    /**
     * True if has "baseamount_base" element
     */
    boolean isSetBaseamountBase();
    
    /**
     * Sets the "baseamount_base" element
     */
    void setBaseamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney baseamountBase);
    
    /**
     * Appends and returns a new empty "baseamount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewBaseamountBase();
    
    /**
     * Unsets the "baseamount_base" element
     */
    void unsetBaseamountBase();
    
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
     * Gets the "extendedamount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getExtendedamount();
    
    /**
     * True if has "extendedamount" element
     */
    boolean isSetExtendedamount();
    
    /**
     * Sets the "extendedamount" element
     */
    void setExtendedamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney extendedamount);
    
    /**
     * Appends and returns a new empty "extendedamount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewExtendedamount();
    
    /**
     * Unsets the "extendedamount" element
     */
    void unsetExtendedamount();
    
    /**
     * Gets the "extendedamount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getExtendedamountBase();
    
    /**
     * True if has "extendedamount_base" element
     */
    boolean isSetExtendedamountBase();
    
    /**
     * Sets the "extendedamount_base" element
     */
    void setExtendedamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney extendedamountBase);
    
    /**
     * Appends and returns a new empty "extendedamount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewExtendedamountBase();
    
    /**
     * Unsets the "extendedamount_base" element
     */
    void unsetExtendedamountBase();
    
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
     * Gets the "ispriceoverridden" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIspriceoverridden();
    
    /**
     * True if has "ispriceoverridden" element
     */
    boolean isSetIspriceoverridden();
    
    /**
     * Sets the "ispriceoverridden" element
     */
    void setIspriceoverridden(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ispriceoverridden);
    
    /**
     * Appends and returns a new empty "ispriceoverridden" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIspriceoverridden();
    
    /**
     * Unsets the "ispriceoverridden" element
     */
    void unsetIspriceoverridden();
    
    /**
     * Gets the "isproductoverridden" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsproductoverridden();
    
    /**
     * True if has "isproductoverridden" element
     */
    boolean isSetIsproductoverridden();
    
    /**
     * Sets the "isproductoverridden" element
     */
    void setIsproductoverridden(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isproductoverridden);
    
    /**
     * Appends and returns a new empty "isproductoverridden" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsproductoverridden();
    
    /**
     * Unsets the "isproductoverridden" element
     */
    void unsetIsproductoverridden();
    
    /**
     * Gets the "manualdiscountamount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getManualdiscountamount();
    
    /**
     * True if has "manualdiscountamount" element
     */
    boolean isSetManualdiscountamount();
    
    /**
     * Sets the "manualdiscountamount" element
     */
    void setManualdiscountamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney manualdiscountamount);
    
    /**
     * Appends and returns a new empty "manualdiscountamount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewManualdiscountamount();
    
    /**
     * Unsets the "manualdiscountamount" element
     */
    void unsetManualdiscountamount();
    
    /**
     * Gets the "manualdiscountamount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getManualdiscountamountBase();
    
    /**
     * True if has "manualdiscountamount_base" element
     */
    boolean isSetManualdiscountamountBase();
    
    /**
     * Sets the "manualdiscountamount_base" element
     */
    void setManualdiscountamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney manualdiscountamountBase);
    
    /**
     * Appends and returns a new empty "manualdiscountamount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewManualdiscountamountBase();
    
    /**
     * Unsets the "manualdiscountamount_base" element
     */
    void unsetManualdiscountamountBase();
    
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
     * Gets the "opportunityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOpportunityid();
    
    /**
     * True if has "opportunityid" element
     */
    boolean isSetOpportunityid();
    
    /**
     * Sets the "opportunityid" element
     */
    void setOpportunityid(com.microsoft.schemas.crm._2006.webservices.Lookup opportunityid);
    
    /**
     * Appends and returns a new empty "opportunityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOpportunityid();
    
    /**
     * Unsets the "opportunityid" element
     */
    void unsetOpportunityid();
    
    /**
     * Gets the "opportunityproductid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getOpportunityproductid();
    
    /**
     * True if has "opportunityproductid" element
     */
    boolean isSetOpportunityproductid();
    
    /**
     * Sets the "opportunityproductid" element
     */
    void setOpportunityproductid(com.microsoft.schemas.crm._2006.webservices.Key opportunityproductid);
    
    /**
     * Appends and returns a new empty "opportunityproductid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewOpportunityproductid();
    
    /**
     * Unsets the "opportunityproductid" element
     */
    void unsetOpportunityproductid();
    
    /**
     * Gets the "opportunitystatecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getOpportunitystatecode();
    
    /**
     * True if has "opportunitystatecode" element
     */
    boolean isSetOpportunitystatecode();
    
    /**
     * Sets the "opportunitystatecode" element
     */
    void setOpportunitystatecode(com.microsoft.schemas.crm._2006.webservices.Picklist opportunitystatecode);
    
    /**
     * Appends and returns a new empty "opportunitystatecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewOpportunitystatecode();
    
    /**
     * Unsets the "opportunitystatecode" element
     */
    void unsetOpportunitystatecode();
    
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
     * Gets the "priceperunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getPriceperunit();
    
    /**
     * True if has "priceperunit" element
     */
    boolean isSetPriceperunit();
    
    /**
     * Sets the "priceperunit" element
     */
    void setPriceperunit(com.microsoft.schemas.crm._2006.webservices.CrmMoney priceperunit);
    
    /**
     * Appends and returns a new empty "priceperunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewPriceperunit();
    
    /**
     * Unsets the "priceperunit" element
     */
    void unsetPriceperunit();
    
    /**
     * Gets the "priceperunit_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getPriceperunitBase();
    
    /**
     * True if has "priceperunit_base" element
     */
    boolean isSetPriceperunitBase();
    
    /**
     * Sets the "priceperunit_base" element
     */
    void setPriceperunitBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney priceperunitBase);
    
    /**
     * Appends and returns a new empty "priceperunit_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewPriceperunitBase();
    
    /**
     * Unsets the "priceperunit_base" element
     */
    void unsetPriceperunitBase();
    
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
     * Gets the "productdescription" element
     */
    java.lang.String getProductdescription();
    
    /**
     * Gets (as xml) the "productdescription" element
     */
    org.apache.xmlbeans.XmlString xgetProductdescription();
    
    /**
     * True if has "productdescription" element
     */
    boolean isSetProductdescription();
    
    /**
     * Sets the "productdescription" element
     */
    void setProductdescription(java.lang.String productdescription);
    
    /**
     * Sets (as xml) the "productdescription" element
     */
    void xsetProductdescription(org.apache.xmlbeans.XmlString productdescription);
    
    /**
     * Unsets the "productdescription" element
     */
    void unsetProductdescription();
    
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
     * Gets the "quantity" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getQuantity();
    
    /**
     * True if has "quantity" element
     */
    boolean isSetQuantity();
    
    /**
     * Sets the "quantity" element
     */
    void setQuantity(com.microsoft.schemas.crm._2006.webservices.CrmDecimal quantity);
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewQuantity();
    
    /**
     * Unsets the "quantity" element
     */
    void unsetQuantity();
    
    /**
     * Gets the "tax" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTax();
    
    /**
     * True if has "tax" element
     */
    boolean isSetTax();
    
    /**
     * Sets the "tax" element
     */
    void setTax(com.microsoft.schemas.crm._2006.webservices.CrmMoney tax);
    
    /**
     * Appends and returns a new empty "tax" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTax();
    
    /**
     * Unsets the "tax" element
     */
    void unsetTax();
    
    /**
     * Gets the "tax_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getTaxBase();
    
    /**
     * True if has "tax_base" element
     */
    boolean isSetTaxBase();
    
    /**
     * Sets the "tax_base" element
     */
    void setTaxBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney taxBase);
    
    /**
     * Appends and returns a new empty "tax_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTaxBase();
    
    /**
     * Unsets the "tax_base" element
     */
    void unsetTaxBase();
    
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
     * Gets the "volumediscountamount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getVolumediscountamount();
    
    /**
     * True if has "volumediscountamount" element
     */
    boolean isSetVolumediscountamount();
    
    /**
     * Sets the "volumediscountamount" element
     */
    void setVolumediscountamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney volumediscountamount);
    
    /**
     * Appends and returns a new empty "volumediscountamount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewVolumediscountamount();
    
    /**
     * Unsets the "volumediscountamount" element
     */
    void unsetVolumediscountamount();
    
    /**
     * Gets the "volumediscountamount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getVolumediscountamountBase();
    
    /**
     * True if has "volumediscountamount_base" element
     */
    boolean isSetVolumediscountamountBase();
    
    /**
     * Sets the "volumediscountamount_base" element
     */
    void setVolumediscountamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney volumediscountamountBase);
    
    /**
     * Appends and returns a new empty "volumediscountamount_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewVolumediscountamountBase();
    
    /**
     * Unsets the "volumediscountamount_base" element
     */
    void unsetVolumediscountamountBase();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Opportunityproduct parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Opportunityproduct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
