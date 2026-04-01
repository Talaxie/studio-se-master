/*
 * XML Type:  importdata
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Importdata
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML importdata(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Importdata extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Importdata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("importdatab80dtype");
    
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
     * Gets the "data" element
     */
    java.lang.String getData();
    
    /**
     * Gets (as xml) the "data" element
     */
    org.apache.xmlbeans.XmlString xgetData();
    
    /**
     * True if has "data" element
     */
    boolean isSetData();
    
    /**
     * Sets the "data" element
     */
    void setData(java.lang.String data);
    
    /**
     * Sets (as xml) the "data" element
     */
    void xsetData(org.apache.xmlbeans.XmlString data);
    
    /**
     * Unsets the "data" element
     */
    void unsetData();
    
    /**
     * Gets the "haserror" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getHaserror();
    
    /**
     * True if has "haserror" element
     */
    boolean isSetHaserror();
    
    /**
     * Sets the "haserror" element
     */
    void setHaserror(com.microsoft.schemas.crm._2006.webservices.CrmBoolean haserror);
    
    /**
     * Appends and returns a new empty "haserror" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewHaserror();
    
    /**
     * Unsets the "haserror" element
     */
    void unsetHaserror();
    
    /**
     * Gets the "importdataid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getImportdataid();
    
    /**
     * True if has "importdataid" element
     */
    boolean isSetImportdataid();
    
    /**
     * Sets the "importdataid" element
     */
    void setImportdataid(com.microsoft.schemas.crm._2006.webservices.Key importdataid);
    
    /**
     * Appends and returns a new empty "importdataid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewImportdataid();
    
    /**
     * Unsets the "importdataid" element
     */
    void unsetImportdataid();
    
    /**
     * Gets the "importfileid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getImportfileid();
    
    /**
     * True if has "importfileid" element
     */
    boolean isSetImportfileid();
    
    /**
     * Sets the "importfileid" element
     */
    void setImportfileid(com.microsoft.schemas.crm._2006.webservices.Lookup importfileid);
    
    /**
     * Appends and returns a new empty "importfileid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewImportfileid();
    
    /**
     * Unsets the "importfileid" element
     */
    void unsetImportfileid();
    
    /**
     * Gets the "linenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getLinenumber();
    
    /**
     * True if has "linenumber" element
     */
    boolean isSetLinenumber();
    
    /**
     * Sets the "linenumber" element
     */
    void setLinenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber linenumber);
    
    /**
     * Appends and returns a new empty "linenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLinenumber();
    
    /**
     * Unsets the "linenumber" element
     */
    void unsetLinenumber();
    
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
     * Gets the "recordid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getRecordid();
    
    /**
     * True if has "recordid" element
     */
    boolean isSetRecordid();
    
    /**
     * Sets the "recordid" element
     */
    void setRecordid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier recordid);
    
    /**
     * Appends and returns a new empty "recordid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewRecordid();
    
    /**
     * Unsets the "recordid" element
     */
    void unsetRecordid();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ImportDataStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.ImportDataStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ImportDataStateInfo addNewStatecode();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Importdata newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Importdata parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Importdata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
