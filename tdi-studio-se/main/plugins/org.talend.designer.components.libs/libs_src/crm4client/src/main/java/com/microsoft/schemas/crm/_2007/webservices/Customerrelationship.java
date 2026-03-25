/*
 * XML Type:  customerrelationship
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Customerrelationship
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML customerrelationship(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Customerrelationship extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Customerrelationship.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("customerrelationship3954type");
    
    /**
     * Gets the "converserelationshipid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getConverserelationshipid();
    
    /**
     * True if has "converserelationshipid" element
     */
    boolean isSetConverserelationshipid();
    
    /**
     * Sets the "converserelationshipid" element
     */
    void setConverserelationshipid(com.microsoft.schemas.crm._2006.webservices.Lookup converserelationshipid);
    
    /**
     * Appends and returns a new empty "converserelationshipid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewConverserelationshipid();
    
    /**
     * Unsets the "converserelationshipid" element
     */
    void unsetConverserelationshipid();
    
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
     * Gets the "customerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Customer getCustomerid();
    
    /**
     * True if has "customerid" element
     */
    boolean isSetCustomerid();
    
    /**
     * Sets the "customerid" element
     */
    void setCustomerid(com.microsoft.schemas.crm._2006.webservices.Customer customerid);
    
    /**
     * Appends and returns a new empty "customerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Customer addNewCustomerid();
    
    /**
     * Unsets the "customerid" element
     */
    void unsetCustomerid();
    
    /**
     * Gets the "customerrelationshipid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getCustomerrelationshipid();
    
    /**
     * True if has "customerrelationshipid" element
     */
    boolean isSetCustomerrelationshipid();
    
    /**
     * Sets the "customerrelationshipid" element
     */
    void setCustomerrelationshipid(com.microsoft.schemas.crm._2006.webservices.Key customerrelationshipid);
    
    /**
     * Appends and returns a new empty "customerrelationshipid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewCustomerrelationshipid();
    
    /**
     * Unsets the "customerrelationshipid" element
     */
    void unsetCustomerrelationshipid();
    
    /**
     * Gets the "customerroledescription" element
     */
    java.lang.String getCustomerroledescription();
    
    /**
     * Gets (as xml) the "customerroledescription" element
     */
    org.apache.xmlbeans.XmlString xgetCustomerroledescription();
    
    /**
     * True if has "customerroledescription" element
     */
    boolean isSetCustomerroledescription();
    
    /**
     * Sets the "customerroledescription" element
     */
    void setCustomerroledescription(java.lang.String customerroledescription);
    
    /**
     * Sets (as xml) the "customerroledescription" element
     */
    void xsetCustomerroledescription(org.apache.xmlbeans.XmlString customerroledescription);
    
    /**
     * Unsets the "customerroledescription" element
     */
    void unsetCustomerroledescription();
    
    /**
     * Gets the "customerroleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getCustomerroleid();
    
    /**
     * True if has "customerroleid" element
     */
    boolean isSetCustomerroleid();
    
    /**
     * Sets the "customerroleid" element
     */
    void setCustomerroleid(com.microsoft.schemas.crm._2006.webservices.Lookup customerroleid);
    
    /**
     * Appends and returns a new empty "customerroleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewCustomerroleid();
    
    /**
     * Unsets the "customerroleid" element
     */
    void unsetCustomerroleid();
    
    /**
     * Gets the "importsequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getImportsequencenumber();
    
    /**
     * True if has "importsequencenumber" element
     */
    boolean isSetImportsequencenumber();
    
    /**
     * Sets the "importsequencenumber" element
     */
    void setImportsequencenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber importsequencenumber);
    
    /**
     * Appends and returns a new empty "importsequencenumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewImportsequencenumber();
    
    /**
     * Unsets the "importsequencenumber" element
     */
    void unsetImportsequencenumber();
    
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
     * Gets the "overriddencreatedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getOverriddencreatedon();
    
    /**
     * True if has "overriddencreatedon" element
     */
    boolean isSetOverriddencreatedon();
    
    /**
     * Sets the "overriddencreatedon" element
     */
    void setOverriddencreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime overriddencreatedon);
    
    /**
     * Appends and returns a new empty "overriddencreatedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewOverriddencreatedon();
    
    /**
     * Unsets the "overriddencreatedon" element
     */
    void unsetOverriddencreatedon();
    
    /**
     * Gets the "ownerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Owner getOwnerid();
    
    /**
     * True if has "ownerid" element
     */
    boolean isSetOwnerid();
    
    /**
     * Sets the "ownerid" element
     */
    void setOwnerid(com.microsoft.schemas.crm._2006.webservices.Owner ownerid);
    
    /**
     * Appends and returns a new empty "ownerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Owner addNewOwnerid();
    
    /**
     * Unsets the "ownerid" element
     */
    void unsetOwnerid();
    
    /**
     * Gets the "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getOwningbusinessunit();
    
    /**
     * True if has "owningbusinessunit" element
     */
    boolean isSetOwningbusinessunit();
    
    /**
     * Sets the "owningbusinessunit" element
     */
    void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.Lookup owningbusinessunit);
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewOwningbusinessunit();
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    void unsetOwningbusinessunit();
    
    /**
     * Gets the "partnerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Customer getPartnerid();
    
    /**
     * True if has "partnerid" element
     */
    boolean isSetPartnerid();
    
    /**
     * Sets the "partnerid" element
     */
    void setPartnerid(com.microsoft.schemas.crm._2006.webservices.Customer partnerid);
    
    /**
     * Appends and returns a new empty "partnerid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Customer addNewPartnerid();
    
    /**
     * Unsets the "partnerid" element
     */
    void unsetPartnerid();
    
    /**
     * Gets the "partnerroledescription" element
     */
    java.lang.String getPartnerroledescription();
    
    /**
     * Gets (as xml) the "partnerroledescription" element
     */
    org.apache.xmlbeans.XmlString xgetPartnerroledescription();
    
    /**
     * True if has "partnerroledescription" element
     */
    boolean isSetPartnerroledescription();
    
    /**
     * Sets the "partnerroledescription" element
     */
    void setPartnerroledescription(java.lang.String partnerroledescription);
    
    /**
     * Sets (as xml) the "partnerroledescription" element
     */
    void xsetPartnerroledescription(org.apache.xmlbeans.XmlString partnerroledescription);
    
    /**
     * Unsets the "partnerroledescription" element
     */
    void unsetPartnerroledescription();
    
    /**
     * Gets the "partnerroleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getPartnerroleid();
    
    /**
     * True if has "partnerroleid" element
     */
    boolean isSetPartnerroleid();
    
    /**
     * Sets the "partnerroleid" element
     */
    void setPartnerroleid(com.microsoft.schemas.crm._2006.webservices.Lookup partnerroleid);
    
    /**
     * Appends and returns a new empty "partnerroleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewPartnerroleid();
    
    /**
     * Unsets the "partnerroleid" element
     */
    void unsetPartnerroleid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Customerrelationship parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Customerrelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
