/*
 * XML Type:  usersettings
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Usersettings
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML usersettings(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Usersettings extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Usersettings.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("usersettingse02ctype");
    
    /**
     * Gets the "addressbooksyncinterval" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAddressbooksyncinterval();
    
    /**
     * True if has "addressbooksyncinterval" element
     */
    boolean isSetAddressbooksyncinterval();
    
    /**
     * Sets the "addressbooksyncinterval" element
     */
    void setAddressbooksyncinterval(com.microsoft.schemas.crm._2006.webservices.CrmNumber addressbooksyncinterval);
    
    /**
     * Appends and returns a new empty "addressbooksyncinterval" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAddressbooksyncinterval();
    
    /**
     * Unsets the "addressbooksyncinterval" element
     */
    void unsetAddressbooksyncinterval();
    
    /**
     * Gets the "advancedfindstartupmode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAdvancedfindstartupmode();
    
    /**
     * True if has "advancedfindstartupmode" element
     */
    boolean isSetAdvancedfindstartupmode();
    
    /**
     * Sets the "advancedfindstartupmode" element
     */
    void setAdvancedfindstartupmode(com.microsoft.schemas.crm._2006.webservices.CrmNumber advancedfindstartupmode);
    
    /**
     * Appends and returns a new empty "advancedfindstartupmode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAdvancedfindstartupmode();
    
    /**
     * Unsets the "advancedfindstartupmode" element
     */
    void unsetAdvancedfindstartupmode();
    
    /**
     * Gets the "allowemailcredentials" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowemailcredentials();
    
    /**
     * True if has "allowemailcredentials" element
     */
    boolean isSetAllowemailcredentials();
    
    /**
     * Sets the "allowemailcredentials" element
     */
    void setAllowemailcredentials(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowemailcredentials);
    
    /**
     * Appends and returns a new empty "allowemailcredentials" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowemailcredentials();
    
    /**
     * Unsets the "allowemailcredentials" element
     */
    void unsetAllowemailcredentials();
    
    /**
     * Gets the "amdesignator" element
     */
    java.lang.String getAmdesignator();
    
    /**
     * Gets (as xml) the "amdesignator" element
     */
    org.apache.xmlbeans.XmlString xgetAmdesignator();
    
    /**
     * True if has "amdesignator" element
     */
    boolean isSetAmdesignator();
    
    /**
     * Sets the "amdesignator" element
     */
    void setAmdesignator(java.lang.String amdesignator);
    
    /**
     * Sets (as xml) the "amdesignator" element
     */
    void xsetAmdesignator(org.apache.xmlbeans.XmlString amdesignator);
    
    /**
     * Unsets the "amdesignator" element
     */
    void unsetAmdesignator();
    
    /**
     * Gets the "businessunitid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getBusinessunitid();
    
    /**
     * True if has "businessunitid" element
     */
    boolean isSetBusinessunitid();
    
    /**
     * Sets the "businessunitid" element
     */
    void setBusinessunitid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier businessunitid);
    
    /**
     * Appends and returns a new empty "businessunitid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewBusinessunitid();
    
    /**
     * Unsets the "businessunitid" element
     */
    void unsetBusinessunitid();
    
    /**
     * Gets the "calendartype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getCalendartype();
    
    /**
     * True if has "calendartype" element
     */
    boolean isSetCalendartype();
    
    /**
     * Sets the "calendartype" element
     */
    void setCalendartype(com.microsoft.schemas.crm._2006.webservices.CrmNumber calendartype);
    
    /**
     * Appends and returns a new empty "calendartype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCalendartype();
    
    /**
     * Unsets the "calendartype" element
     */
    void unsetCalendartype();
    
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
     * Gets the "currencydecimalprecision" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrencydecimalprecision();
    
    /**
     * True if has "currencydecimalprecision" element
     */
    boolean isSetCurrencydecimalprecision();
    
    /**
     * Sets the "currencydecimalprecision" element
     */
    void setCurrencydecimalprecision(com.microsoft.schemas.crm._2006.webservices.CrmNumber currencydecimalprecision);
    
    /**
     * Appends and returns a new empty "currencydecimalprecision" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrencydecimalprecision();
    
    /**
     * Unsets the "currencydecimalprecision" element
     */
    void unsetCurrencydecimalprecision();
    
    /**
     * Gets the "currencyformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrencyformatcode();
    
    /**
     * True if has "currencyformatcode" element
     */
    boolean isSetCurrencyformatcode();
    
    /**
     * Sets the "currencyformatcode" element
     */
    void setCurrencyformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber currencyformatcode);
    
    /**
     * Appends and returns a new empty "currencyformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrencyformatcode();
    
    /**
     * Unsets the "currencyformatcode" element
     */
    void unsetCurrencyformatcode();
    
    /**
     * Gets the "currencysymbol" element
     */
    java.lang.String getCurrencysymbol();
    
    /**
     * Gets (as xml) the "currencysymbol" element
     */
    org.apache.xmlbeans.XmlString xgetCurrencysymbol();
    
    /**
     * True if has "currencysymbol" element
     */
    boolean isSetCurrencysymbol();
    
    /**
     * Sets the "currencysymbol" element
     */
    void setCurrencysymbol(java.lang.String currencysymbol);
    
    /**
     * Sets (as xml) the "currencysymbol" element
     */
    void xsetCurrencysymbol(org.apache.xmlbeans.XmlString currencysymbol);
    
    /**
     * Unsets the "currencysymbol" element
     */
    void unsetCurrencysymbol();
    
    /**
     * Gets the "dateformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDateformatcode();
    
    /**
     * True if has "dateformatcode" element
     */
    boolean isSetDateformatcode();
    
    /**
     * Sets the "dateformatcode" element
     */
    void setDateformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber dateformatcode);
    
    /**
     * Appends and returns a new empty "dateformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDateformatcode();
    
    /**
     * Unsets the "dateformatcode" element
     */
    void unsetDateformatcode();
    
    /**
     * Gets the "dateformatstring" element
     */
    java.lang.String getDateformatstring();
    
    /**
     * Gets (as xml) the "dateformatstring" element
     */
    org.apache.xmlbeans.XmlString xgetDateformatstring();
    
    /**
     * True if has "dateformatstring" element
     */
    boolean isSetDateformatstring();
    
    /**
     * Sets the "dateformatstring" element
     */
    void setDateformatstring(java.lang.String dateformatstring);
    
    /**
     * Sets (as xml) the "dateformatstring" element
     */
    void xsetDateformatstring(org.apache.xmlbeans.XmlString dateformatstring);
    
    /**
     * Unsets the "dateformatstring" element
     */
    void unsetDateformatstring();
    
    /**
     * Gets the "dateseparator" element
     */
    java.lang.String getDateseparator();
    
    /**
     * Gets (as xml) the "dateseparator" element
     */
    org.apache.xmlbeans.XmlString xgetDateseparator();
    
    /**
     * True if has "dateseparator" element
     */
    boolean isSetDateseparator();
    
    /**
     * Sets the "dateseparator" element
     */
    void setDateseparator(java.lang.String dateseparator);
    
    /**
     * Sets (as xml) the "dateseparator" element
     */
    void xsetDateseparator(org.apache.xmlbeans.XmlString dateseparator);
    
    /**
     * Unsets the "dateseparator" element
     */
    void unsetDateseparator();
    
    /**
     * Gets the "decimalsymbol" element
     */
    java.lang.String getDecimalsymbol();
    
    /**
     * Gets (as xml) the "decimalsymbol" element
     */
    org.apache.xmlbeans.XmlString xgetDecimalsymbol();
    
    /**
     * True if has "decimalsymbol" element
     */
    boolean isSetDecimalsymbol();
    
    /**
     * Sets the "decimalsymbol" element
     */
    void setDecimalsymbol(java.lang.String decimalsymbol);
    
    /**
     * Sets (as xml) the "decimalsymbol" element
     */
    void xsetDecimalsymbol(org.apache.xmlbeans.XmlString decimalsymbol);
    
    /**
     * Unsets the "decimalsymbol" element
     */
    void unsetDecimalsymbol();
    
    /**
     * Gets the "defaultcalendarview" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDefaultcalendarview();
    
    /**
     * True if has "defaultcalendarview" element
     */
    boolean isSetDefaultcalendarview();
    
    /**
     * Sets the "defaultcalendarview" element
     */
    void setDefaultcalendarview(com.microsoft.schemas.crm._2006.webservices.CrmNumber defaultcalendarview);
    
    /**
     * Appends and returns a new empty "defaultcalendarview" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDefaultcalendarview();
    
    /**
     * Unsets the "defaultcalendarview" element
     */
    void unsetDefaultcalendarview();
    
    /**
     * Gets the "emailpassword" element
     */
    java.lang.String getEmailpassword();
    
    /**
     * Gets (as xml) the "emailpassword" element
     */
    org.apache.xmlbeans.XmlString xgetEmailpassword();
    
    /**
     * True if has "emailpassword" element
     */
    boolean isSetEmailpassword();
    
    /**
     * Sets the "emailpassword" element
     */
    void setEmailpassword(java.lang.String emailpassword);
    
    /**
     * Sets (as xml) the "emailpassword" element
     */
    void xsetEmailpassword(org.apache.xmlbeans.XmlString emailpassword);
    
    /**
     * Unsets the "emailpassword" element
     */
    void unsetEmailpassword();
    
    /**
     * Gets the "emailusername" element
     */
    java.lang.String getEmailusername();
    
    /**
     * Gets (as xml) the "emailusername" element
     */
    org.apache.xmlbeans.XmlString xgetEmailusername();
    
    /**
     * True if has "emailusername" element
     */
    boolean isSetEmailusername();
    
    /**
     * Sets the "emailusername" element
     */
    void setEmailusername(java.lang.String emailusername);
    
    /**
     * Sets (as xml) the "emailusername" element
     */
    void xsetEmailusername(org.apache.xmlbeans.XmlString emailusername);
    
    /**
     * Unsets the "emailusername" element
     */
    void unsetEmailusername();
    
    /**
     * Gets the "fullnameconventioncode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getFullnameconventioncode();
    
    /**
     * True if has "fullnameconventioncode" element
     */
    boolean isSetFullnameconventioncode();
    
    /**
     * Sets the "fullnameconventioncode" element
     */
    void setFullnameconventioncode(com.microsoft.schemas.crm._2006.webservices.CrmNumber fullnameconventioncode);
    
    /**
     * Appends and returns a new empty "fullnameconventioncode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFullnameconventioncode();
    
    /**
     * Unsets the "fullnameconventioncode" element
     */
    void unsetFullnameconventioncode();
    
    /**
     * Gets the "helplanguageid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getHelplanguageid();
    
    /**
     * True if has "helplanguageid" element
     */
    boolean isSetHelplanguageid();
    
    /**
     * Sets the "helplanguageid" element
     */
    void setHelplanguageid(com.microsoft.schemas.crm._2006.webservices.CrmNumber helplanguageid);
    
    /**
     * Appends and returns a new empty "helplanguageid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewHelplanguageid();
    
    /**
     * Unsets the "helplanguageid" element
     */
    void unsetHelplanguageid();
    
    /**
     * Gets the "homepagearea" element
     */
    java.lang.String getHomepagearea();
    
    /**
     * Gets (as xml) the "homepagearea" element
     */
    org.apache.xmlbeans.XmlString xgetHomepagearea();
    
    /**
     * True if has "homepagearea" element
     */
    boolean isSetHomepagearea();
    
    /**
     * Sets the "homepagearea" element
     */
    void setHomepagearea(java.lang.String homepagearea);
    
    /**
     * Sets (as xml) the "homepagearea" element
     */
    void xsetHomepagearea(org.apache.xmlbeans.XmlString homepagearea);
    
    /**
     * Unsets the "homepagearea" element
     */
    void unsetHomepagearea();
    
    /**
     * Gets the "homepagesubarea" element
     */
    java.lang.String getHomepagesubarea();
    
    /**
     * Gets (as xml) the "homepagesubarea" element
     */
    org.apache.xmlbeans.XmlString xgetHomepagesubarea();
    
    /**
     * True if has "homepagesubarea" element
     */
    boolean isSetHomepagesubarea();
    
    /**
     * Sets the "homepagesubarea" element
     */
    void setHomepagesubarea(java.lang.String homepagesubarea);
    
    /**
     * Sets (as xml) the "homepagesubarea" element
     */
    void xsetHomepagesubarea(org.apache.xmlbeans.XmlString homepagesubarea);
    
    /**
     * Unsets the "homepagesubarea" element
     */
    void unsetHomepagesubarea();
    
    /**
     * Gets the "ignoreunsolicitedemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIgnoreunsolicitedemail();
    
    /**
     * True if has "ignoreunsolicitedemail" element
     */
    boolean isSetIgnoreunsolicitedemail();
    
    /**
     * Sets the "ignoreunsolicitedemail" element
     */
    void setIgnoreunsolicitedemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ignoreunsolicitedemail);
    
    /**
     * Appends and returns a new empty "ignoreunsolicitedemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIgnoreunsolicitedemail();
    
    /**
     * Unsets the "ignoreunsolicitedemail" element
     */
    void unsetIgnoreunsolicitedemail();
    
    /**
     * Gets the "incomingemailfilteringmethod" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getIncomingemailfilteringmethod();
    
    /**
     * True if has "incomingemailfilteringmethod" element
     */
    boolean isSetIncomingemailfilteringmethod();
    
    /**
     * Sets the "incomingemailfilteringmethod" element
     */
    void setIncomingemailfilteringmethod(com.microsoft.schemas.crm._2006.webservices.Picklist incomingemailfilteringmethod);
    
    /**
     * Appends and returns a new empty "incomingemailfilteringmethod" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewIncomingemailfilteringmethod();
    
    /**
     * Unsets the "incomingemailfilteringmethod" element
     */
    void unsetIncomingemailfilteringmethod();
    
    /**
     * Gets the "isduplicatedetectionenabledwhengoingonline" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsduplicatedetectionenabledwhengoingonline();
    
    /**
     * True if has "isduplicatedetectionenabledwhengoingonline" element
     */
    boolean isSetIsduplicatedetectionenabledwhengoingonline();
    
    /**
     * Sets the "isduplicatedetectionenabledwhengoingonline" element
     */
    void setIsduplicatedetectionenabledwhengoingonline(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isduplicatedetectionenabledwhengoingonline);
    
    /**
     * Appends and returns a new empty "isduplicatedetectionenabledwhengoingonline" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsduplicatedetectionenabledwhengoingonline();
    
    /**
     * Unsets the "isduplicatedetectionenabledwhengoingonline" element
     */
    void unsetIsduplicatedetectionenabledwhengoingonline();
    
    /**
     * Gets the "localeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getLocaleid();
    
    /**
     * True if has "localeid" element
     */
    boolean isSetLocaleid();
    
    /**
     * Sets the "localeid" element
     */
    void setLocaleid(com.microsoft.schemas.crm._2006.webservices.CrmNumber localeid);
    
    /**
     * Appends and returns a new empty "localeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLocaleid();
    
    /**
     * Unsets the "localeid" element
     */
    void unsetLocaleid();
    
    /**
     * Gets the "longdateformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getLongdateformatcode();
    
    /**
     * True if has "longdateformatcode" element
     */
    boolean isSetLongdateformatcode();
    
    /**
     * Sets the "longdateformatcode" element
     */
    void setLongdateformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber longdateformatcode);
    
    /**
     * Appends and returns a new empty "longdateformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLongdateformatcode();
    
    /**
     * Unsets the "longdateformatcode" element
     */
    void unsetLongdateformatcode();
    
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
     * Gets the "negativecurrencyformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getNegativecurrencyformatcode();
    
    /**
     * True if has "negativecurrencyformatcode" element
     */
    boolean isSetNegativecurrencyformatcode();
    
    /**
     * Sets the "negativecurrencyformatcode" element
     */
    void setNegativecurrencyformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber negativecurrencyformatcode);
    
    /**
     * Appends and returns a new empty "negativecurrencyformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNegativecurrencyformatcode();
    
    /**
     * Unsets the "negativecurrencyformatcode" element
     */
    void unsetNegativecurrencyformatcode();
    
    /**
     * Gets the "negativeformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getNegativeformatcode();
    
    /**
     * True if has "negativeformatcode" element
     */
    boolean isSetNegativeformatcode();
    
    /**
     * Sets the "negativeformatcode" element
     */
    void setNegativeformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber negativeformatcode);
    
    /**
     * Appends and returns a new empty "negativeformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNegativeformatcode();
    
    /**
     * Unsets the "negativeformatcode" element
     */
    void unsetNegativeformatcode();
    
    /**
     * Gets the "nexttrackingnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getNexttrackingnumber();
    
    /**
     * True if has "nexttrackingnumber" element
     */
    boolean isSetNexttrackingnumber();
    
    /**
     * Sets the "nexttrackingnumber" element
     */
    void setNexttrackingnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber nexttrackingnumber);
    
    /**
     * Appends and returns a new empty "nexttrackingnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewNexttrackingnumber();
    
    /**
     * Unsets the "nexttrackingnumber" element
     */
    void unsetNexttrackingnumber();
    
    /**
     * Gets the "numbergroupformat" element
     */
    java.lang.String getNumbergroupformat();
    
    /**
     * Gets (as xml) the "numbergroupformat" element
     */
    org.apache.xmlbeans.XmlString xgetNumbergroupformat();
    
    /**
     * True if has "numbergroupformat" element
     */
    boolean isSetNumbergroupformat();
    
    /**
     * Sets the "numbergroupformat" element
     */
    void setNumbergroupformat(java.lang.String numbergroupformat);
    
    /**
     * Sets (as xml) the "numbergroupformat" element
     */
    void xsetNumbergroupformat(org.apache.xmlbeans.XmlString numbergroupformat);
    
    /**
     * Unsets the "numbergroupformat" element
     */
    void unsetNumbergroupformat();
    
    /**
     * Gets the "numberseparator" element
     */
    java.lang.String getNumberseparator();
    
    /**
     * Gets (as xml) the "numberseparator" element
     */
    org.apache.xmlbeans.XmlString xgetNumberseparator();
    
    /**
     * True if has "numberseparator" element
     */
    boolean isSetNumberseparator();
    
    /**
     * Sets the "numberseparator" element
     */
    void setNumberseparator(java.lang.String numberseparator);
    
    /**
     * Sets (as xml) the "numberseparator" element
     */
    void xsetNumberseparator(org.apache.xmlbeans.XmlString numberseparator);
    
    /**
     * Unsets the "numberseparator" element
     */
    void unsetNumberseparator();
    
    /**
     * Gets the "offlinesyncinterval" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getOfflinesyncinterval();
    
    /**
     * True if has "offlinesyncinterval" element
     */
    boolean isSetOfflinesyncinterval();
    
    /**
     * Sets the "offlinesyncinterval" element
     */
    void setOfflinesyncinterval(com.microsoft.schemas.crm._2006.webservices.CrmNumber offlinesyncinterval);
    
    /**
     * Appends and returns a new empty "offlinesyncinterval" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewOfflinesyncinterval();
    
    /**
     * Unsets the "offlinesyncinterval" element
     */
    void unsetOfflinesyncinterval();
    
    /**
     * Gets the "outlooksyncinterval" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getOutlooksyncinterval();
    
    /**
     * True if has "outlooksyncinterval" element
     */
    boolean isSetOutlooksyncinterval();
    
    /**
     * Sets the "outlooksyncinterval" element
     */
    void setOutlooksyncinterval(com.microsoft.schemas.crm._2006.webservices.CrmNumber outlooksyncinterval);
    
    /**
     * Appends and returns a new empty "outlooksyncinterval" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewOutlooksyncinterval();
    
    /**
     * Unsets the "outlooksyncinterval" element
     */
    void unsetOutlooksyncinterval();
    
    /**
     * Gets the "paginglimit" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getPaginglimit();
    
    /**
     * True if has "paginglimit" element
     */
    boolean isSetPaginglimit();
    
    /**
     * Sets the "paginglimit" element
     */
    void setPaginglimit(com.microsoft.schemas.crm._2006.webservices.CrmNumber paginglimit);
    
    /**
     * Appends and returns a new empty "paginglimit" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewPaginglimit();
    
    /**
     * Unsets the "paginglimit" element
     */
    void unsetPaginglimit();
    
    /**
     * Gets the "pmdesignator" element
     */
    java.lang.String getPmdesignator();
    
    /**
     * Gets (as xml) the "pmdesignator" element
     */
    org.apache.xmlbeans.XmlString xgetPmdesignator();
    
    /**
     * True if has "pmdesignator" element
     */
    boolean isSetPmdesignator();
    
    /**
     * Sets the "pmdesignator" element
     */
    void setPmdesignator(java.lang.String pmdesignator);
    
    /**
     * Sets (as xml) the "pmdesignator" element
     */
    void xsetPmdesignator(org.apache.xmlbeans.XmlString pmdesignator);
    
    /**
     * Unsets the "pmdesignator" element
     */
    void unsetPmdesignator();
    
    /**
     * Gets the "pricingdecimalprecision" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getPricingdecimalprecision();
    
    /**
     * True if has "pricingdecimalprecision" element
     */
    boolean isSetPricingdecimalprecision();
    
    /**
     * Sets the "pricingdecimalprecision" element
     */
    void setPricingdecimalprecision(com.microsoft.schemas.crm._2006.webservices.CrmNumber pricingdecimalprecision);
    
    /**
     * Appends and returns a new empty "pricingdecimalprecision" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewPricingdecimalprecision();
    
    /**
     * Unsets the "pricingdecimalprecision" element
     */
    void unsetPricingdecimalprecision();
    
    /**
     * Gets the "reportscripterrors" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getReportscripterrors();
    
    /**
     * True if has "reportscripterrors" element
     */
    boolean isSetReportscripterrors();
    
    /**
     * Sets the "reportscripterrors" element
     */
    void setReportscripterrors(com.microsoft.schemas.crm._2006.webservices.Picklist reportscripterrors);
    
    /**
     * Appends and returns a new empty "reportscripterrors" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewReportscripterrors();
    
    /**
     * Unsets the "reportscripterrors" element
     */
    void unsetReportscripterrors();
    
    /**
     * Gets the "showweeknumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getShowweeknumber();
    
    /**
     * True if has "showweeknumber" element
     */
    boolean isSetShowweeknumber();
    
    /**
     * Sets the "showweeknumber" element
     */
    void setShowweeknumber(com.microsoft.schemas.crm._2006.webservices.CrmBoolean showweeknumber);
    
    /**
     * Appends and returns a new empty "showweeknumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewShowweeknumber();
    
    /**
     * Unsets the "showweeknumber" element
     */
    void unsetShowweeknumber();
    
    /**
     * Gets the "synccontactcompany" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getSynccontactcompany();
    
    /**
     * True if has "synccontactcompany" element
     */
    boolean isSetSynccontactcompany();
    
    /**
     * Sets the "synccontactcompany" element
     */
    void setSynccontactcompany(com.microsoft.schemas.crm._2006.webservices.CrmBoolean synccontactcompany);
    
    /**
     * Appends and returns a new empty "synccontactcompany" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewSynccontactcompany();
    
    /**
     * Unsets the "synccontactcompany" element
     */
    void unsetSynccontactcompany();
    
    /**
     * Gets the "systemuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getSystemuserid();
    
    /**
     * True if has "systemuserid" element
     */
    boolean isSetSystemuserid();
    
    /**
     * Sets the "systemuserid" element
     */
    void setSystemuserid(com.microsoft.schemas.crm._2006.webservices.Key systemuserid);
    
    /**
     * Appends and returns a new empty "systemuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewSystemuserid();
    
    /**
     * Unsets the "systemuserid" element
     */
    void unsetSystemuserid();
    
    /**
     * Gets the "timeformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimeformatcode();
    
    /**
     * True if has "timeformatcode" element
     */
    boolean isSetTimeformatcode();
    
    /**
     * Sets the "timeformatcode" element
     */
    void setTimeformatcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber timeformatcode);
    
    /**
     * Appends and returns a new empty "timeformatcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimeformatcode();
    
    /**
     * Unsets the "timeformatcode" element
     */
    void unsetTimeformatcode();
    
    /**
     * Gets the "timeformatstring" element
     */
    java.lang.String getTimeformatstring();
    
    /**
     * Gets (as xml) the "timeformatstring" element
     */
    org.apache.xmlbeans.XmlString xgetTimeformatstring();
    
    /**
     * True if has "timeformatstring" element
     */
    boolean isSetTimeformatstring();
    
    /**
     * Sets the "timeformatstring" element
     */
    void setTimeformatstring(java.lang.String timeformatstring);
    
    /**
     * Sets (as xml) the "timeformatstring" element
     */
    void xsetTimeformatstring(org.apache.xmlbeans.XmlString timeformatstring);
    
    /**
     * Unsets the "timeformatstring" element
     */
    void unsetTimeformatstring();
    
    /**
     * Gets the "timeseparator" element
     */
    java.lang.String getTimeseparator();
    
    /**
     * Gets (as xml) the "timeseparator" element
     */
    org.apache.xmlbeans.XmlString xgetTimeseparator();
    
    /**
     * True if has "timeseparator" element
     */
    boolean isSetTimeseparator();
    
    /**
     * Sets the "timeseparator" element
     */
    void setTimeseparator(java.lang.String timeseparator);
    
    /**
     * Sets (as xml) the "timeseparator" element
     */
    void xsetTimeseparator(org.apache.xmlbeans.XmlString timeseparator);
    
    /**
     * Unsets the "timeseparator" element
     */
    void unsetTimeseparator();
    
    /**
     * Gets the "timezonebias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonebias();
    
    /**
     * True if has "timezonebias" element
     */
    boolean isSetTimezonebias();
    
    /**
     * Sets the "timezonebias" element
     */
    void setTimezonebias(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonebias);
    
    /**
     * Appends and returns a new empty "timezonebias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonebias();
    
    /**
     * Unsets the "timezonebias" element
     */
    void unsetTimezonebias();
    
    /**
     * Gets the "timezonecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonecode();
    
    /**
     * True if has "timezonecode" element
     */
    boolean isSetTimezonecode();
    
    /**
     * Sets the "timezonecode" element
     */
    void setTimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonecode);
    
    /**
     * Appends and returns a new empty "timezonecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonecode();
    
    /**
     * Unsets the "timezonecode" element
     */
    void unsetTimezonecode();
    
    /**
     * Gets the "timezonedaylightbias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightbias();
    
    /**
     * True if has "timezonedaylightbias" element
     */
    boolean isSetTimezonedaylightbias();
    
    /**
     * Sets the "timezonedaylightbias" element
     */
    void setTimezonedaylightbias(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightbias);
    
    /**
     * Appends and returns a new empty "timezonedaylightbias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightbias();
    
    /**
     * Unsets the "timezonedaylightbias" element
     */
    void unsetTimezonedaylightbias();
    
    /**
     * Gets the "timezonedaylightday" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightday();
    
    /**
     * True if has "timezonedaylightday" element
     */
    boolean isSetTimezonedaylightday();
    
    /**
     * Sets the "timezonedaylightday" element
     */
    void setTimezonedaylightday(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightday);
    
    /**
     * Appends and returns a new empty "timezonedaylightday" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightday();
    
    /**
     * Unsets the "timezonedaylightday" element
     */
    void unsetTimezonedaylightday();
    
    /**
     * Gets the "timezonedaylightdayofweek" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightdayofweek();
    
    /**
     * True if has "timezonedaylightdayofweek" element
     */
    boolean isSetTimezonedaylightdayofweek();
    
    /**
     * Sets the "timezonedaylightdayofweek" element
     */
    void setTimezonedaylightdayofweek(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightdayofweek);
    
    /**
     * Appends and returns a new empty "timezonedaylightdayofweek" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightdayofweek();
    
    /**
     * Unsets the "timezonedaylightdayofweek" element
     */
    void unsetTimezonedaylightdayofweek();
    
    /**
     * Gets the "timezonedaylighthour" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylighthour();
    
    /**
     * True if has "timezonedaylighthour" element
     */
    boolean isSetTimezonedaylighthour();
    
    /**
     * Sets the "timezonedaylighthour" element
     */
    void setTimezonedaylighthour(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylighthour);
    
    /**
     * Appends and returns a new empty "timezonedaylighthour" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylighthour();
    
    /**
     * Unsets the "timezonedaylighthour" element
     */
    void unsetTimezonedaylighthour();
    
    /**
     * Gets the "timezonedaylightminute" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightminute();
    
    /**
     * True if has "timezonedaylightminute" element
     */
    boolean isSetTimezonedaylightminute();
    
    /**
     * Sets the "timezonedaylightminute" element
     */
    void setTimezonedaylightminute(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightminute);
    
    /**
     * Appends and returns a new empty "timezonedaylightminute" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightminute();
    
    /**
     * Unsets the "timezonedaylightminute" element
     */
    void unsetTimezonedaylightminute();
    
    /**
     * Gets the "timezonedaylightmonth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightmonth();
    
    /**
     * True if has "timezonedaylightmonth" element
     */
    boolean isSetTimezonedaylightmonth();
    
    /**
     * Sets the "timezonedaylightmonth" element
     */
    void setTimezonedaylightmonth(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightmonth);
    
    /**
     * Appends and returns a new empty "timezonedaylightmonth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightmonth();
    
    /**
     * Unsets the "timezonedaylightmonth" element
     */
    void unsetTimezonedaylightmonth();
    
    /**
     * Gets the "timezonedaylightsecond" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightsecond();
    
    /**
     * True if has "timezonedaylightsecond" element
     */
    boolean isSetTimezonedaylightsecond();
    
    /**
     * Sets the "timezonedaylightsecond" element
     */
    void setTimezonedaylightsecond(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightsecond);
    
    /**
     * Appends and returns a new empty "timezonedaylightsecond" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightsecond();
    
    /**
     * Unsets the "timezonedaylightsecond" element
     */
    void unsetTimezonedaylightsecond();
    
    /**
     * Gets the "timezonedaylightyear" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonedaylightyear();
    
    /**
     * True if has "timezonedaylightyear" element
     */
    boolean isSetTimezonedaylightyear();
    
    /**
     * Sets the "timezonedaylightyear" element
     */
    void setTimezonedaylightyear(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonedaylightyear);
    
    /**
     * Appends and returns a new empty "timezonedaylightyear" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonedaylightyear();
    
    /**
     * Unsets the "timezonedaylightyear" element
     */
    void unsetTimezonedaylightyear();
    
    /**
     * Gets the "timezonestandardbias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardbias();
    
    /**
     * True if has "timezonestandardbias" element
     */
    boolean isSetTimezonestandardbias();
    
    /**
     * Sets the "timezonestandardbias" element
     */
    void setTimezonestandardbias(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardbias);
    
    /**
     * Appends and returns a new empty "timezonestandardbias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardbias();
    
    /**
     * Unsets the "timezonestandardbias" element
     */
    void unsetTimezonestandardbias();
    
    /**
     * Gets the "timezonestandardday" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardday();
    
    /**
     * True if has "timezonestandardday" element
     */
    boolean isSetTimezonestandardday();
    
    /**
     * Sets the "timezonestandardday" element
     */
    void setTimezonestandardday(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardday);
    
    /**
     * Appends and returns a new empty "timezonestandardday" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardday();
    
    /**
     * Unsets the "timezonestandardday" element
     */
    void unsetTimezonestandardday();
    
    /**
     * Gets the "timezonestandarddayofweek" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandarddayofweek();
    
    /**
     * True if has "timezonestandarddayofweek" element
     */
    boolean isSetTimezonestandarddayofweek();
    
    /**
     * Sets the "timezonestandarddayofweek" element
     */
    void setTimezonestandarddayofweek(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandarddayofweek);
    
    /**
     * Appends and returns a new empty "timezonestandarddayofweek" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandarddayofweek();
    
    /**
     * Unsets the "timezonestandarddayofweek" element
     */
    void unsetTimezonestandarddayofweek();
    
    /**
     * Gets the "timezonestandardhour" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardhour();
    
    /**
     * True if has "timezonestandardhour" element
     */
    boolean isSetTimezonestandardhour();
    
    /**
     * Sets the "timezonestandardhour" element
     */
    void setTimezonestandardhour(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardhour);
    
    /**
     * Appends and returns a new empty "timezonestandardhour" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardhour();
    
    /**
     * Unsets the "timezonestandardhour" element
     */
    void unsetTimezonestandardhour();
    
    /**
     * Gets the "timezonestandardminute" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardminute();
    
    /**
     * True if has "timezonestandardminute" element
     */
    boolean isSetTimezonestandardminute();
    
    /**
     * Sets the "timezonestandardminute" element
     */
    void setTimezonestandardminute(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardminute);
    
    /**
     * Appends and returns a new empty "timezonestandardminute" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardminute();
    
    /**
     * Unsets the "timezonestandardminute" element
     */
    void unsetTimezonestandardminute();
    
    /**
     * Gets the "timezonestandardmonth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardmonth();
    
    /**
     * True if has "timezonestandardmonth" element
     */
    boolean isSetTimezonestandardmonth();
    
    /**
     * Sets the "timezonestandardmonth" element
     */
    void setTimezonestandardmonth(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardmonth);
    
    /**
     * Appends and returns a new empty "timezonestandardmonth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardmonth();
    
    /**
     * Unsets the "timezonestandardmonth" element
     */
    void unsetTimezonestandardmonth();
    
    /**
     * Gets the "timezonestandardsecond" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardsecond();
    
    /**
     * True if has "timezonestandardsecond" element
     */
    boolean isSetTimezonestandardsecond();
    
    /**
     * Sets the "timezonestandardsecond" element
     */
    void setTimezonestandardsecond(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardsecond);
    
    /**
     * Appends and returns a new empty "timezonestandardsecond" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardsecond();
    
    /**
     * Unsets the "timezonestandardsecond" element
     */
    void unsetTimezonestandardsecond();
    
    /**
     * Gets the "timezonestandardyear" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonestandardyear();
    
    /**
     * True if has "timezonestandardyear" element
     */
    boolean isSetTimezonestandardyear();
    
    /**
     * Sets the "timezonestandardyear" element
     */
    void setTimezonestandardyear(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonestandardyear);
    
    /**
     * Appends and returns a new empty "timezonestandardyear" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonestandardyear();
    
    /**
     * Unsets the "timezonestandardyear" element
     */
    void unsetTimezonestandardyear();
    
    /**
     * Gets the "trackingtokenid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTrackingtokenid();
    
    /**
     * True if has "trackingtokenid" element
     */
    boolean isSetTrackingtokenid();
    
    /**
     * Sets the "trackingtokenid" element
     */
    void setTrackingtokenid(com.microsoft.schemas.crm._2006.webservices.CrmNumber trackingtokenid);
    
    /**
     * Appends and returns a new empty "trackingtokenid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTrackingtokenid();
    
    /**
     * Unsets the "trackingtokenid" element
     */
    void unsetTrackingtokenid();
    
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
     * Gets the "uilanguageid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getUilanguageid();
    
    /**
     * True if has "uilanguageid" element
     */
    boolean isSetUilanguageid();
    
    /**
     * Sets the "uilanguageid" element
     */
    void setUilanguageid(com.microsoft.schemas.crm._2006.webservices.CrmNumber uilanguageid);
    
    /**
     * Appends and returns a new empty "uilanguageid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUilanguageid();
    
    /**
     * Unsets the "uilanguageid" element
     */
    void unsetUilanguageid();
    
    /**
     * Gets the "usecrmformforappointment" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsecrmformforappointment();
    
    /**
     * True if has "usecrmformforappointment" element
     */
    boolean isSetUsecrmformforappointment();
    
    /**
     * Sets the "usecrmformforappointment" element
     */
    void setUsecrmformforappointment(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usecrmformforappointment);
    
    /**
     * Appends and returns a new empty "usecrmformforappointment" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsecrmformforappointment();
    
    /**
     * Unsets the "usecrmformforappointment" element
     */
    void unsetUsecrmformforappointment();
    
    /**
     * Gets the "usecrmformforcontact" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsecrmformforcontact();
    
    /**
     * True if has "usecrmformforcontact" element
     */
    boolean isSetUsecrmformforcontact();
    
    /**
     * Sets the "usecrmformforcontact" element
     */
    void setUsecrmformforcontact(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usecrmformforcontact);
    
    /**
     * Appends and returns a new empty "usecrmformforcontact" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsecrmformforcontact();
    
    /**
     * Unsets the "usecrmformforcontact" element
     */
    void unsetUsecrmformforcontact();
    
    /**
     * Gets the "usecrmformforemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsecrmformforemail();
    
    /**
     * True if has "usecrmformforemail" element
     */
    boolean isSetUsecrmformforemail();
    
    /**
     * Sets the "usecrmformforemail" element
     */
    void setUsecrmformforemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usecrmformforemail);
    
    /**
     * Appends and returns a new empty "usecrmformforemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsecrmformforemail();
    
    /**
     * Unsets the "usecrmformforemail" element
     */
    void unsetUsecrmformforemail();
    
    /**
     * Gets the "usecrmformfortask" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsecrmformfortask();
    
    /**
     * True if has "usecrmformfortask" element
     */
    boolean isSetUsecrmformfortask();
    
    /**
     * Sets the "usecrmformfortask" element
     */
    void setUsecrmformfortask(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usecrmformfortask);
    
    /**
     * Appends and returns a new empty "usecrmformfortask" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsecrmformfortask();
    
    /**
     * Unsets the "usecrmformfortask" element
     */
    void unsetUsecrmformfortask();
    
    /**
     * Gets the "useimagestrips" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUseimagestrips();
    
    /**
     * True if has "useimagestrips" element
     */
    boolean isSetUseimagestrips();
    
    /**
     * Sets the "useimagestrips" element
     */
    void setUseimagestrips(com.microsoft.schemas.crm._2006.webservices.CrmBoolean useimagestrips);
    
    /**
     * Appends and returns a new empty "useimagestrips" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUseimagestrips();
    
    /**
     * Unsets the "useimagestrips" element
     */
    void unsetUseimagestrips();
    
    /**
     * Gets the "userprofile" element
     */
    java.lang.String getUserprofile();
    
    /**
     * Gets (as xml) the "userprofile" element
     */
    org.apache.xmlbeans.XmlString xgetUserprofile();
    
    /**
     * True if has "userprofile" element
     */
    boolean isSetUserprofile();
    
    /**
     * Sets the "userprofile" element
     */
    void setUserprofile(java.lang.String userprofile);
    
    /**
     * Sets (as xml) the "userprofile" element
     */
    void xsetUserprofile(org.apache.xmlbeans.XmlString userprofile);
    
    /**
     * Unsets the "userprofile" element
     */
    void unsetUserprofile();
    
    /**
     * Gets the "workdaystarttime" element
     */
    java.lang.String getWorkdaystarttime();
    
    /**
     * Gets (as xml) the "workdaystarttime" element
     */
    org.apache.xmlbeans.XmlString xgetWorkdaystarttime();
    
    /**
     * True if has "workdaystarttime" element
     */
    boolean isSetWorkdaystarttime();
    
    /**
     * Sets the "workdaystarttime" element
     */
    void setWorkdaystarttime(java.lang.String workdaystarttime);
    
    /**
     * Sets (as xml) the "workdaystarttime" element
     */
    void xsetWorkdaystarttime(org.apache.xmlbeans.XmlString workdaystarttime);
    
    /**
     * Unsets the "workdaystarttime" element
     */
    void unsetWorkdaystarttime();
    
    /**
     * Gets the "workdaystoptime" element
     */
    java.lang.String getWorkdaystoptime();
    
    /**
     * Gets (as xml) the "workdaystoptime" element
     */
    org.apache.xmlbeans.XmlString xgetWorkdaystoptime();
    
    /**
     * True if has "workdaystoptime" element
     */
    boolean isSetWorkdaystoptime();
    
    /**
     * Sets the "workdaystoptime" element
     */
    void setWorkdaystoptime(java.lang.String workdaystoptime);
    
    /**
     * Sets (as xml) the "workdaystoptime" element
     */
    void xsetWorkdaystoptime(org.apache.xmlbeans.XmlString workdaystoptime);
    
    /**
     * Unsets the "workdaystoptime" element
     */
    void unsetWorkdaystoptime();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Usersettings parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Usersettings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
