/*
 * XML Type:  salesliteratureitem
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML salesliteratureitem(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Salesliteratureitem extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Salesliteratureitem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("salesliteratureitem813ctype");
    
    /**
     * Gets the "abstract" element
     */
    java.lang.String getAbstract();
    
    /**
     * Gets (as xml) the "abstract" element
     */
    org.apache.xmlbeans.XmlString xgetAbstract();
    
    /**
     * True if has "abstract" element
     */
    boolean isSetAbstract();
    
    /**
     * Sets the "abstract" element
     */
    void setAbstract(java.lang.String xabstract);
    
    /**
     * Sets (as xml) the "abstract" element
     */
    void xsetAbstract(org.apache.xmlbeans.XmlString xabstract);
    
    /**
     * Unsets the "abstract" element
     */
    void unsetAbstract();
    
    /**
     * Gets the "attacheddocumenturl" element
     */
    java.lang.String getAttacheddocumenturl();
    
    /**
     * Gets (as xml) the "attacheddocumenturl" element
     */
    org.apache.xmlbeans.XmlString xgetAttacheddocumenturl();
    
    /**
     * True if has "attacheddocumenturl" element
     */
    boolean isSetAttacheddocumenturl();
    
    /**
     * Sets the "attacheddocumenturl" element
     */
    void setAttacheddocumenturl(java.lang.String attacheddocumenturl);
    
    /**
     * Sets (as xml) the "attacheddocumenturl" element
     */
    void xsetAttacheddocumenturl(org.apache.xmlbeans.XmlString attacheddocumenturl);
    
    /**
     * Unsets the "attacheddocumenturl" element
     */
    void unsetAttacheddocumenturl();
    
    /**
     * Gets the "authorname" element
     */
    java.lang.String getAuthorname();
    
    /**
     * Gets (as xml) the "authorname" element
     */
    org.apache.xmlbeans.XmlString xgetAuthorname();
    
    /**
     * True if has "authorname" element
     */
    boolean isSetAuthorname();
    
    /**
     * Sets the "authorname" element
     */
    void setAuthorname(java.lang.String authorname);
    
    /**
     * Sets (as xml) the "authorname" element
     */
    void xsetAuthorname(org.apache.xmlbeans.XmlString authorname);
    
    /**
     * Unsets the "authorname" element
     */
    void unsetAuthorname();
    
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
     * Gets the "documentbody" element
     */
    java.lang.String getDocumentbody();
    
    /**
     * Gets (as xml) the "documentbody" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentbody();
    
    /**
     * True if has "documentbody" element
     */
    boolean isSetDocumentbody();
    
    /**
     * Sets the "documentbody" element
     */
    void setDocumentbody(java.lang.String documentbody);
    
    /**
     * Sets (as xml) the "documentbody" element
     */
    void xsetDocumentbody(org.apache.xmlbeans.XmlString documentbody);
    
    /**
     * Unsets the "documentbody" element
     */
    void unsetDocumentbody();
    
    /**
     * Gets the "filename" element
     */
    java.lang.String getFilename();
    
    /**
     * Gets (as xml) the "filename" element
     */
    org.apache.xmlbeans.XmlString xgetFilename();
    
    /**
     * True if has "filename" element
     */
    boolean isSetFilename();
    
    /**
     * Sets the "filename" element
     */
    void setFilename(java.lang.String filename);
    
    /**
     * Sets (as xml) the "filename" element
     */
    void xsetFilename(org.apache.xmlbeans.XmlString filename);
    
    /**
     * Unsets the "filename" element
     */
    void unsetFilename();
    
    /**
     * Gets the "filesize" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getFilesize();
    
    /**
     * True if has "filesize" element
     */
    boolean isSetFilesize();
    
    /**
     * Sets the "filesize" element
     */
    void setFilesize(com.microsoft.schemas.crm._2006.webservices.CrmNumber filesize);
    
    /**
     * Appends and returns a new empty "filesize" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFilesize();
    
    /**
     * Unsets the "filesize" element
     */
    void unsetFilesize();
    
    /**
     * Gets the "filetypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getFiletypecode();
    
    /**
     * True if has "filetypecode" element
     */
    boolean isSetFiletypecode();
    
    /**
     * Sets the "filetypecode" element
     */
    void setFiletypecode(com.microsoft.schemas.crm._2006.webservices.Picklist filetypecode);
    
    /**
     * Appends and returns a new empty "filetypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewFiletypecode();
    
    /**
     * Unsets the "filetypecode" element
     */
    void unsetFiletypecode();
    
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
     * Gets the "iscustomerviewable" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIscustomerviewable();
    
    /**
     * True if has "iscustomerviewable" element
     */
    boolean isSetIscustomerviewable();
    
    /**
     * Sets the "iscustomerviewable" element
     */
    void setIscustomerviewable(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iscustomerviewable);
    
    /**
     * Appends and returns a new empty "iscustomerviewable" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIscustomerviewable();
    
    /**
     * Unsets the "iscustomerviewable" element
     */
    void unsetIscustomerviewable();
    
    /**
     * Gets the "keywords" element
     */
    java.lang.String getKeywords();
    
    /**
     * Gets (as xml) the "keywords" element
     */
    org.apache.xmlbeans.XmlString xgetKeywords();
    
    /**
     * True if has "keywords" element
     */
    boolean isSetKeywords();
    
    /**
     * Sets the "keywords" element
     */
    void setKeywords(java.lang.String keywords);
    
    /**
     * Sets (as xml) the "keywords" element
     */
    void xsetKeywords(org.apache.xmlbeans.XmlString keywords);
    
    /**
     * Unsets the "keywords" element
     */
    void unsetKeywords();
    
    /**
     * Gets the "mimetype" element
     */
    java.lang.String getMimetype();
    
    /**
     * Gets (as xml) the "mimetype" element
     */
    org.apache.xmlbeans.XmlString xgetMimetype();
    
    /**
     * True if has "mimetype" element
     */
    boolean isSetMimetype();
    
    /**
     * Sets the "mimetype" element
     */
    void setMimetype(java.lang.String mimetype);
    
    /**
     * Sets (as xml) the "mimetype" element
     */
    void xsetMimetype(org.apache.xmlbeans.XmlString mimetype);
    
    /**
     * Unsets the "mimetype" element
     */
    void unsetMimetype();
    
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
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOrganizationid();
    
    /**
     * True if has "organizationid" element
     */
    boolean isSetOrganizationid();
    
    /**
     * Sets the "organizationid" element
     */
    void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier organizationid);
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOrganizationid();
    
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
     * Gets the "salesliteratureid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getSalesliteratureid();
    
    /**
     * True if has "salesliteratureid" element
     */
    boolean isSetSalesliteratureid();
    
    /**
     * Sets the "salesliteratureid" element
     */
    void setSalesliteratureid(com.microsoft.schemas.crm._2006.webservices.Lookup salesliteratureid);
    
    /**
     * Appends and returns a new empty "salesliteratureid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewSalesliteratureid();
    
    /**
     * Unsets the "salesliteratureid" element
     */
    void unsetSalesliteratureid();
    
    /**
     * Gets the "salesliteratureitemid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getSalesliteratureitemid();
    
    /**
     * True if has "salesliteratureitemid" element
     */
    boolean isSetSalesliteratureitemid();
    
    /**
     * Sets the "salesliteratureitemid" element
     */
    void setSalesliteratureitemid(com.microsoft.schemas.crm._2006.webservices.Key salesliteratureitemid);
    
    /**
     * Appends and returns a new empty "salesliteratureitemid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewSalesliteratureitemid();
    
    /**
     * Unsets the "salesliteratureitemid" element
     */
    void unsetSalesliteratureitemid();
    
    /**
     * Gets the "title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Salesliteratureitem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
