/*
 * XML Type:  AppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling;


/**
 * An XML AppointmentProposal(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public interface AppointmentProposal extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AppointmentProposal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("appointmentproposald00atype");
    
    /**
     * Gets the "Start" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStart();
    
    /**
     * True if has "Start" element
     */
    boolean isSetStart();
    
    /**
     * Sets the "Start" element
     */
    void setStart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime start);
    
    /**
     * Appends and returns a new empty "Start" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStart();
    
    /**
     * Unsets the "Start" element
     */
    void unsetStart();
    
    /**
     * Gets the "End" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEnd();
    
    /**
     * True if has "End" element
     */
    boolean isSetEnd();
    
    /**
     * Sets the "End" element
     */
    void setEnd(com.microsoft.schemas.crm._2006.webservices.CrmDateTime end);
    
    /**
     * Appends and returns a new empty "End" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEnd();
    
    /**
     * Unsets the "End" element
     */
    void unsetEnd();
    
    /**
     * Gets the "SiteId" element
     */
    java.lang.String getSiteId();
    
    /**
     * Gets (as xml) the "SiteId" element
     */
    com.microsoft.wsdl.types.Guid xgetSiteId();
    
    /**
     * Sets the "SiteId" element
     */
    void setSiteId(java.lang.String siteId);
    
    /**
     * Sets (as xml) the "SiteId" element
     */
    void xsetSiteId(com.microsoft.wsdl.types.Guid siteId);
    
    /**
     * Gets the "SiteName" element
     */
    java.lang.String getSiteName();
    
    /**
     * Gets (as xml) the "SiteName" element
     */
    org.apache.xmlbeans.XmlString xgetSiteName();
    
    /**
     * True if has "SiteName" element
     */
    boolean isSetSiteName();
    
    /**
     * Sets the "SiteName" element
     */
    void setSiteName(java.lang.String siteName);
    
    /**
     * Sets (as xml) the "SiteName" element
     */
    void xsetSiteName(org.apache.xmlbeans.XmlString siteName);
    
    /**
     * Unsets the "SiteName" element
     */
    void unsetSiteName();
    
    /**
     * Gets the "ProposalParties" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty getProposalParties();
    
    /**
     * True if has "ProposalParties" element
     */
    boolean isSetProposalParties();
    
    /**
     * Sets the "ProposalParties" element
     */
    void setProposalParties(com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty proposalParties);
    
    /**
     * Appends and returns a new empty "ProposalParties" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty addNewProposalParties();
    
    /**
     * Unsets the "ProposalParties" element
     */
    void unsetProposalParties();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal newInstance() {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
