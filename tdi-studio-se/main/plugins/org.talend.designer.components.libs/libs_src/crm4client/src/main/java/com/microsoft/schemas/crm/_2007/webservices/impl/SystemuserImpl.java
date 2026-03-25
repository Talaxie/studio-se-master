/*
 * XML Type:  systemuser
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Systemuser
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML systemuser(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SystemuserImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Systemuser
{
    
    public SystemuserImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSMODE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "accessmode");
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
    private static final javax.xml.namespace.QName ADDRESS1LATITUDE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_latitude");
    private static final javax.xml.namespace.QName ADDRESS1LINE1$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line1");
    private static final javax.xml.namespace.QName ADDRESS1LINE2$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line2");
    private static final javax.xml.namespace.QName ADDRESS1LINE3$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_line3");
    private static final javax.xml.namespace.QName ADDRESS1LONGITUDE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_longitude");
    private static final javax.xml.namespace.QName ADDRESS1NAME$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_name");
    private static final javax.xml.namespace.QName ADDRESS1POSTALCODE$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_postalcode");
    private static final javax.xml.namespace.QName ADDRESS1POSTOFFICEBOX$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_postofficebox");
    private static final javax.xml.namespace.QName ADDRESS1SHIPPINGMETHODCODE$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_shippingmethodcode");
    private static final javax.xml.namespace.QName ADDRESS1STATEORPROVINCE$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_stateorprovince");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE1$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone1");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE2$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone2");
    private static final javax.xml.namespace.QName ADDRESS1TELEPHONE3$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_telephone3");
    private static final javax.xml.namespace.QName ADDRESS1UPSZONE$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_upszone");
    private static final javax.xml.namespace.QName ADDRESS1UTCOFFSET$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address1_utcoffset");
    private static final javax.xml.namespace.QName ADDRESS2ADDRESSID$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_addressid");
    private static final javax.xml.namespace.QName ADDRESS2ADDRESSTYPECODE$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_addresstypecode");
    private static final javax.xml.namespace.QName ADDRESS2CITY$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_city");
    private static final javax.xml.namespace.QName ADDRESS2COUNTRY$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_country");
    private static final javax.xml.namespace.QName ADDRESS2COUNTY$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_county");
    private static final javax.xml.namespace.QName ADDRESS2FAX$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_fax");
    private static final javax.xml.namespace.QName ADDRESS2LATITUDE$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_latitude");
    private static final javax.xml.namespace.QName ADDRESS2LINE1$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line1");
    private static final javax.xml.namespace.QName ADDRESS2LINE2$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line2");
    private static final javax.xml.namespace.QName ADDRESS2LINE3$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_line3");
    private static final javax.xml.namespace.QName ADDRESS2LONGITUDE$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_longitude");
    private static final javax.xml.namespace.QName ADDRESS2NAME$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_name");
    private static final javax.xml.namespace.QName ADDRESS2POSTALCODE$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_postalcode");
    private static final javax.xml.namespace.QName ADDRESS2POSTOFFICEBOX$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_postofficebox");
    private static final javax.xml.namespace.QName ADDRESS2SHIPPINGMETHODCODE$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_shippingmethodcode");
    private static final javax.xml.namespace.QName ADDRESS2STATEORPROVINCE$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_stateorprovince");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE1$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone1");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE2$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone2");
    private static final javax.xml.namespace.QName ADDRESS2TELEPHONE3$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_telephone3");
    private static final javax.xml.namespace.QName ADDRESS2UPSZONE$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_upszone");
    private static final javax.xml.namespace.QName ADDRESS2UTCOFFSET$84 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "address2_utcoffset");
    private static final javax.xml.namespace.QName BUSINESSUNITID$86 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "businessunitid");
    private static final javax.xml.namespace.QName CALENDARID$88 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "calendarid");
    private static final javax.xml.namespace.QName CREATEDBY$90 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$92 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DISABLEDREASON$94 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "disabledreason");
    private static final javax.xml.namespace.QName DISPLAYINSERVICEVIEWS$96 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "displayinserviceviews");
    private static final javax.xml.namespace.QName DOMAINNAME$98 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "domainname");
    private static final javax.xml.namespace.QName EMPLOYEEID$100 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "employeeid");
    private static final javax.xml.namespace.QName FIRSTNAME$102 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "firstname");
    private static final javax.xml.namespace.QName FULLNAME$104 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fullname");
    private static final javax.xml.namespace.QName GOVERNMENTID$106 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "governmentid");
    private static final javax.xml.namespace.QName HOMEPHONE$108 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "homephone");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$110 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName INCOMINGEMAILDELIVERYMETHOD$112 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "incomingemaildeliverymethod");
    private static final javax.xml.namespace.QName INTERNALEMAILADDRESS$114 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "internalemailaddress");
    private static final javax.xml.namespace.QName INVITESTATUSCODE$116 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "invitestatuscode");
    private static final javax.xml.namespace.QName ISDISABLED$118 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isdisabled");
    private static final javax.xml.namespace.QName JOBTITLE$120 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "jobtitle");
    private static final javax.xml.namespace.QName LASTNAME$122 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lastname");
    private static final javax.xml.namespace.QName MIDDLENAME$124 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "middlename");
    private static final javax.xml.namespace.QName MOBILEALERTEMAIL$126 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "mobilealertemail");
    private static final javax.xml.namespace.QName MOBILEPHONE$128 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "mobilephone");
    private static final javax.xml.namespace.QName MODIFIEDBY$130 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$132 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NICKNAME$134 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "nickname");
    private static final javax.xml.namespace.QName ORGANIZATIONID$136 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName OUTGOINGEMAILDELIVERYMETHOD$138 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "outgoingemaildeliverymethod");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$140 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName PARENTSYSTEMUSERID$142 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parentsystemuserid");
    private static final javax.xml.namespace.QName PASSPORTHI$144 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "passporthi");
    private static final javax.xml.namespace.QName PASSPORTLO$146 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "passportlo");
    private static final javax.xml.namespace.QName PERSONALEMAILADDRESS$148 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "personalemailaddress");
    private static final javax.xml.namespace.QName PHOTOURL$150 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "photourl");
    private static final javax.xml.namespace.QName PREFERREDADDRESSCODE$152 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredaddresscode");
    private static final javax.xml.namespace.QName PREFERREDEMAILCODE$154 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredemailcode");
    private static final javax.xml.namespace.QName PREFERREDPHONECODE$156 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "preferredphonecode");
    private static final javax.xml.namespace.QName SALUTATION$158 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salutation");
    private static final javax.xml.namespace.QName SETUPUSER$160 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "setupuser");
    private static final javax.xml.namespace.QName SITEID$162 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "siteid");
    private static final javax.xml.namespace.QName SKILLS$164 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "skills");
    private static final javax.xml.namespace.QName SYSTEMUSERID$166 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "systemuserid");
    private static final javax.xml.namespace.QName TERRITORYID$168 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "territoryid");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$170 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TITLE$172 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "title");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$174 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    private static final javax.xml.namespace.QName WINDOWSLIVEID$176 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "windowsliveid");
    private static final javax.xml.namespace.QName YOMIFIRSTNAME$178 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomifirstname");
    private static final javax.xml.namespace.QName YOMIFULLNAME$180 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomifullname");
    private static final javax.xml.namespace.QName YOMILASTNAME$182 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomilastname");
    private static final javax.xml.namespace.QName YOMIMIDDLENAME$184 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yomimiddlename");
    
    
    /**
     * Gets the "accessmode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAccessmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCESSMODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accessmode" element
     */
    public boolean isSetAccessmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSMODE$0) != 0;
        }
    }
    
    /**
     * Sets the "accessmode" element
     */
    public void setAccessmode(com.microsoft.schemas.crm._2006.webservices.Picklist accessmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ACCESSMODE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCESSMODE$0);
            }
            target.set(accessmode);
        }
    }
    
    /**
     * Appends and returns a new empty "accessmode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAccessmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ACCESSMODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "accessmode" element
     */
    public void unsetAccessmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSMODE$0, 0);
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
     * Gets the "address1_latitude" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat getAddress1Latitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LATITUDE$14, 0);
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
            return get_store().count_elements(ADDRESS1LATITUDE$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LATITUDE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LATITUDE$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LATITUDE$14);
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
            get_store().remove_element(ADDRESS1LATITUDE$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE1$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE1$16, 0);
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
            return get_store().count_elements(ADDRESS1LINE1$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE1$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE1$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE1$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE1$16);
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
            get_store().remove_element(ADDRESS1LINE1$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE2$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE2$18, 0);
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
            return get_store().count_elements(ADDRESS1LINE2$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE2$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE2$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE2$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE2$18);
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
            get_store().remove_element(ADDRESS1LINE2$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE3$20, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE3$20, 0);
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
            return get_store().count_elements(ADDRESS1LINE3$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1LINE3$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1LINE3$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1LINE3$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1LINE3$20);
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
            get_store().remove_element(ADDRESS1LINE3$20, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LONGITUDE$22, 0);
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
            return get_store().count_elements(ADDRESS1LONGITUDE$22) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS1LONGITUDE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LONGITUDE$22);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS1LONGITUDE$22);
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
            get_store().remove_element(ADDRESS1LONGITUDE$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1NAME$24, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1NAME$24, 0);
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
            return get_store().count_elements(ADDRESS1NAME$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1NAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1NAME$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1NAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1NAME$24);
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
            get_store().remove_element(ADDRESS1NAME$24, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTALCODE$26, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTALCODE$26, 0);
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
            return get_store().count_elements(ADDRESS1POSTALCODE$26) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTALCODE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1POSTALCODE$26);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTALCODE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1POSTALCODE$26);
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
            get_store().remove_element(ADDRESS1POSTALCODE$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$28, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$28, 0);
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
            return get_store().count_elements(ADDRESS1POSTOFFICEBOX$28) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1POSTOFFICEBOX$28);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1POSTOFFICEBOX$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1POSTOFFICEBOX$28);
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
            get_store().remove_element(ADDRESS1POSTOFFICEBOX$28, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1SHIPPINGMETHODCODE$30, 0);
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
            return get_store().count_elements(ADDRESS1SHIPPINGMETHODCODE$30) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS1SHIPPINGMETHODCODE$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1SHIPPINGMETHODCODE$30);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS1SHIPPINGMETHODCODE$30);
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
            get_store().remove_element(ADDRESS1SHIPPINGMETHODCODE$30, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1STATEORPROVINCE$32, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1STATEORPROVINCE$32, 0);
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
            return get_store().count_elements(ADDRESS1STATEORPROVINCE$32) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1STATEORPROVINCE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1STATEORPROVINCE$32);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1STATEORPROVINCE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1STATEORPROVINCE$32);
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
            get_store().remove_element(ADDRESS1STATEORPROVINCE$32, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE1$34, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE1$34, 0);
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
            return get_store().count_elements(ADDRESS1TELEPHONE1$34) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE1$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE1$34);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE1$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE1$34);
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
            get_store().remove_element(ADDRESS1TELEPHONE1$34, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE2$36, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE2$36, 0);
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
            return get_store().count_elements(ADDRESS1TELEPHONE2$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE2$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE2$36);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE2$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE2$36);
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
            get_store().remove_element(ADDRESS1TELEPHONE2$36, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE3$38, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE3$38, 0);
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
            return get_store().count_elements(ADDRESS1TELEPHONE3$38) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1TELEPHONE3$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1TELEPHONE3$38);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1TELEPHONE3$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1TELEPHONE3$38);
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
            get_store().remove_element(ADDRESS1TELEPHONE3$38, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1UPSZONE$40, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1UPSZONE$40, 0);
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
            return get_store().count_elements(ADDRESS1UPSZONE$40) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS1UPSZONE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS1UPSZONE$40);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS1UPSZONE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS1UPSZONE$40);
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
            get_store().remove_element(ADDRESS1UPSZONE$40, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS1UTCOFFSET$42, 0);
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
            return get_store().count_elements(ADDRESS1UTCOFFSET$42) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS1UTCOFFSET$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS1UTCOFFSET$42);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS1UTCOFFSET$42);
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
            get_store().remove_element(ADDRESS1UTCOFFSET$42, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS2ADDRESSID$44, 0);
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
            return get_store().count_elements(ADDRESS2ADDRESSID$44) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ADDRESS2ADDRESSID$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS2ADDRESSID$44);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ADDRESS2ADDRESSID$44);
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
            get_store().remove_element(ADDRESS2ADDRESSID$44, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2ADDRESSTYPECODE$46, 0);
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
            return get_store().count_elements(ADDRESS2ADDRESSTYPECODE$46) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2ADDRESSTYPECODE$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2ADDRESSTYPECODE$46);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2ADDRESSTYPECODE$46);
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
            get_store().remove_element(ADDRESS2ADDRESSTYPECODE$46, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2CITY$48, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2CITY$48, 0);
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
            return get_store().count_elements(ADDRESS2CITY$48) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2CITY$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2CITY$48);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2CITY$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2CITY$48);
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
            get_store().remove_element(ADDRESS2CITY$48, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTRY$50, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTRY$50, 0);
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
            return get_store().count_elements(ADDRESS2COUNTRY$50) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTRY$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2COUNTRY$50);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTRY$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2COUNTRY$50);
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
            get_store().remove_element(ADDRESS2COUNTRY$50, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTY$52, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTY$52, 0);
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
            return get_store().count_elements(ADDRESS2COUNTY$52) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2COUNTY$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2COUNTY$52);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2COUNTY$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2COUNTY$52);
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
            get_store().remove_element(ADDRESS2COUNTY$52, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2FAX$54, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2FAX$54, 0);
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
            return get_store().count_elements(ADDRESS2FAX$54) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2FAX$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2FAX$54);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2FAX$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2FAX$54);
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
            get_store().remove_element(ADDRESS2FAX$54, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LATITUDE$56, 0);
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
            return get_store().count_elements(ADDRESS2LATITUDE$56) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LATITUDE$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LATITUDE$56);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LATITUDE$56);
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
            get_store().remove_element(ADDRESS2LATITUDE$56, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE1$58, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE1$58, 0);
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
            return get_store().count_elements(ADDRESS2LINE1$58) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE1$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE1$58);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE1$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE1$58);
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
            get_store().remove_element(ADDRESS2LINE1$58, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE2$60, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE2$60, 0);
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
            return get_store().count_elements(ADDRESS2LINE2$60) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE2$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE2$60);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE2$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE2$60);
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
            get_store().remove_element(ADDRESS2LINE2$60, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE3$62, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE3$62, 0);
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
            return get_store().count_elements(ADDRESS2LINE3$62) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2LINE3$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2LINE3$62);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2LINE3$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2LINE3$62);
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
            get_store().remove_element(ADDRESS2LINE3$62, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LONGITUDE$64, 0);
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
            return get_store().count_elements(ADDRESS2LONGITUDE$64) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(ADDRESS2LONGITUDE$64, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LONGITUDE$64);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(ADDRESS2LONGITUDE$64);
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
            get_store().remove_element(ADDRESS2LONGITUDE$64, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2NAME$66, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2NAME$66, 0);
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
            return get_store().count_elements(ADDRESS2NAME$66) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2NAME$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2NAME$66);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2NAME$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2NAME$66);
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
            get_store().remove_element(ADDRESS2NAME$66, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTALCODE$68, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTALCODE$68, 0);
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
            return get_store().count_elements(ADDRESS2POSTALCODE$68) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTALCODE$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2POSTALCODE$68);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTALCODE$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2POSTALCODE$68);
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
            get_store().remove_element(ADDRESS2POSTALCODE$68, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$70, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$70, 0);
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
            return get_store().count_elements(ADDRESS2POSTOFFICEBOX$70) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2POSTOFFICEBOX$70);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2POSTOFFICEBOX$70, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2POSTOFFICEBOX$70);
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
            get_store().remove_element(ADDRESS2POSTOFFICEBOX$70, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2SHIPPINGMETHODCODE$72, 0);
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
            return get_store().count_elements(ADDRESS2SHIPPINGMETHODCODE$72) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ADDRESS2SHIPPINGMETHODCODE$72, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2SHIPPINGMETHODCODE$72);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ADDRESS2SHIPPINGMETHODCODE$72);
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
            get_store().remove_element(ADDRESS2SHIPPINGMETHODCODE$72, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2STATEORPROVINCE$74, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2STATEORPROVINCE$74, 0);
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
            return get_store().count_elements(ADDRESS2STATEORPROVINCE$74) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2STATEORPROVINCE$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2STATEORPROVINCE$74);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2STATEORPROVINCE$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2STATEORPROVINCE$74);
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
            get_store().remove_element(ADDRESS2STATEORPROVINCE$74, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE1$76, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE1$76, 0);
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
            return get_store().count_elements(ADDRESS2TELEPHONE1$76) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE1$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE1$76);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE1$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE1$76);
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
            get_store().remove_element(ADDRESS2TELEPHONE1$76, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE2$78, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE2$78, 0);
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
            return get_store().count_elements(ADDRESS2TELEPHONE2$78) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE2$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE2$78);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE2$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE2$78);
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
            get_store().remove_element(ADDRESS2TELEPHONE2$78, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE3$80, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE3$80, 0);
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
            return get_store().count_elements(ADDRESS2TELEPHONE3$80) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2TELEPHONE3$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2TELEPHONE3$80);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2TELEPHONE3$80, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2TELEPHONE3$80);
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
            get_store().remove_element(ADDRESS2TELEPHONE3$80, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2UPSZONE$82, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2UPSZONE$82, 0);
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
            return get_store().count_elements(ADDRESS2UPSZONE$82) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS2UPSZONE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS2UPSZONE$82);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS2UPSZONE$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS2UPSZONE$82);
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
            get_store().remove_element(ADDRESS2UPSZONE$82, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS2UTCOFFSET$84, 0);
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
            return get_store().count_elements(ADDRESS2UTCOFFSET$84) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESS2UTCOFFSET$84, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS2UTCOFFSET$84);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESS2UTCOFFSET$84);
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
            get_store().remove_element(ADDRESS2UTCOFFSET$84, 0);
        }
    }
    
    /**
     * Gets the "businessunitid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BUSINESSUNITID$86, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "businessunitid" element
     */
    public boolean isSetBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSUNITID$86) != 0;
        }
    }
    
    /**
     * Sets the "businessunitid" element
     */
    public void setBusinessunitid(com.microsoft.schemas.crm._2006.webservices.Lookup businessunitid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BUSINESSUNITID$86, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BUSINESSUNITID$86);
            }
            target.set(businessunitid);
        }
    }
    
    /**
     * Appends and returns a new empty "businessunitid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BUSINESSUNITID$86);
            return target;
        }
    }
    
    /**
     * Unsets the "businessunitid" element
     */
    public void unsetBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSUNITID$86, 0);
        }
    }
    
    /**
     * Gets the "calendarid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CALENDARID$88, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "calendarid" element
     */
    public boolean isSetCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALENDARID$88) != 0;
        }
    }
    
    /**
     * Sets the "calendarid" element
     */
    public void setCalendarid(com.microsoft.schemas.crm._2006.webservices.Lookup calendarid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CALENDARID$88, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CALENDARID$88);
            }
            target.set(calendarid);
        }
    }
    
    /**
     * Appends and returns a new empty "calendarid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CALENDARID$88);
            return target;
        }
    }
    
    /**
     * Unsets the "calendarid" element
     */
    public void unsetCalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALENDARID$88, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$90, 0);
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
            return get_store().count_elements(CREATEDBY$90) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$90, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$90);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$90);
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
            get_store().remove_element(CREATEDBY$90, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$92, 0);
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
            return get_store().count_elements(CREATEDON$92) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$92, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$92);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$92);
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
            get_store().remove_element(CREATEDON$92, 0);
        }
    }
    
    /**
     * Gets the "disabledreason" element
     */
    public java.lang.String getDisabledreason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEDREASON$94, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "disabledreason" element
     */
    public org.apache.xmlbeans.XmlString xgetDisabledreason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISABLEDREASON$94, 0);
            return target;
        }
    }
    
    /**
     * True if has "disabledreason" element
     */
    public boolean isSetDisabledreason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISABLEDREASON$94) != 0;
        }
    }
    
    /**
     * Sets the "disabledreason" element
     */
    public void setDisabledreason(java.lang.String disabledreason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEDREASON$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISABLEDREASON$94);
            }
            target.setStringValue(disabledreason);
        }
    }
    
    /**
     * Sets (as xml) the "disabledreason" element
     */
    public void xsetDisabledreason(org.apache.xmlbeans.XmlString disabledreason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISABLEDREASON$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISABLEDREASON$94);
            }
            target.set(disabledreason);
        }
    }
    
    /**
     * Unsets the "disabledreason" element
     */
    public void unsetDisabledreason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISABLEDREASON$94, 0);
        }
    }
    
    /**
     * Gets the "displayinserviceviews" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDisplayinserviceviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DISPLAYINSERVICEVIEWS$96, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "displayinserviceviews" element
     */
    public boolean isSetDisplayinserviceviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYINSERVICEVIEWS$96) != 0;
        }
    }
    
    /**
     * Sets the "displayinserviceviews" element
     */
    public void setDisplayinserviceviews(com.microsoft.schemas.crm._2006.webservices.CrmBoolean displayinserviceviews)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DISPLAYINSERVICEVIEWS$96, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DISPLAYINSERVICEVIEWS$96);
            }
            target.set(displayinserviceviews);
        }
    }
    
    /**
     * Appends and returns a new empty "displayinserviceviews" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDisplayinserviceviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DISPLAYINSERVICEVIEWS$96);
            return target;
        }
    }
    
    /**
     * Unsets the "displayinserviceviews" element
     */
    public void unsetDisplayinserviceviews()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYINSERVICEVIEWS$96, 0);
        }
    }
    
    /**
     * Gets the "domainname" element
     */
    public java.lang.String getDomainname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$98, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domainname" element
     */
    public org.apache.xmlbeans.XmlString xgetDomainname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$98, 0);
            return target;
        }
    }
    
    /**
     * True if has "domainname" element
     */
    public boolean isSetDomainname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINNAME$98) != 0;
        }
    }
    
    /**
     * Sets the "domainname" element
     */
    public void setDomainname(java.lang.String domainname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINNAME$98);
            }
            target.setStringValue(domainname);
        }
    }
    
    /**
     * Sets (as xml) the "domainname" element
     */
    public void xsetDomainname(org.apache.xmlbeans.XmlString domainname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAINNAME$98);
            }
            target.set(domainname);
        }
    }
    
    /**
     * Unsets the "domainname" element
     */
    public void unsetDomainname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINNAME$98, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEEID$100, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYEEID$100, 0);
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
            return get_store().count_elements(EMPLOYEEID$100) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEEID$100, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYEEID$100);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMPLOYEEID$100, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMPLOYEEID$100);
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
            get_store().remove_element(EMPLOYEEID$100, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$102, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$102, 0);
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
            return get_store().count_elements(FIRSTNAME$102) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNAME$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTNAME$102);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIRSTNAME$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIRSTNAME$102);
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
            get_store().remove_element(FIRSTNAME$102, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$104, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$104, 0);
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
            return get_store().count_elements(FULLNAME$104) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FULLNAME$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FULLNAME$104);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FULLNAME$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FULLNAME$104);
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
            get_store().remove_element(FULLNAME$104, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOVERNMENTID$106, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOVERNMENTID$106, 0);
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
            return get_store().count_elements(GOVERNMENTID$106) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOVERNMENTID$106, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOVERNMENTID$106);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GOVERNMENTID$106, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GOVERNMENTID$106);
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
            get_store().remove_element(GOVERNMENTID$106, 0);
        }
    }
    
    /**
     * Gets the "homephone" element
     */
    public java.lang.String getHomephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEPHONE$108, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "homephone" element
     */
    public org.apache.xmlbeans.XmlString xgetHomephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEPHONE$108, 0);
            return target;
        }
    }
    
    /**
     * True if has "homephone" element
     */
    public boolean isSetHomephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOMEPHONE$108) != 0;
        }
    }
    
    /**
     * Sets the "homephone" element
     */
    public void setHomephone(java.lang.String homephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEPHONE$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOMEPHONE$108);
            }
            target.setStringValue(homephone);
        }
    }
    
    /**
     * Sets (as xml) the "homephone" element
     */
    public void xsetHomephone(org.apache.xmlbeans.XmlString homephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEPHONE$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOMEPHONE$108);
            }
            target.set(homephone);
        }
    }
    
    /**
     * Unsets the "homephone" element
     */
    public void unsetHomephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOMEPHONE$108, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$110, 0);
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
            return get_store().count_elements(IMPORTSEQUENCENUMBER$110) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$110, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$110);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$110);
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
            get_store().remove_element(IMPORTSEQUENCENUMBER$110, 0);
        }
    }
    
    /**
     * Gets the "incomingemaildeliverymethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getIncomingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCOMINGEMAILDELIVERYMETHOD$112, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "incomingemaildeliverymethod" element
     */
    public boolean isSetIncomingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCOMINGEMAILDELIVERYMETHOD$112) != 0;
        }
    }
    
    /**
     * Sets the "incomingemaildeliverymethod" element
     */
    public void setIncomingemaildeliverymethod(com.microsoft.schemas.crm._2006.webservices.Picklist incomingemaildeliverymethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCOMINGEMAILDELIVERYMETHOD$112, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCOMINGEMAILDELIVERYMETHOD$112);
            }
            target.set(incomingemaildeliverymethod);
        }
    }
    
    /**
     * Appends and returns a new empty "incomingemaildeliverymethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewIncomingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCOMINGEMAILDELIVERYMETHOD$112);
            return target;
        }
    }
    
    /**
     * Unsets the "incomingemaildeliverymethod" element
     */
    public void unsetIncomingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCOMINGEMAILDELIVERYMETHOD$112, 0);
        }
    }
    
    /**
     * Gets the "internalemailaddress" element
     */
    public java.lang.String getInternalemailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALEMAILADDRESS$114, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "internalemailaddress" element
     */
    public org.apache.xmlbeans.XmlString xgetInternalemailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERNALEMAILADDRESS$114, 0);
            return target;
        }
    }
    
    /**
     * True if has "internalemailaddress" element
     */
    public boolean isSetInternalemailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERNALEMAILADDRESS$114) != 0;
        }
    }
    
    /**
     * Sets the "internalemailaddress" element
     */
    public void setInternalemailaddress(java.lang.String internalemailaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALEMAILADDRESS$114, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERNALEMAILADDRESS$114);
            }
            target.setStringValue(internalemailaddress);
        }
    }
    
    /**
     * Sets (as xml) the "internalemailaddress" element
     */
    public void xsetInternalemailaddress(org.apache.xmlbeans.XmlString internalemailaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERNALEMAILADDRESS$114, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERNALEMAILADDRESS$114);
            }
            target.set(internalemailaddress);
        }
    }
    
    /**
     * Unsets the "internalemailaddress" element
     */
    public void unsetInternalemailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERNALEMAILADDRESS$114, 0);
        }
    }
    
    /**
     * Gets the "invitestatuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getInvitestatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INVITESTATUSCODE$116, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "invitestatuscode" element
     */
    public boolean isSetInvitestatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVITESTATUSCODE$116) != 0;
        }
    }
    
    /**
     * Sets the "invitestatuscode" element
     */
    public void setInvitestatuscode(com.microsoft.schemas.crm._2006.webservices.Picklist invitestatuscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INVITESTATUSCODE$116, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INVITESTATUSCODE$116);
            }
            target.set(invitestatuscode);
        }
    }
    
    /**
     * Appends and returns a new empty "invitestatuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewInvitestatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INVITESTATUSCODE$116);
            return target;
        }
    }
    
    /**
     * Unsets the "invitestatuscode" element
     */
    public void unsetInvitestatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVITESTATUSCODE$116, 0);
        }
    }
    
    /**
     * Gets the "isdisabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsdisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDISABLED$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isdisabled" element
     */
    public boolean isSetIsdisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDISABLED$118) != 0;
        }
    }
    
    /**
     * Sets the "isdisabled" element
     */
    public void setIsdisabled(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isdisabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDISABLED$118, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDISABLED$118);
            }
            target.set(isdisabled);
        }
    }
    
    /**
     * Appends and returns a new empty "isdisabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsdisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDISABLED$118);
            return target;
        }
    }
    
    /**
     * Unsets the "isdisabled" element
     */
    public void unsetIsdisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDISABLED$118, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$120, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$120, 0);
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
            return get_store().count_elements(JOBTITLE$120) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOBTITLE$120, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOBTITLE$120);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOBTITLE$120, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOBTITLE$120);
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
            get_store().remove_element(JOBTITLE$120, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$122, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$122, 0);
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
            return get_store().count_elements(LASTNAME$122) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNAME$122, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTNAME$122);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTNAME$122, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTNAME$122);
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
            get_store().remove_element(LASTNAME$122, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$124, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLENAME$124, 0);
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
            return get_store().count_elements(MIDDLENAME$124) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIDDLENAME$124, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIDDLENAME$124);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIDDLENAME$124, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIDDLENAME$124);
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
            get_store().remove_element(MIDDLENAME$124, 0);
        }
    }
    
    /**
     * Gets the "mobilealertemail" element
     */
    public java.lang.String getMobilealertemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEALERTEMAIL$126, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mobilealertemail" element
     */
    public org.apache.xmlbeans.XmlString xgetMobilealertemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEALERTEMAIL$126, 0);
            return target;
        }
    }
    
    /**
     * True if has "mobilealertemail" element
     */
    public boolean isSetMobilealertemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOBILEALERTEMAIL$126) != 0;
        }
    }
    
    /**
     * Sets the "mobilealertemail" element
     */
    public void setMobilealertemail(java.lang.String mobilealertemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEALERTEMAIL$126, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILEALERTEMAIL$126);
            }
            target.setStringValue(mobilealertemail);
        }
    }
    
    /**
     * Sets (as xml) the "mobilealertemail" element
     */
    public void xsetMobilealertemail(org.apache.xmlbeans.XmlString mobilealertemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEALERTEMAIL$126, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILEALERTEMAIL$126);
            }
            target.set(mobilealertemail);
        }
    }
    
    /**
     * Unsets the "mobilealertemail" element
     */
    public void unsetMobilealertemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOBILEALERTEMAIL$126, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$128, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$128, 0);
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
            return get_store().count_elements(MOBILEPHONE$128) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$128, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILEPHONE$128);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILEPHONE$128, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILEPHONE$128);
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
            get_store().remove_element(MOBILEPHONE$128, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$130, 0);
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
            return get_store().count_elements(MODIFIEDBY$130) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$130, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$130);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$130);
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
            get_store().remove_element(MODIFIEDBY$130, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$132, 0);
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
            return get_store().count_elements(MODIFIEDON$132) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$132, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$132);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$132);
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
            get_store().remove_element(MODIFIEDON$132, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$134, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$134, 0);
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
            return get_store().count_elements(NICKNAME$134) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$134, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NICKNAME$134);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$134, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NICKNAME$134);
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
            get_store().remove_element(NICKNAME$134, 0);
        }
    }
    
    /**
     * Gets the "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(ORGANIZATIONID$136, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organizationid" element
     */
    public boolean isSetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONID$136) != 0;
        }
    }
    
    /**
     * Sets the "organizationid" element
     */
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(ORGANIZATIONID$136, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(ORGANIZATIONID$136);
            }
            target.set(organizationid);
        }
    }
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(ORGANIZATIONID$136);
            return target;
        }
    }
    
    /**
     * Unsets the "organizationid" element
     */
    public void unsetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONID$136, 0);
        }
    }
    
    /**
     * Gets the "outgoingemaildeliverymethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getOutgoingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OUTGOINGEMAILDELIVERYMETHOD$138, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outgoingemaildeliverymethod" element
     */
    public boolean isSetOutgoingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTGOINGEMAILDELIVERYMETHOD$138) != 0;
        }
    }
    
    /**
     * Sets the "outgoingemaildeliverymethod" element
     */
    public void setOutgoingemaildeliverymethod(com.microsoft.schemas.crm._2006.webservices.Picklist outgoingemaildeliverymethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OUTGOINGEMAILDELIVERYMETHOD$138, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OUTGOINGEMAILDELIVERYMETHOD$138);
            }
            target.set(outgoingemaildeliverymethod);
        }
    }
    
    /**
     * Appends and returns a new empty "outgoingemaildeliverymethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewOutgoingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OUTGOINGEMAILDELIVERYMETHOD$138);
            return target;
        }
    }
    
    /**
     * Unsets the "outgoingemaildeliverymethod" element
     */
    public void unsetOutgoingemaildeliverymethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTGOINGEMAILDELIVERYMETHOD$138, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$140, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$140) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$140, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$140);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$140);
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
            get_store().remove_element(OVERRIDDENCREATEDON$140, 0);
        }
    }
    
    /**
     * Gets the "parentsystemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getParentsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTSYSTEMUSERID$142, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parentsystemuserid" element
     */
    public boolean isSetParentsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTSYSTEMUSERID$142) != 0;
        }
    }
    
    /**
     * Sets the "parentsystemuserid" element
     */
    public void setParentsystemuserid(com.microsoft.schemas.crm._2006.webservices.Lookup parentsystemuserid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTSYSTEMUSERID$142, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTSYSTEMUSERID$142);
            }
            target.set(parentsystemuserid);
        }
    }
    
    /**
     * Appends and returns a new empty "parentsystemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTSYSTEMUSERID$142);
            return target;
        }
    }
    
    /**
     * Unsets the "parentsystemuserid" element
     */
    public void unsetParentsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTSYSTEMUSERID$142, 0);
        }
    }
    
    /**
     * Gets the "passporthi" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getPassporthi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PASSPORTHI$144, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "passporthi" element
     */
    public boolean isSetPassporthi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PASSPORTHI$144) != 0;
        }
    }
    
    /**
     * Sets the "passporthi" element
     */
    public void setPassporthi(com.microsoft.schemas.crm._2006.webservices.CrmNumber passporthi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PASSPORTHI$144, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PASSPORTHI$144);
            }
            target.set(passporthi);
        }
    }
    
    /**
     * Appends and returns a new empty "passporthi" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewPassporthi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PASSPORTHI$144);
            return target;
        }
    }
    
    /**
     * Unsets the "passporthi" element
     */
    public void unsetPassporthi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PASSPORTHI$144, 0);
        }
    }
    
    /**
     * Gets the "passportlo" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getPassportlo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PASSPORTLO$146, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "passportlo" element
     */
    public boolean isSetPassportlo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PASSPORTLO$146) != 0;
        }
    }
    
    /**
     * Sets the "passportlo" element
     */
    public void setPassportlo(com.microsoft.schemas.crm._2006.webservices.CrmNumber passportlo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PASSPORTLO$146, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PASSPORTLO$146);
            }
            target.set(passportlo);
        }
    }
    
    /**
     * Appends and returns a new empty "passportlo" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewPassportlo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PASSPORTLO$146);
            return target;
        }
    }
    
    /**
     * Unsets the "passportlo" element
     */
    public void unsetPassportlo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PASSPORTLO$146, 0);
        }
    }
    
    /**
     * Gets the "personalemailaddress" element
     */
    public java.lang.String getPersonalemailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONALEMAILADDRESS$148, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "personalemailaddress" element
     */
    public org.apache.xmlbeans.XmlString xgetPersonalemailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONALEMAILADDRESS$148, 0);
            return target;
        }
    }
    
    /**
     * True if has "personalemailaddress" element
     */
    public boolean isSetPersonalemailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONALEMAILADDRESS$148) != 0;
        }
    }
    
    /**
     * Sets the "personalemailaddress" element
     */
    public void setPersonalemailaddress(java.lang.String personalemailaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONALEMAILADDRESS$148, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONALEMAILADDRESS$148);
            }
            target.setStringValue(personalemailaddress);
        }
    }
    
    /**
     * Sets (as xml) the "personalemailaddress" element
     */
    public void xsetPersonalemailaddress(org.apache.xmlbeans.XmlString personalemailaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONALEMAILADDRESS$148, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERSONALEMAILADDRESS$148);
            }
            target.set(personalemailaddress);
        }
    }
    
    /**
     * Unsets the "personalemailaddress" element
     */
    public void unsetPersonalemailaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONALEMAILADDRESS$148, 0);
        }
    }
    
    /**
     * Gets the "photourl" element
     */
    public java.lang.String getPhotourl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHOTOURL$150, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "photourl" element
     */
    public org.apache.xmlbeans.XmlString xgetPhotourl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHOTOURL$150, 0);
            return target;
        }
    }
    
    /**
     * True if has "photourl" element
     */
    public boolean isSetPhotourl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHOTOURL$150) != 0;
        }
    }
    
    /**
     * Sets the "photourl" element
     */
    public void setPhotourl(java.lang.String photourl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHOTOURL$150, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHOTOURL$150);
            }
            target.setStringValue(photourl);
        }
    }
    
    /**
     * Sets (as xml) the "photourl" element
     */
    public void xsetPhotourl(org.apache.xmlbeans.XmlString photourl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHOTOURL$150, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHOTOURL$150);
            }
            target.set(photourl);
        }
    }
    
    /**
     * Unsets the "photourl" element
     */
    public void unsetPhotourl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHOTOURL$150, 0);
        }
    }
    
    /**
     * Gets the "preferredaddresscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPreferredaddresscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDADDRESSCODE$152, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredaddresscode" element
     */
    public boolean isSetPreferredaddresscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDADDRESSCODE$152) != 0;
        }
    }
    
    /**
     * Sets the "preferredaddresscode" element
     */
    public void setPreferredaddresscode(com.microsoft.schemas.crm._2006.webservices.Picklist preferredaddresscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDADDRESSCODE$152, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDADDRESSCODE$152);
            }
            target.set(preferredaddresscode);
        }
    }
    
    /**
     * Appends and returns a new empty "preferredaddresscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPreferredaddresscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDADDRESSCODE$152);
            return target;
        }
    }
    
    /**
     * Unsets the "preferredaddresscode" element
     */
    public void unsetPreferredaddresscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDADDRESSCODE$152, 0);
        }
    }
    
    /**
     * Gets the "preferredemailcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPreferredemailcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDEMAILCODE$154, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredemailcode" element
     */
    public boolean isSetPreferredemailcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDEMAILCODE$154) != 0;
        }
    }
    
    /**
     * Sets the "preferredemailcode" element
     */
    public void setPreferredemailcode(com.microsoft.schemas.crm._2006.webservices.Picklist preferredemailcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDEMAILCODE$154, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDEMAILCODE$154);
            }
            target.set(preferredemailcode);
        }
    }
    
    /**
     * Appends and returns a new empty "preferredemailcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPreferredemailcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDEMAILCODE$154);
            return target;
        }
    }
    
    /**
     * Unsets the "preferredemailcode" element
     */
    public void unsetPreferredemailcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDEMAILCODE$154, 0);
        }
    }
    
    /**
     * Gets the "preferredphonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPreferredphonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDPHONECODE$156, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredphonecode" element
     */
    public boolean isSetPreferredphonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFERREDPHONECODE$156) != 0;
        }
    }
    
    /**
     * Sets the "preferredphonecode" element
     */
    public void setPreferredphonecode(com.microsoft.schemas.crm._2006.webservices.Picklist preferredphonecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PREFERREDPHONECODE$156, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDPHONECODE$156);
            }
            target.set(preferredphonecode);
        }
    }
    
    /**
     * Appends and returns a new empty "preferredphonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPreferredphonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PREFERREDPHONECODE$156);
            return target;
        }
    }
    
    /**
     * Unsets the "preferredphonecode" element
     */
    public void unsetPreferredphonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFERREDPHONECODE$156, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALUTATION$158, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALUTATION$158, 0);
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
            return get_store().count_elements(SALUTATION$158) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALUTATION$158, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALUTATION$158);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALUTATION$158, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALUTATION$158);
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
            get_store().remove_element(SALUTATION$158, 0);
        }
    }
    
    /**
     * Gets the "setupuser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getSetupuser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SETUPUSER$160, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "setupuser" element
     */
    public boolean isSetSetupuser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETUPUSER$160) != 0;
        }
    }
    
    /**
     * Sets the "setupuser" element
     */
    public void setSetupuser(com.microsoft.schemas.crm._2006.webservices.CrmBoolean setupuser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SETUPUSER$160, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SETUPUSER$160);
            }
            target.set(setupuser);
        }
    }
    
    /**
     * Appends and returns a new empty "setupuser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewSetupuser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SETUPUSER$160);
            return target;
        }
    }
    
    /**
     * Unsets the "setupuser" element
     */
    public void unsetSetupuser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETUPUSER$160, 0);
        }
    }
    
    /**
     * Gets the "siteid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getSiteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SITEID$162, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "siteid" element
     */
    public boolean isSetSiteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITEID$162) != 0;
        }
    }
    
    /**
     * Sets the "siteid" element
     */
    public void setSiteid(com.microsoft.schemas.crm._2006.webservices.Lookup siteid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SITEID$162, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SITEID$162);
            }
            target.set(siteid);
        }
    }
    
    /**
     * Appends and returns a new empty "siteid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewSiteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SITEID$162);
            return target;
        }
    }
    
    /**
     * Unsets the "siteid" element
     */
    public void unsetSiteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITEID$162, 0);
        }
    }
    
    /**
     * Gets the "skills" element
     */
    public java.lang.String getSkills()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILLS$164, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "skills" element
     */
    public org.apache.xmlbeans.XmlString xgetSkills()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKILLS$164, 0);
            return target;
        }
    }
    
    /**
     * True if has "skills" element
     */
    public boolean isSetSkills()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SKILLS$164) != 0;
        }
    }
    
    /**
     * Sets the "skills" element
     */
    public void setSkills(java.lang.String skills)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILLS$164, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKILLS$164);
            }
            target.setStringValue(skills);
        }
    }
    
    /**
     * Sets (as xml) the "skills" element
     */
    public void xsetSkills(org.apache.xmlbeans.XmlString skills)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SKILLS$164, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SKILLS$164);
            }
            target.set(skills);
        }
    }
    
    /**
     * Unsets the "skills" element
     */
    public void unsetSkills()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SKILLS$164, 0);
        }
    }
    
    /**
     * Gets the "systemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SYSTEMUSERID$166, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "systemuserid" element
     */
    public boolean isSetSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEMUSERID$166) != 0;
        }
    }
    
    /**
     * Sets the "systemuserid" element
     */
    public void setSystemuserid(com.microsoft.schemas.crm._2006.webservices.Key systemuserid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SYSTEMUSERID$166, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SYSTEMUSERID$166);
            }
            target.set(systemuserid);
        }
    }
    
    /**
     * Appends and returns a new empty "systemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SYSTEMUSERID$166);
            return target;
        }
    }
    
    /**
     * Unsets the "systemuserid" element
     */
    public void unsetSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEMUSERID$166, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TERRITORYID$168, 0);
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
            return get_store().count_elements(TERRITORYID$168) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TERRITORYID$168, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TERRITORYID$168);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TERRITORYID$168);
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
            get_store().remove_element(TERRITORYID$168, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$170, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$170) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$170, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$170);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$170);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$170, 0);
        }
    }
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$172, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$172, 0);
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$172) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$172, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$172);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$172, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$172);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$172, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$174, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$174) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$174, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$174);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$174);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$174, 0);
        }
    }
    
    /**
     * Gets the "windowsliveid" element
     */
    public java.lang.String getWindowsliveid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDOWSLIVEID$176, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "windowsliveid" element
     */
    public org.apache.xmlbeans.XmlString xgetWindowsliveid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WINDOWSLIVEID$176, 0);
            return target;
        }
    }
    
    /**
     * True if has "windowsliveid" element
     */
    public boolean isSetWindowsliveid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WINDOWSLIVEID$176) != 0;
        }
    }
    
    /**
     * Sets the "windowsliveid" element
     */
    public void setWindowsliveid(java.lang.String windowsliveid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDOWSLIVEID$176, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINDOWSLIVEID$176);
            }
            target.setStringValue(windowsliveid);
        }
    }
    
    /**
     * Sets (as xml) the "windowsliveid" element
     */
    public void xsetWindowsliveid(org.apache.xmlbeans.XmlString windowsliveid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WINDOWSLIVEID$176, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WINDOWSLIVEID$176);
            }
            target.set(windowsliveid);
        }
    }
    
    /**
     * Unsets the "windowsliveid" element
     */
    public void unsetWindowsliveid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WINDOWSLIVEID$176, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFIRSTNAME$178, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFIRSTNAME$178, 0);
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
            return get_store().count_elements(YOMIFIRSTNAME$178) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFIRSTNAME$178, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIFIRSTNAME$178);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFIRSTNAME$178, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIFIRSTNAME$178);
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
            get_store().remove_element(YOMIFIRSTNAME$178, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFULLNAME$180, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFULLNAME$180, 0);
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
            return get_store().count_elements(YOMIFULLNAME$180) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIFULLNAME$180, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIFULLNAME$180);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIFULLNAME$180, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIFULLNAME$180);
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
            get_store().remove_element(YOMIFULLNAME$180, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMILASTNAME$182, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMILASTNAME$182, 0);
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
            return get_store().count_elements(YOMILASTNAME$182) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMILASTNAME$182, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMILASTNAME$182);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMILASTNAME$182, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMILASTNAME$182);
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
            get_store().remove_element(YOMILASTNAME$182, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIMIDDLENAME$184, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIMIDDLENAME$184, 0);
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
            return get_store().count_elements(YOMIMIDDLENAME$184) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YOMIMIDDLENAME$184, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YOMIMIDDLENAME$184);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YOMIMIDDLENAME$184, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YOMIMIDDLENAME$184);
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
            get_store().remove_element(YOMIMIDDLENAME$184, 0);
        }
    }
}
