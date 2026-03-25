/*
 * XML Type:  report
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Report
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML report(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Report extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Report.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("report9db2type");
    
    /**
     * Gets the "bodybinary" element
     */
    java.lang.String getBodybinary();
    
    /**
     * Gets (as xml) the "bodybinary" element
     */
    org.apache.xmlbeans.XmlString xgetBodybinary();
    
    /**
     * True if has "bodybinary" element
     */
    boolean isSetBodybinary();
    
    /**
     * Sets the "bodybinary" element
     */
    void setBodybinary(java.lang.String bodybinary);
    
    /**
     * Sets (as xml) the "bodybinary" element
     */
    void xsetBodybinary(org.apache.xmlbeans.XmlString bodybinary);
    
    /**
     * Unsets the "bodybinary" element
     */
    void unsetBodybinary();
    
    /**
     * Gets the "bodytext" element
     */
    java.lang.String getBodytext();
    
    /**
     * Gets (as xml) the "bodytext" element
     */
    org.apache.xmlbeans.XmlString xgetBodytext();
    
    /**
     * True if has "bodytext" element
     */
    boolean isSetBodytext();
    
    /**
     * Sets the "bodytext" element
     */
    void setBodytext(java.lang.String bodytext);
    
    /**
     * Sets (as xml) the "bodytext" element
     */
    void xsetBodytext(org.apache.xmlbeans.XmlString bodytext);
    
    /**
     * Unsets the "bodytext" element
     */
    void unsetBodytext();
    
    /**
     * Gets the "bodyurl" element
     */
    java.lang.String getBodyurl();
    
    /**
     * Gets (as xml) the "bodyurl" element
     */
    org.apache.xmlbeans.XmlString xgetBodyurl();
    
    /**
     * True if has "bodyurl" element
     */
    boolean isSetBodyurl();
    
    /**
     * Sets the "bodyurl" element
     */
    void setBodyurl(java.lang.String bodyurl);
    
    /**
     * Sets (as xml) the "bodyurl" element
     */
    void xsetBodyurl(org.apache.xmlbeans.XmlString bodyurl);
    
    /**
     * Unsets the "bodyurl" element
     */
    void unsetBodyurl();
    
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
     * Gets the "customreportxml" element
     */
    java.lang.String getCustomreportxml();
    
    /**
     * Gets (as xml) the "customreportxml" element
     */
    org.apache.xmlbeans.XmlString xgetCustomreportxml();
    
    /**
     * True if has "customreportxml" element
     */
    boolean isSetCustomreportxml();
    
    /**
     * Sets the "customreportxml" element
     */
    void setCustomreportxml(java.lang.String customreportxml);
    
    /**
     * Sets (as xml) the "customreportxml" element
     */
    void xsetCustomreportxml(org.apache.xmlbeans.XmlString customreportxml);
    
    /**
     * Unsets the "customreportxml" element
     */
    void unsetCustomreportxml();
    
    /**
     * Gets the "defaultfilter" element
     */
    java.lang.String getDefaultfilter();
    
    /**
     * Gets (as xml) the "defaultfilter" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultfilter();
    
    /**
     * True if has "defaultfilter" element
     */
    boolean isSetDefaultfilter();
    
    /**
     * Sets the "defaultfilter" element
     */
    void setDefaultfilter(java.lang.String defaultfilter);
    
    /**
     * Sets (as xml) the "defaultfilter" element
     */
    void xsetDefaultfilter(org.apache.xmlbeans.XmlString defaultfilter);
    
    /**
     * Unsets the "defaultfilter" element
     */
    void unsetDefaultfilter();
    
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
     * Gets the "filename" element
     */
    java.lang.String getFilename();
    
    /**
     * Gets (as xml) the "filename" element
     */
    org.apache.xmlbeans.XmlString xgetFilename();
    
    /**
     * True if has "filename" element
     */
    boolean isSetFilename();
    
    /**
     * Sets the "filename" element
     */
    void setFilename(java.lang.String filename);
    
    /**
     * Sets (as xml) the "filename" element
     */
    void xsetFilename(org.apache.xmlbeans.XmlString filename);
    
    /**
     * Unsets the "filename" element
     */
    void unsetFilename();
    
    /**
     * Gets the "filesize" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getFilesize();
    
    /**
     * True if has "filesize" element
     */
    boolean isSetFilesize();
    
    /**
     * Sets the "filesize" element
     */
    void setFilesize(com.microsoft.schemas.crm._2006.webservices.CrmNumber filesize);
    
    /**
     * Appends and returns a new empty "filesize" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFilesize();
    
    /**
     * Unsets the "filesize" element
     */
    void unsetFilesize();
    
    /**
     * Gets the "iscustomreport" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIscustomreport();
    
    /**
     * True if has "iscustomreport" element
     */
    boolean isSetIscustomreport();
    
    /**
     * Sets the "iscustomreport" element
     */
    void setIscustomreport(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iscustomreport);
    
    /**
     * Appends and returns a new empty "iscustomreport" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIscustomreport();
    
    /**
     * Unsets the "iscustomreport" element
     */
    void unsetIscustomreport();
    
    /**
     * Gets the "ispersonal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIspersonal();
    
    /**
     * True if has "ispersonal" element
     */
    boolean isSetIspersonal();
    
    /**
     * Sets the "ispersonal" element
     */
    void setIspersonal(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ispersonal);
    
    /**
     * Appends and returns a new empty "ispersonal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIspersonal();
    
    /**
     * Unsets the "ispersonal" element
     */
    void unsetIspersonal();
    
    /**
     * Gets the "isscheduledreport" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsscheduledreport();
    
    /**
     * True if has "isscheduledreport" element
     */
    boolean isSetIsscheduledreport();
    
    /**
     * Sets the "isscheduledreport" element
     */
    void setIsscheduledreport(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isscheduledreport);
    
    /**
     * Appends and returns a new empty "isscheduledreport" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsscheduledreport();
    
    /**
     * Unsets the "isscheduledreport" element
     */
    void unsetIsscheduledreport();
    
    /**
     * Gets the "languagecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getLanguagecode();
    
    /**
     * True if has "languagecode" element
     */
    boolean isSetLanguagecode();
    
    /**
     * Sets the "languagecode" element
     */
    void setLanguagecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber languagecode);
    
    /**
     * Appends and returns a new empty "languagecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLanguagecode();
    
    /**
     * Unsets the "languagecode" element
     */
    void unsetLanguagecode();
    
    /**
     * Gets the "mimetype" element
     */
    java.lang.String getMimetype();
    
    /**
     * Gets (as xml) the "mimetype" element
     */
    org.apache.xmlbeans.XmlString xgetMimetype();
    
    /**
     * True if has "mimetype" element
     */
    boolean isSetMimetype();
    
    /**
     * Sets the "mimetype" element
     */
    void setMimetype(java.lang.String mimetype);
    
    /**
     * Sets (as xml) the "mimetype" element
     */
    void xsetMimetype(org.apache.xmlbeans.XmlString mimetype);
    
    /**
     * Unsets the "mimetype" element
     */
    void unsetMimetype();
    
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
     * Gets the "parentreportid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getParentreportid();
    
    /**
     * True if has "parentreportid" element
     */
    boolean isSetParentreportid();
    
    /**
     * Sets the "parentreportid" element
     */
    void setParentreportid(com.microsoft.schemas.crm._2006.webservices.Lookup parentreportid);
    
    /**
     * Appends and returns a new empty "parentreportid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentreportid();
    
    /**
     * Unsets the "parentreportid" element
     */
    void unsetParentreportid();
    
    /**
     * Gets the "queryinfo" element
     */
    java.lang.String getQueryinfo();
    
    /**
     * Gets (as xml) the "queryinfo" element
     */
    org.apache.xmlbeans.XmlString xgetQueryinfo();
    
    /**
     * True if has "queryinfo" element
     */
    boolean isSetQueryinfo();
    
    /**
     * Sets the "queryinfo" element
     */
    void setQueryinfo(java.lang.String queryinfo);
    
    /**
     * Sets (as xml) the "queryinfo" element
     */
    void xsetQueryinfo(org.apache.xmlbeans.XmlString queryinfo);
    
    /**
     * Unsets the "queryinfo" element
     */
    void unsetQueryinfo();
    
    /**
     * Gets the "reportid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getReportid();
    
    /**
     * True if has "reportid" element
     */
    boolean isSetReportid();
    
    /**
     * Sets the "reportid" element
     */
    void setReportid(com.microsoft.schemas.crm._2006.webservices.Key reportid);
    
    /**
     * Appends and returns a new empty "reportid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewReportid();
    
    /**
     * Unsets the "reportid" element
     */
    void unsetReportid();
    
    /**
     * Gets the "reporttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getReporttypecode();
    
    /**
     * True if has "reporttypecode" element
     */
    boolean isSetReporttypecode();
    
    /**
     * Sets the "reporttypecode" element
     */
    void setReporttypecode(com.microsoft.schemas.crm._2006.webservices.Picklist reporttypecode);
    
    /**
     * Appends and returns a new empty "reporttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewReporttypecode();
    
    /**
     * Unsets the "reporttypecode" element
     */
    void unsetReporttypecode();
    
    /**
     * Gets the "schedulexml" element
     */
    java.lang.String getSchedulexml();
    
    /**
     * Gets (as xml) the "schedulexml" element
     */
    org.apache.xmlbeans.XmlString xgetSchedulexml();
    
    /**
     * True if has "schedulexml" element
     */
    boolean isSetSchedulexml();
    
    /**
     * Sets the "schedulexml" element
     */
    void setSchedulexml(java.lang.String schedulexml);
    
    /**
     * Sets (as xml) the "schedulexml" element
     */
    void xsetSchedulexml(org.apache.xmlbeans.XmlString schedulexml);
    
    /**
     * Unsets the "schedulexml" element
     */
    void unsetSchedulexml();
    
    /**
     * Gets the "signaturedate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getSignaturedate();
    
    /**
     * True if has "signaturedate" element
     */
    boolean isSetSignaturedate();
    
    /**
     * Sets the "signaturedate" element
     */
    void setSignaturedate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime signaturedate);
    
    /**
     * Appends and returns a new empty "signaturedate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewSignaturedate();
    
    /**
     * Unsets the "signaturedate" element
     */
    void unsetSignaturedate();
    
    /**
     * Gets the "signatureid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSignatureid();
    
    /**
     * True if has "signatureid" element
     */
    boolean isSetSignatureid();
    
    /**
     * Sets the "signatureid" element
     */
    void setSignatureid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier signatureid);
    
    /**
     * Appends and returns a new empty "signatureid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSignatureid();
    
    /**
     * Unsets the "signatureid" element
     */
    void unsetSignatureid();
    
    /**
     * Gets the "signaturelcid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getSignaturelcid();
    
    /**
     * True if has "signaturelcid" element
     */
    boolean isSetSignaturelcid();
    
    /**
     * Sets the "signaturelcid" element
     */
    void setSignaturelcid(com.microsoft.schemas.crm._2006.webservices.CrmNumber signaturelcid);
    
    /**
     * Appends and returns a new empty "signaturelcid" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSignaturelcid();
    
    /**
     * Unsets the "signaturelcid" element
     */
    void unsetSignaturelcid();
    
    /**
     * Gets the "signaturemajorversion" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getSignaturemajorversion();
    
    /**
     * True if has "signaturemajorversion" element
     */
    boolean isSetSignaturemajorversion();
    
    /**
     * Sets the "signaturemajorversion" element
     */
    void setSignaturemajorversion(com.microsoft.schemas.crm._2006.webservices.CrmNumber signaturemajorversion);
    
    /**
     * Appends and returns a new empty "signaturemajorversion" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSignaturemajorversion();
    
    /**
     * Unsets the "signaturemajorversion" element
     */
    void unsetSignaturemajorversion();
    
    /**
     * Gets the "signatureminorversion" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getSignatureminorversion();
    
    /**
     * True if has "signatureminorversion" element
     */
    boolean isSetSignatureminorversion();
    
    /**
     * Sets the "signatureminorversion" element
     */
    void setSignatureminorversion(com.microsoft.schemas.crm._2006.webservices.CrmNumber signatureminorversion);
    
    /**
     * Appends and returns a new empty "signatureminorversion" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSignatureminorversion();
    
    /**
     * Unsets the "signatureminorversion" element
     */
    void unsetSignatureminorversion();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Report newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Report parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Report) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
