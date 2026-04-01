/*
 * XML Type:  BulkDeleteRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML BulkDeleteRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface BulkDeleteRequest extends com.microsoft.schemas.crm._2007.webservices.Request
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BulkDeleteRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("bulkdeleterequest4cdetype");
    
    /**
     * Gets the "QuerySet" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase getQuerySet();
    
    /**
     * Sets the "QuerySet" element
     */
    void setQuerySet(com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase querySet);
    
    /**
     * Appends and returns a new empty "QuerySet" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfQueryBase addNewQuerySet();
    
    /**
     * Gets the "JobName" element
     */
    java.lang.String getJobName();
    
    /**
     * Gets (as xml) the "JobName" element
     */
    org.apache.xmlbeans.XmlString xgetJobName();
    
    /**
     * Sets the "JobName" element
     */
    void setJobName(java.lang.String jobName);
    
    /**
     * Sets (as xml) the "JobName" element
     */
    void xsetJobName(org.apache.xmlbeans.XmlString jobName);
    
    /**
     * Gets the "SendEmailNotification" element
     */
    boolean getSendEmailNotification();
    
    /**
     * Gets (as xml) the "SendEmailNotification" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSendEmailNotification();
    
    /**
     * Sets the "SendEmailNotification" element
     */
    void setSendEmailNotification(boolean sendEmailNotification);
    
    /**
     * Sets (as xml) the "SendEmailNotification" element
     */
    void xsetSendEmailNotification(org.apache.xmlbeans.XmlBoolean sendEmailNotification);
    
    /**
     * Gets the "ToRecipients" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getToRecipients();
    
    /**
     * Sets the "ToRecipients" element
     */
    void setToRecipients(com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid toRecipients);
    
    /**
     * Appends and returns a new empty "ToRecipients" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid addNewToRecipients();
    
    /**
     * Gets the "CCRecipients" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getCCRecipients();
    
    /**
     * Sets the "CCRecipients" element
     */
    void setCCRecipients(com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid ccRecipients);
    
    /**
     * Appends and returns a new empty "CCRecipients" element
     */
    com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid addNewCCRecipients();
    
    /**
     * Gets the "RecurrencePattern" element
     */
    java.lang.String getRecurrencePattern();
    
    /**
     * Gets (as xml) the "RecurrencePattern" element
     */
    org.apache.xmlbeans.XmlString xgetRecurrencePattern();
    
    /**
     * Sets the "RecurrencePattern" element
     */
    void setRecurrencePattern(java.lang.String recurrencePattern);
    
    /**
     * Sets (as xml) the "RecurrencePattern" element
     */
    void xsetRecurrencePattern(org.apache.xmlbeans.XmlString recurrencePattern);
    
    /**
     * Gets the "StartDateTime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStartDateTime();
    
    /**
     * Sets the "StartDateTime" element
     */
    void setStartDateTime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime startDateTime);
    
    /**
     * Appends and returns a new empty "StartDateTime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStartDateTime();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.BulkDeleteRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
