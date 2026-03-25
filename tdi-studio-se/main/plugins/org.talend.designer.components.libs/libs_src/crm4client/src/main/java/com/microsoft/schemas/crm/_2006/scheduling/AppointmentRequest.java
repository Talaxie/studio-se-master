/*
 * XML Type:  AppointmentRequest
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling;


/**
 * An XML AppointmentRequest(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public interface AppointmentRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AppointmentRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("appointmentrequestc679type");
    
    /**
     * Gets the "ServiceId" element
     */
    java.lang.String getServiceId();
    
    /**
     * Gets (as xml) the "ServiceId" element
     */
    com.microsoft.wsdl.types.Guid xgetServiceId();
    
    /**
     * Sets the "ServiceId" element
     */
    void setServiceId(java.lang.String serviceId);
    
    /**
     * Sets (as xml) the "ServiceId" element
     */
    void xsetServiceId(com.microsoft.wsdl.types.Guid serviceId);
    
    /**
     * Gets the "AnchorOffset" element
     */
    int getAnchorOffset();
    
    /**
     * Gets (as xml) the "AnchorOffset" element
     */
    org.apache.xmlbeans.XmlInt xgetAnchorOffset();
    
    /**
     * Sets the "AnchorOffset" element
     */
    void setAnchorOffset(int anchorOffset);
    
    /**
     * Sets (as xml) the "AnchorOffset" element
     */
    void xsetAnchorOffset(org.apache.xmlbeans.XmlInt anchorOffset);
    
    /**
     * Gets the "UserTimeZoneCode" element
     */
    int getUserTimeZoneCode();
    
    /**
     * Gets (as xml) the "UserTimeZoneCode" element
     */
    org.apache.xmlbeans.XmlInt xgetUserTimeZoneCode();
    
    /**
     * Sets the "UserTimeZoneCode" element
     */
    void setUserTimeZoneCode(int userTimeZoneCode);
    
    /**
     * Sets (as xml) the "UserTimeZoneCode" element
     */
    void xsetUserTimeZoneCode(org.apache.xmlbeans.XmlInt userTimeZoneCode);
    
    /**
     * Gets the "RecurrenceDuration" element
     */
    int getRecurrenceDuration();
    
    /**
     * Gets (as xml) the "RecurrenceDuration" element
     */
    org.apache.xmlbeans.XmlInt xgetRecurrenceDuration();
    
    /**
     * Sets the "RecurrenceDuration" element
     */
    void setRecurrenceDuration(int recurrenceDuration);
    
    /**
     * Sets (as xml) the "RecurrenceDuration" element
     */
    void xsetRecurrenceDuration(org.apache.xmlbeans.XmlInt recurrenceDuration);
    
    /**
     * Gets the "RecurrenceTimeZoneCode" element
     */
    int getRecurrenceTimeZoneCode();
    
    /**
     * Gets (as xml) the "RecurrenceTimeZoneCode" element
     */
    org.apache.xmlbeans.XmlInt xgetRecurrenceTimeZoneCode();
    
    /**
     * Sets the "RecurrenceTimeZoneCode" element
     */
    void setRecurrenceTimeZoneCode(int recurrenceTimeZoneCode);
    
    /**
     * Sets (as xml) the "RecurrenceTimeZoneCode" element
     */
    void xsetRecurrenceTimeZoneCode(org.apache.xmlbeans.XmlInt recurrenceTimeZoneCode);
    
    /**
     * Gets the "AppointmentsToIgnore" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore getAppointmentsToIgnore();
    
    /**
     * True if has "AppointmentsToIgnore" element
     */
    boolean isSetAppointmentsToIgnore();
    
    /**
     * Sets the "AppointmentsToIgnore" element
     */
    void setAppointmentsToIgnore(com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore appointmentsToIgnore);
    
    /**
     * Appends and returns a new empty "AppointmentsToIgnore" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentsToIgnore addNewAppointmentsToIgnore();
    
    /**
     * Unsets the "AppointmentsToIgnore" element
     */
    void unsetAppointmentsToIgnore();
    
    /**
     * Gets the "RequiredResources" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource getRequiredResources();
    
    /**
     * True if has "RequiredResources" element
     */
    boolean isSetRequiredResources();
    
    /**
     * Sets the "RequiredResources" element
     */
    void setRequiredResources(com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource requiredResources);
    
    /**
     * Appends and returns a new empty "RequiredResources" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfRequiredResource addNewRequiredResources();
    
    /**
     * Unsets the "RequiredResources" element
     */
    void unsetRequiredResources();
    
    /**
     * Gets the "SearchWindowStart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getSearchWindowStart();
    
    /**
     * True if has "SearchWindowStart" element
     */
    boolean isSetSearchWindowStart();
    
    /**
     * Sets the "SearchWindowStart" element
     */
    void setSearchWindowStart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime searchWindowStart);
    
    /**
     * Appends and returns a new empty "SearchWindowStart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewSearchWindowStart();
    
    /**
     * Unsets the "SearchWindowStart" element
     */
    void unsetSearchWindowStart();
    
    /**
     * Gets the "SearchWindowEnd" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getSearchWindowEnd();
    
    /**
     * True if has "SearchWindowEnd" element
     */
    boolean isSetSearchWindowEnd();
    
    /**
     * Sets the "SearchWindowEnd" element
     */
    void setSearchWindowEnd(com.microsoft.schemas.crm._2006.webservices.CrmDateTime searchWindowEnd);
    
    /**
     * Appends and returns a new empty "SearchWindowEnd" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewSearchWindowEnd();
    
    /**
     * Unsets the "SearchWindowEnd" element
     */
    void unsetSearchWindowEnd();
    
    /**
     * Gets the "SearchRecurrenceStart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getSearchRecurrenceStart();
    
    /**
     * True if has "SearchRecurrenceStart" element
     */
    boolean isSetSearchRecurrenceStart();
    
    /**
     * Sets the "SearchRecurrenceStart" element
     */
    void setSearchRecurrenceStart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime searchRecurrenceStart);
    
    /**
     * Appends and returns a new empty "SearchRecurrenceStart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewSearchRecurrenceStart();
    
    /**
     * Unsets the "SearchRecurrenceStart" element
     */
    void unsetSearchRecurrenceStart();
    
    /**
     * Gets the "SearchRecurrenceRule" element
     */
    java.lang.String getSearchRecurrenceRule();
    
    /**
     * Gets (as xml) the "SearchRecurrenceRule" element
     */
    org.apache.xmlbeans.XmlString xgetSearchRecurrenceRule();
    
    /**
     * True if has "SearchRecurrenceRule" element
     */
    boolean isSetSearchRecurrenceRule();
    
    /**
     * Sets the "SearchRecurrenceRule" element
     */
    void setSearchRecurrenceRule(java.lang.String searchRecurrenceRule);
    
    /**
     * Sets (as xml) the "SearchRecurrenceRule" element
     */
    void xsetSearchRecurrenceRule(org.apache.xmlbeans.XmlString searchRecurrenceRule);
    
    /**
     * Unsets the "SearchRecurrenceRule" element
     */
    void unsetSearchRecurrenceRule();
    
    /**
     * Gets the "Duration" element
     */
    int getDuration();
    
    /**
     * Gets (as xml) the "Duration" element
     */
    org.apache.xmlbeans.XmlInt xgetDuration();
    
    /**
     * Sets the "Duration" element
     */
    void setDuration(int duration);
    
    /**
     * Sets (as xml) the "Duration" element
     */
    void xsetDuration(org.apache.xmlbeans.XmlInt duration);
    
    /**
     * Gets the "Constraints" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation getConstraints();
    
    /**
     * True if has "Constraints" element
     */
    boolean isSetConstraints();
    
    /**
     * Sets the "Constraints" element
     */
    void setConstraints(com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation constraints);
    
    /**
     * Appends and returns a new empty "Constraints" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfConstraintRelation addNewConstraints();
    
    /**
     * Unsets the "Constraints" element
     */
    void unsetConstraints();
    
    /**
     * Gets the "Objectives" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation getObjectives();
    
    /**
     * True if has "Objectives" element
     */
    boolean isSetObjectives();
    
    /**
     * Sets the "Objectives" element
     */
    void setObjectives(com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation objectives);
    
    /**
     * Appends and returns a new empty "Objectives" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation addNewObjectives();
    
    /**
     * Unsets the "Objectives" element
     */
    void unsetObjectives();
    
    /**
     * Gets the "Direction" element
     */
    com.microsoft.schemas.crm._2006.scheduling.SearchDirection.Enum getDirection();
    
    /**
     * Gets (as xml) the "Direction" element
     */
    com.microsoft.schemas.crm._2006.scheduling.SearchDirection xgetDirection();
    
    /**
     * Sets the "Direction" element
     */
    void setDirection(com.microsoft.schemas.crm._2006.scheduling.SearchDirection.Enum direction);
    
    /**
     * Sets (as xml) the "Direction" element
     */
    void xsetDirection(com.microsoft.schemas.crm._2006.scheduling.SearchDirection direction);
    
    /**
     * Gets the "NumberOfResults" element
     */
    int getNumberOfResults();
    
    /**
     * Gets (as xml) the "NumberOfResults" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfResults();
    
    /**
     * Sets the "NumberOfResults" element
     */
    void setNumberOfResults(int numberOfResults);
    
    /**
     * Sets (as xml) the "NumberOfResults" element
     */
    void xsetNumberOfResults(org.apache.xmlbeans.XmlInt numberOfResults);
    
    /**
     * Gets the "Sites" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid getSites();
    
    /**
     * True if has "Sites" element
     */
    boolean isSetSites();
    
    /**
     * Sets the "Sites" element
     */
    void setSites(com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid sites);
    
    /**
     * Appends and returns a new empty "Sites" element
     */
    com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid addNewSites();
    
    /**
     * Unsets the "Sites" element
     */
    void unsetSites();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest newInstance() {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2006.scheduling.AppointmentRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
