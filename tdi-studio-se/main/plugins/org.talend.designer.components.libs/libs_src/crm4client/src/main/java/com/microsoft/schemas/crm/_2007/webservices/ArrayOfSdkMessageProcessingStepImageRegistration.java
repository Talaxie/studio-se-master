/*
 * XML Type:  ArrayOfSdkMessageProcessingStepImageRegistration
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML ArrayOfSdkMessageProcessingStepImageRegistration(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface ArrayOfSdkMessageProcessingStepImageRegistration extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfSdkMessageProcessingStepImageRegistration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("arrayofsdkmessageprocessingstepimageregistrationd6f6type");
    
    /**
     * Gets array of all "SdkMessageProcessingStepImageRegistration" elements
     */
    com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration[] getSdkMessageProcessingStepImageRegistrationArray();
    
    /**
     * Gets ith "SdkMessageProcessingStepImageRegistration" element
     */
    com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration getSdkMessageProcessingStepImageRegistrationArray(int i);
    
    /**
     * Tests for nil ith "SdkMessageProcessingStepImageRegistration" element
     */
    boolean isNilSdkMessageProcessingStepImageRegistrationArray(int i);
    
    /**
     * Returns number of "SdkMessageProcessingStepImageRegistration" element
     */
    int sizeOfSdkMessageProcessingStepImageRegistrationArray();
    
    /**
     * Sets array of all "SdkMessageProcessingStepImageRegistration" element
     */
    void setSdkMessageProcessingStepImageRegistrationArray(com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration[] sdkMessageProcessingStepImageRegistrationArray);
    
    /**
     * Sets ith "SdkMessageProcessingStepImageRegistration" element
     */
    void setSdkMessageProcessingStepImageRegistrationArray(int i, com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration sdkMessageProcessingStepImageRegistration);
    
    /**
     * Nils the ith "SdkMessageProcessingStepImageRegistration" element
     */
    void setNilSdkMessageProcessingStepImageRegistrationArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SdkMessageProcessingStepImageRegistration" element
     */
    com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration insertNewSdkMessageProcessingStepImageRegistration(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SdkMessageProcessingStepImageRegistration" element
     */
    com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration addNewSdkMessageProcessingStepImageRegistration();
    
    /**
     * Removes the ith "SdkMessageProcessingStepImageRegistration" element
     */
    void removeSdkMessageProcessingStepImageRegistration(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
