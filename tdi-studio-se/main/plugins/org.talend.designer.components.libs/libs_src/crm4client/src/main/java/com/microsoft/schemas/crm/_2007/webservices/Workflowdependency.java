/*
 * XML Type:  workflowdependency
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Workflowdependency
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML workflowdependency(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Workflowdependency extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Workflowdependency.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("workflowdependency89c8type");
    
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
     * Gets the "customentityname" element
     */
    java.lang.String getCustomentityname();
    
    /**
     * Gets (as xml) the "customentityname" element
     */
    org.apache.xmlbeans.XmlString xgetCustomentityname();
    
    /**
     * True if has "customentityname" element
     */
    boolean isSetCustomentityname();
    
    /**
     * Sets the "customentityname" element
     */
    void setCustomentityname(java.lang.String customentityname);
    
    /**
     * Sets (as xml) the "customentityname" element
     */
    void xsetCustomentityname(org.apache.xmlbeans.XmlString customentityname);
    
    /**
     * Unsets the "customentityname" element
     */
    void unsetCustomentityname();
    
    /**
     * Gets the "dependentattributename" element
     */
    java.lang.String getDependentattributename();
    
    /**
     * Gets (as xml) the "dependentattributename" element
     */
    org.apache.xmlbeans.XmlString xgetDependentattributename();
    
    /**
     * True if has "dependentattributename" element
     */
    boolean isSetDependentattributename();
    
    /**
     * Sets the "dependentattributename" element
     */
    void setDependentattributename(java.lang.String dependentattributename);
    
    /**
     * Sets (as xml) the "dependentattributename" element
     */
    void xsetDependentattributename(org.apache.xmlbeans.XmlString dependentattributename);
    
    /**
     * Unsets the "dependentattributename" element
     */
    void unsetDependentattributename();
    
    /**
     * Gets the "dependententityname" element
     */
    java.lang.String getDependententityname();
    
    /**
     * Gets (as xml) the "dependententityname" element
     */
    org.apache.xmlbeans.XmlString xgetDependententityname();
    
    /**
     * True if has "dependententityname" element
     */
    boolean isSetDependententityname();
    
    /**
     * Sets the "dependententityname" element
     */
    void setDependententityname(java.lang.String dependententityname);
    
    /**
     * Sets (as xml) the "dependententityname" element
     */
    void xsetDependententityname(org.apache.xmlbeans.XmlString dependententityname);
    
    /**
     * Unsets the "dependententityname" element
     */
    void unsetDependententityname();
    
    /**
     * Gets the "entityattributes" element
     */
    java.lang.String getEntityattributes();
    
    /**
     * Gets (as xml) the "entityattributes" element
     */
    org.apache.xmlbeans.XmlString xgetEntityattributes();
    
    /**
     * True if has "entityattributes" element
     */
    boolean isSetEntityattributes();
    
    /**
     * Sets the "entityattributes" element
     */
    void setEntityattributes(java.lang.String entityattributes);
    
    /**
     * Sets (as xml) the "entityattributes" element
     */
    void xsetEntityattributes(org.apache.xmlbeans.XmlString entityattributes);
    
    /**
     * Unsets the "entityattributes" element
     */
    void unsetEntityattributes();
    
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
     * Gets the "parametername" element
     */
    java.lang.String getParametername();
    
    /**
     * Gets (as xml) the "parametername" element
     */
    org.apache.xmlbeans.XmlString xgetParametername();
    
    /**
     * True if has "parametername" element
     */
    boolean isSetParametername();
    
    /**
     * Sets the "parametername" element
     */
    void setParametername(java.lang.String parametername);
    
    /**
     * Sets (as xml) the "parametername" element
     */
    void xsetParametername(org.apache.xmlbeans.XmlString parametername);
    
    /**
     * Unsets the "parametername" element
     */
    void unsetParametername();
    
    /**
     * Gets the "parametertype" element
     */
    java.lang.String getParametertype();
    
    /**
     * Gets (as xml) the "parametertype" element
     */
    org.apache.xmlbeans.XmlString xgetParametertype();
    
    /**
     * True if has "parametertype" element
     */
    boolean isSetParametertype();
    
    /**
     * Sets the "parametertype" element
     */
    void setParametertype(java.lang.String parametertype);
    
    /**
     * Sets (as xml) the "parametertype" element
     */
    void xsetParametertype(org.apache.xmlbeans.XmlString parametertype);
    
    /**
     * Unsets the "parametertype" element
     */
    void unsetParametertype();
    
    /**
     * Gets the "relatedattributename" element
     */
    java.lang.String getRelatedattributename();
    
    /**
     * Gets (as xml) the "relatedattributename" element
     */
    org.apache.xmlbeans.XmlString xgetRelatedattributename();
    
    /**
     * True if has "relatedattributename" element
     */
    boolean isSetRelatedattributename();
    
    /**
     * Sets the "relatedattributename" element
     */
    void setRelatedattributename(java.lang.String relatedattributename);
    
    /**
     * Sets (as xml) the "relatedattributename" element
     */
    void xsetRelatedattributename(org.apache.xmlbeans.XmlString relatedattributename);
    
    /**
     * Unsets the "relatedattributename" element
     */
    void unsetRelatedattributename();
    
    /**
     * Gets the "relatedentityname" element
     */
    java.lang.String getRelatedentityname();
    
    /**
     * Gets (as xml) the "relatedentityname" element
     */
    org.apache.xmlbeans.XmlString xgetRelatedentityname();
    
    /**
     * True if has "relatedentityname" element
     */
    boolean isSetRelatedentityname();
    
    /**
     * Sets the "relatedentityname" element
     */
    void setRelatedentityname(java.lang.String relatedentityname);
    
    /**
     * Sets (as xml) the "relatedentityname" element
     */
    void xsetRelatedentityname(org.apache.xmlbeans.XmlString relatedentityname);
    
    /**
     * Unsets the "relatedentityname" element
     */
    void unsetRelatedentityname();
    
    /**
     * Gets the "sdkmessageid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getSdkmessageid();
    
    /**
     * True if has "sdkmessageid" element
     */
    boolean isSetSdkmessageid();
    
    /**
     * Sets the "sdkmessageid" element
     */
    void setSdkmessageid(com.microsoft.schemas.crm._2006.webservices.Lookup sdkmessageid);
    
    /**
     * Appends and returns a new empty "sdkmessageid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewSdkmessageid();
    
    /**
     * Unsets the "sdkmessageid" element
     */
    void unsetSdkmessageid();
    
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
     * Gets the "workflowdependencyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getWorkflowdependencyid();
    
    /**
     * True if has "workflowdependencyid" element
     */
    boolean isSetWorkflowdependencyid();
    
    /**
     * Sets the "workflowdependencyid" element
     */
    void setWorkflowdependencyid(com.microsoft.schemas.crm._2006.webservices.Key workflowdependencyid);
    
    /**
     * Appends and returns a new empty "workflowdependencyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewWorkflowdependencyid();
    
    /**
     * Unsets the "workflowdependencyid" element
     */
    void unsetWorkflowdependencyid();
    
    /**
     * Gets the "workflowid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getWorkflowid();
    
    /**
     * True if has "workflowid" element
     */
    boolean isSetWorkflowid();
    
    /**
     * Sets the "workflowid" element
     */
    void setWorkflowid(com.microsoft.schemas.crm._2006.webservices.Lookup workflowid);
    
    /**
     * Appends and returns a new empty "workflowid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewWorkflowid();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Workflowdependency parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Workflowdependency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
