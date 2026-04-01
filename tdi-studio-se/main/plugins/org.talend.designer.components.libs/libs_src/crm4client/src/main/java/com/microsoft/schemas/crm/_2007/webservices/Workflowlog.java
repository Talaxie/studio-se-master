/*
 * XML Type:  workflowlog
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Workflowlog
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML workflowlog(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Workflowlog extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Workflowlog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("workflowlog8c31type");
    
    /**
     * Gets the "activityname" element
     */
    java.lang.String getActivityname();
    
    /**
     * Gets (as xml) the "activityname" element
     */
    org.apache.xmlbeans.XmlString xgetActivityname();
    
    /**
     * True if has "activityname" element
     */
    boolean isSetActivityname();
    
    /**
     * Sets the "activityname" element
     */
    void setActivityname(java.lang.String activityname);
    
    /**
     * Sets (as xml) the "activityname" element
     */
    void xsetActivityname(org.apache.xmlbeans.XmlString activityname);
    
    /**
     * Unsets the "activityname" element
     */
    void unsetActivityname();
    
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
     * Gets the "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwningbusinessunit();
    
    /**
     * True if has "owningbusinessunit" element
     */
    boolean isSetOwningbusinessunit();
    
    /**
     * Sets the "owningbusinessunit" element
     */
    void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owningbusinessunit);
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwningbusinessunit();
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    void unsetOwningbusinessunit();
    
    /**
     * Gets the "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwninguser();
    
    /**
     * True if has "owninguser" element
     */
    boolean isSetOwninguser();
    
    /**
     * Sets the "owninguser" element
     */
    void setOwninguser(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owninguser);
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwninguser();
    
    /**
     * Unsets the "owninguser" element
     */
    void unsetOwninguser();
    
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
     * Gets the "stagename" element
     */
    java.lang.String getStagename();
    
    /**
     * Gets (as xml) the "stagename" element
     */
    org.apache.xmlbeans.XmlString xgetStagename();
    
    /**
     * True if has "stagename" element
     */
    boolean isSetStagename();
    
    /**
     * Sets the "stagename" element
     */
    void setStagename(java.lang.String stagename);
    
    /**
     * Sets (as xml) the "stagename" element
     */
    void xsetStagename(org.apache.xmlbeans.XmlString stagename);
    
    /**
     * Unsets the "stagename" element
     */
    void unsetStagename();
    
    /**
     * Gets the "status" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(com.microsoft.schemas.crm._2006.webservices.Picklist status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "stepname" element
     */
    java.lang.String getStepname();
    
    /**
     * Gets (as xml) the "stepname" element
     */
    org.apache.xmlbeans.XmlString xgetStepname();
    
    /**
     * True if has "stepname" element
     */
    boolean isSetStepname();
    
    /**
     * Sets the "stepname" element
     */
    void setStepname(java.lang.String stepname);
    
    /**
     * Sets (as xml) the "stepname" element
     */
    void xsetStepname(org.apache.xmlbeans.XmlString stepname);
    
    /**
     * Unsets the "stepname" element
     */
    void unsetStepname();
    
    /**
     * Gets the "workflowlogid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getWorkflowlogid();
    
    /**
     * True if has "workflowlogid" element
     */
    boolean isSetWorkflowlogid();
    
    /**
     * Sets the "workflowlogid" element
     */
    void setWorkflowlogid(com.microsoft.schemas.crm._2006.webservices.Key workflowlogid);
    
    /**
     * Appends and returns a new empty "workflowlogid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewWorkflowlogid();
    
    /**
     * Unsets the "workflowlogid" element
     */
    void unsetWorkflowlogid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Workflowlog parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowlog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
