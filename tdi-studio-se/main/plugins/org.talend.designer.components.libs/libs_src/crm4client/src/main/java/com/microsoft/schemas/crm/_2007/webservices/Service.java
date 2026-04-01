/*
 * XML Type:  service
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Service
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML service(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Service extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Service.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("servicec341type");
    
    /**
     * Gets the "anchoroffset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAnchoroffset();
    
    /**
     * True if has "anchoroffset" element
     */
    boolean isSetAnchoroffset();
    
    /**
     * Sets the "anchoroffset" element
     */
    void setAnchoroffset(com.microsoft.schemas.crm._2006.webservices.CrmNumber anchoroffset);
    
    /**
     * Appends and returns a new empty "anchoroffset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAnchoroffset();
    
    /**
     * Unsets the "anchoroffset" element
     */
    void unsetAnchoroffset();
    
    /**
     * Gets the "calendarid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getCalendarid();
    
    /**
     * True if has "calendarid" element
     */
    boolean isSetCalendarid();
    
    /**
     * Sets the "calendarid" element
     */
    void setCalendarid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier calendarid);
    
    /**
     * Appends and returns a new empty "calendarid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewCalendarid();
    
    /**
     * Unsets the "calendarid" element
     */
    void unsetCalendarid();
    
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
     * Gets the "duration" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDuration();
    
    /**
     * True if has "duration" element
     */
    boolean isSetDuration();
    
    /**
     * Sets the "duration" element
     */
    void setDuration(com.microsoft.schemas.crm._2006.webservices.CrmNumber duration);
    
    /**
     * Appends and returns a new empty "duration" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDuration();
    
    /**
     * Unsets the "duration" element
     */
    void unsetDuration();
    
    /**
     * Gets the "granularity" element
     */
    java.lang.String getGranularity();
    
    /**
     * Gets (as xml) the "granularity" element
     */
    org.apache.xmlbeans.XmlString xgetGranularity();
    
    /**
     * True if has "granularity" element
     */
    boolean isSetGranularity();
    
    /**
     * Sets the "granularity" element
     */
    void setGranularity(java.lang.String granularity);
    
    /**
     * Sets (as xml) the "granularity" element
     */
    void xsetGranularity(org.apache.xmlbeans.XmlString granularity);
    
    /**
     * Unsets the "granularity" element
     */
    void unsetGranularity();
    
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
     * Gets the "initialstatuscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Status getInitialstatuscode();
    
    /**
     * True if has "initialstatuscode" element
     */
    boolean isSetInitialstatuscode();
    
    /**
     * Sets the "initialstatuscode" element
     */
    void setInitialstatuscode(com.microsoft.schemas.crm._2006.webservices.Status initialstatuscode);
    
    /**
     * Appends and returns a new empty "initialstatuscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Status addNewInitialstatuscode();
    
    /**
     * Unsets the "initialstatuscode" element
     */
    void unsetInitialstatuscode();
    
    /**
     * Gets the "isschedulable" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsschedulable();
    
    /**
     * True if has "isschedulable" element
     */
    boolean isSetIsschedulable();
    
    /**
     * Sets the "isschedulable" element
     */
    void setIsschedulable(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isschedulable);
    
    /**
     * Appends and returns a new empty "isschedulable" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsschedulable();
    
    /**
     * Unsets the "isschedulable" element
     */
    void unsetIsschedulable();
    
    /**
     * Gets the "isvisible" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsvisible();
    
    /**
     * True if has "isvisible" element
     */
    boolean isSetIsvisible();
    
    /**
     * Sets the "isvisible" element
     */
    void setIsvisible(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isvisible);
    
    /**
     * Appends and returns a new empty "isvisible" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsvisible();
    
    /**
     * Unsets the "isvisible" element
     */
    void unsetIsvisible();
    
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
     * Gets the "resourcespecid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getResourcespecid();
    
    /**
     * True if has "resourcespecid" element
     */
    boolean isSetResourcespecid();
    
    /**
     * Sets the "resourcespecid" element
     */
    void setResourcespecid(com.microsoft.schemas.crm._2006.webservices.Lookup resourcespecid);
    
    /**
     * Appends and returns a new empty "resourcespecid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewResourcespecid();
    
    /**
     * Unsets the "resourcespecid" element
     */
    void unsetResourcespecid();
    
    /**
     * Gets the "serviceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getServiceid();
    
    /**
     * True if has "serviceid" element
     */
    boolean isSetServiceid();
    
    /**
     * Sets the "serviceid" element
     */
    void setServiceid(com.microsoft.schemas.crm._2006.webservices.Key serviceid);
    
    /**
     * Appends and returns a new empty "serviceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewServiceid();
    
    /**
     * Unsets the "serviceid" element
     */
    void unsetServiceid();
    
    /**
     * Gets the "showresources" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getShowresources();
    
    /**
     * True if has "showresources" element
     */
    boolean isSetShowresources();
    
    /**
     * Sets the "showresources" element
     */
    void setShowresources(com.microsoft.schemas.crm._2006.webservices.CrmBoolean showresources);
    
    /**
     * Appends and returns a new empty "showresources" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewShowresources();
    
    /**
     * Unsets the "showresources" element
     */
    void unsetShowresources();
    
    /**
     * Gets the "strategyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getStrategyid();
    
    /**
     * True if has "strategyid" element
     */
    boolean isSetStrategyid();
    
    /**
     * Sets the "strategyid" element
     */
    void setStrategyid(com.microsoft.schemas.crm._2006.webservices.Lookup strategyid);
    
    /**
     * Appends and returns a new empty "strategyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewStrategyid();
    
    /**
     * Unsets the "strategyid" element
     */
    void unsetStrategyid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Service newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Service parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
