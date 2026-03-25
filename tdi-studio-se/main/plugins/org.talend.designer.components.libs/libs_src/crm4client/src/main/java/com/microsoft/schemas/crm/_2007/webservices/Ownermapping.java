/*
 * XML Type:  ownermapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Ownermapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML ownermapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Ownermapping extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ownermapping.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("ownermapping0cb9type");
    
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
     * Gets the "ownermappingid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getOwnermappingid();
    
    /**
     * True if has "ownermappingid" element
     */
    boolean isSetOwnermappingid();
    
    /**
     * Sets the "ownermappingid" element
     */
    void setOwnermappingid(com.microsoft.schemas.crm._2006.webservices.Key ownermappingid);
    
    /**
     * Appends and returns a new empty "ownermappingid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewOwnermappingid();
    
    /**
     * Unsets the "ownermappingid" element
     */
    void unsetOwnermappingid();
    
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
     * Gets the "sourcesystemusername" element
     */
    java.lang.String getSourcesystemusername();
    
    /**
     * Gets (as xml) the "sourcesystemusername" element
     */
    org.apache.xmlbeans.XmlString xgetSourcesystemusername();
    
    /**
     * True if has "sourcesystemusername" element
     */
    boolean isSetSourcesystemusername();
    
    /**
     * Sets the "sourcesystemusername" element
     */
    void setSourcesystemusername(java.lang.String sourcesystemusername);
    
    /**
     * Sets (as xml) the "sourcesystemusername" element
     */
    void xsetSourcesystemusername(org.apache.xmlbeans.XmlString sourcesystemusername);
    
    /**
     * Unsets the "sourcesystemusername" element
     */
    void unsetSourcesystemusername();
    
    /**
     * Gets the "sourceuservalueforsourcecrmuserlink" element
     */
    java.lang.String getSourceuservalueforsourcecrmuserlink();
    
    /**
     * Gets (as xml) the "sourceuservalueforsourcecrmuserlink" element
     */
    org.apache.xmlbeans.XmlString xgetSourceuservalueforsourcecrmuserlink();
    
    /**
     * True if has "sourceuservalueforsourcecrmuserlink" element
     */
    boolean isSetSourceuservalueforsourcecrmuserlink();
    
    /**
     * Sets the "sourceuservalueforsourcecrmuserlink" element
     */
    void setSourceuservalueforsourcecrmuserlink(java.lang.String sourceuservalueforsourcecrmuserlink);
    
    /**
     * Sets (as xml) the "sourceuservalueforsourcecrmuserlink" element
     */
    void xsetSourceuservalueforsourcecrmuserlink(org.apache.xmlbeans.XmlString sourceuservalueforsourcecrmuserlink);
    
    /**
     * Unsets the "sourceuservalueforsourcecrmuserlink" element
     */
    void unsetSourceuservalueforsourcecrmuserlink();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo addNewStatecode();
    
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
     * Gets the "targetsystemuserdomainname" element
     */
    java.lang.String getTargetsystemuserdomainname();
    
    /**
     * Gets (as xml) the "targetsystemuserdomainname" element
     */
    org.apache.xmlbeans.XmlString xgetTargetsystemuserdomainname();
    
    /**
     * True if has "targetsystemuserdomainname" element
     */
    boolean isSetTargetsystemuserdomainname();
    
    /**
     * Sets the "targetsystemuserdomainname" element
     */
    void setTargetsystemuserdomainname(java.lang.String targetsystemuserdomainname);
    
    /**
     * Sets (as xml) the "targetsystemuserdomainname" element
     */
    void xsetTargetsystemuserdomainname(org.apache.xmlbeans.XmlString targetsystemuserdomainname);
    
    /**
     * Unsets the "targetsystemuserdomainname" element
     */
    void unsetTargetsystemuserdomainname();
    
    /**
     * Gets the "targetsystemuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getTargetsystemuserid();
    
    /**
     * True if has "targetsystemuserid" element
     */
    boolean isSetTargetsystemuserid();
    
    /**
     * Sets the "targetsystemuserid" element
     */
    void setTargetsystemuserid(com.microsoft.schemas.crm._2006.webservices.Lookup targetsystemuserid);
    
    /**
     * Appends and returns a new empty "targetsystemuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewTargetsystemuserid();
    
    /**
     * Unsets the "targetsystemuserid" element
     */
    void unsetTargetsystemuserid();
    
    /**
     * Gets the "targetuservalueforsourcecrmuserlink" element
     */
    java.lang.String getTargetuservalueforsourcecrmuserlink();
    
    /**
     * Gets (as xml) the "targetuservalueforsourcecrmuserlink" element
     */
    org.apache.xmlbeans.XmlString xgetTargetuservalueforsourcecrmuserlink();
    
    /**
     * True if has "targetuservalueforsourcecrmuserlink" element
     */
    boolean isSetTargetuservalueforsourcecrmuserlink();
    
    /**
     * Sets the "targetuservalueforsourcecrmuserlink" element
     */
    void setTargetuservalueforsourcecrmuserlink(java.lang.String targetuservalueforsourcecrmuserlink);
    
    /**
     * Sets (as xml) the "targetuservalueforsourcecrmuserlink" element
     */
    void xsetTargetuservalueforsourcecrmuserlink(org.apache.xmlbeans.XmlString targetuservalueforsourcecrmuserlink);
    
    /**
     * Unsets the "targetuservalueforsourcecrmuserlink" element
     */
    void unsetTargetuservalueforsourcecrmuserlink();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Ownermapping parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Ownermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
