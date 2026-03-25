/*
 * XML Type:  customeraddress
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Customeraddress
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML customeraddress(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Customeraddress extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Customeraddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("customeraddress71a2type");
    
    /**
     * Gets the "addressnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAddressnumber();
    
    /**
     * True if has "addressnumber" element
     */
    boolean isSetAddressnumber();
    
    /**
     * Sets the "addressnumber" element
     */
    void setAddressnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber addressnumber);
    
    /**
     * Appends and returns a new empty "addressnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAddressnumber();
    
    /**
     * Unsets the "addressnumber" element
     */
    void unsetAddressnumber();
    
    /**
     * Gets the "addresstypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAddresstypecode();
    
    /**
     * True if has "addresstypecode" element
     */
    boolean isSetAddresstypecode();
    
    /**
     * Sets the "addresstypecode" element
     */
    void setAddresstypecode(com.microsoft.schemas.crm._2006.webservices.Picklist addresstypecode);
    
    /**
     * Appends and returns a new empty "addresstypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddresstypecode();
    
    /**
     * Unsets the "addresstypecode" element
     */
    void unsetAddresstypecode();
    
    /**
     * Gets the "city" element
     */
    java.lang.String getCity();
    
    /**
     * Gets (as xml) the "city" element
     */
    org.apache.xmlbeans.XmlString xgetCity();
    
    /**
     * True if has "city" element
     */
    boolean isSetCity();
    
    /**
     * Sets the "city" element
     */
    void setCity(java.lang.String city);
    
    /**
     * Sets (as xml) the "city" element
     */
    void xsetCity(org.apache.xmlbeans.XmlString city);
    
    /**
     * Unsets the "city" element
     */
    void unsetCity();
    
    /**
     * Gets the "country" element
     */
    java.lang.String getCountry();
    
    /**
     * Gets (as xml) the "country" element
     */
    org.apache.xmlbeans.XmlString xgetCountry();
    
    /**
     * True if has "country" element
     */
    boolean isSetCountry();
    
    /**
     * Sets the "country" element
     */
    void setCountry(java.lang.String country);
    
    /**
     * Sets (as xml) the "country" element
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);
    
    /**
     * Unsets the "country" element
     */
    void unsetCountry();
    
    /**
     * Gets the "county" element
     */
    java.lang.String getCounty();
    
    /**
     * Gets (as xml) the "county" element
     */
    org.apache.xmlbeans.XmlString xgetCounty();
    
    /**
     * True if has "county" element
     */
    boolean isSetCounty();
    
    /**
     * Sets the "county" element
     */
    void setCounty(java.lang.String county);
    
    /**
     * Sets (as xml) the "county" element
     */
    void xsetCounty(org.apache.xmlbeans.XmlString county);
    
    /**
     * Unsets the "county" element
     */
    void unsetCounty();
    
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
     * Gets the "customeraddressid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getCustomeraddressid();
    
    /**
     * True if has "customeraddressid" element
     */
    boolean isSetCustomeraddressid();
    
    /**
     * Sets the "customeraddressid" element
     */
    void setCustomeraddressid(com.microsoft.schemas.crm._2006.webservices.Key customeraddressid);
    
    /**
     * Appends and returns a new empty "customeraddressid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewCustomeraddressid();
    
    /**
     * Unsets the "customeraddressid" element
     */
    void unsetCustomeraddressid();
    
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
     * Gets the "freighttermscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getFreighttermscode();
    
    /**
     * True if has "freighttermscode" element
     */
    boolean isSetFreighttermscode();
    
    /**
     * Sets the "freighttermscode" element
     */
    void setFreighttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist freighttermscode);
    
    /**
     * Appends and returns a new empty "freighttermscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewFreighttermscode();
    
    /**
     * Unsets the "freighttermscode" element
     */
    void unsetFreighttermscode();
    
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
     * Gets the "latitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat getLatitude();
    
    /**
     * True if has "latitude" element
     */
    boolean isSetLatitude();
    
    /**
     * Sets the "latitude" element
     */
    void setLatitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat latitude);
    
    /**
     * Appends and returns a new empty "latitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewLatitude();
    
    /**
     * Unsets the "latitude" element
     */
    void unsetLatitude();
    
    /**
     * Gets the "line1" element
     */
    java.lang.String getLine1();
    
    /**
     * Gets (as xml) the "line1" element
     */
    org.apache.xmlbeans.XmlString xgetLine1();
    
    /**
     * True if has "line1" element
     */
    boolean isSetLine1();
    
    /**
     * Sets the "line1" element
     */
    void setLine1(java.lang.String line1);
    
    /**
     * Sets (as xml) the "line1" element
     */
    void xsetLine1(org.apache.xmlbeans.XmlString line1);
    
    /**
     * Unsets the "line1" element
     */
    void unsetLine1();
    
    /**
     * Gets the "line2" element
     */
    java.lang.String getLine2();
    
    /**
     * Gets (as xml) the "line2" element
     */
    org.apache.xmlbeans.XmlString xgetLine2();
    
    /**
     * True if has "line2" element
     */
    boolean isSetLine2();
    
    /**
     * Sets the "line2" element
     */
    void setLine2(java.lang.String line2);
    
    /**
     * Sets (as xml) the "line2" element
     */
    void xsetLine2(org.apache.xmlbeans.XmlString line2);
    
    /**
     * Unsets the "line2" element
     */
    void unsetLine2();
    
    /**
     * Gets the "line3" element
     */
    java.lang.String getLine3();
    
    /**
     * Gets (as xml) the "line3" element
     */
    org.apache.xmlbeans.XmlString xgetLine3();
    
    /**
     * True if has "line3" element
     */
    boolean isSetLine3();
    
    /**
     * Sets the "line3" element
     */
    void setLine3(java.lang.String line3);
    
    /**
     * Sets (as xml) the "line3" element
     */
    void xsetLine3(org.apache.xmlbeans.XmlString line3);
    
    /**
     * Unsets the "line3" element
     */
    void unsetLine3();
    
    /**
     * Gets the "longitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat getLongitude();
    
    /**
     * True if has "longitude" element
     */
    boolean isSetLongitude();
    
    /**
     * Sets the "longitude" element
     */
    void setLongitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat longitude);
    
    /**
     * Appends and returns a new empty "longitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewLongitude();
    
    /**
     * Unsets the "longitude" element
     */
    void unsetLongitude();
    
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
     * Gets the "objecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference getObjecttypecode();
    
    /**
     * True if has "objecttypecode" element
     */
    boolean isSetObjecttypecode();
    
    /**
     * Sets the "objecttypecode" element
     */
    void setObjecttypecode(com.microsoft.schemas.crm._2006.webservices.EntityNameReference objecttypecode);
    
    /**
     * Appends and returns a new empty "objecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewObjecttypecode();
    
    /**
     * Unsets the "objecttypecode" element
     */
    void unsetObjecttypecode();
    
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
     * Gets the "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOwninguser();
    
    /**
     * True if has "owninguser" element
     */
    boolean isSetOwninguser();
    
    /**
     * Sets the "owninguser" element
     */
    void setOwninguser(com.microsoft.schemas.crm._2006.webservices.Lookup owninguser);
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOwninguser();
    
    /**
     * Unsets the "owninguser" element
     */
    void unsetOwninguser();
    
    /**
     * Gets the "parentid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getParentid();
    
    /**
     * True if has "parentid" element
     */
    boolean isSetParentid();
    
    /**
     * Sets the "parentid" element
     */
    void setParentid(com.microsoft.schemas.crm._2006.webservices.Lookup parentid);
    
    /**
     * Appends and returns a new empty "parentid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentid();
    
    /**
     * Unsets the "parentid" element
     */
    void unsetParentid();
    
    /**
     * Gets the "postalcode" element
     */
    java.lang.String getPostalcode();
    
    /**
     * Gets (as xml) the "postalcode" element
     */
    org.apache.xmlbeans.XmlString xgetPostalcode();
    
    /**
     * True if has "postalcode" element
     */
    boolean isSetPostalcode();
    
    /**
     * Sets the "postalcode" element
     */
    void setPostalcode(java.lang.String postalcode);
    
    /**
     * Sets (as xml) the "postalcode" element
     */
    void xsetPostalcode(org.apache.xmlbeans.XmlString postalcode);
    
    /**
     * Unsets the "postalcode" element
     */
    void unsetPostalcode();
    
    /**
     * Gets the "postofficebox" element
     */
    java.lang.String getPostofficebox();
    
    /**
     * Gets (as xml) the "postofficebox" element
     */
    org.apache.xmlbeans.XmlString xgetPostofficebox();
    
    /**
     * True if has "postofficebox" element
     */
    boolean isSetPostofficebox();
    
    /**
     * Sets the "postofficebox" element
     */
    void setPostofficebox(java.lang.String postofficebox);
    
    /**
     * Sets (as xml) the "postofficebox" element
     */
    void xsetPostofficebox(org.apache.xmlbeans.XmlString postofficebox);
    
    /**
     * Unsets the "postofficebox" element
     */
    void unsetPostofficebox();
    
    /**
     * Gets the "primarycontactname" element
     */
    java.lang.String getPrimarycontactname();
    
    /**
     * Gets (as xml) the "primarycontactname" element
     */
    org.apache.xmlbeans.XmlString xgetPrimarycontactname();
    
    /**
     * True if has "primarycontactname" element
     */
    boolean isSetPrimarycontactname();
    
    /**
     * Sets the "primarycontactname" element
     */
    void setPrimarycontactname(java.lang.String primarycontactname);
    
    /**
     * Sets (as xml) the "primarycontactname" element
     */
    void xsetPrimarycontactname(org.apache.xmlbeans.XmlString primarycontactname);
    
    /**
     * Unsets the "primarycontactname" element
     */
    void unsetPrimarycontactname();
    
    /**
     * Gets the "shippingmethodcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getShippingmethodcode();
    
    /**
     * True if has "shippingmethodcode" element
     */
    boolean isSetShippingmethodcode();
    
    /**
     * Sets the "shippingmethodcode" element
     */
    void setShippingmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist shippingmethodcode);
    
    /**
     * Appends and returns a new empty "shippingmethodcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewShippingmethodcode();
    
    /**
     * Unsets the "shippingmethodcode" element
     */
    void unsetShippingmethodcode();
    
    /**
     * Gets the "stateorprovince" element
     */
    java.lang.String getStateorprovince();
    
    /**
     * Gets (as xml) the "stateorprovince" element
     */
    org.apache.xmlbeans.XmlString xgetStateorprovince();
    
    /**
     * True if has "stateorprovince" element
     */
    boolean isSetStateorprovince();
    
    /**
     * Sets the "stateorprovince" element
     */
    void setStateorprovince(java.lang.String stateorprovince);
    
    /**
     * Sets (as xml) the "stateorprovince" element
     */
    void xsetStateorprovince(org.apache.xmlbeans.XmlString stateorprovince);
    
    /**
     * Unsets the "stateorprovince" element
     */
    void unsetStateorprovince();
    
    /**
     * Gets the "telephone1" element
     */
    java.lang.String getTelephone1();
    
    /**
     * Gets (as xml) the "telephone1" element
     */
    org.apache.xmlbeans.XmlString xgetTelephone1();
    
    /**
     * True if has "telephone1" element
     */
    boolean isSetTelephone1();
    
    /**
     * Sets the "telephone1" element
     */
    void setTelephone1(java.lang.String telephone1);
    
    /**
     * Sets (as xml) the "telephone1" element
     */
    void xsetTelephone1(org.apache.xmlbeans.XmlString telephone1);
    
    /**
     * Unsets the "telephone1" element
     */
    void unsetTelephone1();
    
    /**
     * Gets the "telephone2" element
     */
    java.lang.String getTelephone2();
    
    /**
     * Gets (as xml) the "telephone2" element
     */
    org.apache.xmlbeans.XmlString xgetTelephone2();
    
    /**
     * True if has "telephone2" element
     */
    boolean isSetTelephone2();
    
    /**
     * Sets the "telephone2" element
     */
    void setTelephone2(java.lang.String telephone2);
    
    /**
     * Sets (as xml) the "telephone2" element
     */
    void xsetTelephone2(org.apache.xmlbeans.XmlString telephone2);
    
    /**
     * Unsets the "telephone2" element
     */
    void unsetTelephone2();
    
    /**
     * Gets the "telephone3" element
     */
    java.lang.String getTelephone3();
    
    /**
     * Gets (as xml) the "telephone3" element
     */
    org.apache.xmlbeans.XmlString xgetTelephone3();
    
    /**
     * True if has "telephone3" element
     */
    boolean isSetTelephone3();
    
    /**
     * Sets the "telephone3" element
     */
    void setTelephone3(java.lang.String telephone3);
    
    /**
     * Sets (as xml) the "telephone3" element
     */
    void xsetTelephone3(org.apache.xmlbeans.XmlString telephone3);
    
    /**
     * Unsets the "telephone3" element
     */
    void unsetTelephone3();
    
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
     * Gets the "upszone" element
     */
    java.lang.String getUpszone();
    
    /**
     * Gets (as xml) the "upszone" element
     */
    org.apache.xmlbeans.XmlString xgetUpszone();
    
    /**
     * True if has "upszone" element
     */
    boolean isSetUpszone();
    
    /**
     * Sets the "upszone" element
     */
    void setUpszone(java.lang.String upszone);
    
    /**
     * Sets (as xml) the "upszone" element
     */
    void xsetUpszone(org.apache.xmlbeans.XmlString upszone);
    
    /**
     * Unsets the "upszone" element
     */
    void unsetUpszone();
    
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
     * Gets the "utcoffset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getUtcoffset();
    
    /**
     * True if has "utcoffset" element
     */
    boolean isSetUtcoffset();
    
    /**
     * Sets the "utcoffset" element
     */
    void setUtcoffset(com.microsoft.schemas.crm._2006.webservices.CrmNumber utcoffset);
    
    /**
     * Appends and returns a new empty "utcoffset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUtcoffset();
    
    /**
     * Unsets the "utcoffset" element
     */
    void unsetUtcoffset();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Customeraddress parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Customeraddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
