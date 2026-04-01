/*
 * XML Type:  contractdetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Contractdetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML contractdetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ContractdetailImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Contractdetail
{
    
    public ContractdetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVEON$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "activeon");
    private static final javax.xml.namespace.QName ALLOTMENTSREMAINING$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allotmentsremaining");
    private static final javax.xml.namespace.QName ALLOTMENTSUSED$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allotmentsused");
    private static final javax.xml.namespace.QName CONTRACTDETAILID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contractdetailid");
    private static final javax.xml.namespace.QName CONTRACTID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contractid");
    private static final javax.xml.namespace.QName CONTRACTSTATECODE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contractstatecode");
    private static final javax.xml.namespace.QName CREATEDBY$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMERID$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customerid");
    private static final javax.xml.namespace.QName DISCOUNT$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "discount");
    private static final javax.xml.namespace.QName DISCOUNTBASE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "discount_base");
    private static final javax.xml.namespace.QName DISCOUNTPERCENTAGE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "discountpercentage");
    private static final javax.xml.namespace.QName EFFECTIVITYCALENDAR$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "effectivitycalendar");
    private static final javax.xml.namespace.QName EXCHANGERATE$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangerate");
    private static final javax.xml.namespace.QName EXPIRESON$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "expireson");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName INITIALQUANTITY$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "initialquantity");
    private static final javax.xml.namespace.QName LINEITEMORDER$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lineitemorder");
    private static final javax.xml.namespace.QName MODIFIEDBY$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NET$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "net");
    private static final javax.xml.namespace.QName NETBASE$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "net_base");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName OWNINGUSER$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owninguser");
    private static final javax.xml.namespace.QName PRICE$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "price");
    private static final javax.xml.namespace.QName PRICEBASE$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "price_base");
    private static final javax.xml.namespace.QName PRODUCTID$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productid");
    private static final javax.xml.namespace.QName PRODUCTSERIALNUMBER$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productserialnumber");
    private static final javax.xml.namespace.QName RATE$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "rate");
    private static final javax.xml.namespace.QName RATEBASE$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "rate_base");
    private static final javax.xml.namespace.QName SERVICEADDRESS$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "serviceaddress");
    private static final javax.xml.namespace.QName SERVICECONTRACTUNITSCODE$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "servicecontractunitscode");
    private static final javax.xml.namespace.QName STATECODE$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TITLE$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "title");
    private static final javax.xml.namespace.QName TOTALALLOTMENTS$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalallotments");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UOMID$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "uomid");
    private static final javax.xml.namespace.QName UOMSCHEDULEID$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "uomscheduleid");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "activeon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getActiveon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ACTIVEON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activeon" element
     */
    public boolean isSetActiveon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVEON$0) != 0;
        }
    }
    
    /**
     * Sets the "activeon" element
     */
    public void setActiveon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime activeon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ACTIVEON$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ACTIVEON$0);
            }
            target.set(activeon);
        }
    }
    
    /**
     * Appends and returns a new empty "activeon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewActiveon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ACTIVEON$0);
            return target;
        }
    }
    
    /**
     * Unsets the "activeon" element
     */
    public void unsetActiveon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVEON$0, 0);
        }
    }
    
    /**
     * Gets the "allotmentsremaining" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getAllotmentsremaining()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ALLOTMENTSREMAINING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allotmentsremaining" element
     */
    public boolean isSetAllotmentsremaining()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOTMENTSREMAINING$2) != 0;
        }
    }
    
    /**
     * Sets the "allotmentsremaining" element
     */
    public void setAllotmentsremaining(com.microsoft.schemas.crm._2006.webservices.CrmNumber allotmentsremaining)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ALLOTMENTSREMAINING$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ALLOTMENTSREMAINING$2);
            }
            target.set(allotmentsremaining);
        }
    }
    
    /**
     * Appends and returns a new empty "allotmentsremaining" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAllotmentsremaining()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ALLOTMENTSREMAINING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "allotmentsremaining" element
     */
    public void unsetAllotmentsremaining()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOTMENTSREMAINING$2, 0);
        }
    }
    
    /**
     * Gets the "allotmentsused" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getAllotmentsused()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ALLOTMENTSUSED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allotmentsused" element
     */
    public boolean isSetAllotmentsused()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOTMENTSUSED$4) != 0;
        }
    }
    
    /**
     * Sets the "allotmentsused" element
     */
    public void setAllotmentsused(com.microsoft.schemas.crm._2006.webservices.CrmNumber allotmentsused)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ALLOTMENTSUSED$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ALLOTMENTSUSED$4);
            }
            target.set(allotmentsused);
        }
    }
    
    /**
     * Appends and returns a new empty "allotmentsused" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAllotmentsused()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ALLOTMENTSUSED$4);
            return target;
        }
    }
    
    /**
     * Unsets the "allotmentsused" element
     */
    public void unsetAllotmentsused()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOTMENTSUSED$4, 0);
        }
    }
    
    /**
     * Gets the "contractdetailid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getContractdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CONTRACTDETAILID$6, 0);
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
            return get_store().count_elements(CONTRACTDETAILID$6) != 0;
        }
    }
    
    /**
     * Sets the "contractdetailid" element
     */
    public void setContractdetailid(com.microsoft.schemas.crm._2006.webservices.Key contractdetailid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CONTRACTDETAILID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CONTRACTDETAILID$6);
            }
            target.set(contractdetailid);
        }
    }
    
    /**
     * Appends and returns a new empty "contractdetailid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewContractdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CONTRACTDETAILID$6);
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
            get_store().remove_element(CONTRACTDETAILID$6, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CONTRACTID$8, 0);
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
            return get_store().count_elements(CONTRACTID$8) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CONTRACTID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CONTRACTID$8);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CONTRACTID$8);
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
            get_store().remove_element(CONTRACTID$8, 0);
        }
    }
    
    /**
     * Gets the "contractstatecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getContractstatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CONTRACTSTATECODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contractstatecode" element
     */
    public boolean isSetContractstatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRACTSTATECODE$10) != 0;
        }
    }
    
    /**
     * Sets the "contractstatecode" element
     */
    public void setContractstatecode(com.microsoft.schemas.crm._2006.webservices.Picklist contractstatecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CONTRACTSTATECODE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CONTRACTSTATECODE$10);
            }
            target.set(contractstatecode);
        }
    }
    
    /**
     * Appends and returns a new empty "contractstatecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewContractstatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CONTRACTSTATECODE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "contractstatecode" element
     */
    public void unsetContractstatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRACTSTATECODE$10, 0);
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
     * Gets the "customerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Customer getCustomerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Customer target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$16, 0);
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
            return get_store().count_elements(CUSTOMERID$16) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$16);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$16);
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
            get_store().remove_element(CUSTOMERID$16, 0);
        }
    }
    
    /**
     * Gets the "discount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(DISCOUNT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "discount" element
     */
    public boolean isSetDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNT$18) != 0;
        }
    }
    
    /**
     * Sets the "discount" element
     */
    public void setDiscount(com.microsoft.schemas.crm._2006.webservices.CrmMoney discount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(DISCOUNT$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(DISCOUNT$18);
            }
            target.set(discount);
        }
    }
    
    /**
     * Appends and returns a new empty "discount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(DISCOUNT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "discount" element
     */
    public void unsetDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNT$18, 0);
        }
    }
    
    /**
     * Gets the "discount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getDiscountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(DISCOUNTBASE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "discount_base" element
     */
    public boolean isSetDiscountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTBASE$20) != 0;
        }
    }
    
    /**
     * Sets the "discount_base" element
     */
    public void setDiscountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney discountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(DISCOUNTBASE$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(DISCOUNTBASE$20);
            }
            target.set(discountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "discount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewDiscountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(DISCOUNTBASE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "discount_base" element
     */
    public void unsetDiscountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTBASE$20, 0);
        }
    }
    
    /**
     * Gets the "discountpercentage" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getDiscountpercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(DISCOUNTPERCENTAGE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "discountpercentage" element
     */
    public boolean isSetDiscountpercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTPERCENTAGE$22) != 0;
        }
    }
    
    /**
     * Sets the "discountpercentage" element
     */
    public void setDiscountpercentage(com.microsoft.schemas.crm._2006.webservices.CrmDecimal discountpercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(DISCOUNTPERCENTAGE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(DISCOUNTPERCENTAGE$22);
            }
            target.set(discountpercentage);
        }
    }
    
    /**
     * Appends and returns a new empty "discountpercentage" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewDiscountpercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(DISCOUNTPERCENTAGE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "discountpercentage" element
     */
    public void unsetDiscountpercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTPERCENTAGE$22, 0);
        }
    }
    
    /**
     * Gets the "effectivitycalendar" element
     */
    public java.lang.String getEffectivitycalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVITYCALENDAR$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "effectivitycalendar" element
     */
    public org.apache.xmlbeans.XmlString xgetEffectivitycalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVITYCALENDAR$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "effectivitycalendar" element
     */
    public boolean isSetEffectivitycalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVITYCALENDAR$24) != 0;
        }
    }
    
    /**
     * Sets the "effectivitycalendar" element
     */
    public void setEffectivitycalendar(java.lang.String effectivitycalendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVITYCALENDAR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVITYCALENDAR$24);
            }
            target.setStringValue(effectivitycalendar);
        }
    }
    
    /**
     * Sets (as xml) the "effectivitycalendar" element
     */
    public void xsetEffectivitycalendar(org.apache.xmlbeans.XmlString effectivitycalendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVITYCALENDAR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EFFECTIVITYCALENDAR$24);
            }
            target.set(effectivitycalendar);
        }
    }
    
    /**
     * Unsets the "effectivitycalendar" element
     */
    public void unsetEffectivitycalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVITYCALENDAR$24, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$26, 0);
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
            return get_store().count_elements(EXCHANGERATE$26) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$26);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$26);
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
            get_store().remove_element(EXCHANGERATE$26, 0);
        }
    }
    
    /**
     * Gets the "expireson" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getExpireson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(EXPIRESON$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expireson" element
     */
    public boolean isSetExpireson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRESON$28) != 0;
        }
    }
    
    /**
     * Sets the "expireson" element
     */
    public void setExpireson(com.microsoft.schemas.crm._2006.webservices.CrmDateTime expireson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(EXPIRESON$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(EXPIRESON$28);
            }
            target.set(expireson);
        }
    }
    
    /**
     * Appends and returns a new empty "expireson" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewExpireson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(EXPIRESON$28);
            return target;
        }
    }
    
    /**
     * Unsets the "expireson" element
     */
    public void unsetExpireson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRESON$28, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$30, 0);
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
            return get_store().count_elements(IMPORTSEQUENCENUMBER$30) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$30);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$30);
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
            get_store().remove_element(IMPORTSEQUENCENUMBER$30, 0);
        }
    }
    
    /**
     * Gets the "initialquantity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getInitialquantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(INITIALQUANTITY$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "initialquantity" element
     */
    public boolean isSetInitialquantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITIALQUANTITY$32) != 0;
        }
    }
    
    /**
     * Sets the "initialquantity" element
     */
    public void setInitialquantity(com.microsoft.schemas.crm._2006.webservices.CrmNumber initialquantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(INITIALQUANTITY$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(INITIALQUANTITY$32);
            }
            target.set(initialquantity);
        }
    }
    
    /**
     * Appends and returns a new empty "initialquantity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewInitialquantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(INITIALQUANTITY$32);
            return target;
        }
    }
    
    /**
     * Unsets the "initialquantity" element
     */
    public void unsetInitialquantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITIALQUANTITY$32, 0);
        }
    }
    
    /**
     * Gets the "lineitemorder" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getLineitemorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LINEITEMORDER$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lineitemorder" element
     */
    public boolean isSetLineitemorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINEITEMORDER$34) != 0;
        }
    }
    
    /**
     * Sets the "lineitemorder" element
     */
    public void setLineitemorder(com.microsoft.schemas.crm._2006.webservices.CrmNumber lineitemorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LINEITEMORDER$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LINEITEMORDER$34);
            }
            target.set(lineitemorder);
        }
    }
    
    /**
     * Appends and returns a new empty "lineitemorder" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLineitemorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LINEITEMORDER$34);
            return target;
        }
    }
    
    /**
     * Unsets the "lineitemorder" element
     */
    public void unsetLineitemorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINEITEMORDER$34, 0);
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
     * Gets the "net" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(NET$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "net" element
     */
    public boolean isSetNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NET$40) != 0;
        }
    }
    
    /**
     * Sets the "net" element
     */
    public void setNet(com.microsoft.schemas.crm._2006.webservices.CrmMoney net)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(NET$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(NET$40);
            }
            target.set(net);
        }
    }
    
    /**
     * Appends and returns a new empty "net" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(NET$40);
            return target;
        }
    }
    
    /**
     * Unsets the "net" element
     */
    public void unsetNet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NET$40, 0);
        }
    }
    
    /**
     * Gets the "net_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getNetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(NETBASE$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "net_base" element
     */
    public boolean isSetNetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NETBASE$42) != 0;
        }
    }
    
    /**
     * Sets the "net_base" element
     */
    public void setNetBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney netBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(NETBASE$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(NETBASE$42);
            }
            target.set(netBase);
        }
    }
    
    /**
     * Appends and returns a new empty "net_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewNetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(NETBASE$42);
            return target;
        }
    }
    
    /**
     * Unsets the "net_base" element
     */
    public void unsetNetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NETBASE$42, 0);
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
     * Gets the "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$46, 0);
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
    public void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owningbusinessunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$46);
            }
            target.set(owningbusinessunit);
        }
    }
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$46);
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
     * Gets the "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owninguser" element
     */
    public boolean isSetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGUSER$48) != 0;
        }
    }
    
    /**
     * Sets the "owninguser" element
     */
    public void setOwninguser(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owninguser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$48);
            }
            target.set(owninguser);
        }
    }
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$48);
            return target;
        }
    }
    
    /**
     * Unsets the "owninguser" element
     */
    public void unsetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGUSER$48, 0);
        }
    }
    
    /**
     * Gets the "price" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICE$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "price" element
     */
    public boolean isSetPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICE$50) != 0;
        }
    }
    
    /**
     * Sets the "price" element
     */
    public void setPrice(com.microsoft.schemas.crm._2006.webservices.CrmMoney price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICE$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICE$50);
            }
            target.set(price);
        }
    }
    
    /**
     * Appends and returns a new empty "price" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICE$50);
            return target;
        }
    }
    
    /**
     * Unsets the "price" element
     */
    public void unsetPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICE$50, 0);
        }
    }
    
    /**
     * Gets the "price_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getPriceBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEBASE$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "price_base" element
     */
    public boolean isSetPriceBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICEBASE$52) != 0;
        }
    }
    
    /**
     * Sets the "price_base" element
     */
    public void setPriceBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney priceBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEBASE$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEBASE$52);
            }
            target.set(priceBase);
        }
    }
    
    /**
     * Appends and returns a new empty "price_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewPriceBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEBASE$52);
            return target;
        }
    }
    
    /**
     * Unsets the "price_base" element
     */
    public void unsetPriceBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICEBASE$52, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRODUCTID$54, 0);
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
            return get_store().count_elements(PRODUCTID$54) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRODUCTID$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRODUCTID$54);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRODUCTID$54);
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
            get_store().remove_element(PRODUCTID$54, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSERIALNUMBER$56, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSERIALNUMBER$56, 0);
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
            return get_store().count_elements(PRODUCTSERIALNUMBER$56) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSERIALNUMBER$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSERIALNUMBER$56);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSERIALNUMBER$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTSERIALNUMBER$56);
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
            get_store().remove_element(PRODUCTSERIALNUMBER$56, 0);
        }
    }
    
    /**
     * Gets the "rate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(RATE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rate" element
     */
    public boolean isSetRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RATE$58) != 0;
        }
    }
    
    /**
     * Sets the "rate" element
     */
    public void setRate(com.microsoft.schemas.crm._2006.webservices.CrmMoney rate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(RATE$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(RATE$58);
            }
            target.set(rate);
        }
    }
    
    /**
     * Appends and returns a new empty "rate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(RATE$58);
            return target;
        }
    }
    
    /**
     * Unsets the "rate" element
     */
    public void unsetRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RATE$58, 0);
        }
    }
    
    /**
     * Gets the "rate_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getRateBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(RATEBASE$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rate_base" element
     */
    public boolean isSetRateBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RATEBASE$60) != 0;
        }
    }
    
    /**
     * Sets the "rate_base" element
     */
    public void setRateBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney rateBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(RATEBASE$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(RATEBASE$60);
            }
            target.set(rateBase);
        }
    }
    
    /**
     * Appends and returns a new empty "rate_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRateBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(RATEBASE$60);
            return target;
        }
    }
    
    /**
     * Unsets the "rate_base" element
     */
    public void unsetRateBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RATEBASE$60, 0);
        }
    }
    
    /**
     * Gets the "serviceaddress" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getServiceaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SERVICEADDRESS$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serviceaddress" element
     */
    public boolean isSetServiceaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEADDRESS$62) != 0;
        }
    }
    
    /**
     * Sets the "serviceaddress" element
     */
    public void setServiceaddress(com.microsoft.schemas.crm._2006.webservices.Lookup serviceaddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SERVICEADDRESS$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SERVICEADDRESS$62);
            }
            target.set(serviceaddress);
        }
    }
    
    /**
     * Appends and returns a new empty "serviceaddress" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewServiceaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SERVICEADDRESS$62);
            return target;
        }
    }
    
    /**
     * Unsets the "serviceaddress" element
     */
    public void unsetServiceaddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEADDRESS$62, 0);
        }
    }
    
    /**
     * Gets the "servicecontractunitscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getServicecontractunitscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SERVICECONTRACTUNITSCODE$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "servicecontractunitscode" element
     */
    public boolean isSetServicecontractunitscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECONTRACTUNITSCODE$64) != 0;
        }
    }
    
    /**
     * Sets the "servicecontractunitscode" element
     */
    public void setServicecontractunitscode(com.microsoft.schemas.crm._2006.webservices.Picklist servicecontractunitscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SERVICECONTRACTUNITSCODE$64, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SERVICECONTRACTUNITSCODE$64);
            }
            target.set(servicecontractunitscode);
        }
    }
    
    /**
     * Appends and returns a new empty "servicecontractunitscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewServicecontractunitscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SERVICECONTRACTUNITSCODE$64);
            return target;
        }
    }
    
    /**
     * Unsets the "servicecontractunitscode" element
     */
    public void unsetServicecontractunitscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECONTRACTUNITSCODE$64, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo)get_store().find_element_user(STATECODE$66, 0);
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
            return get_store().count_elements(STATECODE$66) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo)get_store().find_element_user(STATECODE$66, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo)get_store().add_element_user(STATECODE$66);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ContractDetailStateInfo)get_store().add_element_user(STATECODE$66);
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
            get_store().remove_element(STATECODE$66, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$68, 0);
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
            return get_store().count_elements(STATUSCODE$68) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$68);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$68);
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
            get_store().remove_element(STATUSCODE$68, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$70, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$70) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$70);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$70);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$70, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$72, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$72, 0);
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
            return get_store().count_elements(TITLE$72) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$72);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$72);
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
            get_store().remove_element(TITLE$72, 0);
        }
    }
    
    /**
     * Gets the "totalallotments" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTotalallotments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TOTALALLOTMENTS$74, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalallotments" element
     */
    public boolean isSetTotalallotments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALALLOTMENTS$74) != 0;
        }
    }
    
    /**
     * Sets the "totalallotments" element
     */
    public void setTotalallotments(com.microsoft.schemas.crm._2006.webservices.CrmNumber totalallotments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TOTALALLOTMENTS$74, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TOTALALLOTMENTS$74);
            }
            target.set(totalallotments);
        }
    }
    
    /**
     * Appends and returns a new empty "totalallotments" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTotalallotments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TOTALALLOTMENTS$74);
            return target;
        }
    }
    
    /**
     * Unsets the "totalallotments" element
     */
    public void unsetTotalallotments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALALLOTMENTS$74, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$76, 0);
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
            return get_store().count_elements(TRANSACTIONCURRENCYID$76) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$76, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$76);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$76);
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
            get_store().remove_element(TRANSACTIONCURRENCYID$76, 0);
        }
    }
    
    /**
     * Gets the "uomid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getUomid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMID$78, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uomid" element
     */
    public boolean isSetUomid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UOMID$78) != 0;
        }
    }
    
    /**
     * Sets the "uomid" element
     */
    public void setUomid(com.microsoft.schemas.crm._2006.webservices.Lookup uomid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMID$78, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMID$78);
            }
            target.set(uomid);
        }
    }
    
    /**
     * Appends and returns a new empty "uomid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewUomid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMID$78);
            return target;
        }
    }
    
    /**
     * Unsets the "uomid" element
     */
    public void unsetUomid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UOMID$78, 0);
        }
    }
    
    /**
     * Gets the "uomscheduleid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getUomscheduleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMSCHEDULEID$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uomscheduleid" element
     */
    public boolean isSetUomscheduleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UOMSCHEDULEID$80) != 0;
        }
    }
    
    /**
     * Sets the "uomscheduleid" element
     */
    public void setUomscheduleid(com.microsoft.schemas.crm._2006.webservices.Lookup uomscheduleid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMSCHEDULEID$80, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMSCHEDULEID$80);
            }
            target.set(uomscheduleid);
        }
    }
    
    /**
     * Appends and returns a new empty "uomscheduleid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewUomscheduleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMSCHEDULEID$80);
            return target;
        }
    }
    
    /**
     * Unsets the "uomscheduleid" element
     */
    public void unsetUomscheduleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UOMSCHEDULEID$80, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$82, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$82) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$82, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$82);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$82);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$82, 0);
        }
    }
}
