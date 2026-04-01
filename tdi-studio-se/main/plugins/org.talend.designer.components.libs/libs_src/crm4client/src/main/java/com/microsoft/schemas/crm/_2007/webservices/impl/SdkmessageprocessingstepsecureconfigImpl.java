/*
 * XML Type:  sdkmessageprocessingstepsecureconfig
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML sdkmessageprocessingstepsecureconfig(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SdkmessageprocessingstepsecureconfigImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig
{
    
    public SdkmessageprocessingstepsecureconfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEDBY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMIZATIONLEVEL$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customizationlevel");
    private static final javax.xml.namespace.QName MODIFIEDBY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName ORGANIZATIONID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPSECURECONFIGID$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sdkmessageprocessingstepsecureconfigid");
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPSECURECONFIGIDUNIQUE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sdkmessageprocessingstepsecureconfigidunique");
    private static final javax.xml.namespace.QName SECURECONFIG$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "secureconfig");
    
    
    /**
     * Gets the "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$0, 0);
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
            return get_store().count_elements(CREATEDBY$0) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$0);
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
            get_store().remove_element(CREATEDBY$0, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$2, 0);
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
            return get_store().count_elements(CREATEDON$2) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$2);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$2);
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
            get_store().remove_element(CREATEDON$2, 0);
        }
    }
    
    /**
     * Gets the "customizationlevel" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCustomizationlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CUSTOMIZATIONLEVEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customizationlevel" element
     */
    public boolean isSetCustomizationlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMIZATIONLEVEL$4) != 0;
        }
    }
    
    /**
     * Sets the "customizationlevel" element
     */
    public void setCustomizationlevel(com.microsoft.schemas.crm._2006.webservices.CrmNumber customizationlevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CUSTOMIZATIONLEVEL$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CUSTOMIZATIONLEVEL$4);
            }
            target.set(customizationlevel);
        }
    }
    
    /**
     * Appends and returns a new empty "customizationlevel" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCustomizationlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CUSTOMIZATIONLEVEL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "customizationlevel" element
     */
    public void unsetCustomizationlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMIZATIONLEVEL$4, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$6, 0);
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
            return get_store().count_elements(MODIFIEDBY$6) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$6);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$6);
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
            get_store().remove_element(MODIFIEDBY$6, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$8, 0);
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
            return get_store().count_elements(MODIFIEDON$8) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$8);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$8);
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
            get_store().remove_element(MODIFIEDON$8, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$10, 0);
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
            return get_store().count_elements(ORGANIZATIONID$10) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$10);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$10);
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
            get_store().remove_element(ORGANIZATIONID$10, 0);
        }
    }
    
    /**
     * Gets the "sdkmessageprocessingstepsecureconfigid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getSdkmessageprocessingstepsecureconfigid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIGID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sdkmessageprocessingstepsecureconfigid" element
     */
    public boolean isSetSdkmessageprocessingstepsecureconfigid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDKMESSAGEPROCESSINGSTEPSECURECONFIGID$12) != 0;
        }
    }
    
    /**
     * Sets the "sdkmessageprocessingstepsecureconfigid" element
     */
    public void setSdkmessageprocessingstepsecureconfigid(com.microsoft.schemas.crm._2006.webservices.Key sdkmessageprocessingstepsecureconfigid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIGID$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIGID$12);
            }
            target.set(sdkmessageprocessingstepsecureconfigid);
        }
    }
    
    /**
     * Appends and returns a new empty "sdkmessageprocessingstepsecureconfigid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewSdkmessageprocessingstepsecureconfigid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIGID$12);
            return target;
        }
    }
    
    /**
     * Unsets the "sdkmessageprocessingstepsecureconfigid" element
     */
    public void unsetSdkmessageprocessingstepsecureconfigid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDKMESSAGEPROCESSINGSTEPSECURECONFIGID$12, 0);
        }
    }
    
    /**
     * Gets the "sdkmessageprocessingstepsecureconfigidunique" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSdkmessageprocessingstepsecureconfigidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIGIDUNIQUE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sdkmessageprocessingstepsecureconfigidunique" element
     */
    public boolean isSetSdkmessageprocessingstepsecureconfigidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDKMESSAGEPROCESSINGSTEPSECURECONFIGIDUNIQUE$14) != 0;
        }
    }
    
    /**
     * Sets the "sdkmessageprocessingstepsecureconfigidunique" element
     */
    public void setSdkmessageprocessingstepsecureconfigidunique(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier sdkmessageprocessingstepsecureconfigidunique)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIGIDUNIQUE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIGIDUNIQUE$14);
            }
            target.set(sdkmessageprocessingstepsecureconfigidunique);
        }
    }
    
    /**
     * Appends and returns a new empty "sdkmessageprocessingstepsecureconfigidunique" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSdkmessageprocessingstepsecureconfigidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIGIDUNIQUE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "sdkmessageprocessingstepsecureconfigidunique" element
     */
    public void unsetSdkmessageprocessingstepsecureconfigidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDKMESSAGEPROCESSINGSTEPSECURECONFIGIDUNIQUE$14, 0);
        }
    }
    
    /**
     * Gets the "secureconfig" element
     */
    public java.lang.String getSecureconfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURECONFIG$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "secureconfig" element
     */
    public org.apache.xmlbeans.XmlString xgetSecureconfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURECONFIG$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "secureconfig" element
     */
    public boolean isSetSecureconfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURECONFIG$16) != 0;
        }
    }
    
    /**
     * Sets the "secureconfig" element
     */
    public void setSecureconfig(java.lang.String secureconfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURECONFIG$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURECONFIG$16);
            }
            target.setStringValue(secureconfig);
        }
    }
    
    /**
     * Sets (as xml) the "secureconfig" element
     */
    public void xsetSecureconfig(org.apache.xmlbeans.XmlString secureconfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURECONFIG$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURECONFIG$16);
            }
            target.set(secureconfig);
        }
    }
    
    /**
     * Unsets the "secureconfig" element
     */
    public void unsetSecureconfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURECONFIG$16, 0);
        }
    }
}
