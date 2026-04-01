/*
 * XML Type:  bulkdeletefailure
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML bulkdeletefailure(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Bulkdeletefailure extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Bulkdeletefailure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("bulkdeletefailure5779type");
    
    /**
     * Gets the "asyncoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getAsyncoperationid();
    
    /**
     * True if has "asyncoperationid" element
     */
    boolean isSetAsyncoperationid();
    
    /**
     * Sets the "asyncoperationid" element
     */
    void setAsyncoperationid(com.microsoft.schemas.crm._2006.webservices.Lookup asyncoperationid);
    
    /**
     * Appends and returns a new empty "asyncoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewAsyncoperationid();
    
    /**
     * Unsets the "asyncoperationid" element
     */
    void unsetAsyncoperationid();
    
    /**
     * Gets the "bulkdeletefailureid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getBulkdeletefailureid();
    
    /**
     * True if has "bulkdeletefailureid" element
     */
    boolean isSetBulkdeletefailureid();
    
    /**
     * Sets the "bulkdeletefailureid" element
     */
    void setBulkdeletefailureid(com.microsoft.schemas.crm._2006.webservices.Key bulkdeletefailureid);
    
    /**
     * Appends and returns a new empty "bulkdeletefailureid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewBulkdeletefailureid();
    
    /**
     * Unsets the "bulkdeletefailureid" element
     */
    void unsetBulkdeletefailureid();
    
    /**
     * Gets the "bulkdeleteoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getBulkdeleteoperationid();
    
    /**
     * True if has "bulkdeleteoperationid" element
     */
    boolean isSetBulkdeleteoperationid();
    
    /**
     * Sets the "bulkdeleteoperationid" element
     */
    void setBulkdeleteoperationid(com.microsoft.schemas.crm._2006.webservices.Lookup bulkdeleteoperationid);
    
    /**
     * Appends and returns a new empty "bulkdeleteoperationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewBulkdeleteoperationid();
    
    /**
     * Unsets the "bulkdeleteoperationid" element
     */
    void unsetBulkdeleteoperationid();
    
    /**
     * Gets the "errordescription" element
     */
    java.lang.String getErrordescription();
    
    /**
     * Gets (as xml) the "errordescription" element
     */
    org.apache.xmlbeans.XmlString xgetErrordescription();
    
    /**
     * True if has "errordescription" element
     */
    boolean isSetErrordescription();
    
    /**
     * Sets the "errordescription" element
     */
    void setErrordescription(java.lang.String errordescription);
    
    /**
     * Sets (as xml) the "errordescription" element
     */
    void xsetErrordescription(org.apache.xmlbeans.XmlString errordescription);
    
    /**
     * Unsets the "errordescription" element
     */
    void unsetErrordescription();
    
    /**
     * Gets the "errornumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getErrornumber();
    
    /**
     * True if has "errornumber" element
     */
    boolean isSetErrornumber();
    
    /**
     * Sets the "errornumber" element
     */
    void setErrornumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber errornumber);
    
    /**
     * Appends and returns a new empty "errornumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewErrornumber();
    
    /**
     * Unsets the "errornumber" element
     */
    void unsetErrornumber();
    
    /**
     * Gets the "orderedqueryindex" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getOrderedqueryindex();
    
    /**
     * True if has "orderedqueryindex" element
     */
    boolean isSetOrderedqueryindex();
    
    /**
     * Sets the "orderedqueryindex" element
     */
    void setOrderedqueryindex(com.microsoft.schemas.crm._2006.webservices.CrmNumber orderedqueryindex);
    
    /**
     * Appends and returns a new empty "orderedqueryindex" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewOrderedqueryindex();
    
    /**
     * Unsets the "orderedqueryindex" element
     */
    void unsetOrderedqueryindex();
    
    /**
     * Gets the "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwningbusinessunit();
    
    /**
     * True if has "owningbusinessunit" element
     */
    boolean isSetOwningbusinessunit();
    
    /**
     * Sets the "owningbusinessunit" element
     */
    void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owningbusinessunit);
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwningbusinessunit();
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    void unsetOwningbusinessunit();
    
    /**
     * Gets the "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwninguser();
    
    /**
     * True if has "owninguser" element
     */
    boolean isSetOwninguser();
    
    /**
     * Sets the "owninguser" element
     */
    void setOwninguser(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owninguser);
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwninguser();
    
    /**
     * Unsets the "owninguser" element
     */
    void unsetOwninguser();
    
    /**
     * Gets the "regardingobjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getRegardingobjectid();
    
    /**
     * True if has "regardingobjectid" element
     */
    boolean isSetRegardingobjectid();
    
    /**
     * Sets the "regardingobjectid" element
     */
    void setRegardingobjectid(com.microsoft.schemas.crm._2006.webservices.Lookup regardingobjectid);
    
    /**
     * Appends and returns a new empty "regardingobjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewRegardingobjectid();
    
    /**
     * Unsets the "regardingobjectid" element
     */
    void unsetRegardingobjectid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
