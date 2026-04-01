/*
 * XML Type:  resourcespec
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Resourcespec
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML resourcespec(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Resourcespec extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resourcespec.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("resourcespeceb47type");
    
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
     * Gets the "constraints" element
     */
    java.lang.String getConstraints();
    
    /**
     * Gets (as xml) the "constraints" element
     */
    org.apache.xmlbeans.XmlString xgetConstraints();
    
    /**
     * True if has "constraints" element
     */
    boolean isSetConstraints();
    
    /**
     * Sets the "constraints" element
     */
    void setConstraints(java.lang.String constraints);
    
    /**
     * Sets (as xml) the "constraints" element
     */
    void xsetConstraints(org.apache.xmlbeans.XmlString constraints);
    
    /**
     * Unsets the "constraints" element
     */
    void unsetConstraints();
    
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
     * Gets the "effortrequired" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat getEffortrequired();
    
    /**
     * True if has "effortrequired" element
     */
    boolean isSetEffortrequired();
    
    /**
     * Sets the "effortrequired" element
     */
    void setEffortrequired(com.microsoft.schemas.crm._2006.webservices.CrmFloat effortrequired);
    
    /**
     * Appends and returns a new empty "effortrequired" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewEffortrequired();
    
    /**
     * Unsets the "effortrequired" element
     */
    void unsetEffortrequired();
    
    /**
     * Gets the "groupobjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getGroupobjectid();
    
    /**
     * True if has "groupobjectid" element
     */
    boolean isSetGroupobjectid();
    
    /**
     * Sets the "groupobjectid" element
     */
    void setGroupobjectid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier groupobjectid);
    
    /**
     * Appends and returns a new empty "groupobjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewGroupobjectid();
    
    /**
     * Unsets the "groupobjectid" element
     */
    void unsetGroupobjectid();
    
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
     * Gets the "objectiveexpression" element
     */
    java.lang.String getObjectiveexpression();
    
    /**
     * Gets (as xml) the "objectiveexpression" element
     */
    org.apache.xmlbeans.XmlString xgetObjectiveexpression();
    
    /**
     * True if has "objectiveexpression" element
     */
    boolean isSetObjectiveexpression();
    
    /**
     * Sets the "objectiveexpression" element
     */
    void setObjectiveexpression(java.lang.String objectiveexpression);
    
    /**
     * Sets (as xml) the "objectiveexpression" element
     */
    void xsetObjectiveexpression(org.apache.xmlbeans.XmlString objectiveexpression);
    
    /**
     * Unsets the "objectiveexpression" element
     */
    void unsetObjectiveexpression();
    
    /**
     * Gets the "objecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference getObjecttypecode();
    
    /**
     * True if has "objecttypecode" element
     */
    boolean isSetObjecttypecode();
    
    /**
     * Sets the "objecttypecode" element
     */
    void setObjecttypecode(com.microsoft.schemas.crm._2006.webservices.EntityNameReference objecttypecode);
    
    /**
     * Appends and returns a new empty "objecttypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewObjecttypecode();
    
    /**
     * Unsets the "objecttypecode" element
     */
    void unsetObjecttypecode();
    
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
     * Gets the "requiredcount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getRequiredcount();
    
    /**
     * True if has "requiredcount" element
     */
    boolean isSetRequiredcount();
    
    /**
     * Sets the "requiredcount" element
     */
    void setRequiredcount(com.microsoft.schemas.crm._2006.webservices.CrmNumber requiredcount);
    
    /**
     * Appends and returns a new empty "requiredcount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewRequiredcount();
    
    /**
     * Unsets the "requiredcount" element
     */
    void unsetRequiredcount();
    
    /**
     * Gets the "resourcespecid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getResourcespecid();
    
    /**
     * True if has "resourcespecid" element
     */
    boolean isSetResourcespecid();
    
    /**
     * Sets the "resourcespecid" element
     */
    void setResourcespecid(com.microsoft.schemas.crm._2006.webservices.Key resourcespecid);
    
    /**
     * Appends and returns a new empty "resourcespecid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewResourcespecid();
    
    /**
     * Unsets the "resourcespecid" element
     */
    void unsetResourcespecid();
    
    /**
     * Gets the "samesite" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getSamesite();
    
    /**
     * True if has "samesite" element
     */
    boolean isSetSamesite();
    
    /**
     * Sets the "samesite" element
     */
    void setSamesite(com.microsoft.schemas.crm._2006.webservices.CrmBoolean samesite);
    
    /**
     * Appends and returns a new empty "samesite" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewSamesite();
    
    /**
     * Unsets the "samesite" element
     */
    void unsetSamesite();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Resourcespec parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Resourcespec) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
