/*
 * XML Type:  timezonerule
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Timezonerule
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML timezonerule(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Timezonerule extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Timezonerule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("timezoneruleddf3type");
    
    /**
     * Gets the "bias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getBias();
    
    /**
     * True if has "bias" element
     */
    boolean isSetBias();
    
    /**
     * Sets the "bias" element
     */
    void setBias(com.microsoft.schemas.crm._2006.webservices.CrmNumber bias);
    
    /**
     * Appends and returns a new empty "bias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewBias();
    
    /**
     * Unsets the "bias" element
     */
    void unsetBias();
    
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
     * Gets the "daylightbias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightbias();
    
    /**
     * True if has "daylightbias" element
     */
    boolean isSetDaylightbias();
    
    /**
     * Sets the "daylightbias" element
     */
    void setDaylightbias(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightbias);
    
    /**
     * Appends and returns a new empty "daylightbias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightbias();
    
    /**
     * Unsets the "daylightbias" element
     */
    void unsetDaylightbias();
    
    /**
     * Gets the "daylightday" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightday();
    
    /**
     * True if has "daylightday" element
     */
    boolean isSetDaylightday();
    
    /**
     * Sets the "daylightday" element
     */
    void setDaylightday(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightday);
    
    /**
     * Appends and returns a new empty "daylightday" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightday();
    
    /**
     * Unsets the "daylightday" element
     */
    void unsetDaylightday();
    
    /**
     * Gets the "daylightdayofweek" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightdayofweek();
    
    /**
     * True if has "daylightdayofweek" element
     */
    boolean isSetDaylightdayofweek();
    
    /**
     * Sets the "daylightdayofweek" element
     */
    void setDaylightdayofweek(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightdayofweek);
    
    /**
     * Appends and returns a new empty "daylightdayofweek" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightdayofweek();
    
    /**
     * Unsets the "daylightdayofweek" element
     */
    void unsetDaylightdayofweek();
    
    /**
     * Gets the "daylighthour" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylighthour();
    
    /**
     * True if has "daylighthour" element
     */
    boolean isSetDaylighthour();
    
    /**
     * Sets the "daylighthour" element
     */
    void setDaylighthour(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylighthour);
    
    /**
     * Appends and returns a new empty "daylighthour" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylighthour();
    
    /**
     * Unsets the "daylighthour" element
     */
    void unsetDaylighthour();
    
    /**
     * Gets the "daylightminute" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightminute();
    
    /**
     * True if has "daylightminute" element
     */
    boolean isSetDaylightminute();
    
    /**
     * Sets the "daylightminute" element
     */
    void setDaylightminute(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightminute);
    
    /**
     * Appends and returns a new empty "daylightminute" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightminute();
    
    /**
     * Unsets the "daylightminute" element
     */
    void unsetDaylightminute();
    
    /**
     * Gets the "daylightmonth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightmonth();
    
    /**
     * True if has "daylightmonth" element
     */
    boolean isSetDaylightmonth();
    
    /**
     * Sets the "daylightmonth" element
     */
    void setDaylightmonth(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightmonth);
    
    /**
     * Appends and returns a new empty "daylightmonth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightmonth();
    
    /**
     * Unsets the "daylightmonth" element
     */
    void unsetDaylightmonth();
    
    /**
     * Gets the "daylightsecond" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightsecond();
    
    /**
     * True if has "daylightsecond" element
     */
    boolean isSetDaylightsecond();
    
    /**
     * Sets the "daylightsecond" element
     */
    void setDaylightsecond(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightsecond);
    
    /**
     * Appends and returns a new empty "daylightsecond" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightsecond();
    
    /**
     * Unsets the "daylightsecond" element
     */
    void unsetDaylightsecond();
    
    /**
     * Gets the "daylightyear" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightyear();
    
    /**
     * True if has "daylightyear" element
     */
    boolean isSetDaylightyear();
    
    /**
     * Sets the "daylightyear" element
     */
    void setDaylightyear(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightyear);
    
    /**
     * Appends and returns a new empty "daylightyear" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightyear();
    
    /**
     * Unsets the "daylightyear" element
     */
    void unsetDaylightyear();
    
    /**
     * Gets the "effectivedatetime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEffectivedatetime();
    
    /**
     * True if has "effectivedatetime" element
     */
    boolean isSetEffectivedatetime();
    
    /**
     * Sets the "effectivedatetime" element
     */
    void setEffectivedatetime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime effectivedatetime);
    
    /**
     * Appends and returns a new empty "effectivedatetime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEffectivedatetime();
    
    /**
     * Unsets the "effectivedatetime" element
     */
    void unsetEffectivedatetime();
    
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
     * Gets the "standardbias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardbias();
    
    /**
     * True if has "standardbias" element
     */
    boolean isSetStandardbias();
    
    /**
     * Sets the "standardbias" element
     */
    void setStandardbias(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardbias);
    
    /**
     * Appends and returns a new empty "standardbias" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardbias();
    
    /**
     * Unsets the "standardbias" element
     */
    void unsetStandardbias();
    
    /**
     * Gets the "standardday" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardday();
    
    /**
     * True if has "standardday" element
     */
    boolean isSetStandardday();
    
    /**
     * Sets the "standardday" element
     */
    void setStandardday(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardday);
    
    /**
     * Appends and returns a new empty "standardday" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardday();
    
    /**
     * Unsets the "standardday" element
     */
    void unsetStandardday();
    
    /**
     * Gets the "standarddayofweek" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandarddayofweek();
    
    /**
     * True if has "standarddayofweek" element
     */
    boolean isSetStandarddayofweek();
    
    /**
     * Sets the "standarddayofweek" element
     */
    void setStandarddayofweek(com.microsoft.schemas.crm._2006.webservices.CrmNumber standarddayofweek);
    
    /**
     * Appends and returns a new empty "standarddayofweek" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandarddayofweek();
    
    /**
     * Unsets the "standarddayofweek" element
     */
    void unsetStandarddayofweek();
    
    /**
     * Gets the "standardhour" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardhour();
    
    /**
     * True if has "standardhour" element
     */
    boolean isSetStandardhour();
    
    /**
     * Sets the "standardhour" element
     */
    void setStandardhour(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardhour);
    
    /**
     * Appends and returns a new empty "standardhour" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardhour();
    
    /**
     * Unsets the "standardhour" element
     */
    void unsetStandardhour();
    
    /**
     * Gets the "standardminute" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardminute();
    
    /**
     * True if has "standardminute" element
     */
    boolean isSetStandardminute();
    
    /**
     * Sets the "standardminute" element
     */
    void setStandardminute(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardminute);
    
    /**
     * Appends and returns a new empty "standardminute" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardminute();
    
    /**
     * Unsets the "standardminute" element
     */
    void unsetStandardminute();
    
    /**
     * Gets the "standardmonth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardmonth();
    
    /**
     * True if has "standardmonth" element
     */
    boolean isSetStandardmonth();
    
    /**
     * Sets the "standardmonth" element
     */
    void setStandardmonth(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardmonth);
    
    /**
     * Appends and returns a new empty "standardmonth" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardmonth();
    
    /**
     * Unsets the "standardmonth" element
     */
    void unsetStandardmonth();
    
    /**
     * Gets the "standardsecond" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardsecond();
    
    /**
     * True if has "standardsecond" element
     */
    boolean isSetStandardsecond();
    
    /**
     * Sets the "standardsecond" element
     */
    void setStandardsecond(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardsecond);
    
    /**
     * Appends and returns a new empty "standardsecond" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardsecond();
    
    /**
     * Unsets the "standardsecond" element
     */
    void unsetStandardsecond();
    
    /**
     * Gets the "standardyear" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardyear();
    
    /**
     * True if has "standardyear" element
     */
    boolean isSetStandardyear();
    
    /**
     * Sets the "standardyear" element
     */
    void setStandardyear(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardyear);
    
    /**
     * Appends and returns a new empty "standardyear" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardyear();
    
    /**
     * Unsets the "standardyear" element
     */
    void unsetStandardyear();
    
    /**
     * Gets the "timezonedefinitionid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getTimezonedefinitionid();
    
    /**
     * True if has "timezonedefinitionid" element
     */
    boolean isSetTimezonedefinitionid();
    
    /**
     * Sets the "timezonedefinitionid" element
     */
    void setTimezonedefinitionid(com.microsoft.schemas.crm._2006.webservices.Lookup timezonedefinitionid);
    
    /**
     * Appends and returns a new empty "timezonedefinitionid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewTimezonedefinitionid();
    
    /**
     * Unsets the "timezonedefinitionid" element
     */
    void unsetTimezonedefinitionid();
    
    /**
     * Gets the "timezoneruleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getTimezoneruleid();
    
    /**
     * True if has "timezoneruleid" element
     */
    boolean isSetTimezoneruleid();
    
    /**
     * Sets the "timezoneruleid" element
     */
    void setTimezoneruleid(com.microsoft.schemas.crm._2006.webservices.Key timezoneruleid);
    
    /**
     * Appends and returns a new empty "timezoneruleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewTimezoneruleid();
    
    /**
     * Unsets the "timezoneruleid" element
     */
    void unsetTimezoneruleid();
    
    /**
     * Gets the "timezoneruleversionnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezoneruleversionnumber();
    
    /**
     * True if has "timezoneruleversionnumber" element
     */
    boolean isSetTimezoneruleversionnumber();
    
    /**
     * Sets the "timezoneruleversionnumber" element
     */
    void setTimezoneruleversionnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezoneruleversionnumber);
    
    /**
     * Appends and returns a new empty "timezoneruleversionnumber" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezoneruleversionnumber();
    
    /**
     * Unsets the "timezoneruleversionnumber" element
     */
    void unsetTimezoneruleversionnumber();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Timezonerule parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Timezonerule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
