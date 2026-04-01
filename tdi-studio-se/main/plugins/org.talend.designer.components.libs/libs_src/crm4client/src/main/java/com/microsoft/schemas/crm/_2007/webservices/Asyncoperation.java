/*
 * XML Type:  asyncoperation
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Asyncoperation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML asyncoperation(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Asyncoperation extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Asyncoperation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("asyncoperationd229type");
    
    /**
     * Gets the "asyncoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getAsyncoperationid();
    
    /**
     * True if has "asyncoperationid" element
     */
    boolean isSetAsyncoperationid();
    
    /**
     * Sets the "asyncoperationid" element
     */
    void setAsyncoperationid(com.microsoft.schemas.crm._2006.webservices.Key asyncoperationid);
    
    /**
     * Appends and returns a new empty "asyncoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewAsyncoperationid();
    
    /**
     * Unsets the "asyncoperationid" element
     */
    void unsetAsyncoperationid();
    
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
     * Gets the "correlationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getCorrelationid();
    
    /**
     * True if has "correlationid" element
     */
    boolean isSetCorrelationid();
    
    /**
     * Sets the "correlationid" element
     */
    void setCorrelationid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier correlationid);
    
    /**
     * Appends and returns a new empty "correlationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewCorrelationid();
    
    /**
     * Unsets the "correlationid" element
     */
    void unsetCorrelationid();
    
    /**
     * Gets the "correlationupdatedtime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCorrelationupdatedtime();
    
    /**
     * True if has "correlationupdatedtime" element
     */
    boolean isSetCorrelationupdatedtime();
    
    /**
     * Sets the "correlationupdatedtime" element
     */
    void setCorrelationupdatedtime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime correlationupdatedtime);
    
    /**
     * Appends and returns a new empty "correlationupdatedtime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCorrelationupdatedtime();
    
    /**
     * Unsets the "correlationupdatedtime" element
     */
    void unsetCorrelationupdatedtime();
    
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
     * Gets the "data" element
     */
    java.lang.String getData();
    
    /**
     * Gets (as xml) the "data" element
     */
    org.apache.xmlbeans.XmlString xgetData();
    
    /**
     * True if has "data" element
     */
    boolean isSetData();
    
    /**
     * Sets the "data" element
     */
    void setData(java.lang.String data);
    
    /**
     * Sets (as xml) the "data" element
     */
    void xsetData(org.apache.xmlbeans.XmlString data);
    
    /**
     * Unsets the "data" element
     */
    void unsetData();
    
    /**
     * Gets the "dependencytoken" element
     */
    java.lang.String getDependencytoken();
    
    /**
     * Gets (as xml) the "dependencytoken" element
     */
    org.apache.xmlbeans.XmlString xgetDependencytoken();
    
    /**
     * True if has "dependencytoken" element
     */
    boolean isSetDependencytoken();
    
    /**
     * Sets the "dependencytoken" element
     */
    void setDependencytoken(java.lang.String dependencytoken);
    
    /**
     * Sets (as xml) the "dependencytoken" element
     */
    void xsetDependencytoken(org.apache.xmlbeans.XmlString dependencytoken);
    
    /**
     * Unsets the "dependencytoken" element
     */
    void unsetDependencytoken();
    
    /**
     * Gets the "depth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDepth();
    
    /**
     * True if has "depth" element
     */
    boolean isSetDepth();
    
    /**
     * Sets the "depth" element
     */
    void setDepth(com.microsoft.schemas.crm._2006.webservices.CrmNumber depth);
    
    /**
     * Appends and returns a new empty "depth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDepth();
    
    /**
     * Unsets the "depth" element
     */
    void unsetDepth();
    
    /**
     * Gets the "errorcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getErrorcode();
    
    /**
     * True if has "errorcode" element
     */
    boolean isSetErrorcode();
    
    /**
     * Sets the "errorcode" element
     */
    void setErrorcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber errorcode);
    
    /**
     * Appends and returns a new empty "errorcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewErrorcode();
    
    /**
     * Unsets the "errorcode" element
     */
    void unsetErrorcode();
    
    /**
     * Gets the "hostid" element
     */
    java.lang.String getHostid();
    
    /**
     * Gets (as xml) the "hostid" element
     */
    org.apache.xmlbeans.XmlString xgetHostid();
    
    /**
     * True if has "hostid" element
     */
    boolean isSetHostid();
    
    /**
     * Sets the "hostid" element
     */
    void setHostid(java.lang.String hostid);
    
    /**
     * Sets (as xml) the "hostid" element
     */
    void xsetHostid(org.apache.xmlbeans.XmlString hostid);
    
    /**
     * Unsets the "hostid" element
     */
    void unsetHostid();
    
    /**
     * Gets the "iswaitingforevent" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIswaitingforevent();
    
    /**
     * True if has "iswaitingforevent" element
     */
    boolean isSetIswaitingforevent();
    
    /**
     * Sets the "iswaitingforevent" element
     */
    void setIswaitingforevent(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iswaitingforevent);
    
    /**
     * Appends and returns a new empty "iswaitingforevent" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIswaitingforevent();
    
    /**
     * Unsets the "iswaitingforevent" element
     */
    void unsetIswaitingforevent();
    
    /**
     * Gets the "message" element
     */
    java.lang.String getMessage();
    
    /**
     * Gets (as xml) the "message" element
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * True if has "message" element
     */
    boolean isSetMessage();
    
    /**
     * Sets the "message" element
     */
    void setMessage(java.lang.String message);
    
    /**
     * Sets (as xml) the "message" element
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * Unsets the "message" element
     */
    void unsetMessage();
    
    /**
     * Gets the "messagename" element
     */
    java.lang.String getMessagename();
    
    /**
     * Gets (as xml) the "messagename" element
     */
    org.apache.xmlbeans.XmlString xgetMessagename();
    
    /**
     * True if has "messagename" element
     */
    boolean isSetMessagename();
    
    /**
     * Sets the "messagename" element
     */
    void setMessagename(java.lang.String messagename);
    
    /**
     * Sets (as xml) the "messagename" element
     */
    void xsetMessagename(org.apache.xmlbeans.XmlString messagename);
    
    /**
     * Unsets the "messagename" element
     */
    void unsetMessagename();
    
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
     * Gets the "operationtype" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getOperationtype();
    
    /**
     * True if has "operationtype" element
     */
    boolean isSetOperationtype();
    
    /**
     * Sets the "operationtype" element
     */
    void setOperationtype(com.microsoft.schemas.crm._2006.webservices.Picklist operationtype);
    
    /**
     * Appends and returns a new empty "operationtype" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewOperationtype();
    
    /**
     * Unsets the "operationtype" element
     */
    void unsetOperationtype();
    
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
     * Gets the "postponeuntil" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getPostponeuntil();
    
    /**
     * True if has "postponeuntil" element
     */
    boolean isSetPostponeuntil();
    
    /**
     * Sets the "postponeuntil" element
     */
    void setPostponeuntil(com.microsoft.schemas.crm._2006.webservices.CrmDateTime postponeuntil);
    
    /**
     * Appends and returns a new empty "postponeuntil" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewPostponeuntil();
    
    /**
     * Unsets the "postponeuntil" element
     */
    void unsetPostponeuntil();
    
    /**
     * Gets the "primaryentitytype" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference getPrimaryentitytype();
    
    /**
     * True if has "primaryentitytype" element
     */
    boolean isSetPrimaryentitytype();
    
    /**
     * Sets the "primaryentitytype" element
     */
    void setPrimaryentitytype(com.microsoft.schemas.crm._2006.webservices.EntityNameReference primaryentitytype);
    
    /**
     * Appends and returns a new empty "primaryentitytype" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewPrimaryentitytype();
    
    /**
     * Unsets the "primaryentitytype" element
     */
    void unsetPrimaryentitytype();
    
    /**
     * Gets the "recurrencepattern" element
     */
    java.lang.String getRecurrencepattern();
    
    /**
     * Gets (as xml) the "recurrencepattern" element
     */
    org.apache.xmlbeans.XmlString xgetRecurrencepattern();
    
    /**
     * True if has "recurrencepattern" element
     */
    boolean isSetRecurrencepattern();
    
    /**
     * Sets the "recurrencepattern" element
     */
    void setRecurrencepattern(java.lang.String recurrencepattern);
    
    /**
     * Sets (as xml) the "recurrencepattern" element
     */
    void xsetRecurrencepattern(org.apache.xmlbeans.XmlString recurrencepattern);
    
    /**
     * Unsets the "recurrencepattern" element
     */
    void unsetRecurrencepattern();
    
    /**
     * Gets the "recurrencestarttime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getRecurrencestarttime();
    
    /**
     * True if has "recurrencestarttime" element
     */
    boolean isSetRecurrencestarttime();
    
    /**
     * Sets the "recurrencestarttime" element
     */
    void setRecurrencestarttime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime recurrencestarttime);
    
    /**
     * Appends and returns a new empty "recurrencestarttime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewRecurrencestarttime();
    
    /**
     * Unsets the "recurrencestarttime" element
     */
    void unsetRecurrencestarttime();
    
    /**
     * Gets the "regardingobjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getRegardingobjectid();
    
    /**
     * True if has "regardingobjectid" element
     */
    boolean isSetRegardingobjectid();
    
    /**
     * Sets the "regardingobjectid" element
     */
    void setRegardingobjectid(com.microsoft.schemas.crm._2006.webservices.Lookup regardingobjectid);
    
    /**
     * Appends and returns a new empty "regardingobjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewRegardingobjectid();
    
    /**
     * Unsets the "regardingobjectid" element
     */
    void unsetRegardingobjectid();
    
    /**
     * Gets the "requestid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getRequestid();
    
    /**
     * True if has "requestid" element
     */
    boolean isSetRequestid();
    
    /**
     * Sets the "requestid" element
     */
    void setRequestid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier requestid);
    
    /**
     * Appends and returns a new empty "requestid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewRequestid();
    
    /**
     * Unsets the "requestid" element
     */
    void unsetRequestid();
    
    /**
     * Gets the "retrycount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getRetrycount();
    
    /**
     * True if has "retrycount" element
     */
    boolean isSetRetrycount();
    
    /**
     * Sets the "retrycount" element
     */
    void setRetrycount(com.microsoft.schemas.crm._2006.webservices.CrmNumber retrycount);
    
    /**
     * Appends and returns a new empty "retrycount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewRetrycount();
    
    /**
     * Unsets the "retrycount" element
     */
    void unsetRetrycount();
    
    /**
     * Gets the "startedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStartedon();
    
    /**
     * True if has "startedon" element
     */
    boolean isSetStartedon();
    
    /**
     * Sets the "startedon" element
     */
    void setStartedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime startedon);
    
    /**
     * Appends and returns a new empty "startedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStartedon();
    
    /**
     * Unsets the "startedon" element
     */
    void unsetStartedon();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.AsyncOperationStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.AsyncOperationStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.AsyncOperationStateInfo addNewStatecode();
    
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
     * Gets the "workflowactivationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getWorkflowactivationid();
    
    /**
     * True if has "workflowactivationid" element
     */
    boolean isSetWorkflowactivationid();
    
    /**
     * Sets the "workflowactivationid" element
     */
    void setWorkflowactivationid(com.microsoft.schemas.crm._2006.webservices.Lookup workflowactivationid);
    
    /**
     * Appends and returns a new empty "workflowactivationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewWorkflowactivationid();
    
    /**
     * Unsets the "workflowactivationid" element
     */
    void unsetWorkflowactivationid();
    
    /**
     * Gets the "workflowstagename" element
     */
    java.lang.String getWorkflowstagename();
    
    /**
     * Gets (as xml) the "workflowstagename" element
     */
    org.apache.xmlbeans.XmlString xgetWorkflowstagename();
    
    /**
     * True if has "workflowstagename" element
     */
    boolean isSetWorkflowstagename();
    
    /**
     * Sets the "workflowstagename" element
     */
    void setWorkflowstagename(java.lang.String workflowstagename);
    
    /**
     * Sets (as xml) the "workflowstagename" element
     */
    void xsetWorkflowstagename(org.apache.xmlbeans.XmlString workflowstagename);
    
    /**
     * Unsets the "workflowstagename" element
     */
    void unsetWorkflowstagename();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Asyncoperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Asyncoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
