/*
 * XML Type:  transformationparametermapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML transformationparametermapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Transformationparametermapping extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Transformationparametermapping.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("transformationparametermappingb90ctype");
    
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
     * Gets the "datatypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getDatatypecode();
    
    /**
     * True if has "datatypecode" element
     */
    boolean isSetDatatypecode();
    
    /**
     * Sets the "datatypecode" element
     */
    void setDatatypecode(com.microsoft.schemas.crm._2006.webservices.Picklist datatypecode);
    
    /**
     * Appends and returns a new empty "datatypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewDatatypecode();
    
    /**
     * Unsets the "datatypecode" element
     */
    void unsetDatatypecode();
    
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
     * Gets the "parameterarrayindex" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getParameterarrayindex();
    
    /**
     * True if has "parameterarrayindex" element
     */
    boolean isSetParameterarrayindex();
    
    /**
     * Sets the "parameterarrayindex" element
     */
    void setParameterarrayindex(com.microsoft.schemas.crm._2006.webservices.CrmNumber parameterarrayindex);
    
    /**
     * Appends and returns a new empty "parameterarrayindex" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewParameterarrayindex();
    
    /**
     * Unsets the "parameterarrayindex" element
     */
    void unsetParameterarrayindex();
    
    /**
     * Gets the "parametersequence" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getParametersequence();
    
    /**
     * True if has "parametersequence" element
     */
    boolean isSetParametersequence();
    
    /**
     * Sets the "parametersequence" element
     */
    void setParametersequence(com.microsoft.schemas.crm._2006.webservices.CrmNumber parametersequence);
    
    /**
     * Appends and returns a new empty "parametersequence" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewParametersequence();
    
    /**
     * Unsets the "parametersequence" element
     */
    void unsetParametersequence();
    
    /**
     * Gets the "parametertypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getParametertypecode();
    
    /**
     * True if has "parametertypecode" element
     */
    boolean isSetParametertypecode();
    
    /**
     * Sets the "parametertypecode" element
     */
    void setParametertypecode(com.microsoft.schemas.crm._2006.webservices.Picklist parametertypecode);
    
    /**
     * Appends and returns a new empty "parametertypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewParametertypecode();
    
    /**
     * Unsets the "parametertypecode" element
     */
    void unsetParametertypecode();
    
    /**
     * Gets the "transformationmappingid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getTransformationmappingid();
    
    /**
     * True if has "transformationmappingid" element
     */
    boolean isSetTransformationmappingid();
    
    /**
     * Sets the "transformationmappingid" element
     */
    void setTransformationmappingid(com.microsoft.schemas.crm._2006.webservices.Lookup transformationmappingid);
    
    /**
     * Appends and returns a new empty "transformationmappingid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewTransformationmappingid();
    
    /**
     * Unsets the "transformationmappingid" element
     */
    void unsetTransformationmappingid();
    
    /**
     * Gets the "transformationparametermappingid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getTransformationparametermappingid();
    
    /**
     * True if has "transformationparametermappingid" element
     */
    boolean isSetTransformationparametermappingid();
    
    /**
     * Sets the "transformationparametermappingid" element
     */
    void setTransformationparametermappingid(com.microsoft.schemas.crm._2006.webservices.Key transformationparametermappingid);
    
    /**
     * Appends and returns a new empty "transformationparametermappingid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewTransformationparametermappingid();
    
    /**
     * Unsets the "transformationparametermappingid" element
     */
    void unsetTransformationparametermappingid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
