/*
 * XML Type:  sdkmessagefilter
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML sdkmessagefilter(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Sdkmessagefilter extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sdkmessagefilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("sdkmessagefilteref43type");
    
    /**
     * Gets the "availability" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAvailability();
    
    /**
     * True if has "availability" element
     */
    boolean isSetAvailability();
    
    /**
     * Sets the "availability" element
     */
    void setAvailability(com.microsoft.schemas.crm._2006.webservices.CrmNumber availability);
    
    /**
     * Appends and returns a new empty "availability" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAvailability();
    
    /**
     * Unsets the "availability" element
     */
    void unsetAvailability();
    
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
     * Gets the "iscustomprocessingstepallowed" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIscustomprocessingstepallowed();
    
    /**
     * True if has "iscustomprocessingstepallowed" element
     */
    boolean isSetIscustomprocessingstepallowed();
    
    /**
     * Sets the "iscustomprocessingstepallowed" element
     */
    void setIscustomprocessingstepallowed(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iscustomprocessingstepallowed);
    
    /**
     * Appends and returns a new empty "iscustomprocessingstepallowed" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIscustomprocessingstepallowed();
    
    /**
     * Unsets the "iscustomprocessingstepallowed" element
     */
    void unsetIscustomprocessingstepallowed();
    
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
     * Gets the "primaryobjecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference getPrimaryobjecttypecode();
    
    /**
     * True if has "primaryobjecttypecode" element
     */
    boolean isSetPrimaryobjecttypecode();
    
    /**
     * Sets the "primaryobjecttypecode" element
     */
    void setPrimaryobjecttypecode(com.microsoft.schemas.crm._2006.webservices.EntityNameReference primaryobjecttypecode);
    
    /**
     * Appends and returns a new empty "primaryobjecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewPrimaryobjecttypecode();
    
    /**
     * Unsets the "primaryobjecttypecode" element
     */
    void unsetPrimaryobjecttypecode();
    
    /**
     * Gets the "sdkmessagefilterid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getSdkmessagefilterid();
    
    /**
     * True if has "sdkmessagefilterid" element
     */
    boolean isSetSdkmessagefilterid();
    
    /**
     * Sets the "sdkmessagefilterid" element
     */
    void setSdkmessagefilterid(com.microsoft.schemas.crm._2006.webservices.Key sdkmessagefilterid);
    
    /**
     * Appends and returns a new empty "sdkmessagefilterid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewSdkmessagefilterid();
    
    /**
     * Unsets the "sdkmessagefilterid" element
     */
    void unsetSdkmessagefilterid();
    
    /**
     * Gets the "sdkmessagefilteridunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSdkmessagefilteridunique();
    
    /**
     * True if has "sdkmessagefilteridunique" element
     */
    boolean isSetSdkmessagefilteridunique();
    
    /**
     * Sets the "sdkmessagefilteridunique" element
     */
    void setSdkmessagefilteridunique(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier sdkmessagefilteridunique);
    
    /**
     * Appends and returns a new empty "sdkmessagefilteridunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSdkmessagefilteridunique();
    
    /**
     * Unsets the "sdkmessagefilteridunique" element
     */
    void unsetSdkmessagefilteridunique();
    
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
     * Gets the "secondaryobjecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference getSecondaryobjecttypecode();
    
    /**
     * True if has "secondaryobjecttypecode" element
     */
    boolean isSetSecondaryobjecttypecode();
    
    /**
     * Sets the "secondaryobjecttypecode" element
     */
    void setSecondaryobjecttypecode(com.microsoft.schemas.crm._2006.webservices.EntityNameReference secondaryobjecttypecode);
    
    /**
     * Appends and returns a new empty "secondaryobjecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewSecondaryobjecttypecode();
    
    /**
     * Unsets the "secondaryobjecttypecode" element
     */
    void unsetSecondaryobjecttypecode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessagefilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
