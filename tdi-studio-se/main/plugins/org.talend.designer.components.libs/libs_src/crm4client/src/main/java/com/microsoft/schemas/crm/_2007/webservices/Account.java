/*
 * XML Type:  account
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Account
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML account(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Account extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Account.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("accountb8b9type");
    
    /**
     * Gets the "accountcategorycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAccountcategorycode();
    
    /**
     * True if has "accountcategorycode" element
     */
    boolean isSetAccountcategorycode();
    
    /**
     * Sets the "accountcategorycode" element
     */
    void setAccountcategorycode(com.microsoft.schemas.crm._2006.webservices.Picklist accountcategorycode);
    
    /**
     * Appends and returns a new empty "accountcategorycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAccountcategorycode();
    
    /**
     * Unsets the "accountcategorycode" element
     */
    void unsetAccountcategorycode();
    
    /**
     * Gets the "accountclassificationcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAccountclassificationcode();
    
    /**
     * True if has "accountclassificationcode" element
     */
    boolean isSetAccountclassificationcode();
    
    /**
     * Sets the "accountclassificationcode" element
     */
    void setAccountclassificationcode(com.microsoft.schemas.crm._2006.webservices.Picklist accountclassificationcode);
    
    /**
     * Appends and returns a new empty "accountclassificationcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAccountclassificationcode();
    
    /**
     * Unsets the "accountclassificationcode" element
     */
    void unsetAccountclassificationcode();
    
    /**
     * Gets the "accountid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getAccountid();
    
    /**
     * True if has "accountid" element
     */
    boolean isSetAccountid();
    
    /**
     * Sets the "accountid" element
     */
    void setAccountid(com.microsoft.schemas.crm._2006.webservices.Key accountid);
    
    /**
     * Appends and returns a new empty "accountid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewAccountid();
    
    /**
     * Unsets the "accountid" element
     */
    void unsetAccountid();
    
    /**
     * Gets the "accountnumber" element
     */
    java.lang.String getAccountnumber();
    
    /**
     * Gets (as xml) the "accountnumber" element
     */
    org.apache.xmlbeans.XmlString xgetAccountnumber();
    
    /**
     * True if has "accountnumber" element
     */
    boolean isSetAccountnumber();
    
    /**
     * Sets the "accountnumber" element
     */
    void setAccountnumber(java.lang.String accountnumber);
    
    /**
     * Sets (as xml) the "accountnumber" element
     */
    void xsetAccountnumber(org.apache.xmlbeans.XmlString accountnumber);
    
    /**
     * Unsets the "accountnumber" element
     */
    void unsetAccountnumber();
    
    /**
     * Gets the "accountratingcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAccountratingcode();
    
    /**
     * True if has "accountratingcode" element
     */
    boolean isSetAccountratingcode();
    
    /**
     * Sets the "accountratingcode" element
     */
    void setAccountratingcode(com.microsoft.schemas.crm._2006.webservices.Picklist accountratingcode);
    
    /**
     * Appends and returns a new empty "accountratingcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAccountratingcode();
    
    /**
     * Unsets the "accountratingcode" element
     */
    void unsetAccountratingcode();
    
    /**
     * Gets the "address1_addressid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getAddress1Addressid();
    
    /**
     * True if has "address1_addressid" element
     */
    boolean isSetAddress1Addressid();
    
    /**
     * Sets the "address1_addressid" element
     */
    void setAddress1Addressid(com.microsoft.schemas.crm._2006.webservices.Key address1Addressid);
    
    /**
     * Appends and returns a new empty "address1_addressid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewAddress1Addressid();
    
    /**
     * Unsets the "address1_addressid" element
     */
    void unsetAddress1Addressid();
    
    /**
     * Gets the "address1_addresstypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAddress1Addresstypecode();
    
    /**
     * True if has "address1_addresstypecode" element
     */
    boolean isSetAddress1Addresstypecode();
    
    /**
     * Sets the "address1_addresstypecode" element
     */
    void setAddress1Addresstypecode(com.microsoft.schemas.crm._2006.webservices.Picklist address1Addresstypecode);
    
    /**
     * Appends and returns a new empty "address1_addresstypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress1Addresstypecode();
    
    /**
     * Unsets the "address1_addresstypecode" element
     */
    void unsetAddress1Addresstypecode();
    
    /**
     * Gets the "address1_city" element
     */
    java.lang.String getAddress1City();
    
    /**
     * Gets (as xml) the "address1_city" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1City();
    
    /**
     * True if has "address1_city" element
     */
    boolean isSetAddress1City();
    
    /**
     * Sets the "address1_city" element
     */
    void setAddress1City(java.lang.String address1City);
    
    /**
     * Sets (as xml) the "address1_city" element
     */
    void xsetAddress1City(org.apache.xmlbeans.XmlString address1City);
    
    /**
     * Unsets the "address1_city" element
     */
    void unsetAddress1City();
    
    /**
     * Gets the "address1_country" element
     */
    java.lang.String getAddress1Country();
    
    /**
     * Gets (as xml) the "address1_country" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Country();
    
    /**
     * True if has "address1_country" element
     */
    boolean isSetAddress1Country();
    
    /**
     * Sets the "address1_country" element
     */
    void setAddress1Country(java.lang.String address1Country);
    
    /**
     * Sets (as xml) the "address1_country" element
     */
    void xsetAddress1Country(org.apache.xmlbeans.XmlString address1Country);
    
    /**
     * Unsets the "address1_country" element
     */
    void unsetAddress1Country();
    
    /**
     * Gets the "address1_county" element
     */
    java.lang.String getAddress1County();
    
    /**
     * Gets (as xml) the "address1_county" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1County();
    
    /**
     * True if has "address1_county" element
     */
    boolean isSetAddress1County();
    
    /**
     * Sets the "address1_county" element
     */
    void setAddress1County(java.lang.String address1County);
    
    /**
     * Sets (as xml) the "address1_county" element
     */
    void xsetAddress1County(org.apache.xmlbeans.XmlString address1County);
    
    /**
     * Unsets the "address1_county" element
     */
    void unsetAddress1County();
    
    /**
     * Gets the "address1_fax" element
     */
    java.lang.String getAddress1Fax();
    
    /**
     * Gets (as xml) the "address1_fax" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Fax();
    
    /**
     * True if has "address1_fax" element
     */
    boolean isSetAddress1Fax();
    
    /**
     * Sets the "address1_fax" element
     */
    void setAddress1Fax(java.lang.String address1Fax);
    
    /**
     * Sets (as xml) the "address1_fax" element
     */
    void xsetAddress1Fax(org.apache.xmlbeans.XmlString address1Fax);
    
    /**
     * Unsets the "address1_fax" element
     */
    void unsetAddress1Fax();
    
    /**
     * Gets the "address1_freighttermscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAddress1Freighttermscode();
    
    /**
     * True if has "address1_freighttermscode" element
     */
    boolean isSetAddress1Freighttermscode();
    
    /**
     * Sets the "address1_freighttermscode" element
     */
    void setAddress1Freighttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist address1Freighttermscode);
    
    /**
     * Appends and returns a new empty "address1_freighttermscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress1Freighttermscode();
    
    /**
     * Unsets the "address1_freighttermscode" element
     */
    void unsetAddress1Freighttermscode();
    
    /**
     * Gets the "address1_latitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat getAddress1Latitude();
    
    /**
     * True if has "address1_latitude" element
     */
    boolean isSetAddress1Latitude();
    
    /**
     * Sets the "address1_latitude" element
     */
    void setAddress1Latitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat address1Latitude);
    
    /**
     * Appends and returns a new empty "address1_latitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewAddress1Latitude();
    
    /**
     * Unsets the "address1_latitude" element
     */
    void unsetAddress1Latitude();
    
    /**
     * Gets the "address1_line1" element
     */
    java.lang.String getAddress1Line1();
    
    /**
     * Gets (as xml) the "address1_line1" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Line1();
    
    /**
     * True if has "address1_line1" element
     */
    boolean isSetAddress1Line1();
    
    /**
     * Sets the "address1_line1" element
     */
    void setAddress1Line1(java.lang.String address1Line1);
    
    /**
     * Sets (as xml) the "address1_line1" element
     */
    void xsetAddress1Line1(org.apache.xmlbeans.XmlString address1Line1);
    
    /**
     * Unsets the "address1_line1" element
     */
    void unsetAddress1Line1();
    
    /**
     * Gets the "address1_line2" element
     */
    java.lang.String getAddress1Line2();
    
    /**
     * Gets (as xml) the "address1_line2" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Line2();
    
    /**
     * True if has "address1_line2" element
     */
    boolean isSetAddress1Line2();
    
    /**
     * Sets the "address1_line2" element
     */
    void setAddress1Line2(java.lang.String address1Line2);
    
    /**
     * Sets (as xml) the "address1_line2" element
     */
    void xsetAddress1Line2(org.apache.xmlbeans.XmlString address1Line2);
    
    /**
     * Unsets the "address1_line2" element
     */
    void unsetAddress1Line2();
    
    /**
     * Gets the "address1_line3" element
     */
    java.lang.String getAddress1Line3();
    
    /**
     * Gets (as xml) the "address1_line3" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Line3();
    
    /**
     * True if has "address1_line3" element
     */
    boolean isSetAddress1Line3();
    
    /**
     * Sets the "address1_line3" element
     */
    void setAddress1Line3(java.lang.String address1Line3);
    
    /**
     * Sets (as xml) the "address1_line3" element
     */
    void xsetAddress1Line3(org.apache.xmlbeans.XmlString address1Line3);
    
    /**
     * Unsets the "address1_line3" element
     */
    void unsetAddress1Line3();
    
    /**
     * Gets the "address1_longitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat getAddress1Longitude();
    
    /**
     * True if has "address1_longitude" element
     */
    boolean isSetAddress1Longitude();
    
    /**
     * Sets the "address1_longitude" element
     */
    void setAddress1Longitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat address1Longitude);
    
    /**
     * Appends and returns a new empty "address1_longitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewAddress1Longitude();
    
    /**
     * Unsets the "address1_longitude" element
     */
    void unsetAddress1Longitude();
    
    /**
     * Gets the "address1_name" element
     */
    java.lang.String getAddress1Name();
    
    /**
     * Gets (as xml) the "address1_name" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Name();
    
    /**
     * True if has "address1_name" element
     */
    boolean isSetAddress1Name();
    
    /**
     * Sets the "address1_name" element
     */
    void setAddress1Name(java.lang.String address1Name);
    
    /**
     * Sets (as xml) the "address1_name" element
     */
    void xsetAddress1Name(org.apache.xmlbeans.XmlString address1Name);
    
    /**
     * Unsets the "address1_name" element
     */
    void unsetAddress1Name();
    
    /**
     * Gets the "address1_postalcode" element
     */
    java.lang.String getAddress1Postalcode();
    
    /**
     * Gets (as xml) the "address1_postalcode" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Postalcode();
    
    /**
     * True if has "address1_postalcode" element
     */
    boolean isSetAddress1Postalcode();
    
    /**
     * Sets the "address1_postalcode" element
     */
    void setAddress1Postalcode(java.lang.String address1Postalcode);
    
    /**
     * Sets (as xml) the "address1_postalcode" element
     */
    void xsetAddress1Postalcode(org.apache.xmlbeans.XmlString address1Postalcode);
    
    /**
     * Unsets the "address1_postalcode" element
     */
    void unsetAddress1Postalcode();
    
    /**
     * Gets the "address1_postofficebox" element
     */
    java.lang.String getAddress1Postofficebox();
    
    /**
     * Gets (as xml) the "address1_postofficebox" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Postofficebox();
    
    /**
     * True if has "address1_postofficebox" element
     */
    boolean isSetAddress1Postofficebox();
    
    /**
     * Sets the "address1_postofficebox" element
     */
    void setAddress1Postofficebox(java.lang.String address1Postofficebox);
    
    /**
     * Sets (as xml) the "address1_postofficebox" element
     */
    void xsetAddress1Postofficebox(org.apache.xmlbeans.XmlString address1Postofficebox);
    
    /**
     * Unsets the "address1_postofficebox" element
     */
    void unsetAddress1Postofficebox();
    
    /**
     * Gets the "address1_primarycontactname" element
     */
    java.lang.String getAddress1Primarycontactname();
    
    /**
     * Gets (as xml) the "address1_primarycontactname" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Primarycontactname();
    
    /**
     * True if has "address1_primarycontactname" element
     */
    boolean isSetAddress1Primarycontactname();
    
    /**
     * Sets the "address1_primarycontactname" element
     */
    void setAddress1Primarycontactname(java.lang.String address1Primarycontactname);
    
    /**
     * Sets (as xml) the "address1_primarycontactname" element
     */
    void xsetAddress1Primarycontactname(org.apache.xmlbeans.XmlString address1Primarycontactname);
    
    /**
     * Unsets the "address1_primarycontactname" element
     */
    void unsetAddress1Primarycontactname();
    
    /**
     * Gets the "address1_shippingmethodcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAddress1Shippingmethodcode();
    
    /**
     * True if has "address1_shippingmethodcode" element
     */
    boolean isSetAddress1Shippingmethodcode();
    
    /**
     * Sets the "address1_shippingmethodcode" element
     */
    void setAddress1Shippingmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist address1Shippingmethodcode);
    
    /**
     * Appends and returns a new empty "address1_shippingmethodcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress1Shippingmethodcode();
    
    /**
     * Unsets the "address1_shippingmethodcode" element
     */
    void unsetAddress1Shippingmethodcode();
    
    /**
     * Gets the "address1_stateorprovince" element
     */
    java.lang.String getAddress1Stateorprovince();
    
    /**
     * Gets (as xml) the "address1_stateorprovince" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Stateorprovince();
    
    /**
     * True if has "address1_stateorprovince" element
     */
    boolean isSetAddress1Stateorprovince();
    
    /**
     * Sets the "address1_stateorprovince" element
     */
    void setAddress1Stateorprovince(java.lang.String address1Stateorprovince);
    
    /**
     * Sets (as xml) the "address1_stateorprovince" element
     */
    void xsetAddress1Stateorprovince(org.apache.xmlbeans.XmlString address1Stateorprovince);
    
    /**
     * Unsets the "address1_stateorprovince" element
     */
    void unsetAddress1Stateorprovince();
    
    /**
     * Gets the "address1_telephone1" element
     */
    java.lang.String getAddress1Telephone1();
    
    /**
     * Gets (as xml) the "address1_telephone1" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Telephone1();
    
    /**
     * True if has "address1_telephone1" element
     */
    boolean isSetAddress1Telephone1();
    
    /**
     * Sets the "address1_telephone1" element
     */
    void setAddress1Telephone1(java.lang.String address1Telephone1);
    
    /**
     * Sets (as xml) the "address1_telephone1" element
     */
    void xsetAddress1Telephone1(org.apache.xmlbeans.XmlString address1Telephone1);
    
    /**
     * Unsets the "address1_telephone1" element
     */
    void unsetAddress1Telephone1();
    
    /**
     * Gets the "address1_telephone2" element
     */
    java.lang.String getAddress1Telephone2();
    
    /**
     * Gets (as xml) the "address1_telephone2" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Telephone2();
    
    /**
     * True if has "address1_telephone2" element
     */
    boolean isSetAddress1Telephone2();
    
    /**
     * Sets the "address1_telephone2" element
     */
    void setAddress1Telephone2(java.lang.String address1Telephone2);
    
    /**
     * Sets (as xml) the "address1_telephone2" element
     */
    void xsetAddress1Telephone2(org.apache.xmlbeans.XmlString address1Telephone2);
    
    /**
     * Unsets the "address1_telephone2" element
     */
    void unsetAddress1Telephone2();
    
    /**
     * Gets the "address1_telephone3" element
     */
    java.lang.String getAddress1Telephone3();
    
    /**
     * Gets (as xml) the "address1_telephone3" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Telephone3();
    
    /**
     * True if has "address1_telephone3" element
     */
    boolean isSetAddress1Telephone3();
    
    /**
     * Sets the "address1_telephone3" element
     */
    void setAddress1Telephone3(java.lang.String address1Telephone3);
    
    /**
     * Sets (as xml) the "address1_telephone3" element
     */
    void xsetAddress1Telephone3(org.apache.xmlbeans.XmlString address1Telephone3);
    
    /**
     * Unsets the "address1_telephone3" element
     */
    void unsetAddress1Telephone3();
    
    /**
     * Gets the "address1_upszone" element
     */
    java.lang.String getAddress1Upszone();
    
    /**
     * Gets (as xml) the "address1_upszone" element
     */
    org.apache.xmlbeans.XmlString xgetAddress1Upszone();
    
    /**
     * True if has "address1_upszone" element
     */
    boolean isSetAddress1Upszone();
    
    /**
     * Sets the "address1_upszone" element
     */
    void setAddress1Upszone(java.lang.String address1Upszone);
    
    /**
     * Sets (as xml) the "address1_upszone" element
     */
    void xsetAddress1Upszone(org.apache.xmlbeans.XmlString address1Upszone);
    
    /**
     * Unsets the "address1_upszone" element
     */
    void unsetAddress1Upszone();
    
    /**
     * Gets the "address1_utcoffset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAddress1Utcoffset();
    
    /**
     * True if has "address1_utcoffset" element
     */
    boolean isSetAddress1Utcoffset();
    
    /**
     * Sets the "address1_utcoffset" element
     */
    void setAddress1Utcoffset(com.microsoft.schemas.crm._2006.webservices.CrmNumber address1Utcoffset);
    
    /**
     * Appends and returns a new empty "address1_utcoffset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAddress1Utcoffset();
    
    /**
     * Unsets the "address1_utcoffset" element
     */
    void unsetAddress1Utcoffset();
    
    /**
     * Gets the "address2_addressid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getAddress2Addressid();
    
    /**
     * True if has "address2_addressid" element
     */
    boolean isSetAddress2Addressid();
    
    /**
     * Sets the "address2_addressid" element
     */
    void setAddress2Addressid(com.microsoft.schemas.crm._2006.webservices.Key address2Addressid);
    
    /**
     * Appends and returns a new empty "address2_addressid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewAddress2Addressid();
    
    /**
     * Unsets the "address2_addressid" element
     */
    void unsetAddress2Addressid();
    
    /**
     * Gets the "address2_addresstypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAddress2Addresstypecode();
    
    /**
     * True if has "address2_addresstypecode" element
     */
    boolean isSetAddress2Addresstypecode();
    
    /**
     * Sets the "address2_addresstypecode" element
     */
    void setAddress2Addresstypecode(com.microsoft.schemas.crm._2006.webservices.Picklist address2Addresstypecode);
    
    /**
     * Appends and returns a new empty "address2_addresstypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress2Addresstypecode();
    
    /**
     * Unsets the "address2_addresstypecode" element
     */
    void unsetAddress2Addresstypecode();
    
    /**
     * Gets the "address2_city" element
     */
    java.lang.String getAddress2City();
    
    /**
     * Gets (as xml) the "address2_city" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2City();
    
    /**
     * True if has "address2_city" element
     */
    boolean isSetAddress2City();
    
    /**
     * Sets the "address2_city" element
     */
    void setAddress2City(java.lang.String address2City);
    
    /**
     * Sets (as xml) the "address2_city" element
     */
    void xsetAddress2City(org.apache.xmlbeans.XmlString address2City);
    
    /**
     * Unsets the "address2_city" element
     */
    void unsetAddress2City();
    
    /**
     * Gets the "address2_country" element
     */
    java.lang.String getAddress2Country();
    
    /**
     * Gets (as xml) the "address2_country" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Country();
    
    /**
     * True if has "address2_country" element
     */
    boolean isSetAddress2Country();
    
    /**
     * Sets the "address2_country" element
     */
    void setAddress2Country(java.lang.String address2Country);
    
    /**
     * Sets (as xml) the "address2_country" element
     */
    void xsetAddress2Country(org.apache.xmlbeans.XmlString address2Country);
    
    /**
     * Unsets the "address2_country" element
     */
    void unsetAddress2Country();
    
    /**
     * Gets the "address2_county" element
     */
    java.lang.String getAddress2County();
    
    /**
     * Gets (as xml) the "address2_county" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2County();
    
    /**
     * True if has "address2_county" element
     */
    boolean isSetAddress2County();
    
    /**
     * Sets the "address2_county" element
     */
    void setAddress2County(java.lang.String address2County);
    
    /**
     * Sets (as xml) the "address2_county" element
     */
    void xsetAddress2County(org.apache.xmlbeans.XmlString address2County);
    
    /**
     * Unsets the "address2_county" element
     */
    void unsetAddress2County();
    
    /**
     * Gets the "address2_fax" element
     */
    java.lang.String getAddress2Fax();
    
    /**
     * Gets (as xml) the "address2_fax" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Fax();
    
    /**
     * True if has "address2_fax" element
     */
    boolean isSetAddress2Fax();
    
    /**
     * Sets the "address2_fax" element
     */
    void setAddress2Fax(java.lang.String address2Fax);
    
    /**
     * Sets (as xml) the "address2_fax" element
     */
    void xsetAddress2Fax(org.apache.xmlbeans.XmlString address2Fax);
    
    /**
     * Unsets the "address2_fax" element
     */
    void unsetAddress2Fax();
    
    /**
     * Gets the "address2_freighttermscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAddress2Freighttermscode();
    
    /**
     * True if has "address2_freighttermscode" element
     */
    boolean isSetAddress2Freighttermscode();
    
    /**
     * Sets the "address2_freighttermscode" element
     */
    void setAddress2Freighttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist address2Freighttermscode);
    
    /**
     * Appends and returns a new empty "address2_freighttermscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress2Freighttermscode();
    
    /**
     * Unsets the "address2_freighttermscode" element
     */
    void unsetAddress2Freighttermscode();
    
    /**
     * Gets the "address2_latitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat getAddress2Latitude();
    
    /**
     * True if has "address2_latitude" element
     */
    boolean isSetAddress2Latitude();
    
    /**
     * Sets the "address2_latitude" element
     */
    void setAddress2Latitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat address2Latitude);
    
    /**
     * Appends and returns a new empty "address2_latitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewAddress2Latitude();
    
    /**
     * Unsets the "address2_latitude" element
     */
    void unsetAddress2Latitude();
    
    /**
     * Gets the "address2_line1" element
     */
    java.lang.String getAddress2Line1();
    
    /**
     * Gets (as xml) the "address2_line1" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Line1();
    
    /**
     * True if has "address2_line1" element
     */
    boolean isSetAddress2Line1();
    
    /**
     * Sets the "address2_line1" element
     */
    void setAddress2Line1(java.lang.String address2Line1);
    
    /**
     * Sets (as xml) the "address2_line1" element
     */
    void xsetAddress2Line1(org.apache.xmlbeans.XmlString address2Line1);
    
    /**
     * Unsets the "address2_line1" element
     */
    void unsetAddress2Line1();
    
    /**
     * Gets the "address2_line2" element
     */
    java.lang.String getAddress2Line2();
    
    /**
     * Gets (as xml) the "address2_line2" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Line2();
    
    /**
     * True if has "address2_line2" element
     */
    boolean isSetAddress2Line2();
    
    /**
     * Sets the "address2_line2" element
     */
    void setAddress2Line2(java.lang.String address2Line2);
    
    /**
     * Sets (as xml) the "address2_line2" element
     */
    void xsetAddress2Line2(org.apache.xmlbeans.XmlString address2Line2);
    
    /**
     * Unsets the "address2_line2" element
     */
    void unsetAddress2Line2();
    
    /**
     * Gets the "address2_line3" element
     */
    java.lang.String getAddress2Line3();
    
    /**
     * Gets (as xml) the "address2_line3" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Line3();
    
    /**
     * True if has "address2_line3" element
     */
    boolean isSetAddress2Line3();
    
    /**
     * Sets the "address2_line3" element
     */
    void setAddress2Line3(java.lang.String address2Line3);
    
    /**
     * Sets (as xml) the "address2_line3" element
     */
    void xsetAddress2Line3(org.apache.xmlbeans.XmlString address2Line3);
    
    /**
     * Unsets the "address2_line3" element
     */
    void unsetAddress2Line3();
    
    /**
     * Gets the "address2_longitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat getAddress2Longitude();
    
    /**
     * True if has "address2_longitude" element
     */
    boolean isSetAddress2Longitude();
    
    /**
     * Sets the "address2_longitude" element
     */
    void setAddress2Longitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat address2Longitude);
    
    /**
     * Appends and returns a new empty "address2_longitude" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewAddress2Longitude();
    
    /**
     * Unsets the "address2_longitude" element
     */
    void unsetAddress2Longitude();
    
    /**
     * Gets the "address2_name" element
     */
    java.lang.String getAddress2Name();
    
    /**
     * Gets (as xml) the "address2_name" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Name();
    
    /**
     * True if has "address2_name" element
     */
    boolean isSetAddress2Name();
    
    /**
     * Sets the "address2_name" element
     */
    void setAddress2Name(java.lang.String address2Name);
    
    /**
     * Sets (as xml) the "address2_name" element
     */
    void xsetAddress2Name(org.apache.xmlbeans.XmlString address2Name);
    
    /**
     * Unsets the "address2_name" element
     */
    void unsetAddress2Name();
    
    /**
     * Gets the "address2_postalcode" element
     */
    java.lang.String getAddress2Postalcode();
    
    /**
     * Gets (as xml) the "address2_postalcode" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Postalcode();
    
    /**
     * True if has "address2_postalcode" element
     */
    boolean isSetAddress2Postalcode();
    
    /**
     * Sets the "address2_postalcode" element
     */
    void setAddress2Postalcode(java.lang.String address2Postalcode);
    
    /**
     * Sets (as xml) the "address2_postalcode" element
     */
    void xsetAddress2Postalcode(org.apache.xmlbeans.XmlString address2Postalcode);
    
    /**
     * Unsets the "address2_postalcode" element
     */
    void unsetAddress2Postalcode();
    
    /**
     * Gets the "address2_postofficebox" element
     */
    java.lang.String getAddress2Postofficebox();
    
    /**
     * Gets (as xml) the "address2_postofficebox" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Postofficebox();
    
    /**
     * True if has "address2_postofficebox" element
     */
    boolean isSetAddress2Postofficebox();
    
    /**
     * Sets the "address2_postofficebox" element
     */
    void setAddress2Postofficebox(java.lang.String address2Postofficebox);
    
    /**
     * Sets (as xml) the "address2_postofficebox" element
     */
    void xsetAddress2Postofficebox(org.apache.xmlbeans.XmlString address2Postofficebox);
    
    /**
     * Unsets the "address2_postofficebox" element
     */
    void unsetAddress2Postofficebox();
    
    /**
     * Gets the "address2_primarycontactname" element
     */
    java.lang.String getAddress2Primarycontactname();
    
    /**
     * Gets (as xml) the "address2_primarycontactname" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Primarycontactname();
    
    /**
     * True if has "address2_primarycontactname" element
     */
    boolean isSetAddress2Primarycontactname();
    
    /**
     * Sets the "address2_primarycontactname" element
     */
    void setAddress2Primarycontactname(java.lang.String address2Primarycontactname);
    
    /**
     * Sets (as xml) the "address2_primarycontactname" element
     */
    void xsetAddress2Primarycontactname(org.apache.xmlbeans.XmlString address2Primarycontactname);
    
    /**
     * Unsets the "address2_primarycontactname" element
     */
    void unsetAddress2Primarycontactname();
    
    /**
     * Gets the "address2_shippingmethodcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getAddress2Shippingmethodcode();
    
    /**
     * True if has "address2_shippingmethodcode" element
     */
    boolean isSetAddress2Shippingmethodcode();
    
    /**
     * Sets the "address2_shippingmethodcode" element
     */
    void setAddress2Shippingmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist address2Shippingmethodcode);
    
    /**
     * Appends and returns a new empty "address2_shippingmethodcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress2Shippingmethodcode();
    
    /**
     * Unsets the "address2_shippingmethodcode" element
     */
    void unsetAddress2Shippingmethodcode();
    
    /**
     * Gets the "address2_stateorprovince" element
     */
    java.lang.String getAddress2Stateorprovince();
    
    /**
     * Gets (as xml) the "address2_stateorprovince" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Stateorprovince();
    
    /**
     * True if has "address2_stateorprovince" element
     */
    boolean isSetAddress2Stateorprovince();
    
    /**
     * Sets the "address2_stateorprovince" element
     */
    void setAddress2Stateorprovince(java.lang.String address2Stateorprovince);
    
    /**
     * Sets (as xml) the "address2_stateorprovince" element
     */
    void xsetAddress2Stateorprovince(org.apache.xmlbeans.XmlString address2Stateorprovince);
    
    /**
     * Unsets the "address2_stateorprovince" element
     */
    void unsetAddress2Stateorprovince();
    
    /**
     * Gets the "address2_telephone1" element
     */
    java.lang.String getAddress2Telephone1();
    
    /**
     * Gets (as xml) the "address2_telephone1" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Telephone1();
    
    /**
     * True if has "address2_telephone1" element
     */
    boolean isSetAddress2Telephone1();
    
    /**
     * Sets the "address2_telephone1" element
     */
    void setAddress2Telephone1(java.lang.String address2Telephone1);
    
    /**
     * Sets (as xml) the "address2_telephone1" element
     */
    void xsetAddress2Telephone1(org.apache.xmlbeans.XmlString address2Telephone1);
    
    /**
     * Unsets the "address2_telephone1" element
     */
    void unsetAddress2Telephone1();
    
    /**
     * Gets the "address2_telephone2" element
     */
    java.lang.String getAddress2Telephone2();
    
    /**
     * Gets (as xml) the "address2_telephone2" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Telephone2();
    
    /**
     * True if has "address2_telephone2" element
     */
    boolean isSetAddress2Telephone2();
    
    /**
     * Sets the "address2_telephone2" element
     */
    void setAddress2Telephone2(java.lang.String address2Telephone2);
    
    /**
     * Sets (as xml) the "address2_telephone2" element
     */
    void xsetAddress2Telephone2(org.apache.xmlbeans.XmlString address2Telephone2);
    
    /**
     * Unsets the "address2_telephone2" element
     */
    void unsetAddress2Telephone2();
    
    /**
     * Gets the "address2_telephone3" element
     */
    java.lang.String getAddress2Telephone3();
    
    /**
     * Gets (as xml) the "address2_telephone3" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Telephone3();
    
    /**
     * True if has "address2_telephone3" element
     */
    boolean isSetAddress2Telephone3();
    
    /**
     * Sets the "address2_telephone3" element
     */
    void setAddress2Telephone3(java.lang.String address2Telephone3);
    
    /**
     * Sets (as xml) the "address2_telephone3" element
     */
    void xsetAddress2Telephone3(org.apache.xmlbeans.XmlString address2Telephone3);
    
    /**
     * Unsets the "address2_telephone3" element
     */
    void unsetAddress2Telephone3();
    
    /**
     * Gets the "address2_upszone" element
     */
    java.lang.String getAddress2Upszone();
    
    /**
     * Gets (as xml) the "address2_upszone" element
     */
    org.apache.xmlbeans.XmlString xgetAddress2Upszone();
    
    /**
     * True if has "address2_upszone" element
     */
    boolean isSetAddress2Upszone();
    
    /**
     * Sets the "address2_upszone" element
     */
    void setAddress2Upszone(java.lang.String address2Upszone);
    
    /**
     * Sets (as xml) the "address2_upszone" element
     */
    void xsetAddress2Upszone(org.apache.xmlbeans.XmlString address2Upszone);
    
    /**
     * Unsets the "address2_upszone" element
     */
    void unsetAddress2Upszone();
    
    /**
     * Gets the "address2_utcoffset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAddress2Utcoffset();
    
    /**
     * True if has "address2_utcoffset" element
     */
    boolean isSetAddress2Utcoffset();
    
    /**
     * Sets the "address2_utcoffset" element
     */
    void setAddress2Utcoffset(com.microsoft.schemas.crm._2006.webservices.CrmNumber address2Utcoffset);
    
    /**
     * Appends and returns a new empty "address2_utcoffset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAddress2Utcoffset();
    
    /**
     * Unsets the "address2_utcoffset" element
     */
    void unsetAddress2Utcoffset();
    
    /**
     * Gets the "aging30" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging30();
    
    /**
     * True if has "aging30" element
     */
    boolean isSetAging30();
    
    /**
     * Sets the "aging30" element
     */
    void setAging30(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging30);
    
    /**
     * Appends and returns a new empty "aging30" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging30();
    
    /**
     * Unsets the "aging30" element
     */
    void unsetAging30();
    
    /**
     * Gets the "aging30_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging30Base();
    
    /**
     * True if has "aging30_base" element
     */
    boolean isSetAging30Base();
    
    /**
     * Sets the "aging30_base" element
     */
    void setAging30Base(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging30Base);
    
    /**
     * Appends and returns a new empty "aging30_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging30Base();
    
    /**
     * Unsets the "aging30_base" element
     */
    void unsetAging30Base();
    
    /**
     * Gets the "aging60" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging60();
    
    /**
     * True if has "aging60" element
     */
    boolean isSetAging60();
    
    /**
     * Sets the "aging60" element
     */
    void setAging60(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging60);
    
    /**
     * Appends and returns a new empty "aging60" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging60();
    
    /**
     * Unsets the "aging60" element
     */
    void unsetAging60();
    
    /**
     * Gets the "aging60_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging60Base();
    
    /**
     * True if has "aging60_base" element
     */
    boolean isSetAging60Base();
    
    /**
     * Sets the "aging60_base" element
     */
    void setAging60Base(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging60Base);
    
    /**
     * Appends and returns a new empty "aging60_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging60Base();
    
    /**
     * Unsets the "aging60_base" element
     */
    void unsetAging60Base();
    
    /**
     * Gets the "aging90" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging90();
    
    /**
     * True if has "aging90" element
     */
    boolean isSetAging90();
    
    /**
     * Sets the "aging90" element
     */
    void setAging90(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging90);
    
    /**
     * Appends and returns a new empty "aging90" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging90();
    
    /**
     * Unsets the "aging90" element
     */
    void unsetAging90();
    
    /**
     * Gets the "aging90_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging90Base();
    
    /**
     * True if has "aging90_base" element
     */
    boolean isSetAging90Base();
    
    /**
     * Sets the "aging90_base" element
     */
    void setAging90Base(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging90Base);
    
    /**
     * Appends and returns a new empty "aging90_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging90Base();
    
    /**
     * Unsets the "aging90_base" element
     */
    void unsetAging90Base();
    
    /**
     * Gets the "businesstypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getBusinesstypecode();
    
    /**
     * True if has "businesstypecode" element
     */
    boolean isSetBusinesstypecode();
    
    /**
     * Sets the "businesstypecode" element
     */
    void setBusinesstypecode(com.microsoft.schemas.crm._2006.webservices.Picklist businesstypecode);
    
    /**
     * Appends and returns a new empty "businesstypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewBusinesstypecode();
    
    /**
     * Unsets the "businesstypecode" element
     */
    void unsetBusinesstypecode();
    
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
     * Gets the "creditlimit" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getCreditlimit();
    
    /**
     * True if has "creditlimit" element
     */
    boolean isSetCreditlimit();
    
    /**
     * Sets the "creditlimit" element
     */
    void setCreditlimit(com.microsoft.schemas.crm._2006.webservices.CrmMoney creditlimit);
    
    /**
     * Appends and returns a new empty "creditlimit" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewCreditlimit();
    
    /**
     * Unsets the "creditlimit" element
     */
    void unsetCreditlimit();
    
    /**
     * Gets the "creditlimit_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getCreditlimitBase();
    
    /**
     * True if has "creditlimit_base" element
     */
    boolean isSetCreditlimitBase();
    
    /**
     * Sets the "creditlimit_base" element
     */
    void setCreditlimitBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney creditlimitBase);
    
    /**
     * Appends and returns a new empty "creditlimit_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewCreditlimitBase();
    
    /**
     * Unsets the "creditlimit_base" element
     */
    void unsetCreditlimitBase();
    
    /**
     * Gets the "creditonhold" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCreditonhold();
    
    /**
     * True if has "creditonhold" element
     */
    boolean isSetCreditonhold();
    
    /**
     * Sets the "creditonhold" element
     */
    void setCreditonhold(com.microsoft.schemas.crm._2006.webservices.CrmBoolean creditonhold);
    
    /**
     * Appends and returns a new empty "creditonhold" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCreditonhold();
    
    /**
     * Unsets the "creditonhold" element
     */
    void unsetCreditonhold();
    
    /**
     * Gets the "customersizecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getCustomersizecode();
    
    /**
     * True if has "customersizecode" element
     */
    boolean isSetCustomersizecode();
    
    /**
     * Sets the "customersizecode" element
     */
    void setCustomersizecode(com.microsoft.schemas.crm._2006.webservices.Picklist customersizecode);
    
    /**
     * Appends and returns a new empty "customersizecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewCustomersizecode();
    
    /**
     * Unsets the "customersizecode" element
     */
    void unsetCustomersizecode();
    
    /**
     * Gets the "customertypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getCustomertypecode();
    
    /**
     * True if has "customertypecode" element
     */
    boolean isSetCustomertypecode();
    
    /**
     * Sets the "customertypecode" element
     */
    void setCustomertypecode(com.microsoft.schemas.crm._2006.webservices.Picklist customertypecode);
    
    /**
     * Appends and returns a new empty "customertypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewCustomertypecode();
    
    /**
     * Unsets the "customertypecode" element
     */
    void unsetCustomertypecode();
    
    /**
     * Gets the "defaultpricelevelid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getDefaultpricelevelid();
    
    /**
     * True if has "defaultpricelevelid" element
     */
    boolean isSetDefaultpricelevelid();
    
    /**
     * Sets the "defaultpricelevelid" element
     */
    void setDefaultpricelevelid(com.microsoft.schemas.crm._2006.webservices.Lookup defaultpricelevelid);
    
    /**
     * Appends and returns a new empty "defaultpricelevelid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewDefaultpricelevelid();
    
    /**
     * Unsets the "defaultpricelevelid" element
     */
    void unsetDefaultpricelevelid();
    
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
     * Gets the "donotbulkemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotbulkemail();
    
    /**
     * True if has "donotbulkemail" element
     */
    boolean isSetDonotbulkemail();
    
    /**
     * Sets the "donotbulkemail" element
     */
    void setDonotbulkemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotbulkemail);
    
    /**
     * Appends and returns a new empty "donotbulkemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotbulkemail();
    
    /**
     * Unsets the "donotbulkemail" element
     */
    void unsetDonotbulkemail();
    
    /**
     * Gets the "donotbulkpostalmail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotbulkpostalmail();
    
    /**
     * True if has "donotbulkpostalmail" element
     */
    boolean isSetDonotbulkpostalmail();
    
    /**
     * Sets the "donotbulkpostalmail" element
     */
    void setDonotbulkpostalmail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotbulkpostalmail);
    
    /**
     * Appends and returns a new empty "donotbulkpostalmail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotbulkpostalmail();
    
    /**
     * Unsets the "donotbulkpostalmail" element
     */
    void unsetDonotbulkpostalmail();
    
    /**
     * Gets the "donotemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotemail();
    
    /**
     * True if has "donotemail" element
     */
    boolean isSetDonotemail();
    
    /**
     * Sets the "donotemail" element
     */
    void setDonotemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotemail);
    
    /**
     * Appends and returns a new empty "donotemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotemail();
    
    /**
     * Unsets the "donotemail" element
     */
    void unsetDonotemail();
    
    /**
     * Gets the "donotfax" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotfax();
    
    /**
     * True if has "donotfax" element
     */
    boolean isSetDonotfax();
    
    /**
     * Sets the "donotfax" element
     */
    void setDonotfax(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotfax);
    
    /**
     * Appends and returns a new empty "donotfax" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotfax();
    
    /**
     * Unsets the "donotfax" element
     */
    void unsetDonotfax();
    
    /**
     * Gets the "donotphone" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotphone();
    
    /**
     * True if has "donotphone" element
     */
    boolean isSetDonotphone();
    
    /**
     * Sets the "donotphone" element
     */
    void setDonotphone(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotphone);
    
    /**
     * Appends and returns a new empty "donotphone" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotphone();
    
    /**
     * Unsets the "donotphone" element
     */
    void unsetDonotphone();
    
    /**
     * Gets the "donotpostalmail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotpostalmail();
    
    /**
     * True if has "donotpostalmail" element
     */
    boolean isSetDonotpostalmail();
    
    /**
     * Sets the "donotpostalmail" element
     */
    void setDonotpostalmail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotpostalmail);
    
    /**
     * Appends and returns a new empty "donotpostalmail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotpostalmail();
    
    /**
     * Unsets the "donotpostalmail" element
     */
    void unsetDonotpostalmail();
    
    /**
     * Gets the "donotsendmm" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotsendmm();
    
    /**
     * True if has "donotsendmm" element
     */
    boolean isSetDonotsendmm();
    
    /**
     * Sets the "donotsendmm" element
     */
    void setDonotsendmm(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotsendmm);
    
    /**
     * Appends and returns a new empty "donotsendmm" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotsendmm();
    
    /**
     * Unsets the "donotsendmm" element
     */
    void unsetDonotsendmm();
    
    /**
     * Gets the "emailaddress1" element
     */
    java.lang.String getEmailaddress1();
    
    /**
     * Gets (as xml) the "emailaddress1" element
     */
    org.apache.xmlbeans.XmlString xgetEmailaddress1();
    
    /**
     * True if has "emailaddress1" element
     */
    boolean isSetEmailaddress1();
    
    /**
     * Sets the "emailaddress1" element
     */
    void setEmailaddress1(java.lang.String emailaddress1);
    
    /**
     * Sets (as xml) the "emailaddress1" element
     */
    void xsetEmailaddress1(org.apache.xmlbeans.XmlString emailaddress1);
    
    /**
     * Unsets the "emailaddress1" element
     */
    void unsetEmailaddress1();
    
    /**
     * Gets the "emailaddress2" element
     */
    java.lang.String getEmailaddress2();
    
    /**
     * Gets (as xml) the "emailaddress2" element
     */
    org.apache.xmlbeans.XmlString xgetEmailaddress2();
    
    /**
     * True if has "emailaddress2" element
     */
    boolean isSetEmailaddress2();
    
    /**
     * Sets the "emailaddress2" element
     */
    void setEmailaddress2(java.lang.String emailaddress2);
    
    /**
     * Sets (as xml) the "emailaddress2" element
     */
    void xsetEmailaddress2(org.apache.xmlbeans.XmlString emailaddress2);
    
    /**
     * Unsets the "emailaddress2" element
     */
    void unsetEmailaddress2();
    
    /**
     * Gets the "emailaddress3" element
     */
    java.lang.String getEmailaddress3();
    
    /**
     * Gets (as xml) the "emailaddress3" element
     */
    org.apache.xmlbeans.XmlString xgetEmailaddress3();
    
    /**
     * True if has "emailaddress3" element
     */
    boolean isSetEmailaddress3();
    
    /**
     * Sets the "emailaddress3" element
     */
    void setEmailaddress3(java.lang.String emailaddress3);
    
    /**
     * Sets (as xml) the "emailaddress3" element
     */
    void xsetEmailaddress3(org.apache.xmlbeans.XmlString emailaddress3);
    
    /**
     * Unsets the "emailaddress3" element
     */
    void unsetEmailaddress3();
    
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
     * Gets the "ftpsiteurl" element
     */
    java.lang.String getFtpsiteurl();
    
    /**
     * Gets (as xml) the "ftpsiteurl" element
     */
    org.apache.xmlbeans.XmlString xgetFtpsiteurl();
    
    /**
     * True if has "ftpsiteurl" element
     */
    boolean isSetFtpsiteurl();
    
    /**
     * Sets the "ftpsiteurl" element
     */
    void setFtpsiteurl(java.lang.String ftpsiteurl);
    
    /**
     * Sets (as xml) the "ftpsiteurl" element
     */
    void xsetFtpsiteurl(org.apache.xmlbeans.XmlString ftpsiteurl);
    
    /**
     * Unsets the "ftpsiteurl" element
     */
    void unsetFtpsiteurl();
    
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
     * Gets the "industrycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getIndustrycode();
    
    /**
     * True if has "industrycode" element
     */
    boolean isSetIndustrycode();
    
    /**
     * Sets the "industrycode" element
     */
    void setIndustrycode(com.microsoft.schemas.crm._2006.webservices.Picklist industrycode);
    
    /**
     * Appends and returns a new empty "industrycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewIndustrycode();
    
    /**
     * Unsets the "industrycode" element
     */
    void unsetIndustrycode();
    
    /**
     * Gets the "lastusedincampaign" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getLastusedincampaign();
    
    /**
     * True if has "lastusedincampaign" element
     */
    boolean isSetLastusedincampaign();
    
    /**
     * Sets the "lastusedincampaign" element
     */
    void setLastusedincampaign(com.microsoft.schemas.crm._2006.webservices.CrmDateTime lastusedincampaign);
    
    /**
     * Appends and returns a new empty "lastusedincampaign" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewLastusedincampaign();
    
    /**
     * Unsets the "lastusedincampaign" element
     */
    void unsetLastusedincampaign();
    
    /**
     * Gets the "marketcap" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getMarketcap();
    
    /**
     * True if has "marketcap" element
     */
    boolean isSetMarketcap();
    
    /**
     * Sets the "marketcap" element
     */
    void setMarketcap(com.microsoft.schemas.crm._2006.webservices.CrmMoney marketcap);
    
    /**
     * Appends and returns a new empty "marketcap" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewMarketcap();
    
    /**
     * Unsets the "marketcap" element
     */
    void unsetMarketcap();
    
    /**
     * Gets the "marketcap_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getMarketcapBase();
    
    /**
     * True if has "marketcap_base" element
     */
    boolean isSetMarketcapBase();
    
    /**
     * Sets the "marketcap_base" element
     */
    void setMarketcapBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney marketcapBase);
    
    /**
     * Appends and returns a new empty "marketcap_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewMarketcapBase();
    
    /**
     * Unsets the "marketcap_base" element
     */
    void unsetMarketcapBase();
    
    /**
     * Gets the "masterid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getMasterid();
    
    /**
     * True if has "masterid" element
     */
    boolean isSetMasterid();
    
    /**
     * Sets the "masterid" element
     */
    void setMasterid(com.microsoft.schemas.crm._2006.webservices.Lookup masterid);
    
    /**
     * Appends and returns a new empty "masterid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewMasterid();
    
    /**
     * Unsets the "masterid" element
     */
    void unsetMasterid();
    
    /**
     * Gets the "merged" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getMerged();
    
    /**
     * True if has "merged" element
     */
    boolean isSetMerged();
    
    /**
     * Sets the "merged" element
     */
    void setMerged(com.microsoft.schemas.crm._2006.webservices.CrmBoolean merged);
    
    /**
     * Appends and returns a new empty "merged" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewMerged();
    
    /**
     * Unsets the "merged" element
     */
    void unsetMerged();
    
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
     * Gets the "numberofemployees" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getNumberofemployees();
    
    /**
     * True if has "numberofemployees" element
     */
    boolean isSetNumberofemployees();
    
    /**
     * Sets the "numberofemployees" element
     */
    void setNumberofemployees(com.microsoft.schemas.crm._2006.webservices.CrmNumber numberofemployees);
    
    /**
     * Appends and returns a new empty "numberofemployees" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNumberofemployees();
    
    /**
     * Unsets the "numberofemployees" element
     */
    void unsetNumberofemployees();
    
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
     * Gets the "ownershipcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getOwnershipcode();
    
    /**
     * True if has "ownershipcode" element
     */
    boolean isSetOwnershipcode();
    
    /**
     * Sets the "ownershipcode" element
     */
    void setOwnershipcode(com.microsoft.schemas.crm._2006.webservices.Picklist ownershipcode);
    
    /**
     * Appends and returns a new empty "ownershipcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewOwnershipcode();
    
    /**
     * Unsets the "ownershipcode" element
     */
    void unsetOwnershipcode();
    
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
     * Gets the "parentaccountid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getParentaccountid();
    
    /**
     * True if has "parentaccountid" element
     */
    boolean isSetParentaccountid();
    
    /**
     * Sets the "parentaccountid" element
     */
    void setParentaccountid(com.microsoft.schemas.crm._2006.webservices.Lookup parentaccountid);
    
    /**
     * Appends and returns a new empty "parentaccountid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentaccountid();
    
    /**
     * Unsets the "parentaccountid" element
     */
    void unsetParentaccountid();
    
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
     * Gets the "paymenttermscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getPaymenttermscode();
    
    /**
     * True if has "paymenttermscode" element
     */
    boolean isSetPaymenttermscode();
    
    /**
     * Sets the "paymenttermscode" element
     */
    void setPaymenttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist paymenttermscode);
    
    /**
     * Appends and returns a new empty "paymenttermscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewPaymenttermscode();
    
    /**
     * Unsets the "paymenttermscode" element
     */
    void unsetPaymenttermscode();
    
    /**
     * Gets the "preferredappointmentdaycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getPreferredappointmentdaycode();
    
    /**
     * True if has "preferredappointmentdaycode" element
     */
    boolean isSetPreferredappointmentdaycode();
    
    /**
     * Sets the "preferredappointmentdaycode" element
     */
    void setPreferredappointmentdaycode(com.microsoft.schemas.crm._2006.webservices.Picklist preferredappointmentdaycode);
    
    /**
     * Appends and returns a new empty "preferredappointmentdaycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewPreferredappointmentdaycode();
    
    /**
     * Unsets the "preferredappointmentdaycode" element
     */
    void unsetPreferredappointmentdaycode();
    
    /**
     * Gets the "preferredappointmenttimecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getPreferredappointmenttimecode();
    
    /**
     * True if has "preferredappointmenttimecode" element
     */
    boolean isSetPreferredappointmenttimecode();
    
    /**
     * Sets the "preferredappointmenttimecode" element
     */
    void setPreferredappointmenttimecode(com.microsoft.schemas.crm._2006.webservices.Picklist preferredappointmenttimecode);
    
    /**
     * Appends and returns a new empty "preferredappointmenttimecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewPreferredappointmenttimecode();
    
    /**
     * Unsets the "preferredappointmenttimecode" element
     */
    void unsetPreferredappointmenttimecode();
    
    /**
     * Gets the "preferredcontactmethodcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getPreferredcontactmethodcode();
    
    /**
     * True if has "preferredcontactmethodcode" element
     */
    boolean isSetPreferredcontactmethodcode();
    
    /**
     * Sets the "preferredcontactmethodcode" element
     */
    void setPreferredcontactmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist preferredcontactmethodcode);
    
    /**
     * Appends and returns a new empty "preferredcontactmethodcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewPreferredcontactmethodcode();
    
    /**
     * Unsets the "preferredcontactmethodcode" element
     */
    void unsetPreferredcontactmethodcode();
    
    /**
     * Gets the "preferredequipmentid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPreferredequipmentid();
    
    /**
     * True if has "preferredequipmentid" element
     */
    boolean isSetPreferredequipmentid();
    
    /**
     * Sets the "preferredequipmentid" element
     */
    void setPreferredequipmentid(com.microsoft.schemas.crm._2006.webservices.Lookup preferredequipmentid);
    
    /**
     * Appends and returns a new empty "preferredequipmentid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPreferredequipmentid();
    
    /**
     * Unsets the "preferredequipmentid" element
     */
    void unsetPreferredequipmentid();
    
    /**
     * Gets the "preferredserviceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPreferredserviceid();
    
    /**
     * True if has "preferredserviceid" element
     */
    boolean isSetPreferredserviceid();
    
    /**
     * Sets the "preferredserviceid" element
     */
    void setPreferredserviceid(com.microsoft.schemas.crm._2006.webservices.Lookup preferredserviceid);
    
    /**
     * Appends and returns a new empty "preferredserviceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPreferredserviceid();
    
    /**
     * Unsets the "preferredserviceid" element
     */
    void unsetPreferredserviceid();
    
    /**
     * Gets the "preferredsystemuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPreferredsystemuserid();
    
    /**
     * True if has "preferredsystemuserid" element
     */
    boolean isSetPreferredsystemuserid();
    
    /**
     * Sets the "preferredsystemuserid" element
     */
    void setPreferredsystemuserid(com.microsoft.schemas.crm._2006.webservices.Lookup preferredsystemuserid);
    
    /**
     * Appends and returns a new empty "preferredsystemuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPreferredsystemuserid();
    
    /**
     * Unsets the "preferredsystemuserid" element
     */
    void unsetPreferredsystemuserid();
    
    /**
     * Gets the "primarycontactid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPrimarycontactid();
    
    /**
     * True if has "primarycontactid" element
     */
    boolean isSetPrimarycontactid();
    
    /**
     * Sets the "primarycontactid" element
     */
    void setPrimarycontactid(com.microsoft.schemas.crm._2006.webservices.Lookup primarycontactid);
    
    /**
     * Appends and returns a new empty "primarycontactid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPrimarycontactid();
    
    /**
     * Unsets the "primarycontactid" element
     */
    void unsetPrimarycontactid();
    
    /**
     * Gets the "revenue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getRevenue();
    
    /**
     * True if has "revenue" element
     */
    boolean isSetRevenue();
    
    /**
     * Sets the "revenue" element
     */
    void setRevenue(com.microsoft.schemas.crm._2006.webservices.CrmMoney revenue);
    
    /**
     * Appends and returns a new empty "revenue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRevenue();
    
    /**
     * Unsets the "revenue" element
     */
    void unsetRevenue();
    
    /**
     * Gets the "revenue_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getRevenueBase();
    
    /**
     * True if has "revenue_base" element
     */
    boolean isSetRevenueBase();
    
    /**
     * Sets the "revenue_base" element
     */
    void setRevenueBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney revenueBase);
    
    /**
     * Appends and returns a new empty "revenue_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRevenueBase();
    
    /**
     * Unsets the "revenue_base" element
     */
    void unsetRevenueBase();
    
    /**
     * Gets the "sharesoutstanding" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getSharesoutstanding();
    
    /**
     * True if has "sharesoutstanding" element
     */
    boolean isSetSharesoutstanding();
    
    /**
     * Sets the "sharesoutstanding" element
     */
    void setSharesoutstanding(com.microsoft.schemas.crm._2006.webservices.CrmNumber sharesoutstanding);
    
    /**
     * Appends and returns a new empty "sharesoutstanding" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSharesoutstanding();
    
    /**
     * Unsets the "sharesoutstanding" element
     */
    void unsetSharesoutstanding();
    
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
     * Gets the "sic" element
     */
    java.lang.String getSic();
    
    /**
     * Gets (as xml) the "sic" element
     */
    org.apache.xmlbeans.XmlString xgetSic();
    
    /**
     * True if has "sic" element
     */
    boolean isSetSic();
    
    /**
     * Sets the "sic" element
     */
    void setSic(java.lang.String sic);
    
    /**
     * Sets (as xml) the "sic" element
     */
    void xsetSic(org.apache.xmlbeans.XmlString sic);
    
    /**
     * Unsets the "sic" element
     */
    void unsetSic();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.AccountStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.AccountStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.AccountStateInfo addNewStatecode();
    
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
     * Gets the "stockexchange" element
     */
    java.lang.String getStockexchange();
    
    /**
     * Gets (as xml) the "stockexchange" element
     */
    org.apache.xmlbeans.XmlString xgetStockexchange();
    
    /**
     * True if has "stockexchange" element
     */
    boolean isSetStockexchange();
    
    /**
     * Sets the "stockexchange" element
     */
    void setStockexchange(java.lang.String stockexchange);
    
    /**
     * Sets (as xml) the "stockexchange" element
     */
    void xsetStockexchange(org.apache.xmlbeans.XmlString stockexchange);
    
    /**
     * Unsets the "stockexchange" element
     */
    void unsetStockexchange();
    
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
     * Gets the "territorycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getTerritorycode();
    
    /**
     * True if has "territorycode" element
     */
    boolean isSetTerritorycode();
    
    /**
     * Sets the "territorycode" element
     */
    void setTerritorycode(com.microsoft.schemas.crm._2006.webservices.Picklist territorycode);
    
    /**
     * Appends and returns a new empty "territorycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewTerritorycode();
    
    /**
     * Unsets the "territorycode" element
     */
    void unsetTerritorycode();
    
    /**
     * Gets the "territoryid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getTerritoryid();
    
    /**
     * True if has "territoryid" element
     */
    boolean isSetTerritoryid();
    
    /**
     * Sets the "territoryid" element
     */
    void setTerritoryid(com.microsoft.schemas.crm._2006.webservices.Lookup territoryid);
    
    /**
     * Appends and returns a new empty "territoryid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewTerritoryid();
    
    /**
     * Unsets the "territoryid" element
     */
    void unsetTerritoryid();
    
    /**
     * Gets the "tickersymbol" element
     */
    java.lang.String getTickersymbol();
    
    /**
     * Gets (as xml) the "tickersymbol" element
     */
    org.apache.xmlbeans.XmlString xgetTickersymbol();
    
    /**
     * True if has "tickersymbol" element
     */
    boolean isSetTickersymbol();
    
    /**
     * Sets the "tickersymbol" element
     */
    void setTickersymbol(java.lang.String tickersymbol);
    
    /**
     * Sets (as xml) the "tickersymbol" element
     */
    void xsetTickersymbol(org.apache.xmlbeans.XmlString tickersymbol);
    
    /**
     * Unsets the "tickersymbol" element
     */
    void unsetTickersymbol();
    
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
     * Gets the "websiteurl" element
     */
    java.lang.String getWebsiteurl();
    
    /**
     * Gets (as xml) the "websiteurl" element
     */
    org.apache.xmlbeans.XmlString xgetWebsiteurl();
    
    /**
     * True if has "websiteurl" element
     */
    boolean isSetWebsiteurl();
    
    /**
     * Sets the "websiteurl" element
     */
    void setWebsiteurl(java.lang.String websiteurl);
    
    /**
     * Sets (as xml) the "websiteurl" element
     */
    void xsetWebsiteurl(org.apache.xmlbeans.XmlString websiteurl);
    
    /**
     * Unsets the "websiteurl" element
     */
    void unsetWebsiteurl();
    
    /**
     * Gets the "yominame" element
     */
    java.lang.String getYominame();
    
    /**
     * Gets (as xml) the "yominame" element
     */
    org.apache.xmlbeans.XmlString xgetYominame();
    
    /**
     * True if has "yominame" element
     */
    boolean isSetYominame();
    
    /**
     * Sets the "yominame" element
     */
    void setYominame(java.lang.String yominame);
    
    /**
     * Sets (as xml) the "yominame" element
     */
    void xsetYominame(org.apache.xmlbeans.XmlString yominame);
    
    /**
     * Unsets the "yominame" element
     */
    void unsetYominame();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Account newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Account parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Account) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
