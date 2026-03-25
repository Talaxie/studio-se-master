/*
 * XML Type:  CrmAuthenticationToken
 * Namespace: http://schemas.microsoft.com/crm/2007/CoreTypes
 * Java type: com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.coretypes;


/**
 * An XML CrmAuthenticationToken(@http://schemas.microsoft.com/crm/2007/CoreTypes).
 *
 * This is a complex type.
 */
public interface CrmAuthenticationToken extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CrmAuthenticationToken.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("crmauthenticationtokenb889type");
    
    /**
     * Gets the "AuthenticationType" element
     */
    int getAuthenticationType();
    
    /**
     * Gets (as xml) the "AuthenticationType" element
     */
    org.apache.xmlbeans.XmlInt xgetAuthenticationType();
    
    /**
     * Sets the "AuthenticationType" element
     */
    void setAuthenticationType(int authenticationType);
    
    /**
     * Sets (as xml) the "AuthenticationType" element
     */
    void xsetAuthenticationType(org.apache.xmlbeans.XmlInt authenticationType);
    
    /**
     * Gets the "CrmTicket" element
     */
    java.lang.String getCrmTicket();
    
    /**
     * Gets (as xml) the "CrmTicket" element
     */
    org.apache.xmlbeans.XmlString xgetCrmTicket();
    
    /**
     * True if has "CrmTicket" element
     */
    boolean isSetCrmTicket();
    
    /**
     * Sets the "CrmTicket" element
     */
    void setCrmTicket(java.lang.String crmTicket);
    
    /**
     * Sets (as xml) the "CrmTicket" element
     */
    void xsetCrmTicket(org.apache.xmlbeans.XmlString crmTicket);
    
    /**
     * Unsets the "CrmTicket" element
     */
    void unsetCrmTicket();
    
    /**
     * Gets the "OrganizationName" element
     */
    java.lang.String getOrganizationName();
    
    /**
     * Gets (as xml) the "OrganizationName" element
     */
    org.apache.xmlbeans.XmlString xgetOrganizationName();
    
    /**
     * True if has "OrganizationName" element
     */
    boolean isSetOrganizationName();
    
    /**
     * Sets the "OrganizationName" element
     */
    void setOrganizationName(java.lang.String organizationName);
    
    /**
     * Sets (as xml) the "OrganizationName" element
     */
    void xsetOrganizationName(org.apache.xmlbeans.XmlString organizationName);
    
    /**
     * Unsets the "OrganizationName" element
     */
    void unsetOrganizationName();
    
    /**
     * Gets the "CallerId" element
     */
    java.lang.String getCallerId();
    
    /**
     * Gets (as xml) the "CallerId" element
     */
    com.microsoft.wsdl.types.Guid xgetCallerId();
    
    /**
     * Sets the "CallerId" element
     */
    void setCallerId(java.lang.String callerId);
    
    /**
     * Sets (as xml) the "CallerId" element
     */
    void xsetCallerId(com.microsoft.wsdl.types.Guid callerId);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken newInstance() {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
