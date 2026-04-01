/*
 * XML Type:  bulkdeleteoperation
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML bulkdeleteoperation(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Bulkdeleteoperation extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bulkdeleteoperation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("bulkdeleteoperationbb96type");
    
    /**
     * Gets the "asyncoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getAsyncoperationid();
    
    /**
     * True if has "asyncoperationid" element
     */
    boolean isSetAsyncoperationid();
    
    /**
     * Sets the "asyncoperationid" element
     */
    void setAsyncoperationid(com.microsoft.schemas.crm._2006.webservices.Lookup asyncoperationid);
    
    /**
     * Appends and returns a new empty "asyncoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewAsyncoperationid();
    
    /**
     * Unsets the "asyncoperationid" element
     */
    void unsetAsyncoperationid();
    
    /**
     * Gets the "bulkdeleteoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getBulkdeleteoperationid();
    
    /**
     * True if has "bulkdeleteoperationid" element
     */
    boolean isSetBulkdeleteoperationid();
    
    /**
     * Sets the "bulkdeleteoperationid" element
     */
    void setBulkdeleteoperationid(com.microsoft.schemas.crm._2006.webservices.Key bulkdeleteoperationid);
    
    /**
     * Appends and returns a new empty "bulkdeleteoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewBulkdeleteoperationid();
    
    /**
     * Unsets the "bulkdeleteoperationid" element
     */
    void unsetBulkdeleteoperationid();
    
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
     * Gets the "isrecurring" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsrecurring();
    
    /**
     * True if has "isrecurring" element
     */
    boolean isSetIsrecurring();
    
    /**
     * Sets the "isrecurring" element
     */
    void setIsrecurring(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isrecurring);
    
    /**
     * Appends and returns a new empty "isrecurring" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsrecurring();
    
    /**
     * Unsets the "isrecurring" element
     */
    void unsetIsrecurring();
    
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
     * Gets the "nextrun" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getNextrun();
    
    /**
     * True if has "nextrun" element
     */
    boolean isSetNextrun();
    
    /**
     * Sets the "nextrun" element
     */
    void setNextrun(com.microsoft.schemas.crm._2006.webservices.CrmDateTime nextrun);
    
    /**
     * Appends and returns a new empty "nextrun" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewNextrun();
    
    /**
     * Unsets the "nextrun" element
     */
    void unsetNextrun();
    
    /**
     * Gets the "orderedquerysetxml" element
     */
    java.lang.String getOrderedquerysetxml();
    
    /**
     * Gets (as xml) the "orderedquerysetxml" element
     */
    org.apache.xmlbeans.XmlString xgetOrderedquerysetxml();
    
    /**
     * True if has "orderedquerysetxml" element
     */
    boolean isSetOrderedquerysetxml();
    
    /**
     * Sets the "orderedquerysetxml" element
     */
    void setOrderedquerysetxml(java.lang.String orderedquerysetxml);
    
    /**
     * Sets (as xml) the "orderedquerysetxml" element
     */
    void xsetOrderedquerysetxml(org.apache.xmlbeans.XmlString orderedquerysetxml);
    
    /**
     * Unsets the "orderedquerysetxml" element
     */
    void unsetOrderedquerysetxml();
    
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
     * Gets the "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOwninguser();
    
    /**
     * True if has "owninguser" element
     */
    boolean isSetOwninguser();
    
    /**
     * Sets the "owninguser" element
     */
    void setOwninguser(com.microsoft.schemas.crm._2006.webservices.Lookup owninguser);
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOwninguser();
    
    /**
     * Unsets the "owninguser" element
     */
    void unsetOwninguser();
    
    /**
     * Gets the "processingqeindex" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getProcessingqeindex();
    
    /**
     * True if has "processingqeindex" element
     */
    boolean isSetProcessingqeindex();
    
    /**
     * Sets the "processingqeindex" element
     */
    void setProcessingqeindex(com.microsoft.schemas.crm._2006.webservices.CrmNumber processingqeindex);
    
    /**
     * Appends and returns a new empty "processingqeindex" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewProcessingqeindex();
    
    /**
     * Unsets the "processingqeindex" element
     */
    void unsetProcessingqeindex();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.BulkDeleteOperationStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.BulkDeleteOperationStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.BulkDeleteOperationStateInfo addNewStatecode();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeleteoperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
