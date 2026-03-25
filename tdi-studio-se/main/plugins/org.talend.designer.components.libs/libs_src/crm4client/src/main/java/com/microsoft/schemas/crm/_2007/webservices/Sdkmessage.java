/*
 * XML Type:  sdkmessage
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Sdkmessage
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML sdkmessage(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Sdkmessage extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sdkmessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("sdkmessage724btype");
    
    /**
     * Gets the "autotransact" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAutotransact();
    
    /**
     * True if has "autotransact" element
     */
    boolean isSetAutotransact();
    
    /**
     * Sets the "autotransact" element
     */
    void setAutotransact(com.microsoft.schemas.crm._2006.webservices.CrmBoolean autotransact);
    
    /**
     * Appends and returns a new empty "autotransact" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAutotransact();
    
    /**
     * Unsets the "autotransact" element
     */
    void unsetAutotransact();
    
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
     * Gets the "categoryname" element
     */
    java.lang.String getCategoryname();
    
    /**
     * Gets (as xml) the "categoryname" element
     */
    org.apache.xmlbeans.XmlString xgetCategoryname();
    
    /**
     * True if has "categoryname" element
     */
    boolean isSetCategoryname();
    
    /**
     * Sets the "categoryname" element
     */
    void setCategoryname(java.lang.String categoryname);
    
    /**
     * Sets (as xml) the "categoryname" element
     */
    void xsetCategoryname(org.apache.xmlbeans.XmlString categoryname);
    
    /**
     * Unsets the "categoryname" element
     */
    void unsetCategoryname();
    
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
     * Gets the "expand" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getExpand();
    
    /**
     * True if has "expand" element
     */
    boolean isSetExpand();
    
    /**
     * Sets the "expand" element
     */
    void setExpand(com.microsoft.schemas.crm._2006.webservices.CrmBoolean expand);
    
    /**
     * Appends and returns a new empty "expand" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewExpand();
    
    /**
     * Unsets the "expand" element
     */
    void unsetExpand();
    
    /**
     * Gets the "isprivate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsprivate();
    
    /**
     * True if has "isprivate" element
     */
    boolean isSetIsprivate();
    
    /**
     * Sets the "isprivate" element
     */
    void setIsprivate(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isprivate);
    
    /**
     * Appends and returns a new empty "isprivate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsprivate();
    
    /**
     * Unsets the "isprivate" element
     */
    void unsetIsprivate();
    
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
     * Gets the "sdkmessageid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getSdkmessageid();
    
    /**
     * True if has "sdkmessageid" element
     */
    boolean isSetSdkmessageid();
    
    /**
     * Sets the "sdkmessageid" element
     */
    void setSdkmessageid(com.microsoft.schemas.crm._2006.webservices.Key sdkmessageid);
    
    /**
     * Appends and returns a new empty "sdkmessageid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewSdkmessageid();
    
    /**
     * Unsets the "sdkmessageid" element
     */
    void unsetSdkmessageid();
    
    /**
     * Gets the "sdkmessageidunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSdkmessageidunique();
    
    /**
     * True if has "sdkmessageidunique" element
     */
    boolean isSetSdkmessageidunique();
    
    /**
     * Sets the "sdkmessageidunique" element
     */
    void setSdkmessageidunique(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier sdkmessageidunique);
    
    /**
     * Appends and returns a new empty "sdkmessageidunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSdkmessageidunique();
    
    /**
     * Unsets the "sdkmessageidunique" element
     */
    void unsetSdkmessageidunique();
    
    /**
     * Gets the "template" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getTemplate();
    
    /**
     * True if has "template" element
     */
    boolean isSetTemplate();
    
    /**
     * Sets the "template" element
     */
    void setTemplate(com.microsoft.schemas.crm._2006.webservices.CrmBoolean template);
    
    /**
     * Appends and returns a new empty "template" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewTemplate();
    
    /**
     * Unsets the "template" element
     */
    void unsetTemplate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessage parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
