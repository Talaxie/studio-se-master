/*
 * XML Type:  account
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Account
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML account(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class AccountImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Account
{
    
    public AccountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTCATEGORYCODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "accountcategorycode");
    private static final javax.xml.namespace.QName ACCOUNTCLASSIFICATIONCODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "accountclassificationcode");
    private static final javax.xml.namespace.QName ACCOUNTID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "accountid");
    private static final javax.xml.namespace.QName ACCOUNTNUMBER$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "accountnumber");
    private static final javax.xml.namespace.QName ACCOUNTRATINGCODE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "accountratingcode");
    private static final javax.xml.namespace.QName ADDRESS1ADDRESSID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_addressid");
    private static final javax.xml.namespace.QName ADDRESS1ADDRESSTYPECODE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_addresstypecode");
    private static final javax.xml.namespace.QName ADDRESS1CITY$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_city");
    private static final javax.xml.namespace.QName ADDRESS1COUNTRY$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_country");
    private static final javax.xml.namespace.QName ADDRESS1COUNTY$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_county");
    private static final javax.xml.namespace.QName ADDRESS1FAX$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_fax");
    private static final javax.xml.namespace.QName ADDRESS1FREIGHTTERMSCODE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_freighttermscode");
    private static final javax.xml.namespace.QName ADDRESS1LATITUDE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_latitude");
    private static final javax.xml.namespace.QName ADDRESS1LINE1$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line1");
    private static final javax.xml.namespace.QName ADDRESS1LINE2$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line2");
    private static final javax.xml.namespace.QName ADDRESS1LINE3$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line3");
    private static final javax.xml.namespace.QName ADDRESS1LONGITUDE$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_longitude");
    private static final javax.xml.namespace.QName ADDRESS1NAME$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_name");
    private static final javax.xml.namespace.QName ADDRESS1POSTALCODE$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_postalcode");
    private static final javax.xml.namespace.QName ADDRESS1POSTOFFICEBOX$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_postofficebox");
    private static final javax.xml.namespace.QName ADDRESS1PRIMARYCONTACTNAME$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_primarycontactname");
    private static final javax.xml.namespace.QName ADDRESS1SHIPPINGMETHODCODE$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_shippingmethodcode");
    private static final javax.xml.namespace.QName ADDRESS1STATEORPROVINCE$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_stateorprovince");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE1$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone1");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE2$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone2");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE3$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone3");
    private static final javax.xml.namespace.QName ADDRESS1UPSZONE$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_upszone");
    private static final javax.xml.namespace.QName ADDRESS1UTCOFFSET$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_utcoffset");
    private static final javax.xml.namespace.QName ADDRESS2ADDRESSID$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_addressid");
    private static final javax.xml.namespace.QName ADDRESS2ADDRESSTYPECODE$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_addresstypecode");
    private static final javax.xml.namespace.QName ADDRESS2CITY$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_city");
    private static final javax.xml.namespace.QName ADDRESS2COUNTRY$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_country");
    private static final javax.xml.namespace.QName ADDRESS2COUNTY$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_county");
    private static final javax.xml.namespace.QName ADDRESS2FAX$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_fax");
    private static final javax.xml.namespace.QName ADDRESS2FREIGHTTERMSCODE$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_freighttermscode");
    private static final javax.xml.namespace.QName ADDRESS2LATITUDE$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_latitude");
    private static final javax.xml.namespace.QName ADDRESS2LINE1$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line1");
    private static final javax.xml.namespace.QName ADDRESS2LINE2$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line2");
    private static final javax.xml.namespace.QName ADDRESS2LINE3$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line3");
    private static final javax.xml.namespace.QName ADDRESS2LONGITUDE$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_longitude");
    private static final javax.xml.namespace.QName ADDRESS2NAME$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_name");
    private static final javax.xml.namespace.QName ADDRESS2POSTALCODE$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_postalcode");
    private static final javax.xml.namespace.QName ADDRESS2POSTOFFICEBOX$84 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_postofficebox");
    private static final javax.xml.namespace.QName ADDRESS2PRIMARYCONTACTNAME$86 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_primarycontactname");
    private static final javax.xml.namespace.QName ADDRESS2SHIPPINGMETHODCODE$88 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_shippingmethodcode");
    private static final javax.xml.namespace.QName ADDRESS2STATEORPROVINCE$90 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_stateorprovince");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE1$92 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone1");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE2$94 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone2");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE3$96 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone3");
    private static final javax.xml.namespace.QName ADDRESS2UPSZONE$98 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_upszone");
    private static final javax.xml.namespace.QName ADDRESS2UTCOFFSET$100 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_utcoffset");
    private static final javax.xml.namespace.QName AGING30$102 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging30");
    private static final javax.xml.namespace.QName AGING30BASE$104 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging30_base");
    private static final javax.xml.namespace.QName AGING60$106 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging60");
    private static final javax.xml.namespace.QName AGING60BASE$108 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging60_base");
    private static final javax.xml.namespace.QName AGING90$110 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging90");
    private static final javax.xml.namespace.QName AGING90BASE$112 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging90_base");
    private static final javax.xml.namespace.QName BUSINESSTYPECODE$114 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "businesstypecode");
    private static final javax.xml.namespace.QName CREATEDBY$116 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$118 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CREDITLIMIT$120 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "creditlimit");
    private static final javax.xml.namespace.QName CREDITLIMITBASE$122 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "creditlimit_base");
    private static final javax.xml.namespace.QName CREDITONHOLD$124 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "creditonhold");
    private static final javax.xml.namespace.QName CUSTOMERSIZECODE$126 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customersizecode");
    private static final javax.xml.namespace.QName CUSTOMERTYPECODE$128 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customertypecode");
    private static final javax.xml.namespace.QName DEFAULTPRICELEVELID$130 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "defaultpricelevelid");
    private static final javax.xml.namespace.QName DESCRIPTION$132 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName DONOTBULKEMAIL$134 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotbulkemail");
    private static final javax.xml.namespace.QName DONOTBULKPOSTALMAIL$136 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotbulkpostalmail");
    private static final javax.xml.namespace.QName DONOTEMAIL$138 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotemail");
    private static final javax.xml.namespace.QName DONOTFAX$140 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotfax");
    private static final javax.xml.namespace.QName DONOTPHONE$142 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotphone");
    private static final javax.xml.namespace.QName DONOTPOSTALMAIL$144 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotpostalmail");
    private static final javax.xml.namespace.QName DONOTSENDMM$146 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotsendmm");
    private static final javax.xml.namespace.QName EMAILADDRESS1$148 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress1");
    private static final javax.xml.namespace.QName EMAILADDRESS2$150 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress2");
    private static final javax.xml.namespace.QName EMAILADDRESS3$152 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress3");
    private static final javax.xml.namespace.QName EXCHANGERATE$154 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangerate");
    private static final javax.xml.namespace.QName FAX$156 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fax");
    private static final javax.xml.namespace.QName FTPSITEURL$158 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ftpsiteurl");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$160 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName INDUSTRYCODE$162 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "industrycode");
    private static final javax.xml.namespace.QName LASTUSEDINCAMPAIGN$164 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lastusedincampaign");
    private static final javax.xml.namespace.QName MARKETCAP$166 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "marketcap");
    private static final javax.xml.namespace.QName MARKETCAPBASE$168 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "marketcap_base");
    private static final javax.xml.namespace.QName MASTERID$170 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "masterid");
    private static final javax.xml.namespace.QName MERGED$172 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "merged");
    private static final javax.xml.namespace.QName MODIFIEDBY$174 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$176 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$178 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName NUMBEROFEMPLOYEES$180 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "numberofemployees");
    private static final javax.xml.namespace.QName ORIGINATINGLEADID$182 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "originatingleadid");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$184 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNERID$186 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownerid");
    private static final javax.xml.namespace.QName OWNERSHIPCODE$188 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownershipcode");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$190 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName PARENTACCOUNTID$192 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parentaccountid");
    private static final javax.xml.namespace.QName PARTICIPATESINWORKFLOW$194 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "participatesinworkflow");
    private static final javax.xml.namespace.QName PAYMENTTERMSCODE$196 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "paymenttermscode");
    private static final javax.xml.namespace.QName PREFERREDAPPOINTMENTDAYCODE$198 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredappointmentdaycode");
    private static final javax.xml.namespace.QName PREFERREDAPPOINTMENTTIMECODE$200 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredappointmenttimecode");
    private static final javax.xml.namespace.QName PREFERREDCONTACTMETHODCODE$202 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredcontactmethodcode");
    private static final javax.xml.namespace.QName PREFERREDEQUIPMENTID$204 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredequipmentid");
    private static final javax.xml.namespace.QName PREFERREDSERVICEID$206 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredserviceid");
    private static final javax.xml.namespace.QName PREFERREDSYSTEMUSERID$208 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredsystemuserid");
    private static final javax.xml.namespace.QName PRIMARYCONTACTID$210 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "primarycontactid");
    private static final javax.xml.namespace.QName REVENUE$212 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "revenue");
    private static final javax.xml.namespace.QName REVENUEBASE$214 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "revenue_base");
    private static final javax.xml.namespace.QName SHARESOUTSTANDING$216 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sharesoutstanding");
    private static final javax.xml.namespace.QName SHIPPINGMETHODCODE$218 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shippingmethodcode");
    private static final javax.xml.namespace.QName SIC$220 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sic");
    private static final javax.xml.namespace.QName STATECODE$222 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$224 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName STOCKEXCHANGE$226 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "stockexchange");
    private static final javax.xml.namespace.QName TELEPHONE1$228 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "telephone1");
    private static final javax.xml.namespace.QName TELEPHONE2$230 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "telephone2");
    private static final javax.xml.namespace.QName TELEPHONE3$232 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "telephone3");
    private static final javax.xml.namespace.QName TERRITORYCODE$234 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "territorycode");
    private static final javax.xml.namespace.QName TERRITORYID$236 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "territoryid");
    private static final javax.xml.namespace.QName TICKERSYMBOL$238 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "tickersymbol");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$240 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$242 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$244 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    private static final javax.xml.namespace.QName WEBSITEURL$246 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "websiteurl");
    private static final javax.xml.namespace.QName YOMINAME$248 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yominame");
    
    
    /**
     * Gets the "accountcategorycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAccountcategorycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCOUNTCATEGORYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accountcategorycode" element
     */
    public boolean isSetAccountcategorycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTCATEGORYCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "accountcategorycode" element
     */
    public void setAccountcategorycode(com.microsoft.schemas.crm._2006.webservices.Picklist accountcategorycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCOUNTCATEGORYCODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCOUNTCATEGORYCODE$0);
            }
            target.set(accountcategorycode);
        }
    }
    
    /**
     * Appends and returns a new empty "accountcategorycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAccountcategorycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCOUNTCATEGORYCODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "accountcategorycode" element
     */
    public void unsetAccountcategorycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTCATEGORYCODE$0, 0);
        }
    }
    
    /**
     * Gets the "accountclassificationcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAccountclassificationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCOUNTCLASSIFICATIONCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accountclassificationcode" element
     */
    public boolean isSetAccountclassificationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTCLASSIFICATIONCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "accountclassificationcode" element
     */
    public void setAccountclassificationcode(com.microsoft.schemas.crm._2006.webservices.Picklist accountclassificationcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCOUNTCLASSIFICATIONCODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCOUNTCLASSIFICATIONCODE$2);
            }
            target.set(accountclassificationcode);
        }
    }
    
    /**
     * Appends and returns a new empty "accountclassificationcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAccountclassificationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCOUNTCLASSIFICATIONCODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "accountclassificationcode" element
     */
    public void unsetAccountclassificationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTCLASSIFICATIONCODE$2, 0);
        }
    }
    
    /**
     * Gets the "accountid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getAccountid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ACCOUNTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accountid" element
     */
    public boolean isSetAccountid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTID$4) != 0;
        }
    }
    
    /**
     * Sets the "accountid" element
     */
    public void setAccountid(com.microsoft.schemas.crm._2006.webservices.Key accountid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ACCOUNTID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ACCOUNTID$4);
            }
            target.set(accountid);
        }
    }
    
    /**
     * Appends and returns a new empty "accountid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewAccountid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ACCOUNTID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "accountid" element
     */
    public void unsetAccountid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTID$4, 0);
        }
    }
    
    /**
     * Gets the "accountnumber" element
     */
    public java.lang.String getAccountnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNUMBER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accountnumber" element
     */
    public org.apache.xmlbeans.XmlString xgetAccountnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "accountnumber" element
     */
    public boolean isSetAccountnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTNUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "accountnumber" element
     */
    public void setAccountnumber(java.lang.String accountnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTNUMBER$6);
            }
            target.setStringValue(accountnumber);
        }
    }
    
    /**
     * Sets (as xml) the "accountnumber" element
     */
    public void xsetAccountnumber(org.apache.xmlbeans.XmlString accountnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOUNTNUMBER$6);
            }
            target.set(accountnumber);
        }
    }
    
    /**
     * Unsets the "accountnumber" element
     */
    public void unsetAccountnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTNUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "accountratingcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAccountratingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCOUNTRATINGCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accountratingcode" element
     */
    public boolean isSetAccountratingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTRATINGCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "accountratingcode" element
     */
    public void setAccountratingcode(com.microsoft.schemas.crm._2006.webservices.Picklist accountratingcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCOUNTRATINGCODE$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCOUNTRATINGCODE$8);
            }
            target.set(accountratingcode);
        }
    }
    
    /**
     * Appends and returns a new empty "accountratingcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAccountratingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCOUNTRATINGCODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "accountratingcode" element
     */
    public void unsetAccountratingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTRATINGCODE$8, 0);
        }
    }
    
    /**
     * Gets the "address1_addressid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getAddress1Addressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS1ADDRESSID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address1_addressid" element
     */
    public boolean isSetAddress1Addressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1ADDRESSID$10) != 0;
        }
    }
    
    /**
     * Sets the "address1_addressid" element
     */
    public void setAddress1Addressid(com.microsoft.schemas.crm._2006.webservices.Key address1Addressid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS1ADDRESSID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS1ADDRESSID$10);
            }
            target.set(address1Addressid);
        }
    }
    
    /**
     * Appends and returns a new empty "address1_addressid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewAddress1Addressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS1ADDRESSID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "address1_addressid" element
     */
    public void unsetAddress1Addressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1ADDRESSID$10, 0);
        }
    }
    
    /**
     * Gets the "address1_addresstypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAddress1Addresstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1ADDRESSTYPECODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address1_addresstypecode" element
     */
    public boolean isSetAddress1Addresstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1ADDRESSTYPECODE$12) != 0;
        }
    }
    
    /**
     * Sets the "address1_addresstypecode" element
     */
    public void setAddress1Addresstypecode(com.microsoft.schemas.crm._2006.webservices.Picklist address1Addresstypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1ADDRESSTYPECODE$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1ADDRESSTYPECODE$12);
            }
            target.set(address1Addresstypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "address1_addresstypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress1Addresstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1ADDRESSTYPECODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "address1_addresstypecode" element
     */
    public void unsetAddress1Addresstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1ADDRESSTYPECODE$12, 0);
        }
    }
    
    /**
     * Gets the "address1_city" element
     */
    public java.lang.String getAddress1City()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1CITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_city" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1City()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1CITY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_city" element
     */
    public boolean isSetAddress1City()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1CITY$14) != 0;
        }
    }
    
    /**
     * Sets the "address1_city" element
     */
    public void setAddress1City(java.lang.String address1City)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1CITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1CITY$14);
            }
            target.setStringValue(address1City);
        }
    }
    
    /**
     * Sets (as xml) the "address1_city" element
     */
    public void xsetAddress1City(org.apache.xmlbeans.XmlString address1City)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1CITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1CITY$14);
            }
            target.set(address1City);
        }
    }
    
    /**
     * Unsets the "address1_city" element
     */
    public void unsetAddress1City()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1CITY$14, 0);
        }
    }
    
    /**
     * Gets the "address1_country" element
     */
    public java.lang.String getAddress1Country()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTRY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_country" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Country()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTRY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_country" element
     */
    public boolean isSetAddress1Country()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1COUNTRY$16) != 0;
        }
    }
    
    /**
     * Sets the "address1_country" element
     */
    public void setAddress1Country(java.lang.String address1Country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTRY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1COUNTRY$16);
            }
            target.setStringValue(address1Country);
        }
    }
    
    /**
     * Sets (as xml) the "address1_country" element
     */
    public void xsetAddress1Country(org.apache.xmlbeans.XmlString address1Country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTRY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1COUNTRY$16);
            }
            target.set(address1Country);
        }
    }
    
    /**
     * Unsets the "address1_country" element
     */
    public void unsetAddress1Country()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1COUNTRY$16, 0);
        }
    }
    
    /**
     * Gets the "address1_county" element
     */
    public java.lang.String getAddress1County()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_county" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1County()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTY$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_county" element
     */
    public boolean isSetAddress1County()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1COUNTY$18) != 0;
        }
    }
    
    /**
     * Sets the "address1_county" element
     */
    public void setAddress1County(java.lang.String address1County)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1COUNTY$18);
            }
            target.setStringValue(address1County);
        }
    }
    
    /**
     * Sets (as xml) the "address1_county" element
     */
    public void xsetAddress1County(org.apache.xmlbeans.XmlString address1County)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1COUNTY$18);
            }
            target.set(address1County);
        }
    }
    
    /**
     * Unsets the "address1_county" element
     */
    public void unsetAddress1County()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1COUNTY$18, 0);
        }
    }
    
    /**
     * Gets the "address1_fax" element
     */
    public java.lang.String getAddress1Fax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1FAX$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_fax" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Fax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1FAX$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_fax" element
     */
    public boolean isSetAddress1Fax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1FAX$20) != 0;
        }
    }
    
    /**
     * Sets the "address1_fax" element
     */
    public void setAddress1Fax(java.lang.String address1Fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1FAX$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1FAX$20);
            }
            target.setStringValue(address1Fax);
        }
    }
    
    /**
     * Sets (as xml) the "address1_fax" element
     */
    public void xsetAddress1Fax(org.apache.xmlbeans.XmlString address1Fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1FAX$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1FAX$20);
            }
            target.set(address1Fax);
        }
    }
    
    /**
     * Unsets the "address1_fax" element
     */
    public void unsetAddress1Fax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1FAX$20, 0);
        }
    }
    
    /**
     * Gets the "address1_freighttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAddress1Freighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1FREIGHTTERMSCODE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address1_freighttermscode" element
     */
    public boolean isSetAddress1Freighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1FREIGHTTERMSCODE$22) != 0;
        }
    }
    
    /**
     * Sets the "address1_freighttermscode" element
     */
    public void setAddress1Freighttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist address1Freighttermscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1FREIGHTTERMSCODE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1FREIGHTTERMSCODE$22);
            }
            target.set(address1Freighttermscode);
        }
    }
    
    /**
     * Appends and returns a new empty "address1_freighttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress1Freighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1FREIGHTTERMSCODE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "address1_freighttermscode" element
     */
    public void unsetAddress1Freighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1FREIGHTTERMSCODE$22, 0);
        }
    }
    
    /**
     * Gets the "address1_latitude" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat getAddress1Latitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LATITUDE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address1_latitude" element
     */
    public boolean isSetAddress1Latitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1LATITUDE$24) != 0;
        }
    }
    
    /**
     * Sets the "address1_latitude" element
     */
    public void setAddress1Latitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat address1Latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LATITUDE$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LATITUDE$24);
            }
            target.set(address1Latitude);
        }
    }
    
    /**
     * Appends and returns a new empty "address1_latitude" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewAddress1Latitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LATITUDE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "address1_latitude" element
     */
    public void unsetAddress1Latitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1LATITUDE$24, 0);
        }
    }
    
    /**
     * Gets the "address1_line1" element
     */
    public java.lang.String getAddress1Line1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE1$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_line1" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Line1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE1$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_line1" element
     */
    public boolean isSetAddress1Line1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1LINE1$26) != 0;
        }
    }
    
    /**
     * Sets the "address1_line1" element
     */
    public void setAddress1Line1(java.lang.String address1Line1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE1$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE1$26);
            }
            target.setStringValue(address1Line1);
        }
    }
    
    /**
     * Sets (as xml) the "address1_line1" element
     */
    public void xsetAddress1Line1(org.apache.xmlbeans.XmlString address1Line1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE1$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE1$26);
            }
            target.set(address1Line1);
        }
    }
    
    /**
     * Unsets the "address1_line1" element
     */
    public void unsetAddress1Line1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1LINE1$26, 0);
        }
    }
    
    /**
     * Gets the "address1_line2" element
     */
    public java.lang.String getAddress1Line2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE2$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_line2" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Line2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE2$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_line2" element
     */
    public boolean isSetAddress1Line2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1LINE2$28) != 0;
        }
    }
    
    /**
     * Sets the "address1_line2" element
     */
    public void setAddress1Line2(java.lang.String address1Line2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE2$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE2$28);
            }
            target.setStringValue(address1Line2);
        }
    }
    
    /**
     * Sets (as xml) the "address1_line2" element
     */
    public void xsetAddress1Line2(org.apache.xmlbeans.XmlString address1Line2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE2$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE2$28);
            }
            target.set(address1Line2);
        }
    }
    
    /**
     * Unsets the "address1_line2" element
     */
    public void unsetAddress1Line2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1LINE2$28, 0);
        }
    }
    
    /**
     * Gets the "address1_line3" element
     */
    public java.lang.String getAddress1Line3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE3$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_line3" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Line3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE3$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_line3" element
     */
    public boolean isSetAddress1Line3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1LINE3$30) != 0;
        }
    }
    
    /**
     * Sets the "address1_line3" element
     */
    public void setAddress1Line3(java.lang.String address1Line3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE3$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE3$30);
            }
            target.setStringValue(address1Line3);
        }
    }
    
    /**
     * Sets (as xml) the "address1_line3" element
     */
    public void xsetAddress1Line3(org.apache.xmlbeans.XmlString address1Line3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE3$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE3$30);
            }
            target.set(address1Line3);
        }
    }
    
    /**
     * Unsets the "address1_line3" element
     */
    public void unsetAddress1Line3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1LINE3$30, 0);
        }
    }
    
    /**
     * Gets the "address1_longitude" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat getAddress1Longitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LONGITUDE$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address1_longitude" element
     */
    public boolean isSetAddress1Longitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1LONGITUDE$32) != 0;
        }
    }
    
    /**
     * Sets the "address1_longitude" element
     */
    public void setAddress1Longitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat address1Longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LONGITUDE$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LONGITUDE$32);
            }
            target.set(address1Longitude);
        }
    }
    
    /**
     * Appends and returns a new empty "address1_longitude" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewAddress1Longitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LONGITUDE$32);
            return target;
        }
    }
    
    /**
     * Unsets the "address1_longitude" element
     */
    public void unsetAddress1Longitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1LONGITUDE$32, 0);
        }
    }
    
    /**
     * Gets the "address1_name" element
     */
    public java.lang.String getAddress1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1NAME$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_name" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1NAME$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_name" element
     */
    public boolean isSetAddress1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1NAME$34) != 0;
        }
    }
    
    /**
     * Sets the "address1_name" element
     */
    public void setAddress1Name(java.lang.String address1Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1NAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1NAME$34);
            }
            target.setStringValue(address1Name);
        }
    }
    
    /**
     * Sets (as xml) the "address1_name" element
     */
    public void xsetAddress1Name(org.apache.xmlbeans.XmlString address1Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1NAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1NAME$34);
            }
            target.set(address1Name);
        }
    }
    
    /**
     * Unsets the "address1_name" element
     */
    public void unsetAddress1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1NAME$34, 0);
        }
    }
    
    /**
     * Gets the "address1_postalcode" element
     */
    public java.lang.String getAddress1Postalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTALCODE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_postalcode" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Postalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTALCODE$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_postalcode" element
     */
    public boolean isSetAddress1Postalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1POSTALCODE$36) != 0;
        }
    }
    
    /**
     * Sets the "address1_postalcode" element
     */
    public void setAddress1Postalcode(java.lang.String address1Postalcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTALCODE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1POSTALCODE$36);
            }
            target.setStringValue(address1Postalcode);
        }
    }
    
    /**
     * Sets (as xml) the "address1_postalcode" element
     */
    public void xsetAddress1Postalcode(org.apache.xmlbeans.XmlString address1Postalcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTALCODE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1POSTALCODE$36);
            }
            target.set(address1Postalcode);
        }
    }
    
    /**
     * Unsets the "address1_postalcode" element
     */
    public void unsetAddress1Postalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1POSTALCODE$36, 0);
        }
    }
    
    /**
     * Gets the "address1_postofficebox" element
     */
    public java.lang.String getAddress1Postofficebox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_postofficebox" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Postofficebox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_postofficebox" element
     */
    public boolean isSetAddress1Postofficebox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1POSTOFFICEBOX$38) != 0;
        }
    }
    
    /**
     * Sets the "address1_postofficebox" element
     */
    public void setAddress1Postofficebox(java.lang.String address1Postofficebox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1POSTOFFICEBOX$38);
            }
            target.setStringValue(address1Postofficebox);
        }
    }
    
    /**
     * Sets (as xml) the "address1_postofficebox" element
     */
    public void xsetAddress1Postofficebox(org.apache.xmlbeans.XmlString address1Postofficebox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1POSTOFFICEBOX$38);
            }
            target.set(address1Postofficebox);
        }
    }
    
    /**
     * Unsets the "address1_postofficebox" element
     */
    public void unsetAddress1Postofficebox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1POSTOFFICEBOX$38, 0);
        }
    }
    
    /**
     * Gets the "address1_primarycontactname" element
     */
    public java.lang.String getAddress1Primarycontactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1PRIMARYCONTACTNAME$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_primarycontactname" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Primarycontactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1PRIMARYCONTACTNAME$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_primarycontactname" element
     */
    public boolean isSetAddress1Primarycontactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1PRIMARYCONTACTNAME$40) != 0;
        }
    }
    
    /**
     * Sets the "address1_primarycontactname" element
     */
    public void setAddress1Primarycontactname(java.lang.String address1Primarycontactname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1PRIMARYCONTACTNAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1PRIMARYCONTACTNAME$40);
            }
            target.setStringValue(address1Primarycontactname);
        }
    }
    
    /**
     * Sets (as xml) the "address1_primarycontactname" element
     */
    public void xsetAddress1Primarycontactname(org.apache.xmlbeans.XmlString address1Primarycontactname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1PRIMARYCONTACTNAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1PRIMARYCONTACTNAME$40);
            }
            target.set(address1Primarycontactname);
        }
    }
    
    /**
     * Unsets the "address1_primarycontactname" element
     */
    public void unsetAddress1Primarycontactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1PRIMARYCONTACTNAME$40, 0);
        }
    }
    
    /**
     * Gets the "address1_shippingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAddress1Shippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1SHIPPINGMETHODCODE$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address1_shippingmethodcode" element
     */
    public boolean isSetAddress1Shippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1SHIPPINGMETHODCODE$42) != 0;
        }
    }
    
    /**
     * Sets the "address1_shippingmethodcode" element
     */
    public void setAddress1Shippingmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist address1Shippingmethodcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1SHIPPINGMETHODCODE$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1SHIPPINGMETHODCODE$42);
            }
            target.set(address1Shippingmethodcode);
        }
    }
    
    /**
     * Appends and returns a new empty "address1_shippingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress1Shippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1SHIPPINGMETHODCODE$42);
            return target;
        }
    }
    
    /**
     * Unsets the "address1_shippingmethodcode" element
     */
    public void unsetAddress1Shippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1SHIPPINGMETHODCODE$42, 0);
        }
    }
    
    /**
     * Gets the "address1_stateorprovince" element
     */
    public java.lang.String getAddress1Stateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1STATEORPROVINCE$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_stateorprovince" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Stateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1STATEORPROVINCE$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_stateorprovince" element
     */
    public boolean isSetAddress1Stateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1STATEORPROVINCE$44) != 0;
        }
    }
    
    /**
     * Sets the "address1_stateorprovince" element
     */
    public void setAddress1Stateorprovince(java.lang.String address1Stateorprovince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1STATEORPROVINCE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1STATEORPROVINCE$44);
            }
            target.setStringValue(address1Stateorprovince);
        }
    }
    
    /**
     * Sets (as xml) the "address1_stateorprovince" element
     */
    public void xsetAddress1Stateorprovince(org.apache.xmlbeans.XmlString address1Stateorprovince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1STATEORPROVINCE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1STATEORPROVINCE$44);
            }
            target.set(address1Stateorprovince);
        }
    }
    
    /**
     * Unsets the "address1_stateorprovince" element
     */
    public void unsetAddress1Stateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1STATEORPROVINCE$44, 0);
        }
    }
    
    /**
     * Gets the "address1_telephone1" element
     */
    public java.lang.String getAddress1Telephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE1$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_telephone1" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Telephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE1$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_telephone1" element
     */
    public boolean isSetAddress1Telephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1TELEPHONE1$46) != 0;
        }
    }
    
    /**
     * Sets the "address1_telephone1" element
     */
    public void setAddress1Telephone1(java.lang.String address1Telephone1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE1$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE1$46);
            }
            target.setStringValue(address1Telephone1);
        }
    }
    
    /**
     * Sets (as xml) the "address1_telephone1" element
     */
    public void xsetAddress1Telephone1(org.apache.xmlbeans.XmlString address1Telephone1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE1$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE1$46);
            }
            target.set(address1Telephone1);
        }
    }
    
    /**
     * Unsets the "address1_telephone1" element
     */
    public void unsetAddress1Telephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1TELEPHONE1$46, 0);
        }
    }
    
    /**
     * Gets the "address1_telephone2" element
     */
    public java.lang.String getAddress1Telephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE2$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_telephone2" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Telephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE2$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_telephone2" element
     */
    public boolean isSetAddress1Telephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1TELEPHONE2$48) != 0;
        }
    }
    
    /**
     * Sets the "address1_telephone2" element
     */
    public void setAddress1Telephone2(java.lang.String address1Telephone2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE2$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE2$48);
            }
            target.setStringValue(address1Telephone2);
        }
    }
    
    /**
     * Sets (as xml) the "address1_telephone2" element
     */
    public void xsetAddress1Telephone2(org.apache.xmlbeans.XmlString address1Telephone2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE2$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE2$48);
            }
            target.set(address1Telephone2);
        }
    }
    
    /**
     * Unsets the "address1_telephone2" element
     */
    public void unsetAddress1Telephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1TELEPHONE2$48, 0);
        }
    }
    
    /**
     * Gets the "address1_telephone3" element
     */
    public java.lang.String getAddress1Telephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE3$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_telephone3" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Telephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE3$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_telephone3" element
     */
    public boolean isSetAddress1Telephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1TELEPHONE3$50) != 0;
        }
    }
    
    /**
     * Sets the "address1_telephone3" element
     */
    public void setAddress1Telephone3(java.lang.String address1Telephone3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE3$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE3$50);
            }
            target.setStringValue(address1Telephone3);
        }
    }
    
    /**
     * Sets (as xml) the "address1_telephone3" element
     */
    public void xsetAddress1Telephone3(org.apache.xmlbeans.XmlString address1Telephone3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE3$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE3$50);
            }
            target.set(address1Telephone3);
        }
    }
    
    /**
     * Unsets the "address1_telephone3" element
     */
    public void unsetAddress1Telephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1TELEPHONE3$50, 0);
        }
    }
    
    /**
     * Gets the "address1_upszone" element
     */
    public java.lang.String getAddress1Upszone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1UPSZONE$52, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address1_upszone" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress1Upszone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1UPSZONE$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "address1_upszone" element
     */
    public boolean isSetAddress1Upszone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1UPSZONE$52) != 0;
        }
    }
    
    /**
     * Sets the "address1_upszone" element
     */
    public void setAddress1Upszone(java.lang.String address1Upszone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1UPSZONE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1UPSZONE$52);
            }
            target.setStringValue(address1Upszone);
        }
    }
    
    /**
     * Sets (as xml) the "address1_upszone" element
     */
    public void xsetAddress1Upszone(org.apache.xmlbeans.XmlString address1Upszone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1UPSZONE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1UPSZONE$52);
            }
            target.set(address1Upszone);
        }
    }
    
    /**
     * Unsets the "address1_upszone" element
     */
    public void unsetAddress1Upszone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1UPSZONE$52, 0);
        }
    }
    
    /**
     * Gets the "address1_utcoffset" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getAddress1Utcoffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS1UTCOFFSET$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address1_utcoffset" element
     */
    public boolean isSetAddress1Utcoffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS1UTCOFFSET$54) != 0;
        }
    }
    
    /**
     * Sets the "address1_utcoffset" element
     */
    public void setAddress1Utcoffset(com.microsoft.schemas.crm._2006.webservices.CrmNumber address1Utcoffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS1UTCOFFSET$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS1UTCOFFSET$54);
            }
            target.set(address1Utcoffset);
        }
    }
    
    /**
     * Appends and returns a new empty "address1_utcoffset" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAddress1Utcoffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS1UTCOFFSET$54);
            return target;
        }
    }
    
    /**
     * Unsets the "address1_utcoffset" element
     */
    public void unsetAddress1Utcoffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS1UTCOFFSET$54, 0);
        }
    }
    
    /**
     * Gets the "address2_addressid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getAddress2Addressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS2ADDRESSID$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address2_addressid" element
     */
    public boolean isSetAddress2Addressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2ADDRESSID$56) != 0;
        }
    }
    
    /**
     * Sets the "address2_addressid" element
     */
    public void setAddress2Addressid(com.microsoft.schemas.crm._2006.webservices.Key address2Addressid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS2ADDRESSID$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS2ADDRESSID$56);
            }
            target.set(address2Addressid);
        }
    }
    
    /**
     * Appends and returns a new empty "address2_addressid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewAddress2Addressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS2ADDRESSID$56);
            return target;
        }
    }
    
    /**
     * Unsets the "address2_addressid" element
     */
    public void unsetAddress2Addressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2ADDRESSID$56, 0);
        }
    }
    
    /**
     * Gets the "address2_addresstypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAddress2Addresstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2ADDRESSTYPECODE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address2_addresstypecode" element
     */
    public boolean isSetAddress2Addresstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2ADDRESSTYPECODE$58) != 0;
        }
    }
    
    /**
     * Sets the "address2_addresstypecode" element
     */
    public void setAddress2Addresstypecode(com.microsoft.schemas.crm._2006.webservices.Picklist address2Addresstypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2ADDRESSTYPECODE$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2ADDRESSTYPECODE$58);
            }
            target.set(address2Addresstypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "address2_addresstypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress2Addresstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2ADDRESSTYPECODE$58);
            return target;
        }
    }
    
    /**
     * Unsets the "address2_addresstypecode" element
     */
    public void unsetAddress2Addresstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2ADDRESSTYPECODE$58, 0);
        }
    }
    
    /**
     * Gets the "address2_city" element
     */
    public java.lang.String getAddress2City()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2CITY$60, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_city" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2City()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2CITY$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_city" element
     */
    public boolean isSetAddress2City()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2CITY$60) != 0;
        }
    }
    
    /**
     * Sets the "address2_city" element
     */
    public void setAddress2City(java.lang.String address2City)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2CITY$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2CITY$60);
            }
            target.setStringValue(address2City);
        }
    }
    
    /**
     * Sets (as xml) the "address2_city" element
     */
    public void xsetAddress2City(org.apache.xmlbeans.XmlString address2City)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2CITY$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2CITY$60);
            }
            target.set(address2City);
        }
    }
    
    /**
     * Unsets the "address2_city" element
     */
    public void unsetAddress2City()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2CITY$60, 0);
        }
    }
    
    /**
     * Gets the "address2_country" element
     */
    public java.lang.String getAddress2Country()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTRY$62, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_country" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Country()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTRY$62, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_country" element
     */
    public boolean isSetAddress2Country()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2COUNTRY$62) != 0;
        }
    }
    
    /**
     * Sets the "address2_country" element
     */
    public void setAddress2Country(java.lang.String address2Country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTRY$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2COUNTRY$62);
            }
            target.setStringValue(address2Country);
        }
    }
    
    /**
     * Sets (as xml) the "address2_country" element
     */
    public void xsetAddress2Country(org.apache.xmlbeans.XmlString address2Country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTRY$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2COUNTRY$62);
            }
            target.set(address2Country);
        }
    }
    
    /**
     * Unsets the "address2_country" element
     */
    public void unsetAddress2Country()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2COUNTRY$62, 0);
        }
    }
    
    /**
     * Gets the "address2_county" element
     */
    public java.lang.String getAddress2County()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTY$64, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_county" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2County()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTY$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_county" element
     */
    public boolean isSetAddress2County()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2COUNTY$64) != 0;
        }
    }
    
    /**
     * Sets the "address2_county" element
     */
    public void setAddress2County(java.lang.String address2County)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTY$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2COUNTY$64);
            }
            target.setStringValue(address2County);
        }
    }
    
    /**
     * Sets (as xml) the "address2_county" element
     */
    public void xsetAddress2County(org.apache.xmlbeans.XmlString address2County)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTY$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2COUNTY$64);
            }
            target.set(address2County);
        }
    }
    
    /**
     * Unsets the "address2_county" element
     */
    public void unsetAddress2County()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2COUNTY$64, 0);
        }
    }
    
    /**
     * Gets the "address2_fax" element
     */
    public java.lang.String getAddress2Fax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2FAX$66, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_fax" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Fax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2FAX$66, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_fax" element
     */
    public boolean isSetAddress2Fax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2FAX$66) != 0;
        }
    }
    
    /**
     * Sets the "address2_fax" element
     */
    public void setAddress2Fax(java.lang.String address2Fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2FAX$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2FAX$66);
            }
            target.setStringValue(address2Fax);
        }
    }
    
    /**
     * Sets (as xml) the "address2_fax" element
     */
    public void xsetAddress2Fax(org.apache.xmlbeans.XmlString address2Fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2FAX$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2FAX$66);
            }
            target.set(address2Fax);
        }
    }
    
    /**
     * Unsets the "address2_fax" element
     */
    public void unsetAddress2Fax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2FAX$66, 0);
        }
    }
    
    /**
     * Gets the "address2_freighttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAddress2Freighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2FREIGHTTERMSCODE$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address2_freighttermscode" element
     */
    public boolean isSetAddress2Freighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2FREIGHTTERMSCODE$68) != 0;
        }
    }
    
    /**
     * Sets the "address2_freighttermscode" element
     */
    public void setAddress2Freighttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist address2Freighttermscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2FREIGHTTERMSCODE$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2FREIGHTTERMSCODE$68);
            }
            target.set(address2Freighttermscode);
        }
    }
    
    /**
     * Appends and returns a new empty "address2_freighttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress2Freighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2FREIGHTTERMSCODE$68);
            return target;
        }
    }
    
    /**
     * Unsets the "address2_freighttermscode" element
     */
    public void unsetAddress2Freighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2FREIGHTTERMSCODE$68, 0);
        }
    }
    
    /**
     * Gets the "address2_latitude" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat getAddress2Latitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LATITUDE$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address2_latitude" element
     */
    public boolean isSetAddress2Latitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2LATITUDE$70) != 0;
        }
    }
    
    /**
     * Sets the "address2_latitude" element
     */
    public void setAddress2Latitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat address2Latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LATITUDE$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LATITUDE$70);
            }
            target.set(address2Latitude);
        }
    }
    
    /**
     * Appends and returns a new empty "address2_latitude" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewAddress2Latitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LATITUDE$70);
            return target;
        }
    }
    
    /**
     * Unsets the "address2_latitude" element
     */
    public void unsetAddress2Latitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2LATITUDE$70, 0);
        }
    }
    
    /**
     * Gets the "address2_line1" element
     */
    public java.lang.String getAddress2Line1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE1$72, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_line1" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Line1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE1$72, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_line1" element
     */
    public boolean isSetAddress2Line1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2LINE1$72) != 0;
        }
    }
    
    /**
     * Sets the "address2_line1" element
     */
    public void setAddress2Line1(java.lang.String address2Line1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE1$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE1$72);
            }
            target.setStringValue(address2Line1);
        }
    }
    
    /**
     * Sets (as xml) the "address2_line1" element
     */
    public void xsetAddress2Line1(org.apache.xmlbeans.XmlString address2Line1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE1$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE1$72);
            }
            target.set(address2Line1);
        }
    }
    
    /**
     * Unsets the "address2_line1" element
     */
    public void unsetAddress2Line1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2LINE1$72, 0);
        }
    }
    
    /**
     * Gets the "address2_line2" element
     */
    public java.lang.String getAddress2Line2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE2$74, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_line2" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Line2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE2$74, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_line2" element
     */
    public boolean isSetAddress2Line2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2LINE2$74) != 0;
        }
    }
    
    /**
     * Sets the "address2_line2" element
     */
    public void setAddress2Line2(java.lang.String address2Line2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE2$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE2$74);
            }
            target.setStringValue(address2Line2);
        }
    }
    
    /**
     * Sets (as xml) the "address2_line2" element
     */
    public void xsetAddress2Line2(org.apache.xmlbeans.XmlString address2Line2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE2$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE2$74);
            }
            target.set(address2Line2);
        }
    }
    
    /**
     * Unsets the "address2_line2" element
     */
    public void unsetAddress2Line2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2LINE2$74, 0);
        }
    }
    
    /**
     * Gets the "address2_line3" element
     */
    public java.lang.String getAddress2Line3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE3$76, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_line3" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Line3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE3$76, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_line3" element
     */
    public boolean isSetAddress2Line3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2LINE3$76) != 0;
        }
    }
    
    /**
     * Sets the "address2_line3" element
     */
    public void setAddress2Line3(java.lang.String address2Line3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE3$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE3$76);
            }
            target.setStringValue(address2Line3);
        }
    }
    
    /**
     * Sets (as xml) the "address2_line3" element
     */
    public void xsetAddress2Line3(org.apache.xmlbeans.XmlString address2Line3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE3$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE3$76);
            }
            target.set(address2Line3);
        }
    }
    
    /**
     * Unsets the "address2_line3" element
     */
    public void unsetAddress2Line3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2LINE3$76, 0);
        }
    }
    
    /**
     * Gets the "address2_longitude" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat getAddress2Longitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LONGITUDE$78, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address2_longitude" element
     */
    public boolean isSetAddress2Longitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2LONGITUDE$78) != 0;
        }
    }
    
    /**
     * Sets the "address2_longitude" element
     */
    public void setAddress2Longitude(com.microsoft.schemas.crm._2006.webservices.CrmFloat address2Longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LONGITUDE$78, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LONGITUDE$78);
            }
            target.set(address2Longitude);
        }
    }
    
    /**
     * Appends and returns a new empty "address2_longitude" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewAddress2Longitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LONGITUDE$78);
            return target;
        }
    }
    
    /**
     * Unsets the "address2_longitude" element
     */
    public void unsetAddress2Longitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2LONGITUDE$78, 0);
        }
    }
    
    /**
     * Gets the "address2_name" element
     */
    public java.lang.String getAddress2Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2NAME$80, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_name" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2NAME$80, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_name" element
     */
    public boolean isSetAddress2Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2NAME$80) != 0;
        }
    }
    
    /**
     * Sets the "address2_name" element
     */
    public void setAddress2Name(java.lang.String address2Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2NAME$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2NAME$80);
            }
            target.setStringValue(address2Name);
        }
    }
    
    /**
     * Sets (as xml) the "address2_name" element
     */
    public void xsetAddress2Name(org.apache.xmlbeans.XmlString address2Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2NAME$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2NAME$80);
            }
            target.set(address2Name);
        }
    }
    
    /**
     * Unsets the "address2_name" element
     */
    public void unsetAddress2Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2NAME$80, 0);
        }
    }
    
    /**
     * Gets the "address2_postalcode" element
     */
    public java.lang.String getAddress2Postalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTALCODE$82, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_postalcode" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Postalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTALCODE$82, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_postalcode" element
     */
    public boolean isSetAddress2Postalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2POSTALCODE$82) != 0;
        }
    }
    
    /**
     * Sets the "address2_postalcode" element
     */
    public void setAddress2Postalcode(java.lang.String address2Postalcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTALCODE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2POSTALCODE$82);
            }
            target.setStringValue(address2Postalcode);
        }
    }
    
    /**
     * Sets (as xml) the "address2_postalcode" element
     */
    public void xsetAddress2Postalcode(org.apache.xmlbeans.XmlString address2Postalcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTALCODE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2POSTALCODE$82);
            }
            target.set(address2Postalcode);
        }
    }
    
    /**
     * Unsets the "address2_postalcode" element
     */
    public void unsetAddress2Postalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2POSTALCODE$82, 0);
        }
    }
    
    /**
     * Gets the "address2_postofficebox" element
     */
    public java.lang.String getAddress2Postofficebox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$84, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_postofficebox" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Postofficebox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$84, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_postofficebox" element
     */
    public boolean isSetAddress2Postofficebox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2POSTOFFICEBOX$84) != 0;
        }
    }
    
    /**
     * Sets the "address2_postofficebox" element
     */
    public void setAddress2Postofficebox(java.lang.String address2Postofficebox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2POSTOFFICEBOX$84);
            }
            target.setStringValue(address2Postofficebox);
        }
    }
    
    /**
     * Sets (as xml) the "address2_postofficebox" element
     */
    public void xsetAddress2Postofficebox(org.apache.xmlbeans.XmlString address2Postofficebox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2POSTOFFICEBOX$84);
            }
            target.set(address2Postofficebox);
        }
    }
    
    /**
     * Unsets the "address2_postofficebox" element
     */
    public void unsetAddress2Postofficebox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2POSTOFFICEBOX$84, 0);
        }
    }
    
    /**
     * Gets the "address2_primarycontactname" element
     */
    public java.lang.String getAddress2Primarycontactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2PRIMARYCONTACTNAME$86, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_primarycontactname" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Primarycontactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2PRIMARYCONTACTNAME$86, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_primarycontactname" element
     */
    public boolean isSetAddress2Primarycontactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2PRIMARYCONTACTNAME$86) != 0;
        }
    }
    
    /**
     * Sets the "address2_primarycontactname" element
     */
    public void setAddress2Primarycontactname(java.lang.String address2Primarycontactname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2PRIMARYCONTACTNAME$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2PRIMARYCONTACTNAME$86);
            }
            target.setStringValue(address2Primarycontactname);
        }
    }
    
    /**
     * Sets (as xml) the "address2_primarycontactname" element
     */
    public void xsetAddress2Primarycontactname(org.apache.xmlbeans.XmlString address2Primarycontactname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2PRIMARYCONTACTNAME$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2PRIMARYCONTACTNAME$86);
            }
            target.set(address2Primarycontactname);
        }
    }
    
    /**
     * Unsets the "address2_primarycontactname" element
     */
    public void unsetAddress2Primarycontactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2PRIMARYCONTACTNAME$86, 0);
        }
    }
    
    /**
     * Gets the "address2_shippingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAddress2Shippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2SHIPPINGMETHODCODE$88, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address2_shippingmethodcode" element
     */
    public boolean isSetAddress2Shippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2SHIPPINGMETHODCODE$88) != 0;
        }
    }
    
    /**
     * Sets the "address2_shippingmethodcode" element
     */
    public void setAddress2Shippingmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist address2Shippingmethodcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2SHIPPINGMETHODCODE$88, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2SHIPPINGMETHODCODE$88);
            }
            target.set(address2Shippingmethodcode);
        }
    }
    
    /**
     * Appends and returns a new empty "address2_shippingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAddress2Shippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2SHIPPINGMETHODCODE$88);
            return target;
        }
    }
    
    /**
     * Unsets the "address2_shippingmethodcode" element
     */
    public void unsetAddress2Shippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2SHIPPINGMETHODCODE$88, 0);
        }
    }
    
    /**
     * Gets the "address2_stateorprovince" element
     */
    public java.lang.String getAddress2Stateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2STATEORPROVINCE$90, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_stateorprovince" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Stateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2STATEORPROVINCE$90, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_stateorprovince" element
     */
    public boolean isSetAddress2Stateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2STATEORPROVINCE$90) != 0;
        }
    }
    
    /**
     * Sets the "address2_stateorprovince" element
     */
    public void setAddress2Stateorprovince(java.lang.String address2Stateorprovince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2STATEORPROVINCE$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2STATEORPROVINCE$90);
            }
            target.setStringValue(address2Stateorprovince);
        }
    }
    
    /**
     * Sets (as xml) the "address2_stateorprovince" element
     */
    public void xsetAddress2Stateorprovince(org.apache.xmlbeans.XmlString address2Stateorprovince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2STATEORPROVINCE$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2STATEORPROVINCE$90);
            }
            target.set(address2Stateorprovince);
        }
    }
    
    /**
     * Unsets the "address2_stateorprovince" element
     */
    public void unsetAddress2Stateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2STATEORPROVINCE$90, 0);
        }
    }
    
    /**
     * Gets the "address2_telephone1" element
     */
    public java.lang.String getAddress2Telephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE1$92, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_telephone1" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Telephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE1$92, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_telephone1" element
     */
    public boolean isSetAddress2Telephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2TELEPHONE1$92) != 0;
        }
    }
    
    /**
     * Sets the "address2_telephone1" element
     */
    public void setAddress2Telephone1(java.lang.String address2Telephone1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE1$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE1$92);
            }
            target.setStringValue(address2Telephone1);
        }
    }
    
    /**
     * Sets (as xml) the "address2_telephone1" element
     */
    public void xsetAddress2Telephone1(org.apache.xmlbeans.XmlString address2Telephone1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE1$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE1$92);
            }
            target.set(address2Telephone1);
        }
    }
    
    /**
     * Unsets the "address2_telephone1" element
     */
    public void unsetAddress2Telephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2TELEPHONE1$92, 0);
        }
    }
    
    /**
     * Gets the "address2_telephone2" element
     */
    public java.lang.String getAddress2Telephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE2$94, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_telephone2" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Telephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE2$94, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_telephone2" element
     */
    public boolean isSetAddress2Telephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2TELEPHONE2$94) != 0;
        }
    }
    
    /**
     * Sets the "address2_telephone2" element
     */
    public void setAddress2Telephone2(java.lang.String address2Telephone2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE2$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE2$94);
            }
            target.setStringValue(address2Telephone2);
        }
    }
    
    /**
     * Sets (as xml) the "address2_telephone2" element
     */
    public void xsetAddress2Telephone2(org.apache.xmlbeans.XmlString address2Telephone2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE2$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE2$94);
            }
            target.set(address2Telephone2);
        }
    }
    
    /**
     * Unsets the "address2_telephone2" element
     */
    public void unsetAddress2Telephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2TELEPHONE2$94, 0);
        }
    }
    
    /**
     * Gets the "address2_telephone3" element
     */
    public java.lang.String getAddress2Telephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE3$96, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_telephone3" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Telephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE3$96, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_telephone3" element
     */
    public boolean isSetAddress2Telephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2TELEPHONE3$96) != 0;
        }
    }
    
    /**
     * Sets the "address2_telephone3" element
     */
    public void setAddress2Telephone3(java.lang.String address2Telephone3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE3$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE3$96);
            }
            target.setStringValue(address2Telephone3);
        }
    }
    
    /**
     * Sets (as xml) the "address2_telephone3" element
     */
    public void xsetAddress2Telephone3(org.apache.xmlbeans.XmlString address2Telephone3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE3$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE3$96);
            }
            target.set(address2Telephone3);
        }
    }
    
    /**
     * Unsets the "address2_telephone3" element
     */
    public void unsetAddress2Telephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2TELEPHONE3$96, 0);
        }
    }
    
    /**
     * Gets the "address2_upszone" element
     */
    public java.lang.String getAddress2Upszone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2UPSZONE$98, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address2_upszone" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress2Upszone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2UPSZONE$98, 0);
            return target;
        }
    }
    
    /**
     * True if has "address2_upszone" element
     */
    public boolean isSetAddress2Upszone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2UPSZONE$98) != 0;
        }
    }
    
    /**
     * Sets the "address2_upszone" element
     */
    public void setAddress2Upszone(java.lang.String address2Upszone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2UPSZONE$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2UPSZONE$98);
            }
            target.setStringValue(address2Upszone);
        }
    }
    
    /**
     * Sets (as xml) the "address2_upszone" element
     */
    public void xsetAddress2Upszone(org.apache.xmlbeans.XmlString address2Upszone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2UPSZONE$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2UPSZONE$98);
            }
            target.set(address2Upszone);
        }
    }
    
    /**
     * Unsets the "address2_upszone" element
     */
    public void unsetAddress2Upszone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2UPSZONE$98, 0);
        }
    }
    
    /**
     * Gets the "address2_utcoffset" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getAddress2Utcoffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS2UTCOFFSET$100, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address2_utcoffset" element
     */
    public boolean isSetAddress2Utcoffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS2UTCOFFSET$100) != 0;
        }
    }
    
    /**
     * Sets the "address2_utcoffset" element
     */
    public void setAddress2Utcoffset(com.microsoft.schemas.crm._2006.webservices.CrmNumber address2Utcoffset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS2UTCOFFSET$100, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS2UTCOFFSET$100);
            }
            target.set(address2Utcoffset);
        }
    }
    
    /**
     * Appends and returns a new empty "address2_utcoffset" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAddress2Utcoffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS2UTCOFFSET$100);
            return target;
        }
    }
    
    /**
     * Unsets the "address2_utcoffset" element
     */
    public void unsetAddress2Utcoffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS2UTCOFFSET$100, 0);
        }
    }
    
    /**
     * Gets the "aging30" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING30$102, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aging30" element
     */
    public boolean isSetAging30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGING30$102) != 0;
        }
    }
    
    /**
     * Sets the "aging30" element
     */
    public void setAging30(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging30)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING30$102, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING30$102);
            }
            target.set(aging30);
        }
    }
    
    /**
     * Appends and returns a new empty "aging30" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING30$102);
            return target;
        }
    }
    
    /**
     * Unsets the "aging30" element
     */
    public void unsetAging30()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGING30$102, 0);
        }
    }
    
    /**
     * Gets the "aging30_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging30Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING30BASE$104, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aging30_base" element
     */
    public boolean isSetAging30Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGING30BASE$104) != 0;
        }
    }
    
    /**
     * Sets the "aging30_base" element
     */
    public void setAging30Base(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging30Base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING30BASE$104, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING30BASE$104);
            }
            target.set(aging30Base);
        }
    }
    
    /**
     * Appends and returns a new empty "aging30_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging30Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING30BASE$104);
            return target;
        }
    }
    
    /**
     * Unsets the "aging30_base" element
     */
    public void unsetAging30Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGING30BASE$104, 0);
        }
    }
    
    /**
     * Gets the "aging60" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING60$106, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aging60" element
     */
    public boolean isSetAging60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGING60$106) != 0;
        }
    }
    
    /**
     * Sets the "aging60" element
     */
    public void setAging60(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging60)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING60$106, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING60$106);
            }
            target.set(aging60);
        }
    }
    
    /**
     * Appends and returns a new empty "aging60" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING60$106);
            return target;
        }
    }
    
    /**
     * Unsets the "aging60" element
     */
    public void unsetAging60()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGING60$106, 0);
        }
    }
    
    /**
     * Gets the "aging60_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging60Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING60BASE$108, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aging60_base" element
     */
    public boolean isSetAging60Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGING60BASE$108) != 0;
        }
    }
    
    /**
     * Sets the "aging60_base" element
     */
    public void setAging60Base(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging60Base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING60BASE$108, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING60BASE$108);
            }
            target.set(aging60Base);
        }
    }
    
    /**
     * Appends and returns a new empty "aging60_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging60Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING60BASE$108);
            return target;
        }
    }
    
    /**
     * Unsets the "aging60_base" element
     */
    public void unsetAging60Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGING60BASE$108, 0);
        }
    }
    
    /**
     * Gets the "aging90" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging90()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING90$110, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aging90" element
     */
    public boolean isSetAging90()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGING90$110) != 0;
        }
    }
    
    /**
     * Sets the "aging90" element
     */
    public void setAging90(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging90)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING90$110, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING90$110);
            }
            target.set(aging90);
        }
    }
    
    /**
     * Appends and returns a new empty "aging90" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging90()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING90$110);
            return target;
        }
    }
    
    /**
     * Unsets the "aging90" element
     */
    public void unsetAging90()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGING90$110, 0);
        }
    }
    
    /**
     * Gets the "aging90_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAging90Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING90BASE$112, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "aging90_base" element
     */
    public boolean isSetAging90Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGING90BASE$112) != 0;
        }
    }
    
    /**
     * Sets the "aging90_base" element
     */
    public void setAging90Base(com.microsoft.schemas.crm._2006.webservices.CrmMoney aging90Base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING90BASE$112, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING90BASE$112);
            }
            target.set(aging90Base);
        }
    }
    
    /**
     * Appends and returns a new empty "aging90_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAging90Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING90BASE$112);
            return target;
        }
    }
    
    /**
     * Unsets the "aging90_base" element
     */
    public void unsetAging90Base()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGING90BASE$112, 0);
        }
    }
    
    /**
     * Gets the "businesstypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getBusinesstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(BUSINESSTYPECODE$114, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "businesstypecode" element
     */
    public boolean isSetBusinesstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSTYPECODE$114) != 0;
        }
    }
    
    /**
     * Sets the "businesstypecode" element
     */
    public void setBusinesstypecode(com.microsoft.schemas.crm._2006.webservices.Picklist businesstypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(BUSINESSTYPECODE$114, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(BUSINESSTYPECODE$114);
            }
            target.set(businesstypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "businesstypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewBusinesstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(BUSINESSTYPECODE$114);
            return target;
        }
    }
    
    /**
     * Unsets the "businesstypecode" element
     */
    public void unsetBusinesstypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSTYPECODE$114, 0);
        }
    }
    
    /**
     * Gets the "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$116, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdby" element
     */
    public boolean isSetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$116) != 0;
        }
    }
    
    /**
     * Sets the "createdby" element
     */
    public void setCreatedby(com.microsoft.schemas.crm._2006.webservices.Lookup createdby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$116, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$116);
            }
            target.set(createdby);
        }
    }
    
    /**
     * Appends and returns a new empty "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$116);
            return target;
        }
    }
    
    /**
     * Unsets the "createdby" element
     */
    public void unsetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$116, 0);
        }
    }
    
    /**
     * Gets the "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdon" element
     */
    public boolean isSetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDON$118) != 0;
        }
    }
    
    /**
     * Sets the "createdon" element
     */
    public void setCreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime createdon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$118, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$118);
            }
            target.set(createdon);
        }
    }
    
    /**
     * Appends and returns a new empty "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$118);
            return target;
        }
    }
    
    /**
     * Unsets the "createdon" element
     */
    public void unsetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDON$118, 0);
        }
    }
    
    /**
     * Gets the "creditlimit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getCreditlimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(CREDITLIMIT$120, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "creditlimit" element
     */
    public boolean isSetCreditlimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDITLIMIT$120) != 0;
        }
    }
    
    /**
     * Sets the "creditlimit" element
     */
    public void setCreditlimit(com.microsoft.schemas.crm._2006.webservices.CrmMoney creditlimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(CREDITLIMIT$120, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(CREDITLIMIT$120);
            }
            target.set(creditlimit);
        }
    }
    
    /**
     * Appends and returns a new empty "creditlimit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewCreditlimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(CREDITLIMIT$120);
            return target;
        }
    }
    
    /**
     * Unsets the "creditlimit" element
     */
    public void unsetCreditlimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDITLIMIT$120, 0);
        }
    }
    
    /**
     * Gets the "creditlimit_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getCreditlimitBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(CREDITLIMITBASE$122, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "creditlimit_base" element
     */
    public boolean isSetCreditlimitBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDITLIMITBASE$122) != 0;
        }
    }
    
    /**
     * Sets the "creditlimit_base" element
     */
    public void setCreditlimitBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney creditlimitBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(CREDITLIMITBASE$122, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(CREDITLIMITBASE$122);
            }
            target.set(creditlimitBase);
        }
    }
    
    /**
     * Appends and returns a new empty "creditlimit_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewCreditlimitBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(CREDITLIMITBASE$122);
            return target;
        }
    }
    
    /**
     * Unsets the "creditlimit_base" element
     */
    public void unsetCreditlimitBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDITLIMITBASE$122, 0);
        }
    }
    
    /**
     * Gets the "creditonhold" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCreditonhold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CREDITONHOLD$124, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "creditonhold" element
     */
    public boolean isSetCreditonhold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDITONHOLD$124) != 0;
        }
    }
    
    /**
     * Sets the "creditonhold" element
     */
    public void setCreditonhold(com.microsoft.schemas.crm._2006.webservices.CrmBoolean creditonhold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CREDITONHOLD$124, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CREDITONHOLD$124);
            }
            target.set(creditonhold);
        }
    }
    
    /**
     * Appends and returns a new empty "creditonhold" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCreditonhold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CREDITONHOLD$124);
            return target;
        }
    }
    
    /**
     * Unsets the "creditonhold" element
     */
    public void unsetCreditonhold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDITONHOLD$124, 0);
        }
    }
    
    /**
     * Gets the "customersizecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getCustomersizecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERSIZECODE$126, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customersizecode" element
     */
    public boolean isSetCustomersizecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERSIZECODE$126) != 0;
        }
    }
    
    /**
     * Sets the "customersizecode" element
     */
    public void setCustomersizecode(com.microsoft.schemas.crm._2006.webservices.Picklist customersizecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERSIZECODE$126, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERSIZECODE$126);
            }
            target.set(customersizecode);
        }
    }
    
    /**
     * Appends and returns a new empty "customersizecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewCustomersizecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERSIZECODE$126);
            return target;
        }
    }
    
    /**
     * Unsets the "customersizecode" element
     */
    public void unsetCustomersizecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERSIZECODE$126, 0);
        }
    }
    
    /**
     * Gets the "customertypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getCustomertypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERTYPECODE$128, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customertypecode" element
     */
    public boolean isSetCustomertypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERTYPECODE$128) != 0;
        }
    }
    
    /**
     * Sets the "customertypecode" element
     */
    public void setCustomertypecode(com.microsoft.schemas.crm._2006.webservices.Picklist customertypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERTYPECODE$128, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERTYPECODE$128);
            }
            target.set(customertypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "customertypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewCustomertypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERTYPECODE$128);
            return target;
        }
    }
    
    /**
     * Unsets the "customertypecode" element
     */
    public void unsetCustomertypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERTYPECODE$128, 0);
        }
    }
    
    /**
     * Gets the "defaultpricelevelid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getDefaultpricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(DEFAULTPRICELEVELID$130, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "defaultpricelevelid" element
     */
    public boolean isSetDefaultpricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTPRICELEVELID$130) != 0;
        }
    }
    
    /**
     * Sets the "defaultpricelevelid" element
     */
    public void setDefaultpricelevelid(com.microsoft.schemas.crm._2006.webservices.Lookup defaultpricelevelid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(DEFAULTPRICELEVELID$130, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(DEFAULTPRICELEVELID$130);
            }
            target.set(defaultpricelevelid);
        }
    }
    
    /**
     * Appends and returns a new empty "defaultpricelevelid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewDefaultpricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(DEFAULTPRICELEVELID$130);
            return target;
        }
    }
    
    /**
     * Unsets the "defaultpricelevelid" element
     */
    public void unsetDefaultpricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTPRICELEVELID$130, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$132, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$132, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$132) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$132, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$132);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$132, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$132);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$132, 0);
        }
    }
    
    /**
     * Gets the "donotbulkemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotbulkemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKEMAIL$134, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotbulkemail" element
     */
    public boolean isSetDonotbulkemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTBULKEMAIL$134) != 0;
        }
    }
    
    /**
     * Sets the "donotbulkemail" element
     */
    public void setDonotbulkemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotbulkemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKEMAIL$134, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKEMAIL$134);
            }
            target.set(donotbulkemail);
        }
    }
    
    /**
     * Appends and returns a new empty "donotbulkemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotbulkemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKEMAIL$134);
            return target;
        }
    }
    
    /**
     * Unsets the "donotbulkemail" element
     */
    public void unsetDonotbulkemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTBULKEMAIL$134, 0);
        }
    }
    
    /**
     * Gets the "donotbulkpostalmail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotbulkpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKPOSTALMAIL$136, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotbulkpostalmail" element
     */
    public boolean isSetDonotbulkpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTBULKPOSTALMAIL$136) != 0;
        }
    }
    
    /**
     * Sets the "donotbulkpostalmail" element
     */
    public void setDonotbulkpostalmail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotbulkpostalmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKPOSTALMAIL$136, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKPOSTALMAIL$136);
            }
            target.set(donotbulkpostalmail);
        }
    }
    
    /**
     * Appends and returns a new empty "donotbulkpostalmail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotbulkpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKPOSTALMAIL$136);
            return target;
        }
    }
    
    /**
     * Unsets the "donotbulkpostalmail" element
     */
    public void unsetDonotbulkpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTBULKPOSTALMAIL$136, 0);
        }
    }
    
    /**
     * Gets the "donotemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTEMAIL$138, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotemail" element
     */
    public boolean isSetDonotemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTEMAIL$138) != 0;
        }
    }
    
    /**
     * Sets the "donotemail" element
     */
    public void setDonotemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTEMAIL$138, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTEMAIL$138);
            }
            target.set(donotemail);
        }
    }
    
    /**
     * Appends and returns a new empty "donotemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTEMAIL$138);
            return target;
        }
    }
    
    /**
     * Unsets the "donotemail" element
     */
    public void unsetDonotemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTEMAIL$138, 0);
        }
    }
    
    /**
     * Gets the "donotfax" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotfax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTFAX$140, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotfax" element
     */
    public boolean isSetDonotfax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTFAX$140) != 0;
        }
    }
    
    /**
     * Sets the "donotfax" element
     */
    public void setDonotfax(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotfax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTFAX$140, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTFAX$140);
            }
            target.set(donotfax);
        }
    }
    
    /**
     * Appends and returns a new empty "donotfax" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotfax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTFAX$140);
            return target;
        }
    }
    
    /**
     * Unsets the "donotfax" element
     */
    public void unsetDonotfax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTFAX$140, 0);
        }
    }
    
    /**
     * Gets the "donotphone" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPHONE$142, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotphone" element
     */
    public boolean isSetDonotphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTPHONE$142) != 0;
        }
    }
    
    /**
     * Sets the "donotphone" element
     */
    public void setDonotphone(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotphone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPHONE$142, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPHONE$142);
            }
            target.set(donotphone);
        }
    }
    
    /**
     * Appends and returns a new empty "donotphone" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPHONE$142);
            return target;
        }
    }
    
    /**
     * Unsets the "donotphone" element
     */
    public void unsetDonotphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTPHONE$142, 0);
        }
    }
    
    /**
     * Gets the "donotpostalmail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPOSTALMAIL$144, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotpostalmail" element
     */
    public boolean isSetDonotpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTPOSTALMAIL$144) != 0;
        }
    }
    
    /**
     * Sets the "donotpostalmail" element
     */
    public void setDonotpostalmail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotpostalmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPOSTALMAIL$144, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPOSTALMAIL$144);
            }
            target.set(donotpostalmail);
        }
    }
    
    /**
     * Appends and returns a new empty "donotpostalmail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPOSTALMAIL$144);
            return target;
        }
    }
    
    /**
     * Unsets the "donotpostalmail" element
     */
    public void unsetDonotpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTPOSTALMAIL$144, 0);
        }
    }
    
    /**
     * Gets the "donotsendmm" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotsendmm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTSENDMM$146, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotsendmm" element
     */
    public boolean isSetDonotsendmm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTSENDMM$146) != 0;
        }
    }
    
    /**
     * Sets the "donotsendmm" element
     */
    public void setDonotsendmm(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotsendmm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTSENDMM$146, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTSENDMM$146);
            }
            target.set(donotsendmm);
        }
    }
    
    /**
     * Appends and returns a new empty "donotsendmm" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotsendmm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTSENDMM$146);
            return target;
        }
    }
    
    /**
     * Unsets the "donotsendmm" element
     */
    public void unsetDonotsendmm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTSENDMM$146, 0);
        }
    }
    
    /**
     * Gets the "emailaddress1" element
     */
    public java.lang.String getEmailaddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS1$148, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailaddress1" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailaddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS1$148, 0);
            return target;
        }
    }
    
    /**
     * True if has "emailaddress1" element
     */
    public boolean isSetEmailaddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILADDRESS1$148) != 0;
        }
    }
    
    /**
     * Sets the "emailaddress1" element
     */
    public void setEmailaddress1(java.lang.String emailaddress1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS1$148, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS1$148);
            }
            target.setStringValue(emailaddress1);
        }
    }
    
    /**
     * Sets (as xml) the "emailaddress1" element
     */
    public void xsetEmailaddress1(org.apache.xmlbeans.XmlString emailaddress1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS1$148, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS1$148);
            }
            target.set(emailaddress1);
        }
    }
    
    /**
     * Unsets the "emailaddress1" element
     */
    public void unsetEmailaddress1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILADDRESS1$148, 0);
        }
    }
    
    /**
     * Gets the "emailaddress2" element
     */
    public java.lang.String getEmailaddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS2$150, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailaddress2" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailaddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS2$150, 0);
            return target;
        }
    }
    
    /**
     * True if has "emailaddress2" element
     */
    public boolean isSetEmailaddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILADDRESS2$150) != 0;
        }
    }
    
    /**
     * Sets the "emailaddress2" element
     */
    public void setEmailaddress2(java.lang.String emailaddress2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS2$150, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS2$150);
            }
            target.setStringValue(emailaddress2);
        }
    }
    
    /**
     * Sets (as xml) the "emailaddress2" element
     */
    public void xsetEmailaddress2(org.apache.xmlbeans.XmlString emailaddress2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS2$150, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS2$150);
            }
            target.set(emailaddress2);
        }
    }
    
    /**
     * Unsets the "emailaddress2" element
     */
    public void unsetEmailaddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILADDRESS2$150, 0);
        }
    }
    
    /**
     * Gets the "emailaddress3" element
     */
    public java.lang.String getEmailaddress3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS3$152, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailaddress3" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailaddress3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS3$152, 0);
            return target;
        }
    }
    
    /**
     * True if has "emailaddress3" element
     */
    public boolean isSetEmailaddress3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILADDRESS3$152) != 0;
        }
    }
    
    /**
     * Sets the "emailaddress3" element
     */
    public void setEmailaddress3(java.lang.String emailaddress3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS3$152, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS3$152);
            }
            target.setStringValue(emailaddress3);
        }
    }
    
    /**
     * Sets (as xml) the "emailaddress3" element
     */
    public void xsetEmailaddress3(org.apache.xmlbeans.XmlString emailaddress3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS3$152, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS3$152);
            }
            target.set(emailaddress3);
        }
    }
    
    /**
     * Unsets the "emailaddress3" element
     */
    public void unsetEmailaddress3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILADDRESS3$152, 0);
        }
    }
    
    /**
     * Gets the "exchangerate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getExchangerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$154, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exchangerate" element
     */
    public boolean isSetExchangerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCHANGERATE$154) != 0;
        }
    }
    
    /**
     * Sets the "exchangerate" element
     */
    public void setExchangerate(com.microsoft.schemas.crm._2006.webservices.CrmDecimal exchangerate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$154, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$154);
            }
            target.set(exchangerate);
        }
    }
    
    /**
     * Appends and returns a new empty "exchangerate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewExchangerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$154);
            return target;
        }
    }
    
    /**
     * Unsets the "exchangerate" element
     */
    public void unsetExchangerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCHANGERATE$154, 0);
        }
    }
    
    /**
     * Gets the "fax" element
     */
    public java.lang.String getFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$156, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fax" element
     */
    public org.apache.xmlbeans.XmlString xgetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$156, 0);
            return target;
        }
    }
    
    /**
     * True if has "fax" element
     */
    public boolean isSetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAX$156) != 0;
        }
    }
    
    /**
     * Sets the "fax" element
     */
    public void setFax(java.lang.String fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$156, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$156);
            }
            target.setStringValue(fax);
        }
    }
    
    /**
     * Sets (as xml) the "fax" element
     */
    public void xsetFax(org.apache.xmlbeans.XmlString fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$156, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$156);
            }
            target.set(fax);
        }
    }
    
    /**
     * Unsets the "fax" element
     */
    public void unsetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAX$156, 0);
        }
    }
    
    /**
     * Gets the "ftpsiteurl" element
     */
    public java.lang.String getFtpsiteurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTPSITEURL$158, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ftpsiteurl" element
     */
    public org.apache.xmlbeans.XmlString xgetFtpsiteurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FTPSITEURL$158, 0);
            return target;
        }
    }
    
    /**
     * True if has "ftpsiteurl" element
     */
    public boolean isSetFtpsiteurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FTPSITEURL$158) != 0;
        }
    }
    
    /**
     * Sets the "ftpsiteurl" element
     */
    public void setFtpsiteurl(java.lang.String ftpsiteurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTPSITEURL$158, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FTPSITEURL$158);
            }
            target.setStringValue(ftpsiteurl);
        }
    }
    
    /**
     * Sets (as xml) the "ftpsiteurl" element
     */
    public void xsetFtpsiteurl(org.apache.xmlbeans.XmlString ftpsiteurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FTPSITEURL$158, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FTPSITEURL$158);
            }
            target.set(ftpsiteurl);
        }
    }
    
    /**
     * Unsets the "ftpsiteurl" element
     */
    public void unsetFtpsiteurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FTPSITEURL$158, 0);
        }
    }
    
    /**
     * Gets the "importsequencenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getImportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$160, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "importsequencenumber" element
     */
    public boolean isSetImportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTSEQUENCENUMBER$160) != 0;
        }
    }
    
    /**
     * Sets the "importsequencenumber" element
     */
    public void setImportsequencenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber importsequencenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$160, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$160);
            }
            target.set(importsequencenumber);
        }
    }
    
    /**
     * Appends and returns a new empty "importsequencenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewImportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$160);
            return target;
        }
    }
    
    /**
     * Unsets the "importsequencenumber" element
     */
    public void unsetImportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTSEQUENCENUMBER$160, 0);
        }
    }
    
    /**
     * Gets the "industrycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getIndustrycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INDUSTRYCODE$162, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "industrycode" element
     */
    public boolean isSetIndustrycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDUSTRYCODE$162) != 0;
        }
    }
    
    /**
     * Sets the "industrycode" element
     */
    public void setIndustrycode(com.microsoft.schemas.crm._2006.webservices.Picklist industrycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INDUSTRYCODE$162, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INDUSTRYCODE$162);
            }
            target.set(industrycode);
        }
    }
    
    /**
     * Appends and returns a new empty "industrycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewIndustrycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INDUSTRYCODE$162);
            return target;
        }
    }
    
    /**
     * Unsets the "industrycode" element
     */
    public void unsetIndustrycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDUSTRYCODE$162, 0);
        }
    }
    
    /**
     * Gets the "lastusedincampaign" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getLastusedincampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTUSEDINCAMPAIGN$164, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lastusedincampaign" element
     */
    public boolean isSetLastusedincampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTUSEDINCAMPAIGN$164) != 0;
        }
    }
    
    /**
     * Sets the "lastusedincampaign" element
     */
    public void setLastusedincampaign(com.microsoft.schemas.crm._2006.webservices.CrmDateTime lastusedincampaign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTUSEDINCAMPAIGN$164, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTUSEDINCAMPAIGN$164);
            }
            target.set(lastusedincampaign);
        }
    }
    
    /**
     * Appends and returns a new empty "lastusedincampaign" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewLastusedincampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTUSEDINCAMPAIGN$164);
            return target;
        }
    }
    
    /**
     * Unsets the "lastusedincampaign" element
     */
    public void unsetLastusedincampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTUSEDINCAMPAIGN$164, 0);
        }
    }
    
    /**
     * Gets the "marketcap" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getMarketcap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MARKETCAP$166, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "marketcap" element
     */
    public boolean isSetMarketcap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARKETCAP$166) != 0;
        }
    }
    
    /**
     * Sets the "marketcap" element
     */
    public void setMarketcap(com.microsoft.schemas.crm._2006.webservices.CrmMoney marketcap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MARKETCAP$166, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MARKETCAP$166);
            }
            target.set(marketcap);
        }
    }
    
    /**
     * Appends and returns a new empty "marketcap" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewMarketcap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MARKETCAP$166);
            return target;
        }
    }
    
    /**
     * Unsets the "marketcap" element
     */
    public void unsetMarketcap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARKETCAP$166, 0);
        }
    }
    
    /**
     * Gets the "marketcap_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getMarketcapBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MARKETCAPBASE$168, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "marketcap_base" element
     */
    public boolean isSetMarketcapBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARKETCAPBASE$168) != 0;
        }
    }
    
    /**
     * Sets the "marketcap_base" element
     */
    public void setMarketcapBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney marketcapBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MARKETCAPBASE$168, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MARKETCAPBASE$168);
            }
            target.set(marketcapBase);
        }
    }
    
    /**
     * Appends and returns a new empty "marketcap_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewMarketcapBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MARKETCAPBASE$168);
            return target;
        }
    }
    
    /**
     * Unsets the "marketcap_base" element
     */
    public void unsetMarketcapBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARKETCAPBASE$168, 0);
        }
    }
    
    /**
     * Gets the "masterid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getMasterid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MASTERID$170, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "masterid" element
     */
    public boolean isSetMasterid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MASTERID$170) != 0;
        }
    }
    
    /**
     * Sets the "masterid" element
     */
    public void setMasterid(com.microsoft.schemas.crm._2006.webservices.Lookup masterid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MASTERID$170, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MASTERID$170);
            }
            target.set(masterid);
        }
    }
    
    /**
     * Appends and returns a new empty "masterid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewMasterid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MASTERID$170);
            return target;
        }
    }
    
    /**
     * Unsets the "masterid" element
     */
    public void unsetMasterid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MASTERID$170, 0);
        }
    }
    
    /**
     * Gets the "merged" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getMerged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(MERGED$172, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "merged" element
     */
    public boolean isSetMerged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MERGED$172) != 0;
        }
    }
    
    /**
     * Sets the "merged" element
     */
    public void setMerged(com.microsoft.schemas.crm._2006.webservices.CrmBoolean merged)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(MERGED$172, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(MERGED$172);
            }
            target.set(merged);
        }
    }
    
    /**
     * Appends and returns a new empty "merged" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewMerged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(MERGED$172);
            return target;
        }
    }
    
    /**
     * Unsets the "merged" element
     */
    public void unsetMerged()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MERGED$172, 0);
        }
    }
    
    /**
     * Gets the "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$174, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedby" element
     */
    public boolean isSetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDBY$174) != 0;
        }
    }
    
    /**
     * Sets the "modifiedby" element
     */
    public void setModifiedby(com.microsoft.schemas.crm._2006.webservices.Lookup modifiedby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$174, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$174);
            }
            target.set(modifiedby);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$174);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedby" element
     */
    public void unsetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDBY$174, 0);
        }
    }
    
    /**
     * Gets the "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$176, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedon" element
     */
    public boolean isSetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDON$176) != 0;
        }
    }
    
    /**
     * Sets the "modifiedon" element
     */
    public void setModifiedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime modifiedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$176, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$176);
            }
            target.set(modifiedon);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$176);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedon" element
     */
    public void unsetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDON$176, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$178, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$178, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$178) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$178, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$178);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$178, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$178);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$178, 0);
        }
    }
    
    /**
     * Gets the "numberofemployees" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getNumberofemployees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NUMBEROFEMPLOYEES$180, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numberofemployees" element
     */
    public boolean isSetNumberofemployees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFEMPLOYEES$180) != 0;
        }
    }
    
    /**
     * Sets the "numberofemployees" element
     */
    public void setNumberofemployees(com.microsoft.schemas.crm._2006.webservices.CrmNumber numberofemployees)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NUMBEROFEMPLOYEES$180, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NUMBEROFEMPLOYEES$180);
            }
            target.set(numberofemployees);
        }
    }
    
    /**
     * Appends and returns a new empty "numberofemployees" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNumberofemployees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NUMBEROFEMPLOYEES$180);
            return target;
        }
    }
    
    /**
     * Unsets the "numberofemployees" element
     */
    public void unsetNumberofemployees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFEMPLOYEES$180, 0);
        }
    }
    
    /**
     * Gets the "originatingleadid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOriginatingleadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORIGINATINGLEADID$182, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originatingleadid" element
     */
    public boolean isSetOriginatingleadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINATINGLEADID$182) != 0;
        }
    }
    
    /**
     * Sets the "originatingleadid" element
     */
    public void setOriginatingleadid(com.microsoft.schemas.crm._2006.webservices.Lookup originatingleadid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORIGINATINGLEADID$182, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORIGINATINGLEADID$182);
            }
            target.set(originatingleadid);
        }
    }
    
    /**
     * Appends and returns a new empty "originatingleadid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOriginatingleadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORIGINATINGLEADID$182);
            return target;
        }
    }
    
    /**
     * Unsets the "originatingleadid" element
     */
    public void unsetOriginatingleadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINATINGLEADID$182, 0);
        }
    }
    
    /**
     * Gets the "overriddencreatedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getOverriddencreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$184, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "overriddencreatedon" element
     */
    public boolean isSetOverriddencreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERRIDDENCREATEDON$184) != 0;
        }
    }
    
    /**
     * Sets the "overriddencreatedon" element
     */
    public void setOverriddencreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime overriddencreatedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$184, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$184);
            }
            target.set(overriddencreatedon);
        }
    }
    
    /**
     * Appends and returns a new empty "overriddencreatedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewOverriddencreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$184);
            return target;
        }
    }
    
    /**
     * Unsets the "overriddencreatedon" element
     */
    public void unsetOverriddencreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERRIDDENCREATEDON$184, 0);
        }
    }
    
    /**
     * Gets the "ownerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Owner getOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Owner target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$186, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ownerid" element
     */
    public boolean isSetOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERID$186) != 0;
        }
    }
    
    /**
     * Sets the "ownerid" element
     */
    public void setOwnerid(com.microsoft.schemas.crm._2006.webservices.Owner ownerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Owner target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$186, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$186);
            }
            target.set(ownerid);
        }
    }
    
    /**
     * Appends and returns a new empty "ownerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Owner addNewOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Owner target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$186);
            return target;
        }
    }
    
    /**
     * Unsets the "ownerid" element
     */
    public void unsetOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERID$186, 0);
        }
    }
    
    /**
     * Gets the "ownershipcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getOwnershipcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OWNERSHIPCODE$188, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ownershipcode" element
     */
    public boolean isSetOwnershipcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERSHIPCODE$188) != 0;
        }
    }
    
    /**
     * Sets the "ownershipcode" element
     */
    public void setOwnershipcode(com.microsoft.schemas.crm._2006.webservices.Picklist ownershipcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OWNERSHIPCODE$188, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OWNERSHIPCODE$188);
            }
            target.set(ownershipcode);
        }
    }
    
    /**
     * Appends and returns a new empty "ownershipcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewOwnershipcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OWNERSHIPCODE$188);
            return target;
        }
    }
    
    /**
     * Unsets the "ownershipcode" element
     */
    public void unsetOwnershipcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERSHIPCODE$188, 0);
        }
    }
    
    /**
     * Gets the "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$190, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owningbusinessunit" element
     */
    public boolean isSetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGBUSINESSUNIT$190) != 0;
        }
    }
    
    /**
     * Sets the "owningbusinessunit" element
     */
    public void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.Lookup owningbusinessunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$190, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$190);
            }
            target.set(owningbusinessunit);
        }
    }
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$190);
            return target;
        }
    }
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    public void unsetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGBUSINESSUNIT$190, 0);
        }
    }
    
    /**
     * Gets the "parentaccountid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getParentaccountid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTACCOUNTID$192, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parentaccountid" element
     */
    public boolean isSetParentaccountid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTACCOUNTID$192) != 0;
        }
    }
    
    /**
     * Sets the "parentaccountid" element
     */
    public void setParentaccountid(com.microsoft.schemas.crm._2006.webservices.Lookup parentaccountid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTACCOUNTID$192, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTACCOUNTID$192);
            }
            target.set(parentaccountid);
        }
    }
    
    /**
     * Appends and returns a new empty "parentaccountid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentaccountid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTACCOUNTID$192);
            return target;
        }
    }
    
    /**
     * Unsets the "parentaccountid" element
     */
    public void unsetParentaccountid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTACCOUNTID$192, 0);
        }
    }
    
    /**
     * Gets the "participatesinworkflow" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getParticipatesinworkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(PARTICIPATESINWORKFLOW$194, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "participatesinworkflow" element
     */
    public boolean isSetParticipatesinworkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPATESINWORKFLOW$194) != 0;
        }
    }
    
    /**
     * Sets the "participatesinworkflow" element
     */
    public void setParticipatesinworkflow(com.microsoft.schemas.crm._2006.webservices.CrmBoolean participatesinworkflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(PARTICIPATESINWORKFLOW$194, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(PARTICIPATESINWORKFLOW$194);
            }
            target.set(participatesinworkflow);
        }
    }
    
    /**
     * Appends and returns a new empty "participatesinworkflow" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewParticipatesinworkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(PARTICIPATESINWORKFLOW$194);
            return target;
        }
    }
    
    /**
     * Unsets the "participatesinworkflow" element
     */
    public void unsetParticipatesinworkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPATESINWORKFLOW$194, 0);
        }
    }
    
    /**
     * Gets the "paymenttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPaymenttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PAYMENTTERMSCODE$196, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "paymenttermscode" element
     */
    public boolean isSetPaymenttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTTERMSCODE$196) != 0;
        }
    }
    
    /**
     * Sets the "paymenttermscode" element
     */
    public void setPaymenttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist paymenttermscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PAYMENTTERMSCODE$196, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PAYMENTTERMSCODE$196);
            }
            target.set(paymenttermscode);
        }
    }
    
    /**
     * Appends and returns a new empty "paymenttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPaymenttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PAYMENTTERMSCODE$196);
            return target;
        }
    }
    
    /**
     * Unsets the "paymenttermscode" element
     */
    public void unsetPaymenttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTTERMSCODE$196, 0);
        }
    }
    
    /**
     * Gets the "preferredappointmentdaycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPreferredappointmentdaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDAPPOINTMENTDAYCODE$198, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredappointmentdaycode" element
     */
    public boolean isSetPreferredappointmentdaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDAPPOINTMENTDAYCODE$198) != 0;
        }
    }
    
    /**
     * Sets the "preferredappointmentdaycode" element
     */
    public void setPreferredappointmentdaycode(com.microsoft.schemas.crm._2006.webservices.Picklist preferredappointmentdaycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDAPPOINTMENTDAYCODE$198, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDAPPOINTMENTDAYCODE$198);
            }
            target.set(preferredappointmentdaycode);
        }
    }
    
    /**
     * Appends and returns a new empty "preferredappointmentdaycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPreferredappointmentdaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDAPPOINTMENTDAYCODE$198);
            return target;
        }
    }
    
    /**
     * Unsets the "preferredappointmentdaycode" element
     */
    public void unsetPreferredappointmentdaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDAPPOINTMENTDAYCODE$198, 0);
        }
    }
    
    /**
     * Gets the "preferredappointmenttimecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPreferredappointmenttimecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDAPPOINTMENTTIMECODE$200, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredappointmenttimecode" element
     */
    public boolean isSetPreferredappointmenttimecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDAPPOINTMENTTIMECODE$200) != 0;
        }
    }
    
    /**
     * Sets the "preferredappointmenttimecode" element
     */
    public void setPreferredappointmenttimecode(com.microsoft.schemas.crm._2006.webservices.Picklist preferredappointmenttimecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDAPPOINTMENTTIMECODE$200, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDAPPOINTMENTTIMECODE$200);
            }
            target.set(preferredappointmenttimecode);
        }
    }
    
    /**
     * Appends and returns a new empty "preferredappointmenttimecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPreferredappointmenttimecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDAPPOINTMENTTIMECODE$200);
            return target;
        }
    }
    
    /**
     * Unsets the "preferredappointmenttimecode" element
     */
    public void unsetPreferredappointmenttimecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDAPPOINTMENTTIMECODE$200, 0);
        }
    }
    
    /**
     * Gets the "preferredcontactmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPreferredcontactmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDCONTACTMETHODCODE$202, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredcontactmethodcode" element
     */
    public boolean isSetPreferredcontactmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDCONTACTMETHODCODE$202) != 0;
        }
    }
    
    /**
     * Sets the "preferredcontactmethodcode" element
     */
    public void setPreferredcontactmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist preferredcontactmethodcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDCONTACTMETHODCODE$202, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDCONTACTMETHODCODE$202);
            }
            target.set(preferredcontactmethodcode);
        }
    }
    
    /**
     * Appends and returns a new empty "preferredcontactmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPreferredcontactmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDCONTACTMETHODCODE$202);
            return target;
        }
    }
    
    /**
     * Unsets the "preferredcontactmethodcode" element
     */
    public void unsetPreferredcontactmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDCONTACTMETHODCODE$202, 0);
        }
    }
    
    /**
     * Gets the "preferredequipmentid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getPreferredequipmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDEQUIPMENTID$204, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredequipmentid" element
     */
    public boolean isSetPreferredequipmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDEQUIPMENTID$204) != 0;
        }
    }
    
    /**
     * Sets the "preferredequipmentid" element
     */
    public void setPreferredequipmentid(com.microsoft.schemas.crm._2006.webservices.Lookup preferredequipmentid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDEQUIPMENTID$204, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDEQUIPMENTID$204);
            }
            target.set(preferredequipmentid);
        }
    }
    
    /**
     * Appends and returns a new empty "preferredequipmentid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewPreferredequipmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDEQUIPMENTID$204);
            return target;
        }
    }
    
    /**
     * Unsets the "preferredequipmentid" element
     */
    public void unsetPreferredequipmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDEQUIPMENTID$204, 0);
        }
    }
    
    /**
     * Gets the "preferredserviceid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getPreferredserviceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDSERVICEID$206, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredserviceid" element
     */
    public boolean isSetPreferredserviceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDSERVICEID$206) != 0;
        }
    }
    
    /**
     * Sets the "preferredserviceid" element
     */
    public void setPreferredserviceid(com.microsoft.schemas.crm._2006.webservices.Lookup preferredserviceid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDSERVICEID$206, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDSERVICEID$206);
            }
            target.set(preferredserviceid);
        }
    }
    
    /**
     * Appends and returns a new empty "preferredserviceid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewPreferredserviceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDSERVICEID$206);
            return target;
        }
    }
    
    /**
     * Unsets the "preferredserviceid" element
     */
    public void unsetPreferredserviceid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDSERVICEID$206, 0);
        }
    }
    
    /**
     * Gets the "preferredsystemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getPreferredsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDSYSTEMUSERID$208, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredsystemuserid" element
     */
    public boolean isSetPreferredsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDSYSTEMUSERID$208) != 0;
        }
    }
    
    /**
     * Sets the "preferredsystemuserid" element
     */
    public void setPreferredsystemuserid(com.microsoft.schemas.crm._2006.webservices.Lookup preferredsystemuserid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDSYSTEMUSERID$208, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDSYSTEMUSERID$208);
            }
            target.set(preferredsystemuserid);
        }
    }
    
    /**
     * Appends and returns a new empty "preferredsystemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewPreferredsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDSYSTEMUSERID$208);
            return target;
        }
    }
    
    /**
     * Unsets the "preferredsystemuserid" element
     */
    public void unsetPreferredsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDSYSTEMUSERID$208, 0);
        }
    }
    
    /**
     * Gets the "primarycontactid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getPrimarycontactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRIMARYCONTACTID$210, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "primarycontactid" element
     */
    public boolean isSetPrimarycontactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYCONTACTID$210) != 0;
        }
    }
    
    /**
     * Sets the "primarycontactid" element
     */
    public void setPrimarycontactid(com.microsoft.schemas.crm._2006.webservices.Lookup primarycontactid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRIMARYCONTACTID$210, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRIMARYCONTACTID$210);
            }
            target.set(primarycontactid);
        }
    }
    
    /**
     * Appends and returns a new empty "primarycontactid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewPrimarycontactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRIMARYCONTACTID$210);
            return target;
        }
    }
    
    /**
     * Unsets the "primarycontactid" element
     */
    public void unsetPrimarycontactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYCONTACTID$210, 0);
        }
    }
    
    /**
     * Gets the "revenue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getRevenue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(REVENUE$212, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "revenue" element
     */
    public boolean isSetRevenue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVENUE$212) != 0;
        }
    }
    
    /**
     * Sets the "revenue" element
     */
    public void setRevenue(com.microsoft.schemas.crm._2006.webservices.CrmMoney revenue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(REVENUE$212, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(REVENUE$212);
            }
            target.set(revenue);
        }
    }
    
    /**
     * Appends and returns a new empty "revenue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRevenue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(REVENUE$212);
            return target;
        }
    }
    
    /**
     * Unsets the "revenue" element
     */
    public void unsetRevenue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVENUE$212, 0);
        }
    }
    
    /**
     * Gets the "revenue_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getRevenueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(REVENUEBASE$214, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "revenue_base" element
     */
    public boolean isSetRevenueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVENUEBASE$214) != 0;
        }
    }
    
    /**
     * Sets the "revenue_base" element
     */
    public void setRevenueBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney revenueBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(REVENUEBASE$214, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(REVENUEBASE$214);
            }
            target.set(revenueBase);
        }
    }
    
    /**
     * Appends and returns a new empty "revenue_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRevenueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(REVENUEBASE$214);
            return target;
        }
    }
    
    /**
     * Unsets the "revenue_base" element
     */
    public void unsetRevenueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVENUEBASE$214, 0);
        }
    }
    
    /**
     * Gets the "sharesoutstanding" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSharesoutstanding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SHARESOUTSTANDING$216, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sharesoutstanding" element
     */
    public boolean isSetSharesoutstanding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHARESOUTSTANDING$216) != 0;
        }
    }
    
    /**
     * Sets the "sharesoutstanding" element
     */
    public void setSharesoutstanding(com.microsoft.schemas.crm._2006.webservices.CrmNumber sharesoutstanding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SHARESOUTSTANDING$216, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SHARESOUTSTANDING$216);
            }
            target.set(sharesoutstanding);
        }
    }
    
    /**
     * Appends and returns a new empty "sharesoutstanding" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSharesoutstanding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SHARESOUTSTANDING$216);
            return target;
        }
    }
    
    /**
     * Unsets the "sharesoutstanding" element
     */
    public void unsetSharesoutstanding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHARESOUTSTANDING$216, 0);
        }
    }
    
    /**
     * Gets the "shippingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getShippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPPINGMETHODCODE$218, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shippingmethodcode" element
     */
    public boolean isSetShippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGMETHODCODE$218) != 0;
        }
    }
    
    /**
     * Sets the "shippingmethodcode" element
     */
    public void setShippingmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist shippingmethodcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPPINGMETHODCODE$218, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPPINGMETHODCODE$218);
            }
            target.set(shippingmethodcode);
        }
    }
    
    /**
     * Appends and returns a new empty "shippingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewShippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPPINGMETHODCODE$218);
            return target;
        }
    }
    
    /**
     * Unsets the "shippingmethodcode" element
     */
    public void unsetShippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGMETHODCODE$218, 0);
        }
    }
    
    /**
     * Gets the "sic" element
     */
    public java.lang.String getSic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIC$220, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sic" element
     */
    public org.apache.xmlbeans.XmlString xgetSic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIC$220, 0);
            return target;
        }
    }
    
    /**
     * True if has "sic" element
     */
    public boolean isSetSic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIC$220) != 0;
        }
    }
    
    /**
     * Sets the "sic" element
     */
    public void setSic(java.lang.String sic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIC$220, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIC$220);
            }
            target.setStringValue(sic);
        }
    }
    
    /**
     * Sets (as xml) the "sic" element
     */
    public void xsetSic(org.apache.xmlbeans.XmlString sic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIC$220, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIC$220);
            }
            target.set(sic);
        }
    }
    
    /**
     * Unsets the "sic" element
     */
    public void unsetSic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIC$220, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.AccountStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.AccountStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.AccountStateInfo)get_store().find_element_user(STATECODE$222, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statecode" element
     */
    public boolean isSetStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATECODE$222) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.AccountStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.AccountStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.AccountStateInfo)get_store().find_element_user(STATECODE$222, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.AccountStateInfo)get_store().add_element_user(STATECODE$222);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.AccountStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.AccountStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.AccountStateInfo)get_store().add_element_user(STATECODE$222);
            return target;
        }
    }
    
    /**
     * Unsets the "statecode" element
     */
    public void unsetStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATECODE$222, 0);
        }
    }
    
    /**
     * Gets the "statuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Status getStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Status target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$224, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statuscode" element
     */
    public boolean isSetStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSCODE$224) != 0;
        }
    }
    
    /**
     * Sets the "statuscode" element
     */
    public void setStatuscode(com.microsoft.schemas.crm._2006.webservices.Status statuscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Status target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$224, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$224);
            }
            target.set(statuscode);
        }
    }
    
    /**
     * Appends and returns a new empty "statuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Status addNewStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Status target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$224);
            return target;
        }
    }
    
    /**
     * Unsets the "statuscode" element
     */
    public void unsetStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSCODE$224, 0);
        }
    }
    
    /**
     * Gets the "stockexchange" element
     */
    public java.lang.String getStockexchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCKEXCHANGE$226, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stockexchange" element
     */
    public org.apache.xmlbeans.XmlString xgetStockexchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STOCKEXCHANGE$226, 0);
            return target;
        }
    }
    
    /**
     * True if has "stockexchange" element
     */
    public boolean isSetStockexchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOCKEXCHANGE$226) != 0;
        }
    }
    
    /**
     * Sets the "stockexchange" element
     */
    public void setStockexchange(java.lang.String stockexchange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STOCKEXCHANGE$226, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STOCKEXCHANGE$226);
            }
            target.setStringValue(stockexchange);
        }
    }
    
    /**
     * Sets (as xml) the "stockexchange" element
     */
    public void xsetStockexchange(org.apache.xmlbeans.XmlString stockexchange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STOCKEXCHANGE$226, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STOCKEXCHANGE$226);
            }
            target.set(stockexchange);
        }
    }
    
    /**
     * Unsets the "stockexchange" element
     */
    public void unsetStockexchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOCKEXCHANGE$226, 0);
        }
    }
    
    /**
     * Gets the "telephone1" element
     */
    public java.lang.String getTelephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$228, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "telephone1" element
     */
    public org.apache.xmlbeans.XmlString xgetTelephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$228, 0);
            return target;
        }
    }
    
    /**
     * True if has "telephone1" element
     */
    public boolean isSetTelephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONE1$228) != 0;
        }
    }
    
    /**
     * Sets the "telephone1" element
     */
    public void setTelephone1(java.lang.String telephone1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$228, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE1$228);
            }
            target.setStringValue(telephone1);
        }
    }
    
    /**
     * Sets (as xml) the "telephone1" element
     */
    public void xsetTelephone1(org.apache.xmlbeans.XmlString telephone1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$228, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE1$228);
            }
            target.set(telephone1);
        }
    }
    
    /**
     * Unsets the "telephone1" element
     */
    public void unsetTelephone1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONE1$228, 0);
        }
    }
    
    /**
     * Gets the "telephone2" element
     */
    public java.lang.String getTelephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$230, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "telephone2" element
     */
    public org.apache.xmlbeans.XmlString xgetTelephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$230, 0);
            return target;
        }
    }
    
    /**
     * True if has "telephone2" element
     */
    public boolean isSetTelephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONE2$230) != 0;
        }
    }
    
    /**
     * Sets the "telephone2" element
     */
    public void setTelephone2(java.lang.String telephone2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$230, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE2$230);
            }
            target.setStringValue(telephone2);
        }
    }
    
    /**
     * Sets (as xml) the "telephone2" element
     */
    public void xsetTelephone2(org.apache.xmlbeans.XmlString telephone2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$230, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE2$230);
            }
            target.set(telephone2);
        }
    }
    
    /**
     * Unsets the "telephone2" element
     */
    public void unsetTelephone2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONE2$230, 0);
        }
    }
    
    /**
     * Gets the "telephone3" element
     */
    public java.lang.String getTelephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$232, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "telephone3" element
     */
    public org.apache.xmlbeans.XmlString xgetTelephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$232, 0);
            return target;
        }
    }
    
    /**
     * True if has "telephone3" element
     */
    public boolean isSetTelephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONE3$232) != 0;
        }
    }
    
    /**
     * Sets the "telephone3" element
     */
    public void setTelephone3(java.lang.String telephone3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$232, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE3$232);
            }
            target.setStringValue(telephone3);
        }
    }
    
    /**
     * Sets (as xml) the "telephone3" element
     */
    public void xsetTelephone3(org.apache.xmlbeans.XmlString telephone3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$232, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE3$232);
            }
            target.set(telephone3);
        }
    }
    
    /**
     * Unsets the "telephone3" element
     */
    public void unsetTelephone3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONE3$232, 0);
        }
    }
    
    /**
     * Gets the "territorycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getTerritorycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TERRITORYCODE$234, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "territorycode" element
     */
    public boolean isSetTerritorycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERRITORYCODE$234) != 0;
        }
    }
    
    /**
     * Sets the "territorycode" element
     */
    public void setTerritorycode(com.microsoft.schemas.crm._2006.webservices.Picklist territorycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TERRITORYCODE$234, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TERRITORYCODE$234);
            }
            target.set(territorycode);
        }
    }
    
    /**
     * Appends and returns a new empty "territorycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewTerritorycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TERRITORYCODE$234);
            return target;
        }
    }
    
    /**
     * Unsets the "territorycode" element
     */
    public void unsetTerritorycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERRITORYCODE$234, 0);
        }
    }
    
    /**
     * Gets the "territoryid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getTerritoryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TERRITORYID$236, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "territoryid" element
     */
    public boolean isSetTerritoryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERRITORYID$236) != 0;
        }
    }
    
    /**
     * Sets the "territoryid" element
     */
    public void setTerritoryid(com.microsoft.schemas.crm._2006.webservices.Lookup territoryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TERRITORYID$236, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TERRITORYID$236);
            }
            target.set(territoryid);
        }
    }
    
    /**
     * Appends and returns a new empty "territoryid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewTerritoryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TERRITORYID$236);
            return target;
        }
    }
    
    /**
     * Unsets the "territoryid" element
     */
    public void unsetTerritoryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERRITORYID$236, 0);
        }
    }
    
    /**
     * Gets the "tickersymbol" element
     */
    public java.lang.String getTickersymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKERSYMBOL$238, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tickersymbol" element
     */
    public org.apache.xmlbeans.XmlString xgetTickersymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TICKERSYMBOL$238, 0);
            return target;
        }
    }
    
    /**
     * True if has "tickersymbol" element
     */
    public boolean isSetTickersymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TICKERSYMBOL$238) != 0;
        }
    }
    
    /**
     * Sets the "tickersymbol" element
     */
    public void setTickersymbol(java.lang.String tickersymbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKERSYMBOL$238, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TICKERSYMBOL$238);
            }
            target.setStringValue(tickersymbol);
        }
    }
    
    /**
     * Sets (as xml) the "tickersymbol" element
     */
    public void xsetTickersymbol(org.apache.xmlbeans.XmlString tickersymbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TICKERSYMBOL$238, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TICKERSYMBOL$238);
            }
            target.set(tickersymbol);
        }
    }
    
    /**
     * Unsets the "tickersymbol" element
     */
    public void unsetTickersymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TICKERSYMBOL$238, 0);
        }
    }
    
    /**
     * Gets the "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$240, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezoneruleversionnumber" element
     */
    public boolean isSetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$240) != 0;
        }
    }
    
    /**
     * Sets the "timezoneruleversionnumber" element
     */
    public void setTimezoneruleversionnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezoneruleversionnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$240, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$240);
            }
            target.set(timezoneruleversionnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$240);
            return target;
        }
    }
    
    /**
     * Unsets the "timezoneruleversionnumber" element
     */
    public void unsetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$240, 0);
        }
    }
    
    /**
     * Gets the "transactioncurrencyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getTransactioncurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$242, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transactioncurrencyid" element
     */
    public boolean isSetTransactioncurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONCURRENCYID$242) != 0;
        }
    }
    
    /**
     * Sets the "transactioncurrencyid" element
     */
    public void setTransactioncurrencyid(com.microsoft.schemas.crm._2006.webservices.Lookup transactioncurrencyid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$242, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$242);
            }
            target.set(transactioncurrencyid);
        }
    }
    
    /**
     * Appends and returns a new empty "transactioncurrencyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewTransactioncurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$242);
            return target;
        }
    }
    
    /**
     * Unsets the "transactioncurrencyid" element
     */
    public void unsetTransactioncurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONCURRENCYID$242, 0);
        }
    }
    
    /**
     * Gets the "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$244, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "utcconversiontimezonecode" element
     */
    public boolean isSetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$244) != 0;
        }
    }
    
    /**
     * Sets the "utcconversiontimezonecode" element
     */
    public void setUtcconversiontimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber utcconversiontimezonecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$244, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$244);
            }
            target.set(utcconversiontimezonecode);
        }
    }
    
    /**
     * Appends and returns a new empty "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$244);
            return target;
        }
    }
    
    /**
     * Unsets the "utcconversiontimezonecode" element
     */
    public void unsetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$244, 0);
        }
    }
    
    /**
     * Gets the "websiteurl" element
     */
    public java.lang.String getWebsiteurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITEURL$246, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "websiteurl" element
     */
    public org.apache.xmlbeans.XmlString xgetWebsiteurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSITEURL$246, 0);
            return target;
        }
    }
    
    /**
     * True if has "websiteurl" element
     */
    public boolean isSetWebsiteurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBSITEURL$246) != 0;
        }
    }
    
    /**
     * Sets the "websiteurl" element
     */
    public void setWebsiteurl(java.lang.String websiteurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITEURL$246, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBSITEURL$246);
            }
            target.setStringValue(websiteurl);
        }
    }
    
    /**
     * Sets (as xml) the "websiteurl" element
     */
    public void xsetWebsiteurl(org.apache.xmlbeans.XmlString websiteurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSITEURL$246, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBSITEURL$246);
            }
            target.set(websiteurl);
        }
    }
    
    /**
     * Unsets the "websiteurl" element
     */
    public void unsetWebsiteurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBSITEURL$246, 0);
        }
    }
    
    /**
     * Gets the "yominame" element
     */
    public java.lang.String getYominame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMINAME$248, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "yominame" element
     */
    public org.apache.xmlbeans.XmlString xgetYominame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMINAME$248, 0);
            return target;
        }
    }
    
    /**
     * True if has "yominame" element
     */
    public boolean isSetYominame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YOMINAME$248) != 0;
        }
    }
    
    /**
     * Sets the "yominame" element
     */
    public void setYominame(java.lang.String yominame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMINAME$248, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMINAME$248);
            }
            target.setStringValue(yominame);
        }
    }
    
    /**
     * Sets (as xml) the "yominame" element
     */
    public void xsetYominame(org.apache.xmlbeans.XmlString yominame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMINAME$248, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMINAME$248);
            }
            target.set(yominame);
        }
    }
    
    /**
     * Unsets the "yominame" element
     */
    public void unsetYominame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YOMINAME$248, 0);
        }
    }
}
