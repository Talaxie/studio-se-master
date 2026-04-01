/*
 * XML Type:  annotation
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Annotation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML annotation(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Annotation extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Annotation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("annotation426dtype");
    
    /**
     * Gets the "annotationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getAnnotationid();
    
    /**
     * True if has "annotationid" element
     */
    boolean isSetAnnotationid();
    
    /**
     * Sets the "annotationid" element
     */
    void setAnnotationid(com.microsoft.schemas.crm._2006.webservices.Key annotationid);
    
    /**
     * Appends and returns a new empty "annotationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewAnnotationid();
    
    /**
     * Unsets the "annotationid" element
     */
    void unsetAnnotationid();
    
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
     * Gets the "isdocument" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsdocument();
    
    /**
     * True if has "isdocument" element
     */
    boolean isSetIsdocument();
    
    /**
     * Sets the "isdocument" element
     */
    void setIsdocument(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isdocument);
    
    /**
     * Appends and returns a new empty "isdocument" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsdocument();
    
    /**
     * Unsets the "isdocument" element
     */
    void unsetIsdocument();
    
    /**
     * Gets the "langid" element
     */
    java.lang.String getLangid();
    
    /**
     * Gets (as xml) the "langid" element
     */
    org.apache.xmlbeans.XmlString xgetLangid();
    
    /**
     * True if has "langid" element
     */
    boolean isSetLangid();
    
    /**
     * Sets the "langid" element
     */
    void setLangid(java.lang.String langid);
    
    /**
     * Sets (as xml) the "langid" element
     */
    void xsetLangid(org.apache.xmlbeans.XmlString langid);
    
    /**
     * Unsets the "langid" element
     */
    void unsetLangid();
    
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
     * Gets the "notetext" element
     */
    java.lang.String getNotetext();
    
    /**
     * Gets (as xml) the "notetext" element
     */
    org.apache.xmlbeans.XmlString xgetNotetext();
    
    /**
     * True if has "notetext" element
     */
    boolean isSetNotetext();
    
    /**
     * Sets the "notetext" element
     */
    void setNotetext(java.lang.String notetext);
    
    /**
     * Sets (as xml) the "notetext" element
     */
    void xsetNotetext(org.apache.xmlbeans.XmlString notetext);
    
    /**
     * Unsets the "notetext" element
     */
    void unsetNotetext();
    
    /**
     * Gets the "objectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getObjectid();
    
    /**
     * True if has "objectid" element
     */
    boolean isSetObjectid();
    
    /**
     * Sets the "objectid" element
     */
    void setObjectid(com.microsoft.schemas.crm._2006.webservices.Lookup objectid);
    
    /**
     * Appends and returns a new empty "objectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewObjectid();
    
    /**
     * Unsets the "objectid" element
     */
    void unsetObjectid();
    
    /**
     * Gets the "objecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference getObjecttypecode();
    
    /**
     * True if has "objecttypecode" element
     */
    boolean isSetObjecttypecode();
    
    /**
     * Sets the "objecttypecode" element
     */
    void setObjecttypecode(com.microsoft.schemas.crm._2006.webservices.EntityNameReference objecttypecode);
    
    /**
     * Appends and returns a new empty "objecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewObjecttypecode();
    
    /**
     * Unsets the "objecttypecode" element
     */
    void unsetObjecttypecode();
    
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
     * Gets the "stepid" element
     */
    java.lang.String getStepid();
    
    /**
     * Gets (as xml) the "stepid" element
     */
    org.apache.xmlbeans.XmlString xgetStepid();
    
    /**
     * True if has "stepid" element
     */
    boolean isSetStepid();
    
    /**
     * Sets the "stepid" element
     */
    void setStepid(java.lang.String stepid);
    
    /**
     * Sets (as xml) the "stepid" element
     */
    void xsetStepid(org.apache.xmlbeans.XmlString stepid);
    
    /**
     * Unsets the "stepid" element
     */
    void unsetStepid();
    
    /**
     * Gets the "subject" element
     */
    java.lang.String getSubject();
    
    /**
     * Gets (as xml) the "subject" element
     */
    org.apache.xmlbeans.XmlString xgetSubject();
    
    /**
     * True if has "subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(java.lang.String subject);
    
    /**
     * Sets (as xml) the "subject" element
     */
    void xsetSubject(org.apache.xmlbeans.XmlString subject);
    
    /**
     * Unsets the "subject" element
     */
    void unsetSubject();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Annotation newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Annotation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Annotation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
