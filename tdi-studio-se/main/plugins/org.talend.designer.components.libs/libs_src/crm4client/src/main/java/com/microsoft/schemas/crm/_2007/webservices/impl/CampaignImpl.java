/*
 * XML Type:  campaign
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Campaign
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML campaign(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CampaignImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Campaign
{
    
    public CampaignImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTUALEND$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "actualend");
    private static final javax.xml.namespace.QName ACTUALSTART$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "actualstart");
    private static final javax.xml.namespace.QName BUDGETEDCOST$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "budgetedcost");
    private static final javax.xml.namespace.QName BUDGETEDCOSTBASE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "budgetedcost_base");
    private static final javax.xml.namespace.QName CAMPAIGNID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "campaignid");
    private static final javax.xml.namespace.QName CODENAME$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "codename");
    private static final javax.xml.namespace.QName CREATEDBY$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DESCRIPTION$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName EXCHANGERATE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangerate");
    private static final javax.xml.namespace.QName EXPECTEDRESPONSE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "expectedresponse");
    private static final javax.xml.namespace.QName EXPECTEDREVENUE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "expectedrevenue");
    private static final javax.xml.namespace.QName EXPECTEDREVENUEBASE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "expectedrevenue_base");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName ISTEMPLATE$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "istemplate");
    private static final javax.xml.namespace.QName MESSAGE$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "message");
    private static final javax.xml.namespace.QName MODIFIEDBY$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName OBJECTIVE$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "objective");
    private static final javax.xml.namespace.QName OTHERCOST$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "othercost");
    private static final javax.xml.namespace.QName OTHERCOSTBASE$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "othercost_base");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNERID$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownerid");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName PRICELISTID$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricelistid");
    private static final javax.xml.namespace.QName PROMOTIONCODENAME$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "promotioncodename");
    private static final javax.xml.namespace.QName PROPOSEDEND$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "proposedend");
    private static final javax.xml.namespace.QName PROPOSEDSTART$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "proposedstart");
    private static final javax.xml.namespace.QName STATECODE$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TOTALACTUALCOST$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalactualcost");
    private static final javax.xml.namespace.QName TOTALACTUALCOSTBASE$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalactualcost_base");
    private static final javax.xml.namespace.QName TOTALCAMPAIGNACTIVITYACTUALCOST$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalcampaignactivityactualcost");
    private static final javax.xml.namespace.QName TOTALCAMPAIGNACTIVITYACTUALCOSTBASE$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalcampaignactivityactualcost_base");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName TYPECODE$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "typecode");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "actualend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActualend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ACTUALEND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "actualend" element
     */
    public boolean isSetActualend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTUALEND$0) != 0;
        }
    }
    
    /**
     * Sets the "actualend" element
     */
    public void setActualend(com.microsoft.schemas.crm._2006.webservices.CrmDateTime actualend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ACTUALEND$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ACTUALEND$0);
            }
            target.set(actualend);
        }
    }
    
    /**
     * Appends and returns a new empty "actualend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActualend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ACTUALEND$0);
            return target;
        }
    }
    
    /**
     * Unsets the "actualend" element
     */
    public void unsetActualend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTUALEND$0, 0);
        }
    }
    
    /**
     * Gets the "actualstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActualstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ACTUALSTART$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "actualstart" element
     */
    public boolean isSetActualstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTUALSTART$2) != 0;
        }
    }
    
    /**
     * Sets the "actualstart" element
     */
    public void setActualstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime actualstart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ACTUALSTART$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ACTUALSTART$2);
            }
            target.set(actualstart);
        }
    }
    
    /**
     * Appends and returns a new empty "actualstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActualstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ACTUALSTART$2);
            return target;
        }
    }
    
    /**
     * Unsets the "actualstart" element
     */
    public void unsetActualstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTUALSTART$2, 0);
        }
    }
    
    /**
     * Gets the "budgetedcost" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getBudgetedcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(BUDGETEDCOST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "budgetedcost" element
     */
    public boolean isSetBudgetedcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUDGETEDCOST$4) != 0;
        }
    }
    
    /**
     * Sets the "budgetedcost" element
     */
    public void setBudgetedcost(com.microsoft.schemas.crm._2006.webservices.CrmMoney budgetedcost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(BUDGETEDCOST$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(BUDGETEDCOST$4);
            }
            target.set(budgetedcost);
        }
    }
    
    /**
     * Appends and returns a new empty "budgetedcost" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewBudgetedcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(BUDGETEDCOST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "budgetedcost" element
     */
    public void unsetBudgetedcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUDGETEDCOST$4, 0);
        }
    }
    
    /**
     * Gets the "budgetedcost_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getBudgetedcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(BUDGETEDCOSTBASE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "budgetedcost_base" element
     */
    public boolean isSetBudgetedcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUDGETEDCOSTBASE$6) != 0;
        }
    }
    
    /**
     * Sets the "budgetedcost_base" element
     */
    public void setBudgetedcostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney budgetedcostBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(BUDGETEDCOSTBASE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(BUDGETEDCOSTBASE$6);
            }
            target.set(budgetedcostBase);
        }
    }
    
    /**
     * Appends and returns a new empty "budgetedcost_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewBudgetedcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(BUDGETEDCOSTBASE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "budgetedcost_base" element
     */
    public void unsetBudgetedcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUDGETEDCOSTBASE$6, 0);
        }
    }
    
    /**
     * Gets the "campaignid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CAMPAIGNID$8, 0);
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
            return get_store().count_elements(CAMPAIGNID$8) != 0;
        }
    }
    
    /**
     * Sets the "campaignid" element
     */
    public void setCampaignid(com.microsoft.schemas.crm._2006.webservices.Key campaignid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CAMPAIGNID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CAMPAIGNID$8);
            }
            target.set(campaignid);
        }
    }
    
    /**
     * Appends and returns a new empty "campaignid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewCampaignid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CAMPAIGNID$8);
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
            get_store().remove_element(CAMPAIGNID$8, 0);
        }
    }
    
    /**
     * Gets the "codename" element
     */
    public java.lang.String getCodename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODENAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codename" element
     */
    public org.apache.xmlbeans.XmlString xgetCodename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODENAME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "codename" element
     */
    public boolean isSetCodename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODENAME$10) != 0;
        }
    }
    
    /**
     * Sets the "codename" element
     */
    public void setCodename(java.lang.String codename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODENAME$10);
            }
            target.setStringValue(codename);
        }
    }
    
    /**
     * Sets (as xml) the "codename" element
     */
    public void xsetCodename(org.apache.xmlbeans.XmlString codename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODENAME$10);
            }
            target.set(codename);
        }
    }
    
    /**
     * Unsets the "codename" element
     */
    public void unsetCodename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODENAME$10, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$12, 0);
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
            return get_store().count_elements(CREATEDBY$12) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$12);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$12);
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
            get_store().remove_element(CREATEDBY$12, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$14, 0);
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
            return get_store().count_elements(CREATEDON$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$14);
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
            get_store().remove_element(CREATEDON$14, 0);
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
     * Gets the "exchangerate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getExchangerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$18, 0);
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
            return get_store().count_elements(EXCHANGERATE$18) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$18);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$18);
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
            get_store().remove_element(EXCHANGERATE$18, 0);
        }
    }
    
    /**
     * Gets the "expectedresponse" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getExpectedresponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(EXPECTEDRESPONSE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expectedresponse" element
     */
    public boolean isSetExpectedresponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPECTEDRESPONSE$20) != 0;
        }
    }
    
    /**
     * Sets the "expectedresponse" element
     */
    public void setExpectedresponse(com.microsoft.schemas.crm._2006.webservices.CrmNumber expectedresponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(EXPECTEDRESPONSE$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(EXPECTEDRESPONSE$20);
            }
            target.set(expectedresponse);
        }
    }
    
    /**
     * Appends and returns a new empty "expectedresponse" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewExpectedresponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(EXPECTEDRESPONSE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "expectedresponse" element
     */
    public void unsetExpectedresponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPECTEDRESPONSE$20, 0);
        }
    }
    
    /**
     * Gets the "expectedrevenue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getExpectedrevenue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(EXPECTEDREVENUE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expectedrevenue" element
     */
    public boolean isSetExpectedrevenue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPECTEDREVENUE$22) != 0;
        }
    }
    
    /**
     * Sets the "expectedrevenue" element
     */
    public void setExpectedrevenue(com.microsoft.schemas.crm._2006.webservices.CrmMoney expectedrevenue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(EXPECTEDREVENUE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(EXPECTEDREVENUE$22);
            }
            target.set(expectedrevenue);
        }
    }
    
    /**
     * Appends and returns a new empty "expectedrevenue" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewExpectedrevenue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(EXPECTEDREVENUE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "expectedrevenue" element
     */
    public void unsetExpectedrevenue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPECTEDREVENUE$22, 0);
        }
    }
    
    /**
     * Gets the "expectedrevenue_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getExpectedrevenueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(EXPECTEDREVENUEBASE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expectedrevenue_base" element
     */
    public boolean isSetExpectedrevenueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPECTEDREVENUEBASE$24) != 0;
        }
    }
    
    /**
     * Sets the "expectedrevenue_base" element
     */
    public void setExpectedrevenueBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney expectedrevenueBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(EXPECTEDREVENUEBASE$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(EXPECTEDREVENUEBASE$24);
            }
            target.set(expectedrevenueBase);
        }
    }
    
    /**
     * Appends and returns a new empty "expectedrevenue_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewExpectedrevenueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(EXPECTEDREVENUEBASE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "expectedrevenue_base" element
     */
    public void unsetExpectedrevenueBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPECTEDREVENUEBASE$24, 0);
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
     * Gets the "istemplate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIstemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISTEMPLATE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "istemplate" element
     */
    public boolean isSetIstemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISTEMPLATE$28) != 0;
        }
    }
    
    /**
     * Sets the "istemplate" element
     */
    public void setIstemplate(com.microsoft.schemas.crm._2006.webservices.CrmBoolean istemplate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISTEMPLATE$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISTEMPLATE$28);
            }
            target.set(istemplate);
        }
    }
    
    /**
     * Appends and returns a new empty "istemplate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIstemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISTEMPLATE$28);
            return target;
        }
    }
    
    /**
     * Unsets the "istemplate" element
     */
    public void unsetIstemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISTEMPLATE$28, 0);
        }
    }
    
    /**
     * Gets the "message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "message" element
     */
    public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$30) != 0;
        }
    }
    
    /**
     * Sets the "message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$30);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$30);
            }
            target.set(message);
        }
    }
    
    /**
     * Unsets the "message" element
     */
    public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$30, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$32, 0);
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
            return get_store().count_elements(MODIFIEDBY$32) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$32);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$32);
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
            get_store().remove_element(MODIFIEDBY$32, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$34, 0);
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
            return get_store().count_elements(MODIFIEDON$34) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$34);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$34);
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
            get_store().remove_element(MODIFIEDON$34, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$36, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$36, 0);
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
            return get_store().count_elements(NAME$36) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$36);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$36);
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
            get_store().remove_element(NAME$36, 0);
        }
    }
    
    /**
     * Gets the "objective" element
     */
    public java.lang.String getObjective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTIVE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "objective" element
     */
    public org.apache.xmlbeans.XmlString xgetObjective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTIVE$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "objective" element
     */
    public boolean isSetObjective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTIVE$38) != 0;
        }
    }
    
    /**
     * Sets the "objective" element
     */
    public void setObjective(java.lang.String objective)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTIVE$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTIVE$38);
            }
            target.setStringValue(objective);
        }
    }
    
    /**
     * Sets (as xml) the "objective" element
     */
    public void xsetObjective(org.apache.xmlbeans.XmlString objective)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTIVE$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTIVE$38);
            }
            target.set(objective);
        }
    }
    
    /**
     * Unsets the "objective" element
     */
    public void unsetObjective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTIVE$38, 0);
        }
    }
    
    /**
     * Gets the "othercost" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getOthercost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(OTHERCOST$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "othercost" element
     */
    public boolean isSetOthercost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERCOST$40) != 0;
        }
    }
    
    /**
     * Sets the "othercost" element
     */
    public void setOthercost(com.microsoft.schemas.crm._2006.webservices.CrmMoney othercost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(OTHERCOST$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(OTHERCOST$40);
            }
            target.set(othercost);
        }
    }
    
    /**
     * Appends and returns a new empty "othercost" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewOthercost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(OTHERCOST$40);
            return target;
        }
    }
    
    /**
     * Unsets the "othercost" element
     */
    public void unsetOthercost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERCOST$40, 0);
        }
    }
    
    /**
     * Gets the "othercost_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getOthercostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(OTHERCOSTBASE$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "othercost_base" element
     */
    public boolean isSetOthercostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERCOSTBASE$42) != 0;
        }
    }
    
    /**
     * Sets the "othercost_base" element
     */
    public void setOthercostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney othercostBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(OTHERCOSTBASE$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(OTHERCOSTBASE$42);
            }
            target.set(othercostBase);
        }
    }
    
    /**
     * Appends and returns a new empty "othercost_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewOthercostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(OTHERCOSTBASE$42);
            return target;
        }
    }
    
    /**
     * Unsets the "othercost_base" element
     */
    public void unsetOthercostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERCOSTBASE$42, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$44, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$44) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$44);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$44);
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
            get_store().remove_element(OVERRIDDENCREATEDON$44, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$46, 0);
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
            return get_store().count_elements(OWNERID$46) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$46);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$46);
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
            get_store().remove_element(OWNERID$46, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$48, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$48) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$48);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$48);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$48, 0);
        }
    }
    
    /**
     * Gets the "pricelistid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getPricelistid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRICELISTID$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pricelistid" element
     */
    public boolean isSetPricelistid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICELISTID$50) != 0;
        }
    }
    
    /**
     * Sets the "pricelistid" element
     */
    public void setPricelistid(com.microsoft.schemas.crm._2006.webservices.Lookup pricelistid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRICELISTID$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRICELISTID$50);
            }
            target.set(pricelistid);
        }
    }
    
    /**
     * Appends and returns a new empty "pricelistid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewPricelistid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRICELISTID$50);
            return target;
        }
    }
    
    /**
     * Unsets the "pricelistid" element
     */
    public void unsetPricelistid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICELISTID$50, 0);
        }
    }
    
    /**
     * Gets the "promotioncodename" element
     */
    public java.lang.String getPromotioncodename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONCODENAME$52, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "promotioncodename" element
     */
    public org.apache.xmlbeans.XmlString xgetPromotioncodename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONCODENAME$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "promotioncodename" element
     */
    public boolean isSetPromotioncodename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROMOTIONCODENAME$52) != 0;
        }
    }
    
    /**
     * Sets the "promotioncodename" element
     */
    public void setPromotioncodename(java.lang.String promotioncodename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONCODENAME$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROMOTIONCODENAME$52);
            }
            target.setStringValue(promotioncodename);
        }
    }
    
    /**
     * Sets (as xml) the "promotioncodename" element
     */
    public void xsetPromotioncodename(org.apache.xmlbeans.XmlString promotioncodename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONCODENAME$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROMOTIONCODENAME$52);
            }
            target.set(promotioncodename);
        }
    }
    
    /**
     * Unsets the "promotioncodename" element
     */
    public void unsetPromotioncodename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROMOTIONCODENAME$52, 0);
        }
    }
    
    /**
     * Gets the "proposedend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getProposedend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(PROPOSEDEND$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "proposedend" element
     */
    public boolean isSetProposedend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPOSEDEND$54) != 0;
        }
    }
    
    /**
     * Sets the "proposedend" element
     */
    public void setProposedend(com.microsoft.schemas.crm._2006.webservices.CrmDateTime proposedend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(PROPOSEDEND$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(PROPOSEDEND$54);
            }
            target.set(proposedend);
        }
    }
    
    /**
     * Appends and returns a new empty "proposedend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewProposedend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(PROPOSEDEND$54);
            return target;
        }
    }
    
    /**
     * Unsets the "proposedend" element
     */
    public void unsetProposedend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPOSEDEND$54, 0);
        }
    }
    
    /**
     * Gets the "proposedstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getProposedstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(PROPOSEDSTART$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "proposedstart" element
     */
    public boolean isSetProposedstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPOSEDSTART$56) != 0;
        }
    }
    
    /**
     * Sets the "proposedstart" element
     */
    public void setProposedstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime proposedstart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(PROPOSEDSTART$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(PROPOSEDSTART$56);
            }
            target.set(proposedstart);
        }
    }
    
    /**
     * Appends and returns a new empty "proposedstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewProposedstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(PROPOSEDSTART$56);
            return target;
        }
    }
    
    /**
     * Unsets the "proposedstart" element
     */
    public void unsetProposedstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPOSEDSTART$56, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo)get_store().find_element_user(STATECODE$58, 0);
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
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo)get_store().find_element_user(STATECODE$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo)get_store().add_element_user(STATECODE$58);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CampaignStateInfo)get_store().add_element_user(STATECODE$58);
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
     * Gets the "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$62, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$62) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$62);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$62);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$62, 0);
        }
    }
    
    /**
     * Gets the "totalactualcost" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalactualcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALACTUALCOST$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalactualcost" element
     */
    public boolean isSetTotalactualcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALACTUALCOST$64) != 0;
        }
    }
    
    /**
     * Sets the "totalactualcost" element
     */
    public void setTotalactualcost(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalactualcost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALACTUALCOST$64, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALACTUALCOST$64);
            }
            target.set(totalactualcost);
        }
    }
    
    /**
     * Appends and returns a new empty "totalactualcost" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalactualcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALACTUALCOST$64);
            return target;
        }
    }
    
    /**
     * Unsets the "totalactualcost" element
     */
    public void unsetTotalactualcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALACTUALCOST$64, 0);
        }
    }
    
    /**
     * Gets the "totalactualcost_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalactualcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALACTUALCOSTBASE$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalactualcost_base" element
     */
    public boolean isSetTotalactualcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALACTUALCOSTBASE$66) != 0;
        }
    }
    
    /**
     * Sets the "totalactualcost_base" element
     */
    public void setTotalactualcostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalactualcostBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALACTUALCOSTBASE$66, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALACTUALCOSTBASE$66);
            }
            target.set(totalactualcostBase);
        }
    }
    
    /**
     * Appends and returns a new empty "totalactualcost_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalactualcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALACTUALCOSTBASE$66);
            return target;
        }
    }
    
    /**
     * Unsets the "totalactualcost_base" element
     */
    public void unsetTotalactualcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALACTUALCOSTBASE$66, 0);
        }
    }
    
    /**
     * Gets the "totalcampaignactivityactualcost" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalcampaignactivityactualcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALCAMPAIGNACTIVITYACTUALCOST$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalcampaignactivityactualcost" element
     */
    public boolean isSetTotalcampaignactivityactualcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCAMPAIGNACTIVITYACTUALCOST$68) != 0;
        }
    }
    
    /**
     * Sets the "totalcampaignactivityactualcost" element
     */
    public void setTotalcampaignactivityactualcost(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalcampaignactivityactualcost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALCAMPAIGNACTIVITYACTUALCOST$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALCAMPAIGNACTIVITYACTUALCOST$68);
            }
            target.set(totalcampaignactivityactualcost);
        }
    }
    
    /**
     * Appends and returns a new empty "totalcampaignactivityactualcost" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalcampaignactivityactualcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALCAMPAIGNACTIVITYACTUALCOST$68);
            return target;
        }
    }
    
    /**
     * Unsets the "totalcampaignactivityactualcost" element
     */
    public void unsetTotalcampaignactivityactualcost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCAMPAIGNACTIVITYACTUALCOST$68, 0);
        }
    }
    
    /**
     * Gets the "totalcampaignactivityactualcost_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalcampaignactivityactualcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALCAMPAIGNACTIVITYACTUALCOSTBASE$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalcampaignactivityactualcost_base" element
     */
    public boolean isSetTotalcampaignactivityactualcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCAMPAIGNACTIVITYACTUALCOSTBASE$70) != 0;
        }
    }
    
    /**
     * Sets the "totalcampaignactivityactualcost_base" element
     */
    public void setTotalcampaignactivityactualcostBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalcampaignactivityactualcostBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALCAMPAIGNACTIVITYACTUALCOSTBASE$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALCAMPAIGNACTIVITYACTUALCOSTBASE$70);
            }
            target.set(totalcampaignactivityactualcostBase);
        }
    }
    
    /**
     * Appends and returns a new empty "totalcampaignactivityactualcost_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalcampaignactivityactualcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALCAMPAIGNACTIVITYACTUALCOSTBASE$70);
            return target;
        }
    }
    
    /**
     * Unsets the "totalcampaignactivityactualcost_base" element
     */
    public void unsetTotalcampaignactivityactualcostBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCAMPAIGNACTIVITYACTUALCOSTBASE$70, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$72, 0);
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
            return get_store().count_elements(TRANSACTIONCURRENCYID$72) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$72, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$72);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$72);
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
            get_store().remove_element(TRANSACTIONCURRENCYID$72, 0);
        }
    }
    
    /**
     * Gets the "typecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getTypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TYPECODE$74, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "typecode" element
     */
    public boolean isSetTypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPECODE$74) != 0;
        }
    }
    
    /**
     * Sets the "typecode" element
     */
    public void setTypecode(com.microsoft.schemas.crm._2006.webservices.Picklist typecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TYPECODE$74, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TYPECODE$74);
            }
            target.set(typecode);
        }
    }
    
    /**
     * Appends and returns a new empty "typecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewTypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TYPECODE$74);
            return target;
        }
    }
    
    /**
     * Unsets the "typecode" element
     */
    public void unsetTypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPECODE$74, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$76, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$76) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$76, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$76);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$76);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$76, 0);
        }
    }
}
