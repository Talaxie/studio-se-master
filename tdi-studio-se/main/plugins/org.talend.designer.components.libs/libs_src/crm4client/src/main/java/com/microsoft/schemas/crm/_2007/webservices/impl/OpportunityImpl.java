/*
 * XML Type:  opportunity
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Opportunity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML opportunity(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class OpportunityImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Opportunity
{
    
    public OpportunityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTUALCLOSEDATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "actualclosedate");
    private static final javax.xml.namespace.QName ACTUALVALUE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "actualvalue");
    private static final javax.xml.namespace.QName ACTUALVALUEBASE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "actualvalue_base");
    private static final javax.xml.namespace.QName CAMPAIGNID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "campaignid");
    private static final javax.xml.namespace.QName CLOSEPROBABILITY$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "closeprobability");
    private static final javax.xml.namespace.QName CREATEDBY$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMERID$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customerid");
    private static final javax.xml.namespace.QName DESCRIPTION$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName ESTIMATEDCLOSEDATE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "estimatedclosedate");
    private static final javax.xml.namespace.QName ESTIMATEDVALUE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "estimatedvalue");
    private static final javax.xml.namespace.QName ESTIMATEDVALUEBASE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "estimatedvalue_base");
    private static final javax.xml.namespace.QName EXCHANGERATE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangerate");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName ISREVENUESYSTEMCALCULATED$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isrevenuesystemcalculated");
    private static final javax.xml.namespace.QName MODIFIEDBY$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName OPPORTUNITYID$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "opportunityid");
    private static final javax.xml.namespace.QName OPPORTUNITYRATINGCODE$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "opportunityratingcode");
    private static final javax.xml.namespace.QName ORIGINATINGLEADID$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "originatingleadid");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNERID$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownerid");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName PARTICIPATESINWORKFLOW$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "participatesinworkflow");
    private static final javax.xml.namespace.QName PRICELEVELID$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricelevelid");
    private static final javax.xml.namespace.QName PRICINGERRORCODE$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricingerrorcode");
    private static final javax.xml.namespace.QName PRIORITYCODE$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "prioritycode");
    private static final javax.xml.namespace.QName SALESSTAGECODE$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salesstagecode");
    private static final javax.xml.namespace.QName STATECODE$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName STEPID$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "stepid");
    private static final javax.xml.namespace.QName STEPNAME$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "stepname");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "actualclosedate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActualclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ACTUALCLOSEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "actualclosedate" element
     */
    public boolean isSetActualclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTUALCLOSEDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "actualclosedate" element
     */
    public void setActualclosedate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime actualclosedate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ACTUALCLOSEDATE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ACTUALCLOSEDATE$0);
            }
            target.set(actualclosedate);
        }
    }
    
    /**
     * Appends and returns a new empty "actualclosedate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActualclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ACTUALCLOSEDATE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "actualclosedate" element
     */
    public void unsetActualclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTUALCLOSEDATE$0, 0);
        }
    }
    
    /**
     * Gets the "actualvalue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getActualvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ACTUALVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "actualvalue" element
     */
    public boolean isSetActualvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTUALVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "actualvalue" element
     */
    public void setActualvalue(com.microsoft.schemas.crm._2006.webservices.CrmMoney actualvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ACTUALVALUE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ACTUALVALUE$2);
            }
            target.set(actualvalue);
        }
    }
    
    /**
     * Appends and returns a new empty "actualvalue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewActualvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ACTUALVALUE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "actualvalue" element
     */
    public void unsetActualvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTUALVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "actualvalue_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getActualvalueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ACTUALVALUEBASE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "actualvalue_base" element
     */
    public boolean isSetActualvalueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTUALVALUEBASE$4) != 0;
        }
    }
    
    /**
     * Sets the "actualvalue_base" element
     */
    public void setActualvalueBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney actualvalueBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ACTUALVALUEBASE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ACTUALVALUEBASE$4);
            }
            target.set(actualvalueBase);
        }
    }
    
    /**
     * Appends and returns a new empty "actualvalue_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewActualvalueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ACTUALVALUEBASE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "actualvalue_base" element
     */
    public void unsetActualvalueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTUALVALUEBASE$4, 0);
        }
    }
    
    /**
     * Gets the "campaignid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CAMPAIGNID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "campaignid" element
     */
    public boolean isSetCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAMPAIGNID$6) != 0;
        }
    }
    
    /**
     * Sets the "campaignid" element
     */
    public void setCampaignid(com.microsoft.schemas.crm._2006.webservices.Lookup campaignid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CAMPAIGNID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CAMPAIGNID$6);
            }
            target.set(campaignid);
        }
    }
    
    /**
     * Appends and returns a new empty "campaignid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CAMPAIGNID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "campaignid" element
     */
    public void unsetCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAMPAIGNID$6, 0);
        }
    }
    
    /**
     * Gets the "closeprobability" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCloseprobability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CLOSEPROBABILITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "closeprobability" element
     */
    public boolean isSetCloseprobability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLOSEPROBABILITY$8) != 0;
        }
    }
    
    /**
     * Sets the "closeprobability" element
     */
    public void setCloseprobability(com.microsoft.schemas.crm._2006.webservices.CrmNumber closeprobability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CLOSEPROBABILITY$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CLOSEPROBABILITY$8);
            }
            target.set(closeprobability);
        }
    }
    
    /**
     * Appends and returns a new empty "closeprobability" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCloseprobability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CLOSEPROBABILITY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "closeprobability" element
     */
    public void unsetCloseprobability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLOSEPROBABILITY$8, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$10, 0);
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
            return get_store().count_elements(CREATEDBY$10) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$10);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$10);
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
            get_store().remove_element(CREATEDBY$10, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$12, 0);
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
            return get_store().count_elements(CREATEDON$12) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$12);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$12);
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
            get_store().remove_element(CREATEDON$12, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$14, 0);
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
            return get_store().count_elements(CUSTOMERID$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$14);
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
            get_store().remove_element(CUSTOMERID$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$16, 0);
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
            return get_store().count_elements(DESCRIPTION$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$16);
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
            get_store().remove_element(DESCRIPTION$16, 0);
        }
    }
    
    /**
     * Gets the "estimatedclosedate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEstimatedclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ESTIMATEDCLOSEDATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "estimatedclosedate" element
     */
    public boolean isSetEstimatedclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATEDCLOSEDATE$18) != 0;
        }
    }
    
    /**
     * Sets the "estimatedclosedate" element
     */
    public void setEstimatedclosedate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime estimatedclosedate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ESTIMATEDCLOSEDATE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ESTIMATEDCLOSEDATE$18);
            }
            target.set(estimatedclosedate);
        }
    }
    
    /**
     * Appends and returns a new empty "estimatedclosedate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEstimatedclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ESTIMATEDCLOSEDATE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "estimatedclosedate" element
     */
    public void unsetEstimatedclosedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATEDCLOSEDATE$18, 0);
        }
    }
    
    /**
     * Gets the "estimatedvalue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getEstimatedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ESTIMATEDVALUE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "estimatedvalue" element
     */
    public boolean isSetEstimatedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATEDVALUE$20) != 0;
        }
    }
    
    /**
     * Sets the "estimatedvalue" element
     */
    public void setEstimatedvalue(com.microsoft.schemas.crm._2006.webservices.CrmMoney estimatedvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ESTIMATEDVALUE$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ESTIMATEDVALUE$20);
            }
            target.set(estimatedvalue);
        }
    }
    
    /**
     * Appends and returns a new empty "estimatedvalue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewEstimatedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ESTIMATEDVALUE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "estimatedvalue" element
     */
    public void unsetEstimatedvalue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATEDVALUE$20, 0);
        }
    }
    
    /**
     * Gets the "estimatedvalue_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getEstimatedvalueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ESTIMATEDVALUEBASE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "estimatedvalue_base" element
     */
    public boolean isSetEstimatedvalueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTIMATEDVALUEBASE$22) != 0;
        }
    }
    
    /**
     * Sets the "estimatedvalue_base" element
     */
    public void setEstimatedvalueBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney estimatedvalueBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ESTIMATEDVALUEBASE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ESTIMATEDVALUEBASE$22);
            }
            target.set(estimatedvalueBase);
        }
    }
    
    /**
     * Appends and returns a new empty "estimatedvalue_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewEstimatedvalueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ESTIMATEDVALUEBASE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "estimatedvalue_base" element
     */
    public void unsetEstimatedvalueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTIMATEDVALUEBASE$22, 0);
        }
    }
    
    /**
     * Gets the "exchangerate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getExchangerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exchangerate" element
     */
    public boolean isSetExchangerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCHANGERATE$24) != 0;
        }
    }
    
    /**
     * Sets the "exchangerate" element
     */
    public void setExchangerate(com.microsoft.schemas.crm._2006.webservices.CrmDecimal exchangerate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$24);
            }
            target.set(exchangerate);
        }
    }
    
    /**
     * Appends and returns a new empty "exchangerate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewExchangerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "exchangerate" element
     */
    public void unsetExchangerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCHANGERATE$24, 0);
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
     * Gets the "isrevenuesystemcalculated" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsrevenuesystemcalculated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISREVENUESYSTEMCALCULATED$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isrevenuesystemcalculated" element
     */
    public boolean isSetIsrevenuesystemcalculated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISREVENUESYSTEMCALCULATED$28) != 0;
        }
    }
    
    /**
     * Sets the "isrevenuesystemcalculated" element
     */
    public void setIsrevenuesystemcalculated(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isrevenuesystemcalculated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISREVENUESYSTEMCALCULATED$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISREVENUESYSTEMCALCULATED$28);
            }
            target.set(isrevenuesystemcalculated);
        }
    }
    
    /**
     * Appends and returns a new empty "isrevenuesystemcalculated" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsrevenuesystemcalculated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISREVENUESYSTEMCALCULATED$28);
            return target;
        }
    }
    
    /**
     * Unsets the "isrevenuesystemcalculated" element
     */
    public void unsetIsrevenuesystemcalculated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISREVENUESYSTEMCALCULATED$28, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$30, 0);
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
            return get_store().count_elements(MODIFIEDBY$30) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$30);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$30);
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
            get_store().remove_element(MODIFIEDBY$30, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$32, 0);
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
            return get_store().count_elements(MODIFIEDON$32) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$32);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$32);
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
            get_store().remove_element(MODIFIEDON$32, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$34) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$34);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$34);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$34, 0);
        }
    }
    
    /**
     * Gets the "opportunityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getOpportunityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(OPPORTUNITYID$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "opportunityid" element
     */
    public boolean isSetOpportunityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPPORTUNITYID$36) != 0;
        }
    }
    
    /**
     * Sets the "opportunityid" element
     */
    public void setOpportunityid(com.microsoft.schemas.crm._2006.webservices.Key opportunityid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(OPPORTUNITYID$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(OPPORTUNITYID$36);
            }
            target.set(opportunityid);
        }
    }
    
    /**
     * Appends and returns a new empty "opportunityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewOpportunityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(OPPORTUNITYID$36);
            return target;
        }
    }
    
    /**
     * Unsets the "opportunityid" element
     */
    public void unsetOpportunityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPPORTUNITYID$36, 0);
        }
    }
    
    /**
     * Gets the "opportunityratingcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getOpportunityratingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OPPORTUNITYRATINGCODE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "opportunityratingcode" element
     */
    public boolean isSetOpportunityratingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPPORTUNITYRATINGCODE$38) != 0;
        }
    }
    
    /**
     * Sets the "opportunityratingcode" element
     */
    public void setOpportunityratingcode(com.microsoft.schemas.crm._2006.webservices.Picklist opportunityratingcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OPPORTUNITYRATINGCODE$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OPPORTUNITYRATINGCODE$38);
            }
            target.set(opportunityratingcode);
        }
    }
    
    /**
     * Appends and returns a new empty "opportunityratingcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewOpportunityratingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OPPORTUNITYRATINGCODE$38);
            return target;
        }
    }
    
    /**
     * Unsets the "opportunityratingcode" element
     */
    public void unsetOpportunityratingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPPORTUNITYRATINGCODE$38, 0);
        }
    }
    
    /**
     * Gets the "originatingleadid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOriginatingleadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORIGINATINGLEADID$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originatingleadid" element
     */
    public boolean isSetOriginatingleadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINATINGLEADID$40) != 0;
        }
    }
    
    /**
     * Sets the "originatingleadid" element
     */
    public void setOriginatingleadid(com.microsoft.schemas.crm._2006.webservices.Lookup originatingleadid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORIGINATINGLEADID$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORIGINATINGLEADID$40);
            }
            target.set(originatingleadid);
        }
    }
    
    /**
     * Appends and returns a new empty "originatingleadid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOriginatingleadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORIGINATINGLEADID$40);
            return target;
        }
    }
    
    /**
     * Unsets the "originatingleadid" element
     */
    public void unsetOriginatingleadid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINATINGLEADID$40, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$42, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$42) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$42);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$42);
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
            get_store().remove_element(OVERRIDDENCREATEDON$42, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$44, 0);
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
            return get_store().count_elements(OWNERID$44) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$44);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$44);
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
            get_store().remove_element(OWNERID$44, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$46, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$46) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$46);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$46);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$46, 0);
        }
    }
    
    /**
     * Gets the "participatesinworkflow" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getParticipatesinworkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(PARTICIPATESINWORKFLOW$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "participatesinworkflow" element
     */
    public boolean isSetParticipatesinworkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPATESINWORKFLOW$48) != 0;
        }
    }
    
    /**
     * Sets the "participatesinworkflow" element
     */
    public void setParticipatesinworkflow(com.microsoft.schemas.crm._2006.webservices.CrmBoolean participatesinworkflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(PARTICIPATESINWORKFLOW$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(PARTICIPATESINWORKFLOW$48);
            }
            target.set(participatesinworkflow);
        }
    }
    
    /**
     * Appends and returns a new empty "participatesinworkflow" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewParticipatesinworkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(PARTICIPATESINWORKFLOW$48);
            return target;
        }
    }
    
    /**
     * Unsets the "participatesinworkflow" element
     */
    public void unsetParticipatesinworkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPATESINWORKFLOW$48, 0);
        }
    }
    
    /**
     * Gets the "pricelevelid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getPricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRICELEVELID$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pricelevelid" element
     */
    public boolean isSetPricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICELEVELID$50) != 0;
        }
    }
    
    /**
     * Sets the "pricelevelid" element
     */
    public void setPricelevelid(com.microsoft.schemas.crm._2006.webservices.Lookup pricelevelid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRICELEVELID$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRICELEVELID$50);
            }
            target.set(pricelevelid);
        }
    }
    
    /**
     * Appends and returns a new empty "pricelevelid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewPricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRICELEVELID$50);
            return target;
        }
    }
    
    /**
     * Unsets the "pricelevelid" element
     */
    public void unsetPricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICELEVELID$50, 0);
        }
    }
    
    /**
     * Gets the "pricingerrorcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPricingerrorcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGERRORCODE$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pricingerrorcode" element
     */
    public boolean isSetPricingerrorcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICINGERRORCODE$52) != 0;
        }
    }
    
    /**
     * Sets the "pricingerrorcode" element
     */
    public void setPricingerrorcode(com.microsoft.schemas.crm._2006.webservices.Picklist pricingerrorcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGERRORCODE$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGERRORCODE$52);
            }
            target.set(pricingerrorcode);
        }
    }
    
    /**
     * Appends and returns a new empty "pricingerrorcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPricingerrorcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGERRORCODE$52);
            return target;
        }
    }
    
    /**
     * Unsets the "pricingerrorcode" element
     */
    public void unsetPricingerrorcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICINGERRORCODE$52, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRIORITYCODE$54, 0);
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
            return get_store().count_elements(PRIORITYCODE$54) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRIORITYCODE$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRIORITYCODE$54);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRIORITYCODE$54);
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
            get_store().remove_element(PRIORITYCODE$54, 0);
        }
    }
    
    /**
     * Gets the "salesstagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getSalesstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SALESSTAGECODE$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "salesstagecode" element
     */
    public boolean isSetSalesstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESSTAGECODE$56) != 0;
        }
    }
    
    /**
     * Sets the "salesstagecode" element
     */
    public void setSalesstagecode(com.microsoft.schemas.crm._2006.webservices.Picklist salesstagecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SALESSTAGECODE$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SALESSTAGECODE$56);
            }
            target.set(salesstagecode);
        }
    }
    
    /**
     * Appends and returns a new empty "salesstagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewSalesstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SALESSTAGECODE$56);
            return target;
        }
    }
    
    /**
     * Unsets the "salesstagecode" element
     */
    public void unsetSalesstagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESSTAGECODE$56, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo)get_store().find_element_user(STATECODE$58, 0);
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
            return get_store().count_elements(STATECODE$58) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo)get_store().find_element_user(STATECODE$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo)get_store().add_element_user(STATECODE$58);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OpportunityStateInfo)get_store().add_element_user(STATECODE$58);
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
            get_store().remove_element(STATECODE$58, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$60, 0);
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
            return get_store().count_elements(STATUSCODE$60) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$60);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$60);
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
            get_store().remove_element(STATUSCODE$60, 0);
        }
    }
    
    /**
     * Gets the "stepid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getStepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(STEPID$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stepid" element
     */
    public boolean isSetStepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STEPID$62) != 0;
        }
    }
    
    /**
     * Sets the "stepid" element
     */
    public void setStepid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier stepid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(STEPID$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(STEPID$62);
            }
            target.set(stepid);
        }
    }
    
    /**
     * Appends and returns a new empty "stepid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewStepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(STEPID$62);
            return target;
        }
    }
    
    /**
     * Unsets the "stepid" element
     */
    public void unsetStepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STEPID$62, 0);
        }
    }
    
    /**
     * Gets the "stepname" element
     */
    public java.lang.String getStepname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STEPNAME$64, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stepname" element
     */
    public org.apache.xmlbeans.XmlString xgetStepname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STEPNAME$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "stepname" element
     */
    public boolean isSetStepname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STEPNAME$64) != 0;
        }
    }
    
    /**
     * Sets the "stepname" element
     */
    public void setStepname(java.lang.String stepname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STEPNAME$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STEPNAME$64);
            }
            target.setStringValue(stepname);
        }
    }
    
    /**
     * Sets (as xml) the "stepname" element
     */
    public void xsetStepname(org.apache.xmlbeans.XmlString stepname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STEPNAME$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STEPNAME$64);
            }
            target.set(stepname);
        }
    }
    
    /**
     * Unsets the "stepname" element
     */
    public void unsetStepname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STEPNAME$64, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$66, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$66) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$66, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$66);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$66);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$66, 0);
        }
    }
    
    /**
     * Gets the "transactioncurrencyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getTransactioncurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transactioncurrencyid" element
     */
    public boolean isSetTransactioncurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONCURRENCYID$68) != 0;
        }
    }
    
    /**
     * Sets the "transactioncurrencyid" element
     */
    public void setTransactioncurrencyid(com.microsoft.schemas.crm._2006.webservices.Lookup transactioncurrencyid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$68);
            }
            target.set(transactioncurrencyid);
        }
    }
    
    /**
     * Appends and returns a new empty "transactioncurrencyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewTransactioncurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$68);
            return target;
        }
    }
    
    /**
     * Unsets the "transactioncurrencyid" element
     */
    public void unsetTransactioncurrencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONCURRENCYID$68, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$70, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$70) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$70);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$70);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$70, 0);
        }
    }
}
