/*
 * XML Type:  subscription
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Subscription
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML subscription(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Subscription extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subscription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("subscription029btype");
    
    /**
     * Gets the "completedsyncstartedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCompletedsyncstartedon();
    
    /**
     * True if has "completedsyncstartedon" element
     */
    boolean isSetCompletedsyncstartedon();
    
    /**
     * Sets the "completedsyncstartedon" element
     */
    void setCompletedsyncstartedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime completedsyncstartedon);
    
    /**
     * Appends and returns a new empty "completedsyncstartedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCompletedsyncstartedon();
    
    /**
     * Unsets the "completedsyncstartedon" element
     */
    void unsetCompletedsyncstartedon();
    
    /**
     * Gets the "lastsyncstartedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getLastsyncstartedon();
    
    /**
     * True if has "lastsyncstartedon" element
     */
    boolean isSetLastsyncstartedon();
    
    /**
     * Sets the "lastsyncstartedon" element
     */
    void setLastsyncstartedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime lastsyncstartedon);
    
    /**
     * Appends and returns a new empty "lastsyncstartedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewLastsyncstartedon();
    
    /**
     * Unsets the "lastsyncstartedon" element
     */
    void unsetLastsyncstartedon();
    
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
     * Gets the "reinitialize" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getReinitialize();
    
    /**
     * True if has "reinitialize" element
     */
    boolean isSetReinitialize();
    
    /**
     * Sets the "reinitialize" element
     */
    void setReinitialize(com.microsoft.schemas.crm._2006.webservices.CrmBoolean reinitialize);
    
    /**
     * Appends and returns a new empty "reinitialize" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewReinitialize();
    
    /**
     * Unsets the "reinitialize" element
     */
    void unsetReinitialize();
    
    /**
     * Gets the "subscriptionid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getSubscriptionid();
    
    /**
     * True if has "subscriptionid" element
     */
    boolean isSetSubscriptionid();
    
    /**
     * Sets the "subscriptionid" element
     */
    void setSubscriptionid(com.microsoft.schemas.crm._2006.webservices.Key subscriptionid);
    
    /**
     * Appends and returns a new empty "subscriptionid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewSubscriptionid();
    
    /**
     * Unsets the "subscriptionid" element
     */
    void unsetSubscriptionid();
    
    /**
     * Gets the "subscriptiontype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getSubscriptiontype();
    
    /**
     * True if has "subscriptiontype" element
     */
    boolean isSetSubscriptiontype();
    
    /**
     * Sets the "subscriptiontype" element
     */
    void setSubscriptiontype(com.microsoft.schemas.crm._2006.webservices.CrmNumber subscriptiontype);
    
    /**
     * Appends and returns a new empty "subscriptiontype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSubscriptiontype();
    
    /**
     * Unsets the "subscriptiontype" element
     */
    void unsetSubscriptiontype();
    
    /**
     * Gets the "syncentrytablename" element
     */
    java.lang.String getSyncentrytablename();
    
    /**
     * Gets (as xml) the "syncentrytablename" element
     */
    org.apache.xmlbeans.XmlString xgetSyncentrytablename();
    
    /**
     * True if has "syncentrytablename" element
     */
    boolean isSetSyncentrytablename();
    
    /**
     * Sets the "syncentrytablename" element
     */
    void setSyncentrytablename(java.lang.String syncentrytablename);
    
    /**
     * Sets (as xml) the "syncentrytablename" element
     */
    void xsetSyncentrytablename(org.apache.xmlbeans.XmlString syncentrytablename);
    
    /**
     * Unsets the "syncentrytablename" element
     */
    void unsetSyncentrytablename();
    
    /**
     * Gets the "systemuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSystemuserid();
    
    /**
     * True if has "systemuserid" element
     */
    boolean isSetSystemuserid();
    
    /**
     * Sets the "systemuserid" element
     */
    void setSystemuserid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier systemuserid);
    
    /**
     * Appends and returns a new empty "systemuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSystemuserid();
    
    /**
     * Unsets the "systemuserid" element
     */
    void unsetSystemuserid();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Subscription newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Subscription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Subscription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
