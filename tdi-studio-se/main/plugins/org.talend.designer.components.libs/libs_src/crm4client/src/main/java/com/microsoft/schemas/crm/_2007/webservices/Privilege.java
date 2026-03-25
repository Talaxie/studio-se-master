/*
 * XML Type:  privilege
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Privilege
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML privilege(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Privilege extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Privilege.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("privilegeea7dtype");
    
    /**
     * Gets the "accessright" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getAccessright();
    
    /**
     * True if has "accessright" element
     */
    boolean isSetAccessright();
    
    /**
     * Sets the "accessright" element
     */
    void setAccessright(com.microsoft.schemas.crm._2006.webservices.CrmNumber accessright);
    
    /**
     * Appends and returns a new empty "accessright" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAccessright();
    
    /**
     * Unsets the "accessright" element
     */
    void unsetAccessright();
    
    /**
     * Gets the "canbebasic" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCanbebasic();
    
    /**
     * True if has "canbebasic" element
     */
    boolean isSetCanbebasic();
    
    /**
     * Sets the "canbebasic" element
     */
    void setCanbebasic(com.microsoft.schemas.crm._2006.webservices.CrmBoolean canbebasic);
    
    /**
     * Appends and returns a new empty "canbebasic" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCanbebasic();
    
    /**
     * Unsets the "canbebasic" element
     */
    void unsetCanbebasic();
    
    /**
     * Gets the "canbedeep" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCanbedeep();
    
    /**
     * True if has "canbedeep" element
     */
    boolean isSetCanbedeep();
    
    /**
     * Sets the "canbedeep" element
     */
    void setCanbedeep(com.microsoft.schemas.crm._2006.webservices.CrmBoolean canbedeep);
    
    /**
     * Appends and returns a new empty "canbedeep" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCanbedeep();
    
    /**
     * Unsets the "canbedeep" element
     */
    void unsetCanbedeep();
    
    /**
     * Gets the "canbeglobal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCanbeglobal();
    
    /**
     * True if has "canbeglobal" element
     */
    boolean isSetCanbeglobal();
    
    /**
     * Sets the "canbeglobal" element
     */
    void setCanbeglobal(com.microsoft.schemas.crm._2006.webservices.CrmBoolean canbeglobal);
    
    /**
     * Appends and returns a new empty "canbeglobal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCanbeglobal();
    
    /**
     * Unsets the "canbeglobal" element
     */
    void unsetCanbeglobal();
    
    /**
     * Gets the "canbelocal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCanbelocal();
    
    /**
     * True if has "canbelocal" element
     */
    boolean isSetCanbelocal();
    
    /**
     * Sets the "canbelocal" element
     */
    void setCanbelocal(com.microsoft.schemas.crm._2006.webservices.CrmBoolean canbelocal);
    
    /**
     * Appends and returns a new empty "canbelocal" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCanbelocal();
    
    /**
     * Unsets the "canbelocal" element
     */
    void unsetCanbelocal();
    
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
     * Gets the "privilegeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getPrivilegeid();
    
    /**
     * True if has "privilegeid" element
     */
    boolean isSetPrivilegeid();
    
    /**
     * Sets the "privilegeid" element
     */
    void setPrivilegeid(com.microsoft.schemas.crm._2006.webservices.Key privilegeid);
    
    /**
     * Appends and returns a new empty "privilegeid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewPrivilegeid();
    
    /**
     * Unsets the "privilegeid" element
     */
    void unsetPrivilegeid();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Privilege newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Privilege parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Privilege) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
