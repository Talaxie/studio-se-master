/*
 * XML Type:  wfprocessinstance
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML wfprocessinstance(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Wfprocessinstance extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Wfprocessinstance.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("wfprocessinstance0921type");
    
    /**
     * Gets the "businessunitid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getBusinessunitid();
    
    /**
     * True if has "businessunitid" element
     */
    boolean isSetBusinessunitid();
    
    /**
     * Sets the "businessunitid" element
     */
    void setBusinessunitid(com.microsoft.schemas.crm._2006.webservices.Lookup businessunitid);
    
    /**
     * Appends and returns a new empty "businessunitid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewBusinessunitid();
    
    /**
     * Unsets the "businessunitid" element
     */
    void unsetBusinessunitid();
    
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
     * Gets the "lastactivityon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getLastactivityon();
    
    /**
     * True if has "lastactivityon" element
     */
    boolean isSetLastactivityon();
    
    /**
     * Sets the "lastactivityon" element
     */
    void setLastactivityon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime lastactivityon);
    
    /**
     * Appends and returns a new empty "lastactivityon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewLastactivityon();
    
    /**
     * Unsets the "lastactivityon" element
     */
    void unsetLastactivityon();
    
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
     * Gets the "objectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getObjectid();
    
    /**
     * True if has "objectid" element
     */
    boolean isSetObjectid();
    
    /**
     * Sets the "objectid" element
     */
    void setObjectid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier objectid);
    
    /**
     * Appends and returns a new empty "objectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewObjectid();
    
    /**
     * Unsets the "objectid" element
     */
    void unsetObjectid();
    
    /**
     * Gets the "objecttype" element
     */
    java.lang.String getObjecttype();
    
    /**
     * Gets (as xml) the "objecttype" element
     */
    org.apache.xmlbeans.XmlString xgetObjecttype();
    
    /**
     * True if has "objecttype" element
     */
    boolean isSetObjecttype();
    
    /**
     * Sets the "objecttype" element
     */
    void setObjecttype(java.lang.String objecttype);
    
    /**
     * Sets (as xml) the "objecttype" element
     */
    void xsetObjecttype(org.apache.xmlbeans.XmlString objecttype);
    
    /**
     * Unsets the "objecttype" element
     */
    void unsetObjecttype();
    
    /**
     * Gets the "parentid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getParentid();
    
    /**
     * True if has "parentid" element
     */
    boolean isSetParentid();
    
    /**
     * Sets the "parentid" element
     */
    void setParentid(com.microsoft.schemas.crm._2006.webservices.Lookup parentid);
    
    /**
     * Appends and returns a new empty "parentid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentid();
    
    /**
     * Unsets the "parentid" element
     */
    void unsetParentid();
    
    /**
     * Gets the "processid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getProcessid();
    
    /**
     * True if has "processid" element
     */
    boolean isSetProcessid();
    
    /**
     * Sets the "processid" element
     */
    void setProcessid(com.microsoft.schemas.crm._2006.webservices.Lookup processid);
    
    /**
     * Appends and returns a new empty "processid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewProcessid();
    
    /**
     * Unsets the "processid" element
     */
    void unsetProcessid();
    
    /**
     * Gets the "processinstanceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getProcessinstanceid();
    
    /**
     * True if has "processinstanceid" element
     */
    boolean isSetProcessinstanceid();
    
    /**
     * Sets the "processinstanceid" element
     */
    void setProcessinstanceid(com.microsoft.schemas.crm._2006.webservices.Key processinstanceid);
    
    /**
     * Appends and returns a new empty "processinstanceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewProcessinstanceid();
    
    /**
     * Unsets the "processinstanceid" element
     */
    void unsetProcessinstanceid();
    
    /**
     * Gets the "startedby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getStartedby();
    
    /**
     * True if has "startedby" element
     */
    boolean isSetStartedby();
    
    /**
     * Sets the "startedby" element
     */
    void setStartedby(com.microsoft.schemas.crm._2006.webservices.Lookup startedby);
    
    /**
     * Appends and returns a new empty "startedby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewStartedby();
    
    /**
     * Unsets the "startedby" element
     */
    void unsetStartedby();
    
    /**
     * Gets the "startedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStartedon();
    
    /**
     * True if has "startedon" element
     */
    boolean isSetStartedon();
    
    /**
     * Sets the "startedon" element
     */
    void setStartedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime startedon);
    
    /**
     * Appends and returns a new empty "startedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStartedon();
    
    /**
     * Unsets the "startedon" element
     */
    void unsetStartedon();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.WFProcessInstanceStateInfo addNewStatecode();
    
    /**
     * Unsets the "statecode" element
     */
    void unsetStatecode();
    
    /**
     * Gets the "stepcounter" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStepcounter();
    
    /**
     * True if has "stepcounter" element
     */
    boolean isSetStepcounter();
    
    /**
     * Sets the "stepcounter" element
     */
    void setStepcounter(com.microsoft.schemas.crm._2006.webservices.CrmNumber stepcounter);
    
    /**
     * Appends and returns a new empty "stepcounter" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStepcounter();
    
    /**
     * Unsets the "stepcounter" element
     */
    void unsetStepcounter();
    
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
     * Gets the "usercontext" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getUsercontext();
    
    /**
     * True if has "usercontext" element
     */
    boolean isSetUsercontext();
    
    /**
     * Sets the "usercontext" element
     */
    void setUsercontext(com.microsoft.schemas.crm._2006.webservices.Lookup usercontext);
    
    /**
     * Appends and returns a new empty "usercontext" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewUsercontext();
    
    /**
     * Unsets the "usercontext" element
     */
    void unsetUsercontext();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocessinstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
