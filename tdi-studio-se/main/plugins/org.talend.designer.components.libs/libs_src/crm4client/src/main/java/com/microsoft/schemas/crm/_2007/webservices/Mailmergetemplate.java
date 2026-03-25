/*
 * XML Type:  mailmergetemplate
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML mailmergetemplate(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Mailmergetemplate extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mailmergetemplate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("mailmergetemplate82a7type");
    
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
     * Gets the "defaultfilter" element
     */
    java.lang.String getDefaultfilter();
    
    /**
     * Gets (as xml) the "defaultfilter" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultfilter();
    
    /**
     * True if has "defaultfilter" element
     */
    boolean isSetDefaultfilter();
    
    /**
     * Sets the "defaultfilter" element
     */
    void setDefaultfilter(java.lang.String defaultfilter);
    
    /**
     * Sets (as xml) the "defaultfilter" element
     */
    void xsetDefaultfilter(org.apache.xmlbeans.XmlString defaultfilter);
    
    /**
     * Unsets the "defaultfilter" element
     */
    void unsetDefaultfilter();
    
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
     * Gets the "documentformat" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getDocumentformat();
    
    /**
     * True if has "documentformat" element
     */
    boolean isSetDocumentformat();
    
    /**
     * Sets the "documentformat" element
     */
    void setDocumentformat(com.microsoft.schemas.crm._2006.webservices.Picklist documentformat);
    
    /**
     * Appends and returns a new empty "documentformat" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewDocumentformat();
    
    /**
     * Unsets the "documentformat" element
     */
    void unsetDocumentformat();
    
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
     * Gets the "mailmergetemplateid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getMailmergetemplateid();
    
    /**
     * True if has "mailmergetemplateid" element
     */
    boolean isSetMailmergetemplateid();
    
    /**
     * Sets the "mailmergetemplateid" element
     */
    void setMailmergetemplateid(com.microsoft.schemas.crm._2006.webservices.Key mailmergetemplateid);
    
    /**
     * Appends and returns a new empty "mailmergetemplateid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewMailmergetemplateid();
    
    /**
     * Unsets the "mailmergetemplateid" element
     */
    void unsetMailmergetemplateid();
    
    /**
     * Gets the "mailmergetype" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getMailmergetype();
    
    /**
     * True if has "mailmergetype" element
     */
    boolean isSetMailmergetype();
    
    /**
     * Sets the "mailmergetype" element
     */
    void setMailmergetype(com.microsoft.schemas.crm._2006.webservices.Picklist mailmergetype);
    
    /**
     * Appends and returns a new empty "mailmergetype" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewMailmergetype();
    
    /**
     * Unsets the "mailmergetype" element
     */
    void unsetMailmergetype();
    
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
     * Gets the "parameterxml" element
     */
    java.lang.String getParameterxml();
    
    /**
     * Gets (as xml) the "parameterxml" element
     */
    org.apache.xmlbeans.XmlString xgetParameterxml();
    
    /**
     * True if has "parameterxml" element
     */
    boolean isSetParameterxml();
    
    /**
     * Sets the "parameterxml" element
     */
    void setParameterxml(java.lang.String parameterxml);
    
    /**
     * Sets (as xml) the "parameterxml" element
     */
    void xsetParameterxml(org.apache.xmlbeans.XmlString parameterxml);
    
    /**
     * Unsets the "parameterxml" element
     */
    void unsetParameterxml();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.MailMergeTemplateStateInfo addNewStatecode();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Mailmergetemplate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
