/*
 * XML Type:  organization
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Organization
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML organization(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class OrganizationImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Organization
{
    
    public OrganizationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACKNOWLEDGEMENTTEMPLATEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "acknowledgementtemplateid");
    private static final javax.xml.namespace.QName ALLOWADDRESSBOOKSYNCS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowaddressbooksyncs");
    private static final javax.xml.namespace.QName ALLOWAUTORESPONSECREATION$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowautoresponsecreation");
    private static final javax.xml.namespace.QName ALLOWAUTOUNSUBSCRIBE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowautounsubscribe");
    private static final javax.xml.namespace.QName ALLOWAUTOUNSUBSCRIBEACKNOWLEDGEMENT$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowautounsubscribeacknowledgement");
    private static final javax.xml.namespace.QName ALLOWMARKETINGEMAILEXECUTION$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowmarketingemailexecution");
    private static final javax.xml.namespace.QName ALLOWOFFLINESCHEDULEDSYNCS$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowofflinescheduledsyncs");
    private static final javax.xml.namespace.QName ALLOWOUTLOOKSCHEDULEDSYNCS$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowoutlookscheduledsyncs");
    private static final javax.xml.namespace.QName ALLOWUNRESOLVEDPARTIESONEMAILSEND$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowunresolvedpartiesonemailsend");
    private static final javax.xml.namespace.QName ALLOWWEBEXCELEXPORT$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allowwebexcelexport");
    private static final javax.xml.namespace.QName AMDESIGNATOR$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "amdesignator");
    private static final javax.xml.namespace.QName BASECURRENCYID$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "basecurrencyid");
    private static final javax.xml.namespace.QName BLOCKEDATTACHMENTS$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "blockedattachments");
    private static final javax.xml.namespace.QName BULKOPERATIONPREFIX$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "bulkoperationprefix");
    private static final javax.xml.namespace.QName BUSINESSCLOSURECALENDARID$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "businessclosurecalendarid");
    private static final javax.xml.namespace.QName CALENDARTYPE$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "calendartype");
    private static final javax.xml.namespace.QName CAMPAIGNPREFIX$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "campaignprefix");
    private static final javax.xml.namespace.QName CASEPREFIX$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "caseprefix");
    private static final javax.xml.namespace.QName CONTRACTPREFIX$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contractprefix");
    private static final javax.xml.namespace.QName CREATEDBY$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CURRENCYDECIMALPRECISION$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currencydecimalprecision");
    private static final javax.xml.namespace.QName CURRENCYDISPLAYOPTION$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currencydisplayoption");
    private static final javax.xml.namespace.QName CURRENCYFORMATCODE$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currencyformatcode");
    private static final javax.xml.namespace.QName CURRENCYSYMBOL$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currencysymbol");
    private static final javax.xml.namespace.QName CURRENTBULKOPERATIONNUMBER$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentbulkoperationnumber");
    private static final javax.xml.namespace.QName CURRENTCAMPAIGNNUMBER$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentcampaignnumber");
    private static final javax.xml.namespace.QName CURRENTCASENUMBER$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentcasenumber");
    private static final javax.xml.namespace.QName CURRENTCONTRACTNUMBER$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentcontractnumber");
    private static final javax.xml.namespace.QName CURRENTIMPORTSEQUENCENUMBER$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentimportsequencenumber");
    private static final javax.xml.namespace.QName CURRENTINVOICENUMBER$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentinvoicenumber");
    private static final javax.xml.namespace.QName CURRENTKBNUMBER$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentkbnumber");
    private static final javax.xml.namespace.QName CURRENTORDERNUMBER$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentordernumber");
    private static final javax.xml.namespace.QName CURRENTPARSEDTABLENUMBER$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentparsedtablenumber");
    private static final javax.xml.namespace.QName CURRENTQUOTENUMBER$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "currentquotenumber");
    private static final javax.xml.namespace.QName DATEFORMATCODE$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "dateformatcode");
    private static final javax.xml.namespace.QName DATEFORMATSTRING$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "dateformatstring");
    private static final javax.xml.namespace.QName DATESEPARATOR$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "dateseparator");
    private static final javax.xml.namespace.QName DECIMALSYMBOL$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "decimalsymbol");
    private static final javax.xml.namespace.QName DISABLEDREASON$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "disabledreason");
    private static final javax.xml.namespace.QName EMAILSENDPOLLINGPERIOD$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "emailsendpollingperiod");
    private static final javax.xml.namespace.QName ENABLEPRICINGONCREATE$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "enablepricingoncreate");
    private static final javax.xml.namespace.QName FEATURESET$84 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "featureset");
    private static final javax.xml.namespace.QName FISCALCALENDARSTART$86 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fiscalcalendarstart");
    private static final javax.xml.namespace.QName FISCALPERIODFORMAT$88 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fiscalperiodformat");
    private static final javax.xml.namespace.QName FISCALPERIODTYPE$90 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fiscalperiodtype");
    private static final javax.xml.namespace.QName FISCALSETTINGSUPDATED$92 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fiscalsettingsupdated");
    private static final javax.xml.namespace.QName FISCALYEARDISPLAYCODE$94 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fiscalyeardisplaycode");
    private static final javax.xml.namespace.QName FISCALYEARFORMAT$96 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fiscalyearformat");
    private static final javax.xml.namespace.QName FISCALYEARPERIODCONNECT$98 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fiscalyearperiodconnect");
    private static final javax.xml.namespace.QName FULLNAMECONVENTIONCODE$100 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fullnameconventioncode");
    private static final javax.xml.namespace.QName GRANTACCESSTONETWORKSERVICE$102 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "grantaccesstonetworkservice");
    private static final javax.xml.namespace.QName IGNOREINTERNALEMAIL$104 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ignoreinternalemail");
    private static final javax.xml.namespace.QName INTEGRATIONUSERID$106 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "integrationuserid");
    private static final javax.xml.namespace.QName INVOICEPREFIX$108 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "invoiceprefix");
    private static final javax.xml.namespace.QName ISAPPMODE$110 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isappmode");
    private static final javax.xml.namespace.QName ISDISABLED$112 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isdisabled");
    private static final javax.xml.namespace.QName ISDUPLICATEDETECTIONENABLED$114 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isduplicatedetectionenabled");
    private static final javax.xml.namespace.QName ISDUPLICATEDETECTIONENABLEDFORIMPORT$116 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isduplicatedetectionenabledforimport");
    private static final javax.xml.namespace.QName ISDUPLICATEDETECTIONENABLEDFOROFFLINESYNC$118 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isduplicatedetectionenabledforofflinesync");
    private static final javax.xml.namespace.QName ISDUPLICATEDETECTIONENABLEDFORONLINECREATEUPDATE$120 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isduplicatedetectionenabledforonlinecreateupdate");
    private static final javax.xml.namespace.QName ISFISCALPERIODMONTHBASED$122 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isfiscalperiodmonthbased");
    private static final javax.xml.namespace.QName ISPRESENCEENABLED$124 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ispresenceenabled");
    private static final javax.xml.namespace.QName ISREGISTERED$126 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isregistered");
    private static final javax.xml.namespace.QName ISSOPINTEGRATIONENABLED$128 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "issopintegrationenabled");
    private static final javax.xml.namespace.QName ISVINTEGRATIONCODE$130 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isvintegrationcode");
    private static final javax.xml.namespace.QName KBPREFIX$132 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "kbprefix");
    private static final javax.xml.namespace.QName LANGUAGECODE$134 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "languagecode");
    private static final javax.xml.namespace.QName LOCALEID$136 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "localeid");
    private static final javax.xml.namespace.QName LONGDATEFORMATCODE$138 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "longdateformatcode");
    private static final javax.xml.namespace.QName MAXAPPOINTMENTDURATIONDAYS$140 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "maxappointmentdurationdays");
    private static final javax.xml.namespace.QName MAXIMUMTRACKINGNUMBER$142 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "maximumtrackingnumber");
    private static final javax.xml.namespace.QName MAXRECORDSFOREXPORTTOEXCEL$144 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "maxrecordsforexporttoexcel");
    private static final javax.xml.namespace.QName MAXUPLOADFILESIZE$146 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "maxuploadfilesize");
    private static final javax.xml.namespace.QName MINADDRESSBOOKSYNCINTERVAL$148 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "minaddressbooksyncinterval");
    private static final javax.xml.namespace.QName MINOFFLINESYNCINTERVAL$150 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "minofflinesyncinterval");
    private static final javax.xml.namespace.QName MINOUTLOOKSYNCINTERVAL$152 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "minoutlooksyncinterval");
    private static final javax.xml.namespace.QName MODIFIEDBY$154 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$156 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$158 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName NEGATIVECURRENCYFORMATCODE$160 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "negativecurrencyformatcode");
    private static final javax.xml.namespace.QName NEGATIVEFORMATCODE$162 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "negativeformatcode");
    private static final javax.xml.namespace.QName NEXTTRACKINGNUMBER$164 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "nexttrackingnumber");
    private static final javax.xml.namespace.QName NUMBERFORMAT$166 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "numberformat");
    private static final javax.xml.namespace.QName NUMBERGROUPFORMAT$168 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "numbergroupformat");
    private static final javax.xml.namespace.QName NUMBERSEPARATOR$170 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "numberseparator");
    private static final javax.xml.namespace.QName ORDERPREFIX$172 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "orderprefix");
    private static final javax.xml.namespace.QName ORGANIZATIONID$174 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName PARSEDTABLECOLUMNPREFIX$176 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parsedtablecolumnprefix");
    private static final javax.xml.namespace.QName PARSEDTABLEPREFIX$178 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parsedtableprefix");
    private static final javax.xml.namespace.QName PICTURE$180 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "picture");
    private static final javax.xml.namespace.QName PMDESIGNATOR$182 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pmdesignator");
    private static final javax.xml.namespace.QName PRICINGDECIMALPRECISION$184 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricingdecimalprecision");
    private static final javax.xml.namespace.QName PRIVILEGEUSERGROUPID$186 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "privilegeusergroupid");
    private static final javax.xml.namespace.QName PRIVREPORTINGGROUPID$188 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "privreportinggroupid");
    private static final javax.xml.namespace.QName PRIVREPORTINGGROUPNAME$190 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "privreportinggroupname");
    private static final javax.xml.namespace.QName QUOTEPREFIX$192 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "quoteprefix");
    private static final javax.xml.namespace.QName REFERENCESITEMAPXML$194 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "referencesitemapxml");
    private static final javax.xml.namespace.QName RENDERSECUREIFRAMEFOREMAIL$196 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "rendersecureiframeforemail");
    private static final javax.xml.namespace.QName REPORTINGGROUPID$198 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "reportinggroupid");
    private static final javax.xml.namespace.QName REPORTINGGROUPNAME$200 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "reportinggroupname");
    private static final javax.xml.namespace.QName SCHEMANAMEPREFIX$202 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "schemanameprefix");
    private static final javax.xml.namespace.QName SHARETOPREVIOUSOWNERONASSIGN$204 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sharetopreviousowneronassign");
    private static final javax.xml.namespace.QName SHOWWEEKNUMBER$206 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "showweeknumber");
    private static final javax.xml.namespace.QName SITEMAPXML$208 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sitemapxml");
    private static final javax.xml.namespace.QName SORTID$210 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sortid");
    private static final javax.xml.namespace.QName SQLACCESSGROUPID$212 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sqlaccessgroupid");
    private static final javax.xml.namespace.QName SQLACCESSGROUPNAME$214 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sqlaccessgroupname");
    private static final javax.xml.namespace.QName SQMENABLED$216 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sqmenabled");
    private static final javax.xml.namespace.QName SUPPORTUSERID$218 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "supportuserid");
    private static final javax.xml.namespace.QName SYSTEMUSERID$220 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "systemuserid");
    private static final javax.xml.namespace.QName TAGMAXAGGRESSIVECYCLES$222 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "tagmaxaggressivecycles");
    private static final javax.xml.namespace.QName TAGPOLLINGPERIOD$224 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "tagpollingperiod");
    private static final javax.xml.namespace.QName TIMEFORMATCODE$226 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timeformatcode");
    private static final javax.xml.namespace.QName TIMEFORMATSTRING$228 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timeformatstring");
    private static final javax.xml.namespace.QName TIMESEPARATOR$230 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timeseparator");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$232 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TOKENEXPIRY$234 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "tokenexpiry");
    private static final javax.xml.namespace.QName TOKENKEY$236 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "tokenkey");
    private static final javax.xml.namespace.QName TRACKINGPREFIX$238 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "trackingprefix");
    private static final javax.xml.namespace.QName TRACKINGTOKENIDBASE$240 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "trackingtokenidbase");
    private static final javax.xml.namespace.QName TRACKINGTOKENIDDIGITS$242 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "trackingtokeniddigits");
    private static final javax.xml.namespace.QName UNIQUESPECIFIERLENGTH$244 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "uniquespecifierlength");
    private static final javax.xml.namespace.QName USERGROUPID$246 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "usergroupid");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$248 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    private static final javax.xml.namespace.QName V3CALLOUTCONFIGHASH$250 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "v3calloutconfighash");
    private static final javax.xml.namespace.QName WEEKSTARTDAYCODE$252 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "weekstartdaycode");
    private static final javax.xml.namespace.QName YEARSTARTWEEKCODE$254 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "yearstartweekcode");
    
    
    /**
     * Gets the "acknowledgementtemplateid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getAcknowledgementtemplateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ACKNOWLEDGEMENTTEMPLATEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "acknowledgementtemplateid" element
     */
    public boolean isSetAcknowledgementtemplateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACKNOWLEDGEMENTTEMPLATEID$0) != 0;
        }
    }
    
    /**
     * Sets the "acknowledgementtemplateid" element
     */
    public void setAcknowledgementtemplateid(com.microsoft.schemas.crm._2006.webservices.Lookup acknowledgementtemplateid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ACKNOWLEDGEMENTTEMPLATEID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ACKNOWLEDGEMENTTEMPLATEID$0);
            }
            target.set(acknowledgementtemplateid);
        }
    }
    
    /**
     * Appends and returns a new empty "acknowledgementtemplateid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewAcknowledgementtemplateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ACKNOWLEDGEMENTTEMPLATEID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "acknowledgementtemplateid" element
     */
    public void unsetAcknowledgementtemplateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACKNOWLEDGEMENTTEMPLATEID$0, 0);
        }
    }
    
    /**
     * Gets the "allowaddressbooksyncs" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowaddressbooksyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWADDRESSBOOKSYNCS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowaddressbooksyncs" element
     */
    public boolean isSetAllowaddressbooksyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWADDRESSBOOKSYNCS$2) != 0;
        }
    }
    
    /**
     * Sets the "allowaddressbooksyncs" element
     */
    public void setAllowaddressbooksyncs(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowaddressbooksyncs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWADDRESSBOOKSYNCS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWADDRESSBOOKSYNCS$2);
            }
            target.set(allowaddressbooksyncs);
        }
    }
    
    /**
     * Appends and returns a new empty "allowaddressbooksyncs" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowaddressbooksyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWADDRESSBOOKSYNCS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "allowaddressbooksyncs" element
     */
    public void unsetAllowaddressbooksyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWADDRESSBOOKSYNCS$2, 0);
        }
    }
    
    /**
     * Gets the "allowautoresponsecreation" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowautoresponsecreation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWAUTORESPONSECREATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowautoresponsecreation" element
     */
    public boolean isSetAllowautoresponsecreation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWAUTORESPONSECREATION$4) != 0;
        }
    }
    
    /**
     * Sets the "allowautoresponsecreation" element
     */
    public void setAllowautoresponsecreation(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowautoresponsecreation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWAUTORESPONSECREATION$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWAUTORESPONSECREATION$4);
            }
            target.set(allowautoresponsecreation);
        }
    }
    
    /**
     * Appends and returns a new empty "allowautoresponsecreation" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowautoresponsecreation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWAUTORESPONSECREATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "allowautoresponsecreation" element
     */
    public void unsetAllowautoresponsecreation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWAUTORESPONSECREATION$4, 0);
        }
    }
    
    /**
     * Gets the "allowautounsubscribe" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowautounsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWAUTOUNSUBSCRIBE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowautounsubscribe" element
     */
    public boolean isSetAllowautounsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWAUTOUNSUBSCRIBE$6) != 0;
        }
    }
    
    /**
     * Sets the "allowautounsubscribe" element
     */
    public void setAllowautounsubscribe(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowautounsubscribe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWAUTOUNSUBSCRIBE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWAUTOUNSUBSCRIBE$6);
            }
            target.set(allowautounsubscribe);
        }
    }
    
    /**
     * Appends and returns a new empty "allowautounsubscribe" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowautounsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWAUTOUNSUBSCRIBE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "allowautounsubscribe" element
     */
    public void unsetAllowautounsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWAUTOUNSUBSCRIBE$6, 0);
        }
    }
    
    /**
     * Gets the "allowautounsubscribeacknowledgement" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowautounsubscribeacknowledgement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWAUTOUNSUBSCRIBEACKNOWLEDGEMENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowautounsubscribeacknowledgement" element
     */
    public boolean isSetAllowautounsubscribeacknowledgement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWAUTOUNSUBSCRIBEACKNOWLEDGEMENT$8) != 0;
        }
    }
    
    /**
     * Sets the "allowautounsubscribeacknowledgement" element
     */
    public void setAllowautounsubscribeacknowledgement(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowautounsubscribeacknowledgement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWAUTOUNSUBSCRIBEACKNOWLEDGEMENT$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWAUTOUNSUBSCRIBEACKNOWLEDGEMENT$8);
            }
            target.set(allowautounsubscribeacknowledgement);
        }
    }
    
    /**
     * Appends and returns a new empty "allowautounsubscribeacknowledgement" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowautounsubscribeacknowledgement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWAUTOUNSUBSCRIBEACKNOWLEDGEMENT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "allowautounsubscribeacknowledgement" element
     */
    public void unsetAllowautounsubscribeacknowledgement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWAUTOUNSUBSCRIBEACKNOWLEDGEMENT$8, 0);
        }
    }
    
    /**
     * Gets the "allowmarketingemailexecution" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowmarketingemailexecution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWMARKETINGEMAILEXECUTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowmarketingemailexecution" element
     */
    public boolean isSetAllowmarketingemailexecution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWMARKETINGEMAILEXECUTION$10) != 0;
        }
    }
    
    /**
     * Sets the "allowmarketingemailexecution" element
     */
    public void setAllowmarketingemailexecution(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowmarketingemailexecution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWMARKETINGEMAILEXECUTION$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWMARKETINGEMAILEXECUTION$10);
            }
            target.set(allowmarketingemailexecution);
        }
    }
    
    /**
     * Appends and returns a new empty "allowmarketingemailexecution" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowmarketingemailexecution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWMARKETINGEMAILEXECUTION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "allowmarketingemailexecution" element
     */
    public void unsetAllowmarketingemailexecution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWMARKETINGEMAILEXECUTION$10, 0);
        }
    }
    
    /**
     * Gets the "allowofflinescheduledsyncs" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowofflinescheduledsyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWOFFLINESCHEDULEDSYNCS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowofflinescheduledsyncs" element
     */
    public boolean isSetAllowofflinescheduledsyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWOFFLINESCHEDULEDSYNCS$12) != 0;
        }
    }
    
    /**
     * Sets the "allowofflinescheduledsyncs" element
     */
    public void setAllowofflinescheduledsyncs(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowofflinescheduledsyncs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWOFFLINESCHEDULEDSYNCS$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWOFFLINESCHEDULEDSYNCS$12);
            }
            target.set(allowofflinescheduledsyncs);
        }
    }
    
    /**
     * Appends and returns a new empty "allowofflinescheduledsyncs" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowofflinescheduledsyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWOFFLINESCHEDULEDSYNCS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "allowofflinescheduledsyncs" element
     */
    public void unsetAllowofflinescheduledsyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWOFFLINESCHEDULEDSYNCS$12, 0);
        }
    }
    
    /**
     * Gets the "allowoutlookscheduledsyncs" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowoutlookscheduledsyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWOUTLOOKSCHEDULEDSYNCS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowoutlookscheduledsyncs" element
     */
    public boolean isSetAllowoutlookscheduledsyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWOUTLOOKSCHEDULEDSYNCS$14) != 0;
        }
    }
    
    /**
     * Sets the "allowoutlookscheduledsyncs" element
     */
    public void setAllowoutlookscheduledsyncs(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowoutlookscheduledsyncs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWOUTLOOKSCHEDULEDSYNCS$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWOUTLOOKSCHEDULEDSYNCS$14);
            }
            target.set(allowoutlookscheduledsyncs);
        }
    }
    
    /**
     * Appends and returns a new empty "allowoutlookscheduledsyncs" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowoutlookscheduledsyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWOUTLOOKSCHEDULEDSYNCS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "allowoutlookscheduledsyncs" element
     */
    public void unsetAllowoutlookscheduledsyncs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWOUTLOOKSCHEDULEDSYNCS$14, 0);
        }
    }
    
    /**
     * Gets the "allowunresolvedpartiesonemailsend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowunresolvedpartiesonemailsend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWUNRESOLVEDPARTIESONEMAILSEND$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowunresolvedpartiesonemailsend" element
     */
    public boolean isSetAllowunresolvedpartiesonemailsend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWUNRESOLVEDPARTIESONEMAILSEND$16) != 0;
        }
    }
    
    /**
     * Sets the "allowunresolvedpartiesonemailsend" element
     */
    public void setAllowunresolvedpartiesonemailsend(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowunresolvedpartiesonemailsend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWUNRESOLVEDPARTIESONEMAILSEND$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWUNRESOLVEDPARTIESONEMAILSEND$16);
            }
            target.set(allowunresolvedpartiesonemailsend);
        }
    }
    
    /**
     * Appends and returns a new empty "allowunresolvedpartiesonemailsend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowunresolvedpartiesonemailsend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWUNRESOLVEDPARTIESONEMAILSEND$16);
            return target;
        }
    }
    
    /**
     * Unsets the "allowunresolvedpartiesonemailsend" element
     */
    public void unsetAllowunresolvedpartiesonemailsend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWUNRESOLVEDPARTIESONEMAILSEND$16, 0);
        }
    }
    
    /**
     * Gets the "allowwebexcelexport" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowwebexcelexport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWWEBEXCELEXPORT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allowwebexcelexport" element
     */
    public boolean isSetAllowwebexcelexport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWWEBEXCELEXPORT$18) != 0;
        }
    }
    
    /**
     * Sets the "allowwebexcelexport" element
     */
    public void setAllowwebexcelexport(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowwebexcelexport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ALLOWWEBEXCELEXPORT$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWWEBEXCELEXPORT$18);
            }
            target.set(allowwebexcelexport);
        }
    }
    
    /**
     * Appends and returns a new empty "allowwebexcelexport" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowwebexcelexport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ALLOWWEBEXCELEXPORT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "allowwebexcelexport" element
     */
    public void unsetAllowwebexcelexport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWWEBEXCELEXPORT$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMDESIGNATOR$20, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMDESIGNATOR$20, 0);
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
            return get_store().count_elements(AMDESIGNATOR$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMDESIGNATOR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMDESIGNATOR$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMDESIGNATOR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AMDESIGNATOR$20);
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
            get_store().remove_element(AMDESIGNATOR$20, 0);
        }
    }
    
    /**
     * Gets the "basecurrencyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getBasecurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BASECURRENCYID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "basecurrencyid" element
     */
    public boolean isSetBasecurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASECURRENCYID$22) != 0;
        }
    }
    
    /**
     * Sets the "basecurrencyid" element
     */
    public void setBasecurrencyid(com.microsoft.schemas.crm._2006.webservices.Lookup basecurrencyid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BASECURRENCYID$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BASECURRENCYID$22);
            }
            target.set(basecurrencyid);
        }
    }
    
    /**
     * Appends and returns a new empty "basecurrencyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewBasecurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BASECURRENCYID$22);
            return target;
        }
    }
    
    /**
     * Unsets the "basecurrencyid" element
     */
    public void unsetBasecurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASECURRENCYID$22, 0);
        }
    }
    
    /**
     * Gets the "blockedattachments" element
     */
    public java.lang.String getBlockedattachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKEDATTACHMENTS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "blockedattachments" element
     */
    public org.apache.xmlbeans.XmlString xgetBlockedattachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKEDATTACHMENTS$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "blockedattachments" element
     */
    public boolean isSetBlockedattachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOCKEDATTACHMENTS$24) != 0;
        }
    }
    
    /**
     * Sets the "blockedattachments" element
     */
    public void setBlockedattachments(java.lang.String blockedattachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLOCKEDATTACHMENTS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLOCKEDATTACHMENTS$24);
            }
            target.setStringValue(blockedattachments);
        }
    }
    
    /**
     * Sets (as xml) the "blockedattachments" element
     */
    public void xsetBlockedattachments(org.apache.xmlbeans.XmlString blockedattachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BLOCKEDATTACHMENTS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BLOCKEDATTACHMENTS$24);
            }
            target.set(blockedattachments);
        }
    }
    
    /**
     * Unsets the "blockedattachments" element
     */
    public void unsetBlockedattachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOCKEDATTACHMENTS$24, 0);
        }
    }
    
    /**
     * Gets the "bulkoperationprefix" element
     */
    public java.lang.String getBulkoperationprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONPREFIX$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bulkoperationprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetBulkoperationprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BULKOPERATIONPREFIX$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "bulkoperationprefix" element
     */
    public boolean isSetBulkoperationprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BULKOPERATIONPREFIX$26) != 0;
        }
    }
    
    /**
     * Sets the "bulkoperationprefix" element
     */
    public void setBulkoperationprefix(java.lang.String bulkoperationprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONPREFIX$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BULKOPERATIONPREFIX$26);
            }
            target.setStringValue(bulkoperationprefix);
        }
    }
    
    /**
     * Sets (as xml) the "bulkoperationprefix" element
     */
    public void xsetBulkoperationprefix(org.apache.xmlbeans.XmlString bulkoperationprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BULKOPERATIONPREFIX$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BULKOPERATIONPREFIX$26);
            }
            target.set(bulkoperationprefix);
        }
    }
    
    /**
     * Unsets the "bulkoperationprefix" element
     */
    public void unsetBulkoperationprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BULKOPERATIONPREFIX$26, 0);
        }
    }
    
    /**
     * Gets the "businessclosurecalendarid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getBusinessclosurecalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(BUSINESSCLOSURECALENDARID$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "businessclosurecalendarid" element
     */
    public boolean isSetBusinessclosurecalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSCLOSURECALENDARID$28) != 0;
        }
    }
    
    /**
     * Sets the "businessclosurecalendarid" element
     */
    public void setBusinessclosurecalendarid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier businessclosurecalendarid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(BUSINESSCLOSURECALENDARID$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(BUSINESSCLOSURECALENDARID$28);
            }
            target.set(businessclosurecalendarid);
        }
    }
    
    /**
     * Appends and returns a new empty "businessclosurecalendarid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewBusinessclosurecalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(BUSINESSCLOSURECALENDARID$28);
            return target;
        }
    }
    
    /**
     * Unsets the "businessclosurecalendarid" element
     */
    public void unsetBusinessclosurecalendarid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSCLOSURECALENDARID$28, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CALENDARTYPE$30, 0);
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
            return get_store().count_elements(CALENDARTYPE$30) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CALENDARTYPE$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CALENDARTYPE$30);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CALENDARTYPE$30);
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
            get_store().remove_element(CALENDARTYPE$30, 0);
        }
    }
    
    /**
     * Gets the "campaignprefix" element
     */
    public java.lang.String getCampaignprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNPREFIX$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "campaignprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetCampaignprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAMPAIGNPREFIX$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "campaignprefix" element
     */
    public boolean isSetCampaignprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAMPAIGNPREFIX$32) != 0;
        }
    }
    
    /**
     * Sets the "campaignprefix" element
     */
    public void setCampaignprefix(java.lang.String campaignprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMPAIGNPREFIX$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMPAIGNPREFIX$32);
            }
            target.setStringValue(campaignprefix);
        }
    }
    
    /**
     * Sets (as xml) the "campaignprefix" element
     */
    public void xsetCampaignprefix(org.apache.xmlbeans.XmlString campaignprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAMPAIGNPREFIX$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAMPAIGNPREFIX$32);
            }
            target.set(campaignprefix);
        }
    }
    
    /**
     * Unsets the "campaignprefix" element
     */
    public void unsetCampaignprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAMPAIGNPREFIX$32, 0);
        }
    }
    
    /**
     * Gets the "caseprefix" element
     */
    public java.lang.String getCaseprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEPREFIX$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caseprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetCaseprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEPREFIX$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "caseprefix" element
     */
    public boolean isSetCaseprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASEPREFIX$34) != 0;
        }
    }
    
    /**
     * Sets the "caseprefix" element
     */
    public void setCaseprefix(java.lang.String caseprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEPREFIX$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASEPREFIX$34);
            }
            target.setStringValue(caseprefix);
        }
    }
    
    /**
     * Sets (as xml) the "caseprefix" element
     */
    public void xsetCaseprefix(org.apache.xmlbeans.XmlString caseprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEPREFIX$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CASEPREFIX$34);
            }
            target.set(caseprefix);
        }
    }
    
    /**
     * Unsets the "caseprefix" element
     */
    public void unsetCaseprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASEPREFIX$34, 0);
        }
    }
    
    /**
     * Gets the "contractprefix" element
     */
    public java.lang.String getContractprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTPREFIX$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contractprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetContractprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRACTPREFIX$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "contractprefix" element
     */
    public boolean isSetContractprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRACTPREFIX$36) != 0;
        }
    }
    
    /**
     * Sets the "contractprefix" element
     */
    public void setContractprefix(java.lang.String contractprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTPREFIX$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRACTPREFIX$36);
            }
            target.setStringValue(contractprefix);
        }
    }
    
    /**
     * Sets (as xml) the "contractprefix" element
     */
    public void xsetContractprefix(org.apache.xmlbeans.XmlString contractprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRACTPREFIX$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTRACTPREFIX$36);
            }
            target.set(contractprefix);
        }
    }
    
    /**
     * Unsets the "contractprefix" element
     */
    public void unsetContractprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRACTPREFIX$36, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$38, 0);
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
            return get_store().count_elements(CREATEDBY$38) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$38);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$38);
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
            get_store().remove_element(CREATEDBY$38, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$40, 0);
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
            return get_store().count_elements(CREATEDON$40) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$40);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$40);
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
            get_store().remove_element(CREATEDON$40, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENCYDECIMALPRECISION$42, 0);
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
            return get_store().count_elements(CURRENCYDECIMALPRECISION$42) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENCYDECIMALPRECISION$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENCYDECIMALPRECISION$42);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENCYDECIMALPRECISION$42);
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
            get_store().remove_element(CURRENCYDECIMALPRECISION$42, 0);
        }
    }
    
    /**
     * Gets the "currencydisplayoption" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getCurrencydisplayoption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CURRENCYDISPLAYOPTION$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currencydisplayoption" element
     */
    public boolean isSetCurrencydisplayoption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCYDISPLAYOPTION$44) != 0;
        }
    }
    
    /**
     * Sets the "currencydisplayoption" element
     */
    public void setCurrencydisplayoption(com.microsoft.schemas.crm._2006.webservices.Picklist currencydisplayoption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CURRENCYDISPLAYOPTION$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CURRENCYDISPLAYOPTION$44);
            }
            target.set(currencydisplayoption);
        }
    }
    
    /**
     * Appends and returns a new empty "currencydisplayoption" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewCurrencydisplayoption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CURRENCYDISPLAYOPTION$44);
            return target;
        }
    }
    
    /**
     * Unsets the "currencydisplayoption" element
     */
    public void unsetCurrencydisplayoption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCYDISPLAYOPTION$44, 0);
        }
    }
    
    /**
     * Gets the "currencyformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getCurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CURRENCYFORMATCODE$46, 0);
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
            return get_store().count_elements(CURRENCYFORMATCODE$46) != 0;
        }
    }
    
    /**
     * Sets the "currencyformatcode" element
     */
    public void setCurrencyformatcode(com.microsoft.schemas.crm._2006.webservices.Picklist currencyformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CURRENCYFORMATCODE$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CURRENCYFORMATCODE$46);
            }
            target.set(currencyformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "currencyformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewCurrencyformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CURRENCYFORMATCODE$46);
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
            get_store().remove_element(CURRENCYFORMATCODE$46, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYSYMBOL$48, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYSYMBOL$48, 0);
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
            return get_store().count_elements(CURRENCYSYMBOL$48) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYSYMBOL$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYSYMBOL$48);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYSYMBOL$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYSYMBOL$48);
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
            get_store().remove_element(CURRENCYSYMBOL$48, 0);
        }
    }
    
    /**
     * Gets the "currentbulkoperationnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentbulkoperationnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTBULKOPERATIONNUMBER$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentbulkoperationnumber" element
     */
    public boolean isSetCurrentbulkoperationnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTBULKOPERATIONNUMBER$50) != 0;
        }
    }
    
    /**
     * Sets the "currentbulkoperationnumber" element
     */
    public void setCurrentbulkoperationnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentbulkoperationnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTBULKOPERATIONNUMBER$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTBULKOPERATIONNUMBER$50);
            }
            target.set(currentbulkoperationnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentbulkoperationnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentbulkoperationnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTBULKOPERATIONNUMBER$50);
            return target;
        }
    }
    
    /**
     * Unsets the "currentbulkoperationnumber" element
     */
    public void unsetCurrentbulkoperationnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTBULKOPERATIONNUMBER$50, 0);
        }
    }
    
    /**
     * Gets the "currentcampaignnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentcampaignnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTCAMPAIGNNUMBER$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentcampaignnumber" element
     */
    public boolean isSetCurrentcampaignnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTCAMPAIGNNUMBER$52) != 0;
        }
    }
    
    /**
     * Sets the "currentcampaignnumber" element
     */
    public void setCurrentcampaignnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentcampaignnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTCAMPAIGNNUMBER$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTCAMPAIGNNUMBER$52);
            }
            target.set(currentcampaignnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentcampaignnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentcampaignnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTCAMPAIGNNUMBER$52);
            return target;
        }
    }
    
    /**
     * Unsets the "currentcampaignnumber" element
     */
    public void unsetCurrentcampaignnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTCAMPAIGNNUMBER$52, 0);
        }
    }
    
    /**
     * Gets the "currentcasenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentcasenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTCASENUMBER$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentcasenumber" element
     */
    public boolean isSetCurrentcasenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTCASENUMBER$54) != 0;
        }
    }
    
    /**
     * Sets the "currentcasenumber" element
     */
    public void setCurrentcasenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentcasenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTCASENUMBER$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTCASENUMBER$54);
            }
            target.set(currentcasenumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentcasenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentcasenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTCASENUMBER$54);
            return target;
        }
    }
    
    /**
     * Unsets the "currentcasenumber" element
     */
    public void unsetCurrentcasenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTCASENUMBER$54, 0);
        }
    }
    
    /**
     * Gets the "currentcontractnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentcontractnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTCONTRACTNUMBER$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentcontractnumber" element
     */
    public boolean isSetCurrentcontractnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTCONTRACTNUMBER$56) != 0;
        }
    }
    
    /**
     * Sets the "currentcontractnumber" element
     */
    public void setCurrentcontractnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentcontractnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTCONTRACTNUMBER$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTCONTRACTNUMBER$56);
            }
            target.set(currentcontractnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentcontractnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentcontractnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTCONTRACTNUMBER$56);
            return target;
        }
    }
    
    /**
     * Unsets the "currentcontractnumber" element
     */
    public void unsetCurrentcontractnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTCONTRACTNUMBER$56, 0);
        }
    }
    
    /**
     * Gets the "currentimportsequencenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentimportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTIMPORTSEQUENCENUMBER$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentimportsequencenumber" element
     */
    public boolean isSetCurrentimportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTIMPORTSEQUENCENUMBER$58) != 0;
        }
    }
    
    /**
     * Sets the "currentimportsequencenumber" element
     */
    public void setCurrentimportsequencenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentimportsequencenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTIMPORTSEQUENCENUMBER$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTIMPORTSEQUENCENUMBER$58);
            }
            target.set(currentimportsequencenumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentimportsequencenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentimportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTIMPORTSEQUENCENUMBER$58);
            return target;
        }
    }
    
    /**
     * Unsets the "currentimportsequencenumber" element
     */
    public void unsetCurrentimportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTIMPORTSEQUENCENUMBER$58, 0);
        }
    }
    
    /**
     * Gets the "currentinvoicenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentinvoicenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTINVOICENUMBER$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentinvoicenumber" element
     */
    public boolean isSetCurrentinvoicenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTINVOICENUMBER$60) != 0;
        }
    }
    
    /**
     * Sets the "currentinvoicenumber" element
     */
    public void setCurrentinvoicenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentinvoicenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTINVOICENUMBER$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTINVOICENUMBER$60);
            }
            target.set(currentinvoicenumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentinvoicenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentinvoicenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTINVOICENUMBER$60);
            return target;
        }
    }
    
    /**
     * Unsets the "currentinvoicenumber" element
     */
    public void unsetCurrentinvoicenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTINVOICENUMBER$60, 0);
        }
    }
    
    /**
     * Gets the "currentkbnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentkbnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTKBNUMBER$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentkbnumber" element
     */
    public boolean isSetCurrentkbnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTKBNUMBER$62) != 0;
        }
    }
    
    /**
     * Sets the "currentkbnumber" element
     */
    public void setCurrentkbnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentkbnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTKBNUMBER$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTKBNUMBER$62);
            }
            target.set(currentkbnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentkbnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentkbnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTKBNUMBER$62);
            return target;
        }
    }
    
    /**
     * Unsets the "currentkbnumber" element
     */
    public void unsetCurrentkbnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTKBNUMBER$62, 0);
        }
    }
    
    /**
     * Gets the "currentordernumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentordernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTORDERNUMBER$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentordernumber" element
     */
    public boolean isSetCurrentordernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTORDERNUMBER$64) != 0;
        }
    }
    
    /**
     * Sets the "currentordernumber" element
     */
    public void setCurrentordernumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentordernumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTORDERNUMBER$64, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTORDERNUMBER$64);
            }
            target.set(currentordernumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentordernumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentordernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTORDERNUMBER$64);
            return target;
        }
    }
    
    /**
     * Unsets the "currentordernumber" element
     */
    public void unsetCurrentordernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTORDERNUMBER$64, 0);
        }
    }
    
    /**
     * Gets the "currentparsedtablenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentparsedtablenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTPARSEDTABLENUMBER$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentparsedtablenumber" element
     */
    public boolean isSetCurrentparsedtablenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTPARSEDTABLENUMBER$66) != 0;
        }
    }
    
    /**
     * Sets the "currentparsedtablenumber" element
     */
    public void setCurrentparsedtablenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentparsedtablenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTPARSEDTABLENUMBER$66, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTPARSEDTABLENUMBER$66);
            }
            target.set(currentparsedtablenumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentparsedtablenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentparsedtablenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTPARSEDTABLENUMBER$66);
            return target;
        }
    }
    
    /**
     * Unsets the "currentparsedtablenumber" element
     */
    public void unsetCurrentparsedtablenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTPARSEDTABLENUMBER$66, 0);
        }
    }
    
    /**
     * Gets the "currentquotenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCurrentquotenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTQUOTENUMBER$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "currentquotenumber" element
     */
    public boolean isSetCurrentquotenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENTQUOTENUMBER$68) != 0;
        }
    }
    
    /**
     * Sets the "currentquotenumber" element
     */
    public void setCurrentquotenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber currentquotenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CURRENTQUOTENUMBER$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTQUOTENUMBER$68);
            }
            target.set(currentquotenumber);
        }
    }
    
    /**
     * Appends and returns a new empty "currentquotenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCurrentquotenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CURRENTQUOTENUMBER$68);
            return target;
        }
    }
    
    /**
     * Unsets the "currentquotenumber" element
     */
    public void unsetCurrentquotenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENTQUOTENUMBER$68, 0);
        }
    }
    
    /**
     * Gets the "dateformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getDateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(DATEFORMATCODE$70, 0);
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
            return get_store().count_elements(DATEFORMATCODE$70) != 0;
        }
    }
    
    /**
     * Sets the "dateformatcode" element
     */
    public void setDateformatcode(com.microsoft.schemas.crm._2006.webservices.Picklist dateformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(DATEFORMATCODE$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(DATEFORMATCODE$70);
            }
            target.set(dateformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "dateformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewDateformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(DATEFORMATCODE$70);
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
            get_store().remove_element(DATEFORMATCODE$70, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFORMATSTRING$72, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEFORMATSTRING$72, 0);
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
            return get_store().count_elements(DATEFORMATSTRING$72) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFORMATSTRING$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEFORMATSTRING$72);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEFORMATSTRING$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEFORMATSTRING$72);
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
            get_store().remove_element(DATEFORMATSTRING$72, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESEPARATOR$74, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATESEPARATOR$74, 0);
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
            return get_store().count_elements(DATESEPARATOR$74) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESEPARATOR$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATESEPARATOR$74);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATESEPARATOR$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATESEPARATOR$74);
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
            get_store().remove_element(DATESEPARATOR$74, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALSYMBOL$76, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECIMALSYMBOL$76, 0);
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
            return get_store().count_elements(DECIMALSYMBOL$76) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALSYMBOL$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMALSYMBOL$76);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DECIMALSYMBOL$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DECIMALSYMBOL$76);
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
            get_store().remove_element(DECIMALSYMBOL$76, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEDREASON$78, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISABLEDREASON$78, 0);
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
            return get_store().count_elements(DISABLEDREASON$78) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEDREASON$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISABLEDREASON$78);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISABLEDREASON$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISABLEDREASON$78);
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
            get_store().remove_element(DISABLEDREASON$78, 0);
        }
    }
    
    /**
     * Gets the "emailsendpollingperiod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getEmailsendpollingperiod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(EMAILSENDPOLLINGPERIOD$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "emailsendpollingperiod" element
     */
    public boolean isSetEmailsendpollingperiod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILSENDPOLLINGPERIOD$80) != 0;
        }
    }
    
    /**
     * Sets the "emailsendpollingperiod" element
     */
    public void setEmailsendpollingperiod(com.microsoft.schemas.crm._2006.webservices.CrmNumber emailsendpollingperiod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(EMAILSENDPOLLINGPERIOD$80, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(EMAILSENDPOLLINGPERIOD$80);
            }
            target.set(emailsendpollingperiod);
        }
    }
    
    /**
     * Appends and returns a new empty "emailsendpollingperiod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewEmailsendpollingperiod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(EMAILSENDPOLLINGPERIOD$80);
            return target;
        }
    }
    
    /**
     * Unsets the "emailsendpollingperiod" element
     */
    public void unsetEmailsendpollingperiod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILSENDPOLLINGPERIOD$80, 0);
        }
    }
    
    /**
     * Gets the "enablepricingoncreate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getEnablepricingoncreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ENABLEPRICINGONCREATE$82, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "enablepricingoncreate" element
     */
    public boolean isSetEnablepricingoncreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENABLEPRICINGONCREATE$82) != 0;
        }
    }
    
    /**
     * Sets the "enablepricingoncreate" element
     */
    public void setEnablepricingoncreate(com.microsoft.schemas.crm._2006.webservices.CrmBoolean enablepricingoncreate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ENABLEPRICINGONCREATE$82, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ENABLEPRICINGONCREATE$82);
            }
            target.set(enablepricingoncreate);
        }
    }
    
    /**
     * Appends and returns a new empty "enablepricingoncreate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewEnablepricingoncreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ENABLEPRICINGONCREATE$82);
            return target;
        }
    }
    
    /**
     * Unsets the "enablepricingoncreate" element
     */
    public void unsetEnablepricingoncreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENABLEPRICINGONCREATE$82, 0);
        }
    }
    
    /**
     * Gets the "featureset" element
     */
    public java.lang.String getFeatureset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURESET$84, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "featureset" element
     */
    public org.apache.xmlbeans.XmlString xgetFeatureset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURESET$84, 0);
            return target;
        }
    }
    
    /**
     * True if has "featureset" element
     */
    public boolean isSetFeatureset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURESET$84) != 0;
        }
    }
    
    /**
     * Sets the "featureset" element
     */
    public void setFeatureset(java.lang.String featureset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURESET$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATURESET$84);
            }
            target.setStringValue(featureset);
        }
    }
    
    /**
     * Sets (as xml) the "featureset" element
     */
    public void xsetFeatureset(org.apache.xmlbeans.XmlString featureset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURESET$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FEATURESET$84);
            }
            target.set(featureset);
        }
    }
    
    /**
     * Unsets the "featureset" element
     */
    public void unsetFeatureset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURESET$84, 0);
        }
    }
    
    /**
     * Gets the "fiscalcalendarstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getFiscalcalendarstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(FISCALCALENDARSTART$86, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fiscalcalendarstart" element
     */
    public boolean isSetFiscalcalendarstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FISCALCALENDARSTART$86) != 0;
        }
    }
    
    /**
     * Sets the "fiscalcalendarstart" element
     */
    public void setFiscalcalendarstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime fiscalcalendarstart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(FISCALCALENDARSTART$86, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(FISCALCALENDARSTART$86);
            }
            target.set(fiscalcalendarstart);
        }
    }
    
    /**
     * Appends and returns a new empty "fiscalcalendarstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewFiscalcalendarstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(FISCALCALENDARSTART$86);
            return target;
        }
    }
    
    /**
     * Unsets the "fiscalcalendarstart" element
     */
    public void unsetFiscalcalendarstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FISCALCALENDARSTART$86, 0);
        }
    }
    
    /**
     * Gets the "fiscalperiodformat" element
     */
    public java.lang.String getFiscalperiodformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALPERIODFORMAT$88, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fiscalperiodformat" element
     */
    public org.apache.xmlbeans.XmlString xgetFiscalperiodformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISCALPERIODFORMAT$88, 0);
            return target;
        }
    }
    
    /**
     * True if has "fiscalperiodformat" element
     */
    public boolean isSetFiscalperiodformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FISCALPERIODFORMAT$88) != 0;
        }
    }
    
    /**
     * Sets the "fiscalperiodformat" element
     */
    public void setFiscalperiodformat(java.lang.String fiscalperiodformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALPERIODFORMAT$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISCALPERIODFORMAT$88);
            }
            target.setStringValue(fiscalperiodformat);
        }
    }
    
    /**
     * Sets (as xml) the "fiscalperiodformat" element
     */
    public void xsetFiscalperiodformat(org.apache.xmlbeans.XmlString fiscalperiodformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISCALPERIODFORMAT$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FISCALPERIODFORMAT$88);
            }
            target.set(fiscalperiodformat);
        }
    }
    
    /**
     * Unsets the "fiscalperiodformat" element
     */
    public void unsetFiscalperiodformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FISCALPERIODFORMAT$88, 0);
        }
    }
    
    /**
     * Gets the "fiscalperiodtype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getFiscalperiodtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FISCALPERIODTYPE$90, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fiscalperiodtype" element
     */
    public boolean isSetFiscalperiodtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FISCALPERIODTYPE$90) != 0;
        }
    }
    
    /**
     * Sets the "fiscalperiodtype" element
     */
    public void setFiscalperiodtype(com.microsoft.schemas.crm._2006.webservices.CrmNumber fiscalperiodtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FISCALPERIODTYPE$90, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FISCALPERIODTYPE$90);
            }
            target.set(fiscalperiodtype);
        }
    }
    
    /**
     * Appends and returns a new empty "fiscalperiodtype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFiscalperiodtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FISCALPERIODTYPE$90);
            return target;
        }
    }
    
    /**
     * Unsets the "fiscalperiodtype" element
     */
    public void unsetFiscalperiodtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FISCALPERIODTYPE$90, 0);
        }
    }
    
    /**
     * Gets the "fiscalsettingsupdated" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getFiscalsettingsupdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(FISCALSETTINGSUPDATED$92, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fiscalsettingsupdated" element
     */
    public boolean isSetFiscalsettingsupdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FISCALSETTINGSUPDATED$92) != 0;
        }
    }
    
    /**
     * Sets the "fiscalsettingsupdated" element
     */
    public void setFiscalsettingsupdated(com.microsoft.schemas.crm._2006.webservices.CrmBoolean fiscalsettingsupdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(FISCALSETTINGSUPDATED$92, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(FISCALSETTINGSUPDATED$92);
            }
            target.set(fiscalsettingsupdated);
        }
    }
    
    /**
     * Appends and returns a new empty "fiscalsettingsupdated" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewFiscalsettingsupdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(FISCALSETTINGSUPDATED$92);
            return target;
        }
    }
    
    /**
     * Unsets the "fiscalsettingsupdated" element
     */
    public void unsetFiscalsettingsupdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FISCALSETTINGSUPDATED$92, 0);
        }
    }
    
    /**
     * Gets the "fiscalyeardisplaycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getFiscalyeardisplaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FISCALYEARDISPLAYCODE$94, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fiscalyeardisplaycode" element
     */
    public boolean isSetFiscalyeardisplaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FISCALYEARDISPLAYCODE$94) != 0;
        }
    }
    
    /**
     * Sets the "fiscalyeardisplaycode" element
     */
    public void setFiscalyeardisplaycode(com.microsoft.schemas.crm._2006.webservices.CrmNumber fiscalyeardisplaycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FISCALYEARDISPLAYCODE$94, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FISCALYEARDISPLAYCODE$94);
            }
            target.set(fiscalyeardisplaycode);
        }
    }
    
    /**
     * Appends and returns a new empty "fiscalyeardisplaycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFiscalyeardisplaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FISCALYEARDISPLAYCODE$94);
            return target;
        }
    }
    
    /**
     * Unsets the "fiscalyeardisplaycode" element
     */
    public void unsetFiscalyeardisplaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FISCALYEARDISPLAYCODE$94, 0);
        }
    }
    
    /**
     * Gets the "fiscalyearformat" element
     */
    public java.lang.String getFiscalyearformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEARFORMAT$96, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fiscalyearformat" element
     */
    public org.apache.xmlbeans.XmlString xgetFiscalyearformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISCALYEARFORMAT$96, 0);
            return target;
        }
    }
    
    /**
     * True if has "fiscalyearformat" element
     */
    public boolean isSetFiscalyearformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FISCALYEARFORMAT$96) != 0;
        }
    }
    
    /**
     * Sets the "fiscalyearformat" element
     */
    public void setFiscalyearformat(java.lang.String fiscalyearformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEARFORMAT$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISCALYEARFORMAT$96);
            }
            target.setStringValue(fiscalyearformat);
        }
    }
    
    /**
     * Sets (as xml) the "fiscalyearformat" element
     */
    public void xsetFiscalyearformat(org.apache.xmlbeans.XmlString fiscalyearformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISCALYEARFORMAT$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FISCALYEARFORMAT$96);
            }
            target.set(fiscalyearformat);
        }
    }
    
    /**
     * Unsets the "fiscalyearformat" element
     */
    public void unsetFiscalyearformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FISCALYEARFORMAT$96, 0);
        }
    }
    
    /**
     * Gets the "fiscalyearperiodconnect" element
     */
    public java.lang.String getFiscalyearperiodconnect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEARPERIODCONNECT$98, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fiscalyearperiodconnect" element
     */
    public org.apache.xmlbeans.XmlString xgetFiscalyearperiodconnect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISCALYEARPERIODCONNECT$98, 0);
            return target;
        }
    }
    
    /**
     * True if has "fiscalyearperiodconnect" element
     */
    public boolean isSetFiscalyearperiodconnect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FISCALYEARPERIODCONNECT$98) != 0;
        }
    }
    
    /**
     * Sets the "fiscalyearperiodconnect" element
     */
    public void setFiscalyearperiodconnect(java.lang.String fiscalyearperiodconnect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FISCALYEARPERIODCONNECT$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FISCALYEARPERIODCONNECT$98);
            }
            target.setStringValue(fiscalyearperiodconnect);
        }
    }
    
    /**
     * Sets (as xml) the "fiscalyearperiodconnect" element
     */
    public void xsetFiscalyearperiodconnect(org.apache.xmlbeans.XmlString fiscalyearperiodconnect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FISCALYEARPERIODCONNECT$98, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FISCALYEARPERIODCONNECT$98);
            }
            target.set(fiscalyearperiodconnect);
        }
    }
    
    /**
     * Unsets the "fiscalyearperiodconnect" element
     */
    public void unsetFiscalyearperiodconnect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FISCALYEARPERIODCONNECT$98, 0);
        }
    }
    
    /**
     * Gets the "fullnameconventioncode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getFullnameconventioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(FULLNAMECONVENTIONCODE$100, 0);
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
            return get_store().count_elements(FULLNAMECONVENTIONCODE$100) != 0;
        }
    }
    
    /**
     * Sets the "fullnameconventioncode" element
     */
    public void setFullnameconventioncode(com.microsoft.schemas.crm._2006.webservices.Picklist fullnameconventioncode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(FULLNAMECONVENTIONCODE$100, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(FULLNAMECONVENTIONCODE$100);
            }
            target.set(fullnameconventioncode);
        }
    }
    
    /**
     * Appends and returns a new empty "fullnameconventioncode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewFullnameconventioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(FULLNAMECONVENTIONCODE$100);
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
            get_store().remove_element(FULLNAMECONVENTIONCODE$100, 0);
        }
    }
    
    /**
     * Gets the "grantaccesstonetworkservice" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getGrantaccesstonetworkservice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(GRANTACCESSTONETWORKSERVICE$102, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "grantaccesstonetworkservice" element
     */
    public boolean isSetGrantaccesstonetworkservice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRANTACCESSTONETWORKSERVICE$102) != 0;
        }
    }
    
    /**
     * Sets the "grantaccesstonetworkservice" element
     */
    public void setGrantaccesstonetworkservice(com.microsoft.schemas.crm._2006.webservices.CrmBoolean grantaccesstonetworkservice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(GRANTACCESSTONETWORKSERVICE$102, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(GRANTACCESSTONETWORKSERVICE$102);
            }
            target.set(grantaccesstonetworkservice);
        }
    }
    
    /**
     * Appends and returns a new empty "grantaccesstonetworkservice" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewGrantaccesstonetworkservice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(GRANTACCESSTONETWORKSERVICE$102);
            return target;
        }
    }
    
    /**
     * Unsets the "grantaccesstonetworkservice" element
     */
    public void unsetGrantaccesstonetworkservice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRANTACCESSTONETWORKSERVICE$102, 0);
        }
    }
    
    /**
     * Gets the "ignoreinternalemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIgnoreinternalemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(IGNOREINTERNALEMAIL$104, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ignoreinternalemail" element
     */
    public boolean isSetIgnoreinternalemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IGNOREINTERNALEMAIL$104) != 0;
        }
    }
    
    /**
     * Sets the "ignoreinternalemail" element
     */
    public void setIgnoreinternalemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ignoreinternalemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(IGNOREINTERNALEMAIL$104, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(IGNOREINTERNALEMAIL$104);
            }
            target.set(ignoreinternalemail);
        }
    }
    
    /**
     * Appends and returns a new empty "ignoreinternalemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIgnoreinternalemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(IGNOREINTERNALEMAIL$104);
            return target;
        }
    }
    
    /**
     * Unsets the "ignoreinternalemail" element
     */
    public void unsetIgnoreinternalemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IGNOREINTERNALEMAIL$104, 0);
        }
    }
    
    /**
     * Gets the "integrationuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getIntegrationuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(INTEGRATIONUSERID$106, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "integrationuserid" element
     */
    public boolean isSetIntegrationuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTEGRATIONUSERID$106) != 0;
        }
    }
    
    /**
     * Sets the "integrationuserid" element
     */
    public void setIntegrationuserid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier integrationuserid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(INTEGRATIONUSERID$106, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(INTEGRATIONUSERID$106);
            }
            target.set(integrationuserid);
        }
    }
    
    /**
     * Appends and returns a new empty "integrationuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewIntegrationuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(INTEGRATIONUSERID$106);
            return target;
        }
    }
    
    /**
     * Unsets the "integrationuserid" element
     */
    public void unsetIntegrationuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTEGRATIONUSERID$106, 0);
        }
    }
    
    /**
     * Gets the "invoiceprefix" element
     */
    public java.lang.String getInvoiceprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEPREFIX$108, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "invoiceprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetInvoiceprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVOICEPREFIX$108, 0);
            return target;
        }
    }
    
    /**
     * True if has "invoiceprefix" element
     */
    public boolean isSetInvoiceprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVOICEPREFIX$108) != 0;
        }
    }
    
    /**
     * Sets the "invoiceprefix" element
     */
    public void setInvoiceprefix(java.lang.String invoiceprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOICEPREFIX$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOICEPREFIX$108);
            }
            target.setStringValue(invoiceprefix);
        }
    }
    
    /**
     * Sets (as xml) the "invoiceprefix" element
     */
    public void xsetInvoiceprefix(org.apache.xmlbeans.XmlString invoiceprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INVOICEPREFIX$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INVOICEPREFIX$108);
            }
            target.set(invoiceprefix);
        }
    }
    
    /**
     * Unsets the "invoiceprefix" element
     */
    public void unsetInvoiceprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVOICEPREFIX$108, 0);
        }
    }
    
    /**
     * Gets the "isappmode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsappmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISAPPMODE$110, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isappmode" element
     */
    public boolean isSetIsappmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISAPPMODE$110) != 0;
        }
    }
    
    /**
     * Sets the "isappmode" element
     */
    public void setIsappmode(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isappmode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISAPPMODE$110, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISAPPMODE$110);
            }
            target.set(isappmode);
        }
    }
    
    /**
     * Appends and returns a new empty "isappmode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsappmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISAPPMODE$110);
            return target;
        }
    }
    
    /**
     * Unsets the "isappmode" element
     */
    public void unsetIsappmode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISAPPMODE$110, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDISABLED$112, 0);
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
            return get_store().count_elements(ISDISABLED$112) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDISABLED$112, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDISABLED$112);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDISABLED$112);
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
            get_store().remove_element(ISDISABLED$112, 0);
        }
    }
    
    /**
     * Gets the "isduplicatedetectionenabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsduplicatedetectionenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLED$114, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isduplicatedetectionenabled" element
     */
    public boolean isSetIsduplicatedetectionenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDUPLICATEDETECTIONENABLED$114) != 0;
        }
    }
    
    /**
     * Sets the "isduplicatedetectionenabled" element
     */
    public void setIsduplicatedetectionenabled(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isduplicatedetectionenabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLED$114, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLED$114);
            }
            target.set(isduplicatedetectionenabled);
        }
    }
    
    /**
     * Appends and returns a new empty "isduplicatedetectionenabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsduplicatedetectionenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLED$114);
            return target;
        }
    }
    
    /**
     * Unsets the "isduplicatedetectionenabled" element
     */
    public void unsetIsduplicatedetectionenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDUPLICATEDETECTIONENABLED$114, 0);
        }
    }
    
    /**
     * Gets the "isduplicatedetectionenabledforimport" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsduplicatedetectionenabledforimport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLEDFORIMPORT$116, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isduplicatedetectionenabledforimport" element
     */
    public boolean isSetIsduplicatedetectionenabledforimport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDUPLICATEDETECTIONENABLEDFORIMPORT$116) != 0;
        }
    }
    
    /**
     * Sets the "isduplicatedetectionenabledforimport" element
     */
    public void setIsduplicatedetectionenabledforimport(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isduplicatedetectionenabledforimport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLEDFORIMPORT$116, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLEDFORIMPORT$116);
            }
            target.set(isduplicatedetectionenabledforimport);
        }
    }
    
    /**
     * Appends and returns a new empty "isduplicatedetectionenabledforimport" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsduplicatedetectionenabledforimport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLEDFORIMPORT$116);
            return target;
        }
    }
    
    /**
     * Unsets the "isduplicatedetectionenabledforimport" element
     */
    public void unsetIsduplicatedetectionenabledforimport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDUPLICATEDETECTIONENABLEDFORIMPORT$116, 0);
        }
    }
    
    /**
     * Gets the "isduplicatedetectionenabledforofflinesync" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsduplicatedetectionenabledforofflinesync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLEDFOROFFLINESYNC$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isduplicatedetectionenabledforofflinesync" element
     */
    public boolean isSetIsduplicatedetectionenabledforofflinesync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDUPLICATEDETECTIONENABLEDFOROFFLINESYNC$118) != 0;
        }
    }
    
    /**
     * Sets the "isduplicatedetectionenabledforofflinesync" element
     */
    public void setIsduplicatedetectionenabledforofflinesync(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isduplicatedetectionenabledforofflinesync)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLEDFOROFFLINESYNC$118, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLEDFOROFFLINESYNC$118);
            }
            target.set(isduplicatedetectionenabledforofflinesync);
        }
    }
    
    /**
     * Appends and returns a new empty "isduplicatedetectionenabledforofflinesync" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsduplicatedetectionenabledforofflinesync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLEDFOROFFLINESYNC$118);
            return target;
        }
    }
    
    /**
     * Unsets the "isduplicatedetectionenabledforofflinesync" element
     */
    public void unsetIsduplicatedetectionenabledforofflinesync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDUPLICATEDETECTIONENABLEDFOROFFLINESYNC$118, 0);
        }
    }
    
    /**
     * Gets the "isduplicatedetectionenabledforonlinecreateupdate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsduplicatedetectionenabledforonlinecreateupdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLEDFORONLINECREATEUPDATE$120, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isduplicatedetectionenabledforonlinecreateupdate" element
     */
    public boolean isSetIsduplicatedetectionenabledforonlinecreateupdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDUPLICATEDETECTIONENABLEDFORONLINECREATEUPDATE$120) != 0;
        }
    }
    
    /**
     * Sets the "isduplicatedetectionenabledforonlinecreateupdate" element
     */
    public void setIsduplicatedetectionenabledforonlinecreateupdate(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isduplicatedetectionenabledforonlinecreateupdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDUPLICATEDETECTIONENABLEDFORONLINECREATEUPDATE$120, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLEDFORONLINECREATEUPDATE$120);
            }
            target.set(isduplicatedetectionenabledforonlinecreateupdate);
        }
    }
    
    /**
     * Appends and returns a new empty "isduplicatedetectionenabledforonlinecreateupdate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsduplicatedetectionenabledforonlinecreateupdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDUPLICATEDETECTIONENABLEDFORONLINECREATEUPDATE$120);
            return target;
        }
    }
    
    /**
     * Unsets the "isduplicatedetectionenabledforonlinecreateupdate" element
     */
    public void unsetIsduplicatedetectionenabledforonlinecreateupdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDUPLICATEDETECTIONENABLEDFORONLINECREATEUPDATE$120, 0);
        }
    }
    
    /**
     * Gets the "isfiscalperiodmonthbased" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsfiscalperiodmonthbased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISFISCALPERIODMONTHBASED$122, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isfiscalperiodmonthbased" element
     */
    public boolean isSetIsfiscalperiodmonthbased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISFISCALPERIODMONTHBASED$122) != 0;
        }
    }
    
    /**
     * Sets the "isfiscalperiodmonthbased" element
     */
    public void setIsfiscalperiodmonthbased(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isfiscalperiodmonthbased)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISFISCALPERIODMONTHBASED$122, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISFISCALPERIODMONTHBASED$122);
            }
            target.set(isfiscalperiodmonthbased);
        }
    }
    
    /**
     * Appends and returns a new empty "isfiscalperiodmonthbased" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsfiscalperiodmonthbased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISFISCALPERIODMONTHBASED$122);
            return target;
        }
    }
    
    /**
     * Unsets the "isfiscalperiodmonthbased" element
     */
    public void unsetIsfiscalperiodmonthbased()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISFISCALPERIODMONTHBASED$122, 0);
        }
    }
    
    /**
     * Gets the "ispresenceenabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIspresenceenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRESENCEENABLED$124, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ispresenceenabled" element
     */
    public boolean isSetIspresenceenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRESENCEENABLED$124) != 0;
        }
    }
    
    /**
     * Sets the "ispresenceenabled" element
     */
    public void setIspresenceenabled(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ispresenceenabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRESENCEENABLED$124, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRESENCEENABLED$124);
            }
            target.set(ispresenceenabled);
        }
    }
    
    /**
     * Appends and returns a new empty "ispresenceenabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIspresenceenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRESENCEENABLED$124);
            return target;
        }
    }
    
    /**
     * Unsets the "ispresenceenabled" element
     */
    public void unsetIspresenceenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRESENCEENABLED$124, 0);
        }
    }
    
    /**
     * Gets the "isregistered" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsregistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISREGISTERED$126, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isregistered" element
     */
    public boolean isSetIsregistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISREGISTERED$126) != 0;
        }
    }
    
    /**
     * Sets the "isregistered" element
     */
    public void setIsregistered(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isregistered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISREGISTERED$126, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISREGISTERED$126);
            }
            target.set(isregistered);
        }
    }
    
    /**
     * Appends and returns a new empty "isregistered" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsregistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISREGISTERED$126);
            return target;
        }
    }
    
    /**
     * Unsets the "isregistered" element
     */
    public void unsetIsregistered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISREGISTERED$126, 0);
        }
    }
    
    /**
     * Gets the "issopintegrationenabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIssopintegrationenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSOPINTEGRATIONENABLED$128, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "issopintegrationenabled" element
     */
    public boolean isSetIssopintegrationenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSOPINTEGRATIONENABLED$128) != 0;
        }
    }
    
    /**
     * Sets the "issopintegrationenabled" element
     */
    public void setIssopintegrationenabled(com.microsoft.schemas.crm._2006.webservices.CrmBoolean issopintegrationenabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSOPINTEGRATIONENABLED$128, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSOPINTEGRATIONENABLED$128);
            }
            target.set(issopintegrationenabled);
        }
    }
    
    /**
     * Appends and returns a new empty "issopintegrationenabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIssopintegrationenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSOPINTEGRATIONENABLED$128);
            return target;
        }
    }
    
    /**
     * Unsets the "issopintegrationenabled" element
     */
    public void unsetIssopintegrationenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSOPINTEGRATIONENABLED$128, 0);
        }
    }
    
    /**
     * Gets the "isvintegrationcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getIsvintegrationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ISVINTEGRATIONCODE$130, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isvintegrationcode" element
     */
    public boolean isSetIsvintegrationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISVINTEGRATIONCODE$130) != 0;
        }
    }
    
    /**
     * Sets the "isvintegrationcode" element
     */
    public void setIsvintegrationcode(com.microsoft.schemas.crm._2006.webservices.Picklist isvintegrationcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ISVINTEGRATIONCODE$130, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ISVINTEGRATIONCODE$130);
            }
            target.set(isvintegrationcode);
        }
    }
    
    /**
     * Appends and returns a new empty "isvintegrationcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewIsvintegrationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ISVINTEGRATIONCODE$130);
            return target;
        }
    }
    
    /**
     * Unsets the "isvintegrationcode" element
     */
    public void unsetIsvintegrationcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISVINTEGRATIONCODE$130, 0);
        }
    }
    
    /**
     * Gets the "kbprefix" element
     */
    public java.lang.String getKbprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KBPREFIX$132, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "kbprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetKbprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KBPREFIX$132, 0);
            return target;
        }
    }
    
    /**
     * True if has "kbprefix" element
     */
    public boolean isSetKbprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KBPREFIX$132) != 0;
        }
    }
    
    /**
     * Sets the "kbprefix" element
     */
    public void setKbprefix(java.lang.String kbprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KBPREFIX$132, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KBPREFIX$132);
            }
            target.setStringValue(kbprefix);
        }
    }
    
    /**
     * Sets (as xml) the "kbprefix" element
     */
    public void xsetKbprefix(org.apache.xmlbeans.XmlString kbprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KBPREFIX$132, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KBPREFIX$132);
            }
            target.set(kbprefix);
        }
    }
    
    /**
     * Unsets the "kbprefix" element
     */
    public void unsetKbprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KBPREFIX$132, 0);
        }
    }
    
    /**
     * Gets the "languagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getLanguagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LANGUAGECODE$134, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "languagecode" element
     */
    public boolean isSetLanguagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGECODE$134) != 0;
        }
    }
    
    /**
     * Sets the "languagecode" element
     */
    public void setLanguagecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber languagecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LANGUAGECODE$134, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LANGUAGECODE$134);
            }
            target.set(languagecode);
        }
    }
    
    /**
     * Appends and returns a new empty "languagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLanguagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LANGUAGECODE$134);
            return target;
        }
    }
    
    /**
     * Unsets the "languagecode" element
     */
    public void unsetLanguagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGECODE$134, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LOCALEID$136, 0);
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
            return get_store().count_elements(LOCALEID$136) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LOCALEID$136, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LOCALEID$136);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LOCALEID$136);
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
            get_store().remove_element(LOCALEID$136, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LONGDATEFORMATCODE$138, 0);
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
            return get_store().count_elements(LONGDATEFORMATCODE$138) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LONGDATEFORMATCODE$138, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LONGDATEFORMATCODE$138);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LONGDATEFORMATCODE$138);
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
            get_store().remove_element(LONGDATEFORMATCODE$138, 0);
        }
    }
    
    /**
     * Gets the "maxappointmentdurationdays" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getMaxappointmentdurationdays()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MAXAPPOINTMENTDURATIONDAYS$140, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maxappointmentdurationdays" element
     */
    public boolean isSetMaxappointmentdurationdays()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXAPPOINTMENTDURATIONDAYS$140) != 0;
        }
    }
    
    /**
     * Sets the "maxappointmentdurationdays" element
     */
    public void setMaxappointmentdurationdays(com.microsoft.schemas.crm._2006.webservices.CrmNumber maxappointmentdurationdays)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MAXAPPOINTMENTDURATIONDAYS$140, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MAXAPPOINTMENTDURATIONDAYS$140);
            }
            target.set(maxappointmentdurationdays);
        }
    }
    
    /**
     * Appends and returns a new empty "maxappointmentdurationdays" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewMaxappointmentdurationdays()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MAXAPPOINTMENTDURATIONDAYS$140);
            return target;
        }
    }
    
    /**
     * Unsets the "maxappointmentdurationdays" element
     */
    public void unsetMaxappointmentdurationdays()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXAPPOINTMENTDURATIONDAYS$140, 0);
        }
    }
    
    /**
     * Gets the "maximumtrackingnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getMaximumtrackingnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MAXIMUMTRACKINGNUMBER$142, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maximumtrackingnumber" element
     */
    public boolean isSetMaximumtrackingnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUMTRACKINGNUMBER$142) != 0;
        }
    }
    
    /**
     * Sets the "maximumtrackingnumber" element
     */
    public void setMaximumtrackingnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber maximumtrackingnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MAXIMUMTRACKINGNUMBER$142, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MAXIMUMTRACKINGNUMBER$142);
            }
            target.set(maximumtrackingnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "maximumtrackingnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewMaximumtrackingnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MAXIMUMTRACKINGNUMBER$142);
            return target;
        }
    }
    
    /**
     * Unsets the "maximumtrackingnumber" element
     */
    public void unsetMaximumtrackingnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUMTRACKINGNUMBER$142, 0);
        }
    }
    
    /**
     * Gets the "maxrecordsforexporttoexcel" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getMaxrecordsforexporttoexcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MAXRECORDSFOREXPORTTOEXCEL$144, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maxrecordsforexporttoexcel" element
     */
    public boolean isSetMaxrecordsforexporttoexcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXRECORDSFOREXPORTTOEXCEL$144) != 0;
        }
    }
    
    /**
     * Sets the "maxrecordsforexporttoexcel" element
     */
    public void setMaxrecordsforexporttoexcel(com.microsoft.schemas.crm._2006.webservices.CrmNumber maxrecordsforexporttoexcel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MAXRECORDSFOREXPORTTOEXCEL$144, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MAXRECORDSFOREXPORTTOEXCEL$144);
            }
            target.set(maxrecordsforexporttoexcel);
        }
    }
    
    /**
     * Appends and returns a new empty "maxrecordsforexporttoexcel" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewMaxrecordsforexporttoexcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MAXRECORDSFOREXPORTTOEXCEL$144);
            return target;
        }
    }
    
    /**
     * Unsets the "maxrecordsforexporttoexcel" element
     */
    public void unsetMaxrecordsforexporttoexcel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXRECORDSFOREXPORTTOEXCEL$144, 0);
        }
    }
    
    /**
     * Gets the "maxuploadfilesize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getMaxuploadfilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MAXUPLOADFILESIZE$146, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maxuploadfilesize" element
     */
    public boolean isSetMaxuploadfilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXUPLOADFILESIZE$146) != 0;
        }
    }
    
    /**
     * Sets the "maxuploadfilesize" element
     */
    public void setMaxuploadfilesize(com.microsoft.schemas.crm._2006.webservices.CrmNumber maxuploadfilesize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MAXUPLOADFILESIZE$146, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MAXUPLOADFILESIZE$146);
            }
            target.set(maxuploadfilesize);
        }
    }
    
    /**
     * Appends and returns a new empty "maxuploadfilesize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewMaxuploadfilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MAXUPLOADFILESIZE$146);
            return target;
        }
    }
    
    /**
     * Unsets the "maxuploadfilesize" element
     */
    public void unsetMaxuploadfilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXUPLOADFILESIZE$146, 0);
        }
    }
    
    /**
     * Gets the "minaddressbooksyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getMinaddressbooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MINADDRESSBOOKSYNCINTERVAL$148, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "minaddressbooksyncinterval" element
     */
    public boolean isSetMinaddressbooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINADDRESSBOOKSYNCINTERVAL$148) != 0;
        }
    }
    
    /**
     * Sets the "minaddressbooksyncinterval" element
     */
    public void setMinaddressbooksyncinterval(com.microsoft.schemas.crm._2006.webservices.CrmNumber minaddressbooksyncinterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MINADDRESSBOOKSYNCINTERVAL$148, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MINADDRESSBOOKSYNCINTERVAL$148);
            }
            target.set(minaddressbooksyncinterval);
        }
    }
    
    /**
     * Appends and returns a new empty "minaddressbooksyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewMinaddressbooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MINADDRESSBOOKSYNCINTERVAL$148);
            return target;
        }
    }
    
    /**
     * Unsets the "minaddressbooksyncinterval" element
     */
    public void unsetMinaddressbooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINADDRESSBOOKSYNCINTERVAL$148, 0);
        }
    }
    
    /**
     * Gets the "minofflinesyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getMinofflinesyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MINOFFLINESYNCINTERVAL$150, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "minofflinesyncinterval" element
     */
    public boolean isSetMinofflinesyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINOFFLINESYNCINTERVAL$150) != 0;
        }
    }
    
    /**
     * Sets the "minofflinesyncinterval" element
     */
    public void setMinofflinesyncinterval(com.microsoft.schemas.crm._2006.webservices.CrmNumber minofflinesyncinterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MINOFFLINESYNCINTERVAL$150, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MINOFFLINESYNCINTERVAL$150);
            }
            target.set(minofflinesyncinterval);
        }
    }
    
    /**
     * Appends and returns a new empty "minofflinesyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewMinofflinesyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MINOFFLINESYNCINTERVAL$150);
            return target;
        }
    }
    
    /**
     * Unsets the "minofflinesyncinterval" element
     */
    public void unsetMinofflinesyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINOFFLINESYNCINTERVAL$150, 0);
        }
    }
    
    /**
     * Gets the "minoutlooksyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getMinoutlooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MINOUTLOOKSYNCINTERVAL$152, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "minoutlooksyncinterval" element
     */
    public boolean isSetMinoutlooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINOUTLOOKSYNCINTERVAL$152) != 0;
        }
    }
    
    /**
     * Sets the "minoutlooksyncinterval" element
     */
    public void setMinoutlooksyncinterval(com.microsoft.schemas.crm._2006.webservices.CrmNumber minoutlooksyncinterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(MINOUTLOOKSYNCINTERVAL$152, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MINOUTLOOKSYNCINTERVAL$152);
            }
            target.set(minoutlooksyncinterval);
        }
    }
    
    /**
     * Appends and returns a new empty "minoutlooksyncinterval" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewMinoutlooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(MINOUTLOOKSYNCINTERVAL$152);
            return target;
        }
    }
    
    /**
     * Unsets the "minoutlooksyncinterval" element
     */
    public void unsetMinoutlooksyncinterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINOUTLOOKSYNCINTERVAL$152, 0);
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
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$158, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$158, 0);
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
            return get_store().count_elements(NAME$158) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$158, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$158);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$158, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$158);
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
            get_store().remove_element(NAME$158, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEGATIVECURRENCYFORMATCODE$160, 0);
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
            return get_store().count_elements(NEGATIVECURRENCYFORMATCODE$160) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEGATIVECURRENCYFORMATCODE$160, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEGATIVECURRENCYFORMATCODE$160);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEGATIVECURRENCYFORMATCODE$160);
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
            get_store().remove_element(NEGATIVECURRENCYFORMATCODE$160, 0);
        }
    }
    
    /**
     * Gets the "negativeformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getNegativeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(NEGATIVEFORMATCODE$162, 0);
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
            return get_store().count_elements(NEGATIVEFORMATCODE$162) != 0;
        }
    }
    
    /**
     * Sets the "negativeformatcode" element
     */
    public void setNegativeformatcode(com.microsoft.schemas.crm._2006.webservices.Picklist negativeformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(NEGATIVEFORMATCODE$162, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(NEGATIVEFORMATCODE$162);
            }
            target.set(negativeformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "negativeformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewNegativeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(NEGATIVEFORMATCODE$162);
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
            get_store().remove_element(NEGATIVEFORMATCODE$162, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEXTTRACKINGNUMBER$164, 0);
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
            return get_store().count_elements(NEXTTRACKINGNUMBER$164) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(NEXTTRACKINGNUMBER$164, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEXTTRACKINGNUMBER$164);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(NEXTTRACKINGNUMBER$164);
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
            get_store().remove_element(NEXTTRACKINGNUMBER$164, 0);
        }
    }
    
    /**
     * Gets the "numberformat" element
     */
    public java.lang.String getNumberformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERFORMAT$166, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberformat" element
     */
    public org.apache.xmlbeans.XmlString xgetNumberformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERFORMAT$166, 0);
            return target;
        }
    }
    
    /**
     * True if has "numberformat" element
     */
    public boolean isSetNumberformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERFORMAT$166) != 0;
        }
    }
    
    /**
     * Sets the "numberformat" element
     */
    public void setNumberformat(java.lang.String numberformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERFORMAT$166, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERFORMAT$166);
            }
            target.setStringValue(numberformat);
        }
    }
    
    /**
     * Sets (as xml) the "numberformat" element
     */
    public void xsetNumberformat(org.apache.xmlbeans.XmlString numberformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERFORMAT$166, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBERFORMAT$166);
            }
            target.set(numberformat);
        }
    }
    
    /**
     * Unsets the "numberformat" element
     */
    public void unsetNumberformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERFORMAT$166, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERGROUPFORMAT$168, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERGROUPFORMAT$168, 0);
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
            return get_store().count_elements(NUMBERGROUPFORMAT$168) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERGROUPFORMAT$168, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERGROUPFORMAT$168);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERGROUPFORMAT$168, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBERGROUPFORMAT$168);
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
            get_store().remove_element(NUMBERGROUPFORMAT$168, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSEPARATOR$170, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERSEPARATOR$170, 0);
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
            return get_store().count_elements(NUMBERSEPARATOR$170) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSEPARATOR$170, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERSEPARATOR$170);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBERSEPARATOR$170, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBERSEPARATOR$170);
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
            get_store().remove_element(NUMBERSEPARATOR$170, 0);
        }
    }
    
    /**
     * Gets the "orderprefix" element
     */
    public java.lang.String getOrderprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERPREFIX$172, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "orderprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERPREFIX$172, 0);
            return target;
        }
    }
    
    /**
     * True if has "orderprefix" element
     */
    public boolean isSetOrderprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERPREFIX$172) != 0;
        }
    }
    
    /**
     * Sets the "orderprefix" element
     */
    public void setOrderprefix(java.lang.String orderprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERPREFIX$172, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERPREFIX$172);
            }
            target.setStringValue(orderprefix);
        }
    }
    
    /**
     * Sets (as xml) the "orderprefix" element
     */
    public void xsetOrderprefix(org.apache.xmlbeans.XmlString orderprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERPREFIX$172, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERPREFIX$172);
            }
            target.set(orderprefix);
        }
    }
    
    /**
     * Unsets the "orderprefix" element
     */
    public void unsetOrderprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERPREFIX$172, 0);
        }
    }
    
    /**
     * Gets the "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ORGANIZATIONID$174, 0);
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
            return get_store().count_elements(ORGANIZATIONID$174) != 0;
        }
    }
    
    /**
     * Sets the "organizationid" element
     */
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Key organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ORGANIZATIONID$174, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ORGANIZATIONID$174);
            }
            target.set(organizationid);
        }
    }
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ORGANIZATIONID$174);
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
            get_store().remove_element(ORGANIZATIONID$174, 0);
        }
    }
    
    /**
     * Gets the "parsedtablecolumnprefix" element
     */
    public java.lang.String getParsedtablecolumnprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARSEDTABLECOLUMNPREFIX$176, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parsedtablecolumnprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetParsedtablecolumnprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARSEDTABLECOLUMNPREFIX$176, 0);
            return target;
        }
    }
    
    /**
     * True if has "parsedtablecolumnprefix" element
     */
    public boolean isSetParsedtablecolumnprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARSEDTABLECOLUMNPREFIX$176) != 0;
        }
    }
    
    /**
     * Sets the "parsedtablecolumnprefix" element
     */
    public void setParsedtablecolumnprefix(java.lang.String parsedtablecolumnprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARSEDTABLECOLUMNPREFIX$176, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARSEDTABLECOLUMNPREFIX$176);
            }
            target.setStringValue(parsedtablecolumnprefix);
        }
    }
    
    /**
     * Sets (as xml) the "parsedtablecolumnprefix" element
     */
    public void xsetParsedtablecolumnprefix(org.apache.xmlbeans.XmlString parsedtablecolumnprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARSEDTABLECOLUMNPREFIX$176, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARSEDTABLECOLUMNPREFIX$176);
            }
            target.set(parsedtablecolumnprefix);
        }
    }
    
    /**
     * Unsets the "parsedtablecolumnprefix" element
     */
    public void unsetParsedtablecolumnprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARSEDTABLECOLUMNPREFIX$176, 0);
        }
    }
    
    /**
     * Gets the "parsedtableprefix" element
     */
    public java.lang.String getParsedtableprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARSEDTABLEPREFIX$178, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parsedtableprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetParsedtableprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARSEDTABLEPREFIX$178, 0);
            return target;
        }
    }
    
    /**
     * True if has "parsedtableprefix" element
     */
    public boolean isSetParsedtableprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARSEDTABLEPREFIX$178) != 0;
        }
    }
    
    /**
     * Sets the "parsedtableprefix" element
     */
    public void setParsedtableprefix(java.lang.String parsedtableprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARSEDTABLEPREFIX$178, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARSEDTABLEPREFIX$178);
            }
            target.setStringValue(parsedtableprefix);
        }
    }
    
    /**
     * Sets (as xml) the "parsedtableprefix" element
     */
    public void xsetParsedtableprefix(org.apache.xmlbeans.XmlString parsedtableprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARSEDTABLEPREFIX$178, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARSEDTABLEPREFIX$178);
            }
            target.set(parsedtableprefix);
        }
    }
    
    /**
     * Unsets the "parsedtableprefix" element
     */
    public void unsetParsedtableprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARSEDTABLEPREFIX$178, 0);
        }
    }
    
    /**
     * Gets the "picture" element
     */
    public java.lang.String getPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PICTURE$180, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "picture" element
     */
    public org.apache.xmlbeans.XmlString xgetPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PICTURE$180, 0);
            return target;
        }
    }
    
    /**
     * True if has "picture" element
     */
    public boolean isSetPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PICTURE$180) != 0;
        }
    }
    
    /**
     * Sets the "picture" element
     */
    public void setPicture(java.lang.String picture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PICTURE$180, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PICTURE$180);
            }
            target.setStringValue(picture);
        }
    }
    
    /**
     * Sets (as xml) the "picture" element
     */
    public void xsetPicture(org.apache.xmlbeans.XmlString picture)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PICTURE$180, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PICTURE$180);
            }
            target.set(picture);
        }
    }
    
    /**
     * Unsets the "picture" element
     */
    public void unsetPicture()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PICTURE$180, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMDESIGNATOR$182, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMDESIGNATOR$182, 0);
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
            return get_store().count_elements(PMDESIGNATOR$182) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PMDESIGNATOR$182, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PMDESIGNATOR$182);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PMDESIGNATOR$182, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PMDESIGNATOR$182);
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
            get_store().remove_element(PMDESIGNATOR$182, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PRICINGDECIMALPRECISION$184, 0);
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
            return get_store().count_elements(PRICINGDECIMALPRECISION$184) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PRICINGDECIMALPRECISION$184, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PRICINGDECIMALPRECISION$184);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PRICINGDECIMALPRECISION$184);
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
            get_store().remove_element(PRICINGDECIMALPRECISION$184, 0);
        }
    }
    
    /**
     * Gets the "privilegeusergroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getPrivilegeusergroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(PRIVILEGEUSERGROUPID$186, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "privilegeusergroupid" element
     */
    public boolean isSetPrivilegeusergroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVILEGEUSERGROUPID$186) != 0;
        }
    }
    
    /**
     * Sets the "privilegeusergroupid" element
     */
    public void setPrivilegeusergroupid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier privilegeusergroupid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(PRIVILEGEUSERGROUPID$186, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(PRIVILEGEUSERGROUPID$186);
            }
            target.set(privilegeusergroupid);
        }
    }
    
    /**
     * Appends and returns a new empty "privilegeusergroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewPrivilegeusergroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(PRIVILEGEUSERGROUPID$186);
            return target;
        }
    }
    
    /**
     * Unsets the "privilegeusergroupid" element
     */
    public void unsetPrivilegeusergroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVILEGEUSERGROUPID$186, 0);
        }
    }
    
    /**
     * Gets the "privreportinggroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getPrivreportinggroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(PRIVREPORTINGGROUPID$188, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "privreportinggroupid" element
     */
    public boolean isSetPrivreportinggroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVREPORTINGGROUPID$188) != 0;
        }
    }
    
    /**
     * Sets the "privreportinggroupid" element
     */
    public void setPrivreportinggroupid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier privreportinggroupid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(PRIVREPORTINGGROUPID$188, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(PRIVREPORTINGGROUPID$188);
            }
            target.set(privreportinggroupid);
        }
    }
    
    /**
     * Appends and returns a new empty "privreportinggroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewPrivreportinggroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(PRIVREPORTINGGROUPID$188);
            return target;
        }
    }
    
    /**
     * Unsets the "privreportinggroupid" element
     */
    public void unsetPrivreportinggroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVREPORTINGGROUPID$188, 0);
        }
    }
    
    /**
     * Gets the "privreportinggroupname" element
     */
    public java.lang.String getPrivreportinggroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVREPORTINGGROUPNAME$190, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "privreportinggroupname" element
     */
    public org.apache.xmlbeans.XmlString xgetPrivreportinggroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIVREPORTINGGROUPNAME$190, 0);
            return target;
        }
    }
    
    /**
     * True if has "privreportinggroupname" element
     */
    public boolean isSetPrivreportinggroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVREPORTINGGROUPNAME$190) != 0;
        }
    }
    
    /**
     * Sets the "privreportinggroupname" element
     */
    public void setPrivreportinggroupname(java.lang.String privreportinggroupname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVREPORTINGGROUPNAME$190, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVREPORTINGGROUPNAME$190);
            }
            target.setStringValue(privreportinggroupname);
        }
    }
    
    /**
     * Sets (as xml) the "privreportinggroupname" element
     */
    public void xsetPrivreportinggroupname(org.apache.xmlbeans.XmlString privreportinggroupname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIVREPORTINGGROUPNAME$190, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIVREPORTINGGROUPNAME$190);
            }
            target.set(privreportinggroupname);
        }
    }
    
    /**
     * Unsets the "privreportinggroupname" element
     */
    public void unsetPrivreportinggroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVREPORTINGGROUPNAME$190, 0);
        }
    }
    
    /**
     * Gets the "quoteprefix" element
     */
    public java.lang.String getQuoteprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEPREFIX$192, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "quoteprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetQuoteprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUOTEPREFIX$192, 0);
            return target;
        }
    }
    
    /**
     * True if has "quoteprefix" element
     */
    public boolean isSetQuoteprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUOTEPREFIX$192) != 0;
        }
    }
    
    /**
     * Sets the "quoteprefix" element
     */
    public void setQuoteprefix(java.lang.String quoteprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUOTEPREFIX$192, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUOTEPREFIX$192);
            }
            target.setStringValue(quoteprefix);
        }
    }
    
    /**
     * Sets (as xml) the "quoteprefix" element
     */
    public void xsetQuoteprefix(org.apache.xmlbeans.XmlString quoteprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUOTEPREFIX$192, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUOTEPREFIX$192);
            }
            target.set(quoteprefix);
        }
    }
    
    /**
     * Unsets the "quoteprefix" element
     */
    public void unsetQuoteprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUOTEPREFIX$192, 0);
        }
    }
    
    /**
     * Gets the "referencesitemapxml" element
     */
    public java.lang.String getReferencesitemapxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCESITEMAPXML$194, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "referencesitemapxml" element
     */
    public org.apache.xmlbeans.XmlString xgetReferencesitemapxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCESITEMAPXML$194, 0);
            return target;
        }
    }
    
    /**
     * True if has "referencesitemapxml" element
     */
    public boolean isSetReferencesitemapxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCESITEMAPXML$194) != 0;
        }
    }
    
    /**
     * Sets the "referencesitemapxml" element
     */
    public void setReferencesitemapxml(java.lang.String referencesitemapxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCESITEMAPXML$194, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCESITEMAPXML$194);
            }
            target.setStringValue(referencesitemapxml);
        }
    }
    
    /**
     * Sets (as xml) the "referencesitemapxml" element
     */
    public void xsetReferencesitemapxml(org.apache.xmlbeans.XmlString referencesitemapxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCESITEMAPXML$194, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCESITEMAPXML$194);
            }
            target.set(referencesitemapxml);
        }
    }
    
    /**
     * Unsets the "referencesitemapxml" element
     */
    public void unsetReferencesitemapxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCESITEMAPXML$194, 0);
        }
    }
    
    /**
     * Gets the "rendersecureiframeforemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getRendersecureiframeforemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(RENDERSECUREIFRAMEFOREMAIL$196, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rendersecureiframeforemail" element
     */
    public boolean isSetRendersecureiframeforemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERSECUREIFRAMEFOREMAIL$196) != 0;
        }
    }
    
    /**
     * Sets the "rendersecureiframeforemail" element
     */
    public void setRendersecureiframeforemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean rendersecureiframeforemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(RENDERSECUREIFRAMEFOREMAIL$196, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(RENDERSECUREIFRAMEFOREMAIL$196);
            }
            target.set(rendersecureiframeforemail);
        }
    }
    
    /**
     * Appends and returns a new empty "rendersecureiframeforemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewRendersecureiframeforemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(RENDERSECUREIFRAMEFOREMAIL$196);
            return target;
        }
    }
    
    /**
     * Unsets the "rendersecureiframeforemail" element
     */
    public void unsetRendersecureiframeforemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERSECUREIFRAMEFOREMAIL$196, 0);
        }
    }
    
    /**
     * Gets the "reportinggroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getReportinggroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(REPORTINGGROUPID$198, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportinggroupid" element
     */
    public boolean isSetReportinggroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGGROUPID$198) != 0;
        }
    }
    
    /**
     * Sets the "reportinggroupid" element
     */
    public void setReportinggroupid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier reportinggroupid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(REPORTINGGROUPID$198, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(REPORTINGGROUPID$198);
            }
            target.set(reportinggroupid);
        }
    }
    
    /**
     * Appends and returns a new empty "reportinggroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewReportinggroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(REPORTINGGROUPID$198);
            return target;
        }
    }
    
    /**
     * Unsets the "reportinggroupid" element
     */
    public void unsetReportinggroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGGROUPID$198, 0);
        }
    }
    
    /**
     * Gets the "reportinggroupname" element
     */
    public java.lang.String getReportinggroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGGROUPNAME$200, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportinggroupname" element
     */
    public org.apache.xmlbeans.XmlString xgetReportinggroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTINGGROUPNAME$200, 0);
            return target;
        }
    }
    
    /**
     * True if has "reportinggroupname" element
     */
    public boolean isSetReportinggroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGGROUPNAME$200) != 0;
        }
    }
    
    /**
     * Sets the "reportinggroupname" element
     */
    public void setReportinggroupname(java.lang.String reportinggroupname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGGROUPNAME$200, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGGROUPNAME$200);
            }
            target.setStringValue(reportinggroupname);
        }
    }
    
    /**
     * Sets (as xml) the "reportinggroupname" element
     */
    public void xsetReportinggroupname(org.apache.xmlbeans.XmlString reportinggroupname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTINGGROUPNAME$200, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPORTINGGROUPNAME$200);
            }
            target.set(reportinggroupname);
        }
    }
    
    /**
     * Unsets the "reportinggroupname" element
     */
    public void unsetReportinggroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGGROUPNAME$200, 0);
        }
    }
    
    /**
     * Gets the "schemanameprefix" element
     */
    public java.lang.String getSchemanameprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAMEPREFIX$202, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemanameprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetSchemanameprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAMEPREFIX$202, 0);
            return target;
        }
    }
    
    /**
     * True if has "schemanameprefix" element
     */
    public boolean isSetSchemanameprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMANAMEPREFIX$202) != 0;
        }
    }
    
    /**
     * Sets the "schemanameprefix" element
     */
    public void setSchemanameprefix(java.lang.String schemanameprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMANAMEPREFIX$202, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMANAMEPREFIX$202);
            }
            target.setStringValue(schemanameprefix);
        }
    }
    
    /**
     * Sets (as xml) the "schemanameprefix" element
     */
    public void xsetSchemanameprefix(org.apache.xmlbeans.XmlString schemanameprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEMANAMEPREFIX$202, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEMANAMEPREFIX$202);
            }
            target.set(schemanameprefix);
        }
    }
    
    /**
     * Unsets the "schemanameprefix" element
     */
    public void unsetSchemanameprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMANAMEPREFIX$202, 0);
        }
    }
    
    /**
     * Gets the "sharetopreviousowneronassign" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getSharetopreviousowneronassign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SHARETOPREVIOUSOWNERONASSIGN$204, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sharetopreviousowneronassign" element
     */
    public boolean isSetSharetopreviousowneronassign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHARETOPREVIOUSOWNERONASSIGN$204) != 0;
        }
    }
    
    /**
     * Sets the "sharetopreviousowneronassign" element
     */
    public void setSharetopreviousowneronassign(com.microsoft.schemas.crm._2006.webservices.CrmBoolean sharetopreviousowneronassign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SHARETOPREVIOUSOWNERONASSIGN$204, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SHARETOPREVIOUSOWNERONASSIGN$204);
            }
            target.set(sharetopreviousowneronassign);
        }
    }
    
    /**
     * Appends and returns a new empty "sharetopreviousowneronassign" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewSharetopreviousowneronassign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SHARETOPREVIOUSOWNERONASSIGN$204);
            return target;
        }
    }
    
    /**
     * Unsets the "sharetopreviousowneronassign" element
     */
    public void unsetSharetopreviousowneronassign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHARETOPREVIOUSOWNERONASSIGN$204, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SHOWWEEKNUMBER$206, 0);
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
            return get_store().count_elements(SHOWWEEKNUMBER$206) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SHOWWEEKNUMBER$206, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SHOWWEEKNUMBER$206);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SHOWWEEKNUMBER$206);
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
            get_store().remove_element(SHOWWEEKNUMBER$206, 0);
        }
    }
    
    /**
     * Gets the "sitemapxml" element
     */
    public java.lang.String getSitemapxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEMAPXML$208, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sitemapxml" element
     */
    public org.apache.xmlbeans.XmlString xgetSitemapxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEMAPXML$208, 0);
            return target;
        }
    }
    
    /**
     * True if has "sitemapxml" element
     */
    public boolean isSetSitemapxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITEMAPXML$208) != 0;
        }
    }
    
    /**
     * Sets the "sitemapxml" element
     */
    public void setSitemapxml(java.lang.String sitemapxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEMAPXML$208, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEMAPXML$208);
            }
            target.setStringValue(sitemapxml);
        }
    }
    
    /**
     * Sets (as xml) the "sitemapxml" element
     */
    public void xsetSitemapxml(org.apache.xmlbeans.XmlString sitemapxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEMAPXML$208, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITEMAPXML$208);
            }
            target.set(sitemapxml);
        }
    }
    
    /**
     * Unsets the "sitemapxml" element
     */
    public void unsetSitemapxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITEMAPXML$208, 0);
        }
    }
    
    /**
     * Gets the "sortid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSortid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SORTID$210, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sortid" element
     */
    public boolean isSetSortid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SORTID$210) != 0;
        }
    }
    
    /**
     * Sets the "sortid" element
     */
    public void setSortid(com.microsoft.schemas.crm._2006.webservices.CrmNumber sortid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SORTID$210, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SORTID$210);
            }
            target.set(sortid);
        }
    }
    
    /**
     * Appends and returns a new empty "sortid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSortid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SORTID$210);
            return target;
        }
    }
    
    /**
     * Unsets the "sortid" element
     */
    public void unsetSortid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SORTID$210, 0);
        }
    }
    
    /**
     * Gets the "sqlaccessgroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSqlaccessgroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SQLACCESSGROUPID$212, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sqlaccessgroupid" element
     */
    public boolean isSetSqlaccessgroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQLACCESSGROUPID$212) != 0;
        }
    }
    
    /**
     * Sets the "sqlaccessgroupid" element
     */
    public void setSqlaccessgroupid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier sqlaccessgroupid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SQLACCESSGROUPID$212, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SQLACCESSGROUPID$212);
            }
            target.set(sqlaccessgroupid);
        }
    }
    
    /**
     * Appends and returns a new empty "sqlaccessgroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSqlaccessgroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SQLACCESSGROUPID$212);
            return target;
        }
    }
    
    /**
     * Unsets the "sqlaccessgroupid" element
     */
    public void unsetSqlaccessgroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQLACCESSGROUPID$212, 0);
        }
    }
    
    /**
     * Gets the "sqlaccessgroupname" element
     */
    public java.lang.String getSqlaccessgroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SQLACCESSGROUPNAME$214, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sqlaccessgroupname" element
     */
    public org.apache.xmlbeans.XmlString xgetSqlaccessgroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SQLACCESSGROUPNAME$214, 0);
            return target;
        }
    }
    
    /**
     * True if has "sqlaccessgroupname" element
     */
    public boolean isSetSqlaccessgroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQLACCESSGROUPNAME$214) != 0;
        }
    }
    
    /**
     * Sets the "sqlaccessgroupname" element
     */
    public void setSqlaccessgroupname(java.lang.String sqlaccessgroupname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SQLACCESSGROUPNAME$214, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SQLACCESSGROUPNAME$214);
            }
            target.setStringValue(sqlaccessgroupname);
        }
    }
    
    /**
     * Sets (as xml) the "sqlaccessgroupname" element
     */
    public void xsetSqlaccessgroupname(org.apache.xmlbeans.XmlString sqlaccessgroupname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SQLACCESSGROUPNAME$214, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SQLACCESSGROUPNAME$214);
            }
            target.set(sqlaccessgroupname);
        }
    }
    
    /**
     * Unsets the "sqlaccessgroupname" element
     */
    public void unsetSqlaccessgroupname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQLACCESSGROUPNAME$214, 0);
        }
    }
    
    /**
     * Gets the "sqmenabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getSqmenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SQMENABLED$216, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sqmenabled" element
     */
    public boolean isSetSqmenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQMENABLED$216) != 0;
        }
    }
    
    /**
     * Sets the "sqmenabled" element
     */
    public void setSqmenabled(com.microsoft.schemas.crm._2006.webservices.CrmBoolean sqmenabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SQMENABLED$216, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SQMENABLED$216);
            }
            target.set(sqmenabled);
        }
    }
    
    /**
     * Appends and returns a new empty "sqmenabled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewSqmenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SQMENABLED$216);
            return target;
        }
    }
    
    /**
     * Unsets the "sqmenabled" element
     */
    public void unsetSqmenabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQMENABLED$216, 0);
        }
    }
    
    /**
     * Gets the "supportuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSupportuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SUPPORTUSERID$218, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "supportuserid" element
     */
    public boolean isSetSupportuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTUSERID$218) != 0;
        }
    }
    
    /**
     * Sets the "supportuserid" element
     */
    public void setSupportuserid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier supportuserid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SUPPORTUSERID$218, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SUPPORTUSERID$218);
            }
            target.set(supportuserid);
        }
    }
    
    /**
     * Appends and returns a new empty "supportuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSupportuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SUPPORTUSERID$218);
            return target;
        }
    }
    
    /**
     * Unsets the "supportuserid" element
     */
    public void unsetSupportuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTUSERID$218, 0);
        }
    }
    
    /**
     * Gets the "systemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SYSTEMUSERID$220, 0);
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
            return get_store().count_elements(SYSTEMUSERID$220) != 0;
        }
    }
    
    /**
     * Sets the "systemuserid" element
     */
    public void setSystemuserid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier systemuserid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SYSTEMUSERID$220, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SYSTEMUSERID$220);
            }
            target.set(systemuserid);
        }
    }
    
    /**
     * Appends and returns a new empty "systemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SYSTEMUSERID$220);
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
            get_store().remove_element(SYSTEMUSERID$220, 0);
        }
    }
    
    /**
     * Gets the "tagmaxaggressivecycles" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTagmaxaggressivecycles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TAGMAXAGGRESSIVECYCLES$222, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tagmaxaggressivecycles" element
     */
    public boolean isSetTagmaxaggressivecycles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAGMAXAGGRESSIVECYCLES$222) != 0;
        }
    }
    
    /**
     * Sets the "tagmaxaggressivecycles" element
     */
    public void setTagmaxaggressivecycles(com.microsoft.schemas.crm._2006.webservices.CrmNumber tagmaxaggressivecycles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TAGMAXAGGRESSIVECYCLES$222, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TAGMAXAGGRESSIVECYCLES$222);
            }
            target.set(tagmaxaggressivecycles);
        }
    }
    
    /**
     * Appends and returns a new empty "tagmaxaggressivecycles" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTagmaxaggressivecycles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TAGMAXAGGRESSIVECYCLES$222);
            return target;
        }
    }
    
    /**
     * Unsets the "tagmaxaggressivecycles" element
     */
    public void unsetTagmaxaggressivecycles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAGMAXAGGRESSIVECYCLES$222, 0);
        }
    }
    
    /**
     * Gets the "tagpollingperiod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTagpollingperiod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TAGPOLLINGPERIOD$224, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tagpollingperiod" element
     */
    public boolean isSetTagpollingperiod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAGPOLLINGPERIOD$224) != 0;
        }
    }
    
    /**
     * Sets the "tagpollingperiod" element
     */
    public void setTagpollingperiod(com.microsoft.schemas.crm._2006.webservices.CrmNumber tagpollingperiod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TAGPOLLINGPERIOD$224, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TAGPOLLINGPERIOD$224);
            }
            target.set(tagpollingperiod);
        }
    }
    
    /**
     * Appends and returns a new empty "tagpollingperiod" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTagpollingperiod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TAGPOLLINGPERIOD$224);
            return target;
        }
    }
    
    /**
     * Unsets the "tagpollingperiod" element
     */
    public void unsetTagpollingperiod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAGPOLLINGPERIOD$224, 0);
        }
    }
    
    /**
     * Gets the "timeformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getTimeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TIMEFORMATCODE$226, 0);
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
            return get_store().count_elements(TIMEFORMATCODE$226) != 0;
        }
    }
    
    /**
     * Sets the "timeformatcode" element
     */
    public void setTimeformatcode(com.microsoft.schemas.crm._2006.webservices.Picklist timeformatcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TIMEFORMATCODE$226, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TIMEFORMATCODE$226);
            }
            target.set(timeformatcode);
        }
    }
    
    /**
     * Appends and returns a new empty "timeformatcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewTimeformatcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TIMEFORMATCODE$226);
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
            get_store().remove_element(TIMEFORMATCODE$226, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMATSTRING$228, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEFORMATSTRING$228, 0);
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
            return get_store().count_elements(TIMEFORMATSTRING$228) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMATSTRING$228, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEFORMATSTRING$228);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEFORMATSTRING$228, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMEFORMATSTRING$228);
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
            get_store().remove_element(TIMEFORMATSTRING$228, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESEPARATOR$230, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMESEPARATOR$230, 0);
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
            return get_store().count_elements(TIMESEPARATOR$230) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESEPARATOR$230, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESEPARATOR$230);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMESEPARATOR$230, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMESEPARATOR$230);
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
            get_store().remove_element(TIMESEPARATOR$230, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$232, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$232) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$232, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$232);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$232);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$232, 0);
        }
    }
    
    /**
     * Gets the "tokenexpiry" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTokenexpiry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TOKENEXPIRY$234, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tokenexpiry" element
     */
    public boolean isSetTokenexpiry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOKENEXPIRY$234) != 0;
        }
    }
    
    /**
     * Sets the "tokenexpiry" element
     */
    public void setTokenexpiry(com.microsoft.schemas.crm._2006.webservices.CrmNumber tokenexpiry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TOKENEXPIRY$234, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TOKENEXPIRY$234);
            }
            target.set(tokenexpiry);
        }
    }
    
    /**
     * Appends and returns a new empty "tokenexpiry" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTokenexpiry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TOKENEXPIRY$234);
            return target;
        }
    }
    
    /**
     * Unsets the "tokenexpiry" element
     */
    public void unsetTokenexpiry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOKENEXPIRY$234, 0);
        }
    }
    
    /**
     * Gets the "tokenkey" element
     */
    public java.lang.String getTokenkey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENKEY$236, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tokenkey" element
     */
    public org.apache.xmlbeans.XmlString xgetTokenkey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENKEY$236, 0);
            return target;
        }
    }
    
    /**
     * True if has "tokenkey" element
     */
    public boolean isSetTokenkey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOKENKEY$236) != 0;
        }
    }
    
    /**
     * Sets the "tokenkey" element
     */
    public void setTokenkey(java.lang.String tokenkey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENKEY$236, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOKENKEY$236);
            }
            target.setStringValue(tokenkey);
        }
    }
    
    /**
     * Sets (as xml) the "tokenkey" element
     */
    public void xsetTokenkey(org.apache.xmlbeans.XmlString tokenkey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENKEY$236, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOKENKEY$236);
            }
            target.set(tokenkey);
        }
    }
    
    /**
     * Unsets the "tokenkey" element
     */
    public void unsetTokenkey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOKENKEY$236, 0);
        }
    }
    
    /**
     * Gets the "trackingprefix" element
     */
    public java.lang.String getTrackingprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGPREFIX$238, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "trackingprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetTrackingprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGPREFIX$238, 0);
            return target;
        }
    }
    
    /**
     * True if has "trackingprefix" element
     */
    public boolean isSetTrackingprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKINGPREFIX$238) != 0;
        }
    }
    
    /**
     * Sets the "trackingprefix" element
     */
    public void setTrackingprefix(java.lang.String trackingprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKINGPREFIX$238, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKINGPREFIX$238);
            }
            target.setStringValue(trackingprefix);
        }
    }
    
    /**
     * Sets (as xml) the "trackingprefix" element
     */
    public void xsetTrackingprefix(org.apache.xmlbeans.XmlString trackingprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRACKINGPREFIX$238, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRACKINGPREFIX$238);
            }
            target.set(trackingprefix);
        }
    }
    
    /**
     * Unsets the "trackingprefix" element
     */
    public void unsetTrackingprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKINGPREFIX$238, 0);
        }
    }
    
    /**
     * Gets the "trackingtokenidbase" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTrackingtokenidbase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TRACKINGTOKENIDBASE$240, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trackingtokenidbase" element
     */
    public boolean isSetTrackingtokenidbase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKINGTOKENIDBASE$240) != 0;
        }
    }
    
    /**
     * Sets the "trackingtokenidbase" element
     */
    public void setTrackingtokenidbase(com.microsoft.schemas.crm._2006.webservices.CrmNumber trackingtokenidbase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TRACKINGTOKENIDBASE$240, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TRACKINGTOKENIDBASE$240);
            }
            target.set(trackingtokenidbase);
        }
    }
    
    /**
     * Appends and returns a new empty "trackingtokenidbase" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTrackingtokenidbase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TRACKINGTOKENIDBASE$240);
            return target;
        }
    }
    
    /**
     * Unsets the "trackingtokenidbase" element
     */
    public void unsetTrackingtokenidbase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKINGTOKENIDBASE$240, 0);
        }
    }
    
    /**
     * Gets the "trackingtokeniddigits" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTrackingtokeniddigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TRACKINGTOKENIDDIGITS$242, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "trackingtokeniddigits" element
     */
    public boolean isSetTrackingtokeniddigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKINGTOKENIDDIGITS$242) != 0;
        }
    }
    
    /**
     * Sets the "trackingtokeniddigits" element
     */
    public void setTrackingtokeniddigits(com.microsoft.schemas.crm._2006.webservices.CrmNumber trackingtokeniddigits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TRACKINGTOKENIDDIGITS$242, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TRACKINGTOKENIDDIGITS$242);
            }
            target.set(trackingtokeniddigits);
        }
    }
    
    /**
     * Appends and returns a new empty "trackingtokeniddigits" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTrackingtokeniddigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TRACKINGTOKENIDDIGITS$242);
            return target;
        }
    }
    
    /**
     * Unsets the "trackingtokeniddigits" element
     */
    public void unsetTrackingtokeniddigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKINGTOKENIDDIGITS$242, 0);
        }
    }
    
    /**
     * Gets the "uniquespecifierlength" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getUniquespecifierlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UNIQUESPECIFIERLENGTH$244, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uniquespecifierlength" element
     */
    public boolean isSetUniquespecifierlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUESPECIFIERLENGTH$244) != 0;
        }
    }
    
    /**
     * Sets the "uniquespecifierlength" element
     */
    public void setUniquespecifierlength(com.microsoft.schemas.crm._2006.webservices.CrmNumber uniquespecifierlength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UNIQUESPECIFIERLENGTH$244, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UNIQUESPECIFIERLENGTH$244);
            }
            target.set(uniquespecifierlength);
        }
    }
    
    /**
     * Appends and returns a new empty "uniquespecifierlength" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUniquespecifierlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UNIQUESPECIFIERLENGTH$244);
            return target;
        }
    }
    
    /**
     * Unsets the "uniquespecifierlength" element
     */
    public void unsetUniquespecifierlength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUESPECIFIERLENGTH$244, 0);
        }
    }
    
    /**
     * Gets the "usergroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getUsergroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(USERGROUPID$246, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usergroupid" element
     */
    public boolean isSetUsergroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERGROUPID$246) != 0;
        }
    }
    
    /**
     * Sets the "usergroupid" element
     */
    public void setUsergroupid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier usergroupid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(USERGROUPID$246, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(USERGROUPID$246);
            }
            target.set(usergroupid);
        }
    }
    
    /**
     * Appends and returns a new empty "usergroupid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewUsergroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(USERGROUPID$246);
            return target;
        }
    }
    
    /**
     * Unsets the "usergroupid" element
     */
    public void unsetUsergroupid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERGROUPID$246, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$248, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$248) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$248, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$248);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$248);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$248, 0);
        }
    }
    
    /**
     * Gets the "v3calloutconfighash" element
     */
    public java.lang.String getV3Calloutconfighash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V3CALLOUTCONFIGHASH$250, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "v3calloutconfighash" element
     */
    public org.apache.xmlbeans.XmlString xgetV3Calloutconfighash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(V3CALLOUTCONFIGHASH$250, 0);
            return target;
        }
    }
    
    /**
     * True if has "v3calloutconfighash" element
     */
    public boolean isSetV3Calloutconfighash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(V3CALLOUTCONFIGHASH$250) != 0;
        }
    }
    
    /**
     * Sets the "v3calloutconfighash" element
     */
    public void setV3Calloutconfighash(java.lang.String v3Calloutconfighash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(V3CALLOUTCONFIGHASH$250, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(V3CALLOUTCONFIGHASH$250);
            }
            target.setStringValue(v3Calloutconfighash);
        }
    }
    
    /**
     * Sets (as xml) the "v3calloutconfighash" element
     */
    public void xsetV3Calloutconfighash(org.apache.xmlbeans.XmlString v3Calloutconfighash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(V3CALLOUTCONFIGHASH$250, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(V3CALLOUTCONFIGHASH$250);
            }
            target.set(v3Calloutconfighash);
        }
    }
    
    /**
     * Unsets the "v3calloutconfighash" element
     */
    public void unsetV3Calloutconfighash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(V3CALLOUTCONFIGHASH$250, 0);
        }
    }
    
    /**
     * Gets the "weekstartdaycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getWeekstartdaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(WEEKSTARTDAYCODE$252, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "weekstartdaycode" element
     */
    public boolean isSetWeekstartdaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEEKSTARTDAYCODE$252) != 0;
        }
    }
    
    /**
     * Sets the "weekstartdaycode" element
     */
    public void setWeekstartdaycode(com.microsoft.schemas.crm._2006.webservices.Picklist weekstartdaycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(WEEKSTARTDAYCODE$252, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(WEEKSTARTDAYCODE$252);
            }
            target.set(weekstartdaycode);
        }
    }
    
    /**
     * Appends and returns a new empty "weekstartdaycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewWeekstartdaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(WEEKSTARTDAYCODE$252);
            return target;
        }
    }
    
    /**
     * Unsets the "weekstartdaycode" element
     */
    public void unsetWeekstartdaycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEEKSTARTDAYCODE$252, 0);
        }
    }
    
    /**
     * Gets the "yearstartweekcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getYearstartweekcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(YEARSTARTWEEKCODE$254, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "yearstartweekcode" element
     */
    public boolean isSetYearstartweekcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YEARSTARTWEEKCODE$254) != 0;
        }
    }
    
    /**
     * Sets the "yearstartweekcode" element
     */
    public void setYearstartweekcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber yearstartweekcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(YEARSTARTWEEKCODE$254, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(YEARSTARTWEEKCODE$254);
            }
            target.set(yearstartweekcode);
        }
    }
    
    /**
     * Appends and returns a new empty "yearstartweekcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewYearstartweekcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(YEARSTARTWEEKCODE$254);
            return target;
        }
    }
    
    /**
     * Unsets the "yearstartweekcode" element
     */
    public void unsetYearstartweekcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YEARSTARTWEEKCODE$254, 0);
        }
    }
}
