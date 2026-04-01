/*
 * XML Type:  productpricelevel
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Productpricelevel
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML productpricelevel(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ProductpricelevelImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Productpricelevel
{
    
    public ProductpricelevelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMOUNT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "amount");
    private static final javax.xml.namespace.QName AMOUNTBASE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "amount_base");
    private static final javax.xml.namespace.QName CREATEDBY$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DISCOUNTTYPEID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "discounttypeid");
    private static final javax.xml.namespace.QName EXCHANGERATE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangerate");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName MODIFIEDBY$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName ORGANIZATIONID$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName PERCENTAGE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "percentage");
    private static final javax.xml.namespace.QName PRICELEVELID$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricelevelid");
    private static final javax.xml.namespace.QName PRICINGMETHODCODE$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricingmethodcode");
    private static final javax.xml.namespace.QName PRODUCTID$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productid");
    private static final javax.xml.namespace.QName PRODUCTPRICELEVELID$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "productpricelevelid");
    private static final javax.xml.namespace.QName QUANTITYSELLINGCODE$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "quantitysellingcode");
    private static final javax.xml.namespace.QName ROUNDINGOPTIONAMOUNT$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "roundingoptionamount");
    private static final javax.xml.namespace.QName ROUNDINGOPTIONAMOUNTBASE$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "roundingoptionamount_base");
    private static final javax.xml.namespace.QName ROUNDINGOPTIONCODE$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "roundingoptioncode");
    private static final javax.xml.namespace.QName ROUNDINGPOLICYCODE$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "roundingpolicycode");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UOMID$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "uomid");
    private static final javax.xml.namespace.QName UOMSCHEDULEID$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "uomscheduleid");
    
    
    /**
     * Gets the "amount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "amount" element
     */
    public boolean isSetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNT$0) != 0;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(com.microsoft.schemas.crm._2006.webservices.CrmMoney amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AMOUNT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AMOUNT$0);
            }
            target.set(amount);
        }
    }
    
    /**
     * Appends and returns a new empty "amount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AMOUNT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "amount" element
     */
    public void unsetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNT$0, 0);
        }
    }
    
    /**
     * Gets the "amount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getAmountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AMOUNTBASE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "amount_base" element
     */
    public boolean isSetAmountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNTBASE$2) != 0;
        }
    }
    
    /**
     * Sets the "amount_base" element
     */
    public void setAmountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney amountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(AMOUNTBASE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AMOUNTBASE$2);
            }
            target.set(amountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "amount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewAmountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(AMOUNTBASE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "amount_base" element
     */
    public void unsetAmountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNTBASE$2, 0);
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
     * Gets the "discounttypeid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getDiscounttypeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(DISCOUNTTYPEID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "discounttypeid" element
     */
    public boolean isSetDiscounttypeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTTYPEID$8) != 0;
        }
    }
    
    /**
     * Sets the "discounttypeid" element
     */
    public void setDiscounttypeid(com.microsoft.schemas.crm._2006.webservices.Lookup discounttypeid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(DISCOUNTTYPEID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(DISCOUNTTYPEID$8);
            }
            target.set(discounttypeid);
        }
    }
    
    /**
     * Appends and returns a new empty "discounttypeid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewDiscounttypeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(DISCOUNTTYPEID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "discounttypeid" element
     */
    public void unsetDiscounttypeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTTYPEID$8, 0);
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
     * Gets the "importsequencenumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getImportsequencenumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$12, 0);
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
            return get_store().count_elements(IMPORTSEQUENCENUMBER$12) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$12);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$12);
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
            get_store().remove_element(IMPORTSEQUENCENUMBER$12, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$14, 0);
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
            return get_store().count_elements(MODIFIEDBY$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$14);
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
            get_store().remove_element(MODIFIEDBY$14, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$16, 0);
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
            return get_store().count_elements(MODIFIEDON$16) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$16);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$16);
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
            get_store().remove_element(MODIFIEDON$16, 0);
        }
    }
    
    /**
     * Gets the "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(ORGANIZATIONID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organizationid" element
     */
    public boolean isSetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONID$18) != 0;
        }
    }
    
    /**
     * Sets the "organizationid" element
     */
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(ORGANIZATIONID$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(ORGANIZATIONID$18);
            }
            target.set(organizationid);
        }
    }
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(ORGANIZATIONID$18);
            return target;
        }
    }
    
    /**
     * Unsets the "organizationid" element
     */
    public void unsetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONID$18, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$20, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$20) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$20);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$20);
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
            get_store().remove_element(OVERRIDDENCREATEDON$20, 0);
        }
    }
    
    /**
     * Gets the "percentage" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal getPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(PERCENTAGE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "percentage" element
     */
    public boolean isSetPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERCENTAGE$22) != 0;
        }
    }
    
    /**
     * Sets the "percentage" element
     */
    public void setPercentage(com.microsoft.schemas.crm._2006.webservices.CrmDecimal percentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(PERCENTAGE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(PERCENTAGE$22);
            }
            target.set(percentage);
        }
    }
    
    /**
     * Appends and returns a new empty "percentage" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDecimal addNewPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDecimal target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(PERCENTAGE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "percentage" element
     */
    public void unsetPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERCENTAGE$22, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRICELEVELID$24, 0);
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
            return get_store().count_elements(PRICELEVELID$24) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRICELEVELID$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRICELEVELID$24);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRICELEVELID$24);
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
            get_store().remove_element(PRICELEVELID$24, 0);
        }
    }
    
    /**
     * Gets the "pricingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPricingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGMETHODCODE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pricingmethodcode" element
     */
    public boolean isSetPricingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRICINGMETHODCODE$26) != 0;
        }
    }
    
    /**
     * Sets the "pricingmethodcode" element
     */
    public void setPricingmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist pricingmethodcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGMETHODCODE$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGMETHODCODE$26);
            }
            target.set(pricingmethodcode);
        }
    }
    
    /**
     * Appends and returns a new empty "pricingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPricingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGMETHODCODE$26);
            return target;
        }
    }
    
    /**
     * Unsets the "pricingmethodcode" element
     */
    public void unsetPricingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRICINGMETHODCODE$26, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRODUCTID$28, 0);
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
            return get_store().count_elements(PRODUCTID$28) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRODUCTID$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRODUCTID$28);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRODUCTID$28);
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
            get_store().remove_element(PRODUCTID$28, 0);
        }
    }
    
    /**
     * Gets the "productpricelevelid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getProductpricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(PRODUCTPRICELEVELID$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "productpricelevelid" element
     */
    public boolean isSetProductpricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTPRICELEVELID$30) != 0;
        }
    }
    
    /**
     * Sets the "productpricelevelid" element
     */
    public void setProductpricelevelid(com.microsoft.schemas.crm._2006.webservices.Key productpricelevelid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(PRODUCTPRICELEVELID$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(PRODUCTPRICELEVELID$30);
            }
            target.set(productpricelevelid);
        }
    }
    
    /**
     * Appends and returns a new empty "productpricelevelid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewProductpricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(PRODUCTPRICELEVELID$30);
            return target;
        }
    }
    
    /**
     * Unsets the "productpricelevelid" element
     */
    public void unsetProductpricelevelid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTPRICELEVELID$30, 0);
        }
    }
    
    /**
     * Gets the "quantitysellingcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getQuantitysellingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(QUANTITYSELLINGCODE$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantitysellingcode" element
     */
    public boolean isSetQuantitysellingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYSELLINGCODE$32) != 0;
        }
    }
    
    /**
     * Sets the "quantitysellingcode" element
     */
    public void setQuantitysellingcode(com.microsoft.schemas.crm._2006.webservices.Picklist quantitysellingcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(QUANTITYSELLINGCODE$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(QUANTITYSELLINGCODE$32);
            }
            target.set(quantitysellingcode);
        }
    }
    
    /**
     * Appends and returns a new empty "quantitysellingcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewQuantitysellingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(QUANTITYSELLINGCODE$32);
            return target;
        }
    }
    
    /**
     * Unsets the "quantitysellingcode" element
     */
    public void unsetQuantitysellingcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYSELLINGCODE$32, 0);
        }
    }
    
    /**
     * Gets the "roundingoptionamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getRoundingoptionamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ROUNDINGOPTIONAMOUNT$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "roundingoptionamount" element
     */
    public boolean isSetRoundingoptionamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUNDINGOPTIONAMOUNT$34) != 0;
        }
    }
    
    /**
     * Sets the "roundingoptionamount" element
     */
    public void setRoundingoptionamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney roundingoptionamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ROUNDINGOPTIONAMOUNT$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ROUNDINGOPTIONAMOUNT$34);
            }
            target.set(roundingoptionamount);
        }
    }
    
    /**
     * Appends and returns a new empty "roundingoptionamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRoundingoptionamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ROUNDINGOPTIONAMOUNT$34);
            return target;
        }
    }
    
    /**
     * Unsets the "roundingoptionamount" element
     */
    public void unsetRoundingoptionamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUNDINGOPTIONAMOUNT$34, 0);
        }
    }
    
    /**
     * Gets the "roundingoptionamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getRoundingoptionamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ROUNDINGOPTIONAMOUNTBASE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "roundingoptionamount_base" element
     */
    public boolean isSetRoundingoptionamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUNDINGOPTIONAMOUNTBASE$36) != 0;
        }
    }
    
    /**
     * Sets the "roundingoptionamount_base" element
     */
    public void setRoundingoptionamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney roundingoptionamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(ROUNDINGOPTIONAMOUNTBASE$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ROUNDINGOPTIONAMOUNTBASE$36);
            }
            target.set(roundingoptionamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "roundingoptionamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewRoundingoptionamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(ROUNDINGOPTIONAMOUNTBASE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "roundingoptionamount_base" element
     */
    public void unsetRoundingoptionamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUNDINGOPTIONAMOUNTBASE$36, 0);
        }
    }
    
    /**
     * Gets the "roundingoptioncode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getRoundingoptioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ROUNDINGOPTIONCODE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "roundingoptioncode" element
     */
    public boolean isSetRoundingoptioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUNDINGOPTIONCODE$38) != 0;
        }
    }
    
    /**
     * Sets the "roundingoptioncode" element
     */
    public void setRoundingoptioncode(com.microsoft.schemas.crm._2006.webservices.Picklist roundingoptioncode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ROUNDINGOPTIONCODE$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ROUNDINGOPTIONCODE$38);
            }
            target.set(roundingoptioncode);
        }
    }
    
    /**
     * Appends and returns a new empty "roundingoptioncode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewRoundingoptioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ROUNDINGOPTIONCODE$38);
            return target;
        }
    }
    
    /**
     * Unsets the "roundingoptioncode" element
     */
    public void unsetRoundingoptioncode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUNDINGOPTIONCODE$38, 0);
        }
    }
    
    /**
     * Gets the "roundingpolicycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getRoundingpolicycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ROUNDINGPOLICYCODE$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "roundingpolicycode" element
     */
    public boolean isSetRoundingpolicycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUNDINGPOLICYCODE$40) != 0;
        }
    }
    
    /**
     * Sets the "roundingpolicycode" element
     */
    public void setRoundingpolicycode(com.microsoft.schemas.crm._2006.webservices.Picklist roundingpolicycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ROUNDINGPOLICYCODE$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ROUNDINGPOLICYCODE$40);
            }
            target.set(roundingpolicycode);
        }
    }
    
    /**
     * Appends and returns a new empty "roundingpolicycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewRoundingpolicycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ROUNDINGPOLICYCODE$40);
            return target;
        }
    }
    
    /**
     * Unsets the "roundingpolicycode" element
     */
    public void unsetRoundingpolicycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUNDINGPOLICYCODE$40, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$42, 0);
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
            return get_store().count_elements(TRANSACTIONCURRENCYID$42) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$42);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$42);
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
            get_store().remove_element(TRANSACTIONCURRENCYID$42, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMID$44, 0);
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
            return get_store().count_elements(UOMID$44) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMID$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMID$44);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMID$44);
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
            get_store().remove_element(UOMID$44, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMSCHEDULEID$46, 0);
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
            return get_store().count_elements(UOMSCHEDULEID$46) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(UOMSCHEDULEID$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMSCHEDULEID$46);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(UOMSCHEDULEID$46);
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
            get_store().remove_element(UOMSCHEDULEID$46, 0);
        }
    }
}
