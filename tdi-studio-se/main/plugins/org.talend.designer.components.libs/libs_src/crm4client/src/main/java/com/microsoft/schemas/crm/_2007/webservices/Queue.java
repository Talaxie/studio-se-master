/*
 * XML Type:  queue
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Queue
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML queue(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Queue extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Queue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("queue485dtype");
    
    /**
     * Gets the "allowemailcredentials" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getAllowemailcredentials();
    
    /**
     * True if has "allowemailcredentials" element
     */
    boolean isSetAllowemailcredentials();
    
    /**
     * Sets the "allowemailcredentials" element
     */
    void setAllowemailcredentials(com.microsoft.schemas.crm._2006.webservices.CrmBoolean allowemailcredentials);
    
    /**
     * Appends and returns a new empty "allowemailcredentials" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewAllowemailcredentials();
    
    /**
     * Unsets the "allowemailcredentials" element
     */
    void unsetAllowemailcredentials();
    
    /**
     * Gets the "businessunitid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getBusinessunitid();
    
    /**
     * True if has "businessunitid" element
     */
    boolean isSetBusinessunitid();
    
    /**
     * Sets the "businessunitid" element
     */
    void setBusinessunitid(com.microsoft.schemas.crm._2006.webservices.Lookup businessunitid);
    
    /**
     * Appends and returns a new empty "businessunitid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewBusinessunitid();
    
    /**
     * Unsets the "businessunitid" element
     */
    void unsetBusinessunitid();
    
    /**
     * Gets the "createdby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby();
    
    /**
     * True if has "createdby" element
     */
    boolean isSetCreatedby();
    
    /**
     * Sets the "createdby" element
     */
    void setCreatedby(com.microsoft.schemas.crm._2006.webservices.Lookup createdby);
    
    /**
     * Appends and returns a new empty "createdby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedby();
    
    /**
     * Unsets the "createdby" element
     */
    void unsetCreatedby();
    
    /**
     * Gets the "createdon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon();
    
    /**
     * True if has "createdon" element
     */
    boolean isSetCreatedon();
    
    /**
     * Sets the "createdon" element
     */
    void setCreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime createdon);
    
    /**
     * Appends and returns a new empty "createdon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCreatedon();
    
    /**
     * Unsets the "createdon" element
     */
    void unsetCreatedon();
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "emailaddress" element
     */
    java.lang.String getEmailaddress();
    
    /**
     * Gets (as xml) the "emailaddress" element
     */
    org.apache.xmlbeans.XmlString xgetEmailaddress();
    
    /**
     * True if has "emailaddress" element
     */
    boolean isSetEmailaddress();
    
    /**
     * Sets the "emailaddress" element
     */
    void setEmailaddress(java.lang.String emailaddress);
    
    /**
     * Sets (as xml) the "emailaddress" element
     */
    void xsetEmailaddress(org.apache.xmlbeans.XmlString emailaddress);
    
    /**
     * Unsets the "emailaddress" element
     */
    void unsetEmailaddress();
    
    /**
     * Gets the "emailpassword" element
     */
    java.lang.String getEmailpassword();
    
    /**
     * Gets (as xml) the "emailpassword" element
     */
    org.apache.xmlbeans.XmlString xgetEmailpassword();
    
    /**
     * True if has "emailpassword" element
     */
    boolean isSetEmailpassword();
    
    /**
     * Sets the "emailpassword" element
     */
    void setEmailpassword(java.lang.String emailpassword);
    
    /**
     * Sets (as xml) the "emailpassword" element
     */
    void xsetEmailpassword(org.apache.xmlbeans.XmlString emailpassword);
    
    /**
     * Unsets the "emailpassword" element
     */
    void unsetEmailpassword();
    
    /**
     * Gets the "emailusername" element
     */
    java.lang.String getEmailusername();
    
    /**
     * Gets (as xml) the "emailusername" element
     */
    org.apache.xmlbeans.XmlString xgetEmailusername();
    
    /**
     * True if has "emailusername" element
     */
    boolean isSetEmailusername();
    
    /**
     * Sets the "emailusername" element
     */
    void setEmailusername(java.lang.String emailusername);
    
    /**
     * Sets (as xml) the "emailusername" element
     */
    void xsetEmailusername(org.apache.xmlbeans.XmlString emailusername);
    
    /**
     * Unsets the "emailusername" element
     */
    void unsetEmailusername();
    
    /**
     * Gets the "ignoreunsolicitedemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIgnoreunsolicitedemail();
    
    /**
     * True if has "ignoreunsolicitedemail" element
     */
    boolean isSetIgnoreunsolicitedemail();
    
    /**
     * Sets the "ignoreunsolicitedemail" element
     */
    void setIgnoreunsolicitedemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ignoreunsolicitedemail);
    
    /**
     * Appends and returns a new empty "ignoreunsolicitedemail" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIgnoreunsolicitedemail();
    
    /**
     * Unsets the "ignoreunsolicitedemail" element
     */
    void unsetIgnoreunsolicitedemail();
    
    /**
     * Gets the "incomingemaildeliverymethod" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getIncomingemaildeliverymethod();
    
    /**
     * True if has "incomingemaildeliverymethod" element
     */
    boolean isSetIncomingemaildeliverymethod();
    
    /**
     * Sets the "incomingemaildeliverymethod" element
     */
    void setIncomingemaildeliverymethod(com.microsoft.schemas.crm._2006.webservices.Picklist incomingemaildeliverymethod);
    
    /**
     * Appends and returns a new empty "incomingemaildeliverymethod" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewIncomingemaildeliverymethod();
    
    /**
     * Unsets the "incomingemaildeliverymethod" element
     */
    void unsetIncomingemaildeliverymethod();
    
    /**
     * Gets the "incomingemailfilteringmethod" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getIncomingemailfilteringmethod();
    
    /**
     * True if has "incomingemailfilteringmethod" element
     */
    boolean isSetIncomingemailfilteringmethod();
    
    /**
     * Sets the "incomingemailfilteringmethod" element
     */
    void setIncomingemailfilteringmethod(com.microsoft.schemas.crm._2006.webservices.Picklist incomingemailfilteringmethod);
    
    /**
     * Appends and returns a new empty "incomingemailfilteringmethod" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewIncomingemailfilteringmethod();
    
    /**
     * Unsets the "incomingemailfilteringmethod" element
     */
    void unsetIncomingemailfilteringmethod();
    
    /**
     * Gets the "isfaxqueue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsfaxqueue();
    
    /**
     * True if has "isfaxqueue" element
     */
    boolean isSetIsfaxqueue();
    
    /**
     * Sets the "isfaxqueue" element
     */
    void setIsfaxqueue(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isfaxqueue);
    
    /**
     * Appends and returns a new empty "isfaxqueue" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsfaxqueue();
    
    /**
     * Unsets the "isfaxqueue" element
     */
    void unsetIsfaxqueue();
    
    /**
     * Gets the "modifiedby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getModifiedby();
    
    /**
     * True if has "modifiedby" element
     */
    boolean isSetModifiedby();
    
    /**
     * Sets the "modifiedby" element
     */
    void setModifiedby(com.microsoft.schemas.crm._2006.webservices.Lookup modifiedby);
    
    /**
     * Appends and returns a new empty "modifiedby" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewModifiedby();
    
    /**
     * Unsets the "modifiedby" element
     */
    void unsetModifiedby();
    
    /**
     * Gets the "modifiedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getModifiedon();
    
    /**
     * True if has "modifiedon" element
     */
    boolean isSetModifiedon();
    
    /**
     * Sets the "modifiedon" element
     */
    void setModifiedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime modifiedon);
    
    /**
     * Appends and returns a new empty "modifiedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewModifiedon();
    
    /**
     * Unsets the "modifiedon" element
     */
    void unsetModifiedon();
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOrganizationid();
    
    /**
     * True if has "organizationid" element
     */
    boolean isSetOrganizationid();
    
    /**
     * Sets the "organizationid" element
     */
    void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Lookup organizationid);
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOrganizationid();
    
    /**
     * Unsets the "organizationid" element
     */
    void unsetOrganizationid();
    
    /**
     * Gets the "outgoingemaildeliverymethod" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getOutgoingemaildeliverymethod();
    
    /**
     * True if has "outgoingemaildeliverymethod" element
     */
    boolean isSetOutgoingemaildeliverymethod();
    
    /**
     * Sets the "outgoingemaildeliverymethod" element
     */
    void setOutgoingemaildeliverymethod(com.microsoft.schemas.crm._2006.webservices.Picklist outgoingemaildeliverymethod);
    
    /**
     * Appends and returns a new empty "outgoingemaildeliverymethod" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewOutgoingemaildeliverymethod();
    
    /**
     * Unsets the "outgoingemaildeliverymethod" element
     */
    void unsetOutgoingemaildeliverymethod();
    
    /**
     * Gets the "primaryuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPrimaryuserid();
    
    /**
     * True if has "primaryuserid" element
     */
    boolean isSetPrimaryuserid();
    
    /**
     * Sets the "primaryuserid" element
     */
    void setPrimaryuserid(com.microsoft.schemas.crm._2006.webservices.Lookup primaryuserid);
    
    /**
     * Appends and returns a new empty "primaryuserid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPrimaryuserid();
    
    /**
     * Unsets the "primaryuserid" element
     */
    void unsetPrimaryuserid();
    
    /**
     * Gets the "queueid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getQueueid();
    
    /**
     * True if has "queueid" element
     */
    boolean isSetQueueid();
    
    /**
     * Sets the "queueid" element
     */
    void setQueueid(com.microsoft.schemas.crm._2006.webservices.Key queueid);
    
    /**
     * Appends and returns a new empty "queueid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewQueueid();
    
    /**
     * Unsets the "queueid" element
     */
    void unsetQueueid();
    
    /**
     * Gets the "queuesemantics" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getQueuesemantics();
    
    /**
     * True if has "queuesemantics" element
     */
    boolean isSetQueuesemantics();
    
    /**
     * Sets the "queuesemantics" element
     */
    void setQueuesemantics(com.microsoft.schemas.crm._2006.webservices.CrmNumber queuesemantics);
    
    /**
     * Appends and returns a new empty "queuesemantics" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewQueuesemantics();
    
    /**
     * Unsets the "queuesemantics" element
     */
    void unsetQueuesemantics();
    
    /**
     * Gets the "queuetypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getQueuetypecode();
    
    /**
     * True if has "queuetypecode" element
     */
    boolean isSetQueuetypecode();
    
    /**
     * Sets the "queuetypecode" element
     */
    void setQueuetypecode(com.microsoft.schemas.crm._2006.webservices.Picklist queuetypecode);
    
    /**
     * Appends and returns a new empty "queuetypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewQueuetypecode();
    
    /**
     * Unsets the "queuetypecode" element
     */
    void unsetQueuetypecode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Queue newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Queue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Queue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
