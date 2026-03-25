/*
 * XML Type:  salesorder
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Salesorder
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML salesorder(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SalesorderImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Salesorder
{
    
    public SalesorderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILLTOADDRESSID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_addressid");
    private static final javax.xml.namespace.QName BILLTOCITY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_city");
    private static final javax.xml.namespace.QName BILLTOCONTACTNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_contactname");
    private static final javax.xml.namespace.QName BILLTOCOUNTRY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_country");
    private static final javax.xml.namespace.QName BILLTOFAX$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_fax");
    private static final javax.xml.namespace.QName BILLTOLINE1$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_line1");
    private static final javax.xml.namespace.QName BILLTOLINE2$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_line2");
    private static final javax.xml.namespace.QName BILLTOLINE3$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_line3");
    private static final javax.xml.namespace.QName BILLTONAME$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_name");
    private static final javax.xml.namespace.QName BILLTOPOSTALCODE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_postalcode");
    private static final javax.xml.namespace.QName BILLTOSTATEORPROVINCE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_stateorprovince");
    private static final javax.xml.namespace.QName BILLTOTELEPHONE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billto_telephone");
    private static final javax.xml.namespace.QName CAMPAIGNID$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "campaignid");
    private static final javax.xml.namespace.QName CREATEDBY$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMERID$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customerid");
    private static final javax.xml.namespace.QName DATEFULFILLED$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "datefulfilled");
    private static final javax.xml.namespace.QName DESCRIPTION$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName DISCOUNTAMOUNT$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "discountamount");
    private static final javax.xml.namespace.QName DISCOUNTAMOUNTBASE$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "discountamount_base");
    private static final javax.xml.namespace.QName DISCOUNTPERCENTAGE$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "discountpercentage");
    private static final javax.xml.namespace.QName EXCHANGERATE$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangerate");
    private static final javax.xml.namespace.QName FREIGHTAMOUNT$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "freightamount");
    private static final javax.xml.namespace.QName FREIGHTAMOUNTBASE$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "freightamount_base");
    private static final javax.xml.namespace.QName FREIGHTTERMSCODE$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "freighttermscode");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName ISPRICELOCKED$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ispricelocked");
    private static final javax.xml.namespace.QName LASTBACKOFFICESUBMIT$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lastbackofficesubmit");
    private static final javax.xml.namespace.QName MODIFIEDBY$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName OPPORTUNITYID$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "opportunityid");
    private static final javax.xml.namespace.QName ORDERNUMBER$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ordernumber");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName OWNERID$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownerid");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName PAYMENTTERMSCODE$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "paymenttermscode");
    private static final javax.xml.namespace.QName PRICELEVELID$74 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricelevelid");
    private static final javax.xml.namespace.QName PRICINGERRORCODE$76 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pricingerrorcode");
    private static final javax.xml.namespace.QName PRIORITYCODE$78 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "prioritycode");
    private static final javax.xml.namespace.QName QUOTEID$80 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "quoteid");
    private static final javax.xml.namespace.QName REQUESTDELIVERYBY$82 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "requestdeliveryby");
    private static final javax.xml.namespace.QName SALESORDERID$84 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salesorderid");
    private static final javax.xml.namespace.QName SHIPPINGMETHODCODE$86 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shippingmethodcode");
    private static final javax.xml.namespace.QName SHIPTOADDRESSID$88 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_addressid");
    private static final javax.xml.namespace.QName SHIPTOCITY$90 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_city");
    private static final javax.xml.namespace.QName SHIPTOCONTACTNAME$92 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_contactname");
    private static final javax.xml.namespace.QName SHIPTOCOUNTRY$94 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_country");
    private static final javax.xml.namespace.QName SHIPTOFAX$96 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_fax");
    private static final javax.xml.namespace.QName SHIPTOFREIGHTTERMSCODE$98 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_freighttermscode");
    private static final javax.xml.namespace.QName SHIPTOLINE1$100 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_line1");
    private static final javax.xml.namespace.QName SHIPTOLINE2$102 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_line2");
    private static final javax.xml.namespace.QName SHIPTOLINE3$104 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_line3");
    private static final javax.xml.namespace.QName SHIPTONAME$106 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_name");
    private static final javax.xml.namespace.QName SHIPTOPOSTALCODE$108 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_postalcode");
    private static final javax.xml.namespace.QName SHIPTOSTATEORPROVINCE$110 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_stateorprovince");
    private static final javax.xml.namespace.QName SHIPTOTELEPHONE$112 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "shipto_telephone");
    private static final javax.xml.namespace.QName STATECODE$114 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$116 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName SUBMITDATE$118 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "submitdate");
    private static final javax.xml.namespace.QName SUBMITSTATUS$120 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "submitstatus");
    private static final javax.xml.namespace.QName SUBMITSTATUSDESCRIPTION$122 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "submitstatusdescription");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$124 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TOTALAMOUNT$126 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalamount");
    private static final javax.xml.namespace.QName TOTALAMOUNTBASE$128 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalamount_base");
    private static final javax.xml.namespace.QName TOTALAMOUNTLESSFREIGHT$130 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalamountlessfreight");
    private static final javax.xml.namespace.QName TOTALAMOUNTLESSFREIGHTBASE$132 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalamountlessfreight_base");
    private static final javax.xml.namespace.QName TOTALDISCOUNTAMOUNT$134 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totaldiscountamount");
    private static final javax.xml.namespace.QName TOTALDISCOUNTAMOUNTBASE$136 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totaldiscountamount_base");
    private static final javax.xml.namespace.QName TOTALLINEITEMAMOUNT$138 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totallineitemamount");
    private static final javax.xml.namespace.QName TOTALLINEITEMAMOUNTBASE$140 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totallineitemamount_base");
    private static final javax.xml.namespace.QName TOTALLINEITEMDISCOUNTAMOUNT$142 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totallineitemdiscountamount");
    private static final javax.xml.namespace.QName TOTALLINEITEMDISCOUNTAMOUNTBASE$144 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totallineitemdiscountamount_base");
    private static final javax.xml.namespace.QName TOTALTAX$146 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totaltax");
    private static final javax.xml.namespace.QName TOTALTAXBASE$148 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totaltax_base");
    private static final javax.xml.namespace.QName TRANSACTIONCURRENCYID$150 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transactioncurrencyid");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$152 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    private static final javax.xml.namespace.QName WILLCALL$154 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "willcall");
    
    
    /**
     * Gets the "billto_addressid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getBilltoAddressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(BILLTOADDRESSID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "billto_addressid" element
     */
    public boolean isSetBilltoAddressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOADDRESSID$0) != 0;
        }
    }
    
    /**
     * Sets the "billto_addressid" element
     */
    public void setBilltoAddressid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier billtoAddressid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(BILLTOADDRESSID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(BILLTOADDRESSID$0);
            }
            target.set(billtoAddressid);
        }
    }
    
    /**
     * Appends and returns a new empty "billto_addressid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewBilltoAddressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(BILLTOADDRESSID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "billto_addressid" element
     */
    public void unsetBilltoAddressid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOADDRESSID$0, 0);
        }
    }
    
    /**
     * Gets the "billto_city" element
     */
    public java.lang.String getBilltoCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_city" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCITY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_city" element
     */
    public boolean isSetBilltoCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOCITY$2) != 0;
        }
    }
    
    /**
     * Sets the "billto_city" element
     */
    public void setBilltoCity(java.lang.String billtoCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOCITY$2);
            }
            target.setStringValue(billtoCity);
        }
    }
    
    /**
     * Sets (as xml) the "billto_city" element
     */
    public void xsetBilltoCity(org.apache.xmlbeans.XmlString billtoCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOCITY$2);
            }
            target.set(billtoCity);
        }
    }
    
    /**
     * Unsets the "billto_city" element
     */
    public void unsetBilltoCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOCITY$2, 0);
        }
    }
    
    /**
     * Gets the "billto_contactname" element
     */
    public java.lang.String getBilltoContactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCONTACTNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_contactname" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoContactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCONTACTNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_contactname" element
     */
    public boolean isSetBilltoContactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOCONTACTNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "billto_contactname" element
     */
    public void setBilltoContactname(java.lang.String billtoContactname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCONTACTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOCONTACTNAME$4);
            }
            target.setStringValue(billtoContactname);
        }
    }
    
    /**
     * Sets (as xml) the "billto_contactname" element
     */
    public void xsetBilltoContactname(org.apache.xmlbeans.XmlString billtoContactname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCONTACTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOCONTACTNAME$4);
            }
            target.set(billtoContactname);
        }
    }
    
    /**
     * Unsets the "billto_contactname" element
     */
    public void unsetBilltoContactname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOCONTACTNAME$4, 0);
        }
    }
    
    /**
     * Gets the "billto_country" element
     */
    public java.lang.String getBilltoCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_country" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_country" element
     */
    public boolean isSetBilltoCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOCOUNTRY$6) != 0;
        }
    }
    
    /**
     * Sets the "billto_country" element
     */
    public void setBilltoCountry(java.lang.String billtoCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOCOUNTRY$6);
            }
            target.setStringValue(billtoCountry);
        }
    }
    
    /**
     * Sets (as xml) the "billto_country" element
     */
    public void xsetBilltoCountry(org.apache.xmlbeans.XmlString billtoCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOCOUNTRY$6);
            }
            target.set(billtoCountry);
        }
    }
    
    /**
     * Unsets the "billto_country" element
     */
    public void unsetBilltoCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOCOUNTRY$6, 0);
        }
    }
    
    /**
     * Gets the "billto_fax" element
     */
    public java.lang.String getBilltoFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOFAX$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_fax" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOFAX$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_fax" element
     */
    public boolean isSetBilltoFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOFAX$8) != 0;
        }
    }
    
    /**
     * Sets the "billto_fax" element
     */
    public void setBilltoFax(java.lang.String billtoFax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOFAX$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOFAX$8);
            }
            target.setStringValue(billtoFax);
        }
    }
    
    /**
     * Sets (as xml) the "billto_fax" element
     */
    public void xsetBilltoFax(org.apache.xmlbeans.XmlString billtoFax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOFAX$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOFAX$8);
            }
            target.set(billtoFax);
        }
    }
    
    /**
     * Unsets the "billto_fax" element
     */
    public void unsetBilltoFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOFAX$8, 0);
        }
    }
    
    /**
     * Gets the "billto_line1" element
     */
    public java.lang.String getBilltoLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOLINE1$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_line1" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLINE1$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_line1" element
     */
    public boolean isSetBilltoLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOLINE1$10) != 0;
        }
    }
    
    /**
     * Sets the "billto_line1" element
     */
    public void setBilltoLine1(java.lang.String billtoLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOLINE1$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOLINE1$10);
            }
            target.setStringValue(billtoLine1);
        }
    }
    
    /**
     * Sets (as xml) the "billto_line1" element
     */
    public void xsetBilltoLine1(org.apache.xmlbeans.XmlString billtoLine1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLINE1$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOLINE1$10);
            }
            target.set(billtoLine1);
        }
    }
    
    /**
     * Unsets the "billto_line1" element
     */
    public void unsetBilltoLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOLINE1$10, 0);
        }
    }
    
    /**
     * Gets the "billto_line2" element
     */
    public java.lang.String getBilltoLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOLINE2$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_line2" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLINE2$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_line2" element
     */
    public boolean isSetBilltoLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOLINE2$12) != 0;
        }
    }
    
    /**
     * Sets the "billto_line2" element
     */
    public void setBilltoLine2(java.lang.String billtoLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOLINE2$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOLINE2$12);
            }
            target.setStringValue(billtoLine2);
        }
    }
    
    /**
     * Sets (as xml) the "billto_line2" element
     */
    public void xsetBilltoLine2(org.apache.xmlbeans.XmlString billtoLine2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLINE2$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOLINE2$12);
            }
            target.set(billtoLine2);
        }
    }
    
    /**
     * Unsets the "billto_line2" element
     */
    public void unsetBilltoLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOLINE2$12, 0);
        }
    }
    
    /**
     * Gets the "billto_line3" element
     */
    public java.lang.String getBilltoLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOLINE3$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_line3" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLINE3$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_line3" element
     */
    public boolean isSetBilltoLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOLINE3$14) != 0;
        }
    }
    
    /**
     * Sets the "billto_line3" element
     */
    public void setBilltoLine3(java.lang.String billtoLine3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOLINE3$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOLINE3$14);
            }
            target.setStringValue(billtoLine3);
        }
    }
    
    /**
     * Sets (as xml) the "billto_line3" element
     */
    public void xsetBilltoLine3(org.apache.xmlbeans.XmlString billtoLine3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLINE3$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOLINE3$14);
            }
            target.set(billtoLine3);
        }
    }
    
    /**
     * Unsets the "billto_line3" element
     */
    public void unsetBilltoLine3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOLINE3$14, 0);
        }
    }
    
    /**
     * Gets the "billto_name" element
     */
    public java.lang.String getBilltoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTONAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_name" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTONAME$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_name" element
     */
    public boolean isSetBilltoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTONAME$16) != 0;
        }
    }
    
    /**
     * Sets the "billto_name" element
     */
    public void setBilltoName(java.lang.String billtoName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTONAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTONAME$16);
            }
            target.setStringValue(billtoName);
        }
    }
    
    /**
     * Sets (as xml) the "billto_name" element
     */
    public void xsetBilltoName(org.apache.xmlbeans.XmlString billtoName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTONAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTONAME$16);
            }
            target.set(billtoName);
        }
    }
    
    /**
     * Unsets the "billto_name" element
     */
    public void unsetBilltoName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTONAME$16, 0);
        }
    }
    
    /**
     * Gets the "billto_postalcode" element
     */
    public java.lang.String getBilltoPostalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOPOSTALCODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_postalcode" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoPostalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOPOSTALCODE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_postalcode" element
     */
    public boolean isSetBilltoPostalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOPOSTALCODE$18) != 0;
        }
    }
    
    /**
     * Sets the "billto_postalcode" element
     */
    public void setBilltoPostalcode(java.lang.String billtoPostalcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOPOSTALCODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOPOSTALCODE$18);
            }
            target.setStringValue(billtoPostalcode);
        }
    }
    
    /**
     * Sets (as xml) the "billto_postalcode" element
     */
    public void xsetBilltoPostalcode(org.apache.xmlbeans.XmlString billtoPostalcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOPOSTALCODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOPOSTALCODE$18);
            }
            target.set(billtoPostalcode);
        }
    }
    
    /**
     * Unsets the "billto_postalcode" element
     */
    public void unsetBilltoPostalcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOPOSTALCODE$18, 0);
        }
    }
    
    /**
     * Gets the "billto_stateorprovince" element
     */
    public java.lang.String getBilltoStateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOSTATEORPROVINCE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_stateorprovince" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoStateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOSTATEORPROVINCE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_stateorprovince" element
     */
    public boolean isSetBilltoStateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOSTATEORPROVINCE$20) != 0;
        }
    }
    
    /**
     * Sets the "billto_stateorprovince" element
     */
    public void setBilltoStateorprovince(java.lang.String billtoStateorprovince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOSTATEORPROVINCE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOSTATEORPROVINCE$20);
            }
            target.setStringValue(billtoStateorprovince);
        }
    }
    
    /**
     * Sets (as xml) the "billto_stateorprovince" element
     */
    public void xsetBilltoStateorprovince(org.apache.xmlbeans.XmlString billtoStateorprovince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOSTATEORPROVINCE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOSTATEORPROVINCE$20);
            }
            target.set(billtoStateorprovince);
        }
    }
    
    /**
     * Unsets the "billto_stateorprovince" element
     */
    public void unsetBilltoStateorprovince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOSTATEORPROVINCE$20, 0);
        }
    }
    
    /**
     * Gets the "billto_telephone" element
     */
    public java.lang.String getBilltoTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOTELEPHONE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billto_telephone" element
     */
    public org.apache.xmlbeans.XmlString xgetBilltoTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOTELEPHONE$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "billto_telephone" element
     */
    public boolean isSetBilltoTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOTELEPHONE$22) != 0;
        }
    }
    
    /**
     * Sets the "billto_telephone" element
     */
    public void setBilltoTelephone(java.lang.String billtoTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOTELEPHONE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOTELEPHONE$22);
            }
            target.setStringValue(billtoTelephone);
        }
    }
    
    /**
     * Sets (as xml) the "billto_telephone" element
     */
    public void xsetBilltoTelephone(org.apache.xmlbeans.XmlString billtoTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOTELEPHONE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOTELEPHONE$22);
            }
            target.set(billtoTelephone);
        }
    }
    
    /**
     * Unsets the "billto_telephone" element
     */
    public void unsetBilltoTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOTELEPHONE$22, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CAMPAIGNID$24, 0);
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
            return get_store().count_elements(CAMPAIGNID$24) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CAMPAIGNID$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CAMPAIGNID$24);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CAMPAIGNID$24);
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
            get_store().remove_element(CAMPAIGNID$24, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$26, 0);
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
            return get_store().count_elements(CREATEDBY$26) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$26);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$26);
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
            get_store().remove_element(CREATEDBY$26, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$28, 0);
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
            return get_store().count_elements(CREATEDON$28) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$28);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$28);
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
            get_store().remove_element(CREATEDON$28, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$30, 0);
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
            return get_store().count_elements(CUSTOMERID$30) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().find_element_user(CUSTOMERID$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$30);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Customer)get_store().add_element_user(CUSTOMERID$30);
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
            get_store().remove_element(CUSTOMERID$30, 0);
        }
    }
    
    /**
     * Gets the "datefulfilled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getDatefulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(DATEFULFILLED$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "datefulfilled" element
     */
    public boolean isSetDatefulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEFULFILLED$32) != 0;
        }
    }
    
    /**
     * Sets the "datefulfilled" element
     */
    public void setDatefulfilled(com.microsoft.schemas.crm._2006.webservices.CrmDateTime datefulfilled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(DATEFULFILLED$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(DATEFULFILLED$32);
            }
            target.set(datefulfilled);
        }
    }
    
    /**
     * Appends and returns a new empty "datefulfilled" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewDatefulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(DATEFULFILLED$32);
            return target;
        }
    }
    
    /**
     * Unsets the "datefulfilled" element
     */
    public void unsetDatefulfilled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEFULFILLED$32, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$34, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$34, 0);
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
            return get_store().count_elements(DESCRIPTION$34) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$34);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$34);
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
            get_store().remove_element(DESCRIPTION$34, 0);
        }
    }
    
    /**
     * Gets the "discountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getDiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(DISCOUNTAMOUNT$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "discountamount" element
     */
    public boolean isSetDiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTAMOUNT$36) != 0;
        }
    }
    
    /**
     * Sets the "discountamount" element
     */
    public void setDiscountamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney discountamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(DISCOUNTAMOUNT$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(DISCOUNTAMOUNT$36);
            }
            target.set(discountamount);
        }
    }
    
    /**
     * Appends and returns a new empty "discountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewDiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(DISCOUNTAMOUNT$36);
            return target;
        }
    }
    
    /**
     * Unsets the "discountamount" element
     */
    public void unsetDiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTAMOUNT$36, 0);
        }
    }
    
    /**
     * Gets the "discountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getDiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(DISCOUNTAMOUNTBASE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "discountamount_base" element
     */
    public boolean isSetDiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTAMOUNTBASE$38) != 0;
        }
    }
    
    /**
     * Sets the "discountamount_base" element
     */
    public void setDiscountamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney discountamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(DISCOUNTAMOUNTBASE$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(DISCOUNTAMOUNTBASE$38);
            }
            target.set(discountamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "discountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewDiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(DISCOUNTAMOUNTBASE$38);
            return target;
        }
    }
    
    /**
     * Unsets the "discountamount_base" element
     */
    public void unsetDiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTAMOUNTBASE$38, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(DISCOUNTPERCENTAGE$40, 0);
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
            return get_store().count_elements(DISCOUNTPERCENTAGE$40) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(DISCOUNTPERCENTAGE$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(DISCOUNTPERCENTAGE$40);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(DISCOUNTPERCENTAGE$40);
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
            get_store().remove_element(DISCOUNTPERCENTAGE$40, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$42, 0);
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
            return get_store().count_elements(EXCHANGERATE$42) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().find_element_user(EXCHANGERATE$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$42);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDecimal)get_store().add_element_user(EXCHANGERATE$42);
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
            get_store().remove_element(EXCHANGERATE$42, 0);
        }
    }
    
    /**
     * Gets the "freightamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getFreightamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(FREIGHTAMOUNT$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "freightamount" element
     */
    public boolean isSetFreightamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREIGHTAMOUNT$44) != 0;
        }
    }
    
    /**
     * Sets the "freightamount" element
     */
    public void setFreightamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney freightamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(FREIGHTAMOUNT$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(FREIGHTAMOUNT$44);
            }
            target.set(freightamount);
        }
    }
    
    /**
     * Appends and returns a new empty "freightamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewFreightamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(FREIGHTAMOUNT$44);
            return target;
        }
    }
    
    /**
     * Unsets the "freightamount" element
     */
    public void unsetFreightamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREIGHTAMOUNT$44, 0);
        }
    }
    
    /**
     * Gets the "freightamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getFreightamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(FREIGHTAMOUNTBASE$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "freightamount_base" element
     */
    public boolean isSetFreightamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREIGHTAMOUNTBASE$46) != 0;
        }
    }
    
    /**
     * Sets the "freightamount_base" element
     */
    public void setFreightamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney freightamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(FREIGHTAMOUNTBASE$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(FREIGHTAMOUNTBASE$46);
            }
            target.set(freightamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "freightamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewFreightamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(FREIGHTAMOUNTBASE$46);
            return target;
        }
    }
    
    /**
     * Unsets the "freightamount_base" element
     */
    public void unsetFreightamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREIGHTAMOUNTBASE$46, 0);
        }
    }
    
    /**
     * Gets the "freighttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getFreighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(FREIGHTTERMSCODE$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "freighttermscode" element
     */
    public boolean isSetFreighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREIGHTTERMSCODE$48) != 0;
        }
    }
    
    /**
     * Sets the "freighttermscode" element
     */
    public void setFreighttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist freighttermscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(FREIGHTTERMSCODE$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(FREIGHTTERMSCODE$48);
            }
            target.set(freighttermscode);
        }
    }
    
    /**
     * Appends and returns a new empty "freighttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewFreighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(FREIGHTTERMSCODE$48);
            return target;
        }
    }
    
    /**
     * Unsets the "freighttermscode" element
     */
    public void unsetFreighttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREIGHTTERMSCODE$48, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$50, 0);
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
            return get_store().count_elements(IMPORTSEQUENCENUMBER$50) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$50);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$50);
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
            get_store().remove_element(IMPORTSEQUENCENUMBER$50, 0);
        }
    }
    
    /**
     * Gets the "ispricelocked" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIspricelocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRICELOCKED$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ispricelocked" element
     */
    public boolean isSetIspricelocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRICELOCKED$52) != 0;
        }
    }
    
    /**
     * Sets the "ispricelocked" element
     */
    public void setIspricelocked(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ispricelocked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRICELOCKED$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRICELOCKED$52);
            }
            target.set(ispricelocked);
        }
    }
    
    /**
     * Appends and returns a new empty "ispricelocked" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIspricelocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRICELOCKED$52);
            return target;
        }
    }
    
    /**
     * Unsets the "ispricelocked" element
     */
    public void unsetIspricelocked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRICELOCKED$52, 0);
        }
    }
    
    /**
     * Gets the "lastbackofficesubmit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getLastbackofficesubmit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTBACKOFFICESUBMIT$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lastbackofficesubmit" element
     */
    public boolean isSetLastbackofficesubmit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTBACKOFFICESUBMIT$54) != 0;
        }
    }
    
    /**
     * Sets the "lastbackofficesubmit" element
     */
    public void setLastbackofficesubmit(com.microsoft.schemas.crm._2006.webservices.CrmDateTime lastbackofficesubmit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTBACKOFFICESUBMIT$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTBACKOFFICESUBMIT$54);
            }
            target.set(lastbackofficesubmit);
        }
    }
    
    /**
     * Appends and returns a new empty "lastbackofficesubmit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewLastbackofficesubmit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTBACKOFFICESUBMIT$54);
            return target;
        }
    }
    
    /**
     * Unsets the "lastbackofficesubmit" element
     */
    public void unsetLastbackofficesubmit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTBACKOFFICESUBMIT$54, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$56, 0);
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
            return get_store().count_elements(MODIFIEDBY$56) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$56);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$56);
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
            get_store().remove_element(MODIFIEDBY$56, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$58, 0);
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
            return get_store().count_elements(MODIFIEDON$58) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$58);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$58);
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
            get_store().remove_element(MODIFIEDON$58, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$60, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$60, 0);
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
            return get_store().count_elements(NAME$60) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$60);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$60);
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
            get_store().remove_element(NAME$60, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OPPORTUNITYID$62, 0);
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
            return get_store().count_elements(OPPORTUNITYID$62) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OPPORTUNITYID$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OPPORTUNITYID$62);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OPPORTUNITYID$62);
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
            get_store().remove_element(OPPORTUNITYID$62, 0);
        }
    }
    
    /**
     * Gets the "ordernumber" element
     */
    public java.lang.String getOrdernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$64, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ordernumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOrdernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "ordernumber" element
     */
    public boolean isSetOrdernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERNUMBER$64) != 0;
        }
    }
    
    /**
     * Sets the "ordernumber" element
     */
    public void setOrdernumber(java.lang.String ordernumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$64);
            }
            target.setStringValue(ordernumber);
        }
    }
    
    /**
     * Sets (as xml) the "ordernumber" element
     */
    public void xsetOrdernumber(org.apache.xmlbeans.XmlString ordernumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$64);
            }
            target.set(ordernumber);
        }
    }
    
    /**
     * Unsets the "ordernumber" element
     */
    public void unsetOrdernumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERNUMBER$64, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$66, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$66) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$66, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$66);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$66);
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
            get_store().remove_element(OVERRIDDENCREATEDON$66, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$68, 0);
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
            return get_store().count_elements(OWNERID$68) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$68);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$68);
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
            get_store().remove_element(OWNERID$68, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$70, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$70) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$70);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$70);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$70, 0);
        }
    }
    
    /**
     * Gets the "paymenttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getPaymenttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PAYMENTTERMSCODE$72, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "paymenttermscode" element
     */
    public boolean isSetPaymenttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYMENTTERMSCODE$72) != 0;
        }
    }
    
    /**
     * Sets the "paymenttermscode" element
     */
    public void setPaymenttermscode(com.microsoft.schemas.crm._2006.webservices.Picklist paymenttermscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PAYMENTTERMSCODE$72, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PAYMENTTERMSCODE$72);
            }
            target.set(paymenttermscode);
        }
    }
    
    /**
     * Appends and returns a new empty "paymenttermscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewPaymenttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PAYMENTTERMSCODE$72);
            return target;
        }
    }
    
    /**
     * Unsets the "paymenttermscode" element
     */
    public void unsetPaymenttermscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYMENTTERMSCODE$72, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRICELEVELID$74, 0);
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
            return get_store().count_elements(PRICELEVELID$74) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PRICELEVELID$74, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRICELEVELID$74);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PRICELEVELID$74);
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
            get_store().remove_element(PRICELEVELID$74, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGERRORCODE$76, 0);
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
            return get_store().count_elements(PRICINGERRORCODE$76) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRICINGERRORCODE$76, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGERRORCODE$76);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRICINGERRORCODE$76);
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
            get_store().remove_element(PRICINGERRORCODE$76, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRIORITYCODE$78, 0);
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
            return get_store().count_elements(PRIORITYCODE$78) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PRIORITYCODE$78, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRIORITYCODE$78);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PRIORITYCODE$78);
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
            get_store().remove_element(PRIORITYCODE$78, 0);
        }
    }
    
    /**
     * Gets the "quoteid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getQuoteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(QUOTEID$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quoteid" element
     */
    public boolean isSetQuoteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUOTEID$80) != 0;
        }
    }
    
    /**
     * Sets the "quoteid" element
     */
    public void setQuoteid(com.microsoft.schemas.crm._2006.webservices.Lookup quoteid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(QUOTEID$80, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(QUOTEID$80);
            }
            target.set(quoteid);
        }
    }
    
    /**
     * Appends and returns a new empty "quoteid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewQuoteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(QUOTEID$80);
            return target;
        }
    }
    
    /**
     * Unsets the "quoteid" element
     */
    public void unsetQuoteid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUOTEID$80, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(REQUESTDELIVERYBY$82, 0);
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
            return get_store().count_elements(REQUESTDELIVERYBY$82) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(REQUESTDELIVERYBY$82, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(REQUESTDELIVERYBY$82);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(REQUESTDELIVERYBY$82);
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
            get_store().remove_element(REQUESTDELIVERYBY$82, 0);
        }
    }
    
    /**
     * Gets the "salesorderid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getSalesorderid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SALESORDERID$84, 0);
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
            return get_store().count_elements(SALESORDERID$84) != 0;
        }
    }
    
    /**
     * Sets the "salesorderid" element
     */
    public void setSalesorderid(com.microsoft.schemas.crm._2006.webservices.Key salesorderid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SALESORDERID$84, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SALESORDERID$84);
            }
            target.set(salesorderid);
        }
    }
    
    /**
     * Appends and returns a new empty "salesorderid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewSalesorderid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SALESORDERID$84);
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
            get_store().remove_element(SALESORDERID$84, 0);
        }
    }
    
    /**
     * Gets the "shippingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getShippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPPINGMETHODCODE$86, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shippingmethodcode" element
     */
    public boolean isSetShippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGMETHODCODE$86) != 0;
        }
    }
    
    /**
     * Sets the "shippingmethodcode" element
     */
    public void setShippingmethodcode(com.microsoft.schemas.crm._2006.webservices.Picklist shippingmethodcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPPINGMETHODCODE$86, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPPINGMETHODCODE$86);
            }
            target.set(shippingmethodcode);
        }
    }
    
    /**
     * Appends and returns a new empty "shippingmethodcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewShippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPPINGMETHODCODE$86);
            return target;
        }
    }
    
    /**
     * Unsets the "shippingmethodcode" element
     */
    public void unsetShippingmethodcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGMETHODCODE$86, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SHIPTOADDRESSID$88, 0);
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
            return get_store().count_elements(SHIPTOADDRESSID$88) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SHIPTOADDRESSID$88, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SHIPTOADDRESSID$88);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SHIPTOADDRESSID$88);
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
            get_store().remove_element(SHIPTOADDRESSID$88, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCITY$90, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCITY$90, 0);
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
            return get_store().count_elements(SHIPTOCITY$90) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCITY$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOCITY$90);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCITY$90, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCITY$90);
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
            get_store().remove_element(SHIPTOCITY$90, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCONTACTNAME$92, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCONTACTNAME$92, 0);
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
            return get_store().count_elements(SHIPTOCONTACTNAME$92) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCONTACTNAME$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOCONTACTNAME$92);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCONTACTNAME$92, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCONTACTNAME$92);
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
            get_store().remove_element(SHIPTOCONTACTNAME$92, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCOUNTRY$94, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTRY$94, 0);
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
            return get_store().count_elements(SHIPTOCOUNTRY$94) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCOUNTRY$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOCOUNTRY$94);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTRY$94, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCOUNTRY$94);
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
            get_store().remove_element(SHIPTOCOUNTRY$94, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOFAX$96, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOFAX$96, 0);
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
            return get_store().count_elements(SHIPTOFAX$96) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOFAX$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOFAX$96);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOFAX$96, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOFAX$96);
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
            get_store().remove_element(SHIPTOFAX$96, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPTOFREIGHTTERMSCODE$98, 0);
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
            return get_store().count_elements(SHIPTOFREIGHTTERMSCODE$98) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(SHIPTOFREIGHTTERMSCODE$98, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPTOFREIGHTTERMSCODE$98);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(SHIPTOFREIGHTTERMSCODE$98);
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
            get_store().remove_element(SHIPTOFREIGHTTERMSCODE$98, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE1$100, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE1$100, 0);
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
            return get_store().count_elements(SHIPTOLINE1$100) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE1$100, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOLINE1$100);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE1$100, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOLINE1$100);
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
            get_store().remove_element(SHIPTOLINE1$100, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE2$102, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE2$102, 0);
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
            return get_store().count_elements(SHIPTOLINE2$102) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE2$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOLINE2$102);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE2$102, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOLINE2$102);
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
            get_store().remove_element(SHIPTOLINE2$102, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE3$104, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE3$104, 0);
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
            return get_store().count_elements(SHIPTOLINE3$104) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLINE3$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOLINE3$104);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLINE3$104, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOLINE3$104);
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
            get_store().remove_element(SHIPTOLINE3$104, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTONAME$106, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTONAME$106, 0);
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
            return get_store().count_elements(SHIPTONAME$106) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTONAME$106, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTONAME$106);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTONAME$106, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTONAME$106);
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
            get_store().remove_element(SHIPTONAME$106, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOPOSTALCODE$108, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOPOSTALCODE$108, 0);
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
            return get_store().count_elements(SHIPTOPOSTALCODE$108) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOPOSTALCODE$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOPOSTALCODE$108);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOPOSTALCODE$108, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOPOSTALCODE$108);
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
            get_store().remove_element(SHIPTOPOSTALCODE$108, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOSTATEORPROVINCE$110, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOSTATEORPROVINCE$110, 0);
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
            return get_store().count_elements(SHIPTOSTATEORPROVINCE$110) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOSTATEORPROVINCE$110, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOSTATEORPROVINCE$110);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOSTATEORPROVINCE$110, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOSTATEORPROVINCE$110);
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
            get_store().remove_element(SHIPTOSTATEORPROVINCE$110, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOTELEPHONE$112, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOTELEPHONE$112, 0);
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
            return get_store().count_elements(SHIPTOTELEPHONE$112) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOTELEPHONE$112, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOTELEPHONE$112);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOTELEPHONE$112, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOTELEPHONE$112);
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
            get_store().remove_element(SHIPTOTELEPHONE$112, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo)get_store().find_element_user(STATECODE$114, 0);
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
            return get_store().count_elements(STATECODE$114) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo)get_store().find_element_user(STATECODE$114, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo)get_store().add_element_user(STATECODE$114);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SalesOrderStateInfo)get_store().add_element_user(STATECODE$114);
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
            get_store().remove_element(STATECODE$114, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$116, 0);
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
            return get_store().count_elements(STATUSCODE$116) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$116, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$116);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$116);
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
            get_store().remove_element(STATUSCODE$116, 0);
        }
    }
    
    /**
     * Gets the "submitdate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getSubmitdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SUBMITDATE$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "submitdate" element
     */
    public boolean isSetSubmitdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITDATE$118) != 0;
        }
    }
    
    /**
     * Sets the "submitdate" element
     */
    public void setSubmitdate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime submitdate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SUBMITDATE$118, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SUBMITDATE$118);
            }
            target.set(submitdate);
        }
    }
    
    /**
     * Appends and returns a new empty "submitdate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewSubmitdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SUBMITDATE$118);
            return target;
        }
    }
    
    /**
     * Unsets the "submitdate" element
     */
    public void unsetSubmitdate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITDATE$118, 0);
        }
    }
    
    /**
     * Gets the "submitstatus" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSubmitstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUBMITSTATUS$120, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "submitstatus" element
     */
    public boolean isSetSubmitstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSTATUS$120) != 0;
        }
    }
    
    /**
     * Sets the "submitstatus" element
     */
    public void setSubmitstatus(com.microsoft.schemas.crm._2006.webservices.CrmNumber submitstatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUBMITSTATUS$120, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUBMITSTATUS$120);
            }
            target.set(submitstatus);
        }
    }
    
    /**
     * Appends and returns a new empty "submitstatus" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSubmitstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUBMITSTATUS$120);
            return target;
        }
    }
    
    /**
     * Unsets the "submitstatus" element
     */
    public void unsetSubmitstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSTATUS$120, 0);
        }
    }
    
    /**
     * Gets the "submitstatusdescription" element
     */
    public java.lang.String getSubmitstatusdescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBMITSTATUSDESCRIPTION$122, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "submitstatusdescription" element
     */
    public org.apache.xmlbeans.XmlString xgetSubmitstatusdescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBMITSTATUSDESCRIPTION$122, 0);
            return target;
        }
    }
    
    /**
     * True if has "submitstatusdescription" element
     */
    public boolean isSetSubmitstatusdescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSTATUSDESCRIPTION$122) != 0;
        }
    }
    
    /**
     * Sets the "submitstatusdescription" element
     */
    public void setSubmitstatusdescription(java.lang.String submitstatusdescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBMITSTATUSDESCRIPTION$122, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBMITSTATUSDESCRIPTION$122);
            }
            target.setStringValue(submitstatusdescription);
        }
    }
    
    /**
     * Sets (as xml) the "submitstatusdescription" element
     */
    public void xsetSubmitstatusdescription(org.apache.xmlbeans.XmlString submitstatusdescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBMITSTATUSDESCRIPTION$122, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBMITSTATUSDESCRIPTION$122);
            }
            target.set(submitstatusdescription);
        }
    }
    
    /**
     * Unsets the "submitstatusdescription" element
     */
    public void unsetSubmitstatusdescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSTATUSDESCRIPTION$122, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$124, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$124) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$124, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$124);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$124);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$124, 0);
        }
    }
    
    /**
     * Gets the "totalamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALAMOUNT$126, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalamount" element
     */
    public boolean isSetTotalamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALAMOUNT$126) != 0;
        }
    }
    
    /**
     * Sets the "totalamount" element
     */
    public void setTotalamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALAMOUNT$126, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALAMOUNT$126);
            }
            target.set(totalamount);
        }
    }
    
    /**
     * Appends and returns a new empty "totalamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALAMOUNT$126);
            return target;
        }
    }
    
    /**
     * Unsets the "totalamount" element
     */
    public void unsetTotalamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALAMOUNT$126, 0);
        }
    }
    
    /**
     * Gets the "totalamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALAMOUNTBASE$128, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalamount_base" element
     */
    public boolean isSetTotalamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALAMOUNTBASE$128) != 0;
        }
    }
    
    /**
     * Sets the "totalamount_base" element
     */
    public void setTotalamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALAMOUNTBASE$128, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALAMOUNTBASE$128);
            }
            target.set(totalamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "totalamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALAMOUNTBASE$128);
            return target;
        }
    }
    
    /**
     * Unsets the "totalamount_base" element
     */
    public void unsetTotalamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALAMOUNTBASE$128, 0);
        }
    }
    
    /**
     * Gets the "totalamountlessfreight" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalamountlessfreight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALAMOUNTLESSFREIGHT$130, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalamountlessfreight" element
     */
    public boolean isSetTotalamountlessfreight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALAMOUNTLESSFREIGHT$130) != 0;
        }
    }
    
    /**
     * Sets the "totalamountlessfreight" element
     */
    public void setTotalamountlessfreight(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalamountlessfreight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALAMOUNTLESSFREIGHT$130, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALAMOUNTLESSFREIGHT$130);
            }
            target.set(totalamountlessfreight);
        }
    }
    
    /**
     * Appends and returns a new empty "totalamountlessfreight" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalamountlessfreight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALAMOUNTLESSFREIGHT$130);
            return target;
        }
    }
    
    /**
     * Unsets the "totalamountlessfreight" element
     */
    public void unsetTotalamountlessfreight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALAMOUNTLESSFREIGHT$130, 0);
        }
    }
    
    /**
     * Gets the "totalamountlessfreight_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotalamountlessfreightBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALAMOUNTLESSFREIGHTBASE$132, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalamountlessfreight_base" element
     */
    public boolean isSetTotalamountlessfreightBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALAMOUNTLESSFREIGHTBASE$132) != 0;
        }
    }
    
    /**
     * Sets the "totalamountlessfreight_base" element
     */
    public void setTotalamountlessfreightBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totalamountlessfreightBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALAMOUNTLESSFREIGHTBASE$132, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALAMOUNTLESSFREIGHTBASE$132);
            }
            target.set(totalamountlessfreightBase);
        }
    }
    
    /**
     * Appends and returns a new empty "totalamountlessfreight_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotalamountlessfreightBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALAMOUNTLESSFREIGHTBASE$132);
            return target;
        }
    }
    
    /**
     * Unsets the "totalamountlessfreight_base" element
     */
    public void unsetTotalamountlessfreightBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALAMOUNTLESSFREIGHTBASE$132, 0);
        }
    }
    
    /**
     * Gets the "totaldiscountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotaldiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALDISCOUNTAMOUNT$134, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totaldiscountamount" element
     */
    public boolean isSetTotaldiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALDISCOUNTAMOUNT$134) != 0;
        }
    }
    
    /**
     * Sets the "totaldiscountamount" element
     */
    public void setTotaldiscountamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney totaldiscountamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALDISCOUNTAMOUNT$134, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALDISCOUNTAMOUNT$134);
            }
            target.set(totaldiscountamount);
        }
    }
    
    /**
     * Appends and returns a new empty "totaldiscountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotaldiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALDISCOUNTAMOUNT$134);
            return target;
        }
    }
    
    /**
     * Unsets the "totaldiscountamount" element
     */
    public void unsetTotaldiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALDISCOUNTAMOUNT$134, 0);
        }
    }
    
    /**
     * Gets the "totaldiscountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotaldiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALDISCOUNTAMOUNTBASE$136, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totaldiscountamount_base" element
     */
    public boolean isSetTotaldiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALDISCOUNTAMOUNTBASE$136) != 0;
        }
    }
    
    /**
     * Sets the "totaldiscountamount_base" element
     */
    public void setTotaldiscountamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totaldiscountamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALDISCOUNTAMOUNTBASE$136, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALDISCOUNTAMOUNTBASE$136);
            }
            target.set(totaldiscountamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "totaldiscountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotaldiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALDISCOUNTAMOUNTBASE$136);
            return target;
        }
    }
    
    /**
     * Unsets the "totaldiscountamount_base" element
     */
    public void unsetTotaldiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALDISCOUNTAMOUNTBASE$136, 0);
        }
    }
    
    /**
     * Gets the "totallineitemamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotallineitemamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALLINEITEMAMOUNT$138, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totallineitemamount" element
     */
    public boolean isSetTotallineitemamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALLINEITEMAMOUNT$138) != 0;
        }
    }
    
    /**
     * Sets the "totallineitemamount" element
     */
    public void setTotallineitemamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney totallineitemamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALLINEITEMAMOUNT$138, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALLINEITEMAMOUNT$138);
            }
            target.set(totallineitemamount);
        }
    }
    
    /**
     * Appends and returns a new empty "totallineitemamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotallineitemamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALLINEITEMAMOUNT$138);
            return target;
        }
    }
    
    /**
     * Unsets the "totallineitemamount" element
     */
    public void unsetTotallineitemamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALLINEITEMAMOUNT$138, 0);
        }
    }
    
    /**
     * Gets the "totallineitemamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotallineitemamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALLINEITEMAMOUNTBASE$140, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totallineitemamount_base" element
     */
    public boolean isSetTotallineitemamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALLINEITEMAMOUNTBASE$140) != 0;
        }
    }
    
    /**
     * Sets the "totallineitemamount_base" element
     */
    public void setTotallineitemamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totallineitemamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALLINEITEMAMOUNTBASE$140, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALLINEITEMAMOUNTBASE$140);
            }
            target.set(totallineitemamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "totallineitemamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotallineitemamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALLINEITEMAMOUNTBASE$140);
            return target;
        }
    }
    
    /**
     * Unsets the "totallineitemamount_base" element
     */
    public void unsetTotallineitemamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALLINEITEMAMOUNTBASE$140, 0);
        }
    }
    
    /**
     * Gets the "totallineitemdiscountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotallineitemdiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALLINEITEMDISCOUNTAMOUNT$142, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totallineitemdiscountamount" element
     */
    public boolean isSetTotallineitemdiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALLINEITEMDISCOUNTAMOUNT$142) != 0;
        }
    }
    
    /**
     * Sets the "totallineitemdiscountamount" element
     */
    public void setTotallineitemdiscountamount(com.microsoft.schemas.crm._2006.webservices.CrmMoney totallineitemdiscountamount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALLINEITEMDISCOUNTAMOUNT$142, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALLINEITEMDISCOUNTAMOUNT$142);
            }
            target.set(totallineitemdiscountamount);
        }
    }
    
    /**
     * Appends and returns a new empty "totallineitemdiscountamount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotallineitemdiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALLINEITEMDISCOUNTAMOUNT$142);
            return target;
        }
    }
    
    /**
     * Unsets the "totallineitemdiscountamount" element
     */
    public void unsetTotallineitemdiscountamount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALLINEITEMDISCOUNTAMOUNT$142, 0);
        }
    }
    
    /**
     * Gets the "totallineitemdiscountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotallineitemdiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALLINEITEMDISCOUNTAMOUNTBASE$144, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totallineitemdiscountamount_base" element
     */
    public boolean isSetTotallineitemdiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALLINEITEMDISCOUNTAMOUNTBASE$144) != 0;
        }
    }
    
    /**
     * Sets the "totallineitemdiscountamount_base" element
     */
    public void setTotallineitemdiscountamountBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totallineitemdiscountamountBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALLINEITEMDISCOUNTAMOUNTBASE$144, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALLINEITEMDISCOUNTAMOUNTBASE$144);
            }
            target.set(totallineitemdiscountamountBase);
        }
    }
    
    /**
     * Appends and returns a new empty "totallineitemdiscountamount_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotallineitemdiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALLINEITEMDISCOUNTAMOUNTBASE$144);
            return target;
        }
    }
    
    /**
     * Unsets the "totallineitemdiscountamount_base" element
     */
    public void unsetTotallineitemdiscountamountBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALLINEITEMDISCOUNTAMOUNTBASE$144, 0);
        }
    }
    
    /**
     * Gets the "totaltax" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotaltax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALTAX$146, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totaltax" element
     */
    public boolean isSetTotaltax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALTAX$146) != 0;
        }
    }
    
    /**
     * Sets the "totaltax" element
     */
    public void setTotaltax(com.microsoft.schemas.crm._2006.webservices.CrmMoney totaltax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALTAX$146, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALTAX$146);
            }
            target.set(totaltax);
        }
    }
    
    /**
     * Appends and returns a new empty "totaltax" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotaltax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALTAX$146);
            return target;
        }
    }
    
    /**
     * Unsets the "totaltax" element
     */
    public void unsetTotaltax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALTAX$146, 0);
        }
    }
    
    /**
     * Gets the "totaltax_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney getTotaltaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALTAXBASE$148, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totaltax_base" element
     */
    public boolean isSetTotaltaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALTAXBASE$148) != 0;
        }
    }
    
    /**
     * Sets the "totaltax_base" element
     */
    public void setTotaltaxBase(com.microsoft.schemas.crm._2006.webservices.CrmMoney totaltaxBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().find_element_user(TOTALTAXBASE$148, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALTAXBASE$148);
            }
            target.set(totaltaxBase);
        }
    }
    
    /**
     * Appends and returns a new empty "totaltax_base" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmMoney addNewTotaltaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmMoney target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmMoney)get_store().add_element_user(TOTALTAXBASE$148);
            return target;
        }
    }
    
    /**
     * Unsets the "totaltax_base" element
     */
    public void unsetTotaltaxBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALTAXBASE$148, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$150, 0);
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
            return get_store().count_elements(TRANSACTIONCURRENCYID$150) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSACTIONCURRENCYID$150, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$150);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSACTIONCURRENCYID$150);
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
            get_store().remove_element(TRANSACTIONCURRENCYID$150, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$152, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$152) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$152, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$152);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$152);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$152, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(WILLCALL$154, 0);
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
            return get_store().count_elements(WILLCALL$154) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(WILLCALL$154, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(WILLCALL$154);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(WILLCALL$154);
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
            get_store().remove_element(WILLCALL$154, 0);
        }
    }
}
