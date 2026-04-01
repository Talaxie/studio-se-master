/*
 * XML Type:  CorrelationToken
 * Namespace: http://schemas.microsoft.com/crm/2007/CoreTypes
 * Java type: com.microsoft.schemas.crm._2007.coretypes.CorrelationToken
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.coretypes;


/**
 * An XML CorrelationToken(@http://schemas.microsoft.com/crm/2007/CoreTypes).
 *
 * This is a complex type.
 */
public interface CorrelationToken extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CorrelationToken.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("correlationtoken613dtype");
    
    /**
     * Gets the "CorrelationId" element
     */
    java.lang.String getCorrelationId();
    
    /**
     * Gets (as xml) the "CorrelationId" element
     */
    com.microsoft.wsdl.types.Guid xgetCorrelationId();
    
    /**
     * Sets the "CorrelationId" element
     */
    void setCorrelationId(java.lang.String correlationId);
    
    /**
     * Sets (as xml) the "CorrelationId" element
     */
    void xsetCorrelationId(com.microsoft.wsdl.types.Guid correlationId);
    
    /**
     * Gets the "CorrelationUpdatedTime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCorrelationUpdatedTime();
    
    /**
     * True if has "CorrelationUpdatedTime" element
     */
    boolean isSetCorrelationUpdatedTime();
    
    /**
     * Sets the "CorrelationUpdatedTime" element
     */
    void setCorrelationUpdatedTime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime correlationUpdatedTime);
    
    /**
     * Appends and returns a new empty "CorrelationUpdatedTime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCorrelationUpdatedTime();
    
    /**
     * Unsets the "CorrelationUpdatedTime" element
     */
    void unsetCorrelationUpdatedTime();
    
    /**
     * Gets the "Depth" element
     */
    int getDepth();
    
    /**
     * Gets (as xml) the "Depth" element
     */
    org.apache.xmlbeans.XmlInt xgetDepth();
    
    /**
     * Sets the "Depth" element
     */
    void setDepth(int depth);
    
    /**
     * Sets (as xml) the "Depth" element
     */
    void xsetDepth(org.apache.xmlbeans.XmlInt depth);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken newInstance() {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.coretypes.CorrelationToken parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.coretypes.CorrelationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
