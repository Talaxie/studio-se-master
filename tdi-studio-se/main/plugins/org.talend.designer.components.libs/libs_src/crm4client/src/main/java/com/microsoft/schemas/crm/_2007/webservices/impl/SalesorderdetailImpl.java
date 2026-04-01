/*
 * XML Type:  salesorderdetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Salesorderdetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML salesorderdetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SalesorderdetailImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Salesorderdetail
{
    
    public SalesorderdetailImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName ISCOPIED$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "iscopied");
    private static final javax.xml.namespace.QName ISPRICEOVERRIDDEN$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ispriceoverridden");
    private static final javax.xml.namespace.QName ISPRODUCTOVERRIDDEN$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isproductoverridden");
    private static final javax.xml.namespace.QName LINEITEMNUMBER$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lineitemnumber");
    private static final javax.xml.namespace.QName MANUALDISCOUNTAMOUNT$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "manualdiscountamount");
    private static final javax.xml.namespace.QName MANUALDISCOUNTAMOUNTBASE$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "manualdiscountamount_base");
    private static final javax.xml.namespace.QName MODIFIEDBY$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName OWNINGUSER$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owninguser");
    private static final javax.xml.namespace.QName PRICEPERUNIT$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "priceperunit");
    private static final javax.xml.namespace.QName PRICEPERUNITBASE$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "priceperunit_base");
    private static final javax.xml.namespace.QName PRICINGERRORCODE$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricingerrorcode");
    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productdescription");
    private static final javax.xml.namespace.QName PRODUCTID$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productid");
    private static final javax.xml.namespace.QName QUANTITY$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "quantity");
    private static final javax.xml.namespace.QName QUANTITYBACKORDERED$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "quantitybackordered");
    private static final javax.xml.namespace.QName QUANTITYCANCELLED$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "quantitycancelled");
    private static final javax.xml.namespace.QName QUANTITYSHIPPED$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "quantityshipped");
    private static final javax.xml.namespace.QName REQUESTDELIVERYBY$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "requestdeliveryby");
    private static final javax.xml.namespace.QName SALESORDERDETAILID$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salesorderdetailid");
    private static final javax.xml.namespace.QName SALESORDERID$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salesorderid");
    private static final javax.xml.namespace.QName SALESORDERISPRICELOCKED$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salesorderispricelocked");
    private static final javax.xml.namespace.QName SALESORDERSTATECODE$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salesorderstatecode");
    private static final javax.xml.namespace.QName SALESREPID$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salesrepid");
    private static final javax.xml.namespace.QName SHIPTOADDRESSID$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_addressid");
    private static final javax.xml.namespace.QName SHIPTOCITY$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_city");
    private static final javax.xml.namespace.QName SHIPTOCONTACTNAME$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_contactname");
    private static final javax.xml.namespace.QName SHIPTOCOUNTRY$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_country");
    private static final javax.xml.namespace.QName SHIPTOFAX$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_fax");
    private static final javax.xml.namespace.QName SHIPTOFREIGHTTERMSCODE$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_freighttermscode");
    private static final javax.xml.namespace.QName SHIPTOLINE1$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_line1");
    private static final javax.xml.namespace.QName SHIPTOLINE2$84 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_line2");
    private static final javax.xml.namespace.QName SHIPTOLINE3$86 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_line3");
    private static final javax.xml.namespace.QName SHIPTONAME$88 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_name");
    private static final javax.xml.namespace.QName SHIPTOPOSTALCODE$90 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_postalcode");
    private static final javax.xml.namespace.QName SHIPTOSTATEORPROVINCE$92 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_stateorprovince");
    private static final javax.xml.namespace.QName SHIPTOTELEPHONE$94 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_telephone");
    private static final javax.xml.namespace.QName TAX$96 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "tax");
    private static final javax.xml.namespace.QName TAXBASE$98 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "tax_base");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$100 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$102 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UOMID$104 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "uomid");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$106 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    private static final javax.xml.namespace.QName VOLUMEDISCOUNTAMOUNT$108 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "volumediscountamount");
    private static final javax.xml.namespace.QName VOLUMEDISCOUNTAMOUNTBASE$110 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "volumediscountamount_base");
    private static final javax.xml.namespace.QName WILLCALL$112 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "willcall");
    
    
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
     * Gets the "iscopied" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIscopied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISCOPIED$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "iscopied" element
     */
    public boolean isSetIscopied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCOPIED$18) != 0;
        }
    }
    
    /**
     * Sets the "iscopied" element
     */
    public void setIscopied(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iscopied)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISCOPIED$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISCOPIED$18);
            }
            target.set(iscopied);
        }
    }
    
    /**
     * Appends and returns a new empty "iscopied" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIscopied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISCOPIED$18);
            return target;
        }
    }
    
    /**
     * Unsets the "iscopied" element
     */
    public void unsetIscopied()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCOPIED$18, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRICEOVERRIDDEN$20, 0);
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
            return get_store().count_elements(ISPRICEOVERRIDDEN$20) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRICEOVERRIDDEN$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRICEOVERRIDDEN$20);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRICEOVERRIDDEN$20);
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
            get_store().remove_element(ISPRICEOVERRIDDEN$20, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRODUCTOVERRIDDEN$22, 0);
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
            return get_store().count_elements(ISPRODUCTOVERRIDDEN$22) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRODUCTOVERRIDDEN$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRODUCTOVERRIDDEN$22);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRODUCTOVERRIDDEN$22);
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
            get_store().remove_element(ISPRODUCTOVERRIDDEN$22, 0);
        }
    }
    
    /**
     * Gets the "lineitemnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getLineitemnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LINEITEMNUMBER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lineitemnumber" element
     */
    public boolean isSetLineitemnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINEITEMNUMBER$24) != 0;
        }
    }
    
    /**
     * Sets the "lineitemnumber" element
     */
    public void setLineitemnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber lineitemnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LINEITEMNUMBER$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LINEITEMNUMBER$24);
            }
            target.set(lineitemnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "lineitemnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLineitemnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LINEITEMNUMBER$24);
            return target;
        }
    }
    
    /**
     * Unsets the "lineitemnumber" element
     */
    public void unsetLineitemnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINEITEMNUMBER$24, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MANUALDISCOUNTAMOUNT$26, 0);
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
            return get_store().count_elements(MANUALDISCOUNTAMOUNT$26) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MANUALDISCOUNTAMOUNT$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MANUALDISCOUNTAMOUNT$26);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MANUALDISCOUNTAMOUNT$26);
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
            get_store().remove_element(MANUALDISCOUNTAMOUNT$26, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MANUALDISCOUNTAMOUNTBASE$28, 0);
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
            return get_store().count_elements(MANUALDISCOUNTAMOUNTBASE$28) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(MANUALDISCOUNTAMOUNTBASE$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MANUALDISCOUNTAMOUNTBASE$28);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(MANUALDISCOUNTAMOUNTBASE$28);
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
            get_store().remove_element(MANUALDISCOUNTAMOUNTBASE$28, 0);
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
     * Gets the "overriddencreatedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getOverriddencreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$34, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$34) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$34);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$34);
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
            get_store().remove_element(OVERRIDDENCREATEDON$34, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$36, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$36) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$36);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$36);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$36, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$38, 0);
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
            return get_store().count_elements(OWNINGUSER$38) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$38);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$38);
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
            get_store().remove_element(OWNINGUSER$38, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEPERUNIT$40, 0);
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
            return get_store().count_elements(PRICEPERUNIT$40) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEPERUNIT$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEPERUNIT$40);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEPERUNIT$40);
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
            get_store().remove_element(PRICEPERUNIT$40, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEPERUNITBASE$42, 0);
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
            return get_store().count_elements(PRICEPERUNITBASE$42) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(PRICEPERUNITBASE$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEPERUNITBASE$42);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(PRICEPERUNITBASE$42);
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
            get_store().remove_element(PRICEPERUNITBASE$42, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGERRORCODE$44, 0);
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
            return get_store().count_elements(PRICINGERRORCODE$44) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGERRORCODE$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGERRORCODE$44);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGERRORCODE$44);
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
            get_store().remove_element(PRICINGERRORCODE$44, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$46, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTDESCRIPTION$46, 0);
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
            return get_store().count_elements(PRODUCTDESCRIPTION$46) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$46);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTDESCRIPTION$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTDESCRIPTION$46);
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
            get_store().remove_element(PRODUCTDESCRIPTION$46, 0);
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
     * Gets the "quantity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITY$50, 0);
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
            return get_store().count_elements(QUANTITY$50) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITY$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITY$50);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITY$50);
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
            get_store().remove_element(QUANTITY$50, 0);
        }
    }
    
    /**
     * Gets the "quantitybackordered" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getQuantitybackordered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITYBACKORDERED$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantitybackordered" element
     */
    public boolean isSetQuantitybackordered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYBACKORDERED$52) != 0;
        }
    }
    
    /**
     * Sets the "quantitybackordered" element
     */
    public void setQuantitybackordered(com.microsoft.schemas.crm._2006.webservices.CrmDecimal quantitybackordered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITYBACKORDERED$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITYBACKORDERED$52);
            }
            target.set(quantitybackordered);
        }
    }
    
    /**
     * Appends and returns a new empty "quantitybackordered" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewQuantitybackordered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITYBACKORDERED$52);
            return target;
        }
    }
    
    /**
     * Unsets the "quantitybackordered" element
     */
    public void unsetQuantitybackordered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYBACKORDERED$52, 0);
        }
    }
    
    /**
     * Gets the "quantitycancelled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getQuantitycancelled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITYCANCELLED$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantitycancelled" element
     */
    public boolean isSetQuantitycancelled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYCANCELLED$54) != 0;
        }
    }
    
    /**
     * Sets the "quantitycancelled" element
     */
    public void setQuantitycancelled(com.microsoft.schemas.crm._2006.webservices.CrmDecimal quantitycancelled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITYCANCELLED$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITYCANCELLED$54);
            }
            target.set(quantitycancelled);
        }
    }
    
    /**
     * Appends and returns a new empty "quantitycancelled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewQuantitycancelled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITYCANCELLED$54);
            return target;
        }
    }
    
    /**
     * Unsets the "quantitycancelled" element
     */
    public void unsetQuantitycancelled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYCANCELLED$54, 0);
        }
    }
    
    /**
     * Gets the "quantityshipped" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getQuantityshipped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITYSHIPPED$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantityshipped" element
     */
    public boolean isSetQuantityshipped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYSHIPPED$56) != 0;
        }
    }
    
    /**
     * Sets the "quantityshipped" element
     */
    public void setQuantityshipped(com.microsoft.schemas.crm._2006.webservices.CrmDecimal quantityshipped)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(QUANTITYSHIPPED$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITYSHIPPED$56);
            }
            target.set(quantityshipped);
        }
    }
    
    /**
     * Appends and returns a new empty "quantityshipped" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewQuantityshipped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(QUANTITYSHIPPED$56);
            return target;
        }
    }
    
    /**
     * Unsets the "quantityshipped" element
     */
    public void unsetQuantityshipped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYSHIPPED$56, 0);
        }
    }
    
    /**
     * Gets the "requestdeliveryby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getRequestdeliveryby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(REQUESTDELIVERYBY$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requestdeliveryby" element
     */
    public boolean isSetRequestdeliveryby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTDELIVERYBY$58) != 0;
        }
    }
    
    /**
     * Sets the "requestdeliveryby" element
     */
    public void setRequestdeliveryby(com.microsoft.schemas.crm._2006.webservices.CrmDateTime requestdeliveryby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(REQUESTDELIVERYBY$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(REQUESTDELIVERYBY$58);
            }
            target.set(requestdeliveryby);
        }
    }
    
    /**
     * Appends and returns a new empty "requestdeliveryby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewRequestdeliveryby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(REQUESTDELIVERYBY$58);
            return target;
        }
    }
    
    /**
     * Unsets the "requestdeliveryby" element
     */
    public void unsetRequestdeliveryby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTDELIVERYBY$58, 0);
        }
    }
    
    /**
     * Gets the "salesorderdetailid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getSalesorderdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SALESORDERDETAILID$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "salesorderdetailid" element
     */
    public boolean isSetSalesorderdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESORDERDETAILID$60) != 0;
        }
    }
    
    /**
     * Sets the "salesorderdetailid" element
     */
    public void setSalesorderdetailid(com.microsoft.schemas.crm._2006.webservices.Key salesorderdetailid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SALESORDERDETAILID$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SALESORDERDETAILID$60);
            }
            target.set(salesorderdetailid);
        }
    }
    
    /**
     * Appends and returns a new empty "salesorderdetailid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewSalesorderdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SALESORDERDETAILID$60);
            return target;
        }
    }
    
    /**
     * Unsets the "salesorderdetailid" element
     */
    public void unsetSalesorderdetailid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESORDERDETAILID$60, 0);
        }
    }
    
    /**
     * Gets the "salesorderid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getSalesorderid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SALESORDERID$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "salesorderid" element
     */
    public boolean isSetSalesorderid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESORDERID$62) != 0;
        }
    }
    
    /**
     * Sets the "salesorderid" element
     */
    public void setSalesorderid(com.microsoft.schemas.crm._2006.webservices.Lookup salesorderid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SALESORDERID$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SALESORDERID$62);
            }
            target.set(salesorderid);
        }
    }
    
    /**
     * Appends and returns a new empty "salesorderid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewSalesorderid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SALESORDERID$62);
            return target;
        }
    }
    
    /**
     * Unsets the "salesorderid" element
     */
    public void unsetSalesorderid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESORDERID$62, 0);
        }
    }
    
    /**
     * Gets the "salesorderispricelocked" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getSalesorderispricelocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SALESORDERISPRICELOCKED$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "salesorderispricelocked" element
     */
    public boolean isSetSalesorderispricelocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESORDERISPRICELOCKED$64) != 0;
        }
    }
    
    /**
     * Sets the "salesorderispricelocked" element
     */
    public void setSalesorderispricelocked(com.microsoft.schemas.crm._2006.webservices.CrmBoolean salesorderispricelocked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SALESORDERISPRICELOCKED$64, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SALESORDERISPRICELOCKED$64);
            }
            target.set(salesorderispricelocked);
        }
    }
    
    /**
     * Appends and returns a new empty "salesorderispricelocked" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewSalesorderispricelocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SALESORDERISPRICELOCKED$64);
            return target;
        }
    }
    
    /**
     * Unsets the "salesorderispricelocked" element
     */
    public void unsetSalesorderispricelocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESORDERISPRICELOCKED$64, 0);
        }
    }
    
    /**
     * Gets the "salesorderstatecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getSalesorderstatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SALESORDERSTATECODE$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "salesorderstatecode" element
     */
    public boolean isSetSalesorderstatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESORDERSTATECODE$66) != 0;
        }
    }
    
    /**
     * Sets the "salesorderstatecode" element
     */
    public void setSalesorderstatecode(com.microsoft.schemas.crm._2006.webservices.Picklist salesorderstatecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SALESORDERSTATECODE$66, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SALESORDERSTATECODE$66);
            }
            target.set(salesorderstatecode);
        }
    }
    
    /**
     * Appends and returns a new empty "salesorderstatecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewSalesorderstatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SALESORDERSTATECODE$66);
            return target;
        }
    }
    
    /**
     * Unsets the "salesorderstatecode" element
     */
    public void unsetSalesorderstatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESORDERSTATECODE$66, 0);
        }
    }
    
    /**
     * Gets the "salesrepid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getSalesrepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SALESREPID$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "salesrepid" element
     */
    public boolean isSetSalesrepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESREPID$68) != 0;
        }
    }
    
    /**
     * Sets the "salesrepid" element
     */
    public void setSalesrepid(com.microsoft.schemas.crm._2006.webservices.Lookup salesrepid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SALESREPID$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SALESREPID$68);
            }
            target.set(salesrepid);
        }
    }
    
    /**
     * Appends and returns a new empty "salesrepid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewSalesrepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SALESREPID$68);
            return target;
        }
    }
    
    /**
     * Unsets the "salesrepid" element
     */
    public void unsetSalesrepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESREPID$68, 0);
        }
    }
    
    /**
     * Gets the "shipto_addressid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getShiptoAddressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SHIPTOADDRESSID$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shipto_addressid" element
     */
    public boolean isSetShiptoAddressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOADDRESSID$70) != 0;
        }
    }
    
    /**
     * Sets the "shipto_addressid" element
     */
    public void setShiptoAddressid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier shiptoAddressid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SHIPTOADDRESSID$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SHIPTOADDRESSID$70);
            }
            target.set(shiptoAddressid);
        }
    }
    
    /**
     * Appends and returns a new empty "shipto_addressid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewShiptoAddressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SHIPTOADDRESSID$70);
            return target;
        }
    }
    
    /**
     * Unsets the "shipto_addressid" element
     */
    public void unsetShiptoAddressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOADDRESSID$70, 0);
        }
    }
    
    /**
     * Gets the "shipto_city" element
     */
    public java.lang.String getShiptoCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCITY$72, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_city" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCITY$72, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_city" element
     */
    public boolean isSetShiptoCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOCITY$72) != 0;
        }
    }
    
    /**
     * Sets the "shipto_city" element
     */
    public void setShiptoCity(java.lang.String shiptoCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCITY$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOCITY$72);
            }
            target.setStringValue(shiptoCity);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_city" element
     */
    public void xsetShiptoCity(org.apache.xmlbeans.XmlString shiptoCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCITY$72, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCITY$72);
            }
            target.set(shiptoCity);
        }
    }
    
    /**
     * Unsets the "shipto_city" element
     */
    public void unsetShiptoCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOCITY$72, 0);
        }
    }
    
    /**
     * Gets the "shipto_contactname" element
     */
    public java.lang.String getShiptoContactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCONTACTNAME$74, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_contactname" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoContactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCONTACTNAME$74, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_contactname" element
     */
    public boolean isSetShiptoContactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOCONTACTNAME$74) != 0;
        }
    }
    
    /**
     * Sets the "shipto_contactname" element
     */
    public void setShiptoContactname(java.lang.String shiptoContactname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCONTACTNAME$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOCONTACTNAME$74);
            }
            target.setStringValue(shiptoContactname);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_contactname" element
     */
    public void xsetShiptoContactname(org.apache.xmlbeans.XmlString shiptoContactname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCONTACTNAME$74, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCONTACTNAME$74);
            }
            target.set(shiptoContactname);
        }
    }
    
    /**
     * Unsets the "shipto_contactname" element
     */
    public void unsetShiptoContactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOCONTACTNAME$74, 0);
        }
    }
    
    /**
     * Gets the "shipto_country" element
     */
    public java.lang.String getShiptoCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCOUNTRY$76, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_country" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTRY$76, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_country" element
     */
    public boolean isSetShiptoCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOCOUNTRY$76) != 0;
        }
    }
    
    /**
     * Sets the "shipto_country" element
     */
    public void setShiptoCountry(java.lang.String shiptoCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCOUNTRY$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOCOUNTRY$76);
            }
            target.setStringValue(shiptoCountry);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_country" element
     */
    public void xsetShiptoCountry(org.apache.xmlbeans.XmlString shiptoCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTRY$76, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCOUNTRY$76);
            }
            target.set(shiptoCountry);
        }
    }
    
    /**
     * Unsets the "shipto_country" element
     */
    public void unsetShiptoCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOCOUNTRY$76, 0);
        }
    }
    
    /**
     * Gets the "shipto_fax" element
     */
    public java.lang.String getShiptoFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOFAX$78, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_fax" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOFAX$78, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_fax" element
     */
    public boolean isSetShiptoFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOFAX$78) != 0;
        }
    }
    
    /**
     * Sets the "shipto_fax" element
     */
    public void setShiptoFax(java.lang.String shiptoFax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOFAX$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOFAX$78);
            }
            target.setStringValue(shiptoFax);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_fax" element
     */
    public void xsetShiptoFax(org.apache.xmlbeans.XmlString shiptoFax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOFAX$78, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOFAX$78);
            }
            target.set(shiptoFax);
        }
    }
    
    /**
     * Unsets the "shipto_fax" element
     */
    public void unsetShiptoFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOFAX$78, 0);
        }
    }
    
    /**
     * Gets the "shipto_freighttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getShiptoFreighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPTOFREIGHTTERMSCODE$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shipto_freighttermscode" element
     */
    public boolean isSetShiptoFreighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOFREIGHTTERMSCODE$80) != 0;
        }
    }
    
    /**
     * Sets the "shipto_freighttermscode" element
     */
    public void setShiptoFreighttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist shiptoFreighttermscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPTOFREIGHTTERMSCODE$80, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPTOFREIGHTTERMSCODE$80);
            }
            target.set(shiptoFreighttermscode);
        }
    }
    
    /**
     * Appends and returns a new empty "shipto_freighttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewShiptoFreighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPTOFREIGHTTERMSCODE$80);
            return target;
        }
    }
    
    /**
     * Unsets the "shipto_freighttermscode" element
     */
    public void unsetShiptoFreighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOFREIGHTTERMSCODE$80, 0);
        }
    }
    
    /**
     * Gets the "shipto_line1" element
     */
    public java.lang.String getShiptoLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE1$82, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_line1" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE1$82, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_line1" element
     */
    public boolean isSetShiptoLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOLINE1$82) != 0;
        }
    }
    
    /**
     * Sets the "shipto_line1" element
     */
    public void setShiptoLine1(java.lang.String shiptoLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE1$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOLINE1$82);
            }
            target.setStringValue(shiptoLine1);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_line1" element
     */
    public void xsetShiptoLine1(org.apache.xmlbeans.XmlString shiptoLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE1$82, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOLINE1$82);
            }
            target.set(shiptoLine1);
        }
    }
    
    /**
     * Unsets the "shipto_line1" element
     */
    public void unsetShiptoLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOLINE1$82, 0);
        }
    }
    
    /**
     * Gets the "shipto_line2" element
     */
    public java.lang.String getShiptoLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE2$84, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_line2" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE2$84, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_line2" element
     */
    public boolean isSetShiptoLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOLINE2$84) != 0;
        }
    }
    
    /**
     * Sets the "shipto_line2" element
     */
    public void setShiptoLine2(java.lang.String shiptoLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE2$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOLINE2$84);
            }
            target.setStringValue(shiptoLine2);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_line2" element
     */
    public void xsetShiptoLine2(org.apache.xmlbeans.XmlString shiptoLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE2$84, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOLINE2$84);
            }
            target.set(shiptoLine2);
        }
    }
    
    /**
     * Unsets the "shipto_line2" element
     */
    public void unsetShiptoLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOLINE2$84, 0);
        }
    }
    
    /**
     * Gets the "shipto_line3" element
     */
    public java.lang.String getShiptoLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE3$86, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_line3" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE3$86, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_line3" element
     */
    public boolean isSetShiptoLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOLINE3$86) != 0;
        }
    }
    
    /**
     * Sets the "shipto_line3" element
     */
    public void setShiptoLine3(java.lang.String shiptoLine3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE3$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOLINE3$86);
            }
            target.setStringValue(shiptoLine3);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_line3" element
     */
    public void xsetShiptoLine3(org.apache.xmlbeans.XmlString shiptoLine3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE3$86, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOLINE3$86);
            }
            target.set(shiptoLine3);
        }
    }
    
    /**
     * Unsets the "shipto_line3" element
     */
    public void unsetShiptoLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOLINE3$86, 0);
        }
    }
    
    /**
     * Gets the "shipto_name" element
     */
    public java.lang.String getShiptoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTONAME$88, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_name" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTONAME$88, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_name" element
     */
    public boolean isSetShiptoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTONAME$88) != 0;
        }
    }
    
    /**
     * Sets the "shipto_name" element
     */
    public void setShiptoName(java.lang.String shiptoName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTONAME$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTONAME$88);
            }
            target.setStringValue(shiptoName);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_name" element
     */
    public void xsetShiptoName(org.apache.xmlbeans.XmlString shiptoName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTONAME$88, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTONAME$88);
            }
            target.set(shiptoName);
        }
    }
    
    /**
     * Unsets the "shipto_name" element
     */
    public void unsetShiptoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTONAME$88, 0);
        }
    }
    
    /**
     * Gets the "shipto_postalcode" element
     */
    public java.lang.String getShiptoPostalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOPOSTALCODE$90, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_postalcode" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoPostalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOPOSTALCODE$90, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_postalcode" element
     */
    public boolean isSetShiptoPostalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOPOSTALCODE$90) != 0;
        }
    }
    
    /**
     * Sets the "shipto_postalcode" element
     */
    public void setShiptoPostalcode(java.lang.String shiptoPostalcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOPOSTALCODE$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOPOSTALCODE$90);
            }
            target.setStringValue(shiptoPostalcode);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_postalcode" element
     */
    public void xsetShiptoPostalcode(org.apache.xmlbeans.XmlString shiptoPostalcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOPOSTALCODE$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOPOSTALCODE$90);
            }
            target.set(shiptoPostalcode);
        }
    }
    
    /**
     * Unsets the "shipto_postalcode" element
     */
    public void unsetShiptoPostalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOPOSTALCODE$90, 0);
        }
    }
    
    /**
     * Gets the "shipto_stateorprovince" element
     */
    public java.lang.String getShiptoStateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOSTATEORPROVINCE$92, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_stateorprovince" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoStateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOSTATEORPROVINCE$92, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_stateorprovince" element
     */
    public boolean isSetShiptoStateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOSTATEORPROVINCE$92) != 0;
        }
    }
    
    /**
     * Sets the "shipto_stateorprovince" element
     */
    public void setShiptoStateorprovince(java.lang.String shiptoStateorprovince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOSTATEORPROVINCE$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOSTATEORPROVINCE$92);
            }
            target.setStringValue(shiptoStateorprovince);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_stateorprovince" element
     */
    public void xsetShiptoStateorprovince(org.apache.xmlbeans.XmlString shiptoStateorprovince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOSTATEORPROVINCE$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOSTATEORPROVINCE$92);
            }
            target.set(shiptoStateorprovince);
        }
    }
    
    /**
     * Unsets the "shipto_stateorprovince" element
     */
    public void unsetShiptoStateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOSTATEORPROVINCE$92, 0);
        }
    }
    
    /**
     * Gets the "shipto_telephone" element
     */
    public java.lang.String getShiptoTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOTELEPHONE$94, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shipto_telephone" element
     */
    public org.apache.xmlbeans.XmlString xgetShiptoTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOTELEPHONE$94, 0);
            return target;
        }
    }
    
    /**
     * True if has "shipto_telephone" element
     */
    public boolean isSetShiptoTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOTELEPHONE$94) != 0;
        }
    }
    
    /**
     * Sets the "shipto_telephone" element
     */
    public void setShiptoTelephone(java.lang.String shiptoTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOTELEPHONE$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOTELEPHONE$94);
            }
            target.setStringValue(shiptoTelephone);
        }
    }
    
    /**
     * Sets (as xml) the "shipto_telephone" element
     */
    public void xsetShiptoTelephone(org.apache.xmlbeans.XmlString shiptoTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOTELEPHONE$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOTELEPHONE$94);
            }
            target.set(shiptoTelephone);
        }
    }
    
    /**
     * Unsets the "shipto_telephone" element
     */
    public void unsetShiptoTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOTELEPHONE$94, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TAX$96, 0);
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
            return get_store().count_elements(TAX$96) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TAX$96, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TAX$96);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TAX$96);
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
            get_store().remove_element(TAX$96, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TAXBASE$98, 0);
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
            return get_store().count_elements(TAXBASE$98) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TAXBASE$98, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TAXBASE$98);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TAXBASE$98);
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
            get_store().remove_element(TAXBASE$98, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$100, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$100) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$100, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$100);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$100);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$100, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$102, 0);
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
            return get_store().count_elements(TRANSACTIONCURRENCYID$102) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$102, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$102);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$102);
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
            get_store().remove_element(TRANSACTIONCURRENCYID$102, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMID$104, 0);
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
            return get_store().count_elements(UOMID$104) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMID$104, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMID$104);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMID$104);
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
            get_store().remove_element(UOMID$104, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$106, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$106) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$106, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$106);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$106);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$106, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(VOLUMEDISCOUNTAMOUNT$108, 0);
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
            return get_store().count_elements(VOLUMEDISCOUNTAMOUNT$108) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(VOLUMEDISCOUNTAMOUNT$108, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(VOLUMEDISCOUNTAMOUNT$108);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(VOLUMEDISCOUNTAMOUNT$108);
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
            get_store().remove_element(VOLUMEDISCOUNTAMOUNT$108, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(VOLUMEDISCOUNTAMOUNTBASE$110, 0);
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
            return get_store().count_elements(VOLUMEDISCOUNTAMOUNTBASE$110) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(VOLUMEDISCOUNTAMOUNTBASE$110, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(VOLUMEDISCOUNTAMOUNTBASE$110);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(VOLUMEDISCOUNTAMOUNTBASE$110);
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
            get_store().remove_element(VOLUMEDISCOUNTAMOUNTBASE$110, 0);
        }
    }
    
    /**
     * Gets the "willcall" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getWillcall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(WILLCALL$112, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "willcall" element
     */
    public boolean isSetWillcall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WILLCALL$112) != 0;
        }
    }
    
    /**
     * Sets the "willcall" element
     */
    public void setWillcall(com.microsoft.schemas.crm._2006.webservices.CrmBoolean willcall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(WILLCALL$112, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(WILLCALL$112);
            }
            target.set(willcall);
        }
    }
    
    /**
     * Appends and returns a new empty "willcall" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewWillcall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(WILLCALL$112);
            return target;
        }
    }
    
    /**
     * Unsets the "willcall" element
     */
    public void unsetWillcall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WILLCALL$112, 0);
        }
    }
}
