/*
 * XML Type:  EntityName
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.EntityName
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML EntityName(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.crm._2007.webservices.EntityName.
 */
public interface EntityName extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("entitynamebeactype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum ACCOUNT = Enum.forString("account");
    static final Enum ACTIVITYMIMEATTACHMENT = Enum.forString("activitymimeattachment");
    static final Enum ACTIVITYPARTY = Enum.forString("activityparty");
    static final Enum ACTIVITYPOINTER = Enum.forString("activitypointer");
    static final Enum ANNOTATION = Enum.forString("annotation");
    static final Enum ANNUALFISCALCALENDAR = Enum.forString("annualfiscalcalendar");
    static final Enum APPOINTMENT = Enum.forString("appointment");
    static final Enum ASYNCOPERATION = Enum.forString("asyncoperation");
    static final Enum ATTRIBUTEMAP = Enum.forString("attributemap");
    static final Enum BULKDELETEFAILURE = Enum.forString("bulkdeletefailure");
    static final Enum BULKDELETEOPERATION = Enum.forString("bulkdeleteoperation");
    static final Enum BULKOPERATION = Enum.forString("bulkoperation");
    static final Enum BULKOPERATIONLOG = Enum.forString("bulkoperationlog");
    static final Enum BUSINESSTASK = Enum.forString("businesstask");
    static final Enum BUSINESSUNIT = Enum.forString("businessunit");
    static final Enum BUSINESSUNITNEWSARTICLE = Enum.forString("businessunitnewsarticle");
    static final Enum CALENDAR = Enum.forString("calendar");
    static final Enum CALENDARRULE = Enum.forString("calendarrule");
    static final Enum CAMPAIGN = Enum.forString("campaign");
    static final Enum CAMPAIGNACTIVITY = Enum.forString("campaignactivity");
    static final Enum CAMPAIGNACTIVITYITEM = Enum.forString("campaignactivityitem");
    static final Enum CAMPAIGNITEM = Enum.forString("campaignitem");
    static final Enum CAMPAIGNRESPONSE = Enum.forString("campaignresponse");
    static final Enum COLUMNMAPPING = Enum.forString("columnmapping");
    static final Enum COMPETITOR = Enum.forString("competitor");
    static final Enum CONSTRAINTBASEDGROUP = Enum.forString("constraintbasedgroup");
    static final Enum CONTACT = Enum.forString("contact");
    static final Enum CONTRACT = Enum.forString("contract");
    static final Enum CONTRACTDETAIL = Enum.forString("contractdetail");
    static final Enum CONTRACTTEMPLATE = Enum.forString("contracttemplate");
    static final Enum CUSTOMERADDRESS = Enum.forString("customeraddress");
    static final Enum CUSTOMEROPPORTUNITYROLE = Enum.forString("customeropportunityrole");
    static final Enum CUSTOMERRELATIONSHIP = Enum.forString("customerrelationship");
    static final Enum DISCOUNT = Enum.forString("discount");
    static final Enum DISCOUNTTYPE = Enum.forString("discounttype");
    static final Enum DISPLAYSTRING = Enum.forString("displaystring");
    static final Enum DUPLICATERECORD = Enum.forString("duplicaterecord");
    static final Enum DUPLICATERULE = Enum.forString("duplicaterule");
    static final Enum DUPLICATERULECONDITION = Enum.forString("duplicaterulecondition");
    static final Enum EMAIL = Enum.forString("email");
    static final Enum ENTITYMAP = Enum.forString("entitymap");
    static final Enum EQUIPMENT = Enum.forString("equipment");
    static final Enum FAX = Enum.forString("fax");
    static final Enum FIXEDMONTHLYFISCALCALENDAR = Enum.forString("fixedmonthlyfiscalcalendar");
    static final Enum IMPORT = Enum.forString("import");
    static final Enum IMPORTDATA = Enum.forString("importdata");
    static final Enum IMPORTFILE = Enum.forString("importfile");
    static final Enum IMPORTJOB = Enum.forString("importjob");
    static final Enum IMPORTLOG = Enum.forString("importlog");
    static final Enum IMPORTMAP = Enum.forString("importmap");
    static final Enum INCIDENT = Enum.forString("incident");
    static final Enum INCIDENTRESOLUTION = Enum.forString("incidentresolution");
    static final Enum INVOICE = Enum.forString("invoice");
    static final Enum INVOICEDETAIL = Enum.forString("invoicedetail");
    static final Enum ISVCONFIG = Enum.forString("isvconfig");
    static final Enum KBARTICLE = Enum.forString("kbarticle");
    static final Enum KBARTICLECOMMENT = Enum.forString("kbarticlecomment");
    static final Enum KBARTICLETEMPLATE = Enum.forString("kbarticletemplate");
    static final Enum LEAD = Enum.forString("lead");
    static final Enum LETTER = Enum.forString("letter");
    static final Enum LICENSE = Enum.forString("license");
    static final Enum LIST = Enum.forString("list");
    static final Enum LISTMEMBER = Enum.forString("listmember");
    static final Enum LOOKUPMAPPING = Enum.forString("lookupmapping");
    static final Enum MAILMERGETEMPLATE = Enum.forString("mailmergetemplate");
    static final Enum MONTHLYFISCALCALENDAR = Enum.forString("monthlyfiscalcalendar");
    static final Enum NOTIFICATION = Enum.forString("notification");
    static final Enum OPPORTUNITY = Enum.forString("opportunity");
    static final Enum OPPORTUNITYCLOSE = Enum.forString("opportunityclose");
    static final Enum OPPORTUNITYPRODUCT = Enum.forString("opportunityproduct");
    static final Enum ORDERCLOSE = Enum.forString("orderclose");
    static final Enum ORGANIZATION = Enum.forString("organization");
    static final Enum ORGANIZATIONUI = Enum.forString("organizationui");
    static final Enum OWNERMAPPING = Enum.forString("ownermapping");
    static final Enum PHONECALL = Enum.forString("phonecall");
    static final Enum PICKLISTMAPPING = Enum.forString("picklistmapping");
    static final Enum PLUGINASSEMBLY = Enum.forString("pluginassembly");
    static final Enum PLUGINTYPE = Enum.forString("plugintype");
    static final Enum PRICELEVEL = Enum.forString("pricelevel");
    static final Enum PRIVILEGE = Enum.forString("privilege");
    static final Enum PRODUCT = Enum.forString("product");
    static final Enum PRODUCTPRICELEVEL = Enum.forString("productpricelevel");
    static final Enum QUARTERLYFISCALCALENDAR = Enum.forString("quarterlyfiscalcalendar");
    static final Enum QUEUE = Enum.forString("queue");
    static final Enum QUEUEITEM = Enum.forString("queueitem");
    static final Enum QUOTE = Enum.forString("quote");
    static final Enum QUOTECLOSE = Enum.forString("quoteclose");
    static final Enum QUOTEDETAIL = Enum.forString("quotedetail");
    static final Enum RELATIONSHIPROLE = Enum.forString("relationshiprole");
    static final Enum RELATIONSHIPROLEMAP = Enum.forString("relationshiprolemap");
    static final Enum REPORT = Enum.forString("report");
    static final Enum REPORTCATEGORY = Enum.forString("reportcategory");
    static final Enum REPORTENTITY = Enum.forString("reportentity");
    static final Enum REPORTLINK = Enum.forString("reportlink");
    static final Enum REPORTVISIBILITY = Enum.forString("reportvisibility");
    static final Enum RESOURCE = Enum.forString("resource");
    static final Enum RESOURCEGROUP = Enum.forString("resourcegroup");
    static final Enum RESOURCESPEC = Enum.forString("resourcespec");
    static final Enum ROLE = Enum.forString("role");
    static final Enum SALESLITERATURE = Enum.forString("salesliterature");
    static final Enum SALESLITERATUREITEM = Enum.forString("salesliteratureitem");
    static final Enum SALESORDER = Enum.forString("salesorder");
    static final Enum SALESORDERDETAIL = Enum.forString("salesorderdetail");
    static final Enum SAVEDQUERY = Enum.forString("savedquery");
    static final Enum SDKMESSAGE = Enum.forString("sdkmessage");
    static final Enum SDKMESSAGEFILTER = Enum.forString("sdkmessagefilter");
    static final Enum SDKMESSAGEPROCESSINGSTEP = Enum.forString("sdkmessageprocessingstep");
    static final Enum SDKMESSAGEPROCESSINGSTEPIMAGE = Enum.forString("sdkmessageprocessingstepimage");
    static final Enum SDKMESSAGEPROCESSINGSTEPSECURECONFIG = Enum.forString("sdkmessageprocessingstepsecureconfig");
    static final Enum SEMIANNUALFISCALCALENDAR = Enum.forString("semiannualfiscalcalendar");
    static final Enum SERVICE = Enum.forString("service");
    static final Enum SERVICEAPPOINTMENT = Enum.forString("serviceappointment");
    static final Enum SITE = Enum.forString("site");
    static final Enum SUBJECT = Enum.forString("subject");
    static final Enum SUBSCRIPTION = Enum.forString("subscription");
    static final Enum SUBSCRIPTIONCLIENTS = Enum.forString("subscriptionclients");
    static final Enum SUBSCRIPTIONSYNCINFO = Enum.forString("subscriptionsyncinfo");
    static final Enum SYSTEMUSER = Enum.forString("systemuser");
    static final Enum TASK = Enum.forString("task");
    static final Enum TEAM = Enum.forString("team");
    static final Enum TEMPLATE = Enum.forString("template");
    static final Enum TERRITORY = Enum.forString("territory");
    static final Enum TIMEZONEDEFINITION = Enum.forString("timezonedefinition");
    static final Enum TIMEZONELOCALIZEDNAME = Enum.forString("timezonelocalizedname");
    static final Enum TIMEZONERULE = Enum.forString("timezonerule");
    static final Enum TRANSACTIONCURRENCY = Enum.forString("transactioncurrency");
    static final Enum TRANSFORMATIONMAPPING = Enum.forString("transformationmapping");
    static final Enum TRANSFORMATIONPARAMETERMAPPING = Enum.forString("transformationparametermapping");
    static final Enum UOM = Enum.forString("uom");
    static final Enum UOMSCHEDULE = Enum.forString("uomschedule");
    static final Enum USERQUERY = Enum.forString("userquery");
    static final Enum USERSETTINGS = Enum.forString("usersettings");
    static final Enum WEBWIZARD = Enum.forString("webwizard");
    static final Enum WFPROCESS = Enum.forString("wfprocess");
    static final Enum WFPROCESSINSTANCE = Enum.forString("wfprocessinstance");
    static final Enum WIZARDACCESSPRIVILEGE = Enum.forString("wizardaccessprivilege");
    static final Enum WIZARDPAGE = Enum.forString("wizardpage");
    static final Enum WORKFLOW = Enum.forString("workflow");
    static final Enum WORKFLOWDEPENDENCY = Enum.forString("workflowdependency");
    static final Enum WORKFLOWLOG = Enum.forString("workflowlog");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_ACCOUNT = Enum.INT_ACCOUNT;
    static final int INT_ACTIVITYMIMEATTACHMENT = Enum.INT_ACTIVITYMIMEATTACHMENT;
    static final int INT_ACTIVITYPARTY = Enum.INT_ACTIVITYPARTY;
    static final int INT_ACTIVITYPOINTER = Enum.INT_ACTIVITYPOINTER;
    static final int INT_ANNOTATION = Enum.INT_ANNOTATION;
    static final int INT_ANNUALFISCALCALENDAR = Enum.INT_ANNUALFISCALCALENDAR;
    static final int INT_APPOINTMENT = Enum.INT_APPOINTMENT;
    static final int INT_ASYNCOPERATION = Enum.INT_ASYNCOPERATION;
    static final int INT_ATTRIBUTEMAP = Enum.INT_ATTRIBUTEMAP;
    static final int INT_BULKDELETEFAILURE = Enum.INT_BULKDELETEFAILURE;
    static final int INT_BULKDELETEOPERATION = Enum.INT_BULKDELETEOPERATION;
    static final int INT_BULKOPERATION = Enum.INT_BULKOPERATION;
    static final int INT_BULKOPERATIONLOG = Enum.INT_BULKOPERATIONLOG;
    static final int INT_BUSINESSTASK = Enum.INT_BUSINESSTASK;
    static final int INT_BUSINESSUNIT = Enum.INT_BUSINESSUNIT;
    static final int INT_BUSINESSUNITNEWSARTICLE = Enum.INT_BUSINESSUNITNEWSARTICLE;
    static final int INT_CALENDAR = Enum.INT_CALENDAR;
    static final int INT_CALENDARRULE = Enum.INT_CALENDARRULE;
    static final int INT_CAMPAIGN = Enum.INT_CAMPAIGN;
    static final int INT_CAMPAIGNACTIVITY = Enum.INT_CAMPAIGNACTIVITY;
    static final int INT_CAMPAIGNACTIVITYITEM = Enum.INT_CAMPAIGNACTIVITYITEM;
    static final int INT_CAMPAIGNITEM = Enum.INT_CAMPAIGNITEM;
    static final int INT_CAMPAIGNRESPONSE = Enum.INT_CAMPAIGNRESPONSE;
    static final int INT_COLUMNMAPPING = Enum.INT_COLUMNMAPPING;
    static final int INT_COMPETITOR = Enum.INT_COMPETITOR;
    static final int INT_CONSTRAINTBASEDGROUP = Enum.INT_CONSTRAINTBASEDGROUP;
    static final int INT_CONTACT = Enum.INT_CONTACT;
    static final int INT_CONTRACT = Enum.INT_CONTRACT;
    static final int INT_CONTRACTDETAIL = Enum.INT_CONTRACTDETAIL;
    static final int INT_CONTRACTTEMPLATE = Enum.INT_CONTRACTTEMPLATE;
    static final int INT_CUSTOMERADDRESS = Enum.INT_CUSTOMERADDRESS;
    static final int INT_CUSTOMEROPPORTUNITYROLE = Enum.INT_CUSTOMEROPPORTUNITYROLE;
    static final int INT_CUSTOMERRELATIONSHIP = Enum.INT_CUSTOMERRELATIONSHIP;
    static final int INT_DISCOUNT = Enum.INT_DISCOUNT;
    static final int INT_DISCOUNTTYPE = Enum.INT_DISCOUNTTYPE;
    static final int INT_DISPLAYSTRING = Enum.INT_DISPLAYSTRING;
    static final int INT_DUPLICATERECORD = Enum.INT_DUPLICATERECORD;
    static final int INT_DUPLICATERULE = Enum.INT_DUPLICATERULE;
    static final int INT_DUPLICATERULECONDITION = Enum.INT_DUPLICATERULECONDITION;
    static final int INT_EMAIL = Enum.INT_EMAIL;
    static final int INT_ENTITYMAP = Enum.INT_ENTITYMAP;
    static final int INT_EQUIPMENT = Enum.INT_EQUIPMENT;
    static final int INT_FAX = Enum.INT_FAX;
    static final int INT_FIXEDMONTHLYFISCALCALENDAR = Enum.INT_FIXEDMONTHLYFISCALCALENDAR;
    static final int INT_IMPORT = Enum.INT_IMPORT;
    static final int INT_IMPORTDATA = Enum.INT_IMPORTDATA;
    static final int INT_IMPORTFILE = Enum.INT_IMPORTFILE;
    static final int INT_IMPORTJOB = Enum.INT_IMPORTJOB;
    static final int INT_IMPORTLOG = Enum.INT_IMPORTLOG;
    static final int INT_IMPORTMAP = Enum.INT_IMPORTMAP;
    static final int INT_INCIDENT = Enum.INT_INCIDENT;
    static final int INT_INCIDENTRESOLUTION = Enum.INT_INCIDENTRESOLUTION;
    static final int INT_INVOICE = Enum.INT_INVOICE;
    static final int INT_INVOICEDETAIL = Enum.INT_INVOICEDETAIL;
    static final int INT_ISVCONFIG = Enum.INT_ISVCONFIG;
    static final int INT_KBARTICLE = Enum.INT_KBARTICLE;
    static final int INT_KBARTICLECOMMENT = Enum.INT_KBARTICLECOMMENT;
    static final int INT_KBARTICLETEMPLATE = Enum.INT_KBARTICLETEMPLATE;
    static final int INT_LEAD = Enum.INT_LEAD;
    static final int INT_LETTER = Enum.INT_LETTER;
    static final int INT_LICENSE = Enum.INT_LICENSE;
    static final int INT_LIST = Enum.INT_LIST;
    static final int INT_LISTMEMBER = Enum.INT_LISTMEMBER;
    static final int INT_LOOKUPMAPPING = Enum.INT_LOOKUPMAPPING;
    static final int INT_MAILMERGETEMPLATE = Enum.INT_MAILMERGETEMPLATE;
    static final int INT_MONTHLYFISCALCALENDAR = Enum.INT_MONTHLYFISCALCALENDAR;
    static final int INT_NOTIFICATION = Enum.INT_NOTIFICATION;
    static final int INT_OPPORTUNITY = Enum.INT_OPPORTUNITY;
    static final int INT_OPPORTUNITYCLOSE = Enum.INT_OPPORTUNITYCLOSE;
    static final int INT_OPPORTUNITYPRODUCT = Enum.INT_OPPORTUNITYPRODUCT;
    static final int INT_ORDERCLOSE = Enum.INT_ORDERCLOSE;
    static final int INT_ORGANIZATION = Enum.INT_ORGANIZATION;
    static final int INT_ORGANIZATIONUI = Enum.INT_ORGANIZATIONUI;
    static final int INT_OWNERMAPPING = Enum.INT_OWNERMAPPING;
    static final int INT_PHONECALL = Enum.INT_PHONECALL;
    static final int INT_PICKLISTMAPPING = Enum.INT_PICKLISTMAPPING;
    static final int INT_PLUGINASSEMBLY = Enum.INT_PLUGINASSEMBLY;
    static final int INT_PLUGINTYPE = Enum.INT_PLUGINTYPE;
    static final int INT_PRICELEVEL = Enum.INT_PRICELEVEL;
    static final int INT_PRIVILEGE = Enum.INT_PRIVILEGE;
    static final int INT_PRODUCT = Enum.INT_PRODUCT;
    static final int INT_PRODUCTPRICELEVEL = Enum.INT_PRODUCTPRICELEVEL;
    static final int INT_QUARTERLYFISCALCALENDAR = Enum.INT_QUARTERLYFISCALCALENDAR;
    static final int INT_QUEUE = Enum.INT_QUEUE;
    static final int INT_QUEUEITEM = Enum.INT_QUEUEITEM;
    static final int INT_QUOTE = Enum.INT_QUOTE;
    static final int INT_QUOTECLOSE = Enum.INT_QUOTECLOSE;
    static final int INT_QUOTEDETAIL = Enum.INT_QUOTEDETAIL;
    static final int INT_RELATIONSHIPROLE = Enum.INT_RELATIONSHIPROLE;
    static final int INT_RELATIONSHIPROLEMAP = Enum.INT_RELATIONSHIPROLEMAP;
    static final int INT_REPORT = Enum.INT_REPORT;
    static final int INT_REPORTCATEGORY = Enum.INT_REPORTCATEGORY;
    static final int INT_REPORTENTITY = Enum.INT_REPORTENTITY;
    static final int INT_REPORTLINK = Enum.INT_REPORTLINK;
    static final int INT_REPORTVISIBILITY = Enum.INT_REPORTVISIBILITY;
    static final int INT_RESOURCE = Enum.INT_RESOURCE;
    static final int INT_RESOURCEGROUP = Enum.INT_RESOURCEGROUP;
    static final int INT_RESOURCESPEC = Enum.INT_RESOURCESPEC;
    static final int INT_ROLE = Enum.INT_ROLE;
    static final int INT_SALESLITERATURE = Enum.INT_SALESLITERATURE;
    static final int INT_SALESLITERATUREITEM = Enum.INT_SALESLITERATUREITEM;
    static final int INT_SALESORDER = Enum.INT_SALESORDER;
    static final int INT_SALESORDERDETAIL = Enum.INT_SALESORDERDETAIL;
    static final int INT_SAVEDQUERY = Enum.INT_SAVEDQUERY;
    static final int INT_SDKMESSAGE = Enum.INT_SDKMESSAGE;
    static final int INT_SDKMESSAGEFILTER = Enum.INT_SDKMESSAGEFILTER;
    static final int INT_SDKMESSAGEPROCESSINGSTEP = Enum.INT_SDKMESSAGEPROCESSINGSTEP;
    static final int INT_SDKMESSAGEPROCESSINGSTEPIMAGE = Enum.INT_SDKMESSAGEPROCESSINGSTEPIMAGE;
    static final int INT_SDKMESSAGEPROCESSINGSTEPSECURECONFIG = Enum.INT_SDKMESSAGEPROCESSINGSTEPSECURECONFIG;
    static final int INT_SEMIANNUALFISCALCALENDAR = Enum.INT_SEMIANNUALFISCALCALENDAR;
    static final int INT_SERVICE = Enum.INT_SERVICE;
    static final int INT_SERVICEAPPOINTMENT = Enum.INT_SERVICEAPPOINTMENT;
    static final int INT_SITE = Enum.INT_SITE;
    static final int INT_SUBJECT = Enum.INT_SUBJECT;
    static final int INT_SUBSCRIPTION = Enum.INT_SUBSCRIPTION;
    static final int INT_SUBSCRIPTIONCLIENTS = Enum.INT_SUBSCRIPTIONCLIENTS;
    static final int INT_SUBSCRIPTIONSYNCINFO = Enum.INT_SUBSCRIPTIONSYNCINFO;
    static final int INT_SYSTEMUSER = Enum.INT_SYSTEMUSER;
    static final int INT_TASK = Enum.INT_TASK;
    static final int INT_TEAM = Enum.INT_TEAM;
    static final int INT_TEMPLATE = Enum.INT_TEMPLATE;
    static final int INT_TERRITORY = Enum.INT_TERRITORY;
    static final int INT_TIMEZONEDEFINITION = Enum.INT_TIMEZONEDEFINITION;
    static final int INT_TIMEZONELOCALIZEDNAME = Enum.INT_TIMEZONELOCALIZEDNAME;
    static final int INT_TIMEZONERULE = Enum.INT_TIMEZONERULE;
    static final int INT_TRANSACTIONCURRENCY = Enum.INT_TRANSACTIONCURRENCY;
    static final int INT_TRANSFORMATIONMAPPING = Enum.INT_TRANSFORMATIONMAPPING;
    static final int INT_TRANSFORMATIONPARAMETERMAPPING = Enum.INT_TRANSFORMATIONPARAMETERMAPPING;
    static final int INT_UOM = Enum.INT_UOM;
    static final int INT_UOMSCHEDULE = Enum.INT_UOMSCHEDULE;
    static final int INT_USERQUERY = Enum.INT_USERQUERY;
    static final int INT_USERSETTINGS = Enum.INT_USERSETTINGS;
    static final int INT_WEBWIZARD = Enum.INT_WEBWIZARD;
    static final int INT_WFPROCESS = Enum.INT_WFPROCESS;
    static final int INT_WFPROCESSINSTANCE = Enum.INT_WFPROCESSINSTANCE;
    static final int INT_WIZARDACCESSPRIVILEGE = Enum.INT_WIZARDACCESSPRIVILEGE;
    static final int INT_WIZARDPAGE = Enum.INT_WIZARDPAGE;
    static final int INT_WORKFLOW = Enum.INT_WORKFLOW;
    static final int INT_WORKFLOWDEPENDENCY = Enum.INT_WORKFLOWDEPENDENCY;
    static final int INT_WORKFLOWLOG = Enum.INT_WORKFLOWLOG;
    
    /**
     * Enumeration value class for com.microsoft.schemas.crm._2007.webservices.EntityName.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_NONE = 1;
        static final int INT_ACCOUNT = 2;
        static final int INT_ACTIVITYMIMEATTACHMENT = 3;
        static final int INT_ACTIVITYPARTY = 4;
        static final int INT_ACTIVITYPOINTER = 5;
        static final int INT_ANNOTATION = 6;
        static final int INT_ANNUALFISCALCALENDAR = 7;
        static final int INT_APPOINTMENT = 8;
        static final int INT_ASYNCOPERATION = 9;
        static final int INT_ATTRIBUTEMAP = 10;
        static final int INT_BULKDELETEFAILURE = 11;
        static final int INT_BULKDELETEOPERATION = 12;
        static final int INT_BULKOPERATION = 13;
        static final int INT_BULKOPERATIONLOG = 14;
        static final int INT_BUSINESSTASK = 15;
        static final int INT_BUSINESSUNIT = 16;
        static final int INT_BUSINESSUNITNEWSARTICLE = 17;
        static final int INT_CALENDAR = 18;
        static final int INT_CALENDARRULE = 19;
        static final int INT_CAMPAIGN = 20;
        static final int INT_CAMPAIGNACTIVITY = 21;
        static final int INT_CAMPAIGNACTIVITYITEM = 22;
        static final int INT_CAMPAIGNITEM = 23;
        static final int INT_CAMPAIGNRESPONSE = 24;
        static final int INT_COLUMNMAPPING = 25;
        static final int INT_COMPETITOR = 26;
        static final int INT_CONSTRAINTBASEDGROUP = 27;
        static final int INT_CONTACT = 28;
        static final int INT_CONTRACT = 29;
        static final int INT_CONTRACTDETAIL = 30;
        static final int INT_CONTRACTTEMPLATE = 31;
        static final int INT_CUSTOMERADDRESS = 32;
        static final int INT_CUSTOMEROPPORTUNITYROLE = 33;
        static final int INT_CUSTOMERRELATIONSHIP = 34;
        static final int INT_DISCOUNT = 35;
        static final int INT_DISCOUNTTYPE = 36;
        static final int INT_DISPLAYSTRING = 37;
        static final int INT_DUPLICATERECORD = 38;
        static final int INT_DUPLICATERULE = 39;
        static final int INT_DUPLICATERULECONDITION = 40;
        static final int INT_EMAIL = 41;
        static final int INT_ENTITYMAP = 42;
        static final int INT_EQUIPMENT = 43;
        static final int INT_FAX = 44;
        static final int INT_FIXEDMONTHLYFISCALCALENDAR = 45;
        static final int INT_IMPORT = 46;
        static final int INT_IMPORTDATA = 47;
        static final int INT_IMPORTFILE = 48;
        static final int INT_IMPORTJOB = 49;
        static final int INT_IMPORTLOG = 50;
        static final int INT_IMPORTMAP = 51;
        static final int INT_INCIDENT = 52;
        static final int INT_INCIDENTRESOLUTION = 53;
        static final int INT_INVOICE = 54;
        static final int INT_INVOICEDETAIL = 55;
        static final int INT_ISVCONFIG = 56;
        static final int INT_KBARTICLE = 57;
        static final int INT_KBARTICLECOMMENT = 58;
        static final int INT_KBARTICLETEMPLATE = 59;
        static final int INT_LEAD = 60;
        static final int INT_LETTER = 61;
        static final int INT_LICENSE = 62;
        static final int INT_LIST = 63;
        static final int INT_LISTMEMBER = 64;
        static final int INT_LOOKUPMAPPING = 65;
        static final int INT_MAILMERGETEMPLATE = 66;
        static final int INT_MONTHLYFISCALCALENDAR = 67;
        static final int INT_NOTIFICATION = 68;
        static final int INT_OPPORTUNITY = 69;
        static final int INT_OPPORTUNITYCLOSE = 70;
        static final int INT_OPPORTUNITYPRODUCT = 71;
        static final int INT_ORDERCLOSE = 72;
        static final int INT_ORGANIZATION = 73;
        static final int INT_ORGANIZATIONUI = 74;
        static final int INT_OWNERMAPPING = 75;
        static final int INT_PHONECALL = 76;
        static final int INT_PICKLISTMAPPING = 77;
        static final int INT_PLUGINASSEMBLY = 78;
        static final int INT_PLUGINTYPE = 79;
        static final int INT_PRICELEVEL = 80;
        static final int INT_PRIVILEGE = 81;
        static final int INT_PRODUCT = 82;
        static final int INT_PRODUCTPRICELEVEL = 83;
        static final int INT_QUARTERLYFISCALCALENDAR = 84;
        static final int INT_QUEUE = 85;
        static final int INT_QUEUEITEM = 86;
        static final int INT_QUOTE = 87;
        static final int INT_QUOTECLOSE = 88;
        static final int INT_QUOTEDETAIL = 89;
        static final int INT_RELATIONSHIPROLE = 90;
        static final int INT_RELATIONSHIPROLEMAP = 91;
        static final int INT_REPORT = 92;
        static final int INT_REPORTCATEGORY = 93;
        static final int INT_REPORTENTITY = 94;
        static final int INT_REPORTLINK = 95;
        static final int INT_REPORTVISIBILITY = 96;
        static final int INT_RESOURCE = 97;
        static final int INT_RESOURCEGROUP = 98;
        static final int INT_RESOURCESPEC = 99;
        static final int INT_ROLE = 100;
        static final int INT_SALESLITERATURE = 101;
        static final int INT_SALESLITERATUREITEM = 102;
        static final int INT_SALESORDER = 103;
        static final int INT_SALESORDERDETAIL = 104;
        static final int INT_SAVEDQUERY = 105;
        static final int INT_SDKMESSAGE = 106;
        static final int INT_SDKMESSAGEFILTER = 107;
        static final int INT_SDKMESSAGEPROCESSINGSTEP = 108;
        static final int INT_SDKMESSAGEPROCESSINGSTEPIMAGE = 109;
        static final int INT_SDKMESSAGEPROCESSINGSTEPSECURECONFIG = 110;
        static final int INT_SEMIANNUALFISCALCALENDAR = 111;
        static final int INT_SERVICE = 112;
        static final int INT_SERVICEAPPOINTMENT = 113;
        static final int INT_SITE = 114;
        static final int INT_SUBJECT = 115;
        static final int INT_SUBSCRIPTION = 116;
        static final int INT_SUBSCRIPTIONCLIENTS = 117;
        static final int INT_SUBSCRIPTIONSYNCINFO = 118;
        static final int INT_SYSTEMUSER = 119;
        static final int INT_TASK = 120;
        static final int INT_TEAM = 121;
        static final int INT_TEMPLATE = 122;
        static final int INT_TERRITORY = 123;
        static final int INT_TIMEZONEDEFINITION = 124;
        static final int INT_TIMEZONELOCALIZEDNAME = 125;
        static final int INT_TIMEZONERULE = 126;
        static final int INT_TRANSACTIONCURRENCY = 127;
        static final int INT_TRANSFORMATIONMAPPING = 128;
        static final int INT_TRANSFORMATIONPARAMETERMAPPING = 129;
        static final int INT_UOM = 130;
        static final int INT_UOMSCHEDULE = 131;
        static final int INT_USERQUERY = 132;
        static final int INT_USERSETTINGS = 133;
        static final int INT_WEBWIZARD = 134;
        static final int INT_WFPROCESS = 135;
        static final int INT_WFPROCESSINSTANCE = 136;
        static final int INT_WIZARDACCESSPRIVILEGE = 137;
        static final int INT_WIZARDPAGE = 138;
        static final int INT_WORKFLOW = 139;
        static final int INT_WORKFLOWDEPENDENCY = 140;
        static final int INT_WORKFLOWLOG = 141;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("account", INT_ACCOUNT),
                new Enum("activitymimeattachment", INT_ACTIVITYMIMEATTACHMENT),
                new Enum("activityparty", INT_ACTIVITYPARTY),
                new Enum("activitypointer", INT_ACTIVITYPOINTER),
                new Enum("annotation", INT_ANNOTATION),
                new Enum("annualfiscalcalendar", INT_ANNUALFISCALCALENDAR),
                new Enum("appointment", INT_APPOINTMENT),
                new Enum("asyncoperation", INT_ASYNCOPERATION),
                new Enum("attributemap", INT_ATTRIBUTEMAP),
                new Enum("bulkdeletefailure", INT_BULKDELETEFAILURE),
                new Enum("bulkdeleteoperation", INT_BULKDELETEOPERATION),
                new Enum("bulkoperation", INT_BULKOPERATION),
                new Enum("bulkoperationlog", INT_BULKOPERATIONLOG),
                new Enum("businesstask", INT_BUSINESSTASK),
                new Enum("businessunit", INT_BUSINESSUNIT),
                new Enum("businessunitnewsarticle", INT_BUSINESSUNITNEWSARTICLE),
                new Enum("calendar", INT_CALENDAR),
                new Enum("calendarrule", INT_CALENDARRULE),
                new Enum("campaign", INT_CAMPAIGN),
                new Enum("campaignactivity", INT_CAMPAIGNACTIVITY),
                new Enum("campaignactivityitem", INT_CAMPAIGNACTIVITYITEM),
                new Enum("campaignitem", INT_CAMPAIGNITEM),
                new Enum("campaignresponse", INT_CAMPAIGNRESPONSE),
                new Enum("columnmapping", INT_COLUMNMAPPING),
                new Enum("competitor", INT_COMPETITOR),
                new Enum("constraintbasedgroup", INT_CONSTRAINTBASEDGROUP),
                new Enum("contact", INT_CONTACT),
                new Enum("contract", INT_CONTRACT),
                new Enum("contractdetail", INT_CONTRACTDETAIL),
                new Enum("contracttemplate", INT_CONTRACTTEMPLATE),
                new Enum("customeraddress", INT_CUSTOMERADDRESS),
                new Enum("customeropportunityrole", INT_CUSTOMEROPPORTUNITYROLE),
                new Enum("customerrelationship", INT_CUSTOMERRELATIONSHIP),
                new Enum("discount", INT_DISCOUNT),
                new Enum("discounttype", INT_DISCOUNTTYPE),
                new Enum("displaystring", INT_DISPLAYSTRING),
                new Enum("duplicaterecord", INT_DUPLICATERECORD),
                new Enum("duplicaterule", INT_DUPLICATERULE),
                new Enum("duplicaterulecondition", INT_DUPLICATERULECONDITION),
                new Enum("email", INT_EMAIL),
                new Enum("entitymap", INT_ENTITYMAP),
                new Enum("equipment", INT_EQUIPMENT),
                new Enum("fax", INT_FAX),
                new Enum("fixedmonthlyfiscalcalendar", INT_FIXEDMONTHLYFISCALCALENDAR),
                new Enum("import", INT_IMPORT),
                new Enum("importdata", INT_IMPORTDATA),
                new Enum("importfile", INT_IMPORTFILE),
                new Enum("importjob", INT_IMPORTJOB),
                new Enum("importlog", INT_IMPORTLOG),
                new Enum("importmap", INT_IMPORTMAP),
                new Enum("incident", INT_INCIDENT),
                new Enum("incidentresolution", INT_INCIDENTRESOLUTION),
                new Enum("invoice", INT_INVOICE),
                new Enum("invoicedetail", INT_INVOICEDETAIL),
                new Enum("isvconfig", INT_ISVCONFIG),
                new Enum("kbarticle", INT_KBARTICLE),
                new Enum("kbarticlecomment", INT_KBARTICLECOMMENT),
                new Enum("kbarticletemplate", INT_KBARTICLETEMPLATE),
                new Enum("lead", INT_LEAD),
                new Enum("letter", INT_LETTER),
                new Enum("license", INT_LICENSE),
                new Enum("list", INT_LIST),
                new Enum("listmember", INT_LISTMEMBER),
                new Enum("lookupmapping", INT_LOOKUPMAPPING),
                new Enum("mailmergetemplate", INT_MAILMERGETEMPLATE),
                new Enum("monthlyfiscalcalendar", INT_MONTHLYFISCALCALENDAR),
                new Enum("notification", INT_NOTIFICATION),
                new Enum("opportunity", INT_OPPORTUNITY),
                new Enum("opportunityclose", INT_OPPORTUNITYCLOSE),
                new Enum("opportunityproduct", INT_OPPORTUNITYPRODUCT),
                new Enum("orderclose", INT_ORDERCLOSE),
                new Enum("organization", INT_ORGANIZATION),
                new Enum("organizationui", INT_ORGANIZATIONUI),
                new Enum("ownermapping", INT_OWNERMAPPING),
                new Enum("phonecall", INT_PHONECALL),
                new Enum("picklistmapping", INT_PICKLISTMAPPING),
                new Enum("pluginassembly", INT_PLUGINASSEMBLY),
                new Enum("plugintype", INT_PLUGINTYPE),
                new Enum("pricelevel", INT_PRICELEVEL),
                new Enum("privilege", INT_PRIVILEGE),
                new Enum("product", INT_PRODUCT),
                new Enum("productpricelevel", INT_PRODUCTPRICELEVEL),
                new Enum("quarterlyfiscalcalendar", INT_QUARTERLYFISCALCALENDAR),
                new Enum("queue", INT_QUEUE),
                new Enum("queueitem", INT_QUEUEITEM),
                new Enum("quote", INT_QUOTE),
                new Enum("quoteclose", INT_QUOTECLOSE),
                new Enum("quotedetail", INT_QUOTEDETAIL),
                new Enum("relationshiprole", INT_RELATIONSHIPROLE),
                new Enum("relationshiprolemap", INT_RELATIONSHIPROLEMAP),
                new Enum("report", INT_REPORT),
                new Enum("reportcategory", INT_REPORTCATEGORY),
                new Enum("reportentity", INT_REPORTENTITY),
                new Enum("reportlink", INT_REPORTLINK),
                new Enum("reportvisibility", INT_REPORTVISIBILITY),
                new Enum("resource", INT_RESOURCE),
                new Enum("resourcegroup", INT_RESOURCEGROUP),
                new Enum("resourcespec", INT_RESOURCESPEC),
                new Enum("role", INT_ROLE),
                new Enum("salesliterature", INT_SALESLITERATURE),
                new Enum("salesliteratureitem", INT_SALESLITERATUREITEM),
                new Enum("salesorder", INT_SALESORDER),
                new Enum("salesorderdetail", INT_SALESORDERDETAIL),
                new Enum("savedquery", INT_SAVEDQUERY),
                new Enum("sdkmessage", INT_SDKMESSAGE),
                new Enum("sdkmessagefilter", INT_SDKMESSAGEFILTER),
                new Enum("sdkmessageprocessingstep", INT_SDKMESSAGEPROCESSINGSTEP),
                new Enum("sdkmessageprocessingstepimage", INT_SDKMESSAGEPROCESSINGSTEPIMAGE),
                new Enum("sdkmessageprocessingstepsecureconfig", INT_SDKMESSAGEPROCESSINGSTEPSECURECONFIG),
                new Enum("semiannualfiscalcalendar", INT_SEMIANNUALFISCALCALENDAR),
                new Enum("service", INT_SERVICE),
                new Enum("serviceappointment", INT_SERVICEAPPOINTMENT),
                new Enum("site", INT_SITE),
                new Enum("subject", INT_SUBJECT),
                new Enum("subscription", INT_SUBSCRIPTION),
                new Enum("subscriptionclients", INT_SUBSCRIPTIONCLIENTS),
                new Enum("subscriptionsyncinfo", INT_SUBSCRIPTIONSYNCINFO),
                new Enum("systemuser", INT_SYSTEMUSER),
                new Enum("task", INT_TASK),
                new Enum("team", INT_TEAM),
                new Enum("template", INT_TEMPLATE),
                new Enum("territory", INT_TERRITORY),
                new Enum("timezonedefinition", INT_TIMEZONEDEFINITION),
                new Enum("timezonelocalizedname", INT_TIMEZONELOCALIZEDNAME),
                new Enum("timezonerule", INT_TIMEZONERULE),
                new Enum("transactioncurrency", INT_TRANSACTIONCURRENCY),
                new Enum("transformationmapping", INT_TRANSFORMATIONMAPPING),
                new Enum("transformationparametermapping", INT_TRANSFORMATIONPARAMETERMAPPING),
                new Enum("uom", INT_UOM),
                new Enum("uomschedule", INT_UOMSCHEDULE),
                new Enum("userquery", INT_USERQUERY),
                new Enum("usersettings", INT_USERSETTINGS),
                new Enum("webwizard", INT_WEBWIZARD),
                new Enum("wfprocess", INT_WFPROCESS),
                new Enum("wfprocessinstance", INT_WFPROCESSINSTANCE),
                new Enum("wizardaccessprivilege", INT_WIZARDACCESSPRIVILEGE),
                new Enum("wizardpage", INT_WIZARDPAGE),
                new Enum("workflow", INT_WORKFLOW),
                new Enum("workflowdependency", INT_WORKFLOWDEPENDENCY),
                new Enum("workflowlog", INT_WORKFLOWLOG),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.EntityName newValue(java.lang.Object obj) {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) type.newValue( obj ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.EntityName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.EntityName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
