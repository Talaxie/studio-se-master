/*
 * XML Type:  SubCode
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.SubCode
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling;


/**
 * An XML SubCode(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.crm._2006.scheduling.SubCode.
 */
public interface SubCode extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("subcodeec6etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum UNSPECIFIED = Enum.forString("Unspecified");
    static final Enum SCHEDULABLE = Enum.forString("Schedulable");
    static final Enum COMMITTED = Enum.forString("Committed");
    static final Enum UNCOMMITTED = Enum.forString("Uncommitted");
    static final Enum BREAK = Enum.forString("Break");
    static final Enum HOLIDAY = Enum.forString("Holiday");
    static final Enum VACATION = Enum.forString("Vacation");
    static final Enum APPOINTMENT = Enum.forString("Appointment");
    static final Enum RESOURCE_START_TIME = Enum.forString("ResourceStartTime");
    static final Enum RESOURCE_SERVICE_RESTRICTION = Enum.forString("ResourceServiceRestriction");
    static final Enum RESOURCE_CAPACITY = Enum.forString("ResourceCapacity");
    static final Enum SERVICE_RESTRICTION = Enum.forString("ServiceRestriction");
    static final Enum SERVICE_COST = Enum.forString("ServiceCost");
    
    static final int INT_UNSPECIFIED = Enum.INT_UNSPECIFIED;
    static final int INT_SCHEDULABLE = Enum.INT_SCHEDULABLE;
    static final int INT_COMMITTED = Enum.INT_COMMITTED;
    static final int INT_UNCOMMITTED = Enum.INT_UNCOMMITTED;
    static final int INT_BREAK = Enum.INT_BREAK;
    static final int INT_HOLIDAY = Enum.INT_HOLIDAY;
    static final int INT_VACATION = Enum.INT_VACATION;
    static final int INT_APPOINTMENT = Enum.INT_APPOINTMENT;
    static final int INT_RESOURCE_START_TIME = Enum.INT_RESOURCE_START_TIME;
    static final int INT_RESOURCE_SERVICE_RESTRICTION = Enum.INT_RESOURCE_SERVICE_RESTRICTION;
    static final int INT_RESOURCE_CAPACITY = Enum.INT_RESOURCE_CAPACITY;
    static final int INT_SERVICE_RESTRICTION = Enum.INT_SERVICE_RESTRICTION;
    static final int INT_SERVICE_COST = Enum.INT_SERVICE_COST;
    
    /**
     * Enumeration value class for com.microsoft.schemas.crm._2006.scheduling.SubCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_UNSPECIFIED
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
        
        static final int INT_UNSPECIFIED = 1;
        static final int INT_SCHEDULABLE = 2;
        static final int INT_COMMITTED = 3;
        static final int INT_UNCOMMITTED = 4;
        static final int INT_BREAK = 5;
        static final int INT_HOLIDAY = 6;
        static final int INT_VACATION = 7;
        static final int INT_APPOINTMENT = 8;
        static final int INT_RESOURCE_START_TIME = 9;
        static final int INT_RESOURCE_SERVICE_RESTRICTION = 10;
        static final int INT_RESOURCE_CAPACITY = 11;
        static final int INT_SERVICE_RESTRICTION = 12;
        static final int INT_SERVICE_COST = 13;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Unspecified", INT_UNSPECIFIED),
                new Enum("Schedulable", INT_SCHEDULABLE),
                new Enum("Committed", INT_COMMITTED),
                new Enum("Uncommitted", INT_UNCOMMITTED),
                new Enum("Break", INT_BREAK),
                new Enum("Holiday", INT_HOLIDAY),
                new Enum("Vacation", INT_VACATION),
                new Enum("Appointment", INT_APPOINTMENT),
                new Enum("ResourceStartTime", INT_RESOURCE_START_TIME),
                new Enum("ResourceServiceRestriction", INT_RESOURCE_SERVICE_RESTRICTION),
                new Enum("ResourceCapacity", INT_RESOURCE_CAPACITY),
                new Enum("ServiceRestriction", INT_SERVICE_RESTRICTION),
                new Enum("ServiceCost", INT_SERVICE_COST),
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
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode newValue(java.lang.Object obj) {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) type.newValue( obj ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode newInstance() {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.scheduling.SubCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.scheduling.SubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
