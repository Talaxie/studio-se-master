/*
 * XML Type:  incident
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Incident
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML incident(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class IncidentImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Incident
{
    
    public IncidentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTUALSERVICEUNITS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "actualserviceunits");
    private static final javax.xml.namespace.QName BILLEDSERVICEUNITS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billedserviceunits");
    private static final javax.xml.namespace.QName CASEORIGINCODE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "caseorigincode");
    private static final javax.xml.namespace.QName CASETYPECODE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "casetypecode");
    private static final javax.xml.namespace.QName CONTRACTDETAILID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contractdetailid");
    private static final javax.xml.namespace.QName CONTRACTID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contractid");
    private static final javax.xml.namespace.QName CONTRACTSERVICELEVELCODE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contractservicelevelcode");
    private static final javax.xml.namespace.QName CREATEDBY$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMERID$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customerid");
    private static final javax.xml.namespace.QName CUSTOMERSATISFACTIONCODE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customersatisfactioncode");
    private static final javax.xml.namespace.QName DESCRIPTION$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName FOLLOWUPBY$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "followupby");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName INCIDENTID$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "incidentid");
    private static final javax.xml.namespace.QName INCIDENTSTAGECODE$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "incidentstagecode");
    private static final javax.xml.namespace.QName ISDECREMENTING$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isdecrementing");
    private static final javax.xml.namespace.QName KBARTICLEID$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "kbarticleid");
    private static final javax.xml.namespace.QName MODIFIEDBY$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNERID$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownerid");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName PRIORITYCODE$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "prioritycode");
    private static final javax.xml.namespace.QName PRODUCTID$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productid");
    private static final javax.xml.namespace.QName PRODUCTSERIALNUMBER$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productserialnumber");
    private static final javax.xml.namespace.QName RESPONSIBLECONTACTID$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "responsiblecontactid");
    private static final javax.xml.namespace.QName SEVERITYCODE$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "severitycode");
    private static final javax.xml.namespace.QName STATECODE$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName SUBJECTID$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subjectid");
    private static final javax.xml.namespace.QName TICKETNUMBER$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ticketnumber");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TITLE$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "title");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "actualserviceunits" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getActualserviceunits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ACTUALSERVICEUNITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "actualserviceunits" element
     */
    public boolean isSetActualserviceunits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTUALSERVICEUNITS$0) != 0;
        }
    }
    
    /**
     * Sets the "actualserviceunits" element
     */
    public void setActualserviceunits(com.microsoft.schemas.crm._2006.webservices.CrmNumber actualserviceunits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ACTUALSERVICEUNITS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ACTUALSERVICEUNITS$0);
            }
            target.set(actualserviceunits);
        }
    }
    
    /**
     * Appends and returns a new empty "actualserviceunits" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewActualserviceunits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ACTUALSERVICEUNITS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "actualserviceunits" element
     */
    public void unsetActualserviceunits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTUALSERVICEUNITS$0, 0);
        }
    }
    
    /**
     * Gets the "billedserviceunits" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getBilledserviceunits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(BILLEDSERVICEUNITS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "billedserviceunits" element
     */
    public boolean isSetBilledserviceunits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLEDSERVICEUNITS$2) != 0;
        }
    }
    
    /**
     * Sets the "billedserviceunits" element
     */
    public void setBilledserviceunits(com.microsoft.schemas.crm._2006.webservices.CrmNumber billedserviceunits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(BILLEDSERVICEUNITS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(BILLEDSERVICEUNITS$2);
            }
            target.set(billedserviceunits);
        }
    }
    
    /**
     * Appends and returns a new empty "billedserviceunits" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewBilledserviceunits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(BILLEDSERVICEUNITS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "billedserviceunits" element
     */
    public void unsetBilledserviceunits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLEDSERVICEUNITS$2, 0);
        }
    }
    
    /**
     * Gets the "caseorigincode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getCaseorigincode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CASEORIGINCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "caseorigincode" element
     */
    public boolean isSetCaseorigincode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASEORIGINCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "caseorigincode" element
     */
    public void setCaseorigincode(com.microsoft.schemas.crm._2006.webservices.Picklist caseorigincode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CASEORIGINCODE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CASEORIGINCODE$4);
            }
            target.set(caseorigincode);
        }
    }
    
    /**
     * Appends and returns a new empty "caseorigincode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewCaseorigincode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CASEORIGINCODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "caseorigincode" element
     */
    public void unsetCaseorigincode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASEORIGINCODE$4, 0);
        }
    }
    
    /**
     * Gets the "casetypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getCasetypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CASETYPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "casetypecode" element
     */
    public boolean isSetCasetypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASETYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "casetypecode" element
     */
    public void setCasetypecode(com.microsoft.schemas.crm._2006.webservices.Picklist casetypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CASETYPECODE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CASETYPECODE$6);
            }
            target.set(casetypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "casetypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewCasetypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CASETYPECODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "casetypecode" element
     */
    public void unsetCasetypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASETYPECODE$6, 0);
        }
    }
    
    /**
     * Gets the "contractdetailid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getContractdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CONTRACTDETAILID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contractdetailid" element
     */
    public boolean isSetContractdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRACTDETAILID$8) != 0;
        }
    }
    
    /**
     * Sets the "contractdetailid" element
     */
    public void setContractdetailid(com.microsoft.schemas.crm._2006.webservices.Lookup contractdetailid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CONTRACTDETAILID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CONTRACTDETAILID$8);
            }
            target.set(contractdetailid);
        }
    }
    
    /**
     * Appends and returns a new empty "contractdetailid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewContractdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CONTRACTDETAILID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "contractdetailid" element
     */
    public void unsetContractdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRACTDETAILID$8, 0);
        }
    }
    
    /**
     * Gets the "contractid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getContractid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CONTRACTID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contractid" element
     */
    public boolean isSetContractid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRACTID$10) != 0;
        }
    }
    
    /**
     * Sets the "contractid" element
     */
    public void setContractid(com.microsoft.schemas.crm._2006.webservices.Lookup contractid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CONTRACTID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CONTRACTID$10);
            }
            target.set(contractid);
        }
    }
    
    /**
     * Appends and returns a new empty "contractid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewContractid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CONTRACTID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "contractid" element
     */
    public void unsetContractid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRACTID$10, 0);
        }
    }
    
    /**
     * Gets the "contractservicelevelcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getContractservicelevelcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CONTRACTSERVICELEVELCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contractservicelevelcode" element
     */
    public boolean isSetContractservicelevelcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRACTSERVICELEVELCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "contractservicelevelcode" element
     */
    public void setContractservicelevelcode(com.microsoft.schemas.crm._2006.webservices.Picklist contractservicelevelcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CONTRACTSERVICELEVELCODE$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CONTRACTSERVICELEVELCODE$12);
            }
            target.set(contractservicelevelcode);
        }
    }
    
    /**
     * Appends and returns a new empty "contractservicelevelcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewContractservicelevelcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CONTRACTSERVICELEVELCODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "contractservicelevelcode" element
     */
    public void unsetContractservicelevelcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRACTSERVICELEVELCODE$12, 0);
        }
    }
    
    /**
     * Gets the "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdby" element
     */
    public boolean isSetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$14) != 0;
        }
    }
    
    /**
     * Sets the "createdby" element
     */
    public void setCreatedby(com.microsoft.schemas.crm._2006.webservices.Lookup createdby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$14);
            }
            target.set(createdby);
        }
    }
    
    /**
     * Appends and returns a new empty "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "createdby" element
     */
    public void unsetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$14, 0);
        }
    }
    
    /**
     * Gets the "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdon" element
     */
    public boolean isSetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDON$16) != 0;
        }
    }
    
    /**
     * Sets the "createdon" element
     */
    public void setCreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime createdon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$16);
            }
            target.set(createdon);
        }
    }
    
    /**
     * Appends and returns a new empty "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$16);
            return target;
        }
    }
    
    /**
     * Unsets the "createdon" element
     */
    public void unsetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDON$16, 0);
        }
    }
    
    /**
     * Gets the "customerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Customer getCustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customerid" element
     */
    public boolean isSetCustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERID$18) != 0;
        }
    }
    
    /**
     * Sets the "customerid" element
     */
    public void setCustomerid(com.microsoft.schemas.crm._2006.webservices.Customer customerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$18);
            }
            target.set(customerid);
        }
    }
    
    /**
     * Appends and returns a new empty "customerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Customer addNewCustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$18);
            return target;
        }
    }
    
    /**
     * Unsets the "customerid" element
     */
    public void unsetCustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERID$18, 0);
        }
    }
    
    /**
     * Gets the "customersatisfactioncode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getCustomersatisfactioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERSATISFACTIONCODE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customersatisfactioncode" element
     */
    public boolean isSetCustomersatisfactioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERSATISFACTIONCODE$20) != 0;
        }
    }
    
    /**
     * Sets the "customersatisfactioncode" element
     */
    public void setCustomersatisfactioncode(com.microsoft.schemas.crm._2006.webservices.Picklist customersatisfactioncode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CUSTOMERSATISFACTIONCODE$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERSATISFACTIONCODE$20);
            }
            target.set(customersatisfactioncode);
        }
    }
    
    /**
     * Appends and returns a new empty "customersatisfactioncode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewCustomersatisfactioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CUSTOMERSATISFACTIONCODE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "customersatisfactioncode" element
     */
    public void unsetCustomersatisfactioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERSATISFACTIONCODE$20, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$22) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$22);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$22);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$22, 0);
        }
    }
    
    /**
     * Gets the "followupby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getFollowupby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(FOLLOWUPBY$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "followupby" element
     */
    public boolean isSetFollowupby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOLLOWUPBY$24) != 0;
        }
    }
    
    /**
     * Sets the "followupby" element
     */
    public void setFollowupby(com.microsoft.schemas.crm._2006.webservices.CrmDateTime followupby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(FOLLOWUPBY$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(FOLLOWUPBY$24);
            }
            target.set(followupby);
        }
    }
    
    /**
     * Appends and returns a new empty "followupby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewFollowupby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(FOLLOWUPBY$24);
            return target;
        }
    }
    
    /**
     * Unsets the "followupby" element
     */
    public void unsetFollowupby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOLLOWUPBY$24, 0);
        }
    }
    
    /**
     * Gets the "importsequencenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getImportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "importsequencenumber" element
     */
    public boolean isSetImportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTSEQUENCENUMBER$26) != 0;
        }
    }
    
    /**
     * Sets the "importsequencenumber" element
     */
    public void setImportsequencenumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber importsequencenumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$26);
            }
            target.set(importsequencenumber);
        }
    }
    
    /**
     * Appends and returns a new empty "importsequencenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewImportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$26);
            return target;
        }
    }
    
    /**
     * Unsets the "importsequencenumber" element
     */
    public void unsetImportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTSEQUENCENUMBER$26, 0);
        }
    }
    
    /**
     * Gets the "incidentid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getIncidentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(INCIDENTID$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "incidentid" element
     */
    public boolean isSetIncidentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTID$28) != 0;
        }
    }
    
    /**
     * Sets the "incidentid" element
     */
    public void setIncidentid(com.microsoft.schemas.crm._2006.webservices.Key incidentid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(INCIDENTID$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(INCIDENTID$28);
            }
            target.set(incidentid);
        }
    }
    
    /**
     * Appends and returns a new empty "incidentid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewIncidentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(INCIDENTID$28);
            return target;
        }
    }
    
    /**
     * Unsets the "incidentid" element
     */
    public void unsetIncidentid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTID$28, 0);
        }
    }
    
    /**
     * Gets the "incidentstagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getIncidentstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCIDENTSTAGECODE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "incidentstagecode" element
     */
    public boolean isSetIncidentstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTSTAGECODE$30) != 0;
        }
    }
    
    /**
     * Sets the "incidentstagecode" element
     */
    public void setIncidentstagecode(com.microsoft.schemas.crm._2006.webservices.Picklist incidentstagecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(INCIDENTSTAGECODE$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCIDENTSTAGECODE$30);
            }
            target.set(incidentstagecode);
        }
    }
    
    /**
     * Appends and returns a new empty "incidentstagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewIncidentstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(INCIDENTSTAGECODE$30);
            return target;
        }
    }
    
    /**
     * Unsets the "incidentstagecode" element
     */
    public void unsetIncidentstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTSTAGECODE$30, 0);
        }
    }
    
    /**
     * Gets the "isdecrementing" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsdecrementing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDECREMENTING$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isdecrementing" element
     */
    public boolean isSetIsdecrementing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDECREMENTING$32) != 0;
        }
    }
    
    /**
     * Sets the "isdecrementing" element
     */
    public void setIsdecrementing(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isdecrementing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDECREMENTING$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDECREMENTING$32);
            }
            target.set(isdecrementing);
        }
    }
    
    /**
     * Appends and returns a new empty "isdecrementing" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsdecrementing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDECREMENTING$32);
            return target;
        }
    }
    
    /**
     * Unsets the "isdecrementing" element
     */
    public void unsetIsdecrementing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDECREMENTING$32, 0);
        }
    }
    
    /**
     * Gets the "kbarticleid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getKbarticleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(KBARTICLEID$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "kbarticleid" element
     */
    public boolean isSetKbarticleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KBARTICLEID$34) != 0;
        }
    }
    
    /**
     * Sets the "kbarticleid" element
     */
    public void setKbarticleid(com.microsoft.schemas.crm._2006.webservices.Lookup kbarticleid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(KBARTICLEID$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(KBARTICLEID$34);
            }
            target.set(kbarticleid);
        }
    }
    
    /**
     * Appends and returns a new empty "kbarticleid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewKbarticleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(KBARTICLEID$34);
            return target;
        }
    }
    
    /**
     * Unsets the "kbarticleid" element
     */
    public void unsetKbarticleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KBARTICLEID$34, 0);
        }
    }
    
    /**
     * Gets the "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedby" element
     */
    public boolean isSetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDBY$36) != 0;
        }
    }
    
    /**
     * Sets the "modifiedby" element
     */
    public void setModifiedby(com.microsoft.schemas.crm._2006.webservices.Lookup modifiedby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$36);
            }
            target.set(modifiedby);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$36);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedby" element
     */
    public void unsetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDBY$36, 0);
        }
    }
    
    /**
     * Gets the "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedon" element
     */
    public boolean isSetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDON$38) != 0;
        }
    }
    
    /**
     * Sets the "modifiedon" element
     */
    public void setModifiedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime modifiedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$38);
            }
            target.set(modifiedon);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$38);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedon" element
     */
    public void unsetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDON$38, 0);
        }
    }
    
    /**
     * Gets the "overriddencreatedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getOverriddencreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "overriddencreatedon" element
     */
    public boolean isSetOverriddencreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERRIDDENCREATEDON$40) != 0;
        }
    }
    
    /**
     * Sets the "overriddencreatedon" element
     */
    public void setOverriddencreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime overriddencreatedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$40);
            }
            target.set(overriddencreatedon);
        }
    }
    
    /**
     * Appends and returns a new empty "overriddencreatedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewOverriddencreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$40);
            return target;
        }
    }
    
    /**
     * Unsets the "overriddencreatedon" element
     */
    public void unsetOverriddencreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERRIDDENCREATEDON$40, 0);
        }
    }
    
    /**
     * Gets the "ownerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Owner getOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Owner target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ownerid" element
     */
    public boolean isSetOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERID$42) != 0;
        }
    }
    
    /**
     * Sets the "ownerid" element
     */
    public void setOwnerid(com.microsoft.schemas.crm._2006.webservices.Owner ownerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Owner target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$42);
            }
            target.set(ownerid);
        }
    }
    
    /**
     * Appends and returns a new empty "ownerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Owner addNewOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Owner target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$42);
            return target;
        }
    }
    
    /**
     * Unsets the "ownerid" element
     */
    public void unsetOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERID$42, 0);
        }
    }
    
    /**
     * Gets the "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owningbusinessunit" element
     */
    public boolean isSetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGBUSINESSUNIT$44) != 0;
        }
    }
    
    /**
     * Sets the "owningbusinessunit" element
     */
    public void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.Lookup owningbusinessunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$44);
            }
            target.set(owningbusinessunit);
        }
    }
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$44);
            return target;
        }
    }
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    public void unsetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGBUSINESSUNIT$44, 0);
        }
    }
    
    /**
     * Gets the "prioritycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPrioritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRIORITYCODE$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prioritycode" element
     */
    public boolean isSetPrioritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITYCODE$46) != 0;
        }
    }
    
    /**
     * Sets the "prioritycode" element
     */
    public void setPrioritycode(com.microsoft.schemas.crm._2006.webservices.Picklist prioritycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRIORITYCODE$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRIORITYCODE$46);
            }
            target.set(prioritycode);
        }
    }
    
    /**
     * Appends and returns a new empty "prioritycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPrioritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRIORITYCODE$46);
            return target;
        }
    }
    
    /**
     * Unsets the "prioritycode" element
     */
    public void unsetPrioritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITYCODE$46, 0);
        }
    }
    
    /**
     * Gets the "productid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getProductid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRODUCTID$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "productid" element
     */
    public boolean isSetProductid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTID$48) != 0;
        }
    }
    
    /**
     * Sets the "productid" element
     */
    public void setProductid(com.microsoft.schemas.crm._2006.webservices.Lookup productid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRODUCTID$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRODUCTID$48);
            }
            target.set(productid);
        }
    }
    
    /**
     * Appends and returns a new empty "productid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewProductid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRODUCTID$48);
            return target;
        }
    }
    
    /**
     * Unsets the "productid" element
     */
    public void unsetProductid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTID$48, 0);
        }
    }
    
    /**
     * Gets the "productserialnumber" element
     */
    public java.lang.String getProductserialnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSERIALNUMBER$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productserialnumber" element
     */
    public org.apache.xmlbeans.XmlString xgetProductserialnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSERIALNUMBER$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "productserialnumber" element
     */
    public boolean isSetProductserialnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSERIALNUMBER$50) != 0;
        }
    }
    
    /**
     * Sets the "productserialnumber" element
     */
    public void setProductserialnumber(java.lang.String productserialnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSERIALNUMBER$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSERIALNUMBER$50);
            }
            target.setStringValue(productserialnumber);
        }
    }
    
    /**
     * Sets (as xml) the "productserialnumber" element
     */
    public void xsetProductserialnumber(org.apache.xmlbeans.XmlString productserialnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSERIALNUMBER$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTSERIALNUMBER$50);
            }
            target.set(productserialnumber);
        }
    }
    
    /**
     * Unsets the "productserialnumber" element
     */
    public void unsetProductserialnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSERIALNUMBER$50, 0);
        }
    }
    
    /**
     * Gets the "responsiblecontactid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getResponsiblecontactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(RESPONSIBLECONTACTID$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "responsiblecontactid" element
     */
    public boolean isSetResponsiblecontactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSIBLECONTACTID$52) != 0;
        }
    }
    
    /**
     * Sets the "responsiblecontactid" element
     */
    public void setResponsiblecontactid(com.microsoft.schemas.crm._2006.webservices.Lookup responsiblecontactid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(RESPONSIBLECONTACTID$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(RESPONSIBLECONTACTID$52);
            }
            target.set(responsiblecontactid);
        }
    }
    
    /**
     * Appends and returns a new empty "responsiblecontactid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewResponsiblecontactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(RESPONSIBLECONTACTID$52);
            return target;
        }
    }
    
    /**
     * Unsets the "responsiblecontactid" element
     */
    public void unsetResponsiblecontactid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSIBLECONTACTID$52, 0);
        }
    }
    
    /**
     * Gets the "severitycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getSeveritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SEVERITYCODE$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "severitycode" element
     */
    public boolean isSetSeveritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEVERITYCODE$54) != 0;
        }
    }
    
    /**
     * Sets the "severitycode" element
     */
    public void setSeveritycode(com.microsoft.schemas.crm._2006.webservices.Picklist severitycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SEVERITYCODE$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SEVERITYCODE$54);
            }
            target.set(severitycode);
        }
    }
    
    /**
     * Appends and returns a new empty "severitycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewSeveritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SEVERITYCODE$54);
            return target;
        }
    }
    
    /**
     * Unsets the "severitycode" element
     */
    public void unsetSeveritycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEVERITYCODE$54, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo)get_store().find_element_user(STATECODE$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statecode" element
     */
    public boolean isSetStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATECODE$56) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo)get_store().find_element_user(STATECODE$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo)get_store().add_element_user(STATECODE$56);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.IncidentStateInfo)get_store().add_element_user(STATECODE$56);
            return target;
        }
    }
    
    /**
     * Unsets the "statecode" element
     */
    public void unsetStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATECODE$56, 0);
        }
    }
    
    /**
     * Gets the "statuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Status getStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Status target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statuscode" element
     */
    public boolean isSetStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSCODE$58) != 0;
        }
    }
    
    /**
     * Sets the "statuscode" element
     */
    public void setStatuscode(com.microsoft.schemas.crm._2006.webservices.Status statuscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Status target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$58);
            }
            target.set(statuscode);
        }
    }
    
    /**
     * Appends and returns a new empty "statuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Status addNewStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Status target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$58);
            return target;
        }
    }
    
    /**
     * Unsets the "statuscode" element
     */
    public void unsetStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSCODE$58, 0);
        }
    }
    
    /**
     * Gets the "subjectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getSubjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SUBJECTID$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subjectid" element
     */
    public boolean isSetSubjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECTID$60) != 0;
        }
    }
    
    /**
     * Sets the "subjectid" element
     */
    public void setSubjectid(com.microsoft.schemas.crm._2006.webservices.Lookup subjectid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SUBJECTID$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SUBJECTID$60);
            }
            target.set(subjectid);
        }
    }
    
    /**
     * Appends and returns a new empty "subjectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewSubjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SUBJECTID$60);
            return target;
        }
    }
    
    /**
     * Unsets the "subjectid" element
     */
    public void unsetSubjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECTID$60, 0);
        }
    }
    
    /**
     * Gets the "ticketnumber" element
     */
    public java.lang.String getTicketnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKETNUMBER$62, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ticketnumber" element
     */
    public org.apache.xmlbeans.XmlString xgetTicketnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TICKETNUMBER$62, 0);
            return target;
        }
    }
    
    /**
     * True if has "ticketnumber" element
     */
    public boolean isSetTicketnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TICKETNUMBER$62) != 0;
        }
    }
    
    /**
     * Sets the "ticketnumber" element
     */
    public void setTicketnumber(java.lang.String ticketnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKETNUMBER$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TICKETNUMBER$62);
            }
            target.setStringValue(ticketnumber);
        }
    }
    
    /**
     * Sets (as xml) the "ticketnumber" element
     */
    public void xsetTicketnumber(org.apache.xmlbeans.XmlString ticketnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TICKETNUMBER$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TICKETNUMBER$62);
            }
            target.set(ticketnumber);
        }
    }
    
    /**
     * Unsets the "ticketnumber" element
     */
    public void unsetTicketnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TICKETNUMBER$62, 0);
        }
    }
    
    /**
     * Gets the "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezoneruleversionnumber" element
     */
    public boolean isSetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$64) != 0;
        }
    }
    
    /**
     * Sets the "timezoneruleversionnumber" element
     */
    public void setTimezoneruleversionnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezoneruleversionnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$64, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$64);
            }
            target.set(timezoneruleversionnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$64);
            return target;
        }
    }
    
    /**
     * Unsets the "timezoneruleversionnumber" element
     */
    public void unsetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$64, 0);
        }
    }
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$66, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$66, 0);
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$66) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$66);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$66);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$66, 0);
        }
    }
    
    /**
     * Gets the "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "utcconversiontimezonecode" element
     */
    public boolean isSetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$68) != 0;
        }
    }
    
    /**
     * Sets the "utcconversiontimezonecode" element
     */
    public void setUtcconversiontimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber utcconversiontimezonecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$68);
            }
            target.set(utcconversiontimezonecode);
        }
    }
    
    /**
     * Appends and returns a new empty "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$68);
            return target;
        }
    }
    
    /**
     * Unsets the "utcconversiontimezonecode" element
     */
    public void unsetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$68, 0);
        }
    }
}
