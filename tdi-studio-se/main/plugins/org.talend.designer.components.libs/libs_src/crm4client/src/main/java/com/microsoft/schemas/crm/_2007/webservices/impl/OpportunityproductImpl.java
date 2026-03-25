/*
 * XML Type:  opportunityproduct
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Opportunityproduct
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML opportunityproduct(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class OpportunityproductImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Opportunityproduct
{
    
    public OpportunityproductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEAMOUNT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "baseamount");
    private static final javax.xml.namespace.QName BASEAMOUNTBASE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "baseamount_base");
    private static final javax.xml.namespace.QName CREATEDBY$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName EXCHANGERATE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangerate");
    private static final javax.xml.namespace.QName EXTENDEDAMOUNT$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "extendedamount");
    private static final javax.xml.namespace.QName EXTENDEDAMOUNTBASE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "extendedamount_base");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName ISPRICEOVERRIDDEN$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ispriceoverridden");
    private static final javax.xml.namespace.QName ISPRODUCTOVERRIDDEN$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isproductoverridden");
    private static final javax.xml.namespace.QName MANUALDISCOUNTAMOUNT$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "manualdiscountamount");
    private static final javax.xml.namespace.QName MANUALDISCOUNTAMOUNTBASE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "manualdiscountamount_base");
    private static final javax.xml.namespace.QName MODIFIEDBY$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName OPPORTUNITYID$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "opportunityid");
    private static final javax.xml.namespace.QName OPPORTUNITYPRODUCTID$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "opportunityproductid");
    private static final javax.xml.namespace.QName OPPORTUNITYSTATECODE$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "opportunitystatecode");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName OWNINGUSER$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owninguser");
    private static final javax.xml.namespace.QName PRICEPERUNIT$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "priceperunit");
    private static final javax.xml.namespace.QName PRICEPERUNITBASE$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "priceperunit_base");
    private static final javax.xml.namespace.QName PRICINGERRORCODE$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricingerrorcode");
    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productdescription");
    private static final javax.xml.namespace.QName PRODUCTID$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productid");
    private static final javax.xml.namespace.QName QUANTITY$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "quantity");
    private static final javax.xml.namespace.QName TAX$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "tax");
    private static final javax.xml.namespace.QName TAXBASE$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "tax_base");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UOMID$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "uomid");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    private static final javax.xml.namespace.QName VOLUMEDISCOUNTAMOUNT$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "volumediscountamount");
    private static final javax.xml.namespace.QName VOLUMEDISCOUNTAMOUNTBASE$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "volumediscountamount_base");
    
    
    /**
     * Gets the "baseamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getBaseamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(BASEAMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "baseamount" element
     */
    public boolean isSetBaseamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEAMOUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "baseamount" element
     */
    public void setBaseamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney baseamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(BASEAMOUNT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(BASEAMOUNT$0);
            }
            target.set(baseamount);
        }
    }
    
    /**
     * Appends and returns a new empty "baseamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewBaseamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(BASEAMOUNT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "baseamount" element
     */
    public void unsetBaseamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEAMOUNT$0, 0);
        }
    }
    
    /**
     * Gets the "baseamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getBaseamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(BASEAMOUNTBASE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "baseamount_base" element
     */
    public boolean isSetBaseamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEAMOUNTBASE$2) != 0;
        }
    }
    
    /**
     * Sets the "baseamount_base" element
     */
    public void setBaseamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney baseamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(BASEAMOUNTBASE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(BASEAMOUNTBASE$2);
            }
            target.set(baseamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "baseamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewBaseamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(BASEAMOUNTBASE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "baseamount_base" element
     */
    public void unsetBaseamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEAMOUNTBASE$2, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$4, 0);
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
            return get_store().count_elements(CREATEDBY$4) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$4);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$4);
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
            get_store().remove_element(CREATEDBY$4, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$6, 0);
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
            return get_store().count_elements(CREATEDON$6) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$6);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$6);
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
            get_store().remove_element(CREATEDON$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
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
            return get_store().count_elements(DESCRIPTION$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
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
            get_store().remove_element(DESCRIPTION$8, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$10, 0);
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
            return get_store().count_elements(EXCHANGERATE$10) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$10);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$10);
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
            get_store().remove_element(EXCHANGERATE$10, 0);
        }
    }
    
    /**
     * Gets the "extendedamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getExtendedamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(EXTENDEDAMOUNT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extendedamount" element
     */
    public boolean isSetExtendedamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENDEDAMOUNT$12) != 0;
        }
    }
    
    /**
     * Sets the "extendedamount" element
     */
    public void setExtendedamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney extendedamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(EXTENDEDAMOUNT$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(EXTENDEDAMOUNT$12);
            }
            target.set(extendedamount);
        }
    }
    
    /**
     * Appends and returns a new empty "extendedamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewExtendedamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(EXTENDEDAMOUNT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "extendedamount" element
     */
    public void unsetExtendedamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENDEDAMOUNT$12, 0);
        }
    }
    
    /**
     * Gets the "extendedamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getExtendedamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(EXTENDEDAMOUNTBASE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extendedamount_base" element
     */
    public boolean isSetExtendedamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENDEDAMOUNTBASE$14) != 0;
        }
    }
    
    /**
     * Sets the "extendedamount_base" element
     */
    public void setExtendedamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney extendedamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(EXTENDEDAMOUNTBASE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(EXTENDEDAMOUNTBASE$14);
            }
            target.set(extendedamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "extendedamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewExtendedamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(EXTENDEDAMOUNTBASE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "extendedamount_base" element
     */
    public void unsetExtendedamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENDEDAMOUNTBASE$14, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$16, 0);
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
            return get_store().count_elements(IMPORTSEQUENCENUMBER$16) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$16);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$16);
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
            get_store().remove_element(IMPORTSEQUENCENUMBER$16, 0);
        }
    }
    
    /**
     * Gets the "ispriceoverridden" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIspriceoverridden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRICEOVERRIDDEN$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ispriceoverridden" element
     */
    public boolean isSetIspriceoverridden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRICEOVERRIDDEN$18) != 0;
        }
    }
    
    /**
     * Sets the "ispriceoverridden" element
     */
    public void setIspriceoverridden(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ispriceoverridden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRICEOVERRIDDEN$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRICEOVERRIDDEN$18);
            }
            target.set(ispriceoverridden);
        }
    }
    
    /**
     * Appends and returns a new empty "ispriceoverridden" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIspriceoverridden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRICEOVERRIDDEN$18);
            return target;
        }
    }
    
    /**
     * Unsets the "ispriceoverridden" element
     */
    public void unsetIspriceoverridden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRICEOVERRIDDEN$18, 0);
        }
    }
    
    /**
     * Gets the "isproductoverridden" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsproductoverridden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRODUCTOVERRIDDEN$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isproductoverridden" element
     */
    public boolean isSetIsproductoverridden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRODUCTOVERRIDDEN$20) != 0;
        }
    }
    
    /**
     * Sets the "isproductoverridden" element
     */
    public void setIsproductoverridden(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isproductoverridden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRODUCTOVERRIDDEN$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRODUCTOVERRIDDEN$20);
            }
            target.set(isproductoverridden);
        }
    }
    
    /**
     * Appends and returns a new empty "isproductoverridden" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsproductoverridden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRODUCTOVERRIDDEN$20);
            return target;
        }
    }
    
    /**
     * Unsets the "isproductoverridden" element
     */
    public void unsetIsproductoverridden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRODUCTOVERRIDDEN$20, 0);
        }
    }
    
    /**
     * Gets the "manualdiscountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getManualdiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MANUALDISCOUNTAMOUNT$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "manualdiscountamount" element
     */
    public boolean isSetManualdiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUALDISCOUNTAMOUNT$22) != 0;
        }
    }
    
    /**
     * Sets the "manualdiscountamount" element
     */
    public void setManualdiscountamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney manualdiscountamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MANUALDISCOUNTAMOUNT$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MANUALDISCOUNTAMOUNT$22);
            }
            target.set(manualdiscountamount);
        }
    }
    
    /**
     * Appends and returns a new empty "manualdiscountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewManualdiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MANUALDISCOUNTAMOUNT$22);
            return target;
        }
    }
    
    /**
     * Unsets the "manualdiscountamount" element
     */
    public void unsetManualdiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUALDISCOUNTAMOUNT$22, 0);
        }
    }
    
    /**
     * Gets the "manualdiscountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getManualdiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MANUALDISCOUNTAMOUNTBASE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "manualdiscountamount_base" element
     */
    public boolean isSetManualdiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUALDISCOUNTAMOUNTBASE$24) != 0;
        }
    }
    
    /**
     * Sets the "manualdiscountamount_base" element
     */
    public void setManualdiscountamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney manualdiscountamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MANUALDISCOUNTAMOUNTBASE$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MANUALDISCOUNTAMOUNTBASE$24);
            }
            target.set(manualdiscountamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "manualdiscountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewManualdiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MANUALDISCOUNTAMOUNTBASE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "manualdiscountamount_base" element
     */
    public void unsetManualdiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUALDISCOUNTAMOUNTBASE$24, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$26, 0);
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
            return get_store().count_elements(MODIFIEDBY$26) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$26);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$26);
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
            get_store().remove_element(MODIFIEDBY$26, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$28, 0);
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
            return get_store().count_elements(MODIFIEDON$28) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$28);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$28);
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
            get_store().remove_element(MODIFIEDON$28, 0);
        }
    }
    
    /**
     * Gets the "opportunityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOpportunityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OPPORTUNITYID$30, 0);
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
            return get_store().count_elements(OPPORTUNITYID$30) != 0;
        }
    }
    
    /**
     * Sets the "opportunityid" element
     */
    public void setOpportunityid(com.microsoft.schemas.crm._2006.webservices.Lookup opportunityid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OPPORTUNITYID$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OPPORTUNITYID$30);
            }
            target.set(opportunityid);
        }
    }
    
    /**
     * Appends and returns a new empty "opportunityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOpportunityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OPPORTUNITYID$30);
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
            get_store().remove_element(OPPORTUNITYID$30, 0);
        }
    }
    
    /**
     * Gets the "opportunityproductid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getOpportunityproductid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(OPPORTUNITYPRODUCTID$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "opportunityproductid" element
     */
    public boolean isSetOpportunityproductid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPPORTUNITYPRODUCTID$32) != 0;
        }
    }
    
    /**
     * Sets the "opportunityproductid" element
     */
    public void setOpportunityproductid(com.microsoft.schemas.crm._2006.webservices.Key opportunityproductid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(OPPORTUNITYPRODUCTID$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(OPPORTUNITYPRODUCTID$32);
            }
            target.set(opportunityproductid);
        }
    }
    
    /**
     * Appends and returns a new empty "opportunityproductid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewOpportunityproductid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(OPPORTUNITYPRODUCTID$32);
            return target;
        }
    }
    
    /**
     * Unsets the "opportunityproductid" element
     */
    public void unsetOpportunityproductid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPPORTUNITYPRODUCTID$32, 0);
        }
    }
    
    /**
     * Gets the "opportunitystatecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getOpportunitystatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OPPORTUNITYSTATECODE$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "opportunitystatecode" element
     */
    public boolean isSetOpportunitystatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPPORTUNITYSTATECODE$34) != 0;
        }
    }
    
    /**
     * Sets the "opportunitystatecode" element
     */
    public void setOpportunitystatecode(com.microsoft.schemas.crm._2006.webservices.Picklist opportunitystatecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(OPPORTUNITYSTATECODE$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OPPORTUNITYSTATECODE$34);
            }
            target.set(opportunitystatecode);
        }
    }
    
    /**
     * Appends and returns a new empty "opportunitystatecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewOpportunitystatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(OPPORTUNITYSTATECODE$34);
            return target;
        }
    }
    
    /**
     * Unsets the "opportunitystatecode" element
     */
    public void unsetOpportunitystatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPPORTUNITYSTATECODE$34, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$36, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$36) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$36);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$36);
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
            get_store().remove_element(OVERRIDDENCREATEDON$36, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$38, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$38) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$38);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$38);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$38, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$40, 0);
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
            return get_store().count_elements(OWNINGUSER$40) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$40);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$40);
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
            get_store().remove_element(OWNINGUSER$40, 0);
        }
    }
    
    /**
     * Gets the "priceperunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getPriceperunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEPERUNIT$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "priceperunit" element
     */
    public boolean isSetPriceperunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICEPERUNIT$42) != 0;
        }
    }
    
    /**
     * Sets the "priceperunit" element
     */
    public void setPriceperunit(com.microsoft.schemas.crm._2006.webservices.CrmMoney priceperunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEPERUNIT$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEPERUNIT$42);
            }
            target.set(priceperunit);
        }
    }
    
    /**
     * Appends and returns a new empty "priceperunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewPriceperunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEPERUNIT$42);
            return target;
        }
    }
    
    /**
     * Unsets the "priceperunit" element
     */
    public void unsetPriceperunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICEPERUNIT$42, 0);
        }
    }
    
    /**
     * Gets the "priceperunit_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getPriceperunitBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEPERUNITBASE$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "priceperunit_base" element
     */
    public boolean isSetPriceperunitBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICEPERUNITBASE$44) != 0;
        }
    }
    
    /**
     * Sets the "priceperunit_base" element
     */
    public void setPriceperunitBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney priceperunitBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEPERUNITBASE$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEPERUNITBASE$44);
            }
            target.set(priceperunitBase);
        }
    }
    
    /**
     * Appends and returns a new empty "priceperunit_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewPriceperunitBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEPERUNITBASE$44);
            return target;
        }
    }
    
    /**
     * Unsets the "priceperunit_base" element
     */
    public void unsetPriceperunitBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICEPERUNITBASE$44, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGERRORCODE$46, 0);
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
            return get_store().count_elements(PRICINGERRORCODE$46) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGERRORCODE$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGERRORCODE$46);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGERRORCODE$46);
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
            get_store().remove_element(PRICINGERRORCODE$46, 0);
        }
    }
    
    /**
     * Gets the "productdescription" element
     */
    public java.lang.String getProductdescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productdescription" element
     */
    public org.apache.xmlbeans.XmlString xgetProductdescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTDESCRIPTION$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "productdescription" element
     */
    public boolean isSetProductdescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTDESCRIPTION$48) != 0;
        }
    }
    
    /**
     * Sets the "productdescription" element
     */
    public void setProductdescription(java.lang.String productdescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$48);
            }
            target.setStringValue(productdescription);
        }
    }
    
    /**
     * Sets (as xml) the "productdescription" element
     */
    public void xsetProductdescription(org.apache.xmlbeans.XmlString productdescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTDESCRIPTION$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTDESCRIPTION$48);
            }
            target.set(productdescription);
        }
    }
    
    /**
     * Unsets the "productdescription" element
     */
    public void unsetProductdescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTDESCRIPTION$48, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRODUCTID$50, 0);
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
            return get_store().count_elements(PRODUCTID$50) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRODUCTID$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRODUCTID$50);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRODUCTID$50);
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
            get_store().remove_element(PRODUCTID$50, 0);
        }
    }
    
    /**
     * Gets the "quantity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITY$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$52) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(com.microsoft.schemas.crm._2006.webservices.CrmDecimal quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITY$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITY$52);
            }
            target.set(quantity);
        }
    }
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITY$52);
            return target;
        }
    }
    
    /**
     * Unsets the "quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$52, 0);
        }
    }
    
    /**
     * Gets the "tax" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TAX$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tax" element
     */
    public boolean isSetTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAX$54) != 0;
        }
    }
    
    /**
     * Sets the "tax" element
     */
    public void setTax(com.microsoft.schemas.crm._2006.webservices.CrmMoney tax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TAX$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TAX$54);
            }
            target.set(tax);
        }
    }
    
    /**
     * Appends and returns a new empty "tax" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TAX$54);
            return target;
        }
    }
    
    /**
     * Unsets the "tax" element
     */
    public void unsetTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAX$54, 0);
        }
    }
    
    /**
     * Gets the "tax_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TAXBASE$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tax_base" element
     */
    public boolean isSetTaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAXBASE$56) != 0;
        }
    }
    
    /**
     * Sets the "tax_base" element
     */
    public void setTaxBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney taxBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TAXBASE$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TAXBASE$56);
            }
            target.set(taxBase);
        }
    }
    
    /**
     * Appends and returns a new empty "tax_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TAXBASE$56);
            return target;
        }
    }
    
    /**
     * Unsets the "tax_base" element
     */
    public void unsetTaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAXBASE$56, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$58, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$58) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$58);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$58);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$58, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$60, 0);
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
            return get_store().count_elements(TRANSACTIONCURRENCYID$60) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$60);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$60);
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
            get_store().remove_element(TRANSACTIONCURRENCYID$60, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMID$62, 0);
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
            return get_store().count_elements(UOMID$62) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMID$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMID$62);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMID$62);
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
            get_store().remove_element(UOMID$62, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$64, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$64) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$64, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$64);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$64);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$64, 0);
        }
    }
    
    /**
     * Gets the "volumediscountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getVolumediscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(VOLUMEDISCOUNTAMOUNT$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "volumediscountamount" element
     */
    public boolean isSetVolumediscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOLUMEDISCOUNTAMOUNT$66) != 0;
        }
    }
    
    /**
     * Sets the "volumediscountamount" element
     */
    public void setVolumediscountamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney volumediscountamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(VOLUMEDISCOUNTAMOUNT$66, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(VOLUMEDISCOUNTAMOUNT$66);
            }
            target.set(volumediscountamount);
        }
    }
    
    /**
     * Appends and returns a new empty "volumediscountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewVolumediscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(VOLUMEDISCOUNTAMOUNT$66);
            return target;
        }
    }
    
    /**
     * Unsets the "volumediscountamount" element
     */
    public void unsetVolumediscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOLUMEDISCOUNTAMOUNT$66, 0);
        }
    }
    
    /**
     * Gets the "volumediscountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getVolumediscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(VOLUMEDISCOUNTAMOUNTBASE$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "volumediscountamount_base" element
     */
    public boolean isSetVolumediscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOLUMEDISCOUNTAMOUNTBASE$68) != 0;
        }
    }
    
    /**
     * Sets the "volumediscountamount_base" element
     */
    public void setVolumediscountamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney volumediscountamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(VOLUMEDISCOUNTAMOUNTBASE$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(VOLUMEDISCOUNTAMOUNTBASE$68);
            }
            target.set(volumediscountamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "volumediscountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewVolumediscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(VOLUMEDISCOUNTAMOUNTBASE$68);
            return target;
        }
    }
    
    /**
     * Unsets the "volumediscountamount_base" element
     */
    public void unsetVolumediscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOLUMEDISCOUNTAMOUNTBASE$68, 0);
        }
    }
}
