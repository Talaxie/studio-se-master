/*
 * XML Type:  subscriptionclients
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Subscriptionclients
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML subscriptionclients(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Subscriptionclients extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subscriptionclients.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("subscriptionclientsf2d7type");
    
    /**
     * Gets the "clientid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getClientid();
    
    /**
     * True if has "clientid" element
     */
    boolean isSetClientid();
    
    /**
     * Sets the "clientid" element
     */
    void setClientid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier clientid);
    
    /**
     * Appends and returns a new empty "clientid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewClientid();
    
    /**
     * Unsets the "clientid" element
     */
    void unsetClientid();
    
    /**
     * Gets the "isprimaryclient" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsprimaryclient();
    
    /**
     * True if has "isprimaryclient" element
     */
    boolean isSetIsprimaryclient();
    
    /**
     * Sets the "isprimaryclient" element
     */
    void setIsprimaryclient(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isprimaryclient);
    
    /**
     * Appends and returns a new empty "isprimaryclient" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsprimaryclient();
    
    /**
     * Unsets the "isprimaryclient" element
     */
    void unsetIsprimaryclient();
    
    /**
     * Gets the "machinename" element
     */
    java.lang.String getMachinename();
    
    /**
     * Gets (as xml) the "machinename" element
     */
    org.apache.xmlbeans.XmlString xgetMachinename();
    
    /**
     * True if has "machinename" element
     */
    boolean isSetMachinename();
    
    /**
     * Sets the "machinename" element
     */
    void setMachinename(java.lang.String machinename);
    
    /**
     * Sets (as xml) the "machinename" element
     */
    void xsetMachinename(org.apache.xmlbeans.XmlString machinename);
    
    /**
     * Unsets the "machinename" element
     */
    void unsetMachinename();
    
    /**
     * Gets the "subscriptionclientid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getSubscriptionclientid();
    
    /**
     * True if has "subscriptionclientid" element
     */
    boolean isSetSubscriptionclientid();
    
    /**
     * Sets the "subscriptionclientid" element
     */
    void setSubscriptionclientid(com.microsoft.schemas.crm._2006.webservices.Key subscriptionclientid);
    
    /**
     * Appends and returns a new empty "subscriptionclientid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewSubscriptionclientid();
    
    /**
     * Unsets the "subscriptionclientid" element
     */
    void unsetSubscriptionclientid();
    
    /**
     * Gets the "subscriptionid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSubscriptionid();
    
    /**
     * True if has "subscriptionid" element
     */
    boolean isSetSubscriptionid();
    
    /**
     * Sets the "subscriptionid" element
     */
    void setSubscriptionid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier subscriptionid);
    
    /**
     * Appends and returns a new empty "subscriptionid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSubscriptionid();
    
    /**
     * Unsets the "subscriptionid" element
     */
    void unsetSubscriptionid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Subscriptionclients parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscriptionclients) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
