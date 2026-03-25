/*
 * XML Type:  activityparty
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Activityparty
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML activityparty(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ActivitypartyImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Activityparty
{
    
    public ActivitypartyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "activityid");
    private static final javax.xml.namespace.QName ACTIVITYPARTYID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "activitypartyid");
    private static final javax.xml.namespace.QName ADDRESSUSED$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "addressused");
    private static final javax.xml.namespace.QName DONOTEMAIL$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotemail");
    private static final javax.xml.namespace.QName DONOTFAX$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotfax");
    private static final javax.xml.namespace.QName DONOTPHONE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotphone");
    private static final javax.xml.namespace.QName DONOTPOSTALMAIL$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "donotpostalmail");
    private static final javax.xml.namespace.QName EFFORT$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "effort");
    private static final javax.xml.namespace.QName EXCHANGEENTRYID$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "exchangeentryid");
    private static final javax.xml.namespace.QName PARTICIPATIONTYPEMASK$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "participationtypemask");
    private static final javax.xml.namespace.QName PARTYID$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "partyid");
    private static final javax.xml.namespace.QName RESOURCESPECID$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "resourcespecid");
    private static final javax.xml.namespace.QName SCHEDULEDEND$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "scheduledend");
    private static final javax.xml.namespace.QName SCHEDULEDSTART$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "scheduledstart");
    
    
    /**
     * Gets the "activityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getActivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activityid" element
     */
    public boolean isSetActivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYID$0) != 0;
        }
    }
    
    /**
     * Sets the "activityid" element
     */
    public void setActivityid(com.microsoft.schemas.crm._2006.webservices.Lookup activityid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ACTIVITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ACTIVITYID$0);
            }
            target.set(activityid);
        }
    }
    
    /**
     * Appends and returns a new empty "activityid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewActivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ACTIVITYID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "activityid" element
     */
    public void unsetActivityid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYID$0, 0);
        }
    }
    
    /**
     * Gets the "activitypartyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getActivitypartyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ACTIVITYPARTYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activitypartyid" element
     */
    public boolean isSetActivitypartyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYPARTYID$2) != 0;
        }
    }
    
    /**
     * Sets the "activitypartyid" element
     */
    public void setActivitypartyid(com.microsoft.schemas.crm._2006.webservices.Key activitypartyid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ACTIVITYPARTYID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ACTIVITYPARTYID$2);
            }
            target.set(activitypartyid);
        }
    }
    
    /**
     * Appends and returns a new empty "activitypartyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewActivitypartyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ACTIVITYPARTYID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "activitypartyid" element
     */
    public void unsetActivitypartyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYPARTYID$2, 0);
        }
    }
    
    /**
     * Gets the "addressused" element
     */
    public java.lang.String getAddressused()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSUSED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "addressused" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressused()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSUSED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "addressused" element
     */
    public boolean isSetAddressused()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSUSED$4) != 0;
        }
    }
    
    /**
     * Sets the "addressused" element
     */
    public void setAddressused(java.lang.String addressused)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSUSED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSUSED$4);
            }
            target.setStringValue(addressused);
        }
    }
    
    /**
     * Sets (as xml) the "addressused" element
     */
    public void xsetAddressused(org.apache.xmlbeans.XmlString addressused)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSUSED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSUSED$4);
            }
            target.set(addressused);
        }
    }
    
    /**
     * Unsets the "addressused" element
     */
    public void unsetAddressused()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSUSED$4, 0);
        }
    }
    
    /**
     * Gets the "donotemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTEMAIL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotemail" element
     */
    public boolean isSetDonotemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTEMAIL$6) != 0;
        }
    }
    
    /**
     * Sets the "donotemail" element
     */
    public void setDonotemail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotemail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTEMAIL$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTEMAIL$6);
            }
            target.set(donotemail);
        }
    }
    
    /**
     * Appends and returns a new empty "donotemail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTEMAIL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "donotemail" element
     */
    public void unsetDonotemail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTEMAIL$6, 0);
        }
    }
    
    /**
     * Gets the "donotfax" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotfax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTFAX$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotfax" element
     */
    public boolean isSetDonotfax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTFAX$8) != 0;
        }
    }
    
    /**
     * Sets the "donotfax" element
     */
    public void setDonotfax(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotfax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTFAX$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTFAX$8);
            }
            target.set(donotfax);
        }
    }
    
    /**
     * Appends and returns a new empty "donotfax" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotfax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTFAX$8);
            return target;
        }
    }
    
    /**
     * Unsets the "donotfax" element
     */
    public void unsetDonotfax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTFAX$8, 0);
        }
    }
    
    /**
     * Gets the "donotphone" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPHONE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotphone" element
     */
    public boolean isSetDonotphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTPHONE$10) != 0;
        }
    }
    
    /**
     * Sets the "donotphone" element
     */
    public void setDonotphone(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotphone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPHONE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPHONE$10);
            }
            target.set(donotphone);
        }
    }
    
    /**
     * Appends and returns a new empty "donotphone" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPHONE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "donotphone" element
     */
    public void unsetDonotphone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTPHONE$10, 0);
        }
    }
    
    /**
     * Gets the "donotpostalmail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getDonotpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPOSTALMAIL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "donotpostalmail" element
     */
    public boolean isSetDonotpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DONOTPOSTALMAIL$12) != 0;
        }
    }
    
    /**
     * Sets the "donotpostalmail" element
     */
    public void setDonotpostalmail(com.microsoft.schemas.crm._2006.webservices.CrmBoolean donotpostalmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(DONOTPOSTALMAIL$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPOSTALMAIL$12);
            }
            target.set(donotpostalmail);
        }
    }
    
    /**
     * Appends and returns a new empty "donotpostalmail" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewDonotpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(DONOTPOSTALMAIL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "donotpostalmail" element
     */
    public void unsetDonotpostalmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DONOTPOSTALMAIL$12, 0);
        }
    }
    
    /**
     * Gets the "effort" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat getEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(EFFORT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effort" element
     */
    public boolean isSetEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFORT$14) != 0;
        }
    }
    
    /**
     * Sets the "effort" element
     */
    public void setEffort(com.microsoft.schemas.crm._2006.webservices.CrmFloat effort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().find_element_user(EFFORT$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(EFFORT$14);
            }
            target.set(effort);
        }
    }
    
    /**
     * Appends and returns a new empty "effort" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmFloat addNewEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmFloat target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmFloat)get_store().add_element_user(EFFORT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "effort" element
     */
    public void unsetEffort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFORT$14, 0);
        }
    }
    
    /**
     * Gets the "exchangeentryid" element
     */
    public java.lang.String getExchangeentryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGEENTRYID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "exchangeentryid" element
     */
    public org.apache.xmlbeans.XmlString xgetExchangeentryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCHANGEENTRYID$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "exchangeentryid" element
     */
    public boolean isSetExchangeentryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCHANGEENTRYID$16) != 0;
        }
    }
    
    /**
     * Sets the "exchangeentryid" element
     */
    public void setExchangeentryid(java.lang.String exchangeentryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCHANGEENTRYID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCHANGEENTRYID$16);
            }
            target.setStringValue(exchangeentryid);
        }
    }
    
    /**
     * Sets (as xml) the "exchangeentryid" element
     */
    public void xsetExchangeentryid(org.apache.xmlbeans.XmlString exchangeentryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCHANGEENTRYID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXCHANGEENTRYID$16);
            }
            target.set(exchangeentryid);
        }
    }
    
    /**
     * Unsets the "exchangeentryid" element
     */
    public void unsetExchangeentryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCHANGEENTRYID$16, 0);
        }
    }
    
    /**
     * Gets the "participationtypemask" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getParticipationtypemask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PARTICIPATIONTYPEMASK$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "participationtypemask" element
     */
    public boolean isSetParticipationtypemask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPATIONTYPEMASK$18) != 0;
        }
    }
    
    /**
     * Sets the "participationtypemask" element
     */
    public void setParticipationtypemask(com.microsoft.schemas.crm._2006.webservices.Picklist participationtypemask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PARTICIPATIONTYPEMASK$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PARTICIPATIONTYPEMASK$18);
            }
            target.set(participationtypemask);
        }
    }
    
    /**
     * Appends and returns a new empty "participationtypemask" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewParticipationtypemask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PARTICIPATIONTYPEMASK$18);
            return target;
        }
    }
    
    /**
     * Unsets the "participationtypemask" element
     */
    public void unsetParticipationtypemask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPATIONTYPEMASK$18, 0);
        }
    }
    
    /**
     * Gets the "partyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getPartyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARTYID$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "partyid" element
     */
    public boolean isSetPartyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTYID$20) != 0;
        }
    }
    
    /**
     * Sets the "partyid" element
     */
    public void setPartyid(com.microsoft.schemas.crm._2006.webservices.Lookup partyid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARTYID$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARTYID$20);
            }
            target.set(partyid);
        }
    }
    
    /**
     * Appends and returns a new empty "partyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewPartyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARTYID$20);
            return target;
        }
    }
    
    /**
     * Unsets the "partyid" element
     */
    public void unsetPartyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTYID$20, 0);
        }
    }
    
    /**
     * Gets the "resourcespecid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getResourcespecid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(RESOURCESPECID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resourcespecid" element
     */
    public boolean isSetResourcespecid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCESPECID$22) != 0;
        }
    }
    
    /**
     * Sets the "resourcespecid" element
     */
    public void setResourcespecid(com.microsoft.schemas.crm._2006.webservices.Lookup resourcespecid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(RESOURCESPECID$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(RESOURCESPECID$22);
            }
            target.set(resourcespecid);
        }
    }
    
    /**
     * Appends and returns a new empty "resourcespecid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewResourcespecid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(RESOURCESPECID$22);
            return target;
        }
    }
    
    /**
     * Unsets the "resourcespecid" element
     */
    public void unsetResourcespecid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCESPECID$22, 0);
        }
    }
    
    /**
     * Gets the "scheduledend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getScheduledend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SCHEDULEDEND$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scheduledend" element
     */
    public boolean isSetScheduledend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDEND$24) != 0;
        }
    }
    
    /**
     * Sets the "scheduledend" element
     */
    public void setScheduledend(com.microsoft.schemas.crm._2006.webservices.CrmDateTime scheduledend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SCHEDULEDEND$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SCHEDULEDEND$24);
            }
            target.set(scheduledend);
        }
    }
    
    /**
     * Appends and returns a new empty "scheduledend" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewScheduledend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SCHEDULEDEND$24);
            return target;
        }
    }
    
    /**
     * Unsets the "scheduledend" element
     */
    public void unsetScheduledend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDEND$24, 0);
        }
    }
    
    /**
     * Gets the "scheduledstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getScheduledstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SCHEDULEDSTART$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scheduledstart" element
     */
    public boolean isSetScheduledstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDSTART$26) != 0;
        }
    }
    
    /**
     * Sets the "scheduledstart" element
     */
    public void setScheduledstart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime scheduledstart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SCHEDULEDSTART$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SCHEDULEDSTART$26);
            }
            target.set(scheduledstart);
        }
    }
    
    /**
     * Appends and returns a new empty "scheduledstart" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewScheduledstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SCHEDULEDSTART$26);
            return target;
        }
    }
    
    /**
     * Unsets the "scheduledstart" element
     */
    public void unsetScheduledstart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDSTART$26, 0);
        }
    }
}
