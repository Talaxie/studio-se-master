/*
 * XML Type:  list
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.List
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML list(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface List extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(List.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("list50dctype");
    
    /**
     * Gets the "cost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getCost();
    
    /**
     * True if has "cost" element
     */
    boolean isSetCost();
    
    /**
     * Sets the "cost" element
     */
    void setCost(com.microsoft.schemas.crm._2006.webservices.CrmMoney cost);
    
    /**
     * Appends and returns a new empty "cost" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewCost();
    
    /**
     * Unsets the "cost" element
     */
    void unsetCost();
    
    /**
     * Gets the "cost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney getCostBase();
    
    /**
     * True if has "cost_base" element
     */
    boolean isSetCostBase();
    
    /**
     * Sets the "cost_base" element
     */
    void setCostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney costBase);
    
    /**
     * Appends and returns a new empty "cost_base" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewCostBase();
    
    /**
     * Unsets the "cost_base" element
     */
    void unsetCostBase();
    
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
     * Gets the "createdfromcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getCreatedfromcode();
    
    /**
     * True if has "createdfromcode" element
     */
    boolean isSetCreatedfromcode();
    
    /**
     * Sets the "createdfromcode" element
     */
    void setCreatedfromcode(com.microsoft.schemas.crm._2006.webservices.Picklist createdfromcode);
    
    /**
     * Appends and returns a new empty "createdfromcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewCreatedfromcode();
    
    /**
     * Unsets the "createdfromcode" element
     */
    void unsetCreatedfromcode();
    
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
     * Gets the "donotsendonoptout" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotsendonoptout();
    
    /**
     * True if has "donotsendonoptout" element
     */
    boolean isSetDonotsendonoptout();
    
    /**
     * Sets the "donotsendonoptout" element
     */
    void setDonotsendonoptout(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotsendonoptout);
    
    /**
     * Appends and returns a new empty "donotsendonoptout" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotsendonoptout();
    
    /**
     * Unsets the "donotsendonoptout" element
     */
    void unsetDonotsendonoptout();
    
    /**
     * Gets the "exchangerate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal getExchangerate();
    
    /**
     * True if has "exchangerate" element
     */
    boolean isSetExchangerate();
    
    /**
     * Sets the "exchangerate" element
     */
    void setExchangerate(com.microsoft.schemas.crm._2006.webservices.CrmDecimal exchangerate);
    
    /**
     * Appends and returns a new empty "exchangerate" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewExchangerate();
    
    /**
     * Unsets the "exchangerate" element
     */
    void unsetExchangerate();
    
    /**
     * Gets the "ignoreinactivelistmembers" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIgnoreinactivelistmembers();
    
    /**
     * True if has "ignoreinactivelistmembers" element
     */
    boolean isSetIgnoreinactivelistmembers();
    
    /**
     * Sets the "ignoreinactivelistmembers" element
     */
    void setIgnoreinactivelistmembers(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ignoreinactivelistmembers);
    
    /**
     * Appends and returns a new empty "ignoreinactivelistmembers" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIgnoreinactivelistmembers();
    
    /**
     * Unsets the "ignoreinactivelistmembers" element
     */
    void unsetIgnoreinactivelistmembers();
    
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
     * Gets the "lastusedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getLastusedon();
    
    /**
     * True if has "lastusedon" element
     */
    boolean isSetLastusedon();
    
    /**
     * Sets the "lastusedon" element
     */
    void setLastusedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime lastusedon);
    
    /**
     * Appends and returns a new empty "lastusedon" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewLastusedon();
    
    /**
     * Unsets the "lastusedon" element
     */
    void unsetLastusedon();
    
    /**
     * Gets the "listid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getListid();
    
    /**
     * True if has "listid" element
     */
    boolean isSetListid();
    
    /**
     * Sets the "listid" element
     */
    void setListid(com.microsoft.schemas.crm._2006.webservices.Key listid);
    
    /**
     * Appends and returns a new empty "listid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewListid();
    
    /**
     * Unsets the "listid" element
     */
    void unsetListid();
    
    /**
     * Gets the "listname" element
     */
    java.lang.String getListname();
    
    /**
     * Gets (as xml) the "listname" element
     */
    org.apache.xmlbeans.XmlString xgetListname();
    
    /**
     * True if has "listname" element
     */
    boolean isSetListname();
    
    /**
     * Sets the "listname" element
     */
    void setListname(java.lang.String listname);
    
    /**
     * Sets (as xml) the "listname" element
     */
    void xsetListname(org.apache.xmlbeans.XmlString listname);
    
    /**
     * Unsets the "listname" element
     */
    void unsetListname();
    
    /**
     * Gets the "lockstatus" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getLockstatus();
    
    /**
     * True if has "lockstatus" element
     */
    boolean isSetLockstatus();
    
    /**
     * Sets the "lockstatus" element
     */
    void setLockstatus(com.microsoft.schemas.crm._2006.webservices.CrmBoolean lockstatus);
    
    /**
     * Appends and returns a new empty "lockstatus" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewLockstatus();
    
    /**
     * Unsets the "lockstatus" element
     */
    void unsetLockstatus();
    
    /**
     * Gets the "membercount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getMembercount();
    
    /**
     * True if has "membercount" element
     */
    boolean isSetMembercount();
    
    /**
     * Sets the "membercount" element
     */
    void setMembercount(com.microsoft.schemas.crm._2006.webservices.CrmNumber membercount);
    
    /**
     * Appends and returns a new empty "membercount" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewMembercount();
    
    /**
     * Unsets the "membercount" element
     */
    void unsetMembercount();
    
    /**
     * Gets the "membertype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getMembertype();
    
    /**
     * True if has "membertype" element
     */
    boolean isSetMembertype();
    
    /**
     * Sets the "membertype" element
     */
    void setMembertype(com.microsoft.schemas.crm._2006.webservices.CrmNumber membertype);
    
    /**
     * Appends and returns a new empty "membertype" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewMembertype();
    
    /**
     * Unsets the "membertype" element
     */
    void unsetMembertype();
    
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
     * Gets the "purpose" element
     */
    java.lang.String getPurpose();
    
    /**
     * Gets (as xml) the "purpose" element
     */
    org.apache.xmlbeans.XmlString xgetPurpose();
    
    /**
     * True if has "purpose" element
     */
    boolean isSetPurpose();
    
    /**
     * Sets the "purpose" element
     */
    void setPurpose(java.lang.String purpose);
    
    /**
     * Sets (as xml) the "purpose" element
     */
    void xsetPurpose(org.apache.xmlbeans.XmlString purpose);
    
    /**
     * Unsets the "purpose" element
     */
    void unsetPurpose();
    
    /**
     * Gets the "source" element
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "source" element
     */
    org.apache.xmlbeans.XmlString xgetSource();
    
    /**
     * True if has "source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "source" element
     */
    void xsetSource(org.apache.xmlbeans.XmlString source);
    
    /**
     * Unsets the "source" element
     */
    void unsetSource();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ListStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.ListStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.ListStateInfo addNewStatecode();
    
    /**
     * Unsets the "statecode" element
     */
    void unsetStatecode();
    
    /**
     * Gets the "statuscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Status getStatuscode();
    
    /**
     * True if has "statuscode" element
     */
    boolean isSetStatuscode();
    
    /**
     * Sets the "statuscode" element
     */
    void setStatuscode(com.microsoft.schemas.crm._2006.webservices.Status statuscode);
    
    /**
     * Appends and returns a new empty "statuscode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Status addNewStatuscode();
    
    /**
     * Unsets the "statuscode" element
     */
    void unsetStatuscode();
    
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
     * Gets the "transactioncurrencyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getTransactioncurrencyid();
    
    /**
     * True if has "transactioncurrencyid" element
     */
    boolean isSetTransactioncurrencyid();
    
    /**
     * Sets the "transactioncurrencyid" element
     */
    void setTransactioncurrencyid(com.microsoft.schemas.crm._2006.webservices.Lookup transactioncurrencyid);
    
    /**
     * Appends and returns a new empty "transactioncurrencyid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewTransactioncurrencyid();
    
    /**
     * Unsets the "transactioncurrencyid" element
     */
    void unsetTransactioncurrencyid();
    
    /**
     * Gets the "utcconversiontimezonecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getUtcconversiontimezonecode();
    
    /**
     * True if has "utcconversiontimezonecode" element
     */
    boolean isSetUtcconversiontimezonecode();
    
    /**
     * Sets the "utcconversiontimezonecode" element
     */
    void setUtcconversiontimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber utcconversiontimezonecode);
    
    /**
     * Appends and returns a new empty "utcconversiontimezonecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUtcconversiontimezonecode();
    
    /**
     * Unsets the "utcconversiontimezonecode" element
     */
    void unsetUtcconversiontimezonecode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2007.webservices.List newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.List parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.List parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.List parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.List) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
