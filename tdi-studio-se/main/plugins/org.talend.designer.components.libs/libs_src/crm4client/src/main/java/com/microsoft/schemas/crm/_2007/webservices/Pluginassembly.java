/*
 * XML Type:  pluginassembly
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Pluginassembly
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML pluginassembly(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Pluginassembly extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pluginassembly.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("pluginassembly3657type");
    
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
     * Gets the "culture" element
     */
    java.lang.String getCulture();
    
    /**
     * Gets (as xml) the "culture" element
     */
    org.apache.xmlbeans.XmlString xgetCulture();
    
    /**
     * True if has "culture" element
     */
    boolean isSetCulture();
    
    /**
     * Sets the "culture" element
     */
    void setCulture(java.lang.String culture);
    
    /**
     * Sets (as xml) the "culture" element
     */
    void xsetCulture(org.apache.xmlbeans.XmlString culture);
    
    /**
     * Unsets the "culture" element
     */
    void unsetCulture();
    
    /**
     * Gets the "customizationlevel" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getCustomizationlevel();
    
    /**
     * True if has "customizationlevel" element
     */
    boolean isSetCustomizationlevel();
    
    /**
     * Sets the "customizationlevel" element
     */
    void setCustomizationlevel(com.microsoft.schemas.crm._2006.webservices.CrmNumber customizationlevel);
    
    /**
     * Appends and returns a new empty "customizationlevel" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCustomizationlevel();
    
    /**
     * Unsets the "customizationlevel" element
     */
    void unsetCustomizationlevel();
    
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
     * Gets the "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOrganizationid();
    
    /**
     * True if has "organizationid" element
     */
    boolean isSetOrganizationid();
    
    /**
     * Sets the "organizationid" element
     */
    void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Lookup organizationid);
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOrganizationid();
    
    /**
     * Unsets the "organizationid" element
     */
    void unsetOrganizationid();
    
    /**
     * Gets the "path" element
     */
    java.lang.String getPath();
    
    /**
     * Gets (as xml) the "path" element
     */
    org.apache.xmlbeans.XmlString xgetPath();
    
    /**
     * True if has "path" element
     */
    boolean isSetPath();
    
    /**
     * Sets the "path" element
     */
    void setPath(java.lang.String path);
    
    /**
     * Sets (as xml) the "path" element
     */
    void xsetPath(org.apache.xmlbeans.XmlString path);
    
    /**
     * Unsets the "path" element
     */
    void unsetPath();
    
    /**
     * Gets the "pluginassemblyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getPluginassemblyid();
    
    /**
     * True if has "pluginassemblyid" element
     */
    boolean isSetPluginassemblyid();
    
    /**
     * Sets the "pluginassemblyid" element
     */
    void setPluginassemblyid(com.microsoft.schemas.crm._2006.webservices.Key pluginassemblyid);
    
    /**
     * Appends and returns a new empty "pluginassemblyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewPluginassemblyid();
    
    /**
     * Unsets the "pluginassemblyid" element
     */
    void unsetPluginassemblyid();
    
    /**
     * Gets the "pluginassemblyidunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getPluginassemblyidunique();
    
    /**
     * True if has "pluginassemblyidunique" element
     */
    boolean isSetPluginassemblyidunique();
    
    /**
     * Sets the "pluginassemblyidunique" element
     */
    void setPluginassemblyidunique(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier pluginassemblyidunique);
    
    /**
     * Appends and returns a new empty "pluginassemblyidunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewPluginassemblyidunique();
    
    /**
     * Unsets the "pluginassemblyidunique" element
     */
    void unsetPluginassemblyidunique();
    
    /**
     * Gets the "publickeytoken" element
     */
    java.lang.String getPublickeytoken();
    
    /**
     * Gets (as xml) the "publickeytoken" element
     */
    org.apache.xmlbeans.XmlString xgetPublickeytoken();
    
    /**
     * True if has "publickeytoken" element
     */
    boolean isSetPublickeytoken();
    
    /**
     * Sets the "publickeytoken" element
     */
    void setPublickeytoken(java.lang.String publickeytoken);
    
    /**
     * Sets (as xml) the "publickeytoken" element
     */
    void xsetPublickeytoken(org.apache.xmlbeans.XmlString publickeytoken);
    
    /**
     * Unsets the "publickeytoken" element
     */
    void unsetPublickeytoken();
    
    /**
     * Gets the "sourcehash" element
     */
    java.lang.String getSourcehash();
    
    /**
     * Gets (as xml) the "sourcehash" element
     */
    org.apache.xmlbeans.XmlString xgetSourcehash();
    
    /**
     * True if has "sourcehash" element
     */
    boolean isSetSourcehash();
    
    /**
     * Sets the "sourcehash" element
     */
    void setSourcehash(java.lang.String sourcehash);
    
    /**
     * Sets (as xml) the "sourcehash" element
     */
    void xsetSourcehash(org.apache.xmlbeans.XmlString sourcehash);
    
    /**
     * Unsets the "sourcehash" element
     */
    void unsetSourcehash();
    
    /**
     * Gets the "sourcetype" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getSourcetype();
    
    /**
     * True if has "sourcetype" element
     */
    boolean isSetSourcetype();
    
    /**
     * Sets the "sourcetype" element
     */
    void setSourcetype(com.microsoft.schemas.crm._2006.webservices.Picklist sourcetype);
    
    /**
     * Appends and returns a new empty "sourcetype" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewSourcetype();
    
    /**
     * Unsets the "sourcetype" element
     */
    void unsetSourcetype();
    
    /**
     * Gets the "version" element
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "version" element
     */
    org.apache.xmlbeans.XmlString xgetVersion();
    
    /**
     * True if has "version" element
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "version" element
     */
    void xsetVersion(org.apache.xmlbeans.XmlString version);
    
    /**
     * Unsets the "version" element
     */
    void unsetVersion();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Pluginassembly parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Pluginassembly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
