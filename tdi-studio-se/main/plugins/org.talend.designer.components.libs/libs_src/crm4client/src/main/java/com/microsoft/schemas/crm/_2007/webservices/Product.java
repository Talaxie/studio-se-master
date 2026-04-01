/*
 * XML Type:  product
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Product
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML product(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Product extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Product.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("product06fbtype");
    
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
     * Gets the "currentcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getCurrentcost();
    
    /**
     * True if has "currentcost" element
     */
    boolean isSetCurrentcost();
    
    /**
     * Sets the "currentcost" element
     */
    void setCurrentcost(com.microsoft.schemas.crm._2006.webservices.CrmMoney currentcost);
    
    /**
     * Appends and returns a new empty "currentcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewCurrentcost();
    
    /**
     * Unsets the "currentcost" element
     */
    void unsetCurrentcost();
    
    /**
     * Gets the "currentcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getCurrentcostBase();
    
    /**
     * True if has "currentcost_base" element
     */
    boolean isSetCurrentcostBase();
    
    /**
     * Sets the "currentcost_base" element
     */
    void setCurrentcostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney currentcostBase);
    
    /**
     * Appends and returns a new empty "currentcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewCurrentcostBase();
    
    /**
     * Unsets the "currentcost_base" element
     */
    void unsetCurrentcostBase();
    
    /**
     * Gets the "defaultuomid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getDefaultuomid();
    
    /**
     * True if has "defaultuomid" element
     */
    boolean isSetDefaultuomid();
    
    /**
     * Sets the "defaultuomid" element
     */
    void setDefaultuomid(com.microsoft.schemas.crm._2006.webservices.Lookup defaultuomid);
    
    /**
     * Appends and returns a new empty "defaultuomid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewDefaultuomid();
    
    /**
     * Unsets the "defaultuomid" element
     */
    void unsetDefaultuomid();
    
    /**
     * Gets the "defaultuomscheduleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getDefaultuomscheduleid();
    
    /**
     * True if has "defaultuomscheduleid" element
     */
    boolean isSetDefaultuomscheduleid();
    
    /**
     * Sets the "defaultuomscheduleid" element
     */
    void setDefaultuomscheduleid(com.microsoft.schemas.crm._2006.webservices.Lookup defaultuomscheduleid);
    
    /**
     * Appends and returns a new empty "defaultuomscheduleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewDefaultuomscheduleid();
    
    /**
     * Unsets the "defaultuomscheduleid" element
     */
    void unsetDefaultuomscheduleid();
    
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
     * Gets the "iskit" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIskit();
    
    /**
     * True if has "iskit" element
     */
    boolean isSetIskit();
    
    /**
     * Sets the "iskit" element
     */
    void setIskit(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iskit);
    
    /**
     * Appends and returns a new empty "iskit" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIskit();
    
    /**
     * Unsets the "iskit" element
     */
    void unsetIskit();
    
    /**
     * Gets the "isstockitem" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsstockitem();
    
    /**
     * True if has "isstockitem" element
     */
    boolean isSetIsstockitem();
    
    /**
     * Sets the "isstockitem" element
     */
    void setIsstockitem(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isstockitem);
    
    /**
     * Appends and returns a new empty "isstockitem" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsstockitem();
    
    /**
     * Unsets the "isstockitem" element
     */
    void unsetIsstockitem();
    
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
     * Gets the "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOrganizationid();
    
    /**
     * True if has "organizationid" element
     */
    boolean isSetOrganizationid();
    
    /**
     * Sets the "organizationid" element
     */
    void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Lookup organizationid);
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOrganizationid();
    
    /**
     * Unsets the "organizationid" element
     */
    void unsetOrganizationid();
    
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
     * Gets the "productid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getProductid();
    
    /**
     * True if has "productid" element
     */
    boolean isSetProductid();
    
    /**
     * Sets the "productid" element
     */
    void setProductid(com.microsoft.schemas.crm._2006.webservices.Key productid);
    
    /**
     * Appends and returns a new empty "productid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewProductid();
    
    /**
     * Unsets the "productid" element
     */
    void unsetProductid();
    
    /**
     * Gets the "productnumber" element
     */
    java.lang.String getProductnumber();
    
    /**
     * Gets (as xml) the "productnumber" element
     */
    org.apache.xmlbeans.XmlString xgetProductnumber();
    
    /**
     * True if has "productnumber" element
     */
    boolean isSetProductnumber();
    
    /**
     * Sets the "productnumber" element
     */
    void setProductnumber(java.lang.String productnumber);
    
    /**
     * Sets (as xml) the "productnumber" element
     */
    void xsetProductnumber(org.apache.xmlbeans.XmlString productnumber);
    
    /**
     * Unsets the "productnumber" element
     */
    void unsetProductnumber();
    
    /**
     * Gets the "producttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getProducttypecode();
    
    /**
     * True if has "producttypecode" element
     */
    boolean isSetProducttypecode();
    
    /**
     * Sets the "producttypecode" element
     */
    void setProducttypecode(com.microsoft.schemas.crm._2006.webservices.Picklist producttypecode);
    
    /**
     * Appends and returns a new empty "producttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewProducttypecode();
    
    /**
     * Unsets the "producttypecode" element
     */
    void unsetProducttypecode();
    
    /**
     * Gets the "producturl" element
     */
    java.lang.String getProducturl();
    
    /**
     * Gets (as xml) the "producturl" element
     */
    org.apache.xmlbeans.XmlString xgetProducturl();
    
    /**
     * True if has "producturl" element
     */
    boolean isSetProducturl();
    
    /**
     * Sets the "producturl" element
     */
    void setProducturl(java.lang.String producturl);
    
    /**
     * Sets (as xml) the "producturl" element
     */
    void xsetProducturl(org.apache.xmlbeans.XmlString producturl);
    
    /**
     * Unsets the "producturl" element
     */
    void unsetProducturl();
    
    /**
     * Gets the "quantitydecimal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getQuantitydecimal();
    
    /**
     * True if has "quantitydecimal" element
     */
    boolean isSetQuantitydecimal();
    
    /**
     * Sets the "quantitydecimal" element
     */
    void setQuantitydecimal(com.microsoft.schemas.crm._2006.webservices.CrmNumber quantitydecimal);
    
    /**
     * Appends and returns a new empty "quantitydecimal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewQuantitydecimal();
    
    /**
     * Unsets the "quantitydecimal" element
     */
    void unsetQuantitydecimal();
    
    /**
     * Gets the "quantityonhand" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getQuantityonhand();
    
    /**
     * True if has "quantityonhand" element
     */
    boolean isSetQuantityonhand();
    
    /**
     * Sets the "quantityonhand" element
     */
    void setQuantityonhand(com.microsoft.schemas.crm._2006.webservices.CrmDecimal quantityonhand);
    
    /**
     * Appends and returns a new empty "quantityonhand" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewQuantityonhand();
    
    /**
     * Unsets the "quantityonhand" element
     */
    void unsetQuantityonhand();
    
    /**
     * Gets the "size" element
     */
    java.lang.String getSize();
    
    /**
     * Gets (as xml) the "size" element
     */
    org.apache.xmlbeans.XmlString xgetSize();
    
    /**
     * True if has "size" element
     */
    boolean isSetSize();
    
    /**
     * Sets the "size" element
     */
    void setSize(java.lang.String size);
    
    /**
     * Sets (as xml) the "size" element
     */
    void xsetSize(org.apache.xmlbeans.XmlString size);
    
    /**
     * Unsets the "size" element
     */
    void unsetSize();
    
    /**
     * Gets the "standardcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getStandardcost();
    
    /**
     * True if has "standardcost" element
     */
    boolean isSetStandardcost();
    
    /**
     * Sets the "standardcost" element
     */
    void setStandardcost(com.microsoft.schemas.crm._2006.webservices.CrmMoney standardcost);
    
    /**
     * Appends and returns a new empty "standardcost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewStandardcost();
    
    /**
     * Unsets the "standardcost" element
     */
    void unsetStandardcost();
    
    /**
     * Gets the "standardcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getStandardcostBase();
    
    /**
     * True if has "standardcost_base" element
     */
    boolean isSetStandardcostBase();
    
    /**
     * Sets the "standardcost_base" element
     */
    void setStandardcostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney standardcostBase);
    
    /**
     * Appends and returns a new empty "standardcost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewStandardcostBase();
    
    /**
     * Unsets the "standardcost_base" element
     */
    void unsetStandardcostBase();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ProductStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.ProductStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ProductStateInfo addNewStatecode();
    
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
     * Gets the "stockvolume" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getStockvolume();
    
    /**
     * True if has "stockvolume" element
     */
    boolean isSetStockvolume();
    
    /**
     * Sets the "stockvolume" element
     */
    void setStockvolume(com.microsoft.schemas.crm._2006.webservices.CrmDecimal stockvolume);
    
    /**
     * Appends and returns a new empty "stockvolume" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewStockvolume();
    
    /**
     * Unsets the "stockvolume" element
     */
    void unsetStockvolume();
    
    /**
     * Gets the "stockweight" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getStockweight();
    
    /**
     * True if has "stockweight" element
     */
    boolean isSetStockweight();
    
    /**
     * Sets the "stockweight" element
     */
    void setStockweight(com.microsoft.schemas.crm._2006.webservices.CrmDecimal stockweight);
    
    /**
     * Appends and returns a new empty "stockweight" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewStockweight();
    
    /**
     * Unsets the "stockweight" element
     */
    void unsetStockweight();
    
    /**
     * Gets the "subjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getSubjectid();
    
    /**
     * True if has "subjectid" element
     */
    boolean isSetSubjectid();
    
    /**
     * Sets the "subjectid" element
     */
    void setSubjectid(com.microsoft.schemas.crm._2006.webservices.Lookup subjectid);
    
    /**
     * Appends and returns a new empty "subjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewSubjectid();
    
    /**
     * Unsets the "subjectid" element
     */
    void unsetSubjectid();
    
    /**
     * Gets the "suppliername" element
     */
    java.lang.String getSuppliername();
    
    /**
     * Gets (as xml) the "suppliername" element
     */
    org.apache.xmlbeans.XmlString xgetSuppliername();
    
    /**
     * True if has "suppliername" element
     */
    boolean isSetSuppliername();
    
    /**
     * Sets the "suppliername" element
     */
    void setSuppliername(java.lang.String suppliername);
    
    /**
     * Sets (as xml) the "suppliername" element
     */
    void xsetSuppliername(org.apache.xmlbeans.XmlString suppliername);
    
    /**
     * Unsets the "suppliername" element
     */
    void unsetSuppliername();
    
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
     * Gets the "vendorname" element
     */
    java.lang.String getVendorname();
    
    /**
     * Gets (as xml) the "vendorname" element
     */
    org.apache.xmlbeans.XmlString xgetVendorname();
    
    /**
     * True if has "vendorname" element
     */
    boolean isSetVendorname();
    
    /**
     * Sets the "vendorname" element
     */
    void setVendorname(java.lang.String vendorname);
    
    /**
     * Sets (as xml) the "vendorname" element
     */
    void xsetVendorname(org.apache.xmlbeans.XmlString vendorname);
    
    /**
     * Unsets the "vendorname" element
     */
    void unsetVendorname();
    
    /**
     * Gets the "vendorpartnumber" element
     */
    java.lang.String getVendorpartnumber();
    
    /**
     * Gets (as xml) the "vendorpartnumber" element
     */
    org.apache.xmlbeans.XmlString xgetVendorpartnumber();
    
    /**
     * True if has "vendorpartnumber" element
     */
    boolean isSetVendorpartnumber();
    
    /**
     * Sets the "vendorpartnumber" element
     */
    void setVendorpartnumber(java.lang.String vendorpartnumber);
    
    /**
     * Sets (as xml) the "vendorpartnumber" element
     */
    void xsetVendorpartnumber(org.apache.xmlbeans.XmlString vendorpartnumber);
    
    /**
     * Unsets the "vendorpartnumber" element
     */
    void unsetVendorpartnumber();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Product newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Product parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Product) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
