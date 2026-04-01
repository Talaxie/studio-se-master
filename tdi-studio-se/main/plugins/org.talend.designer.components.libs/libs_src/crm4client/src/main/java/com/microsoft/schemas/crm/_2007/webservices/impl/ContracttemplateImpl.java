/*
 * XML Type:  contracttemplate
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Contracttemplate
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML contracttemplate(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ContracttemplateImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Contracttemplate
{
    
    public ContracttemplateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABBREVIATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "abbreviation");
    private static final javax.xml.namespace.QName ALLOTMENTTYPECODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "allotmenttypecode");
    private static final javax.xml.namespace.QName BILLINGFREQUENCYCODE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "billingfrequencycode");
    private static final javax.xml.namespace.QName CONTRACTSERVICELEVELCODE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contractservicelevelcode");
    private static final javax.xml.namespace.QName CONTRACTTEMPLATEID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "contracttemplateid");
    private static final javax.xml.namespace.QName CREATEDBY$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DESCRIPTION$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName EFFECTIVITYCALENDAR$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "effectivitycalendar");
    private static final javax.xml.namespace.QName IMPORTSEQUENCENUMBER$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importsequencenumber");
    private static final javax.xml.namespace.QName MODIFIEDBY$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName ORGANIZATIONID$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName OVERRIDDENCREATEDON$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "overriddencreatedon");
    private static final javax.xml.namespace.QName USEDISCOUNTASPERCENTAGE$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "usediscountaspercentage");
    
    
    /**
     * Gets the "abbreviation" element
     */
    public java.lang.String getAbbreviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABBREVIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "abbreviation" element
     */
    public org.apache.xmlbeans.XmlString xgetAbbreviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABBREVIATION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "abbreviation" element
     */
    public boolean isSetAbbreviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABBREVIATION$0) != 0;
        }
    }
    
    /**
     * Sets the "abbreviation" element
     */
    public void setAbbreviation(java.lang.String abbreviation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABBREVIATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABBREVIATION$0);
            }
            target.setStringValue(abbreviation);
        }
    }
    
    /**
     * Sets (as xml) the "abbreviation" element
     */
    public void xsetAbbreviation(org.apache.xmlbeans.XmlString abbreviation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABBREVIATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ABBREVIATION$0);
            }
            target.set(abbreviation);
        }
    }
    
    /**
     * Unsets the "abbreviation" element
     */
    public void unsetAbbreviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABBREVIATION$0, 0);
        }
    }
    
    /**
     * Gets the "allotmenttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getAllotmenttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ALLOTMENTTYPECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "allotmenttypecode" element
     */
    public boolean isSetAllotmenttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOTMENTTYPECODE$2) != 0;
        }
    }
    
    /**
     * Sets the "allotmenttypecode" element
     */
    public void setAllotmenttypecode(com.microsoft.schemas.crm._2006.webservices.Picklist allotmenttypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(ALLOTMENTTYPECODE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ALLOTMENTTYPECODE$2);
            }
            target.set(allotmenttypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "allotmenttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewAllotmenttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(ALLOTMENTTYPECODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "allotmenttypecode" element
     */
    public void unsetAllotmenttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOTMENTTYPECODE$2, 0);
        }
    }
    
    /**
     * Gets the "billingfrequencycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getBillingfrequencycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(BILLINGFREQUENCYCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "billingfrequencycode" element
     */
    public boolean isSetBillingfrequencycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLINGFREQUENCYCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "billingfrequencycode" element
     */
    public void setBillingfrequencycode(com.microsoft.schemas.crm._2006.webservices.Picklist billingfrequencycode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(BILLINGFREQUENCYCODE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(BILLINGFREQUENCYCODE$4);
            }
            target.set(billingfrequencycode);
        }
    }
    
    /**
     * Appends and returns a new empty "billingfrequencycode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewBillingfrequencycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(BILLINGFREQUENCYCODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "billingfrequencycode" element
     */
    public void unsetBillingfrequencycode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLINGFREQUENCYCODE$4, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CONTRACTSERVICELEVELCODE$6, 0);
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
            return get_store().count_elements(CONTRACTSERVICELEVELCODE$6) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(CONTRACTSERVICELEVELCODE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CONTRACTSERVICELEVELCODE$6);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(CONTRACTSERVICELEVELCODE$6);
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
            get_store().remove_element(CONTRACTSERVICELEVELCODE$6, 0);
        }
    }
    
    /**
     * Gets the "contracttemplateid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getContracttemplateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CONTRACTTEMPLATEID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contracttemplateid" element
     */
    public boolean isSetContracttemplateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRACTTEMPLATEID$8) != 0;
        }
    }
    
    /**
     * Sets the "contracttemplateid" element
     */
    public void setContracttemplateid(com.microsoft.schemas.crm._2006.webservices.Key contracttemplateid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(CONTRACTTEMPLATEID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CONTRACTTEMPLATEID$8);
            }
            target.set(contracttemplateid);
        }
    }
    
    /**
     * Appends and returns a new empty "contracttemplateid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewContracttemplateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(CONTRACTTEMPLATEID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "contracttemplateid" element
     */
    public void unsetContracttemplateid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRACTTEMPLATEID$8, 0);
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
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
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
            return get_store().count_elements(DESCRIPTION$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$14);
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
            get_store().remove_element(DESCRIPTION$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVITYCALENDAR$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVITYCALENDAR$16, 0);
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
            return get_store().count_elements(EFFECTIVITYCALENDAR$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVITYCALENDAR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVITYCALENDAR$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVITYCALENDAR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EFFECTIVITYCALENDAR$16);
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
            get_store().remove_element(EFFECTIVITYCALENDAR$16, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$18, 0);
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
            return get_store().count_elements(IMPORTSEQUENCENUMBER$18) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(IMPORTSEQUENCENUMBER$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$18);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(IMPORTSEQUENCENUMBER$18);
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
            get_store().remove_element(IMPORTSEQUENCENUMBER$18, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$20, 0);
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
            return get_store().count_elements(MODIFIEDBY$20) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$20);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$20);
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
            get_store().remove_element(MODIFIEDBY$20, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$22, 0);
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
            return get_store().count_elements(MODIFIEDON$22) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$22);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$22);
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
            get_store().remove_element(MODIFIEDON$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$24, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$24, 0);
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
            return get_store().count_elements(NAME$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$24);
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
            get_store().remove_element(NAME$24, 0);
        }
    }
    
    /**
     * Gets the "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$26, 0);
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
            return get_store().count_elements(ORGANIZATIONID$26) != 0;
        }
    }
    
    /**
     * Sets the "organizationid" element
     */
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Lookup organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$26);
            }
            target.set(organizationid);
        }
    }
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$26);
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
            get_store().remove_element(ORGANIZATIONID$26, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$28, 0);
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
            return get_store().count_elements(OVERRIDDENCREATEDON$28) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(OVERRIDDENCREATEDON$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$28);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(OVERRIDDENCREATEDON$28);
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
            get_store().remove_element(OVERRIDDENCREATEDON$28, 0);
        }
    }
    
    /**
     * Gets the "usediscountaspercentage" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsediscountaspercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USEDISCOUNTASPERCENTAGE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usediscountaspercentage" element
     */
    public boolean isSetUsediscountaspercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEDISCOUNTASPERCENTAGE$30) != 0;
        }
    }
    
    /**
     * Sets the "usediscountaspercentage" element
     */
    public void setUsediscountaspercentage(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usediscountaspercentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USEDISCOUNTASPERCENTAGE$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USEDISCOUNTASPERCENTAGE$30);
            }
            target.set(usediscountaspercentage);
        }
    }
    
    /**
     * Appends and returns a new empty "usediscountaspercentage" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsediscountaspercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USEDISCOUNTASPERCENTAGE$30);
            return target;
        }
    }
    
    /**
     * Unsets the "usediscountaspercentage" element
     */
    public void unsetUsediscountaspercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEDISCOUNTASPERCENTAGE$30, 0);
        }
    }
}
