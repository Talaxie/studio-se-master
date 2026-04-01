/*
 * XML Type:  template
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Template
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML template(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Template extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Template.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("template4138type");
    
    /**
     * Gets the "body" element
     */
    java.lang.String getBody();
    
    /**
     * Gets (as xml) the "body" element
     */
    org.apache.xmlbeans.XmlString xgetBody();
    
    /**
     * True if has "body" element
     */
    boolean isSetBody();
    
    /**
     * Sets the "body" element
     */
    void setBody(java.lang.String body);
    
    /**
     * Sets (as xml) the "body" element
     */
    void xsetBody(org.apache.xmlbeans.XmlString body);
    
    /**
     * Unsets the "body" element
     */
    void unsetBody();
    
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
     * Gets the "generationtypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getGenerationtypecode();
    
    /**
     * True if has "generationtypecode" element
     */
    boolean isSetGenerationtypecode();
    
    /**
     * Sets the "generationtypecode" element
     */
    void setGenerationtypecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber generationtypecode);
    
    /**
     * Appends and returns a new empty "generationtypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewGenerationtypecode();
    
    /**
     * Unsets the "generationtypecode" element
     */
    void unsetGenerationtypecode();
    
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
     * Gets the "ispersonal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIspersonal();
    
    /**
     * True if has "ispersonal" element
     */
    boolean isSetIspersonal();
    
    /**
     * Sets the "ispersonal" element
     */
    void setIspersonal(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ispersonal);
    
    /**
     * Appends and returns a new empty "ispersonal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIspersonal();
    
    /**
     * Unsets the "ispersonal" element
     */
    void unsetIspersonal();
    
    /**
     * Gets the "languagecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getLanguagecode();
    
    /**
     * True if has "languagecode" element
     */
    boolean isSetLanguagecode();
    
    /**
     * Sets the "languagecode" element
     */
    void setLanguagecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber languagecode);
    
    /**
     * Appends and returns a new empty "languagecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLanguagecode();
    
    /**
     * Unsets the "languagecode" element
     */
    void unsetLanguagecode();
    
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
     * Gets the "presentationxml" element
     */
    java.lang.String getPresentationxml();
    
    /**
     * Gets (as xml) the "presentationxml" element
     */
    org.apache.xmlbeans.XmlString xgetPresentationxml();
    
    /**
     * True if has "presentationxml" element
     */
    boolean isSetPresentationxml();
    
    /**
     * Sets the "presentationxml" element
     */
    void setPresentationxml(java.lang.String presentationxml);
    
    /**
     * Sets (as xml) the "presentationxml" element
     */
    void xsetPresentationxml(org.apache.xmlbeans.XmlString presentationxml);
    
    /**
     * Unsets the "presentationxml" element
     */
    void unsetPresentationxml();
    
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
     * Gets the "subjectpresentationxml" element
     */
    java.lang.String getSubjectpresentationxml();
    
    /**
     * Gets (as xml) the "subjectpresentationxml" element
     */
    org.apache.xmlbeans.XmlString xgetSubjectpresentationxml();
    
    /**
     * True if has "subjectpresentationxml" element
     */
    boolean isSetSubjectpresentationxml();
    
    /**
     * Sets the "subjectpresentationxml" element
     */
    void setSubjectpresentationxml(java.lang.String subjectpresentationxml);
    
    /**
     * Sets (as xml) the "subjectpresentationxml" element
     */
    void xsetSubjectpresentationxml(org.apache.xmlbeans.XmlString subjectpresentationxml);
    
    /**
     * Unsets the "subjectpresentationxml" element
     */
    void unsetSubjectpresentationxml();
    
    /**
     * Gets the "templateid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getTemplateid();
    
    /**
     * True if has "templateid" element
     */
    boolean isSetTemplateid();
    
    /**
     * Sets the "templateid" element
     */
    void setTemplateid(com.microsoft.schemas.crm._2006.webservices.Key templateid);
    
    /**
     * Appends and returns a new empty "templateid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewTemplateid();
    
    /**
     * Unsets the "templateid" element
     */
    void unsetTemplateid();
    
    /**
     * Gets the "templatetypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference getTemplatetypecode();
    
    /**
     * True if has "templatetypecode" element
     */
    boolean isSetTemplatetypecode();
    
    /**
     * Sets the "templatetypecode" element
     */
    void setTemplatetypecode(com.microsoft.schemas.crm._2006.webservices.EntityNameReference templatetypecode);
    
    /**
     * Appends and returns a new empty "templatetypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewTemplatetypecode();
    
    /**
     * Unsets the "templatetypecode" element
     */
    void unsetTemplatetypecode();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Template newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Template parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Template) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
