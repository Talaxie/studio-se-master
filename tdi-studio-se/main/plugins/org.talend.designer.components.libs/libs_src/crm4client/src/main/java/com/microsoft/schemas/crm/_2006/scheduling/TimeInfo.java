/*
 * XML Type:  TimeInfo
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.TimeInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling;


/**
 * An XML TimeInfo(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public interface TimeInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("timeinfo0f6etype");
    
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
     * Gets the "TimeCode" element
     */
    com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum getTimeCode();
    
    /**
     * Gets (as xml) the "TimeCode" element
     */
    com.microsoft.schemas.crm._2006.scheduling.TimeCode xgetTimeCode();
    
    /**
     * Sets the "TimeCode" element
     */
    void setTimeCode(com.microsoft.schemas.crm._2006.scheduling.TimeCode.Enum timeCode);
    
    /**
     * Sets (as xml) the "TimeCode" element
     */
    void xsetTimeCode(com.microsoft.schemas.crm._2006.scheduling.TimeCode timeCode);
    
    /**
     * Gets the "SubCode" element
     */
    com.microsoft.schemas.crm._2006.scheduling.SubCode.Enum getSubCode();
    
    /**
     * Gets (as xml) the "SubCode" element
     */
    com.microsoft.schemas.crm._2006.scheduling.SubCode xgetSubCode();
    
    /**
     * Sets the "SubCode" element
     */
    void setSubCode(com.microsoft.schemas.crm._2006.scheduling.SubCode.Enum subCode);
    
    /**
     * Sets (as xml) the "SubCode" element
     */
    void xsetSubCode(com.microsoft.schemas.crm._2006.scheduling.SubCode subCode);
    
    /**
     * Gets the "SourceId" element
     */
    java.lang.String getSourceId();
    
    /**
     * Gets (as xml) the "SourceId" element
     */
    com.microsoft.wsdl.types.Guid xgetSourceId();
    
    /**
     * Sets the "SourceId" element
     */
    void setSourceId(java.lang.String sourceId);
    
    /**
     * Sets (as xml) the "SourceId" element
     */
    void xsetSourceId(com.microsoft.wsdl.types.Guid sourceId);
    
    /**
     * Gets the "CalendarId" element
     */
    java.lang.String getCalendarId();
    
    /**
     * Gets (as xml) the "CalendarId" element
     */
    com.microsoft.wsdl.types.Guid xgetCalendarId();
    
    /**
     * Sets the "CalendarId" element
     */
    void setCalendarId(java.lang.String calendarId);
    
    /**
     * Sets (as xml) the "CalendarId" element
     */
    void xsetCalendarId(com.microsoft.wsdl.types.Guid calendarId);
    
    /**
     * Gets the "SourceTypeCode" element
     */
    int getSourceTypeCode();
    
    /**
     * Gets (as xml) the "SourceTypeCode" element
     */
    org.apache.xmlbeans.XmlInt xgetSourceTypeCode();
    
    /**
     * Sets the "SourceTypeCode" element
     */
    void setSourceTypeCode(int sourceTypeCode);
    
    /**
     * Sets (as xml) the "SourceTypeCode" element
     */
    void xsetSourceTypeCode(org.apache.xmlbeans.XmlInt sourceTypeCode);
    
    /**
     * Gets the "IsActivity" element
     */
    boolean getIsActivity();
    
    /**
     * Gets (as xml) the "IsActivity" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsActivity();
    
    /**
     * Sets the "IsActivity" element
     */
    void setIsActivity(boolean isActivity);
    
    /**
     * Sets (as xml) the "IsActivity" element
     */
    void xsetIsActivity(org.apache.xmlbeans.XmlBoolean isActivity);
    
    /**
     * Gets the "ActivityStatusCode" element
     */
    int getActivityStatusCode();
    
    /**
     * Gets (as xml) the "ActivityStatusCode" element
     */
    org.apache.xmlbeans.XmlInt xgetActivityStatusCode();
    
    /**
     * Sets the "ActivityStatusCode" element
     */
    void setActivityStatusCode(int activityStatusCode);
    
    /**
     * Sets (as xml) the "ActivityStatusCode" element
     */
    void xsetActivityStatusCode(org.apache.xmlbeans.XmlInt activityStatusCode);
    
    /**
     * Gets the "Effort" element
     */
    double getEffort();
    
    /**
     * Gets (as xml) the "Effort" element
     */
    org.apache.xmlbeans.XmlDouble xgetEffort();
    
    /**
     * Sets the "Effort" element
     */
    void setEffort(double effort);
    
    /**
     * Sets (as xml) the "Effort" element
     */
    void xsetEffort(org.apache.xmlbeans.XmlDouble effort);
    
    /**
     * Gets the "DisplayText" element
     */
    java.lang.String getDisplayText();
    
    /**
     * Gets (as xml) the "DisplayText" element
     */
    org.apache.xmlbeans.XmlString xgetDisplayText();
    
    /**
     * True if has "DisplayText" element
     */
    boolean isSetDisplayText();
    
    /**
     * Sets the "DisplayText" element
     */
    void setDisplayText(java.lang.String displayText);
    
    /**
     * Sets (as xml) the "DisplayText" element
     */
    void xsetDisplayText(org.apache.xmlbeans.XmlString displayText);
    
    /**
     * Unsets the "DisplayText" element
     */
    void unsetDisplayText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo newInstance() {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.scheduling.TimeInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.scheduling.TimeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
