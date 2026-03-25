/*
 * XML Type:  usersettings
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Usersettings
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML usersettings(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class UsersettingsImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Usersettings
{
    
    public UsersettingsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSBOOKSYNCINTERVAL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "addressbooksyncinterval");
    private static final javax.xml.namespace.QName ADVANCEDFINDSTARTUPMODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "advancedfindstartupmode");
    private static final javax.xml.namespace.QName ALLOWEMAILCREDENTIALS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowemailcredentials");
    private static final javax.xml.namespace.QName AMDESIGNATOR$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "amdesignator");
    private static final javax.xml.namespace.QName BUSINESSUNITID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "businessunitid");
    private static final javax.xml.namespace.QName CALENDARTYPE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "calendartype");
    private static final javax.xml.namespace.QName CREATEDBY$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CURRENCYDECIMALPRECISION$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currencydecimalprecision");
    private static final javax.xml.namespace.QName CURRENCYFORMATCODE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currencyformatcode");
    private static final javax.xml.namespace.QName CURRENCYSYMBOL$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currencysymbol");
    private static final javax.xml.namespace.QName DATEFORMATCODE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "dateformatcode");
    private static final javax.xml.namespace.QName DATEFORMATSTRING$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "dateformatstring");
    private static final javax.xml.namespace.QName DATESEPARATOR$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "dateseparator");
    private static final javax.xml.namespace.QName DECIMALSYMBOL$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "decimalsymbol");
    private static final javax.xml.namespace.QName DEFAULTCALENDARVIEW$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "defaultcalendarview");
    private static final javax.xml.namespace.QName EMAILPASSWORD$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailpassword");
    private static final javax.xml.namespace.QName EMAILUSERNAME$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailusername");
    private static final javax.xml.namespace.QName FULLNAMECONVENTIONCODE$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fullnameconventioncode");
    private static final javax.xml.namespace.QName HELPLANGUAGEID$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "helplanguageid");
    private static final javax.xml.namespace.QName HOMEPAGEAREA$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "homepagearea");
    private static final javax.xml.namespace.QName HOMEPAGESUBAREA$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "homepagesubarea");
    private static final javax.xml.namespace.QName IGNOREUNSOLICITEDEMAIL$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ignoreunsolicitedemail");
    private static final javax.xml.namespace.QName INCOMINGEMAILFILTERINGMETHOD$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "incomingemailfilteringmethod");
    private static final javax.xml.namespace.QName ISDUPLICATEDETECTIONENABLEDWHENGOINGONLINE$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isduplicatedetectionenabledwhengoingonline");
    private static final javax.xml.namespace.QName LOCALEID$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "localeid");
    private static final javax.xml.namespace.QName LONGDATEFORMATCODE$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "longdateformatcode");
    private static final javax.xml.namespace.QName MODIFIEDBY$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NEGATIVECURRENCYFORMATCODE$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "negativecurrencyformatcode");
    private static final javax.xml.namespace.QName NEGATIVEFORMATCODE$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "negativeformatcode");
    private static final javax.xml.namespace.QName NEXTTRACKINGNUMBER$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "nexttrackingnumber");
    private static final javax.xml.namespace.QName NUMBERGROUPFORMAT$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "numbergroupformat");
    private static final javax.xml.namespace.QName NUMBERSEPARATOR$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "numberseparator");
    private static final javax.xml.namespace.QName OFFLINESYNCINTERVAL$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "offlinesyncinterval");
    private static final javax.xml.namespace.QName OUTLOOKSYNCINTERVAL$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "outlooksyncinterval");
    private static final javax.xml.namespace.QName PAGINGLIMIT$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "paginglimit");
    private static final javax.xml.namespace.QName PMDESIGNATOR$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pmdesignator");
    private static final javax.xml.namespace.QName PRICINGDECIMALPRECISION$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricingdecimalprecision");
    private static final javax.xml.namespace.QName REPORTSCRIPTERRORS$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "reportscripterrors");
    private static final javax.xml.namespace.QName SHOWWEEKNUMBER$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "showweeknumber");
    private static final javax.xml.namespace.QName SYNCCONTACTCOMPANY$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "synccontactcompany");
    private static final javax.xml.namespace.QName SYSTEMUSERID$84 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "systemuserid");
    private static final javax.xml.namespace.QName TIMEFORMATCODE$86 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timeformatcode");
    private static final javax.xml.namespace.QName TIMEFORMATSTRING$88 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timeformatstring");
    private static final javax.xml.namespace.QName TIMESEPARATOR$90 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timeseparator");
    private static final javax.xml.namespace.QName TIMEZONEBIAS$92 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonebias");
    private static final javax.xml.namespace.QName TIMEZONECODE$94 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonecode");
    private static final javax.xml.namespace.QName TIMEZONEDAYLIGHTBIAS$96 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonedaylightbias");
    private static final javax.xml.namespace.QName TIMEZONEDAYLIGHTDAY$98 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonedaylightday");
    private static final javax.xml.namespace.QName TIMEZONEDAYLIGHTDAYOFWEEK$100 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonedaylightdayofweek");
    private static final javax.xml.namespace.QName TIMEZONEDAYLIGHTHOUR$102 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonedaylighthour");
    private static final javax.xml.namespace.QName TIMEZONEDAYLIGHTMINUTE$104 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonedaylightminute");
    private static final javax.xml.namespace.QName TIMEZONEDAYLIGHTMONTH$106 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonedaylightmonth");
    private static final javax.xml.namespace.QName TIMEZONEDAYLIGHTSECOND$108 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonedaylightsecond");
    private static final javax.xml.namespace.QName TIMEZONEDAYLIGHTYEAR$110 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonedaylightyear");
    private static final javax.xml.namespace.QName TIMEZONESTANDARDBIAS$112 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonestandardbias");
    private static final javax.xml.namespace.QName TIMEZONESTANDARDDAY$114 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonestandardday");
    private static final javax.xml.namespace.QName TIMEZONESTANDARDDAYOFWEEK$116 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonestandarddayofweek");
    private static final javax.xml.namespace.QName TIMEZONESTANDARDHOUR$118 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonestandardhour");
    private static final javax.xml.namespace.QName TIMEZONESTANDARDMINUTE$120 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonestandardminute");
    private static final javax.xml.namespace.QName TIMEZONESTANDARDMONTH$122 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonestandardmonth");
    private static final javax.xml.namespace.QName TIMEZONESTANDARDSECOND$124 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonestandardsecond");
    private static final javax.xml.namespace.QName TIMEZONESTANDARDYEAR$126 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonestandardyear");
    private static final javax.xml.namespace.QName TRACKINGTOKENID$128 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "trackingtokenid");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$130 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UILANGUAGEID$132 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "uilanguageid");
    private static final javax.xml.namespace.QName USECRMFORMFORAPPOINTMENT$134 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "usecrmformforappointment");
    private static final javax.xml.namespace.QName USECRMFORMFORCONTACT$136 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "usecrmformforcontact");
    private static final javax.xml.namespace.QName USECRMFORMFOREMAIL$138 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "usecrmformforemail");
    private static final javax.xml.namespace.QName USECRMFORMFORTASK$140 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "usecrmformfortask");
    private static final javax.xml.namespace.QName USEIMAGESTRIPS$142 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "useimagestrips");
    private static final javax.xml.namespace.QName USERPROFILE$144 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "userprofile");
    private static final javax.xml.namespace.QName WORKDAYSTARTTIME$146 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "workdaystarttime");
    private static final javax.xml.namespace.QName WORKDAYSTOPTIME$148 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "workdaystoptime");
    
    
    /**
     * Gets the "addressbooksyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getAddressbooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESSBOOKSYNCINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "addressbooksyncinterval" element
     */
    public boolean isSetAddressbooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSBOOKSYNCINTERVAL$0) != 0;
        }
    }
    
    /**
     * Sets the "addressbooksyncinterval" element
     */
    public void setAddressbooksyncinterval(com.microsoft.schemas.crm._2006.webservices.CrmNumber addressbooksyncinterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADDRESSBOOKSYNCINTERVAL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESSBOOKSYNCINTERVAL$0);
            }
            target.set(addressbooksyncinterval);
        }
    }
    
    /**
     * Appends and returns a new empty "addressbooksyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAddressbooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADDRESSBOOKSYNCINTERVAL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "addressbooksyncinterval" element
     */
    public void unsetAddressbooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSBOOKSYNCINTERVAL$0, 0);
        }
    }
    
    /**
     * Gets the "advancedfindstartupmode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getAdvancedfindstartupmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADVANCEDFINDSTARTUPMODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "advancedfindstartupmode" element
     */
    public boolean isSetAdvancedfindstartupmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADVANCEDFINDSTARTUPMODE$2) != 0;
        }
    }
    
    /**
     * Sets the "advancedfindstartupmode" element
     */
    public void setAdvancedfindstartupmode(com.microsoft.schemas.crm._2006.webservices.CrmNumber advancedfindstartupmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ADVANCEDFINDSTARTUPMODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADVANCEDFINDSTARTUPMODE$2);
            }
            target.set(advancedfindstartupmode);
        }
    }
    
    /**
     * Appends and returns a new empty "advancedfindstartupmode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAdvancedfindstartupmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ADVANCEDFINDSTARTUPMODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "advancedfindstartupmode" element
     */
    public void unsetAdvancedfindstartupmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADVANCEDFINDSTARTUPMODE$2, 0);
        }
    }
    
    /**
     * Gets the "allowemailcredentials" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowemailcredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWEMAILCREDENTIALS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowemailcredentials" element
     */
    public boolean isSetAllowemailcredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWEMAILCREDENTIALS$4) != 0;
        }
    }
    
    /**
     * Sets the "allowemailcredentials" element
     */
    public void setAllowemailcredentials(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowemailcredentials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWEMAILCREDENTIALS$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWEMAILCREDENTIALS$4);
            }
            target.set(allowemailcredentials);
        }
    }
    
    /**
     * Appends and returns a new empty "allowemailcredentials" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowemailcredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWEMAILCREDENTIALS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "allowemailcredentials" element
     */
    public void unsetAllowemailcredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWEMAILCREDENTIALS$4, 0);
        }
    }
    
    /**
     * Gets the "amdesignator" element
     */
    public java.lang.String getAmdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMDESIGNATOR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "amdesignator" element
     */
    public org.apache.xmlbeans.XmlString xgetAmdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMDESIGNATOR$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "amdesignator" element
     */
    public boolean isSetAmdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMDESIGNATOR$6) != 0;
        }
    }
    
    /**
     * Sets the "amdesignator" element
     */
    public void setAmdesignator(java.lang.String amdesignator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMDESIGNATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMDESIGNATOR$6);
            }
            target.setStringValue(amdesignator);
        }
    }
    
    /**
     * Sets (as xml) the "amdesignator" element
     */
    public void xsetAmdesignator(org.apache.xmlbeans.XmlString amdesignator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMDESIGNATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AMDESIGNATOR$6);
            }
            target.set(amdesignator);
        }
    }
    
    /**
     * Unsets the "amdesignator" element
     */
    public void unsetAmdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMDESIGNATOR$6, 0);
        }
    }
    
    /**
     * Gets the "businessunitid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(BUSINESSUNITID$8, 0);
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
            return get_store().count_elements(BUSINESSUNITID$8) != 0;
        }
    }
    
    /**
     * Sets the "businessunitid" element
     */
    public void setBusinessunitid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier businessunitid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(BUSINESSUNITID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(BUSINESSUNITID$8);
            }
            target.set(businessunitid);
        }
    }
    
    /**
     * Appends and returns a new empty "businessunitid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewBusinessunitid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(BUSINESSUNITID$8);
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
            get_store().remove_element(BUSINESSUNITID$8, 0);
        }
    }
    
    /**
     * Gets the "calendartype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCalendartype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CALENDARTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "calendartype" element
     */
    public boolean isSetCalendartype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALENDARTYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "calendartype" element
     */
    public void setCalendartype(com.microsoft.schemas.crm._2006.webservices.CrmNumber calendartype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CALENDARTYPE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CALENDARTYPE$10);
            }
            target.set(calendartype);
        }
    }
    
    /**
     * Appends and returns a new empty "calendartype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCalendartype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CALENDARTYPE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "calendartype" element
     */
    public void unsetCalendartype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALENDARTYPE$10, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$12, 0);
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
            return get_store().count_elements(CREATEDBY$12) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$12);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$12);
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
            get_store().remove_element(CREATEDBY$12, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$14, 0);
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
            return get_store().count_elements(CREATEDON$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$14);
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
            get_store().remove_element(CREATEDON$14, 0);
        }
    }
    
    /**
     * Gets the "currencydecimalprecision" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrencydecimalprecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENCYDECIMALPRECISION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currencydecimalprecision" element
     */
    public boolean isSetCurrencydecimalprecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCYDECIMALPRECISION$16) != 0;
        }
    }
    
    /**
     * Sets the "currencydecimalprecision" element
     */
    public void setCurrencydecimalprecision(com.microsoft.schemas.crm._2006.webservices.CrmNumber currencydecimalprecision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENCYDECIMALPRECISION$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENCYDECIMALPRECISION$16);
            }
            target.set(currencydecimalprecision);
        }
    }
    
    /**
     * Appends and returns a new empty "currencydecimalprecision" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrencydecimalprecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENCYDECIMALPRECISION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "currencydecimalprecision" element
     */
    public void unsetCurrencydecimalprecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCYDECIMALPRECISION$16, 0);
        }
    }
    
    /**
     * Gets the "currencyformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENCYFORMATCODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currencyformatcode" element
     */
    public boolean isSetCurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCYFORMATCODE$18) != 0;
        }
    }
    
    /**
     * Sets the "currencyformatcode" element
     */
    public void setCurrencyformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber currencyformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENCYFORMATCODE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENCYFORMATCODE$18);
            }
            target.set(currencyformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "currencyformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENCYFORMATCODE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "currencyformatcode" element
     */
    public void unsetCurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCYFORMATCODE$18, 0);
        }
    }
    
    /**
     * Gets the "currencysymbol" element
     */
    public java.lang.String getCurrencysymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYSYMBOL$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "currencysymbol" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrencysymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYSYMBOL$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "currencysymbol" element
     */
    public boolean isSetCurrencysymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCYSYMBOL$20) != 0;
        }
    }
    
    /**
     * Sets the "currencysymbol" element
     */
    public void setCurrencysymbol(java.lang.String currencysymbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYSYMBOL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYSYMBOL$20);
            }
            target.setStringValue(currencysymbol);
        }
    }
    
    /**
     * Sets (as xml) the "currencysymbol" element
     */
    public void xsetCurrencysymbol(org.apache.xmlbeans.XmlString currencysymbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYSYMBOL$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYSYMBOL$20);
            }
            target.set(currencysymbol);
        }
    }
    
    /**
     * Unsets the "currencysymbol" element
     */
    public void unsetCurrencysymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCYSYMBOL$20, 0);
        }
    }
    
    /**
     * Gets the "dateformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DATEFORMATCODE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dateformatcode" element
     */
    public boolean isSetDateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEFORMATCODE$22) != 0;
        }
    }
    
    /**
     * Sets the "dateformatcode" element
     */
    public void setDateformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber dateformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DATEFORMATCODE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DATEFORMATCODE$22);
            }
            target.set(dateformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "dateformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DATEFORMATCODE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "dateformatcode" element
     */
    public void unsetDateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEFORMATCODE$22, 0);
        }
    }
    
    /**
     * Gets the "dateformatstring" element
     */
    public java.lang.String getDateformatstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFORMATSTRING$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateformatstring" element
     */
    public org.apache.xmlbeans.XmlString xgetDateformatstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEFORMATSTRING$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateformatstring" element
     */
    public boolean isSetDateformatstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEFORMATSTRING$24) != 0;
        }
    }
    
    /**
     * Sets the "dateformatstring" element
     */
    public void setDateformatstring(java.lang.String dateformatstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFORMATSTRING$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEFORMATSTRING$24);
            }
            target.setStringValue(dateformatstring);
        }
    }
    
    /**
     * Sets (as xml) the "dateformatstring" element
     */
    public void xsetDateformatstring(org.apache.xmlbeans.XmlString dateformatstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEFORMATSTRING$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEFORMATSTRING$24);
            }
            target.set(dateformatstring);
        }
    }
    
    /**
     * Unsets the "dateformatstring" element
     */
    public void unsetDateformatstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEFORMATSTRING$24, 0);
        }
    }
    
    /**
     * Gets the "dateseparator" element
     */
    public java.lang.String getDateseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESEPARATOR$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateseparator" element
     */
    public org.apache.xmlbeans.XmlString xgetDateseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATESEPARATOR$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateseparator" element
     */
    public boolean isSetDateseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATESEPARATOR$26) != 0;
        }
    }
    
    /**
     * Sets the "dateseparator" element
     */
    public void setDateseparator(java.lang.String dateseparator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESEPARATOR$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATESEPARATOR$26);
            }
            target.setStringValue(dateseparator);
        }
    }
    
    /**
     * Sets (as xml) the "dateseparator" element
     */
    public void xsetDateseparator(org.apache.xmlbeans.XmlString dateseparator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATESEPARATOR$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATESEPARATOR$26);
            }
            target.set(dateseparator);
        }
    }
    
    /**
     * Unsets the "dateseparator" element
     */
    public void unsetDateseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATESEPARATOR$26, 0);
        }
    }
    
    /**
     * Gets the "decimalsymbol" element
     */
    public java.lang.String getDecimalsymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALSYMBOL$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimalsymbol" element
     */
    public org.apache.xmlbeans.XmlString xgetDecimalsymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECIMALSYMBOL$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "decimalsymbol" element
     */
    public boolean isSetDecimalsymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECIMALSYMBOL$28) != 0;
        }
    }
    
    /**
     * Sets the "decimalsymbol" element
     */
    public void setDecimalsymbol(java.lang.String decimalsymbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALSYMBOL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMALSYMBOL$28);
            }
            target.setStringValue(decimalsymbol);
        }
    }
    
    /**
     * Sets (as xml) the "decimalsymbol" element
     */
    public void xsetDecimalsymbol(org.apache.xmlbeans.XmlString decimalsymbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECIMALSYMBOL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DECIMALSYMBOL$28);
            }
            target.set(decimalsymbol);
        }
    }
    
    /**
     * Unsets the "decimalsymbol" element
     */
    public void unsetDecimalsymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECIMALSYMBOL$28, 0);
        }
    }
    
    /**
     * Gets the "defaultcalendarview" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDefaultcalendarview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DEFAULTCALENDARVIEW$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "defaultcalendarview" element
     */
    public boolean isSetDefaultcalendarview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTCALENDARVIEW$30) != 0;
        }
    }
    
    /**
     * Sets the "defaultcalendarview" element
     */
    public void setDefaultcalendarview(com.microsoft.schemas.crm._2006.webservices.CrmNumber defaultcalendarview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DEFAULTCALENDARVIEW$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DEFAULTCALENDARVIEW$30);
            }
            target.set(defaultcalendarview);
        }
    }
    
    /**
     * Appends and returns a new empty "defaultcalendarview" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDefaultcalendarview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DEFAULTCALENDARVIEW$30);
            return target;
        }
    }
    
    /**
     * Unsets the "defaultcalendarview" element
     */
    public void unsetDefaultcalendarview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTCALENDARVIEW$30, 0);
        }
    }
    
    /**
     * Gets the "emailpassword" element
     */
    public java.lang.String getEmailpassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILPASSWORD$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailpassword" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailpassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILPASSWORD$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "emailpassword" element
     */
    public boolean isSetEmailpassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILPASSWORD$32) != 0;
        }
    }
    
    /**
     * Sets the "emailpassword" element
     */
    public void setEmailpassword(java.lang.String emailpassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILPASSWORD$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILPASSWORD$32);
            }
            target.setStringValue(emailpassword);
        }
    }
    
    /**
     * Sets (as xml) the "emailpassword" element
     */
    public void xsetEmailpassword(org.apache.xmlbeans.XmlString emailpassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILPASSWORD$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILPASSWORD$32);
            }
            target.set(emailpassword);
        }
    }
    
    /**
     * Unsets the "emailpassword" element
     */
    public void unsetEmailpassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILPASSWORD$32, 0);
        }
    }
    
    /**
     * Gets the "emailusername" element
     */
    public java.lang.String getEmailusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILUSERNAME$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailusername" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILUSERNAME$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "emailusername" element
     */
    public boolean isSetEmailusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILUSERNAME$34) != 0;
        }
    }
    
    /**
     * Sets the "emailusername" element
     */
    public void setEmailusername(java.lang.String emailusername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILUSERNAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILUSERNAME$34);
            }
            target.setStringValue(emailusername);
        }
    }
    
    /**
     * Sets (as xml) the "emailusername" element
     */
    public void xsetEmailusername(org.apache.xmlbeans.XmlString emailusername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILUSERNAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILUSERNAME$34);
            }
            target.set(emailusername);
        }
    }
    
    /**
     * Unsets the "emailusername" element
     */
    public void unsetEmailusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILUSERNAME$34, 0);
        }
    }
    
    /**
     * Gets the "fullnameconventioncode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getFullnameconventioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FULLNAMECONVENTIONCODE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fullnameconventioncode" element
     */
    public boolean isSetFullnameconventioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULLNAMECONVENTIONCODE$36) != 0;
        }
    }
    
    /**
     * Sets the "fullnameconventioncode" element
     */
    public void setFullnameconventioncode(com.microsoft.schemas.crm._2006.webservices.CrmNumber fullnameconventioncode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FULLNAMECONVENTIONCODE$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FULLNAMECONVENTIONCODE$36);
            }
            target.set(fullnameconventioncode);
        }
    }
    
    /**
     * Appends and returns a new empty "fullnameconventioncode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFullnameconventioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FULLNAMECONVENTIONCODE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "fullnameconventioncode" element
     */
    public void unsetFullnameconventioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULLNAMECONVENTIONCODE$36, 0);
        }
    }
    
    /**
     * Gets the "helplanguageid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getHelplanguageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(HELPLANGUAGEID$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "helplanguageid" element
     */
    public boolean isSetHelplanguageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HELPLANGUAGEID$38) != 0;
        }
    }
    
    /**
     * Sets the "helplanguageid" element
     */
    public void setHelplanguageid(com.microsoft.schemas.crm._2006.webservices.CrmNumber helplanguageid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(HELPLANGUAGEID$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(HELPLANGUAGEID$38);
            }
            target.set(helplanguageid);
        }
    }
    
    /**
     * Appends and returns a new empty "helplanguageid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewHelplanguageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(HELPLANGUAGEID$38);
            return target;
        }
    }
    
    /**
     * Unsets the "helplanguageid" element
     */
    public void unsetHelplanguageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HELPLANGUAGEID$38, 0);
        }
    }
    
    /**
     * Gets the "homepagearea" element
     */
    public java.lang.String getHomepagearea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEPAGEAREA$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "homepagearea" element
     */
    public org.apache.xmlbeans.XmlString xgetHomepagearea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEPAGEAREA$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "homepagearea" element
     */
    public boolean isSetHomepagearea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOMEPAGEAREA$40) != 0;
        }
    }
    
    /**
     * Sets the "homepagearea" element
     */
    public void setHomepagearea(java.lang.String homepagearea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEPAGEAREA$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOMEPAGEAREA$40);
            }
            target.setStringValue(homepagearea);
        }
    }
    
    /**
     * Sets (as xml) the "homepagearea" element
     */
    public void xsetHomepagearea(org.apache.xmlbeans.XmlString homepagearea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEPAGEAREA$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOMEPAGEAREA$40);
            }
            target.set(homepagearea);
        }
    }
    
    /**
     * Unsets the "homepagearea" element
     */
    public void unsetHomepagearea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOMEPAGEAREA$40, 0);
        }
    }
    
    /**
     * Gets the "homepagesubarea" element
     */
    public java.lang.String getHomepagesubarea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEPAGESUBAREA$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "homepagesubarea" element
     */
    public org.apache.xmlbeans.XmlString xgetHomepagesubarea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEPAGESUBAREA$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "homepagesubarea" element
     */
    public boolean isSetHomepagesubarea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOMEPAGESUBAREA$42) != 0;
        }
    }
    
    /**
     * Sets the "homepagesubarea" element
     */
    public void setHomepagesubarea(java.lang.String homepagesubarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEPAGESUBAREA$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOMEPAGESUBAREA$42);
            }
            target.setStringValue(homepagesubarea);
        }
    }
    
    /**
     * Sets (as xml) the "homepagesubarea" element
     */
    public void xsetHomepagesubarea(org.apache.xmlbeans.XmlString homepagesubarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEPAGESUBAREA$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOMEPAGESUBAREA$42);
            }
            target.set(homepagesubarea);
        }
    }
    
    /**
     * Unsets the "homepagesubarea" element
     */
    public void unsetHomepagesubarea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOMEPAGESUBAREA$42, 0);
        }
    }
    
    /**
     * Gets the "ignoreunsolicitedemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIgnoreunsolicitedemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(IGNOREUNSOLICITEDEMAIL$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ignoreunsolicitedemail" element
     */
    public boolean isSetIgnoreunsolicitedemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IGNOREUNSOLICITEDEMAIL$44) != 0;
        }
    }
    
    /**
     * Sets the "ignoreunsolicitedemail" element
     */
    public void setIgnoreunsolicitedemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ignoreunsolicitedemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(IGNOREUNSOLICITEDEMAIL$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(IGNOREUNSOLICITEDEMAIL$44);
            }
            target.set(ignoreunsolicitedemail);
        }
    }
    
    /**
     * Appends and returns a new empty "ignoreunsolicitedemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIgnoreunsolicitedemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(IGNOREUNSOLICITEDEMAIL$44);
            return target;
        }
    }
    
    /**
     * Unsets the "ignoreunsolicitedemail" element
     */
    public void unsetIgnoreunsolicitedemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IGNOREUNSOLICITEDEMAIL$44, 0);
        }
    }
    
    /**
     * Gets the "incomingemailfilteringmethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getIncomingemailfilteringmethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCOMINGEMAILFILTERINGMETHOD$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "incomingemailfilteringmethod" element
     */
    public boolean isSetIncomingemailfilteringmethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCOMINGEMAILFILTERINGMETHOD$46) != 0;
        }
    }
    
    /**
     * Sets the "incomingemailfilteringmethod" element
     */
    public void setIncomingemailfilteringmethod(com.microsoft.schemas.crm._2006.webservices.Picklist incomingemailfilteringmethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCOMINGEMAILFILTERINGMETHOD$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCOMINGEMAILFILTERINGMETHOD$46);
            }
            target.set(incomingemailfilteringmethod);
        }
    }
    
    /**
     * Appends and returns a new empty "incomingemailfilteringmethod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewIncomingemailfilteringmethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCOMINGEMAILFILTERINGMETHOD$46);
            return target;
        }
    }
    
    /**
     * Unsets the "incomingemailfilteringmethod" element
     */
    public void unsetIncomingemailfilteringmethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCOMINGEMAILFILTERINGMETHOD$46, 0);
        }
    }
    
    /**
     * Gets the "isduplicatedetectionenabledwhengoingonline" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsduplicatedetectionenabledwhengoingonline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLEDWHENGOINGONLINE$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isduplicatedetectionenabledwhengoingonline" element
     */
    public boolean isSetIsduplicatedetectionenabledwhengoingonline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDUPLICATEDETECTIONENABLEDWHENGOINGONLINE$48) != 0;
        }
    }
    
    /**
     * Sets the "isduplicatedetectionenabledwhengoingonline" element
     */
    public void setIsduplicatedetectionenabledwhengoingonline(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isduplicatedetectionenabledwhengoingonline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLEDWHENGOINGONLINE$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLEDWHENGOINGONLINE$48);
            }
            target.set(isduplicatedetectionenabledwhengoingonline);
        }
    }
    
    /**
     * Appends and returns a new empty "isduplicatedetectionenabledwhengoingonline" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsduplicatedetectionenabledwhengoingonline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLEDWHENGOINGONLINE$48);
            return target;
        }
    }
    
    /**
     * Unsets the "isduplicatedetectionenabledwhengoingonline" element
     */
    public void unsetIsduplicatedetectionenabledwhengoingonline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDUPLICATEDETECTIONENABLEDWHENGOINGONLINE$48, 0);
        }
    }
    
    /**
     * Gets the "localeid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getLocaleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LOCALEID$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "localeid" element
     */
    public boolean isSetLocaleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALEID$50) != 0;
        }
    }
    
    /**
     * Sets the "localeid" element
     */
    public void setLocaleid(com.microsoft.schemas.crm._2006.webservices.CrmNumber localeid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LOCALEID$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LOCALEID$50);
            }
            target.set(localeid);
        }
    }
    
    /**
     * Appends and returns a new empty "localeid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLocaleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LOCALEID$50);
            return target;
        }
    }
    
    /**
     * Unsets the "localeid" element
     */
    public void unsetLocaleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALEID$50, 0);
        }
    }
    
    /**
     * Gets the "longdateformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getLongdateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LONGDATEFORMATCODE$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "longdateformatcode" element
     */
    public boolean isSetLongdateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGDATEFORMATCODE$52) != 0;
        }
    }
    
    /**
     * Sets the "longdateformatcode" element
     */
    public void setLongdateformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber longdateformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LONGDATEFORMATCODE$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LONGDATEFORMATCODE$52);
            }
            target.set(longdateformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "longdateformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLongdateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LONGDATEFORMATCODE$52);
            return target;
        }
    }
    
    /**
     * Unsets the "longdateformatcode" element
     */
    public void unsetLongdateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGDATEFORMATCODE$52, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$54, 0);
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
            return get_store().count_elements(MODIFIEDBY$54) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$54);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$54);
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
            get_store().remove_element(MODIFIEDBY$54, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$56, 0);
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
            return get_store().count_elements(MODIFIEDON$56) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$56);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$56);
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
            get_store().remove_element(MODIFIEDON$56, 0);
        }
    }
    
    /**
     * Gets the "negativecurrencyformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getNegativecurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEGATIVECURRENCYFORMATCODE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "negativecurrencyformatcode" element
     */
    public boolean isSetNegativecurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEGATIVECURRENCYFORMATCODE$58) != 0;
        }
    }
    
    /**
     * Sets the "negativecurrencyformatcode" element
     */
    public void setNegativecurrencyformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber negativecurrencyformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEGATIVECURRENCYFORMATCODE$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEGATIVECURRENCYFORMATCODE$58);
            }
            target.set(negativecurrencyformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "negativecurrencyformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNegativecurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEGATIVECURRENCYFORMATCODE$58);
            return target;
        }
    }
    
    /**
     * Unsets the "negativecurrencyformatcode" element
     */
    public void unsetNegativecurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEGATIVECURRENCYFORMATCODE$58, 0);
        }
    }
    
    /**
     * Gets the "negativeformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getNegativeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEGATIVEFORMATCODE$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "negativeformatcode" element
     */
    public boolean isSetNegativeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEGATIVEFORMATCODE$60) != 0;
        }
    }
    
    /**
     * Sets the "negativeformatcode" element
     */
    public void setNegativeformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber negativeformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEGATIVEFORMATCODE$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEGATIVEFORMATCODE$60);
            }
            target.set(negativeformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "negativeformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNegativeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEGATIVEFORMATCODE$60);
            return target;
        }
    }
    
    /**
     * Unsets the "negativeformatcode" element
     */
    public void unsetNegativeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEGATIVEFORMATCODE$60, 0);
        }
    }
    
    /**
     * Gets the "nexttrackingnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getNexttrackingnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEXTTRACKINGNUMBER$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nexttrackingnumber" element
     */
    public boolean isSetNexttrackingnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXTTRACKINGNUMBER$62) != 0;
        }
    }
    
    /**
     * Sets the "nexttrackingnumber" element
     */
    public void setNexttrackingnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber nexttrackingnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEXTTRACKINGNUMBER$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEXTTRACKINGNUMBER$62);
            }
            target.set(nexttrackingnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "nexttrackingnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNexttrackingnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEXTTRACKINGNUMBER$62);
            return target;
        }
    }
    
    /**
     * Unsets the "nexttrackingnumber" element
     */
    public void unsetNexttrackingnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXTTRACKINGNUMBER$62, 0);
        }
    }
    
    /**
     * Gets the "numbergroupformat" element
     */
    public java.lang.String getNumbergroupformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERGROUPFORMAT$64, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numbergroupformat" element
     */
    public org.apache.xmlbeans.XmlString xgetNumbergroupformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERGROUPFORMAT$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "numbergroupformat" element
     */
    public boolean isSetNumbergroupformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERGROUPFORMAT$64) != 0;
        }
    }
    
    /**
     * Sets the "numbergroupformat" element
     */
    public void setNumbergroupformat(java.lang.String numbergroupformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERGROUPFORMAT$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERGROUPFORMAT$64);
            }
            target.setStringValue(numbergroupformat);
        }
    }
    
    /**
     * Sets (as xml) the "numbergroupformat" element
     */
    public void xsetNumbergroupformat(org.apache.xmlbeans.XmlString numbergroupformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERGROUPFORMAT$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBERGROUPFORMAT$64);
            }
            target.set(numbergroupformat);
        }
    }
    
    /**
     * Unsets the "numbergroupformat" element
     */
    public void unsetNumbergroupformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERGROUPFORMAT$64, 0);
        }
    }
    
    /**
     * Gets the "numberseparator" element
     */
    public java.lang.String getNumberseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSEPARATOR$66, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberseparator" element
     */
    public org.apache.xmlbeans.XmlString xgetNumberseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERSEPARATOR$66, 0);
            return target;
        }
    }
    
    /**
     * True if has "numberseparator" element
     */
    public boolean isSetNumberseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERSEPARATOR$66) != 0;
        }
    }
    
    /**
     * Sets the "numberseparator" element
     */
    public void setNumberseparator(java.lang.String numberseparator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSEPARATOR$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERSEPARATOR$66);
            }
            target.setStringValue(numberseparator);
        }
    }
    
    /**
     * Sets (as xml) the "numberseparator" element
     */
    public void xsetNumberseparator(org.apache.xmlbeans.XmlString numberseparator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERSEPARATOR$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBERSEPARATOR$66);
            }
            target.set(numberseparator);
        }
    }
    
    /**
     * Unsets the "numberseparator" element
     */
    public void unsetNumberseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERSEPARATOR$66, 0);
        }
    }
    
    /**
     * Gets the "offlinesyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getOfflinesyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(OFFLINESYNCINTERVAL$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "offlinesyncinterval" element
     */
    public boolean isSetOfflinesyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFLINESYNCINTERVAL$68) != 0;
        }
    }
    
    /**
     * Sets the "offlinesyncinterval" element
     */
    public void setOfflinesyncinterval(com.microsoft.schemas.crm._2006.webservices.CrmNumber offlinesyncinterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(OFFLINESYNCINTERVAL$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(OFFLINESYNCINTERVAL$68);
            }
            target.set(offlinesyncinterval);
        }
    }
    
    /**
     * Appends and returns a new empty "offlinesyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewOfflinesyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(OFFLINESYNCINTERVAL$68);
            return target;
        }
    }
    
    /**
     * Unsets the "offlinesyncinterval" element
     */
    public void unsetOfflinesyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFLINESYNCINTERVAL$68, 0);
        }
    }
    
    /**
     * Gets the "outlooksyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getOutlooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(OUTLOOKSYNCINTERVAL$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outlooksyncinterval" element
     */
    public boolean isSetOutlooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTLOOKSYNCINTERVAL$70) != 0;
        }
    }
    
    /**
     * Sets the "outlooksyncinterval" element
     */
    public void setOutlooksyncinterval(com.microsoft.schemas.crm._2006.webservices.CrmNumber outlooksyncinterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(OUTLOOKSYNCINTERVAL$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(OUTLOOKSYNCINTERVAL$70);
            }
            target.set(outlooksyncinterval);
        }
    }
    
    /**
     * Appends and returns a new empty "outlooksyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewOutlooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(OUTLOOKSYNCINTERVAL$70);
            return target;
        }
    }
    
    /**
     * Unsets the "outlooksyncinterval" element
     */
    public void unsetOutlooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTLOOKSYNCINTERVAL$70, 0);
        }
    }
    
    /**
     * Gets the "paginglimit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getPaginglimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PAGINGLIMIT$72, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "paginglimit" element
     */
    public boolean isSetPaginglimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGINGLIMIT$72) != 0;
        }
    }
    
    /**
     * Sets the "paginglimit" element
     */
    public void setPaginglimit(com.microsoft.schemas.crm._2006.webservices.CrmNumber paginglimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PAGINGLIMIT$72, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PAGINGLIMIT$72);
            }
            target.set(paginglimit);
        }
    }
    
    /**
     * Appends and returns a new empty "paginglimit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewPaginglimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PAGINGLIMIT$72);
            return target;
        }
    }
    
    /**
     * Unsets the "paginglimit" element
     */
    public void unsetPaginglimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGINGLIMIT$72, 0);
        }
    }
    
    /**
     * Gets the "pmdesignator" element
     */
    public java.lang.String getPmdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMDESIGNATOR$74, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pmdesignator" element
     */
    public org.apache.xmlbeans.XmlString xgetPmdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMDESIGNATOR$74, 0);
            return target;
        }
    }
    
    /**
     * True if has "pmdesignator" element
     */
    public boolean isSetPmdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PMDESIGNATOR$74) != 0;
        }
    }
    
    /**
     * Sets the "pmdesignator" element
     */
    public void setPmdesignator(java.lang.String pmdesignator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMDESIGNATOR$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PMDESIGNATOR$74);
            }
            target.setStringValue(pmdesignator);
        }
    }
    
    /**
     * Sets (as xml) the "pmdesignator" element
     */
    public void xsetPmdesignator(org.apache.xmlbeans.XmlString pmdesignator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMDESIGNATOR$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PMDESIGNATOR$74);
            }
            target.set(pmdesignator);
        }
    }
    
    /**
     * Unsets the "pmdesignator" element
     */
    public void unsetPmdesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PMDESIGNATOR$74, 0);
        }
    }
    
    /**
     * Gets the "pricingdecimalprecision" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getPricingdecimalprecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PRICINGDECIMALPRECISION$76, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pricingdecimalprecision" element
     */
    public boolean isSetPricingdecimalprecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICINGDECIMALPRECISION$76) != 0;
        }
    }
    
    /**
     * Sets the "pricingdecimalprecision" element
     */
    public void setPricingdecimalprecision(com.microsoft.schemas.crm._2006.webservices.CrmNumber pricingdecimalprecision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PRICINGDECIMALPRECISION$76, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PRICINGDECIMALPRECISION$76);
            }
            target.set(pricingdecimalprecision);
        }
    }
    
    /**
     * Appends and returns a new empty "pricingdecimalprecision" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewPricingdecimalprecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PRICINGDECIMALPRECISION$76);
            return target;
        }
    }
    
    /**
     * Unsets the "pricingdecimalprecision" element
     */
    public void unsetPricingdecimalprecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICINGDECIMALPRECISION$76, 0);
        }
    }
    
    /**
     * Gets the "reportscripterrors" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getReportscripterrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(REPORTSCRIPTERRORS$78, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportscripterrors" element
     */
    public boolean isSetReportscripterrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTSCRIPTERRORS$78) != 0;
        }
    }
    
    /**
     * Sets the "reportscripterrors" element
     */
    public void setReportscripterrors(com.microsoft.schemas.crm._2006.webservices.Picklist reportscripterrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(REPORTSCRIPTERRORS$78, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(REPORTSCRIPTERRORS$78);
            }
            target.set(reportscripterrors);
        }
    }
    
    /**
     * Appends and returns a new empty "reportscripterrors" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewReportscripterrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(REPORTSCRIPTERRORS$78);
            return target;
        }
    }
    
    /**
     * Unsets the "reportscripterrors" element
     */
    public void unsetReportscripterrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTSCRIPTERRORS$78, 0);
        }
    }
    
    /**
     * Gets the "showweeknumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getShowweeknumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SHOWWEEKNUMBER$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "showweeknumber" element
     */
    public boolean isSetShowweeknumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHOWWEEKNUMBER$80) != 0;
        }
    }
    
    /**
     * Sets the "showweeknumber" element
     */
    public void setShowweeknumber(com.microsoft.schemas.crm._2006.webservices.CrmBoolean showweeknumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SHOWWEEKNUMBER$80, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SHOWWEEKNUMBER$80);
            }
            target.set(showweeknumber);
        }
    }
    
    /**
     * Appends and returns a new empty "showweeknumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewShowweeknumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SHOWWEEKNUMBER$80);
            return target;
        }
    }
    
    /**
     * Unsets the "showweeknumber" element
     */
    public void unsetShowweeknumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHOWWEEKNUMBER$80, 0);
        }
    }
    
    /**
     * Gets the "synccontactcompany" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getSynccontactcompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SYNCCONTACTCOMPANY$82, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "synccontactcompany" element
     */
    public boolean isSetSynccontactcompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYNCCONTACTCOMPANY$82) != 0;
        }
    }
    
    /**
     * Sets the "synccontactcompany" element
     */
    public void setSynccontactcompany(com.microsoft.schemas.crm._2006.webservices.CrmBoolean synccontactcompany)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SYNCCONTACTCOMPANY$82, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SYNCCONTACTCOMPANY$82);
            }
            target.set(synccontactcompany);
        }
    }
    
    /**
     * Appends and returns a new empty "synccontactcompany" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewSynccontactcompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SYNCCONTACTCOMPANY$82);
            return target;
        }
    }
    
    /**
     * Unsets the "synccontactcompany" element
     */
    public void unsetSynccontactcompany()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYNCCONTACTCOMPANY$82, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SYSTEMUSERID$84, 0);
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
            return get_store().count_elements(SYSTEMUSERID$84) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SYSTEMUSERID$84, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SYSTEMUSERID$84);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SYSTEMUSERID$84);
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
            get_store().remove_element(SYSTEMUSERID$84, 0);
        }
    }
    
    /**
     * Gets the "timeformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEFORMATCODE$86, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeformatcode" element
     */
    public boolean isSetTimeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEFORMATCODE$86) != 0;
        }
    }
    
    /**
     * Sets the "timeformatcode" element
     */
    public void setTimeformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber timeformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEFORMATCODE$86, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEFORMATCODE$86);
            }
            target.set(timeformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "timeformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEFORMATCODE$86);
            return target;
        }
    }
    
    /**
     * Unsets the "timeformatcode" element
     */
    public void unsetTimeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEFORMATCODE$86, 0);
        }
    }
    
    /**
     * Gets the "timeformatstring" element
     */
    public java.lang.String getTimeformatstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMATSTRING$88, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeformatstring" element
     */
    public org.apache.xmlbeans.XmlString xgetTimeformatstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEFORMATSTRING$88, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeformatstring" element
     */
    public boolean isSetTimeformatstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEFORMATSTRING$88) != 0;
        }
    }
    
    /**
     * Sets the "timeformatstring" element
     */
    public void setTimeformatstring(java.lang.String timeformatstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMATSTRING$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEFORMATSTRING$88);
            }
            target.setStringValue(timeformatstring);
        }
    }
    
    /**
     * Sets (as xml) the "timeformatstring" element
     */
    public void xsetTimeformatstring(org.apache.xmlbeans.XmlString timeformatstring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEFORMATSTRING$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMEFORMATSTRING$88);
            }
            target.set(timeformatstring);
        }
    }
    
    /**
     * Unsets the "timeformatstring" element
     */
    public void unsetTimeformatstring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEFORMATSTRING$88, 0);
        }
    }
    
    /**
     * Gets the "timeseparator" element
     */
    public java.lang.String getTimeseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESEPARATOR$90, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeseparator" element
     */
    public org.apache.xmlbeans.XmlString xgetTimeseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMESEPARATOR$90, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeseparator" element
     */
    public boolean isSetTimeseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESEPARATOR$90) != 0;
        }
    }
    
    /**
     * Sets the "timeseparator" element
     */
    public void setTimeseparator(java.lang.String timeseparator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESEPARATOR$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESEPARATOR$90);
            }
            target.setStringValue(timeseparator);
        }
    }
    
    /**
     * Sets (as xml) the "timeseparator" element
     */
    public void xsetTimeseparator(org.apache.xmlbeans.XmlString timeseparator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMESEPARATOR$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMESEPARATOR$90);
            }
            target.set(timeseparator);
        }
    }
    
    /**
     * Unsets the "timeseparator" element
     */
    public void unsetTimeseparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESEPARATOR$90, 0);
        }
    }
    
    /**
     * Gets the "timezonebias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonebias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEBIAS$92, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonebias" element
     */
    public boolean isSetTimezonebias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEBIAS$92) != 0;
        }
    }
    
    /**
     * Sets the "timezonebias" element
     */
    public void setTimezonebias(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonebias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEBIAS$92, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEBIAS$92);
            }
            target.set(timezonebias);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonebias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonebias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEBIAS$92);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonebias" element
     */
    public void unsetTimezonebias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEBIAS$92, 0);
        }
    }
    
    /**
     * Gets the "timezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONECODE$94, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonecode" element
     */
    public boolean isSetTimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONECODE$94) != 0;
        }
    }
    
    /**
     * Sets the "timezonecode" element
     */
    public void setTimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONECODE$94, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONECODE$94);
            }
            target.set(timezonecode);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONECODE$94);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonecode" element
     */
    public void unsetTimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONECODE$94, 0);
        }
    }
    
    /**
     * Gets the "timezonedaylightbias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTBIAS$96, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonedaylightbias" element
     */
    public boolean isSetTimezonedaylightbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEDAYLIGHTBIAS$96) != 0;
        }
    }
    
    /**
     * Sets the "timezonedaylightbias" element
     */
    public void setTimezonedaylightbias(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightbias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTBIAS$96, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTBIAS$96);
            }
            target.set(timezonedaylightbias);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonedaylightbias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTBIAS$96);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonedaylightbias" element
     */
    public void unsetTimezonedaylightbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEDAYLIGHTBIAS$96, 0);
        }
    }
    
    /**
     * Gets the "timezonedaylightday" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTDAY$98, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonedaylightday" element
     */
    public boolean isSetTimezonedaylightday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEDAYLIGHTDAY$98) != 0;
        }
    }
    
    /**
     * Sets the "timezonedaylightday" element
     */
    public void setTimezonedaylightday(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTDAY$98, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTDAY$98);
            }
            target.set(timezonedaylightday);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonedaylightday" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTDAY$98);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonedaylightday" element
     */
    public void unsetTimezonedaylightday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEDAYLIGHTDAY$98, 0);
        }
    }
    
    /**
     * Gets the "timezonedaylightdayofweek" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightdayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTDAYOFWEEK$100, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonedaylightdayofweek" element
     */
    public boolean isSetTimezonedaylightdayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEDAYLIGHTDAYOFWEEK$100) != 0;
        }
    }
    
    /**
     * Sets the "timezonedaylightdayofweek" element
     */
    public void setTimezonedaylightdayofweek(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightdayofweek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTDAYOFWEEK$100, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTDAYOFWEEK$100);
            }
            target.set(timezonedaylightdayofweek);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonedaylightdayofweek" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightdayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTDAYOFWEEK$100);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonedaylightdayofweek" element
     */
    public void unsetTimezonedaylightdayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEDAYLIGHTDAYOFWEEK$100, 0);
        }
    }
    
    /**
     * Gets the "timezonedaylighthour" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylighthour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTHOUR$102, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonedaylighthour" element
     */
    public boolean isSetTimezonedaylighthour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEDAYLIGHTHOUR$102) != 0;
        }
    }
    
    /**
     * Sets the "timezonedaylighthour" element
     */
    public void setTimezonedaylighthour(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylighthour)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTHOUR$102, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTHOUR$102);
            }
            target.set(timezonedaylighthour);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonedaylighthour" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylighthour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTHOUR$102);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonedaylighthour" element
     */
    public void unsetTimezonedaylighthour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEDAYLIGHTHOUR$102, 0);
        }
    }
    
    /**
     * Gets the "timezonedaylightminute" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTMINUTE$104, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonedaylightminute" element
     */
    public boolean isSetTimezonedaylightminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEDAYLIGHTMINUTE$104) != 0;
        }
    }
    
    /**
     * Sets the "timezonedaylightminute" element
     */
    public void setTimezonedaylightminute(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightminute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTMINUTE$104, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTMINUTE$104);
            }
            target.set(timezonedaylightminute);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonedaylightminute" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTMINUTE$104);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonedaylightminute" element
     */
    public void unsetTimezonedaylightminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEDAYLIGHTMINUTE$104, 0);
        }
    }
    
    /**
     * Gets the "timezonedaylightmonth" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTMONTH$106, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonedaylightmonth" element
     */
    public boolean isSetTimezonedaylightmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEDAYLIGHTMONTH$106) != 0;
        }
    }
    
    /**
     * Sets the "timezonedaylightmonth" element
     */
    public void setTimezonedaylightmonth(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightmonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTMONTH$106, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTMONTH$106);
            }
            target.set(timezonedaylightmonth);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonedaylightmonth" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTMONTH$106);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonedaylightmonth" element
     */
    public void unsetTimezonedaylightmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEDAYLIGHTMONTH$106, 0);
        }
    }
    
    /**
     * Gets the "timezonedaylightsecond" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTSECOND$108, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonedaylightsecond" element
     */
    public boolean isSetTimezonedaylightsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEDAYLIGHTSECOND$108) != 0;
        }
    }
    
    /**
     * Sets the "timezonedaylightsecond" element
     */
    public void setTimezonedaylightsecond(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightsecond)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTSECOND$108, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTSECOND$108);
            }
            target.set(timezonedaylightsecond);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonedaylightsecond" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTSECOND$108);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonedaylightsecond" element
     */
    public void unsetTimezonedaylightsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEDAYLIGHTSECOND$108, 0);
        }
    }
    
    /**
     * Gets the "timezonedaylightyear" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTYEAR$110, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonedaylightyear" element
     */
    public boolean isSetTimezonedaylightyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEDAYLIGHTYEAR$110) != 0;
        }
    }
    
    /**
     * Sets the "timezonedaylightyear" element
     */
    public void setTimezonedaylightyear(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONEDAYLIGHTYEAR$110, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTYEAR$110);
            }
            target.set(timezonedaylightyear);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonedaylightyear" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONEDAYLIGHTYEAR$110);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonedaylightyear" element
     */
    public void unsetTimezonedaylightyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEDAYLIGHTYEAR$110, 0);
        }
    }
    
    /**
     * Gets the "timezonestandardbias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDBIAS$112, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonestandardbias" element
     */
    public boolean isSetTimezonestandardbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONESTANDARDBIAS$112) != 0;
        }
    }
    
    /**
     * Sets the "timezonestandardbias" element
     */
    public void setTimezonestandardbias(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardbias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDBIAS$112, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDBIAS$112);
            }
            target.set(timezonestandardbias);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonestandardbias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDBIAS$112);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonestandardbias" element
     */
    public void unsetTimezonestandardbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONESTANDARDBIAS$112, 0);
        }
    }
    
    /**
     * Gets the "timezonestandardday" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDDAY$114, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonestandardday" element
     */
    public boolean isSetTimezonestandardday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONESTANDARDDAY$114) != 0;
        }
    }
    
    /**
     * Sets the "timezonestandardday" element
     */
    public void setTimezonestandardday(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDDAY$114, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDDAY$114);
            }
            target.set(timezonestandardday);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonestandardday" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDDAY$114);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonestandardday" element
     */
    public void unsetTimezonestandardday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONESTANDARDDAY$114, 0);
        }
    }
    
    /**
     * Gets the "timezonestandarddayofweek" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandarddayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDDAYOFWEEK$116, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonestandarddayofweek" element
     */
    public boolean isSetTimezonestandarddayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONESTANDARDDAYOFWEEK$116) != 0;
        }
    }
    
    /**
     * Sets the "timezonestandarddayofweek" element
     */
    public void setTimezonestandarddayofweek(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandarddayofweek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDDAYOFWEEK$116, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDDAYOFWEEK$116);
            }
            target.set(timezonestandarddayofweek);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonestandarddayofweek" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandarddayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDDAYOFWEEK$116);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonestandarddayofweek" element
     */
    public void unsetTimezonestandarddayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONESTANDARDDAYOFWEEK$116, 0);
        }
    }
    
    /**
     * Gets the "timezonestandardhour" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardhour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDHOUR$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonestandardhour" element
     */
    public boolean isSetTimezonestandardhour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONESTANDARDHOUR$118) != 0;
        }
    }
    
    /**
     * Sets the "timezonestandardhour" element
     */
    public void setTimezonestandardhour(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardhour)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDHOUR$118, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDHOUR$118);
            }
            target.set(timezonestandardhour);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonestandardhour" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardhour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDHOUR$118);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonestandardhour" element
     */
    public void unsetTimezonestandardhour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONESTANDARDHOUR$118, 0);
        }
    }
    
    /**
     * Gets the "timezonestandardminute" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDMINUTE$120, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonestandardminute" element
     */
    public boolean isSetTimezonestandardminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONESTANDARDMINUTE$120) != 0;
        }
    }
    
    /**
     * Sets the "timezonestandardminute" element
     */
    public void setTimezonestandardminute(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardminute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDMINUTE$120, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDMINUTE$120);
            }
            target.set(timezonestandardminute);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonestandardminute" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDMINUTE$120);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonestandardminute" element
     */
    public void unsetTimezonestandardminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONESTANDARDMINUTE$120, 0);
        }
    }
    
    /**
     * Gets the "timezonestandardmonth" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDMONTH$122, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonestandardmonth" element
     */
    public boolean isSetTimezonestandardmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONESTANDARDMONTH$122) != 0;
        }
    }
    
    /**
     * Sets the "timezonestandardmonth" element
     */
    public void setTimezonestandardmonth(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardmonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDMONTH$122, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDMONTH$122);
            }
            target.set(timezonestandardmonth);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonestandardmonth" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDMONTH$122);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonestandardmonth" element
     */
    public void unsetTimezonestandardmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONESTANDARDMONTH$122, 0);
        }
    }
    
    /**
     * Gets the "timezonestandardsecond" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDSECOND$124, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonestandardsecond" element
     */
    public boolean isSetTimezonestandardsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONESTANDARDSECOND$124) != 0;
        }
    }
    
    /**
     * Sets the "timezonestandardsecond" element
     */
    public void setTimezonestandardsecond(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardsecond)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDSECOND$124, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDSECOND$124);
            }
            target.set(timezonestandardsecond);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonestandardsecond" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDSECOND$124);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonestandardsecond" element
     */
    public void unsetTimezonestandardsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONESTANDARDSECOND$124, 0);
        }
    }
    
    /**
     * Gets the "timezonestandardyear" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDYEAR$126, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonestandardyear" element
     */
    public boolean isSetTimezonestandardyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONESTANDARDYEAR$126) != 0;
        }
    }
    
    /**
     * Sets the "timezonestandardyear" element
     */
    public void setTimezonestandardyear(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONESTANDARDYEAR$126, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDYEAR$126);
            }
            target.set(timezonestandardyear);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonestandardyear" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONESTANDARDYEAR$126);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonestandardyear" element
     */
    public void unsetTimezonestandardyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONESTANDARDYEAR$126, 0);
        }
    }
    
    /**
     * Gets the "trackingtokenid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTrackingtokenid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TRACKINGTOKENID$128, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trackingtokenid" element
     */
    public boolean isSetTrackingtokenid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKINGTOKENID$128) != 0;
        }
    }
    
    /**
     * Sets the "trackingtokenid" element
     */
    public void setTrackingtokenid(com.microsoft.schemas.crm._2006.webservices.CrmNumber trackingtokenid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TRACKINGTOKENID$128, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TRACKINGTOKENID$128);
            }
            target.set(trackingtokenid);
        }
    }
    
    /**
     * Appends and returns a new empty "trackingtokenid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTrackingtokenid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TRACKINGTOKENID$128);
            return target;
        }
    }
    
    /**
     * Unsets the "trackingtokenid" element
     */
    public void unsetTrackingtokenid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKINGTOKENID$128, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$130, 0);
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
            return get_store().count_elements(TRANSACTIONCURRENCYID$130) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$130, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$130);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$130);
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
            get_store().remove_element(TRANSACTIONCURRENCYID$130, 0);
        }
    }
    
    /**
     * Gets the "uilanguageid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getUilanguageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UILANGUAGEID$132, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uilanguageid" element
     */
    public boolean isSetUilanguageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UILANGUAGEID$132) != 0;
        }
    }
    
    /**
     * Sets the "uilanguageid" element
     */
    public void setUilanguageid(com.microsoft.schemas.crm._2006.webservices.CrmNumber uilanguageid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UILANGUAGEID$132, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UILANGUAGEID$132);
            }
            target.set(uilanguageid);
        }
    }
    
    /**
     * Appends and returns a new empty "uilanguageid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUilanguageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UILANGUAGEID$132);
            return target;
        }
    }
    
    /**
     * Unsets the "uilanguageid" element
     */
    public void unsetUilanguageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UILANGUAGEID$132, 0);
        }
    }
    
    /**
     * Gets the "usecrmformforappointment" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsecrmformforappointment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USECRMFORMFORAPPOINTMENT$134, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usecrmformforappointment" element
     */
    public boolean isSetUsecrmformforappointment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USECRMFORMFORAPPOINTMENT$134) != 0;
        }
    }
    
    /**
     * Sets the "usecrmformforappointment" element
     */
    public void setUsecrmformforappointment(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usecrmformforappointment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USECRMFORMFORAPPOINTMENT$134, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USECRMFORMFORAPPOINTMENT$134);
            }
            target.set(usecrmformforappointment);
        }
    }
    
    /**
     * Appends and returns a new empty "usecrmformforappointment" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsecrmformforappointment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USECRMFORMFORAPPOINTMENT$134);
            return target;
        }
    }
    
    /**
     * Unsets the "usecrmformforappointment" element
     */
    public void unsetUsecrmformforappointment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USECRMFORMFORAPPOINTMENT$134, 0);
        }
    }
    
    /**
     * Gets the "usecrmformforcontact" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsecrmformforcontact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USECRMFORMFORCONTACT$136, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usecrmformforcontact" element
     */
    public boolean isSetUsecrmformforcontact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USECRMFORMFORCONTACT$136) != 0;
        }
    }
    
    /**
     * Sets the "usecrmformforcontact" element
     */
    public void setUsecrmformforcontact(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usecrmformforcontact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USECRMFORMFORCONTACT$136, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USECRMFORMFORCONTACT$136);
            }
            target.set(usecrmformforcontact);
        }
    }
    
    /**
     * Appends and returns a new empty "usecrmformforcontact" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsecrmformforcontact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USECRMFORMFORCONTACT$136);
            return target;
        }
    }
    
    /**
     * Unsets the "usecrmformforcontact" element
     */
    public void unsetUsecrmformforcontact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USECRMFORMFORCONTACT$136, 0);
        }
    }
    
    /**
     * Gets the "usecrmformforemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsecrmformforemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USECRMFORMFOREMAIL$138, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usecrmformforemail" element
     */
    public boolean isSetUsecrmformforemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USECRMFORMFOREMAIL$138) != 0;
        }
    }
    
    /**
     * Sets the "usecrmformforemail" element
     */
    public void setUsecrmformforemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usecrmformforemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USECRMFORMFOREMAIL$138, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USECRMFORMFOREMAIL$138);
            }
            target.set(usecrmformforemail);
        }
    }
    
    /**
     * Appends and returns a new empty "usecrmformforemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsecrmformforemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USECRMFORMFOREMAIL$138);
            return target;
        }
    }
    
    /**
     * Unsets the "usecrmformforemail" element
     */
    public void unsetUsecrmformforemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USECRMFORMFOREMAIL$138, 0);
        }
    }
    
    /**
     * Gets the "usecrmformfortask" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsecrmformfortask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USECRMFORMFORTASK$140, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usecrmformfortask" element
     */
    public boolean isSetUsecrmformfortask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USECRMFORMFORTASK$140) != 0;
        }
    }
    
    /**
     * Sets the "usecrmformfortask" element
     */
    public void setUsecrmformfortask(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usecrmformfortask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USECRMFORMFORTASK$140, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USECRMFORMFORTASK$140);
            }
            target.set(usecrmformfortask);
        }
    }
    
    /**
     * Appends and returns a new empty "usecrmformfortask" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsecrmformfortask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USECRMFORMFORTASK$140);
            return target;
        }
    }
    
    /**
     * Unsets the "usecrmformfortask" element
     */
    public void unsetUsecrmformfortask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USECRMFORMFORTASK$140, 0);
        }
    }
    
    /**
     * Gets the "useimagestrips" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUseimagestrips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USEIMAGESTRIPS$142, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "useimagestrips" element
     */
    public boolean isSetUseimagestrips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEIMAGESTRIPS$142) != 0;
        }
    }
    
    /**
     * Sets the "useimagestrips" element
     */
    public void setUseimagestrips(com.microsoft.schemas.crm._2006.webservices.CrmBoolean useimagestrips)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USEIMAGESTRIPS$142, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USEIMAGESTRIPS$142);
            }
            target.set(useimagestrips);
        }
    }
    
    /**
     * Appends and returns a new empty "useimagestrips" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUseimagestrips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USEIMAGESTRIPS$142);
            return target;
        }
    }
    
    /**
     * Unsets the "useimagestrips" element
     */
    public void unsetUseimagestrips()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEIMAGESTRIPS$142, 0);
        }
    }
    
    /**
     * Gets the "userprofile" element
     */
    public java.lang.String getUserprofile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERPROFILE$144, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userprofile" element
     */
    public org.apache.xmlbeans.XmlString xgetUserprofile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERPROFILE$144, 0);
            return target;
        }
    }
    
    /**
     * True if has "userprofile" element
     */
    public boolean isSetUserprofile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERPROFILE$144) != 0;
        }
    }
    
    /**
     * Sets the "userprofile" element
     */
    public void setUserprofile(java.lang.String userprofile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERPROFILE$144, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERPROFILE$144);
            }
            target.setStringValue(userprofile);
        }
    }
    
    /**
     * Sets (as xml) the "userprofile" element
     */
    public void xsetUserprofile(org.apache.xmlbeans.XmlString userprofile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERPROFILE$144, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERPROFILE$144);
            }
            target.set(userprofile);
        }
    }
    
    /**
     * Unsets the "userprofile" element
     */
    public void unsetUserprofile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERPROFILE$144, 0);
        }
    }
    
    /**
     * Gets the "workdaystarttime" element
     */
    public java.lang.String getWorkdaystarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDAYSTARTTIME$146, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "workdaystarttime" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkdaystarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKDAYSTARTTIME$146, 0);
            return target;
        }
    }
    
    /**
     * True if has "workdaystarttime" element
     */
    public boolean isSetWorkdaystarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKDAYSTARTTIME$146) != 0;
        }
    }
    
    /**
     * Sets the "workdaystarttime" element
     */
    public void setWorkdaystarttime(java.lang.String workdaystarttime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDAYSTARTTIME$146, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKDAYSTARTTIME$146);
            }
            target.setStringValue(workdaystarttime);
        }
    }
    
    /**
     * Sets (as xml) the "workdaystarttime" element
     */
    public void xsetWorkdaystarttime(org.apache.xmlbeans.XmlString workdaystarttime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKDAYSTARTTIME$146, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKDAYSTARTTIME$146);
            }
            target.set(workdaystarttime);
        }
    }
    
    /**
     * Unsets the "workdaystarttime" element
     */
    public void unsetWorkdaystarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKDAYSTARTTIME$146, 0);
        }
    }
    
    /**
     * Gets the "workdaystoptime" element
     */
    public java.lang.String getWorkdaystoptime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDAYSTOPTIME$148, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "workdaystoptime" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkdaystoptime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKDAYSTOPTIME$148, 0);
            return target;
        }
    }
    
    /**
     * True if has "workdaystoptime" element
     */
    public boolean isSetWorkdaystoptime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKDAYSTOPTIME$148) != 0;
        }
    }
    
    /**
     * Sets the "workdaystoptime" element
     */
    public void setWorkdaystoptime(java.lang.String workdaystoptime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKDAYSTOPTIME$148, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKDAYSTOPTIME$148);
            }
            target.setStringValue(workdaystoptime);
        }
    }
    
    /**
     * Sets (as xml) the "workdaystoptime" element
     */
    public void xsetWorkdaystoptime(org.apache.xmlbeans.XmlString workdaystoptime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKDAYSTOPTIME$148, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKDAYSTOPTIME$148);
            }
            target.set(workdaystoptime);
        }
    }
    
    /**
     * Unsets the "workdaystoptime" element
     */
    public void unsetWorkdaystoptime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKDAYSTOPTIME$148, 0);
        }
    }
}
