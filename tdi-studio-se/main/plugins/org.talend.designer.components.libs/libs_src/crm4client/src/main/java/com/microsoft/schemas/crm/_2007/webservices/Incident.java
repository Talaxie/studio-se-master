/*
 * XML Type:  incident
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Incident
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices;


/**
 * An XML incident(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public interface Incident extends com.microsoft.schemas.crm._2006.webservices.BusinessEntity
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Incident.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE3DFDC56E75679F2AF264CA469AD5996").resolveHandle("incidentf390type");
    
    /**
     * Gets the "actualserviceunits" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getActualserviceunits();
    
    /**
     * True if has "actualserviceunits" element
     */
    boolean isSetActualserviceunits();
    
    /**
     * Sets the "actualserviceunits" element
     */
    void setActualserviceunits(com.microsoft.schemas.crm._2006.webservices.CrmNumber actualserviceunits);
    
    /**
     * Appends and returns a new empty "actualserviceunits" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewActualserviceunits();
    
    /**
     * Unsets the "actualserviceunits" element
     */
    void unsetActualserviceunits();
    
    /**
     * Gets the "billedserviceunits" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber getBilledserviceunits();
    
    /**
     * True if has "billedserviceunits" element
     */
    boolean isSetBilledserviceunits();
    
    /**
     * Sets the "billedserviceunits" element
     */
    void setBilledserviceunits(com.microsoft.schemas.crm._2006.webservices.CrmNumber billedserviceunits);
    
    /**
     * Appends and returns a new empty "billedserviceunits" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewBilledserviceunits();
    
    /**
     * Unsets the "billedserviceunits" element
     */
    void unsetBilledserviceunits();
    
    /**
     * Gets the "caseorigincode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getCaseorigincode();
    
    /**
     * True if has "caseorigincode" element
     */
    boolean isSetCaseorigincode();
    
    /**
     * Sets the "caseorigincode" element
     */
    void setCaseorigincode(com.microsoft.schemas.crm._2006.webservices.Picklist caseorigincode);
    
    /**
     * Appends and returns a new empty "caseorigincode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewCaseorigincode();
    
    /**
     * Unsets the "caseorigincode" element
     */
    void unsetCaseorigincode();
    
    /**
     * Gets the "casetypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getCasetypecode();
    
    /**
     * True if has "casetypecode" element
     */
    boolean isSetCasetypecode();
    
    /**
     * Sets the "casetypecode" element
     */
    void setCasetypecode(com.microsoft.schemas.crm._2006.webservices.Picklist casetypecode);
    
    /**
     * Appends and returns a new empty "casetypecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewCasetypecode();
    
    /**
     * Unsets the "casetypecode" element
     */
    void unsetCasetypecode();
    
    /**
     * Gets the "contractdetailid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getContractdetailid();
    
    /**
     * True if has "contractdetailid" element
     */
    boolean isSetContractdetailid();
    
    /**
     * Sets the "contractdetailid" element
     */
    void setContractdetailid(com.microsoft.schemas.crm._2006.webservices.Lookup contractdetailid);
    
    /**
     * Appends and returns a new empty "contractdetailid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewContractdetailid();
    
    /**
     * Unsets the "contractdetailid" element
     */
    void unsetContractdetailid();
    
    /**
     * Gets the "contractid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getContractid();
    
    /**
     * True if has "contractid" element
     */
    boolean isSetContractid();
    
    /**
     * Sets the "contractid" element
     */
    void setContractid(com.microsoft.schemas.crm._2006.webservices.Lookup contractid);
    
    /**
     * Appends and returns a new empty "contractid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewContractid();
    
    /**
     * Unsets the "contractid" element
     */
    void unsetContractid();
    
    /**
     * Gets the "contractservicelevelcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getContractservicelevelcode();
    
    /**
     * True if has "contractservicelevelcode" element
     */
    boolean isSetContractservicelevelcode();
    
    /**
     * Sets the "contractservicelevelcode" element
     */
    void setContractservicelevelcode(com.microsoft.schemas.crm._2006.webservices.Picklist contractservicelevelcode);
    
    /**
     * Appends and returns a new empty "contractservicelevelcode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewContractservicelevelcode();
    
    /**
     * Unsets the "contractservicelevelcode" element
     */
    void unsetContractservicelevelcode();
    
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
     * Gets the "customersatisfactioncode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getCustomersatisfactioncode();
    
    /**
     * True if has "customersatisfactioncode" element
     */
    boolean isSetCustomersatisfactioncode();
    
    /**
     * Sets the "customersatisfactioncode" element
     */
    void setCustomersatisfactioncode(com.microsoft.schemas.crm._2006.webservices.Picklist customersatisfactioncode);
    
    /**
     * Appends and returns a new empty "customersatisfactioncode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewCustomersatisfactioncode();
    
    /**
     * Unsets the "customersatisfactioncode" element
     */
    void unsetCustomersatisfactioncode();
    
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
     * Gets the "followupby" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime getFollowupby();
    
    /**
     * True if has "followupby" element
     */
    boolean isSetFollowupby();
    
    /**
     * Sets the "followupby" element
     */
    void setFollowupby(com.microsoft.schemas.crm._2006.webservices.CrmDateTime followupby);
    
    /**
     * Appends and returns a new empty "followupby" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewFollowupby();
    
    /**
     * Unsets the "followupby" element
     */
    void unsetFollowupby();
    
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
     * Gets the "incidentid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key getIncidentid();
    
    /**
     * True if has "incidentid" element
     */
    boolean isSetIncidentid();
    
    /**
     * Sets the "incidentid" element
     */
    void setIncidentid(com.microsoft.schemas.crm._2006.webservices.Key incidentid);
    
    /**
     * Appends and returns a new empty "incidentid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Key addNewIncidentid();
    
    /**
     * Unsets the "incidentid" element
     */
    void unsetIncidentid();
    
    /**
     * Gets the "incidentstagecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getIncidentstagecode();
    
    /**
     * True if has "incidentstagecode" element
     */
    boolean isSetIncidentstagecode();
    
    /**
     * Sets the "incidentstagecode" element
     */
    void setIncidentstagecode(com.microsoft.schemas.crm._2006.webservices.Picklist incidentstagecode);
    
    /**
     * Appends and returns a new empty "incidentstagecode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewIncidentstagecode();
    
    /**
     * Unsets the "incidentstagecode" element
     */
    void unsetIncidentstagecode();
    
    /**
     * Gets the "isdecrementing" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsdecrementing();
    
    /**
     * True if has "isdecrementing" element
     */
    boolean isSetIsdecrementing();
    
    /**
     * Sets the "isdecrementing" element
     */
    void setIsdecrementing(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isdecrementing);
    
    /**
     * Appends and returns a new empty "isdecrementing" element
     */
    com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsdecrementing();
    
    /**
     * Unsets the "isdecrementing" element
     */
    void unsetIsdecrementing();
    
    /**
     * Gets the "kbarticleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getKbarticleid();
    
    /**
     * True if has "kbarticleid" element
     */
    boolean isSetKbarticleid();
    
    /**
     * Sets the "kbarticleid" element
     */
    void setKbarticleid(com.microsoft.schemas.crm._2006.webservices.Lookup kbarticleid);
    
    /**
     * Appends and returns a new empty "kbarticleid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewKbarticleid();
    
    /**
     * Unsets the "kbarticleid" element
     */
    void unsetKbarticleid();
    
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
     * Gets the "prioritycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getPrioritycode();
    
    /**
     * True if has "prioritycode" element
     */
    boolean isSetPrioritycode();
    
    /**
     * Sets the "prioritycode" element
     */
    void setPrioritycode(com.microsoft.schemas.crm._2006.webservices.Picklist prioritycode);
    
    /**
     * Appends and returns a new empty "prioritycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewPrioritycode();
    
    /**
     * Unsets the "prioritycode" element
     */
    void unsetPrioritycode();
    
    /**
     * Gets the "productid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getProductid();
    
    /**
     * True if has "productid" element
     */
    boolean isSetProductid();
    
    /**
     * Sets the "productid" element
     */
    void setProductid(com.microsoft.schemas.crm._2006.webservices.Lookup productid);
    
    /**
     * Appends and returns a new empty "productid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewProductid();
    
    /**
     * Unsets the "productid" element
     */
    void unsetProductid();
    
    /**
     * Gets the "productserialnumber" element
     */
    java.lang.String getProductserialnumber();
    
    /**
     * Gets (as xml) the "productserialnumber" element
     */
    org.apache.xmlbeans.XmlString xgetProductserialnumber();
    
    /**
     * True if has "productserialnumber" element
     */
    boolean isSetProductserialnumber();
    
    /**
     * Sets the "productserialnumber" element
     */
    void setProductserialnumber(java.lang.String productserialnumber);
    
    /**
     * Sets (as xml) the "productserialnumber" element
     */
    void xsetProductserialnumber(org.apache.xmlbeans.XmlString productserialnumber);
    
    /**
     * Unsets the "productserialnumber" element
     */
    void unsetProductserialnumber();
    
    /**
     * Gets the "responsiblecontactid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getResponsiblecontactid();
    
    /**
     * True if has "responsiblecontactid" element
     */
    boolean isSetResponsiblecontactid();
    
    /**
     * Sets the "responsiblecontactid" element
     */
    void setResponsiblecontactid(com.microsoft.schemas.crm._2006.webservices.Lookup responsiblecontactid);
    
    /**
     * Appends and returns a new empty "responsiblecontactid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewResponsiblecontactid();
    
    /**
     * Unsets the "responsiblecontactid" element
     */
    void unsetResponsiblecontactid();
    
    /**
     * Gets the "severitycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist getSeveritycode();
    
    /**
     * True if has "severitycode" element
     */
    boolean isSetSeveritycode();
    
    /**
     * Sets the "severitycode" element
     */
    void setSeveritycode(com.microsoft.schemas.crm._2006.webservices.Picklist severitycode);
    
    /**
     * Appends and returns a new empty "severitycode" element
     */
    com.microsoft.schemas.crm._2006.webservices.Picklist addNewSeveritycode();
    
    /**
     * Unsets the "severitycode" element
     */
    void unsetSeveritycode();
    
    /**
     * Gets the "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo getStatecode();
    
    /**
     * True if has "statecode" element
     */
    boolean isSetStatecode();
    
    /**
     * Sets the "statecode" element
     */
    void setStatecode(com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo statecode);
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo addNewStatecode();
    
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
     * Gets the "subjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup getSubjectid();
    
    /**
     * True if has "subjectid" element
     */
    boolean isSetSubjectid();
    
    /**
     * Sets the "subjectid" element
     */
    void setSubjectid(com.microsoft.schemas.crm._2006.webservices.Lookup subjectid);
    
    /**
     * Appends and returns a new empty "subjectid" element
     */
    com.microsoft.schemas.crm._2006.webservices.Lookup addNewSubjectid();
    
    /**
     * Unsets the "subjectid" element
     */
    void unsetSubjectid();
    
    /**
     * Gets the "ticketnumber" element
     */
    java.lang.String getTicketnumber();
    
    /**
     * Gets (as xml) the "ticketnumber" element
     */
    org.apache.xmlbeans.XmlString xgetTicketnumber();
    
    /**
     * True if has "ticketnumber" element
     */
    boolean isSetTicketnumber();
    
    /**
     * Sets the "ticketnumber" element
     */
    void setTicketnumber(java.lang.String ticketnumber);
    
    /**
     * Sets (as xml) the "ticketnumber" element
     */
    void xsetTicketnumber(org.apache.xmlbeans.XmlString ticketnumber);
    
    /**
     * Unsets the "ticketnumber" element
     */
    void unsetTicketnumber();
    
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
     * Gets the "title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
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
        public static com.microsoft.schemas.crm._2007.webservices.Incident newInstance() {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2007.webservices.Incident parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2007.webservices.Incident) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
