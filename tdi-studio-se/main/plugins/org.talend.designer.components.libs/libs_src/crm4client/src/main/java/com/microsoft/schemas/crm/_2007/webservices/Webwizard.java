/*
 * XML Type:  webwizard
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Webwizard
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML webwizard(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Webwizard extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Webwizard.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("webwizard160btype");
    
    /**
     * Gets the "accessprivileges" element
     */
    java.lang.String getAccessprivileges();
    
    /**
     * Gets (as xml) the "accessprivileges" element
     */
    org.apache.xmlbeans.XmlString xgetAccessprivileges();
    
    /**
     * True if has "accessprivileges" element
     */
    boolean isSetAccessprivileges();
    
    /**
     * Sets the "accessprivileges" element
     */
    void setAccessprivileges(java.lang.String accessprivileges);
    
    /**
     * Sets (as xml) the "accessprivileges" element
     */
    void xsetAccessprivileges(org.apache.xmlbeans.XmlString accessprivileges);
    
    /**
     * Unsets the "accessprivileges" element
     */
    void unsetAccessprivileges();
    
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
     * Gets the "isstaticpagesequence" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsstaticpagesequence();
    
    /**
     * True if has "isstaticpagesequence" element
     */
    boolean isSetIsstaticpagesequence();
    
    /**
     * Sets the "isstaticpagesequence" element
     */
    void setIsstaticpagesequence(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isstaticpagesequence);
    
    /**
     * Appends and returns a new empty "isstaticpagesequence" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsstaticpagesequence();
    
    /**
     * Unsets the "isstaticpagesequence" element
     */
    void unsetIsstaticpagesequence();
    
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
     * Gets the "startpagesequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStartpagesequencenumber();
    
    /**
     * True if has "startpagesequencenumber" element
     */
    boolean isSetStartpagesequencenumber();
    
    /**
     * Sets the "startpagesequencenumber" element
     */
    void setStartpagesequencenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber startpagesequencenumber);
    
    /**
     * Appends and returns a new empty "startpagesequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStartpagesequencenumber();
    
    /**
     * Unsets the "startpagesequencenumber" element
     */
    void unsetStartpagesequencenumber();
    
    /**
     * Gets the "titleresourcestring" element
     */
    java.lang.String getTitleresourcestring();
    
    /**
     * Gets (as xml) the "titleresourcestring" element
     */
    org.apache.xmlbeans.XmlString xgetTitleresourcestring();
    
    /**
     * True if has "titleresourcestring" element
     */
    boolean isSetTitleresourcestring();
    
    /**
     * Sets the "titleresourcestring" element
     */
    void setTitleresourcestring(java.lang.String titleresourcestring);
    
    /**
     * Sets (as xml) the "titleresourcestring" element
     */
    void xsetTitleresourcestring(org.apache.xmlbeans.XmlString titleresourcestring);
    
    /**
     * Unsets the "titleresourcestring" element
     */
    void unsetTitleresourcestring();
    
    /**
     * Gets the "webwizardid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getWebwizardid();
    
    /**
     * True if has "webwizardid" element
     */
    boolean isSetWebwizardid();
    
    /**
     * Sets the "webwizardid" element
     */
    void setWebwizardid(com.microsoft.schemas.crm._2006.webservices.Key webwizardid);
    
    /**
     * Appends and returns a new empty "webwizardid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewWebwizardid();
    
    /**
     * Unsets the "webwizardid" element
     */
    void unsetWebwizardid();
    
    /**
     * Gets the "wizardpageheight" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getWizardpageheight();
    
    /**
     * True if has "wizardpageheight" element
     */
    boolean isSetWizardpageheight();
    
    /**
     * Sets the "wizardpageheight" element
     */
    void setWizardpageheight(com.microsoft.schemas.crm._2006.webservices.CrmNumber wizardpageheight);
    
    /**
     * Appends and returns a new empty "wizardpageheight" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewWizardpageheight();
    
    /**
     * Unsets the "wizardpageheight" element
     */
    void unsetWizardpageheight();
    
    /**
     * Gets the "wizardpagewidth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getWizardpagewidth();
    
    /**
     * True if has "wizardpagewidth" element
     */
    boolean isSetWizardpagewidth();
    
    /**
     * Sets the "wizardpagewidth" element
     */
    void setWizardpagewidth(com.microsoft.schemas.crm._2006.webservices.CrmNumber wizardpagewidth);
    
    /**
     * Appends and returns a new empty "wizardpagewidth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewWizardpagewidth();
    
    /**
     * Unsets the "wizardpagewidth" element
     */
    void unsetWizardpagewidth();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Webwizard parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Webwizard) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
