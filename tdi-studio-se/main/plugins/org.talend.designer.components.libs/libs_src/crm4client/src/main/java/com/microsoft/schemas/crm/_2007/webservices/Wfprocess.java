/*
 * XML Type:  wfprocess
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Wfprocess
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML wfprocess(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Wfprocess extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Wfprocess.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("wfprocesscacctype");
    
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
     * Gets the "entitytype" element
     */
    java.lang.String getEntitytype();
    
    /**
     * Gets (as xml) the "entitytype" element
     */
    org.apache.xmlbeans.XmlString xgetEntitytype();
    
    /**
     * True if has "entitytype" element
     */
    boolean isSetEntitytype();
    
    /**
     * Sets the "entitytype" element
     */
    void setEntitytype(java.lang.String entitytype);
    
    /**
     * Sets (as xml) the "entitytype" element
     */
    void xsetEntitytype(org.apache.xmlbeans.XmlString entitytype);
    
    /**
     * Unsets the "entitytype" element
     */
    void unsetEntitytype();
    
    /**
     * Gets the "eventtypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getEventtypecode();
    
    /**
     * True if has "eventtypecode" element
     */
    boolean isSetEventtypecode();
    
    /**
     * Sets the "eventtypecode" element
     */
    void setEventtypecode(com.microsoft.schemas.crm._2006.webservices.Picklist eventtypecode);
    
    /**
     * Appends and returns a new empty "eventtypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewEventtypecode();
    
    /**
     * Unsets the "eventtypecode" element
     */
    void unsetEventtypecode();
    
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
     * Gets the "priority" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getPriority();
    
    /**
     * True if has "priority" element
     */
    boolean isSetPriority();
    
    /**
     * Sets the "priority" element
     */
    void setPriority(com.microsoft.schemas.crm._2006.webservices.CrmNumber priority);
    
    /**
     * Appends and returns a new empty "priority" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewPriority();
    
    /**
     * Unsets the "priority" element
     */
    void unsetPriority();
    
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
     * Gets the "processid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getProcessid();
    
    /**
     * True if has "processid" element
     */
    boolean isSetProcessid();
    
    /**
     * Sets the "processid" element
     */
    void setProcessid(com.microsoft.schemas.crm._2006.webservices.Key processid);
    
    /**
     * Appends and returns a new empty "processid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewProcessid();
    
    /**
     * Unsets the "processid" element
     */
    void unsetProcessid();
    
    /**
     * Gets the "processtypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getProcesstypecode();
    
    /**
     * True if has "processtypecode" element
     */
    boolean isSetProcesstypecode();
    
    /**
     * Sets the "processtypecode" element
     */
    void setProcesstypecode(com.microsoft.schemas.crm._2006.webservices.Picklist processtypecode);
    
    /**
     * Appends and returns a new empty "processtypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewProcesstypecode();
    
    /**
     * Unsets the "processtypecode" element
     */
    void unsetProcesstypecode();
    
    /**
     * Gets the "processtypeversion" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getProcesstypeversion();
    
    /**
     * True if has "processtypeversion" element
     */
    boolean isSetProcesstypeversion();
    
    /**
     * Sets the "processtypeversion" element
     */
    void setProcesstypeversion(com.microsoft.schemas.crm._2006.webservices.CrmNumber processtypeversion);
    
    /**
     * Appends and returns a new empty "processtypeversion" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewProcesstypeversion();
    
    /**
     * Unsets the "processtypeversion" element
     */
    void unsetProcesstypeversion();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.WFProcessStateInfo addNewStatecode();
    
    /**
     * Unsets the "statecode" element
     */
    void unsetStatecode();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Wfprocess parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Wfprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
