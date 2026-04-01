/*
 * XML Type:  workflow
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Workflow
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML workflow(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Workflow extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Workflow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("workflow913dtype");
    
    /**
     * Gets the "activeworkflowid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getActiveworkflowid();
    
    /**
     * True if has "activeworkflowid" element
     */
    boolean isSetActiveworkflowid();
    
    /**
     * Sets the "activeworkflowid" element
     */
    void setActiveworkflowid(com.microsoft.schemas.crm._2006.webservices.Lookup activeworkflowid);
    
    /**
     * Appends and returns a new empty "activeworkflowid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewActiveworkflowid();
    
    /**
     * Unsets the "activeworkflowid" element
     */
    void unsetActiveworkflowid();
    
    /**
     * Gets the "activities" element
     */
    java.lang.String getActivities();
    
    /**
     * Gets (as xml) the "activities" element
     */
    org.apache.xmlbeans.XmlString xgetActivities();
    
    /**
     * True if has "activities" element
     */
    boolean isSetActivities();
    
    /**
     * Sets the "activities" element
     */
    void setActivities(java.lang.String activities);
    
    /**
     * Sets (as xml) the "activities" element
     */
    void xsetActivities(org.apache.xmlbeans.XmlString activities);
    
    /**
     * Unsets the "activities" element
     */
    void unsetActivities();
    
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
     * Gets the "iscrmuiworkflow" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIscrmuiworkflow();
    
    /**
     * True if has "iscrmuiworkflow" element
     */
    boolean isSetIscrmuiworkflow();
    
    /**
     * Sets the "iscrmuiworkflow" element
     */
    void setIscrmuiworkflow(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iscrmuiworkflow);
    
    /**
     * Appends and returns a new empty "iscrmuiworkflow" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIscrmuiworkflow();
    
    /**
     * Unsets the "iscrmuiworkflow" element
     */
    void unsetIscrmuiworkflow();
    
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
     * Gets the "ondemand" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getOndemand();
    
    /**
     * True if has "ondemand" element
     */
    boolean isSetOndemand();
    
    /**
     * Sets the "ondemand" element
     */
    void setOndemand(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ondemand);
    
    /**
     * Appends and returns a new empty "ondemand" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewOndemand();
    
    /**
     * Unsets the "ondemand" element
     */
    void unsetOndemand();
    
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
     * Gets the "parentworkflowid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getParentworkflowid();
    
    /**
     * True if has "parentworkflowid" element
     */
    boolean isSetParentworkflowid();
    
    /**
     * Sets the "parentworkflowid" element
     */
    void setParentworkflowid(com.microsoft.schemas.crm._2006.webservices.Lookup parentworkflowid);
    
    /**
     * Appends and returns a new empty "parentworkflowid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentworkflowid();
    
    /**
     * Unsets the "parentworkflowid" element
     */
    void unsetParentworkflowid();
    
    /**
     * Gets the "plugintypeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPlugintypeid();
    
    /**
     * True if has "plugintypeid" element
     */
    boolean isSetPlugintypeid();
    
    /**
     * Sets the "plugintypeid" element
     */
    void setPlugintypeid(com.microsoft.schemas.crm._2006.webservices.Lookup plugintypeid);
    
    /**
     * Appends and returns a new empty "plugintypeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPlugintypeid();
    
    /**
     * Unsets the "plugintypeid" element
     */
    void unsetPlugintypeid();
    
    /**
     * Gets the "primaryentity" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference getPrimaryentity();
    
    /**
     * True if has "primaryentity" element
     */
    boolean isSetPrimaryentity();
    
    /**
     * Sets the "primaryentity" element
     */
    void setPrimaryentity(com.microsoft.schemas.crm._2006.webservices.EntityNameReference primaryentity);
    
    /**
     * Appends and returns a new empty "primaryentity" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewPrimaryentity();
    
    /**
     * Unsets the "primaryentity" element
     */
    void unsetPrimaryentity();
    
    /**
     * Gets the "rules" element
     */
    java.lang.String getRules();
    
    /**
     * Gets (as xml) the "rules" element
     */
    org.apache.xmlbeans.XmlString xgetRules();
    
    /**
     * True if has "rules" element
     */
    boolean isSetRules();
    
    /**
     * Sets the "rules" element
     */
    void setRules(java.lang.String rules);
    
    /**
     * Sets (as xml) the "rules" element
     */
    void xsetRules(org.apache.xmlbeans.XmlString rules);
    
    /**
     * Unsets the "rules" element
     */
    void unsetRules();
    
    /**
     * Gets the "scope" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getScope();
    
    /**
     * True if has "scope" element
     */
    boolean isSetScope();
    
    /**
     * Sets the "scope" element
     */
    void setScope(com.microsoft.schemas.crm._2006.webservices.Picklist scope);
    
    /**
     * Appends and returns a new empty "scope" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewScope();
    
    /**
     * Unsets the "scope" element
     */
    void unsetScope();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.WorkflowStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.WorkflowStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.WorkflowStateInfo addNewStatecode();
    
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
     * Gets the "subprocess" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getSubprocess();
    
    /**
     * True if has "subprocess" element
     */
    boolean isSetSubprocess();
    
    /**
     * Sets the "subprocess" element
     */
    void setSubprocess(com.microsoft.schemas.crm._2006.webservices.CrmBoolean subprocess);
    
    /**
     * Appends and returns a new empty "subprocess" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewSubprocess();
    
    /**
     * Unsets the "subprocess" element
     */
    void unsetSubprocess();
    
    /**
     * Gets the "type" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(com.microsoft.schemas.crm._2006.webservices.Picklist type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets the "uidata" element
     */
    java.lang.String getUidata();
    
    /**
     * Gets (as xml) the "uidata" element
     */
    org.apache.xmlbeans.XmlString xgetUidata();
    
    /**
     * True if has "uidata" element
     */
    boolean isSetUidata();
    
    /**
     * Sets the "uidata" element
     */
    void setUidata(java.lang.String uidata);
    
    /**
     * Sets (as xml) the "uidata" element
     */
    void xsetUidata(org.apache.xmlbeans.XmlString uidata);
    
    /**
     * Unsets the "uidata" element
     */
    void unsetUidata();
    
    /**
     * Gets the "workflowid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getWorkflowid();
    
    /**
     * True if has "workflowid" element
     */
    boolean isSetWorkflowid();
    
    /**
     * Sets the "workflowid" element
     */
    void setWorkflowid(com.microsoft.schemas.crm._2006.webservices.Key workflowid);
    
    /**
     * Appends and returns a new empty "workflowid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewWorkflowid();
    
    /**
     * Unsets the "workflowid" element
     */
    void unsetWorkflowid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Workflow newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Workflow parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
