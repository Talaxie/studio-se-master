/*
 * XML Type:  contact
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Contact
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML contact(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ContactImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Contact
{
    
    public ContactImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTROLECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "accountrolecode");
    private static final javax.xml.namespace.QName ADDRESS1ADDRESSID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_addressid");
    private static final javax.xml.namespace.QName ADDRESS1ADDRESSTYPECODE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_addresstypecode");
    private static final javax.xml.namespace.QName ADDRESS1CITY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_city");
    private static final javax.xml.namespace.QName ADDRESS1COUNTRY$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_country");
    private static final javax.xml.namespace.QName ADDRESS1COUNTY$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_county");
    private static final javax.xml.namespace.QName ADDRESS1FAX$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_fax");
    private static final javax.xml.namespace.QName ADDRESS1FREIGHTTERMSCODE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_freighttermscode");
    private static final javax.xml.namespace.QName ADDRESS1LATITUDE$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_latitude");
    private static final javax.xml.namespace.QName ADDRESS1LINE1$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line1");
    private static final javax.xml.namespace.QName ADDRESS1LINE2$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line2");
    private static final javax.xml.namespace.QName ADDRESS1LINE3$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line3");
    private static final javax.xml.namespace.QName ADDRESS1LONGITUDE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_longitude");
    private static final javax.xml.namespace.QName ADDRESS1NAME$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_name");
    private static final javax.xml.namespace.QName ADDRESS1POSTALCODE$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_postalcode");
    private static final javax.xml.namespace.QName ADDRESS1POSTOFFICEBOX$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_postofficebox");
    private static final javax.xml.namespace.QName ADDRESS1PRIMARYCONTACTNAME$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_primarycontactname");
    private static final javax.xml.namespace.QName ADDRESS1SHIPPINGMETHODCODE$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_shippingmethodcode");
    private static final javax.xml.namespace.QName ADDRESS1STATEORPROVINCE$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_stateorprovince");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE1$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone1");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE2$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone2");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE3$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone3");
    private static final javax.xml.namespace.QName ADDRESS1UPSZONE$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_upszone");
    private static final javax.xml.namespace.QName ADDRESS1UTCOFFSET$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_utcoffset");
    private static final javax.xml.namespace.QName ADDRESS2ADDRESSID$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_addressid");
    private static final javax.xml.namespace.QName ADDRESS2ADDRESSTYPECODE$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_addresstypecode");
    private static final javax.xml.namespace.QName ADDRESS2CITY$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_city");
    private static final javax.xml.namespace.QName ADDRESS2COUNTRY$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_country");
    private static final javax.xml.namespace.QName ADDRESS2COUNTY$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_county");
    private static final javax.xml.namespace.QName ADDRESS2FAX$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_fax");
    private static final javax.xml.namespace.QName ADDRESS2FREIGHTTERMSCODE$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_freighttermscode");
    private static final javax.xml.namespace.QName ADDRESS2LATITUDE$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_latitude");
    private static final javax.xml.namespace.QName ADDRESS2LINE1$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line1");
    private static final javax.xml.namespace.QName ADDRESS2LINE2$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line2");
    private static final javax.xml.namespace.QName ADDRESS2LINE3$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line3");
    private static final javax.xml.namespace.QName ADDRESS2LONGITUDE$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_longitude");
    private static final javax.xml.namespace.QName ADDRESS2NAME$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_name");
    private static final javax.xml.namespace.QName ADDRESS2POSTALCODE$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_postalcode");
    private static final javax.xml.namespace.QName ADDRESS2POSTOFFICEBOX$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_postofficebox");
    private static final javax.xml.namespace.QName ADDRESS2PRIMARYCONTACTNAME$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_primarycontactname");
    private static final javax.xml.namespace.QName ADDRESS2SHIPPINGMETHODCODE$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_shippingmethodcode");
    private static final javax.xml.namespace.QName ADDRESS2STATEORPROVINCE$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_stateorprovince");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE1$84 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone1");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE2$86 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone2");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE3$88 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone3");
    private static final javax.xml.namespace.QName ADDRESS2UPSZONE$90 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_upszone");
    private static final javax.xml.namespace.QName ADDRESS2UTCOFFSET$92 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_utcoffset");
    private static final javax.xml.namespace.QName AGING30$94 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging30");
    private static final javax.xml.namespace.QName AGING30BASE$96 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging30_base");
    private static final javax.xml.namespace.QName AGING60$98 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging60");
    private static final javax.xml.namespace.QName AGING60BASE$100 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging60_base");
    private static final javax.xml.namespace.QName AGING90$102 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging90");
    private static final javax.xml.namespace.QName AGING90BASE$104 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "aging90_base");
    private static final javax.xml.namespace.QName ANNIVERSARY$106 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "anniversary");
    private static final javax.xml.namespace.QName ANNUALINCOME$108 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "annualincome");
    private static final javax.xml.namespace.QName ANNUALINCOMEBASE$110 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "annualincome_base");
    private static final javax.xml.namespace.QName ASSISTANTNAME$112 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "assistantname");
    private static final javax.xml.namespace.QName ASSISTANTPHONE$114 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "assistantphone");
    private static final javax.xml.namespace.QName BIRTHDATE$116 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "birthdate");
    private static final javax.xml.namespace.QName CHILDRENSNAMES$118 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "childrensnames");
    private static final javax.xml.namespace.QName CONTACTID$120 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contactid");
    private static final javax.xml.namespace.QName CREATEDBY$122 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$124 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CREDITLIMIT$126 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "creditlimit");
    private static final javax.xml.namespace.QName CREDITLIMITBASE$128 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "creditlimit_base");
    private static final javax.xml.namespace.QName CREDITONHOLD$130 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "creditonhold");
    private static final javax.xml.namespace.QName CUSTOMERSIZECODE$132 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customersizecode");
    private static final javax.xml.namespace.QName CUSTOMERTYPECODE$134 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customertypecode");
    private static final javax.xml.namespace.QName DEFAULTPRICELEVELID$136 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "defaultpricelevelid");
    private static final javax.xml.namespace.QName DEPARTMENT$138 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "department");
    private static final javax.xml.namespace.QName DESCRIPTION$140 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName DONOTBULKEMAIL$142 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotbulkemail");
    private static final javax.xml.namespace.QName DONOTBULKPOSTALMAIL$144 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotbulkpostalmail");
    private static final javax.xml.namespace.QName DONOTEMAIL$146 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotemail");
    private static final javax.xml.namespace.QName DONOTFAX$148 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotfax");
    private static final javax.xml.namespace.QName DONOTPHONE$150 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotphone");
    private static final javax.xml.namespace.QName DONOTPOSTALMAIL$152 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotpostalmail");
    private static final javax.xml.namespace.QName DONOTSENDMM$154 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotsendmm");
    private static final javax.xml.namespace.QName EDUCATIONCODE$156 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "educationcode");
    private static final javax.xml.namespace.QName EMAILADDRESS1$158 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress1");
    private static final javax.xml.namespace.QName EMAILADDRESS2$160 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress2");
    private static final javax.xml.namespace.QName EMAILADDRESS3$162 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress3");
    private static final javax.xml.namespace.QName EMPLOYEEID$164 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "employeeid");
    private static final javax.xml.namespace.QName EXCHANGERATE$166 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangerate");
    private static final javax.xml.namespace.QName EXTERNALUSERIDENTIFIER$168 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "externaluseridentifier");
    private static final javax.xml.namespace.QName FAMILYSTATUSCODE$170 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "familystatuscode");
    private static final javax.xml.namespace.QName FAX$172 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fax");
    private static final javax.xml.namespace.QName FIRSTNAME$174 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "firstname");
    private static final javax.xml.namespace.QName FTPSITEURL$176 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ftpsiteurl");
    private static final javax.xml.namespace.QName FULLNAME$178 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fullname");
    private static final javax.xml.namespace.QName GENDERCODE$180 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "gendercode");
    private static final javax.xml.namespace.QName GOVERNMENTID$182 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "governmentid");
    private static final javax.xml.namespace.QName HASCHILDRENCODE$184 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "haschildrencode");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$186 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName ISBACKOFFICECUSTOMER$188 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isbackofficecustomer");
    private static final javax.xml.namespace.QName JOBTITLE$190 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "jobtitle");
    private static final javax.xml.namespace.QName LASTNAME$192 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lastname");
    private static final javax.xml.namespace.QName LASTUSEDINCAMPAIGN$194 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lastusedincampaign");
    private static final javax.xml.namespace.QName LEADSOURCECODE$196 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "leadsourcecode");
    private static final javax.xml.namespace.QName MANAGERNAME$198 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "managername");
    private static final javax.xml.namespace.QName MANAGERPHONE$200 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "managerphone");
    private static final javax.xml.namespace.QName MASTERID$202 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "masterid");
    private static final javax.xml.namespace.QName MERGED$204 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "merged");
    private static final javax.xml.namespace.QName MIDDLENAME$206 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "middlename");
    private static final javax.xml.namespace.QName MOBILEPHONE$208 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "mobilephone");
    private static final javax.xml.namespace.QName MODIFIEDBY$210 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$212 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NICKNAME$214 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "nickname");
    private static final javax.xml.namespace.QName NUMBEROFCHILDREN$216 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "numberofchildren");
    private static final javax.xml.namespace.QName ORIGINATINGLEADID$218 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "originatingleadid");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$220 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNERID$222 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownerid");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$224 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName PAGER$226 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pager");
    private static final javax.xml.namespace.QName PARENTCUSTOMERID$228 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parentcustomerid");
    private static final javax.xml.namespace.QName PARTICIPATESINWORKFLOW$230 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "participatesinworkflow");
    private static final javax.xml.namespace.QName PAYMENTTERMSCODE$232 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "paymenttermscode");
    private static final javax.xml.namespace.QName PREFERREDAPPOINTMENTDAYCODE$234 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredappointmentdaycode");
    private static final javax.xml.namespace.QName PREFERREDAPPOINTMENTTIMECODE$236 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredappointmenttimecode");
    private static final javax.xml.namespace.QName PREFERREDCONTACTMETHODCODE$238 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredcontactmethodcode");
    private static final javax.xml.namespace.QName PREFERREDEQUIPMENTID$240 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredequipmentid");
    private static final javax.xml.namespace.QName PREFERREDSERVICEID$242 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredserviceid");
    private static final javax.xml.namespace.QName PREFERREDSYSTEMUSERID$244 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredsystemuserid");
    private static final javax.xml.namespace.QName SALUTATION$246 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salutation");
    private static final javax.xml.namespace.QName SHIPPINGMETHODCODE$248 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shippingmethodcode");
    private static final javax.xml.namespace.QName SPOUSESNAME$250 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "spousesname");
    private static final javax.xml.namespace.QName STATECODE$252 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$254 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$256 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subscriptionid");
    private static final javax.xml.namespace.QName SUFFIX$258 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "suffix");
    private static final javax.xml.namespace.QName TELEPHONE1$260 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "telephone1");
    private static final javax.xml.namespace.QName TELEPHONE2$262 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "telephone2");
    private static final javax.xml.namespace.QName TELEPHONE3$264 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "telephone3");
    private static final javax.xml.namespace.QName TERRITORYCODE$266 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "territorycode");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$268 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$270 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$272 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    private static final javax.xml.namespace.QName WEBSITEURL$274 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "websiteurl");
    private static final javax.xml.namespace.QName YOMIFIRSTNAME$276 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomifirstname");
    private static final javax.xml.namespace.QName YOMIFULLNAME$278 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomifullname");
    private static final javax.xml.namespace.QName YOMILASTNAME$280 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomilastname");
    private static final javax.xml.namespace.QName YOMIMIDDLENAME$282 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomimiddlename");
    
    
    /**
     * Gets the "accountrolecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAccountrolecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCOUNTROLECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accountrolecode" element
     */
    public boolean isSetAccountrolecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTROLECODE$0) != 0;
        }
    }
    
    /**
     * Sets the "accountrolecode" element
     */
    public void setAccountrolecode(com.microsoft.schemas.crm._2006.webservices.Picklist accountrolecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCOUNTROLECODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCOUNTROLECODE$0);
            }
            target.set(accountrolecode);
        }
    }
    
    /**
     * Appends and returns a new empty "accountrolecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAccountrolecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCOUNTROLECODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "accountrolecode" element
     */
    public void unsetAccountrolecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTROLECODE$0, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS1ADDRESSID$2, 0);
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
            return get_store().count_elements(ADDRESS1ADDRESSID$2) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS1ADDRESSID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS1ADDRESSID$2);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS1ADDRESSID$2);
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
            get_store().remove_element(ADDRESS1ADDRESSID$2, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1ADDRESSTYPECODE$4, 0);
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
            return get_store().count_elements(ADDRESS1ADDRESSTYPECODE$4) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1ADDRESSTYPECODE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1ADDRESSTYPECODE$4);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1ADDRESSTYPECODE$4);
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
            get_store().remove_element(ADDRESS1ADDRESSTYPECODE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1CITY$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1CITY$6, 0);
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
            return get_store().count_elements(ADDRESS1CITY$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1CITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1CITY$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1CITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1CITY$6);
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
            get_store().remove_element(ADDRESS1CITY$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTRY$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTRY$8, 0);
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
            return get_store().count_elements(ADDRESS1COUNTRY$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTRY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1COUNTRY$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTRY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1COUNTRY$8);
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
            get_store().remove_element(ADDRESS1COUNTRY$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTY$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTY$10, 0);
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
            return get_store().count_elements(ADDRESS1COUNTY$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1COUNTY$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1COUNTY$10);
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
            get_store().remove_element(ADDRESS1COUNTY$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1FAX$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1FAX$12, 0);
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
            return get_store().count_elements(ADDRESS1FAX$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1FAX$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1FAX$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1FAX$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1FAX$12);
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
            get_store().remove_element(ADDRESS1FAX$12, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1FREIGHTTERMSCODE$14, 0);
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
            return get_store().count_elements(ADDRESS1FREIGHTTERMSCODE$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1FREIGHTTERMSCODE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1FREIGHTTERMSCODE$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1FREIGHTTERMSCODE$14);
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
            get_store().remove_element(ADDRESS1FREIGHTTERMSCODE$14, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LATITUDE$16, 0);
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
            return get_store().count_elements(ADDRESS1LATITUDE$16) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LATITUDE$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LATITUDE$16);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LATITUDE$16);
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
            get_store().remove_element(ADDRESS1LATITUDE$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE1$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE1$18, 0);
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
            return get_store().count_elements(ADDRESS1LINE1$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE1$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE1$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE1$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE1$18);
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
            get_store().remove_element(ADDRESS1LINE1$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE2$20, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE2$20, 0);
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
            return get_store().count_elements(ADDRESS1LINE2$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE2$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE2$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE2$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE2$20);
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
            get_store().remove_element(ADDRESS1LINE2$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE3$22, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE3$22, 0);
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
            return get_store().count_elements(ADDRESS1LINE3$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE3$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE3$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE3$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE3$22);
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
            get_store().remove_element(ADDRESS1LINE3$22, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LONGITUDE$24, 0);
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
            return get_store().count_elements(ADDRESS1LONGITUDE$24) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LONGITUDE$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LONGITUDE$24);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LONGITUDE$24);
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
            get_store().remove_element(ADDRESS1LONGITUDE$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1NAME$26, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1NAME$26, 0);
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
            return get_store().count_elements(ADDRESS1NAME$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1NAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1NAME$26);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1NAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1NAME$26);
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
            get_store().remove_element(ADDRESS1NAME$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTALCODE$28, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTALCODE$28, 0);
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
            return get_store().count_elements(ADDRESS1POSTALCODE$28) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTALCODE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1POSTALCODE$28);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTALCODE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1POSTALCODE$28);
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
            get_store().remove_element(ADDRESS1POSTALCODE$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$30, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$30, 0);
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
            return get_store().count_elements(ADDRESS1POSTOFFICEBOX$30) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1POSTOFFICEBOX$30);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1POSTOFFICEBOX$30);
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
            get_store().remove_element(ADDRESS1POSTOFFICEBOX$30, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1PRIMARYCONTACTNAME$32, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1PRIMARYCONTACTNAME$32, 0);
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
            return get_store().count_elements(ADDRESS1PRIMARYCONTACTNAME$32) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1PRIMARYCONTACTNAME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1PRIMARYCONTACTNAME$32);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1PRIMARYCONTACTNAME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1PRIMARYCONTACTNAME$32);
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
            get_store().remove_element(ADDRESS1PRIMARYCONTACTNAME$32, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1SHIPPINGMETHODCODE$34, 0);
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
            return get_store().count_elements(ADDRESS1SHIPPINGMETHODCODE$34) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1SHIPPINGMETHODCODE$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1SHIPPINGMETHODCODE$34);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1SHIPPINGMETHODCODE$34);
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
            get_store().remove_element(ADDRESS1SHIPPINGMETHODCODE$34, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1STATEORPROVINCE$36, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1STATEORPROVINCE$36, 0);
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
            return get_store().count_elements(ADDRESS1STATEORPROVINCE$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1STATEORPROVINCE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1STATEORPROVINCE$36);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1STATEORPROVINCE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1STATEORPROVINCE$36);
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
            get_store().remove_element(ADDRESS1STATEORPROVINCE$36, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE1$38, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE1$38, 0);
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
            return get_store().count_elements(ADDRESS1TELEPHONE1$38) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE1$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE1$38);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE1$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE1$38);
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
            get_store().remove_element(ADDRESS1TELEPHONE1$38, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE2$40, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE2$40, 0);
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
            return get_store().count_elements(ADDRESS1TELEPHONE2$40) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE2$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE2$40);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE2$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE2$40);
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
            get_store().remove_element(ADDRESS1TELEPHONE2$40, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE3$42, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE3$42, 0);
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
            return get_store().count_elements(ADDRESS1TELEPHONE3$42) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE3$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE3$42);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE3$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE3$42);
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
            get_store().remove_element(ADDRESS1TELEPHONE3$42, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1UPSZONE$44, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1UPSZONE$44, 0);
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
            return get_store().count_elements(ADDRESS1UPSZONE$44) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1UPSZONE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1UPSZONE$44);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1UPSZONE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1UPSZONE$44);
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
            get_store().remove_element(ADDRESS1UPSZONE$44, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS1UTCOFFSET$46, 0);
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
            return get_store().count_elements(ADDRESS1UTCOFFSET$46) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS1UTCOFFSET$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS1UTCOFFSET$46);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS1UTCOFFSET$46);
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
            get_store().remove_element(ADDRESS1UTCOFFSET$46, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS2ADDRESSID$48, 0);
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
            return get_store().count_elements(ADDRESS2ADDRESSID$48) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS2ADDRESSID$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS2ADDRESSID$48);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS2ADDRESSID$48);
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
            get_store().remove_element(ADDRESS2ADDRESSID$48, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2ADDRESSTYPECODE$50, 0);
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
            return get_store().count_elements(ADDRESS2ADDRESSTYPECODE$50) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2ADDRESSTYPECODE$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2ADDRESSTYPECODE$50);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2ADDRESSTYPECODE$50);
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
            get_store().remove_element(ADDRESS2ADDRESSTYPECODE$50, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2CITY$52, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2CITY$52, 0);
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
            return get_store().count_elements(ADDRESS2CITY$52) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2CITY$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2CITY$52);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2CITY$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2CITY$52);
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
            get_store().remove_element(ADDRESS2CITY$52, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTRY$54, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTRY$54, 0);
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
            return get_store().count_elements(ADDRESS2COUNTRY$54) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTRY$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2COUNTRY$54);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTRY$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2COUNTRY$54);
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
            get_store().remove_element(ADDRESS2COUNTRY$54, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTY$56, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTY$56, 0);
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
            return get_store().count_elements(ADDRESS2COUNTY$56) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTY$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2COUNTY$56);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTY$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2COUNTY$56);
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
            get_store().remove_element(ADDRESS2COUNTY$56, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2FAX$58, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2FAX$58, 0);
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
            return get_store().count_elements(ADDRESS2FAX$58) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2FAX$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2FAX$58);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2FAX$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2FAX$58);
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
            get_store().remove_element(ADDRESS2FAX$58, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2FREIGHTTERMSCODE$60, 0);
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
            return get_store().count_elements(ADDRESS2FREIGHTTERMSCODE$60) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2FREIGHTTERMSCODE$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2FREIGHTTERMSCODE$60);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2FREIGHTTERMSCODE$60);
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
            get_store().remove_element(ADDRESS2FREIGHTTERMSCODE$60, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LATITUDE$62, 0);
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
            return get_store().count_elements(ADDRESS2LATITUDE$62) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LATITUDE$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LATITUDE$62);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LATITUDE$62);
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
            get_store().remove_element(ADDRESS2LATITUDE$62, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE1$64, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE1$64, 0);
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
            return get_store().count_elements(ADDRESS2LINE1$64) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE1$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE1$64);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE1$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE1$64);
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
            get_store().remove_element(ADDRESS2LINE1$64, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE2$66, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE2$66, 0);
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
            return get_store().count_elements(ADDRESS2LINE2$66) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE2$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE2$66);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE2$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE2$66);
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
            get_store().remove_element(ADDRESS2LINE2$66, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE3$68, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE3$68, 0);
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
            return get_store().count_elements(ADDRESS2LINE3$68) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE3$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE3$68);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE3$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE3$68);
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
            get_store().remove_element(ADDRESS2LINE3$68, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LONGITUDE$70, 0);
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
            return get_store().count_elements(ADDRESS2LONGITUDE$70) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LONGITUDE$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LONGITUDE$70);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LONGITUDE$70);
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
            get_store().remove_element(ADDRESS2LONGITUDE$70, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2NAME$72, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2NAME$72, 0);
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
            return get_store().count_elements(ADDRESS2NAME$72) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2NAME$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2NAME$72);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2NAME$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2NAME$72);
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
            get_store().remove_element(ADDRESS2NAME$72, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTALCODE$74, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTALCODE$74, 0);
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
            return get_store().count_elements(ADDRESS2POSTALCODE$74) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTALCODE$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2POSTALCODE$74);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTALCODE$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2POSTALCODE$74);
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
            get_store().remove_element(ADDRESS2POSTALCODE$74, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$76, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$76, 0);
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
            return get_store().count_elements(ADDRESS2POSTOFFICEBOX$76) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2POSTOFFICEBOX$76);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2POSTOFFICEBOX$76);
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
            get_store().remove_element(ADDRESS2POSTOFFICEBOX$76, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2PRIMARYCONTACTNAME$78, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2PRIMARYCONTACTNAME$78, 0);
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
            return get_store().count_elements(ADDRESS2PRIMARYCONTACTNAME$78) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2PRIMARYCONTACTNAME$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2PRIMARYCONTACTNAME$78);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2PRIMARYCONTACTNAME$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2PRIMARYCONTACTNAME$78);
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
            get_store().remove_element(ADDRESS2PRIMARYCONTACTNAME$78, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2SHIPPINGMETHODCODE$80, 0);
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
            return get_store().count_elements(ADDRESS2SHIPPINGMETHODCODE$80) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2SHIPPINGMETHODCODE$80, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2SHIPPINGMETHODCODE$80);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2SHIPPINGMETHODCODE$80);
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
            get_store().remove_element(ADDRESS2SHIPPINGMETHODCODE$80, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2STATEORPROVINCE$82, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2STATEORPROVINCE$82, 0);
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
            return get_store().count_elements(ADDRESS2STATEORPROVINCE$82) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2STATEORPROVINCE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2STATEORPROVINCE$82);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2STATEORPROVINCE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2STATEORPROVINCE$82);
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
            get_store().remove_element(ADDRESS2STATEORPROVINCE$82, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE1$84, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE1$84, 0);
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
            return get_store().count_elements(ADDRESS2TELEPHONE1$84) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE1$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE1$84);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE1$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE1$84);
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
            get_store().remove_element(ADDRESS2TELEPHONE1$84, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE2$86, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE2$86, 0);
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
            return get_store().count_elements(ADDRESS2TELEPHONE2$86) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE2$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE2$86);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE2$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE2$86);
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
            get_store().remove_element(ADDRESS2TELEPHONE2$86, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE3$88, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE3$88, 0);
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
            return get_store().count_elements(ADDRESS2TELEPHONE3$88) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE3$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE3$88);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE3$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE3$88);
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
            get_store().remove_element(ADDRESS2TELEPHONE3$88, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2UPSZONE$90, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2UPSZONE$90, 0);
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
            return get_store().count_elements(ADDRESS2UPSZONE$90) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2UPSZONE$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2UPSZONE$90);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2UPSZONE$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2UPSZONE$90);
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
            get_store().remove_element(ADDRESS2UPSZONE$90, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS2UTCOFFSET$92, 0);
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
            return get_store().count_elements(ADDRESS2UTCOFFSET$92) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS2UTCOFFSET$92, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS2UTCOFFSET$92);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS2UTCOFFSET$92);
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
            get_store().remove_element(ADDRESS2UTCOFFSET$92, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING30$94, 0);
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
            return get_store().count_elements(AGING30$94) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING30$94, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING30$94);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING30$94);
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
            get_store().remove_element(AGING30$94, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING30BASE$96, 0);
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
            return get_store().count_elements(AGING30BASE$96) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING30BASE$96, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING30BASE$96);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING30BASE$96);
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
            get_store().remove_element(AGING30BASE$96, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING60$98, 0);
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
            return get_store().count_elements(AGING60$98) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING60$98, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING60$98);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING60$98);
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
            get_store().remove_element(AGING60$98, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING60BASE$100, 0);
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
            return get_store().count_elements(AGING60BASE$100) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING60BASE$100, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING60BASE$100);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING60BASE$100);
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
            get_store().remove_element(AGING60BASE$100, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING90$102, 0);
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
            return get_store().count_elements(AGING90$102) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING90$102, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING90$102);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING90$102);
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
            get_store().remove_element(AGING90$102, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING90BASE$104, 0);
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
            return get_store().count_elements(AGING90BASE$104) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AGING90BASE$104, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING90BASE$104);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AGING90BASE$104);
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
            get_store().remove_element(AGING90BASE$104, 0);
        }
    }
    
    /**
     * Gets the "anniversary" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getAnniversary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ANNIVERSARY$106, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "anniversary" element
     */
    public boolean isSetAnniversary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNIVERSARY$106) != 0;
        }
    }
    
    /**
     * Sets the "anniversary" element
     */
    public void setAnniversary(com.microsoft.schemas.crm._2006.webservices.CrmDateTime anniversary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ANNIVERSARY$106, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ANNIVERSARY$106);
            }
            target.set(anniversary);
        }
    }
    
    /**
     * Appends and returns a new empty "anniversary" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewAnniversary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ANNIVERSARY$106);
            return target;
        }
    }
    
    /**
     * Unsets the "anniversary" element
     */
    public void unsetAnniversary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNIVERSARY$106, 0);
        }
    }
    
    /**
     * Gets the "annualincome" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAnnualincome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ANNUALINCOME$108, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "annualincome" element
     */
    public boolean isSetAnnualincome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNUALINCOME$108) != 0;
        }
    }
    
    /**
     * Sets the "annualincome" element
     */
    public void setAnnualincome(com.microsoft.schemas.crm._2006.webservices.CrmMoney annualincome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ANNUALINCOME$108, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ANNUALINCOME$108);
            }
            target.set(annualincome);
        }
    }
    
    /**
     * Appends and returns a new empty "annualincome" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAnnualincome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ANNUALINCOME$108);
            return target;
        }
    }
    
    /**
     * Unsets the "annualincome" element
     */
    public void unsetAnnualincome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNUALINCOME$108, 0);
        }
    }
    
    /**
     * Gets the "annualincome_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAnnualincomeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ANNUALINCOMEBASE$110, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "annualincome_base" element
     */
    public boolean isSetAnnualincomeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNUALINCOMEBASE$110) != 0;
        }
    }
    
    /**
     * Sets the "annualincome_base" element
     */
    public void setAnnualincomeBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney annualincomeBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ANNUALINCOMEBASE$110, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ANNUALINCOMEBASE$110);
            }
            target.set(annualincomeBase);
        }
    }
    
    /**
     * Appends and returns a new empty "annualincome_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAnnualincomeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ANNUALINCOMEBASE$110);
            return target;
        }
    }
    
    /**
     * Unsets the "annualincome_base" element
     */
    public void unsetAnnualincomeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNUALINCOMEBASE$110, 0);
        }
    }
    
    /**
     * Gets the "assistantname" element
     */
    public java.lang.String getAssistantname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSISTANTNAME$112, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "assistantname" element
     */
    public org.apache.xmlbeans.XmlString xgetAssistantname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSISTANTNAME$112, 0);
            return target;
        }
    }
    
    /**
     * True if has "assistantname" element
     */
    public boolean isSetAssistantname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSISTANTNAME$112) != 0;
        }
    }
    
    /**
     * Sets the "assistantname" element
     */
    public void setAssistantname(java.lang.String assistantname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSISTANTNAME$112, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSISTANTNAME$112);
            }
            target.setStringValue(assistantname);
        }
    }
    
    /**
     * Sets (as xml) the "assistantname" element
     */
    public void xsetAssistantname(org.apache.xmlbeans.XmlString assistantname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSISTANTNAME$112, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSISTANTNAME$112);
            }
            target.set(assistantname);
        }
    }
    
    /**
     * Unsets the "assistantname" element
     */
    public void unsetAssistantname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSISTANTNAME$112, 0);
        }
    }
    
    /**
     * Gets the "assistantphone" element
     */
    public java.lang.String getAssistantphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSISTANTPHONE$114, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "assistantphone" element
     */
    public org.apache.xmlbeans.XmlString xgetAssistantphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSISTANTPHONE$114, 0);
            return target;
        }
    }
    
    /**
     * True if has "assistantphone" element
     */
    public boolean isSetAssistantphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSISTANTPHONE$114) != 0;
        }
    }
    
    /**
     * Sets the "assistantphone" element
     */
    public void setAssistantphone(java.lang.String assistantphone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSISTANTPHONE$114, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSISTANTPHONE$114);
            }
            target.setStringValue(assistantphone);
        }
    }
    
    /**
     * Sets (as xml) the "assistantphone" element
     */
    public void xsetAssistantphone(org.apache.xmlbeans.XmlString assistantphone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSISTANTPHONE$114, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSISTANTPHONE$114);
            }
            target.set(assistantphone);
        }
    }
    
    /**
     * Unsets the "assistantphone" element
     */
    public void unsetAssistantphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSISTANTPHONE$114, 0);
        }
    }
    
    /**
     * Gets the "birthdate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(BIRTHDATE$116, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "birthdate" element
     */
    public boolean isSetBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHDATE$116) != 0;
        }
    }
    
    /**
     * Sets the "birthdate" element
     */
    public void setBirthdate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime birthdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(BIRTHDATE$116, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(BIRTHDATE$116);
            }
            target.set(birthdate);
        }
    }
    
    /**
     * Appends and returns a new empty "birthdate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(BIRTHDATE$116);
            return target;
        }
    }
    
    /**
     * Unsets the "birthdate" element
     */
    public void unsetBirthdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHDATE$116, 0);
        }
    }
    
    /**
     * Gets the "childrensnames" element
     */
    public java.lang.String getChildrensnames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDRENSNAMES$118, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "childrensnames" element
     */
    public org.apache.xmlbeans.XmlString xgetChildrensnames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDRENSNAMES$118, 0);
            return target;
        }
    }
    
    /**
     * True if has "childrensnames" element
     */
    public boolean isSetChildrensnames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDRENSNAMES$118) != 0;
        }
    }
    
    /**
     * Sets the "childrensnames" element
     */
    public void setChildrensnames(java.lang.String childrensnames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDRENSNAMES$118, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILDRENSNAMES$118);
            }
            target.setStringValue(childrensnames);
        }
    }
    
    /**
     * Sets (as xml) the "childrensnames" element
     */
    public void xsetChildrensnames(org.apache.xmlbeans.XmlString childrensnames)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHILDRENSNAMES$118, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHILDRENSNAMES$118);
            }
            target.set(childrensnames);
        }
    }
    
    /**
     * Unsets the "childrensnames" element
     */
    public void unsetChildrensnames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDRENSNAMES$118, 0);
        }
    }
    
    /**
     * Gets the "contactid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getContactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CONTACTID$120, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contactid" element
     */
    public boolean isSetContactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTID$120) != 0;
        }
    }
    
    /**
     * Sets the "contactid" element
     */
    public void setContactid(com.microsoft.schemas.crm._2006.webservices.Key contactid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CONTACTID$120, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CONTACTID$120);
            }
            target.set(contactid);
        }
    }
    
    /**
     * Appends and returns a new empty "contactid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewContactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CONTACTID$120);
            return target;
        }
    }
    
    /**
     * Unsets the "contactid" element
     */
    public void unsetContactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTID$120, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$122, 0);
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
            return get_store().count_elements(CREATEDBY$122) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$122, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$122);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$122);
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
            get_store().remove_element(CREATEDBY$122, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$124, 0);
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
            return get_store().count_elements(CREATEDON$124) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$124, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$124);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$124);
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
            get_store().remove_element(CREATEDON$124, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(CREDITLIMIT$126, 0);
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
            return get_store().count_elements(CREDITLIMIT$126) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(CREDITLIMIT$126, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(CREDITLIMIT$126);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(CREDITLIMIT$126);
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
            get_store().remove_element(CREDITLIMIT$126, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(CREDITLIMITBASE$128, 0);
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
            return get_store().count_elements(CREDITLIMITBASE$128) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(CREDITLIMITBASE$128, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(CREDITLIMITBASE$128);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(CREDITLIMITBASE$128);
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
            get_store().remove_element(CREDITLIMITBASE$128, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CREDITONHOLD$130, 0);
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
            return get_store().count_elements(CREDITONHOLD$130) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CREDITONHOLD$130, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CREDITONHOLD$130);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CREDITONHOLD$130);
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
            get_store().remove_element(CREDITONHOLD$130, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERSIZECODE$132, 0);
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
            return get_store().count_elements(CUSTOMERSIZECODE$132) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERSIZECODE$132, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERSIZECODE$132);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERSIZECODE$132);
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
            get_store().remove_element(CUSTOMERSIZECODE$132, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERTYPECODE$134, 0);
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
            return get_store().count_elements(CUSTOMERTYPECODE$134) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERTYPECODE$134, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERTYPECODE$134);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERTYPECODE$134);
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
            get_store().remove_element(CUSTOMERTYPECODE$134, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(DEFAULTPRICELEVELID$136, 0);
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
            return get_store().count_elements(DEFAULTPRICELEVELID$136) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(DEFAULTPRICELEVELID$136, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(DEFAULTPRICELEVELID$136);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(DEFAULTPRICELEVELID$136);
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
            get_store().remove_element(DEFAULTPRICELEVELID$136, 0);
        }
    }
    
    /**
     * Gets the "department" element
     */
    public java.lang.String getDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTMENT$138, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "department" element
     */
    public org.apache.xmlbeans.XmlString xgetDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPARTMENT$138, 0);
            return target;
        }
    }
    
    /**
     * True if has "department" element
     */
    public boolean isSetDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTMENT$138) != 0;
        }
    }
    
    /**
     * Sets the "department" element
     */
    public void setDepartment(java.lang.String department)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTMENT$138, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTMENT$138);
            }
            target.setStringValue(department);
        }
    }
    
    /**
     * Sets (as xml) the "department" element
     */
    public void xsetDepartment(org.apache.xmlbeans.XmlString department)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPARTMENT$138, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPARTMENT$138);
            }
            target.set(department);
        }
    }
    
    /**
     * Unsets the "department" element
     */
    public void unsetDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTMENT$138, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$140, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$140, 0);
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
            return get_store().count_elements(DESCRIPTION$140) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$140, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$140);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$140, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$140);
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
            get_store().remove_element(DESCRIPTION$140, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKEMAIL$142, 0);
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
            return get_store().count_elements(DONOTBULKEMAIL$142) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKEMAIL$142, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKEMAIL$142);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKEMAIL$142);
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
            get_store().remove_element(DONOTBULKEMAIL$142, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKPOSTALMAIL$144, 0);
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
            return get_store().count_elements(DONOTBULKPOSTALMAIL$144) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKPOSTALMAIL$144, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKPOSTALMAIL$144);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKPOSTALMAIL$144);
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
            get_store().remove_element(DONOTBULKPOSTALMAIL$144, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTEMAIL$146, 0);
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
            return get_store().count_elements(DONOTEMAIL$146) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTEMAIL$146, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTEMAIL$146);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTEMAIL$146);
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
            get_store().remove_element(DONOTEMAIL$146, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTFAX$148, 0);
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
            return get_store().count_elements(DONOTFAX$148) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTFAX$148, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTFAX$148);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTFAX$148);
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
            get_store().remove_element(DONOTFAX$148, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPHONE$150, 0);
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
            return get_store().count_elements(DONOTPHONE$150) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPHONE$150, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPHONE$150);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPHONE$150);
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
            get_store().remove_element(DONOTPHONE$150, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPOSTALMAIL$152, 0);
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
            return get_store().count_elements(DONOTPOSTALMAIL$152) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPOSTALMAIL$152, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPOSTALMAIL$152);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPOSTALMAIL$152);
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
            get_store().remove_element(DONOTPOSTALMAIL$152, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTSENDMM$154, 0);
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
            return get_store().count_elements(DONOTSENDMM$154) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTSENDMM$154, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTSENDMM$154);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTSENDMM$154);
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
            get_store().remove_element(DONOTSENDMM$154, 0);
        }
    }
    
    /**
     * Gets the "educationcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getEducationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(EDUCATIONCODE$156, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "educationcode" element
     */
    public boolean isSetEducationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EDUCATIONCODE$156) != 0;
        }
    }
    
    /**
     * Sets the "educationcode" element
     */
    public void setEducationcode(com.microsoft.schemas.crm._2006.webservices.Picklist educationcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(EDUCATIONCODE$156, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(EDUCATIONCODE$156);
            }
            target.set(educationcode);
        }
    }
    
    /**
     * Appends and returns a new empty "educationcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewEducationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(EDUCATIONCODE$156);
            return target;
        }
    }
    
    /**
     * Unsets the "educationcode" element
     */
    public void unsetEducationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EDUCATIONCODE$156, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS1$158, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS1$158, 0);
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
            return get_store().count_elements(EMAILADDRESS1$158) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS1$158, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS1$158);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS1$158, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS1$158);
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
            get_store().remove_element(EMAILADDRESS1$158, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS2$160, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS2$160, 0);
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
            return get_store().count_elements(EMAILADDRESS2$160) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS2$160, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS2$160);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS2$160, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS2$160);
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
            get_store().remove_element(EMAILADDRESS2$160, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS3$162, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS3$162, 0);
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
            return get_store().count_elements(EMAILADDRESS3$162) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS3$162, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS3$162);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS3$162, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS3$162);
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
            get_store().remove_element(EMAILADDRESS3$162, 0);
        }
    }
    
    /**
     * Gets the "employeeid" element
     */
    public java.lang.String getEmployeeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEEID$164, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "employeeid" element
     */
    public org.apache.xmlbeans.XmlString xgetEmployeeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYEEID$164, 0);
            return target;
        }
    }
    
    /**
     * True if has "employeeid" element
     */
    public boolean isSetEmployeeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPLOYEEID$164) != 0;
        }
    }
    
    /**
     * Sets the "employeeid" element
     */
    public void setEmployeeid(java.lang.String employeeid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEEID$164, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYEEID$164);
            }
            target.setStringValue(employeeid);
        }
    }
    
    /**
     * Sets (as xml) the "employeeid" element
     */
    public void xsetEmployeeid(org.apache.xmlbeans.XmlString employeeid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYEEID$164, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYEEID$164);
            }
            target.set(employeeid);
        }
    }
    
    /**
     * Unsets the "employeeid" element
     */
    public void unsetEmployeeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPLOYEEID$164, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$166, 0);
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
            return get_store().count_elements(EXCHANGERATE$166) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$166, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$166);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$166);
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
            get_store().remove_element(EXCHANGERATE$166, 0);
        }
    }
    
    /**
     * Gets the "externaluseridentifier" element
     */
    public java.lang.String getExternaluseridentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALUSERIDENTIFIER$168, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "externaluseridentifier" element
     */
    public org.apache.xmlbeans.XmlString xgetExternaluseridentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALUSERIDENTIFIER$168, 0);
            return target;
        }
    }
    
    /**
     * True if has "externaluseridentifier" element
     */
    public boolean isSetExternaluseridentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALUSERIDENTIFIER$168) != 0;
        }
    }
    
    /**
     * Sets the "externaluseridentifier" element
     */
    public void setExternaluseridentifier(java.lang.String externaluseridentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALUSERIDENTIFIER$168, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALUSERIDENTIFIER$168);
            }
            target.setStringValue(externaluseridentifier);
        }
    }
    
    /**
     * Sets (as xml) the "externaluseridentifier" element
     */
    public void xsetExternaluseridentifier(org.apache.xmlbeans.XmlString externaluseridentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTERNALUSERIDENTIFIER$168, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTERNALUSERIDENTIFIER$168);
            }
            target.set(externaluseridentifier);
        }
    }
    
    /**
     * Unsets the "externaluseridentifier" element
     */
    public void unsetExternaluseridentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALUSERIDENTIFIER$168, 0);
        }
    }
    
    /**
     * Gets the "familystatuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getFamilystatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(FAMILYSTATUSCODE$170, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "familystatuscode" element
     */
    public boolean isSetFamilystatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILYSTATUSCODE$170) != 0;
        }
    }
    
    /**
     * Sets the "familystatuscode" element
     */
    public void setFamilystatuscode(com.microsoft.schemas.crm._2006.webservices.Picklist familystatuscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(FAMILYSTATUSCODE$170, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(FAMILYSTATUSCODE$170);
            }
            target.set(familystatuscode);
        }
    }
    
    /**
     * Appends and returns a new empty "familystatuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewFamilystatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(FAMILYSTATUSCODE$170);
            return target;
        }
    }
    
    /**
     * Unsets the "familystatuscode" element
     */
    public void unsetFamilystatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILYSTATUSCODE$170, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$172, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$172, 0);
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
            return get_store().count_elements(FAX$172) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$172, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$172);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$172, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$172);
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
            get_store().remove_element(FAX$172, 0);
        }
    }
    
    /**
     * Gets the "firstname" element
     */
    public java.lang.String getFirstname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$174, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "firstname" element
     */
    public org.apache.xmlbeans.XmlString xgetFirstname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$174, 0);
            return target;
        }
    }
    
    /**
     * True if has "firstname" element
     */
    public boolean isSetFirstname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTNAME$174) != 0;
        }
    }
    
    /**
     * Sets the "firstname" element
     */
    public void setFirstname(java.lang.String firstname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$174, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTNAME$174);
            }
            target.setStringValue(firstname);
        }
    }
    
    /**
     * Sets (as xml) the "firstname" element
     */
    public void xsetFirstname(org.apache.xmlbeans.XmlString firstname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$174, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTNAME$174);
            }
            target.set(firstname);
        }
    }
    
    /**
     * Unsets the "firstname" element
     */
    public void unsetFirstname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTNAME$174, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTPSITEURL$176, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FTPSITEURL$176, 0);
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
            return get_store().count_elements(FTPSITEURL$176) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FTPSITEURL$176, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FTPSITEURL$176);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FTPSITEURL$176, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FTPSITEURL$176);
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
            get_store().remove_element(FTPSITEURL$176, 0);
        }
    }
    
    /**
     * Gets the "fullname" element
     */
    public java.lang.String getFullname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$178, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullname" element
     */
    public org.apache.xmlbeans.XmlString xgetFullname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$178, 0);
            return target;
        }
    }
    
    /**
     * True if has "fullname" element
     */
    public boolean isSetFullname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULLNAME$178) != 0;
        }
    }
    
    /**
     * Sets the "fullname" element
     */
    public void setFullname(java.lang.String fullname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$178, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLNAME$178);
            }
            target.setStringValue(fullname);
        }
    }
    
    /**
     * Sets (as xml) the "fullname" element
     */
    public void xsetFullname(org.apache.xmlbeans.XmlString fullname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$178, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FULLNAME$178);
            }
            target.set(fullname);
        }
    }
    
    /**
     * Unsets the "fullname" element
     */
    public void unsetFullname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULLNAME$178, 0);
        }
    }
    
    /**
     * Gets the "gendercode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getGendercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(GENDERCODE$180, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gendercode" element
     */
    public boolean isSetGendercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENDERCODE$180) != 0;
        }
    }
    
    /**
     * Sets the "gendercode" element
     */
    public void setGendercode(com.microsoft.schemas.crm._2006.webservices.Picklist gendercode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(GENDERCODE$180, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(GENDERCODE$180);
            }
            target.set(gendercode);
        }
    }
    
    /**
     * Appends and returns a new empty "gendercode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewGendercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(GENDERCODE$180);
            return target;
        }
    }
    
    /**
     * Unsets the "gendercode" element
     */
    public void unsetGendercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENDERCODE$180, 0);
        }
    }
    
    /**
     * Gets the "governmentid" element
     */
    public java.lang.String getGovernmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOVERNMENTID$182, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "governmentid" element
     */
    public org.apache.xmlbeans.XmlString xgetGovernmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOVERNMENTID$182, 0);
            return target;
        }
    }
    
    /**
     * True if has "governmentid" element
     */
    public boolean isSetGovernmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOVERNMENTID$182) != 0;
        }
    }
    
    /**
     * Sets the "governmentid" element
     */
    public void setGovernmentid(java.lang.String governmentid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOVERNMENTID$182, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOVERNMENTID$182);
            }
            target.setStringValue(governmentid);
        }
    }
    
    /**
     * Sets (as xml) the "governmentid" element
     */
    public void xsetGovernmentid(org.apache.xmlbeans.XmlString governmentid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOVERNMENTID$182, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GOVERNMENTID$182);
            }
            target.set(governmentid);
        }
    }
    
    /**
     * Unsets the "governmentid" element
     */
    public void unsetGovernmentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOVERNMENTID$182, 0);
        }
    }
    
    /**
     * Gets the "haschildrencode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getHaschildrencode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(HASCHILDRENCODE$184, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "haschildrencode" element
     */
    public boolean isSetHaschildrencode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASCHILDRENCODE$184) != 0;
        }
    }
    
    /**
     * Sets the "haschildrencode" element
     */
    public void setHaschildrencode(com.microsoft.schemas.crm._2006.webservices.Picklist haschildrencode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(HASCHILDRENCODE$184, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(HASCHILDRENCODE$184);
            }
            target.set(haschildrencode);
        }
    }
    
    /**
     * Appends and returns a new empty "haschildrencode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewHaschildrencode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(HASCHILDRENCODE$184);
            return target;
        }
    }
    
    /**
     * Unsets the "haschildrencode" element
     */
    public void unsetHaschildrencode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASCHILDRENCODE$184, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$186, 0);
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
            return get_store().count_elements(IMPORTSEQUENCENUMBER$186) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$186, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$186);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$186);
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
            get_store().remove_element(IMPORTSEQUENCENUMBER$186, 0);
        }
    }
    
    /**
     * Gets the "isbackofficecustomer" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsbackofficecustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISBACKOFFICECUSTOMER$188, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isbackofficecustomer" element
     */
    public boolean isSetIsbackofficecustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISBACKOFFICECUSTOMER$188) != 0;
        }
    }
    
    /**
     * Sets the "isbackofficecustomer" element
     */
    public void setIsbackofficecustomer(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isbackofficecustomer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISBACKOFFICECUSTOMER$188, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISBACKOFFICECUSTOMER$188);
            }
            target.set(isbackofficecustomer);
        }
    }
    
    /**
     * Appends and returns a new empty "isbackofficecustomer" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsbackofficecustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISBACKOFFICECUSTOMER$188);
            return target;
        }
    }
    
    /**
     * Unsets the "isbackofficecustomer" element
     */
    public void unsetIsbackofficecustomer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISBACKOFFICECUSTOMER$188, 0);
        }
    }
    
    /**
     * Gets the "jobtitle" element
     */
    public java.lang.String getJobtitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$190, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jobtitle" element
     */
    public org.apache.xmlbeans.XmlString xgetJobtitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$190, 0);
            return target;
        }
    }
    
    /**
     * True if has "jobtitle" element
     */
    public boolean isSetJobtitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JOBTITLE$190) != 0;
        }
    }
    
    /**
     * Sets the "jobtitle" element
     */
    public void setJobtitle(java.lang.String jobtitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$190, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBTITLE$190);
            }
            target.setStringValue(jobtitle);
        }
    }
    
    /**
     * Sets (as xml) the "jobtitle" element
     */
    public void xsetJobtitle(org.apache.xmlbeans.XmlString jobtitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$190, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBTITLE$190);
            }
            target.set(jobtitle);
        }
    }
    
    /**
     * Unsets the "jobtitle" element
     */
    public void unsetJobtitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JOBTITLE$190, 0);
        }
    }
    
    /**
     * Gets the "lastname" element
     */
    public java.lang.String getLastname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$192, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastname" element
     */
    public org.apache.xmlbeans.XmlString xgetLastname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$192, 0);
            return target;
        }
    }
    
    /**
     * True if has "lastname" element
     */
    public boolean isSetLastname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTNAME$192) != 0;
        }
    }
    
    /**
     * Sets the "lastname" element
     */
    public void setLastname(java.lang.String lastname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$192, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTNAME$192);
            }
            target.setStringValue(lastname);
        }
    }
    
    /**
     * Sets (as xml) the "lastname" element
     */
    public void xsetLastname(org.apache.xmlbeans.XmlString lastname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$192, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTNAME$192);
            }
            target.set(lastname);
        }
    }
    
    /**
     * Unsets the "lastname" element
     */
    public void unsetLastname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTNAME$192, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTUSEDINCAMPAIGN$194, 0);
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
            return get_store().count_elements(LASTUSEDINCAMPAIGN$194) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTUSEDINCAMPAIGN$194, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTUSEDINCAMPAIGN$194);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTUSEDINCAMPAIGN$194);
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
            get_store().remove_element(LASTUSEDINCAMPAIGN$194, 0);
        }
    }
    
    /**
     * Gets the "leadsourcecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getLeadsourcecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(LEADSOURCECODE$196, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "leadsourcecode" element
     */
    public boolean isSetLeadsourcecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEADSOURCECODE$196) != 0;
        }
    }
    
    /**
     * Sets the "leadsourcecode" element
     */
    public void setLeadsourcecode(com.microsoft.schemas.crm._2006.webservices.Picklist leadsourcecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(LEADSOURCECODE$196, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(LEADSOURCECODE$196);
            }
            target.set(leadsourcecode);
        }
    }
    
    /**
     * Appends and returns a new empty "leadsourcecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewLeadsourcecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(LEADSOURCECODE$196);
            return target;
        }
    }
    
    /**
     * Unsets the "leadsourcecode" element
     */
    public void unsetLeadsourcecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEADSOURCECODE$196, 0);
        }
    }
    
    /**
     * Gets the "managername" element
     */
    public java.lang.String getManagername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGERNAME$198, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "managername" element
     */
    public org.apache.xmlbeans.XmlString xgetManagername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGERNAME$198, 0);
            return target;
        }
    }
    
    /**
     * True if has "managername" element
     */
    public boolean isSetManagername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGERNAME$198) != 0;
        }
    }
    
    /**
     * Sets the "managername" element
     */
    public void setManagername(java.lang.String managername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGERNAME$198, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGERNAME$198);
            }
            target.setStringValue(managername);
        }
    }
    
    /**
     * Sets (as xml) the "managername" element
     */
    public void xsetManagername(org.apache.xmlbeans.XmlString managername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGERNAME$198, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGERNAME$198);
            }
            target.set(managername);
        }
    }
    
    /**
     * Unsets the "managername" element
     */
    public void unsetManagername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGERNAME$198, 0);
        }
    }
    
    /**
     * Gets the "managerphone" element
     */
    public java.lang.String getManagerphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGERPHONE$200, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "managerphone" element
     */
    public org.apache.xmlbeans.XmlString xgetManagerphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGERPHONE$200, 0);
            return target;
        }
    }
    
    /**
     * True if has "managerphone" element
     */
    public boolean isSetManagerphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGERPHONE$200) != 0;
        }
    }
    
    /**
     * Sets the "managerphone" element
     */
    public void setManagerphone(java.lang.String managerphone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGERPHONE$200, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGERPHONE$200);
            }
            target.setStringValue(managerphone);
        }
    }
    
    /**
     * Sets (as xml) the "managerphone" element
     */
    public void xsetManagerphone(org.apache.xmlbeans.XmlString managerphone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGERPHONE$200, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGERPHONE$200);
            }
            target.set(managerphone);
        }
    }
    
    /**
     * Unsets the "managerphone" element
     */
    public void unsetManagerphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGERPHONE$200, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MASTERID$202, 0);
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
            return get_store().count_elements(MASTERID$202) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MASTERID$202, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MASTERID$202);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MASTERID$202);
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
            get_store().remove_element(MASTERID$202, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(MERGED$204, 0);
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
            return get_store().count_elements(MERGED$204) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(MERGED$204, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(MERGED$204);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(MERGED$204);
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
            get_store().remove_element(MERGED$204, 0);
        }
    }
    
    /**
     * Gets the "middlename" element
     */
    public java.lang.String getMiddlename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$206, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "middlename" element
     */
    public org.apache.xmlbeans.XmlString xgetMiddlename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLENAME$206, 0);
            return target;
        }
    }
    
    /**
     * True if has "middlename" element
     */
    public boolean isSetMiddlename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIDDLENAME$206) != 0;
        }
    }
    
    /**
     * Sets the "middlename" element
     */
    public void setMiddlename(java.lang.String middlename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$206, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDDLENAME$206);
            }
            target.setStringValue(middlename);
        }
    }
    
    /**
     * Sets (as xml) the "middlename" element
     */
    public void xsetMiddlename(org.apache.xmlbeans.XmlString middlename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLENAME$206, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDDLENAME$206);
            }
            target.set(middlename);
        }
    }
    
    /**
     * Unsets the "middlename" element
     */
    public void unsetMiddlename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIDDLENAME$206, 0);
        }
    }
    
    /**
     * Gets the "mobilephone" element
     */
    public java.lang.String getMobilephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$208, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mobilephone" element
     */
    public org.apache.xmlbeans.XmlString xgetMobilephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$208, 0);
            return target;
        }
    }
    
    /**
     * True if has "mobilephone" element
     */
    public boolean isSetMobilephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOBILEPHONE$208) != 0;
        }
    }
    
    /**
     * Sets the "mobilephone" element
     */
    public void setMobilephone(java.lang.String mobilephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$208, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILEPHONE$208);
            }
            target.setStringValue(mobilephone);
        }
    }
    
    /**
     * Sets (as xml) the "mobilephone" element
     */
    public void xsetMobilephone(org.apache.xmlbeans.XmlString mobilephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$208, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILEPHONE$208);
            }
            target.set(mobilephone);
        }
    }
    
    /**
     * Unsets the "mobilephone" element
     */
    public void unsetMobilephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOBILEPHONE$208, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$210, 0);
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
            return get_store().count_elements(MODIFIEDBY$210) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$210, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$210);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$210);
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
            get_store().remove_element(MODIFIEDBY$210, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$212, 0);
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
            return get_store().count_elements(MODIFIEDON$212) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$212, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$212);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$212);
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
            get_store().remove_element(MODIFIEDON$212, 0);
        }
    }
    
    /**
     * Gets the "nickname" element
     */
    public java.lang.String getNickname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$214, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nickname" element
     */
    public org.apache.xmlbeans.XmlString xgetNickname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$214, 0);
            return target;
        }
    }
    
    /**
     * True if has "nickname" element
     */
    public boolean isSetNickname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NICKNAME$214) != 0;
        }
    }
    
    /**
     * Sets the "nickname" element
     */
    public void setNickname(java.lang.String nickname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$214, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NICKNAME$214);
            }
            target.setStringValue(nickname);
        }
    }
    
    /**
     * Sets (as xml) the "nickname" element
     */
    public void xsetNickname(org.apache.xmlbeans.XmlString nickname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$214, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NICKNAME$214);
            }
            target.set(nickname);
        }
    }
    
    /**
     * Unsets the "nickname" element
     */
    public void unsetNickname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NICKNAME$214, 0);
        }
    }
    
    /**
     * Gets the "numberofchildren" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getNumberofchildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NUMBEROFCHILDREN$216, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numberofchildren" element
     */
    public boolean isSetNumberofchildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFCHILDREN$216) != 0;
        }
    }
    
    /**
     * Sets the "numberofchildren" element
     */
    public void setNumberofchildren(com.microsoft.schemas.crm._2006.webservices.CrmNumber numberofchildren)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NUMBEROFCHILDREN$216, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NUMBEROFCHILDREN$216);
            }
            target.set(numberofchildren);
        }
    }
    
    /**
     * Appends and returns a new empty "numberofchildren" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNumberofchildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NUMBEROFCHILDREN$216);
            return target;
        }
    }
    
    /**
     * Unsets the "numberofchildren" element
     */
    public void unsetNumberofchildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFCHILDREN$216, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORIGINATINGLEADID$218, 0);
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
            return get_store().count_elements(ORIGINATINGLEADID$218) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORIGINATINGLEADID$218, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORIGINATINGLEADID$218);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORIGINATINGLEADID$218);
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
            get_store().remove_element(ORIGINATINGLEADID$218, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$220, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$220) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$220, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$220);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$220);
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
            get_store().remove_element(OVERRIDDENCREATEDON$220, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$222, 0);
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
            return get_store().count_elements(OWNERID$222) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$222, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$222);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$222);
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
            get_store().remove_element(OWNERID$222, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$224, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$224) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$224, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$224);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$224);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$224, 0);
        }
    }
    
    /**
     * Gets the "pager" element
     */
    public java.lang.String getPager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGER$226, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pager" element
     */
    public org.apache.xmlbeans.XmlString xgetPager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGER$226, 0);
            return target;
        }
    }
    
    /**
     * True if has "pager" element
     */
    public boolean isSetPager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGER$226) != 0;
        }
    }
    
    /**
     * Sets the "pager" element
     */
    public void setPager(java.lang.String pager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGER$226, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGER$226);
            }
            target.setStringValue(pager);
        }
    }
    
    /**
     * Sets (as xml) the "pager" element
     */
    public void xsetPager(org.apache.xmlbeans.XmlString pager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGER$226, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGER$226);
            }
            target.set(pager);
        }
    }
    
    /**
     * Unsets the "pager" element
     */
    public void unsetPager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGER$226, 0);
        }
    }
    
    /**
     * Gets the "parentcustomerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Customer getParentcustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(PARENTCUSTOMERID$228, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parentcustomerid" element
     */
    public boolean isSetParentcustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTCUSTOMERID$228) != 0;
        }
    }
    
    /**
     * Sets the "parentcustomerid" element
     */
    public void setParentcustomerid(com.microsoft.schemas.crm._2006.webservices.Customer parentcustomerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(PARENTCUSTOMERID$228, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(PARENTCUSTOMERID$228);
            }
            target.set(parentcustomerid);
        }
    }
    
    /**
     * Appends and returns a new empty "parentcustomerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Customer addNewParentcustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(PARENTCUSTOMERID$228);
            return target;
        }
    }
    
    /**
     * Unsets the "parentcustomerid" element
     */
    public void unsetParentcustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTCUSTOMERID$228, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(PARTICIPATESINWORKFLOW$230, 0);
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
            return get_store().count_elements(PARTICIPATESINWORKFLOW$230) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(PARTICIPATESINWORKFLOW$230, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(PARTICIPATESINWORKFLOW$230);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(PARTICIPATESINWORKFLOW$230);
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
            get_store().remove_element(PARTICIPATESINWORKFLOW$230, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PAYMENTTERMSCODE$232, 0);
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
            return get_store().count_elements(PAYMENTTERMSCODE$232) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PAYMENTTERMSCODE$232, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PAYMENTTERMSCODE$232);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PAYMENTTERMSCODE$232);
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
            get_store().remove_element(PAYMENTTERMSCODE$232, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDAPPOINTMENTDAYCODE$234, 0);
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
            return get_store().count_elements(PREFERREDAPPOINTMENTDAYCODE$234) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDAPPOINTMENTDAYCODE$234, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDAPPOINTMENTDAYCODE$234);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDAPPOINTMENTDAYCODE$234);
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
            get_store().remove_element(PREFERREDAPPOINTMENTDAYCODE$234, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDAPPOINTMENTTIMECODE$236, 0);
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
            return get_store().count_elements(PREFERREDAPPOINTMENTTIMECODE$236) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDAPPOINTMENTTIMECODE$236, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDAPPOINTMENTTIMECODE$236);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDAPPOINTMENTTIMECODE$236);
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
            get_store().remove_element(PREFERREDAPPOINTMENTTIMECODE$236, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDCONTACTMETHODCODE$238, 0);
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
            return get_store().count_elements(PREFERREDCONTACTMETHODCODE$238) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDCONTACTMETHODCODE$238, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDCONTACTMETHODCODE$238);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDCONTACTMETHODCODE$238);
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
            get_store().remove_element(PREFERREDCONTACTMETHODCODE$238, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDEQUIPMENTID$240, 0);
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
            return get_store().count_elements(PREFERREDEQUIPMENTID$240) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDEQUIPMENTID$240, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDEQUIPMENTID$240);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDEQUIPMENTID$240);
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
            get_store().remove_element(PREFERREDEQUIPMENTID$240, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDSERVICEID$242, 0);
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
            return get_store().count_elements(PREFERREDSERVICEID$242) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDSERVICEID$242, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDSERVICEID$242);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDSERVICEID$242);
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
            get_store().remove_element(PREFERREDSERVICEID$242, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDSYSTEMUSERID$244, 0);
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
            return get_store().count_elements(PREFERREDSYSTEMUSERID$244) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PREFERREDSYSTEMUSERID$244, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDSYSTEMUSERID$244);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PREFERREDSYSTEMUSERID$244);
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
            get_store().remove_element(PREFERREDSYSTEMUSERID$244, 0);
        }
    }
    
    /**
     * Gets the "salutation" element
     */
    public java.lang.String getSalutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALUTATION$246, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "salutation" element
     */
    public org.apache.xmlbeans.XmlString xgetSalutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALUTATION$246, 0);
            return target;
        }
    }
    
    /**
     * True if has "salutation" element
     */
    public boolean isSetSalutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALUTATION$246) != 0;
        }
    }
    
    /**
     * Sets the "salutation" element
     */
    public void setSalutation(java.lang.String salutation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALUTATION$246, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALUTATION$246);
            }
            target.setStringValue(salutation);
        }
    }
    
    /**
     * Sets (as xml) the "salutation" element
     */
    public void xsetSalutation(org.apache.xmlbeans.XmlString salutation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALUTATION$246, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALUTATION$246);
            }
            target.set(salutation);
        }
    }
    
    /**
     * Unsets the "salutation" element
     */
    public void unsetSalutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALUTATION$246, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPPINGMETHODCODE$248, 0);
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
            return get_store().count_elements(SHIPPINGMETHODCODE$248) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPPINGMETHODCODE$248, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPPINGMETHODCODE$248);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPPINGMETHODCODE$248);
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
            get_store().remove_element(SHIPPINGMETHODCODE$248, 0);
        }
    }
    
    /**
     * Gets the "spousesname" element
     */
    public java.lang.String getSpousesname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPOUSESNAME$250, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "spousesname" element
     */
    public org.apache.xmlbeans.XmlString xgetSpousesname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPOUSESNAME$250, 0);
            return target;
        }
    }
    
    /**
     * True if has "spousesname" element
     */
    public boolean isSetSpousesname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPOUSESNAME$250) != 0;
        }
    }
    
    /**
     * Sets the "spousesname" element
     */
    public void setSpousesname(java.lang.String spousesname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPOUSESNAME$250, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPOUSESNAME$250);
            }
            target.setStringValue(spousesname);
        }
    }
    
    /**
     * Sets (as xml) the "spousesname" element
     */
    public void xsetSpousesname(org.apache.xmlbeans.XmlString spousesname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPOUSESNAME$250, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPOUSESNAME$250);
            }
            target.set(spousesname);
        }
    }
    
    /**
     * Unsets the "spousesname" element
     */
    public void unsetSpousesname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPOUSESNAME$250, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ContactStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ContactStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ContactStateInfo)get_store().find_element_user(STATECODE$252, 0);
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
            return get_store().count_elements(STATECODE$252) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.ContactStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ContactStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ContactStateInfo)get_store().find_element_user(STATECODE$252, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ContactStateInfo)get_store().add_element_user(STATECODE$252);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ContactStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ContactStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ContactStateInfo)get_store().add_element_user(STATECODE$252);
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
            get_store().remove_element(STATECODE$252, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$254, 0);
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
            return get_store().count_elements(STATUSCODE$254) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$254, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$254);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$254);
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
            get_store().remove_element(STATUSCODE$254, 0);
        }
    }
    
    /**
     * Gets the "subscriptionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SUBSCRIPTIONID$256, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subscriptionid" element
     */
    public boolean isSetSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONID$256) != 0;
        }
    }
    
    /**
     * Sets the "subscriptionid" element
     */
    public void setSubscriptionid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier subscriptionid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SUBSCRIPTIONID$256, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SUBSCRIPTIONID$256);
            }
            target.set(subscriptionid);
        }
    }
    
    /**
     * Appends and returns a new empty "subscriptionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SUBSCRIPTIONID$256);
            return target;
        }
    }
    
    /**
     * Unsets the "subscriptionid" element
     */
    public void unsetSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONID$256, 0);
        }
    }
    
    /**
     * Gets the "suffix" element
     */
    public java.lang.String getSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$258, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "suffix" element
     */
    public org.apache.xmlbeans.XmlString xgetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUFFIX$258, 0);
            return target;
        }
    }
    
    /**
     * True if has "suffix" element
     */
    public boolean isSetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUFFIX$258) != 0;
        }
    }
    
    /**
     * Sets the "suffix" element
     */
    public void setSuffix(java.lang.String suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUFFIX$258, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUFFIX$258);
            }
            target.setStringValue(suffix);
        }
    }
    
    /**
     * Sets (as xml) the "suffix" element
     */
    public void xsetSuffix(org.apache.xmlbeans.XmlString suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUFFIX$258, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUFFIX$258);
            }
            target.set(suffix);
        }
    }
    
    /**
     * Unsets the "suffix" element
     */
    public void unsetSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUFFIX$258, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$260, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$260, 0);
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
            return get_store().count_elements(TELEPHONE1$260) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$260, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE1$260);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$260, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE1$260);
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
            get_store().remove_element(TELEPHONE1$260, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$262, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$262, 0);
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
            return get_store().count_elements(TELEPHONE2$262) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$262, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE2$262);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$262, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE2$262);
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
            get_store().remove_element(TELEPHONE2$262, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$264, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$264, 0);
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
            return get_store().count_elements(TELEPHONE3$264) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$264, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE3$264);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$264, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE3$264);
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
            get_store().remove_element(TELEPHONE3$264, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TERRITORYCODE$266, 0);
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
            return get_store().count_elements(TERRITORYCODE$266) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TERRITORYCODE$266, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TERRITORYCODE$266);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TERRITORYCODE$266);
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
            get_store().remove_element(TERRITORYCODE$266, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$268, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$268) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$268, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$268);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$268);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$268, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$270, 0);
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
            return get_store().count_elements(TRANSACTIONCURRENCYID$270) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$270, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$270);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$270);
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
            get_store().remove_element(TRANSACTIONCURRENCYID$270, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$272, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$272) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$272, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$272);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$272);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$272, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITEURL$274, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSITEURL$274, 0);
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
            return get_store().count_elements(WEBSITEURL$274) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITEURL$274, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBSITEURL$274);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSITEURL$274, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBSITEURL$274);
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
            get_store().remove_element(WEBSITEURL$274, 0);
        }
    }
    
    /**
     * Gets the "yomifirstname" element
     */
    public java.lang.String getYomifirstname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFIRSTNAME$276, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "yomifirstname" element
     */
    public org.apache.xmlbeans.XmlString xgetYomifirstname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFIRSTNAME$276, 0);
            return target;
        }
    }
    
    /**
     * True if has "yomifirstname" element
     */
    public boolean isSetYomifirstname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YOMIFIRSTNAME$276) != 0;
        }
    }
    
    /**
     * Sets the "yomifirstname" element
     */
    public void setYomifirstname(java.lang.String yomifirstname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFIRSTNAME$276, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIFIRSTNAME$276);
            }
            target.setStringValue(yomifirstname);
        }
    }
    
    /**
     * Sets (as xml) the "yomifirstname" element
     */
    public void xsetYomifirstname(org.apache.xmlbeans.XmlString yomifirstname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFIRSTNAME$276, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIFIRSTNAME$276);
            }
            target.set(yomifirstname);
        }
    }
    
    /**
     * Unsets the "yomifirstname" element
     */
    public void unsetYomifirstname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YOMIFIRSTNAME$276, 0);
        }
    }
    
    /**
     * Gets the "yomifullname" element
     */
    public java.lang.String getYomifullname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFULLNAME$278, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "yomifullname" element
     */
    public org.apache.xmlbeans.XmlString xgetYomifullname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFULLNAME$278, 0);
            return target;
        }
    }
    
    /**
     * True if has "yomifullname" element
     */
    public boolean isSetYomifullname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YOMIFULLNAME$278) != 0;
        }
    }
    
    /**
     * Sets the "yomifullname" element
     */
    public void setYomifullname(java.lang.String yomifullname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFULLNAME$278, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIFULLNAME$278);
            }
            target.setStringValue(yomifullname);
        }
    }
    
    /**
     * Sets (as xml) the "yomifullname" element
     */
    public void xsetYomifullname(org.apache.xmlbeans.XmlString yomifullname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFULLNAME$278, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIFULLNAME$278);
            }
            target.set(yomifullname);
        }
    }
    
    /**
     * Unsets the "yomifullname" element
     */
    public void unsetYomifullname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YOMIFULLNAME$278, 0);
        }
    }
    
    /**
     * Gets the "yomilastname" element
     */
    public java.lang.String getYomilastname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMILASTNAME$280, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "yomilastname" element
     */
    public org.apache.xmlbeans.XmlString xgetYomilastname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMILASTNAME$280, 0);
            return target;
        }
    }
    
    /**
     * True if has "yomilastname" element
     */
    public boolean isSetYomilastname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YOMILASTNAME$280) != 0;
        }
    }
    
    /**
     * Sets the "yomilastname" element
     */
    public void setYomilastname(java.lang.String yomilastname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMILASTNAME$280, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMILASTNAME$280);
            }
            target.setStringValue(yomilastname);
        }
    }
    
    /**
     * Sets (as xml) the "yomilastname" element
     */
    public void xsetYomilastname(org.apache.xmlbeans.XmlString yomilastname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMILASTNAME$280, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMILASTNAME$280);
            }
            target.set(yomilastname);
        }
    }
    
    /**
     * Unsets the "yomilastname" element
     */
    public void unsetYomilastname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YOMILASTNAME$280, 0);
        }
    }
    
    /**
     * Gets the "yomimiddlename" element
     */
    public java.lang.String getYomimiddlename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIMIDDLENAME$282, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "yomimiddlename" element
     */
    public org.apache.xmlbeans.XmlString xgetYomimiddlename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIMIDDLENAME$282, 0);
            return target;
        }
    }
    
    /**
     * True if has "yomimiddlename" element
     */
    public boolean isSetYomimiddlename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YOMIMIDDLENAME$282) != 0;
        }
    }
    
    /**
     * Sets the "yomimiddlename" element
     */
    public void setYomimiddlename(java.lang.String yomimiddlename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIMIDDLENAME$282, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIMIDDLENAME$282);
            }
            target.setStringValue(yomimiddlename);
        }
    }
    
    /**
     * Sets (as xml) the "yomimiddlename" element
     */
    public void xsetYomimiddlename(org.apache.xmlbeans.XmlString yomimiddlename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIMIDDLENAME$282, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIMIDDLENAME$282);
            }
            target.set(yomimiddlename);
        }
    }
    
    /**
     * Unsets the "yomimiddlename" element
     */
    public void unsetYomimiddlename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YOMIMIDDLENAME$282, 0);
        }
    }
}
