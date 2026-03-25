/*
 * XML Type:  savedquery
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Savedquery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML savedquery(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Savedquery extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Savedquery.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("savedquery7d5ftype");
    
    /**
     * Gets the "columnsetxml" element
     */
    java.lang.String getColumnsetxml();
    
    /**
     * Gets (as xml) the "columnsetxml" element
     */
    org.apache.xmlbeans.XmlString xgetColumnsetxml();
    
    /**
     * True if has "columnsetxml" element
     */
    boolean isSetColumnsetxml();
    
    /**
     * Sets the "columnsetxml" element
     */
    void setColumnsetxml(java.lang.String columnsetxml);
    
    /**
     * Sets (as xml) the "columnsetxml" element
     */
    void xsetColumnsetxml(org.apache.xmlbeans.XmlString columnsetxml);
    
    /**
     * Unsets the "columnsetxml" element
     */
    void unsetColumnsetxml();
    
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
     * Gets the "fetchxml" element
     */
    java.lang.String getFetchxml();
    
    /**
     * Gets (as xml) the "fetchxml" element
     */
    org.apache.xmlbeans.XmlString xgetFetchxml();
    
    /**
     * True if has "fetchxml" element
     */
    boolean isSetFetchxml();
    
    /**
     * Sets the "fetchxml" element
     */
    void setFetchxml(java.lang.String fetchxml);
    
    /**
     * Sets (as xml) the "fetchxml" element
     */
    void xsetFetchxml(org.apache.xmlbeans.XmlString fetchxml);
    
    /**
     * Unsets the "fetchxml" element
     */
    void unsetFetchxml();
    
    /**
     * Gets the "inproduction" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getInproduction();
    
    /**
     * True if has "inproduction" element
     */
    boolean isSetInproduction();
    
    /**
     * Sets the "inproduction" element
     */
    void setInproduction(com.microsoft.schemas.crm._2006.webservices.CrmBoolean inproduction);
    
    /**
     * Appends and returns a new empty "inproduction" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewInproduction();
    
    /**
     * Unsets the "inproduction" element
     */
    void unsetInproduction();
    
    /**
     * Gets the "iscustomizable" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIscustomizable();
    
    /**
     * True if has "iscustomizable" element
     */
    boolean isSetIscustomizable();
    
    /**
     * Sets the "iscustomizable" element
     */
    void setIscustomizable(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iscustomizable);
    
    /**
     * Appends and returns a new empty "iscustomizable" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIscustomizable();
    
    /**
     * Unsets the "iscustomizable" element
     */
    void unsetIscustomizable();
    
    /**
     * Gets the "isdefault" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsdefault();
    
    /**
     * True if has "isdefault" element
     */
    boolean isSetIsdefault();
    
    /**
     * Sets the "isdefault" element
     */
    void setIsdefault(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isdefault);
    
    /**
     * Appends and returns a new empty "isdefault" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsdefault();
    
    /**
     * Unsets the "isdefault" element
     */
    void unsetIsdefault();
    
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
     * Gets the "isquickfindquery" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsquickfindquery();
    
    /**
     * True if has "isquickfindquery" element
     */
    boolean isSetIsquickfindquery();
    
    /**
     * Sets the "isquickfindquery" element
     */
    void setIsquickfindquery(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isquickfindquery);
    
    /**
     * Appends and returns a new empty "isquickfindquery" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsquickfindquery();
    
    /**
     * Unsets the "isquickfindquery" element
     */
    void unsetIsquickfindquery();
    
    /**
     * Gets the "isuserdefined" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsuserdefined();
    
    /**
     * True if has "isuserdefined" element
     */
    boolean isSetIsuserdefined();
    
    /**
     * Sets the "isuserdefined" element
     */
    void setIsuserdefined(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isuserdefined);
    
    /**
     * Appends and returns a new empty "isuserdefined" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsuserdefined();
    
    /**
     * Unsets the "isuserdefined" element
     */
    void unsetIsuserdefined();
    
    /**
     * Gets the "layoutxml" element
     */
    java.lang.String getLayoutxml();
    
    /**
     * Gets (as xml) the "layoutxml" element
     */
    org.apache.xmlbeans.XmlString xgetLayoutxml();
    
    /**
     * True if has "layoutxml" element
     */
    boolean isSetLayoutxml();
    
    /**
     * Sets the "layoutxml" element
     */
    void setLayoutxml(java.lang.String layoutxml);
    
    /**
     * Sets (as xml) the "layoutxml" element
     */
    void xsetLayoutxml(org.apache.xmlbeans.XmlString layoutxml);
    
    /**
     * Unsets the "layoutxml" element
     */
    void unsetLayoutxml();
    
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
     * Gets the "queryapi" element
     */
    java.lang.String getQueryapi();
    
    /**
     * Gets (as xml) the "queryapi" element
     */
    org.apache.xmlbeans.XmlString xgetQueryapi();
    
    /**
     * True if has "queryapi" element
     */
    boolean isSetQueryapi();
    
    /**
     * Sets the "queryapi" element
     */
    void setQueryapi(java.lang.String queryapi);
    
    /**
     * Sets (as xml) the "queryapi" element
     */
    void xsetQueryapi(org.apache.xmlbeans.XmlString queryapi);
    
    /**
     * Unsets the "queryapi" element
     */
    void unsetQueryapi();
    
    /**
     * Gets the "queryappusage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getQueryappusage();
    
    /**
     * True if has "queryappusage" element
     */
    boolean isSetQueryappusage();
    
    /**
     * Sets the "queryappusage" element
     */
    void setQueryappusage(com.microsoft.schemas.crm._2006.webservices.CrmNumber queryappusage);
    
    /**
     * Appends and returns a new empty "queryappusage" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewQueryappusage();
    
    /**
     * Unsets the "queryappusage" element
     */
    void unsetQueryappusage();
    
    /**
     * Gets the "querytype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getQuerytype();
    
    /**
     * True if has "querytype" element
     */
    boolean isSetQuerytype();
    
    /**
     * Sets the "querytype" element
     */
    void setQuerytype(com.microsoft.schemas.crm._2006.webservices.CrmNumber querytype);
    
    /**
     * Appends and returns a new empty "querytype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewQuerytype();
    
    /**
     * Unsets the "querytype" element
     */
    void unsetQuerytype();
    
    /**
     * Gets the "returnedtypecode" element
     */
    java.lang.String getReturnedtypecode();
    
    /**
     * Gets (as xml) the "returnedtypecode" element
     */
    org.apache.xmlbeans.XmlString xgetReturnedtypecode();
    
    /**
     * True if has "returnedtypecode" element
     */
    boolean isSetReturnedtypecode();
    
    /**
     * Sets the "returnedtypecode" element
     */
    void setReturnedtypecode(java.lang.String returnedtypecode);
    
    /**
     * Sets (as xml) the "returnedtypecode" element
     */
    void xsetReturnedtypecode(org.apache.xmlbeans.XmlString returnedtypecode);
    
    /**
     * Unsets the "returnedtypecode" element
     */
    void unsetReturnedtypecode();
    
    /**
     * Gets the "savedqueryid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getSavedqueryid();
    
    /**
     * True if has "savedqueryid" element
     */
    boolean isSetSavedqueryid();
    
    /**
     * Sets the "savedqueryid" element
     */
    void setSavedqueryid(com.microsoft.schemas.crm._2006.webservices.Key savedqueryid);
    
    /**
     * Appends and returns a new empty "savedqueryid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewSavedqueryid();
    
    /**
     * Unsets the "savedqueryid" element
     */
    void unsetSavedqueryid();
    
    /**
     * Gets the "savedqueryidunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSavedqueryidunique();
    
    /**
     * True if has "savedqueryidunique" element
     */
    boolean isSetSavedqueryidunique();
    
    /**
     * Sets the "savedqueryidunique" element
     */
    void setSavedqueryidunique(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier savedqueryidunique);
    
    /**
     * Appends and returns a new empty "savedqueryidunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSavedqueryidunique();
    
    /**
     * Unsets the "savedqueryidunique" element
     */
    void unsetSavedqueryidunique();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Savedquery parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Savedquery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
