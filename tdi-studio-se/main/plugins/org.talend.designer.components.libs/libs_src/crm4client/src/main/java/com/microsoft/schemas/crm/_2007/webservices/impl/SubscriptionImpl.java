/*
 * XML Type:  subscription
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Subscription
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML subscription(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SubscriptionImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Subscription
{
    
    public SubscriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETEDSYNCSTARTEDON$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "completedsyncstartedon");
    private static final javax.xml.namespace.QName LASTSYNCSTARTEDON$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lastsyncstartedon");
    private static final javax.xml.namespace.QName MACHINENAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "machinename");
    private static final javax.xml.namespace.QName REINITIALIZE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "reinitialize");
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subscriptionid");
    private static final javax.xml.namespace.QName SUBSCRIPTIONTYPE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subscriptiontype");
    private static final javax.xml.namespace.QName SYNCENTRYTABLENAME$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "syncentrytablename");
    private static final javax.xml.namespace.QName SYSTEMUSERID$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "systemuserid");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "completedsyncstartedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCompletedsyncstartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(COMPLETEDSYNCSTARTEDON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "completedsyncstartedon" element
     */
    public boolean isSetCompletedsyncstartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETEDSYNCSTARTEDON$0) != 0;
        }
    }
    
    /**
     * Sets the "completedsyncstartedon" element
     */
    public void setCompletedsyncstartedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime completedsyncstartedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(COMPLETEDSYNCSTARTEDON$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(COMPLETEDSYNCSTARTEDON$0);
            }
            target.set(completedsyncstartedon);
        }
    }
    
    /**
     * Appends and returns a new empty "completedsyncstartedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCompletedsyncstartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(COMPLETEDSYNCSTARTEDON$0);
            return target;
        }
    }
    
    /**
     * Unsets the "completedsyncstartedon" element
     */
    public void unsetCompletedsyncstartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETEDSYNCSTARTEDON$0, 0);
        }
    }
    
    /**
     * Gets the "lastsyncstartedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getLastsyncstartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTSYNCSTARTEDON$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lastsyncstartedon" element
     */
    public boolean isSetLastsyncstartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTSYNCSTARTEDON$2) != 0;
        }
    }
    
    /**
     * Sets the "lastsyncstartedon" element
     */
    public void setLastsyncstartedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime lastsyncstartedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(LASTSYNCSTARTEDON$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTSYNCSTARTEDON$2);
            }
            target.set(lastsyncstartedon);
        }
    }
    
    /**
     * Appends and returns a new empty "lastsyncstartedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewLastsyncstartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(LASTSYNCSTARTEDON$2);
            return target;
        }
    }
    
    /**
     * Unsets the "lastsyncstartedon" element
     */
    public void unsetLastsyncstartedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTSYNCSTARTEDON$2, 0);
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
     * Gets the "reinitialize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getReinitialize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(REINITIALIZE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reinitialize" element
     */
    public boolean isSetReinitialize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REINITIALIZE$6) != 0;
        }
    }
    
    /**
     * Sets the "reinitialize" element
     */
    public void setReinitialize(com.microsoft.schemas.crm._2006.webservices.CrmBoolean reinitialize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(REINITIALIZE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(REINITIALIZE$6);
            }
            target.set(reinitialize);
        }
    }
    
    /**
     * Appends and returns a new empty "reinitialize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewReinitialize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(REINITIALIZE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "reinitialize" element
     */
    public void unsetReinitialize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REINITIALIZE$6, 0);
        }
    }
    
    /**
     * Gets the "subscriptionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SUBSCRIPTIONID$8, 0);
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
    public void setSubscriptionid(com.microsoft.schemas.crm._2006.webservices.Key subscriptionid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SUBSCRIPTIONID$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SUBSCRIPTIONID$8);
            }
            target.set(subscriptionid);
        }
    }
    
    /**
     * Appends and returns a new empty "subscriptionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SUBSCRIPTIONID$8);
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
    
    /**
     * Gets the "subscriptiontype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSubscriptiontype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUBSCRIPTIONTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subscriptiontype" element
     */
    public boolean isSetSubscriptiontype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONTYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "subscriptiontype" element
     */
    public void setSubscriptiontype(com.microsoft.schemas.crm._2006.webservices.CrmNumber subscriptiontype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUBSCRIPTIONTYPE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUBSCRIPTIONTYPE$10);
            }
            target.set(subscriptiontype);
        }
    }
    
    /**
     * Appends and returns a new empty "subscriptiontype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSubscriptiontype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUBSCRIPTIONTYPE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "subscriptiontype" element
     */
    public void unsetSubscriptiontype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONTYPE$10, 0);
        }
    }
    
    /**
     * Gets the "syncentrytablename" element
     */
    public java.lang.String getSyncentrytablename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCENTRYTABLENAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "syncentrytablename" element
     */
    public org.apache.xmlbeans.XmlString xgetSyncentrytablename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYNCENTRYTABLENAME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "syncentrytablename" element
     */
    public boolean isSetSyncentrytablename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYNCENTRYTABLENAME$12) != 0;
        }
    }
    
    /**
     * Sets the "syncentrytablename" element
     */
    public void setSyncentrytablename(java.lang.String syncentrytablename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYNCENTRYTABLENAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYNCENTRYTABLENAME$12);
            }
            target.setStringValue(syncentrytablename);
        }
    }
    
    /**
     * Sets (as xml) the "syncentrytablename" element
     */
    public void xsetSyncentrytablename(org.apache.xmlbeans.XmlString syncentrytablename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYNCENTRYTABLENAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYNCENTRYTABLENAME$12);
            }
            target.set(syncentrytablename);
        }
    }
    
    /**
     * Unsets the "syncentrytablename" element
     */
    public void unsetSyncentrytablename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYNCENTRYTABLENAME$12, 0);
        }
    }
    
    /**
     * Gets the "systemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SYSTEMUSERID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "systemuserid" element
     */
    public boolean isSetSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEMUSERID$14) != 0;
        }
    }
    
    /**
     * Sets the "systemuserid" element
     */
    public void setSystemuserid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier systemuserid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SYSTEMUSERID$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SYSTEMUSERID$14);
            }
            target.set(systemuserid);
        }
    }
    
    /**
     * Appends and returns a new empty "systemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SYSTEMUSERID$14);
            return target;
        }
    }
    
    /**
     * Unsets the "systemuserid" element
     */
    public void unsetSystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEMUSERID$14, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$16, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$16) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$16);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$16);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$16, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$18, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$18) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$18);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$18);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$18, 0);
        }
    }
}
