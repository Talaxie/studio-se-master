/*
 * XML Type:  calendarrule
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Calendarrule
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML calendarrule(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Calendarrule extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Calendarrule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("calendarrule4b78type");
    
    /**
     * Gets the "businessunitid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getBusinessunitid();
    
    /**
     * True if has "businessunitid" element
     */
    boolean isSetBusinessunitid();
    
    /**
     * Sets the "businessunitid" element
     */
    void setBusinessunitid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier businessunitid);
    
    /**
     * Appends and returns a new empty "businessunitid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewBusinessunitid();
    
    /**
     * Unsets the "businessunitid" element
     */
    void unsetBusinessunitid();
    
    /**
     * Gets the "calendarid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getCalendarid();
    
    /**
     * True if has "calendarid" element
     */
    boolean isSetCalendarid();
    
    /**
     * Sets the "calendarid" element
     */
    void setCalendarid(com.microsoft.schemas.crm._2006.webservices.Lookup calendarid);
    
    /**
     * Appends and returns a new empty "calendarid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewCalendarid();
    
    /**
     * Unsets the "calendarid" element
     */
    void unsetCalendarid();
    
    /**
     * Gets the "calendarruleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getCalendarruleid();
    
    /**
     * True if has "calendarruleid" element
     */
    boolean isSetCalendarruleid();
    
    /**
     * Sets the "calendarruleid" element
     */
    void setCalendarruleid(com.microsoft.schemas.crm._2006.webservices.Key calendarruleid);
    
    /**
     * Appends and returns a new empty "calendarruleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewCalendarruleid();
    
    /**
     * Unsets the "calendarruleid" element
     */
    void unsetCalendarruleid();
    
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
     * Gets the "duration" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getDuration();
    
    /**
     * True if has "duration" element
     */
    boolean isSetDuration();
    
    /**
     * Sets the "duration" element
     */
    void setDuration(com.microsoft.schemas.crm._2006.webservices.CrmNumber duration);
    
    /**
     * Appends and returns a new empty "duration" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDuration();
    
    /**
     * Unsets the "duration" element
     */
    void unsetDuration();
    
    /**
     * Gets the "effectiveintervalend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEffectiveintervalend();
    
    /**
     * True if has "effectiveintervalend" element
     */
    boolean isSetEffectiveintervalend();
    
    /**
     * Sets the "effectiveintervalend" element
     */
    void setEffectiveintervalend(com.microsoft.schemas.crm._2006.webservices.CrmDateTime effectiveintervalend);
    
    /**
     * Appends and returns a new empty "effectiveintervalend" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEffectiveintervalend();
    
    /**
     * Unsets the "effectiveintervalend" element
     */
    void unsetEffectiveintervalend();
    
    /**
     * Gets the "effectiveintervalstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEffectiveintervalstart();
    
    /**
     * True if has "effectiveintervalstart" element
     */
    boolean isSetEffectiveintervalstart();
    
    /**
     * Sets the "effectiveintervalstart" element
     */
    void setEffectiveintervalstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime effectiveintervalstart);
    
    /**
     * Appends and returns a new empty "effectiveintervalstart" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEffectiveintervalstart();
    
    /**
     * Unsets the "effectiveintervalstart" element
     */
    void unsetEffectiveintervalstart();
    
    /**
     * Gets the "effort" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat getEffort();
    
    /**
     * True if has "effort" element
     */
    boolean isSetEffort();
    
    /**
     * Sets the "effort" element
     */
    void setEffort(com.microsoft.schemas.crm._2006.webservices.CrmFloat effort);
    
    /**
     * Appends and returns a new empty "effort" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewEffort();
    
    /**
     * Unsets the "effort" element
     */
    void unsetEffort();
    
    /**
     * Gets the "endtime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEndtime();
    
    /**
     * True if has "endtime" element
     */
    boolean isSetEndtime();
    
    /**
     * Sets the "endtime" element
     */
    void setEndtime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime endtime);
    
    /**
     * Appends and returns a new empty "endtime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEndtime();
    
    /**
     * Unsets the "endtime" element
     */
    void unsetEndtime();
    
    /**
     * Gets the "extentcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getExtentcode();
    
    /**
     * True if has "extentcode" element
     */
    boolean isSetExtentcode();
    
    /**
     * Sets the "extentcode" element
     */
    void setExtentcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber extentcode);
    
    /**
     * Appends and returns a new empty "extentcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewExtentcode();
    
    /**
     * Unsets the "extentcode" element
     */
    void unsetExtentcode();
    
    /**
     * Gets the "groupdesignator" element
     */
    java.lang.String getGroupdesignator();
    
    /**
     * Gets (as xml) the "groupdesignator" element
     */
    org.apache.xmlbeans.XmlString xgetGroupdesignator();
    
    /**
     * True if has "groupdesignator" element
     */
    boolean isSetGroupdesignator();
    
    /**
     * Sets the "groupdesignator" element
     */
    void setGroupdesignator(java.lang.String groupdesignator);
    
    /**
     * Sets (as xml) the "groupdesignator" element
     */
    void xsetGroupdesignator(org.apache.xmlbeans.XmlString groupdesignator);
    
    /**
     * Unsets the "groupdesignator" element
     */
    void unsetGroupdesignator();
    
    /**
     * Gets the "innercalendarid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getInnercalendarid();
    
    /**
     * True if has "innercalendarid" element
     */
    boolean isSetInnercalendarid();
    
    /**
     * Sets the "innercalendarid" element
     */
    void setInnercalendarid(com.microsoft.schemas.crm._2006.webservices.Lookup innercalendarid);
    
    /**
     * Appends and returns a new empty "innercalendarid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewInnercalendarid();
    
    /**
     * Unsets the "innercalendarid" element
     */
    void unsetInnercalendarid();
    
    /**
     * Gets the "ismodified" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsmodified();
    
    /**
     * True if has "ismodified" element
     */
    boolean isSetIsmodified();
    
    /**
     * Sets the "ismodified" element
     */
    void setIsmodified(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ismodified);
    
    /**
     * Appends and returns a new empty "ismodified" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsmodified();
    
    /**
     * Unsets the "ismodified" element
     */
    void unsetIsmodified();
    
    /**
     * Gets the "isselected" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsselected();
    
    /**
     * True if has "isselected" element
     */
    boolean isSetIsselected();
    
    /**
     * Sets the "isselected" element
     */
    void setIsselected(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isselected);
    
    /**
     * Appends and returns a new empty "isselected" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsselected();
    
    /**
     * Unsets the "isselected" element
     */
    void unsetIsselected();
    
    /**
     * Gets the "issimple" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIssimple();
    
    /**
     * True if has "issimple" element
     */
    boolean isSetIssimple();
    
    /**
     * Sets the "issimple" element
     */
    void setIssimple(com.microsoft.schemas.crm._2006.webservices.CrmBoolean issimple);
    
    /**
     * Appends and returns a new empty "issimple" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIssimple();
    
    /**
     * Unsets the "issimple" element
     */
    void unsetIssimple();
    
    /**
     * Gets the "isvaried" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsvaried();
    
    /**
     * True if has "isvaried" element
     */
    boolean isSetIsvaried();
    
    /**
     * Sets the "isvaried" element
     */
    void setIsvaried(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isvaried);
    
    /**
     * Appends and returns a new empty "isvaried" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsvaried();
    
    /**
     * Unsets the "isvaried" element
     */
    void unsetIsvaried();
    
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
     * Gets the "offset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getOffset();
    
    /**
     * True if has "offset" element
     */
    boolean isSetOffset();
    
    /**
     * Sets the "offset" element
     */
    void setOffset(com.microsoft.schemas.crm._2006.webservices.CrmNumber offset);
    
    /**
     * Appends and returns a new empty "offset" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewOffset();
    
    /**
     * Unsets the "offset" element
     */
    void unsetOffset();
    
    /**
     * Gets the "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOrganizationid();
    
    /**
     * True if has "organizationid" element
     */
    boolean isSetOrganizationid();
    
    /**
     * Sets the "organizationid" element
     */
    void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier organizationid);
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOrganizationid();
    
    /**
     * Unsets the "organizationid" element
     */
    void unsetOrganizationid();
    
    /**
     * Gets the "pattern" element
     */
    java.lang.String getPattern();
    
    /**
     * Gets (as xml) the "pattern" element
     */
    org.apache.xmlbeans.XmlString xgetPattern();
    
    /**
     * True if has "pattern" element
     */
    boolean isSetPattern();
    
    /**
     * Sets the "pattern" element
     */
    void setPattern(java.lang.String pattern);
    
    /**
     * Sets (as xml) the "pattern" element
     */
    void xsetPattern(org.apache.xmlbeans.XmlString pattern);
    
    /**
     * Unsets the "pattern" element
     */
    void unsetPattern();
    
    /**
     * Gets the "rank" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getRank();
    
    /**
     * True if has "rank" element
     */
    boolean isSetRank();
    
    /**
     * Sets the "rank" element
     */
    void setRank(com.microsoft.schemas.crm._2006.webservices.CrmNumber rank);
    
    /**
     * Appends and returns a new empty "rank" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewRank();
    
    /**
     * Unsets the "rank" element
     */
    void unsetRank();
    
    /**
     * Gets the "serviceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getServiceid();
    
    /**
     * True if has "serviceid" element
     */
    boolean isSetServiceid();
    
    /**
     * Sets the "serviceid" element
     */
    void setServiceid(com.microsoft.schemas.crm._2006.webservices.Lookup serviceid);
    
    /**
     * Appends and returns a new empty "serviceid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewServiceid();
    
    /**
     * Unsets the "serviceid" element
     */
    void unsetServiceid();
    
    /**
     * Gets the "starttime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStarttime();
    
    /**
     * True if has "starttime" element
     */
    boolean isSetStarttime();
    
    /**
     * Sets the "starttime" element
     */
    void setStarttime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime starttime);
    
    /**
     * Appends and returns a new empty "starttime" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStarttime();
    
    /**
     * Unsets the "starttime" element
     */
    void unsetStarttime();
    
    /**
     * Gets the "subcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getSubcode();
    
    /**
     * True if has "subcode" element
     */
    boolean isSetSubcode();
    
    /**
     * Sets the "subcode" element
     */
    void setSubcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber subcode);
    
    /**
     * Appends and returns a new empty "subcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSubcode();
    
    /**
     * Unsets the "subcode" element
     */
    void unsetSubcode();
    
    /**
     * Gets the "timecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimecode();
    
    /**
     * True if has "timecode" element
     */
    boolean isSetTimecode();
    
    /**
     * Sets the "timecode" element
     */
    void setTimecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber timecode);
    
    /**
     * Appends and returns a new empty "timecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimecode();
    
    /**
     * Unsets the "timecode" element
     */
    void unsetTimecode();
    
    /**
     * Gets the "timezonecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezonecode();
    
    /**
     * True if has "timezonecode" element
     */
    boolean isSetTimezonecode();
    
    /**
     * Sets the "timezonecode" element
     */
    void setTimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezonecode);
    
    /**
     * Appends and returns a new empty "timezonecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezonecode();
    
    /**
     * Unsets the "timezonecode" element
     */
    void unsetTimezonecode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Calendarrule parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Calendarrule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
