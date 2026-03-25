/*
 * XML Type:  importmap
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Importmap
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML importmap(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Importmap extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Importmap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("importmap01e3type");
    
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
     * Gets the "importmapid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getImportmapid();
    
    /**
     * True if has "importmapid" element
     */
    boolean isSetImportmapid();
    
    /**
     * Sets the "importmapid" element
     */
    void setImportmapid(com.microsoft.schemas.crm._2006.webservices.Key importmapid);
    
    /**
     * Appends and returns a new empty "importmapid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewImportmapid();
    
    /**
     * Unsets the "importmapid" element
     */
    void unsetImportmapid();
    
    /**
     * Gets the "importmaptype" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getImportmaptype();
    
    /**
     * True if has "importmaptype" element
     */
    boolean isSetImportmaptype();
    
    /**
     * Sets the "importmaptype" element
     */
    void setImportmaptype(com.microsoft.schemas.crm._2006.webservices.Picklist importmaptype);
    
    /**
     * Appends and returns a new empty "importmaptype" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewImportmaptype();
    
    /**
     * Unsets the "importmaptype" element
     */
    void unsetImportmaptype();
    
    /**
     * Gets the "isvalidforimport" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsvalidforimport();
    
    /**
     * True if has "isvalidforimport" element
     */
    boolean isSetIsvalidforimport();
    
    /**
     * Sets the "isvalidforimport" element
     */
    void setIsvalidforimport(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isvalidforimport);
    
    /**
     * Appends and returns a new empty "isvalidforimport" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsvalidforimport();
    
    /**
     * Unsets the "isvalidforimport" element
     */
    void unsetIsvalidforimport();
    
    /**
     * Gets the "iswizardcreated" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIswizardcreated();
    
    /**
     * True if has "iswizardcreated" element
     */
    boolean isSetIswizardcreated();
    
    /**
     * Sets the "iswizardcreated" element
     */
    void setIswizardcreated(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iswizardcreated);
    
    /**
     * Appends and returns a new empty "iswizardcreated" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIswizardcreated();
    
    /**
     * Unsets the "iswizardcreated" element
     */
    void unsetIswizardcreated();
    
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
     * Gets the "ownerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Owner getOwnerid();
    
    /**
     * True if has "ownerid" element
     */
    boolean isSetOwnerid();
    
    /**
     * Sets the "ownerid" element
     */
    void setOwnerid(com.microsoft.schemas.crm._2006.webservices.Owner ownerid);
    
    /**
     * Appends and returns a new empty "ownerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Owner addNewOwnerid();
    
    /**
     * Unsets the "ownerid" element
     */
    void unsetOwnerid();
    
    /**
     * Gets the "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOwningbusinessunit();
    
    /**
     * True if has "owningbusinessunit" element
     */
    boolean isSetOwningbusinessunit();
    
    /**
     * Sets the "owningbusinessunit" element
     */
    void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.Lookup owningbusinessunit);
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOwningbusinessunit();
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    void unsetOwningbusinessunit();
    
    /**
     * Gets the "source" element
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "source" element
     */
    org.apache.xmlbeans.XmlString xgetSource();
    
    /**
     * True if has "source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "source" element
     */
    void xsetSource(org.apache.xmlbeans.XmlString source);
    
    /**
     * Unsets the "source" element
     */
    void unsetSource();
    
    /**
     * Gets the "sourceuseridentifierforsourcecrmuserlink" element
     */
    java.lang.String getSourceuseridentifierforsourcecrmuserlink();
    
    /**
     * Gets (as xml) the "sourceuseridentifierforsourcecrmuserlink" element
     */
    org.apache.xmlbeans.XmlString xgetSourceuseridentifierforsourcecrmuserlink();
    
    /**
     * True if has "sourceuseridentifierforsourcecrmuserlink" element
     */
    boolean isSetSourceuseridentifierforsourcecrmuserlink();
    
    /**
     * Sets the "sourceuseridentifierforsourcecrmuserlink" element
     */
    void setSourceuseridentifierforsourcecrmuserlink(java.lang.String sourceuseridentifierforsourcecrmuserlink);
    
    /**
     * Sets (as xml) the "sourceuseridentifierforsourcecrmuserlink" element
     */
    void xsetSourceuseridentifierforsourcecrmuserlink(org.apache.xmlbeans.XmlString sourceuseridentifierforsourcecrmuserlink);
    
    /**
     * Unsets the "sourceuseridentifierforsourcecrmuserlink" element
     */
    void unsetSourceuseridentifierforsourcecrmuserlink();
    
    /**
     * Gets the "sourceuseridentifierforsourcedatasourceuserlink" element
     */
    java.lang.String getSourceuseridentifierforsourcedatasourceuserlink();
    
    /**
     * Gets (as xml) the "sourceuseridentifierforsourcedatasourceuserlink" element
     */
    org.apache.xmlbeans.XmlString xgetSourceuseridentifierforsourcedatasourceuserlink();
    
    /**
     * True if has "sourceuseridentifierforsourcedatasourceuserlink" element
     */
    boolean isSetSourceuseridentifierforsourcedatasourceuserlink();
    
    /**
     * Sets the "sourceuseridentifierforsourcedatasourceuserlink" element
     */
    void setSourceuseridentifierforsourcedatasourceuserlink(java.lang.String sourceuseridentifierforsourcedatasourceuserlink);
    
    /**
     * Sets (as xml) the "sourceuseridentifierforsourcedatasourceuserlink" element
     */
    void xsetSourceuseridentifierforsourcedatasourceuserlink(org.apache.xmlbeans.XmlString sourceuseridentifierforsourcedatasourceuserlink);
    
    /**
     * Unsets the "sourceuseridentifierforsourcedatasourceuserlink" element
     */
    void unsetSourceuseridentifierforsourcedatasourceuserlink();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ImportMapStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.ImportMapStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ImportMapStateInfo addNewStatecode();
    
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
     * Gets the "targetentity" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getTargetentity();
    
    /**
     * True if has "targetentity" element
     */
    boolean isSetTargetentity();
    
    /**
     * Sets the "targetentity" element
     */
    void setTargetentity(com.microsoft.schemas.crm._2006.webservices.Picklist targetentity);
    
    /**
     * Appends and returns a new empty "targetentity" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewTargetentity();
    
    /**
     * Unsets the "targetentity" element
     */
    void unsetTargetentity();
    
    /**
     * Gets the "targetuseridentifierforsourcecrmuserlink" element
     */
    java.lang.String getTargetuseridentifierforsourcecrmuserlink();
    
    /**
     * Gets (as xml) the "targetuseridentifierforsourcecrmuserlink" element
     */
    org.apache.xmlbeans.XmlString xgetTargetuseridentifierforsourcecrmuserlink();
    
    /**
     * True if has "targetuseridentifierforsourcecrmuserlink" element
     */
    boolean isSetTargetuseridentifierforsourcecrmuserlink();
    
    /**
     * Sets the "targetuseridentifierforsourcecrmuserlink" element
     */
    void setTargetuseridentifierforsourcecrmuserlink(java.lang.String targetuseridentifierforsourcecrmuserlink);
    
    /**
     * Sets (as xml) the "targetuseridentifierforsourcecrmuserlink" element
     */
    void xsetTargetuseridentifierforsourcecrmuserlink(org.apache.xmlbeans.XmlString targetuseridentifierforsourcecrmuserlink);
    
    /**
     * Unsets the "targetuseridentifierforsourcecrmuserlink" element
     */
    void unsetTargetuseridentifierforsourcecrmuserlink();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Importmap newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Importmap parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Importmap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
