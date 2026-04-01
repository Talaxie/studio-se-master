/*
 * XML Type:  subscriptionclients
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Subscriptionclients
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML subscriptionclients(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SubscriptionclientsImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Subscriptionclients
{
    
    public SubscriptionclientsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "clientid");
    private static final javax.xml.namespace.QName ISPRIMARYCLIENT$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isprimaryclient");
    private static final javax.xml.namespace.QName MACHINENAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "machinename");
    private static final javax.xml.namespace.QName SUBSCRIPTIONCLIENTID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subscriptionclientid");
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subscriptionid");
    
    
    /**
     * Gets the "clientid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getClientid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(CLIENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clientid" element
     */
    public boolean isSetClientid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "clientid" element
     */
    public void setClientid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier clientid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(CLIENTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(CLIENTID$0);
            }
            target.set(clientid);
        }
    }
    
    /**
     * Appends and returns a new empty "clientid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewClientid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(CLIENTID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "clientid" element
     */
    public void unsetClientid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTID$0, 0);
        }
    }
    
    /**
     * Gets the "isprimaryclient" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsprimaryclient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRIMARYCLIENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isprimaryclient" element
     */
    public boolean isSetIsprimaryclient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRIMARYCLIENT$2) != 0;
        }
    }
    
    /**
     * Sets the "isprimaryclient" element
     */
    public void setIsprimaryclient(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isprimaryclient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRIMARYCLIENT$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRIMARYCLIENT$2);
            }
            target.set(isprimaryclient);
        }
    }
    
    /**
     * Appends and returns a new empty "isprimaryclient" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsprimaryclient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRIMARYCLIENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "isprimaryclient" element
     */
    public void unsetIsprimaryclient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRIMARYCLIENT$2, 0);
        }
    }
    
    /**
     * Gets the "machinename" element
     */
    public java.lang.String getMachinename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MACHINENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "machinename" element
     */
    public org.apache.xmlbeans.XmlString xgetMachinename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MACHINENAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "machinename" element
     */
    public boolean isSetMachinename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MACHINENAME$4) != 0;
        }
    }
    
    /**
     * Sets the "machinename" element
     */
    public void setMachinename(java.lang.String machinename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MACHINENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MACHINENAME$4);
            }
            target.setStringValue(machinename);
        }
    }
    
    /**
     * Sets (as xml) the "machinename" element
     */
    public void xsetMachinename(org.apache.xmlbeans.XmlString machinename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MACHINENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MACHINENAME$4);
            }
            target.set(machinename);
        }
    }
    
    /**
     * Unsets the "machinename" element
     */
    public void unsetMachinename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MACHINENAME$4, 0);
        }
    }
    
    /**
     * Gets the "subscriptionclientid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getSubscriptionclientid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SUBSCRIPTIONCLIENTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subscriptionclientid" element
     */
    public boolean isSetSubscriptionclientid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONCLIENTID$6) != 0;
        }
    }
    
    /**
     * Sets the "subscriptionclientid" element
     */
    public void setSubscriptionclientid(com.microsoft.schemas.crm._2006.webservices.Key subscriptionclientid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SUBSCRIPTIONCLIENTID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SUBSCRIPTIONCLIENTID$6);
            }
            target.set(subscriptionclientid);
        }
    }
    
    /**
     * Appends and returns a new empty "subscriptionclientid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewSubscriptionclientid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SUBSCRIPTIONCLIENTID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "subscriptionclientid" element
     */
    public void unsetSubscriptionclientid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONCLIENTID$6, 0);
        }
    }
    
    /**
     * Gets the "subscriptionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SUBSCRIPTIONID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subscriptionid" element
     */
    public boolean isSetSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONID$8) != 0;
        }
    }
    
    /**
     * Sets the "subscriptionid" element
     */
    public void setSubscriptionid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier subscriptionid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SUBSCRIPTIONID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SUBSCRIPTIONID$8);
            }
            target.set(subscriptionid);
        }
    }
    
    /**
     * Appends and returns a new empty "subscriptionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SUBSCRIPTIONID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "subscriptionid" element
     */
    public void unsetSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONID$8, 0);
        }
    }
}
