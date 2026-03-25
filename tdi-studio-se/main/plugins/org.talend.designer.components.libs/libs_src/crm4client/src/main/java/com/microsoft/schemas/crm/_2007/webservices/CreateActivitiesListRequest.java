/*
 * XML Type:  CreateActivitiesListRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML CreateActivitiesListRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface CreateActivitiesListRequest extends com.microsoft.schemas.crm._2007.webservices.Request
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateActivitiesListRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("createactivitieslistrequest1674type");
    
    /**
     * Gets the "ListId" element
     */
    java.lang.String getListId();
    
    /**
     * Gets (as xml) the "ListId" element
     */
    com.microsoft.wsdl.types.Guid xgetListId();
    
    /**
     * Sets the "ListId" element
     */
    void setListId(java.lang.String listId);
    
    /**
     * Sets (as xml) the "ListId" element
     */
    void xsetListId(com.microsoft.wsdl.types.Guid listId);
    
    /**
     * Gets the "FriendlyName" element
     */
    java.lang.String getFriendlyName();
    
    /**
     * Gets (as xml) the "FriendlyName" element
     */
    org.apache.xmlbeans.XmlString xgetFriendlyName();
    
    /**
     * Sets the "FriendlyName" element
     */
    void setFriendlyName(java.lang.String friendlyName);
    
    /**
     * Sets (as xml) the "FriendlyName" element
     */
    void xsetFriendlyName(org.apache.xmlbeans.XmlString friendlyName);
    
    /**
     * Gets the "Activity" element
     */
    com.microsoft.schemas.crm._2006.webservices.BusinessEntity getActivity();
    
    /**
     * Sets the "Activity" element
     */
    void setActivity(com.microsoft.schemas.crm._2006.webservices.BusinessEntity activity);
    
    /**
     * Appends and returns a new empty "Activity" element
     */
    com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewActivity();
    
    /**
     * Gets the "TemplateId" element
     */
    java.lang.String getTemplateId();
    
    /**
     * Gets (as xml) the "TemplateId" element
     */
    com.microsoft.wsdl.types.Guid xgetTemplateId();
    
    /**
     * Sets the "TemplateId" element
     */
    void setTemplateId(java.lang.String templateId);
    
    /**
     * Sets (as xml) the "TemplateId" element
     */
    void xsetTemplateId(com.microsoft.wsdl.types.Guid templateId);
    
    /**
     * Gets the "Propagate" element
     */
    boolean getPropagate();
    
    /**
     * Gets (as xml) the "Propagate" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPropagate();
    
    /**
     * Sets the "Propagate" element
     */
    void setPropagate(boolean propagate);
    
    /**
     * Sets (as xml) the "Propagate" element
     */
    void xsetPropagate(org.apache.xmlbeans.XmlBoolean propagate);
    
    /**
     * Gets the "OwnershipOptions" element
     */
    com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum getOwnershipOptions();
    
    /**
     * Gets (as xml) the "OwnershipOptions" element
     */
    com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions xgetOwnershipOptions();
    
    /**
     * Sets the "OwnershipOptions" element
     */
    void setOwnershipOptions(com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions.Enum ownershipOptions);
    
    /**
     * Sets (as xml) the "OwnershipOptions" element
     */
    void xsetOwnershipOptions(com.microsoft.schemas.crm._2006.coretypes.PropagationOwnershipOptions ownershipOptions);
    
    /**
     * Gets the "Owner" element
     */
    com.microsoft.schemas.crm._2006.coretypes.Moniker getOwner();
    
    /**
     * Sets the "Owner" element
     */
    void setOwner(com.microsoft.schemas.crm._2006.coretypes.Moniker owner);
    
    /**
     * Appends and returns a new empty "Owner" element
     */
    com.microsoft.schemas.crm._2006.coretypes.Moniker addNewOwner();
    
    /**
     * Gets the "sendEmail" element
     */
    boolean getSendEmail();
    
    /**
     * Gets (as xml) the "sendEmail" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSendEmail();
    
    /**
     * Sets the "sendEmail" element
     */
    void setSendEmail(boolean sendEmail);
    
    /**
     * Sets (as xml) the "sendEmail" element
     */
    void xsetSendEmail(org.apache.xmlbeans.XmlBoolean sendEmail);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.CreateActivitiesListRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
