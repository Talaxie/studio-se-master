/*
 * XML Type:  lead
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Lead
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML lead(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class LeadImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Lead
{
    
    public LeadImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS1ADDRESSID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_addressid");
    private static final javax.xml.namespace.QName ADDRESS1ADDRESSTYPECODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_addresstypecode");
    private static final javax.xml.namespace.QName ADDRESS1CITY$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_city");
    private static final javax.xml.namespace.QName ADDRESS1COUNTRY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_country");
    private static final javax.xml.namespace.QName ADDRESS1COUNTY$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_county");
    private static final javax.xml.namespace.QName ADDRESS1FAX$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_fax");
    private static final javax.xml.namespace.QName ADDRESS1LATITUDE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_latitude");
    private static final javax.xml.namespace.QName ADDRESS1LINE1$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line1");
    private static final javax.xml.namespace.QName ADDRESS1LINE2$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line2");
    private static final javax.xml.namespace.QName ADDRESS1LINE3$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line3");
    private static final javax.xml.namespace.QName ADDRESS1LONGITUDE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_longitude");
    private static final javax.xml.namespace.QName ADDRESS1NAME$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_name");
    private static final javax.xml.namespace.QName ADDRESS1POSTALCODE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_postalcode");
    private static final javax.xml.namespace.QName ADDRESS1POSTOFFICEBOX$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_postofficebox");
    private static final javax.xml.namespace.QName ADDRESS1SHIPPINGMETHODCODE$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_shippingmethodcode");
    private static final javax.xml.namespace.QName ADDRESS1STATEORPROVINCE$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_stateorprovince");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE1$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone1");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE2$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone2");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE3$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone3");
    private static final javax.xml.namespace.QName ADDRESS1UPSZONE$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_upszone");
    private static final javax.xml.namespace.QName ADDRESS1UTCOFFSET$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_utcoffset");
    private static final javax.xml.namespace.QName ADDRESS2ADDRESSID$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_addressid");
    private static final javax.xml.namespace.QName ADDRESS2ADDRESSTYPECODE$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_addresstypecode");
    private static final javax.xml.namespace.QName ADDRESS2CITY$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_city");
    private static final javax.xml.namespace.QName ADDRESS2COUNTRY$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_country");
    private static final javax.xml.namespace.QName ADDRESS2COUNTY$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_county");
    private static final javax.xml.namespace.QName ADDRESS2FAX$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_fax");
    private static final javax.xml.namespace.QName ADDRESS2LATITUDE$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_latitude");
    private static final javax.xml.namespace.QName ADDRESS2LINE1$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line1");
    private static final javax.xml.namespace.QName ADDRESS2LINE2$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line2");
    private static final javax.xml.namespace.QName ADDRESS2LINE3$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line3");
    private static final javax.xml.namespace.QName ADDRESS2LONGITUDE$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_longitude");
    private static final javax.xml.namespace.QName ADDRESS2NAME$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_name");
    private static final javax.xml.namespace.QName ADDRESS2POSTALCODE$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_postalcode");
    private static final javax.xml.namespace.QName ADDRESS2POSTOFFICEBOX$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_postofficebox");
    private static final javax.xml.namespace.QName ADDRESS2SHIPPINGMETHODCODE$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_shippingmethodcode");
    private static final javax.xml.namespace.QName ADDRESS2STATEORPROVINCE$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_stateorprovince");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE1$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone1");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE2$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone2");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE3$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone3");
    private static final javax.xml.namespace.QName ADDRESS2UPSZONE$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_upszone");
    private static final javax.xml.namespace.QName ADDRESS2UTCOFFSET$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_utcoffset");
    private static final javax.xml.namespace.QName CAMPAIGNID$84 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "campaignid");
    private static final javax.xml.namespace.QName COMPANYNAME$86 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "companyname");
    private static final javax.xml.namespace.QName CREATEDBY$88 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$90 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMERID$92 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customerid");
    private static final javax.xml.namespace.QName DESCRIPTION$94 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName DONOTBULKEMAIL$96 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotbulkemail");
    private static final javax.xml.namespace.QName DONOTEMAIL$98 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotemail");
    private static final javax.xml.namespace.QName DONOTFAX$100 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotfax");
    private static final javax.xml.namespace.QName DONOTPHONE$102 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotphone");
    private static final javax.xml.namespace.QName DONOTPOSTALMAIL$104 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotpostalmail");
    private static final javax.xml.namespace.QName DONOTSENDMM$106 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotsendmm");
    private static final javax.xml.namespace.QName EMAILADDRESS1$108 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress1");
    private static final javax.xml.namespace.QName EMAILADDRESS2$110 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress2");
    private static final javax.xml.namespace.QName EMAILADDRESS3$112 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailaddress3");
    private static final javax.xml.namespace.QName ESTIMATEDAMOUNT$114 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "estimatedamount");
    private static final javax.xml.namespace.QName ESTIMATEDAMOUNTBASE$116 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "estimatedamount_base");
    private static final javax.xml.namespace.QName ESTIMATEDCLOSEDATE$118 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "estimatedclosedate");
    private static final javax.xml.namespace.QName ESTIMATEDVALUE$120 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "estimatedvalue");
    private static final javax.xml.namespace.QName EXCHANGERATE$122 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangerate");
    private static final javax.xml.namespace.QName FAX$124 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fax");
    private static final javax.xml.namespace.QName FIRSTNAME$126 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "firstname");
    private static final javax.xml.namespace.QName FULLNAME$128 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fullname");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$130 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName INDUSTRYCODE$132 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "industrycode");
    private static final javax.xml.namespace.QName JOBTITLE$134 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "jobtitle");
    private static final javax.xml.namespace.QName LASTNAME$136 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lastname");
    private static final javax.xml.namespace.QName LASTUSEDINCAMPAIGN$138 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lastusedincampaign");
    private static final javax.xml.namespace.QName LEADID$140 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "leadid");
    private static final javax.xml.namespace.QName LEADQUALITYCODE$142 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "leadqualitycode");
    private static final javax.xml.namespace.QName LEADSOURCECODE$144 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "leadsourcecode");
    private static final javax.xml.namespace.QName MASTERID$146 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "masterid");
    private static final javax.xml.namespace.QName MERGED$148 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "merged");
    private static final javax.xml.namespace.QName MIDDLENAME$150 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "middlename");
    private static final javax.xml.namespace.QName MOBILEPHONE$152 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "mobilephone");
    private static final javax.xml.namespace.QName MODIFIEDBY$154 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$156 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NUMBEROFEMPLOYEES$158 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "numberofemployees");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$160 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNERID$162 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownerid");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$164 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName PAGER$166 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pager");
    private static final javax.xml.namespace.QName PARTICIPATESINWORKFLOW$168 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "participatesinworkflow");
    private static final javax.xml.namespace.QName PREFERREDCONTACTMETHODCODE$170 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredcontactmethodcode");
    private static final javax.xml.namespace.QName PRIORITYCODE$172 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "prioritycode");
    private static final javax.xml.namespace.QName REVENUE$174 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "revenue");
    private static final javax.xml.namespace.QName REVENUEBASE$176 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "revenue_base");
    private static final javax.xml.namespace.QName SALESSTAGECODE$178 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salesstagecode");
    private static final javax.xml.namespace.QName SALUTATION$180 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salutation");
    private static final javax.xml.namespace.QName SIC$182 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sic");
    private static final javax.xml.namespace.QName STATECODE$184 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$186 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName SUBJECT$188 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subject");
    private static final javax.xml.namespace.QName TELEPHONE1$190 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "telephone1");
    private static final javax.xml.namespace.QName TELEPHONE2$192 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "telephone2");
    private static final javax.xml.namespace.QName TELEPHONE3$194 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "telephone3");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$196 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$198 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$200 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    private static final javax.xml.namespace.QName WEBSITEURL$202 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "websiteurl");
    private static final javax.xml.namespace.QName YOMICOMPANYNAME$204 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomicompanyname");
    private static final javax.xml.namespace.QName YOMIFIRSTNAME$206 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomifirstname");
    private static final javax.xml.namespace.QName YOMIFULLNAME$208 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomifullname");
    private static final javax.xml.namespace.QName YOMILASTNAME$210 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomilastname");
    private static final javax.xml.namespace.QName YOMIMIDDLENAME$212 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomimiddlename");
    
    
    /**
     * Gets the "address1_addressid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getAddress1Addressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS1ADDRESSID$0, 0);
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
            return get_store().count_elements(ADDRESS1ADDRESSID$0) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS1ADDRESSID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS1ADDRESSID$0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS1ADDRESSID$0);
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
            get_store().remove_element(ADDRESS1ADDRESSID$0, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1ADDRESSTYPECODE$2, 0);
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
            return get_store().count_elements(ADDRESS1ADDRESSTYPECODE$2) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1ADDRESSTYPECODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1ADDRESSTYPECODE$2);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1ADDRESSTYPECODE$2);
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
            get_store().remove_element(ADDRESS1ADDRESSTYPECODE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1CITY$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1CITY$4, 0);
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
            return get_store().count_elements(ADDRESS1CITY$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1CITY$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1CITY$4);
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
            get_store().remove_element(ADDRESS1CITY$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTRY$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTRY$6, 0);
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
            return get_store().count_elements(ADDRESS1COUNTRY$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1COUNTRY$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1COUNTRY$6);
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
            get_store().remove_element(ADDRESS1COUNTRY$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTY$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTY$8, 0);
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
            return get_store().count_elements(ADDRESS1COUNTY$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1COUNTY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1COUNTY$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1COUNTY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1COUNTY$8);
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
            get_store().remove_element(ADDRESS1COUNTY$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1FAX$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1FAX$10, 0);
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
            return get_store().count_elements(ADDRESS1FAX$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1FAX$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1FAX$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1FAX$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1FAX$10);
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
            get_store().remove_element(ADDRESS1FAX$10, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LATITUDE$12, 0);
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
            return get_store().count_elements(ADDRESS1LATITUDE$12) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LATITUDE$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LATITUDE$12);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LATITUDE$12);
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
            get_store().remove_element(ADDRESS1LATITUDE$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE1$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE1$14, 0);
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
            return get_store().count_elements(ADDRESS1LINE1$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE1$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE1$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE1$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE1$14);
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
            get_store().remove_element(ADDRESS1LINE1$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE2$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE2$16, 0);
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
            return get_store().count_elements(ADDRESS1LINE2$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE2$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE2$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE2$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE2$16);
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
            get_store().remove_element(ADDRESS1LINE2$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE3$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE3$18, 0);
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
            return get_store().count_elements(ADDRESS1LINE3$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE3$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE3$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE3$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE3$18);
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
            get_store().remove_element(ADDRESS1LINE3$18, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LONGITUDE$20, 0);
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
            return get_store().count_elements(ADDRESS1LONGITUDE$20) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LONGITUDE$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LONGITUDE$20);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LONGITUDE$20);
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
            get_store().remove_element(ADDRESS1LONGITUDE$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1NAME$22, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1NAME$22, 0);
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
            return get_store().count_elements(ADDRESS1NAME$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1NAME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1NAME$22);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1NAME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1NAME$22);
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
            get_store().remove_element(ADDRESS1NAME$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTALCODE$24, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTALCODE$24, 0);
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
            return get_store().count_elements(ADDRESS1POSTALCODE$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTALCODE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1POSTALCODE$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTALCODE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1POSTALCODE$24);
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
            get_store().remove_element(ADDRESS1POSTALCODE$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$26, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$26, 0);
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
            return get_store().count_elements(ADDRESS1POSTOFFICEBOX$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1POSTOFFICEBOX$26);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1POSTOFFICEBOX$26);
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
            get_store().remove_element(ADDRESS1POSTOFFICEBOX$26, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1SHIPPINGMETHODCODE$28, 0);
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
            return get_store().count_elements(ADDRESS1SHIPPINGMETHODCODE$28) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1SHIPPINGMETHODCODE$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1SHIPPINGMETHODCODE$28);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1SHIPPINGMETHODCODE$28);
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
            get_store().remove_element(ADDRESS1SHIPPINGMETHODCODE$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1STATEORPROVINCE$30, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1STATEORPROVINCE$30, 0);
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
            return get_store().count_elements(ADDRESS1STATEORPROVINCE$30) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1STATEORPROVINCE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1STATEORPROVINCE$30);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1STATEORPROVINCE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1STATEORPROVINCE$30);
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
            get_store().remove_element(ADDRESS1STATEORPROVINCE$30, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE1$32, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE1$32, 0);
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
            return get_store().count_elements(ADDRESS1TELEPHONE1$32) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE1$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE1$32);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE1$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE1$32);
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
            get_store().remove_element(ADDRESS1TELEPHONE1$32, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE2$34, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE2$34, 0);
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
            return get_store().count_elements(ADDRESS1TELEPHONE2$34) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE2$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE2$34);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE2$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE2$34);
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
            get_store().remove_element(ADDRESS1TELEPHONE2$34, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE3$36, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE3$36, 0);
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
            return get_store().count_elements(ADDRESS1TELEPHONE3$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE3$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE3$36);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE3$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE3$36);
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
            get_store().remove_element(ADDRESS1TELEPHONE3$36, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1UPSZONE$38, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1UPSZONE$38, 0);
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
            return get_store().count_elements(ADDRESS1UPSZONE$38) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1UPSZONE$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1UPSZONE$38);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1UPSZONE$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1UPSZONE$38);
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
            get_store().remove_element(ADDRESS1UPSZONE$38, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS1UTCOFFSET$40, 0);
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
            return get_store().count_elements(ADDRESS1UTCOFFSET$40) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS1UTCOFFSET$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS1UTCOFFSET$40);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS1UTCOFFSET$40);
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
            get_store().remove_element(ADDRESS1UTCOFFSET$40, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS2ADDRESSID$42, 0);
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
            return get_store().count_elements(ADDRESS2ADDRESSID$42) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS2ADDRESSID$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS2ADDRESSID$42);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS2ADDRESSID$42);
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
            get_store().remove_element(ADDRESS2ADDRESSID$42, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2ADDRESSTYPECODE$44, 0);
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
            return get_store().count_elements(ADDRESS2ADDRESSTYPECODE$44) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2ADDRESSTYPECODE$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2ADDRESSTYPECODE$44);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2ADDRESSTYPECODE$44);
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
            get_store().remove_element(ADDRESS2ADDRESSTYPECODE$44, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2CITY$46, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2CITY$46, 0);
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
            return get_store().count_elements(ADDRESS2CITY$46) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2CITY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2CITY$46);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2CITY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2CITY$46);
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
            get_store().remove_element(ADDRESS2CITY$46, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTRY$48, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTRY$48, 0);
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
            return get_store().count_elements(ADDRESS2COUNTRY$48) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTRY$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2COUNTRY$48);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTRY$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2COUNTRY$48);
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
            get_store().remove_element(ADDRESS2COUNTRY$48, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTY$50, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTY$50, 0);
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
            return get_store().count_elements(ADDRESS2COUNTY$50) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTY$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2COUNTY$50);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTY$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2COUNTY$50);
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
            get_store().remove_element(ADDRESS2COUNTY$50, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2FAX$52, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2FAX$52, 0);
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
            return get_store().count_elements(ADDRESS2FAX$52) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2FAX$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2FAX$52);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2FAX$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2FAX$52);
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
            get_store().remove_element(ADDRESS2FAX$52, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LATITUDE$54, 0);
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
            return get_store().count_elements(ADDRESS2LATITUDE$54) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LATITUDE$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LATITUDE$54);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LATITUDE$54);
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
            get_store().remove_element(ADDRESS2LATITUDE$54, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE1$56, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE1$56, 0);
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
            return get_store().count_elements(ADDRESS2LINE1$56) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE1$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE1$56);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE1$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE1$56);
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
            get_store().remove_element(ADDRESS2LINE1$56, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE2$58, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE2$58, 0);
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
            return get_store().count_elements(ADDRESS2LINE2$58) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE2$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE2$58);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE2$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE2$58);
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
            get_store().remove_element(ADDRESS2LINE2$58, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE3$60, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE3$60, 0);
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
            return get_store().count_elements(ADDRESS2LINE3$60) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE3$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE3$60);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE3$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE3$60);
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
            get_store().remove_element(ADDRESS2LINE3$60, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LONGITUDE$62, 0);
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
            return get_store().count_elements(ADDRESS2LONGITUDE$62) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LONGITUDE$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LONGITUDE$62);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LONGITUDE$62);
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
            get_store().remove_element(ADDRESS2LONGITUDE$62, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2NAME$64, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2NAME$64, 0);
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
            return get_store().count_elements(ADDRESS2NAME$64) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2NAME$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2NAME$64);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2NAME$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2NAME$64);
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
            get_store().remove_element(ADDRESS2NAME$64, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTALCODE$66, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTALCODE$66, 0);
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
            return get_store().count_elements(ADDRESS2POSTALCODE$66) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTALCODE$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2POSTALCODE$66);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTALCODE$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2POSTALCODE$66);
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
            get_store().remove_element(ADDRESS2POSTALCODE$66, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$68, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$68, 0);
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
            return get_store().count_elements(ADDRESS2POSTOFFICEBOX$68) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2POSTOFFICEBOX$68);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2POSTOFFICEBOX$68);
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
            get_store().remove_element(ADDRESS2POSTOFFICEBOX$68, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2SHIPPINGMETHODCODE$70, 0);
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
            return get_store().count_elements(ADDRESS2SHIPPINGMETHODCODE$70) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2SHIPPINGMETHODCODE$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2SHIPPINGMETHODCODE$70);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2SHIPPINGMETHODCODE$70);
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
            get_store().remove_element(ADDRESS2SHIPPINGMETHODCODE$70, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2STATEORPROVINCE$72, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2STATEORPROVINCE$72, 0);
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
            return get_store().count_elements(ADDRESS2STATEORPROVINCE$72) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2STATEORPROVINCE$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2STATEORPROVINCE$72);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2STATEORPROVINCE$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2STATEORPROVINCE$72);
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
            get_store().remove_element(ADDRESS2STATEORPROVINCE$72, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE1$74, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE1$74, 0);
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
            return get_store().count_elements(ADDRESS2TELEPHONE1$74) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE1$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE1$74);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE1$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE1$74);
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
            get_store().remove_element(ADDRESS2TELEPHONE1$74, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE2$76, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE2$76, 0);
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
            return get_store().count_elements(ADDRESS2TELEPHONE2$76) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE2$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE2$76);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE2$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE2$76);
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
            get_store().remove_element(ADDRESS2TELEPHONE2$76, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE3$78, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE3$78, 0);
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
            return get_store().count_elements(ADDRESS2TELEPHONE3$78) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE3$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE3$78);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE3$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE3$78);
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
            get_store().remove_element(ADDRESS2TELEPHONE3$78, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2UPSZONE$80, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2UPSZONE$80, 0);
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
            return get_store().count_elements(ADDRESS2UPSZONE$80) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2UPSZONE$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2UPSZONE$80);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2UPSZONE$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2UPSZONE$80);
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
            get_store().remove_element(ADDRESS2UPSZONE$80, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS2UTCOFFSET$82, 0);
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
            return get_store().count_elements(ADDRESS2UTCOFFSET$82) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS2UTCOFFSET$82, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS2UTCOFFSET$82);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS2UTCOFFSET$82);
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
            get_store().remove_element(ADDRESS2UTCOFFSET$82, 0);
        }
    }
    
    /**
     * Gets the "campaignid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CAMPAIGNID$84, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "campaignid" element
     */
    public boolean isSetCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAMPAIGNID$84) != 0;
        }
    }
    
    /**
     * Sets the "campaignid" element
     */
    public void setCampaignid(com.microsoft.schemas.crm._2006.webservices.Lookup campaignid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CAMPAIGNID$84, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CAMPAIGNID$84);
            }
            target.set(campaignid);
        }
    }
    
    /**
     * Appends and returns a new empty "campaignid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CAMPAIGNID$84);
            return target;
        }
    }
    
    /**
     * Unsets the "campaignid" element
     */
    public void unsetCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAMPAIGNID$84, 0);
        }
    }
    
    /**
     * Gets the "companyname" element
     */
    public java.lang.String getCompanyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$86, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "companyname" element
     */
    public org.apache.xmlbeans.XmlString xgetCompanyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$86, 0);
            return target;
        }
    }
    
    /**
     * True if has "companyname" element
     */
    public boolean isSetCompanyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPANYNAME$86) != 0;
        }
    }
    
    /**
     * Sets the "companyname" element
     */
    public void setCompanyname(java.lang.String companyname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPANYNAME$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPANYNAME$86);
            }
            target.setStringValue(companyname);
        }
    }
    
    /**
     * Sets (as xml) the "companyname" element
     */
    public void xsetCompanyname(org.apache.xmlbeans.XmlString companyname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPANYNAME$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPANYNAME$86);
            }
            target.set(companyname);
        }
    }
    
    /**
     * Unsets the "companyname" element
     */
    public void unsetCompanyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPANYNAME$86, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$88, 0);
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
            return get_store().count_elements(CREATEDBY$88) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$88, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$88);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$88);
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
            get_store().remove_element(CREATEDBY$88, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$90, 0);
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
            return get_store().count_elements(CREATEDON$90) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$90, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$90);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$90);
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
            get_store().remove_element(CREATEDON$90, 0);
        }
    }
    
    /**
     * Gets the "customerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Customer getCustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$92, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customerid" element
     */
    public boolean isSetCustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERID$92) != 0;
        }
    }
    
    /**
     * Sets the "customerid" element
     */
    public void setCustomerid(com.microsoft.schemas.crm._2006.webservices.Customer customerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$92, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$92);
            }
            target.set(customerid);
        }
    }
    
    /**
     * Appends and returns a new empty "customerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Customer addNewCustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$92);
            return target;
        }
    }
    
    /**
     * Unsets the "customerid" element
     */
    public void unsetCustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERID$92, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$94, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$94, 0);
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
            return get_store().count_elements(DESCRIPTION$94) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$94);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$94);
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
            get_store().remove_element(DESCRIPTION$94, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKEMAIL$96, 0);
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
            return get_store().count_elements(DONOTBULKEMAIL$96) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTBULKEMAIL$96, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKEMAIL$96);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTBULKEMAIL$96);
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
            get_store().remove_element(DONOTBULKEMAIL$96, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTEMAIL$98, 0);
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
            return get_store().count_elements(DONOTEMAIL$98) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTEMAIL$98, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTEMAIL$98);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTEMAIL$98);
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
            get_store().remove_element(DONOTEMAIL$98, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTFAX$100, 0);
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
            return get_store().count_elements(DONOTFAX$100) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTFAX$100, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTFAX$100);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTFAX$100);
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
            get_store().remove_element(DONOTFAX$100, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPHONE$102, 0);
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
            return get_store().count_elements(DONOTPHONE$102) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPHONE$102, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPHONE$102);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPHONE$102);
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
            get_store().remove_element(DONOTPHONE$102, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPOSTALMAIL$104, 0);
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
            return get_store().count_elements(DONOTPOSTALMAIL$104) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPOSTALMAIL$104, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPOSTALMAIL$104);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPOSTALMAIL$104);
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
            get_store().remove_element(DONOTPOSTALMAIL$104, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTSENDMM$106, 0);
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
            return get_store().count_elements(DONOTSENDMM$106) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTSENDMM$106, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTSENDMM$106);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTSENDMM$106);
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
            get_store().remove_element(DONOTSENDMM$106, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS1$108, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS1$108, 0);
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
            return get_store().count_elements(EMAILADDRESS1$108) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS1$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS1$108);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS1$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS1$108);
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
            get_store().remove_element(EMAILADDRESS1$108, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS2$110, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS2$110, 0);
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
            return get_store().count_elements(EMAILADDRESS2$110) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS2$110, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS2$110);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS2$110, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS2$110);
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
            get_store().remove_element(EMAILADDRESS2$110, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS3$112, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS3$112, 0);
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
            return get_store().count_elements(EMAILADDRESS3$112) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS3$112, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS3$112);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS3$112, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS3$112);
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
            get_store().remove_element(EMAILADDRESS3$112, 0);
        }
    }
    
    /**
     * Gets the "estimatedamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getEstimatedamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ESTIMATEDAMOUNT$114, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "estimatedamount" element
     */
    public boolean isSetEstimatedamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATEDAMOUNT$114) != 0;
        }
    }
    
    /**
     * Sets the "estimatedamount" element
     */
    public void setEstimatedamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney estimatedamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ESTIMATEDAMOUNT$114, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ESTIMATEDAMOUNT$114);
            }
            target.set(estimatedamount);
        }
    }
    
    /**
     * Appends and returns a new empty "estimatedamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewEstimatedamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ESTIMATEDAMOUNT$114);
            return target;
        }
    }
    
    /**
     * Unsets the "estimatedamount" element
     */
    public void unsetEstimatedamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATEDAMOUNT$114, 0);
        }
    }
    
    /**
     * Gets the "estimatedamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getEstimatedamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ESTIMATEDAMOUNTBASE$116, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "estimatedamount_base" element
     */
    public boolean isSetEstimatedamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATEDAMOUNTBASE$116) != 0;
        }
    }
    
    /**
     * Sets the "estimatedamount_base" element
     */
    public void setEstimatedamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney estimatedamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ESTIMATEDAMOUNTBASE$116, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ESTIMATEDAMOUNTBASE$116);
            }
            target.set(estimatedamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "estimatedamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewEstimatedamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ESTIMATEDAMOUNTBASE$116);
            return target;
        }
    }
    
    /**
     * Unsets the "estimatedamount_base" element
     */
    public void unsetEstimatedamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATEDAMOUNTBASE$116, 0);
        }
    }
    
    /**
     * Gets the "estimatedclosedate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEstimatedclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ESTIMATEDCLOSEDATE$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "estimatedclosedate" element
     */
    public boolean isSetEstimatedclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATEDCLOSEDATE$118) != 0;
        }
    }
    
    /**
     * Sets the "estimatedclosedate" element
     */
    public void setEstimatedclosedate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime estimatedclosedate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ESTIMATEDCLOSEDATE$118, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ESTIMATEDCLOSEDATE$118);
            }
            target.set(estimatedclosedate);
        }
    }
    
    /**
     * Appends and returns a new empty "estimatedclosedate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEstimatedclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ESTIMATEDCLOSEDATE$118);
            return target;
        }
    }
    
    /**
     * Unsets the "estimatedclosedate" element
     */
    public void unsetEstimatedclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATEDCLOSEDATE$118, 0);
        }
    }
    
    /**
     * Gets the "estimatedvalue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat getEstimatedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ESTIMATEDVALUE$120, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "estimatedvalue" element
     */
    public boolean isSetEstimatedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATEDVALUE$120) != 0;
        }
    }
    
    /**
     * Sets the "estimatedvalue" element
     */
    public void setEstimatedvalue(com.microsoft.schemas.crm._2006.webservices.CrmFloat estimatedvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ESTIMATEDVALUE$120, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ESTIMATEDVALUE$120);
            }
            target.set(estimatedvalue);
        }
    }
    
    /**
     * Appends and returns a new empty "estimatedvalue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewEstimatedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ESTIMATEDVALUE$120);
            return target;
        }
    }
    
    /**
     * Unsets the "estimatedvalue" element
     */
    public void unsetEstimatedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATEDVALUE$120, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$122, 0);
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
            return get_store().count_elements(EXCHANGERATE$122) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$122, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$122);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$122);
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
            get_store().remove_element(EXCHANGERATE$122, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$124, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$124, 0);
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
            return get_store().count_elements(FAX$124) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$124, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$124);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$124, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$124);
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
            get_store().remove_element(FAX$124, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$126, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$126, 0);
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
            return get_store().count_elements(FIRSTNAME$126) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$126, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTNAME$126);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$126, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTNAME$126);
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
            get_store().remove_element(FIRSTNAME$126, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$128, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$128, 0);
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
            return get_store().count_elements(FULLNAME$128) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$128, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLNAME$128);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$128, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FULLNAME$128);
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
            get_store().remove_element(FULLNAME$128, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$130, 0);
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
            return get_store().count_elements(IMPORTSEQUENCENUMBER$130) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$130, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$130);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$130);
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
            get_store().remove_element(IMPORTSEQUENCENUMBER$130, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INDUSTRYCODE$132, 0);
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
            return get_store().count_elements(INDUSTRYCODE$132) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INDUSTRYCODE$132, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INDUSTRYCODE$132);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INDUSTRYCODE$132);
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
            get_store().remove_element(INDUSTRYCODE$132, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$134, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$134, 0);
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
            return get_store().count_elements(JOBTITLE$134) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$134, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBTITLE$134);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$134, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBTITLE$134);
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
            get_store().remove_element(JOBTITLE$134, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$136, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$136, 0);
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
            return get_store().count_elements(LASTNAME$136) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$136, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTNAME$136);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$136, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTNAME$136);
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
            get_store().remove_element(LASTNAME$136, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTUSEDINCAMPAIGN$138, 0);
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
            return get_store().count_elements(LASTUSEDINCAMPAIGN$138) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTUSEDINCAMPAIGN$138, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTUSEDINCAMPAIGN$138);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTUSEDINCAMPAIGN$138);
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
            get_store().remove_element(LASTUSEDINCAMPAIGN$138, 0);
        }
    }
    
    /**
     * Gets the "leadid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getLeadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(LEADID$140, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "leadid" element
     */
    public boolean isSetLeadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEADID$140) != 0;
        }
    }
    
    /**
     * Sets the "leadid" element
     */
    public void setLeadid(com.microsoft.schemas.crm._2006.webservices.Key leadid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(LEADID$140, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(LEADID$140);
            }
            target.set(leadid);
        }
    }
    
    /**
     * Appends and returns a new empty "leadid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewLeadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(LEADID$140);
            return target;
        }
    }
    
    /**
     * Unsets the "leadid" element
     */
    public void unsetLeadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEADID$140, 0);
        }
    }
    
    /**
     * Gets the "leadqualitycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getLeadqualitycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(LEADQUALITYCODE$142, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "leadqualitycode" element
     */
    public boolean isSetLeadqualitycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEADQUALITYCODE$142) != 0;
        }
    }
    
    /**
     * Sets the "leadqualitycode" element
     */
    public void setLeadqualitycode(com.microsoft.schemas.crm._2006.webservices.Picklist leadqualitycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(LEADQUALITYCODE$142, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(LEADQUALITYCODE$142);
            }
            target.set(leadqualitycode);
        }
    }
    
    /**
     * Appends and returns a new empty "leadqualitycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewLeadqualitycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(LEADQUALITYCODE$142);
            return target;
        }
    }
    
    /**
     * Unsets the "leadqualitycode" element
     */
    public void unsetLeadqualitycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEADQUALITYCODE$142, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(LEADSOURCECODE$144, 0);
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
            return get_store().count_elements(LEADSOURCECODE$144) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(LEADSOURCECODE$144, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(LEADSOURCECODE$144);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(LEADSOURCECODE$144);
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
            get_store().remove_element(LEADSOURCECODE$144, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MASTERID$146, 0);
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
            return get_store().count_elements(MASTERID$146) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MASTERID$146, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MASTERID$146);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MASTERID$146);
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
            get_store().remove_element(MASTERID$146, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(MERGED$148, 0);
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
            return get_store().count_elements(MERGED$148) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(MERGED$148, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(MERGED$148);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(MERGED$148);
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
            get_store().remove_element(MERGED$148, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$150, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLENAME$150, 0);
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
            return get_store().count_elements(MIDDLENAME$150) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$150, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDDLENAME$150);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLENAME$150, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDDLENAME$150);
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
            get_store().remove_element(MIDDLENAME$150, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$152, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$152, 0);
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
            return get_store().count_elements(MOBILEPHONE$152) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$152, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILEPHONE$152);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$152, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILEPHONE$152);
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
            get_store().remove_element(MOBILEPHONE$152, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$154, 0);
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
            return get_store().count_elements(MODIFIEDBY$154) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$154, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$154);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$154);
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
            get_store().remove_element(MODIFIEDBY$154, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$156, 0);
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
            return get_store().count_elements(MODIFIEDON$156) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$156, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$156);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$156);
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
            get_store().remove_element(MODIFIEDON$156, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NUMBEROFEMPLOYEES$158, 0);
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
            return get_store().count_elements(NUMBEROFEMPLOYEES$158) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NUMBEROFEMPLOYEES$158, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NUMBEROFEMPLOYEES$158);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NUMBEROFEMPLOYEES$158);
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
            get_store().remove_element(NUMBEROFEMPLOYEES$158, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$160, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$160) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$160, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$160);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$160);
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
            get_store().remove_element(OVERRIDDENCREATEDON$160, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$162, 0);
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
            return get_store().count_elements(OWNERID$162) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$162, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$162);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$162);
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
            get_store().remove_element(OWNERID$162, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$164, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$164) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$164, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$164);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$164);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$164, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGER$166, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGER$166, 0);
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
            return get_store().count_elements(PAGER$166) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGER$166, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGER$166);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGER$166, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGER$166);
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
            get_store().remove_element(PAGER$166, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(PARTICIPATESINWORKFLOW$168, 0);
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
            return get_store().count_elements(PARTICIPATESINWORKFLOW$168) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(PARTICIPATESINWORKFLOW$168, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(PARTICIPATESINWORKFLOW$168);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(PARTICIPATESINWORKFLOW$168);
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
            get_store().remove_element(PARTICIPATESINWORKFLOW$168, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDCONTACTMETHODCODE$170, 0);
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
            return get_store().count_elements(PREFERREDCONTACTMETHODCODE$170) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDCONTACTMETHODCODE$170, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDCONTACTMETHODCODE$170);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDCONTACTMETHODCODE$170);
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
            get_store().remove_element(PREFERREDCONTACTMETHODCODE$170, 0);
        }
    }
    
    /**
     * Gets the "prioritycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPrioritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRIORITYCODE$172, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prioritycode" element
     */
    public boolean isSetPrioritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITYCODE$172) != 0;
        }
    }
    
    /**
     * Sets the "prioritycode" element
     */
    public void setPrioritycode(com.microsoft.schemas.crm._2006.webservices.Picklist prioritycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRIORITYCODE$172, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRIORITYCODE$172);
            }
            target.set(prioritycode);
        }
    }
    
    /**
     * Appends and returns a new empty "prioritycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPrioritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRIORITYCODE$172);
            return target;
        }
    }
    
    /**
     * Unsets the "prioritycode" element
     */
    public void unsetPrioritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITYCODE$172, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(REVENUE$174, 0);
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
            return get_store().count_elements(REVENUE$174) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(REVENUE$174, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(REVENUE$174);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(REVENUE$174);
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
            get_store().remove_element(REVENUE$174, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(REVENUEBASE$176, 0);
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
            return get_store().count_elements(REVENUEBASE$176) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(REVENUEBASE$176, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(REVENUEBASE$176);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(REVENUEBASE$176);
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
            get_store().remove_element(REVENUEBASE$176, 0);
        }
    }
    
    /**
     * Gets the "salesstagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getSalesstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SALESSTAGECODE$178, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "salesstagecode" element
     */
    public boolean isSetSalesstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESSTAGECODE$178) != 0;
        }
    }
    
    /**
     * Sets the "salesstagecode" element
     */
    public void setSalesstagecode(com.microsoft.schemas.crm._2006.webservices.Picklist salesstagecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SALESSTAGECODE$178, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SALESSTAGECODE$178);
            }
            target.set(salesstagecode);
        }
    }
    
    /**
     * Appends and returns a new empty "salesstagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewSalesstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SALESSTAGECODE$178);
            return target;
        }
    }
    
    /**
     * Unsets the "salesstagecode" element
     */
    public void unsetSalesstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESSTAGECODE$178, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALUTATION$180, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALUTATION$180, 0);
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
            return get_store().count_elements(SALUTATION$180) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALUTATION$180, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALUTATION$180);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALUTATION$180, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALUTATION$180);
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
            get_store().remove_element(SALUTATION$180, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIC$182, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIC$182, 0);
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
            return get_store().count_elements(SIC$182) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIC$182, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIC$182);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIC$182, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIC$182);
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
            get_store().remove_element(SIC$182, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LeadStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LeadStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LeadStateInfo)get_store().find_element_user(STATECODE$184, 0);
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
            return get_store().count_elements(STATECODE$184) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.LeadStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LeadStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LeadStateInfo)get_store().find_element_user(STATECODE$184, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.LeadStateInfo)get_store().add_element_user(STATECODE$184);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LeadStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LeadStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LeadStateInfo)get_store().add_element_user(STATECODE$184);
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
            get_store().remove_element(STATECODE$184, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$186, 0);
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
            return get_store().count_elements(STATUSCODE$186) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$186, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$186);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$186);
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
            get_store().remove_element(STATUSCODE$186, 0);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public java.lang.String getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$188, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subject" element
     */
    public org.apache.xmlbeans.XmlString xgetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$188, 0);
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$188) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(java.lang.String subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$188, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECT$188);
            }
            target.setStringValue(subject);
        }
    }
    
    /**
     * Sets (as xml) the "subject" element
     */
    public void xsetSubject(org.apache.xmlbeans.XmlString subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$188, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECT$188);
            }
            target.set(subject);
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$188, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$190, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$190, 0);
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
            return get_store().count_elements(TELEPHONE1$190) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE1$190, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE1$190);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE1$190, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE1$190);
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
            get_store().remove_element(TELEPHONE1$190, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$192, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$192, 0);
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
            return get_store().count_elements(TELEPHONE2$192) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE2$192, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE2$192);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE2$192, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE2$192);
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
            get_store().remove_element(TELEPHONE2$192, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$194, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$194, 0);
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
            return get_store().count_elements(TELEPHONE3$194) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE3$194, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE3$194);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE3$194, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE3$194);
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
            get_store().remove_element(TELEPHONE3$194, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$196, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$196) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$196, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$196);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$196);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$196, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$198, 0);
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
            return get_store().count_elements(TRANSACTIONCURRENCYID$198) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$198, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$198);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$198);
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
            get_store().remove_element(TRANSACTIONCURRENCYID$198, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$200, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$200) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$200, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$200);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$200);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$200, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITEURL$202, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSITEURL$202, 0);
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
            return get_store().count_elements(WEBSITEURL$202) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBSITEURL$202, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBSITEURL$202);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEBSITEURL$202, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEBSITEURL$202);
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
            get_store().remove_element(WEBSITEURL$202, 0);
        }
    }
    
    /**
     * Gets the "yomicompanyname" element
     */
    public java.lang.String getYomicompanyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMICOMPANYNAME$204, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "yomicompanyname" element
     */
    public org.apache.xmlbeans.XmlString xgetYomicompanyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMICOMPANYNAME$204, 0);
            return target;
        }
    }
    
    /**
     * True if has "yomicompanyname" element
     */
    public boolean isSetYomicompanyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YOMICOMPANYNAME$204) != 0;
        }
    }
    
    /**
     * Sets the "yomicompanyname" element
     */
    public void setYomicompanyname(java.lang.String yomicompanyname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMICOMPANYNAME$204, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMICOMPANYNAME$204);
            }
            target.setStringValue(yomicompanyname);
        }
    }
    
    /**
     * Sets (as xml) the "yomicompanyname" element
     */
    public void xsetYomicompanyname(org.apache.xmlbeans.XmlString yomicompanyname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMICOMPANYNAME$204, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMICOMPANYNAME$204);
            }
            target.set(yomicompanyname);
        }
    }
    
    /**
     * Unsets the "yomicompanyname" element
     */
    public void unsetYomicompanyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YOMICOMPANYNAME$204, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFIRSTNAME$206, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFIRSTNAME$206, 0);
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
            return get_store().count_elements(YOMIFIRSTNAME$206) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFIRSTNAME$206, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIFIRSTNAME$206);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFIRSTNAME$206, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIFIRSTNAME$206);
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
            get_store().remove_element(YOMIFIRSTNAME$206, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFULLNAME$208, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFULLNAME$208, 0);
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
            return get_store().count_elements(YOMIFULLNAME$208) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFULLNAME$208, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIFULLNAME$208);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFULLNAME$208, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIFULLNAME$208);
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
            get_store().remove_element(YOMIFULLNAME$208, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMILASTNAME$210, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMILASTNAME$210, 0);
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
            return get_store().count_elements(YOMILASTNAME$210) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMILASTNAME$210, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMILASTNAME$210);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMILASTNAME$210, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMILASTNAME$210);
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
            get_store().remove_element(YOMILASTNAME$210, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIMIDDLENAME$212, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIMIDDLENAME$212, 0);
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
            return get_store().count_elements(YOMIMIDDLENAME$212) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIMIDDLENAME$212, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIMIDDLENAME$212);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIMIDDLENAME$212, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIMIDDLENAME$212);
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
            get_store().remove_element(YOMIMIDDLENAME$212, 0);
        }
    }
}
