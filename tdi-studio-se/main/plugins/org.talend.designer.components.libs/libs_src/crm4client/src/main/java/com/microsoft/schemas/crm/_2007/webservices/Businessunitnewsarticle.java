/*
 * XML Type:  businessunitnewsarticle
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML businessunitnewsarticle(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Businessunitnewsarticle extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Businessunitnewsarticle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("businessunitnewsarticledb0btype");
    
    /**
     * Gets the "activeon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActiveon();
    
    /**
     * True if has "activeon" element
     */
    boolean isSetActiveon();
    
    /**
     * Sets the "activeon" element
     */
    void setActiveon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime activeon);
    
    /**
     * Appends and returns a new empty "activeon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActiveon();
    
    /**
     * Unsets the "activeon" element
     */
    void unsetActiveon();
    
    /**
     * Gets the "activeuntil" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActiveuntil();
    
    /**
     * True if has "activeuntil" element
     */
    boolean isSetActiveuntil();
    
    /**
     * Sets the "activeuntil" element
     */
    void setActiveuntil(com.microsoft.schemas.crm._2006.webservices.CrmDateTime activeuntil);
    
    /**
     * Appends and returns a new empty "activeuntil" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActiveuntil();
    
    /**
     * Unsets the "activeuntil" element
     */
    void unsetActiveuntil();
    
    /**
     * Gets the "articletitle" element
     */
    java.lang.String getArticletitle();
    
    /**
     * Gets (as xml) the "articletitle" element
     */
    org.apache.xmlbeans.XmlString xgetArticletitle();
    
    /**
     * True if has "articletitle" element
     */
    boolean isSetArticletitle();
    
    /**
     * Sets the "articletitle" element
     */
    void setArticletitle(java.lang.String articletitle);
    
    /**
     * Sets (as xml) the "articletitle" element
     */
    void xsetArticletitle(org.apache.xmlbeans.XmlString articletitle);
    
    /**
     * Unsets the "articletitle" element
     */
    void unsetArticletitle();
    
    /**
     * Gets the "articletypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getArticletypecode();
    
    /**
     * True if has "articletypecode" element
     */
    boolean isSetArticletypecode();
    
    /**
     * Sets the "articletypecode" element
     */
    void setArticletypecode(com.microsoft.schemas.crm._2006.webservices.Picklist articletypecode);
    
    /**
     * Appends and returns a new empty "articletypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewArticletypecode();
    
    /**
     * Unsets the "articletypecode" element
     */
    void unsetArticletypecode();
    
    /**
     * Gets the "articleurl" element
     */
    java.lang.String getArticleurl();
    
    /**
     * Gets (as xml) the "articleurl" element
     */
    org.apache.xmlbeans.XmlString xgetArticleurl();
    
    /**
     * True if has "articleurl" element
     */
    boolean isSetArticleurl();
    
    /**
     * Sets the "articleurl" element
     */
    void setArticleurl(java.lang.String articleurl);
    
    /**
     * Sets (as xml) the "articleurl" element
     */
    void xsetArticleurl(org.apache.xmlbeans.XmlString articleurl);
    
    /**
     * Unsets the "articleurl" element
     */
    void unsetArticleurl();
    
    /**
     * Gets the "businessunitnewsarticleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getBusinessunitnewsarticleid();
    
    /**
     * True if has "businessunitnewsarticleid" element
     */
    boolean isSetBusinessunitnewsarticleid();
    
    /**
     * Sets the "businessunitnewsarticleid" element
     */
    void setBusinessunitnewsarticleid(com.microsoft.schemas.crm._2006.webservices.Key businessunitnewsarticleid);
    
    /**
     * Appends and returns a new empty "businessunitnewsarticleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewBusinessunitnewsarticleid();
    
    /**
     * Unsets the "businessunitnewsarticleid" element
     */
    void unsetBusinessunitnewsarticleid();
    
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
     * Gets the "importsequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getImportsequencenumber();
    
    /**
     * True if has "importsequencenumber" element
     */
    boolean isSetImportsequencenumber();
    
    /**
     * Sets the "importsequencenumber" element
     */
    void setImportsequencenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber importsequencenumber);
    
    /**
     * Appends and returns a new empty "importsequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewImportsequencenumber();
    
    /**
     * Unsets the "importsequencenumber" element
     */
    void unsetImportsequencenumber();
    
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
     * Gets the "newsarticle" element
     */
    java.lang.String getNewsarticle();
    
    /**
     * Gets (as xml) the "newsarticle" element
     */
    org.apache.xmlbeans.XmlString xgetNewsarticle();
    
    /**
     * True if has "newsarticle" element
     */
    boolean isSetNewsarticle();
    
    /**
     * Sets the "newsarticle" element
     */
    void setNewsarticle(java.lang.String newsarticle);
    
    /**
     * Sets (as xml) the "newsarticle" element
     */
    void xsetNewsarticle(org.apache.xmlbeans.XmlString newsarticle);
    
    /**
     * Unsets the "newsarticle" element
     */
    void unsetNewsarticle();
    
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
     * Gets the "overriddencreatedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getOverriddencreatedon();
    
    /**
     * True if has "overriddencreatedon" element
     */
    boolean isSetOverriddencreatedon();
    
    /**
     * Sets the "overriddencreatedon" element
     */
    void setOverriddencreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime overriddencreatedon);
    
    /**
     * Appends and returns a new empty "overriddencreatedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewOverriddencreatedon();
    
    /**
     * Unsets the "overriddencreatedon" element
     */
    void unsetOverriddencreatedon();
    
    /**
     * Gets the "showonhomepage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getShowonhomepage();
    
    /**
     * True if has "showonhomepage" element
     */
    boolean isSetShowonhomepage();
    
    /**
     * Sets the "showonhomepage" element
     */
    void setShowonhomepage(com.microsoft.schemas.crm._2006.webservices.CrmBoolean showonhomepage);
    
    /**
     * Appends and returns a new empty "showonhomepage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewShowonhomepage();
    
    /**
     * Unsets the "showonhomepage" element
     */
    void unsetShowonhomepage();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
