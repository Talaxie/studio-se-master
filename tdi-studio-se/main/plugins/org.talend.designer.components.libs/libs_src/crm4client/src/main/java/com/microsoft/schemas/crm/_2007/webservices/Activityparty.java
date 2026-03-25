/*
 * XML Type:  activityparty
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Activityparty
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML activityparty(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Activityparty extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Activityparty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("activitypartyec03type");
    
    /**
     * Gets the "activityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getActivityid();
    
    /**
     * True if has "activityid" element
     */
    boolean isSetActivityid();
    
    /**
     * Sets the "activityid" element
     */
    void setActivityid(com.microsoft.schemas.crm._2006.webservices.Lookup activityid);
    
    /**
     * Appends and returns a new empty "activityid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewActivityid();
    
    /**
     * Unsets the "activityid" element
     */
    void unsetActivityid();
    
    /**
     * Gets the "activitypartyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getActivitypartyid();
    
    /**
     * True if has "activitypartyid" element
     */
    boolean isSetActivitypartyid();
    
    /**
     * Sets the "activitypartyid" element
     */
    void setActivitypartyid(com.microsoft.schemas.crm._2006.webservices.Key activitypartyid);
    
    /**
     * Appends and returns a new empty "activitypartyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewActivitypartyid();
    
    /**
     * Unsets the "activitypartyid" element
     */
    void unsetActivitypartyid();
    
    /**
     * Gets the "addressused" element
     */
    java.lang.String getAddressused();
    
    /**
     * Gets (as xml) the "addressused" element
     */
    org.apache.xmlbeans.XmlString xgetAddressused();
    
    /**
     * True if has "addressused" element
     */
    boolean isSetAddressused();
    
    /**
     * Sets the "addressused" element
     */
    void setAddressused(java.lang.String addressused);
    
    /**
     * Sets (as xml) the "addressused" element
     */
    void xsetAddressused(org.apache.xmlbeans.XmlString addressused);
    
    /**
     * Unsets the "addressused" element
     */
    void unsetAddressused();
    
    /**
     * Gets the "donotemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotemail();
    
    /**
     * True if has "donotemail" element
     */
    boolean isSetDonotemail();
    
    /**
     * Sets the "donotemail" element
     */
    void setDonotemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotemail);
    
    /**
     * Appends and returns a new empty "donotemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotemail();
    
    /**
     * Unsets the "donotemail" element
     */
    void unsetDonotemail();
    
    /**
     * Gets the "donotfax" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotfax();
    
    /**
     * True if has "donotfax" element
     */
    boolean isSetDonotfax();
    
    /**
     * Sets the "donotfax" element
     */
    void setDonotfax(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotfax);
    
    /**
     * Appends and returns a new empty "donotfax" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotfax();
    
    /**
     * Unsets the "donotfax" element
     */
    void unsetDonotfax();
    
    /**
     * Gets the "donotphone" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotphone();
    
    /**
     * True if has "donotphone" element
     */
    boolean isSetDonotphone();
    
    /**
     * Sets the "donotphone" element
     */
    void setDonotphone(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotphone);
    
    /**
     * Appends and returns a new empty "donotphone" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotphone();
    
    /**
     * Unsets the "donotphone" element
     */
    void unsetDonotphone();
    
    /**
     * Gets the "donotpostalmail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotpostalmail();
    
    /**
     * True if has "donotpostalmail" element
     */
    boolean isSetDonotpostalmail();
    
    /**
     * Sets the "donotpostalmail" element
     */
    void setDonotpostalmail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotpostalmail);
    
    /**
     * Appends and returns a new empty "donotpostalmail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotpostalmail();
    
    /**
     * Unsets the "donotpostalmail" element
     */
    void unsetDonotpostalmail();
    
    /**
     * Gets the "effort" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat getEffort();
    
    /**
     * True if has "effort" element
     */
    boolean isSetEffort();
    
    /**
     * Sets the "effort" element
     */
    void setEffort(com.microsoft.schemas.crm._2006.webservices.CrmFloat effort);
    
    /**
     * Appends and returns a new empty "effort" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewEffort();
    
    /**
     * Unsets the "effort" element
     */
    void unsetEffort();
    
    /**
     * Gets the "exchangeentryid" element
     */
    java.lang.String getExchangeentryid();
    
    /**
     * Gets (as xml) the "exchangeentryid" element
     */
    org.apache.xmlbeans.XmlString xgetExchangeentryid();
    
    /**
     * True if has "exchangeentryid" element
     */
    boolean isSetExchangeentryid();
    
    /**
     * Sets the "exchangeentryid" element
     */
    void setExchangeentryid(java.lang.String exchangeentryid);
    
    /**
     * Sets (as xml) the "exchangeentryid" element
     */
    void xsetExchangeentryid(org.apache.xmlbeans.XmlString exchangeentryid);
    
    /**
     * Unsets the "exchangeentryid" element
     */
    void unsetExchangeentryid();
    
    /**
     * Gets the "participationtypemask" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getParticipationtypemask();
    
    /**
     * True if has "participationtypemask" element
     */
    boolean isSetParticipationtypemask();
    
    /**
     * Sets the "participationtypemask" element
     */
    void setParticipationtypemask(com.microsoft.schemas.crm._2006.webservices.Picklist participationtypemask);
    
    /**
     * Appends and returns a new empty "participationtypemask" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewParticipationtypemask();
    
    /**
     * Unsets the "participationtypemask" element
     */
    void unsetParticipationtypemask();
    
    /**
     * Gets the "partyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPartyid();
    
    /**
     * True if has "partyid" element
     */
    boolean isSetPartyid();
    
    /**
     * Sets the "partyid" element
     */
    void setPartyid(com.microsoft.schemas.crm._2006.webservices.Lookup partyid);
    
    /**
     * Appends and returns a new empty "partyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPartyid();
    
    /**
     * Unsets the "partyid" element
     */
    void unsetPartyid();
    
    /**
     * Gets the "resourcespecid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getResourcespecid();
    
    /**
     * True if has "resourcespecid" element
     */
    boolean isSetResourcespecid();
    
    /**
     * Sets the "resourcespecid" element
     */
    void setResourcespecid(com.microsoft.schemas.crm._2006.webservices.Lookup resourcespecid);
    
    /**
     * Appends and returns a new empty "resourcespecid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewResourcespecid();
    
    /**
     * Unsets the "resourcespecid" element
     */
    void unsetResourcespecid();
    
    /**
     * Gets the "scheduledend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getScheduledend();
    
    /**
     * True if has "scheduledend" element
     */
    boolean isSetScheduledend();
    
    /**
     * Sets the "scheduledend" element
     */
    void setScheduledend(com.microsoft.schemas.crm._2006.webservices.CrmDateTime scheduledend);
    
    /**
     * Appends and returns a new empty "scheduledend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewScheduledend();
    
    /**
     * Unsets the "scheduledend" element
     */
    void unsetScheduledend();
    
    /**
     * Gets the "scheduledstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getScheduledstart();
    
    /**
     * True if has "scheduledstart" element
     */
    boolean isSetScheduledstart();
    
    /**
     * Sets the "scheduledstart" element
     */
    void setScheduledstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime scheduledstart);
    
    /**
     * Appends and returns a new empty "scheduledstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewScheduledstart();
    
    /**
     * Unsets the "scheduledstart" element
     */
    void unsetScheduledstart();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Activityparty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Activityparty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
