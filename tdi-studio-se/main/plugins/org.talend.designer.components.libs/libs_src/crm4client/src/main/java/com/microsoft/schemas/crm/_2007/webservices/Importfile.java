/*
 * XML Type:  importfile
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Importfile
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML importfile(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Importfile extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Importfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("importfilee55ftype");
    
    /**
     * Gets the "additionalheaderrow" element
     */
    java.lang.String getAdditionalheaderrow();
    
    /**
     * Gets (as xml) the "additionalheaderrow" element
     */
    org.apache.xmlbeans.XmlString xgetAdditionalheaderrow();
    
    /**
     * True if has "additionalheaderrow" element
     */
    boolean isSetAdditionalheaderrow();
    
    /**
     * Sets the "additionalheaderrow" element
     */
    void setAdditionalheaderrow(java.lang.String additionalheaderrow);
    
    /**
     * Sets (as xml) the "additionalheaderrow" element
     */
    void xsetAdditionalheaderrow(org.apache.xmlbeans.XmlString additionalheaderrow);
    
    /**
     * Unsets the "additionalheaderrow" element
     */
    void unsetAdditionalheaderrow();
    
    /**
     * Gets the "completedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCompletedon();
    
    /**
     * True if has "completedon" element
     */
    boolean isSetCompletedon();
    
    /**
     * Sets the "completedon" element
     */
    void setCompletedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime completedon);
    
    /**
     * Appends and returns a new empty "completedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCompletedon();
    
    /**
     * Unsets the "completedon" element
     */
    void unsetCompletedon();
    
    /**
     * Gets the "content" element
     */
    java.lang.String getContent();
    
    /**
     * Gets (as xml) the "content" element
     */
    org.apache.xmlbeans.XmlString xgetContent();
    
    /**
     * True if has "content" element
     */
    boolean isSetContent();
    
    /**
     * Sets the "content" element
     */
    void setContent(java.lang.String content);
    
    /**
     * Sets (as xml) the "content" element
     */
    void xsetContent(org.apache.xmlbeans.XmlString content);
    
    /**
     * Unsets the "content" element
     */
    void unsetContent();
    
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
     * Gets the "datadelimitercode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getDatadelimitercode();
    
    /**
     * True if has "datadelimitercode" element
     */
    boolean isSetDatadelimitercode();
    
    /**
     * Sets the "datadelimitercode" element
     */
    void setDatadelimitercode(com.microsoft.schemas.crm._2006.webservices.Picklist datadelimitercode);
    
    /**
     * Appends and returns a new empty "datadelimitercode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewDatadelimitercode();
    
    /**
     * Unsets the "datadelimitercode" element
     */
    void unsetDatadelimitercode();
    
    /**
     * Gets the "enableduplicatedetection" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getEnableduplicatedetection();
    
    /**
     * True if has "enableduplicatedetection" element
     */
    boolean isSetEnableduplicatedetection();
    
    /**
     * Sets the "enableduplicatedetection" element
     */
    void setEnableduplicatedetection(com.microsoft.schemas.crm._2006.webservices.CrmBoolean enableduplicatedetection);
    
    /**
     * Appends and returns a new empty "enableduplicatedetection" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewEnableduplicatedetection();
    
    /**
     * Unsets the "enableduplicatedetection" element
     */
    void unsetEnableduplicatedetection();
    
    /**
     * Gets the "failurecount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getFailurecount();
    
    /**
     * True if has "failurecount" element
     */
    boolean isSetFailurecount();
    
    /**
     * Sets the "failurecount" element
     */
    void setFailurecount(com.microsoft.schemas.crm._2006.webservices.CrmNumber failurecount);
    
    /**
     * Appends and returns a new empty "failurecount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFailurecount();
    
    /**
     * Unsets the "failurecount" element
     */
    void unsetFailurecount();
    
    /**
     * Gets the "fielddelimitercode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getFielddelimitercode();
    
    /**
     * True if has "fielddelimitercode" element
     */
    boolean isSetFielddelimitercode();
    
    /**
     * Sets the "fielddelimitercode" element
     */
    void setFielddelimitercode(com.microsoft.schemas.crm._2006.webservices.Picklist fielddelimitercode);
    
    /**
     * Appends and returns a new empty "fielddelimitercode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewFielddelimitercode();
    
    /**
     * Unsets the "fielddelimitercode" element
     */
    void unsetFielddelimitercode();
    
    /**
     * Gets the "headerrow" element
     */
    java.lang.String getHeaderrow();
    
    /**
     * Gets (as xml) the "headerrow" element
     */
    org.apache.xmlbeans.XmlString xgetHeaderrow();
    
    /**
     * True if has "headerrow" element
     */
    boolean isSetHeaderrow();
    
    /**
     * Sets the "headerrow" element
     */
    void setHeaderrow(java.lang.String headerrow);
    
    /**
     * Sets (as xml) the "headerrow" element
     */
    void xsetHeaderrow(org.apache.xmlbeans.XmlString headerrow);
    
    /**
     * Unsets the "headerrow" element
     */
    void unsetHeaderrow();
    
    /**
     * Gets the "importfileid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getImportfileid();
    
    /**
     * True if has "importfileid" element
     */
    boolean isSetImportfileid();
    
    /**
     * Sets the "importfileid" element
     */
    void setImportfileid(com.microsoft.schemas.crm._2006.webservices.Key importfileid);
    
    /**
     * Appends and returns a new empty "importfileid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewImportfileid();
    
    /**
     * Unsets the "importfileid" element
     */
    void unsetImportfileid();
    
    /**
     * Gets the "importid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getImportid();
    
    /**
     * True if has "importid" element
     */
    boolean isSetImportid();
    
    /**
     * Sets the "importid" element
     */
    void setImportid(com.microsoft.schemas.crm._2006.webservices.Lookup importid);
    
    /**
     * Appends and returns a new empty "importid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewImportid();
    
    /**
     * Unsets the "importid" element
     */
    void unsetImportid();
    
    /**
     * Gets the "importmapid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getImportmapid();
    
    /**
     * True if has "importmapid" element
     */
    boolean isSetImportmapid();
    
    /**
     * Sets the "importmapid" element
     */
    void setImportmapid(com.microsoft.schemas.crm._2006.webservices.Lookup importmapid);
    
    /**
     * Appends and returns a new empty "importmapid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewImportmapid();
    
    /**
     * Unsets the "importmapid" element
     */
    void unsetImportmapid();
    
    /**
     * Gets the "isfirstrowheader" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsfirstrowheader();
    
    /**
     * True if has "isfirstrowheader" element
     */
    boolean isSetIsfirstrowheader();
    
    /**
     * Sets the "isfirstrowheader" element
     */
    void setIsfirstrowheader(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isfirstrowheader);
    
    /**
     * Appends and returns a new empty "isfirstrowheader" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsfirstrowheader();
    
    /**
     * Unsets the "isfirstrowheader" element
     */
    void unsetIsfirstrowheader();
    
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
     * Gets the "parsedtablecolumnprefix" element
     */
    java.lang.String getParsedtablecolumnprefix();
    
    /**
     * Gets (as xml) the "parsedtablecolumnprefix" element
     */
    org.apache.xmlbeans.XmlString xgetParsedtablecolumnprefix();
    
    /**
     * True if has "parsedtablecolumnprefix" element
     */
    boolean isSetParsedtablecolumnprefix();
    
    /**
     * Sets the "parsedtablecolumnprefix" element
     */
    void setParsedtablecolumnprefix(java.lang.String parsedtablecolumnprefix);
    
    /**
     * Sets (as xml) the "parsedtablecolumnprefix" element
     */
    void xsetParsedtablecolumnprefix(org.apache.xmlbeans.XmlString parsedtablecolumnprefix);
    
    /**
     * Unsets the "parsedtablecolumnprefix" element
     */
    void unsetParsedtablecolumnprefix();
    
    /**
     * Gets the "parsedtablecolumnsnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getParsedtablecolumnsnumber();
    
    /**
     * True if has "parsedtablecolumnsnumber" element
     */
    boolean isSetParsedtablecolumnsnumber();
    
    /**
     * Sets the "parsedtablecolumnsnumber" element
     */
    void setParsedtablecolumnsnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber parsedtablecolumnsnumber);
    
    /**
     * Appends and returns a new empty "parsedtablecolumnsnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewParsedtablecolumnsnumber();
    
    /**
     * Unsets the "parsedtablecolumnsnumber" element
     */
    void unsetParsedtablecolumnsnumber();
    
    /**
     * Gets the "parsedtablename" element
     */
    java.lang.String getParsedtablename();
    
    /**
     * Gets (as xml) the "parsedtablename" element
     */
    org.apache.xmlbeans.XmlString xgetParsedtablename();
    
    /**
     * True if has "parsedtablename" element
     */
    boolean isSetParsedtablename();
    
    /**
     * Sets the "parsedtablename" element
     */
    void setParsedtablename(java.lang.String parsedtablename);
    
    /**
     * Sets (as xml) the "parsedtablename" element
     */
    void xsetParsedtablename(org.apache.xmlbeans.XmlString parsedtablename);
    
    /**
     * Unsets the "parsedtablename" element
     */
    void unsetParsedtablename();
    
    /**
     * Gets the "processcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getProcesscode();
    
    /**
     * True if has "processcode" element
     */
    boolean isSetProcesscode();
    
    /**
     * Sets the "processcode" element
     */
    void setProcesscode(com.microsoft.schemas.crm._2006.webservices.Picklist processcode);
    
    /**
     * Appends and returns a new empty "processcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewProcesscode();
    
    /**
     * Unsets the "processcode" element
     */
    void unsetProcesscode();
    
    /**
     * Gets the "processingstatus" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getProcessingstatus();
    
    /**
     * True if has "processingstatus" element
     */
    boolean isSetProcessingstatus();
    
    /**
     * Sets the "processingstatus" element
     */
    void setProcessingstatus(com.microsoft.schemas.crm._2006.webservices.Picklist processingstatus);
    
    /**
     * Appends and returns a new empty "processingstatus" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewProcessingstatus();
    
    /**
     * Unsets the "processingstatus" element
     */
    void unsetProcessingstatus();
    
    /**
     * Gets the "progresscounter" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getProgresscounter();
    
    /**
     * True if has "progresscounter" element
     */
    boolean isSetProgresscounter();
    
    /**
     * Sets the "progresscounter" element
     */
    void setProgresscounter(com.microsoft.schemas.crm._2006.webservices.CrmNumber progresscounter);
    
    /**
     * Appends and returns a new empty "progresscounter" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewProgresscounter();
    
    /**
     * Unsets the "progresscounter" element
     */
    void unsetProgresscounter();
    
    /**
     * Gets the "recordsownerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getRecordsownerid();
    
    /**
     * True if has "recordsownerid" element
     */
    boolean isSetRecordsownerid();
    
    /**
     * Sets the "recordsownerid" element
     */
    void setRecordsownerid(com.microsoft.schemas.crm._2006.webservices.Lookup recordsownerid);
    
    /**
     * Appends and returns a new empty "recordsownerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewRecordsownerid();
    
    /**
     * Unsets the "recordsownerid" element
     */
    void unsetRecordsownerid();
    
    /**
     * Gets the "size" element
     */
    java.lang.String getSize();
    
    /**
     * Gets (as xml) the "size" element
     */
    org.apache.xmlbeans.XmlString xgetSize();
    
    /**
     * True if has "size" element
     */
    boolean isSetSize();
    
    /**
     * Sets the "size" element
     */
    void setSize(java.lang.String size);
    
    /**
     * Sets (as xml) the "size" element
     */
    void xsetSize(org.apache.xmlbeans.XmlString size);
    
    /**
     * Unsets the "size" element
     */
    void unsetSize();
    
    /**
     * Gets the "source" element
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "source" element
     */
    org.apache.xmlbeans.XmlString xgetSource();
    
    /**
     * True if has "source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "source" element
     */
    void xsetSource(org.apache.xmlbeans.XmlString source);
    
    /**
     * Unsets the "source" element
     */
    void unsetSource();
    
    /**
     * Gets the "sourceentityname" element
     */
    java.lang.String getSourceentityname();
    
    /**
     * Gets (as xml) the "sourceentityname" element
     */
    org.apache.xmlbeans.XmlString xgetSourceentityname();
    
    /**
     * True if has "sourceentityname" element
     */
    boolean isSetSourceentityname();
    
    /**
     * Sets the "sourceentityname" element
     */
    void setSourceentityname(java.lang.String sourceentityname);
    
    /**
     * Sets (as xml) the "sourceentityname" element
     */
    void xsetSourceentityname(org.apache.xmlbeans.XmlString sourceentityname);
    
    /**
     * Unsets the "sourceentityname" element
     */
    void unsetSourceentityname();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo addNewStatecode();
    
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
     * Gets the "successcount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getSuccesscount();
    
    /**
     * True if has "successcount" element
     */
    boolean isSetSuccesscount();
    
    /**
     * Sets the "successcount" element
     */
    void setSuccesscount(com.microsoft.schemas.crm._2006.webservices.CrmNumber successcount);
    
    /**
     * Appends and returns a new empty "successcount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSuccesscount();
    
    /**
     * Unsets the "successcount" element
     */
    void unsetSuccesscount();
    
    /**
     * Gets the "targetentityname" element
     */
    java.lang.String getTargetentityname();
    
    /**
     * Gets (as xml) the "targetentityname" element
     */
    org.apache.xmlbeans.XmlString xgetTargetentityname();
    
    /**
     * True if has "targetentityname" element
     */
    boolean isSetTargetentityname();
    
    /**
     * Sets the "targetentityname" element
     */
    void setTargetentityname(java.lang.String targetentityname);
    
    /**
     * Sets (as xml) the "targetentityname" element
     */
    void xsetTargetentityname(org.apache.xmlbeans.XmlString targetentityname);
    
    /**
     * Unsets the "targetentityname" element
     */
    void unsetTargetentityname();
    
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
     * Gets the "totalcount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTotalcount();
    
    /**
     * True if has "totalcount" element
     */
    boolean isSetTotalcount();
    
    /**
     * Sets the "totalcount" element
     */
    void setTotalcount(com.microsoft.schemas.crm._2006.webservices.CrmNumber totalcount);
    
    /**
     * Appends and returns a new empty "totalcount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTotalcount();
    
    /**
     * Unsets the "totalcount" element
     */
    void unsetTotalcount();
    
    /**
     * Gets the "usesystemmap" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsesystemmap();
    
    /**
     * True if has "usesystemmap" element
     */
    boolean isSetUsesystemmap();
    
    /**
     * Sets the "usesystemmap" element
     */
    void setUsesystemmap(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usesystemmap);
    
    /**
     * Appends and returns a new empty "usesystemmap" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsesystemmap();
    
    /**
     * Unsets the "usesystemmap" element
     */
    void unsetUsesystemmap();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Importfile newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Importfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Importfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
