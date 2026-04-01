/*
 * XML Type:  AccessRights
 * Namespace: http://schemas.microsoft.com/crm/2006/CoreTypes
 * Java type: com.microsoft.schemas.crm._2006.coretypes.AccessRights
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.coretypes;


/**
 * An XML AccessRights(@http://schemas.microsoft.com/crm/2006/CoreTypes).
 *
 * This is a list type whose items are com.microsoft.schemas.crm._2006.coretypes.AccessRights$Item.
 */
public interface AccessRights extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.util.List getListValue();
    java.util.List xgetListValue();
    void setListValue(java.util.List list);
    /** @deprecated */
    java.util.List listValue();
    /** @deprecated */
    java.util.List xlistValue();
    /** @deprecated */
    void set(java.util.List list);
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccessRights.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("accessrights75c0type");
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.microsoft.schemas.crm._2006.coretypes.AccessRights$Item.
     */
    public interface Item extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("anona9a8type");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum READ_ACCESS = Enum.forString("ReadAccess");
        static final Enum WRITE_ACCESS = Enum.forString("WriteAccess");
        static final Enum APPEND_ACCESS = Enum.forString("AppendAccess");
        static final Enum APPEND_TO_ACCESS = Enum.forString("AppendToAccess");
        static final Enum CREATE_ACCESS = Enum.forString("CreateAccess");
        static final Enum DELETE_ACCESS = Enum.forString("DeleteAccess");
        static final Enum SHARE_ACCESS = Enum.forString("ShareAccess");
        static final Enum ASSIGN_ACCESS = Enum.forString("AssignAccess");
        
        static final int INT_READ_ACCESS = Enum.INT_READ_ACCESS;
        static final int INT_WRITE_ACCESS = Enum.INT_WRITE_ACCESS;
        static final int INT_APPEND_ACCESS = Enum.INT_APPEND_ACCESS;
        static final int INT_APPEND_TO_ACCESS = Enum.INT_APPEND_TO_ACCESS;
        static final int INT_CREATE_ACCESS = Enum.INT_CREATE_ACCESS;
        static final int INT_DELETE_ACCESS = Enum.INT_DELETE_ACCESS;
        static final int INT_SHARE_ACCESS = Enum.INT_SHARE_ACCESS;
        static final int INT_ASSIGN_ACCESS = Enum.INT_ASSIGN_ACCESS;
        
        /**
         * Enumeration value class for com.microsoft.schemas.crm._2006.coretypes.AccessRights$Item.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_READ_ACCESS
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_READ_ACCESS = 1;
            static final int INT_WRITE_ACCESS = 2;
            static final int INT_APPEND_ACCESS = 3;
            static final int INT_APPEND_TO_ACCESS = 4;
            static final int INT_CREATE_ACCESS = 5;
            static final int INT_DELETE_ACCESS = 6;
            static final int INT_SHARE_ACCESS = 7;
            static final int INT_ASSIGN_ACCESS = 8;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("ReadAccess", INT_READ_ACCESS),
                    new Enum("WriteAccess", INT_WRITE_ACCESS),
                    new Enum("AppendAccess", INT_APPEND_ACCESS),
                    new Enum("AppendToAccess", INT_APPEND_TO_ACCESS),
                    new Enum("CreateAccess", INT_CREATE_ACCESS),
                    new Enum("DeleteAccess", INT_DELETE_ACCESS),
                    new Enum("ShareAccess", INT_SHARE_ACCESS),
                    new Enum("AssignAccess", INT_ASSIGN_ACCESS),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.microsoft.schemas.crm._2006.coretypes.AccessRights.Item newValue(java.lang.Object obj) {
              return (com.microsoft.schemas.crm._2006.coretypes.AccessRights.Item) type.newValue( obj ); }
            
            public static com.microsoft.schemas.crm._2006.coretypes.AccessRights.Item newInstance() {
              return (com.microsoft.schemas.crm._2006.coretypes.AccessRights.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.microsoft.schemas.crm._2006.coretypes.AccessRights.Item newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.microsoft.schemas.crm._2006.coretypes.AccessRights.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights newValue(java.lang.Object obj) {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) type.newValue( obj ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights newInstance() {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.coretypes.AccessRights parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.coretypes.AccessRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
