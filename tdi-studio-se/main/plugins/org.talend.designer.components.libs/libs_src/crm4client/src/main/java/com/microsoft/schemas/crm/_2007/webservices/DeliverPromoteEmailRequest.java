/*
 * XML Type:  DeliverPromoteEmailRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML DeliverPromoteEmailRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface DeliverPromoteEmailRequest extends com.microsoft.schemas.crm._2007.webservices.Request
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DeliverPromoteEmailRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("deliverpromoteemailrequest896ctype");
    
    /**
     * Gets the "EmailId" element
     */
    java.lang.String getEmailId();
    
    /**
     * Gets (as xml) the "EmailId" element
     */
    com.microsoft.wsdl.types.Guid xgetEmailId();
    
    /**
     * Sets the "EmailId" element
     */
    void setEmailId(java.lang.String emailId);
    
    /**
     * Sets (as xml) the "EmailId" element
     */
    void xsetEmailId(com.microsoft.wsdl.types.Guid emailId);
    
    /**
     * Gets the "MessageId" element
     */
    java.lang.String getMessageId();
    
    /**
     * Gets (as xml) the "MessageId" element
     */
    org.apache.xmlbeans.XmlString xgetMessageId();
    
    /**
     * Sets the "MessageId" element
     */
    void setMessageId(java.lang.String messageId);
    
    /**
     * Sets (as xml) the "MessageId" element
     */
    void xsetMessageId(org.apache.xmlbeans.XmlString messageId);
    
    /**
     * Gets the "Subject" element
     */
    java.lang.String getSubject();
    
    /**
     * Gets (as xml) the "Subject" element
     */
    org.apache.xmlbeans.XmlString xgetSubject();
    
    /**
     * Sets the "Subject" element
     */
    void setSubject(java.lang.String subject);
    
    /**
     * Sets (as xml) the "Subject" element
     */
    void xsetSubject(org.apache.xmlbeans.XmlString subject);
    
    /**
     * Gets the "From" element
     */
    java.lang.String getFrom();
    
    /**
     * Gets (as xml) the "From" element
     */
    org.apache.xmlbeans.XmlString xgetFrom();
    
    /**
     * Sets the "From" element
     */
    void setFrom(java.lang.String from);
    
    /**
     * Sets (as xml) the "From" element
     */
    void xsetFrom(org.apache.xmlbeans.XmlString from);
    
    /**
     * Gets the "To" element
     */
    java.lang.String getTo();
    
    /**
     * Gets (as xml) the "To" element
     */
    org.apache.xmlbeans.XmlString xgetTo();
    
    /**
     * Sets the "To" element
     */
    void setTo(java.lang.String to);
    
    /**
     * Sets (as xml) the "To" element
     */
    void xsetTo(org.apache.xmlbeans.XmlString to);
    
    /**
     * Gets the "Cc" element
     */
    java.lang.String getCc();
    
    /**
     * Gets (as xml) the "Cc" element
     */
    org.apache.xmlbeans.XmlString xgetCc();
    
    /**
     * Sets the "Cc" element
     */
    void setCc(java.lang.String cc);
    
    /**
     * Sets (as xml) the "Cc" element
     */
    void xsetCc(org.apache.xmlbeans.XmlString cc);
    
    /**
     * Gets the "Bcc" element
     */
    java.lang.String getBcc();
    
    /**
     * Gets (as xml) the "Bcc" element
     */
    org.apache.xmlbeans.XmlString xgetBcc();
    
    /**
     * Sets the "Bcc" element
     */
    void setBcc(java.lang.String bcc);
    
    /**
     * Sets (as xml) the "Bcc" element
     */
    void xsetBcc(org.apache.xmlbeans.XmlString bcc);
    
    /**
     * Gets the "ReceivedOn" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getReceivedOn();
    
    /**
     * Sets the "ReceivedOn" element
     */
    void setReceivedOn(com.microsoft.schemas.crm._2006.webservices.CrmDateTime receivedOn);
    
    /**
     * Appends and returns a new empty "ReceivedOn" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewReceivedOn();
    
    /**
     * Gets the "SubmittedBy" element
     */
    java.lang.String getSubmittedBy();
    
    /**
     * Gets (as xml) the "SubmittedBy" element
     */
    org.apache.xmlbeans.XmlString xgetSubmittedBy();
    
    /**
     * Sets the "SubmittedBy" element
     */
    void setSubmittedBy(java.lang.String submittedBy);
    
    /**
     * Sets (as xml) the "SubmittedBy" element
     */
    void xsetSubmittedBy(org.apache.xmlbeans.XmlString submittedBy);
    
    /**
     * Gets the "Importance" element
     */
    java.lang.String getImportance();
    
    /**
     * Gets (as xml) the "Importance" element
     */
    org.apache.xmlbeans.XmlString xgetImportance();
    
    /**
     * Sets the "Importance" element
     */
    void setImportance(java.lang.String importance);
    
    /**
     * Sets (as xml) the "Importance" element
     */
    void xsetImportance(org.apache.xmlbeans.XmlString importance);
    
    /**
     * Gets the "Body" element
     */
    java.lang.String getBody();
    
    /**
     * Gets (as xml) the "Body" element
     */
    org.apache.xmlbeans.XmlString xgetBody();
    
    /**
     * Sets the "Body" element
     */
    void setBody(java.lang.String body);
    
    /**
     * Sets (as xml) the "Body" element
     */
    void xsetBody(org.apache.xmlbeans.XmlString body);
    
    /**
     * Gets the "Attachments" element
     */
    com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection getAttachments();
    
    /**
     * Sets the "Attachments" element
     */
    void setAttachments(com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection attachments);
    
    /**
     * Appends and returns a new empty "Attachments" element
     */
    com.microsoft.schemas.crm._2006.webservices.BusinessEntityCollection addNewAttachments();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.DeliverPromoteEmailRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
