/*
 * XML Type:  sdkmessageprocessingstep
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML sdkmessageprocessingstep(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Sdkmessageprocessingstep extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sdkmessageprocessingstep.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("sdkmessageprocessingstep5a6atype");
    
    /**
     * Gets the "configuration" element
     */
    java.lang.String getConfiguration();
    
    /**
     * Gets (as xml) the "configuration" element
     */
    org.apache.xmlbeans.XmlString xgetConfiguration();
    
    /**
     * True if has "configuration" element
     */
    boolean isSetConfiguration();
    
    /**
     * Sets the "configuration" element
     */
    void setConfiguration(java.lang.String configuration);
    
    /**
     * Sets (as xml) the "configuration" element
     */
    void xsetConfiguration(org.apache.xmlbeans.XmlString configuration);
    
    /**
     * Unsets the "configuration" element
     */
    void unsetConfiguration();
    
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
     * Gets the "filteringattributes" element
     */
    java.lang.String getFilteringattributes();
    
    /**
     * Gets (as xml) the "filteringattributes" element
     */
    org.apache.xmlbeans.XmlString xgetFilteringattributes();
    
    /**
     * True if has "filteringattributes" element
     */
    boolean isSetFilteringattributes();
    
    /**
     * Sets the "filteringattributes" element
     */
    void setFilteringattributes(java.lang.String filteringattributes);
    
    /**
     * Sets (as xml) the "filteringattributes" element
     */
    void xsetFilteringattributes(org.apache.xmlbeans.XmlString filteringattributes);
    
    /**
     * Unsets the "filteringattributes" element
     */
    void unsetFilteringattributes();
    
    /**
     * Gets the "impersonatinguserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getImpersonatinguserid();
    
    /**
     * True if has "impersonatinguserid" element
     */
    boolean isSetImpersonatinguserid();
    
    /**
     * Sets the "impersonatinguserid" element
     */
    void setImpersonatinguserid(com.microsoft.schemas.crm._2006.webservices.Lookup impersonatinguserid);
    
    /**
     * Appends and returns a new empty "impersonatinguserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewImpersonatinguserid();
    
    /**
     * Unsets the "impersonatinguserid" element
     */
    void unsetImpersonatinguserid();
    
    /**
     * Gets the "invocationsource" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getInvocationsource();
    
    /**
     * True if has "invocationsource" element
     */
    boolean isSetInvocationsource();
    
    /**
     * Sets the "invocationsource" element
     */
    void setInvocationsource(com.microsoft.schemas.crm._2006.webservices.Picklist invocationsource);
    
    /**
     * Appends and returns a new empty "invocationsource" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewInvocationsource();
    
    /**
     * Unsets the "invocationsource" element
     */
    void unsetInvocationsource();
    
    /**
     * Gets the "mode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getMode();
    
    /**
     * True if has "mode" element
     */
    boolean isSetMode();
    
    /**
     * Sets the "mode" element
     */
    void setMode(com.microsoft.schemas.crm._2006.webservices.Picklist mode);
    
    /**
     * Appends and returns a new empty "mode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewMode();
    
    /**
     * Unsets the "mode" element
     */
    void unsetMode();
    
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
     * Gets the "plugintypeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPlugintypeid();
    
    /**
     * True if has "plugintypeid" element
     */
    boolean isSetPlugintypeid();
    
    /**
     * Sets the "plugintypeid" element
     */
    void setPlugintypeid(com.microsoft.schemas.crm._2006.webservices.Lookup plugintypeid);
    
    /**
     * Appends and returns a new empty "plugintypeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPlugintypeid();
    
    /**
     * Unsets the "plugintypeid" element
     */
    void unsetPlugintypeid();
    
    /**
     * Gets the "rank" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getRank();
    
    /**
     * True if has "rank" element
     */
    boolean isSetRank();
    
    /**
     * Sets the "rank" element
     */
    void setRank(com.microsoft.schemas.crm._2006.webservices.CrmNumber rank);
    
    /**
     * Appends and returns a new empty "rank" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewRank();
    
    /**
     * Unsets the "rank" element
     */
    void unsetRank();
    
    /**
     * Gets the "sdkmessagefilterid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getSdkmessagefilterid();
    
    /**
     * True if has "sdkmessagefilterid" element
     */
    boolean isSetSdkmessagefilterid();
    
    /**
     * Sets the "sdkmessagefilterid" element
     */
    void setSdkmessagefilterid(com.microsoft.schemas.crm._2006.webservices.Lookup sdkmessagefilterid);
    
    /**
     * Appends and returns a new empty "sdkmessagefilterid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewSdkmessagefilterid();
    
    /**
     * Unsets the "sdkmessagefilterid" element
     */
    void unsetSdkmessagefilterid();
    
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
     * Gets the "sdkmessageprocessingstepid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getSdkmessageprocessingstepid();
    
    /**
     * True if has "sdkmessageprocessingstepid" element
     */
    boolean isSetSdkmessageprocessingstepid();
    
    /**
     * Sets the "sdkmessageprocessingstepid" element
     */
    void setSdkmessageprocessingstepid(com.microsoft.schemas.crm._2006.webservices.Key sdkmessageprocessingstepid);
    
    /**
     * Appends and returns a new empty "sdkmessageprocessingstepid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewSdkmessageprocessingstepid();
    
    /**
     * Unsets the "sdkmessageprocessingstepid" element
     */
    void unsetSdkmessageprocessingstepid();
    
    /**
     * Gets the "sdkmessageprocessingstepidunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSdkmessageprocessingstepidunique();
    
    /**
     * True if has "sdkmessageprocessingstepidunique" element
     */
    boolean isSetSdkmessageprocessingstepidunique();
    
    /**
     * Sets the "sdkmessageprocessingstepidunique" element
     */
    void setSdkmessageprocessingstepidunique(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier sdkmessageprocessingstepidunique);
    
    /**
     * Appends and returns a new empty "sdkmessageprocessingstepidunique" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSdkmessageprocessingstepidunique();
    
    /**
     * Unsets the "sdkmessageprocessingstepidunique" element
     */
    void unsetSdkmessageprocessingstepidunique();
    
    /**
     * Gets the "sdkmessageprocessingstepsecureconfigid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getSdkmessageprocessingstepsecureconfigid();
    
    /**
     * True if has "sdkmessageprocessingstepsecureconfigid" element
     */
    boolean isSetSdkmessageprocessingstepsecureconfigid();
    
    /**
     * Sets the "sdkmessageprocessingstepsecureconfigid" element
     */
    void setSdkmessageprocessingstepsecureconfigid(com.microsoft.schemas.crm._2006.webservices.Lookup sdkmessageprocessingstepsecureconfigid);
    
    /**
     * Appends and returns a new empty "sdkmessageprocessingstepsecureconfigid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewSdkmessageprocessingstepsecureconfigid();
    
    /**
     * Unsets the "sdkmessageprocessingstepsecureconfigid" element
     */
    void unsetSdkmessageprocessingstepsecureconfigid();
    
    /**
     * Gets the "stage" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getStage();
    
    /**
     * True if has "stage" element
     */
    boolean isSetStage();
    
    /**
     * Sets the "stage" element
     */
    void setStage(com.microsoft.schemas.crm._2006.webservices.Picklist stage);
    
    /**
     * Appends and returns a new empty "stage" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewStage();
    
    /**
     * Unsets the "stage" element
     */
    void unsetStage();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepStateInfo addNewStatecode();
    
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
     * Gets the "supporteddeployment" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getSupporteddeployment();
    
    /**
     * True if has "supporteddeployment" element
     */
    boolean isSetSupporteddeployment();
    
    /**
     * Sets the "supporteddeployment" element
     */
    void setSupporteddeployment(com.microsoft.schemas.crm._2006.webservices.Picklist supporteddeployment);
    
    /**
     * Appends and returns a new empty "supporteddeployment" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewSupporteddeployment();
    
    /**
     * Unsets the "supporteddeployment" element
     */
    void unsetSupporteddeployment();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
