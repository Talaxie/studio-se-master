/*
 * XML Type:  LogSuccessBulkOperationRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML LogSuccessBulkOperationRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface LogSuccessBulkOperationRequest extends com.microsoft.schemas.crm._2007.webservices.Request
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LogSuccessBulkOperationRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("logsuccessbulkoperationrequest8177type");
    
    /**
     * Gets the "BulkOperationId" element
     */
    java.lang.String getBulkOperationId();
    
    /**
     * Gets (as xml) the "BulkOperationId" element
     */
    com.microsoft.wsdl.types.Guid xgetBulkOperationId();
    
    /**
     * Sets the "BulkOperationId" element
     */
    void setBulkOperationId(java.lang.String bulkOperationId);
    
    /**
     * Sets (as xml) the "BulkOperationId" element
     */
    void xsetBulkOperationId(com.microsoft.wsdl.types.Guid bulkOperationId);
    
    /**
     * Gets the "RegardingObjectId" element
     */
    java.lang.String getRegardingObjectId();
    
    /**
     * Gets (as xml) the "RegardingObjectId" element
     */
    com.microsoft.wsdl.types.Guid xgetRegardingObjectId();
    
    /**
     * Sets the "RegardingObjectId" element
     */
    void setRegardingObjectId(java.lang.String regardingObjectId);
    
    /**
     * Sets (as xml) the "RegardingObjectId" element
     */
    void xsetRegardingObjectId(com.microsoft.wsdl.types.Guid regardingObjectId);
    
    /**
     * Gets the "RegardingObjectTypeCode" element
     */
    int getRegardingObjectTypeCode();
    
    /**
     * Gets (as xml) the "RegardingObjectTypeCode" element
     */
    org.apache.xmlbeans.XmlInt xgetRegardingObjectTypeCode();
    
    /**
     * Sets the "RegardingObjectTypeCode" element
     */
    void setRegardingObjectTypeCode(int regardingObjectTypeCode);
    
    /**
     * Sets (as xml) the "RegardingObjectTypeCode" element
     */
    void xsetRegardingObjectTypeCode(org.apache.xmlbeans.XmlInt regardingObjectTypeCode);
    
    /**
     * Gets the "CreatedObjectId" element
     */
    java.lang.String getCreatedObjectId();
    
    /**
     * Gets (as xml) the "CreatedObjectId" element
     */
    com.microsoft.wsdl.types.Guid xgetCreatedObjectId();
    
    /**
     * Sets the "CreatedObjectId" element
     */
    void setCreatedObjectId(java.lang.String createdObjectId);
    
    /**
     * Sets (as xml) the "CreatedObjectId" element
     */
    void xsetCreatedObjectId(com.microsoft.wsdl.types.Guid createdObjectId);
    
    /**
     * Gets the "CreatedObjectTypeCode" element
     */
    int getCreatedObjectTypeCode();
    
    /**
     * Gets (as xml) the "CreatedObjectTypeCode" element
     */
    org.apache.xmlbeans.XmlInt xgetCreatedObjectTypeCode();
    
    /**
     * Sets the "CreatedObjectTypeCode" element
     */
    void setCreatedObjectTypeCode(int createdObjectTypeCode);
    
    /**
     * Sets (as xml) the "CreatedObjectTypeCode" element
     */
    void xsetCreatedObjectTypeCode(org.apache.xmlbeans.XmlInt createdObjectTypeCode);
    
    /**
     * Gets the "AdditionalInfo" element
     */
    java.lang.String getAdditionalInfo();
    
    /**
     * Gets (as xml) the "AdditionalInfo" element
     */
    org.apache.xmlbeans.XmlString xgetAdditionalInfo();
    
    /**
     * Sets the "AdditionalInfo" element
     */
    void setAdditionalInfo(java.lang.String additionalInfo);
    
    /**
     * Sets (as xml) the "AdditionalInfo" element
     */
    void xsetAdditionalInfo(org.apache.xmlbeans.XmlString additionalInfo);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
